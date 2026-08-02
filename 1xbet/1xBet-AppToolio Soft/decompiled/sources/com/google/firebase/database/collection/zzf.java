package com.google.firebase.database.collection;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzf implements Iterable<zzh> {
    private final int length;
    private long value;

    public zzf(int i) {
        int i2 = i + 1;
        this.length = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
        this.value = (((long) Math.pow(2.0d, this.length)) - 1) & i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzh> iterator() {
        return new zzg(this);
    }
}
