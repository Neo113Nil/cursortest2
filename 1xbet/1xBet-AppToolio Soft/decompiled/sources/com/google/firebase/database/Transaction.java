package com.google.firebase.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.firebase_database.zzja;

/* loaded from: classes.dex */
public class Transaction {

    public interface Handler {
        @NonNull
        Result doTransaction(@NonNull MutableData mutableData);

        void onComplete(@Nullable DatabaseError databaseError, boolean z, @Nullable DataSnapshot dataSnapshot);
    }

    public static class Result {
        private boolean zzba;
        private zzja zzbb;

        private Result(boolean z, zzja zzjaVar) {
            this.zzba = z;
            this.zzbb = zzjaVar;
        }

        public boolean isSuccess() {
            return this.zzba;
        }

        public final zzja zzd() {
            return this.zzbb;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Result abort() {
        return new Result(false, null);
    }

    @NonNull
    public static Result success(@NonNull MutableData mutableData) {
        return new Result(true, mutableData.zzd());
    }
}
