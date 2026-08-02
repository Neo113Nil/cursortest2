package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\u008c\u0001\u008b\u0001BM\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0015*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 JU\u0010#\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0015¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010+J\r\u0010.\u001a\u00020\u0015¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\u0015H\u0004¢\u0006\u0004\b/\u0010+J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0015H\u0002¢\u0006\u0004\b3\u0010+J\u000f\u00104\u001a\u00020\u0015H\u0002¢\u0006\u0004\b4\u0010+J'\u0010;\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020&2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020\u0015H\u0016¢\u0006\u0004\b<\u0010+J\u0015\u0010@\u001a\u00020\r2\u0006\u0010%\u001a\u00020=¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\r2\u0006\u0010%\u001a\u00020=H$¢\u0006\u0004\bA\u0010?J\u0017\u0010D\u001a\u00020\r2\u0006\u0010%\u001a\u00020=H$¢\u0006\u0004\bC\u0010?J\u000f\u0010E\u001a\u00020\u0015H\u0014¢\u0006\u0004\bE\u0010+J\u0015\u0010G\u001a\u00020\r2\u0006\u0010%\u001a\u00020=¢\u0006\u0004\bF\u0010?J\u0011\u0010H\u001a\u00020\u0015*\u00020\u001e¢\u0006\u0004\bH\u0010 J\u0011\u0010I\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\bI\u0010JJ\u001f\u0010P\u001a\u00020\u00152\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\rH\u0004¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\u00152\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\rH\u0004¢\u0006\u0004\bQ\u0010OJ\u0017\u0010S\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\rH\u0004¢\u0006\u0004\bS\u00102J\u001c\u0010W\u001a\u00020\u0015*\u00020T2\u0006\u0010L\u001a\u00020KH\u0084@¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020\rH\u0002¢\u0006\u0004\bX\u0010\u001aJ\u000f\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u0010+J\u000f\u0010Y\u001a\u00020\u0015H\u0002¢\u0006\u0004\bY\u0010+R\u0018\u0010Y\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u00101\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u00103\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u00104\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010X\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR$\u0010\u000f\u001a\u00020\r2\u0006\u00100\u001a\u00020\r8\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000f\u0010_\u001a\u0004\bd\u0010\u001aR0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\b\u0016\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010h\u001a\u00020\r8\u0007X\u0087D¢\u0006\f\n\u0004\bh\u0010_\u001a\u0004\bi\u0010\u001aR\u0014\u0010l\u001a\u00020j8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010kR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010]R\u0018\u0010\\\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010Z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010xR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020s0y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010zR\u0016\u0010m\u001a\u00020K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010|R\u0018\u0010`\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010uR\u0018\u0010n\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010}R\u0018\u0010\u007f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010[R\u0016\u0010t\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010_R\u001a\u0010^\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bv\u0010\u0081\u0001R\u0013\u0010\u0083\u0001\u001a\u00020\r8G¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u001aR\u001a\u0010b\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0085\u0001R \u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputModifierNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOutputFormats", "()Z", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "createPointerInputNodeIfNeeded", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "updateCommon-O2vRcR0", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "updateCommon", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "event", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "onIndirectPointerEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "onCancelIndirectPointerInput", "()V", "onAttach", "onObservedReadsChanged", "onDetach", "disposeInteractions", "p0", "getHighSpeedVideoSizes", "(Z)V", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onClickKeyDownEvent-ZmokQxo", "onClickKeyDownEvent", "onClickKeyUpEvent-ZmokQxo", "onClickKeyUpEvent", "onCancelKeyInput", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "applySemantics", "resetPointerInputHandler", "()Lkotlin/Unit;", "Landroidx/compose/ui/geometry/Offset;", "offset", "indirectPointer", "handlePressInteractionStart-3MmeM6k", "(JZ)V", "handlePressInteractionStart", "handlePressInteractionRelease-3MmeM6k", "handlePressInteractionRelease", "handlePressInteractionCancel", "Landroidx/compose/foundation/gestures/PressGestureScope;", "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePressInteraction", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/IndicationNodeFactory;", "toString", "Z", "getOutputSizeshNQ4ISI", "Ljava/lang/String;", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/compose/ui/semantics/Role;", "getEnabled", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/foundation/FocusableNode;", "getOutputMinFrameDuration", "getOutputStallDurationlomOqCM", "getOutputSizes", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "getInputFormats", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "isOutputSupportedForhNQ4ISI", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/collection/MutableLongObjectMap;", "getOutputStallDuration", "J", "Landroidx/compose/ui/geometry/Offset;", "isOutputSupportedFor", "unwrapAs", "Landroidx/compose/foundation/AbstractClickableNode$IndirectPointerClickDetector;", "Landroidx/compose/foundation/AbstractClickableNode$IndirectPointerClickDetector;", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "TraverseKey", "IndirectPointerClickDetector"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractClickableNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.input.key.KeyInputModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.HoverInteraction.Enter getOutputMinFrameDurationlomOqCM;
    private boolean enabled;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction.Press> getOutputStallDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.FocusableNode getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.AbstractClickableNode.IndirectPointerClickDetector toString;
    private androidx.compose.ui.node.DelegatableNode getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.IndicationNodeFactory getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.PressInteraction.Press getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Offset getOutputSizes;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.MutableInteractionSource Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode getInputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private boolean isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private androidx.compose.foundation.IndicationNodeFactory getOutputFormats;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.semantics.Role getHighSpeedVideoFpsRangesFor;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.MutableInteractionSource unwrapAs;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.PressInteraction.Press getHighSpeedVideoSizesFor;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final boolean shouldAutoInvalidate;

    /* renamed from: toString, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;
    private final java.lang.Object traverseKey;

    /* renamed from: TraverseKey, reason: from kotlin metadata */
    public static final androidx.compose.foundation.AbstractClickableNode.Companion INSTANCE = new androidx.compose.foundation.AbstractClickableNode.Companion(null);
    public static final int $stable = 8;

    public void applyAdditionalSemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded();

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    protected void onCancelKeyInput() {
    }

    /* renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo1259onClickKeyDownEventZmokQxo(android.view.KeyEvent event);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    protected abstract boolean mo1260onClickKeyUpEventZmokQxo(android.view.KeyEvent event);

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo1263onPreKeyEventZmokQxo(android.view.KeyEvent event) {
        return false;
    }

    private AbstractClickableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.Camera2StreamConfigurationMap = mutableInteractionSource;
        this.getHighSpeedVideoSizes = indicationNodeFactory;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = role;
        this.enabled = z2;
        this.onClick = function0;
        this.getOutputMinFrameDuration = new androidx.compose.foundation.FocusableNode(mutableInteractionSource, androidx.compose.ui.focus.Focusability.INSTANCE.m5694getSystemDefinedLCbbffg(), new androidx.compose.foundation.AbstractClickableNode$focusableNode$1(this), null);
        this.getOutputStallDuration = androidx.collection.LongObjectMapKt.mutableLongObjectMapOf();
        this.getOutputStallDurationlomOqCM = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        this.unwrapAs = this.Camera2StreamConfigurationMap;
        this.isOutputSupportedForhNQ4ISI = getOutputFormats();
        this.traverseKey = INSTANCE;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    private final boolean getOutputFormats() {
        return this.unwrapAs == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r2.getInputFormats == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        getHighSpeedVideoFpsRanges();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        r2.getOutputMinFrameDuration.update(r2.Camera2StreamConfigurationMap);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r1 != false) goto L35;
     */
    /* renamed from: updateCommon-O2vRcR0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void m1264updateCommonO2vRcR0(androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean useLocalIndication, boolean enabled, java.lang.String onClickLabel, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        boolean z;
        boolean z2 = true;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.unwrapAs, interactionSource)) {
            z = false;
        } else {
            disposeInteractions();
            this.unwrapAs = interactionSource;
            this.Camera2StreamConfigurationMap = interactionSource;
            z = true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, indicationNodeFactory)) {
            this.getHighSpeedVideoSizes = indicationNodeFactory;
            z = true;
        }
        if (this.getHighSpeedVideoFpsRanges != useLocalIndication) {
            this.getHighSpeedVideoFpsRanges = useLocalIndication;
            if (useLocalIndication) {
                onObservedReadsChanged();
            }
        } else {
            z2 = z;
        }
        if (this.enabled != enabled) {
            if (enabled) {
                delegate(this.getOutputMinFrameDuration);
            } else {
                undelegate(this.getOutputMinFrameDuration);
                disposeInteractions();
            }
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
            this.enabled = enabled;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, onClickLabel)) {
            this.getHighResolutionOutputSizeshNQ4ISI = onClickLabel;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, role)) {
            this.getHighSpeedVideoFpsRangesFor = role;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onClick = onClick;
        if (this.isOutputSupportedForhNQ4ISI != getOutputFormats()) {
            boolean outputFormats = getOutputFormats();
            this.isOutputSupportedForhNQ4ISI = outputFormats;
            if (!outputFormats) {
            }
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent event, androidx.compose.ui.input.pointer.PointerEventPass pass) {
        getHighResolutionOutputSizeshNQ4ISI();
        if (this.enabled) {
            if (this.toString == null) {
                this.toString = new androidx.compose.foundation.AbstractClickableNode.IndirectPointerClickDetector(this);
            }
            androidx.compose.foundation.AbstractClickableNode.IndirectPointerClickDetector indirectPointerClickDetector = this.toString;
            if (indirectPointerClickDetector != null) {
                indirectPointerClickDetector.processRawEvent(event, pass, this.onClick);
            }
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        androidx.compose.foundation.AbstractClickableNode.IndirectPointerClickDetector indirectPointerClickDetector = this.toString;
        if (indirectPointerClickDetector != null) {
            indirectPointerClickDetector.resetDetector();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        if (!this.isOutputSupportedForhNQ4ISI) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        if (this.enabled) {
            delegate(this.getOutputMinFrameDuration);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (this.getHighSpeedVideoFpsRanges) {
            androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.AbstractClickableNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.AbstractClickableNode.getHighSpeedVideoSizes(androidx.compose.foundation.AbstractClickableNode.this);
                    return highSpeedVideoSizes;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.AbstractClickableNode abstractClickableNode) {
        java.lang.String highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.Indication indication = (androidx.compose.foundation.Indication) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractClickableNode, androidx.compose.foundation.IndicationKt.getLocalIndication());
        if (!(indication instanceof androidx.compose.foundation.IndicationNodeFactory)) {
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.ClickableKt.getHighSpeedVideoFpsRangesFor(indication);
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(highSpeedVideoFpsRangesFor);
        }
        androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory = abstractClickableNode.getOutputFormats;
        androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory2 = (androidx.compose.foundation.IndicationNodeFactory) indication;
        abstractClickableNode.getOutputFormats = indicationNodeFactory2;
        if (indicationNodeFactory != null && !kotlin.jvm.internal.Intrinsics.areEqual(indicationNodeFactory2, indicationNodeFactory)) {
            abstractClickableNode.getHighSpeedVideoFpsRanges();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.unwrapAs == null) {
            this.Camera2StreamConfigurationMap = null;
        }
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getInputFormats;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.getInputFormats = null;
    }

    protected final void disposeInteractions() {
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
        if (mutableInteractionSource != null) {
            androidx.compose.foundation.interaction.PressInteraction.Press press = this.getHighSpeedVideoSizesFor;
            if (press != null) {
                mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.PressInteraction.Cancel(press));
            }
            androidx.compose.foundation.interaction.PressInteraction.Press press2 = this.getOutputSizeshNQ4ISI;
            if (press2 != null) {
                mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.PressInteraction.Cancel(press2));
            }
            androidx.compose.foundation.interaction.HoverInteraction.Enter enter = this.getOutputMinFrameDurationlomOqCM;
            if (enter != null) {
                mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter));
            }
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction.Press> mutableLongObjectMap = this.getOutputStallDuration;
            java.lang.Object[] objArr = mutableLongObjectMap.values;
            long[] jArr = mutableLongObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.PressInteraction.Cancel((androidx.compose.foundation.interaction.PressInteraction.Press) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputSizes = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputStallDuration.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(boolean p0) {
        if (p0) {
            getHighResolutionOutputSizeshNQ4ISI();
            return;
        }
        if (this.Camera2StreamConfigurationMap != null) {
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction.Press> mutableLongObjectMap = this.getOutputStallDuration;
            java.lang.Object[] objArr = mutableLongObjectMap.values;
            long[] jArr = mutableLongObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1(this, (androidx.compose.foundation.interaction.PressInteraction.Press) objArr[(i << 3) + i3], null), 3, null);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            androidx.compose.foundation.interaction.PressInteraction.Press press = this.getOutputSizeshNQ4ISI;
            if (press != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1(this, press, null), 3, null);
            }
        }
        this.getOutputStallDuration.clear();
        this.getOutputSizeshNQ4ISI = null;
        onCancelKeyInput();
    }

    private final void getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getInputFormats;
        if (delegatableNode == null && this.isOutputSupportedForhNQ4ISI) {
            return;
        }
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.getInputFormats = null;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getInputFormats == null) {
            androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory = this.getHighSpeedVideoFpsRanges ? this.getOutputFormats : this.getHighSpeedVideoSizes;
            if (indicationNodeFactory != null) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                }
                this.getOutputMinFrameDuration.update(this.Camera2StreamConfigurationMap);
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(mutableInteractionSource);
                androidx.compose.ui.node.DelegatableNode create = indicationNodeFactory.create(mutableInteractionSource);
                delegate(create);
                this.getInputFormats = create;
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded;
        long m8778getCenterozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8778getCenterozmzZPI(bounds);
        this.getOutputStallDurationlomOqCM = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8778getCenterozmzZPI)) << 32) | (java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8778getCenterozmzZPI)) & 4294967295L));
        getHighResolutionOutputSizeshNQ4ISI();
        if (this.enabled && pass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
            int type = pointerEvent.getType();
            if (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
            } else if (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
        if (this.getInputSizeshNQ4ISI == null && (createPointerInputNodeIfNeeded = createPointerInputNodeIfNeeded()) != null) {
            this.getInputSizeshNQ4ISI = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(createPointerInputNodeIfNeeded);
        }
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.getInputSizeshNQ4ISI;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo1262onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
        if (mutableInteractionSource != null && (enter = this.getOutputMinFrameDurationlomOqCM) != null) {
            mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter));
        }
        this.getOutputMinFrameDurationlomOqCM = null;
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.getInputSizeshNQ4ISI;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo1261onKeyEventZmokQxo(android.view.KeyEvent event) {
        boolean highSpeedVideoSizes;
        boolean Camera2StreamConfigurationMap;
        boolean z;
        getHighResolutionOutputSizeshNQ4ISI();
        long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event);
        if (this.enabled) {
            Camera2StreamConfigurationMap = androidx.compose.foundation.ClickableKt.Camera2StreamConfigurationMap(event);
            if (Camera2StreamConfigurationMap) {
                if (this.getOutputStallDuration.containsKey(m7089getKeyZmokQxo)) {
                    z = false;
                } else {
                    androidx.compose.foundation.interaction.PressInteraction.Press press = new androidx.compose.foundation.interaction.PressInteraction.Press(this.getOutputStallDurationlomOqCM, null);
                    this.getOutputStallDuration.set(m7089getKeyZmokQxo, press);
                    if (this.Camera2StreamConfigurationMap != null) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                    }
                    z = true;
                }
                return mo1259onClickKeyDownEventZmokQxo(event) || z;
            }
        }
        if (this.enabled) {
            highSpeedVideoSizes = androidx.compose.foundation.ClickableKt.getHighSpeedVideoSizes(event);
            if (highSpeedVideoSizes) {
                androidx.compose.foundation.interaction.PressInteraction.Press remove = this.getOutputStallDuration.remove(m7089getKeyZmokQxo);
                if (remove != null) {
                    if (this.Camera2StreamConfigurationMap != null) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2(this, remove, null), 3, null);
                    }
                    mo1260onClickKeyUpEventZmokQxo(event);
                }
                if (remove != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.Role role = this.getHighSpeedVideoFpsRangesFor;
        if (role != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(role);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, role.getGetHighSpeedVideoSizes());
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.AbstractClickableNode$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.AbstractClickableNode.getHighSpeedVideoFpsRanges(androidx.compose.foundation.AbstractClickableNode.this);
                return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
            }
        });
        if (this.enabled) {
            this.getOutputMinFrameDuration.applySemantics(semanticsPropertyReceiver);
        } else {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.foundation.AbstractClickableNode abstractClickableNode) {
        abstractClickableNode.onClick.invoke();
        return true;
    }

    protected final kotlin.Unit resetPointerInputHandler() {
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.getInputSizeshNQ4ISI;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: handlePressInteractionStart-3MmeM6k, reason: not valid java name */
    protected final void m1258handlePressInteractionStart3MmeM6k(long offset, boolean indirectPointer) {
        kotlinx.coroutines.Job launch$default;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
        if (mutableInteractionSource != null) {
            androidx.compose.foundation.interaction.PressInteraction.Press press = new androidx.compose.foundation.interaction.PressInteraction.Press(offset, null);
            if (getHighSpeedVideoFpsRangesFor()) {
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSource, press, indirectPointer, this, null), 3, null);
                this.getValidOutputFormatsForInputhNQ4ISI = launch$default;
            } else {
                if (indirectPointer) {
                    this.getOutputSizeshNQ4ISI = press;
                } else {
                    this.getHighSpeedVideoSizesFor = press;
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$2(mutableInteractionSource, press, null), 3, null);
            }
        }
    }

    /* renamed from: handlePressInteractionRelease-3MmeM6k, reason: not valid java name */
    protected final void m1257handlePressInteractionRelease3MmeM6k(long offset, boolean indirectPointer) {
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
        if (mutableInteractionSource != null) {
            kotlinx.coroutines.Job job = this.getValidOutputFormatsForInputhNQ4ISI;
            if (job != null && job.isActive()) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1(job, offset, mutableInteractionSource, null), 3, null);
            } else {
                androidx.compose.foundation.interaction.PressInteraction.Press press = indirectPointer ? this.getOutputSizeshNQ4ISI : this.getHighSpeedVideoSizesFor;
                if (press != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$2$1(press, mutableInteractionSource, null), 3, null);
                }
            }
            if (indirectPointer) {
                this.getOutputSizeshNQ4ISI = null;
            } else {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
    }

    protected final void handlePressInteractionCancel(boolean indirectPointer) {
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
        if (mutableInteractionSource != null) {
            kotlinx.coroutines.Job job = this.getValidOutputFormatsForInputhNQ4ISI;
            if (job != null && job.isActive()) {
                kotlinx.coroutines.Job job2 = this.getValidOutputFormatsForInputhNQ4ISI;
                if (job2 != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            } else {
                androidx.compose.foundation.interaction.PressInteraction.Press press = indirectPointer ? this.getOutputSizeshNQ4ISI : this.getHighSpeedVideoSizesFor;
                if (press != null) {
                    final androidx.compose.foundation.interaction.PressInteraction.Cancel cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(press);
                    kotlinx.coroutines.Job job3 = (kotlinx.coroutines.Job) getCoroutineScope().getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1(mutableInteractionSource, cancel, job3 != null ? job3.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.AbstractClickableNode$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit Camera2StreamConfigurationMap;
                            Camera2StreamConfigurationMap = androidx.compose.foundation.AbstractClickableNode.Camera2StreamConfigurationMap(androidx.compose.foundation.interaction.MutableInteractionSource.this, cancel);
                            return Camera2StreamConfigurationMap;
                        }
                    }) : null, null), 3, null);
                }
            }
            if (indirectPointer) {
                this.getOutputSizeshNQ4ISI = null;
            } else {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.PressInteraction.Cancel cancel) {
        mutableInteractionSource.tryEmit(cancel);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    protected final java.lang.Object m1256handlePressInteractiond4ec7I(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
        return (mutableInteractionSource == null || (coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j, mutableInteractionSource, this, null), continuation)) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? kotlin.Unit.INSTANCE : coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRangesFor() {
        return androidx.compose.foundation.ClickableKt.hasScrollableContainer(this) || androidx.compose.foundation.Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes() {
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            androidx.compose.foundation.interaction.HoverInteraction.Enter enter = new androidx.compose.foundation.interaction.HoverInteraction.Enter();
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
            if (mutableInteractionSource != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3, null);
            }
            this.getOutputMinFrameDurationlomOqCM = enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap() {
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter = this.getOutputMinFrameDurationlomOqCM;
        if (enter != null) {
            androidx.compose.foundation.interaction.HoverInteraction.Exit exit = new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter);
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap;
            if (mutableInteractionSource != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3, null);
            }
            this.getOutputMinFrameDurationlomOqCM = null;
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$IndirectPointerClickDetector;", "", "Landroidx/compose/foundation/AbstractClickableNode;", "node", "<init>", "(Landroidx/compose/foundation/AbstractClickableNode;)V", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/Function0;", "", "onClick", "processRawEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function0;)V", "resetDetector", "()V", "Landroidx/compose/foundation/AbstractClickableNode;", "getNode", "()Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndirectPointerClickDetector {
        public static final int $stable = 8;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.compose.ui.input.indirect.IndirectPointerInputChange getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.compose.foundation.AbstractClickableNode node;

        public IndirectPointerClickDetector(androidx.compose.foundation.AbstractClickableNode abstractClickableNode) {
            this.node = abstractClickableNode;
        }

        public final androidx.compose.foundation.AbstractClickableNode getNode() {
            return this.node;
        }

        public final void processRawEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            boolean highSpeedVideoFpsRangesFor;
            boolean Camera2StreamConfigurationMap;
            boolean highResolutionOutputSizeshNQ4ISI;
            int i = 0;
            if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
                androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange = this.getHighResolutionOutputSizeshNQ4ISI;
                if (indirectPointerInputChange == null) {
                    java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.ClickableKt.getHighResolutionOutputSizeshNQ4ISI(changes.get(i2));
                        if (highResolutionOutputSizeshNQ4ISI) {
                            androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange2 = pointerEvent.getChanges().get(0);
                            this.getHighResolutionOutputSizeshNQ4ISI = indirectPointerInputChange2;
                            this.node.m1258handlePressInteractionStart3MmeM6k(indirectPointerInputChange2.getPosition(), true);
                            indirectPointerInputChange2.consume();
                            return;
                        }
                    }
                    return;
                }
                java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Camera2StreamConfigurationMap = androidx.compose.foundation.ClickableKt.Camera2StreamConfigurationMap(changes2.get(i3));
                    if (Camera2StreamConfigurationMap) {
                        if (java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerEvent.getChanges().get(0).getPosition(), indirectPointerInputChange.getPosition()))) > ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop()) {
                            resetDetector();
                            return;
                        }
                        return;
                    }
                }
                java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.ClickableKt.getHighSpeedVideoFpsRangesFor(changes3.get(i4));
                    if (!highSpeedVideoFpsRangesFor) {
                        java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes4 = pointerEvent.getChanges();
                        int size4 = changes4.size();
                        while (i < size4) {
                            if (changes4.get(i).getIsConsumed()) {
                                resetDetector();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                pointerEvent.getChanges().get(0).consume();
                this.node.m1257handlePressInteractionRelease3MmeM6k(indirectPointerInputChange.getPosition(), true);
                onClick.invoke();
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                return;
            }
            if (pass != androidx.compose.ui.input.pointer.PointerEventPass.Final || this.getHighResolutionOutputSizeshNQ4ISI == null) {
                return;
            }
            java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes5 = pointerEvent.getChanges();
            int size5 = changes5.size();
            while (i < size5) {
                androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange3 = changes5.get(i);
                if (indirectPointerInputChange3.getIsConsumed() && !kotlin.jvm.internal.Intrinsics.areEqual(indirectPointerInputChange3, this.getHighResolutionOutputSizeshNQ4ISI)) {
                    resetDetector();
                    return;
                }
                i++;
            }
        }

        public final void resetDetector() {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.node.handlePressInteractionCancel(true);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.AbstractClickableNode$TraverseKey, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AbstractClickableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, function0);
    }
}
