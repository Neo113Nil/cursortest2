package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00008GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/commons/util/Log$Companion;", "Lcom/zettle/sdk/commons/util/Log;", "GdpClient$delegate", "Lkotlin/Lazy;", "getGdpClient", "(Lcom/zettle/sdk/commons/util/Log$Companion;)Lcom/zettle/sdk/commons/util/Log;", "GdpClient"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GdpKt {
    private static final kotlin.Lazy GdpClient$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.util.Log>() { // from class: com.zettle.sdk.analytics.GdpKt$GdpClient$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.commons.util.Log invoke() {
            return com.zettle.sdk.commons.util.Log.INSTANCE.get("GdpAnalyticsClient");
        }
    });

    public static final com.zettle.sdk.commons.util.Log getGdpClient(com.zettle.sdk.commons.util.Log.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (com.zettle.sdk.commons.util.Log) GdpClient$delegate.getValue();
    }
}
