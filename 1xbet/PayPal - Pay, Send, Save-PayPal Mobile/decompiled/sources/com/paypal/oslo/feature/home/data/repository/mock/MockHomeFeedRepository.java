package com.paypal.oslo.feature.home.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\rJ\"\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ6\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n0\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/home/data/repository/mock/MockHomeFeedRepository;", "Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "homeConfigManager", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator;", "demoErrorSimulator", "<init>", "(Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "getSections", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeFeedSections", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "fetchAccountSnapshot", "", "sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "retrySection", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator;", "getHighSpeedVideoFpsRanges", "", "Ljava/util/Set;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MockHomeFeedRepository implements com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.featureflags.HomeConfigManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository.Companion Companion = new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockHomeFeedRepository(com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager, com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator demoErrorSimulator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demoErrorSimulator, "");
        this.getHighSpeedVideoFpsRangesFor = homeConfigManager;
        this.getHighSpeedVideoFpsRanges = demoErrorSimulator;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.home.domain.model.SectionTypes.HERO_PRODUCT, com.paypal.oslo.feature.home.domain.model.SectionTypes.DECK_CARD, com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, com.paypal.oslo.feature.home.domain.model.SectionTypes.LARGE_TILE, com.paypal.oslo.feature.home.domain.model.SectionTypes.FANNED_CAROUSEL});
    }

    @Override // com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository
    public final java.lang.Object getSections(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>> continuation) {
        return this.getHighSpeedVideoFpsRanges.injectOrExecute(new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$getSections$2(this, null), continuation);
    }

    @Override // com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository
    public final java.lang.Object getHomeFeedSections(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>> continuation) {
        return this.getHighSpeedVideoFpsRanges.injectOrExecute(new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$getHomeFeedSections$2(this, null), continuation);
    }

    @Override // com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository
    public final java.lang.Object fetchAccountSnapshot(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem>>> continuation) {
        return this.getHighSpeedVideoFpsRanges.injectOrExecute(new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$fetchAccountSnapshot$2(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object retrySection(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>> continuation) {
        com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$retrySection$1 mockHomeFeedRepository$retrySection$1;
        int i;
        com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior retryBehavior$default;
        if (continuation instanceof com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$retrySection$1) {
            mockHomeFeedRepository$retrySection$1 = (com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$retrySection$1) continuation;
            if ((mockHomeFeedRepository$retrySection$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockHomeFeedRepository$retrySection$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockHomeFeedRepository$retrySection$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockHomeFeedRepository$retrySection$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockHomeFeedRepository$retrySection$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    mockHomeFeedRepository$retrySection$1.getHighSpeedVideoFpsRanges = str2;
                    mockHomeFeedRepository$retrySection$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockHomeFeedRepository$retrySection$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) mockHomeFeedRepository$retrySection$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) mockHomeFeedRepository$retrySection$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                retryBehavior$default = com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.getRetryBehavior$default(this.getHighSpeedVideoFpsRanges, str, 0, 2, null);
                if (!(retryBehavior$default instanceof com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldSucceed)) {
                    java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> Camera2StreamConfigurationMap = com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedData.INSTANCE.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.isAdInFeedEnabled());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : Camera2StreamConfigurationMap) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.home.domain.model.Section) obj2).getId(), str)) {
                            arrayList.add(obj2);
                        }
                    }
                    return new arrow.core.Ior.Right(getHighResolutionOutputSizeshNQ4ISI(arrayList));
                }
                if (retryBehavior$default instanceof com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail) {
                    com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail shouldFail = (com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldFail) retryBehavior$default;
                    return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRanges.createSectionError$home_prodRelease(str, shouldFail.getError(), shouldFail.getExhausted(), str2)));
                }
                if (!(retryBehavior$default instanceof com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.NoErrorConfigured)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> Camera2StreamConfigurationMap2 = com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedData.INSTANCE.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.isAdInFeedEnabled());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : Camera2StreamConfigurationMap2) {
                    com.paypal.oslo.feature.home.domain.model.Section section = (com.paypal.oslo.feature.home.domain.model.Section) obj3;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(section.getId(), str) || kotlin.text.StringsKt.startsWith$default(section.getId(), str, false, 2, (java.lang.Object) null)) {
                        arrayList2.add(obj3);
                    }
                }
                return new arrow.core.Ior.Right(getHighResolutionOutputSizeshNQ4ISI(arrayList2));
            }
        }
        mockHomeFeedRepository$retrySection$1 = new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$retrySection$1(this, continuation);
        java.lang.Object obj4 = mockHomeFeedRepository$retrySection$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockHomeFeedRepository$retrySection$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        retryBehavior$default = com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.getRetryBehavior$default(this.getHighSpeedVideoFpsRanges, str, 0, 2, null);
        if (!(retryBehavior$default instanceof com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator.RetryBehavior.ShouldSucceed)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> list) {
        if (this.getHighSpeedVideoFpsRangesFor.isSearchIntelligenceEnabled()) {
            return list;
        }
        java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.home.domain.model.Section section = (com.paypal.oslo.feature.home.domain.model.Section) it.next();
            if (this.getHighResolutionOutputSizeshNQ4ISI.contains(section.getType())) {
                section = section.copy((r18 & 1) != 0 ? section.id : null, (r18 & 2) != 0 ? section.type : null, (r18 & 4) != 0 ? section.title : null, (r18 & 8) != 0 ? section.subtitle : null, (r18 & 16) != 0 ? section.items : null, (r18 & 32) != 0 ? section.buttonText : null, (r18 & 64) != 0 ? section.ctaPrompt : "", (r18 & 128) != 0 ? section.instrumentation : null);
            }
            arrayList.add(section);
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/data/repository/mock/MockHomeFeedRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
