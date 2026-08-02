package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/AndroidActionTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "<init>", "()V", "Landroid/view/View;", "view", "", "x", "y", "Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForScroll", "(Landroid/view/View;FF)Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForTap", "p0", "p1", "p2", "", "p3", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/View;FF[I)Z", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V", "getHighSpeedVideoSizes", "[I", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidActionTrackingStrategy implements com.datadog.android.rum.tracking.ActionTrackingStrategy {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int[] getHighResolutionOutputSizeshNQ4ISI = new int[2];

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(android.content.Context context) {
    }

    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public final com.datadog.android.rum.tracking.ViewTarget findTargetForTap(android.view.View view, float x, float y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (getHighSpeedVideoFpsRangesFor(view, x, y, this.getHighResolutionOutputSizeshNQ4ISI) && view.isClickable() && view.getVisibility() == 0) {
            return new com.datadog.android.rum.tracking.ViewTarget(new java.lang.ref.WeakReference(view), null, 2, null);
        }
        return null;
    }

    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public final com.datadog.android.rum.tracking.ViewTarget findTargetForScroll(android.view.View view, float x, float y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if (getHighSpeedVideoFpsRangesFor(view, x, y, this.getHighResolutionOutputSizeshNQ4ISI) && view.getVisibility() == 0 && (androidx.core.view.ScrollingView.class.isAssignableFrom(view.getClass()) || android.widget.AbsListView.class.isAssignableFrom(view.getClass()) || android.widget.ScrollView.class.isAssignableFrom(view.getClass()))) {
            return new com.datadog.android.rum.tracking.ViewTarget(new java.lang.ref.WeakReference(view), null, 2, null);
        }
        return null;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(android.view.View p0, float p1, float p2, int[] p3) {
        p0.getLocationInWindow(p3);
        int i = p3[0];
        int i2 = p3[1];
        return p1 >= ((float) i) && p1 <= ((float) (i + p0.getWidth())) && p2 >= ((float) i2) && p2 <= ((float) (i2 + p0.getHeight()));
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
