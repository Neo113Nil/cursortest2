package codec.language.bm;

/* loaded from: classes7.dex */
public final class m implements codec.language.bm.Rule.RPattern {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2808a;

    public m(java.lang.String str) {
        this.f2808a = str;
    }

    @Override // codec.language.bm.Rule.RPattern
    public final boolean isMatch(java.lang.CharSequence charSequence) {
        java.lang.String str = this.f2808a;
        codec.language.bm.Rule.RPattern rPattern = codec.language.bm.Rule.ALL_STRINGS_RMATCHER;
        if (str.length() > charSequence.length()) {
            return false;
        }
        int length = charSequence.length() - 1;
        for (int length2 = str.length() - 1; length2 >= 0; length2--) {
            if (charSequence.charAt(length) != str.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }
}
