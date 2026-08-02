package com.paypal.oslo.feature.bnplservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/PostSnoozeUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/BaseUseCase;", "", "<init>", "()V", "request", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PostSnoozeUseCase extends com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase<java.lang.String> {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase.Companion Companion = new com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase.Companion(null);

    @java.lang.Deprecated
    public static final long MOCK_DELAY_MS = 1000;

    @javax.inject.Inject
    public PostSnoozeUseCase() {
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return invoke2(str, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase$invoke$1 postSnoozeUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase$invoke$1) {
            postSnoozeUseCase$invoke$1 = (com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase$invoke$1) continuation;
            if ((postSnoozeUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                postSnoozeUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = postSnoozeUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postSnoozeUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    postSnoozeUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    postSnoozeUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, postSnoozeUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success(null, kotlin.Unit.INSTANCE, 1, null);
            }
        }
        postSnoozeUseCase$invoke$1 = new com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = postSnoozeUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postSnoozeUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success(null, kotlin.Unit.INSTANCE, 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/PostSnoozeUseCase$Companion;", "", "<init>", "()V", "", "MOCK_DELAY_MS", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
