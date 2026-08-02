package a8;

import a8.b;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* loaded from: classes.dex */
public final class c implements S7.a {

    /* renamed from: a, reason: collision with root package name */
    private final S7.a f36431a;

    public c(String str) throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f36431a = new b.a(str, keyStore);
        } catch (IOException e11) {
            throw new GeneralSecurityException(e11);
        }
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        S7.a aVar = this.f36431a;
        try {
            return ((b.a) aVar).a(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e11) {
            Log.w("c", "encountered a potentially transient KeyStore error, will wait and retry", e11);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return ((b.a) aVar).a(bArr, bArr2);
        }
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        S7.a aVar = this.f36431a;
        try {
            return ((b.a) aVar).b(bArr, bArr2);
        } catch (ProviderException e11) {
            e = e11;
            Log.w("c", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return ((b.a) aVar).b(bArr, bArr2);
        } catch (BadPaddingException e12) {
            throw e12;
        } catch (GeneralSecurityException e13) {
            e = e13;
            Log.w("c", "encountered a potentially transient KeyStore error, will wait and retry", e);
            Thread.sleep((int) (Math.random() * 100.0d));
            return ((b.a) aVar).b(bArr, bArr2);
        }
    }
}
