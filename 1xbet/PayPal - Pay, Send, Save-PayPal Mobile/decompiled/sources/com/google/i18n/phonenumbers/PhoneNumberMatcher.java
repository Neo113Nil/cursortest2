package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
final class PhoneNumberMatcher implements java.util.Iterator<com.google.i18n.phonenumbers.PhoneNumberMatch> {
    private static final java.util.regex.Pattern LEAD_CLASS;
    private static final java.util.regex.Pattern MATCHING_BRACKETS;
    private static final java.util.regex.Pattern PATTERN;
    private final com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency leniency;
    private long maxTries;
    private final com.google.i18n.phonenumbers.PhoneNumberUtil phoneUtil;
    private final java.lang.String preferredRegion;
    private final java.lang.CharSequence text;
    private static final java.util.regex.Pattern PUB_PAGES = java.util.regex.Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final java.util.regex.Pattern SLASH_SEPARATED_DATES = java.util.regex.Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final java.util.regex.Pattern TIME_STAMPS = java.util.regex.Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final java.util.regex.Pattern TIME_STAMPS_SUFFIX = java.util.regex.Pattern.compile(":[0-5]\\d");
    private static final java.util.regex.Pattern[] INNER_MATCHES = {java.util.regex.Pattern.compile("/+(.*)"), java.util.regex.Pattern.compile("(\\([^(]*)"), java.util.regex.Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), java.util.regex.Pattern.compile("[‒-―－]\\p{Z}*(.+)"), java.util.regex.Pattern.compile("\\.+\\p{Z}*([^.]+)"), java.util.regex.Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    private com.google.i18n.phonenumbers.PhoneNumberMatcher.State state = com.google.i18n.phonenumbers.PhoneNumberMatcher.State.NOT_READY;
    private com.google.i18n.phonenumbers.PhoneNumberMatch lastMatch = null;
    private int searchIndex = 0;
    private final com.google.i18n.phonenumbers.internal.RegexCache regexCache = new com.google.i18n.phonenumbers.internal.RegexCache(32);

    interface NumberGroupingChecker {
        boolean checkGroups(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.StringBuilder sb, java.lang.String[] strArr);
    }

    enum State {
        NOT_READY,
        READY,
        DONE
    }

    static {
        java.lang.String limit = limit(0, 3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(?:[(\\[（［])?(?:[^(\\[（［)\\]）］]+[)\\]）］])?[^(\\[（［)\\]）］]+(?:[(\\[（［][^(\\[（［)\\]）］]+[)\\]）］])");
        sb.append(limit);
        sb.append("[^(\\[（［)\\]）］]*");
        MATCHING_BRACKETS = java.util.regex.Pattern.compile(sb.toString());
        java.lang.String limit2 = limit(0, 2);
        java.lang.String limit3 = limit(0, 4);
        java.lang.String limit4 = limit(0, 20);
        java.lang.String concat = "[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]".concat(java.lang.String.valueOf(limit3));
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\\p{Nd}");
        sb2.append(limit(1, 20));
        java.lang.String obj = sb2.toString();
        LEAD_CLASS = java.util.regex.Pattern.compile("[(\\[（［+＋]");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("(?:[(\\[（［+＋]");
        sb3.append(concat);
        sb3.append(")");
        sb3.append(limit2);
        sb3.append(obj);
        sb3.append("(?:");
        sb3.append(concat);
        sb3.append(obj);
        sb3.append(")");
        sb3.append(limit4);
        sb3.append("(?:");
        sb3.append(com.google.i18n.phonenumbers.PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING);
        sb3.append(")?");
        PATTERN = java.util.regex.Pattern.compile(sb3.toString(), 66);
    }

    private static java.lang.String limit(int i, int i2) {
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new java.lang.IllegalArgumentException();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    PhoneNumberMatcher(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, java.lang.String str, java.lang.String str2, com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency leniency, long j) {
        if (phoneNumberUtil == null) {
            throw null;
        }
        if (leniency == null) {
            throw null;
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.phoneUtil = phoneNumberUtil;
        this.text = str == null ? "" : str;
        this.preferredRegion = str2;
        this.leniency = leniency;
        this.maxTries = j;
    }

    private com.google.i18n.phonenumbers.PhoneNumberMatch find(int i) {
        java.util.regex.Matcher matcher = PATTERN.matcher(this.text);
        while (this.maxTries > 0 && matcher.find(i)) {
            int start = matcher.start();
            java.lang.CharSequence trimAfterFirstMatch = trimAfterFirstMatch(com.google.i18n.phonenumbers.PhoneNumberUtil.SECOND_NUMBER_START_PATTERN, this.text.subSequence(start, matcher.end()));
            com.google.i18n.phonenumbers.PhoneNumberMatch extractMatch = extractMatch(trimAfterFirstMatch, start);
            if (extractMatch != null) {
                return extractMatch;
            }
            i = start + trimAfterFirstMatch.length();
            this.maxTries--;
        }
        return null;
    }

    private static java.lang.CharSequence trimAfterFirstMatch(java.util.regex.Pattern pattern, java.lang.CharSequence charSequence) {
        java.util.regex.Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    static boolean isLatinLetter(char c) {
        if (!java.lang.Character.isLetter(c) && java.lang.Character.getType(c) != 6) {
            return false;
        }
        java.lang.Character.UnicodeBlock of = java.lang.Character.UnicodeBlock.of(c);
        return of.equals(java.lang.Character.UnicodeBlock.BASIC_LATIN) || of.equals(java.lang.Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(java.lang.Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(java.lang.Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(java.lang.Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(java.lang.Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
    }

    private static boolean isInvalidPunctuationSymbol(char c) {
        return c == '%' || java.lang.Character.getType(c) == 26;
    }

    private com.google.i18n.phonenumbers.PhoneNumberMatch extractMatch(java.lang.CharSequence charSequence, int i) {
        if (SLASH_SEPARATED_DATES.matcher(charSequence).find()) {
            return null;
        }
        if (TIME_STAMPS.matcher(charSequence).find()) {
            if (TIME_STAMPS_SUFFIX.matcher(this.text.toString().substring(charSequence.length() + i)).lookingAt()) {
                return null;
            }
        }
        com.google.i18n.phonenumbers.PhoneNumberMatch parseAndVerify = parseAndVerify(charSequence, i);
        return parseAndVerify != null ? parseAndVerify : extractInnerMatch(charSequence, i);
    }

    private com.google.i18n.phonenumbers.PhoneNumberMatch extractInnerMatch(java.lang.CharSequence charSequence, int i) {
        for (java.util.regex.Pattern pattern : INNER_MATCHES) {
            java.util.regex.Matcher matcher = pattern.matcher(charSequence);
            boolean z = true;
            while (matcher.find() && this.maxTries > 0) {
                if (z) {
                    com.google.i18n.phonenumbers.PhoneNumberMatch parseAndVerify = parseAndVerify(trimAfterFirstMatch(com.google.i18n.phonenumbers.PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, charSequence.subSequence(0, matcher.start())), i);
                    if (parseAndVerify != null) {
                        return parseAndVerify;
                    }
                    this.maxTries--;
                    z = false;
                }
                com.google.i18n.phonenumbers.PhoneNumberMatch parseAndVerify2 = parseAndVerify(trimAfterFirstMatch(com.google.i18n.phonenumbers.PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, matcher.group(1)), matcher.start(1) + i);
                if (parseAndVerify2 != null) {
                    return parseAndVerify2;
                }
                this.maxTries--;
            }
        }
        return null;
    }

    private com.google.i18n.phonenumbers.PhoneNumberMatch parseAndVerify(java.lang.CharSequence charSequence, int i) {
        try {
            if (MATCHING_BRACKETS.matcher(charSequence).matches() && !PUB_PAGES.matcher(charSequence).find()) {
                if (this.leniency.compareTo(com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.VALID) >= 0) {
                    if (i > 0 && !LEAD_CLASS.matcher(charSequence).lookingAt()) {
                        char charAt = this.text.charAt(i - 1);
                        if (isInvalidPunctuationSymbol(charAt) || isLatinLetter(charAt)) {
                            return null;
                        }
                    }
                    int length = charSequence.length() + i;
                    if (length < this.text.length()) {
                        char charAt2 = this.text.charAt(length);
                        if (isInvalidPunctuationSymbol(charAt2) || isLatinLetter(charAt2)) {
                            return null;
                        }
                    }
                }
                com.google.i18n.phonenumbers.Phonenumber.PhoneNumber parseAndKeepRawInput = this.phoneUtil.parseAndKeepRawInput(charSequence, this.preferredRegion);
                if (this.leniency.verify(parseAndKeepRawInput, charSequence, this.phoneUtil, this)) {
                    parseAndKeepRawInput.clearCountryCodeSource();
                    parseAndKeepRawInput.clearRawInput();
                    parseAndKeepRawInput.clearPreferredDomesticCarrierCode();
                    return new com.google.i18n.phonenumbers.PhoneNumberMatch(i, charSequence.toString(), parseAndKeepRawInput);
                }
            }
        } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
        }
        return null;
    }

    static boolean allNumberGroupsRemainGrouped(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.StringBuilder sb, java.lang.String[] strArr) {
        int i;
        if (phoneNumber.getCountryCodeSource() != com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            java.lang.String num = java.lang.Integer.toString(phoneNumber.getCountryCode());
            i = sb.indexOf(num) + num.length();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            int indexOf = sb.indexOf(strArr[i2], i);
            if (indexOf < 0) {
                return false;
            }
            i = indexOf + strArr[i2].length();
            if (i2 == 0 && i < sb.length() && phoneNumberUtil.getNddPrefixForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()), true) != null && java.lang.Character.isDigit(sb.charAt(i))) {
                return sb.substring(i - strArr[i2].length()).startsWith(phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
            }
        }
        return sb.substring(i).contains(phoneNumber.getExtension());
    }

    static boolean allNumberGroupsAreExactlyPresent(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.StringBuilder sb, java.lang.String[] strArr) {
        java.lang.String[] split = com.google.i18n.phonenumbers.PhoneNumberUtil.NON_DIGITS_PATTERN.split(sb.toString());
        int length = phoneNumber.hasExtension() ? split.length - 2 : split.length - 1;
        if (split.length == 1 || split[length].contains(phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) {
            return true;
        }
        int length2 = strArr.length - 1;
        while (length2 > 0 && length >= 0) {
            if (!split[length].equals(strArr[length2])) {
                return false;
            }
            length2--;
            length--;
        }
        return length >= 0 && split[length].endsWith(strArr[0]);
    }

    private static java.lang.String[] getNationalNumberGroups(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        java.lang.String format = phoneNumberUtil.format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966);
        int indexOf = format.indexOf(59);
        if (indexOf < 0) {
            indexOf = format.length();
        }
        return format.substring(format.indexOf(45) + 1, indexOf).split("-");
    }

    private static java.lang.String[] getNationalNumberGroups(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat) {
        return phoneNumberUtil.formatNsnUsingPattern(phoneNumberUtil.getNationalSignificantNumber(phoneNumber), numberFormat, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966).split("-");
    }

    final boolean checkNumberGroupingIsValid(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker numberGroupingChecker) {
        java.lang.StringBuilder normalizeDigits = com.google.i18n.phonenumbers.PhoneNumberUtil.normalizeDigits(charSequence, true);
        if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber))) {
            return true;
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata formattingMetadataForCountryCallingCode = com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider.getInstance().getAlternateFormatsMetadataSource().getFormattingMetadataForCountryCallingCode(phoneNumber.getCountryCode());
        java.lang.String nationalSignificantNumber = phoneNumberUtil.getNationalSignificantNumber(phoneNumber);
        if (formattingMetadataForCountryCallingCode != null) {
            for (com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat : formattingMetadataForCountryCallingCode.getNumberFormatList()) {
                if (numberFormat.getLeadingDigitsPatternCount() <= 0 || this.regexCache.getPatternForRegex(numberFormat.getLeadingDigitsPattern(0)).matcher(nationalSignificantNumber).lookingAt()) {
                    if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, numberFormat))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean containsMoreThanOneSlashInNationalNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        int indexOf;
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0 || (indexOf = str.indexOf(47, indexOf2 + 1)) < 0) {
            return false;
        }
        if ((phoneNumber.getCountryCodeSource() == com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.getCountryCodeSource() == com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) && com.google.i18n.phonenumbers.PhoneNumberUtil.normalizeDigitsOnly(str.substring(0, indexOf2)).equals(java.lang.Integer.toString(phoneNumber.getCountryCode()))) {
            return str.substring(indexOf + 1).contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        }
        return true;
    }

    static boolean containsOnlyValidXChars(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (phoneNumberUtil.isNumberMatch(phoneNumber, str.substring(i2)) != com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i = i2;
                } else if (!com.google.i18n.phonenumbers.PhoneNumberUtil.normalizeDigitsOnly(str.substring(i)).equals(phoneNumber.getExtension())) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    static boolean isNationalPrefixPresentIfRequired(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion;
        if (phoneNumber.getCountryCodeSource() != com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY || (metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()))) == null) {
            return true;
        }
        com.google.i18n.phonenumbers.Phonemetadata.NumberFormat chooseFormattingPatternForNumber = phoneNumberUtil.chooseFormattingPatternForNumber(metadataForRegion.getNumberFormatList(), phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
        if (chooseFormattingPatternForNumber == null || chooseFormattingPatternForNumber.getNationalPrefixFormattingRule().length() <= 0 || chooseFormattingPatternForNumber.getNationalPrefixOptionalWhenFormatting() || com.google.i18n.phonenumbers.PhoneNumberUtil.formattingRuleHasFirstGroupOnly(chooseFormattingPatternForNumber.getNationalPrefixFormattingRule())) {
            return true;
        }
        return phoneNumberUtil.maybeStripNationalPrefixAndCarrierCode(new java.lang.StringBuilder(com.google.i18n.phonenumbers.PhoneNumberUtil.normalizeDigitsOnly(phoneNumber.getRawInput())), metadataForRegion, null);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.state == com.google.i18n.phonenumbers.PhoneNumberMatcher.State.NOT_READY) {
            com.google.i18n.phonenumbers.PhoneNumberMatch find = find(this.searchIndex);
            this.lastMatch = find;
            if (find == null) {
                this.state = com.google.i18n.phonenumbers.PhoneNumberMatcher.State.DONE;
            } else {
                this.searchIndex = find.end();
                this.state = com.google.i18n.phonenumbers.PhoneNumberMatcher.State.READY;
            }
        }
        return this.state == com.google.i18n.phonenumbers.PhoneNumberMatcher.State.READY;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final com.google.i18n.phonenumbers.PhoneNumberMatch next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        com.google.i18n.phonenumbers.PhoneNumberMatch phoneNumberMatch = this.lastMatch;
        this.lastMatch = null;
        this.state = com.google.i18n.phonenumbers.PhoneNumberMatcher.State.NOT_READY;
        return phoneNumberMatch;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
