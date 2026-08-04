package p042f4;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbi;
import com.google.android.gms.internal.p002firebaseauthapi.zzbo;
import com.google.android.gms.internal.p002firebaseauthapi.zzce;
import com.google.android.gms.internal.p002firebaseauthapi.zzkh;
import com.google.android.gms.internal.p002firebaseauthapi.zzkm;
import com.google.android.gms.internal.p002firebaseauthapi.zzma;
import com.google.android.gms.internal.p002firebaseauthapi.zzpg;
import com.google.android.gms.internal.p002firebaseauthapi.zzr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static J f12932c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzma f12934b;

    public J(Context context, String str) {
        zzma zzmaVarZza;
        this.f12933a = str;
        try {
            zzkh.zza();
            zzma.zza zzaVarZza = new zzma.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzkm.zza);
            zzaVarZza.zza("android-keystore://firebear_master_key_id." + str);
            zzmaVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e7) {
            L.n("Exception encountered during crypto setup:\n", e7.getMessage(), "FirebearCryptoHelper");
            zzmaVarZza = null;
        }
        this.f12934b = zzmaVarZza;
    }

    public static J a(Context context, String str) {
        J j = f12932c;
        if (j == null || !zzr.zza(j.f12933a, str)) {
            f12932c = new J(context, str);
        }
        return f12932c;
    }

    public final String b() {
        if (this.f12934b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzce zzceVarZza = zzbi.zza(byteArrayOutputStream);
        try {
            synchronized (this.f12934b) {
                this.f12934b.zza().zza().zza(zzceVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e7) {
            L.n("Exception encountered when attempting to get Public Key:\n", e7.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzma zzmaVar = this.f12934b;
        if (zzmaVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmaVar) {
                str2 = new String(((zzbo) this.f12934b.zza().zza(zzpg.zza(), zzbo.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e7) {
            L.n("Exception encountered while decrypting bytes:\n", e7.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }
}
