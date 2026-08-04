package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzuc {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzfw zzc;

    public zzuc(zzada zzadaVar, zzajq zzajqVar) {
    }

    public final void zza(zzfw zzfwVar) {
        if (zzfwVar != this.zzc) {
            this.zzc = zzfwVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
