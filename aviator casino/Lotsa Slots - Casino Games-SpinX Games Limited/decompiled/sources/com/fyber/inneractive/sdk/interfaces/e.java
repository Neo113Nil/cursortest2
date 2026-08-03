package com.fyber.inneractive.sdk.interfaces;

/* loaded from: classes3.dex */
public interface e {
    void destroy();

    void disableCloseButton();

    void dismissAd(boolean z);

    android.view.View getCloseButton();

    android.view.ViewGroup getLayout();

    boolean isCloseButtonDisplay();

    void secondEndCardWasDisplayed();

    void setActivityOrientation(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation);

    void showCloseButton(boolean z, int i, int i2);

    void showCloseCountdown();

    void updateCloseCountdown(int i);

    boolean wasDismissedByUser();
}
