package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzsg extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzsg(long j, long j2) {
        super(r2.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 63 + String.valueOf(j).length());
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j2);
        sb.append(", got ");
        sb.append(j);
    }
}
