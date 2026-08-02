package com.google.android.gms.auth;

/* loaded from: classes8.dex */
public class GooglePlayServicesAvailabilityException extends com.google.android.gms.auth.UserRecoverableAuthException {
    private final int zza;

    GooglePlayServicesAvailabilityException(int i, java.lang.String str, android.content.Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
