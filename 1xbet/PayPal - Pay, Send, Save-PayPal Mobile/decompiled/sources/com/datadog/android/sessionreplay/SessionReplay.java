package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/sessionreplay/SessionReplay;", "", "<init>", "()V", "Lcom/datadog/android/sessionreplay/SessionReplayConfiguration;", "sessionReplayConfiguration", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "enable", "(Lcom/datadog/android/sessionreplay/SessionReplayConfiguration;Lcom/datadog/android/api/SdkCore;)V", "startRecording", "(Lcom/datadog/android/api/SdkCore;)V", "stopRecording", "", "IS_ALREADY_REGISTERED_WARNING", "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "currentRegisteredCore", "Ljava/lang/ref/WeakReference;", "getCurrentRegisteredCore$dd_sdk_android_session_replay_release", "()Ljava/lang/ref/WeakReference;", "setCurrentRegisteredCore$dd_sdk_android_session_replay_release", "(Ljava/lang/ref/WeakReference;)V", "getCurrentRegisteredCore$dd_sdk_android_session_replay_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplay {
    public static final com.datadog.android.sessionreplay.SessionReplay INSTANCE = new com.datadog.android.sessionreplay.SessionReplay();
    public static final java.lang.String IS_ALREADY_REGISTERED_WARNING = "Session Replay is already enabled and does not support multiple instances. The existing instance will continue to be used.";
    private static java.lang.ref.WeakReference<com.datadog.android.api.SdkCore> currentRegisteredCore;

    public static /* synthetic */ void getCurrentRegisteredCore$dd_sdk_android_session_replay_release$annotations() {
    }

    private SessionReplay() {
    }

    public final java.lang.ref.WeakReference<com.datadog.android.api.SdkCore> getCurrentRegisteredCore$dd_sdk_android_session_replay_release() {
        return currentRegisteredCore;
    }

    public final void setCurrentRegisteredCore$dd_sdk_android_session_replay_release(java.lang.ref.WeakReference<com.datadog.android.api.SdkCore> weakReference) {
        currentRegisteredCore = weakReference;
    }

    public static /* synthetic */ void enable$default(com.datadog.android.sessionreplay.SessionReplayConfiguration sessionReplayConfiguration, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        enable(sessionReplayConfiguration, sdkCore);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(final com.datadog.android.sessionreplay.SessionReplayConfiguration sessionReplayConfiguration, final com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        final com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = (com.datadog.android.api.feature.FeatureSdkCore) sdkCore;
        sessionReplayConfiguration.getSystemRequirementsConfiguration$dd_sdk_android_session_replay_release().runIfRequirementsMet$dd_sdk_android_session_replay_release(featureSdkCore.getInternalLogger(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.SessionReplay$enable$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap() {
                com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager = new com.datadog.android.sessionreplay.internal.TouchPrivacyManager(com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getTouchPrivacy$dd_sdk_android_session_replay_release());
                java.lang.String customEndpointUrl$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getCustomEndpointUrl$dd_sdk_android_session_replay_release();
                com.datadog.android.sessionreplay.SessionReplayPrivacy privacy$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getPrivacy$dd_sdk_android_session_replay_release();
                com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getImagePrivacy$dd_sdk_android_session_replay_release();
                com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getTouchPrivacy$dd_sdk_android_session_replay_release();
                com.datadog.android.sessionreplay.internal.SessionReplayFeature sessionReplayFeature = new com.datadog.android.sessionreplay.internal.SessionReplayFeature(featureSdkCore, customEndpointUrl$dd_sdk_android_session_replay_release, privacy$dd_sdk_android_session_replay_release, com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getTextAndInputPrivacy$dd_sdk_android_session_replay_release(), touchPrivacy$dd_sdk_android_session_replay_release, touchPrivacyManager, imagePrivacy$dd_sdk_android_session_replay_release, com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getCustomMappers$dd_sdk_android_session_replay_release(), com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getCustomOptionSelectorDetectors$dd_sdk_android_session_replay_release(), com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getCustomDrawableMappers$dd_sdk_android_session_replay_release(), com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getSampleRate$dd_sdk_android_session_replay_release(), com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getStartRecordingImmediately$dd_sdk_android_session_replay_release(), com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getDynamicOptimizationEnabled$dd_sdk_android_session_replay_release(), com.datadog.android.sessionreplay.SessionReplayConfiguration.this.getInternalCallback$dd_sdk_android_session_replay_release());
                if (com.datadog.android.sessionreplay.SessionReplay.access$isAlreadyRegistered(com.datadog.android.sessionreplay.SessionReplay.INSTANCE)) {
                    com.datadog.android.sessionreplay.SessionReplay.access$logAlreadyRegisteredWarning(com.datadog.android.sessionreplay.SessionReplay.INSTANCE, ((com.datadog.android.api.feature.FeatureSdkCore) sdkCore).getInternalLogger());
                } else {
                    com.datadog.android.sessionreplay.SessionReplay.INSTANCE.setCurrentRegisteredCore$dd_sdk_android_session_replay_release(new java.lang.ref.WeakReference<>(sdkCore));
                    ((com.datadog.android.api.feature.FeatureSdkCore) sdkCore).registerFeature(sessionReplayFeature);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static /* synthetic */ void startRecording$default(com.datadog.android.sessionreplay.SessionReplay sessionReplay, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        sessionReplay.startRecording(sdkCore);
    }

    public final void startRecording(com.datadog.android.api.SdkCore sdkCore) {
        com.datadog.android.api.feature.FeatureScope feature;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        com.datadog.android.sessionreplay.internal.SessionReplayFeature sessionReplayFeature = null;
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
        if (featureSdkCore != null && (feature = featureSdkCore.getFeature("session-replay")) != null) {
            com.datadog.android.api.feature.Feature unwrap = feature.unwrap();
            if (unwrap instanceof com.datadog.android.sessionreplay.internal.SessionReplayFeature) {
                sessionReplayFeature = (com.datadog.android.sessionreplay.internal.SessionReplayFeature) unwrap;
            }
        }
        if (sessionReplayFeature != null) {
            sessionReplayFeature.manuallyStartRecording$dd_sdk_android_session_replay_release();
        }
    }

    public static /* synthetic */ void stopRecording$default(com.datadog.android.sessionreplay.SessionReplay sessionReplay, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        sessionReplay.stopRecording(sdkCore);
    }

    public final void stopRecording(com.datadog.android.api.SdkCore sdkCore) {
        com.datadog.android.api.feature.FeatureScope feature;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        com.datadog.android.sessionreplay.internal.SessionReplayFeature sessionReplayFeature = null;
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
        if (featureSdkCore != null && (feature = featureSdkCore.getFeature("session-replay")) != null) {
            com.datadog.android.api.feature.Feature unwrap = feature.unwrap();
            if (unwrap instanceof com.datadog.android.sessionreplay.internal.SessionReplayFeature) {
                sessionReplayFeature = (com.datadog.android.sessionreplay.internal.SessionReplayFeature) unwrap;
            }
        }
        if (sessionReplayFeature != null) {
            sessionReplayFeature.manuallyStopRecording$dd_sdk_android_session_replay_release();
        }
    }

    public static final /* synthetic */ boolean access$isAlreadyRegistered(com.datadog.android.sessionreplay.SessionReplay sessionReplay) {
        com.datadog.android.api.SdkCore sdkCore;
        java.lang.ref.WeakReference<com.datadog.android.api.SdkCore> weakReference = currentRegisteredCore;
        return (weakReference == null || (sdkCore = weakReference.get()) == null || !sdkCore.isCoreActive()) ? false : true;
    }

    public static final /* synthetic */ void access$logAlreadyRegisteredWarning(com.datadog.android.sessionreplay.SessionReplay sessionReplay, com.datadog.android.api.InternalLogger internalLogger) {
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf(com.datadog.android.api.InternalLogger.Target.MAINTAINER), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.SessionReplay$logAlreadyRegisteredWarning$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.SessionReplay.IS_ALREADY_REGISTERED_WARNING;
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.DEBUG, kotlin.collections.CollectionsKt.listOf(com.datadog.android.api.InternalLogger.Target.TELEMETRY), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.SessionReplay$logAlreadyRegisteredWarning$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.SessionReplay.IS_ALREADY_REGISTERED_WARNING;
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(com.datadog.android.sessionreplay.SessionReplayConfiguration sessionReplayConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "");
        enable$default(sessionReplayConfiguration, null, 2, null);
    }
}
