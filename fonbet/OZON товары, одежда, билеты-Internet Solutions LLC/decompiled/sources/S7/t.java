package S7;

import T7.AbstractC4021c;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.shaded.protobuf.C5910p;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes9.dex */
public final class t {
    public static q a(byte[] bArr) throws GeneralSecurityException {
        try {
            return com.google.crypto.tink.internal.u.a().e(G.a(f8.G.N(bArr, C5910p.b())));
        } catch (IOException e11) {
            throw new GeneralSecurityException("Failed to parse proto", e11);
        }
    }

    public static byte[] b(AbstractC4021c abstractC4021c) throws GeneralSecurityException {
        return ((G) com.google.crypto.tink.internal.u.a().k(abstractC4021c)).c().f();
    }
}
