package codec.language.bm;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f2804a;
    public final java.lang.String b;
    public final codec.language.bm.e c;
    public int d;
    public final int e;
    public boolean f;

    public f(java.util.Map map, java.lang.String str, codec.language.bm.e eVar, int i, int i2) {
        if (map == null) {
            throw new java.lang.NullPointerException("The finalRules argument must not be null");
        }
        this.f2804a = map;
        this.c = eVar;
        this.b = str;
        this.d = i;
        this.e = i2;
    }

    public final codec.language.bm.f a() {
        int i;
        this.f = false;
        java.util.Map map = this.f2804a;
        java.lang.String str = this.b;
        int i2 = this.d;
        java.util.List list = (java.util.List) map.get(str.subSequence(i2, i2 + 1));
        if (list != null) {
            java.util.Iterator it = list.iterator();
            i = 1;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                codec.language.bm.Rule rule = (codec.language.bm.Rule) it.next();
                int length = rule.getPattern().length();
                if (rule.patternAndContextMatches(this.b, this.d)) {
                    codec.language.bm.e eVar = this.c;
                    codec.language.bm.Rule.PhonemeExpr phoneme = rule.getPhoneme();
                    int i3 = this.e;
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(i3);
                    loop1: for (codec.language.bm.Rule.Phoneme phoneme2 : eVar.f2803a) {
                        for (codec.language.bm.Rule.Phoneme phoneme3 : phoneme.getPhonemes()) {
                            codec.language.bm.Languages.LanguageSet restrictTo = phoneme2.getLanguages().restrictTo(phoneme3.getLanguages());
                            if (!restrictTo.isEmpty()) {
                                codec.language.bm.Rule.Phoneme phoneme4 = new codec.language.bm.Rule.Phoneme(phoneme2, phoneme3, restrictTo);
                                if (linkedHashSet.size() < i3) {
                                    linkedHashSet.add(phoneme4);
                                    if (linkedHashSet.size() >= i3) {
                                        break loop1;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    eVar.f2803a.clear();
                    eVar.f2803a.addAll(linkedHashSet);
                    this.f = true;
                    i = length;
                } else {
                    i = length;
                }
            }
        } else {
            i = 1;
        }
        this.d += this.f ? i : 1;
        return this;
    }
}
