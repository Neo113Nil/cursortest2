package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0007R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\u0007R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\u0007R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\u0007R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\u0007R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0007R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u0007R!\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u0007R!\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u0007R!\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0003\u001a\u0004\b+\u0010\u0007R!\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010\u0007R!\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\u0007R!\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u0003\u001a\u0004\b7\u0010\u0007R!\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0003\u001a\u0004\b;\u0010\u0007R!\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0003\u001a\u0004\b?\u0010\u0007R!\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0003\u001a\u0004\bC\u0010\u0007R!\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0003\u001a\u0004\bG\u0010\u0007R!\u0010M\u001a\b\u0012\u0004\u0012\u00020J0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0003\u001a\u0004\bK\u0010\u0007R!\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010\u0003\u001a\u0004\bO\u0010\u0007R!\u0010U\u001a\b\u0012\u0004\u0012\u00020R0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010\u0003\u001a\u0004\bS\u0010\u0007R!\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0003\u001a\u0004\bW\u0010\u0007R!\u0010\\\u001a\b\u0012\u0004\u0012\u00020\"0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0003\u001a\u0004\bZ\u0010\u0007R!\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b_\u0010\u0003\u001a\u0004\b^\u0010\u0007"}, d2 = {"Landroidx/compose/ui/node/Nodes;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/Modifier$Node;", "getAny-OLwlOKw", "()I", "getAny-OLwlOKw$annotations", "Any", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayout-OLwlOKw", "getLayout-OLwlOKw$annotations", "Layout", "Landroidx/compose/ui/node/DrawModifierNode;", "getDraw-OLwlOKw", "getDraw-OLwlOKw$annotations", "Draw", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemantics-OLwlOKw", "getSemantics-OLwlOKw$annotations", "Semantics", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInput-OLwlOKw", "getPointerInput-OLwlOKw$annotations", "PointerInput", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getLocals-OLwlOKw", "getLocals-OLwlOKw$annotations", "Locals", "Landroidx/compose/ui/node/ParentDataModifierNode;", "getParentData-OLwlOKw", "getParentData-OLwlOKw$annotations", "ParentData", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "getOnRemeasured-OLwlOKw", "getOnRemeasured-OLwlOKw$annotations", "OnRemeasured", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "getGlobalPositionAware-OLwlOKw", "getGlobalPositionAware-OLwlOKw$annotations", "GlobalPositionAware", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachMeasure-OLwlOKw", "getApproachMeasure-OLwlOKw$annotations", "ApproachMeasure", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTarget-OLwlOKw", "getFocusTarget-OLwlOKw$annotations", "FocusTarget", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "getFocusProperties-OLwlOKw", "getFocusProperties-OLwlOKw$annotations", "FocusProperties", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "getFocusEvent-OLwlOKw", "getFocusEvent-OLwlOKw$annotations", "FocusEvent", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "getKeyInput-OLwlOKw", "getKeyInput-OLwlOKw$annotations", "KeyInput", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "getRotaryInput-OLwlOKw", "getRotaryInput-OLwlOKw$annotations", "RotaryInput", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "getCompositionLocalConsumer-OLwlOKw", "getCompositionLocalConsumer-OLwlOKw$annotations", "CompositionLocalConsumer", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "getSoftKeyboardKeyInput-OLwlOKw", "getSoftKeyboardKeyInput-OLwlOKw$annotations", "SoftKeyboardKeyInput", "Landroidx/compose/ui/node/TraversableNode;", "getTraversable-OLwlOKw", "getTraversable-OLwlOKw$annotations", "Traversable", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "getBringIntoView-OLwlOKw", "getBringIntoView-OLwlOKw$annotations", "BringIntoView", "Landroidx/compose/ui/node/UnplacedAwareModifierNode;", "getUnplaced-OLwlOKw", "getUnplaced-OLwlOKw$annotations", "Unplaced", "Landroidx/compose/ui/input/indirect/IndirectPointerInputModifierNode;", "getIndirectPointerInput-OLwlOKw", "getIndirectPointerInput-OLwlOKw$annotations", "IndirectPointerInput", "getOnPlaced-OLwlOKw", "getOnPlaced-OLwlOKw$annotations", "OnPlaced", "Landroidx/compose/ui/layout/BeyondBoundsLayoutProviderModifierNode;", "getBeyondBoundsLayout-OLwlOKw", "getBeyondBoundsLayout-OLwlOKw$annotations", "BeyondBoundsLayout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Nodes {
    public static final int $stable = 0;
    public static final androidx.compose.ui.node.Nodes INSTANCE = new androidx.compose.ui.node.Nodes();

    @kotlin.jvm.JvmStatic
    /* renamed from: getAny-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7633getAnyOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getApproachMeasure-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7635getApproachMeasureOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getBeyondBoundsLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7637getBeyondBoundsLayoutOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getBringIntoView-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7639getBringIntoViewOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getCompositionLocalConsumer-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7641getCompositionLocalConsumerOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getDraw-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7643getDrawOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getFocusEvent-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7645getFocusEventOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getFocusProperties-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7647getFocusPropertiesOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getFocusTarget-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7649getFocusTargetOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getGlobalPositionAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7651getGlobalPositionAwareOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getIndirectPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7653getIndirectPointerInputOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7655getKeyInputOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7657getLayoutOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getLocals-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7659getLocalsOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getOnPlaced-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7661getOnPlacedOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getOnRemeasured-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7663getOnRemeasuredOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getParentData-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7665getParentDataOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7667getPointerInputOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getRotaryInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7669getRotaryInputOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getSemantics-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7671getSemanticsOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getSoftKeyboardKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7673getSoftKeyboardKeyInputOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getTraversable-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7675getTraversableOLwlOKw$annotations() {
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: getUnplaced-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m7677getUnplacedOLwlOKw$annotations() {
    }

    private Nodes() {
    }

    /* renamed from: getAny-OLwlOKw, reason: not valid java name */
    public static final int m7632getAnyOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(1);
    }

    /* renamed from: getLayout-OLwlOKw, reason: not valid java name */
    public static final int m7656getLayoutOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(2);
    }

    /* renamed from: getDraw-OLwlOKw, reason: not valid java name */
    public static final int m7642getDrawOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(4);
    }

    /* renamed from: getSemantics-OLwlOKw, reason: not valid java name */
    public static final int m7670getSemanticsOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
    }

    /* renamed from: getPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m7666getPointerInputOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(16);
    }

    /* renamed from: getLocals-OLwlOKw, reason: not valid java name */
    public static final int m7658getLocalsOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(32);
    }

    /* renamed from: getParentData-OLwlOKw, reason: not valid java name */
    public static final int m7664getParentDataOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(64);
    }

    /* renamed from: getOnRemeasured-OLwlOKw, reason: not valid java name */
    public static final int m7662getOnRemeasuredOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(128);
    }

    /* renamed from: getGlobalPositionAware-OLwlOKw, reason: not valid java name */
    public static final int m7650getGlobalPositionAwareOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(256);
    }

    /* renamed from: getApproachMeasure-OLwlOKw, reason: not valid java name */
    public static final int m7634getApproachMeasureOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(512);
    }

    /* renamed from: getFocusTarget-OLwlOKw, reason: not valid java name */
    public static final int m7648getFocusTargetOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
    }

    /* renamed from: getFocusProperties-OLwlOKw, reason: not valid java name */
    public static final int m7646getFocusPropertiesOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(2048);
    }

    /* renamed from: getFocusEvent-OLwlOKw, reason: not valid java name */
    public static final int m7644getFocusEventOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(4096);
    }

    /* renamed from: getKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m7654getKeyInputOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(8192);
    }

    /* renamed from: getRotaryInput-OLwlOKw, reason: not valid java name */
    public static final int m7668getRotaryInputOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(16384);
    }

    /* renamed from: getCompositionLocalConsumer-OLwlOKw, reason: not valid java name */
    public static final int m7640getCompositionLocalConsumerOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(32768);
    }

    /* renamed from: getSoftKeyboardKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m7672getSoftKeyboardKeyInputOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(131072);
    }

    /* renamed from: getTraversable-OLwlOKw, reason: not valid java name */
    public static final int m7674getTraversableOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
    }

    /* renamed from: getBringIntoView-OLwlOKw, reason: not valid java name */
    public static final int m7638getBringIntoViewOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(524288);
    }

    /* renamed from: getUnplaced-OLwlOKw, reason: not valid java name */
    public static final int m7676getUnplacedOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(1048576);
    }

    /* renamed from: getIndirectPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m7652getIndirectPointerInputOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
    }

    /* renamed from: getOnPlaced-OLwlOKw, reason: not valid java name */
    public static final int m7660getOnPlacedOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(4194304);
    }

    /* renamed from: getBeyondBoundsLayout-OLwlOKw, reason: not valid java name */
    public static final int m7636getBeyondBoundsLayoutOLwlOKw() {
        return androidx.compose.ui.node.NodeKind.m7621constructorimpl(8388608);
    }
}
