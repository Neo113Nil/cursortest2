package androidx.compose.ui.node;

/* compiled from: BackwardsCompatNode.kt */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020\u001eH\u0002J\b\u0010A\u001a\u00020\u001eH\u0016J\b\u0010B\u001a\u00020<H\u0016J\b\u0010C\u001a\u00020<H\u0016J\b\u0010D\u001a\u00020<H\u0016J\r\u0010E\u001a\u00020<H\u0000¢\u0006\u0002\bFJ\u0010\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020\"H\u0016J\b\u0010L\u001a\u00020<H\u0016J\u0010\u0010M\u001a\u00020<2\u0006\u0010K\u001a\u00020\"H\u0016J*\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u001a\u0010W\u001a\u00020<2\u0006\u00103\u001a\u00020TH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\b\u0010Z\u001a\u00020\u001eH\u0016J\b\u0010[\u001a\u00020\\H\u0016J\b\u0010]\u001a\u00020<H\u0002J\b\u0010^\u001a\u00020<H\u0002J\u0006\u0010_\u001a\u00020<J\u0014\u0010`\u001a\u00020<2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030aH\u0002J\f\u0010b\u001a\u00020<*\u00020cH\u0016J\f\u0010d\u001a\u00020<*\u00020eH\u0016J\u001c\u0010f\u001a\u00020g*\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020gH\u0016J\u001c\u0010l\u001a\u00020g*\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010m\u001a\u00020gH\u0016J&\u0010n\u001a\u00020o*\u00020p2\u0006\u0010i\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0016ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u001c\u0010v\u001a\u00020g*\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020gH\u0016J\u001c\u0010w\u001a\u00020g*\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010m\u001a\u00020gH\u0016J\u0018\u0010x\u001a\u0004\u0018\u00010y*\u00020\u00162\b\u0010z\u001a\u0004\u0018\u00010yH\u0016R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0012R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R2\u0010+\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0,j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030-`.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u0002048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R$\u00107\u001a\u0002H8\"\u0004\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H80-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "element", "Landroidx/compose/ui/Modifier$Element;", "(Landroidx/compose/ui/Modifier$Element;)V", "_providedValues", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "value", "getElement", "()Landroidx/compose/ui/Modifier$Element;", "setElement", "invalidateCache", "", "isValidOwnerScope", "()Z", "lastOnPlacedCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "readValues", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/collections/HashSet;", "getReadValues", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "current", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "applyFocusProperties", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "initializeModifier", "duringAttach", "interceptOutOfBoundsChildEvents", "onAttach", "onCancelPointerInput", "onDetach", "onDrawCacheReadsChanged", "onDrawCacheReadsChanged$ui_release", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onGloballyPositioned", com.ironsource.Y3.f, "onMeasureResultChanged", "onPlaced", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onRemeasured", "onRemeasured-ozmzZPI", "(J)V", "sharePointerInputWithSiblings", "toString", "", "unInitializeModifier", "updateDrawCache", "updateModifierLocalConsumer", "updateModifierLocalProvider", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "modifyParentData", "", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackwardsCompatNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope, androidx.compose.ui.node.ParentDataModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.focus.FocusEventModifierNode, androidx.compose.ui.focus.FocusPropertiesModifierNode, androidx.compose.ui.focus.FocusRequesterModifierNode, androidx.compose.ui.node.OwnerScope, androidx.compose.ui.draw.BuildDrawCacheParams {
    public static final int $stable = 8;
    private androidx.compose.ui.modifier.BackwardsCompatLocalMap _providedValues;
    private androidx.compose.ui.Modifier.Element element;
    private boolean invalidateCache;
    private androidx.compose.ui.layout.LayoutCoordinates lastOnPlacedCoordinates;
    private java.util.HashSet<androidx.compose.ui.modifier.ModifierLocal<?>> readValues;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldMergeDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
        androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    public BackwardsCompatNode(androidx.compose.ui.Modifier.Element element) {
        setKindSet$ui_release(androidx.compose.ui.node.NodeKindKt.calculateNodeKindSetFrom(element));
        this.element = element;
        this.invalidateCache = true;
        this.readValues = new java.util.HashSet<>();
    }

    public final androidx.compose.ui.Modifier.Element getElement() {
        return this.element;
    }

    public final void setElement(androidx.compose.ui.Modifier.Element element) {
        if (getIsAttached()) {
            unInitializeModifier();
        }
        this.element = element;
        setKindSet$ui_release(androidx.compose.ui.node.NodeKindKt.calculateNodeKindSetFrom(element));
        if (getIsAttached()) {
            initializeModifier(false);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        initializeModifier(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        unInitializeModifier();
    }

    private final void unInitializeModifier() {
        androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 backwardsCompatNodeKt$DetachedModifierLocalReadScope$1;
        if (!getIsAttached()) {
            throw new java.lang.IllegalStateException("unInitializeModifier called on unattached node".toString());
        }
        androidx.compose.ui.Modifier.Element element = this.element;
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = this;
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(32) & backwardsCompatNode.getKindSet()) != 0) {
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalProvider) {
                androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((androidx.compose.ui.modifier.ModifierLocalProvider) element).getKey());
            }
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) {
                backwardsCompatNodeKt$DetachedModifierLocalReadScope$1 = androidx.compose.ui.node.BackwardsCompatNodeKt.DetachedModifierLocalReadScope;
                ((androidx.compose.ui.modifier.ModifierLocalConsumer) element).onModifierLocalsUpdated(backwardsCompatNodeKt$DetachedModifierLocalReadScope$1);
            }
        }
        if ((backwardsCompatNode.getKindSet() & androidx.compose.ui.node.NodeKind.m3613constructorimpl(8)) != 0) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
        if (element instanceof androidx.compose.ui.focus.FocusRequesterModifier) {
            ((androidx.compose.ui.focus.FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
        }
    }

    private final void initializeModifier(boolean duringAttach) {
        boolean isChainUpdate;
        boolean isChainUpdate2;
        boolean isChainUpdate3;
        boolean isChainUpdate4;
        if (!getIsAttached()) {
            throw new java.lang.IllegalStateException("initializeModifier called on unattached node".toString());
        }
        androidx.compose.ui.Modifier.Element element = this.element;
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = this;
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(32) & backwardsCompatNode.getKindSet()) != 0) {
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) {
                sideEffect(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.ui.node.BackwardsCompatNode.this.updateModifierLocalConsumer();
                    }
                });
            }
            if (element instanceof androidx.compose.ui.modifier.ModifierLocalProvider) {
                updateModifierLocalProvider((androidx.compose.ui.modifier.ModifierLocalProvider) element);
            }
        }
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(4) & backwardsCompatNode.getKindSet()) != 0) {
            if (element instanceof androidx.compose.ui.draw.DrawCacheModifier) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateLayer(this);
            }
        }
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(2) & backwardsCompatNode.getKindSet()) != 0) {
            isChainUpdate4 = androidx.compose.ui.node.BackwardsCompatNodeKt.isChainUpdate(this);
            if (isChainUpdate4) {
                androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = getCoordinator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator$ui_release);
                ((androidx.compose.ui.node.LayoutModifierNodeCoordinator) coordinator$ui_release).setLayoutModifierNode$ui_release(this);
                coordinator$ui_release.onLayoutModifierNodeChanged();
            }
            if (!duringAttach) {
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateLayer(this);
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if (element instanceof androidx.compose.ui.layout.RemeasurementModifier) {
            ((androidx.compose.ui.layout.RemeasurementModifier) element).onRemeasurementAvailable(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this));
        }
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(128) & backwardsCompatNode.getKindSet()) != 0) {
            if (element instanceof androidx.compose.ui.layout.OnRemeasuredModifier) {
                isChainUpdate3 = androidx.compose.ui.node.BackwardsCompatNodeKt.isChainUpdate(this);
                if (isChainUpdate3) {
                    androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
            }
            if (element instanceof androidx.compose.ui.layout.OnPlacedModifier) {
                this.lastOnPlacedCoordinates = null;
                isChainUpdate2 = androidx.compose.ui.node.BackwardsCompatNodeKt.isChainUpdate(this);
                if (isChainUpdate2) {
                    androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new androidx.compose.ui.node.Owner.OnLayoutCompletedListener() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3
                        @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
                        public void onLayoutComplete() {
                            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
                            layoutCoordinates = androidx.compose.ui.node.BackwardsCompatNode.this.lastOnPlacedCoordinates;
                            if (layoutCoordinates == null) {
                                androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode2 = androidx.compose.ui.node.BackwardsCompatNode.this;
                                backwardsCompatNode2.onPlaced(androidx.compose.ui.node.DelegatableNodeKt.m3509requireCoordinator64DMado(backwardsCompatNode2, androidx.compose.ui.node.NodeKind.m3613constructorimpl(128)));
                            }
                        }
                    });
                }
            }
        }
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(256) & backwardsCompatNode.getKindSet()) != 0 && (element instanceof androidx.compose.ui.layout.OnGloballyPositionedModifier)) {
            isChainUpdate = androidx.compose.ui.node.BackwardsCompatNodeKt.isChainUpdate(this);
            if (isChainUpdate) {
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if (element instanceof androidx.compose.ui.focus.FocusRequesterModifier) {
            ((androidx.compose.ui.focus.FocusRequesterModifier) element).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
        }
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(16) & backwardsCompatNode.getKindSet()) != 0 && (element instanceof androidx.compose.ui.input.pointer.PointerInputModifier)) {
            ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator());
        }
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(8) & backwardsCompatNode.getKindSet()) != 0) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public androidx.compose.ui.unit.Density getDensity() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo1777getSizeNHjbRc() {
        return androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(androidx.compose.ui.node.DelegatableNodeKt.m3509requireCoordinator64DMado(this, androidx.compose.ui.node.NodeKind.m3613constructorimpl(128)).mo3409getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.invalidateCache = true;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    private final void updateDrawCache() {
        kotlin.jvm.functions.Function1 function1;
        final androidx.compose.ui.Modifier.Element element = this.element;
        if (element instanceof androidx.compose.ui.draw.DrawCacheModifier) {
            function1 = androidx.compose.ui.node.BackwardsCompatNodeKt.onDrawCacheReadsChanged;
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, function1, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((androidx.compose.ui.draw.DrawCacheModifier) androidx.compose.ui.Modifier.Element.this).onBuildCache(this);
                }
            });
        }
        this.invalidateCache = false;
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.invalidateCache = true;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    public final java.util.HashSet<androidx.compose.ui.modifier.ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    public final void setReadValues(java.util.HashSet<androidx.compose.ui.modifier.ModifierLocal<?>> hashSet) {
        this.readValues = hashSet;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        androidx.compose.ui.modifier.BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
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
    public <T> T getCurrent(androidx.compose.ui.modifier.ModifierLocal<T> modifierLocal) {
        androidx.compose.ui.node.NodeChain nodes;
        this.readValues.add(modifierLocal);
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode = this;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(32);
        if (!backwardsCompatNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = backwardsCompatNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(backwardsCompatNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        ?? r5 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
                                androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode = (androidx.compose.ui.modifier.ModifierLocalModifierNode) delegatingNode;
                                if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                    return (T) modifierLocalModifierNode.getProvidedValues().get$ui_release(modifierLocal);
                                }
                            } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                r5 = r5;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i == 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(r5);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    public final void updateModifierLocalConsumer() {
        kotlin.jvm.functions.Function1 function1;
        if (getIsAttached()) {
            this.readValues.clear();
            function1 = androidx.compose.ui.node.BackwardsCompatNodeKt.updateModifierLocalConsumer;
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, function1, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.Modifier.Element element = androidx.compose.ui.node.BackwardsCompatNode.this.getElement();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((androidx.compose.ui.modifier.ModifierLocalConsumer) element).onModifierLocalsUpdated(androidx.compose.ui.node.BackwardsCompatNode.this);
                }
            });
        }
    }

    private final void updateModifierLocalProvider(androidx.compose.ui.modifier.ModifierLocalProvider<?> element) {
        boolean isChainUpdate;
        androidx.compose.ui.modifier.BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap != null && backwardsCompatLocalMap.contains$ui_release(element.getKey())) {
            backwardsCompatLocalMap.setElement(element);
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, element.getKey());
            return;
        }
        this._providedValues = new androidx.compose.ui.modifier.BackwardsCompatLocalMap(element);
        isChainUpdate = androidx.compose.ui.node.BackwardsCompatNodeKt.isChainUpdate(this);
        if (isChainUpdate) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, element.getKey());
        }
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return getIsAttached();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.LayoutModifier) element).mo65measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.LayoutModifier) element).minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.LayoutModifier) element).minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.LayoutModifier) element).maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.LayoutModifier) element).maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        androidx.compose.ui.draw.DrawModifier drawModifier = (androidx.compose.ui.draw.DrawModifier) element;
        if (this.invalidateCache && (element instanceof androidx.compose.ui.draw.DrawCacheModifier)) {
            updateDrawCache();
        }
        drawModifier.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = ((androidx.compose.ui.semantics.SemanticsModifier) element).getSemanticsConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(semanticsPropertyReceiver, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((androidx.compose.ui.semantics.SemanticsConfiguration) semanticsPropertyReceiver).collapsePeer$ui_release(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo181onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().mo3299onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().getShareWithSiblings();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((androidx.compose.ui.input.pointer.PointerInputModifier) element).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((androidx.compose.ui.layout.ParentDataModifier) element).modifyParentData(density, obj);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        androidx.compose.ui.Modifier.Element element = this.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.ui.layout.OnGloballyPositionedModifier) element).onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo268onRemeasuredozmzZPI(long size) {
        androidx.compose.ui.Modifier.Element element = this.element;
        if (element instanceof androidx.compose.ui.layout.OnRemeasuredModifier) {
            ((androidx.compose.ui.layout.OnRemeasuredModifier) element).mo3448onRemeasuredozmzZPI(size);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        androidx.compose.ui.Modifier.Element element = this.element;
        if (element instanceof androidx.compose.ui.layout.OnPlacedModifier) {
            ((androidx.compose.ui.layout.OnPlacedModifier) element).onPlaced(coordinates);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(androidx.compose.ui.focus.FocusState focusState) {
        androidx.compose.ui.Modifier.Element element = this.element;
        if (!(element instanceof androidx.compose.ui.focus.FocusEventModifier)) {
            throw new java.lang.IllegalStateException("onFocusEvent called on wrong node".toString());
        }
        ((androidx.compose.ui.focus.FocusEventModifier) element).onFocusEvent(focusState);
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(androidx.compose.ui.focus.FocusProperties focusProperties) {
        androidx.compose.ui.Modifier.Element element = this.element;
        if (!(element instanceof androidx.compose.ui.focus.FocusOrderModifier)) {
            throw new java.lang.IllegalStateException("applyFocusProperties called on wrong node".toString());
        }
        ((androidx.compose.ui.focus.FocusOrderModifier) element).populateFocusOrder(new androidx.compose.ui.focus.FocusOrder(focusProperties));
    }

    public java.lang.String toString() {
        return this.element.toString();
    }
}
