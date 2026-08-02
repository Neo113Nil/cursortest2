package codec.language.bm;

/* loaded from: classes7.dex */
public final class l implements codec.language.bm.Rule.RPattern {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2807a;

    public l(java.lang.String str) {
        this.f2807a = str;
    }

    @Override // codec.language.bm.Rule.RPattern
    public final boolean isMatch(java.lang.CharSequence charSequence) {
        java.lang.String str = this.f2807a;
        codec.language.bm.Rule.RPattern rPattern = codec.language.bm.Rule.ALL_STRINGS_RMATCHER;
        if (str.length() > charSequence.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charSequence.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
