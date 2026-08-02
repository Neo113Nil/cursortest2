package com.paypal.oslo.feature.subscriptions.updatefi.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/navigation/result/UpdateFiChangedNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes15.dex */
public final class UpdateFiChangedNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult();
    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult.$r8$lambda$G2BSI8QrZBUhPFOX20MAhQlz9yY();
        }
    });

    private UpdateFiChangedNavResult() {
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$G2BSI8QrZBUhPFOX20MAhQlz9yY() {
        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult", INSTANCE, new java.lang.annotation.Annotation[0]);
    }

    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult> serializer() {
        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
    }
}
