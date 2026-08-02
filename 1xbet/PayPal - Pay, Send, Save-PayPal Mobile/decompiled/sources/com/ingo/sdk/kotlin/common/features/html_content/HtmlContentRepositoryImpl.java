package com.ingo.sdk.kotlin.common.features.html_content;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/html_content/HtmlContentRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/html_content/HtmlContentRepository;", "Lcom/ingo/sdk/kotlin/common/features/html_content/HtmlContentApi;", "htmlContentApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/html_content/HtmlContentApi;)V", "", "url", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "getHtmlContent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/kotlin/common/features/html_content/HtmlContentApi;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HtmlContentRepositoryImpl implements com.ingo.sdk.kotlin.common.features.html_content.HtmlContentRepository {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.html_content.HtmlContentApi getHighResolutionOutputSizeshNQ4ISI;

    public HtmlContentRepositoryImpl(com.ingo.sdk.kotlin.common.features.html_content.HtmlContentApi htmlContentApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlContentApi, "");
        this.getHighResolutionOutputSizeshNQ4ISI = htmlContentApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.html_content.HtmlContentRepository
    public final java.lang.Object getHtmlContent(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, java.lang.String>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHtmlContent(str, continuation);
    }
}
