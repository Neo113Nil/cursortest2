package com.moloco.sdk.internal.unity_bridge;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityPlugin;", "", "<init>", "()V", "", "appKey", "mediationName", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;", "callback", "", "initializeSdk", "(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;)V", "mediation", "adUnitId", "bidResponse", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;", com.ironsource.X3.h.E, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;)V", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;", com.ironsource.X3.h.H, "(Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;)V", "callingMethod", "logUninitializedAccessError", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "initState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "getContext", "()Landroid/content/Context;", "context", "Lcom/moloco/sdk/internal/unity_bridge/internal/a;", "adManager$delegate", "getAdManager", "()Lcom/moloco/sdk/internal/unity_bridge/internal/a;", "adManager", "TAG", "Ljava/lang/String;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class MolocoUnityPlugin {
    private static final java.lang.String TAG = "MolocoUnityPlugin";
    public static final com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin INSTANCE = new com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin();
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> initState = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy context = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            android.content.Context context_delegate$lambda$0;
            context_delegate$lambda$0 = com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin.context_delegate$lambda$0();
            return context_delegate$lambda$0;
        }
    });

    /* renamed from: adManager$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy adManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            com.moloco.sdk.internal.unity_bridge.internal.a adManager_delegate$lambda$1;
            adManager_delegate$lambda$1 = com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin.adManager_delegate$lambda$1();
            return adManager_delegate$lambda$1;
        }
    });
    public static final int $stable = 8;

    private MolocoUnityPlugin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.moloco.sdk.internal.unity_bridge.internal.a adManager_delegate$lambda$1() {
        return new com.moloco.sdk.internal.unity_bridge.internal.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.content.Context context_delegate$lambda$0() {
        return com.moloco.sdk.internal.android_context.b.a(null, 1, null);
    }

    private final com.moloco.sdk.internal.unity_bridge.internal.a getAdManager() {
        return (com.moloco.sdk.internal.unity_bridge.internal.a) adManager.getValue();
    }

    private final android.content.Context getContext() {
        return (android.content.Context) context.getValue();
    }

    @kotlin.jvm.JvmStatic
    public static final void initializeSdk(final java.lang.String appKey, final java.lang.String mediationName, final com.moloco.sdk.internal.unity_bridge.MolocoUnityInitCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationName, "mediationName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.moloco.sdk.publisher.Moloco.initialize(new com.moloco.sdk.publisher.init.MolocoInitParams(INSTANCE.getContext(), appKey, new com.moloco.sdk.publisher.MediationInfo(mediationName)), new com.moloco.sdk.publisher.MolocoInitializationListener() { // from class: com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin$$ExternalSyntheticLambda0
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(com.moloco.sdk.publisher.MolocoInitStatus molocoInitStatus) {
                com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin.initializeSdk$lambda$3(appKey, mediationName, callback, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdk$lambda$3(java.lang.String str, java.lang.String str2, com.moloco.sdk.internal.unity_bridge.MolocoUnityInitCallback molocoUnityInitCallback, com.moloco.sdk.publisher.MolocoInitStatus initStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, TAG, "initialized " + str + ' ' + str2 + ' ' + initStatus.getInitialization(), null, false, 12, null);
        boolean z = initStatus.getInitialization() == com.moloco.sdk.publisher.Initialization.SUCCESS;
        initState.setValue(java.lang.Boolean.valueOf(z));
        molocoUnityInitCallback.onInitialized(z);
    }

    @kotlin.jvm.JvmStatic
    public static final void loadInterstitial(java.lang.String mediation, java.lang.String adUnitId, java.lang.String bidResponse, com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediation, "mediation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        if (initState.getValue().booleanValue()) {
            INSTANCE.getAdManager().a(kotlin.text.StringsKt.trim((java.lang.CharSequence) mediation).toString(), kotlin.text.StringsKt.trim((java.lang.CharSequence) adUnitId).toString(), bidResponse, callback);
        } else {
            INSTANCE.logUninitializedAccessError(com.ironsource.X3.h.E);
        }
    }

    private final void logUninitializedAccessError(java.lang.String callingMethod) {
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, TAG, "ERROR: Failed to execute " + callingMethod + "() - please ensure the Moloco Unity Plugin has been initialized by calling 'MolocoSdk.InitializeSdk();'!", null, false, 12, null);
    }

    @kotlin.jvm.JvmStatic
    public static final void showInterstitial(java.lang.String adUnitId, com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        if (initState.getValue().booleanValue()) {
            INSTANCE.getAdManager().a(kotlin.text.StringsKt.trim((java.lang.CharSequence) adUnitId).toString(), callback);
        } else {
            INSTANCE.logUninitializedAccessError(com.ironsource.X3.h.H);
        }
    }
}
