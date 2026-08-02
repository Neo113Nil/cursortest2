package codec.language.bm;

/* loaded from: classes7.dex */
public final class q implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        codec.language.bm.Rule.Phoneme phoneme = (codec.language.bm.Rule.Phoneme) obj;
        codec.language.bm.Rule.Phoneme phoneme2 = (codec.language.bm.Rule.Phoneme) obj2;
        for (int i = 0; i < phoneme.f2798a.length(); i++) {
            if (i >= phoneme2.f2798a.length()) {
                return 1;
            }
            int charAt = phoneme.f2798a.charAt(i) - phoneme2.f2798a.charAt(i);
            if (charAt != 0) {
                return charAt;
            }
        }
        return phoneme.f2798a.length() < phoneme2.f2798a.length() ? -1 : 0;
    }
}
