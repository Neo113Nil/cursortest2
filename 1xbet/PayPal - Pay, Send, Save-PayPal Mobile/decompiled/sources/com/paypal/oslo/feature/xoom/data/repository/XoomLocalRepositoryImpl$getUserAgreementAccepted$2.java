package com.paypal.oslo.feature.xoom.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$getUserAgreementAccepted$2", f = "XoomLocalRepositoryImpl.kt", i = {1}, l = {43, 45}, m = "invokeSuspend", n = {"currentUserId"}, nl = {45, -1}, s = {"L$0"}, v = 2)
/* loaded from: classes16.dex */
final class XoomLocalRepositoryImpl$getUserAgreementAccepted$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r7 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted;
        com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.access$userId(this.getHighSpeedVideoFpsRanges, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xoomLocalRepositoryImpl = (com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl) this.getHighSpeedVideoSizes;
                str = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.access$parseUserIdList(xoomLocalRepositoryImpl, (java.lang.String) obj).contains(str));
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        str = (java.lang.String) obj;
        if (str == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl2 = this.getHighSpeedVideoFpsRanges;
        appStorage = xoomLocalRepositoryImpl2.getHighSpeedVideoFpsRanges;
        unencrypted = com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = xoomLocalRepositoryImpl2;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object string = appStorage.getString(unencrypted, "", this);
        if (string != coroutine_suspended) {
            xoomLocalRepositoryImpl = xoomLocalRepositoryImpl2;
            obj = string;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl.access$parseUserIdList(xoomLocalRepositoryImpl, (java.lang.String) obj).contains(str));
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$getUserAgreementAccepted$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$getUserAgreementAccepted$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    XoomLocalRepositoryImpl$getUserAgreementAccepted$2(com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl xoomLocalRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$getUserAgreementAccepted$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = xoomLocalRepositoryImpl;
    }
}
