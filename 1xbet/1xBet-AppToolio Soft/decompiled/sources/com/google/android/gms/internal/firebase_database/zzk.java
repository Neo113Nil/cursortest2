package com.google.android.gms.internal.firebase_database;

import android.support.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzk implements zzbq {
    private final ScheduledExecutorService zzbc;
    private final FirebaseApp zzbd;

    public zzk(@NonNull FirebaseApp firebaseApp, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.zzbd = firebaseApp;
        this.zzbc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbq
    public final void zza(zzbs zzbsVar) {
        this.zzbd.addIdTokenListener(new zzn(this, zzbsVar));
    }

    @Override // com.google.android.gms.internal.firebase_database.zzbq
    public final void zza(boolean z, @NonNull zzbr zzbrVar) {
        this.zzbd.getToken(z).addOnSuccessListener(this.zzbc, new zzm(this, zzbrVar)).addOnFailureListener(this.zzbc, new zzl(this, zzbrVar));
    }
}
