package org.apache.commons.codec.language.bm;

/* loaded from: classes17.dex */
public class Lang {
    private static final java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Lang> getHighSpeedVideoSizes = new java.util.EnumMap(org.apache.commons.codec.language.bm.NameType.class);
    private final java.util.List<org.apache.commons.codec.language.bm.Lang.LangRule> Camera2StreamConfigurationMap;
    private final org.apache.commons.codec.language.bm.Languages getHighSpeedVideoFpsRangesFor;

    static final class LangRule {
        private final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
        final java.util.regex.Pattern getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoFpsRangesFor;

        /* synthetic */ LangRule(java.util.regex.Pattern pattern, java.util.Set set, boolean z, byte b) {
            this(pattern, set, z);
        }

        private LangRule(java.util.regex.Pattern pattern, java.util.Set<java.lang.String> set, boolean z) {
            this.getHighSpeedVideoFpsRanges = pattern;
            this.Camera2StreamConfigurationMap = set;
            this.getHighSpeedVideoFpsRangesFor = z;
        }
    }

    static {
        for (org.apache.commons.codec.language.bm.NameType nameType : org.apache.commons.codec.language.bm.NameType.values()) {
            getHighSpeedVideoSizes.put(nameType, loadFromResource(java.lang.String.format("org/apache/commons/codec/language/bm/%s_lang.txt", nameType.getName()), org.apache.commons.codec.language.bm.Languages.getInstance(nameType)));
        }
    }

    public static org.apache.commons.codec.language.bm.Lang instance(org.apache.commons.codec.language.bm.NameType nameType) {
        return getHighSpeedVideoSizes.get(nameType);
    }

    public static org.apache.commons.codec.language.bm.Lang loadFromResource(java.lang.String str, org.apache.commons.codec.language.bm.Languages languages) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Scanner scanner = new java.util.Scanner(org.apache.commons.codec.Resources.getInputStream(str), org.apache.commons.codec.language.bm.ResourceConstants.getHighSpeedVideoFpsRanges);
        while (true) {
            byte b = 0;
            boolean z = false;
            while (scanner.hasNextLine()) {
                try {
                    java.lang.String nextLine = scanner.nextLine();
                    if (z) {
                        if (nextLine.endsWith("*/")) {
                            break;
                        }
                    } else if (nextLine.startsWith("/*")) {
                        z = true;
                    } else {
                        int indexOf = nextLine.indexOf("//");
                        java.lang.String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                        if (!trim.isEmpty()) {
                            java.lang.String[] split = trim.split("\\s+");
                            if (split.length != 3) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("Malformed line '");
                                sb.append(nextLine);
                                sb.append("' in language resource '");
                                sb.append(str);
                                sb.append("'");
                                throw new java.lang.IllegalArgumentException(sb.toString());
                            }
                            arrayList.add(new org.apache.commons.codec.language.bm.Lang.LangRule(java.util.regex.Pattern.compile(split[0]), new java.util.HashSet(java.util.Arrays.asList(split[1].split("\\+"))), split[2].equals("true"), b));
                        }
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        scanner.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            scanner.close();
            return new org.apache.commons.codec.language.bm.Lang(arrayList, languages);
        }
    }

    private Lang(java.util.List<org.apache.commons.codec.language.bm.Lang.LangRule> list, org.apache.commons.codec.language.bm.Languages languages) {
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(list);
        this.getHighSpeedVideoFpsRangesFor = languages;
    }

    public java.lang.String guessLanguage(java.lang.String str) {
        org.apache.commons.codec.language.bm.Languages.LanguageSet guessLanguages = guessLanguages(str);
        return guessLanguages.isSingleton() ? guessLanguages.getAny() : "any";
    }

    public org.apache.commons.codec.language.bm.Languages.LanguageSet guessLanguages(java.lang.String str) {
        final java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ENGLISH);
        final java.util.HashSet hashSet = new java.util.HashSet(this.getHighSpeedVideoFpsRangesFor.getLanguages());
        this.Camera2StreamConfigurationMap.forEach(new java.util.function.Consumer() { // from class: org.apache.commons.codec.language.bm.Lang$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                org.apache.commons.codec.language.bm.Lang.getHighSpeedVideoSizes(lowerCase, hashSet, (org.apache.commons.codec.language.bm.Lang.LangRule) obj);
            }
        });
        org.apache.commons.codec.language.bm.Languages.LanguageSet from = org.apache.commons.codec.language.bm.Languages.LanguageSet.from(hashSet);
        return from.equals(org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES) ? org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE : from;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(java.lang.String str, java.util.Set set, org.apache.commons.codec.language.bm.Lang.LangRule langRule) {
        if (langRule.getHighSpeedVideoFpsRanges.matcher(str).find()) {
            if (langRule.getHighSpeedVideoFpsRangesFor) {
                set.retainAll(langRule.Camera2StreamConfigurationMap);
            } else {
                set.removeAll(langRule.Camera2StreamConfigurationMap);
            }
        }
    }
}
