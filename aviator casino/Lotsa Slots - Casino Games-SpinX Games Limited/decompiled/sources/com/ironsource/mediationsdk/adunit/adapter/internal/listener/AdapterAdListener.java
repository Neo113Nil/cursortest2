package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

/* loaded from: classes5.dex */
public interface AdapterAdListener {

    /* renamed from: com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onAdClicked();

    void onAdClicked(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str);

    void onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdLoadSuccess();

    void onAdLoadSuccess(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdOpened();

    void onAdOpened(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdShowFailed(int i, java.lang.String str);

    void onAdShowFailed(int i, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map);
}
