package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class zzgo extends zzfy {
    public final int zzb;

    public zzgo(zzgc zzgcVar, int i7, int i8) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgo zza(IOException iOException, zzgc zzgcVar, int i7) {
        int i8;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i8 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i8 = 1004;
        } else {
            i8 = (message == null || !zzfsn.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i8 == 2007 ? new zzgn(iOException, zzgcVar) : new zzgo(iOException, zzgcVar, i8, i7);
    }

    private static int zzb(int i7, int i8) {
        if (i7 == 2000) {
            return i8 != 1 ? 2000 : 2001;
        }
        return i7;
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
