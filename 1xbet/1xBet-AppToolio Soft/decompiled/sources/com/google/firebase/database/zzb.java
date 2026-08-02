package com.google.firebase.database;

import android.support.annotation.NonNull;
import com.google.android.gms.internal.firebase_database.zzit;
import com.google.android.gms.internal.firebase_database.zziz;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzb implements Iterator<DataSnapshot> {
    private final /* synthetic */ zza zzp;

    zzb(zza zzaVar) {
        this.zzp = zzaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzp.zzn.hasNext();
    }

    @Override // java.util.Iterator
    @NonNull
    public final /* synthetic */ DataSnapshot next() {
        DatabaseReference databaseReference;
        zziz zzizVar = (zziz) this.zzp.zzn.next();
        databaseReference = this.zzp.zzo.zzm;
        return new DataSnapshot(databaseReference.child(zzizVar.zzge().zzfg()), zzit.zzj(zzizVar.zzd()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
