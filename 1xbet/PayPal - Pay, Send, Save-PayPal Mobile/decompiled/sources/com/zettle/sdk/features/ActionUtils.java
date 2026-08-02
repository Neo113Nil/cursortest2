package com.zettle.sdk.features;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a%\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u0019\u0010\u001a\u001a\u00020\u0004*\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 \"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Landroid/content/Context;", "context", "Lcom/zettle/sdk/features/Action;", "action", "Landroid/content/Intent;", "buildIntent", "(Landroid/content/Context;Lcom/zettle/sdk/features/Action;)Landroid/content/Intent;", "Lcom/zettle/sdk/features/Payment;", "charge", "(Lcom/zettle/sdk/features/Payment;Landroid/content/Context;)Landroid/content/Intent;", "Lcom/zettle/sdk/ui/ZettleResult;", "headless", "(Lcom/zettle/sdk/features/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/ui/ZettleApiResult;", "headlessApi", "Lcom/zettle/sdk/features/Headless;", "Lkotlin/Function1;", "", com.sun.jna.Callback.METHOD_NAME, "launchZettleApi", "(Lcom/zettle/sdk/features/Headless;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/features/Refund;", "refund", "(Lcom/zettle/sdk/features/Refund;Landroid/content/Context;)Landroid/content/Intent;", "retrieve", "Lcom/zettle/sdk/features/Information;", "show", "(Lcom/zettle/sdk/features/Information;Landroid/content/Context;)Landroid/content/Intent;", "", "FULL_REFUND", "J", "getFULL_REFUND$annotations", "()V", "Lkotlinx/coroutines/CoroutineScope;", "headlessScope", "Lkotlinx/coroutines/CoroutineScope;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActionUtils {
    public static final long FULL_REFUND = 0;
    private static final kotlinx.coroutines.CoroutineScope headlessScope = com.zettle.sdk.core.ZettleScope.scope$default(com.zettle.sdk.core.ZettleScope.INSTANCE, "Action", null, kotlinx.coroutines.Dispatchers.getMain(), 2, null);

    public static /* synthetic */ void getFULL_REFUND$annotations() {
    }

    private static final android.content.Intent buildIntent(android.content.Context context, com.zettle.sdk.features.Action action) {
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(action.mo23170validated1pmJ48());
        if (m23439exceptionOrNullimpl != null) {
            throw new com.zettle.sdk.features.ActionValidationError(m23439exceptionOrNullimpl);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.zettle.sdk.ui.ZettleActivity.class);
        intent.putExtra(com.zettle.sdk.ui.ZettleIntent.ZETTLE_ACTION, action);
        return intent;
    }

    public static final android.content.Intent charge(com.zettle.sdk.features.Payment payment, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return buildIntent(context, payment);
    }

    public static final android.content.Intent refund(com.zettle.sdk.features.Refund refund, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refund, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return buildIntent(context, refund);
    }

    public static final android.content.Intent show(com.zettle.sdk.features.Information information, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(information, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return buildIntent(context, information);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object headless(com.zettle.sdk.features.Action action, kotlin.coroutines.Continuation<? super com.zettle.sdk.ui.ZettleResult> continuation) {
        com.zettle.sdk.features.ActionUtils$headless$1 actionUtils$headless$1;
        java.lang.Object obj;
        int i;
        com.zettle.sdk.features.Action action2;
        com.zettle.sdk.features.FeatureConf featureConf;
        if (continuation instanceof com.zettle.sdk.features.ActionUtils$headless$1) {
            actionUtils$headless$1 = (com.zettle.sdk.features.ActionUtils$headless$1) continuation;
            if ((actionUtils$headless$1.label & Integer.MIN_VALUE) != 0) {
                actionUtils$headless$1.label -= 2147483648;
                obj = actionUtils$headless$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actionUtils$headless$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.ZettleSDK companion = com.zettle.sdk.ZettleSDK.INSTANCE.getInstance();
                    if (companion == null) {
                        return new com.zettle.sdk.core.error.ZettleSDKError(com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized.INSTANCE);
                    }
                    com.zettle.sdk.features.FeatureConf featureConf2 = com.zettle.sdk.ZettleSDK.INSTANCE.getFeatures$core_publicRelease(companion).get(action.getFeatureId());
                    if (featureConf2 == null) {
                        return new com.zettle.sdk.core.error.ZettleSDKError(new com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound(action.getFeatureId()));
                    }
                    com.zettle.sdk.core.Register modules$core_publicRelease = com.zettle.sdk.ZettleSDK.INSTANCE.getModules$core_publicRelease(companion);
                    com.zettle.sdk.core.ModuleStore moduleStore = modules$core_publicRelease instanceof com.zettle.sdk.core.ModuleStore ? (com.zettle.sdk.core.ModuleStore) modules$core_publicRelease : null;
                    if (moduleStore != null) {
                        com.zettle.sdk.core.Module fetch = moduleStore.fetch(com.zettle.sdk.core.permission.Permission.class);
                        if (fetch instanceof com.zettle.sdk.core.permission.Permission) {
                            java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements = featureConf2.requirements(action);
                            actionUtils$headless$1.L$0 = action;
                            actionUtils$headless$1.L$1 = featureConf2;
                            actionUtils$headless$1.label = 1;
                            obj = ((com.zettle.sdk.core.permission.Permission) fetch).checkApprovedPermissions(requirements, actionUtils$headless$1);
                            if (obj != coroutine_suspended) {
                                action2 = action;
                                featureConf = featureConf2;
                            }
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("No module found for: ");
                        sb.append(com.zettle.sdk.core.permission.Permission.class);
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    throw new java.lang.IllegalStateException("Register is not implemented correctly.");
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                featureConf = (com.zettle.sdk.features.FeatureConf) actionUtils$headless$1.L$1;
                action2 = (com.zettle.sdk.features.Action) actionUtils$headless$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.util.List) obj).isEmpty()) {
                    return new com.zettle.sdk.core.error.ZettleSDKError(new com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled(action2));
                }
                actionUtils$headless$1.L$0 = null;
                actionUtils$headless$1.L$1 = null;
                actionUtils$headless$1.label = 2;
                java.lang.Object headless = featureConf.headless(action2, actionUtils$headless$1);
                return headless == coroutine_suspended ? coroutine_suspended : headless;
            }
        }
        actionUtils$headless$1 = new com.zettle.sdk.features.ActionUtils$headless$1(continuation);
        obj = actionUtils$headless$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actionUtils$headless$1.label;
        if (i != 0) {
        }
        if (((java.util.List) obj).isEmpty()) {
        }
    }

    public static final void retrieve(com.zettle.sdk.features.Headless headless, kotlin.jvm.functions.Function1<? super com.zettle.sdk.ui.ZettleResult, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headless, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(headlessScope, null, null, new com.zettle.sdk.features.ActionUtils$retrieve$1(function1, headless, null), 3, null);
    }

    public static final void launchZettleApi(com.zettle.sdk.features.Headless headless, kotlin.jvm.functions.Function1<? super com.zettle.sdk.ui.ZettleApiResult, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headless, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(headlessScope, null, null, new com.zettle.sdk.features.ActionUtils$launchZettleApi$1(function1, headless, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object headlessApi(com.zettle.sdk.features.Action action, kotlin.coroutines.Continuation<? super com.zettle.sdk.ui.ZettleApiResult> continuation) {
        com.zettle.sdk.features.ActionUtils$headlessApi$1 actionUtils$headlessApi$1;
        int i;
        com.zettle.sdk.features.Action action2;
        com.zettle.sdk.features.FeatureConf featureConf;
        java.util.List list;
        if (continuation instanceof com.zettle.sdk.features.ActionUtils$headlessApi$1) {
            actionUtils$headlessApi$1 = (com.zettle.sdk.features.ActionUtils$headlessApi$1) continuation;
            if ((actionUtils$headlessApi$1.label & Integer.MIN_VALUE) != 0) {
                actionUtils$headlessApi$1.label -= 2147483648;
                java.lang.Object obj = actionUtils$headlessApi$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actionUtils$headlessApi$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.ZettleSDK companion = com.zettle.sdk.ZettleSDK.INSTANCE.getInstance();
                    if (companion == null) {
                        return new com.zettle.sdk.core.error.ZettleApiError(com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized.INSTANCE);
                    }
                    com.zettle.sdk.features.FeatureConf featureConf2 = com.zettle.sdk.ZettleSDK.INSTANCE.getFeatures$core_publicRelease(companion).get(action.getFeatureId());
                    if (featureConf2 == null) {
                        return new com.zettle.sdk.core.error.ZettleApiError(new com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound(action.getFeatureId()));
                    }
                    com.zettle.sdk.core.Register modules$core_publicRelease = com.zettle.sdk.ZettleSDK.INSTANCE.getModules$core_publicRelease(companion);
                    com.zettle.sdk.core.ModuleStore moduleStore = modules$core_publicRelease instanceof com.zettle.sdk.core.ModuleStore ? (com.zettle.sdk.core.ModuleStore) modules$core_publicRelease : null;
                    if (moduleStore != null) {
                        com.zettle.sdk.core.Module fetch = moduleStore.fetch(com.zettle.sdk.core.permission.Permission.class);
                        if (fetch instanceof com.zettle.sdk.core.permission.Permission) {
                            java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements = featureConf2.requirements(action);
                            actionUtils$headlessApi$1.L$0 = action;
                            actionUtils$headlessApi$1.L$1 = featureConf2;
                            actionUtils$headlessApi$1.label = 1;
                            obj = ((com.zettle.sdk.core.permission.Permission) fetch).checkApprovedPermissions(requirements, actionUtils$headlessApi$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            action2 = action;
                            featureConf = featureConf2;
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("No module found for: ");
                            sb.append(com.zettle.sdk.core.permission.Permission.class);
                            throw new java.lang.IllegalStateException(sb.toString());
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Register is not implemented correctly.");
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    featureConf = (com.zettle.sdk.features.FeatureConf) actionUtils$headlessApi$1.L$1;
                    action2 = (com.zettle.sdk.features.Action) actionUtils$headlessApi$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                list = (java.util.List) obj;
                if (list.isEmpty()) {
                    return ((com.zettle.sdk.core.permission.Prerequisite) kotlin.collections.CollectionsKt.first(list)) instanceof com.zettle.sdk.core.permission.Prerequisite.Authentication ? new com.zettle.sdk.core.error.ZettleApiError(com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized.INSTANCE) : new com.zettle.sdk.core.error.ZettleApiError(new com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled(action2));
                }
                return featureConf.headlessApi(action2);
            }
        }
        actionUtils$headlessApi$1 = new com.zettle.sdk.features.ActionUtils$headlessApi$1(continuation);
        java.lang.Object obj2 = actionUtils$headlessApi$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actionUtils$headlessApi$1.label;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list.isEmpty()) {
        }
    }
}
