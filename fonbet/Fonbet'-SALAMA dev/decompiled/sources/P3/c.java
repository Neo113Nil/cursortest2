package P3;

import W3.n;
import W3.o;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5587b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public KeyStore f5588a;

    public c() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f5588a = keyStore;
        } catch (IOException | GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static boolean a(String str) {
        c cVar = new c();
        synchronized (f5587b) {
            try {
                if (cVar.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        String b7 = o.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b7, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized b c(String str) {
        b bVar;
        bVar = new b(o.b(str), this.f5588a);
        byte[] a2 = n.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a2, bVar.b(bVar.a(a2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean d(String str) {
        String b7;
        b7 = o.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f5588a = keyStore;
                keyStore.load(null);
                return this.f5588a.containsAlias(b7);
            } catch (IOException e7) {
                throw new GeneralSecurityException(e7);
            }
        }
        return this.f5588a.containsAlias(b7);
    }
}
