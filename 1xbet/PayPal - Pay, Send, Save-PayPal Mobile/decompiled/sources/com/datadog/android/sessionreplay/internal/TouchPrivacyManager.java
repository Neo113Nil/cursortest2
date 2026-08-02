package com.datadog.android.sessionreplay.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016R0\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0017j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0017j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "globalTouchPrivacy", "<init>", "(Lcom/datadog/android/sessionreplay/TouchPrivacy;)V", "Landroid/graphics/Rect;", "bounds", "touchPrivacy", "", "addTouchOverrideArea", "(Landroid/graphics/Rect;Lcom/datadog/android/sessionreplay/TouchPrivacy;)V", "", "getCurrentOverrideAreas$dd_sdk_android_session_replay_release", "()Ljava/util/Map;", "getNextOverrideAreas$dd_sdk_android_session_replay_release", "Landroid/graphics/Point;", "touchLocation", "", "shouldRecordTouch$dd_sdk_android_session_replay_release", "(Landroid/graphics/Point;)Z", "updateCurrentTouchOverrideAreas$dd_sdk_android_session_replay_release", "()V", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/HashMap;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/TouchPrivacy;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TouchPrivacyManager {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.TouchPrivacy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.HashMap<android.graphics.Rect, com.datadog.android.sessionreplay.TouchPrivacy> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.HashMap<android.graphics.Rect, com.datadog.android.sessionreplay.TouchPrivacy> getHighSpeedVideoFpsRanges;

    public TouchPrivacyManager(com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = touchPrivacy;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap<>();
    }

    public final void addTouchOverrideArea(android.graphics.Rect bounds, com.datadog.android.sessionreplay.TouchPrivacy touchPrivacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacy, "");
        this.getHighSpeedVideoFpsRanges.put(bounds, touchPrivacy);
    }

    public final void updateCurrentTouchOverrideAreas$dd_sdk_android_session_replay_release() {
        this.Camera2StreamConfigurationMap.clear();
        this.Camera2StreamConfigurationMap.putAll(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges.clear();
    }

    public final boolean shouldRecordTouch$dd_sdk_android_session_replay_release(android.graphics.Point touchLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchLocation, "");
        boolean z = false;
        for (java.util.Map.Entry<android.graphics.Rect, com.datadog.android.sessionreplay.TouchPrivacy> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            android.graphics.Rect key = entry.getKey();
            com.datadog.android.sessionreplay.TouchPrivacy value = entry.getValue();
            if (key.contains(touchLocation.x, touchLocation.y)) {
                int i = com.datadog.android.sessionreplay.internal.TouchPrivacyManager.WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
                if (i == 1) {
                    return false;
                }
                if (i == 2) {
                    z = true;
                }
            }
        }
        return z || this.getHighResolutionOutputSizeshNQ4ISI == com.datadog.android.sessionreplay.TouchPrivacy.SHOW;
    }

    public final java.util.Map<android.graphics.Rect, com.datadog.android.sessionreplay.TouchPrivacy> getCurrentOverrideAreas$dd_sdk_android_session_replay_release() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Map<android.graphics.Rect, com.datadog.android.sessionreplay.TouchPrivacy> getNextOverrideAreas$dd_sdk_android_session_replay_release() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.sessionreplay.TouchPrivacy.values().length];
            try {
                iArr[com.datadog.android.sessionreplay.TouchPrivacy.HIDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.sessionreplay.TouchPrivacy.SHOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
