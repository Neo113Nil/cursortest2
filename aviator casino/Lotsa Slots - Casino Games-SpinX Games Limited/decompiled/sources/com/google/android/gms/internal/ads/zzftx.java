package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzftx implements java.util.Comparator {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzftx zza = new com.google.android.gms.internal.ads.zzftx();

    private /* synthetic */ zzftx() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzftm zzftmVar = (com.google.android.gms.internal.ads.zzftm) obj2;
        com.google.android.gms.internal.ads.zzftm zzftmVar2 = (com.google.android.gms.internal.ads.zzftm) obj;
        int compare = java.lang.Double.compare(zzftmVar.zze(), zzftmVar2.zze());
        return compare == 0 ? java.lang.Long.compare(zzftmVar2.zzd(), zzftmVar.zzd()) : compare;
    }
}
