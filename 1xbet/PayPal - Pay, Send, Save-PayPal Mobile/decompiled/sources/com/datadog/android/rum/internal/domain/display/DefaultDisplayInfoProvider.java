package com.datadog.android.rum.internal.domain.display;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010!\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/rum/internal/domain/display/DefaultDisplayInfoProvider;", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "Landroid/content/Context;", "applicationContext", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/internal/domain/display/SystemSettingsWrapper;", "systemSettingsWrapper", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/content/Context;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/rum/internal/domain/display/SystemSettingsWrapper;Landroid/content/ContentResolver;Landroid/os/Handler;)V", "", "cleanup", "()V", "getState", "()Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/internal/domain/display/DefaultDisplayInfoProvider$brightnessObserver$1;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/domain/display/DefaultDisplayInfoProvider$brightnessObserver$1;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroid/content/ContentResolver;", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "Landroid/os/Handler;", "getInputFormats", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "Lcom/datadog/android/rum/internal/domain/display/SystemSettingsWrapper;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultDisplayInfoProvider implements com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> {
    private static final com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider.Companion Companion = new com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider.Companion(null);

    @java.lang.Deprecated
    public static final float DECIMAL_SCALING = 10.0f;

    @java.lang.Deprecated
    public static final float MAX_BRIGHTNESS = 255.0f;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.ContentResolver getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile com.datadog.android.rum.internal.domain.display.DisplayInfo Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider$brightnessObserver$1 getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.display.SystemSettingsWrapper getInputSizeshNQ4ISI;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider$brightnessObserver$1] */
    public DefaultDisplayInfoProvider(android.content.Context context, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.internal.domain.display.SystemSettingsWrapper systemSettingsWrapper, android.content.ContentResolver contentResolver, final android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemSettingsWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoSizesFor = internalLogger;
        this.getInputSizeshNQ4ISI = systemSettingsWrapper;
        this.getHighSpeedVideoFpsRangesFor = contentResolver;
        this.getHighResolutionOutputSizeshNQ4ISI = handler;
        this.Camera2StreamConfigurationMap = new com.datadog.android.rum.internal.domain.display.DisplayInfo(null, 1, null);
        ?? r2 = new android.database.ContentObserver(handler) { // from class: com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider$brightnessObserver$1
            @Override // android.database.ContentObserver
            public final void onChange(boolean selfChange) {
                com.datadog.android.rum.internal.domain.display.SystemSettingsWrapper systemSettingsWrapper2;
                com.datadog.android.rum.internal.domain.display.DisplayInfo displayInfo;
                systemSettingsWrapper2 = com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider.this.getInputSizeshNQ4ISI;
                int i = systemSettingsWrapper2.getInt("screen_brightness");
                if (i != Integer.MIN_VALUE) {
                    float access$normalizeValue = com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider.access$normalizeValue(com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider.this, i);
                    com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider defaultDisplayInfoProvider = com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider.this;
                    displayInfo = defaultDisplayInfoProvider.Camera2StreamConfigurationMap;
                    defaultDisplayInfoProvider.Camera2StreamConfigurationMap = displayInfo.copy(java.lang.Float.valueOf(access$normalizeValue));
                }
            }
        };
        this.getHighSpeedVideoFpsRanges = r2;
        android.net.Uri uriFor = android.provider.Settings.System.getUriFor("screen_brightness");
        if (uriFor != null) {
            contentResolver.registerContentObserver(uriFor, false, (android.database.ContentObserver) r2);
        }
        if (systemSettingsWrapper.getInt("screen_brightness") != Integer.MIN_VALUE) {
            this.Camera2StreamConfigurationMap = new com.datadog.android.rum.internal.domain.display.DisplayInfo(java.lang.Float.valueOf(kotlin.math.MathKt.roundToInt((r2 / 255.0f) * 10.0f) / 10.0f));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DefaultDisplayInfoProvider(android.content.Context context, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.internal.domain.display.SystemSettingsWrapper systemSettingsWrapper, android.content.ContentResolver contentResolver, android.os.Handler handler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, internalLogger, r3, contentResolver, (i & 16) != 0 ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler);
        com.datadog.android.rum.internal.domain.display.SystemSettingsWrapper systemSettingsWrapper2 = (i & 4) != 0 ? new com.datadog.android.rum.internal.domain.display.SystemSettingsWrapper(context, internalLogger) : systemSettingsWrapper;
        if ((i & 8) != 0) {
            contentResolver = context.getContentResolver();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentResolver, "");
        }
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    /* renamed from: getState, reason: avoid collision after fix types in other method and from getter */
    public final com.datadog.android.rum.internal.domain.display.DisplayInfo getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public final void cleanup() {
        this.getHighSpeedVideoFpsRangesFor.unregisterContentObserver(this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/domain/display/DefaultDisplayInfoProvider$Companion;", "", "<init>", "()V", "", "DECIMAL_SCALING", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "MAX_BRIGHTNESS"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ float access$normalizeValue(com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider defaultDisplayInfoProvider, int i) {
        return kotlin.math.MathKt.roundToInt((i / 255.0f) * 10.0f) / 10.0f;
    }
}
