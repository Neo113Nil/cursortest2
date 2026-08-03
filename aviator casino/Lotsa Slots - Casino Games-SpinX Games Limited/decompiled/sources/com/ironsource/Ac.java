package com.ironsource;

/* loaded from: classes5.dex */
public final class Ac implements com.ironsource.InterfaceC3403zc {
    @Override // com.ironsource.InterfaceC3403zc
    public void a(android.app.Activity activity, com.ironsource.J9 adInstance, java.util.Map<java.lang.String, java.lang.String> showParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showParams, "showParams");
        com.ironsource.sdk.IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.InterfaceC3403zc
    public boolean a(com.ironsource.J9 adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return com.ironsource.sdk.IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
