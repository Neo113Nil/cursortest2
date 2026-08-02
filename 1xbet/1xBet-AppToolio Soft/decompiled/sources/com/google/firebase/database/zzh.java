package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzck;
import com.google.android.gms.internal.firebase_database.zzit;
import com.google.android.gms.internal.firebase_database.zzja;

/* loaded from: classes.dex */
public final class zzh {
    public static DataSnapshot zza(DatabaseReference databaseReference, zzit zzitVar) {
        return new DataSnapshot(databaseReference, zzitVar);
    }

    public static DatabaseReference zza(zzck zzckVar, zzch zzchVar) {
        return new DatabaseReference(zzckVar, zzchVar);
    }

    public static MutableData zza(zzja zzjaVar) {
        return new MutableData(zzjaVar);
    }
}
