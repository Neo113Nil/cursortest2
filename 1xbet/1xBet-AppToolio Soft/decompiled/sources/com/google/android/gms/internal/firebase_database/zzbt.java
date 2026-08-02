package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseError;

/* loaded from: classes.dex */
public final class zzbt extends zzce {
    private final zzck zzai;
    private final ChildEventListener zzgt;
    private final zzhh zzgu;

    public zzbt(zzck zzckVar, ChildEventListener childEventListener, zzhh zzhhVar) {
        this.zzai = zzckVar;
        this.zzgt = childEventListener;
        this.zzgu = zzhhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbt)) {
            return false;
        }
        zzbt zzbtVar = (zzbt) obj;
        return zzbtVar.zzgt.equals(this.zzgt) && zzbtVar.zzai.equals(this.zzai) && zzbtVar.zzgu.equals(this.zzgu);
    }

    public final int hashCode() {
        return (((this.zzgt.hashCode() * 31) + this.zzai.hashCode()) * 31) + this.zzgu.hashCode();
    }

    public final String toString() {
        return "ChildEventRegistration";
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzce zza(zzhh zzhhVar) {
        return new zzbt(this.zzai, this.zzgt, zzhhVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzgx zza(zzgw zzgwVar, zzhh zzhhVar) {
        return new zzgx(zzgwVar.zzdt(), this, com.google.firebase.database.zzh.zza(com.google.firebase.database.zzh.zza(this.zzai, zzhhVar.zzg().zza(zzgwVar.zzds())), zzgwVar.zzdq()), zzgwVar.zzdu() != null ? zzgwVar.zzdu().zzfg() : null);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final void zza(zzgx zzgxVar) {
        if (zzbs()) {
        }
        switch (zzbu.zzgv[zzgxVar.zzdt().ordinal()]) {
            case 1:
                this.zzgt.onChildAdded(zzgxVar.zzdw(), zzgxVar.zzdx());
                break;
            case 2:
                this.zzgt.onChildChanged(zzgxVar.zzdw(), zzgxVar.zzdx());
                break;
            case 3:
                this.zzgt.onChildMoved(zzgxVar.zzdw(), zzgxVar.zzdx());
                break;
            case 4:
                this.zzgt.onChildRemoved(zzgxVar.zzdw());
                break;
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final void zza(DatabaseError databaseError) {
        this.zzgt.onCancelled(databaseError);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final boolean zza(zzgz zzgzVar) {
        return zzgzVar != zzgz.VALUE;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final zzhh zzbe() {
        return this.zzgu;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzce
    public final boolean zzc(zzce zzceVar) {
        return (zzceVar instanceof zzbt) && ((zzbt) zzceVar).zzgt.equals(this.zzgt);
    }
}
