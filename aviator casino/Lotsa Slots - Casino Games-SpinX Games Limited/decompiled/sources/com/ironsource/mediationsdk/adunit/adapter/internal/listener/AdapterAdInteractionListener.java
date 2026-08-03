package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

/* loaded from: classes5.dex */
public interface AdapterAdInteractionListener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener {

    /* renamed from: com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onAdClosed();

    void onAdClosed(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdEnded();

    void onAdEnded(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdStarted();

    void onAdStarted(java.util.Map<java.lang.String, java.lang.Object> map);

    void onAdVisible();

    void onAdVisible(java.util.Map<java.lang.String, java.lang.Object> map);
}
