package com.paypal.oslo.feature.taptopay.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/IntroPreferencesRepositoryImpl;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/IntroPreferencesRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", "hasSeenAnyIntro", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;", "entryPoint", "", "setHasSeenIntro", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntroPreferencesRepositoryImpl implements com.paypal.oslo.feature.taptopay.domain.repository.IntroPreferencesRepository {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Map<com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint, com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.ORGANIC, new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("has_seen_intro_organic")), kotlin.TuplesKt.to(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.PPDC, new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("has_seen_intro_ppdc")), kotlin.TuplesKt.to(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.ONBOARDING, new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("has_seen_intro_onboarding")));

    @javax.inject.Inject
    public IntroPreferencesRepositoryImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.Camera2StreamConfigurationMap = appStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:10:0x0096). Please report as a decompilation issue!!! */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.IntroPreferencesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object hasSeenAnyIntro(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl$hasSeenAnyIntro$1 introPreferencesRepositoryImpl$hasSeenAnyIntro$1;
        int i;
        java.util.Map<com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint, com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted> map;
        java.util.Iterator<java.util.Map.Entry<com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint, com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted>> it;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl$hasSeenAnyIntro$1) {
            introPreferencesRepositoryImpl$hasSeenAnyIntro$1 = (com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl$hasSeenAnyIntro$1) continuation;
            if ((introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getOutputMinFrameDuration;
                boolean z = false;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map<com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint, com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted> map2 = getHighResolutionOutputSizeshNQ4ISI;
                    if (!map2.isEmpty()) {
                        map = map2;
                        it = map2.entrySet().iterator();
                        i2 = 0;
                        if (it.hasNext()) {
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = introPreferencesRepositoryImpl$hasSeenAnyIntro$1.Camera2StreamConfigurationMap;
                i2 = introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getHighResolutionOutputSizeshNQ4ISI;
                it = (java.util.Iterator) introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getHighSpeedVideoFpsRangesFor;
                map = (java.util.Map) introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                    z = true;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                }
                if (it.hasNext()) {
                    java.util.Map.Entry<com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint, com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted> next = it.next();
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted value = next.getValue();
                    introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                    introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getHighSpeedVideoFpsRangesFor = it;
                    introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                    introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                    introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                    introPreferencesRepositoryImpl$hasSeenAnyIntro$1.Camera2StreamConfigurationMap = 0;
                    introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getOutputMinFrameDuration = 1;
                    obj = this.Camera2StreamConfigurationMap.getBoolean(value, introPreferencesRepositoryImpl$hasSeenAnyIntro$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                    }
                    if (it.hasNext()) {
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        introPreferencesRepositoryImpl$hasSeenAnyIntro$1 = new com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl$hasSeenAnyIntro$1(this, continuation);
        java.lang.Object obj2 = introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = introPreferencesRepositoryImpl$hasSeenAnyIntro$1.getOutputMinFrameDuration;
        boolean z2 = false;
        if (i != 0) {
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.IntroPreferencesRepository
    public final java.lang.Object setHasSeenIntro(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighResolutionOutputSizeshNQ4ISI.get(entryPoint);
        return (unencrypted != null && (obj = this.Camera2StreamConfigurationMap.setBoolean(unencrypted, true, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? obj : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/IntroPreferencesRepositoryImpl$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
