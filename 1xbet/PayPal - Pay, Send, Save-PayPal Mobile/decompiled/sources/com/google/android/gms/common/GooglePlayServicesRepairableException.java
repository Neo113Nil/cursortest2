package com.google.android.gms.common;

/* loaded from: classes3.dex */
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, java.lang.String str, android.content.Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
