package com.unity3d.services.ads.gmascar.bridges.mobileads;

/* loaded from: classes5.dex */
public interface IMobileAdsBridge {
    com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion getAdapterVersion(int i);

    java.lang.Object getInitializationStatus();

    int getVersionCodeIndex();

    java.lang.String getVersionMethodName();

    java.lang.String getVersionString();

    void initialize(android.content.Context context, java.lang.Object obj);

    boolean shouldInitialize();
}
