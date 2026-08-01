package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public class zzige extends IOException {
    private boolean zza;

    public zzige(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }

    public zzige(String str) {
        super(str);
    }

    public zzige(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
