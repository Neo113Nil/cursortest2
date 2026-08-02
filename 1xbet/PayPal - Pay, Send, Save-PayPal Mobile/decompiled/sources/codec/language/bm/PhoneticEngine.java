package codec.language.bm;

/* loaded from: classes7.dex */
public class PhoneticEngine {
    public static final java.util.EnumMap f;

    /* renamed from: a, reason: collision with root package name */
    public final codec.language.bm.Lang f2796a;
    public final codec.language.bm.NameType b;
    public final codec.language.bm.RuleType c;
    public final boolean d;
    public final int e;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(codec.language.bm.NameType.class);
        f = enumMap;
        enumMap.put((java.util.EnumMap) codec.language.bm.NameType.ASHKENAZI, (codec.language.bm.NameType) java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.libraries.places.api.model.PlaceTypes.BAR, "ben", "da", "de", "van", "von"))));
        enumMap.put((java.util.EnumMap) codec.language.bm.NameType.SEPHARDIC, (codec.language.bm.NameType) java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put((java.util.EnumMap) codec.language.bm.NameType.GENERIC, (codec.language.bm.NameType) java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }

    public PhoneticEngine(codec.language.bm.NameType nameType, codec.language.bm.RuleType ruleType, boolean z) {
        this(nameType, ruleType, z, 20);
    }

    public final codec.language.bm.e a(codec.language.bm.e eVar, java.util.Map map) {
        if (map == null) {
            throw new java.lang.NullPointerException("finalRules can not be null");
        }
        if (map.isEmpty()) {
            return eVar;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(codec.language.bm.Rule.Phoneme.COMPARATOR);
        for (codec.language.bm.Rule.Phoneme phoneme : eVar.f2803a) {
            codec.language.bm.e eVar2 = new codec.language.bm.e(new codec.language.bm.Rule.Phoneme("", phoneme.getLanguages()));
            java.lang.String obj = phoneme.getPhonemeText().toString();
            int i = 0;
            codec.language.bm.e eVar3 = eVar2;
            while (i < obj.length()) {
                codec.language.bm.f a2 = new codec.language.bm.f(map, obj, eVar3, i, this.e).a();
                boolean z = a2.f;
                eVar3 = a2.c;
                if (!z) {
                    java.lang.CharSequence subSequence = obj.subSequence(i, i + 1);
                    java.util.Iterator it = eVar3.f2803a.iterator();
                    while (it.hasNext()) {
                        ((codec.language.bm.Rule.Phoneme) it.next()).append(subSequence);
                    }
                }
                i = a2.d;
            }
            for (codec.language.bm.Rule.Phoneme phoneme2 : eVar3.f2803a) {
                if (treeMap.containsKey(phoneme2)) {
                    codec.language.bm.Rule.Phoneme mergeWithLanguage = ((codec.language.bm.Rule.Phoneme) treeMap.remove(phoneme2)).mergeWithLanguage(phoneme2.getLanguages());
                    treeMap.put(mergeWithLanguage, mergeWithLanguage);
                } else {
                    treeMap.put(phoneme2, phoneme2);
                }
            }
        }
        return new codec.language.bm.e(treeMap.keySet());
    }

    public java.lang.String encode(java.lang.String str) {
        return encode(str, this.f2796a.guessLanguages(str));
    }

    public codec.language.bm.Lang getLang() {
        return this.f2796a;
    }

    public int getMaxPhonemes() {
        return this.e;
    }

    public codec.language.bm.NameType getNameType() {
        return this.b;
    }

    public codec.language.bm.RuleType getRuleType() {
        return this.c;
    }

    public boolean isConcat() {
        return this.d;
    }

    public PhoneticEngine(codec.language.bm.NameType nameType, codec.language.bm.RuleType ruleType, boolean z, int i) {
        codec.language.bm.RuleType ruleType2 = codec.language.bm.RuleType.RULES;
        if (ruleType == ruleType2) {
            throw new java.lang.IllegalArgumentException("ruleType must not be ".concat(java.lang.String.valueOf(ruleType2)));
        }
        this.b = nameType;
        this.c = ruleType;
        this.d = z;
        this.f2796a = codec.language.bm.Lang.instance(nameType);
        this.e = i;
    }

    public java.lang.String encode(java.lang.String str, codec.language.bm.Languages.LanguageSet languageSet) {
        java.lang.String str2;
        java.util.Map<java.lang.String, java.util.List<codec.language.bm.Rule>> instanceMap = codec.language.bm.Rule.getInstanceMap(this.b, codec.language.bm.RuleType.RULES, languageSet);
        java.util.Map<java.lang.String, java.util.List<codec.language.bm.Rule>> instanceMap2 = codec.language.bm.Rule.getInstanceMap(this.b, this.c, "common");
        java.util.Map<java.lang.String, java.util.List<codec.language.bm.Rule>> instanceMap3 = codec.language.bm.Rule.getInstanceMap(this.b, this.c, languageSet);
        java.lang.String trim = str.toLowerCase(java.util.Locale.ENGLISH).replace('-', ' ').trim();
        int i = 0;
        if (this.b == codec.language.bm.NameType.GENERIC) {
            if (trim.length() >= 2 && trim.substring(0, 2).equals("d'")) {
                java.lang.String substring = trim.substring(2);
                java.lang.String concat = "d".concat(java.lang.String.valueOf(substring));
                java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
                sb.append(encode(substring));
                sb.append(")-(");
                sb.append(encode(concat));
                sb.append(")");
                return sb.toString();
            }
            for (java.lang.String str3 : (java.util.Set) f.get(this.b)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str3);
                sb2.append(" ");
                if (trim.startsWith(sb2.toString())) {
                    java.lang.String substring2 = trim.substring(str3.length() + 1);
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(str3);
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
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = codec.language.bm.d.f2802a[this.b.ordinal()];
        if (i2 == 1) {
            java.util.Iterator it = asList.iterator();
            while (it.hasNext()) {
                java.lang.String[] split = ((java.lang.String) it.next()).split("'");
                arrayList.add(split[split.length - 1]);
            }
            arrayList.removeAll((java.util.Collection) f.get(this.b));
        } else if (i2 == 2) {
            arrayList.addAll(asList);
            arrayList.removeAll((java.util.Collection) f.get(this.b));
        } else if (i2 == 3) {
            arrayList.addAll(asList);
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Unreachable case: ");
            sb5.append(this.b);
            throw new java.lang.IllegalStateException(sb5.toString());
        }
        if (this.d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                sb6.append((java.lang.String) it2.next());
            }
            while (it2.hasNext()) {
                sb6.append(" ");
                sb6.append((java.lang.String) it2.next());
            }
            str2 = sb6.toString();
        } else if (arrayList.size() == 1) {
            str2 = (java.lang.String) asList.iterator().next();
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int size = arrayList.size();
            while (i < size) {
                java.lang.Object obj2 = arrayList.get(i);
                i++;
                sb7.append("-");
                sb7.append(encode((java.lang.String) obj2));
            }
            return sb7.substring(1);
        }
        codec.language.bm.e eVar = new codec.language.bm.e(new codec.language.bm.Rule.Phoneme("", languageSet));
        int i3 = 0;
        while (i3 < str2.length()) {
            codec.language.bm.f a2 = new codec.language.bm.f(instanceMap, str2, eVar, i3, this.e).a();
            i3 = a2.d;
            eVar = a2.c;
        }
        codec.language.bm.e a3 = a(a(eVar, instanceMap2), instanceMap3);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        for (codec.language.bm.Rule.Phoneme phoneme : a3.f2803a) {
            if (sb8.length() > 0) {
                sb8.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
            }
            sb8.append(phoneme.getPhonemeText());
        }
        return sb8.toString();
    }
}
