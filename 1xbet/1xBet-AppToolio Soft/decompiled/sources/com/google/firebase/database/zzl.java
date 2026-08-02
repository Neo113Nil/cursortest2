package com.google.firebase.database;

import android.support.annotation.NonNull;
import com.google.android.gms.internal.firebase_database.zzch;
import com.google.android.gms.internal.firebase_database.zzdx;
import com.google.android.gms.internal.firebase_database.zziz;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzl implements Iterator<MutableData> {
    private final /* synthetic */ zzk zzao;

    zzl(zzk zzkVar) {
        this.zzao = zzkVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzao.zzn.hasNext();
    }

    @Override // java.util.Iterator
    @NonNull
    public final /* synthetic */ MutableData next() {
        zzdx zzdxVar;
        zzch zzchVar;
        zziz zzizVar = (zziz) this.zzao.zzn.next();
        zzdxVar = this.zzao.zzan.zzal;
        zzchVar = this.zzao.zzan.zzam;
        return new MutableData(zzdxVar, zzchVar.zza(zzizVar.zzge()), null);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
