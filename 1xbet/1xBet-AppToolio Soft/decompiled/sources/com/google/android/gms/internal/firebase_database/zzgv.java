package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;

/* loaded from: classes.dex */
public final class zzgv implements zzgy {
    private final zzch zzap;
    private final zzce zzoo;
    private final DatabaseError zzop;

    public zzgv(zzce zzceVar, DatabaseError databaseError, zzch zzchVar) {
        this.zzoo = zzceVar;
        this.zzap = zzchVar;
        this.zzop = databaseError;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgy
    public final String toString() {
        String valueOf = String.valueOf(this.zzap);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append(valueOf);
        sb.append(":CANCEL");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgy
    public final void zzdr() {
        this.zzoo.zza(this.zzop);
    }
}
