package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public interface FirebaseRemoteConfigValue {
    boolean asBoolean() throws java.lang.IllegalArgumentException;

    byte[] asByteArray();

    double asDouble() throws java.lang.IllegalArgumentException;

    long asLong() throws java.lang.IllegalArgumentException;

    java.lang.String asString();

    int getSource();
}
