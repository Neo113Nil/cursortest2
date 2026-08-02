package com.google.android.material.motion;

/* loaded from: classes8.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(androidx.view.BackEventCompat backEventCompat);

    void updateBackProgress(androidx.view.BackEventCompat backEventCompat);
}
