package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

/* loaded from: classes.dex */
public final class zzfc extends zzce {
    private final zzck zzai;
    private final zzhh zzgu;
    private final ValueEventListener zzly;

    public zzfc(zzck zzckVar, ValueEventListener valueEventListener, zzhh zzhhVar) {
        this.zzai = zzckVar;
        this.zzly = valueEventListener;
        this.zzgu = zzhhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfc)) {
            return false;
        }
        zzfc zzfcVar = (zzfc) obj;
        return zzfcVar.zzly.equals(this.zzly) && zzfcVar.zzai.equals(this.zzai) && zzfcVar.zzgu.equals(this.zzgu);
    }

    public final int hashCode() {
        return (((this.zzly.hashCode() * 31) + this.zzai.hashCode()) * 31) + this.zzgu.hashCode();
    }

    public final String toString() {
        return "ValueEventRegistration";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzce zza(zzhh zzhhVar) {
        return new zzfc(this.zzai, this.zzly, zzhhVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzgx zza(zzgw zzgwVar, zzhh zzhhVar) {
        return new zzgx(zzgz.VALUE, this, com.google.firebase.database.zzh.zza(com.google.firebase.database.zzh.zza(this.zzai, zzhhVar.zzg()), zzgwVar.zzdq()), null);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final void zza(zzgx zzgxVar) {
        if (zzbs()) {
            return;
        }
        this.zzly.onDataChange(zzgxVar.zzdw());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final void zza(DatabaseError databaseError) {
        this.zzly.onCancelled(databaseError);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final boolean zza(zzgz zzgzVar) {
        return zzgzVar == zzgz.VALUE;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzhh zzbe() {
        return this.zzgu;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final boolean zzc(zzce zzceVar) {
        return (zzceVar instanceof zzfc) && ((zzfc) zzceVar).zzly.equals(this.zzly);
    }
}
