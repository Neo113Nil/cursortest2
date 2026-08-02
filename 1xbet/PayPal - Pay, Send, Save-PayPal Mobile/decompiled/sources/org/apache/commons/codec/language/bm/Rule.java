package org.apache.commons.codec.language.bm;

/* loaded from: classes17.dex */
public class Rule {
    public static final java.lang.String ALL = "ALL";
    private final org.apache.commons.codec.language.bm.Rule.PhonemeExpr getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final org.apache.commons.codec.language.bm.Rule.RPattern getHighSpeedVideoFpsRangesFor;
    private final org.apache.commons.codec.language.bm.Rule.RPattern getInputSizeshNQ4ISI;
    public static final org.apache.commons.codec.language.bm.Rule.RPattern ALL_STRINGS_RMATCHER = new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda11
        @Override // org.apache.commons.codec.language.bm.Rule.RPattern
        public final boolean isMatch(java.lang.CharSequence charSequence) {
            return org.apache.commons.codec.language.bm.Rule.Camera2StreamConfigurationMap();
        }
    };
    private static final int getHighSpeedVideoSizes = 8;
    private static final java.util.Map<org.apache.commons.codec.language.bm.NameType, java.util.Map<org.apache.commons.codec.language.bm.RuleType, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>>>>> Camera2StreamConfigurationMap = new java.util.EnumMap(org.apache.commons.codec.language.bm.NameType.class);

    public interface PhonemeExpr {
        java.lang.Iterable<org.apache.commons.codec.language.bm.Rule.Phoneme> getPhonemes();
    }

    public interface RPattern {
        boolean isMatch(java.lang.CharSequence charSequence);
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap() {
        return true;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(char c, int i) {
        return i == c;
    }

    public static final class Phoneme implements org.apache.commons.codec.language.bm.Rule.PhonemeExpr {
        public static final java.util.Comparator<org.apache.commons.codec.language.bm.Rule.Phoneme> COMPARATOR = new java.util.Comparator() { // from class: org.apache.commons.codec.language.bm.Rule$Phoneme$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return org.apache.commons.codec.language.bm.Rule.Phoneme.getHighSpeedVideoSizes((org.apache.commons.codec.language.bm.Rule.Phoneme) obj, (org.apache.commons.codec.language.bm.Rule.Phoneme) obj2);
            }
        };
        private final java.lang.StringBuilder Camera2StreamConfigurationMap;
        private final org.apache.commons.codec.language.bm.Languages.LanguageSet getHighResolutionOutputSizeshNQ4ISI;

        static /* synthetic */ int getHighSpeedVideoSizes(org.apache.commons.codec.language.bm.Rule.Phoneme phoneme, org.apache.commons.codec.language.bm.Rule.Phoneme phoneme2) {
            int length = phoneme.Camera2StreamConfigurationMap.length();
            int length2 = phoneme2.Camera2StreamConfigurationMap.length();
            for (int i = 0; i < length; i++) {
                if (i >= length2) {
                    return 1;
                }
                int charAt = phoneme.Camera2StreamConfigurationMap.charAt(i) - phoneme2.Camera2StreamConfigurationMap.charAt(i);
                if (charAt != 0) {
                    return charAt;
                }
            }
            return length < length2 ? -1 : 0;
        }

        public Phoneme(java.lang.CharSequence charSequence, org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            this.Camera2StreamConfigurationMap = new java.lang.StringBuilder(charSequence);
            this.getHighResolutionOutputSizeshNQ4ISI = languageSet;
        }

        public Phoneme(org.apache.commons.codec.language.bm.Rule.Phoneme phoneme, org.apache.commons.codec.language.bm.Rule.Phoneme phoneme2) {
            this(phoneme.Camera2StreamConfigurationMap, phoneme.getHighResolutionOutputSizeshNQ4ISI);
            this.Camera2StreamConfigurationMap.append((java.lang.CharSequence) phoneme2.Camera2StreamConfigurationMap);
        }

        public Phoneme(org.apache.commons.codec.language.bm.Rule.Phoneme phoneme, org.apache.commons.codec.language.bm.Rule.Phoneme phoneme2, org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            this(phoneme.Camera2StreamConfigurationMap, languageSet);
            this.Camera2StreamConfigurationMap.append((java.lang.CharSequence) phoneme2.Camera2StreamConfigurationMap);
        }

        public final org.apache.commons.codec.language.bm.Rule.Phoneme append(java.lang.CharSequence charSequence) {
            this.Camera2StreamConfigurationMap.append(charSequence);
            return this;
        }

        public final org.apache.commons.codec.language.bm.Languages.LanguageSet getLanguages() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public final java.lang.Iterable<org.apache.commons.codec.language.bm.Rule.Phoneme> getPhonemes() {
            return java.util.Collections.singleton(this);
        }

        public final java.lang.CharSequence getPhonemeText() {
            return this.Camera2StreamConfigurationMap;
        }

        @java.lang.Deprecated
        public final org.apache.commons.codec.language.bm.Rule.Phoneme join(org.apache.commons.codec.language.bm.Rule.Phoneme phoneme) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.Camera2StreamConfigurationMap.toString());
            sb.append(phoneme.Camera2StreamConfigurationMap.toString());
            return new org.apache.commons.codec.language.bm.Rule.Phoneme(sb.toString(), this.getHighResolutionOutputSizeshNQ4ISI.restrictTo(phoneme.getHighResolutionOutputSizeshNQ4ISI));
        }

        public final org.apache.commons.codec.language.bm.Rule.Phoneme mergeWithLanguage(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            return new org.apache.commons.codec.language.bm.Rule.Phoneme(this.Camera2StreamConfigurationMap.toString(), this.getHighResolutionOutputSizeshNQ4ISI.merge(languageSet));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.Camera2StreamConfigurationMap.toString());
            sb.append("[");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("]");
            return sb.toString();
        }
    }

    public static final class PhonemeList implements org.apache.commons.codec.language.bm.Rule.PhonemeExpr {
        private final java.util.List<org.apache.commons.codec.language.bm.Rule.Phoneme> getHighResolutionOutputSizeshNQ4ISI;

        public PhonemeList(java.util.List<org.apache.commons.codec.language.bm.Rule.Phoneme> list) {
            this.getHighResolutionOutputSizeshNQ4ISI = list;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public final java.util.List<org.apache.commons.codec.language.bm.Rule.Phoneme> getPhonemes() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    static {
        for (final org.apache.commons.codec.language.bm.NameType nameType : org.apache.commons.codec.language.bm.NameType.values()) {
            java.util.EnumMap enumMap = new java.util.EnumMap(org.apache.commons.codec.language.bm.RuleType.class);
            for (final org.apache.commons.codec.language.bm.RuleType ruleType : org.apache.commons.codec.language.bm.RuleType.values()) {
                final java.util.HashMap hashMap = new java.util.HashMap();
                org.apache.commons.codec.language.bm.Languages.getInstance(nameType).getLanguages().forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        org.apache.commons.codec.language.bm.Rule.getHighSpeedVideoFpsRanges(org.apache.commons.codec.language.bm.NameType.this, ruleType, hashMap, (java.lang.String) obj);
                    }
                });
                if (!ruleType.equals(org.apache.commons.codec.language.bm.RuleType.RULES)) {
                    java.util.Scanner scanner = new java.util.Scanner(org.apache.commons.codec.Resources.getInputStream(Camera2StreamConfigurationMap(nameType, ruleType, "common")), org.apache.commons.codec.language.bm.ResourceConstants.getHighSpeedVideoFpsRanges);
                    try {
                        hashMap.put("common", getHighSpeedVideoSizes(scanner, Camera2StreamConfigurationMap(nameType, ruleType, "common")));
                        scanner.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            scanner.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                enumMap.put((java.util.EnumMap) ruleType, (org.apache.commons.codec.language.bm.RuleType) java.util.Collections.unmodifiableMap(hashMap));
            }
            Camera2StreamConfigurationMap.put(nameType, java.util.Collections.unmodifiableMap(enumMap));
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, java.lang.String str) {
        return java.lang.String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", nameType.getName(), ruleType.getName(), str);
    }

    public static java.util.List<org.apache.commons.codec.language.bm.Rule> getInstance(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
        java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> instanceMap = getInstanceMap(nameType, ruleType, languageSet);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        instanceMap.values().forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                arrayList.addAll((java.util.List) obj);
            }
        });
        return arrayList;
    }

    public static java.util.List<org.apache.commons.codec.language.bm.Rule> getInstance(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, java.lang.String str) {
        return getInstance(nameType, ruleType, org.apache.commons.codec.language.bm.Languages.LanguageSet.from(new java.util.HashSet(java.util.Arrays.asList(str))));
    }

    public static java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> getInstanceMap(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
        return languageSet.isSingleton() ? getInstanceMap(nameType, ruleType, languageSet.getAny()) : getInstanceMap(nameType, ruleType, "any");
    }

    public static java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> getInstanceMap(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, java.lang.String str) {
        java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> map = Camera2StreamConfigurationMap.get(nameType).get(ruleType).get(str);
        if (map != null) {
            return map;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("No rules found for %s, %s, %s.", nameType.getName(), ruleType.getName(), str));
    }

    private static org.apache.commons.codec.language.bm.Rule.Phoneme getHighSpeedVideoFpsRanges(java.lang.String str) {
        int indexOf = str.indexOf("[");
        if (indexOf >= 0) {
            if (!str.endsWith("]")) {
                throw new java.lang.IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
            }
            return new org.apache.commons.codec.language.bm.Rule.Phoneme(str.substring(0, indexOf), org.apache.commons.codec.language.bm.Languages.LanguageSet.from(new java.util.HashSet(java.util.Arrays.asList(str.substring(indexOf + 1, str.length() - 1).split("[+]")))));
        }
        return new org.apache.commons.codec.language.bm.Rule.Phoneme(str, org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE);
    }

    private static java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> getHighSpeedVideoSizes(java.util.Scanner scanner, java.lang.String str) {
        java.lang.String str2;
        int i;
        java.lang.String highSpeedVideoFpsRangesFor;
        java.lang.String highSpeedVideoFpsRangesFor2;
        java.lang.String highSpeedVideoFpsRangesFor3;
        org.apache.commons.codec.language.bm.Rule.PhonemeExpr highSpeedVideoFpsRanges;
        int i2;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (scanner.hasNextLine()) {
            int i6 = i4 + 1;
            java.lang.String nextLine = scanner.nextLine();
            if (i5 != 0) {
                if (nextLine.endsWith("*/")) {
                    i = i6;
                    i2 = i3;
                    i5 = i2;
                }
                i = i6;
                i2 = i3;
            } else if (nextLine.startsWith("/*")) {
                i = i6;
                i2 = i3;
                i5 = 1;
            } else {
                int indexOf = nextLine.indexOf("//");
                java.lang.String trim = (indexOf >= 0 ? nextLine.substring(i3, indexOf) : nextLine).trim();
                if (!trim.isEmpty()) {
                    if (trim.startsWith("#include")) {
                        java.lang.String trim2 = trim.substring(getHighSpeedVideoSizes).trim();
                        if (trim2.contains(" ")) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Malformed import statement '");
                            sb.append(nextLine);
                            sb.append("' in ");
                            sb.append(str);
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        java.util.Scanner scanner2 = new java.util.Scanner(org.apache.commons.codec.Resources.getInputStream(java.lang.String.format("org/apache/commons/codec/language/bm/%s.txt", trim2)), org.apache.commons.codec.language.bm.ResourceConstants.getHighSpeedVideoFpsRanges);
                        try {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(str);
                            sb2.append("->");
                            sb2.append(trim2);
                            hashMap.putAll(getHighSpeedVideoSizes(scanner2, sb2.toString()));
                            scanner2.close();
                        } finally {
                        }
                    } else {
                        java.lang.String[] split = trim.split("\\s+");
                        if (split.length != 4) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Malformed rule statement split into ");
                            sb3.append(split.length);
                            sb3.append(" parts: ");
                            sb3.append(nextLine);
                            sb3.append(" in ");
                            sb3.append(str);
                            throw new java.lang.IllegalArgumentException(sb3.toString());
                        }
                        try {
                            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(split[i3]);
                            highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(split[1]);
                            highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(split[2]);
                            java.lang.String highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(split[3]);
                            if (highSpeedVideoFpsRangesFor4.startsWith("(")) {
                                if (!highSpeedVideoFpsRangesFor4.endsWith(")")) {
                                    throw new java.lang.IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
                                }
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.String substring = highSpeedVideoFpsRangesFor4.substring(1, highSpeedVideoFpsRangesFor4.length() - 1);
                                java.lang.String[] split2 = substring.split("[|]");
                                int length = split2.length;
                                for (int i7 = i3; i7 < length; i7++) {
                                    arrayList.add(getHighSpeedVideoFpsRanges(split2[i7]));
                                }
                                if (substring.startsWith(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER) || substring.endsWith(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER)) {
                                    arrayList.add(new org.apache.commons.codec.language.bm.Rule.Phoneme("", org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE));
                                }
                                highSpeedVideoFpsRanges = new org.apache.commons.codec.language.bm.Rule.PhonemeList(arrayList);
                            } else {
                                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor4);
                            }
                            str2 = "' in ";
                            i = i6;
                        } catch (java.lang.IllegalArgumentException e) {
                            e = e;
                            str2 = "' in ";
                            i = i6;
                        }
                        try {
                            org.apache.commons.codec.language.bm.Rule rule = new org.apache.commons.codec.language.bm.Rule(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRanges, i6, str, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor3) { // from class: org.apache.commons.codec.language.bm.Rule.1
                                final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
                                final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
                                final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
                                final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
                                final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
                                private final java.lang.String getHighSpeedVideoSizesFor;
                                private final int getInputFormats;

                                {
                                    this.getHighSpeedVideoFpsRangesFor = i6;
                                    this.getHighSpeedVideoSizes = str;
                                    this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
                                    this.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor2;
                                    this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor3;
                                    this.getInputFormats = i6;
                                    this.getHighSpeedVideoSizesFor = str;
                                }

                                public java.lang.String toString() {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Rule{line=");
                                    sb4.append(this.getInputFormats);
                                    sb4.append(", loc='");
                                    sb4.append(this.getHighSpeedVideoSizesFor);
                                    sb4.append("', pat='");
                                    sb4.append(this.getHighSpeedVideoFpsRanges);
                                    sb4.append("', lcon='");
                                    sb4.append(this.Camera2StreamConfigurationMap);
                                    sb4.append("', rcon='");
                                    sb4.append(this.getHighResolutionOutputSizeshNQ4ISI);
                                    sb4.append("'}");
                                    return sb4.toString();
                                }
                            };
                            i2 = 0;
                            ((java.util.List) hashMap.computeIfAbsent(rule.getHighSpeedVideoFpsRanges.substring(0, 1), new java.util.function.Function() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda2
                                @Override // java.util.function.Function
                                public final java.lang.Object apply(java.lang.Object obj) {
                                    return org.apache.commons.codec.language.bm.Rule.getHighSpeedVideoFpsRanges();
                                }
                            })).add(rule);
                        } catch (java.lang.IllegalArgumentException e2) {
                            e = e2;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Problem parsing line '");
                            sb4.append(i);
                            sb4.append(str2);
                            sb4.append(str);
                            throw new java.lang.IllegalStateException(sb4.toString(), e);
                        }
                    }
                }
                i = i6;
                i2 = i3;
            }
            i3 = i2;
            i4 = i;
        }
        return hashMap;
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges() {
        return new java.util.ArrayList();
    }

    private static org.apache.commons.codec.language.bm.Rule.RPattern getHighSpeedVideoSizes(java.lang.String str) {
        boolean startsWith = str.startsWith("^");
        boolean endsWith = str.endsWith(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int length = str.length();
        if (endsWith) {
            length--;
        }
        final java.lang.String substring = str.substring(startsWith ? 1 : 0, length);
        if (substring.contains("[")) {
            boolean startsWith2 = substring.startsWith("[");
            boolean endsWith2 = substring.endsWith("]");
            if (startsWith2 && endsWith2) {
                final java.lang.String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains("[")) {
                    boolean startsWith3 = substring2.startsWith("^");
                    if (startsWith3) {
                        substring2 = substring2.substring(1);
                    }
                    final boolean z = !startsWith3;
                    if (startsWith && endsWith) {
                        return new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda7
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(java.lang.CharSequence charSequence) {
                                return org.apache.commons.codec.language.bm.Rule.getHighSpeedVideoFpsRangesFor(substring2, z, charSequence);
                            }
                        };
                    }
                    if (startsWith) {
                        return new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda8
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(java.lang.CharSequence charSequence) {
                                return org.apache.commons.codec.language.bm.Rule.Camera2StreamConfigurationMap(substring2, z, charSequence);
                            }
                        };
                    }
                    if (endsWith) {
                        return new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda9
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(java.lang.CharSequence charSequence) {
                                return org.apache.commons.codec.language.bm.Rule.getHighSpeedVideoFpsRanges(substring2, z, charSequence);
                            }
                        };
                    }
                }
            }
        } else {
            if (startsWith && endsWith) {
                if (substring.isEmpty()) {
                    return new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda3
                        @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                        public final boolean isMatch(java.lang.CharSequence charSequence) {
                            return org.apache.commons.codec.language.bm.Rule.getHighSpeedVideoFpsRangesFor(charSequence);
                        }
                    };
                }
                return new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda4
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(java.lang.CharSequence charSequence) {
                        boolean equals;
                        equals = charSequence.equals(substring);
                        return equals;
                    }
                };
            }
            if ((startsWith || endsWith) && substring.isEmpty()) {
                return ALL_STRINGS_RMATCHER;
            }
            if (startsWith) {
                return new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda5
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(java.lang.CharSequence charSequence) {
                        return org.apache.commons.codec.language.bm.Rule.getHighSpeedVideoSizes(substring, charSequence);
                    }
                };
            }
            if (endsWith) {
                return new org.apache.commons.codec.language.bm.Rule.RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda6
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(java.lang.CharSequence charSequence) {
                        return org.apache.commons.codec.language.bm.Rule.getHighSpeedVideoFpsRanges(substring, charSequence);
                    }
                };
            }
        }
        return new org.apache.commons.codec.language.bm.Rule.RPattern(str) { // from class: org.apache.commons.codec.language.bm.Rule.2
            final java.util.regex.Pattern Camera2StreamConfigurationMap;
            final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;

            {
                this.getHighSpeedVideoFpsRanges = str;
                this.Camera2StreamConfigurationMap = java.util.regex.Pattern.compile(str);
            }

            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
            public boolean isMatch(java.lang.CharSequence charSequence) {
                return this.Camera2StreamConfigurationMap.matcher(charSequence).find();
            }
        };
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, boolean z, java.lang.CharSequence charSequence) {
        if (charSequence.length() == 1) {
            if (str.chars().anyMatch(new org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda10(charSequence.charAt(0))) == z) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(java.lang.String str, boolean z, java.lang.CharSequence charSequence) {
        if (charSequence.length() > 0) {
            if (str.chars().anyMatch(new org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda10(charSequence.charAt(0))) == z) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(java.lang.String str, boolean z, java.lang.CharSequence charSequence) {
        if (charSequence.length() > 0) {
            return str.chars().anyMatch(new org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda10(charSequence.charAt(charSequence.length() - 1))) == z;
        }
        return false;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public Rule(java.lang.String str, java.lang.String str2, java.lang.String str3, org.apache.commons.codec.language.bm.Rule.PhonemeExpr phonemeExpr) {
        this.getHighSpeedVideoFpsRanges = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoSizes(sb.toString());
        this.getInputSizeshNQ4ISI = getHighSpeedVideoSizes("^".concat(java.lang.String.valueOf(str3)));
        this.getHighResolutionOutputSizeshNQ4ISI = phonemeExpr;
    }

    public org.apache.commons.codec.language.bm.Rule.RPattern getLContext() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getPattern() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.apache.commons.codec.language.bm.Rule.PhonemeExpr getPhoneme() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.apache.commons.codec.language.bm.Rule.RPattern getRContext() {
        return this.getInputSizeshNQ4ISI;
    }

    public boolean patternAndContextMatches(java.lang.CharSequence charSequence, int i) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int length = this.getHighSpeedVideoFpsRanges.length() + i;
        if (length <= charSequence.length() && charSequence.subSequence(i, length).equals(this.getHighSpeedVideoFpsRanges) && this.getInputSizeshNQ4ISI.isMatch(charSequence.subSequence(length, charSequence.length()))) {
            return this.getHighSpeedVideoFpsRangesFor.isMatch(charSequence.subSequence(0, i));
        }
        return false;
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(java.lang.String str, java.lang.CharSequence charSequence) {
        if (str.length() > charSequence.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charSequence.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.CharSequence charSequence) {
        int length = str.length();
        int length2 = charSequence.length();
        if (length > length2) {
            return false;
        }
        do {
            length2--;
            length--;
            if (length < 0) {
                return true;
            }
        } while (charSequence.charAt(length2) == str.charAt(length));
        return false;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, java.util.Map map, java.lang.String str) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(org.apache.commons.codec.Resources.getInputStream(Camera2StreamConfigurationMap(nameType, ruleType, str)), org.apache.commons.codec.language.bm.ResourceConstants.getHighSpeedVideoFpsRanges);
            try {
                map.put(str, getHighSpeedVideoSizes(scanner, Camera2StreamConfigurationMap(nameType, ruleType, str)));
                scanner.close();
            } finally {
            }
        } catch (java.lang.IllegalStateException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Problem processing ");
            sb.append(Camera2StreamConfigurationMap(nameType, ruleType, str));
            throw new java.lang.IllegalStateException(sb.toString(), e);
        }
    }
}
