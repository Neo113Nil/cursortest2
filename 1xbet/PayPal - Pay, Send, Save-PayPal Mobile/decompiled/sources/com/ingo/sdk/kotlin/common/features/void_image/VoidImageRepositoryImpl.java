package com.ingo.sdk.kotlin.common.features.void_image;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/void_image/VoidImageRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/void_image/VoidImageRepository;", "Lcom/ingo/sdk/kotlin/common/features/void_image/VoidImageApi;", "voidImageApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/void_image/VoidImageApi;)V", "", "transactionReferenceNumber", "voidImageAsBase64", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/void_image/model/VoidImageResponse;", "uploadVoidImage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/void_image/VoidImageApi;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VoidImageRepositoryImpl implements com.ingo.sdk.kotlin.common.features.void_image.VoidImageRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi getHighSpeedVideoFpsRangesFor;

    public VoidImageRepositoryImpl(com.ingo.sdk.kotlin.common.features.void_image.VoidImageApi voidImageApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voidImageApi, "");
        this.getHighSpeedVideoFpsRangesFor = voidImageApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.void_image.VoidImageRepository
    public final java.lang.Object uploadVoidImage(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.uploadVoidImage(str, str2, continuation);
    }
}
