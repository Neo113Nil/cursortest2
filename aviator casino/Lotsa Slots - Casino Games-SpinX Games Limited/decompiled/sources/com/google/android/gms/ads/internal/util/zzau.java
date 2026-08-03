package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzau extends com.google.android.gms.ads.internal.client.zzdj {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzax zzb;

    zzau(com.google.android.gms.ads.internal.util.zzax zzaxVar, android.content.Context context) {
        this.zza = context;
        java.util.Objects.requireNonNull(zzaxVar);
        this.zzb = zzaxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.zzb.zzn(this.zza, zzeVar.zzb, true, true);
    }
}
