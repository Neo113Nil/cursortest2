package com.google.android.gms.internal.ads;

import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.iF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110iF extends Exception {

    /* renamed from: k, reason: collision with root package name */
    public final int f13926k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13927l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1110iF(int i, int i5, int i6, int i7, C1407p c1407p, boolean z3, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        String valueOf = String.valueOf(c1407p);
        StringBuilder w5 = AbstractC2107A.w("AudioTrack init failed ", i, " Config(", i5, ", ");
        w5.append(i6);
        w5.append(", ");
        w5.append(i7);
        w5.append(") ");
        w5.append(valueOf);
        w5.append(true != z3 ? "" : " (recoverable)");
        this.f13926k = i;
        this.f13927l = z3;
    }
}
