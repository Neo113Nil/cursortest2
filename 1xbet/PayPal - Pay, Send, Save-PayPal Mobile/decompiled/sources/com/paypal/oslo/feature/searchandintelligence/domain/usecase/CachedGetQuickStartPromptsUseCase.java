package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CachedGetQuickStartPromptsUseCase;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetQuickStartPromptsUseCase;", "getQuickStartPromptsUseCase", "Lcom/paypal/oslo/feature/searchandintelligence/domain/cache/QuickStartPromptsCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetQuickStartPromptsUseCase;Lcom/paypal/oslo/feature/searchandintelligence/domain/cache/QuickStartPromptsCache;)V", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetQuickStartPromptsUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/searchandintelligence/domain/cache/QuickStartPromptsCache;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CachedGetQuickStartPromptsUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CachedGetQuickStartPromptsUseCase(com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase getQuickStartPromptsUseCase, com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache quickStartPromptsCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getQuickStartPromptsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quickStartPromptsCache, "");
        this.Camera2StreamConfigurationMap = getQuickStartPromptsUseCase;
        this.getHighSpeedVideoSizes = quickStartPromptsCache;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> continuation) {
        com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase$invoke$1 cachedGetQuickStartPromptsUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        java.lang.Object value;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> list;
        if (continuation instanceof com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase$invoke$1) {
            cachedGetQuickStartPromptsUseCase$invoke$1 = (com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase$invoke$1) continuation;
            if ((cachedGetQuickStartPromptsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cachedGetQuickStartPromptsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cachedGetQuickStartPromptsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cachedGetQuickStartPromptsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> prompts = this.getHighSpeedVideoSizes.getPrompts();
                    if (!prompts.isEmpty()) {
                        return prompts;
                    }
                    com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetQuickStartPromptsUseCase getQuickStartPromptsUseCase = this.Camera2StreamConfigurationMap;
                    cachedGetQuickStartPromptsUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    cachedGetQuickStartPromptsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getQuickStartPromptsUseCase.invoke(cachedGetQuickStartPromptsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = cachedGetQuickStartPromptsUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    value = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    value = ((arrow.core.Either.Right) either).getValue();
                }
                list = (java.util.List) value;
                if (!list.isEmpty()) {
                    this.getHighSpeedVideoSizes.update(list);
                }
                return list;
            }
        }
        cachedGetQuickStartPromptsUseCase$invoke$1 = new com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = cachedGetQuickStartPromptsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cachedGetQuickStartPromptsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        list = (java.util.List) value;
        if (!list.isEmpty()) {
        }
        return list;
    }
}
