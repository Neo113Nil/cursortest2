package com.unity3d.services.store.gpbl.bridges.billingclient;

/* compiled from: BillingClientAdapterFactory.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0002J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapterFactory;", "", "()V", "createBillingClientAdapter", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "context", "Landroid/content/Context;", "createV6Adapter", "fallbackVersion", "", "createV8Adapter", "Lkotlin/Result;", "createV8Adapter-IoAF18A", "(Landroid/content/Context;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingClientAdapterFactory {
    public final com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter createBillingClientAdapter(android.content.Context context) {
        com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter createV6Adapter$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object m10380createV8AdapterIoAF18A = m10380createV8AdapterIoAF18A(context);
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10380createV8AdapterIoAF18A);
        if (m10801exceptionOrNullimpl != null) {
            if (m10801exceptionOrNullimpl instanceof com.unity3d.services.store.gpbl.bridges.billingclient.FallbackException) {
                createV6Adapter$default = createV6Adapter(context, ((com.unity3d.services.store.gpbl.bridges.billingclient.FallbackException) m10801exceptionOrNullimpl).getDetectedVersion());
            } else {
                createV6Adapter$default = createV6Adapter$default(this, context, 0, 2, null);
            }
            m10380createV8AdapterIoAF18A = createV6Adapter$default;
        }
        return (com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter) m10380createV8AdapterIoAF18A;
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final java.lang.Object m10380createV8AdapterIoAF18A(android.content.Context context) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory billingClientAdapterFactory = this;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.INSTANCE.newBuilder(context));
            if (new com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge(new java.lang.Object()).exists()) {
                return kotlin.Result.m10798constructorimpl(billingClientAdapter);
            }
            throw new com.unity3d.services.store.gpbl.bridges.billingclient.FallbackException(7);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    static /* synthetic */ com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter createV6Adapter$default(com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory billingClientAdapterFactory, android.content.Context context, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i);
    }

    private final com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter createV6Adapter(android.content.Context context, int fallbackVersion) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory billingClientAdapterFactory = this;
            com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge builder = com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.newBuilder(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "builder");
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(builder, fallbackVersion));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        return (com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter) m10798constructorimpl;
    }
}
