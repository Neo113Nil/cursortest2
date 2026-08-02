package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class zal {
    private final android.util.SparseIntArray zaa;
    private com.google.android.gms.common.GoogleApiAvailabilityLight zab;

    public zal() {
        this(com.google.android.gms.common.GoogleApiAvailability.getInstance());
    }

    public final int zaa(android.content.Context context, int i) {
        return this.zaa.get(i, -1);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int zab(android.content.Context context, com.google.android.gms.common.api.Api.Client client) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int zaa = zaa(context, minApkVersion);
        if (zaa != -1) {
            return zaa;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.zaa.size()) {
                i = -1;
                break;
            }
            int keyAt = this.zaa.keyAt(i2);
            if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.zaa.put(minApkVersion, i);
        return i;
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new android.util.SparseIntArray();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
