package com.knotapi.knot.interfaces;

/* loaded from: classes9.dex */
public interface MerchantViewListener {
    void hideBottomFragment();

    boolean isErrorViewVisible();

    boolean isLoaderVisible();

    void loadTransactionUrl(java.lang.String str);

    void sendPageUrl(java.lang.String str);

    void sendRunningEvent(java.lang.String str, java.lang.String str2);

    void setLoaderVisibility(int i);

    void showErrorView(java.lang.String str);

    void toggleBackButton(boolean z);
}
