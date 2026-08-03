package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public class zziet extends java.io.IOException {
    private boolean zza;

    public zziet(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }

    public zziet(java.lang.String str) {
        super(str);
    }

    public zziet(java.lang.String str, java.io.IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
