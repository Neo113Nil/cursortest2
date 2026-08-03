package com.ironsource;

/* renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3313uc implements com.ironsource.InterfaceC3295tc {
    @Override // com.ironsource.InterfaceC3295tc
    public void a(com.ironsource.J9 adInstance, com.ironsource.C3331vc loadParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        com.ironsource.sdk.IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }

    @Override // com.ironsource.InterfaceC3295tc
    public java.lang.String a() {
        java.lang.String version = com.ironsource.sdk.IronSourceNetwork.getVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }
}
