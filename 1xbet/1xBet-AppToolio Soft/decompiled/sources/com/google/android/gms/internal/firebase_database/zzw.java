package com.google.android.gms.internal.firebase_database;

import java.util.List;

/* loaded from: classes.dex */
final class zzw implements zzgm<Void, Void> {
    private final /* synthetic */ zzgj zzbv;
    private final /* synthetic */ List zzbw;
    private final /* synthetic */ zzch zzbx;
    private final /* synthetic */ zzja zzby;

    zzw(zzu zzuVar, zzgj zzgjVar, List list, zzch zzchVar, zzja zzjaVar) {
        this.zzbv = zzgjVar;
        this.zzbw = list;
        this.zzbx = zzchVar;
        this.zzby = zzjaVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Void zza(zzch zzchVar, Void r4, Void r5) {
        if (this.zzbv.zzai(zzchVar) != null) {
            return null;
        }
        this.zzbw.add(new zzkn(this.zzbx.zzh(zzchVar), this.zzby.zzam(zzchVar)));
        return null;
    }
}
