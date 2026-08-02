package com.android.pinpad;

/* loaded from: classes7.dex */
public interface PaymentFlowManager {
    java.lang.String formatAmountForTts(long j);

    int[] getSupportedAccessibilityModes();

    int[] getSupportedAccessibilityTypesForMode(int i);

    void lockUi(com.android.pinpad.UiLock uiLock);

    void playInstruction(long j, java.lang.String str);

    void setAccessibilityMode(int i, int i2);

    void setLanguage(java.lang.String str);

    @java.lang.Deprecated
    void setLedLightsVisibility(boolean z);

    void setNightMode(int i);

    void stopPlayingInstruction(long j);
}
