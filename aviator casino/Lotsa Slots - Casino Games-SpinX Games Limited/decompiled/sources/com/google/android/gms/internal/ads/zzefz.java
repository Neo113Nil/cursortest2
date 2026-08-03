package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzefz implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ android.content.Context zza;

    zzefz(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            com.google.android.gms.internal.ads.zzbib.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzj.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzbib.zze(this.zza);
        }
    }
}
