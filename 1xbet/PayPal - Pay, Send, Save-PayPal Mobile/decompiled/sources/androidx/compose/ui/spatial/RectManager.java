package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\tJ\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010(\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070%¢\u0006\u0004\b(\u0010)JA\u0010*\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070%¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J%\u00103\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b5\u00100J\u001f\u00107\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u0016¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020\u0007*\u00020\u0003H\u0002¢\u0006\u0004\b<\u00100J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b>\u00100J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u00100J\u001b\u0010B\u001a\u00020\u0007*\u00020@2\u0006\u0010=\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0013\u0010<\u001a\u00020\u0016*\u00020@H\u0002¢\u0006\u0004\b<\u0010DJ\u0013\u0010E\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010:J\u0015\u0010F\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\bF\u00100J\u001f\u0010I\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000fH\u0000¢\u0006\u0004\bI\u0010JJ9\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010RJ3\u0010S\u001a\u00020\u0016*\u00020#2\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u000fH\u0000¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u00020\u0016*\u00020\u00032\u0006\u0010U\u001a\u00020\u0003H\u0000¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\bX\u00100R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0017\u0010\\\u001a\u00020[8\u0007¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010B\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010bR \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001b0c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010dR\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010eR\u0016\u0010<\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0016\u0010g\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010hR\u0016\u0010i\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010kR\u0014\u0010Y\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010l"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "<init>", "(Landroidx/collection/IntObjectMap;)V", "", "invalidate", "()V", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "windowOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "", "windowWidth", "windowHeight", "updateOffsets-gTq6Wqs", "(JJ[FII)V", "updateOffsets", "dispatchCallbacks", "", "ensureSomethingScheduled", "scheduleDebounceCallback", "(Z)V", "removeScheduledCallback", "Lkotlin/Function0;", com.sun.jna.Callback.METHOD_NAME, "registerOnChangedCallback", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChangedCallback", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalLayoutCallback", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "unregisterOnChangedCallback", "(Ljava/lang/Object;)V", "layoutNode", "invalidateCallbacksFor", "(Landroidx/compose/ui/node/LayoutNode;)V", "focusable", "gesturable", "updateFlagsFor", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "onLayoutLayerPositionalPropertiesChanged", "forceUpdate", "onLayoutPositionChanged", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "getOffsetFromRectListFor-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "getOffsetFromRectListFor", "getHighSpeedVideoFpsRangesFor", "p0", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/geometry/MutableRect;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V", "(Landroidx/compose/ui/node/NodeCoordinator;)Z", "getHighSpeedVideoSizes", "remove", "targetId", "otherId", "isTargetDrawnFirst$ui", "(II)Z", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "containerId", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "findFocusableNodeFromRect$ui", "(IIIII)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "intersects$ui", "(Landroidx/compose/ui/node/DelegatableNode;IIII)Z", "container", "isDescendantOf$ui", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)Z", "unsetHasCallbacksFor", "getHighSpeedVideoSizesFor", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/spatial/RectList;", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "getOutputMinFrameDuration", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "Landroidx/collection/MutableObjectList;", "Landroidx/collection/MutableObjectList;", "Z", "getInputFormats", "getInputSizeshNQ4ISI", "Ljava/lang/Object;", "getOutputFormats", "J", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/geometry/MutableRect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Object getInputFormats;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableObjectList<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.geometry.MutableRect getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.collection.IntObjectMap<androidx.compose.ui.node.LayoutNode> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getInputSizeshNQ4ISI;
    private long getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.ui.spatial.ThrottledCallbacks Camera2StreamConfigurationMap;
    private final androidx.compose.ui.spatial.RectList rects;

    public RectManager(androidx.collection.IntObjectMap<androidx.compose.ui.node.LayoutNode> intObjectMap) {
        this.getHighResolutionOutputSizeshNQ4ISI = intObjectMap;
        this.rects = new androidx.compose.ui.spatial.RectList();
        this.Camera2StreamConfigurationMap = new androidx.compose.ui.spatial.ThrottledCallbacks();
        this.getHighSpeedVideoSizes = new androidx.collection.MutableObjectList<>(0, 1, null);
        this.getOutputFormats = -1L;
        this.getOutputMinFrameDuration = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes() {
                androidx.compose.ui.spatial.RectManager.this.getInputFormats = null;
                androidx.compose.ui.spatial.RectManager rectManager = androidx.compose.ui.spatial.RectManager.this;
                android.os.Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    android.os.Trace.endSection();
                }
            }

            {
                super(0);
            }
        };
        this.getHighSpeedVideoSizesFor = new androidx.compose.ui.geometry.MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(androidx.collection.IntObjectMap intObjectMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.collection.IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }

    public final androidx.compose.ui.spatial.RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.getHighSpeedVideoFpsRanges = true;
    }

    /* renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m7818updateOffsetsgTq6Wqs(long screenOffset, long windowOffset, float[] viewToWindowMatrix, int windowWidth, int windowHeight) {
        int Camera2StreamConfigurationMap;
        Camera2StreamConfigurationMap = androidx.compose.ui.spatial.RectManagerKt.Camera2StreamConfigurationMap(viewToWindowMatrix);
        this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.m7831updateOffsetsLDcG7Xg(screenOffset, windowOffset, (Camera2StreamConfigurationMap & 2) != 0 ? null : viewToWindowMatrix, windowWidth, windowHeight) || this.getHighSpeedVideoFpsRangesFor;
    }

    public final void dispatchCallbacks() {
        int i;
        removeScheduledCallback();
        long currentTimeMillis = androidx.compose.ui.Actual_androidKt.currentTimeMillis();
        boolean z = this.getHighSpeedVideoFpsRanges;
        boolean z2 = z || this.getHighSpeedVideoFpsRangesFor;
        if (z) {
            this.getHighSpeedVideoFpsRanges = false;
            androidx.collection.MutableObjectList<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableObjectList = this.getHighSpeedVideoSizes;
            java.lang.Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((kotlin.jvm.functions.Function0) objArr[i3]).invoke();
            }
            androidx.compose.ui.spatial.RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i4 = rectList.itemsSize;
            int i5 = 0;
            while (i5 < jArr.length - 2 && i5 < i4) {
                long j = jArr[i5 + 2];
                if ((((int) (j >> 60)) & 1) != 0) {
                    i = i5;
                    this.Camera2StreamConfigurationMap.fireOnUpdatedRect(33554431 & ((int) j), jArr[i5], jArr[i5 + 1], currentTimeMillis);
                } else {
                    i = i5;
                }
                i5 = i + 3;
            }
            this.rects.clearUpdated();
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor = false;
            this.Camera2StreamConfigurationMap.fireOnRectChangedEntries(currentTimeMillis);
        }
        if (z2) {
            this.Camera2StreamConfigurationMap.fireGlobalChangeEntries(currentTimeMillis);
        }
        if (this.getInputSizeshNQ4ISI) {
            this.getInputSizeshNQ4ISI = false;
            this.rects.defragment();
        }
        this.Camera2StreamConfigurationMap.triggerDebounced(currentTimeMillis);
        if (this.Camera2StreamConfigurationMap.getMinDebounceDeadline() > 0) {
            scheduleDebounceCallback(true);
        }
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        boolean z = (ensureSomethingScheduled && this.getInputFormats == null) ? false : true;
        long minDebounceDeadline = this.Camera2StreamConfigurationMap.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z) {
            if (this.getOutputFormats == minDebounceDeadline && z) {
                return;
            }
            java.lang.Object obj = this.getInputFormats;
            if (obj != null) {
                androidx.compose.ui.Actual_androidKt.removePost(obj);
            }
            long currentTimeMillis = androidx.compose.ui.Actual_androidKt.currentTimeMillis();
            long max = java.lang.Math.max(minDebounceDeadline, 16 + currentTimeMillis);
            this.getOutputFormats = max;
            this.getInputFormats = androidx.compose.ui.Actual_androidKt.postDelayed(max - currentTimeMillis, this.getOutputMinFrameDuration);
        }
    }

    public final void removeScheduledCallback() {
        java.lang.Object obj = this.getInputFormats;
        if (obj != null) {
            androidx.compose.ui.Actual_androidKt.removePost(obj);
            this.getInputFormats = null;
        }
    }

    public final java.lang.Object registerOnChangedCallback(kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        this.getHighSpeedVideoSizes.add(callback);
        return callback;
    }

    public final androidx.compose.ui.node.DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int id, long throttleMillis, long debounceMillis, androidx.compose.ui.node.DelegatableNode node, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> callback) {
        androidx.compose.ui.node.DelegatableNode.RegistrationHandle registerOnRectChanged = this.Camera2StreamConfigurationMap.registerOnRectChanged(id, throttleMillis, debounceMillis, node, callback);
        if (androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node.getNode()).getAddedToRectList()) {
            this.rects.updateHasCallbacks(id, true);
        }
        invalidate();
        scheduleDebounceCallback(true);
        return registerOnRectChanged;
    }

    public final androidx.compose.ui.node.DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int id, long throttleMillis, long debounceMillis, androidx.compose.ui.node.DelegatableNode node, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> callback) {
        return this.Camera2StreamConfigurationMap.registerOnGlobalChange(id, throttleMillis, debounceMillis, node, callback);
    }

    public final void unregisterOnChangedCallback(java.lang.Object token) {
        if ((kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(token, 0) ? (kotlin.jvm.functions.Function0) token : null) == null) {
            return;
        }
        this.getHighSpeedVideoSizes.remove(token);
    }

    public final void invalidateCallbacksFor(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.getHighSpeedVideoFpsRanges = true;
            this.rects.markUpdated(layoutNode.getSemanticsId());
        }
        scheduleDebounceCallback(true);
    }

    public final void updateFlagsFor(androidx.compose.ui.node.LayoutNode layoutNode, boolean focusable, boolean gesturable) {
        if (layoutNode.isAttached()) {
            this.rects.updateFlagsFor(layoutNode.getSemanticsId(), focusable, gesturable);
        }
    }

    public final void onLayoutLayerPositionalPropertiesChanged(androidx.compose.ui.node.LayoutNode layoutNode) {
        boolean Camera2StreamConfigurationMap;
        if (layoutNode.isPlaced()) {
            long highSpeedVideoSizes = getHighSpeedVideoSizes(layoutNode);
            Camera2StreamConfigurationMap = androidx.compose.ui.spatial.RectManagerKt.Camera2StreamConfigurationMap(highSpeedVideoSizes);
            if (Camera2StreamConfigurationMap) {
                layoutNode.m7563setOuterToInnerOffsetgyyYBs$ui(highSpeedVideoSizes);
                layoutNode.setOuterToInnerOffsetDirty$ui(false);
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui();
                androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    onLayoutPositionChanged$default(this, layoutNodeArr[i], false, 2, null);
                }
                invalidateCallbacksFor(layoutNode);
                return;
            }
            getHighSpeedVideoFpsRanges(layoutNode);
        }
    }

    public static /* synthetic */ void onLayoutPositionChanged$default(androidx.compose.ui.spatial.RectManager rectManager, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        rectManager.onLayoutPositionChanged(layoutNode, z);
    }

    public final void onLayoutPositionChanged(androidx.compose.ui.node.LayoutNode layoutNode, boolean forceUpdate) {
        long m8739getMaxnOccac;
        boolean Camera2StreamConfigurationMap;
        long j;
        long j2;
        if (layoutNode.isPlaced()) {
            androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui != null && !parent$ui.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                if (parent$ui.getOuterToInnerOffsetDirty()) {
                    parent$ui.setOuterToInnerOffsetDirty$ui(false);
                    parent$ui.m7563setOuterToInnerOffsetgyyYBs$ui(getHighSpeedVideoSizes(parent$ui));
                }
                m8739getMaxnOccac = parent$ui.getOuterToInnerOffset();
            } else if (parent$ui == null) {
                m8739getMaxnOccac = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
            } else {
                m8739getMaxnOccac = androidx.compose.ui.unit.IntOffset.INSTANCE.m8739getMaxnOccac();
            }
            androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            Camera2StreamConfigurationMap = androidx.compose.ui.spatial.RectManagerKt.Camera2StreamConfigurationMap(m8739getMaxnOccac);
            if (Camera2StreamConfigurationMap && !getHighSpeedVideoFpsRangesFor(outerCoordinator$ui)) {
                if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                    long m8733plusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8739getMaxnOccac, outerCoordinator$ui.getPosition());
                    androidx.compose.ui.node.MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
                    int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
                    int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
                    long m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((measuredWidth << 32) | (measuredHeight & 4294967295L));
                    int semanticsId = layoutNode.getSemanticsId();
                    if (layoutNode.getAddedToRectList()) {
                        if (forceUpdate || !androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(m8733plusqkQi6aY, layoutNode.getLastOffsetFromParent()) || !androidx.compose.ui.unit.IntSize.m8770equalsimpl0(m8767constructorimpl, layoutNode.getLastSize())) {
                            if (parent$ui != null) {
                                this.rects.moveBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8733plusqkQi6aY), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8733plusqkQi6aY), measuredWidth, measuredHeight);
                            } else {
                                this.rects.move(semanticsId, androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8733plusqkQi6aY), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8733plusqkQi6aY), androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8733plusqkQi6aY) + measuredWidth, androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8733plusqkQi6aY) + measuredHeight);
                            }
                            invalidate();
                        }
                        j2 = m8767constructorimpl;
                    } else {
                        layoutNode.setAddedToRectList$ui(true);
                        boolean m7594hasH91voCI$ui = layoutNode.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024));
                        boolean m7594hasH91voCI$ui2 = layoutNode.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(16));
                        boolean containsKey = this.Camera2StreamConfigurationMap.getRectChangedMap().containsKey(semanticsId);
                        if (parent$ui != null) {
                            j = m8767constructorimpl;
                            this.rects.insertBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8733plusqkQi6aY), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8733plusqkQi6aY), measuredWidth, measuredHeight, m7594hasH91voCI$ui, m7594hasH91voCI$ui2, containsKey);
                        } else {
                            j = m8767constructorimpl;
                            this.rects.insert(semanticsId, androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8733plusqkQi6aY), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8733plusqkQi6aY), androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8733plusqkQi6aY) + measuredWidth, androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8733plusqkQi6aY) + measuredHeight, (r25 & 32) != 0 ? -1 : 0, (r25 & 64) != 0 ? false : m7594hasH91voCI$ui, (r25 & 128) != 0 ? false : m7594hasH91voCI$ui2, (r25 & 256) != 0 ? false : containsKey, (r25 & 512) != 0 ? -1 : 0);
                        }
                        invalidate();
                        j2 = j;
                    }
                    layoutNode.m7562setLastSizeozmzZPI$ui(j2);
                    layoutNode.m7561setLastOffsetFromParentgyyYBs$ui(m8733plusqkQi6aY);
                    return;
                }
                getHighSpeedVideoFpsRanges(layoutNode);
                getHighSpeedVideoFpsRangesFor(layoutNode);
                return;
            }
            getHighSpeedVideoFpsRanges(layoutNode);
        }
    }

    /* renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m7817getOffsetFromRectListForBjo55l4(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (this.rects.getTopLeft(layoutNode.getSemanticsId()) == Long.MAX_VALUE) {
            return androidx.compose.ui.unit.IntOffset.INSTANCE.m8739getMaxnOccac();
        }
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((((int) (r0 >> 32)) << 32) | (((int) r0) & 4294967295L));
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot() || getHighSpeedVideoFpsRangesFor(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(false);
        if (layoutNode.getOuterToInnerOffsetDirty()) {
            layoutNode.m7563setOuterToInnerOffsetgyyYBs$ui(getHighSpeedVideoSizes(layoutNode));
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
        }
        if (androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(layoutNode.getOuterToInnerOffset(), androidx.compose.ui.unit.IntOffset.INSTANCE.m8739getMaxnOccac())) {
            return;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            getHighSpeedVideoFpsRangesFor(layoutNodeArr[i]);
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode p0) {
        getHighResolutionOutputSizeshNQ4ISI(p0);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = p0.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.isPlaced()) {
                getHighSpeedVideoFpsRanges(layoutNode);
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode p0) {
        p0.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(true);
        p0.m7561setLastOffsetFromParentgyyYBs$ui(androidx.compose.ui.unit.IntOffset.INSTANCE.m8739getMaxnOccac());
        androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui = p0.getOuterCoordinator$ui();
        androidx.compose.ui.node.MeasurePassDelegate measurePassDelegate$ui = p0.getMeasurePassDelegate$ui();
        int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
        androidx.compose.ui.geometry.MutableRect mutableRect = this.getHighSpeedVideoSizesFor;
        mutableRect.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        Camera2StreamConfigurationMap(outerCoordinator$ui, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = p0.getSemanticsId();
        boolean addedToRectList = p0.getAddedToRectList();
        p0.setAddedToRectList$ui(true);
        if (!addedToRectList || !this.rects.update(semanticsId, left, top, right, bottom)) {
            androidx.compose.ui.node.LayoutNode parent$ui = p0.getParent$ui();
            this.rects.insert(semanticsId, left, top, right, bottom, (r25 & 32) != 0 ? -1 : parent$ui != null ? parent$ui.getSemanticsId() : -1, (r25 & 64) != 0 ? false : p0.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024)), (r25 & 128) != 0 ? false : p0.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(16)), (r25 & 256) != 0 ? false : this.Camera2StreamConfigurationMap.getRectChangedMap().containsKey(semanticsId), (r25 & 512) != 0 ? -1 : 0);
        }
        invalidate();
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, androidx.compose.ui.geometry.MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            androidx.compose.ui.node.LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long m7817getOffsetFromRectListForBjo55l4 = m7817getOffsetFromRectListForBjo55l4(layoutNode);
                if (!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(m7817getOffsetFromRectListForBjo55l4, androidx.compose.ui.unit.IntOffset.INSTANCE.m8739getMaxnOccac())) {
                    float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m7817getOffsetFromRectListForBjo55l4);
                    mutableRect.m5737translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.IntOffset.m8730getYimpl(m7817getOffsetFromRectListForBjo55l4)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8729getXimpl) << 32)));
                    return;
                }
            }
            androidx.compose.ui.node.OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] mo7678getUnderlyingMatrixsQKQjiQ = layer.mo7678getUnderlyingMatrixsQKQjiQ();
                if (!androidx.compose.ui.graphics.MatrixKt.m6247isIdentity58bKbWc(mo7678getUnderlyingMatrixsQKQjiQ)) {
                    androidx.compose.ui.graphics.Matrix.m6231mapimpl(mo7678getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            float m8729getXimpl2 = androidx.compose.ui.unit.IntOffset.m8729getXimpl(nodeCoordinator.getPosition());
            mutableRect.m5737translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.IntOffset.m8730getYimpl(r0)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8729getXimpl2) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        androidx.compose.ui.node.OwnedLayer layer = nodeCoordinator.getLayer();
        return (layer == null || androidx.compose.ui.graphics.MatrixKt.m6247isIdentity58bKbWc(layer.mo7678getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    private static long getHighSpeedVideoSizes(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        for (androidx.compose.ui.node.NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui(); innerCoordinator$ui != null && innerCoordinator$ui != outerCoordinator$ui; innerCoordinator$ui = innerCoordinator$ui.getWrappedBy()) {
            if (getHighSpeedVideoFpsRangesFor(innerCoordinator$ui)) {
                return androidx.compose.ui.unit.IntOffset.INSTANCE.m8739getMaxnOccac();
            }
            m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8740getZeronOccac, innerCoordinator$ui.getPosition());
        }
        return m8740getZeronOccac;
    }

    public final void remove(androidx.compose.ui.node.LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.rects.remove(layoutNode.getSemanticsId());
            layoutNode.setAddedToRectList$ui(false);
            invalidate();
            this.getInputSizeshNQ4ISI = true;
        }
    }

    public final boolean isTargetDrawnFirst$ui(int targetId, int otherId) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.node.LayoutNode parent$ui;
        androidx.compose.ui.node.LayoutNode layoutNode2 = this.getHighResolutionOutputSizeshNQ4ISI.get(targetId);
        if (layoutNode2 != null && (layoutNode = this.getHighResolutionOutputSizeshNQ4ISI.get(otherId)) != null && layoutNode2.getDepth() != 0 && layoutNode.getDepth() != 0) {
            while (layoutNode2.getDepth() > layoutNode.getDepth()) {
                layoutNode2 = layoutNode2.getParent$ui();
                if (layoutNode2 == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            while (layoutNode.getDepth() > layoutNode2.getDepth()) {
                layoutNode = layoutNode.getParent$ui();
                if (layoutNode == null) {
                    return false;
                }
            }
            if (layoutNode2 == layoutNode) {
                return false;
            }
            androidx.compose.ui.node.LayoutNode layoutNode3 = layoutNode;
            androidx.compose.ui.node.LayoutNode layoutNode4 = layoutNode3;
            androidx.compose.ui.node.LayoutNode layoutNode5 = layoutNode2;
            while (layoutNode2 != layoutNode3) {
                androidx.compose.ui.node.LayoutNode parent$ui2 = layoutNode2.getParent$ui();
                if (parent$ui2 == null || (parent$ui = layoutNode3.getParent$ui()) == null) {
                    return false;
                }
                layoutNode5 = layoutNode2;
                layoutNode2 = parent$ui2;
                layoutNode4 = layoutNode3;
                layoutNode3 = parent$ui;
            }
            if (layoutNode5.getMeasurePassDelegate$ui().getZIndex() == layoutNode4.getMeasurePassDelegate$ui().getZIndex()) {
                return layoutNode5.getPlaceOrder$ui() < layoutNode4.getPlaceOrder$ui();
            }
            if (layoutNode5.getMeasurePassDelegate$ui().getZIndex() < layoutNode4.getMeasurePassDelegate$ui().getZIndex()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v9 */
    public final androidx.compose.ui.focus.FocusTargetModifierNode findFocusableNodeFromRect$ui(int left, int top, int right, int bottom, int containerId) {
        long j;
        long j2;
        androidx.compose.ui.node.LayoutNode layoutNode;
        int i;
        androidx.compose.ui.node.LayoutNode layoutNode2;
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.node.LayoutNode layoutNode3;
        androidx.compose.ui.node.LayoutNode layoutNode4;
        long j3;
        androidx.compose.ui.Modifier.Node node2;
        boolean z;
        androidx.compose.ui.node.LayoutNode layoutNode5;
        long j4;
        androidx.compose.runtime.collection.MutableVector mutableVector;
        long j5;
        androidx.compose.ui.semantics.SemanticsInfo requireSemanticsInfo;
        androidx.compose.ui.node.LayoutNode layoutNode6 = this.getHighResolutionOutputSizeshNQ4ISI.get(containerId);
        if (layoutNode6 == null) {
            return null;
        }
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = androidx.compose.ui.node.LayoutNodeKt.requireOwner(layoutNode6).getFocusOwner().getActiveFocusTargetNode();
        int semanticsId = (activeFocusTargetNode == null || (requireSemanticsInfo = androidx.compose.ui.node.DelegatableNodeKt.requireSemanticsInfo(activeFocusTargetNode)) == null) ? -1 : requireSemanticsInfo.getSemanticsId();
        androidx.compose.ui.spatial.RectList rectList = this.rects;
        long j6 = left;
        long j7 = top;
        long j8 = right;
        long j9 = bottom;
        long[] jArr = rectList.items;
        int i2 = rectList.itemsSize;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = null;
        while (i4 < jArr.length - 2 && i4 < i2) {
            int i5 = i2;
            long j10 = jArr[i4 + 2];
            androidx.compose.ui.node.LayoutNode layoutNode7 = layoutNode6;
            boolean z2 = true;
            if ((((int) (j10 >> 61)) & 1) != 0) {
                if (((((((j9 & 4294967295L) | (j8 << 32)) - jArr[i4]) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((jArr[i4 + 1] - ((j7 & 4294967295L) | (j6 << 32))) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0 && (layoutNode2 = this.getHighResolutionOutputSizeshNQ4ISI.get((i = ((int) j10) & 33554431))) != null) {
                    if (semanticsId == i) {
                        node = null;
                        if (semanticsId != -1) {
                            return null;
                        }
                    } else {
                        node = null;
                    }
                    if (layoutNode2.getDepth() < i3) {
                        androidx.compose.ui.node.LayoutNode layoutNode8 = layoutNode7;
                        if (isDescendantOf$ui(layoutNode2, layoutNode8)) {
                            androidx.compose.ui.node.NodeChain nodes = layoutNode2.getNodes();
                            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
                            if ((nodes.getHighSpeedVideoFpsRangesFor() & m7621constructorimpl) != 0) {
                                androidx.compose.ui.Modifier.Node head = nodes.getHead();
                                while (head != null) {
                                    if ((head.getKindSet() & m7621constructorimpl) != 0) {
                                        androidx.compose.ui.Modifier.Node node3 = node;
                                        node2 = head;
                                        while (true) {
                                            layoutNode3 = layoutNode8;
                                            if (node2 == null) {
                                                layoutNode4 = layoutNode2;
                                                j3 = j8;
                                                z = true;
                                                break;
                                            }
                                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                                layoutNode4 = layoutNode2;
                                                j3 = j8;
                                                break;
                                            }
                                            if ((node2.getKindSet() & m7621constructorimpl) == 0 || !(node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                                layoutNode5 = layoutNode2;
                                                j4 = j8;
                                                mutableVector = node3;
                                            } else {
                                                androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate();
                                                layoutNode5 = layoutNode2;
                                                int i6 = 0;
                                                mutableVector = node3;
                                                while (delegate != null) {
                                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                                        i6++;
                                                        j5 = j8;
                                                        if (i6 == 1) {
                                                            node2 = delegate;
                                                        } else {
                                                            androidx.compose.runtime.collection.MutableVector mutableVector2 = mutableVector == 0 ? new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0) : mutableVector;
                                                            if (node2 != null) {
                                                                if (mutableVector2 != null) {
                                                                    mutableVector2.add(node2);
                                                                }
                                                                node2 = node;
                                                            }
                                                            if (mutableVector2 != null) {
                                                                mutableVector2.add(delegate);
                                                            }
                                                            mutableVector = mutableVector2;
                                                            delegate = delegate.getChild();
                                                            j8 = j5;
                                                            mutableVector = mutableVector;
                                                        }
                                                    } else {
                                                        j5 = j8;
                                                    }
                                                    delegate = delegate.getChild();
                                                    j8 = j5;
                                                    mutableVector = mutableVector;
                                                }
                                                j4 = j8;
                                                mutableVector = mutableVector;
                                                if (i6 == 1) {
                                                    layoutNode8 = layoutNode3;
                                                    layoutNode2 = layoutNode5;
                                                    j8 = j4;
                                                    node3 = mutableVector;
                                                }
                                            }
                                            node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                                            layoutNode8 = layoutNode3;
                                            layoutNode2 = layoutNode5;
                                            j8 = j4;
                                            node3 = mutableVector;
                                        }
                                    } else {
                                        layoutNode3 = layoutNode8;
                                        layoutNode4 = layoutNode2;
                                        j3 = j8;
                                        z = z2;
                                    }
                                    if ((head.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                                        break;
                                    }
                                    head = head.getChild();
                                    z2 = z;
                                    layoutNode8 = layoutNode3;
                                    layoutNode2 = layoutNode4;
                                    j8 = j3;
                                }
                            }
                            layoutNode3 = layoutNode8;
                            layoutNode4 = layoutNode2;
                            j3 = j8;
                            node2 = node;
                            androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) node2;
                            if (focusTargetNode2 != null) {
                                layoutNode = layoutNode3;
                                androidx.compose.ui.node.LayoutNode layoutNode9 = layoutNode4;
                                j = j3;
                                j2 = j7;
                                if (intersects$ui(focusTargetNode2, left, top, right, bottom)) {
                                    i3 = layoutNode9.getDepth();
                                    focusTargetNode = focusTargetNode2;
                                }
                            } else {
                                layoutNode = layoutNode3;
                                j = j3;
                                j2 = j7;
                            }
                            i4 += 3;
                            layoutNode6 = layoutNode;
                            i2 = i5;
                            j8 = j;
                            j7 = j2;
                        } else {
                            layoutNode = layoutNode8;
                            j = j8;
                            j2 = j7;
                        }
                    } else {
                        j = j8;
                        j2 = j7;
                        layoutNode = layoutNode7;
                    }
                    i4 += 3;
                    layoutNode6 = layoutNode;
                    i2 = i5;
                    j8 = j;
                    j7 = j2;
                }
            }
            j = j8;
            j2 = j7;
            layoutNode = layoutNode7;
            i4 += 3;
            layoutNode6 = layoutNode;
            i2 = i5;
            j8 = j;
            j7 = j2;
        }
        return focusTargetNode;
    }

    public final boolean isDescendantOf$ui(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.node.LayoutNode layoutNode2) {
        int depth = layoutNode.getDepth() - layoutNode2.getDepth();
        if (depth <= 0) {
            return false;
        }
        for (int i = 0; i < depth; i++) {
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        }
        return layoutNode == layoutNode2;
    }

    public final void unsetHasCallbacksFor(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.rects.updateHasCallbacks(layoutNode.getSemanticsId(), false);
    }

    public final boolean intersects$ui(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado = androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(delegatableNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024));
        androidx.compose.ui.node.LayoutNode layoutNode = m7502requireCoordinator64DMado.getLayoutNode();
        if (kotlin.jvm.internal.Intrinsics.areEqual(m7502requireCoordinator64DMado, layoutNode.getOuterCoordinator$ui())) {
            return true;
        }
        long mo7364localToRootMKHz9U = layoutNode.getOuterCoordinator$ui().mo7364localToRootMKHz9U(androidx.compose.ui.layout.LayoutCoordinates.m7360localPositionOfS_NoaFU$default(layoutNode.getOuterCoordinator$ui(), m7502requireCoordinator64DMado, 0L, false, 6, null));
        long mo7361getSizeYbymL2g = m7502requireCoordinator64DMado.mo7361getSizeYbymL2g();
        int round = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U >> 32)));
        int i5 = (int) (mo7361getSizeYbymL2g >> 32);
        int round2 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U & 4294967295L)));
        return i < i5 + round && i3 > round && i2 < ((int) (mo7361getSizeYbymL2g & 4294967295L)) + round2 && i4 > round2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
