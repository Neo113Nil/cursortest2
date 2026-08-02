package com.google.firebase.database;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zza implements Iterable<DataSnapshot> {
    final /* synthetic */ Iterator zzn;
    final /* synthetic */ DataSnapshot zzo;

    zza(DataSnapshot dataSnapshot, Iterator it) {
        this.zzo = dataSnapshot;
        this.zzn = it;
    }

    @Override // java.lang.Iterable
    public final Iterator<DataSnapshot> iterator() {
        return new zzb(this);
    }
}
