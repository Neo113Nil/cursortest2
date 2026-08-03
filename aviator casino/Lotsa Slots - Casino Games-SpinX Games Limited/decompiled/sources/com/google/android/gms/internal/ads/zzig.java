package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzig extends com.google.android.gms.internal.ads.zzie {
    public final int zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzig(int i, java.lang.String str, java.io.IOException iOException, java.util.Map map, com.google.android.gms.internal.ads.zzht zzhtVar, byte[] bArr) {
        super(r10.toString(), iOException, zzhtVar, 2004, 1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 15);
        sb.append("Response code: ");
        sb.append(i);
        this.zzc = i;
    }
}
