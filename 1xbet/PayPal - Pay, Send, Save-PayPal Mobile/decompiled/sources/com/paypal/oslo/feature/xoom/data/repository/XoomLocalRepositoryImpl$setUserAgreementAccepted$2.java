package com.paypal.oslo.feature.xoom.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$setUserAgreementAccepted$2", f = "XoomLocalRepositoryImpl.kt", i = {1, 2, 2}, l = {49, 51, 54}, m = "invokeSuspend", n = {"currentUserId", "currentUserId", "userIdList"}, nl = {51, 53, 56}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes16.dex */
final class XoomLocalRepositoryImpl$setUserAgreementAccepted$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object access$userId;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted;
        java.lang.Object string;
        java.lang.String str;
        com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl;
        java.util.List access$parseUserIdList;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            access$userId = com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.access$userId(this.getHighSpeedVideoFpsRangesFor, this);
            if (access$userId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                xoomLocalRepositoryImpl = (com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl) this.getHighSpeedVideoSizes;
                java.lang.String str2 = (java.lang.String) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                str = str2;
                string = obj;
                access$parseUserIdList = com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.access$parseUserIdList(xoomLocalRepositoryImpl, (java.lang.String) string);
                if (!access$parseUserIdList.contains(str)) {
                    appStorage2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                    unencrypted2 = com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$parseUserIdList);
                    this.getHighSpeedVideoFpsRanges = 3;
                    if (appStorage2.setString(unencrypted2, kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) access$parseUserIdList, str), com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER, null, null, 0, null, null, 62, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            access$userId = obj;
        }
        java.lang.String str3 = (java.lang.String) access$userId;
        if (str3 == null) {
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl2 = this.getHighSpeedVideoFpsRangesFor;
        appStorage = xoomLocalRepositoryImpl2.getHighSpeedVideoFpsRanges;
        unencrypted = com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = str3;
        this.getHighSpeedVideoSizes = xoomLocalRepositoryImpl2;
        this.getHighSpeedVideoFpsRanges = 2;
        string = appStorage.getString(unencrypted, "", this);
        if (string == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = str3;
        xoomLocalRepositoryImpl = xoomLocalRepositoryImpl2;
        access$parseUserIdList = com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.access$parseUserIdList(xoomLocalRepositoryImpl, (java.lang.String) string);
        if (!access$parseUserIdList.contains(str)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$setUserAgreementAccepted$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$setUserAgreementAccepted$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    XoomLocalRepositoryImpl$setUserAgreementAccepted$2(com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$setUserAgreementAccepted$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = xoomLocalRepositoryImpl;
    }
}
