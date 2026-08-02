package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000 ,2\u00020\u0001:\u0001,R\u001c\u0010\u0007\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8'@'X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8'@'X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "viewConfiguration", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "compositeKeyHash", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ComposeUiNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.ComposeUiNode.Companion INSTANCE = androidx.compose.ui.node.ComposeUiNode.Companion.getHighSpeedVideoFpsRangesFor;

    int getCompositeKeyHash();

    androidx.compose.runtime.CompositionLocalMap getCompositionLocalMap();

    androidx.compose.ui.unit.Density getDensity();

    androidx.compose.ui.unit.LayoutDirection getLayoutDirection();

    androidx.compose.ui.layout.MeasurePolicy getMeasurePolicy();

    /* renamed from: getModifier */
    androidx.compose.ui.Modifier getGetHighSpeedVideoSizes();

    androidx.compose.ui.platform.ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i);

    void setCompositionLocalMap(androidx.compose.runtime.CompositionLocalMap compositionLocalMap);

    void setDensity(androidx.compose.ui.unit.Density density);

    void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection);

    void setMeasurePolicy(androidx.compose.ui.layout.MeasurePolicy measurePolicy);

    void setModifier(androidx.compose.ui.Modifier modifier);

    void setViewConfiguration(androidx.compose.ui.platform.ViewConfiguration viewConfiguration);

    @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR1\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R1\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R1\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R1\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R1\u0010\u001e\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R1\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R1\u0010$\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R+\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0&¢\u0006\u0002\b\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "getConstructor", "()Lkotlin/jvm/functions/Function0;", "VirtualConstructor", "getVirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "", "Lkotlin/ExtensionFunctionType;", "SetModifier", "Lkotlin/jvm/functions/Function2;", "getSetModifier", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/unit/Density;", "SetDensity", "getSetDensity", "Landroidx/compose/runtime/CompositionLocalMap;", "SetResolvedCompositionLocals", "getSetResolvedCompositionLocals", "Landroidx/compose/ui/layout/MeasurePolicy;", "SetMeasurePolicy", "getSetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "SetLayoutDirection", "getSetLayoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "SetViewConfiguration", "getSetViewConfiguration", "", "SetCompositeKeyHash", "getSetCompositeKeyHash", "Lkotlin/Function1;", "ApplyOnDeactivatedNodeAssertion", "Lkotlin/jvm/functions/Function1;", "getApplyOnDeactivatedNodeAssertion", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.node.ComposeUiNode.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.node.ComposeUiNode.Companion();
        private static final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> Constructor = androidx.compose.ui.node.LayoutNode.INSTANCE.getConstructor$ui();
        private static final kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> VirtualConstructor = new kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.node.LayoutNode invoke() {
                return new androidx.compose.ui.node.LayoutNode(true, 0, 2, null);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.Modifier, kotlin.Unit> SetModifier = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.Modifier, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.Modifier modifier) {
                getHighSpeedVideoFpsRanges(composeUiNode, modifier);
                return kotlin.Unit.INSTANCE;
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.Density, kotlin.Unit> SetDensity = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.Density, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.Density density) {
                composeUiNode.setDensity(density);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.Density density) {
                Camera2StreamConfigurationMap(composeUiNode, density);
                return kotlin.Unit.INSTANCE;
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.runtime.CompositionLocalMap, kotlin.Unit> SetResolvedCompositionLocals = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.runtime.CompositionLocalMap, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
                getHighSpeedVideoSizes(composeUiNode, compositionLocalMap);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
                composeUiNode.setCompositionLocalMap(compositionLocalMap);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.MeasurePolicy, kotlin.Unit> SetMeasurePolicy = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.MeasurePolicy, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.layout.MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.layout.MeasurePolicy measurePolicy) {
                Camera2StreamConfigurationMap(composeUiNode, measurePolicy);
                return kotlin.Unit.INSTANCE;
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit> SetLayoutDirection = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                Camera2StreamConfigurationMap(composeUiNode, layoutDirection);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.ViewConfiguration, kotlin.Unit> SetViewConfiguration = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.ViewConfiguration, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
                getHighSpeedVideoSizes(composeUiNode, viewConfiguration);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(androidx.compose.ui.node.ComposeUiNode composeUiNode, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };
        private static final kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> SetCompositeKeyHash = new kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.ComposeUiNode composeUiNode, int i) {
                composeUiNode.setCompositeKeyHash(i);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode, java.lang.Integer num) {
                getHighSpeedVideoFpsRanges(composeUiNode, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        };
        private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.ComposeUiNode, kotlin.Unit> ApplyOnDeactivatedNodeAssertion = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.ComposeUiNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ComposeUiNode composeUiNode) {
                getHighResolutionOutputSizeshNQ4ISI(composeUiNode);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.ComposeUiNode composeUiNode) {
                androidx.compose.ui.node.LayoutNode layoutNode = composeUiNode instanceof androidx.compose.ui.node.LayoutNode ? (androidx.compose.ui.node.LayoutNode) composeUiNode : null;
                if (layoutNode != null && layoutNode.getIsDeactivated()) {
                    throw new java.lang.IllegalStateException("Apply is called on deactivated node ".concat(java.lang.String.valueOf(composeUiNode)));
                }
            }
        };

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

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.node.ComposeUiNode, kotlin.Unit> getApplyOnDeactivatedNodeAssertion() {
            return ApplyOnDeactivatedNodeAssertion;
        }
    }
}
