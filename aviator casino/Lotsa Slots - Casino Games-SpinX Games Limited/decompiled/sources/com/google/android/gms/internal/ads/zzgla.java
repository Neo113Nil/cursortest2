package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgla {
    private final java.io.File zza;
    private final com.google.android.gms.internal.ads.zzfxb zzb;
    private final com.google.android.gms.internal.ads.zzgqh zzc;

    public zzgla(java.io.File file, com.google.android.gms.internal.ads.zzfxb zzfxbVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = file;
        this.zzb = zzfxbVar;
        this.zzc = zzgqhVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean z;
        try {
            java.io.File file = this.zza;
            com.google.android.gms.internal.ads.zzgzt.zzb(file);
            com.google.android.gms.internal.ads.zzgzt.zza(bArr, file);
            z = this.zzb.zza(file);
        } catch (java.io.IOException | java.security.GeneralSecurityException e) {
            this.zzc.zzd(2027, e);
            z = false;
        }
        try {
            this.zza.delete();
        } catch (java.lang.SecurityException unused) {
        }
        return z;
    }
}
