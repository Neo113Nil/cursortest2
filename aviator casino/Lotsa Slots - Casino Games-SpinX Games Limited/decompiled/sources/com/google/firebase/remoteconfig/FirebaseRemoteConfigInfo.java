package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public interface FirebaseRemoteConfigInfo {
    com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings getConfigSettings();

    long getFetchTimeMillis();

    int getLastFetchStatus();
}
