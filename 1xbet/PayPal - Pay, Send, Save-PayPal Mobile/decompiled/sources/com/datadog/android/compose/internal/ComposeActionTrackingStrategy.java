package com.datadog.android.compose.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ1\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010 \u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/compose/internal/ComposeActionTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils;", "layoutNodeUtils", "<init>", "(Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils;)V", "Landroid/view/View;", "view", "", "x", "y", "Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForScroll", "(Landroid/view/View;FF)Lcom/datadog/android/rum/tracking/ViewTarget;", "findTargetForTap", "Landroidx/compose/ui/node/Owner;", "p0", "p1", "p2", "", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/node/Owner;FFZ)Lcom/datadog/android/rum/tracking/ViewTarget;", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/SdkCore;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposeActionTrackingStrategy implements com.datadog.android.rum.tracking.ActionTrackingStrategy {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.compose.internal.utils.LayoutNodeUtils getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.datadog.android.api.SdkCore getHighSpeedVideoFpsRanges;

    public ComposeActionTrackingStrategy(com.datadog.android.compose.internal.utils.LayoutNodeUtils layoutNodeUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutNodeUtils, "");
        this.getHighResolutionOutputSizeshNQ4ISI = layoutNodeUtils;
    }

    public /* synthetic */ ComposeActionTrackingStrategy(com.datadog.android.compose.internal.utils.LayoutNodeUtils layoutNodeUtils, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.compose.internal.utils.LayoutNodeUtils() : layoutNodeUtils);
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = sdkCore;
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public final com.datadog.android.rum.tracking.ViewTarget findTargetForTap(android.view.View view, float x, float y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if ((view instanceof androidx.compose.ui.node.Owner ? (androidx.compose.ui.node.Owner) view : null) != null) {
            return getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.node.Owner) view, x, y, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.datadog.android.rum.tracking.ActionTrackingStrategy
    public final com.datadog.android.rum.tracking.ViewTarget findTargetForScroll(android.view.View view, float x, float y) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        if ((view instanceof androidx.compose.ui.node.Owner ? (androidx.compose.ui.node.Owner) view : null) != null) {
            return getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.node.Owner) view, x, y, true);
        }
        return null;
    }

    private final com.datadog.android.rum.tracking.ViewTarget getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.Owner p0, float p1, float p2, boolean p3) {
        com.datadog.android.api.InternalLogger internalLogger;
        androidx.compose.ui.geometry.Rect layoutNodeBoundsInWindow;
        com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode resolveLayoutNode;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            linkedList.add(p0.getRoot());
            com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode targetNode = null;
            while (!linkedList.isEmpty()) {
                androidx.compose.ui.node.LayoutNode layoutNode = (androidx.compose.ui.node.LayoutNode) linkedList.poll();
                if (layoutNode != null) {
                    if (layoutNode.isPlaced() && (layoutNodeBoundsInWindow = this.getHighResolutionOutputSizeshNQ4ISI.getLayoutNodeBoundsInWindow(layoutNode)) != null && p1 >= layoutNodeBoundsInWindow.getLeft() && p1 <= layoutNodeBoundsInWindow.getRight() && p2 >= layoutNodeBoundsInWindow.getTop() && p2 <= layoutNodeBoundsInWindow.getBottom() && (resolveLayoutNode = this.getHighResolutionOutputSizeshNQ4ISI.resolveLayoutNode(layoutNode)) != null) {
                        if (resolveLayoutNode.isScrollable() && p3) {
                            targetNode = resolveLayoutNode;
                        }
                        if (!resolveLayoutNode.isClickable() || p3) {
                            resolveLayoutNode = targetNode;
                        }
                        targetNode = resolveLayoutNode;
                    }
                    linkedList.addAll(layoutNode.getZSortedChildren().asMutableList());
                }
            }
            if (targetNode != null) {
                return new com.datadog.android.rum.tracking.ViewTarget(null, new com.datadog.android.rum.tracking.Node(targetNode.getTag(), targetNode.getCustomAttributes()), 1, null);
            }
            return null;
        } catch (java.lang.Exception e) {
            com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRanges;
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
            if (featureSdkCore != null && (internalLogger = featureSdkCore.getInternalLogger()) != null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.compose.internal.ComposeActionTrackingStrategy$logAddQueueException$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Failed to add layout node into the processing queue.";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeActionTrackingStrategy() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
