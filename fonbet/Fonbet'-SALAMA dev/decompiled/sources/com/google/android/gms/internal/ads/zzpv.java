package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
public final class zzpv extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpv(long j, long j3) {
        super(r5.toString());
        StringBuilder j7 = k.j("Unexpected audio track timestamp discontinuity: expected ", ", got ", j3);
        j7.append(j);
    }
}
