package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
public class ShortNumberInfo {
    private static final java.util.Set<java.lang.String> REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT;
    private final java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> countryCallingCodeToRegionCodeMap = com.google.i18n.phonenumbers.CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap();
    private final com.google.i18n.phonenumbers.internal.MatcherApi matcherApi;
    private final com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource shortNumberMetadataSource;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.i18n.phonenumbers.ShortNumberInfo.class.getName());
    private static final com.google.i18n.phonenumbers.ShortNumberInfo INSTANCE = new com.google.i18n.phonenumbers.ShortNumberInfo(com.google.i18n.phonenumbers.internal.RegexBasedMatcher.create(), com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider.getInstance().getShortNumberMetadataSource());

    public enum ShortNumberCost {
        TOLL_FREE,
        STANDARD_RATE,
        PREMIUM_RATE,
        UNKNOWN_COST
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT = hashSet;
        hashSet.add(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.COUNTRY_BR);
        hashSet.add("CL");
        hashSet.add("NI");
    }

    public static com.google.i18n.phonenumbers.ShortNumberInfo getInstance() {
        return INSTANCE;
    }

    ShortNumberInfo(com.google.i18n.phonenumbers.internal.MatcherApi matcherApi, com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource regionMetadataSource) {
        this.matcherApi = matcherApi;
        this.shortNumberMetadataSource = regionMetadataSource;
    }

    private java.util.List<java.lang.String> getRegionCodesForCountryCode(int i) {
        java.util.List<java.lang.String> list = this.countryCallingCodeToRegionCodeMap.get(java.lang.Integer.valueOf(i));
        if (list == null) {
            list = new java.util.ArrayList<>(0);
        }
        return java.util.Collections.unmodifiableList(list);
    }

    private boolean regionDialingFromMatchesNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        return getRegionCodesForCountryCode(phoneNumber.getCountryCode()).contains(str);
    }

    private com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getShortNumberMetadataForRegion(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.shortNumberMetadataSource.getMetadataForRegion(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean isPossibleShortNumberForRegion(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion;
        if (regionDialingFromMatchesNumber(phoneNumber, str) && (shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str)) != null) {
            return shortNumberMetadataForRegion.getGeneralDesc().getPossibleLengthList().contains(java.lang.Integer.valueOf(getNationalSignificantNumber(phoneNumber).length()));
        }
        return false;
    }

    public boolean isPossibleShortNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        java.util.List<java.lang.String> regionCodesForCountryCode = getRegionCodesForCountryCode(phoneNumber.getCountryCode());
        int length = getNationalSignificantNumber(phoneNumber).length();
        java.util.Iterator<java.lang.String> it = regionCodesForCountryCode.iterator();
        while (it.hasNext()) {
            com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion = getShortNumberMetadataForRegion(it.next());
            if (shortNumberMetadataForRegion != null && shortNumberMetadataForRegion.getGeneralDesc().getPossibleLengthList().contains(java.lang.Integer.valueOf(length))) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidShortNumberForRegion(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion;
        if (!regionDialingFromMatchesNumber(phoneNumber, str) || (shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str)) == null) {
            return false;
        }
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getGeneralDesc())) {
            return matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getShortCode());
        }
        return false;
    }

    public boolean isValidShortNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        java.util.List<java.lang.String> regionCodesForCountryCode = getRegionCodesForCountryCode(phoneNumber.getCountryCode());
        java.lang.String regionCodeForShortNumberFromRegionList = getRegionCodeForShortNumberFromRegionList(phoneNumber, regionCodesForCountryCode);
        if (regionCodesForCountryCode.size() <= 1 || regionCodeForShortNumberFromRegionList == null) {
            return isValidShortNumberForRegion(phoneNumber, regionCodeForShortNumberFromRegionList);
        }
        return true;
    }

    public com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost getExpectedCostForRegion(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        if (!regionDialingFromMatchesNumber(phoneNumber, str)) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST;
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str);
        if (shortNumberMetadataForRegion == null) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST;
        }
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!shortNumberMetadataForRegion.getGeneralDesc().getPossibleLengthList().contains(java.lang.Integer.valueOf(nationalSignificantNumber.length()))) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST;
        }
        if (matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getPremiumRate())) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.PREMIUM_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getStandardRate())) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.STANDARD_RATE;
        }
        if (matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getTollFree())) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.TOLL_FREE;
        }
        if (isEmergencyNumber(nationalSignificantNumber, str)) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.TOLL_FREE;
        }
        return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST;
    }

    public com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost getExpectedCost(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        java.util.List<java.lang.String> regionCodesForCountryCode = getRegionCodesForCountryCode(phoneNumber.getCountryCode());
        if (regionCodesForCountryCode.size() == 0) {
            return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST;
        }
        if (regionCodesForCountryCode.size() == 1) {
            return getExpectedCostForRegion(phoneNumber, regionCodesForCountryCode.get(0));
        }
        com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost shortNumberCost = com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.TOLL_FREE;
        java.util.Iterator<java.lang.String> it = regionCodesForCountryCode.iterator();
        while (it.hasNext()) {
            com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost expectedCostForRegion = getExpectedCostForRegion(phoneNumber, it.next());
            int ordinal = expectedCostForRegion.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.PREMIUM_RATE;
                    }
                    if (ordinal == 3) {
                        shortNumberCost = com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST;
                    } else {
                        logger.log(java.util.logging.Level.SEVERE, "Unrecognised cost for region: ".concat(java.lang.String.valueOf(expectedCostForRegion)));
                    }
                } else if (shortNumberCost != com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.UNKNOWN_COST) {
                    shortNumberCost = com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost.STANDARD_RATE;
                }
            }
        }
        return shortNumberCost;
    }

    private java.lang.String getRegionCodeForShortNumberFromRegionList(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.util.List<java.lang.String> list) {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        for (java.lang.String str : list) {
            com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str);
            if (shortNumberMetadataForRegion != null && matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getShortCode())) {
                return str;
            }
        }
        return null;
    }

    java.lang.String getExampleShortNumber(java.lang.String str) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str);
        if (shortNumberMetadataForRegion == null) {
            return "";
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc shortCode = shortNumberMetadataForRegion.getShortCode();
        if (!shortCode.hasExampleNumber()) {
            return "";
        }
        return shortCode.getExampleNumber();
    }

    java.lang.String getExampleShortNumberForCost(java.lang.String str, com.google.i18n.phonenumbers.ShortNumberInfo.ShortNumberCost shortNumberCost) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc tollFree;
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str);
        if (shortNumberMetadataForRegion == null) {
            return "";
        }
        int ordinal = shortNumberCost.ordinal();
        if (ordinal == 0) {
            tollFree = shortNumberMetadataForRegion.getTollFree();
        } else if (ordinal == 1) {
            tollFree = shortNumberMetadataForRegion.getStandardRate();
        } else {
            tollFree = ordinal != 2 ? null : shortNumberMetadataForRegion.getPremiumRate();
        }
        if (tollFree == null || !tollFree.hasExampleNumber()) {
            return "";
        }
        return tollFree.getExampleNumber();
    }

    public boolean connectsToEmergencyNumber(java.lang.String str, java.lang.String str2) {
        return matchesEmergencyNumberHelper(str, str2, true);
    }

    public boolean isEmergencyNumber(java.lang.CharSequence charSequence, java.lang.String str) {
        return matchesEmergencyNumberHelper(charSequence, str, false);
    }

    private boolean matchesEmergencyNumberHelper(java.lang.CharSequence charSequence, java.lang.String str, boolean z) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion;
        java.lang.CharSequence extractPossibleNumber = com.google.i18n.phonenumbers.PhoneNumberUtil.extractPossibleNumber(charSequence);
        boolean z2 = false;
        if (com.google.i18n.phonenumbers.PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(extractPossibleNumber).lookingAt() || (shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str)) == null || !shortNumberMetadataForRegion.hasEmergency()) {
            return false;
        }
        java.lang.String normalizeDigitsOnly = com.google.i18n.phonenumbers.PhoneNumberUtil.normalizeDigitsOnly(extractPossibleNumber);
        if (z && !REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT.contains(str)) {
            z2 = true;
        }
        return this.matcherApi.matchNationalNumber(normalizeDigitsOnly, shortNumberMetadataForRegion.getEmergency(), z2);
    }

    public boolean isCarrierSpecific(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        java.lang.String regionCodeForShortNumberFromRegionList = getRegionCodeForShortNumberFromRegionList(phoneNumber, getRegionCodesForCountryCode(phoneNumber.getCountryCode()));
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion = getShortNumberMetadataForRegion(regionCodeForShortNumberFromRegionList);
        return shortNumberMetadataForRegion != null && matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getCarrierSpecific());
    }

    public boolean isCarrierSpecificForRegion(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        if (!regionDialingFromMatchesNumber(phoneNumber, str)) {
            return false;
        }
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str);
        return shortNumberMetadataForRegion != null && matchesPossibleNumberAndNationalNumber(nationalSignificantNumber, shortNumberMetadataForRegion.getCarrierSpecific());
    }

    public boolean isSmsServiceForRegion(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata shortNumberMetadataForRegion;
        return regionDialingFromMatchesNumber(phoneNumber, str) && (shortNumberMetadataForRegion = getShortNumberMetadataForRegion(str)) != null && matchesPossibleNumberAndNationalNumber(getNationalSignificantNumber(phoneNumber), shortNumberMetadataForRegion.getSmsServices());
    }

    private static java.lang.String getNationalSignificantNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (phoneNumber.isItalianLeadingZero()) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            java.util.Arrays.fill(cArr, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            sb.append(new java.lang.String(cArr));
        }
        sb.append(phoneNumber.getNationalNumber());
        return sb.toString();
    }

    private boolean matchesPossibleNumberAndNationalNumber(java.lang.String str, com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        if (phoneNumberDesc.getPossibleLengthCount() <= 0 || phoneNumberDesc.getPossibleLengthList().contains(java.lang.Integer.valueOf(str.length()))) {
            return this.matcherApi.matchNationalNumber(str, phoneNumberDesc, false);
        }
        return false;
    }
}
