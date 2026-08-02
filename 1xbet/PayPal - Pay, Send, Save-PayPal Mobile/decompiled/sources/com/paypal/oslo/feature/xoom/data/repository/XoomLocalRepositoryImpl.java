package com.paypal.oslo.feature.xoom.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/repository/XoomLocalRepositoryImpl;", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomLocalRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;Lcom/paypal/oslo/core/userstore/UserStore;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "getUserAgreementAccepted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "setUserAgreementAccepted", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class XoomLocalRepositoryImpl implements com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository {
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted Camera2StreamConfigurationMap = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("user_agreement_accepted.remittance");

    @javax.inject.Inject
    public XoomLocalRepositoryImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.userstore.UserStore userStore, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = appStorage;
        this.Camera2StreamConfigurationMap = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$userId(com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$1 xoomLocalRepositoryImpl$userId$1;
        int i;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded;
        com.paypal.oslo.core.userstore.model.User user;
        if (continuation instanceof com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$1) {
            xoomLocalRepositoryImpl$userId$1 = (com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$1) continuation;
            if ((xoomLocalRepositoryImpl$userId$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                xoomLocalRepositoryImpl$userId$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = xoomLocalRepositoryImpl$userId$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = xoomLocalRepositoryImpl$userId$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = xoomLocalRepositoryImpl.Camera2StreamConfigurationMap.getUserState();
                    com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$state$1 xoomLocalRepositoryImpl$userId$state$1 = new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$state$1(null);
                    xoomLocalRepositoryImpl$userId$1.getHighSpeedVideoSizes = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(userState, xoomLocalRepositoryImpl$userId$state$1, xoomLocalRepositoryImpl$userId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.core.userstore.model.UserState userState2 = (com.paypal.oslo.core.userstore.model.UserState) obj;
                profileLoaded = !(userState2 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState2 : null;
                if (profileLoaded != null || (user = profileLoaded.getUser()) == null) {
                    return null;
                }
                return user.getId();
            }
        }
        xoomLocalRepositoryImpl$userId$1 = new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$1(xoomLocalRepositoryImpl, continuation);
        java.lang.Object obj2 = xoomLocalRepositoryImpl$userId$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = xoomLocalRepositoryImpl$userId$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.core.userstore.model.UserState userState22 = (com.paypal.oslo.core.userstore.model.UserState) obj2;
        if (!(userState22 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
        }
        if (profileLoaded != null) {
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/repository/XoomLocalRepositoryImpl$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository
    public final java.lang.Object getUserAgreementAccepted(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$getUserAgreementAccepted$2(this, null), continuation);
    }

    @Override // com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository
    public final java.lang.Object setUserAgreementAccepted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$setUserAgreementAccepted$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.List access$parseUserIdList(com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl, java.lang.String str) {
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
        java.util.Iterator it = split$default.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.text.StringsKt.trim((java.lang.String) it.next()).toString());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
