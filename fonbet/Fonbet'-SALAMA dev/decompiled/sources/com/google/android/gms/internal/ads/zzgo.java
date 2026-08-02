package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class zzgo extends zzfy {
    public final int zzb;

    public zzgo(zzgc zzgcVar, int i7, int i8) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgo zza(IOException iOException, zzgc zzgcVar, int i7) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzfsn.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new zzgn(iOException, zzgcVar) : new zzgo(iOException, zzgcVar, i8, i7);
    }

    private static int zzb(int i7, int i8) {
        return i7 == 2000 ? i8 != 1 ? 2000 : 2001 : i7;
    }

    public zzgo(IOException iOException, zzgc zzgcVar, int i7, int i8) {
        super(iOException, zzb(i7, i8));
        this.zzb = i8;
    }

    public zzgo(String str, zzgc zzgcVar, int i7, int i8) {
        super(str, zzb(i7, i8));
        this.zzb = i8;
    }

    public zzgo(String str, IOException iOException, zzgc zzgcVar, int i7, int i8) {
        super(str, iOException, zzb(i7, i8));
        this.zzb = i8;
    }
}
