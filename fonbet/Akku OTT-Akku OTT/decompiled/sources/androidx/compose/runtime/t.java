package androidx.compose.runtime;

/* loaded from: classes.dex */
public final /* synthetic */ class t {
    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static String b(char c, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String c(String str, char c, String str2) {
        return str + str2 + c;
    }
}
