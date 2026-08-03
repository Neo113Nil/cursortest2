package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

/* loaded from: classes5.dex */
public interface AdapterAdViewListener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener {

    /* renamed from: com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onAdLeftApplication();

    void onAdLeftApplication(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdLoadSuccess(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams);

    void onAdLoadSuccess(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdScreenDismissed();

    void onAdScreenDismissed(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdScreenPresented();

    void onAdScreenPresented(java.util.Map<java.lang.String, java.lang.Object> map);
}
