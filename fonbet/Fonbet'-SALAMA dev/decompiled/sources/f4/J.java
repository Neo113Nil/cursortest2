package f4;

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

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static J f12926c;

    /* renamed from: a, reason: collision with root package name */
    public final String f12927a;

    /* renamed from: b, reason: collision with root package name */
    public final zzma f12928b;

    public J(Context context, String str) {
        zzma zzmaVar;
        this.f12927a = str;
        try {
            zzkh.zza();
            zzma.zza zza = new zzma.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzkm.zza);
            zza.zza("android-keystore://firebear_master_key_id." + str);
            zzmaVar = zza.zza();
        } catch (IOException | GeneralSecurityException e7) {
            w1.L.n("Exception encountered during crypto setup:\n", e7.getMessage(), "FirebearCryptoHelper");
            zzmaVar = null;
        }
        this.f12928b = zzmaVar;
    }

    public static J a(Context context, String str) {
        J j = f12926c;
        if (j == null || !zzr.zza(j.f12927a, str)) {
            f12926c = new J(context, str);
        }
        return f12926c;
    }

    public final String b() {
        if (this.f12928b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzce zza = zzbi.zza(byteArrayOutputStream);
        try {
            synchronized (this.f12928b) {
                this.f12928b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e7) {
            w1.L.n("Exception encountered when attempting to get Public Key:\n", e7.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzma zzmaVar = this.f12928b;
        if (zzmaVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmaVar) {
                str2 = new String(((zzbo) this.f12928b.zza().zza(zzpg.zza(), zzbo.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e7) {
            w1.L.n("Exception encountered while decrypting bytes:\n", e7.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }
}
