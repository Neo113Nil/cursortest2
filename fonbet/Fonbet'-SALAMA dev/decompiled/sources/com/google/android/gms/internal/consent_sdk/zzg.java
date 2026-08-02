package com.google.android.gms.internal.consent_sdk;

import B3.i;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i7, String str) {
        super(str);
        this.zza = i7;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final i zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new i(this.zza, super.getMessage());
    }

    public zzg(int i7, String str, Throwable th) {
        super(str, th);
        this.zza = i7;
    }
}
