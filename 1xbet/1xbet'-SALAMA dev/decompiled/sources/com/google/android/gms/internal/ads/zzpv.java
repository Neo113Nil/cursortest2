package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzpv extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzpv(long j, long j3) {
        StringBuilder sbJ = k.j("Unexpected audio track timestamp discontinuity: expected ", ", got ", j3);
        sbJ.append(j);
        super(sbJ.toString());
    }
}
