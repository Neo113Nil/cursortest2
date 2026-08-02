package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public class HashAccumulator {
    private int zaa = 1;

    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(java.lang.Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean z) {
        this.zaa = (this.zaa * 31) + (z ? 1 : 0);
        return this;
    }

    public int hash() {
        return this.zaa;
    }
}
