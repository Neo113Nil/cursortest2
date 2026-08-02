package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkt;
import com.google.android.gms.internal.p002firebaseauthapi.zzlh;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzq {
    private static zzq zza;
    private final String zzb;

    @Nullable
    private final zzmy zzc;

    private zzq(Context context, String str, boolean z) {
        zzmy zzmyVar;
        this.zzb = str;
        try {
            zzkt.zza();
            zzmy.zza zza2 = new zzmy.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlh.zza);
            zza2.zza("android-keystore://firebear_master_key_id." + str);
            zzmyVar = zza2.zza();
        } catch (IOException | GeneralSecurityException e) {
            e.getMessage();
            zzmyVar = null;
        }
        this.zzc = zzmyVar;
    }

    public static zzq zza(Context context, String str) {
        zzq zzqVar = zza;
        if (zzqVar == null || !Objects.equals(zzqVar.zzb, str)) {
            zza = new zzq(context, str, true);
        }
        return zza;
    }

    @Nullable
    public final String zza(String str) {
        String str2;
        zzmy zzmyVar = this.zzc;
        if (zzmyVar == null) {
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((com.google.android.gms.internal.p002firebaseauthapi.zzbd) this.zzc.zza().zza(zzks.zza(), com.google.android.gms.internal.p002firebaseauthapi.zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            e.getMessage();
            return null;
        }
    }

    @Nullable
    public final String zza() {
        if (this.zzc == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p002firebaseauthapi.zzby zza2 = com.google.android.gms.internal.p002firebaseauthapi.zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.zzc) {
                this.zzc.zza().zzb().zza(zza2);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            e.getMessage();
            return null;
        }
    }
}
