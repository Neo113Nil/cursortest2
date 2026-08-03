package com.ironsource.mediationsdk.adunit.adapter.listener;

/* loaded from: classes5.dex */
public interface NetworkInitializationListener {

    /* renamed from: com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onInitFailed(int i, java.lang.String str);

    void onInitFailed(int i, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map);

    void onInitSuccess();

    void onInitSuccess(java.util.Map<java.lang.String, java.lang.Object> map);
}
