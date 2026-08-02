package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zam {
    private final int zaa;
    private final com.google.android.gms.common.ConnectionResult zab;

    zam(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionResult);
        this.zab = connectionResult;
        this.zaa = i;
    }

    final com.google.android.gms.common.ConnectionResult zab() {
        return this.zab;
    }

    final int zaa() {
        return this.zaa;
    }
}
