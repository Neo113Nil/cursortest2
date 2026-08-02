package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzalf {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzale
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((zzalf) obj).zzb.zzb, ((zzalf) obj2).zzb.zzb);
            return compare;
        }
    };
    private final zzalg zzb;
    private final int zzc;

    public /* synthetic */ zzalf(zzalg zzalgVar, int i7, zzalj zzaljVar) {
        this.zzb = zzalgVar;
        this.zzc = i7;
    }
}
