package com.google.android.gms.common;

/* loaded from: classes3.dex */
public class GooglePlayServicesManifestException extends java.lang.IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int i, java.lang.String str) {
        super(str);
        this.zza = i;
    }

    public int getExpectedVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public int getActualVersion() {
        return this.zza;
    }
}
