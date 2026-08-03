package com.unity3d.services.ads.adunit;

/* loaded from: classes5.dex */
public interface IAdUnitViewHandler {
    boolean create(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity);

    boolean destroy();

    android.view.View getView();

    void onCreate(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity, android.os.Bundle bundle);

    void onDestroy(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity);

    void onPause(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity);

    void onResume(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity);

    void onStart(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity);

    void onStop(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity);
}
