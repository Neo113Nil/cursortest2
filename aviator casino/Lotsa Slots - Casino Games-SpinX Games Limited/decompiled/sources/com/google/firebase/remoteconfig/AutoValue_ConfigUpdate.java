package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
final class AutoValue_ConfigUpdate extends com.google.firebase.remoteconfig.ConfigUpdate {
    private final java.util.Set<java.lang.String> updatedKeys;

    AutoValue_ConfigUpdate(java.util.Set<java.lang.String> set) {
        if (set == null) {
            throw new java.lang.NullPointerException("Null updatedKeys");
        }
        this.updatedKeys = set;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    public java.util.Set<java.lang.String> getUpdatedKeys() {
        return this.updatedKeys;
    }

    public java.lang.String toString() {
        return "ConfigUpdate{updatedKeys=" + this.updatedKeys + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.firebase.remoteconfig.ConfigUpdate) {
            return this.updatedKeys.equals(((com.google.firebase.remoteconfig.ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    public int hashCode() {
        return this.updatedKeys.hashCode() ^ 1000003;
    }
}
