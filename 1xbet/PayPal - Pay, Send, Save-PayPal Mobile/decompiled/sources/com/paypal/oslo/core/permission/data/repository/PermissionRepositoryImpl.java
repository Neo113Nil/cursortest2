package com.paypal.oslo.core.permission.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/permission/data/repository/PermissionRepositoryImpl;", "Lcom/paypal/oslo/core/permission/domain/repository/PermissionRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "wasPermissionRequestedBefore", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "markPermissionAsRequested", "clearPermissionRequestHistory", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PermissionRepositoryImpl implements com.paypal.oslo.core.permission.domain.repository.PermissionRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PermissionRepositoryImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.Camera2StreamConfigurationMap = appStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.permission.domain.repository.PermissionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object wasPermissionRequestedBefore(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl$wasPermissionRequestedBefore$1 permissionRepositoryImpl$wasPermissionRequestedBefore$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl$wasPermissionRequestedBefore$1) {
            permissionRepositoryImpl$wasPermissionRequestedBefore$1 = (com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl$wasPermissionRequestedBefore$1) continuation;
            if ((permissionRepositoryImpl$wasPermissionRequestedBefore$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                permissionRepositoryImpl$wasPermissionRequestedBefore$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = permissionRepositoryImpl$wasPermissionRequestedBefore$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = permissionRepositoryImpl$wasPermissionRequestedBefore$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted permissionRequestedBeforeKey = com.paypal.oslo.core.permission.data.storage.PermissionStorageKeys.INSTANCE.permissionRequestedBeforeKey(str);
                    permissionRepositoryImpl$wasPermissionRequestedBefore$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    permissionRepositoryImpl$wasPermissionRequestedBefore$1.Camera2StreamConfigurationMap = 1;
                    obj = appStorage.getBoolean(permissionRequestedBeforeKey, permissionRepositoryImpl$wasPermissionRequestedBefore$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        permissionRepositoryImpl$wasPermissionRequestedBefore$1 = new com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl$wasPermissionRequestedBefore$1(this, continuation);
        java.lang.Object obj2 = permissionRepositoryImpl$wasPermissionRequestedBefore$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = permissionRepositoryImpl$wasPermissionRequestedBefore$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    @Override // com.paypal.oslo.core.permission.domain.repository.PermissionRepository
    public final java.lang.Object markPermissionAsRequested(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.Camera2StreamConfigurationMap.setBoolean(com.paypal.oslo.core.permission.data.storage.PermissionStorageKeys.INSTANCE.permissionRequestedBeforeKey(str), true, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.permission.domain.repository.PermissionRepository
    public final java.lang.Object clearPermissionRequestHistory(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object remove = this.Camera2StreamConfigurationMap.remove(com.paypal.oslo.core.permission.data.storage.PermissionStorageKeys.INSTANCE.permissionRequestedBeforeKey(str), continuation);
        return remove == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? remove : kotlin.Unit.INSTANCE;
    }
}
