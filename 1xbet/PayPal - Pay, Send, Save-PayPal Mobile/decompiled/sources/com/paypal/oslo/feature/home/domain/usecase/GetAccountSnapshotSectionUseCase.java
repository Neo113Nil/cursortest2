package com.paypal.oslo.feature.home.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/usecase/GetAccountSnapshotSectionUseCase;", "", "Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;", "repository", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;Lcom/paypal/oslo/feature/home/domain/StringProvider;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetAccountSnapshotSectionUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.StringProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetAccountSnapshotSectionUseCase(com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository homeFeedRepository, com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeFeedRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        this.getHighSpeedVideoFpsRangesFor = homeFeedRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = stringProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.home.domain.model.Section<?>>> continuation) {
        com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase$invoke$1 getAccountSnapshotSectionUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase$invoke$1) {
            getAccountSnapshotSectionUseCase$invoke$1 = (com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase$invoke$1) continuation;
            if ((getAccountSnapshotSectionUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getAccountSnapshotSectionUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getAccountSnapshotSectionUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAccountSnapshotSectionUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository homeFeedRepository = this.getHighSpeedVideoFpsRangesFor;
                    getAccountSnapshotSectionUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = homeFeedRepository.fetchAccountSnapshot(getAccountSnapshotSectionUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    return new arrow.core.Ior.Both(callError, new com.paypal.oslo.feature.home.domain.model.Section(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository.ACCOUNT_SNAPSHOT_SECTION_ID, "Error", (java.lang.String) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.home.domain.model.SectionError(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository.ACCOUNT_SNAPSHOT_SECTION_ID, com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT, this.getHighResolutionOutputSizeshNQ4ISI.getUnableToLoadSectionErrorMessage(), false, callError)), (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 192, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right((com.paypal.oslo.feature.home.domain.model.Section) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return new arrow.core.Ior.Both((com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue(), (com.paypal.oslo.feature.home.domain.model.Section) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getAccountSnapshotSectionUseCase$invoke$1 = new com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getAccountSnapshotSectionUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAccountSnapshotSectionUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
