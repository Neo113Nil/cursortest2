package codec.language.bm;

/* loaded from: classes7.dex */
public class Lang {
    public static final java.util.EnumMap c = new java.util.EnumMap(codec.language.bm.NameType.class);

    /* renamed from: a, reason: collision with root package name */
    public final codec.language.bm.Languages f2792a;
    public final java.util.List b;

    static {
        for (codec.language.bm.NameType nameType : codec.language.bm.NameType.values()) {
            java.util.EnumMap enumMap = c;
            java.lang.String name2 = nameType.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("org/apache/commons/codec/language/bm/");
            sb.append(name2);
            sb.append("_lang.txt");
            enumMap.put((java.util.EnumMap) nameType, (codec.language.bm.NameType) loadFromResource(sb.toString(), codec.language.bm.Languages.getInstance(nameType)));
        }
    }

    public Lang(java.util.ArrayList arrayList, codec.language.bm.Languages languages) {
        this.b = java.util.Collections.unmodifiableList(arrayList);
        this.f2792a = languages;
    }

    public static codec.language.bm.Lang instance(codec.language.bm.NameType nameType) {
        return (codec.language.bm.Lang) c.get(nameType);
    }

    public static codec.language.bm.Lang loadFromResource(java.lang.String str, codec.language.bm.Languages languages) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Scanner scanner = new java.util.Scanner(codec.Resources.getInputStream(str), "UTF-8");
        while (true) {
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
                        if (trim.length() != 0) {
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
                            arrayList.add(new codec.language.bm.a(java.util.regex.Pattern.compile(split[0]), new java.util.HashSet(java.util.Arrays.asList(split[1].split("\\+"))), split[2].equals("true")));
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
            return new codec.language.bm.Lang(arrayList, languages);
        }
    }

    public java.lang.String guessLanguage(java.lang.String str) {
        codec.language.bm.Languages.LanguageSet guessLanguages = guessLanguages(str);
        return guessLanguages.isSingleton() ? guessLanguages.getAny() : "any";
    }

    public codec.language.bm.Languages.LanguageSet guessLanguages(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ENGLISH);
        java.util.HashSet hashSet = new java.util.HashSet(this.f2792a.getLanguages());
        for (codec.language.bm.a aVar : this.b) {
            if (aVar.c.matcher(lowerCase).find()) {
                if (aVar.f2801a) {
                    hashSet.retainAll(aVar.b);
                } else {
                    hashSet.removeAll(aVar.b);
                }
            }
        }
        codec.language.bm.Languages.LanguageSet from = codec.language.bm.Languages.LanguageSet.from(hashSet);
        return from.equals(codec.language.bm.Languages.NO_LANGUAGES) ? codec.language.bm.Languages.ANY_LANGUAGE : from;
    }
}
