package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
public class PhoneNumberUtil {
    private static final java.util.Map<java.lang.Character, java.lang.Character> ALL_PLUS_NUMBER_GROUPING_SYMBOLS;
    private static final java.lang.String ALPHANUM;
    private static final java.util.Map<java.lang.Character, java.lang.Character> ALPHA_MAPPINGS;
    private static final java.util.Map<java.lang.Character, java.lang.Character> ALPHA_PHONE_MAPPINGS;
    private static final java.util.regex.Pattern CAPTURING_DIGIT_PATTERN;
    private static final java.lang.String CC_STRING = "$CC";
    private static final java.util.Set<java.lang.Integer> COUNTRIES_WITHOUT_NATIONAL_PREFIX_WITH_AREA_CODES;
    private static final java.lang.String DEFAULT_EXTN_PREFIX = " ext. ";
    private static final java.util.Map<java.lang.Character, java.lang.Character> DIALLABLE_CHAR_MAPPINGS;
    private static final java.lang.String DIGITS = "\\p{Nd}";
    private static final java.util.regex.Pattern EXTN_PATTERN;
    static final java.lang.String EXTN_PATTERNS_FOR_MATCHING;
    private static final java.lang.String EXTN_PATTERNS_FOR_PARSING;
    private static final java.lang.String FG_STRING = "$FG";
    private static final java.util.regex.Pattern FIRST_GROUP_ONLY_PREFIX_PATTERN;
    private static final java.util.regex.Pattern FIRST_GROUP_PATTERN;
    private static final java.util.Set<java.lang.Integer> GEO_MOBILE_COUNTRIES;
    private static final java.util.Set<java.lang.Integer> GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES;
    private static final int MAX_INPUT_STRING_LENGTH = 250;
    static final int MAX_LENGTH_COUNTRY_CODE = 3;
    static final int MAX_LENGTH_FOR_NSN = 17;
    private static final int MIN_LENGTH_FOR_NSN = 2;
    private static final java.util.Map<java.lang.Integer, java.lang.String> MOBILE_TOKEN_MAPPINGS;
    private static final int NANPA_COUNTRY_CODE = 1;
    static final java.util.regex.Pattern NON_DIGITS_PATTERN;
    private static final java.lang.String NP_STRING = "$NP";
    static final java.lang.String PLUS_CHARS = "+＋";
    static final java.util.regex.Pattern PLUS_CHARS_PATTERN;
    static final char PLUS_SIGN = '+';
    static final int REGEX_FLAGS = 66;
    public static final java.lang.String REGION_CODE_FOR_NON_GEO_ENTITY = "001";
    private static final java.lang.String RFC3966_DOMAINLABEL;
    private static final java.lang.String RFC3966_DOMAINNAME;
    static final java.util.regex.Pattern RFC3966_DOMAINNAME_PATTERN;
    private static final java.lang.String RFC3966_EXTN_PREFIX = ";ext=";
    private static final java.lang.String RFC3966_GLOBAL_NUMBER_DIGITS = "^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$";
    static final java.util.regex.Pattern RFC3966_GLOBAL_NUMBER_DIGITS_PATTERN;
    private static final java.lang.String RFC3966_ISDN_SUBADDRESS = ";isub=";
    private static final java.lang.String RFC3966_PHONE_CONTEXT = ";phone-context=";
    private static final java.lang.String RFC3966_PHONE_DIGIT = "(\\p{Nd}|[\\-\\.\\(\\)]?)";
    private static final java.lang.String RFC3966_PREFIX = "tel:";
    private static final java.lang.String RFC3966_TOPLABEL;
    private static final java.lang.String RFC3966_VISUAL_SEPARATOR = "[\\-\\.\\(\\)]?";
    private static final java.lang.String SECOND_NUMBER_START = "[\\\\/] *x";
    static final java.util.regex.Pattern SECOND_NUMBER_START_PATTERN;
    private static final java.util.regex.Pattern SEPARATOR_PATTERN;
    private static final java.util.regex.Pattern SINGLE_INTERNATIONAL_PREFIX;
    private static final char STAR_SIGN = '*';
    private static final java.lang.String UNKNOWN_REGION = "ZZ";
    private static final java.lang.String UNWANTED_END_CHARS = "[[\\P{N}&&\\P{L}]&&[^#]]+$";
    static final java.util.regex.Pattern UNWANTED_END_CHAR_PATTERN;
    private static final java.lang.String VALID_ALPHA;
    private static final java.util.regex.Pattern VALID_ALPHA_PHONE_PATTERN;
    private static final java.lang.String VALID_PHONE_NUMBER;
    private static final java.util.regex.Pattern VALID_PHONE_NUMBER_PATTERN;
    static final java.lang.String VALID_PUNCTUATION = "-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～";
    private static final java.lang.String VALID_START_CHAR = "[+＋\\p{Nd}]";
    private static final java.util.regex.Pattern VALID_START_CHAR_PATTERN;
    private static com.google.i18n.phonenumbers.PhoneNumberUtil instance;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.i18n.phonenumbers.PhoneNumberUtil.class.getName());
    private final java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> countryCallingCodeToRegionCodeMap;
    private final com.google.i18n.phonenumbers.metadata.source.MetadataSource metadataSource;
    private final com.google.i18n.phonenumbers.internal.MatcherApi matcherApi = com.google.i18n.phonenumbers.internal.RegexBasedMatcher.create();
    private final java.util.Set<java.lang.String> nanpaRegions = new java.util.HashSet(35);
    private final com.google.i18n.phonenumbers.internal.RegexCache regexCache = new com.google.i18n.phonenumbers.internal.RegexCache(100);
    private final java.util.Set<java.lang.String> supportedRegions = new java.util.HashSet(320);
    private final java.util.Set<java.lang.Integer> countryCodesForNonGeographicalRegion = new java.util.HashSet();

    public enum Leniency {
        POSSIBLE { // from class: com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.1
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            final boolean verify(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.PhoneNumberMatcher phoneNumberMatcher) {
                return phoneNumberUtil.isPossibleNumber(phoneNumber);
            }
        },
        VALID { // from class: com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.2
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            final boolean verify(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.PhoneNumberMatcher phoneNumberMatcher) {
                if (phoneNumberUtil.isValidNumber(phoneNumber) && com.google.i18n.phonenumbers.PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, charSequence.toString(), phoneNumberUtil)) {
                    return com.google.i18n.phonenumbers.PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil);
                }
                return false;
            }
        },
        STRICT_GROUPING { // from class: com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.3
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            final boolean verify(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.PhoneNumberMatcher phoneNumberMatcher) {
                java.lang.String obj = charSequence.toString();
                if (phoneNumberUtil.isValidNumber(phoneNumber) && com.google.i18n.phonenumbers.PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, obj, phoneNumberUtil) && !com.google.i18n.phonenumbers.PhoneNumberMatcher.containsMoreThanOneSlashInNationalNumber(phoneNumber, obj) && com.google.i18n.phonenumbers.PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil)) {
                    return phoneNumberMatcher.checkNumberGroupingIsValid(phoneNumber, charSequence, phoneNumberUtil, new com.google.i18n.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker() { // from class: com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.3.1
                        @Override // com.google.i18n.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker
                        public boolean checkGroups(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil2, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2, java.lang.StringBuilder sb, java.lang.String[] strArr) {
                            return com.google.i18n.phonenumbers.PhoneNumberMatcher.allNumberGroupsRemainGrouped(phoneNumberUtil2, phoneNumber2, sb, strArr);
                        }
                    });
                }
                return false;
            }
        },
        EXACT_GROUPING { // from class: com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.4
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            final boolean verify(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.PhoneNumberMatcher phoneNumberMatcher) {
                java.lang.String obj = charSequence.toString();
                if (phoneNumberUtil.isValidNumber(phoneNumber) && com.google.i18n.phonenumbers.PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, obj, phoneNumberUtil) && !com.google.i18n.phonenumbers.PhoneNumberMatcher.containsMoreThanOneSlashInNationalNumber(phoneNumber, obj) && com.google.i18n.phonenumbers.PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil)) {
                    return phoneNumberMatcher.checkNumberGroupingIsValid(phoneNumber, charSequence, phoneNumberUtil, new com.google.i18n.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker() { // from class: com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.4.1
                        @Override // com.google.i18n.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker
                        public boolean checkGroups(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil2, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2, java.lang.StringBuilder sb, java.lang.String[] strArr) {
                            return com.google.i18n.phonenumbers.PhoneNumberMatcher.allNumberGroupsAreExactlyPresent(phoneNumberUtil2, phoneNumber2, sb, strArr);
                        }
                    });
                }
                return false;
            }
        };

        abstract boolean verify(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, com.google.i18n.phonenumbers.PhoneNumberMatcher phoneNumberMatcher);
    }

    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(54, "9");
        MOBILE_TOKEN_MAPPINGS = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(86);
        GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES = java.util.Collections.unmodifiableSet(hashSet);
        java.util.HashSet hashSet2 = new java.util.HashSet();
        hashSet2.add(52);
        COUNTRIES_WITHOUT_NATIONAL_PREFIX_WITH_AREA_CODES = java.util.Collections.unmodifiableSet(hashSet2);
        java.util.HashSet hashSet3 = new java.util.HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        GEO_MOBILE_COUNTRIES = java.util.Collections.unmodifiableSet(hashSet3);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.Character valueOf = java.lang.Character.valueOf(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        hashMap2.put(valueOf, valueOf);
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        java.util.HashMap hashMap3 = new java.util.HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put(java.lang.Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT), '5');
        hashMap3.put(java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.MONTH), '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put(java.lang.Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR), '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put(java.lang.Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT), '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put(java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.YEAR), '9');
        hashMap3.put(java.lang.Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO), '9');
        java.util.Map<java.lang.Character, java.lang.Character> unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap3);
        ALPHA_MAPPINGS = unmodifiableMap;
        java.util.HashMap hashMap4 = new java.util.HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        ALPHA_PHONE_MAPPINGS = java.util.Collections.unmodifiableMap(hashMap4);
        java.util.HashMap hashMap5 = new java.util.HashMap();
        hashMap5.putAll(hashMap2);
        java.lang.Character valueOf2 = java.lang.Character.valueOf(PLUS_SIGN);
        hashMap5.put(valueOf2, valueOf2);
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        DIALLABLE_CHAR_MAPPINGS = java.util.Collections.unmodifiableMap(hashMap5);
        java.util.HashMap hashMap6 = new java.util.HashMap();
        java.util.Iterator<java.lang.Character> it = unmodifiableMap.keySet().iterator();
        while (it.hasNext()) {
            char charValue = it.next().charValue();
            hashMap6.put(java.lang.Character.valueOf(java.lang.Character.toLowerCase(charValue)), java.lang.Character.valueOf(charValue));
            hashMap6.put(java.lang.Character.valueOf(charValue), java.lang.Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put(java.lang.Character.valueOf(kotlin.text.Typography.ndash), '-');
        hashMap6.put(java.lang.Character.valueOf(kotlin.text.Typography.mdash), '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put(java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator), java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator));
        hashMap6.put((char) 65295, java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator));
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put(java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR), java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR));
        hashMap6.put((char) 65294, java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR));
        ALL_PLUS_NUMBER_GROUPING_SYMBOLS = java.util.Collections.unmodifiableMap(hashMap6);
        SINGLE_INTERNATIONAL_PREFIX = java.util.regex.Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Map<java.lang.Character, java.lang.Character> map = ALPHA_MAPPINGS;
        sb.append(java.util.Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(java.util.Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        java.lang.String obj = sb.toString();
        VALID_ALPHA = obj;
        PLUS_CHARS_PATTERN = java.util.regex.Pattern.compile("[+＋]+");
        SEPARATOR_PATTERN = java.util.regex.Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        CAPTURING_DIGIT_PATTERN = java.util.regex.Pattern.compile("(\\p{Nd})");
        VALID_START_CHAR_PATTERN = java.util.regex.Pattern.compile(VALID_START_CHAR);
        SECOND_NUMBER_START_PATTERN = java.util.regex.Pattern.compile(SECOND_NUMBER_START);
        UNWANTED_END_CHAR_PATTERN = java.util.regex.Pattern.compile(UNWANTED_END_CHARS);
        VALID_ALPHA_PHONE_PATTERN = java.util.regex.Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*");
        sb2.append(obj);
        sb2.append("\\p{Nd}]*");
        java.lang.String obj2 = sb2.toString();
        VALID_PHONE_NUMBER = obj2;
        java.lang.String createExtnPattern = createExtnPattern(true);
        EXTN_PATTERNS_FOR_PARSING = createExtnPattern;
        EXTN_PATTERNS_FOR_MATCHING = createExtnPattern(false);
        RFC3966_GLOBAL_NUMBER_DIGITS_PATTERN = java.util.regex.Pattern.compile(RFC3966_GLOBAL_NUMBER_DIGITS);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(DIGITS);
        java.lang.String obj3 = sb3.toString();
        ALPHANUM = obj3;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[");
        sb4.append(obj3);
        sb4.append("]+((\\-)*[");
        sb4.append(obj3);
        sb4.append("])*");
        java.lang.String obj4 = sb4.toString();
        RFC3966_DOMAINLABEL = obj4;
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[");
        sb5.append(obj);
        sb5.append("]+((\\-)*[");
        sb5.append(obj3);
        sb5.append("])*");
        java.lang.String obj5 = sb5.toString();
        RFC3966_TOPLABEL = obj5;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("^(");
        sb6.append(obj4);
        sb6.append("\\.)*");
        sb6.append(obj5);
        sb6.append("\\.?$");
        java.lang.String obj6 = sb6.toString();
        RFC3966_DOMAINNAME = obj6;
        RFC3966_DOMAINNAME_PATTERN = java.util.regex.Pattern.compile(obj6);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("(?:");
        sb7.append(createExtnPattern);
        sb7.append(")$");
        EXTN_PATTERN = java.util.regex.Pattern.compile(sb7.toString(), 66);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(obj2);
        sb8.append("(?:");
        sb8.append(createExtnPattern);
        sb8.append(")?");
        VALID_PHONE_NUMBER_PATTERN = java.util.regex.Pattern.compile(sb8.toString(), 66);
        NON_DIGITS_PATTERN = java.util.regex.Pattern.compile("(\\D+)");
        FIRST_GROUP_PATTERN = java.util.regex.Pattern.compile("(\\$\\d)");
        FIRST_GROUP_ONLY_PREFIX_PATTERN = java.util.regex.Pattern.compile("\\(?\\$1\\)?");
        instance = null;
    }

    private static java.lang.String extnDigits(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(\\p{Nd}{1,");
        sb.append(i);
        sb.append("})");
        return sb.toString();
    }

    private static java.lang.String createExtnPattern(boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(RFC3966_EXTN_PREFIX);
        sb.append(extnDigits(20));
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*");
        sb2.append(extnDigits(20));
        sb2.append("#?");
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*");
        sb3.append(extnDigits(9));
        sb3.append("#?");
        java.lang.String obj3 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[- ]+");
        sb4.append(extnDigits(6));
        sb4.append("#");
        java.lang.String obj4 = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(obj);
        sb5.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb5.append(obj2);
        sb5.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb5.append(obj3);
        sb5.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb5.append(obj4);
        java.lang.String obj5 = sb5.toString();
        if (!z) {
            return obj5;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*");
        sb6.append(extnDigits(15));
        sb6.append("#?");
        java.lang.String obj6 = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*");
        sb7.append(extnDigits(9));
        sb7.append("#?");
        java.lang.String obj7 = sb7.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(obj5);
        sb8.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb8.append(obj6);
        sb8.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb8.append(obj7);
        return sb8.toString();
    }

    PhoneNumberUtil(com.google.i18n.phonenumbers.metadata.source.MetadataSource metadataSource, java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> map) {
        this.metadataSource = metadataSource;
        this.countryCallingCodeToRegionCodeMap = map;
        for (java.util.Map.Entry<java.lang.Integer, java.util.List<java.lang.String>> entry : map.entrySet()) {
            java.util.List<java.lang.String> value = entry.getValue();
            if (value.size() == 1 && "001".equals(value.get(0))) {
                this.countryCodesForNonGeographicalRegion.add(entry.getKey());
            } else {
                this.supportedRegions.addAll(value);
            }
        }
        if (this.supportedRegions.remove("001")) {
            logger.log(java.util.logging.Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.nanpaRegions.addAll(map.get(1));
    }

    static java.lang.CharSequence extractPossibleNumber(java.lang.CharSequence charSequence) {
        java.util.regex.Matcher matcher = VALID_START_CHAR_PATTERN.matcher(charSequence);
        if (matcher.find()) {
            java.lang.CharSequence subSequence = charSequence.subSequence(matcher.start(), charSequence.length());
            java.util.regex.Matcher matcher2 = UNWANTED_END_CHAR_PATTERN.matcher(subSequence);
            if (matcher2.find()) {
                subSequence = subSequence.subSequence(0, matcher2.start());
            }
            java.util.regex.Matcher matcher3 = SECOND_NUMBER_START_PATTERN.matcher(subSequence);
            return matcher3.find() ? subSequence.subSequence(0, matcher3.start()) : subSequence;
        }
        return "";
    }

    static boolean isViablePhoneNumber(java.lang.CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return VALID_PHONE_NUMBER_PATTERN.matcher(charSequence).matches();
    }

    static java.lang.StringBuilder normalize(java.lang.StringBuilder sb) {
        if (VALID_ALPHA_PHONE_PATTERN.matcher(sb).matches()) {
            sb.replace(0, sb.length(), normalizeHelper(sb, ALPHA_PHONE_MAPPINGS, true));
            return sb;
        }
        sb.replace(0, sb.length(), normalizeDigitsOnly(sb));
        return sb;
    }

    public static java.lang.String normalizeDigitsOnly(java.lang.CharSequence charSequence) {
        return normalizeDigits(charSequence, false).toString();
    }

    static java.lang.StringBuilder normalizeDigits(java.lang.CharSequence charSequence, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            int digit = java.lang.Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static java.lang.String normalizeDiallableCharsOnly(java.lang.CharSequence charSequence) {
        return normalizeHelper(charSequence, DIALLABLE_CHAR_MAPPINGS, true);
    }

    public static java.lang.String convertAlphaCharactersInNumber(java.lang.CharSequence charSequence) {
        return normalizeHelper(charSequence, ALPHA_PHONE_MAPPINGS, false);
    }

    public int getLengthOfGeographicalAreaCode(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(getRegionCodeForNumber(phoneNumber));
        if (metadataForRegion == null) {
            return 0;
        }
        com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType numberType = getNumberType(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if (!metadataForRegion.hasNationalPrefix() && !phoneNumber.isItalianLeadingZero() && !COUNTRIES_WITHOUT_NATIONAL_PREFIX_WITH_AREA_CODES.contains(java.lang.Integer.valueOf(countryCode))) {
            return 0;
        }
        if (!(numberType == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE && GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES.contains(java.lang.Integer.valueOf(countryCode))) && isNumberGeographical(numberType, countryCode)) {
            return getLengthOfNationalDestinationCode(phoneNumber);
        }
        return 0;
    }

    public int getLengthOfNationalDestinationCode(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2;
        if (phoneNumber.hasExtension()) {
            phoneNumber2 = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
            phoneNumber2.mergeFrom(phoneNumber);
            phoneNumber2.clearExtension();
        } else {
            phoneNumber2 = phoneNumber;
        }
        java.lang.String[] split = NON_DIGITS_PATTERN.split(format(phoneNumber2, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL));
        if (split.length <= 3) {
            return 0;
        }
        if (getNumberType(phoneNumber) == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE && !getCountryMobileToken(phoneNumber.getCountryCode()).equals("")) {
            return split[2].length() + split[3].length();
        }
        return split[2].length();
    }

    public static java.lang.String getCountryMobileToken(int i) {
        java.util.Map<java.lang.Integer, java.lang.String> map = MOBILE_TOKEN_MAPPINGS;
        if (map.containsKey(java.lang.Integer.valueOf(i))) {
            return map.get(java.lang.Integer.valueOf(i));
        }
        return "";
    }

    private static java.lang.String normalizeHelper(java.lang.CharSequence charSequence, java.util.Map<java.lang.Character, java.lang.Character> map, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            java.lang.Character ch = map.get(java.lang.Character.valueOf(java.lang.Character.toUpperCase(charAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    static void setInstance(com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil) {
        synchronized (com.google.i18n.phonenumbers.PhoneNumberUtil.class) {
            instance = phoneNumberUtil;
        }
    }

    public java.util.Set<java.lang.String> getSupportedRegions() {
        return java.util.Collections.unmodifiableSet(this.supportedRegions);
    }

    public java.util.Set<java.lang.Integer> getSupportedGlobalNetworkCallingCodes() {
        return java.util.Collections.unmodifiableSet(this.countryCodesForNonGeographicalRegion);
    }

    public java.util.Set<java.lang.Integer> getSupportedCallingCodes() {
        return java.util.Collections.unmodifiableSet(this.countryCallingCodeToRegionCodeMap.keySet());
    }

    private static boolean descHasPossibleNumberData(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        return (phoneNumberDesc.getPossibleLengthCount() == 1 && phoneNumberDesc.getPossibleLength(0) == -1) ? false : true;
    }

    private static boolean descHasData(com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        return phoneNumberDesc.hasExampleNumber() || descHasPossibleNumberData(phoneNumberDesc) || phoneNumberDesc.hasNationalNumberPattern();
    }

    private java.util.Set<com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType> getSupportedTypesForMetadata(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        for (com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType : com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.values()) {
            if (phoneNumberType != com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE && phoneNumberType != com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN && descHasData(getNumberDescByType(phoneMetadata, phoneNumberType))) {
                treeSet.add(phoneNumberType);
            }
        }
        return java.util.Collections.unmodifiableSet(treeSet);
    }

    public java.util.Set<com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType> getSupportedTypesForRegion(java.lang.String str) {
        if (!isValidRegionCode(str)) {
            logger.log(java.util.logging.Level.WARNING, "Invalid or unknown region code provided: ".concat(java.lang.String.valueOf(str)));
            return java.util.Collections.unmodifiableSet(new java.util.TreeSet());
        }
        return getSupportedTypesForMetadata(getMetadataForRegion(str));
    }

    public java.util.Set<com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType> getSupportedTypesForNonGeoEntity(int i) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForNonGeographicalRegion = getMetadataForNonGeographicalRegion(i);
        if (metadataForNonGeographicalRegion == null) {
            logger.log(java.util.logging.Level.WARNING, "Unknown country calling code for a non-geographical entity provided: ".concat(java.lang.String.valueOf(i)));
            return java.util.Collections.unmodifiableSet(new java.util.TreeSet());
        }
        return getSupportedTypesForMetadata(metadataForNonGeographicalRegion);
    }

    public static com.google.i18n.phonenumbers.PhoneNumberUtil getInstance() {
        com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil;
        synchronized (com.google.i18n.phonenumbers.PhoneNumberUtil.class) {
            if (instance == null) {
                setInstance(createInstance(com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider.getInstance().getMetadataLoader()));
            }
            phoneNumberUtil = instance;
        }
        return phoneNumberUtil;
    }

    public static com.google.i18n.phonenumbers.PhoneNumberUtil createInstance(com.google.i18n.phonenumbers.MetadataLoader metadataLoader) {
        if (metadataLoader == null) {
            throw new java.lang.IllegalArgumentException("metadataLoader could not be null.");
        }
        return createInstance(new com.google.i18n.phonenumbers.metadata.source.MetadataSourceImpl(com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider.getInstance().getPhoneNumberMetadataFileNameProvider(), metadataLoader, com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider.getInstance().getMetadataParser()));
    }

    private static com.google.i18n.phonenumbers.PhoneNumberUtil createInstance(com.google.i18n.phonenumbers.metadata.source.MetadataSource metadataSource) {
        if (metadataSource == null) {
            throw new java.lang.IllegalArgumentException("metadataSource could not be null.");
        }
        return new com.google.i18n.phonenumbers.PhoneNumberUtil(metadataSource, com.google.i18n.phonenumbers.CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap());
    }

    static boolean formattingRuleHasFirstGroupOnly(java.lang.String str) {
        return str.length() == 0 || FIRST_GROUP_ONLY_PREFIX_PATTERN.matcher(str).matches();
    }

    public boolean isNumberGeographical(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        return isNumberGeographical(getNumberType(phoneNumber), phoneNumber.getCountryCode());
    }

    public boolean isNumberGeographical(com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType, int i) {
        if (phoneNumberType == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE || phoneNumberType == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            return true;
        }
        return GEO_MOBILE_COUNTRIES.contains(java.lang.Integer.valueOf(i)) && phoneNumberType == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
    }

    private boolean isValidRegionCode(java.lang.String str) {
        return str != null && this.supportedRegions.contains(str);
    }

    private boolean hasValidCountryCallingCode(int i) {
        return this.countryCallingCodeToRegionCodeMap.containsKey(java.lang.Integer.valueOf(i));
    }

    public java.lang.String format(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.getNationalNumber() == 0) {
            java.lang.String rawInput = phoneNumber.getRawInput();
            if (rawInput.length() > 0 || !phoneNumber.hasCountryCode()) {
                return rawInput;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        format(phoneNumber, phoneNumberFormat, sb);
        return sb.toString();
    }

    public void format(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat, java.lang.StringBuilder sb) {
        sb.setLength(0);
        int countryCode = phoneNumber.getCountryCode();
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (phoneNumberFormat == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164) {
            sb.append(nationalSignificantNumber);
            prefixNumberWithCountryCallingCode(countryCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164, sb);
        } else {
            if (!hasValidCountryCallingCode(countryCode)) {
                sb.append(nationalSignificantNumber);
                return;
            }
            com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
            sb.append(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, phoneNumberFormat));
            maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, phoneNumberFormat, sb);
            prefixNumberWithCountryCallingCode(countryCode, phoneNumberFormat, sb);
        }
    }

    public java.lang.String formatByPattern(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat, java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> list) {
        int countryCode = phoneNumber.getCountryCode();
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        com.google.i18n.phonenumbers.Phonemetadata.NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(list, nationalSignificantNumber);
        if (chooseFormattingPatternForNumber == null) {
            sb.append(nationalSignificantNumber);
        } else {
            com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.Builder newBuilder = com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.newBuilder();
            newBuilder.mergeFrom(chooseFormattingPatternForNumber);
            java.lang.String nationalPrefixFormattingRule = chooseFormattingPatternForNumber.getNationalPrefixFormattingRule();
            if (nationalPrefixFormattingRule.length() > 0) {
                java.lang.String nationalPrefix = metadataForRegionOrCallingCode.getNationalPrefix();
                if (nationalPrefix.length() > 0) {
                    newBuilder.setNationalPrefixFormattingRule(nationalPrefixFormattingRule.replace(NP_STRING, nationalPrefix).replace(FG_STRING, "$1"));
                } else {
                    newBuilder.clearNationalPrefixFormattingRule();
                }
            }
            sb.append(formatNsnUsingPattern(nationalSignificantNumber, newBuilder.build(), phoneNumberFormat));
        }
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, phoneNumberFormat, sb);
        prefixNumberWithCountryCallingCode(countryCode, phoneNumberFormat, sb);
        return sb.toString();
    }

    public java.lang.String formatNationalNumberWithCarrierCode(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence) {
        int countryCode = phoneNumber.getCountryCode();
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        sb.append(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL, charSequence));
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL, sb);
        prefixNumberWithCountryCallingCode(countryCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL, sb);
        return sb.toString();
    }

    private com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForRegionOrCallingCode(int i, java.lang.String str) {
        if ("001".equals(str)) {
            return getMetadataForNonGeographicalRegion(i);
        }
        return getMetadataForRegion(str);
    }

    public java.lang.String formatNationalNumberWithPreferredCarrierCode(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence) {
        if (phoneNumber.getPreferredDomesticCarrierCode().length() > 0) {
            charSequence = phoneNumber.getPreferredDomesticCarrierCode();
        }
        return formatNationalNumberWithCarrierCode(phoneNumber, charSequence);
    }

    public java.lang.String formatNumberForMobileDialing(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str, boolean z) {
        int countryCode = phoneNumber.getCountryCode();
        java.lang.String str2 = "";
        if (!hasValidCountryCallingCode(countryCode)) {
            return phoneNumber.hasRawInput() ? phoneNumber.getRawInput() : "";
        }
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber clearExtension = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber().mergeFrom(phoneNumber).clearExtension();
        java.lang.String regionCodeForCountryCode = getRegionCodeForCountryCode(countryCode);
        com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType numberType = getNumberType(clearExtension);
        boolean z2 = numberType != com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN;
        if (str.equals(regionCodeForCountryCode)) {
            boolean z3 = numberType == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE || numberType == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE || numberType == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE;
            if (regionCodeForCountryCode.equals(com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.COUNTRY_BR) && z3) {
                if (clearExtension.getPreferredDomesticCarrierCode().length() > 0) {
                    str2 = formatNationalNumberWithPreferredCarrierCode(clearExtension, "");
                }
            } else if (countryCode == 1) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
                if (canBeInternationallyDialled(clearExtension) && testNumberLength(getNationalSignificantNumber(clearExtension), metadataForRegion) != com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_SHORT) {
                    str2 = format(clearExtension, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
                } else {
                    str2 = format(clearExtension, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
                }
            } else if ((regionCodeForCountryCode.equals("001") || ((regionCodeForCountryCode.equals("MX") || regionCodeForCountryCode.equals("CL") || regionCodeForCountryCode.equals("UZ")) && z3)) && canBeInternationallyDialled(clearExtension)) {
                str2 = format(clearExtension, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
            } else {
                str2 = format(clearExtension, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
            }
        } else if (z2 && canBeInternationallyDialled(clearExtension)) {
            if (z) {
                return format(clearExtension, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
            }
            return format(clearExtension, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
        }
        return z ? str2 : normalizeDiallableCharsOnly(str2);
    }

    public java.lang.String formatOutOfCountryCallingNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        if (!isValidRegionCode(str)) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Trying to format number from invalid region ");
            sb.append(str);
            sb.append(". International formatting applied.");
            logger2.log(level, sb.toString());
            return format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
        }
        int countryCode = phoneNumber.getCountryCode();
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        if (countryCode == 1) {
            if (isNANPACountry(str)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(countryCode);
                sb2.append(" ");
                sb2.append(format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL));
                return sb2.toString();
            }
        } else if (countryCode == getCountryCodeForValidRegion(str)) {
            return format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        java.lang.String internationalPrefix = metadataForRegion.getInternationalPrefix();
        if (metadataForRegion.hasPreferredInternationalPrefix()) {
            internationalPrefix = metadataForRegion.getPreferredInternationalPrefix();
        } else if (!SINGLE_INTERNATIONAL_PREFIX.matcher(internationalPrefix).matches()) {
            internationalPrefix = "";
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL));
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL, sb3);
        if (internationalPrefix.length() > 0) {
            sb3.insert(0, " ").insert(0, countryCode).insert(0, " ").insert(0, internationalPrefix);
        } else {
            prefixNumberWithCountryCallingCode(countryCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL, sb3);
        }
        return sb3.toString();
    }

    public java.lang.String formatInOriginalFormat(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        java.lang.String format;
        java.lang.String nationalPrefixFormattingRule;
        int indexOf;
        if (phoneNumber.hasRawInput() && !hasFormattingPatternForNumber(phoneNumber)) {
            return phoneNumber.getRawInput();
        }
        if (!phoneNumber.hasCountryCodeSource()) {
            return format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
        }
        int i = com.google.i18n.phonenumbers.PhoneNumberUtil.AnonymousClass2.$SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource[phoneNumber.getCountryCodeSource().ordinal()];
        if (i == 1) {
            format = format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
        } else if (i == 2) {
            format = formatOutOfCountryCallingNumber(phoneNumber, str);
        } else if (i == 3) {
            format = format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL).substring(1);
        } else {
            java.lang.String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
            java.lang.String nddPrefixForRegion = getNddPrefixForRegion(regionCodeForCountryCode, true);
            format = format(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
            if (nddPrefixForRegion != null && nddPrefixForRegion.length() != 0 && !rawInputContainsNationalPrefix(phoneNumber.getRawInput(), nddPrefixForRegion, regionCodeForCountryCode)) {
                com.google.i18n.phonenumbers.Phonemetadata.NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(getMetadataForRegion(regionCodeForCountryCode).getNumberFormatList(), getNationalSignificantNumber(phoneNumber));
                if (chooseFormattingPatternForNumber != null && (indexOf = (nationalPrefixFormattingRule = chooseFormattingPatternForNumber.getNationalPrefixFormattingRule()).indexOf("$1")) > 0 && normalizeDigitsOnly(nationalPrefixFormattingRule.substring(0, indexOf)).length() != 0) {
                    com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.Builder newBuilder = com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.newBuilder();
                    newBuilder.mergeFrom(chooseFormattingPatternForNumber);
                    newBuilder.clearNationalPrefixFormattingRule();
                    java.util.ArrayList arrayList = new java.util.ArrayList(1);
                    arrayList.add(newBuilder.build());
                    format = formatByPattern(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL, arrayList);
                }
            }
        }
        java.lang.String rawInput = phoneNumber.getRawInput();
        return (format == null || rawInput.length() <= 0 || normalizeDiallableCharsOnly(format).equals(normalizeDiallableCharsOnly(rawInput))) ? format : rawInput;
    }

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource;

        static {
            int[] iArr = new int[com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.values().length];
            $SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource = iArr;
            try {
                iArr[com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource[com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource[com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource[com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private boolean rawInputContainsNationalPrefix(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String normalizeDigitsOnly = normalizeDigitsOnly(str);
        if (!normalizeDigitsOnly.startsWith(str2)) {
            return false;
        }
        try {
            return isValidNumber(parse(normalizeDigitsOnly.substring(str2.length()), str3));
        } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
            return false;
        }
    }

    private boolean hasFormattingPatternForNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        if (metadataForRegionOrCallingCode == null) {
            return false;
        }
        return chooseFormattingPatternForNumber(metadataForRegionOrCallingCode.getNumberFormatList(), getNationalSignificantNumber(phoneNumber)) != null;
    }

    public java.lang.String formatOutOfCountryKeepingAlphaChars(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        java.lang.String str2;
        int indexOf;
        java.lang.String rawInput = phoneNumber.getRawInput();
        if (rawInput.length() == 0) {
            return formatOutOfCountryCallingNumber(phoneNumber, str);
        }
        int countryCode = phoneNumber.getCountryCode();
        if (!hasValidCountryCallingCode(countryCode)) {
            return rawInput;
        }
        java.lang.String normalizeHelper = normalizeHelper(rawInput, ALL_PLUS_NUMBER_GROUPING_SYMBOLS, true);
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (nationalSignificantNumber.length() > 3 && (indexOf = normalizeHelper.indexOf(nationalSignificantNumber.substring(0, 3))) != -1) {
            normalizeHelper = normalizeHelper.substring(indexOf);
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (countryCode == 1) {
            if (isNANPACountry(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(countryCode);
                sb.append(" ");
                sb.append(normalizeHelper);
                return sb.toString();
            }
        } else if (metadataForRegion != null && countryCode == getCountryCodeForValidRegion(str)) {
            com.google.i18n.phonenumbers.Phonemetadata.NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(metadataForRegion.getNumberFormatList(), nationalSignificantNumber);
            if (chooseFormattingPatternForNumber == null) {
                return normalizeHelper;
            }
            com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.Builder newBuilder = com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.newBuilder();
            newBuilder.mergeFrom(chooseFormattingPatternForNumber);
            newBuilder.setPattern("(\\d+)(.*)");
            newBuilder.setFormat("$1$2");
            return formatNsnUsingPattern(normalizeHelper, newBuilder.build(), com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
        }
        if (metadataForRegion == null) {
            str2 = "";
        } else {
            str2 = metadataForRegion.getInternationalPrefix();
            if (!SINGLE_INTERNATIONAL_PREFIX.matcher(str2).matches()) {
                str2 = metadataForRegion.getPreferredInternationalPrefix();
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(normalizeHelper);
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        maybeStripExtension(sb2);
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL, sb2);
        if (str2.length() > 0) {
            sb2.insert(0, " ").insert(0, countryCode).insert(0, " ").insert(0, str2);
        } else {
            if (!isValidRegionCode(str)) {
                java.util.logging.Logger logger2 = logger;
                java.util.logging.Level level = java.util.logging.Level.WARNING;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Trying to format number from invalid region ");
                sb3.append(str);
                sb3.append(". International formatting applied.");
                logger2.log(level, sb3.toString());
            }
            prefixNumberWithCountryCallingCode(countryCode, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL, sb2);
        }
        return sb2.toString();
    }

    public java.lang.String getNationalSignificantNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (phoneNumber.isItalianLeadingZero() && phoneNumber.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            java.util.Arrays.fill(cArr, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            sb.append(new java.lang.String(cArr));
        }
        sb.append(phoneNumber.getNationalNumber());
        return sb.toString();
    }

    private void prefixNumberWithCountryCallingCode(int i, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat, java.lang.StringBuilder sb) {
        int ordinal = phoneNumberFormat.ordinal();
        if (ordinal == 0) {
            sb.insert(0, i).insert(0, PLUS_SIGN);
        } else if (ordinal == 1) {
            sb.insert(0, " ").insert(0, i).insert(0, PLUS_SIGN);
        } else {
            if (ordinal != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i).insert(0, PLUS_SIGN).insert(0, RFC3966_PREFIX);
        }
    }

    private java.lang.String formatNsn(java.lang.String str, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat) {
        return formatNsn(str, phoneMetadata, phoneNumberFormat, null);
    }

    private java.lang.String formatNsn(java.lang.String str, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat, java.lang.CharSequence charSequence) {
        java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> numberFormatList;
        if (phoneMetadata.getIntlNumberFormatList().size() == 0 || phoneNumberFormat == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL) {
            numberFormatList = phoneMetadata.getNumberFormatList();
        } else {
            numberFormatList = phoneMetadata.getIntlNumberFormatList();
        }
        com.google.i18n.phonenumbers.Phonemetadata.NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(numberFormatList, str);
        return chooseFormattingPatternForNumber == null ? str : formatNsnUsingPattern(str, chooseFormattingPatternForNumber, phoneNumberFormat, charSequence);
    }

    com.google.i18n.phonenumbers.Phonemetadata.NumberFormat chooseFormattingPatternForNumber(java.util.List<com.google.i18n.phonenumbers.Phonemetadata.NumberFormat> list, java.lang.String str) {
        for (com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat : list) {
            int leadingDigitsPatternCount = numberFormat.getLeadingDigitsPatternCount();
            if (leadingDigitsPatternCount == 0 || this.regexCache.getPatternForRegex(numberFormat.getLeadingDigitsPattern(leadingDigitsPatternCount - 1)).matcher(str).lookingAt()) {
                if (this.regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(str).matches()) {
                    return numberFormat;
                }
            }
        }
        return null;
    }

    java.lang.String formatNsnUsingPattern(java.lang.String str, com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat) {
        return formatNsnUsingPattern(str, numberFormat, phoneNumberFormat, null);
    }

    private java.lang.String formatNsnUsingPattern(java.lang.String str, com.google.i18n.phonenumbers.Phonemetadata.NumberFormat numberFormat, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat, java.lang.CharSequence charSequence) {
        java.lang.String replaceAll;
        java.lang.String format = numberFormat.getFormat();
        java.util.regex.Matcher matcher = this.regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(str);
        if (phoneNumberFormat == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL && charSequence != null && charSequence.length() > 0 && numberFormat.getDomesticCarrierCodeFormattingRule().length() > 0) {
            replaceAll = matcher.replaceAll(FIRST_GROUP_PATTERN.matcher(format).replaceFirst(numberFormat.getDomesticCarrierCodeFormattingRule().replace(CC_STRING, charSequence)));
        } else {
            java.lang.String nationalPrefixFormattingRule = numberFormat.getNationalPrefixFormattingRule();
            if (phoneNumberFormat == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL && nationalPrefixFormattingRule != null && nationalPrefixFormattingRule.length() > 0) {
                replaceAll = matcher.replaceAll(FIRST_GROUP_PATTERN.matcher(format).replaceFirst(nationalPrefixFormattingRule));
            } else {
                replaceAll = matcher.replaceAll(format);
            }
        }
        if (phoneNumberFormat != com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966) {
            return replaceAll;
        }
        java.util.regex.Matcher matcher2 = SEPARATOR_PATTERN.matcher(replaceAll);
        if (matcher2.lookingAt()) {
            replaceAll = matcher2.replaceFirst("");
        }
        return matcher2.reset(replaceAll).replaceAll("-");
    }

    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber getExampleNumber(java.lang.String str) {
        return getExampleNumberForType(str, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber getInvalidExampleNumber(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5.isValidRegionCode(r6)
            r1 = 0
            if (r0 != 0) goto L19
            java.util.logging.Logger r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.logger
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "Invalid or unknown region code provided: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r3.concat(r6)
            r0.log(r2, r6)
            return r1
        L19:
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r0 = r5.getMetadataForRegion(r6)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r0 = r5.getNumberDescByType(r0, r2)
            boolean r2 = r0.hasExampleNumber()
            if (r2 != 0) goto L2a
            return r1
        L2a:
            java.lang.String r0 = r0.getExampleNumber()
            int r2 = r0.length()
            int r2 = r2 + (-1)
        L34:
            r3 = 2
            if (r2 < r3) goto L4a
            r3 = 0
            java.lang.String r3 = r0.substring(r3, r2)
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r3 = r5.parse(r3, r6)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L47
            boolean r4 = r5.isValidNumber(r3)     // Catch: com.google.i18n.phonenumbers.NumberParseException -> L47
            if (r4 != 0) goto L47
            return r3
        L47:
            int r2 = r2 + (-1)
            goto L34
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.getInvalidExampleNumber(java.lang.String):com.google.i18n.phonenumbers.Phonenumber$PhoneNumber");
    }

    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber getExampleNumberForType(java.lang.String str, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        if (!isValidRegionCode(str)) {
            logger.log(java.util.logging.Level.WARNING, "Invalid or unknown region code provided: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForRegion(str), phoneNumberType);
        try {
            if (numberDescByType.hasExampleNumber()) {
                return parse(numberDescByType.getExampleNumber(), str);
            }
        } catch (com.google.i18n.phonenumbers.NumberParseException e) {
            logger.log(java.util.logging.Level.SEVERE, e.toString());
        }
        return null;
    }

    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber getExampleNumberForType(com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        java.util.Iterator<java.lang.String> it = getSupportedRegions().iterator();
        while (it.hasNext()) {
            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber exampleNumberForType = getExampleNumberForType(it.next(), phoneNumberType);
            if (exampleNumberForType != null) {
                return exampleNumberForType;
            }
        }
        java.util.Iterator<java.lang.Integer> it2 = getSupportedGlobalNetworkCallingCodes().iterator();
        while (it2.hasNext()) {
            int intValue = it2.next().intValue();
            com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForNonGeographicalRegion(intValue), phoneNumberType);
            try {
            } catch (com.google.i18n.phonenumbers.NumberParseException e) {
                logger.log(java.util.logging.Level.SEVERE, e.toString());
            }
            if (numberDescByType.hasExampleNumber()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("+");
                sb.append(intValue);
                sb.append(numberDescByType.getExampleNumber());
                return parse(sb.toString(), UNKNOWN_REGION);
            }
            continue;
        }
        return null;
    }

    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber getExampleNumberForNonGeoEntity(int i) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForNonGeographicalRegion = getMetadataForNonGeographicalRegion(i);
        if (metadataForNonGeographicalRegion != null) {
            for (com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc : java.util.Arrays.asList(metadataForNonGeographicalRegion.getMobile(), metadataForNonGeographicalRegion.getTollFree(), metadataForNonGeographicalRegion.getSharedCost(), metadataForNonGeographicalRegion.getVoip(), metadataForNonGeographicalRegion.getVoicemail(), metadataForNonGeographicalRegion.getUan(), metadataForNonGeographicalRegion.getPremiumRate())) {
                if (phoneNumberDesc != null) {
                    try {
                        if (phoneNumberDesc.hasExampleNumber()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("+");
                            sb.append(i);
                            sb.append(phoneNumberDesc.getExampleNumber());
                            return parse(sb.toString(), UNKNOWN_REGION);
                        }
                        continue;
                    } catch (com.google.i18n.phonenumbers.NumberParseException e) {
                        logger.log(java.util.logging.Level.SEVERE, e.toString());
                    }
                }
            }
            return null;
        }
        logger.log(java.util.logging.Level.WARNING, "Invalid or unknown country calling code provided: ".concat(java.lang.String.valueOf(i)));
        return null;
    }

    private void maybeAppendFormattedExtension(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat, java.lang.StringBuilder sb) {
        if (!phoneNumber.hasExtension() || phoneNumber.getExtension().length() <= 0) {
            return;
        }
        if (phoneNumberFormat == com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966) {
            sb.append(RFC3966_EXTN_PREFIX);
            sb.append(phoneNumber.getExtension());
        } else if (phoneMetadata.hasPreferredExtnPrefix()) {
            sb.append(phoneMetadata.getPreferredExtnPrefix());
            sb.append(phoneNumber.getExtension());
        } else {
            sb.append(DEFAULT_EXTN_PREFIX);
            sb.append(phoneNumber.getExtension());
        }
    }

    com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc getNumberDescByType(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        switch (phoneNumberType) {
            case FIXED_LINE:
            case FIXED_LINE_OR_MOBILE:
                return phoneMetadata.getFixedLine();
            case MOBILE:
                return phoneMetadata.getMobile();
            case TOLL_FREE:
                return phoneMetadata.getTollFree();
            case PREMIUM_RATE:
                return phoneMetadata.getPremiumRate();
            case SHARED_COST:
                return phoneMetadata.getSharedCost();
            case VOIP:
                return phoneMetadata.getVoip();
            case PERSONAL_NUMBER:
                return phoneMetadata.getPersonalNumber();
            case PAGER:
                return phoneMetadata.getPager();
            case UAN:
                return phoneMetadata.getUan();
            case VOICEMAIL:
                return phoneMetadata.getVoicemail();
            default:
                return phoneMetadata.getGeneralDesc();
        }
    }

    public com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType getNumberType(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(phoneNumber.getCountryCode(), getRegionCodeForNumber(phoneNumber));
        if (metadataForRegionOrCallingCode == null) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN;
        }
        return getNumberTypeHelper(getNationalSignificantNumber(phoneNumber), metadataForRegionOrCallingCode);
    }

    private com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType getNumberTypeHelper(java.lang.String str, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
        if (!isNumberMatchingDesc(str, phoneMetadata.getGeneralDesc())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPremiumRate())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PREMIUM_RATE;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getTollFree())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.TOLL_FREE;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getSharedCost())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.SHARED_COST;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getVoip())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOIP;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPersonalNumber())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PERSONAL_NUMBER;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPager())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PAGER;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getUan())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UAN;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getVoicemail())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOICEMAIL;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getFixedLine())) {
            if (phoneMetadata.getSameMobileAndFixedLinePattern()) {
                return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (isNumberMatchingDesc(str, phoneMetadata.getMobile())) {
                return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE;
        }
        if (!phoneMetadata.getSameMobileAndFixedLinePattern() && isNumberMatchingDesc(str, phoneMetadata.getMobile())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
        }
        return com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN;
    }

    com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForRegion(java.lang.String str) {
        if (!isValidRegionCode(str)) {
            return null;
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = this.metadataSource.getMetadataForRegion(str);
        ensureMetadataIsNonNull(metadataForRegion, "Missing metadata for region code ".concat(java.lang.String.valueOf(str)));
        return metadataForRegion;
    }

    com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i) {
        if (!this.countryCodesForNonGeographicalRegion.contains(java.lang.Integer.valueOf(i))) {
            return null;
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForNonGeographicalRegion = this.metadataSource.getMetadataForNonGeographicalRegion(i);
        ensureMetadataIsNonNull(metadataForNonGeographicalRegion, "Missing metadata for country code ".concat(java.lang.String.valueOf(i)));
        return metadataForNonGeographicalRegion;
    }

    private static void ensureMetadataIsNonNull(com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, java.lang.String str) {
        if (phoneMetadata == null) {
            throw new com.google.i18n.phonenumbers.MissingMetadataException(str);
        }
    }

    boolean isNumberMatchingDesc(java.lang.String str, com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        java.util.List<java.lang.Integer> possibleLengthList = phoneNumberDesc.getPossibleLengthList();
        if (possibleLengthList.size() <= 0 || possibleLengthList.contains(java.lang.Integer.valueOf(length))) {
            return this.matcherApi.matchNationalNumber(str, phoneNumberDesc, false);
        }
        return false;
    }

    public boolean isValidNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        return isValidNumberForRegion(phoneNumber, getRegionCodeForNumber(phoneNumber));
    }

    public boolean isValidNumberForRegion(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String str) {
        int countryCode = phoneNumber.getCountryCode();
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, str);
        if (metadataForRegionOrCallingCode != null) {
            return ("001".equals(str) || countryCode == getCountryCodeForValidRegion(str)) && getNumberTypeHelper(getNationalSignificantNumber(phoneNumber), metadataForRegionOrCallingCode) != com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN;
        }
        return false;
    }

    public java.lang.String getRegionCodeForNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        java.util.List<java.lang.String> list = this.countryCallingCodeToRegionCodeMap.get(java.lang.Integer.valueOf(countryCode));
        if (list == null) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.INFO;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing/invalid country_code (");
            sb.append(countryCode);
            sb.append(")");
            logger2.log(level, sb.toString());
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return getRegionCodeForNumberFromRegionList(phoneNumber, list);
    }

    private java.lang.String getRegionCodeForNumberFromRegionList(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.util.List<java.lang.String> list) {
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        for (java.lang.String str : list) {
            com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
            if (metadataForRegion.hasLeadingDigits()) {
                if (this.regexCache.getPatternForRegex(metadataForRegion.getLeadingDigits()).matcher(nationalSignificantNumber).lookingAt()) {
                    return str;
                }
            } else if (getNumberTypeHelper(nationalSignificantNumber, metadataForRegion) != com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    public java.lang.String getRegionCodeForCountryCode(int i) {
        java.util.List<java.lang.String> list = this.countryCallingCodeToRegionCodeMap.get(java.lang.Integer.valueOf(i));
        return list == null ? UNKNOWN_REGION : list.get(0);
    }

    public java.util.List<java.lang.String> getRegionCodesForCountryCode(int i) {
        java.util.List<java.lang.String> list = this.countryCallingCodeToRegionCodeMap.get(java.lang.Integer.valueOf(i));
        if (list == null) {
            list = new java.util.ArrayList<>(0);
        }
        return java.util.Collections.unmodifiableList(list);
    }

    public int getCountryCodeForRegion(java.lang.String str) {
        if (!isValidRegionCode(str)) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(") provided.");
            logger2.log(level, sb.toString());
            return 0;
        }
        return getCountryCodeForValidRegion(str);
    }

    private int getCountryCodeForValidRegion(java.lang.String str) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion == null) {
            throw new java.lang.IllegalArgumentException("Invalid region code: ".concat(java.lang.String.valueOf(str)));
        }
        return metadataForRegion.getCountryCode();
    }

    public java.lang.String getNddPrefixForRegion(java.lang.String str, boolean z) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion == null) {
            java.util.logging.Logger logger2 = logger;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(") provided.");
            logger2.log(level, sb.toString());
            return null;
        }
        java.lang.String nationalPrefix = metadataForRegion.getNationalPrefix();
        if (nationalPrefix.length() == 0) {
            return null;
        }
        return z ? nationalPrefix.replace("~", "") : nationalPrefix;
    }

    public boolean isNANPACountry(java.lang.String str) {
        return this.nanpaRegions.contains(str);
    }

    public boolean isAlphaNumber(java.lang.CharSequence charSequence) {
        if (!isViablePhoneNumber(charSequence)) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence);
        maybeStripExtension(sb);
        return VALID_ALPHA_PHONE_PATTERN.matcher(sb).matches();
    }

    public boolean isPossibleNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberWithReason = isPossibleNumberWithReason(phoneNumber);
        return isPossibleNumberWithReason == com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE || isPossibleNumberWithReason == com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
    }

    public boolean isPossibleNumberForType(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberForTypeWithReason = isPossibleNumberForTypeWithReason(phoneNumber, phoneNumberType);
        return isPossibleNumberForTypeWithReason == com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE || isPossibleNumberForTypeWithReason == com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
    }

    private com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult testNumberLength(java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata) {
        return testNumberLength(charSequence, phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN);
    }

    private com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult testNumberLength(java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        java.util.List<java.lang.Integer> possibleLengthList;
        java.util.List<java.lang.Integer> possibleLengthLocalOnlyList;
        java.util.List<java.lang.Integer> possibleLengthList2;
        java.util.List<java.lang.Integer> arrayList;
        while (true) {
            com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc numberDescByType = getNumberDescByType(phoneMetadata, phoneNumberType);
            possibleLengthList = numberDescByType.getPossibleLengthList().isEmpty() ? phoneMetadata.getGeneralDesc().getPossibleLengthList() : numberDescByType.getPossibleLengthList();
            possibleLengthLocalOnlyList = numberDescByType.getPossibleLengthLocalOnlyList();
            if (phoneNumberType != com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE) {
                break;
            }
            if (!descHasPossibleNumberData(getNumberDescByType(phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE))) {
                phoneNumberType = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
            } else {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc numberDescByType2 = getNumberDescByType(phoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE);
                if (descHasPossibleNumberData(numberDescByType2)) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(possibleLengthList);
                    if (numberDescByType2.getPossibleLengthCount() == 0) {
                        possibleLengthList2 = phoneMetadata.getGeneralDesc().getPossibleLengthList();
                    } else {
                        possibleLengthList2 = numberDescByType2.getPossibleLengthList();
                    }
                    arrayList2.addAll(possibleLengthList2);
                    java.util.Collections.sort(arrayList2);
                    if (possibleLengthLocalOnlyList.isEmpty()) {
                        arrayList = numberDescByType2.getPossibleLengthLocalOnlyList();
                    } else {
                        arrayList = new java.util.ArrayList<>(possibleLengthLocalOnlyList);
                        arrayList.addAll(numberDescByType2.getPossibleLengthLocalOnlyList());
                        java.util.Collections.sort(arrayList);
                    }
                    possibleLengthLocalOnlyList = arrayList;
                    possibleLengthList = arrayList2;
                }
            }
        }
        if (possibleLengthList.get(0).intValue() == -1) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (possibleLengthLocalOnlyList.contains(java.lang.Integer.valueOf(length))) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = possibleLengthList.get(0).intValue();
        if (intValue == length) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE;
        }
        if (intValue > length) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_SHORT;
        }
        if (possibleLengthList.get(possibleLengthList.size() - 1).intValue() < length) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_LONG;
        }
        return possibleLengthList.subList(1, possibleLengthList.size()).contains(java.lang.Integer.valueOf(length)) ? com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE : com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH;
    }

    public com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberWithReason(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        return isPossibleNumberForTypeWithReason(phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN);
    }

    public com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberForTypeWithReason(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        java.lang.String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if (!hasValidCountryCallingCode(countryCode)) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE;
        }
        return testNumberLength(nationalSignificantNumber, getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode)), phoneNumberType);
    }

    public boolean isPossibleNumber(java.lang.CharSequence charSequence, java.lang.String str) {
        try {
            return isPossibleNumber(parse(charSequence, str));
        } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
            return false;
        }
    }

    public boolean truncateTooLongNumber(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        if (isValidNumber(phoneNumber)) {
            return true;
        }
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
        phoneNumber2.mergeFrom(phoneNumber);
        long nationalNumber = phoneNumber.getNationalNumber();
        do {
            nationalNumber /= 10;
            phoneNumber2.setNationalNumber(nationalNumber);
            if (isPossibleNumberWithReason(phoneNumber2) == com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_SHORT || nationalNumber == 0) {
                return false;
            }
        } while (!isValidNumber(phoneNumber2));
        phoneNumber.setNationalNumber(nationalNumber);
        return true;
    }

    public com.google.i18n.phonenumbers.AsYouTypeFormatter getAsYouTypeFormatter(java.lang.String str) {
        return new com.google.i18n.phonenumbers.AsYouTypeFormatter(str);
    }

    int extractCountryCode(java.lang.StringBuilder sb, java.lang.StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i = 1; i <= 3 && i <= length; i++) {
                int parseInt = java.lang.Integer.parseInt(sb.substring(0, i));
                if (this.countryCallingCodeToRegionCodeMap.containsKey(java.lang.Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    int maybeExtractCountryCode(java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, java.lang.StringBuilder sb, boolean z, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) throws com.google.i18n.phonenumbers.NumberParseException {
        java.lang.String str;
        if (charSequence.length() == 0) {
            return 0;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(charSequence);
        if (phoneMetadata == null) {
            str = "NonMatch";
        } else {
            str = phoneMetadata.getInternationalPrefix();
        }
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource maybeStripInternationalPrefixAndNormalize = maybeStripInternationalPrefixAndNormalize(sb2, str);
        if (z) {
            phoneNumber.setCountryCodeSource(maybeStripInternationalPrefixAndNormalize);
        }
        if (maybeStripInternationalPrefixAndNormalize != com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() <= 2) {
                throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int extractCountryCode = extractCountryCode(sb2, sb);
            if (extractCountryCode != 0) {
                phoneNumber.setCountryCode(extractCountryCode);
                return extractCountryCode;
            }
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        }
        if (phoneMetadata != null) {
            int countryCode = phoneMetadata.getCountryCode();
            java.lang.String valueOf = java.lang.String.valueOf(countryCode);
            java.lang.String obj = sb2.toString();
            if (obj.startsWith(valueOf)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(obj.substring(valueOf.length()));
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                maybeStripNationalPrefixAndCarrierCode(sb3, phoneMetadata, null);
                if ((!this.matcherApi.matchNationalNumber(sb2, generalDesc, false) && this.matcherApi.matchNationalNumber(sb3, generalDesc, false)) || testNumberLength(sb2, phoneMetadata) == com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_LONG) {
                    sb.append((java.lang.CharSequence) sb3);
                    if (z) {
                        phoneNumber.setCountryCodeSource(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    phoneNumber.setCountryCode(countryCode);
                    return countryCode;
                }
            }
        }
        phoneNumber.setCountryCode(0);
        return 0;
    }

    private boolean parsePrefixAsIdd(java.util.regex.Pattern pattern, java.lang.StringBuilder sb) {
        java.util.regex.Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        java.util.regex.Matcher matcher2 = CAPTURING_DIGIT_PATTERN.matcher(sb.substring(end));
        if (matcher2.find() && normalizeDigitsOnly(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, end);
        return true;
    }

    com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource maybeStripInternationalPrefixAndNormalize(java.lang.StringBuilder sb, java.lang.String str) {
        if (sb.length() == 0) {
            return com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        java.util.regex.Matcher matcher = PLUS_CHARS_PATTERN.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            normalize(sb);
            return com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        java.util.regex.Pattern patternForRegex = this.regexCache.getPatternForRegex(str);
        normalize(sb);
        if (parsePrefixAsIdd(patternForRegex, sb)) {
            return com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;
        }
        return com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    boolean maybeStripNationalPrefixAndCarrierCode(java.lang.StringBuilder sb, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata phoneMetadata, java.lang.StringBuilder sb2) {
        int length = sb.length();
        java.lang.String nationalPrefixForParsing = phoneMetadata.getNationalPrefixForParsing();
        if (length != 0 && nationalPrefixForParsing.length() != 0) {
            java.util.regex.Matcher matcher = this.regexCache.getPatternForRegex(nationalPrefixForParsing).matcher(sb);
            if (matcher.lookingAt()) {
                com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                boolean matchNationalNumber = this.matcherApi.matchNationalNumber(sb, generalDesc, false);
                int groupCount = matcher.groupCount();
                java.lang.String nationalPrefixTransformRule = phoneMetadata.getNationalPrefixTransformRule();
                if (nationalPrefixTransformRule == null || nationalPrefixTransformRule.length() == 0 || matcher.group(groupCount) == null) {
                    if (matchNationalNumber && !this.matcherApi.matchNationalNumber(sb.substring(matcher.end()), generalDesc, false)) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb);
                sb3.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
                if (matchNationalNumber && !this.matcherApi.matchNationalNumber(sb3.toString(), generalDesc, false)) {
                    return false;
                }
                if (sb2 != null && groupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
                return true;
            }
        }
        return false;
    }

    java.lang.String maybeStripExtension(java.lang.StringBuilder sb) {
        java.util.regex.Matcher matcher = EXTN_PATTERN.matcher(sb);
        if (matcher.find() && isViablePhoneNumber(sb.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                if (matcher.group(i) != null) {
                    java.lang.String group = matcher.group(i);
                    sb.delete(matcher.start(), sb.length());
                    return group;
                }
            }
            return "";
        }
        return "";
    }

    private boolean checkRegionForParsing(java.lang.CharSequence charSequence, java.lang.String str) {
        if (isValidRegionCode(str)) {
            return true;
        }
        return (charSequence == null || charSequence.length() == 0 || !PLUS_CHARS_PATTERN.matcher(charSequence).lookingAt()) ? false : true;
    }

    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber parse(java.lang.CharSequence charSequence, java.lang.String str) throws com.google.i18n.phonenumbers.NumberParseException {
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
        parse(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    public void parse(java.lang.CharSequence charSequence, java.lang.String str, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) throws com.google.i18n.phonenumbers.NumberParseException {
        parseHelper(charSequence, str, false, true, phoneNumber);
    }

    public com.google.i18n.phonenumbers.Phonenumber.PhoneNumber parseAndKeepRawInput(java.lang.CharSequence charSequence, java.lang.String str) throws com.google.i18n.phonenumbers.NumberParseException {
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
        parseAndKeepRawInput(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    public void parseAndKeepRawInput(java.lang.CharSequence charSequence, java.lang.String str, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) throws com.google.i18n.phonenumbers.NumberParseException {
        parseHelper(charSequence, str, true, true, phoneNumber);
    }

    public java.lang.Iterable<com.google.i18n.phonenumbers.PhoneNumberMatch> findNumbers(java.lang.CharSequence charSequence, java.lang.String str) {
        return findNumbers(charSequence, str, com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.VALID, Long.MAX_VALUE);
    }

    public java.lang.Iterable<com.google.i18n.phonenumbers.PhoneNumberMatch> findNumbers(final java.lang.CharSequence charSequence, final java.lang.String str, final com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency leniency, final long j) {
        return new java.lang.Iterable<com.google.i18n.phonenumbers.PhoneNumberMatch>() { // from class: com.google.i18n.phonenumbers.PhoneNumberUtil.1
            @Override // java.lang.Iterable
            public java.util.Iterator<com.google.i18n.phonenumbers.PhoneNumberMatch> iterator() {
                return new com.google.i18n.phonenumbers.PhoneNumberMatcher(com.google.i18n.phonenumbers.PhoneNumberUtil.this, charSequence, str, leniency, j);
            }
        };
    }

    static void setItalianLeadingZerosForPhoneNumber(java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        if (charSequence.length() <= 1 || charSequence.charAt(0) != '0') {
            return;
        }
        phoneNumber.setItalianLeadingZero(true);
        int i = 1;
        while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
            i++;
        }
        if (i != 1) {
            phoneNumber.setNumberOfLeadingZeros(i);
        }
    }

    private void parseHelper(java.lang.CharSequence charSequence, java.lang.String str, boolean z, boolean z2, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) throws com.google.i18n.phonenumbers.NumberParseException {
        int maybeExtractCountryCode;
        if (charSequence == null) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String obj = charSequence.toString();
        buildNationalNumberForParsing(obj, sb);
        if (!isViablePhoneNumber(sb)) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        if (z2 && !checkRegionForParsing(sb, str)) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (z) {
            phoneNumber.setRawInput(obj);
        }
        java.lang.String maybeStripExtension = maybeStripExtension(sb);
        if (maybeStripExtension.length() > 0) {
            phoneNumber.setExtension(maybeStripExtension);
        }
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        try {
            maybeExtractCountryCode = maybeExtractCountryCode(sb, metadataForRegion, sb2, z, phoneNumber);
        } catch (com.google.i18n.phonenumbers.NumberParseException e) {
            java.util.regex.Matcher matcher = PLUS_CHARS_PATTERN.matcher(sb);
            if (e.getErrorType() == com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                maybeExtractCountryCode = maybeExtractCountryCode(sb.substring(matcher.end()), metadataForRegion, sb2, z, phoneNumber);
                if (maybeExtractCountryCode == 0) {
                    throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                }
            } else {
                throw new com.google.i18n.phonenumbers.NumberParseException(e.getErrorType(), e.getMessage());
            }
        }
        if (maybeExtractCountryCode != 0) {
            java.lang.String regionCodeForCountryCode = getRegionCodeForCountryCode(maybeExtractCountryCode);
            if (!regionCodeForCountryCode.equals(str)) {
                metadataForRegion = getMetadataForRegionOrCallingCode(maybeExtractCountryCode, regionCodeForCountryCode);
            }
        } else {
            sb2.append((java.lang.CharSequence) normalize(sb));
            if (str != null) {
                phoneNumber.setCountryCode(metadataForRegion.getCountryCode());
            } else if (z) {
                phoneNumber.clearCountryCodeSource();
            }
        }
        if (sb2.length() < 2) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (metadataForRegion != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb2);
            maybeStripNationalPrefixAndCarrierCode(sb4, metadataForRegion, sb3);
            com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult testNumberLength = testNumberLength(sb4, metadataForRegion);
            if (testNumberLength != com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_SHORT && testNumberLength != com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE_LOCAL_ONLY && testNumberLength != com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH) {
                if (z && sb3.length() > 0) {
                    phoneNumber.setPreferredDomesticCarrierCode(sb3.toString());
                }
                sb2 = sb4;
            }
        }
        int length = sb2.length();
        if (length < 2) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        setItalianLeadingZerosForPhoneNumber(sb2, phoneNumber);
        phoneNumber.setNationalNumber(java.lang.Long.parseLong(sb2.toString()));
    }

    private java.lang.String extractPhoneContext(java.lang.String str, int i) {
        if (i == -1) {
            return null;
        }
        int i2 = i + 15;
        if (i2 >= str.length()) {
            return "";
        }
        int indexOf = str.indexOf(59, i2);
        if (indexOf != -1) {
            return str.substring(i2, indexOf);
        }
        return str.substring(i2);
    }

    private boolean isPhoneContextValid(java.lang.String str) {
        if (str == null) {
            return true;
        }
        if (str.length() == 0) {
            return false;
        }
        return RFC3966_GLOBAL_NUMBER_DIGITS_PATTERN.matcher(str).matches() || RFC3966_DOMAINNAME_PATTERN.matcher(str).matches();
    }

    private void buildNationalNumberForParsing(java.lang.String str, java.lang.StringBuilder sb) throws com.google.i18n.phonenumbers.NumberParseException {
        int indexOf = str.indexOf(RFC3966_PHONE_CONTEXT);
        java.lang.String extractPhoneContext = extractPhoneContext(str, indexOf);
        if (!isPhoneContextValid(extractPhoneContext)) {
            throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (extractPhoneContext != null) {
            if (extractPhoneContext.charAt(0) == '+') {
                sb.append(extractPhoneContext);
            }
            int indexOf2 = str.indexOf(RFC3966_PREFIX);
            sb.append(str.substring(indexOf2 >= 0 ? indexOf2 + 4 : 0, indexOf));
        } else {
            sb.append(extractPossibleNumber(str));
        }
        int indexOf3 = sb.indexOf(RFC3966_ISDN_SUBADDRESS);
        if (indexOf3 > 0) {
            sb.delete(indexOf3, sb.length());
        }
    }

    private static com.google.i18n.phonenumbers.Phonenumber.PhoneNumber copyCoreFieldsOnly(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
        phoneNumber2.setCountryCode(phoneNumber.getCountryCode());
        phoneNumber2.setNationalNumber(phoneNumber.getNationalNumber());
        if (phoneNumber.getExtension().length() > 0) {
            phoneNumber2.setExtension(phoneNumber.getExtension());
        }
        if (phoneNumber.isItalianLeadingZero()) {
            phoneNumber2.setItalianLeadingZero(true);
            phoneNumber2.setNumberOfLeadingZeros(phoneNumber.getNumberOfLeadingZeros());
        }
        return phoneNumber2;
    }

    public com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2) {
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber copyCoreFieldsOnly = copyCoreFieldsOnly(phoneNumber);
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber copyCoreFieldsOnly2 = copyCoreFieldsOnly(phoneNumber2);
        if (copyCoreFieldsOnly.hasExtension() && copyCoreFieldsOnly2.hasExtension() && !copyCoreFieldsOnly.getExtension().equals(copyCoreFieldsOnly2.getExtension())) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NO_MATCH;
        }
        int countryCode = copyCoreFieldsOnly.getCountryCode();
        int countryCode2 = copyCoreFieldsOnly2.getCountryCode();
        if (countryCode != 0 && countryCode2 != 0) {
            if (copyCoreFieldsOnly.exactlySameAs(copyCoreFieldsOnly2)) {
                return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.EXACT_MATCH;
            }
            if (countryCode == countryCode2 && isNationalNumberSuffixOfTheOther(copyCoreFieldsOnly, copyCoreFieldsOnly2)) {
                return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH;
            }
            return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NO_MATCH;
        }
        copyCoreFieldsOnly.setCountryCode(countryCode2);
        if (copyCoreFieldsOnly.exactlySameAs(copyCoreFieldsOnly2)) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NSN_MATCH;
        }
        if (isNationalNumberSuffixOfTheOther(copyCoreFieldsOnly, copyCoreFieldsOnly2)) {
            return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH;
        }
        return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NO_MATCH;
    }

    private boolean isNationalNumberSuffixOfTheOther(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2) {
        java.lang.String valueOf = java.lang.String.valueOf(phoneNumber.getNationalNumber());
        java.lang.String valueOf2 = java.lang.String.valueOf(phoneNumber2.getNationalNumber());
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }

    public com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        try {
            return isNumberMatch(parse(charSequence, UNKNOWN_REGION), charSequence2);
        } catch (com.google.i18n.phonenumbers.NumberParseException e) {
            if (e.getErrorType() == com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                try {
                    return isNumberMatch(parse(charSequence2, UNKNOWN_REGION), charSequence);
                } catch (com.google.i18n.phonenumbers.NumberParseException e2) {
                    if (e2.getErrorType() == com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                        try {
                            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
                            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
                            parseHelper(charSequence, null, false, false, phoneNumber);
                            parseHelper(charSequence2, null, false, false, phoneNumber2);
                            return isNumberMatch(phoneNumber, phoneNumber2);
                        } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
                            return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NOT_A_NUMBER;
                        }
                    }
                    return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NOT_A_NUMBER;
                }
            }
            return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NOT_A_NUMBER;
        }
    }

    public com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.CharSequence charSequence) {
        try {
            return isNumberMatch(phoneNumber, parse(charSequence, UNKNOWN_REGION));
        } catch (com.google.i18n.phonenumbers.NumberParseException e) {
            if (e.getErrorType() == com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                java.lang.String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
                try {
                    if (!regionCodeForCountryCode.equals(UNKNOWN_REGION)) {
                        com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch = isNumberMatch(phoneNumber, parse(charSequence, regionCodeForCountryCode));
                        return isNumberMatch == com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.EXACT_MATCH ? com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NSN_MATCH : isNumberMatch;
                    }
                    com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber();
                    parseHelper(charSequence, null, false, false, phoneNumber2);
                    return isNumberMatch(phoneNumber, phoneNumber2);
                } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
                    return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NOT_A_NUMBER;
                }
            }
            return com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NOT_A_NUMBER;
        }
    }

    public boolean canBeInternationallyDialled(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        if (getMetadataForRegion(getRegionCodeForNumber(phoneNumber)) == null) {
            return true;
        }
        return !isNumberMatchingDesc(getNationalSignificantNumber(phoneNumber), r0.getNoInternationalDialling());
    }

    public boolean isMobileNumberPortableRegion(java.lang.String str) {
        com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion == null) {
            logger.log(java.util.logging.Level.WARNING, "Invalid or unknown region code provided: ".concat(java.lang.String.valueOf(str)));
            return false;
        }
        return metadataForRegion.getMobileNumberPortableRegion();
    }
}
