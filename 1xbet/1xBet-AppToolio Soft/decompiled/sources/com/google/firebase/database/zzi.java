package com.google.firebase.database;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzi implements Iterable<MutableData> {
    zzi(MutableData mutableData) {
    }

    @Override // java.lang.Iterable
    public final Iterator<MutableData> iterator() {
        return new zzj(this);
    }
}
