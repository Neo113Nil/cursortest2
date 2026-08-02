package S7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;

/* loaded from: classes9.dex */
public interface s {
    OutputStream a(OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException;

    InputStream b(InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException;
}
