package com.paypal.oslo.feature.starpay.domain.utilities;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\f\u0010\rJE\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u000e\u0010\rJE\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u000f\u0010\rJE\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u0010\u0010\rJQ\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/starpay/domain/utilities/GooglePayClientLogger;", "", "Lcom/paypal/android/logger/Logger;", "logger", "<init>", "(Lcom/paypal/android/logger/Logger;)V", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "piiAttributes", "", "v", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "d", "i", "w", "", "error", "e", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Throwable;)V", "getHighSpeedVideoSizes", "Lcom/paypal/android/logger/Logger;", "Camera2StreamConfigurationMap", "externalLoggingAttributes", "Ljava/util/Map;", "getExternalLoggingAttributes", "()Ljava/util/Map;", "setExternalLoggingAttributes", "(Ljava/util/Map;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GooglePayClientLogger {
    public static final int $stable = 8;
    private java.util.Map<java.lang.String, ? extends java.lang.Object> externalLoggingAttributes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.logger.Logger Camera2StreamConfigurationMap;

    public GooglePayClientLogger(com.paypal.android.logger.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.Camera2StreamConfigurationMap = logger;
        this.externalLoggingAttributes = kotlin.collections.MapsKt.emptyMap();
    }

    public /* synthetic */ GooglePayClientLogger(com.paypal.android.logger.Logger logger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.starpay.LoggerKt.log : logger);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getExternalLoggingAttributes() {
        return this.externalLoggingAttributes;
    }

    public final void setExternalLoggingAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.externalLoggingAttributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v$default(com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger googlePayClientLogger, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        googlePayClientLogger.v(str, map, map2);
    }

    public final void v(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(piiAttributes, "");
        kotlin.collections.MapsKt.plus(attributes, this.externalLoggingAttributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d$default(com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger googlePayClientLogger, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        googlePayClientLogger.d(str, map, map2);
    }

    public final void d(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(piiAttributes, "");
        kotlin.collections.MapsKt.plus(attributes, this.externalLoggingAttributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i$default(com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger googlePayClientLogger, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        googlePayClientLogger.i(str, map, map2);
    }

    public final void i(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(piiAttributes, "");
        this.Camera2StreamConfigurationMap.i(message, kotlin.collections.MapsKt.plus(attributes, this.externalLoggingAttributes), piiAttributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void w$default(com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger googlePayClientLogger, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        googlePayClientLogger.w(str, map, map2);
    }

    public final void w(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(piiAttributes, "");
        this.Camera2StreamConfigurationMap.w(message, kotlin.collections.MapsKt.plus(attributes, this.externalLoggingAttributes), piiAttributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e$default(com.paypal.oslo.feature.starpay.domain.utilities.GooglePayClientLogger googlePayClientLogger, java.lang.String str, java.util.Map map, java.util.Map map2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 8) != 0) {
            th = null;
        }
        googlePayClientLogger.e(str, map, map2, th);
    }

    public final void e(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(piiAttributes, "");
        this.Camera2StreamConfigurationMap.e(message, kotlin.collections.MapsKt.plus(attributes, this.externalLoggingAttributes), piiAttributes, error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GooglePayClientLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
