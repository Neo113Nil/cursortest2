package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "Landroid/view/View;", "view", "", "x", "y", "Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForScroll", "(Landroid/view/View;FF)Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForTap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ActionTrackingStrategy extends com.datadog.android.rum.tracking.TrackingStrategy {
    com.datadog.android.rum.tracking.ViewTarget findTargetForScroll(android.view.View view, float x, float y);

    com.datadog.android.rum.tracking.ViewTarget findTargetForTap(android.view.View view, float x, float y);
}
