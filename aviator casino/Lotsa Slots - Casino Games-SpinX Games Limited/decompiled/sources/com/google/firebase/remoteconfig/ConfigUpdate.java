package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public abstract class ConfigUpdate {
    public abstract java.util.Set<java.lang.String> getUpdatedKeys();

    public static com.google.firebase.remoteconfig.ConfigUpdate create(java.util.Set<java.lang.String> set) {
        return new com.google.firebase.remoteconfig.AutoValue_ConfigUpdate(set);
    }
}
