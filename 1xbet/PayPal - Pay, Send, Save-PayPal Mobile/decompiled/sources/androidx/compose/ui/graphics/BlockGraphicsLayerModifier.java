package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B \u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0015\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0006*\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR3\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\nR\u0014\u0010#\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020 8\u0017X\u0097D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\""}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invalidateLayerBlock", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "setLayerBlock", "", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "isImportantForBounds", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlockGraphicsLayerModifier extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;
    private final boolean isImportantForBounds;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public BlockGraphicsLayerModifier(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
        this.layerBlock = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final void setLayerBlock(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
        this.layerBlock = function1;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: isImportantForBounds, reason: from getter */
    public final boolean getGetOutputFormats() {
        return this.isImportantForBounds;
    }

    public final void invalidateLayerBlock() {
        androidx.compose.ui.node.LayoutModifierNodeKt.updateLayerBlock(this, this.layerBlock);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoSizes(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, this.getLayerBlock(), 4, (java.lang.Object) null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockGraphicsLayerModifier(block=");
        sb.append(this.layerBlock);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean lastClip;
        androidx.compose.ui.graphics.Shape shape;
        androidx.compose.ui.graphics.ReusableGraphicsLayerScope reusableGraphicsLayerScope;
        androidx.compose.ui.graphics.ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
        androidx.compose.ui.graphics.ReusableGraphicsLayerScope reusableGraphicsLayerScope3;
        if (androidx.compose.ui.ComposeUiFlags.isGraphicsLayerShapeSemanticsEnabled) {
            androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado = androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(this, androidx.compose.ui.node.NodeKind.m7621constructorimpl(2));
            if (!m7502requireCoordinator64DMado.getWasLayerBlockInvoked()) {
                reusableGraphicsLayerScope = androidx.compose.ui.graphics.GraphicsLayerModifierKt.Camera2StreamConfigurationMap;
                if (reusableGraphicsLayerScope == null) {
                    androidx.compose.ui.graphics.GraphicsLayerModifierKt.Camera2StreamConfigurationMap = new androidx.compose.ui.graphics.ReusableGraphicsLayerScope();
                } else {
                    reusableGraphicsLayerScope2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.Camera2StreamConfigurationMap;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(reusableGraphicsLayerScope2);
                    reusableGraphicsLayerScope2.reset();
                }
                reusableGraphicsLayerScope3 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(reusableGraphicsLayerScope3);
                reusableGraphicsLayerScope3.setGraphicsDensity$ui(m7502requireCoordinator64DMado.getLayoutNode().getDensity());
                reusableGraphicsLayerScope3.m6304setSizeuvyYCjk(androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(m7502requireCoordinator64DMado.mo7361getSizeYbymL2g()));
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    this.layerBlock.invoke(reusableGraphicsLayerScope3);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    shape = reusableGraphicsLayerScope3.getShape();
                    lastClip = reusableGraphicsLayerScope3.getClip();
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            } else {
                androidx.compose.ui.graphics.Shape lastShape = m7502requireCoordinator64DMado.getLastShape();
                lastClip = m7502requireCoordinator64DMado.getLastClip();
                shape = lastShape;
            }
            if (lastClip) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, shape);
            }
        }
    }
}
