package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhbf extends com.google.android.gms.internal.ads.zzhbh {
    zzhbf(com.google.android.gms.internal.ads.zzgwi zzgwiVar, boolean z) {
        super(zzgwiVar, z);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final /* bridge */ /* synthetic */ java.lang.Object zzD(java.util.List list) {
        java.util.ArrayList zzb = com.google.android.gms.internal.ads.zzgxm.zzb(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzhbg zzhbgVar = (com.google.android.gms.internal.ads.zzhbg) it.next();
            zzb.add(zzhbgVar != null ? zzhbgVar.zza : null);
        }
        return java.util.Collections.unmodifiableList(zzb);
    }
}
