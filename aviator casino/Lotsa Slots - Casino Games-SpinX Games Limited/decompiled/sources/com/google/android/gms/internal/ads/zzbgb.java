package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbgb implements java.util.Comparator {
    public zzbgb(com.google.android.gms.internal.ads.zzbgc zzbgcVar) {
        java.util.Objects.requireNonNull(zzbgcVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzbfr zzbfrVar = (com.google.android.gms.internal.ads.zzbfr) obj;
        com.google.android.gms.internal.ads.zzbfr zzbfrVar2 = (com.google.android.gms.internal.ads.zzbfr) obj2;
        if (zzbfrVar.zzb() < zzbfrVar2.zzb()) {
            return -1;
        }
        if (zzbfrVar.zzb() <= zzbfrVar2.zzb()) {
            if (zzbfrVar.zza() < zzbfrVar2.zza()) {
                return -1;
            }
            if (zzbfrVar.zza() <= zzbfrVar2.zza()) {
                float zzd = (zzbfrVar.zzd() - zzbfrVar.zzb()) * (zzbfrVar.zzc() - zzbfrVar.zza());
                float zzd2 = (zzbfrVar2.zzd() - zzbfrVar2.zzb()) * (zzbfrVar2.zzc() - zzbfrVar2.zza());
                if (zzd > zzd2) {
                    return -1;
                }
                if (zzd >= zzd2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
