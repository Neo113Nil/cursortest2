package com.google.firebase.database;

import com.google.android.gms.internal.firebase_database.zzid;
import com.google.android.gms.internal.firebase_database.zzja;
import com.google.android.gms.internal.firebase_database.zzkn;
import com.google.firebase.database.DatabaseReference;

/* loaded from: classes.dex */
final class zzd implements Runnable {
    private final /* synthetic */ zzkn zzx;
    private final /* synthetic */ DatabaseReference zzy;
    private final /* synthetic */ zzja zzz;

    zzd(DatabaseReference databaseReference, zzja zzjaVar, zzkn zzknVar) {
        this.zzy = databaseReference;
        this.zzz = zzjaVar;
        this.zzx = zzknVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzy.zzai.zza(this.zzy.zzap.zza(zzid.zzfe()), this.zzz, (DatabaseReference.CompletionListener) this.zzx.zzgv());
    }
}
