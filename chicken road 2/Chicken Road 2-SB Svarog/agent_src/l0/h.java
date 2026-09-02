package l0;

/* loaded from: classes.dex */
public abstract class h extends g {
    public static String H(String str, String str2) {
        g0.h.e(str2, "delimiter");
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + indexOf, str.length());
        g0.h.d(substring, "substring(...)");
        return substring;
    }
}
