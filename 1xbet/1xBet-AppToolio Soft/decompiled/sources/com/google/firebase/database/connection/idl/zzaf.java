package com.google.firebase.database.connection.idl;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzaf implements com.google.android.gms.internal.firebase_database.zzad {
    private final /* synthetic */ zzk zzfz;

    zzaf(zzk zzkVar) {
        this.zzfz = zzkVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzad
    public final void zza(boolean z, com.google.android.gms.internal.firebase_database.zzae zzaeVar) {
        try {
            this.zzfz.zza(z, new zzag(this, zzaeVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
