package com.knotapi.knot.interfaces;

/* loaded from: classes9.dex */
public interface MerchantWebViewDelegate {
    void callTimeOutErrorCallback(int i);

    void evaluateJS(java.lang.String str);

    void onTryAgain(com.knotapi.knot.models.Bot bot);

    void removeFragment(int i, boolean z);

    void sendBotCustomEvent(com.knotapi.knot.models.CustomEvent customEvent);

    void sendNativeLogEvent(com.knotapi.knot.models.MerchantWebViewData merchantWebViewData);

    void sendNativeLogEvent(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void sendRunningEvent(int i, java.lang.String str, java.lang.String str2, com.knotapi.knot.models.ExtraInfo extraInfo, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4);

    void sendUserActionEvent(int i);

    void setNeedTimeOutCall(boolean z);

    void userCloseMerchantView(int i, int i2);
}
