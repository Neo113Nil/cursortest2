package codec.language.bm;

/* loaded from: classes7.dex */
public final class k implements codec.language.bm.Rule.RPattern {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2806a;

    public k(java.lang.String str) {
        this.f2806a = str;
    }

    @Override // codec.language.bm.Rule.RPattern
    public final boolean isMatch(java.lang.CharSequence charSequence) {
        return charSequence.equals(this.f2806a);
    }
}
