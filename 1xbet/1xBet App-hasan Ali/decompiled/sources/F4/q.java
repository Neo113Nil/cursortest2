package F4;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class q {
    public static int a(int i, int i5, int i6) {
        if ((i5 & 8) != 0) {
            i--;
        }
        if (i6 <= i) {
            return i - i6;
        }
        throw new IOException(L1.a.k(i6, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
