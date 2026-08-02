package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001UB\u0089\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÀ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011HÀ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0018HÀ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001aHÀ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006HÀ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÀ\u0003¢\u0006\u0004\b,\u0010+J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÀ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\rHÀ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000fHÀ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011HÀ\u0003¢\u0006\u0004\b2\u0010#J\u0010\u00103\u001a\u00020\u0013HÀ\u0003¢\u0006\u0004\b3\u00104Jª\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\b\u0002\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010\u001fR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001fR$\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bB\u0010+R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bC\u0010+R\u001a\u0010\u0017\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bE\u0010#R\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u00101R\u001a\u0010\u001b\u001a\u00020\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bI\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010)R\u001a\u0010\u000e\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010/R\u001a\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bN\u0010#R\u001a\u0010\u0019\u001a\u00020\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bP\u0010%R\u001a\u0010\u0016\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010Q\u001a\u0004\bR\u0010!R\u001a\u0010\u0014\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\bT\u00104"}, d2 = {"Lcom/datadog/android/sessionreplay/SessionReplayConfiguration;", "", "", "customEndpointUrl", "Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "", "Lcom/datadog/android/sessionreplay/MapperTypeWrapper;", "customMappers", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "customOptionSelectorDetectors", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "customDrawableMappers", "", "sampleRate", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "", "startRecordingImmediately", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "touchPrivacy", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "dynamicOptimizationEnabled", "Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "systemRequirementsConfiguration", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "internalCallback", "<init>", "(Ljava/lang/String;Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;Ljava/util/List;Ljava/util/List;Ljava/util/List;FLcom/datadog/android/sessionreplay/ImagePrivacy;ZLcom/datadog/android/sessionreplay/TouchPrivacy;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;ZLcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;)V", "component1$dd_sdk_android_session_replay_release", "()Ljava/lang/String;", "component10$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "component11$dd_sdk_android_session_replay_release", "()Z", "component12$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "component13$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "component2$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", "component3$dd_sdk_android_session_replay_release", "()Ljava/util/List;", "component4$dd_sdk_android_session_replay_release", "component5$dd_sdk_android_session_replay_release", "component6$dd_sdk_android_session_replay_release", "()F", "component7$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/ImagePrivacy;", "component8$dd_sdk_android_session_replay_release", "component9$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/TouchPrivacy;", "copy", "(Ljava/lang/String;Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;Ljava/util/List;Ljava/util/List;Ljava/util/List;FLcom/datadog/android/sessionreplay/ImagePrivacy;ZLcom/datadog/android/sessionreplay/TouchPrivacy;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;ZLcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getCustomDrawableMappers$dd_sdk_android_session_replay_release", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_session_replay_release", "getCustomMappers$dd_sdk_android_session_replay_release", "getCustomOptionSelectorDetectors$dd_sdk_android_session_replay_release", "Z", "getDynamicOptimizationEnabled$dd_sdk_android_session_replay_release", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "getImagePrivacy$dd_sdk_android_session_replay_release", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "getInternalCallback$dd_sdk_android_session_replay_release", "Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", "getPrivacy$dd_sdk_android_session_replay_release", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate$dd_sdk_android_session_replay_release", "getStartRecordingImmediately$dd_sdk_android_session_replay_release", "Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "getSystemRequirementsConfiguration$dd_sdk_android_session_replay_release", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "getTextAndInputPrivacy$dd_sdk_android_session_replay_release", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "getTouchPrivacy$dd_sdk_android_session_replay_release", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionReplayConfiguration {
    private final java.util.List<com.datadog.android.sessionreplay.utils.DrawableToColorMapper> customDrawableMappers;
    private final java.lang.String customEndpointUrl;
    private final java.util.List<com.datadog.android.sessionreplay.MapperTypeWrapper<?>> customMappers;
    private final java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> customOptionSelectorDetectors;
    private final boolean dynamicOptimizationEnabled;
    private final com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy;
    private final com.datadog.android.sessionreplay.SessionReplayInternalCallback internalCallback;
    private final com.datadog.android.sessionreplay.SessionReplayPrivacy privacy;
    private final float sampleRate;
    private final boolean startRecordingImmediately;
    private final com.datadog.android.sessionreplay.SystemRequirementsConfiguration systemRequirementsConfiguration;
    private final com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy;
    private final com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionReplayConfiguration(java.lang.String str, com.datadog.android.sessionreplay.SessionReplayPrivacy sessionReplayPrivacy, java.util.List<? extends com.datadog.android.sessionreplay.MapperTypeWrapper<?>> list, java.util.List<? extends com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> list2, java.util.List<? extends com.datadog.android.sessionreplay.utils.DrawableToColorMapper> list3, float f, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, boolean z, com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, boolean z2, com.datadog.android.sessionreplay.SystemRequirementsConfiguration systemRequirementsConfiguration, com.datadog.android.sessionreplay.SessionReplayInternalCallback sessionReplayInternalCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemRequirementsConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayInternalCallback, "");
        this.customEndpointUrl = str;
        this.privacy = sessionReplayPrivacy;
        this.customMappers = list;
        this.customOptionSelectorDetectors = list2;
        this.customDrawableMappers = list3;
        this.sampleRate = f;
        this.imagePrivacy = imagePrivacy;
        this.startRecordingImmediately = z;
        this.touchPrivacy = touchPrivacy;
        this.textAndInputPrivacy = textAndInputPrivacy;
        this.dynamicOptimizationEnabled = z2;
        this.systemRequirementsConfiguration = systemRequirementsConfiguration;
        this.internalCallback = sessionReplayInternalCallback;
    }

    public final java.lang.String getCustomEndpointUrl$dd_sdk_android_session_replay_release() {
        return this.customEndpointUrl;
    }

    public final com.datadog.android.sessionreplay.SessionReplayPrivacy getPrivacy$dd_sdk_android_session_replay_release() {
        return this.privacy;
    }

    public final java.util.List<com.datadog.android.sessionreplay.MapperTypeWrapper<?>> getCustomMappers$dd_sdk_android_session_replay_release() {
        return this.customMappers;
    }

    public final java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> getCustomOptionSelectorDetectors$dd_sdk_android_session_replay_release() {
        return this.customOptionSelectorDetectors;
    }

    public final java.util.List<com.datadog.android.sessionreplay.utils.DrawableToColorMapper> getCustomDrawableMappers$dd_sdk_android_session_replay_release() {
        return this.customDrawableMappers;
    }

    public final float getSampleRate$dd_sdk_android_session_replay_release() {
        return this.sampleRate;
    }

    public final com.datadog.android.sessionreplay.ImagePrivacy getImagePrivacy$dd_sdk_android_session_replay_release() {
        return this.imagePrivacy;
    }

    public final boolean getStartRecordingImmediately$dd_sdk_android_session_replay_release() {
        return this.startRecordingImmediately;
    }

    public final com.datadog.android.sessionreplay.TouchPrivacy getTouchPrivacy$dd_sdk_android_session_replay_release() {
        return this.touchPrivacy;
    }

    public final com.datadog.android.sessionreplay.TextAndInputPrivacy getTextAndInputPrivacy$dd_sdk_android_session_replay_release() {
        return this.textAndInputPrivacy;
    }

    public final boolean getDynamicOptimizationEnabled$dd_sdk_android_session_replay_release() {
        return this.dynamicOptimizationEnabled;
    }

    public final com.datadog.android.sessionreplay.SystemRequirementsConfiguration getSystemRequirementsConfiguration$dd_sdk_android_session_replay_release() {
        return this.systemRequirementsConfiguration;
    }

    public final com.datadog.android.sessionreplay.SessionReplayInternalCallback getInternalCallback$dd_sdk_android_session_replay_release() {
        return this.internalCallback;
    }

    @kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0015\u0018\u0000 K2\u00020\u0001:\u0001KB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0019\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0014J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\n068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00107R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00105R\u0016\u00109\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010:R\u0016\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010;\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00105R\u0016\u0010F\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010G\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010J"}, d2 = {"Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "", "<init>", "()V", "", "sampleRate", "(F)V", "Lcom/datadog/android/api/InternalLogger;", "logger", "(FLcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/sessionreplay/ExtensionSupport;", "extensionSupport", "addExtensionSupport", "(Lcom/datadog/android/sessionreplay/ExtensionSupport;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Lcom/datadog/android/sessionreplay/SessionReplayConfiguration;", "build", "()Lcom/datadog/android/sessionreplay/SessionReplayConfiguration;", "", "dynamicOptimizationEnabled", "setDynamicOptimizationEnabled", "(Z)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "level", "setImagePrivacy", "(Lcom/datadog/android/sessionreplay/ImagePrivacy;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "internalCallback", "setInternalCallback$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "setPrivacy", "(Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "systemRequirementsConfiguration", "setSystemRequirements", "(Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "setTextAndInputPrivacy", "(Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "setTouchPrivacy", "(Lcom/datadog/android/sessionreplay/TouchPrivacy;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "enabled", "startRecordingImmediately", "", "endpoint", "useCustomEndpoint", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Z", "", "Ljava/util/Set;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "getOutputFormats", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "getInputFormats", "Lcom/datadog/android/api/InternalLogger;", "getOutputMinFrameDuration", "Lcom/datadog/android/sessionreplay/SessionReplayPrivacy;", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getOutputStallDuration", "Lcom/datadog/android/sessionreplay/SystemRequirementsConfiguration;", "getOutputMinFrameDurationlomOqCM", "getOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "getOutputSizes", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final java.lang.String DUPLICATE_EXTENSION_DETECTED = "Attempting to add support twice for the same extension %s. The duplicate will be ignored.";
        public static final java.lang.String DUPLICATE_MAPPER_DETECTED = "Duplicate mapper for %s. The duplicate will be ignored.";
        public static final float SAMPLE_IN_ALL_SESSIONS = 100.0f;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private com.datadog.android.sessionreplay.ImagePrivacy getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.util.Set<com.datadog.android.sessionreplay.ExtensionSupport> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private boolean getOutputFormats;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private final com.datadog.android.api.InternalLogger getOutputMinFrameDuration;
        private final float getInputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private com.datadog.android.sessionreplay.SessionReplayInternalCallback getInputFormats;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private com.datadog.android.sessionreplay.SessionReplayPrivacy getHighSpeedVideoSizesFor;

        /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
        private com.datadog.android.sessionreplay.TouchPrivacy getOutputSizeshNQ4ISI;

        /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.datadog.android.sessionreplay.TextAndInputPrivacy getOutputSizes;

        /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
        private com.datadog.android.sessionreplay.SystemRequirementsConfiguration getOutputMinFrameDurationlomOqCM;

        public Builder() {
            this(100.0f, com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND());
        }

        public /* synthetic */ Builder(float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 100.0f : f);
        }

        public Builder(float f) {
            this(f, com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND());
        }

        public Builder(float f, com.datadog.android.api.InternalLogger internalLogger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
            this.getHighSpeedVideoSizesFor = com.datadog.android.sessionreplay.SessionReplayPrivacy.MASK;
            this.getHighSpeedVideoFpsRanges = com.datadog.android.sessionreplay.ImagePrivacy.MASK_ALL;
            this.getOutputFormats = true;
            this.getOutputSizeshNQ4ISI = com.datadog.android.sessionreplay.TouchPrivacy.HIDE;
            this.getOutputSizes = com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL;
            this.Camera2StreamConfigurationMap = new java.util.LinkedHashSet();
            this.getHighSpeedVideoSizes = true;
            this.getOutputMinFrameDurationlomOqCM = com.datadog.android.sessionreplay.SystemRequirementsConfiguration.INSTANCE.getNONE();
            this.getInputFormats = new com.datadog.android.sessionreplay.NoOpSessionReplayInternalCallback();
            this.getInputSizeshNQ4ISI = f;
            this.getOutputMinFrameDuration = internalLogger;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder addExtensionSupport(final com.datadog.android.sessionreplay.ExtensionSupport extensionSupport) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionSupport, "");
            java.util.Set<com.datadog.android.sessionreplay.ExtensionSupport> set = this.Camera2StreamConfigurationMap;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.datadog.android.sessionreplay.ExtensionSupport) it.next()).name(), extensionSupport.name())) {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputMinFrameDuration, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.SessionReplayConfiguration$Builder$addExtensionSupport$2
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder.DUPLICATE_EXTENSION_DETECTED, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.sessionreplay.ExtensionSupport.this.name()}, 1));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                return format;
                            }

                            {
                                super(0);
                            }
                        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                        return this;
                    }
                }
            }
            this.Camera2StreamConfigurationMap.add(extensionSupport);
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder useCustomEndpoint(java.lang.String endpoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
            this.getHighResolutionOutputSizeshNQ4ISI = endpoint;
            return this;
        }

        @kotlin.Deprecated(message = "This method is deprecated and will be removed in future versions. Use the new fine grained masking apis instead: [setImagePrivacy], [setTouchPrivacy], [setTextAndInputPrivacy].")
        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setPrivacy(com.datadog.android.sessionreplay.SessionReplayPrivacy privacy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacy, "");
            if (!this.getHighSpeedVideoFpsRangesFor) {
                int i = com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder.WhenMappings.$EnumSwitchMapping$0[privacy.ordinal()];
                if (i == 1) {
                    this.getOutputSizeshNQ4ISI = com.datadog.android.sessionreplay.TouchPrivacy.SHOW;
                    this.getHighSpeedVideoFpsRanges = com.datadog.android.sessionreplay.ImagePrivacy.MASK_NONE;
                    this.getOutputSizes = com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_SENSITIVE_INPUTS;
                } else {
                    if (i == 2) {
                        this.getOutputSizeshNQ4ISI = com.datadog.android.sessionreplay.TouchPrivacy.HIDE;
                        this.getHighSpeedVideoFpsRanges = com.datadog.android.sessionreplay.ImagePrivacy.MASK_LARGE_ONLY;
                        this.getOutputSizes = com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL_INPUTS;
                        return this;
                    }
                    if (i == 3) {
                        this.getOutputSizeshNQ4ISI = com.datadog.android.sessionreplay.TouchPrivacy.HIDE;
                        this.getHighSpeedVideoFpsRanges = com.datadog.android.sessionreplay.ImagePrivacy.MASK_ALL;
                        this.getOutputSizes = com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL;
                        return this;
                    }
                }
            }
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setImagePrivacy(com.datadog.android.sessionreplay.ImagePrivacy level) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges = level;
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setTouchPrivacy(com.datadog.android.sessionreplay.TouchPrivacy level) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputSizeshNQ4ISI = level;
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder startRecordingImmediately(boolean enabled) {
            this.getOutputFormats = enabled;
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setTextAndInputPrivacy(com.datadog.android.sessionreplay.TextAndInputPrivacy level) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputSizes = level;
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setDynamicOptimizationEnabled(boolean dynamicOptimizationEnabled) {
            this.getHighSpeedVideoSizes = dynamicOptimizationEnabled;
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setSystemRequirements(com.datadog.android.sessionreplay.SystemRequirementsConfiguration systemRequirementsConfiguration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemRequirementsConfiguration, "");
            this.getOutputMinFrameDurationlomOqCM = systemRequirementsConfiguration;
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setInternalCallback$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.SessionReplayInternalCallback internalCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalCallback, "");
            this.getInputFormats = internalCallback;
            return this;
        }

        public final com.datadog.android.sessionreplay.SessionReplayConfiguration build() {
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            com.datadog.android.sessionreplay.SessionReplayPrivacy sessionReplayPrivacy = this.getHighSpeedVideoSizesFor;
            com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy = this.getHighSpeedVideoFpsRanges;
            com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy = this.getOutputSizeshNQ4ISI;
            com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy = this.getOutputSizes;
            java.util.Set<com.datadog.android.sessionreplay.ExtensionSupport> set = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((com.datadog.android.sessionreplay.ExtensionSupport) it.next()).getCustomViewMappers());
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : arrayList2) {
                com.datadog.android.sessionreplay.MapperTypeWrapper mapperTypeWrapper = (com.datadog.android.sessionreplay.MapperTypeWrapper) obj;
                java.lang.Object obj2 = linkedHashMap.get(mapperTypeWrapper);
                if (obj2 == null) {
                    obj2 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(mapperTypeWrapper, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                if (((java.util.List) entry.getValue()).size() > 1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                final com.datadog.android.sessionreplay.MapperTypeWrapper mapperTypeWrapper2 = (com.datadog.android.sessionreplay.MapperTypeWrapper) ((java.util.Map.Entry) it2.next()).getKey();
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputMinFrameDuration, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.SessionReplayConfiguration$Builder$customMappers$3$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder.DUPLICATE_MAPPER_DETECTED, java.util.Arrays.copyOf(new java.lang.Object[]{mapperTypeWrapper2.getType$dd_sdk_android_session_replay_release()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            java.util.List list = kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.distinct(arrayList2));
            java.util.Set<com.datadog.android.sessionreplay.ExtensionSupport> set2 = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = set2.iterator();
            while (it3.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList3, ((com.datadog.android.sessionreplay.ExtensionSupport) it3.next()).getOptionSelectorDetectors());
            }
            java.util.List list2 = kotlin.collections.CollectionsKt.toList(arrayList3);
            java.util.Set<com.datadog.android.sessionreplay.ExtensionSupport> set3 = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator<T> it4 = set3.iterator();
            while (it4.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList4, ((com.datadog.android.sessionreplay.ExtensionSupport) it4.next()).getCustomDrawableMapper());
            }
            return new com.datadog.android.sessionreplay.SessionReplayConfiguration(str, sessionReplayPrivacy, list, list2, kotlin.collections.CollectionsKt.toList(arrayList4), this.getInputSizeshNQ4ISI, imagePrivacy, this.getOutputFormats, touchPrivacy, textAndInputPrivacy, this.getHighSpeedVideoSizes, this.getOutputMinFrameDurationlomOqCM, this.getInputFormats);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.datadog.android.sessionreplay.SessionReplayPrivacy.values().length];
                try {
                    iArr[com.datadog.android.sessionreplay.SessionReplayPrivacy.ALLOW.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.datadog.android.sessionreplay.SessionReplayPrivacy.MASK_USER_INPUT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.datadog.android.sessionreplay.SessionReplayPrivacy.MASK.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.customEndpointUrl;
        com.datadog.android.sessionreplay.SessionReplayPrivacy sessionReplayPrivacy = this.privacy;
        java.util.List<com.datadog.android.sessionreplay.MapperTypeWrapper<?>> list = this.customMappers;
        java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> list2 = this.customOptionSelectorDetectors;
        java.util.List<com.datadog.android.sessionreplay.utils.DrawableToColorMapper> list3 = this.customDrawableMappers;
        float f = this.sampleRate;
        com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy = this.imagePrivacy;
        boolean z = this.startRecordingImmediately;
        com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy = this.touchPrivacy;
        com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy = this.textAndInputPrivacy;
        boolean z2 = this.dynamicOptimizationEnabled;
        com.datadog.android.sessionreplay.SystemRequirementsConfiguration systemRequirementsConfiguration = this.systemRequirementsConfiguration;
        com.datadog.android.sessionreplay.SessionReplayInternalCallback sessionReplayInternalCallback = this.internalCallback;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionReplayConfiguration(customEndpointUrl=");
        sb.append(str);
        sb.append(", privacy=");
        sb.append(sessionReplayPrivacy);
        sb.append(", customMappers=");
        sb.append(list);
        sb.append(", customOptionSelectorDetectors=");
        sb.append(list2);
        sb.append(", customDrawableMappers=");
        sb.append(list3);
        sb.append(", sampleRate=");
        sb.append(f);
        sb.append(", imagePrivacy=");
        sb.append(imagePrivacy);
        sb.append(", startRecordingImmediately=");
        sb.append(z);
        sb.append(", touchPrivacy=");
        sb.append(touchPrivacy);
        sb.append(", textAndInputPrivacy=");
        sb.append(textAndInputPrivacy);
        sb.append(", dynamicOptimizationEnabled=");
        sb.append(z2);
        sb.append(", systemRequirementsConfiguration=");
        sb.append(systemRequirementsConfiguration);
        sb.append(", internalCallback=");
        sb.append(sessionReplayInternalCallback);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.customEndpointUrl;
        return ((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.privacy.hashCode()) * 31) + this.customMappers.hashCode()) * 31) + this.customOptionSelectorDetectors.hashCode()) * 31) + this.customDrawableMappers.hashCode()) * 31) + java.lang.Float.hashCode(this.sampleRate)) * 31) + this.imagePrivacy.hashCode()) * 31) + java.lang.Boolean.hashCode(this.startRecordingImmediately)) * 31) + this.touchPrivacy.hashCode()) * 31) + this.textAndInputPrivacy.hashCode()) * 31) + java.lang.Boolean.hashCode(this.dynamicOptimizationEnabled)) * 31) + this.systemRequirementsConfiguration.hashCode()) * 31) + this.internalCallback.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.SessionReplayConfiguration)) {
            return false;
        }
        com.datadog.android.sessionreplay.SessionReplayConfiguration sessionReplayConfiguration = (com.datadog.android.sessionreplay.SessionReplayConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customEndpointUrl, sessionReplayConfiguration.customEndpointUrl) && this.privacy == sessionReplayConfiguration.privacy && kotlin.jvm.internal.Intrinsics.areEqual(this.customMappers, sessionReplayConfiguration.customMappers) && kotlin.jvm.internal.Intrinsics.areEqual(this.customOptionSelectorDetectors, sessionReplayConfiguration.customOptionSelectorDetectors) && kotlin.jvm.internal.Intrinsics.areEqual(this.customDrawableMappers, sessionReplayConfiguration.customDrawableMappers) && java.lang.Float.compare(this.sampleRate, sessionReplayConfiguration.sampleRate) == 0 && this.imagePrivacy == sessionReplayConfiguration.imagePrivacy && this.startRecordingImmediately == sessionReplayConfiguration.startRecordingImmediately && this.touchPrivacy == sessionReplayConfiguration.touchPrivacy && this.textAndInputPrivacy == sessionReplayConfiguration.textAndInputPrivacy && this.dynamicOptimizationEnabled == sessionReplayConfiguration.dynamicOptimizationEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.systemRequirementsConfiguration, sessionReplayConfiguration.systemRequirementsConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.internalCallback, sessionReplayConfiguration.internalCallback);
    }

    public final com.datadog.android.sessionreplay.SessionReplayConfiguration copy(java.lang.String customEndpointUrl, com.datadog.android.sessionreplay.SessionReplayPrivacy privacy, java.util.List<? extends com.datadog.android.sessionreplay.MapperTypeWrapper<?>> customMappers, java.util.List<? extends com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> customOptionSelectorDetectors, java.util.List<? extends com.datadog.android.sessionreplay.utils.DrawableToColorMapper> customDrawableMappers, float sampleRate, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, boolean startRecordingImmediately, com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, boolean dynamicOptimizationEnabled, com.datadog.android.sessionreplay.SystemRequirementsConfiguration systemRequirementsConfiguration, com.datadog.android.sessionreplay.SessionReplayInternalCallback internalCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customMappers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customOptionSelectorDetectors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customDrawableMappers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemRequirementsConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalCallback, "");
        return new com.datadog.android.sessionreplay.SessionReplayConfiguration(customEndpointUrl, privacy, customMappers, customOptionSelectorDetectors, customDrawableMappers, sampleRate, imagePrivacy, startRecordingImmediately, touchPrivacy, textAndInputPrivacy, dynamicOptimizationEnabled, systemRequirementsConfiguration, internalCallback);
    }

    /* renamed from: component9$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.TouchPrivacy getTouchPrivacy() {
        return this.touchPrivacy;
    }

    /* renamed from: component8$dd_sdk_android_session_replay_release, reason: from getter */
    public final boolean getStartRecordingImmediately() {
        return this.startRecordingImmediately;
    }

    /* renamed from: component7$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.ImagePrivacy getImagePrivacy() {
        return this.imagePrivacy;
    }

    /* renamed from: component6$dd_sdk_android_session_replay_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    public final java.util.List<com.datadog.android.sessionreplay.utils.DrawableToColorMapper> component5$dd_sdk_android_session_replay_release() {
        return this.customDrawableMappers;
    }

    public final java.util.List<com.datadog.android.sessionreplay.recorder.OptionSelectorDetector> component4$dd_sdk_android_session_replay_release() {
        return this.customOptionSelectorDetectors;
    }

    public final java.util.List<com.datadog.android.sessionreplay.MapperTypeWrapper<?>> component3$dd_sdk_android_session_replay_release() {
        return this.customMappers;
    }

    /* renamed from: component2$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.SessionReplayPrivacy getPrivacy() {
        return this.privacy;
    }

    /* renamed from: component13$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.SessionReplayInternalCallback getInternalCallback() {
        return this.internalCallback;
    }

    /* renamed from: component12$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.SystemRequirementsConfiguration getSystemRequirementsConfiguration() {
        return this.systemRequirementsConfiguration;
    }

    /* renamed from: component11$dd_sdk_android_session_replay_release, reason: from getter */
    public final boolean getDynamicOptimizationEnabled() {
        return this.dynamicOptimizationEnabled;
    }

    /* renamed from: component10$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.TextAndInputPrivacy getTextAndInputPrivacy() {
        return this.textAndInputPrivacy;
    }

    /* renamed from: component1$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }
}
