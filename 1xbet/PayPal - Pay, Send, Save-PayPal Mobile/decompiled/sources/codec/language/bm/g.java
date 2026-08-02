package codec.language.bm;

/* loaded from: classes7.dex */
public final class g implements codec.language.bm.Rule.RPattern {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f2805a;

    public g(java.lang.String str) {
        this.f2805a = java.util.regex.Pattern.compile(str);
    }

    @Override // codec.language.bm.Rule.RPattern
    public final boolean isMatch(java.lang.CharSequence charSequence) {
        return this.f2805a.matcher(charSequence).find();
    }
}
