package com.ironsource;

/* renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2997d0 implements com.ironsource.InterfaceC2979c0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3403zc f6194a;

    public C2997d0(com.ironsource.InterfaceC3403zc networkShowApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.f6194a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC2979c0
    public void a(android.app.Activity activity, com.ironsource.J9 adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f6194a.a(activity, adInstance, new java.util.HashMap());
    }

    @Override // com.ironsource.InterfaceC2979c0
    public boolean a(com.ironsource.J9 adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.f6194a.a(adInstance);
    }
}
