package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfle {
    public static com.google.android.gms.ads.internal.client.zzr zza(android.content.Context context, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzfkg zzfkgVar = (com.google.android.gms.internal.ads.zzfkg) it.next();
            if (zzfkgVar.zzc) {
                arrayList.add(com.google.android.gms.ads.AdSize.FLUID);
            } else {
                arrayList.add(new com.google.android.gms.ads.AdSize(zzfkgVar.zza, zzfkgVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzr(context, (com.google.android.gms.ads.AdSize[]) arrayList.toArray(new com.google.android.gms.ads.AdSize[arrayList.size()]));
    }

    public static com.google.android.gms.internal.ads.zzfkg zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzi ? new com.google.android.gms.internal.ads.zzfkg(-3, 0, true) : new com.google.android.gms.internal.ads.zzfkg(zzrVar.zze, zzrVar.zzb, false);
    }
}
