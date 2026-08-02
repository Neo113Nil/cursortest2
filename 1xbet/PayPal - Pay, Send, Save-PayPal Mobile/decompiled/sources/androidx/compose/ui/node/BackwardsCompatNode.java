package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010\u0016J\r\u0010 \u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0016J\u001b\u0010\"\u001a\u00020\u00142\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030!H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010,\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J#\u00101\u001a\u00020/*\u00020-2\u0006\u0010&\u001a\u00020.2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J#\u00104\u001a\u00020/*\u00020-2\u0006\u0010&\u001a\u00020.2\u0006\u00103\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00102J#\u00105\u001a\u00020/*\u00020-2\u0006\u0010&\u001a\u00020.2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00102J#\u00106\u001a\u00020/*\u00020-2\u0006\u0010&\u001a\u00020.2\u0006\u00103\u001a\u00020/H\u0016¢\u0006\u0004\b6\u00102J\u0013\u00108\u001a\u00020\u0014*\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0013\u0010;\u001a\u00020\u0014*\u00020:H\u0016¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020\u00142\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020\u0014H\u0016¢\u0006\u0004\bF\u0010\u0016J\u000f\u0010G\u001a\u00020\u0014H\u0016¢\u0006\u0004\bG\u0010\u0016J\u000f\u0010H\u001a\u00020\u0019H\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0019H\u0016¢\u0006\u0004\bJ\u0010IJ\u001f\u0010N\u001a\u0004\u0018\u00010L*\u00020K2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010T\u001a\u00020AH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bX\u0010SJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\u00142\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cR*\u0010\u0011\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u00108\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010\u0013R\u0014\u0010k\u001a\u00020K8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010T\u001a\u00020p8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010s\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010vR:\u0010z\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030x0wj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030x`y8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0087\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0084\u0001*\b\u0012\u0004\u0012\u00028\u00000x8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010IR\u0019\u0010\u001e\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0089\u0001"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Modifier$Element;", "element", "<init>", "(Landroidx/compose/ui/Modifier$Element;)V", "", "onAttach", "()V", "onDetach", "getHighResolutionOutputSizeshNQ4ISI", "", "p0", "getHighSpeedVideoSizes", "(Z)V", "onMeasureResultChanged", "getHighSpeedVideoFpsRanges", "onDrawCacheReadsChanged$ui", "updateModifierLocalConsumer", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onDensityChange", "onCancelPointerInput", "sharePointerInputWithSiblings", "()Z", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", io.ktor.http.ContentDisposition.Parameters.Size, "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onPlaced", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/Modifier$Element;", "getElement", "()Landroidx/compose/ui/Modifier$Element;", "setElement", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "Camera2StreamConfigurationMap", "Z", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/collections/getHighSpeedVideoSizesFor;", "readValues", "Ljava/util/HashSet;", "getReadValues", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current", "isValidOwnerScope", "Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackwardsCompatNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope, androidx.compose.ui.node.ParentDataModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.focus.FocusEventModifierNode, androidx.compose.ui.focus.FocusPropertiesModifierNode, androidx.compose.ui.focus.FocusRequesterModifierNode, androidx.compose.ui.node.OwnerScope, androidx.compose.ui.draw.BuildDrawCacheParams {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private androidx.compose.ui.Modifier.Element element;
    private androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.modifier.BackwardsCompatLocalMap Camera2StreamConfigurationMap;
    private java.util.HashSet<androidx.compose.ui.modifier.ModifierLocal<?>> readValues;

    public BackwardsCompatNode(androidx.compose.ui.Modifier.Element element) {
        setKindSet$ui(androidx.compose.ui.node.NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.getHighSpeedVideoSizes = true;
        this.readValues = new java.util.HashSet<>();
    }

    public final androidx.compose.ui.Modifier.Element getElement() {
        return this.element;
    }

    public final void setElement(androidx.compose.ui.Modifier.Element element) {
        if (getIsAttached()) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        this.element = element;
        setKindSet$ui(androidx.compose.ui.node.NodeKindKt.calculateNodeKindSetFrom(element));
        if (getIsAttached()) {
            getHighSpeedVideoSizes(false);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighSpeedVideoSizes(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 backwardsCompatNodeKt$DetachedModifierLocalReadScope$1;
        if (!getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("unInitializeModifier called on unattached node");
        }
        androidx.compose.ui.Modifier.Element element = this.element;
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = this;
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(32) & backwardsCompatNode.getKindSet()) != 0) {
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalProvider) {
                androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((androidx.compose.ui.modifier.ModifierLocalProvider) element).getKey());
            }
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) {
                backwardsCompatNodeKt$DetachedModifierLocalReadScope$1 = androidx.compose.ui.node.BackwardsCompatNodeKt.Camera2StreamConfigurationMap;
                ((androidx.compose.ui.modifier.ModifierLocalConsumer) element).onModifierLocalsUpdated(backwardsCompatNodeKt$DetachedModifierLocalReadScope$1);
            }
        }
        if ((backwardsCompatNode.getKindSet() & androidx.compose.ui.node.NodeKind.m7621constructorimpl(8)) != 0) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
        if (element instanceof androidx.compose.ui.focus.FocusRequesterModifier) {
            ((androidx.compose.ui.focus.FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui().remove(this);
        }
    }

    private final void getHighSpeedVideoSizes(boolean p0) {
        boolean Camera2StreamConfigurationMap;
        boolean Camera2StreamConfigurationMap2;
        boolean Camera2StreamConfigurationMap3;
        boolean Camera2StreamConfigurationMap4;
        if (!getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("initializeModifier called on unattached node");
        }
        androidx.compose.ui.Modifier.Element element = this.element;
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = this;
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(32) & backwardsCompatNode.getKindSet()) != 0) {
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) {
                sideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                    public final void Camera2StreamConfigurationMap() {
                        androidx.compose.ui.node.BackwardsCompatNode.this.updateModifierLocalConsumer();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ kotlin.Unit invoke() {
                        Camera2StreamConfigurationMap();
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(0);
                    }
                });
            }
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalProvider) {
                getHighSpeedVideoFpsRangesFor((androidx.compose.ui.modifier.ModifierLocalProvider) element);
            }
        }
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(4) & backwardsCompatNode.getKindSet()) != 0) {
            if (element instanceof androidx.compose.ui.draw.DrawCacheModifier) {
                this.getHighSpeedVideoSizes = true;
            }
            if (!p0) {
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateLayer(this);
            }
        }
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(2) & backwardsCompatNode.getKindSet()) != 0) {
            Camera2StreamConfigurationMap4 = androidx.compose.ui.node.BackwardsCompatNodeKt.Camera2StreamConfigurationMap(this);
            if (Camera2StreamConfigurationMap4) {
                androidx.compose.ui.node.NodeCoordinator coordinator = getCoordinator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
                ((androidx.compose.ui.node.LayoutModifierNodeCoordinator) coordinator).setLayoutModifierNode$ui(this);
                coordinator.onLayoutModifierNodeChanged();
            }
            if (!p0) {
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateLayer(this);
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui();
            }
        }
        if (element instanceof androidx.compose.ui.layout.RemeasurementModifier) {
            ((androidx.compose.ui.layout.RemeasurementModifier) element).onRemeasurementAvailable(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this));
        }
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(128) & backwardsCompatNode.getKindSet()) != 0 && (element instanceof androidx.compose.ui.layout.OnRemeasuredModifier)) {
            Camera2StreamConfigurationMap3 = androidx.compose.ui.node.BackwardsCompatNodeKt.Camera2StreamConfigurationMap(this);
            if (Camera2StreamConfigurationMap3) {
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui();
            }
        }
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304) & backwardsCompatNode.getKindSet()) != 0 && (element instanceof androidx.compose.ui.layout.OnPlacedModifier)) {
            this.getHighSpeedVideoFpsRanges = null;
            Camera2StreamConfigurationMap2 = androidx.compose.ui.node.BackwardsCompatNodeKt.Camera2StreamConfigurationMap(this);
            if (Camera2StreamConfigurationMap2) {
                androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new androidx.compose.ui.node.Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                    public final void onLayoutComplete() {
                        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
                        layoutCoordinates = androidx.compose.ui.node.BackwardsCompatNode.this.getHighSpeedVideoFpsRanges;
                        if (layoutCoordinates == null) {
                            androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode2 = androidx.compose.ui.node.BackwardsCompatNode.this;
                            backwardsCompatNode2.onPlaced(androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(backwardsCompatNode2, androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304)));
                        }
                    }
                });
            }
        }
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(256) & backwardsCompatNode.getKindSet()) != 0 && (element instanceof androidx.compose.ui.layout.OnGloballyPositionedModifier)) {
            Camera2StreamConfigurationMap = androidx.compose.ui.node.BackwardsCompatNodeKt.Camera2StreamConfigurationMap(this);
            if (Camera2StreamConfigurationMap) {
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui();
            }
        }
        if (element instanceof androidx.compose.ui.focus.FocusRequesterModifier) {
            ((androidx.compose.ui.focus.FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui().add(this);
        }
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(16) & backwardsCompatNode.getKindSet()) != 0 && (element instanceof androidx.compose.ui.input.pointer.PointerInputModifier)) {
            ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui(getCoordinator());
        }
        if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(8) & backwardsCompatNode.getKindSet()) != 0) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final androidx.compose.ui.unit.Density getDensity() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public final long mo5552getSizeNHjbRc() {
        return androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(this, androidx.compose.ui.node.NodeKind.m7621constructorimpl(128)).mo7361getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void onMeasureResultChanged() {
        this.getHighSpeedVideoSizes = true;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    private final void getHighSpeedVideoFpsRanges() {
        kotlin.jvm.functions.Function1 function1;
        final androidx.compose.ui.Modifier.Element element = this.element;
        if (element instanceof androidx.compose.ui.draw.DrawCacheModifier) {
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getSnapshotObserver();
            function1 = androidx.compose.ui.node.BackwardsCompatNodeKt.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoSizes();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes() {
                    ((androidx.compose.ui.draw.DrawCacheModifier) androidx.compose.ui.Modifier.Element.this).onBuildCache(this);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(this, function1, function0);
        }
        this.getHighSpeedVideoSizes = false;
    }

    public final void onDrawCacheReadsChanged$ui() {
        this.getHighSpeedVideoSizes = true;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    public final java.util.HashSet<androidx.compose.ui.modifier.ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    public final void setReadValues(java.util.HashSet<androidx.compose.ui.modifier.ModifierLocal<?>> hashSet) {
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        androidx.compose.ui.modifier.BackwardsCompatLocalMap backwardsCompatLocalMap = this.Camera2StreamConfigurationMap;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : androidx.compose.ui.modifier.ModifierLocalModifierNodeKt.modifierLocalMapOf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final <T> T getCurrent(androidx.compose.ui.modifier.ModifierLocal<T> modifierLocal) {
        androidx.compose.ui.node.NodeChain nodes;
        this.readValues.add(modifierLocal);
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = this;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(32);
        if (!backwardsCompatNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = backwardsCompatNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(backwardsCompatNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        ?? r5 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode = (androidx.compose.ui.modifier.ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui(modifierLocal)) {
                                    return (T) modifierLocalModifierNode.getProvidedValues().get$ui(modifierLocal);
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r5 = r5;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (r5 != 0) {
                                                    r5.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (r5 != 0) {
                                                r5.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                    r5 = r5;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(r5);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return modifierLocal.getDefaultFactory$ui().invoke();
    }

    public final void updateModifierLocalConsumer() {
        kotlin.jvm.functions.Function1 function1;
        if (getIsAttached()) {
            this.readValues.clear();
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getSnapshotObserver();
            function1 = androidx.compose.ui.node.BackwardsCompatNodeKt.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    Camera2StreamConfigurationMap();
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap() {
                    androidx.compose.ui.Modifier.Element element = androidx.compose.ui.node.BackwardsCompatNode.this.getElement();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
                    ((androidx.compose.ui.modifier.ModifierLocalConsumer) element).onModifierLocalsUpdated(androidx.compose.ui.node.BackwardsCompatNode.this);
                }

                {
                    super(0);
                }
            };
            snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(this, function1, function0);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.modifier.ModifierLocalProvider<?> p0) {
        boolean Camera2StreamConfigurationMap;
        androidx.compose.ui.modifier.BackwardsCompatLocalMap backwardsCompatLocalMap = this.Camera2StreamConfigurationMap;
        if (backwardsCompatLocalMap != null && backwardsCompatLocalMap.contains$ui(p0.getKey())) {
            backwardsCompatLocalMap.setElement(p0);
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, p0.getKey());
            return;
        }
        this.Camera2StreamConfigurationMap = new androidx.compose.ui.modifier.BackwardsCompatLocalMap(p0);
        Camera2StreamConfigurationMap = androidx.compose.ui.node.BackwardsCompatNodeKt.Camera2StreamConfigurationMap(this);
        if (Camera2StreamConfigurationMap) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, p0.getKey());
        }
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return getIsAttached();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.layout.LayoutModifier) element).mo2052measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.layout.LayoutModifier) element).minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.layout.LayoutModifier) element).minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.layout.LayoutModifier) element).maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.layout.LayoutModifier) element).maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        androidx.compose.ui.draw.DrawModifier drawModifier = (androidx.compose.ui.draw.DrawModifier) element;
        if (this.getHighSpeedVideoSizes && (element instanceof androidx.compose.ui.draw.DrawCacheModifier)) {
            getHighSpeedVideoFpsRanges();
        }
        drawModifier.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = ((androidx.compose.ui.semantics.SemanticsModifier) element).getSemanticsConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(semanticsPropertyReceiver, "");
        ((androidx.compose.ui.semantics.SemanticsConfiguration) semanticsPropertyReceiver).collapsePeer$ui(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().mo7253onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        if (this.element instanceof androidx.compose.ui.input.pointer.PointerInputModifier) {
            onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final boolean sharePointerInputWithSiblings() {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().getShareWithSiblings();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final boolean interceptOutOfBoundsChildEvents() {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        return ((androidx.compose.ui.layout.ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        ((androidx.compose.ui.layout.OnGloballyPositionedModifier) element).onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo1407onRemeasuredozmzZPI(long size) {
        androidx.compose.ui.Modifier.Element element = this.element;
        if (element instanceof androidx.compose.ui.layout.OnRemeasuredModifier) {
            ((androidx.compose.ui.layout.OnRemeasuredModifier) element).m7405onRemeasuredozmzZPI(size);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.getHighSpeedVideoFpsRanges = coordinates;
        androidx.compose.ui.Modifier.Element element = this.element;
        if (element instanceof androidx.compose.ui.layout.OnPlacedModifier) {
            ((androidx.compose.ui.layout.OnPlacedModifier) element).onPlaced(coordinates);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(androidx.compose.ui.focus.FocusState focusState) {
        androidx.compose.ui.Modifier.Element element = this.element;
        if (!(element instanceof androidx.compose.ui.focus.FocusEventModifier)) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("onFocusEvent called on wrong node");
        }
        ((androidx.compose.ui.focus.FocusEventModifier) element).onFocusEvent(focusState);
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(androidx.compose.ui.focus.FocusProperties focusProperties) {
        androidx.compose.ui.Modifier.Element element = this.element;
        if (!(element instanceof androidx.compose.ui.focus.FocusOrderModifier)) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("applyFocusProperties called on wrong node");
        }
        ((androidx.compose.ui.focus.FocusOrderModifier) element).populateFocusOrder(new androidx.compose.ui.focus.FocusOrder(focusProperties));
    }

    public final java.lang.String toString() {
        return this.element.toString();
    }
}
