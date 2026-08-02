package codec.language.bm;

/* loaded from: classes7.dex */
public class Rule {
    public static final java.lang.String ALL = "ALL";
    public static final codec.language.bm.Rule.RPattern ALL_STRINGS_RMATCHER = new codec.language.bm.h();
    public static final java.util.EnumMap e = new java.util.EnumMap(codec.language.bm.NameType.class);

    /* renamed from: a, reason: collision with root package name */
    public final codec.language.bm.Rule.RPattern f2797a;
    public final java.lang.String b;
    public final codec.language.bm.Rule.PhonemeExpr c;
    public final codec.language.bm.Rule.RPattern d;

    public interface PhonemeExpr {
        java.lang.Iterable<codec.language.bm.Rule.Phoneme> getPhonemes();
    }

    public static final class PhonemeList implements codec.language.bm.Rule.PhonemeExpr {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.List f2799a;

        public PhonemeList(java.util.List<codec.language.bm.Rule.Phoneme> list) {
            this.f2799a = list;
        }

        @Override // codec.language.bm.Rule.PhonemeExpr
        public final java.util.List<codec.language.bm.Rule.Phoneme> getPhonemes() {
            return this.f2799a;
        }
    }

    public interface RPattern {
        boolean isMatch(java.lang.CharSequence charSequence);
    }

    static {
        for (codec.language.bm.NameType nameType : codec.language.bm.NameType.values()) {
            java.util.EnumMap enumMap = new java.util.EnumMap(codec.language.bm.RuleType.class);
            for (codec.language.bm.RuleType ruleType : codec.language.bm.RuleType.values()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (java.lang.String str : codec.language.bm.Languages.getInstance(nameType).getLanguages()) {
                    try {
                        java.util.Scanner scanner = new java.util.Scanner(codec.Resources.getInputStream(a(nameType, ruleType, str)), "UTF-8");
                        try {
                            hashMap.put(str, a(scanner, a(nameType, ruleType, str)));
                            scanner.close();
                        } finally {
                        }
                    } catch (java.lang.IllegalStateException e2) {
                        throw new java.lang.IllegalStateException("Problem processing ".concat(a(nameType, ruleType, str)), e2);
                    }
                }
                if (!ruleType.equals(codec.language.bm.RuleType.RULES)) {
                    java.util.Scanner scanner2 = new java.util.Scanner(codec.Resources.getInputStream(a(nameType, ruleType, "common")), "UTF-8");
                    try {
                        hashMap.put("common", a(scanner2, a(nameType, ruleType, "common")));
                        scanner2.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            scanner2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                enumMap.put((java.util.EnumMap) ruleType, (codec.language.bm.RuleType) java.util.Collections.unmodifiableMap(hashMap));
            }
            e.put((java.util.EnumMap) nameType, (codec.language.bm.NameType) java.util.Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(java.lang.String str, java.lang.String str2, java.lang.String str3, codec.language.bm.Rule.PhonemeExpr phonemeExpr) {
        this.b = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        this.f2797a = c(sb.toString());
        this.d = c("^".concat(java.lang.String.valueOf(str3)));
        this.c = phonemeExpr;
    }

    public static java.lang.String a(codec.language.bm.NameType nameType, codec.language.bm.RuleType ruleType, java.lang.String str) {
        java.lang.String name2 = nameType.getName();
        java.lang.String name3 = ruleType.getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("org/apache/commons/codec/language/bm/");
        sb.append(name2);
        sb.append("_");
        sb.append(name3);
        sb.append("_");
        sb.append(str);
        sb.append(".txt");
        return sb.toString();
    }

    public static codec.language.bm.Rule.PhonemeExpr b(java.lang.String str) {
        if (!str.startsWith("(")) {
            return a(str);
        }
        if (!str.endsWith(")")) {
            throw new java.lang.IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String substring = str.substring(1, str.length() - 1);
        for (java.lang.String str2 : substring.split("[|]")) {
            arrayList.add(a(str2));
        }
        if (substring.startsWith(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER) || substring.endsWith(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER)) {
            arrayList.add(new codec.language.bm.Rule.Phoneme("", codec.language.bm.Languages.ANY_LANGUAGE));
        }
        return new codec.language.bm.Rule.PhonemeList(arrayList);
    }

    public static codec.language.bm.Rule.RPattern c(java.lang.String str) {
        boolean startsWith = str.startsWith("^");
        boolean endsWith = str.endsWith(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        java.lang.String substring = str.substring(startsWith ? 1 : 0, endsWith ? str.length() - 1 : str.length());
        if (substring.contains("[")) {
            boolean startsWith2 = substring.startsWith("[");
            boolean endsWith2 = substring.endsWith("]");
            if (startsWith2 && endsWith2) {
                java.lang.String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains("[")) {
                    boolean startsWith3 = substring2.startsWith("^");
                    if (startsWith3) {
                        substring2 = substring2.substring(1);
                    }
                    boolean z = !startsWith3;
                    if (startsWith && endsWith) {
                        return new codec.language.bm.n(substring2, z);
                    }
                    if (startsWith) {
                        return new codec.language.bm.o(substring2, z);
                    }
                    if (endsWith) {
                        return new codec.language.bm.p(substring2, z);
                    }
                }
            }
        } else {
            if (startsWith && endsWith) {
                return substring.length() == 0 ? new codec.language.bm.j() : new codec.language.bm.k(substring);
            }
            if ((startsWith || endsWith) && substring.length() == 0) {
                return ALL_STRINGS_RMATCHER;
            }
            if (startsWith) {
                return new codec.language.bm.l(substring);
            }
            if (endsWith) {
                return new codec.language.bm.m(substring);
            }
        }
        return new codec.language.bm.g(str);
    }

    public static java.lang.String d(java.lang.String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public static java.util.List<codec.language.bm.Rule> getInstance(codec.language.bm.NameType nameType, codec.language.bm.RuleType ruleType, codec.language.bm.Languages.LanguageSet languageSet) {
        java.util.Map<java.lang.String, java.util.List<codec.language.bm.Rule>> instanceMap = getInstanceMap(nameType, ruleType, languageSet);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<codec.language.bm.Rule>> it = instanceMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return arrayList;
    }

    public static java.util.Map<java.lang.String, java.util.List<codec.language.bm.Rule>> getInstanceMap(codec.language.bm.NameType nameType, codec.language.bm.RuleType ruleType, codec.language.bm.Languages.LanguageSet languageSet) {
        return languageSet.isSingleton() ? getInstanceMap(nameType, ruleType, languageSet.getAny()) : getInstanceMap(nameType, ruleType, "any");
    }

    public codec.language.bm.Rule.RPattern getLContext() {
        return this.f2797a;
    }

    public java.lang.String getPattern() {
        return this.b;
    }

    public codec.language.bm.Rule.PhonemeExpr getPhoneme() {
        return this.c;
    }

    public codec.language.bm.Rule.RPattern getRContext() {
        return this.d;
    }

    public boolean patternAndContextMatches(java.lang.CharSequence charSequence, int i) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int length = this.b.length() + i;
        if (length <= charSequence.length() && charSequence.subSequence(i, length).equals(this.b) && this.d.isMatch(charSequence.subSequence(length, charSequence.length()))) {
            return this.f2797a.isMatch(charSequence.subSequence(0, i));
        }
        return false;
    }

    public static final class Phoneme implements codec.language.bm.Rule.PhonemeExpr {
        public static final java.util.Comparator<codec.language.bm.Rule.Phoneme> COMPARATOR = new codec.language.bm.q();

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.StringBuilder f2798a;
        public final codec.language.bm.Languages.LanguageSet b;

        public Phoneme(java.lang.CharSequence charSequence, codec.language.bm.Languages.LanguageSet languageSet) {
            this.f2798a = new java.lang.StringBuilder(charSequence);
            this.b = languageSet;
        }

        public final codec.language.bm.Rule.Phoneme append(java.lang.CharSequence charSequence) {
            this.f2798a.append(charSequence);
            return this;
        }

        public final codec.language.bm.Languages.LanguageSet getLanguages() {
            return this.b;
        }

        public final java.lang.CharSequence getPhonemeText() {
            return this.f2798a;
        }

        @Override // codec.language.bm.Rule.PhonemeExpr
        public final java.lang.Iterable<codec.language.bm.Rule.Phoneme> getPhonemes() {
            return java.util.Collections.singleton(this);
        }

        @java.lang.Deprecated
        public final codec.language.bm.Rule.Phoneme join(codec.language.bm.Rule.Phoneme phoneme) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f2798a.toString());
            sb.append(phoneme.f2798a.toString());
            return new codec.language.bm.Rule.Phoneme(sb.toString(), this.b.restrictTo(phoneme.b));
        }

        public final codec.language.bm.Rule.Phoneme mergeWithLanguage(codec.language.bm.Languages.LanguageSet languageSet) {
            return new codec.language.bm.Rule.Phoneme(this.f2798a.toString(), this.b.merge(languageSet));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f2798a.toString());
            sb.append("[");
            sb.append(this.b);
            sb.append("]");
            return sb.toString();
        }

        public Phoneme(codec.language.bm.Rule.Phoneme phoneme, codec.language.bm.Rule.Phoneme phoneme2) {
            this(phoneme.f2798a, phoneme.b);
            this.f2798a.append((java.lang.CharSequence) phoneme2.f2798a);
        }

        public Phoneme(codec.language.bm.Rule.Phoneme phoneme, codec.language.bm.Rule.Phoneme phoneme2, codec.language.bm.Languages.LanguageSet languageSet) {
            this(phoneme.f2798a, languageSet);
            this.f2798a.append((java.lang.CharSequence) phoneme2.f2798a);
        }
    }

    public static codec.language.bm.Rule.Phoneme a(java.lang.String str) {
        int indexOf = str.indexOf("[");
        if (indexOf >= 0) {
            if (str.endsWith("]")) {
                return new codec.language.bm.Rule.Phoneme(str.substring(0, indexOf), codec.language.bm.Languages.LanguageSet.from(new java.util.HashSet(java.util.Arrays.asList(str.substring(indexOf + 1, str.length() - 1).split("[+]")))));
            }
            throw new java.lang.IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
        }
        return new codec.language.bm.Rule.Phoneme(str, codec.language.bm.Languages.ANY_LANGUAGE);
    }

    public static java.util.Map<java.lang.String, java.util.List<codec.language.bm.Rule>> getInstanceMap(codec.language.bm.NameType nameType, codec.language.bm.RuleType ruleType, java.lang.String str) {
        java.util.Map<java.lang.String, java.util.List<codec.language.bm.Rule>> map = (java.util.Map) ((java.util.Map) ((java.util.Map) e.get(nameType)).get(ruleType)).get(str);
        if (map != null) {
            return map;
        }
        java.lang.String name2 = nameType.getName();
        java.lang.String name3 = ruleType.getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No rules found for ");
        sb.append(name2);
        sb.append(", ");
        sb.append(name3);
        sb.append(", ");
        sb.append(str);
        sb.append(".");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static java.util.List<codec.language.bm.Rule> getInstance(codec.language.bm.NameType nameType, codec.language.bm.RuleType ruleType, java.lang.String str) {
        return getInstance(nameType, ruleType, codec.language.bm.Languages.LanguageSet.from(new java.util.HashSet(java.util.Arrays.asList(str))));
    }

    public static java.util.HashMap a(java.util.Scanner scanner, java.lang.String str) {
        java.lang.String str2;
        java.lang.String d;
        java.lang.String d2;
        java.lang.String d3;
        int i;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (scanner.hasNextLine()) {
            int i5 = i3 + 1;
            java.lang.String nextLine = scanner.nextLine();
            if (i4 != 0) {
                if (nextLine.endsWith("*/")) {
                    i4 = i2;
                    i3 = i5;
                }
                i = i2;
            } else if (nextLine.startsWith("/*")) {
                i4 = 1;
                i3 = i5;
            } else {
                int indexOf = nextLine.indexOf("//");
                java.lang.String trim = (indexOf >= 0 ? nextLine.substring(i2, indexOf) : nextLine).trim();
                if (trim.length() != 0) {
                    if (trim.startsWith("#include")) {
                        java.lang.String trim2 = trim.substring(8).trim();
                        if (!trim2.contains(" ")) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("org/apache/commons/codec/language/bm/");
                            sb.append(trim2);
                            sb.append(".txt");
                            java.util.Scanner scanner2 = new java.util.Scanner(codec.Resources.getInputStream(sb.toString()), "UTF-8");
                            try {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(str);
                                sb2.append("->");
                                sb2.append(trim2);
                                hashMap.putAll(a(scanner2, sb2.toString()));
                                scanner2.close();
                            } finally {
                            }
                        } else {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Malformed import statement '");
                            sb3.append(nextLine);
                            sb3.append("' in ");
                            sb3.append(str);
                            throw new java.lang.IllegalArgumentException(sb3.toString());
                        }
                    } else {
                        java.lang.String[] split = trim.split("\\s+");
                        if (split.length == 4) {
                            try {
                                d = d(split[i2]);
                                d2 = d(split[1]);
                                d3 = d(split[2]);
                                str2 = "' in ";
                            } catch (java.lang.IllegalArgumentException e2) {
                                e = e2;
                                str2 = "' in ";
                            }
                            try {
                                codec.language.bm.i iVar = new codec.language.bm.i(d, d2, d3, b(d(split[3])), i5, str, d, d2, d3);
                                i = 0;
                                java.lang.String substring = iVar.b.substring(0, 1);
                                java.util.List list = (java.util.List) hashMap.get(substring);
                                if (list == null) {
                                    list = new java.util.ArrayList();
                                    hashMap.put(substring, list);
                                }
                                list.add(iVar);
                            } catch (java.lang.IllegalArgumentException e3) {
                                e = e3;
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Problem parsing line '");
                                sb4.append(i5);
                                sb4.append(str2);
                                sb4.append(str);
                                throw new java.lang.IllegalStateException(sb4.toString(), e);
                            }
                        } else {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Malformed rule statement split into ");
                            sb5.append(split.length);
                            sb5.append(" parts: ");
                            sb5.append(nextLine);
                            sb5.append(" in ");
                            sb5.append(str);
                            throw new java.lang.IllegalArgumentException(sb5.toString());
                        }
                    }
                }
                i = i2;
            }
            i2 = i;
            i3 = i5;
        }
        return hashMap;
    }
}
