package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\u0018\u0012\b\u0012\u00060\tj\u0002`\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetPackageTrackingEmailLinkStatusUseCaseImpl;", "Lcom/paypal/oslo/feature/packagetracking/api/domain/usecase/GetPackageTrackingEmailLinkStatusUseCase;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetEmailLinkStatusUseCase;", "getEmailLinkStatus", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetEmailLinkStatusUseCase;)V", "", "forceRefresh", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lcom/paypal/oslo/feature/packagetracking/api/domain/model/EmailLinkInfo;", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetEmailLinkStatusUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPackageTrackingEmailLinkStatusUseCaseImpl implements com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetPackageTrackingEmailLinkStatusUseCaseImpl(com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase getEmailLinkStatusUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEmailLinkStatusUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getEmailLinkStatusUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo>>> continuation) {
        com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1 getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1) {
            getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1) continuation;
            if ((getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase getEmailLinkStatusUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = z;
                    getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getEmailLinkStatusUseCase.invoke(z, getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImplKt.access$toException((com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) right).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImplKt.access$toEmailLinkInfo((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) it.next()));
                    }
                    return new arrow.core.Either.Right(arrayList);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
