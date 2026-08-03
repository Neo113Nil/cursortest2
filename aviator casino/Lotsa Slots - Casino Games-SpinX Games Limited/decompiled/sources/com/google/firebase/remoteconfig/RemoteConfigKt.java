package com.google.firebase.remoteconfig;

/* compiled from: RemoteConfig.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010\u001a\u0015\u0010\u0015\u001a\u00020\u0016*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"configUpdates", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)Lkotlinx/coroutines/flow/Flow;", "remoteConfig", "Lcom/google/firebase/Firebase;", "getRemoteConfig", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, "Lcom/google/firebase/remoteconfig/CustomSignals;", "builder", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/CustomSignals$Builder;", "", "Lkotlin/ExtensionFunctionType;", "remoteConfigSettings", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", com.ironsource.X3.a.f, "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "get", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", com.ironsource.X3.i.W, "", "app", "Lcom/google/firebase/FirebaseApp;", "com.google.firebase-firebase-config"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoteConfigKt {
    public static final com.google.firebase.remoteconfig.FirebaseRemoteConfig getRemoteConfig(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig = com.google.firebase.remoteconfig.FirebaseRemoteConfig.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance()");
        return firebaseRemoteConfig;
    }

    public static final com.google.firebase.remoteconfig.FirebaseRemoteConfig remoteConfig(com.google.firebase.Firebase firebase, com.google.firebase.FirebaseApp app) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app, "app");
        com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig = com.google.firebase.remoteconfig.FirebaseRemoteConfig.getInstance(app);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance(app)");
        return firebaseRemoteConfig;
    }

    public static final com.google.firebase.remoteconfig.FirebaseRemoteConfigValue get(com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.google.firebase.remoteconfig.FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(key);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "this.getValue(key)");
        return value;
    }

    public static final com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings remoteConfigSettings(kotlin.jvm.functions.Function1<? super com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder, kotlin.Unit> init) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder builder = new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder();
        init.invoke(builder);
        com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static final com.google.firebase.remoteconfig.CustomSignals customSignals(kotlin.jvm.functions.Function1<? super com.google.firebase.remoteconfig.CustomSignals.Builder, kotlin.Unit> builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        com.google.firebase.remoteconfig.CustomSignals.Builder builder2 = new com.google.firebase.remoteconfig.CustomSignals.Builder();
        builder.invoke(builder2);
        com.google.firebase.remoteconfig.CustomSignals build = builder2.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(builder).build()");
        return build;
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.firebase.remoteconfig.ConfigUpdate> getConfigUpdates(com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<this>");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }
}
