package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzde implements zzew {
    final /* synthetic */ zzck zzil;

    zzde(zzck zzckVar) {
        this.zzil = zzckVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzew
    public final void zza(zzhh zzhhVar, zzex zzexVar) {
        zzaj zzajVar;
        zzajVar = this.zzil.zzfs;
        zzajVar.zza(zzhhVar.zzg().zzbv(), zzhhVar.zzen().zzej());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzew
    public final void zza(zzhh zzhhVar, zzex zzexVar, zzai zzaiVar, zzet zzetVar) {
        zzaj zzajVar;
        zzajVar = this.zzil.zzfs;
        zzajVar.zza(zzhhVar.zzg().zzbv(), zzhhVar.zzen().zzej(), zzaiVar, zzexVar != null ? Long.valueOf(zzexVar.zzcm()) : null, new zzdf(this, zzetVar));
    }
}
