package com.paypal.oslo.core.userstore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.UserStoreImpl", f = "UserStoreImpl.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "fetchAndUpdateUserProfile", n = {"fetchPolicy", "intent", "fetchPolicy", "intent", "lastException", "attempt", "$i$a$-repeat-UserStoreImpl$fetchAndUpdateUserProfile$2", "fetchPolicy", "intent", "lastException", "user", "result", "attempt", "$i$a$-repeat-UserStoreImpl$fetchAndUpdateUserProfile$2", "fetchPolicy", "intent", "lastException"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, -1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class UserStoreImpl$fetchAndUpdateUserProfile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStoreImpl getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputSizes = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserStoreImpl$fetchAndUpdateUserProfile$1(com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.UserStoreImpl$fetchAndUpdateUserProfile$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = userStoreImpl;
    }
}
