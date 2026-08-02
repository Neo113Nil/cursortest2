package com.ingo.sdk.kotlin.common.features.html_content;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\r\u001a\u00020\n8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/html_content/GetHtmlContentUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/html_content/HtmlContentRepository;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetHtmlContentUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<java.lang.String, java.lang.String> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((java.lang.String) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, java.lang.String>>) continuation);
    }

    public GetHtmlContentUseCase() {
        super(0L, 1, null);
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.html_content.GetHtmlContentUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.html_content.GetHtmlContentUseCase.$r8$lambda$5p1rXrl7l3g1MPtkT8mgEzFM1Yw();
            }
        });
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.html_content.HtmlContentRepository $r8$lambda$5p1rXrl7l3g1MPtkT8mgEzFM1Yw() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.html_content.HtmlContentRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.html_content.HtmlContentRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.html_content.HtmlContentRepository");
    }

    public final java.lang.Object run(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, java.lang.String>> continuation) {
        return ((com.ingo.sdk.kotlin.common.features.html_content.HtmlContentRepository) this.Camera2StreamConfigurationMap.getValue()).getHtmlContent(str, continuation);
    }
}
