package a8;

import S7.m;
import com.google.crypto.tink.internal.H;
import i8.v;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f36432a = new Object();

    static boolean c(String str) throws GeneralSecurityException {
        synchronized (f36432a) {
            try {
                String b11 = v.b(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(b11)) {
                        return false;
                    }
                    b.a(b11);
                    return true;
                } catch (IOException e11) {
                    throw new GeneralSecurityException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // S7.m
    public final boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    @Override // S7.m
    public final c b(String str) throws GeneralSecurityException {
        c cVar;
        try {
            synchronized (f36432a) {
                cVar = new c(v.b(str));
                byte[] a11 = H.a(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(a11, cVar.b(cVar.a(a11, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return cVar;
        } catch (IOException e11) {
            throw new GeneralSecurityException(e11);
        }
    }
}
