package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;

/* loaded from: classes.dex */
final class zzeu extends zzce {
    private zzhh zzgu;

    public zzeu(zzhh zzhhVar) {
        this.zzgu = zzhhVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzeu) && ((zzeu) obj).zzgu.equals(this.zzgu);
    }

    public final int hashCode() {
        return this.zzgu.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzce zza(zzhh zzhhVar) {
        return new zzeu(zzhhVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzgx zza(zzgw zzgwVar, zzhh zzhhVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final void zza(zzgx zzgxVar) {
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final void zza(DatabaseError databaseError) {
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final boolean zza(zzgz zzgzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzhh zzbe() {
        return this.zzgu;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final boolean zzc(zzce zzceVar) {
        return zzceVar instanceof zzeu;
    }
}
