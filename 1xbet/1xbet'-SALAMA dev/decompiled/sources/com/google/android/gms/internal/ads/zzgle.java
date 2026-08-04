package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzgle {
    private final zzgky zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzgle(zzgky zzgkyVar, List list, Integer num, zzgld zzgldVar) {
        this.zza = zzgkyVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
