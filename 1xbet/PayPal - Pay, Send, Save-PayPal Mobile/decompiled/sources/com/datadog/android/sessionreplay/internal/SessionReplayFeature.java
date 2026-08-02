package com.datadog.android.sessionreplay.internal;

@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0002z{B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\u001f\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0000¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\"2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\"2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\"H\u0016¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020\"H\u0000¢\u0006\u0004\b5\u0010*J\u000f\u00106\u001a\u00020\"H\u0000¢\u0006\u0004\b6\u0010*R\u0016\u00109\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u00107\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010=R\"\u0010?\u001a\u00020>8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\u00020H8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010'\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010JR\u0014\u0010M\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010JR\u001a\u0010N\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\bN\u0010=\u001a\u0004\bO\u0010PR\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Z\u001a\u00020Y8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010T\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010_\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010d\u001a\u00020c8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010a\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010JR\u0014\u0010l\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010n\u001a\u00020m8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010j\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bx\u0010JR\u0014\u0010y\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bl\u0010J"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/SessionReplayFeature;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "customEndpointUrl", "Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "touchPrivacy", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "", "Lcom/datadog/android/sessionreplay/MapperTypeWrapper;", "customMappers", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "customOptionSelectorDetectors", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "customDrawableMappers", "", "sampleRate", "", "startRecordingImmediately", "dynamicOptimizationEnabled", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "internalCallback", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/TouchPrivacy;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;Lcom/datadog/android/sessionreplay/ImagePrivacy;Ljava/util/List;Ljava/util/List;Ljava/util/List;FZZLcom/datadog/android/sessionreplay/SessionReplayInternalCallback;)V", "Lcom/datadog/android/core/sampling/Sampler;", "", "rateBasedSampler", "Lcom/datadog/android/sessionreplay/internal/RecorderProvider;", "recorderProvider", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/TouchPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/core/sampling/Sampler;ZLcom/datadog/android/sessionreplay/internal/RecorderProvider;)V", "Camera2StreamConfigurationMap", "()Z", "manuallyStartRecording$dd_sdk_android_session_replay_release", "()V", "manuallyStopRecording$dd_sdk_android_session_replay_release", "Landroid/content/Context;", "appContext", "onInitialize", "(Landroid/content/Context;)V", "", "event", "onReceive", "(Ljava/lang/Object;)V", "onStop", "startRecording$dd_sdk_android_session_replay_release", "stopRecording$dd_sdk_android_session_replay_release", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;", "dataWriter", "Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;", "getDataWriter$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;", "setDataWriter$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;)V", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "getImagePrivacy$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/ImagePrivacy;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_session_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "name", "getName", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", "getPrivacy$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/core/sampling/Sampler;", "getOutputFormats", "Lcom/datadog/android/sessionreplay/internal/RecorderProvider;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/net/RequestFactory;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "Lcom/datadog/android/sessionreplay/internal/SessionReplayRumContextProvider;", "getInputFormats", "Lcom/datadog/android/sessionreplay/internal/SessionReplayRumContextProvider;", "getOutputMinFrameDuration", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/sessionreplay/internal/recorder/Recorder;", "sessionReplayRecorder", "Lcom/datadog/android/sessionreplay/internal/recorder/Recorder;", "getSessionReplayRecorder$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/internal/recorder/Recorder;", "setSessionReplayRecorder$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/internal/recorder/Recorder;)V", "getOutputMinFrameDurationlomOqCM", "Z", "getOutputSizes", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "getTextAndInputPrivacy$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "getTouchPrivacy$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/TouchPrivacy;", "getOutputSizeshNQ4ISI", "getOutputStallDuration", "Companion", "SessionData"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplayFeature implements com.datadog.android.api.feature.StorageBackedFeature, com.datadog.android.api.feature.FeatureEventReceiver {
    public static final java.lang.String CANNOT_START_RECORDING_NOT_INITIALIZED = "Cannot start session recording, because Session Replay feature is not initialized.";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.SessionReplayFeature.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.SessionReplayFeature.Companion(null);
    public static final java.lang.String EVENT_MISSING_MANDATORY_FIELDS = "Session Replay feature received an event where one or more mandatory (keepSession) fields are either missing or have wrong type.";
    public static final java.lang.String REQUIRES_APPLICATION_CONTEXT_WARN_MESSAGE = "Session Replay could not be initialized without the Application context.";
    public static final java.lang.String RUM_KEEP_SESSION_BUS_MESSAGE_KEY = "keepSession";
    public static final java.lang.String RUM_SESSION_ID_BUS_MESSAGE_KEY = "sessionId";
    public static final java.lang.String RUM_SESSION_RENEWED_BUS_MESSAGE = "rum_session_renewed";
    public static final java.lang.String SESSION_NOT_KEPT_MESSAGE = "This session was not kept. No replay will be provided for it.";
    public static final java.lang.String SESSION_REPLAY_BUS_MESSAGE_TYPE_KEY = "type";
    public static final java.lang.String SESSION_REPLAY_ENABLED_KEY = "session_replay_is_enabled";
    public static final java.lang.String SESSION_REPLAY_IMAGE_PRIVACY_KEY = "session_replay_image_privacy";
    public static final java.lang.String SESSION_REPLAY_SAMPLE_RATE_KEY = "session_replay_sample_rate";
    public static final java.lang.String SESSION_REPLAY_START_IMMEDIATE_RECORDING_KEY = "session_replay_start_immediate_recording";
    public static final java.lang.String SESSION_REPLAY_TEXT_AND_INPUT_PRIVACY_KEY = "session_replay_text_and_input_privacy";
    public static final java.lang.String SESSION_REPLAY_TOUCH_PRIVACY_KEY = "session_replay_touch_privacy";
    public static final java.lang.String SESSION_SAMPLED_OUT_MESSAGE = "This session was sampled out from recording. No replay will be provided for it.";
    private static final com.datadog.android.api.storage.FeatureStorageConfiguration STORAGE_CONFIGURATION;
    public static final java.lang.String UNKNOWN_EVENT_TYPE_PROPERTY_VALUE = "Session Replay feature received an event with unknown value of \"type\" property=%s.";
    public static final java.lang.String UNSUPPORTED_EVENT_TYPE = "Session Replay feature receive an event of unsupported type=%s.";
    private final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap;
    private com.datadog.android.sessionreplay.internal.storage.RecordWriter dataWriter;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.SessionReplayRumContextProvider getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.sampling.Sampler<kotlin.Unit> getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.RecorderProvider getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getInputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final boolean getOutputSizes;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getOutputStallDuration;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getOutputMinFrameDurationlomOqCM;
    private final com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy;
    private final java.util.concurrent.atomic.AtomicBoolean initialized;
    private final java.lang.String name;
    private final com.datadog.android.sessionreplay.SessionReplayPrivacy privacy;
    private final com.datadog.android.api.net.RequestFactory requestFactory;
    private com.datadog.android.sessionreplay.internal.recorder.Recorder sessionReplayRecorder;
    private final com.datadog.android.api.storage.FeatureStorageConfiguration storageConfiguration;
    private final com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy;
    private final com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy;

    public SessionReplayFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str, com.datadog.android.sessionreplay.SessionReplayPrivacy sessionReplayPrivacy, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.core.sampling.Sampler<kotlin.Unit> sampler, boolean z, com.datadog.android.sessionreplay.internal.RecorderProvider recorderProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recorderProvider, "");
        this.getInputFormats = featureSdkCore;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.privacy = sessionReplayPrivacy;
        this.textAndInputPrivacy = textAndInputPrivacy;
        this.touchPrivacy = touchPrivacy;
        this.imagePrivacy = imagePrivacy;
        this.getOutputFormats = sampler;
        this.getOutputSizes = z;
        this.getHighSpeedVideoSizesFor = recorderProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicBoolean(z);
        this.getOutputStallDuration = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.sessionReplayRecorder = new com.datadog.android.sessionreplay.internal.recorder.NoOpRecorder();
        this.dataWriter = new com.datadog.android.sessionreplay.internal.storage.NoOpRecordWriter();
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getInputSizeshNQ4ISI = new com.datadog.android.sessionreplay.internal.SessionReplayRumContextProvider();
        this.name = "session-replay";
        this.requestFactory = new com.datadog.android.sessionreplay.internal.net.SegmentRequestFactory(str, new com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper(featureSdkCore.getInternalLogger()), null, 4, null);
        this.storageConfiguration = STORAGE_CONFIGURATION;
    }

    /* renamed from: getPrivacy$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.SessionReplayPrivacy getPrivacy() {
        return this.privacy;
    }

    /* renamed from: getTextAndInputPrivacy$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.TextAndInputPrivacy getTextAndInputPrivacy() {
        return this.textAndInputPrivacy;
    }

    /* renamed from: getTouchPrivacy$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.TouchPrivacy getTouchPrivacy() {
        return this.touchPrivacy;
    }

    /* renamed from: getImagePrivacy$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.ImagePrivacy getImagePrivacy() {
        return this.imagePrivacy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionReplayFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str, com.datadog.android.sessionreplay.SessionReplayPrivacy sessionReplayPrivacy, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, java.util.List<? extends com.datadog.android.sessionreplay.MapperTypeWrapper<?>> list, java.util.List<? extends com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> list2, java.util.List<? extends com.datadog.android.sessionreplay.utils.DrawableToColorMapper> list3, float f, boolean z, boolean z2, com.datadog.android.sessionreplay.SessionReplayInternalCallback sessionReplayInternalCallback) {
        this(featureSdkCore, str, sessionReplayPrivacy, textAndInputPrivacy, touchPrivacy, imagePrivacy, new com.datadog.android.core.sampling.RateBasedSampler(f), z, new com.datadog.android.sessionreplay.internal.DefaultRecorderProvider(featureSdkCore, textAndInputPrivacy, imagePrivacy, touchPrivacyManager, list, list2, list3, z2, sessionReplayInternalCallback));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayInternalCallback, "");
    }

    /* renamed from: getSessionReplayRecorder$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.internal.recorder.Recorder getSessionReplayRecorder() {
        return this.sessionReplayRecorder;
    }

    public final void setSessionReplayRecorder$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.internal.recorder.Recorder recorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recorder, "");
        this.sessionReplayRecorder = recorder;
    }

    /* renamed from: getDataWriter$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.internal.storage.RecordWriter getDataWriter() {
        return this.dataWriter;
    }

    public final void setDataWriter$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.internal.storage.RecordWriter recordWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordWriter, "");
        this.dataWriter = recordWriter;
    }

    /* renamed from: getInitialized$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        if (appContext instanceof android.app.Application) {
            this.getHighSpeedVideoSizes = appContext;
            this.getInputFormats.setEventReceiver("session-replay", this);
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getInputFormats;
            kotlin.jvm.internal.Intrinsics.checkNotNull(featureSdkCore, "");
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2 = featureSdkCore;
            com.datadog.android.sessionreplay.internal.ResourcesFeature resourcesFeature = new com.datadog.android.sessionreplay.internal.ResourcesFeature(featureSdkCore2, this.getHighSpeedVideoFpsRangesFor);
            featureSdkCore2.registerFeature(resourcesFeature);
            com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager = new com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager(this.getInputFormats, new com.datadog.android.sessionreplay.internal.resources.ResourceHashesEntrySerializer(), new com.datadog.android.sessionreplay.internal.resources.ResourceHashesEntryDeserializer(this.getInputFormats.getInternalLogger()));
            this.dataWriter = new com.datadog.android.sessionreplay.internal.storage.SessionReplayRecordWriter(this.getInputFormats, new com.datadog.android.sessionreplay.internal.SessionReplayRecordCallback(this.getInputFormats));
            this.getInputFormats.setContextUpdateReceiver(this.getInputSizeshNQ4ISI);
            com.datadog.android.sessionreplay.internal.recorder.Recorder provideSessionReplayRecorder = this.getHighSpeedVideoSizesFor.provideSessionReplayRecorder(resourceDataStoreManager, resourcesFeature.getDataWriter(), this.dataWriter, this.getInputSizeshNQ4ISI, (android.app.Application) appContext);
            this.sessionReplayRecorder = provideSessionReplayRecorder;
            provideSessionReplayRecorder.registerCallbacks();
            this.initialized.set(true);
            this.getInputFormats.updateFeatureContext("session-replay", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$onInitialize$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                    getHighSpeedVideoFpsRanges(map);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.Object> map) {
                    com.datadog.android.core.sampling.Sampler sampler;
                    boolean z;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                    sampler = com.datadog.android.sessionreplay.internal.SessionReplayFeature.this.getOutputFormats;
                    java.lang.Float sampleRate = sampler.getSampleRate();
                    map.put("session_replay_sample_rate", sampleRate != null ? java.lang.Long.valueOf((long) sampleRate.floatValue()) : null);
                    z = com.datadog.android.sessionreplay.internal.SessionReplayFeature.this.getOutputSizes;
                    map.put("session_replay_start_immediate_recording", java.lang.Boolean.valueOf(z));
                    java.lang.String obj = com.datadog.android.sessionreplay.internal.SessionReplayFeature.this.getTouchPrivacy().toString();
                    java.util.Locale locale = java.util.Locale.US;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String lowerCase = obj.toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    map.put("session_replay_touch_privacy", lowerCase);
                    java.lang.String obj2 = com.datadog.android.sessionreplay.internal.SessionReplayFeature.this.getImagePrivacy().toString();
                    java.util.Locale locale2 = java.util.Locale.US;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                    java.lang.String lowerCase2 = obj2.toLowerCase(locale2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    map.put("session_replay_image_privacy", lowerCase2);
                    java.lang.String obj3 = com.datadog.android.sessionreplay.internal.SessionReplayFeature.this.getTextAndInputPrivacy().toString();
                    java.util.Locale locale3 = java.util.Locale.US;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
                    java.lang.String lowerCase3 = obj3.toLowerCase(locale3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                    map.put("session_replay_text_and_input_privacy", lowerCase3);
                }

                {
                    super(1);
                }
            });
            return;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$logMissingApplicationContextError$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.internal.SessionReplayFeature.REQUIRES_APPLICATION_CONTEXT_WARN_MESSAGE;
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.net.RequestFactory getRequestFactory() {
        return this.requestFactory;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.storage.FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        stopRecording$dd_sdk_android_session_replay_release();
        this.getInputFormats.removeContextUpdateReceiver(this.getInputSizeshNQ4ISI);
        this.sessionReplayRecorder.unregisterCallbacks();
        this.sessionReplayRecorder.stopProcessingRecords();
        this.dataWriter = new com.datadog.android.sessionreplay.internal.storage.NoOpRecordWriter();
        this.sessionReplayRecorder = new com.datadog.android.sessionreplay.internal.recorder.NoOpRecorder();
        this.initialized.set(false);
    }

    @Override // com.datadog.android.api.feature.FeatureEventReceiver
    public final void onReceive(final java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof java.util.Map)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$onReceive$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.internal.SessionReplayFeature.UNSUPPORTED_EVENT_TYPE, java.util.Arrays.copyOf(new java.lang.Object[]{event.getClass().getCanonicalName()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        if (Camera2StreamConfigurationMap()) {
            final java.util.Map map = (java.util.Map) event;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(map.get("type"), "rum_session_renewed")) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$handleRumSession$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.internal.SessionReplayFeature.UNKNOWN_EVENT_TYPE_PROPERTY_VALUE, java.util.Arrays.copyOf(new java.lang.Object[]{map.get("type")}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return;
            }
            java.lang.Object obj = map.get("keepSession");
            com.datadog.android.sessionreplay.internal.SessionReplayFeature.SessionData sessionData = null;
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            java.lang.Object obj2 = map.get("sessionId");
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (bool != null && str != null) {
                sessionData = new com.datadog.android.sessionreplay.internal.SessionReplayFeature.SessionData(bool.booleanValue(), str);
            } else {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$logEventMissingMandatoryFieldsError$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.sessionreplay.internal.SessionReplayFeature.EVENT_MISSING_MANDATORY_FIELDS;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            if (sessionData != null) {
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI.get(), sessionData.getHighSpeedVideoFpsRanges);
                if (!areEqual || this.getOutputStallDuration.get()) {
                    if (!areEqual) {
                        this.getHighSpeedVideoFpsRanges.set(this.getOutputFormats.sample(kotlin.Unit.INSTANCE));
                    }
                    if (sessionData.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges.get()) {
                        this.getOutputMinFrameDuration.set(this.getOutputMinFrameDurationlomOqCM.get());
                    } else {
                        this.getOutputMinFrameDuration.set(false);
                        if (!sessionData.getHighResolutionOutputSizeshNQ4ISI) {
                            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$logNotKeptMessage$1
                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                public final java.lang.String invoke() {
                                    return com.datadog.android.sessionreplay.internal.SessionReplayFeature.SESSION_NOT_KEPT_MESSAGE;
                                }
                            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                        } else {
                            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$logSampledOutMessage$1
                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                public final java.lang.String invoke() {
                                    return com.datadog.android.sessionreplay.internal.SessionReplayFeature.SESSION_SAMPLED_OUT_MESSAGE;
                                }
                            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                        }
                    }
                    if (this.getOutputMinFrameDuration.get()) {
                        startRecording$dd_sdk_android_session_replay_release();
                    } else {
                        stopRecording$dd_sdk_android_session_replay_release();
                    }
                    this.getOutputStallDuration.set(false);
                    this.getHighResolutionOutputSizeshNQ4ISI.set(sessionData.getHighSpeedVideoFpsRanges);
                }
            }
        }
    }

    public final void manuallyStopRecording$dd_sdk_android_session_replay_release() {
        if (this.getOutputMinFrameDurationlomOqCM.compareAndSet(true, false)) {
            this.getOutputStallDuration.set(true);
        }
    }

    public final void manuallyStartRecording$dd_sdk_android_session_replay_release() {
        if (this.getOutputMinFrameDurationlomOqCM.compareAndSet(false, true)) {
            this.getOutputStallDuration.set(true);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/SessionReplayFeature$SessionData;", "", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class SessionData {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRanges;

        public SessionData(boolean z, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final java.lang.String toString() {
            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionData(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(z);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.datadog.android.sessionreplay.internal.SessionReplayFeature.SessionData)) {
                return false;
            }
            com.datadog.android.sessionreplay.internal.SessionReplayFeature.SessionData sessionData = (com.datadog.android.sessionreplay.internal.SessionReplayFeature.SessionData) p0;
            return this.getHighResolutionOutputSizeshNQ4ISI == sessionData.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, sessionData.getHighSpeedVideoFpsRanges);
        }
    }

    private final boolean Camera2StreamConfigurationMap() {
        if (this.initialized.get()) {
            return true;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getInputFormats.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$logNotInitializedError$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.internal.SessionReplayFeature.CANNOT_START_RECORDING_NOT_INITIALIZED;
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return false;
    }

    public final void startRecording$dd_sdk_android_session_replay_release() {
        if (!Camera2StreamConfigurationMap() || this.Camera2StreamConfigurationMap.getAndSet(true)) {
            return;
        }
        com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(this.getInputFormats, "session-replay", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$startRecording$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                getHighResolutionOutputSizeshNQ4ISI(map);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                map.put(com.datadog.android.sessionreplay.internal.SessionReplayFeature.SESSION_REPLAY_ENABLED_KEY, java.lang.Boolean.TRUE);
            }
        }, 2, null);
        this.sessionReplayRecorder.resumeRecorders();
    }

    public final void stopRecording$dd_sdk_android_session_replay_release() {
        if (this.Camera2StreamConfigurationMap.getAndSet(false)) {
            com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(this.getInputFormats, "session-replay", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.SessionReplayFeature$stopRecording$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                    getHighSpeedVideoSizes(map);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.Object> map) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                    map.put(com.datadog.android.sessionreplay.internal.SessionReplayFeature.SESSION_REPLAY_ENABLED_KEY, java.lang.Boolean.FALSE);
                }
            }, 2, null);
            this.sessionReplayRecorder.stopRecorders();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00158\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/SessionReplayFeature$Companion;", "", "<init>", "()V", "", "CANNOT_START_RECORDING_NOT_INITIALIZED", "Ljava/lang/String;", "EVENT_MISSING_MANDATORY_FIELDS", "REQUIRES_APPLICATION_CONTEXT_WARN_MESSAGE", "RUM_KEEP_SESSION_BUS_MESSAGE_KEY", "RUM_SESSION_ID_BUS_MESSAGE_KEY", "RUM_SESSION_RENEWED_BUS_MESSAGE", "SESSION_NOT_KEPT_MESSAGE", "SESSION_REPLAY_BUS_MESSAGE_TYPE_KEY", "SESSION_REPLAY_ENABLED_KEY", "SESSION_REPLAY_IMAGE_PRIVACY_KEY", "SESSION_REPLAY_SAMPLE_RATE_KEY", "SESSION_REPLAY_START_IMMEDIATE_RECORDING_KEY", "SESSION_REPLAY_TEXT_AND_INPUT_PRIVACY_KEY", "SESSION_REPLAY_TOUCH_PRIVACY_KEY", "SESSION_SAMPLED_OUT_MESSAGE", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "STORAGE_CONFIGURATION", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getSTORAGE_CONFIGURATION$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "UNKNOWN_EVENT_TYPE_PROPERTY_VALUE", "UNSUPPORTED_EVENT_TYPE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.api.storage.FeatureStorageConfiguration getSTORAGE_CONFIGURATION$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.SessionReplayFeature.STORAGE_CONFIGURATION;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        com.datadog.android.api.storage.FeatureStorageConfiguration copy;
        copy = r1.copy((r16 & 1) != 0 ? r1.maxItemSize : 10485760L, (r16 & 2) != 0 ? r1.maxItemsPerBatch : 0, (r16 & 4) != 0 ? r1.maxBatchSize : 10485760L, (r16 & 8) != 0 ? com.datadog.android.api.storage.FeatureStorageConfiguration.INSTANCE.getDEFAULT().oldBatchThreshold : androidx.work.WorkRequest.MAX_BACKOFF_MILLIS);
        STORAGE_CONFIGURATION = copy;
    }
}
