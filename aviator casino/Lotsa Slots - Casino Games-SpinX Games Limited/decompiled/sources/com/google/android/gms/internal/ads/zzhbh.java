package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhbh extends com.google.android.gms.internal.ads.zzhay {
    private java.util.List zza;

    zzhbh(com.google.android.gms.internal.ads.zzgwi zzgwiVar, boolean z) {
        super(zzgwiVar, z, true);
        java.util.List emptyList = zzgwiVar.isEmpty() ? java.util.Collections.emptyList() : com.google.android.gms.internal.ads.zzgxm.zzb(zzgwiVar.size());
        for (int i = 0; i < zzgwiVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    abstract java.lang.Object zzD(java.util.List list);

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzw(int i, java.lang.Object obj) {
        java.util.List list = this.zza;
        if (list != null) {
            list.set(i, new com.google.android.gms.internal.ads.zzhbg(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    final void zzx() {
        java.util.List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
