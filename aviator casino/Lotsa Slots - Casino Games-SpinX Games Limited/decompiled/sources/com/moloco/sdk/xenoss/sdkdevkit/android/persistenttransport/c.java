package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f7994a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.b();
        }
    });

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a a() {
        return c();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.b b() {
        return d();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.b c() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.b) f7994a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.b d() {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d b;
        try {
            b = com.moloco.sdk.service_locator.a.i.f7350a.c();
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "BestAttemptHttpRequest", "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest", e, false, 8, null);
            b = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.b();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.b(b);
    }
}
