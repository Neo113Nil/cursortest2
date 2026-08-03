package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzie extends com.google.android.gms.internal.ads.zzhq {
    public final int zzb;

    public zzie(com.google.android.gms.internal.ads.zzht zzhtVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static com.google.android.gms.internal.ads.zzie zza(java.io.IOException iOException, com.google.android.gms.internal.ads.zzht zzhtVar, int i) {
        java.lang.String message = iOException.getMessage();
        int i2 = iOException instanceof java.net.SocketTimeoutException ? 2002 : iOException instanceof java.io.InterruptedIOException ? 1004 : (message == null || !com.google.android.gms.internal.ads.zzgss.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new com.google.android.gms.internal.ads.zzid(iOException, zzhtVar) : new com.google.android.gms.internal.ads.zzie(iOException, zzhtVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzie(java.io.IOException iOException, com.google.android.gms.internal.ads.zzht zzhtVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzie(java.lang.String str, com.google.android.gms.internal.ads.zzht zzhtVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzie(java.lang.String str, java.io.IOException iOException, com.google.android.gms.internal.ads.zzht zzhtVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
