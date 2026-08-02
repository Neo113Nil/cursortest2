package com.razorpay;

import androidx.core.os.EnvironmentCompat;

/* loaded from: classes4.dex */
enum NetworkType {
    WIFI("wifi"),
    CELLULAR("cellular"),
    BLUETOOTH("bluetooth"),
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);

    private String mNetworkTypeName;

    NetworkType(String str) {
        this.mNetworkTypeName = str;
    }

    public String getNetworkTypeName() {
        return this.mNetworkTypeName;
    }
}
