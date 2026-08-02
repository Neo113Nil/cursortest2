package com.google.firebase.database;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzk implements Iterable<MutableData> {
    final /* synthetic */ MutableData zzan;
    final /* synthetic */ Iterator zzn;

    zzk(MutableData mutableData, Iterator it) {
        this.zzan = mutableData;
        this.zzn = it;
    }

    @Override // java.lang.Iterable
    public final Iterator<MutableData> iterator() {
        return new zzl(this);
    }
}
