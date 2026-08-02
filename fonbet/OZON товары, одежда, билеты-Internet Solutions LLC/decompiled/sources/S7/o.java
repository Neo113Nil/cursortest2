package S7;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import f8.I;
import f8.z;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class o {
    public static void a(j jVar, a8.e eVar, a8.c cVar, byte[] bArr) throws GeneralSecurityException, IOException {
        I f7 = jVar.f();
        byte[] a11 = cVar.a(f7.f(), bArr);
        z.b H11 = z.H();
        H11.i(AbstractC5903i.e(0, a11.length, a11));
        H11.j(u.a(f7));
        eVar.a(H11.b());
    }
}
