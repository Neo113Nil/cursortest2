package Z5;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f7917a = Logger.getLogger(f.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final N6.f f7918b;

    static {
        N6.f fVar = N6.f.f4798d;
        f7918b = P6.b.k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(N6.i iVar) {
        return (iVar.a() & 255) | ((iVar.a() & 255) << 16) | ((iVar.a() & 255) << 8);
    }

    public static int b(int i7, byte b7, short s7) {
        if ((b7 & 8) != 0) {
            i7--;
        }
        if (s7 <= i7) {
            return (short) (i7 - s7);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s7), Integer.valueOf(i7));
        throw null;
    }

    public static void c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
