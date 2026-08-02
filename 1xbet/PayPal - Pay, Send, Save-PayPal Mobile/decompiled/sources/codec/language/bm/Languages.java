package codec.language.bm;

/* loaded from: classes7.dex */
public class Languages {
    public static final java.lang.String ANY = "any";
    public static final codec.language.bm.Languages.LanguageSet ANY_LANGUAGE;
    public static final codec.language.bm.Languages.LanguageSet NO_LANGUAGES;
    public static final java.util.EnumMap b = new java.util.EnumMap(codec.language.bm.NameType.class);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f2793a;

    public static abstract class LanguageSet {
        public static codec.language.bm.Languages.LanguageSet from(java.util.Set<java.lang.String> set) {
            return set.isEmpty() ? codec.language.bm.Languages.NO_LANGUAGES : new codec.language.bm.Languages.SomeLanguages(set);
        }

        public abstract boolean contains(java.lang.String str);

        public abstract java.lang.String getAny();

        public abstract boolean isEmpty();

        public abstract boolean isSingleton();

        public abstract codec.language.bm.Languages.LanguageSet merge(codec.language.bm.Languages.LanguageSet languageSet);

        public abstract codec.language.bm.Languages.LanguageSet restrictTo(codec.language.bm.Languages.LanguageSet languageSet);
    }

    public static final class SomeLanguages extends codec.language.bm.Languages.LanguageSet {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.Set f2794a;

        public SomeLanguages(java.util.Set set) {
            this.f2794a = java.util.Collections.unmodifiableSet(set);
        }

        @Override // codec.language.bm.Languages.LanguageSet
        public final boolean contains(java.lang.String str) {
            return this.f2794a.contains(str);
        }

        @Override // codec.language.bm.Languages.LanguageSet
        public final java.lang.String getAny() {
            return (java.lang.String) this.f2794a.iterator().next();
        }

        public final java.util.Set<java.lang.String> getLanguages() {
            return this.f2794a;
        }

        @Override // codec.language.bm.Languages.LanguageSet
        public final boolean isEmpty() {
            return this.f2794a.isEmpty();
        }

        @Override // codec.language.bm.Languages.LanguageSet
        public final boolean isSingleton() {
            return this.f2794a.size() == 1;
        }

        @Override // codec.language.bm.Languages.LanguageSet
        public final codec.language.bm.Languages.LanguageSet merge(codec.language.bm.Languages.LanguageSet languageSet) {
            if (languageSet == codec.language.bm.Languages.NO_LANGUAGES) {
                return this;
            }
            if (languageSet == codec.language.bm.Languages.ANY_LANGUAGE) {
                return languageSet;
            }
            java.util.HashSet hashSet = new java.util.HashSet(this.f2794a);
            java.util.Iterator it = ((codec.language.bm.Languages.SomeLanguages) languageSet).f2794a.iterator();
            while (it.hasNext()) {
                hashSet.add((java.lang.String) it.next());
            }
            return codec.language.bm.Languages.LanguageSet.from(hashSet);
        }

        @Override // codec.language.bm.Languages.LanguageSet
        public final codec.language.bm.Languages.LanguageSet restrictTo(codec.language.bm.Languages.LanguageSet languageSet) {
            if (languageSet == codec.language.bm.Languages.NO_LANGUAGES) {
                return languageSet;
            }
            if (languageSet == codec.language.bm.Languages.ANY_LANGUAGE) {
                return this;
            }
            codec.language.bm.Languages.SomeLanguages someLanguages = (codec.language.bm.Languages.SomeLanguages) languageSet;
            java.util.HashSet hashSet = new java.util.HashSet(java.lang.Math.min(this.f2794a.size(), someLanguages.f2794a.size()));
            for (java.lang.String str : this.f2794a) {
                if (someLanguages.f2794a.contains(str)) {
                    hashSet.add(str);
                }
            }
            return codec.language.bm.Languages.LanguageSet.from(hashSet);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Languages(");
            sb.append(this.f2794a.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        for (codec.language.bm.NameType nameType : codec.language.bm.NameType.values()) {
            java.util.EnumMap enumMap = b;
            java.lang.String name2 = nameType.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("org/apache/commons/codec/language/bm/");
            sb.append(name2);
            sb.append("_languages.txt");
            enumMap.put((java.util.EnumMap) nameType, (codec.language.bm.NameType) getInstance(sb.toString()));
        }
        NO_LANGUAGES = new codec.language.bm.b();
        ANY_LANGUAGE = new codec.language.bm.c();
    }

    public Languages(java.util.Set set) {
        this.f2793a = set;
    }

    public static codec.language.bm.Languages getInstance(codec.language.bm.NameType nameType) {
        return (codec.language.bm.Languages) b.get(nameType);
    }

    public java.util.Set<java.lang.String> getLanguages() {
        return this.f2793a;
    }

    public static codec.language.bm.Languages getInstance(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Scanner scanner = new java.util.Scanner(codec.Resources.getInputStream(str), "UTF-8");
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
                    } else if (trim.length() > 0) {
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
            codec.language.bm.Languages languages = new codec.language.bm.Languages(java.util.Collections.unmodifiableSet(hashSet));
            scanner.close();
            return languages;
        }
    }
}
