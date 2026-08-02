package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zabs {
    private final com.google.android.gms.common.api.internal.ApiKey zaa;
    private final com.google.android.gms.common.Feature zab;

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.google.android.gms.common.api.internal.zabs)) {
            return false;
        }
        com.google.android.gms.common.api.internal.zabs zabsVar = (com.google.android.gms.common.api.internal.zabs) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zaa, zabsVar.zaa) && com.google.android.gms.common.internal.Objects.equal(this.zab, zabsVar.zab);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zaa, this.zab);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
    }

    /* synthetic */ zabs(com.google.android.gms.common.api.internal.ApiKey apiKey, com.google.android.gms.common.Feature feature, com.google.android.gms.common.api.internal.zabr zabrVar) {
        this.zaa = apiKey;
        this.zab = feature;
    }
}
