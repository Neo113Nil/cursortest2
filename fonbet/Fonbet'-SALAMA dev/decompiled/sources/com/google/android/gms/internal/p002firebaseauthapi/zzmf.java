package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final class zzmf implements zzcd {
    private static final Object zza = new Object();

    public static final class zza {
        public zza() {
            zzmf.zza();
        }
    }

    public zzmf() {
        this(new zza());
    }

    public static /* synthetic */ boolean zza() {
        return true;
    }

    public static boolean zzc(String str) {
        synchronized (zza) {
            try {
                String zza2 = zzzb.zza("android-keystore://", str);
                if (zzme.zzb(zza2)) {
                    return false;
                }
                KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(build);
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    private zzmf(zza zzaVar) {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final zzbg zza(String str) {
        zzmg zzmgVar;
        try {
            synchronized (zza) {
                try {
                    zzmgVar = new zzmg(zzzb.zza("android-keystore://", str));
                    byte[] zza2 = zzpe.zza(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(zza2, zzmgVar.zza(zzmgVar.zzb(zza2, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzmgVar;
        } catch (IOException e7) {
            throw new GeneralSecurityException(e7);
        }
    }
}
