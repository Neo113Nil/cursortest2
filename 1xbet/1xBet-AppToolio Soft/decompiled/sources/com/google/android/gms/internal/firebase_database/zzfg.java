package com.google.android.gms.internal.firebase_database;

import java.util.Collections;

/* loaded from: classes.dex */
public final class zzfg {
    private final zzch zzmg;
    private final zzfd zzmh;

    public zzfg(zzch zzchVar, zzfd zzfdVar) {
        this.zzmg = zzchVar;
        this.zzmh = zzfdVar;
    }

    public final zziz zza(zzja zzjaVar, zziz zzizVar, boolean z, zzis zzisVar) {
        return this.zzmh.zza(this.zzmg, zzjaVar, zzizVar, z, zzisVar);
    }

    public final zzja zza(zzch zzchVar, zzja zzjaVar, zzja zzjaVar2) {
        return this.zzmh.zza(this.zzmg, zzchVar, zzjaVar, zzjaVar2);
    }

    public final zzja zza(zzid zzidVar, zzgu zzguVar) {
        return this.zzmh.zza(this.zzmg, zzidVar, zzguVar);
    }

    public final zzfg zzb(zzid zzidVar) {
        return new zzfg(this.zzmg.zza(zzidVar), this.zzmh);
    }

    public final zzja zzc(zzja zzjaVar) {
        return this.zzmh.zza(this.zzmg, zzjaVar, Collections.emptyList(), false);
    }

    public final zzja zzd(zzja zzjaVar) {
        return this.zzmh.zzj(this.zzmg, zzjaVar);
    }

    public final zzja zzu(zzch zzchVar) {
        return this.zzmh.zzu(this.zzmg.zzh(zzchVar));
    }
}
