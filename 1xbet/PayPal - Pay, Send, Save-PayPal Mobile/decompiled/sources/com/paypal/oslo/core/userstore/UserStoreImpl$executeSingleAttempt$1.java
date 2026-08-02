package com.paypal.oslo.core.userstore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.UserStoreImpl", f = "UserStoreImpl.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {204, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "executeSingleAttempt", n = {"fetchPolicy", "attempt", "fetchPolicy", "e", "attempt", "fetchPolicy", "e", "attempt", "fetchPolicy", "e", "attempt"}, nl = {205, 207, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 211}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class UserStoreImpl$executeSingleAttempt$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStoreImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI((com.apollographql.apollo.cache.normalized.FetchPolicy) null, 0, (kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.core.userstore.model.UserError, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data>>) this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserStoreImpl$executeSingleAttempt$1(com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.UserStoreImpl$executeSingleAttempt$1> continuation) {
        super(continuation);
        this.getInputFormats = userStoreImpl;
    }
}
