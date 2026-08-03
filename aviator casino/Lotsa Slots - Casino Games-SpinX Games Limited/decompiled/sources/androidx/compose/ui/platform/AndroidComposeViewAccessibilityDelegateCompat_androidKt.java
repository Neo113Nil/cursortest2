package androidx.compose.ui.platform;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u001c\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002\u001a\f\u0010 \u001a\u00020\u0003*\u00020\rH\u0002\u001a\f\u0010!\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u001c\u0010\"\u001a\u0004\u0018\u00010#*\b\u0012\u0004\u0012\u00020#0$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\"\u0010'\u001a\u0004\u0018\u00010(*\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030*H\u0002\u001a\u0018\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-0,*\u00020.H\u0002\u001a\u000e\u0010/\u001a\u0004\u0018\u00010\f*\u00020\rH\u0002\u001a\f\u00100\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u0014\u00101\u001a\u00020\u0003*\u00020(2\u0006\u00102\u001a\u00020(H\u0002\u001a\f\u00103\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u0014\u00104\u001a\u00020\u0003*\u00020\r2\u0006\u00105\u001a\u000206H\u0002\u001a\u0016\u00107\u001a\u0004\u0018\u000108*\u0002092\u0006\u0010%\u001a\u00020&H\u0000\u001a\u0018\u0010:\u001a\u0004\u0018\u00010\f*\u00020;H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0019\u0010\u0012\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0019\u0010\u0013\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u0019\u0010\u0014\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0011\"\u0019\u0010\u0018\u001a\u00020\u0019*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"DefaultFakeNodeBounds", "Landroidx/compose/ui/geometry/Rect;", "<set-?>", "", "DisableContentCapture", "getDisableContentCapture$annotations", "()V", "getDisableContentCapture", "()Z", "setDisableContentCapture", "(Z)V", "infoContentDescriptionOrNull", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getInfoContentDescriptionOrNull", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "isPassword", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isRtl", "isTextField", "isTraversalGroup", com.ironsource.C3023e8.k, "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "traversalIndex", "", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsNode;)F", "accessibilityEquals", "Landroidx/compose/ui/semantics/AccessibilityAction;", "other", "", "enabled", "excludeLineAndPageGranularities", "findById", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "", "findClosestParentNode", "Landroidx/compose/ui/node/LayoutNode;", "selector", "Lkotlin/Function1;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getTextForTranslation", "hasPaneTitle", "isAncestorOf", "node", "isImportantForAccessibility", "propertiesDeleted", "oldConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsIdToView", "Landroid/view/View;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "toLegacyClassName", "Landroidx/compose/ui/semantics/Role;", "toLegacyClassName-V4PA4sw", "(I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final androidx.compose.ui.geometry.Rect DefaultFakeNodeBounds = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 10.0f, 10.0f);
    private static boolean DisableContentCapture;

    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    private static /* synthetic */ void isVisible$annotations(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.node.LayoutNode findClosestParentNode(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, java.lang.Boolean> function1) {
        for (androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isImportantForAccessibility(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig().containsImportantForAccessibility$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInvisibleToUser())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        java.util.Iterator<java.util.Map.Entry<? extends androidx.compose.ui.semantics.SemanticsPropertyKey<?>, ? extends java.lang.Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPaneTitle(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle());
    }

    private static final boolean isPassword(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword());
    }

    private static final boolean isTextField(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText());
    }

    private static final boolean isRtl(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl;
    }

    private static final boolean isTraversalGroup(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return ((java.lang.Boolean) semanticsNode.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1.INSTANCE)).booleanValue();
    }

    private static final float getTraversalIndex(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return ((java.lang.Number) semanticsNode.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getInfoContentDescriptionOrNull(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            return (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getTextForTranslation(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            return androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(androidx.compose.ui.semantics.AccessibilityAction<?> accessibilityAction, java.lang.Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.semantics.AccessibilityAction)) {
            return false;
        }
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(androidx.compose.ui.semantics.SemanticsOwner semanticsOwner) {
        androidx.compose.ui.semantics.SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode().isPlaced() && unmergedRootSemanticsNode.getLayoutNode().isAttached()) {
            androidx.compose.ui.geometry.Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(new android.graphics.Region(kotlin.math.MathKt.roundToInt(boundsInRoot.getLeft()), kotlin.math.MathKt.roundToInt(boundsInRoot.getTop()), kotlin.math.MathKt.roundToInt(boundsInRoot.getRight()), kotlin.math.MathKt.roundToInt(boundsInRoot.getBottom())), unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode, new android.graphics.Region());
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(android.graphics.Region region, androidx.compose.ui.semantics.SemanticsNode semanticsNode, java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> map, androidx.compose.ui.semantics.SemanticsNode semanticsNode2, android.graphics.Region region2) {
        androidx.compose.ui.geometry.Rect rect;
        androidx.compose.ui.layout.LayoutInfo layoutInfo;
        boolean z = (semanticsNode2.getLayoutNode().isPlaced() && semanticsNode2.getLayoutNode().isAttached()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.getIsFake()) {
                androidx.compose.ui.geometry.Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
                int roundToInt = kotlin.math.MathKt.roundToInt(touchBoundsInRoot.getLeft());
                int roundToInt2 = kotlin.math.MathKt.roundToInt(touchBoundsInRoot.getTop());
                int roundToInt3 = kotlin.math.MathKt.roundToInt(touchBoundsInRoot.getRight());
                int roundToInt4 = kotlin.math.MathKt.roundToInt(touchBoundsInRoot.getBottom());
                region2.set(roundToInt, roundToInt2, roundToInt3, roundToInt4);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (region2.op(region, android.graphics.Region.Op.INTERSECT)) {
                    map.put(java.lang.Integer.valueOf(id), new androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                    java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                    for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                        getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size), region2);
                    }
                    if (isImportantForAccessibility(semanticsNode2)) {
                        region.op(roundToInt, roundToInt2, roundToInt3, roundToInt4, android.graphics.Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (!semanticsNode2.getIsFake()) {
                    if (id == -1) {
                        map.put(java.lang.Integer.valueOf(id), new androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                        return;
                    }
                    return;
                }
                androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode2.getParent();
                if (parent != null && (layoutInfo = parent.getLayoutInfo()) != null && layoutInfo.isPlaced()) {
                    rect = parent.getBoundsInRoot();
                } else {
                    rect = DefaultFakeNodeBounds;
                }
                map.put(java.lang.Integer.valueOf(id), new androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(kotlin.math.MathKt.roundToInt(rect.getLeft()), kotlin.math.MathKt.roundToInt(rect.getTop()), kotlin.math.MathKt.roundToInt(rect.getRight()), kotlin.math.MathKt.roundToInt(rect.getBottom()))));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.platform.ScrollObservationScope findById(java.util.List<androidx.compose.ui.platform.ScrollObservationScope> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final java.lang.String m3707toLegacyClassNameV4PA4sw(int i) {
        if (androidx.compose.ui.semantics.Role.m3788equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (androidx.compose.ui.semantics.Role.m3788equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m3793getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (androidx.compose.ui.semantics.Role.m3788equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m3796getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (androidx.compose.ui.semantics.Role.m3788equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m3795getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (androidx.compose.ui.semantics.Role.m3788equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m3794getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final android.view.View semanticsIdToView(androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler, int i) {
        java.lang.Object obj;
        java.util.Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.compose.ui.node.LayoutNode) ((java.util.Map.Entry) obj).getKey()).getSemanticsId() == i) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return entry != null ? (androidx.compose.ui.viewinterop.AndroidViewHolder) entry.getValue() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAncestorOf(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.node.LayoutNode layoutNode2) {
        androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
        if (parent$ui_release == null) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(parent$ui_release, layoutNode) || isAncestorOf(layoutNode, parent$ui_release);
    }

    public static final boolean getDisableContentCapture() {
        return DisableContentCapture;
    }

    public static final void setDisableContentCapture(boolean z) {
        DisableContentCapture = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release;
        if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText()) && !kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused()), (java.lang.Object) true)) {
            return true;
        }
        androidx.compose.ui.node.LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode(), new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
            
                if (r3.contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText()) != false) goto L10;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
                boolean z;
                androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release2 = layoutNode.getCollapsedSemantics$ui_release();
                if (collapsedSemantics$ui_release2 != null) {
                    z = true;
                    if (collapsedSemantics$ui_release2.getIsMergingSemanticsOfDescendants()) {
                    }
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            }
        });
        return findClosestParentNode != null && ((collapsedSemantics$ui_release = findClosestParentNode.getCollapsedSemantics$ui_release()) == null || !kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused()), (java.lang.Object) true));
    }
}
