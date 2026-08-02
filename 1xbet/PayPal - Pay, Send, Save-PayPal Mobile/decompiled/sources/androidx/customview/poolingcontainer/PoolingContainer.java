package androidx.customview.poolingcontainer;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0003*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0005\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"(\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0016\u001a\u00020\u0010*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013\"\u0018\u0010\u0019\u001a\u00020\u0017*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018"}, d2 = {"Landroid/view/View;", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addPoolingContainerListener", "(Landroid/view/View;Landroidx/customview/poolingcontainer/PoolingContainerListener;)V", "callPoolingContainerOnRelease", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "callPoolingContainerOnReleaseForChildren", "(Landroid/view/ViewGroup;)V", "removePoolingContainerListener", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isPoolingContainer", "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isWithinPoolingContainer", "Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "(Landroid/view/View;)Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PoolingContainer {
    private static final int Camera2StreamConfigurationMap = androidx.customview.poolingcontainer.R.id.pooling_container_listener_holder_tag;
    private static final int getHighSpeedVideoFpsRanges = androidx.customview.poolingcontainer.R.id.is_pooling_container_tag;

    public static final void addPoolingContainerListener(android.view.View view, androidx.customview.poolingcontainer.PoolingContainerListener poolingContainerListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolingContainerListener, "");
        androidx.customview.poolingcontainer.PoolingContainerListenerHolder highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolingContainerListener, "");
        highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.add(poolingContainerListener);
    }

    public static final void removePoolingContainerListener(android.view.View view, androidx.customview.poolingcontainer.PoolingContainerListener poolingContainerListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolingContainerListener, "");
        androidx.customview.poolingcontainer.PoolingContainerListenerHolder highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolingContainerListener, "");
        highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.remove(poolingContainerListener);
    }

    public static final boolean isPoolingContainer(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag(getHighSpeedVideoFpsRanges);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void setPoolingContainer(android.view.View view, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setTag(getHighSpeedVideoFpsRanges, java.lang.Boolean.valueOf(z));
    }

    public static final boolean isWithinPoolingContainer(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        for (java.lang.Object obj : androidx.core.view.ViewKt.getAncestors(view)) {
            if ((obj instanceof android.view.View) && isPoolingContainer((android.view.View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void callPoolingContainerOnRelease(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.util.Iterator<android.view.View> it = androidx.core.view.ViewKt.getAllViews(view).iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(it.next()).Camera2StreamConfigurationMap();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        java.util.Iterator<android.view.View> it = androidx.core.view.ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(it.next()).Camera2StreamConfigurationMap();
        }
    }

    private static final androidx.customview.poolingcontainer.PoolingContainerListenerHolder getHighSpeedVideoFpsRanges(android.view.View view) {
        int i = Camera2StreamConfigurationMap;
        androidx.customview.poolingcontainer.PoolingContainerListenerHolder poolingContainerListenerHolder = (androidx.customview.poolingcontainer.PoolingContainerListenerHolder) view.getTag(i);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        androidx.customview.poolingcontainer.PoolingContainerListenerHolder poolingContainerListenerHolder2 = new androidx.customview.poolingcontainer.PoolingContainerListenerHolder();
        view.setTag(i, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }
}
