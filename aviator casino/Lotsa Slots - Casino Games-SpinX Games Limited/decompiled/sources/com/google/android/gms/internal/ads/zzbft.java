package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbft implements java.util.Comparator {
    zzbft(com.google.android.gms.internal.ads.zzbfv zzbfvVar) {
        java.util.Objects.requireNonNull(zzbfvVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzbfy zzbfyVar = (com.google.android.gms.internal.ads.zzbfy) obj;
        com.google.android.gms.internal.ads.zzbfy zzbfyVar2 = (com.google.android.gms.internal.ads.zzbfy) obj2;
        int i = zzbfyVar.zzc - zzbfyVar2.zzc;
        return i != 0 ? i : java.lang.Long.compare(zzbfyVar.zza, zzbfyVar2.zza);
    }
}
