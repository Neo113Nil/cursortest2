package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public interface ConfigUpdateListener {
    void onError(com.google.firebase.remoteconfig.FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(com.google.firebase.remoteconfig.ConfigUpdate configUpdate);
}
