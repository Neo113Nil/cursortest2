package androidx.compose.ui.node;

/* compiled from: ComposeUiNode.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 .2\u00020\u0001:\u0001.R\"\u0010\u0002\u001a\u00020\u00038&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u001dX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010(\u001a\u00020)X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "compositeKeyHash", "", "getCompositeKeyHash$annotations", "()V", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ComposeUiNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.ComposeUiNode.Companion INSTANCE = androidx.compose.ui.node.ComposeUiNode.Companion.$$INSTANCE;

    /* compiled from: ComposeUiNode.kt */
    /* renamed from: androidx.compose.ui.node.ComposeUiNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        }

        public static /* synthetic */ void getCompositeKeyHash$annotations() {
        }
    }

    int getCompositeKeyHash();

    androidx.compose.runtime.CompositionLocalMap getCompositionLocalMap();

    androidx.compose.ui.unit.Density getDensity();

    androidx.compose.ui.unit.LayoutDirection getLayoutDirection();

    androidx.compose.ui.layout.MeasurePolicy getMeasurePolicy();

    androidx.compose.ui.Modifier getModifier();

    androidx.compose.ui.platform.ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i);

    void setCompositionLocalMap(androidx.compose.runtime.CompositionLocalMap compositionLocalMap);

    void setDensity(androidx.compose.ui.unit.Density density);

    void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection);

    void setMeasurePolicy(androidx.compose.ui.layout.MeasurePolicy measurePolicy);

    void setModifier(androidx.compose.ui.Modifier modifier);

    void setViewConfiguration(androidx.compose.ui.platform.ViewConfiguration viewConfiguration);

    /* compiled from: ComposeUiNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R3\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR(\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR(\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR(\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR(\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR(\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "getConstructor", "()Lkotlin/jvm/functions/Function0;", "SetCompositeKeyHash", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getSetCompositeKeyHash$annotations", "getSetCompositeKeyHash", "()Lkotlin/jvm/functions/Function2;", "SetDensity", "Landroidx/compose/ui/unit/Density;", "getSetDensity", "SetLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getSetLayoutDirection", "SetMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getSetMeasurePolicy", "SetModifier", "Landroidx/compose/ui/Modifier;", "getSetModifier", "SetResolvedCompositionLocals", "Landroidx/compose/runtime/CompositionLocalMap;", "getSetResolvedCompositionLocals", "SetViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getSetViewConfiguration", "VirtualConstructor", "getVirtualConstructor", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.node.ComposeUiNode.Companion $$INSTANCE = new androidx.compose.ui.node.ComposeUiNode.Companion();
        private static final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> Constructor = androidx.compose.ui.node.LayoutNode.INSTANCE.getConstructor$ui_release();
        private static final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> VirtualConstructor = new kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.node.LayoutNode invoke() {
                return new androidx.compose.ui.node.LayoutNode(true, 0, 2, null);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.Modifier, kotlin.Unit> SetModifier = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.Modifier, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.Modifier modifier) {
                invoke2(composeUiNode, modifier);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.Density, kotlin.Unit> SetDensity = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.Density, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.Density density) {
                invoke2(composeUiNode, density);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.Density density) {
                composeUiNode.setDensity(density);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.runtime.CompositionLocalMap, kotlin.Unit> SetResolvedCompositionLocals = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.runtime.CompositionLocalMap, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
                invoke2(composeUiNode, compositionLocalMap);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
                composeUiNode.setCompositionLocalMap(compositionLocalMap);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.MeasurePolicy, kotlin.Unit> SetMeasurePolicy = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.MeasurePolicy, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.layout.MeasurePolicy measurePolicy) {
                invoke2(composeUiNode, measurePolicy);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.layout.MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit> SetLayoutDirection = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                invoke2(composeUiNode, layoutDirection);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.ViewConfiguration, kotlin.Unit> SetViewConfiguration = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.ViewConfiguration, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
                invoke2(composeUiNode, viewConfiguration);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> SetCompositeKeyHash = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, java.lang.Integer num) {
                invoke(composeUiNode, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, int i) {
                composeUiNode.setCompositeKeyHash(i);
            }
        };

        public static /* synthetic */ void getSetCompositeKeyHash$annotations() {
        }

        private Companion() {
        }

        public final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> getConstructor() {
            return Constructor;
        }

        public final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> getVirtualConstructor() {
            return VirtualConstructor;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.Modifier, kotlin.Unit> getSetModifier() {
            return SetModifier;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.Density, kotlin.Unit> getSetDensity() {
            return SetDensity;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.runtime.CompositionLocalMap, kotlin.Unit> getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.MeasurePolicy, kotlin.Unit> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.ViewConfiguration, kotlin.Unit> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }
    }
}
