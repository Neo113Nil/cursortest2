package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/layout/RulerScope;", "Landroidx/compose/ui/layout/WindowInsetsRulerProvider;", "rulerProvider", "", "provideWindowInsetsRulers", "(Landroidx/compose/ui/layout/RulerScope;Landroidx/compose/ui/layout/WindowInsetsRulerProvider;)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "", "Landroidx/compose/ui/layout/RectRulers;", "findDisplayCutouts", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Ljava/util/List;", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "windowInsetsRulers", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "findInsetsAnimationProperties", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/WindowInsetsRulers;)Landroidx/compose/ui/layout/WindowInsetsAnimation;", "p0", "Landroidx/compose/ui/layout/ValueInsets;", "p1", "", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/layout/RulerScope;Landroidx/compose/ui/layout/RectRulers;JII)V", "", "RulerKey", "Ljava/lang/String;", "Landroidx/collection/IntObjectMap;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/IntObjectMap;", "getHighSpeedVideoFpsRangesFor", "", "Camera2StreamConfigurationMap", "[Landroidx/compose/ui/layout/WindowInsetsRulers;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowInsetsRulers_androidKt {
    private static final androidx.compose.ui.layout.WindowInsetsRulers[] Camera2StreamConfigurationMap;
    public static final java.lang.String RulerKey = "androidx.compose.ui.layout.WindowInsetsRulers";
    private static final androidx.collection.IntObjectMap<androidx.compose.ui.layout.WindowInsetsRulers> getHighSpeedVideoFpsRanges;

    public static final void provideWindowInsetsRulers(androidx.compose.ui.layout.RulerScope rulerScope, androidx.compose.ui.layout.WindowInsetsRulerProvider windowInsetsRulerProvider) {
        long mo7361getSizeYbymL2g = rulerScope.getCoordinates().mo7361getSizeYbymL2g();
        androidx.collection.ScatterMap<java.lang.Object, androidx.compose.ui.layout.WindowWindowInsetsAnimationValues> insetsValues = windowInsetsRulerProvider.getInsetsListener().getInsetsValues();
        int i = (int) (mo7361getSizeYbymL2g >> 32);
        int i2 = (int) (mo7361getSizeYbymL2g & 4294967295L);
        for (androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers : Camera2StreamConfigurationMap) {
            androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = insetsValues.get(windowInsetsRulers);
            kotlin.jvm.internal.Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
            androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
            getHighResolutionOutputSizeshNQ4ISI(rulerScope, windowInsetsRulers.getGetHighSpeedVideoSizes(), windowWindowInsetsAnimationValues2.getCurrent(), i, i2);
            if (windowWindowInsetsAnimationValues2.isAnimating()) {
                getHighResolutionOutputSizeshNQ4ISI(rulerScope, windowWindowInsetsAnimationValues2.getSource(), windowWindowInsetsAnimationValues2.getSourceValueInsets(), i, i2);
                getHighResolutionOutputSizeshNQ4ISI(rulerScope, windowWindowInsetsAnimationValues2.getTarget(), windowWindowInsetsAnimationValues2.getTargetValueInsets(), i, i2);
            }
            getHighResolutionOutputSizeshNQ4ISI(rulerScope, windowInsetsRulers.getCamera2StreamConfigurationMap(), windowWindowInsetsAnimationValues2.getMaximum(), i, i2);
        }
        androidx.collection.MutableObjectList<androidx.compose.runtime.MutableState<android.graphics.Rect>> cutoutRects = windowInsetsRulerProvider.getCutoutRects();
        if (cutoutRects.isNotEmpty()) {
            java.util.List<androidx.compose.ui.layout.RectRulers> cutoutRulers = windowInsetsRulerProvider.getCutoutRulers();
            androidx.collection.MutableObjectList<androidx.compose.runtime.MutableState<android.graphics.Rect>> mutableObjectList = cutoutRects;
            java.lang.Object[] objArr = mutableObjectList.content;
            int i3 = mutableObjectList._size;
            for (int i4 = 0; i4 < i3; i4++) {
                androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) objArr[i4];
                androidx.compose.ui.layout.RectRulers rectRulers = cutoutRulers.get(i4);
                android.graphics.Rect rect = (android.graphics.Rect) mutableState.getValue();
                rulerScope.provides(rectRulers.getGetHighResolutionOutputSizeshNQ4ISI(), rect.left);
                rulerScope.provides(rectRulers.getGetHighSpeedVideoFpsRangesFor(), rect.top);
                rulerScope.provides(rectRulers.getGetHighSpeedVideoFpsRanges(), rect.right);
                rulerScope.provides(rectRulers.getGetHighSpeedVideoSizes(), rect.bottom);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    public static final java.util.List<androidx.compose.ui.layout.RectRulers> findDisplayCutouts(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.LayoutCoordinates coordinates = placementScope.getCoordinates();
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = coordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator = findRootCoordinates instanceof androidx.compose.ui.node.NodeCoordinator ? (androidx.compose.ui.node.NodeCoordinator) findRootCoordinates : null; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.getWrapped()) {
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
            boolean m7630getIncludeSelfInTraversalH91voCI = androidx.compose.ui.node.NodeKindKt.m7630getIncludeSelfInTraversalH91voCI(m7621constructorimpl);
            androidx.compose.ui.Modifier.Node tail = nodeCoordinator.getTail();
            if (m7630getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
                for (androidx.compose.ui.Modifier.Node highSpeedVideoFpsRanges = nodeCoordinator.getHighSpeedVideoFpsRanges(m7630getIncludeSelfInTraversalH91voCI); highSpeedVideoFpsRanges != null && (highSpeedVideoFpsRanges.getAggregateChildKindSet() & m7621constructorimpl) != 0; highSpeedVideoFpsRanges = highSpeedVideoFpsRanges.getChild()) {
                    if ((highSpeedVideoFpsRanges.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        androidx.compose.ui.node.DelegatingNode delegatingNode = highSpeedVideoFpsRanges;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (traversableNode.getTraverseKey() == RulerKey) {
                                    return ((androidx.compose.ui.layout.WindowInsetsRulerProvider) traversableNode).getCutoutRulers();
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    if (highSpeedVideoFpsRanges != tail) {
                    }
                }
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    public static final androidx.compose.ui.layout.WindowInsetsAnimation findInsetsAnimationProperties(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.WindowInsetsRulers windowInsetsRulers) {
        androidx.compose.ui.layout.LayoutCoordinates coordinates = placementScope.getCoordinates();
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = coordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(coordinates) : null;
        for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator = findRootCoordinates instanceof androidx.compose.ui.node.NodeCoordinator ? (androidx.compose.ui.node.NodeCoordinator) findRootCoordinates : null; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.getWrapped()) {
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
            boolean m7630getIncludeSelfInTraversalH91voCI = androidx.compose.ui.node.NodeKindKt.m7630getIncludeSelfInTraversalH91voCI(m7621constructorimpl);
            androidx.compose.ui.Modifier.Node tail = nodeCoordinator.getTail();
            if (m7630getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
                for (androidx.compose.ui.Modifier.Node highSpeedVideoFpsRanges = nodeCoordinator.getHighSpeedVideoFpsRanges(m7630getIncludeSelfInTraversalH91voCI); highSpeedVideoFpsRanges != null && (highSpeedVideoFpsRanges.getAggregateChildKindSet() & m7621constructorimpl) != 0; highSpeedVideoFpsRanges = highSpeedVideoFpsRanges.getChild()) {
                    if ((highSpeedVideoFpsRanges.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        androidx.compose.ui.node.DelegatingNode delegatingNode = highSpeedVideoFpsRanges;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (traversableNode.getTraverseKey() == RulerKey) {
                                    androidx.compose.ui.layout.WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = ((androidx.compose.ui.layout.WindowInsetsRulerProvider) traversableNode).getInsetsValues().get(windowInsetsRulers);
                                    return windowWindowInsetsAnimationValues != null ? windowWindowInsetsAnimationValues : androidx.compose.ui.layout.NoWindowInsetsAnimation.INSTANCE;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    if (highSpeedVideoFpsRanges != tail) {
                    }
                }
            }
        }
        return androidx.compose.ui.layout.NoWindowInsetsAnimation.INSTANCE;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.RulerScope rulerScope, androidx.compose.ui.layout.RectRulers rectRulers, long j, int i, int i2) {
        if (androidx.compose.ui.layout.ValueInsets.m7478equalsimpl0(j, androidx.compose.ui.layout.ValueInsets_androidKt.getUnsetValueInsets())) {
            return;
        }
        float f = (int) ((j >>> 48) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f2 = (int) ((j >>> 32) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
        float f3 = i - ((int) ((j >>> 16) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
        float f4 = i2 - ((int) (j & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
        rulerScope.provides(rectRulers.getGetHighResolutionOutputSizeshNQ4ISI(), f);
        rulerScope.provides(rectRulers.getGetHighSpeedVideoFpsRangesFor(), f2);
        rulerScope.provides(rectRulers.getGetHighSpeedVideoFpsRanges(), f3);
        rulerScope.provides(rectRulers.getGetHighSpeedVideoSizes(), f4);
    }

    static {
        androidx.collection.MutableIntObjectMap mutableIntObjectMap = new androidx.collection.MutableIntObjectMap(8);
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.statusBars(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getStatusBars());
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.navigationBars(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getNavigationBars());
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.captionBar(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getCaptionBar());
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.ime(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getIme());
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.systemGestures(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getSystemGestures());
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getMandatorySystemGestures());
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.tappableElement(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getTappableElement());
        mutableIntObjectMap.set(androidx.core.view.WindowInsetsCompat.Type.displayCutout(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getDisplayCutout());
        getHighSpeedVideoFpsRanges = mutableIntObjectMap;
        Camera2StreamConfigurationMap = new androidx.compose.ui.layout.WindowInsetsRulers[]{androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getStatusBars(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getNavigationBars(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getCaptionBar(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getTappableElement(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getSystemGestures(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getMandatorySystemGestures(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getIme(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getWaterfall(), androidx.compose.ui.layout.WindowInsetsRulers.INSTANCE.getDisplayCutout()};
    }
}
