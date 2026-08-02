package com.paypal.oslo.feature.activity.domain.common.provider;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityUserInfoProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "fetchUserProfile$activity_prodRelease", "(Lcom/paypal/oslo/core/userstore/UserStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityUserInfoProvider {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider INSTANCE = new com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider();

    private ActivityUserInfoProvider() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5 A[Catch: all -> 0x004d, RaiseCancellationException -> 0x0050, TRY_ENTER, TryCatch #3 {RaiseCancellationException -> 0x0050, all -> 0x004d, blocks: (B:11:0x0049, B:12:0x00af, B:15:0x00b5, B:17:0x00d3, B:20:0x00db, B:22:0x00e3, B:23:0x0111), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3 A[Catch: all -> 0x004d, RaiseCancellationException -> 0x0050, TryCatch #3 {RaiseCancellationException -> 0x0050, all -> 0x004d, blocks: (B:11:0x0049, B:12:0x00af, B:15:0x00b5, B:17:0x00d3, B:20:0x00db, B:22:0x00e3, B:23:0x0111), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchUserProfile$activity_prodRelease(com.paypal.oslo.core.userstore.UserStore userStore, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$fetchUserProfile$1 activityUserInfoProvider$fetchUserProfile$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        java.lang.Object obj;
        com.paypal.oslo.core.userstore.model.UserState userState;
        if (continuation instanceof com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$fetchUserProfile$1) {
            activityUserInfoProvider$fetchUserProfile$1 = (com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$fetchUserProfile$1) continuation;
            if ((activityUserInfoProvider$fetchUserProfile$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                activityUserInfoProvider$fetchUserProfile$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj2 = activityUserInfoProvider$fetchUserProfile$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityUserInfoProvider$fetchUserProfile$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider.$r8$lambda$4a_yYf1AGg2CsaQJbnBe_j4TZmI((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult) obj3, (com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise2 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState2 = userStore.getUserState();
                        com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$fetchUserProfile$3$terminalState$1 activityUserInfoProvider$fetchUserProfile$3$terminalState$1 = new com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$fetchUserProfile$3$terminalState$1(null);
                        activityUserInfoProvider$fetchUserProfile$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userStore);
                        activityUserInfoProvider$fetchUserProfile$1.getInputSizeshNQ4ISI = function2;
                        activityUserInfoProvider$fetchUserProfile$1.getOutputFormats = atomicReference;
                        activityUserInfoProvider$fetchUserProfile$1.getOutputMinFrameDuration = defaultRaise;
                        activityUserInfoProvider$fetchUserProfile$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        activityUserInfoProvider$fetchUserProfile$1.getOutputMinFrameDurationlomOqCM = iorRaise2;
                        activityUserInfoProvider$fetchUserProfile$1.Camera2StreamConfigurationMap = 0;
                        activityUserInfoProvider$fetchUserProfile$1.getHighSpeedVideoFpsRangesFor = 0;
                        activityUserInfoProvider$fetchUserProfile$1.getHighSpeedVideoFpsRanges = 0;
                        activityUserInfoProvider$fetchUserProfile$1.getHighSpeedVideoSizes = 0;
                        activityUserInfoProvider$fetchUserProfile$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        activityUserInfoProvider$fetchUserProfile$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object firstOrNull = kotlinx.coroutines.flow.FlowKt.firstOrNull(userState2, activityUserInfoProvider$fetchUserProfile$3$terminalState$1, activityUserInfoProvider$fetchUserProfile$1);
                        if (firstOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj2 = firstOrNull;
                        iorRaise = iorRaise2;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = function2.invoke(obj, raisedOrRethrow);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = activityUserInfoProvider$fetchUserProfile$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = activityUserInfoProvider$fetchUserProfile$1.getHighSpeedVideoSizes;
                    int i4 = activityUserInfoProvider$fetchUserProfile$1.getHighSpeedVideoFpsRanges;
                    int i5 = activityUserInfoProvider$fetchUserProfile$1.getHighSpeedVideoFpsRangesFor;
                    int i6 = activityUserInfoProvider$fetchUserProfile$1.Camera2StreamConfigurationMap;
                    iorRaise = (arrow.core.raise.IorRaise) activityUserInfoProvider$fetchUserProfile$1.getOutputMinFrameDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) activityUserInfoProvider$fetchUserProfile$1.getOutputMinFrameDuration;
                    atomicReference = (java.util.concurrent.atomic.AtomicReference) activityUserInfoProvider$fetchUserProfile$1.getOutputFormats;
                    function2 = (kotlin.jvm.functions.Function2) activityUserInfoProvider$fetchUserProfile$1.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                userState = (com.paypal.oslo.core.userstore.model.UserState) obj2;
                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_LEDGER_USER_PROFILE_NOT_AVAILABLE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchUserProfile")), null, 4, null);
                    iorRaise.raise(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_LEDGER_USER_PROFILE_NOT_AVAILABLE, null, 2, null), 1, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult activityNetworkSuccessResult = new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toUserProfile(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser()));
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(activityNetworkSuccessResult) : new arrow.core.Ior.Both(obj3, activityNetworkSuccessResult);
            }
        }
        activityUserInfoProvider$fetchUserProfile$1 = new com.paypal.oslo.feature.activity.domain.common.provider.ActivityUserInfoProvider$fetchUserProfile$1(this, continuation);
        java.lang.Object obj22 = activityUserInfoProvider$fetchUserProfile$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityUserInfoProvider$fetchUserProfile$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        userState = (com.paypal.oslo.core.userstore.model.UserState) obj22;
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult $r8$lambda$4a_yYf1AGg2CsaQJbnBe_j4TZmI(com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNetworkFailureResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityNetworkFailureResult2, "");
        return activityNetworkFailureResult;
    }
}
