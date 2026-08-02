package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HexFormatKt {
    public static final /* synthetic */ boolean access$isCaseSensitive(java.lang.String str) {
        java.lang.String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str2.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 128) >= 0 || java.lang.Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
