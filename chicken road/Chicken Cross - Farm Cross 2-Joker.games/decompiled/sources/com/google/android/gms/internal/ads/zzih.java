package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzih extends zzht {
    public final int zzb;

    public zzih(zzhw zzhwVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzih zza(IOException iOException, zzhw zzhwVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzgts.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzig(iOException, zzhwVar) : new zzih(iOException, zzhwVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzih(IOException iOException, zzhw zzhwVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzih(String str, zzhw zzhwVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzih(String str, IOException iOException, zzhw zzhwVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
