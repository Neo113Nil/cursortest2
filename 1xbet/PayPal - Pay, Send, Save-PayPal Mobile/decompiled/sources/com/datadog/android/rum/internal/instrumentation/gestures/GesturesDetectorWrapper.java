package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "", "Landroid/content/Context;", "context", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;", "gestureListener", "<init>", "(Landroid/content/Context;Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;)V", "Landroidx/core/view/GestureDetectorCompat;", "defaultGesturesDetector", "(Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;Landroidx/core/view/GestureDetectorCompat;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "getHighSpeedVideoFpsRanges", "Landroidx/core/view/GestureDetectorCompat;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GesturesDetectorWrapper {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.core.view.GestureDetectorCompat getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener Camera2StreamConfigurationMap;

    public GesturesDetectorWrapper(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener gesturesListener, androidx.core.view.GestureDetectorCompat gestureDetectorCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gesturesListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gestureDetectorCompat, "");
        this.Camera2StreamConfigurationMap = gesturesListener;
        this.getHighSpeedVideoFpsRangesFor = gestureDetectorCompat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GesturesDetectorWrapper(android.content.Context context, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener gesturesListener) {
        this(gesturesListener, new androidx.core.view.GestureDetectorCompat(context, gesturesListener));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gesturesListener, "");
    }

    public final void onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (this.getHighSpeedVideoFpsRangesFor.onTouchEvent(event) || event.getActionMasked() != 1) {
            return;
        }
        this.Camera2StreamConfigurationMap.onUp(event);
    }
}
