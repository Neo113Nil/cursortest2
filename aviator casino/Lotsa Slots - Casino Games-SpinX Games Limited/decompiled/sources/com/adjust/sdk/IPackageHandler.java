package com.adjust.sdk;

/* loaded from: classes2.dex */
public interface IPackageHandler {
    void addPackage(com.adjust.sdk.ActivityPackage activityPackage);

    void flush();

    void init(com.adjust.sdk.IActivityHandler iActivityHandler, android.content.Context context, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendFirstPackage();

    void teardown();
}
