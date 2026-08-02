package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionValidationErrorResponse;", "Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionValidationErrorResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;", "getTransaction", "()Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;", "transaction", "Companion", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressResponse;", "Lcom/ingo/sdk/kotlin/common/core/http/response/VoidImageInReviewResponse;", "Lcom/ingo/sdk/kotlin/common/core/http/response/VoidImageRequiredResponse;", "Lcom/ingo/sdk/kotlin/common/core/http/response/VoidImageSoftDeclinedResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes9.dex */
public abstract class TransactionValidationErrorResponse extends com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse.Companion INSTANCE = new com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse.m10766$r8$lambda$kjZfA8QJcpvdgmfKOFw1tMO_vw();
        }
    });

    public abstract com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation getTransaction();

    public /* synthetic */ TransactionValidationErrorResponse(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
    }

    private TransactionValidationErrorResponse() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionValidationErrorResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionValidationErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse> serializer() {
            return (kotlinx.serialization.KSerializer) com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: $r8$lambda$kjZfA8QJcpv-dgmfKOFw1tMO_vw, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m10766$r8$lambda$kjZfA8QJcpvdgmfKOFw1tMO_vw() {
        return new kotlinx.serialization.SealedClassSerializer("com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.http.response.TransactionValidationErrorResponse.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressResponse.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.http.response.VoidImageInReviewResponse.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse.class)}, new kotlinx.serialization.KSerializer[]{com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressResponse$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.core.http.response.VoidImageInReviewResponse$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ TransactionValidationErrorResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
