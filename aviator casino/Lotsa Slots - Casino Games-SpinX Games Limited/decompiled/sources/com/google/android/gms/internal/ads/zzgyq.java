package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyq extends com.google.android.gms.internal.ads.zzguk {
    final java.util.Iterator zza;
    final /* synthetic */ java.util.Set zzb;
    final /* synthetic */ java.util.Set zzc;

    zzgyq(com.google.android.gms.internal.ads.zzgyr zzgyrVar, java.util.Set set, java.util.Set set2) {
        this.zzb = set;
        this.zzc = set2;
        java.util.Objects.requireNonNull(zzgyrVar);
        this.zza = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    protected final java.lang.Object zza() {
        java.util.Set set;
        java.lang.Object next;
        do {
            java.util.Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            set = this.zzc;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
