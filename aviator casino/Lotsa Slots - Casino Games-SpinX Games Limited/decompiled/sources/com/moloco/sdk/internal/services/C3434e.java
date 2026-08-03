package com.moloco.sdk.internal.services;

/* renamed from: com.moloco.sdk.internal.services.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3434e implements com.moloco.sdk.internal.services.InterfaceC3433d {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7264a;

    public C3434e(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7264a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3433d
    public com.moloco.sdk.internal.services.AbstractC3432c a() {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.f7264a));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.moloco.sdk.internal.services.AbstractC3432c abstractC3432c = null;
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) m10798constructorimpl;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                abstractC3432c = com.moloco.sdk.internal.services.AbstractC3432c.b.b;
            } else {
                java.lang.String id = info.getId();
                if (id != null) {
                    abstractC3432c = new com.moloco.sdk.internal.services.AbstractC3432c.a(id);
                }
            }
            if (abstractC3432c != null) {
                return abstractC3432c;
            }
        }
        return com.moloco.sdk.internal.services.AbstractC3432c.b.b;
    }
}
