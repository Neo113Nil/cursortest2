package org.apache.commons.codec.language.bm;

/* loaded from: classes17.dex */
public class Languages {
    public static final java.lang.String ANY = "any";
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<org.apache.commons.codec.language.bm.NameType, org.apache.commons.codec.language.bm.Languages> getHighResolutionOutputSizeshNQ4ISI = new java.util.EnumMap(org.apache.commons.codec.language.bm.NameType.class);
    public static final org.apache.commons.codec.language.bm.Languages.LanguageSet NO_LANGUAGES = new org.apache.commons.codec.language.bm.Languages.LanguageSet() { // from class: org.apache.commons.codec.language.bm.Languages.1
        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean contains(java.lang.String str) {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isEmpty() {
            return true;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isSingleton() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public org.apache.commons.codec.language.bm.Languages.LanguageSet merge(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            return languageSet;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public org.apache.commons.codec.language.bm.Languages.LanguageSet restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            return this;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public java.lang.String getAny() {
            throw new java.util.NoSuchElementException("Can't fetch any language from the empty language set.");
        }

        public java.lang.String toString() {
            return "NO_LANGUAGES";
        }
    };
    public static final org.apache.commons.codec.language.bm.Languages.LanguageSet ANY_LANGUAGE = new org.apache.commons.codec.language.bm.Languages.LanguageSet() { // from class: org.apache.commons.codec.language.bm.Languages.2
        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean contains(java.lang.String str) {
            return true;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isEmpty() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isSingleton() {
            return false;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public org.apache.commons.codec.language.bm.Languages.LanguageSet merge(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            return languageSet;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public org.apache.commons.codec.language.bm.Languages.LanguageSet restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            return languageSet;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public java.lang.String getAny() {
            throw new java.util.NoSuchElementException("Can't fetch any language from the any language set.");
        }

        public java.lang.String toString() {
            return "ANY_LANGUAGE";
        }
    };

    public static abstract class LanguageSet {
        public abstract boolean contains(java.lang.String str);

        public abstract java.lang.String getAny();

        public abstract boolean isEmpty();

        public abstract boolean isSingleton();

        abstract org.apache.commons.codec.language.bm.Languages.LanguageSet merge(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet);

        public abstract org.apache.commons.codec.language.bm.Languages.LanguageSet restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet);

        public static org.apache.commons.codec.language.bm.Languages.LanguageSet from(java.util.Set<java.lang.String> set) {
            return set.isEmpty() ? org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES : new org.apache.commons.codec.language.bm.Languages.SomeLanguages(set, (byte) 0);
        }
    }

    public static final class SomeLanguages extends org.apache.commons.codec.language.bm.Languages.LanguageSet {
        private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;

        /* synthetic */ SomeLanguages(java.util.Set set, byte b) {
            this(set);
        }

        private SomeLanguages(java.util.Set<java.lang.String> set) {
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableSet(set);
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public final boolean contains(java.lang.String str) {
            return this.getHighSpeedVideoFpsRangesFor.contains(str);
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public final java.lang.String getAny() {
            return this.getHighSpeedVideoFpsRangesFor.iterator().next();
        }

        public final java.util.Set<java.lang.String> getLanguages() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRangesFor.isEmpty();
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public final boolean isSingleton() {
            return this.getHighSpeedVideoFpsRangesFor.size() == 1;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public final org.apache.commons.codec.language.bm.Languages.LanguageSet merge(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            if (languageSet == org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES) {
                return this;
            }
            if (languageSet == org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE) {
                return languageSet;
            }
            java.util.HashSet hashSet = new java.util.HashSet(this.getHighSpeedVideoFpsRangesFor);
            hashSet.addAll(((org.apache.commons.codec.language.bm.Languages.SomeLanguages) languageSet).getHighSpeedVideoFpsRangesFor);
            return from(hashSet);
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public final org.apache.commons.codec.language.bm.Languages.LanguageSet restrictTo(org.apache.commons.codec.language.bm.Languages.LanguageSet languageSet) {
            if (languageSet == org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES) {
                return languageSet;
            }
            if (languageSet == org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE) {
                return this;
            }
            final org.apache.commons.codec.language.bm.Languages.SomeLanguages someLanguages = (org.apache.commons.codec.language.bm.Languages.SomeLanguages) languageSet;
            return from((java.util.Set) this.getHighSpeedVideoFpsRangesFor.stream().filter(new java.util.function.Predicate() { // from class: org.apache.commons.codec.language.bm.Languages$SomeLanguages$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean contains;
                    contains = org.apache.commons.codec.language.bm.Languages.SomeLanguages.this.getHighSpeedVideoFpsRangesFor.contains((java.lang.String) obj);
                    return contains;
                }
            }).collect(java.util.stream.Collectors.toSet()));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Languages(");
            sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        for (org.apache.commons.codec.language.bm.NameType nameType : org.apache.commons.codec.language.bm.NameType.values()) {
            getHighResolutionOutputSizeshNQ4ISI.put(nameType, getInstance(java.lang.String.format("org/apache/commons/codec/language/bm/%s_languages.txt", nameType.getName())));
        }
    }

    public static org.apache.commons.codec.language.bm.Languages getInstance(org.apache.commons.codec.language.bm.NameType nameType) {
        return getHighResolutionOutputSizeshNQ4ISI.get(nameType);
    }

    public static org.apache.commons.codec.language.bm.Languages getInstance(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Scanner scanner = new java.util.Scanner(org.apache.commons.codec.Resources.getInputStream(str), org.apache.commons.codec.language.bm.ResourceConstants.getHighSpeedVideoFpsRanges);
        while (true) {
            boolean z = false;
            while (scanner.hasNextLine()) {
                try {
                    java.lang.String trim = scanner.nextLine().trim();
                    if (z) {
                        if (trim.endsWith("*/")) {
                            break;
                        }
                    } else if (trim.startsWith("/*")) {
                        z = true;
                    } else if (!trim.isEmpty()) {
                        hashSet.add(trim);
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
            org.apache.commons.codec.language.bm.Languages languages = new org.apache.commons.codec.language.bm.Languages(java.util.Collections.unmodifiableSet(hashSet));
            scanner.close();
            return languages;
        }
    }

    private Languages(java.util.Set<java.lang.String> set) {
        this.getHighSpeedVideoFpsRangesFor = set;
    }

    public java.util.Set<java.lang.String> getLanguages() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
