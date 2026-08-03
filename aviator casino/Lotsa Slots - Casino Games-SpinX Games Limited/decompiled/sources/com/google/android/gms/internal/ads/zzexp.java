package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzexp implements com.google.android.gms.internal.ads.zzimu {
    public static com.google.android.gms.internal.ads.zzexp zza() {
        return com.google.android.gms.internal.ads.zzexo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        java.util.List arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zznj;
        if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).isEmpty()) {
            arrayList = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).split(","));
        }
        com.google.android.gms.internal.ads.zzinc.zzb(arrayList);
        return arrayList;
    }
}
