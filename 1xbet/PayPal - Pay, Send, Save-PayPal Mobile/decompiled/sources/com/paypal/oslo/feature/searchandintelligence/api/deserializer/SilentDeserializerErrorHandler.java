package com.paypal.oslo.feature.searchandintelligence.api.deserializer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/SilentDeserializerErrorHandler;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializerErrorHandler;", "<init>", "()V", "", "componentName", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;", "", "handleError", "(Ljava/lang/String;Ljava/lang/Throwable;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SilentDeserializerErrorHandler implements com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.api.deserializer.SilentDeserializerErrorHandler INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.deserializer.SilentDeserializerErrorHandler();

    private SilentDeserializerErrorHandler() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler
    public final arrow.core.Either handleError(java.lang.String componentName, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.INSTANCE.fromException(componentName, throwable));
    }
}
