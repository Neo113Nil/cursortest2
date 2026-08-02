package com.datadog.android.sessionreplay.internal.recorder.callback;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/callback/MotionEventUtils;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "pointerIndex", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "", "getPointerAbsoluteX", "(Landroid/view/MotionEvent;ILcom/datadog/android/internal/system/BuildSdkVersionProvider;)F", "getPointerAbsoluteY"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MotionEventUtils {
    public static final com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils INSTANCE = new com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils();

    private MotionEventUtils() {
    }

    public static /* synthetic */ float getPointerAbsoluteX$default(com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils motionEventUtils, android.view.MotionEvent motionEvent, int i, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            buildSdkVersionProvider = com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT();
        }
        return motionEventUtils.getPointerAbsoluteX(motionEvent, i, buildSdkVersionProvider);
    }

    public final float getPointerAbsoluteX(android.view.MotionEvent event, int pointerIndex, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        if (buildSdkVersionProvider.getIsAtLeastQ()) {
            return event.getRawX(pointerIndex);
        }
        return event.getRawX();
    }

    public static /* synthetic */ float getPointerAbsoluteY$default(com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils motionEventUtils, android.view.MotionEvent motionEvent, int i, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            buildSdkVersionProvider = com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT();
        }
        return motionEventUtils.getPointerAbsoluteY(motionEvent, i, buildSdkVersionProvider);
    }

    public final float getPointerAbsoluteY(android.view.MotionEvent event, int pointerIndex, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        if (buildSdkVersionProvider.getIsAtLeastQ()) {
            return event.getRawY(pointerIndex);
        }
        return event.getRawY();
    }
}
