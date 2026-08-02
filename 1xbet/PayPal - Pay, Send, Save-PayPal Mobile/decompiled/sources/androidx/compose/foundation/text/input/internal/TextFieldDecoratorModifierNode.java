package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\fBs\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0015\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020!*\u00020%H\u0016¢\u0006\u0004\b&\u0010'Jy\u0010(\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00152\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0004\b(\u0010$J\u0013\u0010*\u001a\u00020!*\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020!2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020!H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00105\u001a\u00020!2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020!2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020!H\u0016¢\u0006\u0004\b@\u00101J\u0017\u0010E\u001a\u00020\u00152\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00152\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bF\u0010DJ\u000f\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bH\u00101J\u0017\u0010I\u001a\u00020!2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\bI\u00106J\u0017\u0010M\u001a\u00020!2\u0006\u0010J\u001a\u00020;H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020!2\u0006\u0010N\u001a\u00020\u0015H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010O\u001a\u00020!H\u0002¢\u0006\u0004\bO\u00101J\u000f\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020!H\u0002¢\u0006\u0004\bT\u00101J\u0017\u0010T\u001a\u00020\u00152\u0006\u0010N\u001a\u00020UH\u0002¢\u0006\u0004\bT\u0010VJ\u0017\u0010W\u001a\u00020\u00152\u0006\u0010N\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010VR\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010PR\"\u0010\u0017\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010l\u001a\u0004\bp\u0010n\"\u0004\bq\u0010PR\"\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\"\u0010\u001c\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010l\u001a\u0004\b|\u0010n\"\u0004\b}\u0010PR%\u0010\u001e\u001a\u00020\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0004\b\u001e\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R#\u0010\u001f\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0013\n\u0004\b\u001f\u0010l\u001a\u0004\b\u001f\u0010n\"\u0005\b\u0083\u0001\u0010PR/\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0005\b\"\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010T\u001a\u00030\u0089\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010O\u001a\u00030\u008c\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010W\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bO\u0010\u0090\u0001R\u0016\u0010R\u001a\u00030\u0091\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bR\u0010\u0092\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\u008d\u0001\u001a\u00020\u00158CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010nR\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009e\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010\u009f\u0001\u001a\u00030¡\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bW\u0010¢\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0098\u0001R!\u0010¦\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¤\u00010£\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010¥\u0001R.\u0010¨\u0001\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00158C@CX\u0083\u008e\u0002¢\u0006\u0014\n\u0005\bT\u0010§\u0001\u001a\u0005\b\u008a\u0001\u0010n\"\u0004\bT\u0010PR\u0016\u0010ª\u0001\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/InputTransformation;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "keyboardActionHandler", "singleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "isPassword", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "stylusHandwritingTrigger", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/MutableSharedFlow;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "updateNode", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "onPreKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPreKeyEvent", "onKeyEvent-ZmokQxo", "onKeyEvent", "onObservedReadsChanged", "onPlaced", io.ktor.http.ContentDisposition.Parameters.Size, "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "p0", "getHighSpeedVideoSizes", "(Z)V", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/input/ImeAction;", "(I)Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getTextLayoutState", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "Landroidx/compose/foundation/text/input/InputTransformation;", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "Z", "getEnabled", "()Z", "setEnabled", "getReadOnly", "setReadOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "setKeyboardOptions", "(Landroidx/compose/foundation/text/KeyboardOptions;)V", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "getSingleLine", "setSingleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "setPassword", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getStylusHandwritingTrigger", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setStylusHandwritingTrigger", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "Landroidx/compose/foundation/FocusableNode;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getInputFormats", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/platform/WindowInfo;", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/ui/platform/WindowInfo;", "Lkotlinx/coroutines/Job;", "getOutputSizes", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "getOutputFormats", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Lkotlin/jvm/functions/Function0;", "getOutputStallDuration", "Landroidx/compose/runtime/MutableState;", "getOutputStallDurationlomOqCM", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldDecoratorModifierNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.platform.PlatformTextInputModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.input.key.KeyInputModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.focus.FocusPropertiesModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getOutputStallDurationlomOqCM;
    private boolean enabled;
    private androidx.compose.foundation.text.input.InputTransformation filter;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.FocusableNode Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> getOutputMinFrameDuration;
    private final androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.HoverInteraction.Enter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.foundation.content.internal.ReceiveContentConfiguration> getOutputStallDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$keyboardActionScope$1 getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private androidx.compose.ui.platform.WindowInfo getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizesFor;
    private androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private boolean isPassword;
    private androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler;
    private androidx.compose.foundation.text.KeyboardOptions keyboardOptions;
    private boolean readOnly;
    private boolean singleLine;
    private kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> stylusHandwritingTrigger;
    private androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
    private androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState;
    private androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public TextFieldDecoratorModifierNode(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.InputTransformation inputTransformation, boolean z, boolean z2, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, boolean z3, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z4, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow) {
        androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode textFieldDragAndDropNode;
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z4;
        this.stylusHandwritingTrigger = mutableSharedFlow;
        textFieldSelectionState.setRequestAutofillAction(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$uh5sCAov0lL3i8l4H3CVQutNZdg(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this);
            }
        });
        this.Camera2StreamConfigurationMap = new androidx.compose.foundation.FocusableNode(this.interactionSource, 0, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$vK__K9CXcqyQ6dIK6IRImuiJPNI(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 2, null);
        this.getHighSpeedVideoSizes = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode getHighSpeedVideoFpsRanges;
                int getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.getHighSpeedVideoFpsRangesFor != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
                    final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState = this.getHighSpeedVideoFpsRanges.getTextFieldSelectionState();
                    final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.getHighSpeedVideoFpsRanges;
                    androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function0 function0 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: CONSTRUCTOR (r9v0 'function0' kotlin.jvm.functions.Function0) = 
                          (r7v0 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                          (r6v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] (LINE:246) call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 19 more
                        */
                    /*
                        this = this;
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r14.getHighSpeedVideoFpsRangesFor
                        if (r0 != 0) goto L5b
                        kotlin.ResultKt.throwOnFailure(r15)
                        java.lang.Object r15 = r14.Camera2StreamConfigurationMap
                        kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r0 = r14.getHighSpeedVideoFpsRanges
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r7 = r0.getTextFieldSelectionState()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r14.getHighSpeedVideoFpsRanges
                        androidx.compose.ui.input.pointer.PointerInputScope r8 = r14.getHighResolutionOutputSizeshNQ4ISI
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0 r9 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0
                        r9.<init>(r7, r6)
                        r1 = 0
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        r10 = 0
                        r0.<init>(r7, r8, r10)
                        r3 = r0
                        kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                        r4 = 1
                        r5 = 0
                        r0 = r15
                        kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                        r11 = 0
                        kotlinx.coroutines.CoroutineStart r12 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                        r13 = 0
                        r1 = r0
                        r2 = r6
                        r3 = r7
                        r4 = r8
                        r5 = r9
                        r6 = r13
                        r1.<init>(r2, r3, r4, r5, r6)
                        r3 = r0
                        kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                        r4 = 1
                        r5 = 0
                        r0 = r15
                        r1 = r11
                        r2 = r12
                        kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                        r1 = 0
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r0.<init>(r7, r8, r9, r10)
                        r3 = r0
                        kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                        r0 = r15
                        kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                        kotlin.Unit r15 = kotlin.Unit.INSTANCE
                        return r15
                    L5b:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
                    if (!textFieldSelectionState.getIsFocused()) {
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.access$requestFocus(textFieldDecoratorModifierNode);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                    anonymousClass1.Camera2StreamConfigurationMap = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighSpeedVideoFpsRanges = textFieldDecoratorModifierNode;
                    this.getHighResolutionOutputSizeshNQ4ISI = pointerInputScope;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, pointerInputScope, null), continuation);
                return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
            }
        }));
        textFieldDragAndDropNode = androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.m2243$r8$lambda$PD3i6qwR0d5FX2w4Bx5m3hvHs(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this);
            }
        }, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$7TCqtaLuHuTIgLfexShUDTAvnZw(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (androidx.compose.ui.platform.ClipEntry) obj, (androidx.compose.ui.platform.ClipMetadata) obj2));
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$vzkK_Eke3J_gk1jgbEo_0YXPSi0(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (androidx.compose.ui.draganddrop.DragAndDropEvent) obj);
            }
        }, (r21 & 8) != 0 ? null : null, (r21 & 16) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$DHlX_mFVl2kWUlX_4HGZ527SJXE(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (androidx.compose.ui.draganddrop.DragAndDropEvent) obj);
            }
        }, (r21 & 32) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.m2242$r8$lambda$KAUcZsv5SYSIJeg3bAfvh6WSr4(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (androidx.compose.ui.geometry.Offset) obj);
            }
        }, (r21 & 64) != 0 ? null : null, (r21 & 128) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$ckqeRE2MytIXJ71iuUBWu8veCr8(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (androidx.compose.ui.draganddrop.DragAndDropEvent) obj);
            }
        }, (r21 & 256) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$APA7HRCV2rHudDR4xEi875iDfw0(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (androidx.compose.ui.draganddrop.DragAndDropEvent) obj);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = (androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode) delegate(textFieldDragAndDropNode);
        this.getOutputFormats = androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.getInputSizeshNQ4ISI = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.getOutputMinFrameDuration = androidx.compose.foundation.text.input.internal.ClipboardKeyCommandsHandler.m2210constructorimpl(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.m2248$r8$lambda$zfVAL0IGNzqdji3esBlDAf0Y1Q(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (androidx.compose.foundation.text.KeyCommand) obj);
            }
        });
        this.getOutputStallDuration = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration;
                receiveContentConfiguration = androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this);
                return receiveContentConfiguration;
            }
        };
        this.getOutputStallDurationlomOqCM = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    public final androidx.compose.foundation.text.input.internal.TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final void setTextFieldState(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final androidx.compose.foundation.text.input.internal.TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void setTextLayoutState(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final void setTextFieldSelectionState(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final androidx.compose.foundation.text.input.InputTransformation getFilter() {
        return this.filter;
    }

    public final void setFilter(androidx.compose.foundation.text.input.InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final void setKeyboardOptions(androidx.compose.foundation.text.KeyboardOptions keyboardOptions) {
        this.keyboardOptions = keyboardOptions;
    }

    public final androidx.compose.foundation.text.input.KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final void setKeyboardActionHandler(androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public final androidx.compose.foundation.interaction.MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* renamed from: isPassword, reason: from getter */
    public final boolean getIsPassword() {
        return this.isPassword;
    }

    public final void setPassword(boolean z) {
        this.isPassword = z;
    }

    public final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    public final void setStylusHandwritingTrigger(kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow) {
        this.stylusHandwritingTrigger = mutableSharedFlow;
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.platform.WindowInfo windowInfo;
        return this.Camera2StreamConfigurationMap.getFocusState().isFocused() && (windowInfo = this.getHighResolutionOutputSizeshNQ4ISI) != null && windowInfo.isWindowFocused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(boolean z) {
        this.getOutputStallDurationlomOqCM.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return ((java.lang.Boolean) this.getOutputStallDurationlomOqCM.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this;
            androidx.compose.ui.graphics.drawscope.DrawScope.m6525drawRectAsUm42w$default(contentDrawScope2, androidx.compose.foundation.text.AutofillHighlightKt.m1980resolveAutofillHighlightWkMShQ((androidx.compose.ui.graphics.Brush) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, androidx.compose.foundation.text.AutofillHighlightKt.getLocalAutofillHighlightBrush()), ((androidx.compose.ui.graphics.Color) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, androidx.compose.foundation.text.AutofillHighlightKt.getLocalAutofillHighlightColor())).m6006unboximpl(), androidx.compose.foundation.text.AutofillHighlight_androidKt.autofillHighlightColor()), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
    }

    public final void updateNode(androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.InputTransformation filter, boolean enabled, boolean readOnly, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, boolean singleLine, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, boolean isPassword, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> stylusHandwritingTrigger) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState2;
        boolean z;
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.Job launch$default;
        boolean z2 = this.enabled;
        boolean z3 = z2 && !this.readOnly;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        androidx.compose.foundation.text.KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
        boolean z4 = this.isPassword;
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow = this.stylusHandwritingTrigger;
        if (!enabled || readOnly) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z = true;
        }
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = singleLine;
        this.interactionSource = interactionSource;
        this.isPassword = isPassword;
        this.stylusHandwritingTrigger = stylusHandwritingTrigger;
        if (z != z3 || !kotlin.jvm.internal.Intrinsics.areEqual(textFieldState, transformedTextFieldState) || !kotlin.jvm.internal.Intrinsics.areEqual(keyboardOptions, keyboardOptions2) || !kotlin.jvm.internal.Intrinsics.areEqual(stylusHandwritingTrigger, mutableSharedFlow)) {
            if (z && (getHighSpeedVideoFpsRanges() || this.getOutputSizes != null)) {
                getHighSpeedVideoSizes(false);
            } else if (!z) {
                getHighSpeedVideoSizes();
            }
        }
        if (enabled != z2 || z != z3 || !androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(keyboardOptions.m2067getImeActionOrDefaulteUduSuo$foundation(), keyboardOptions2.m2067getImeActionOrDefaulteUduSuo$foundation()) || isPassword != z4) {
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2)) {
            this.getHighSpeedVideoSizes.resetPointerInputHandler();
            if (getIsAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.getOutputStallDuration);
                if (getHighSpeedVideoFpsRanges() && (job = this.getHighSpeedVideoSizesFor) != null) {
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1(textFieldSelectionState, null), 3, null);
                    this.getHighSpeedVideoSizesFor = launch$default;
                }
            }
            textFieldSelectionState.setRequestAutofillAction(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$gRynzs_2rhi1MLFTZmXA89vdHPs(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this);
                }
            });
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(interactionSource, mutableInteractionSource)) {
            this.getHighSpeedVideoSizes.resetPointerInputHandler();
            if (this.Camera2StreamConfigurationMap.getIsAttached()) {
                this.Camera2StreamConfigurationMap.update(interactionSource);
            }
        }
        if (enabled != z2) {
            if (enabled) {
                delegate(this.Camera2StreamConfigurationMap);
                this.Camera2StreamConfigurationMap.update(interactionSource);
            } else {
                undelegate(this.Camera2StreamConfigurationMap);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.foundation.text.input.TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long selection = outputText.getSelection();
        int i = 2;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new androidx.compose.ui.text.AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, i, 0 == true ? 1 : 0));
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new androidx.compose.ui.text.AnnotatedString(outputText.toString(), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7816setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, selection);
        if (!this.enabled) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final boolean z = this.enabled && !this.readOnly;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType.INSTANCE.getText());
        androidx.compose.ui.autofill.FillableData createFromText = androidx.compose.ui.autofill.FillableData_androidKt.createFromText(androidx.compose.ui.autofill.FillableData.INSTANCE, outputText);
        if (createFromText != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromText);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.m2247$r8$lambda$wW_DchS7zQXPSG8I2BVSWm4c8(z, this, (androidx.compose.ui.autofill.FillableData) obj));
            }
        }, 1, null);
        int keyboardType = this.keyboardOptions.getKeyboardType();
        if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8267getEmailPjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.INSTANCE.getEmailAddress());
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8270getPasswordPjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.INSTANCE.getPassword());
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8269getNumberPasswordPjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.INSTANCE.getPassword());
        } else if (androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(keyboardType, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8271getPhonePjHm6EE())) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.INSTANCE.getPhoneNumber());
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.m2246$r8$lambda$wGf3rY_tcr4lVFrW6280iEELNg(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, (java.util.List) obj));
            }
        }, 1, null);
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.m2244$r8$lambda$_iOV_EmyCJxfhcW_hw_T55XuBE(z, this, (androidx.compose.ui.text.AnnotatedString) obj));
                }
            }, 1, null);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.m2241$r8$lambda$9a8WLu234ZWihEh72DCu45uhcs(z, this, (androidx.compose.ui.text.AnnotatedString) obj));
                }
            }, 1, null);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$MkRIsnu8U8EBcKzU_6LxFybaUK0(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), ((java.lang.Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        final int m2067getImeActionOrDefaulteUduSuo$foundation = this.keyboardOptions.m2067getImeActionOrDefaulteUduSuo$foundation();
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7812onImeAction9UiTYpY$default(semanticsPropertyReceiver, m2067getImeActionOrDefaulteUduSuo$foundation, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$wosEOlkZq8wLpYwSfI_3AwAcGH8(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, m2067getImeActionOrDefaulteUduSuo$foundation));
            }
        }, 2, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$fkay5bTFStZ5Z4wJ635X8VuLNCc(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this));
            }
        }, 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$Qwr7kgwdUXuPDoTK5wMzev8fa8Y(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this));
            }
        }, 1, null);
        if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(selection) && !this.isPassword) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$o7DiMaPdno2Dq_VLbDiZtZTWJ4U(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this));
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$xYTdN9QvjDwiLYksybmIxFHKlUw(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this));
                    }
                }, 1, null);
            }
        }
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$qoZyE3C0obwMsIzknYb_GNO4GlM(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this));
                }
            }, 1, null);
        }
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
        if (this.enabled) {
            this.Camera2StreamConfigurationMap.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(androidx.compose.ui.focus.FocusProperties focusProperties) {
        focusProperties.setFocusRect(this.textFieldSelectionState.getFocusRect());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.getOutputStallDuration);
        if (this.enabled) {
            delegate(this.Camera2StreamConfigurationMap);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        getHighSpeedVideoSizes();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(coordinates);
        if (this.enabled) {
            this.Camera2StreamConfigurationMap.onGloballyPositioned(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        this.getHighSpeedVideoSizes.mo1262onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.getHighSpeedVideoSizes.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo1263onPreKeyEventZmokQxo(android.view.KeyEvent event) {
        return this.getOutputFormats.mo2205onPreKeyEventMyFupTE(event, this.textFieldState, this.textFieldSelectionState, (androidx.compose.ui.focus.FocusManager) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager()), getHighSpeedVideoFpsRangesFor());
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public final boolean mo1261onKeyEventZmokQxo(android.view.KeyEvent event) {
        return this.getOutputFormats.mo2204onKeyEvent8zsqlwg(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.getOutputMinFrameDuration, getHighSpeedVideoFpsRangesFor(), this.enabled && !this.readOnly, this.singleLine, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = r0.Camera2StreamConfigurationMap(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this.keyboardOptions.m2067getImeActionOrDefaulteUduSuo$foundation());
                return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap);
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.getHighSpeedVideoFpsRangesFor.onPlaced(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo1407onRemeasuredozmzZPI(long size) {
        this.getHighSpeedVideoFpsRangesFor.mo1407onRemeasuredozmzZPI(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(boolean p0) {
        kotlinx.coroutines.Job launch$default;
        if (p0 || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation()) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1(this, androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
            this.getOutputSizes = launch$default;
        }
    }

    private final void getHighSpeedVideoSizes() {
        kotlinx.coroutines.Job job = this.getOutputSizes;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getOutputSizes = null;
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow = this.stylusHandwritingTrigger;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.resetReplayCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.SoftwareKeyboardController getHighSpeedVideoFpsRangesFor() {
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new java.lang.IllegalStateException("No software keyboard controller".toString());
    }

    private final void Camera2StreamConfigurationMap() {
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter = this.getHighSpeedVideoFpsRanges;
        if (enter != null) {
            this.interactionSource.tryEmit(new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter));
            this.getHighSpeedVideoFpsRanges = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Camera2StreamConfigurationMap(final int p0) {
        androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler;
        if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8217getNoneeUduSuo()) || androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            return getHighSpeedVideoFpsRanges(p0);
        }
        if (keyboardActionHandler == null) {
            return true;
        }
        keyboardActionHandler.onKeyboardAction(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.$r8$lambda$o65xbzIb3ZO3afMc90Hq7Xe1MKc(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this, p0);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges(int p0) {
        if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8216getNexteUduSuo())) {
            ((androidx.compose.ui.focus.FocusManager) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager())).mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s());
            return true;
        }
        if (androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8218getPreviouseUduSuo())) {
            ((androidx.compose.ui.focus.FocusManager) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager())).mo5659moveFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s());
            return true;
        }
        if (!androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(p0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo())) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor().hide();
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4iN0moU4_6VDLY2wI5EM3BgJHFQ(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        kotlinx.coroutines.Job launch$default;
        textFieldDecoratorModifierNode.getHighResolutionOutputSizeshNQ4ISI = (androidx.compose.ui.platform.WindowInfo) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo());
        textFieldDecoratorModifierNode.textFieldSelectionState.setFocused(textFieldDecoratorModifierNode.getHighSpeedVideoFpsRanges());
        if (textFieldDecoratorModifierNode.getHighSpeedVideoFpsRanges() && textFieldDecoratorModifierNode.getHighSpeedVideoSizesFor == null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onIsFocusedUpdated$1(textFieldDecoratorModifierNode, null), 3, null);
            textFieldDecoratorModifierNode.getHighSpeedVideoSizesFor = launch$default;
        } else if (!textFieldDecoratorModifierNode.getHighSpeedVideoFpsRanges()) {
            kotlinx.coroutines.Job job = textFieldDecoratorModifierNode.getHighSpeedVideoSizesFor;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            textFieldDecoratorModifierNode.getHighSpeedVideoSizesFor = null;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$7TCqtaLuHuTIgLfexShUDTAvnZw(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.platform.ClipEntry clipEntry, androidx.compose.ui.platform.ClipMetadata clipMetadata) {
        androidx.compose.ui.platform.ClipEntry clipEntry2;
        textFieldDecoratorModifierNode.Camera2StreamConfigurationMap();
        textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
        java.lang.String readPlainText = androidx.compose.foundation.content.TransferableContent_androidKt.readPlainText(clipEntry);
        androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration = androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null) {
            androidx.compose.foundation.content.TransferableContent onReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new androidx.compose.foundation.content.TransferableContent(clipEntry, clipMetadata, androidx.compose.foundation.content.TransferableContent.Source.INSTANCE.m1376getDragAndDropkB6V9T0(), null, 8, null));
            readPlainText = (onReceive == null || (clipEntry2 = onReceive.getClipEntry()) == null) ? null : androidx.compose.foundation.content.TransferableContent_androidKt.readPlainText(clipEntry2);
        }
        if (readPlainText == null) {
            return true;
        }
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode.textFieldState, readPlainText, false, null, false, 14, null);
        return true;
    }

    /* renamed from: $r8$lambda$9a8WLu234ZWihEh72DCu-45uhcs, reason: not valid java name */
    public static /* synthetic */ boolean m2241$r8$lambda$9a8WLu234ZWihEh72DCu45uhcs(boolean z, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.text.AnnotatedString annotatedString) {
        if (!z) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode.textFieldState, annotatedString, true, null, false, 12, null);
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$APA7HRCV2rHudDR4xEi875iDfw0(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        textFieldDecoratorModifierNode.Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DHlX_mFVl2kWUlX_4HGZ527SJXE(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        androidx.compose.foundation.content.ReceiveContentListener receiveContentListener;
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter = new androidx.compose.foundation.interaction.HoverInteraction.Enter();
        textFieldDecoratorModifierNode.interactionSource.tryEmit(enter);
        textFieldDecoratorModifierNode.getHighSpeedVideoFpsRanges = enter;
        androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration = androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null && (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) != null) {
            receiveContentListener.onDragEnter();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KAUcZsv5SYSIJeg3bAfvh-6WSr4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2242$r8$lambda$KAUcZsv5SYSIJeg3bAfvh6WSr4(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.geometry.Offset offset) {
        long m2266fromWindowToDecorationUv8p0NA = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2266fromWindowToDecorationUv8p0NA(textFieldDecoratorModifierNode.textLayoutState, offset.m5762unboximpl());
        int m2256getOffsetForPosition3MmeM6k$default = androidx.compose.foundation.text.input.internal.TextLayoutState.m2256getOffsetForPosition3MmeM6k$default(textFieldDecoratorModifierNode.textLayoutState, m2266fromWindowToDecorationUv8p0NA, false, 2, null);
        if (m2256getOffsetForPosition3MmeM6k$default >= 0) {
            textFieldDecoratorModifierNode.textFieldState.m2275selectCharsIn5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(m2256getOffsetForPosition3MmeM6k$default));
        }
        textFieldDecoratorModifierNode.textFieldSelectionState.m2309updateHandleDraggingUv8p0NA(androidx.compose.foundation.text.Handle.Cursor, m2266fromWindowToDecorationUv8p0NA);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$MkRIsnu8U8EBcKzU_6LxFybaUK0(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i, int i2, boolean z) {
        androidx.compose.foundation.text.input.TextFieldCharSequence visualText;
        if (z) {
            visualText = textFieldDecoratorModifierNode.textFieldState.getUntransformedText();
        } else {
            visualText = textFieldDecoratorModifierNode.textFieldState.getVisualText();
        }
        long selection = visualText.getSelection();
        if (!textFieldDecoratorModifierNode.enabled || java.lang.Math.min(i, i2) < 0 || java.lang.Math.max(i, i2) > visualText.length()) {
            return false;
        }
        if (i == androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) && i2 == androidx.compose.ui.text.TextRange.m8034getEndimpl(selection)) {
            return true;
        }
        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(i, i2);
        if (z || i == i2) {
            textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None);
        } else {
            textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection);
        }
        if (z) {
            textFieldDecoratorModifierNode.textFieldState.m2276selectUntransformedCharsIn5zctL8(TextRange);
        } else {
            textFieldDecoratorModifierNode.textFieldState.m2275selectCharsIn5zctL8(TextRange);
        }
        return true;
    }

    /* renamed from: $r8$lambda$PD3i6qwR0d-5FX2w4Bx5m-3hvHs, reason: not valid java name */
    public static /* synthetic */ java.util.Set m2243$r8$lambda$PD3i6qwR0d5FX2w4Bx5m3hvHs(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        java.util.Set set;
        java.util.Set set2;
        if (androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode) != null) {
            set2 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierKt.getHighSpeedVideoFpsRangesFor;
            return set2;
        }
        set = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierKt.getHighSpeedVideoFpsRanges;
        return set;
    }

    public static /* synthetic */ boolean $r8$lambda$Qwr7kgwdUXuPDoTK5wMzev8fa8Y(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (!textFieldDecoratorModifierNode.getHighSpeedVideoFpsRanges() && textFieldDecoratorModifierNode.Camera2StreamConfigurationMap.getIsAttached()) {
            textFieldDecoratorModifierNode.Camera2StreamConfigurationMap.requestFocus();
        }
        textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection);
        return true;
    }

    /* renamed from: $r8$lambda$_iOV_EmyCJxf-hcW_hw_T55XuBE, reason: not valid java name */
    public static /* synthetic */ boolean m2244$r8$lambda$_iOV_EmyCJxfhcW_hw_T55XuBE(boolean z, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.text.AnnotatedString annotatedString) {
        if (!z) {
            return false;
        }
        textFieldDecoratorModifierNode.textFieldState.replaceAll(annotatedString);
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ckqeRE2MytIXJ71iuUBWu8veCr8(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        androidx.compose.foundation.content.ReceiveContentListener receiveContentListener;
        textFieldDecoratorModifierNode.Camera2StreamConfigurationMap();
        textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
        androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration = androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null && (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) != null) {
            receiveContentListener.onDragExit();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$fkay5bTFStZ5Z4wJ635X8VuLNCc(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (textFieldDecoratorModifierNode.getHighSpeedVideoFpsRanges()) {
            if (textFieldDecoratorModifierNode.readOnly) {
                return true;
            }
            textFieldDecoratorModifierNode.getHighSpeedVideoFpsRangesFor().show();
            return true;
        }
        if (!textFieldDecoratorModifierNode.Camera2StreamConfigurationMap.getIsAttached()) {
            return true;
        }
        textFieldDecoratorModifierNode.Camera2StreamConfigurationMap.requestFocus();
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gRynzs_2rhi1MLFTZmXA89vdHPs(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requestAutofill(textFieldDecoratorModifierNode);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o65xbzIb3ZO3afMc90Hq7Xe1MKc(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        textFieldDecoratorModifierNode.getInputSizeshNQ4ISI.mo2055defaultKeyboardActionKlQnJC8(i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$o7DiMaPdno2Dq_VLbDiZtZTWJ4U(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1(textFieldDecoratorModifierNode, null), 3, null);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$qoZyE3C0obwMsIzknYb_GNO4GlM(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$12$1(textFieldDecoratorModifierNode, null), 3, null);
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uh5sCAov0lL3i8l4H3CVQutNZdg(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requestAutofill(textFieldDecoratorModifierNode);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vK__K9CXcqyQ6dIK6IRImuiJPNI(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, boolean z) {
        boolean z2 = textFieldDecoratorModifierNode.enabled && !textFieldDecoratorModifierNode.readOnly;
        if (!z) {
            textFieldDecoratorModifierNode.getHighSpeedVideoSizes();
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.textFieldState;
            androidx.compose.foundation.text.input.TextFieldState textFieldState = transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.foundation.text.input.InputTransformation inputTransformation = transformedTextFieldState.Camera2StreamConfigurationMap;
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
            androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
            mainBuffer.commitComposition$foundation();
            transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
            androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
            textFieldDecoratorModifierNode.textFieldState.collapseSelectionToMax();
        } else if (z2) {
            textFieldDecoratorModifierNode.getHighSpeedVideoSizes(false);
        }
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(textFieldDecoratorModifierNode, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda3(textFieldDecoratorModifierNode));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vzkK_Eke3J_gk1jgbEo_0YXPSi0(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        if (androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode) != null) {
            androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(textFieldDecoratorModifierNode, dragAndDropEvent);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wGf3rY_tcr-4lVFrW6280iEELNg, reason: not valid java name */
    public static /* synthetic */ boolean m2246$r8$lambda$wGf3rY_tcr4lVFrW6280iEELNg(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, java.util.List list) {
        androidx.compose.ui.text.TextLayoutResult layoutResult = textFieldDecoratorModifierNode.textLayoutState.getLayoutResult();
        if (layoutResult != null) {
            return list.add(layoutResult);
        }
        return false;
    }

    /* renamed from: $r8$lambda$wW_DchS7zQXP-SG8I2-BVSWm4c8, reason: not valid java name */
    public static /* synthetic */ boolean m2247$r8$lambda$wW_DchS7zQXPSG8I2BVSWm4c8(boolean z, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.ui.autofill.FillableData fillableData) {
        if (!z) {
            return false;
        }
        java.lang.CharSequence textValue = fillableData.getTextValue();
        if (textValue != null) {
            textFieldDecoratorModifierNode.textFieldState.replaceAll(textValue);
        }
        textFieldDecoratorModifierNode.Camera2StreamConfigurationMap(true);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, null), 3, null);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$wosEOlkZq8wLpYwSfI_3AwAcGH8(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        textFieldDecoratorModifierNode.Camera2StreamConfigurationMap(i);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$xYTdN9QvjDwiLYksybmIxFHKlUw(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1(textFieldDecoratorModifierNode, null), 3, null);
        return true;
    }

    /* renamed from: $r8$lambda$zfVAL0-IGNzqdji3esBlDAf0Y1Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2248$r8$lambda$zfVAL0IGNzqdji3esBlDAf0Y1Q(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.foundation.text.KeyCommand keyCommand) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1(keyCommand, textFieldDecoratorModifierNode, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$observeUntransformedTextChanges(final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.take(kotlinx.coroutines.flow.FlowKt.drop(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String obj;
                obj = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this.textFieldState.getUntransformedText().toString();
                return obj;
            }
        }), 1), 1).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this.Camera2StreamConfigurationMap(false);
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$requestFocus(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (textFieldDecoratorModifierNode.Camera2StreamConfigurationMap.getIsAttached()) {
            textFieldDecoratorModifierNode.Camera2StreamConfigurationMap.requestFocus();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda3(this));
    }
}
