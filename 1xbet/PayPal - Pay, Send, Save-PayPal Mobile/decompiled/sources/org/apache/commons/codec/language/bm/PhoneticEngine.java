package org.apache.commons.codec.language.bm;

/* loaded from: classes17.dex */
public class PhoneticEngine {
    private static final java.util.Map<org.apache.commons.codec.language.bm.NameType, java.util.Set<java.lang.String>> getHighSpeedVideoSizes;
    private final boolean Camera2StreamConfigurationMap;
    private final org.apache.commons.codec.language.bm.Lang getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    private final org.apache.commons.codec.language.bm.NameType getHighSpeedVideoFpsRangesFor;
    private final org.apache.commons.codec.language.bm.RuleType getOutputMinFrameDuration;

    static final class PhonemeBuilder {
        final java.util.Set<org.apache.commons.codec.language.bm.Rule.Phoneme> getHighSpeedVideoFpsRangesFor;

        /* synthetic */ PhonemeBuilder(java.util.Set set, byte b) {
            this((java.util.Set<org.apache.commons.codec.language.bm.Rule.Phoneme>) set);
        }

        public static org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder Camera2StreamConfigurationMap(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            return new org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder(new org.apache.commons.codec.language.bm.Rule.Phoneme("", languageSet));
        }

        private PhonemeBuilder(org.apache.commons.codec.language.bm.Rule.Phoneme phoneme) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            this.getHighSpeedVideoFpsRangesFor = linkedHashSet;
            linkedHashSet.add(phoneme);
        }

        private PhonemeBuilder(java.util.Set<org.apache.commons.codec.language.bm.Rule.Phoneme> set) {
            this.getHighSpeedVideoFpsRangesFor = set;
        }

        public final void getHighSpeedVideoSizes(org.apache.commons.codec.language.bm.Rule.PhonemeExpr phonemeExpr, int i) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(i);
            loop0: for (org.apache.commons.codec.language.bm.Rule.Phoneme phoneme : this.getHighSpeedVideoFpsRangesFor) {
                for (org.apache.commons.codec.language.bm.Rule.Phoneme phoneme2 : phonemeExpr.getPhonemes()) {
                    org.apache.commons.codec.language.bm.Languages.LanguageSet restrictTo = phoneme.getLanguages().restrictTo(phoneme2.getLanguages());
                    if (!restrictTo.isEmpty()) {
                        org.apache.commons.codec.language.bm.Rule.Phoneme phoneme3 = new org.apache.commons.codec.language.bm.Rule.Phoneme(phoneme, phoneme2, restrictTo);
                        if (linkedHashSet.size() < i) {
                            linkedHashSet.add(phoneme3);
                            if (linkedHashSet.size() >= i) {
                                break loop0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighSpeedVideoFpsRangesFor.addAll(linkedHashSet);
        }
    }

    static final class RulesApplication {
        boolean Camera2StreamConfigurationMap;
        private final java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder getHighSpeedVideoFpsRangesFor;
        private final java.lang.CharSequence getHighSpeedVideoSizes;
        private final int getOutputFormats;

        public RulesApplication(java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> map, java.lang.CharSequence charSequence, org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder phonemeBuilder, int i, int i2) {
            java.util.Objects.requireNonNull(map, "finalRules");
            this.getHighResolutionOutputSizeshNQ4ISI = map;
            this.getHighSpeedVideoFpsRangesFor = phonemeBuilder;
            this.getHighSpeedVideoSizes = charSequence;
            this.getHighSpeedVideoFpsRanges = i;
            this.getOutputFormats = i2;
        }

        public final org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication getHighSpeedVideoSizes() {
            int i;
            this.Camera2StreamConfigurationMap = false;
            java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> map = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.CharSequence charSequence = this.getHighSpeedVideoSizes;
            int i2 = this.getHighSpeedVideoFpsRanges;
            java.util.List<org.apache.commons.codec.language.bm.Rule> list = map.get(charSequence.subSequence(i2, i2 + 1));
            if (list != null) {
                java.util.Iterator<org.apache.commons.codec.language.bm.Rule> it = list.iterator();
                i = 1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    org.apache.commons.codec.language.bm.Rule next = it.next();
                    int length = next.getPattern().length();
                    if (next.patternAndContextMatches(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges)) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(next.getPhoneme(), this.getOutputFormats);
                        this.Camera2StreamConfigurationMap = true;
                        i = length;
                        break;
                    }
                    i = length;
                }
            } else {
                i = 1;
            }
            this.getHighSpeedVideoFpsRanges += this.Camera2StreamConfigurationMap ? i : 1;
            return this;
        }
    }

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(org.apache.commons.codec.language.bm.NameType.class);
        getHighSpeedVideoSizes = enumMap;
        enumMap.put((java.util.EnumMap) org.apache.commons.codec.language.bm.NameType.ASHKENAZI, (org.apache.commons.codec.language.bm.NameType) java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.libraries.places.api.model.PlaceTypes.BAR, "ben", "da", "de", "van", "von"))));
        enumMap.put((java.util.EnumMap) org.apache.commons.codec.language.bm.NameType.SEPHARDIC, (org.apache.commons.codec.language.bm.NameType) java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put((java.util.EnumMap) org.apache.commons.codec.language.bm.NameType.GENERIC, (org.apache.commons.codec.language.bm.NameType) java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }

    public PhoneticEngine(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, boolean z) {
        this(nameType, ruleType, z, 20);
    }

    public PhoneticEngine(org.apache.commons.codec.language.bm.NameType nameType, org.apache.commons.codec.language.bm.RuleType ruleType, boolean z, int i) {
        if (ruleType == org.apache.commons.codec.language.bm.RuleType.RULES) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ruleType must not be ");
            sb.append(org.apache.commons.codec.language.bm.RuleType.RULES);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = nameType;
        this.getOutputMinFrameDuration = ruleType;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = org.apache.commons.codec.language.bm.Lang.instance(nameType);
        this.getHighSpeedVideoFpsRanges = i;
    }

    private org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder getHighSpeedVideoFpsRangesFor(org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder phonemeBuilder, final java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> map) {
        java.util.Objects.requireNonNull(map, "finalRules");
        if (map.isEmpty()) {
            return phonemeBuilder;
        }
        final java.util.TreeMap treeMap = new java.util.TreeMap(org.apache.commons.codec.language.bm.Rule.Phoneme.COMPARATOR);
        phonemeBuilder.getHighSpeedVideoFpsRangesFor.forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                org.apache.commons.codec.language.bm.PhoneticEngine phoneticEngine = org.apache.commons.codec.language.bm.PhoneticEngine.this;
                java.util.Map map2 = map;
                final java.util.Map map3 = treeMap;
                org.apache.commons.codec.language.bm.Rule.Phoneme phoneme = (org.apache.commons.codec.language.bm.Rule.Phoneme) obj;
                org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder Camera2StreamConfigurationMap = org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.Camera2StreamConfigurationMap(phoneme.getLanguages());
                java.lang.String obj2 = phoneme.getPhonemeText().toString();
                org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder phonemeBuilder2 = Camera2StreamConfigurationMap;
                int i = 0;
                while (i < obj2.length()) {
                    org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication highSpeedVideoSizes = new org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication(map2, obj2, phonemeBuilder2, i, phoneticEngine.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizes();
                    boolean z = highSpeedVideoSizes.Camera2StreamConfigurationMap;
                    phonemeBuilder2 = highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                    if (!z) {
                        final java.lang.CharSequence subSequence = obj2.subSequence(i, i + 1);
                        phonemeBuilder2.getHighSpeedVideoFpsRangesFor.forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder$$ExternalSyntheticLambda1
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj3) {
                                ((org.apache.commons.codec.language.bm.Rule.Phoneme) obj3).append(subSequence);
                            }
                        });
                    }
                    i = highSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                }
                phonemeBuilder2.getHighSpeedVideoFpsRangesFor.forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda2
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj3) {
                        org.apache.commons.codec.language.bm.PhoneticEngine.getHighSpeedVideoFpsRangesFor(map3, (org.apache.commons.codec.language.bm.Rule.Phoneme) obj3);
                    }
                });
            }
        });
        return new org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder(treeMap.keySet(), (byte) 0);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.Map map, org.apache.commons.codec.language.bm.Rule.Phoneme phoneme) {
        if (map.containsKey(phoneme)) {
            org.apache.commons.codec.language.bm.Rule.Phoneme mergeWithLanguage = ((org.apache.commons.codec.language.bm.Rule.Phoneme) map.remove(phoneme)).mergeWithLanguage(phoneme.getLanguages());
            map.put(mergeWithLanguage, mergeWithLanguage);
        } else {
            map.put(phoneme, phoneme);
        }
    }

    public java.lang.String encode(java.lang.String str) {
        return encode(str, this.getHighResolutionOutputSizeshNQ4ISI.guessLanguages(str));
    }

    public java.lang.String encode(java.lang.String str, org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
        java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> instanceMap = org.apache.commons.codec.language.bm.Rule.getInstanceMap(this.getHighSpeedVideoFpsRangesFor, org.apache.commons.codec.language.bm.RuleType.RULES, languageSet);
        java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> instanceMap2 = org.apache.commons.codec.language.bm.Rule.getInstanceMap(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, "common");
        java.util.Map<java.lang.String, java.util.List<org.apache.commons.codec.language.bm.Rule>> instanceMap3 = org.apache.commons.codec.language.bm.Rule.getInstanceMap(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, languageSet);
        java.lang.String trim = str.toLowerCase(java.util.Locale.ENGLISH).replace('-', ' ').trim();
        if (this.getHighSpeedVideoFpsRangesFor == org.apache.commons.codec.language.bm.NameType.GENERIC) {
            if (trim.startsWith("d'")) {
                java.lang.String substring = trim.substring(2);
                java.lang.String concat = "d".concat(java.lang.String.valueOf(substring));
                java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
                sb.append(encode(substring));
                sb.append(")-(");
                sb.append(encode(concat));
                sb.append(")");
                return sb.toString();
            }
            for (java.lang.String str2 : getHighSpeedVideoSizes.get(this.getHighSpeedVideoFpsRangesFor)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(" ");
                if (trim.startsWith(sb2.toString())) {
                    java.lang.String substring2 = trim.substring(str2.length() + 1);
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(str2);
                    sb3.append(substring2);
                    java.lang.String obj = sb3.toString();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("(");
                    sb4.append(encode(substring2));
                    sb4.append(")-(");
                    sb4.append(encode(obj));
                    sb4.append(")");
                    return sb4.toString();
                }
            }
        }
        java.util.List asList = java.util.Arrays.asList(trim.split("\\s+"));
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = org.apache.commons.codec.language.bm.PhoneticEngine.AnonymousClass1.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRangesFor.ordinal()];
        if (i == 1) {
            asList.forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj2) {
                    java.lang.String str3 = (java.lang.String) obj2;
                    arrayList.add(str3.split("'", -1)[str3.length - 1]);
                }
            });
            arrayList.removeAll(getHighSpeedVideoSizes.get(this.getHighSpeedVideoFpsRangesFor));
        } else if (i == 2) {
            arrayList.addAll(asList);
            arrayList.removeAll(getHighSpeedVideoSizes.get(this.getHighSpeedVideoFpsRangesFor));
        } else if (i == 3) {
            arrayList.addAll(asList);
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Unreachable case: ");
            sb5.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IllegalStateException(sb5.toString());
        }
        if (!this.Camera2StreamConfigurationMap) {
            if (arrayList.size() == 1) {
                trim = (java.lang.String) asList.iterator().next();
            } else if (!arrayList.isEmpty()) {
                final java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                arrayList.forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.PhoneticEngine$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj2) {
                        org.apache.commons.codec.language.bm.PhoneticEngine phoneticEngine = org.apache.commons.codec.language.bm.PhoneticEngine.this;
                        java.lang.StringBuilder sb7 = sb6;
                        sb7.append("-");
                        sb7.append(phoneticEngine.encode((java.lang.String) obj2));
                    }
                });
                return sb6.substring(1);
            }
        } else {
            trim = (java.lang.String) arrayList.stream().collect(java.util.stream.Collectors.joining(" "));
        }
        org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder Camera2StreamConfigurationMap = org.apache.commons.codec.language.bm.PhoneticEngine.PhonemeBuilder.Camera2StreamConfigurationMap(languageSet);
        int i2 = 0;
        while (i2 < trim.length()) {
            org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication highSpeedVideoSizes = new org.apache.commons.codec.language.bm.PhoneticEngine.RulesApplication(instanceMap, trim, Camera2StreamConfigurationMap, i2, this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizes();
            i2 = highSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        }
        return (java.lang.String) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap, instanceMap2), instanceMap3).getHighSpeedVideoFpsRangesFor.stream().map(new java.util.function.Function() { // from class: org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                return ((org.apache.commons.codec.language.bm.Rule.Phoneme) obj2).getPhonemeText();
            }
        }).collect(java.util.stream.Collectors.joining(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER));
    }

    /* renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.apache.commons.codec.language.bm.NameType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.apache.commons.codec.language.bm.NameType.SEPHARDIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[org.apache.commons.codec.language.bm.NameType.ASHKENAZI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[org.apache.commons.codec.language.bm.NameType.GENERIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public org.apache.commons.codec.language.bm.Lang getLang() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getMaxPhonemes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.apache.commons.codec.language.bm.NameType getNameType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.apache.commons.codec.language.bm.RuleType getRuleType() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isConcat() {
        return this.Camera2StreamConfigurationMap;
    }
}
