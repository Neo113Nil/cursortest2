package com.google.android.gms.internal.firebase_database;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzkr implements DatabaseReference.CompletionListener {
    private final /* synthetic */ TaskCompletionSource zzur;

    zzkr(TaskCompletionSource taskCompletionSource) {
        this.zzur = taskCompletionSource;
    }

    @Override // com.google.firebase.database.DatabaseReference.CompletionListener
    public final void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
        if (databaseError != null) {
            this.zzur.setException(databaseError.toException());
        } else {
            this.zzur.setResult(null);
        }
    }
}
