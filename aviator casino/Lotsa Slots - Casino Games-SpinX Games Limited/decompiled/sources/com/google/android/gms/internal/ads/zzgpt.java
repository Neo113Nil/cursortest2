package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgpt implements com.google.android.gms.internal.ads.zzgpe {
    private final java.util.List zza = new java.util.ArrayList();

    zzgpt() {
    }

    public final synchronized void zza(java.util.List list) {
        java.util.List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(java.util.Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final synchronized void zzc(java.util.Map map, android.content.Context context, android.view.View view) {
        java.util.List list = this.zza;
        map.put("vst", new java.util.ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(java.util.Map map) {
    }
}
