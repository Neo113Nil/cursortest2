package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
public class AsYouTypeFormatter {
    private static final int MIN_LEADING_DIGITS_LENGTH = 3;
    private static final char SEPARATOR_BEFORE_NATIONAL_NUMBER = ' ';
    private com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata currentMetadata;
    private java.lang.String defaultCountry;
    private com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata defaultMetadata;
    private static final com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata EMPTY_METADATA = com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata.newBuilder().setId("<ignored>").setInternationalPrefix("NA").build();
    private static final java.util.regex.Pattern ELIGIBLE_FORMAT_PATTERN = java.util.regex.Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
    private static final java.util.regex.Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN = java.util.regex.Pattern.compile("[- ]");
    private static final java.lang.String DIGIT_PLACEHOLDER = "\u2008";
    private static final java.util.regex.Pattern DIGIT_PATTERN = java.util.regex.Pattern.compile(DIGIT_PLACEHOLDER);
    private java.lang.String currentOutput = "";
    private java.lang.StringBuilder formattingTemplate = new java.lang.StringBuilder();
    private java.lang.String currentFormattingPattern = "";
    private java.lang.StringBuilder accruedInput = new java.lang.StringBuilder();
    private java.lang.StringBuilder accruedInputWithoutFormatting = new java.lang.StringBuilder();
    private boolean ableToFormat = true;
    private boolean inputHasFormatting = false;
    private boolean isCompleteNumber = false;
    private boolean isExpectingCountryCallingCode = false;
    private final com.google.i18n.phonenumbers.PhoneNumberUtil phoneUtil = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance();
    private int lastMatchPosition = 0;
    private int originalPosition = 0;
    private int positionToRemember = 0;
    private java.lang.StringBuilder prefixBeforeNationalNumber = new java.lang.StringBuilder();
    private boolean shouldAddSpaceAfterNationalPrefix = false;
    private java.lang.String extractedNationalPrefix = "";
    private java.lang.StringBuilder nationalNumber = new java.lang.StringBuilder();
    private java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> possibleFormats = new java.util.ArrayList();
    private com.google.i18n.phonenumbers.internal.RegexCache regexCache = new com.google.i18n.phonenumbers.internal.RegexCache(64);

    AsYouTypeFormatter(java.lang.String str) {
        this.defaultCountry = str;
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        this.currentMetadata = metadataForRegion;
        this.defaultMetadata = metadataForRegion;
    }

    private com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForRegion(java.lang.String str) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = this.phoneUtil.getMetadataForRegion(this.phoneUtil.getRegionCodeForCountryCode(this.phoneUtil.getCountryCodeForRegion(str)));
        return metadataForRegion != null ? metadataForRegion : EMPTY_METADATA;
    }

    private boolean maybeCreateNewTemplate() {
        java.util.Iterator<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            com.google.i18n.phonenumbers.Phonemetadata.NumberFormat next = it.next();
            java.lang.String pattern = next.getPattern();
            if (this.currentFormattingPattern.equals(pattern)) {
                return false;
            }
            if (createFormattingTemplate(next)) {
                this.currentFormattingPattern = pattern;
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(next.getNationalPrefixFormattingRule()).find();
                this.lastMatchPosition = 0;
                return true;
            }
            it.remove();
        }
        this.ableToFormat = false;
        return false;
    }

    private void getAvailableFormats(java.lang.String str) {
        java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> numberFormatList;
        if (this.isCompleteNumber && this.extractedNationalPrefix.length() == 0 && this.currentMetadata.getIntlNumberFormatCount() > 0) {
            numberFormatList = this.currentMetadata.getIntlNumberFormatList();
        } else {
            numberFormatList = this.currentMetadata.getNumberFormatList();
        }
        for (com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat : numberFormatList) {
            if (this.extractedNationalPrefix.length() <= 0 || !com.google.i18n.phonenumbers.PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberFormat.getNationalPrefixFormattingRule()) || numberFormat.getNationalPrefixOptionalWhenFormatting() || numberFormat.hasDomesticCarrierCodeFormattingRule()) {
                if (this.extractedNationalPrefix.length() != 0 || this.isCompleteNumber || com.google.i18n.phonenumbers.PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberFormat.getNationalPrefixFormattingRule()) || numberFormat.getNationalPrefixOptionalWhenFormatting()) {
                    if (ELIGIBLE_FORMAT_PATTERN.matcher(numberFormat.getFormat()).matches()) {
                        this.possibleFormats.add(numberFormat);
                    }
                }
            }
        }
        narrowDownPossibleFormats(str);
    }

    private void narrowDownPossibleFormats(java.lang.String str) {
        int length = str.length();
        java.util.Iterator<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            com.google.i18n.phonenumbers.Phonemetadata.NumberFormat next = it.next();
            if (next.getLeadingDigitsPatternCount() != 0) {
                if (!this.regexCache.getPatternForRegex(next.getLeadingDigitsPattern(java.lang.Math.min(length - 3, next.getLeadingDigitsPatternCount() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private boolean createFormattingTemplate(com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat) {
        java.lang.String pattern = numberFormat.getPattern();
        this.formattingTemplate.setLength(0);
        java.lang.String formattingTemplate = getFormattingTemplate(pattern, numberFormat.getFormat());
        if (formattingTemplate.length() <= 0) {
            return false;
        }
        this.formattingTemplate.append(formattingTemplate);
        return true;
    }

    private java.lang.String getFormattingTemplate(java.lang.String str, java.lang.String str2) {
        java.util.regex.Matcher matcher = this.regexCache.getPatternForRegex(str).matcher("999999999999999");
        matcher.find();
        java.lang.String group = matcher.group();
        if (group.length() < this.nationalNumber.length()) {
            return "";
        }
        return group.replaceAll(str, str2).replaceAll("9", DIGIT_PLACEHOLDER);
    }

    public void clear() {
        this.currentOutput = "";
        this.accruedInput.setLength(0);
        this.accruedInputWithoutFormatting.setLength(0);
        this.formattingTemplate.setLength(0);
        this.lastMatchPosition = 0;
        this.currentFormattingPattern = "";
        this.prefixBeforeNationalNumber.setLength(0);
        this.extractedNationalPrefix = "";
        this.nationalNumber.setLength(0);
        this.ableToFormat = true;
        this.inputHasFormatting = false;
        this.positionToRemember = 0;
        this.originalPosition = 0;
        this.isCompleteNumber = false;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.shouldAddSpaceAfterNationalPrefix = false;
        if (this.currentMetadata.equals(this.defaultMetadata)) {
            return;
        }
        this.currentMetadata = getMetadataForRegion(this.defaultCountry);
    }

    public java.lang.String inputDigit(char c) {
        java.lang.String inputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c, false);
        this.currentOutput = inputDigitWithOptionToRememberPosition;
        return inputDigitWithOptionToRememberPosition;
    }

    public java.lang.String inputDigitAndRememberPosition(char c) {
        java.lang.String inputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c, true);
        this.currentOutput = inputDigitWithOptionToRememberPosition;
        return inputDigitWithOptionToRememberPosition;
    }

    private java.lang.String inputDigitWithOptionToRememberPosition(char c, boolean z) {
        this.accruedInput.append(c);
        if (z) {
            this.originalPosition = this.accruedInput.length();
        }
        if (!isDigitOrLeadingPlusSign(c)) {
            this.ableToFormat = false;
            this.inputHasFormatting = true;
        } else {
            c = normalizeAndAccrueDigitsAndPlusSign(c, z);
        }
        if (!this.ableToFormat) {
            if (this.inputHasFormatting) {
                return this.accruedInput.toString();
            }
            if (attemptToExtractIdd()) {
                if (attemptToExtractCountryCallingCode()) {
                    return attemptToChoosePatternWithPrefixExtracted();
                }
            } else if (ableToExtractLongerNdd()) {
                this.prefixBeforeNationalNumber.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
                return attemptToChoosePatternWithPrefixExtracted();
            }
            return this.accruedInput.toString();
        }
        int length = this.accruedInputWithoutFormatting.length();
        if (length == 0 || length == 1 || length == 2) {
            return this.accruedInput.toString();
        }
        if (length == 3) {
            if (attemptToExtractIdd()) {
                this.isExpectingCountryCallingCode = true;
            } else {
                this.extractedNationalPrefix = removeNationalPrefixFromNationalNumber();
                return attemptToChooseFormattingPattern();
            }
        }
        if (this.isExpectingCountryCallingCode) {
            if (attemptToExtractCountryCallingCode()) {
                this.isExpectingCountryCallingCode = false;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) this.prefixBeforeNationalNumber);
            sb.append(this.nationalNumber.toString());
            return sb.toString();
        }
        if (this.possibleFormats.size() > 0) {
            java.lang.String inputDigitHelper = inputDigitHelper(c);
            java.lang.String attemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
            if (attemptToFormatAccruedDigits.length() > 0) {
                return attemptToFormatAccruedDigits;
            }
            narrowDownPossibleFormats(this.nationalNumber.toString());
            if (maybeCreateNewTemplate()) {
                return inputAccruedNationalNumber();
            }
            if (this.ableToFormat) {
                return appendNationalNumber(inputDigitHelper);
            }
            return this.accruedInput.toString();
        }
        return attemptToChooseFormattingPattern();
    }

    private java.lang.String attemptToChoosePatternWithPrefixExtracted() {
        this.ableToFormat = true;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.lastMatchPosition = 0;
        this.formattingTemplate.setLength(0);
        this.currentFormattingPattern = "";
        return attemptToChooseFormattingPattern();
    }

    java.lang.String getExtractedNationalPrefix() {
        return this.extractedNationalPrefix;
    }

    private boolean ableToExtractLongerNdd() {
        if (this.extractedNationalPrefix.length() > 0) {
            this.nationalNumber.insert(0, this.extractedNationalPrefix);
            this.prefixBeforeNationalNumber.setLength(this.prefixBeforeNationalNumber.lastIndexOf(this.extractedNationalPrefix));
        }
        return !this.extractedNationalPrefix.equals(removeNationalPrefixFromNationalNumber());
    }

    private boolean isDigitOrLeadingPlusSign(char c) {
        return java.lang.Character.isDigit(c) || (this.accruedInput.length() == 1 && com.google.i18n.phonenumbers.PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(java.lang.Character.toString(c)).matches());
    }

    java.lang.String attemptToFormatAccruedDigits() {
        for (com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat : this.possibleFormats) {
            java.util.regex.Matcher matcher = this.regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(this.nationalNumber);
            if (matcher.matches()) {
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(numberFormat.getNationalPrefixFormattingRule()).find();
                java.lang.String appendNationalNumber = appendNationalNumber(matcher.replaceAll(numberFormat.getFormat()));
                if (com.google.i18n.phonenumbers.PhoneNumberUtil.normalizeDiallableCharsOnly(appendNationalNumber).contentEquals(this.accruedInputWithoutFormatting)) {
                    return appendNationalNumber;
                }
            }
        }
        return "";
    }

    public int getRememberedPosition() {
        if (!this.ableToFormat) {
            return this.originalPosition;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.positionToRemember && i2 < this.currentOutput.length()) {
            if (this.accruedInputWithoutFormatting.charAt(i) == this.currentOutput.charAt(i2)) {
                i++;
            }
            i2++;
        }
        return i2;
    }

    private java.lang.String appendNationalNumber(java.lang.String str) {
        int length = this.prefixBeforeNationalNumber.length();
        if (this.shouldAddSpaceAfterNationalPrefix && length > 0 && this.prefixBeforeNationalNumber.charAt(length - 1) != ' ') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(new java.lang.String(this.prefixBeforeNationalNumber));
            sb.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
            sb.append(str);
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append((java.lang.Object) this.prefixBeforeNationalNumber);
        sb2.append(str);
        return sb2.toString();
    }

    private java.lang.String attemptToChooseFormattingPattern() {
        if (this.nationalNumber.length() >= 3) {
            getAvailableFormats(this.nationalNumber.toString());
            java.lang.String attemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
            return attemptToFormatAccruedDigits.length() > 0 ? attemptToFormatAccruedDigits : maybeCreateNewTemplate() ? inputAccruedNationalNumber() : this.accruedInput.toString();
        }
        return appendNationalNumber(this.nationalNumber.toString());
    }

    private java.lang.String inputAccruedNationalNumber() {
        int length = this.nationalNumber.length();
        if (length > 0) {
            java.lang.String str = "";
            for (int i = 0; i < length; i++) {
                str = inputDigitHelper(this.nationalNumber.charAt(i));
            }
            return this.ableToFormat ? appendNationalNumber(str) : this.accruedInput.toString();
        }
        return this.prefixBeforeNationalNumber.toString();
    }

    private boolean isNanpaNumberWithNationalPrefix() {
        return this.currentMetadata.getCountryCode() == 1 && this.nationalNumber.charAt(0) == '1' && this.nationalNumber.charAt(1) != '0' && this.nationalNumber.charAt(1) != '1';
    }

    private java.lang.String removeNationalPrefixFromNationalNumber() {
        int i = 1;
        if (isNanpaNumberWithNationalPrefix()) {
            java.lang.StringBuilder sb = this.prefixBeforeNationalNumber;
            sb.append('1');
            sb.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
            this.isCompleteNumber = true;
        } else {
            if (this.currentMetadata.hasNationalPrefixForParsing()) {
                java.util.regex.Matcher matcher = this.regexCache.getPatternForRegex(this.currentMetadata.getNationalPrefixForParsing()).matcher(this.nationalNumber);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.isCompleteNumber = true;
                    i = matcher.end();
                    this.prefixBeforeNationalNumber.append(this.nationalNumber.substring(0, i));
                }
            }
            i = 0;
        }
        java.lang.String substring = this.nationalNumber.substring(0, i);
        this.nationalNumber.delete(0, i);
        return substring;
    }

    private boolean attemptToExtractIdd() {
        com.google.i18n.phonenumbers.internal.RegexCache regexCache = this.regexCache;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\\+|");
        sb.append(this.currentMetadata.getInternationalPrefix());
        java.util.regex.Matcher matcher = regexCache.getPatternForRegex(sb.toString()).matcher(this.accruedInputWithoutFormatting);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.isCompleteNumber = true;
        int end = matcher.end();
        this.nationalNumber.setLength(0);
        this.nationalNumber.append(this.accruedInputWithoutFormatting.substring(end));
        this.prefixBeforeNationalNumber.setLength(0);
        this.prefixBeforeNationalNumber.append(this.accruedInputWithoutFormatting.substring(0, end));
        if (this.accruedInputWithoutFormatting.charAt(0) != '+') {
            this.prefixBeforeNationalNumber.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
        }
        return true;
    }

    private boolean attemptToExtractCountryCallingCode() {
        java.lang.StringBuilder sb;
        int extractCountryCode;
        if (this.nationalNumber.length() == 0 || (extractCountryCode = this.phoneUtil.extractCountryCode(this.nationalNumber, (sb = new java.lang.StringBuilder()))) == 0) {
            return false;
        }
        this.nationalNumber.setLength(0);
        this.nationalNumber.append((java.lang.CharSequence) sb);
        java.lang.String regionCodeForCountryCode = this.phoneUtil.getRegionCodeForCountryCode(extractCountryCode);
        if ("001".equals(regionCodeForCountryCode)) {
            this.currentMetadata = this.phoneUtil.getMetadataForNonGeographicalRegion(extractCountryCode);
        } else if (!regionCodeForCountryCode.equals(this.defaultCountry)) {
            this.currentMetadata = getMetadataForRegion(regionCodeForCountryCode);
        }
        java.lang.String num = java.lang.Integer.toString(extractCountryCode);
        java.lang.StringBuilder sb2 = this.prefixBeforeNationalNumber;
        sb2.append(num);
        sb2.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
        this.extractedNationalPrefix = "";
        return true;
    }

    private char normalizeAndAccrueDigitsAndPlusSign(char c, boolean z) {
        if (c == '+') {
            this.accruedInputWithoutFormatting.append(c);
        } else {
            c = java.lang.Character.forDigit(java.lang.Character.digit(c, 10), 10);
            this.accruedInputWithoutFormatting.append(c);
            this.nationalNumber.append(c);
        }
        if (z) {
            this.positionToRemember = this.accruedInputWithoutFormatting.length();
        }
        return c;
    }

    private java.lang.String inputDigitHelper(char c) {
        java.util.regex.Matcher matcher = DIGIT_PATTERN.matcher(this.formattingTemplate);
        if (matcher.find(this.lastMatchPosition)) {
            java.lang.String replaceFirst = matcher.replaceFirst(java.lang.Character.toString(c));
            this.formattingTemplate.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.lastMatchPosition = start;
            return this.formattingTemplate.substring(0, start + 1);
        }
        if (this.possibleFormats.size() == 1) {
            this.ableToFormat = false;
        }
        this.currentFormattingPattern = "";
        return this.accruedInput.toString();
    }
}
