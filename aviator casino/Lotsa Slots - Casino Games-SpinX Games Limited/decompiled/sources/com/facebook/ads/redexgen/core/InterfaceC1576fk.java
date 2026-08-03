package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1576fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z, int i);

    void AK1(int i);

    void AK6(com.facebook.ads.redexgen.core.EnumC1523et enumC1523et, int i);

    void AKF(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    com.facebook.ads.redexgen.core.EnumC1523et getStartReason();

    com.facebook.ads.redexgen.core.EnumC1578fm getState();

    int getVideoHeight();

    int getVideoWidth();

    android.view.View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(android.view.View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(java.lang.String str);

    void setVideoStateChangeListener(com.facebook.ads.redexgen.core.InterfaceC1579fn interfaceC1579fn);

    void setup(android.net.Uri uri);
}
