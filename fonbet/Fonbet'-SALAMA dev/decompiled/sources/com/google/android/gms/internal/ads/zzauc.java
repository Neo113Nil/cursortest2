package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzauc {
    public static final String zza(Context context, String str, boolean z4) {
        try {
            zzast zza = zzasu.zza();
            zza.zzb(str);
            zza.zza("1.671910402");
            zza.zzc(context.getPackageName());
            zza.zzd(System.currentTimeMillis() / 1000);
            try {
                zza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zza.zze(-1L);
            }
            zzata zza2 = zzatm.zza(((zzasu) zza.zzbr()).zzaV(), null);
            zza2.zzd(5);
            zza2.zzc(2);
            return Base64.encodeToString(((zzatb) zza2.zzbr()).zzaV(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
