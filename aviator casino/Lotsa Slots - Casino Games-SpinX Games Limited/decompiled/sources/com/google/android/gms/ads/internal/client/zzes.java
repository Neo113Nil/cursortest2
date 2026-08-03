package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzes extends com.google.android.gms.ads.internal.client.zzdj {
    private zzes() {
        throw null;
    }

    /* synthetic */ zzes(byte[] bArr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.OnAdInspectorClosedListener zzA = com.google.android.gms.ads.internal.client.zzeu.zzb().zzA();
        if (zzA != null) {
            zzA.onAdInspectorClosed(zzeVar == null ? null : new com.google.android.gms.ads.AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }
}
