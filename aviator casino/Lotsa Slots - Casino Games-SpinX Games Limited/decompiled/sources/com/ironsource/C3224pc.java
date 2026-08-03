package com.ironsource;

/* renamed from: com.ironsource.pc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3224pc implements com.ironsource.InterfaceC3206oc {
    @Override // com.ironsource.InterfaceC3206oc
    public void a(com.ironsource.Lc onNetworkSDKInitListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        com.ironsource.sdk.IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC3206oc
    public void b(java.lang.String controllerUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        com.ironsource.sdk.utils.SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC3206oc
    public void a(android.content.Context applicationContext, java.lang.String applicationKey, java.lang.String userId, java.util.Map<java.lang.String, java.lang.String> initParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initParams, "initParams");
        com.ironsource.sdk.IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC3206oc
    public void a(java.lang.String controllerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        com.ironsource.sdk.utils.SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC3206oc
    public void a(int i) {
        com.ironsource.sdk.utils.SDKUtils.setDebugMode(i);
    }
}
