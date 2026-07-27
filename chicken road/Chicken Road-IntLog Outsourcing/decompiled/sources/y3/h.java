package y3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12409a = C1569c.b(16) + 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12410b = C1569c.b(8) + 8;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f12411c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f12412d;

    static {
        boolean z;
        try {
            Class.forName("com.fasterxml.jackson.core.JsonFactory");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f12411c = z;
        f12412d = new byte[0];
    }

    public static String a(i iVar) {
        if (!f12411c) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C1570d c1570d = new C1570d(byteArrayOutputStream);
            try {
                c1570d.X(iVar);
                c1570d.close();
                return new String(byteArrayOutputStream.toByteArray(), 1, r4.length - 2, StandardCharsets.UTF_8);
            } finally {
            }
        } catch (IOException e3) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e3);
        }
    }

    public static int b(C1568b c1568b, byte[] bArr) {
        if (bArr.length == 0) {
            return 0;
        }
        int i2 = c1568b.f12384c;
        int length = bArr.length;
        return C1569c.b(length) + length + i2;
    }

    public static int c(C1568b c1568b, long j2) {
        if (j2 == 0) {
            return 0;
        }
        int i2 = c1568b.f12384c;
        int i3 = C1569c.f12386e;
        return i2 + 8;
    }

    public static int d(C1568b c1568b, AbstractC1571e abstractC1571e) {
        int a6 = abstractC1571e.a();
        return C1569c.b(a6) + c1568b.f12384c + a6;
    }

    public static int e(C1568b c1568b, AbstractC1571e[] abstractC1571eArr) {
        int i2 = c1568b.f12384c;
        int i3 = 0;
        for (AbstractC1571e abstractC1571e : abstractC1571eArr) {
            int a6 = abstractC1571e.a();
            i3 += C1569c.b(a6) + i2 + a6;
        }
        return i3;
    }

    public static byte[] f(String str) {
        return (str == null || str.isEmpty()) ? f12412d : str.getBytes(StandardCharsets.UTF_8);
    }
}
