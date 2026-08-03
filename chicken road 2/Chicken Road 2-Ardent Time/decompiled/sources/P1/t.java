package P1;

/* loaded from: classes.dex */
public abstract class t {
    public static int a(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new java.io.IOException(B1.a.h("PROTOCOL_ERROR padding ", i4, i2, " > remaining length "));
    }
}
