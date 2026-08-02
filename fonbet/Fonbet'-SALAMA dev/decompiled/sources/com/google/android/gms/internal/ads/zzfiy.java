package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzfiy implements Comparator {
    final /* synthetic */ zzfiz zza;

    public zzfiy(zzfiz zzfizVar) {
        this.zza = zzfizVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzfir zzfirVar = (zzfir) obj;
        zzfir zzfirVar2 = (zzfir) obj2;
        int compare = Double.compare(zzfiz.zzc(this.zza, this.zza.zza(zzfirVar2.zzc())), zzfiz.zzc(this.zza, this.zza.zza(zzfirVar.zzc())));
        return compare == 0 ? Long.compare(zzfirVar.zzb(), zzfirVar2.zzb()) : compare;
    }
}
