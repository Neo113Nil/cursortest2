package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzavp implements java.util.Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        int length;
        com.google.android.gms.internal.ads.zzavq zzavqVar = (com.google.android.gms.internal.ads.zzavq) obj;
        com.google.android.gms.internal.ads.zzavq zzavqVar2 = (com.google.android.gms.internal.ads.zzavq) obj2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzavqVar.zza.length;
            if (i >= length || i2 >= zzavqVar2.zza.length) {
                break;
            }
            int compare = java.lang.Integer.compare(com.google.android.gms.internal.ads.zzavq.zzg(zzavqVar.zzb(i)), com.google.android.gms.internal.ads.zzavq.zzg(zzavqVar2.zzb(i2)));
            if (compare != 0) {
                return compare;
            }
            i++;
            i2++;
        }
        return java.lang.Integer.compare(length, zzavqVar2.zza.length);
    }
}
