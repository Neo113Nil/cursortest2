package com.paypal.oslo.feature.packagetracking.api.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u0018\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦B¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/api/domain/usecase/GetPackageTrackingEmailLinkStatusUseCase;", "", "", "forceRefresh", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lcom/paypal/oslo/feature/packagetracking/api/domain/model/EmailLinkInfo;", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GetPackageTrackingEmailLinkStatusUseCase {
    java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo>>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase getPackageTrackingEmailLinkStatusUseCase, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return getPackageTrackingEmailLinkStatusUseCase.invoke(z, continuation);
    }
}
