package com.google.android.gms.internal.firebase_database;

import android.support.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;

/* loaded from: classes.dex */
final class zzl implements OnFailureListener {
    private final /* synthetic */ zzbr zzbe;

    zzl(zzk zzkVar, zzbr zzbrVar) {
        this.zzbe = zzbrVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        if ((exc instanceof FirebaseApiNotAvailableException) || (exc instanceof FirebaseNoSignedInUserException)) {
            this.zzbe.zzf(null);
        } else {
            this.zzbe.onError(exc.getMessage());
        }
    }
}
