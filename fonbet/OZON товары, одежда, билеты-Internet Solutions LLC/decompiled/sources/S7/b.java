package S7;

import com.google.crypto.tink.shaded.protobuf.C5910p;
import f8.I;
import f8.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayInputStream f25996a;

    private b(ByteArrayInputStream byteArrayInputStream) {
        this.f25996a = byteArrayInputStream;
    }

    public static b c(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    public final I a() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f25996a;
        try {
            return I.L(byteArrayInputStream, C5910p.b());
        } finally {
            byteArrayInputStream.close();
        }
    }

    public final z b() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f25996a;
        try {
            return z.I(byteArrayInputStream, C5910p.b());
        } finally {
            byteArrayInputStream.close();
        }
    }
}
