package p000;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ob0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f5688a = Logger.getLogger(lb0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final C0836wd f5689b;

    static {
        C0836wd c0836wd = C0836wd.f8510m;
        f5689b = n80.m3494c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    /* JADX INFO: renamed from: a */
    public static int m3664a(g01 g01Var) {
        return (g01Var.m1917a() & 255) | ((g01Var.m1917a() & 255) << 16) | ((g01Var.m1917a() & 255) << 8);
    }

    /* JADX INFO: renamed from: b */
    public static int m3665b(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        m3666c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static void m3666c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
