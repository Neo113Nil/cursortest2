package codec.language.bm;

/* loaded from: classes7.dex */
public final class p implements codec.language.bm.Rule.RPattern {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2811a;
    public final /* synthetic */ boolean b;

    public p(java.lang.String str, boolean z) {
        this.f2811a = str;
        this.b = z;
    }

    @Override // codec.language.bm.Rule.RPattern
    public final boolean isMatch(java.lang.CharSequence charSequence) {
        boolean z;
        if (charSequence.length() > 0) {
            java.lang.String str = this.f2811a;
            char charAt = charSequence.charAt(charSequence.length() - 1);
            codec.language.bm.Rule.RPattern rPattern = codec.language.bm.Rule.ALL_STRINGS_RMATCHER;
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    z = false;
                    break;
                }
                if (str.charAt(i) == charAt) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z == this.b) {
                return true;
            }
        }
        return false;
    }
}
