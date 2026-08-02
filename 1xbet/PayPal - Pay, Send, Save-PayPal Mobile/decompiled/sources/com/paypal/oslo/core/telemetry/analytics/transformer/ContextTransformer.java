package com.paypal.oslo.core.telemetry.analytics.transformer;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0006\b\u0001\u0010\u0003 \u00012\u00020\u0001J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "T", "context", "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "canHandle", "(Ljava/lang/Object;)Z", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ContextTransformer<C, T> {
    kotlin.reflect.KClass<C> getType();

    T transform(C context);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <C, T> boolean canHandle(com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<C, ? extends T> contextTransformer, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            return com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer.super.canHandle(obj);
        }
    }

    default boolean canHandle(java.lang.Object context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return getType().isInstance(context);
    }
}
