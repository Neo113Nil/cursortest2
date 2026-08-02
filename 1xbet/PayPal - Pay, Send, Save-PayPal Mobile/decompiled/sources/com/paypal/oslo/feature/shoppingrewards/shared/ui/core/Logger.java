package com.paypal.oslo.feature.shoppingrewards.shared.ui.core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJE\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/Logger;", "", "<init>", "()V", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "piiAttributes", "", "logV", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "logW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Logger {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger();

    private Logger() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logV$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger logger, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        logger.logV(str, map, map2);
    }

    public final void logV(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(piiAttributes, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logW$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger logger, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        logger.logW(str, map, map2);
    }

    public final void logW(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(piiAttributes, "");
        com.paypal.oslo.feature.shoppingrewards.LoggerKt.log.w(message, attributes, piiAttributes);
    }
}
