package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzauc {
    public static final String zza(Context context, String str, boolean z4) {
        try {
            zzast zzastVarZza = zzasu.zza();
            zzastVarZza.zzb(str);
            zzastVarZza.zza("1.671910402");
            zzastVarZza.zzc(context.getPackageName());
            zzastVarZza.zzd(System.currentTimeMillis() / 1000);
            try {
                zzastVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzastVarZza.zze(-1L);
            }
            zzata zzataVarZza = zzatm.zza(((zzasu) zzastVarZza.zzbr()).zzaV(), null);
            zzataVarZza.zzd(5);
            zzataVarZza.zzc(2);
            return Base64.encodeToString(((zzatb) zzataVarZza.zzbr()).zzaV(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
