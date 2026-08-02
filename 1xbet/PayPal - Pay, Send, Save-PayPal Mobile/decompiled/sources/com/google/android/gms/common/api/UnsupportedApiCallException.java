package com.google.android.gms.common.api;

/* loaded from: classes3.dex */
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature zza;

    public UnsupportedApiCallException(com.google.android.gms.common.Feature feature) {
        this.zza = feature;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return "Missing ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza)));
    }
}
