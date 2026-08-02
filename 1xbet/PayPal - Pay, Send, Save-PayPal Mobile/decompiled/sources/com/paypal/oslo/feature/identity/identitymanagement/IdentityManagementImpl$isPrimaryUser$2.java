package com.paypal.oslo.feature.identity.identitymanagement;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isPrimaryUser$2", f = "IdentityManagementImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"currentUserId"}, nl = {224}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class IdentityManagementImpl$isPrimaryUser$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile;
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        java.lang.String str4 = null;
        boolean z2 = false;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Checking if current user is primary user", null, null, 6, null);
                userStore = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
                java.lang.String id = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getId() : null;
                rememberedUserStorageWithProfile = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = id;
                this.getHighSpeedVideoFpsRanges = 1;
                java.lang.Object rememberedUser = rememberedUserStorageWithProfile.getRememberedUser(this);
                if (rememberedUser == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = id;
                obj = rememberedUser;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = (arrow.core.Either) obj;
            if (either instanceof arrow.core.Either.Right) {
                str4 = ((com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) ((arrow.core.Either.Right) either).getValue()).getUserId();
            } else {
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            str2 = str;
        } catch (java.lang.Exception unused) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Error checking if user is primary, defaulting to false (secondary user)", null, null, 6, null);
        }
        if (str2 != null && str2.length() != 0 && (str3 = str4) != null && str3.length() != 0 && kotlin.jvm.internal.Intrinsics.areEqual(str, str4)) {
            z = true;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("idsMatch", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)));
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            if (str == null) {
                str = "null";
            }
            pairArr[0] = kotlin.TuplesKt.to("currentUserId", str);
            if (str4 == null) {
                str4 = "null";
            }
            pairArr[1] = kotlin.TuplesKt.to("rememberedUserId", str4);
            kotlin.collections.MapsKt.mapOf(pairArr);
            z2 = z;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
        }
        z = false;
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("idsMatch", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)));
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        if (str == null) {
        }
        pairArr2[0] = kotlin.TuplesKt.to("currentUserId", str);
        if (str4 == null) {
        }
        pairArr2[1] = kotlin.TuplesKt.to("rememberedUserId", str4);
        kotlin.collections.MapsKt.mapOf(pairArr2);
        z2 = z;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isPrimaryUser$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isPrimaryUser$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManagementImpl$isPrimaryUser$2(com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl identityManagementImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isPrimaryUser$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = identityManagementImpl;
    }
}
