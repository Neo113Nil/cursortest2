package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zznj extends java.lang.IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zznj(int i, int i2) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
    }
}
