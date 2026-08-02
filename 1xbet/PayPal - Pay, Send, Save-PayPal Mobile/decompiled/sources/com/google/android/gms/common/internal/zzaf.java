package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class zzaf extends java.lang.Exception {
    public final com.google.android.gms.common.ConnectionResult zza;

    public zzaf(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(connectionResult.hasResolution(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.zza = connectionResult;
    }
}
