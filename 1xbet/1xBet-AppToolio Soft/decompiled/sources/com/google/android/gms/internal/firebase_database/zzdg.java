package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;

/* loaded from: classes.dex */
final class zzdg implements zzbb {
    private final /* synthetic */ zzck zzil;
    private final /* synthetic */ zzfa zzje;

    zzdg(zzck zzckVar, zzfa zzfaVar) {
        this.zzil = zzckVar;
        this.zzje = zzfaVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbb
    public final void zzb(String str, String str2) {
        DatabaseError zzc;
        zzc = zzck.zzc(str, str2);
        this.zzil.zza("Persisted write", this.zzje.zzg(), zzc);
        this.zzil.zza(this.zzje.zzcn(), this.zzje.zzg(), zzc);
    }
}
