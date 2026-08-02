package com.ingo.sdk.android.ux.feature.manual_verification;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$uploadDocuments$2$1", f = "CaptureIdentityDocumentsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class CaptureIdentityDocumentsFragment$uploadDocuments$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.ingo.sdk.android.ux.feature.manual_verification.IdentityDocumentsViewModelImpl identityDocumentsViewModelImpl;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "executed io dispatcher ".concat(java.lang.String.valueOf(java.lang.System.currentTimeMillis())), null, 2, null);
        identityDocumentsViewModelImpl = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
        str = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        if (str == null) {
            str = "";
        }
        str2 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
        if (str2 == null) {
            str2 = "";
        }
        str3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        identityDocumentsViewModelImpl.uploadIdentityDocuments(new com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters(str, str2, str3 != null ? str3 : ""));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$uploadDocuments$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$uploadDocuments$2$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureIdentityDocumentsFragment$uploadDocuments$2$1(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$uploadDocuments$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = captureIdentityDocumentsFragment;
    }
}
