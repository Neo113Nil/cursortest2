package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "p1", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase;", "p2", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor;", "p3", "Lkotlinx/coroutines/CoroutineScope;", "p4", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository;Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase;Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor;Lkotlinx/coroutines/CoroutineScope;)V", "", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase$Result;", "", "invoke", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitFailedAnalyticsUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ConfigurationInitUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository getHighSpeedVideoSizes;
    private final com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase Camera2StreamConfigurationMap;

    public ConfigurationInitUseCaseImpl(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository configurationInitRepository, com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics, com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase configurationInitFailedAnalyticsUseCase, com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor preRequisiteInteractor, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInitRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(herdAnalytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInitFailedAnalyticsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preRequisiteInteractor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = configurationInitRepository;
        this.getHighSpeedVideoFpsRangesFor = herdAnalytics;
        this.Camera2StreamConfigurationMap = configurationInitFailedAnalyticsUseCase;
        this.getHighSpeedVideoFpsRanges = preRequisiteInteractor;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, ? extends kotlin.Unit> function1) {
        invoke2(str, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.String p0, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result validate = this.getHighSpeedVideoFpsRanges.validate();
        if (validate instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Success) {
            com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(this.getHighResolutionOutputSizeshNQ4ISI, new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl$invoke$1(p0, this, p1, null));
        } else if (validate instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Failed) {
            com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Failed failed = (com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Failed) validate;
            this.Camera2StreamConfigurationMap.invoke(failed.getReason().toString());
            p1.invoke(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Failed(failed.getReason()));
        }
    }
}
