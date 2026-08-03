package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgxm {
    public static java.util.ArrayList zza(java.util.Iterator it) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static java.util.ArrayList zzb(int i) {
        com.google.android.gms.internal.ads.zzgvi.zzb(i, "initialArraySize");
        return new java.util.ArrayList(i);
    }

    public static java.util.List zzc(java.util.List list, com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        return list instanceof java.util.RandomAccess ? new com.google.android.gms.internal.ads.zzgxj(list, zzgtaVar) : new com.google.android.gms.internal.ads.zzgxl(list, zzgtaVar);
    }
}
