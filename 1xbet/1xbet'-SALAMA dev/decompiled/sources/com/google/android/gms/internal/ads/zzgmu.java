package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgmu {
    private final Map zza;
    private final List zzb;
    private final zzgms zzc;
    private final Class zzd;
    private final zzgky zze;

    public /* synthetic */ zzgmu(Map map, List list, zzgms zzgmsVar, zzgky zzgkyVar, Class cls, zzgmt zzgmtVar) {
        this.zza = map;
        this.zzb = list;
        this.zzc = zzgmsVar;
        this.zzd = cls;
        this.zze = zzgkyVar;
    }

    public static zzgmr zzb(Class cls) {
        return new zzgmr(cls, null);
    }

    public final zzgky zza() {
        return this.zze;
    }

    public final zzgms zzc() {
        return this.zzc;
    }

    public final Class zzd() {
        return this.zzd;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf() {
        return Collections.unmodifiableList(this.zzb);
    }
}
