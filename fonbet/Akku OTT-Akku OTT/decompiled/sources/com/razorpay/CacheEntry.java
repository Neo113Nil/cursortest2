package com.razorpay;

import java.io.Serializable;

/* loaded from: classes4.dex */
class CacheEntry implements Serializable {
    String data;
    long expiryTime;

    public CacheEntry(String str, long j) {
        this.data = str;
        this.expiryTime = j;
    }
}
