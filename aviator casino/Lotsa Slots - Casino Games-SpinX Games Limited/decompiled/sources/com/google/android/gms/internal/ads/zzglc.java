package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzglc extends java.lang.RuntimeException {
    public zzglc() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzglc(int i) {
        super(r1.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 3);
        sb.append("r: ");
        sb.append(i);
    }

    public zzglc(int i, java.lang.Throwable th) {
        super("r: 2", th);
    }
}
