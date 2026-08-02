package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\"\u0018\u00010\u0015H\u0000¢\u0006\u0004\b#\u0010$JL\u0010(\u001a\u00020\u000b2:\b\u0004\u0010'\u001a4\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b&\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b&\u0012\t\u0012\u00070\"¢\u0006\u0002\b&\u0012\t\u0012\u00070\u0019¢\u0006\u0002\b&\u0012\u0004\u0012\u00020\u00190%H\u0080\b¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0000¢\u0006\u0004\b*\u0010\rJ\u000f\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b+\u0010\rJ\u000f\u0010,\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010\u001bJ\u000f\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010\rJ\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\rJ\u0015\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0019¢\u0006\u0004\b4\u00105J\u001f\u0010/\u001a\u0002072\u0006\u00106\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b/\u00109J1\u0010@\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u0001072\u0006\u0010;\u001a\u0002072\u0006\u00102\u001a\u00020\u00192\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b>\u0010?J/\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u0002072\u0006\u00102\u001a\u00020\u00192\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0019H\u0000¢\u0006\u0004\bE\u0010\u001bJ\u0015\u0010H\u001a\u00020\u000b2\u0006\u0010A\u001a\u000207¢\u0006\u0004\bF\u0010GR\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR(\u0010R\u001a\u0004\u0018\u00010\u00132\b\u0010M\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00190K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010LR$\u0010T\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010\u001b\"\u0004\bU\u0010VRF\u0010Y\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0W2\u0014\u0010X\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0W8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010`\u001a\u0004\u0018\u00010_8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010W8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010Z\u001a\u0004\bg\u0010\\\"\u0004\bh\u0010^R$\u0010j\u001a\u0004\u0018\u00010i8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR(\u0010q\u001a\u00020p8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\bq\u0010r\u0012\u0004\bw\u0010\r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010y\u001a\u00020x8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R/\u0010\u0083\u0001\u001a\u00020\u00192\u0006\u0010\u007f\u001a\u00020\u00198G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010L\u001a\u0005\b\u0081\u0001\u0010\u001b\"\u0005\b\u0082\u0001\u0010VR\u0015\u0010\u0087\u0001\u001a\u00030\u0084\u00018G¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010.8CX\u0083\u0084\u0002¢\u0006\r\n\u0005\bS\u0010\u0088\u0001\u001a\u0004\bS\u00100R\u0015\u0010\u008b\u0001\u001a\u00030\u0084\u00018G¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0086\u0001R\u001a\u0010/\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R4\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010M\u001a\u0004\u0018\u00010\u000e8\u0007@GX\u0087\u000e¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010\u0010\"\u0006\b\u0091\u0001\u0010\u0092\u0001R/\u0010\u0095\u0001\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b8C@CX\u0083\u008e\u0002¢\u0006\u0015\n\u0004\b/\u0010L\u001a\u0006\b\u0089\u0001\u0010\u0093\u0001\"\u0005\b-\u0010\u0094\u0001R0\u0010\u009a\u0001\u001a\u0002072\u0006\u0010\u007f\u001a\u0002078A@CX\u0081\u008e\u0002¢\u0006\u0016\n\u0005\b\u0096\u0001\u0010L\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0005\b\u0099\u0001\u0010GR0\u0010\u009e\u0001\u001a\u0002072\u0006\u0010\u007f\u001a\u0002078A@CX\u0081\u008e\u0002¢\u0006\u0016\n\u0005\b\u009b\u0001\u0010L\u001a\u0006\b\u009c\u0001\u0010\u0098\u0001\"\u0005\b\u009d\u0001\u0010GR5\u0010¤\u0001\u001a\u0004\u0018\u0001072\b\u0010\u007f\u001a\u0004\u0018\u0001078G@CX\u0087\u008e\u0002¢\u0006\u0017\n\u0005\b\u009f\u0001\u0010L\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R5\u0010¨\u0001\u001a\u0004\u0018\u0001072\b\u0010\u007f\u001a\u0004\u0018\u0001078G@CX\u0087\u008e\u0002¢\u0006\u0017\n\u0005\b¥\u0001\u0010L\u001a\u0006\b¦\u0001\u0010¡\u0001\"\u0006\b§\u0001\u0010£\u0001R7\u0010¯\u0001\u001a\u0005\u0018\u00010©\u00012\t\u0010\u007f\u001a\u0005\u0018\u00010©\u00018G@CX\u0087\u008e\u0002¢\u0006\u0017\n\u0005\bª\u0001\u0010L\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u0015\u0010³\u0001\u001a\u00030°\u00018G¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0015\u0010µ\u0001\u001a\u00030°\u00018G¢\u0006\b\u001a\u0006\b´\u0001\u0010²\u0001R5\u0010¹\u0001\u001a\u0004\u0018\u0001072\b\u0010\u007f\u001a\u0004\u0018\u0001078G@CX\u0087\u008e\u0002¢\u0006\u0017\n\u0005\b¶\u0001\u0010L\u001a\u0006\b·\u0001\u0010¡\u0001\"\u0006\b¸\u0001\u0010£\u0001R3\u0010»\u0001\u001a\u0005\u0018\u00010º\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u001f\n\u0006\b»\u0001\u0010¼\u0001\u0012\u0005\bÁ\u0001\u0010\r\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010I\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010Â\u0001R,\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R,\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R/\u0010Ñ\u0001\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00198\u0001@AX\u0081\u000e¢\u0006\u0016\n\u0006\bÑ\u0001\u0010Â\u0001\u001a\u0005\bÒ\u0001\u0010\u001b\"\u0005\bÓ\u0001\u0010V"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "", "getHighSpeedVideoSizes", "()V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates$foundation", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "", "selectableId", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "Landroidx/collection/LongObjectMap;", "selectAllInSelectable$foundation", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "", "isEntireContainerSelected$foundation", "()Z", "selectAll$foundation", "isTriviallyCollapsedSelection$foundation", "isNonEmptySelection$foundation", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "getContextTextAndSelection$foundation", "()Lkotlin/Pair;", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "block", "forEachSelectableWithSelection$foundation", "(Lkotlin/jvm/functions/Function4;)V", "copy$foundation", "getHighSpeedVideoSizesFor", "canCopy$foundation", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/geometry/Rect;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/ui/geometry/Rect;", "onRelease", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "p0", "Landroidx/compose/ui/geometry/Offset;", "p1", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "newPosition", "previousPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "updateSelection-qNKwrvQ$foundation", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", com.daon.sdk.face.license.License.FEATURE_POSITION, "previousHandlePosition", "updateSelection-jyLRC_s$foundation", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "shouldPerformHaptics$foundation", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "(J)V", "selectWordAtPositionIfNotAlreadySelected", "getOutputMinFrameDuration", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "getHighSpeedVideoFpsRangesFor", "isInTouchMode", "setInTouchMode", "(Z)V", "Lkotlin/Function1;", "newOnSelectionChange", "onSelectionChange", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "onCopyHandler", "getOnCopyHandler", "setOnCopyHandler", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "toolbarRequester", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "getToolbarRequester$foundation", "()Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "setToolbarRequester$foundation", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;)V", "getToolbarRequester$foundation$annotations", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "hasFocus$delegate", "getHasFocus", "setHasFocus", "hasFocus", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/State;", "Camera2StreamConfigurationMap", "getContextMenuAreaModifier", "contextMenuAreaModifier", "getOutputFormats", "Landroidx/compose/ui/geometry/Offset;", "containerLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "()Lkotlin/Unit;", "(Lkotlin/Unit;)V", "getInputSizeshNQ4ISI", "dragBeginPosition$delegate", "getDragBeginPosition-F1C5BW0$foundation", "()J", "setDragBeginPosition-k-4lQ0M", "dragBeginPosition", "dragTotalDistance$delegate", "getDragTotalDistance-F1C5BW0$foundation", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance", "startHandlePosition$delegate", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "startHandlePosition", "endHandlePosition$delegate", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "", "getStartHandleLineHeight", "()F", "startHandleLineHeight", "getEndHandleLineHeight", "endHandleLineHeight", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "getPreviousSelectionLayout$foundation$annotations", "Z", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$foundation", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$foundation", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "platformSelectionBehaviors", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "getPlatformSelectionBehaviors$foundation", "()Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "setPlatformSelectionBehaviors$foundation", "(Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;)V", "showToolbar", "getShowToolbar$foundation", "setShowToolbar$foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;
    private androidx.compose.ui.layout.LayoutCoordinates containerLayoutCoordinates;
    private kotlinx.coroutines.CoroutineScope coroutineScope;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Offset getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.selection.SelectionRegistrarImpl getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, kotlin.Unit> onCopyHandler;
    private androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors;
    private androidx.compose.foundation.text.selection.SelectionLayout previousSelectionLayout;
    private boolean showToolbar;
    private androidx.compose.ui.platform.TextToolbar textToolbar;
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.text.selection.Selection> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
    private kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.Selection, kotlin.Unit> onSelectionChange = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$xOG9ZguvC1lBDLekxob3bgsgLac(androidx.compose.foundation.text.selection.SelectionManager.this, (androidx.compose.foundation.text.selection.Selection) obj);
        }
    };
    private androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester = new androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl();
    private androidx.compose.ui.focus.FocusRequester focusRequester = new androidx.compose.ui.focus.FocusRequester();

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState hasFocus = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.State Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.ui.geometry.Rect highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.SelectionManager.this.getHighSpeedVideoFpsRanges();
            return highSpeedVideoFpsRanges;
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getInputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(kotlin.Unit.INSTANCE, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());

    /* renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState dragBeginPosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()), null, 2, null);

    /* renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState dragTotalDistance = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()), null, 2, null);

    /* renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState startHandlePosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState endHandlePosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState draggingHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentDragPosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public static /* synthetic */ void getPreviousSelectionLayout$foundation$annotations() {
    }

    public static /* synthetic */ void getToolbarRequester$foundation$annotations() {
    }

    public SelectionManager(androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrarImpl) {
        this.getHighResolutionOutputSizeshNQ4ISI = selectionRegistrarImpl;
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$E_0HSgRgRDdl7OTVFmqFi0XwOAM(androidx.compose.foundation.text.selection.SelectionManager.this, ((java.lang.Long) obj).longValue());
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation(new kotlin.jvm.functions.Function4() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return androidx.compose.foundation.text.selection.SelectionManager.m2403$r8$lambda$5f2BeCrsmvP3ZGhSZHlQnu7jEc(androidx.compose.foundation.text.selection.SelectionManager.this, ((java.lang.Boolean) obj).booleanValue(), (androidx.compose.ui.layout.LayoutCoordinates) obj2, (androidx.compose.ui.geometry.Offset) obj3, (androidx.compose.foundation.text.selection.SelectionAdjustment) obj4);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.foundation.text.selection.SelectionManager.m2406$r8$lambda$a8wsMTgWHRSHwyUY5v51TfiVMU(androidx.compose.foundation.text.selection.SelectionManager.this, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Long) obj2).longValue());
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation(new kotlin.jvm.functions.Function6() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function6
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.text.selection.SelectionManager.m2405$r8$lambda$ZDQLZb9LJigT2BDB86SOk9UVew(androidx.compose.foundation.text.selection.SelectionManager.this, ((java.lang.Boolean) obj).booleanValue(), (androidx.compose.ui.layout.LayoutCoordinates) obj2, (androidx.compose.ui.geometry.Offset) obj3, (androidx.compose.ui.geometry.Offset) obj4, ((java.lang.Boolean) obj5).booleanValue(), (androidx.compose.foundation.text.selection.SelectionAdjustment) obj6));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.SelectionManager.m2404$r8$lambda$WWLHP3A8nr6wjFajrgdRrSF4E(androidx.compose.foundation.text.selection.SelectionManager.this);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$FPk4fbwLO4YoFCte0tZdHKz59eM(androidx.compose.foundation.text.selection.SelectionManager.this, ((java.lang.Long) obj).longValue());
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$UAuHUUGChDaxd8XveM5GxC3ntM4(androidx.compose.foundation.text.selection.SelectionManager.this, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public final androidx.compose.foundation.text.selection.Selection getSelection() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    public final void setSelection(androidx.compose.foundation.text.selection.Selection selection) {
        this.getHighSpeedVideoSizes.setValue(selection);
        if (selection != null) {
            getHighSpeedVideoSizes();
        }
    }

    public final boolean isInTouchMode() {
        return this.getHighSpeedVideoFpsRangesFor.getValue().booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor.getValue().booleanValue() != z) {
            this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(z));
            getHighSpeedVideoSizesFor();
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.Selection, kotlin.Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.Selection, kotlin.Unit> function1) {
        this.onSelectionChange = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$1hh5QF9_hq8yJ1kyk18_ajp60Ek(androidx.compose.foundation.text.selection.SelectionManager.this, function1, (androidx.compose.foundation.text.selection.Selection) obj);
            }
        };
    }

    public final androidx.compose.ui.hapticfeedback.HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.text.AnnotatedString, kotlin.Unit> getOnCopyHandler() {
        return this.onCopyHandler;
    }

    public final void setOnCopyHandler(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, kotlin.Unit> function1) {
        this.onCopyHandler = function1;
    }

    public final androidx.compose.ui.platform.TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(androidx.compose.ui.platform.TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    /* renamed from: getToolbarRequester$foundation, reason: from getter */
    public final androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester getToolbarRequester() {
        return this.toolbarRequester;
    }

    public final void setToolbarRequester$foundation(androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester) {
        this.toolbarRequester = toolbarRequester;
    }

    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((java.lang.Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(java.lang.Boolean.valueOf(z));
    }

    public final androidx.compose.ui.Modifier getModifier() {
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        final kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.SelectionManager.m2407$r8$lambda$cXYytaetjonqZVFL6caDeBFs7M(androidx.compose.foundation.text.selection.SelectionManager.this);
            }
        };
        androidx.compose.ui.Modifier then = androidx.compose.ui.input.key.KeyInputModifierKt.onKeyEvent(androidx.compose.foundation.text.selection.SelectionGesturesKt.updateSelectionTouchMode(androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion, kotlin.Unit.INSTANCE, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", i = {0}, l = {994, 1000}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"}, v = 1)
            /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
                final /* synthetic */ androidx.compose.foundation.text.selection.SelectionManager getHighSpeedVideoFpsRanges;
                int getHighSpeedVideoFpsRangesFor;
                private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
                
                    if (r11 == r0) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
                
                    if (r11 != r0) goto L12;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighSpeedVideoFpsRangesFor;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoSizes = awaitPointerEventScope;
                        this.getHighSpeedVideoFpsRangesFor = 1;
                        obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (!((java.lang.Boolean) obj).booleanValue() && !androidx.compose.foundation.text.selection.SelectionManager.access$isDraggingInProgress(this.getHighSpeedVideoFpsRanges)) {
                                this.Camera2StreamConfigurationMap.invoke();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                    obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, (androidx.compose.ui.input.pointer.PointerInputChange) obj, androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
                    anonymousClass1.getHighSpeedVideoSizes = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.foundation.text.selection.SelectionManager selectionManager, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighSpeedVideoFpsRanges = selectionManager;
                    this.Camera2StreamConfigurationMap = function0;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.AnonymousClass1(androidx.compose.foundation.text.selection.SelectionManager.this, function0, null), continuation);
                return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
            }
        }), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$LSfnV0vw1F0FZ_13R6FfszpV1d0(androidx.compose.foundation.text.selection.SelectionManager.this, (androidx.compose.ui.layout.LayoutCoordinates) obj);
            }
        }), this.focusRequester), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$ya2iFtGGV3aCI2yBc05zMZmEqCk(androidx.compose.foundation.text.selection.SelectionManager.this, (androidx.compose.ui.focus.FocusState) obj);
            }
        }), false, null, 3, null), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$zLeWcKaMmRWRj32IAD3cZeEgMgU(androidx.compose.foundation.text.selection.SelectionManager.this, ((java.lang.Boolean) obj).booleanValue());
            }
        }), new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                boolean z;
                if (androidx.compose.foundation.text.selection.SelectionManager_androidKt.m2429isCopyKeyEventZmokQxo(keyEvent.m7078unboximpl())) {
                    androidx.compose.foundation.text.selection.SelectionManager.this.copy$foundation();
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).then((getDraggingHandle() == null || !isInTouchMode() || isTriviallyCollapsedSelection$foundation()) ? androidx.compose.ui.Modifier.INSTANCE : androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier(androidx.compose.ui.Modifier.INSTANCE, this));
        return androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled ? androidx.compose.foundation.text.selection.SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents(then, this) : then;
    }

    private final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor() {
        return (androidx.compose.ui.geometry.Rect) this.Camera2StreamConfigurationMap.getValue();
    }

    public final androidx.compose.ui.Modifier getContextMenuAreaModifier() {
        return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt.textContextMenuToolbarHandler$default(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(androidx.compose.ui.Modifier.INSTANCE, new androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2(this, null), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManager.$r8$lambda$HfsDaoxQYROn8cgaTeCYnXFj2kc(androidx.compose.foundation.text.selection.SelectionManager.this, (androidx.compose.ui.layout.LayoutCoordinates) obj);
            }
        }, 4, null);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        androidx.compose.ui.geometry.Offset m5741boximpl = layoutCoordinates != null ? androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, m5741boximpl)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = m5741boximpl;
        getHighSpeedVideoSizes();
        getHighSpeedVideoSizesFor();
    }

    private final kotlin.Unit Camera2StreamConfigurationMap() {
        this.getInputSizeshNQ4ISI.getValue();
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(kotlin.Unit unit) {
        this.getInputSizeshNQ4ISI.setValue(unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m2412setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation, reason: not valid java name */
    public final long m2417getDragBeginPositionF1C5BW0$foundation() {
        return ((androidx.compose.ui.geometry.Offset) this.dragBeginPosition.getValue()).m5762unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m2413setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation, reason: not valid java name */
    public final long m2418getDragTotalDistanceF1C5BW0$foundation() {
        return ((androidx.compose.ui.geometry.Offset) this.dragTotalDistance.getValue()).m5762unboximpl();
    }

    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m2415setStartHandlePosition_kEHs6E(androidx.compose.ui.geometry.Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final androidx.compose.ui.geometry.Offset m2420getStartHandlePosition_m7T9E() {
        return (androidx.compose.ui.geometry.Offset) this.startHandlePosition.getValue();
    }

    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    private final void m2414setEndHandlePosition_kEHs6E(androidx.compose.ui.geometry.Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final androidx.compose.ui.geometry.Offset m2419getEndHandlePosition_m7T9E() {
        return (androidx.compose.ui.geometry.Offset) this.endHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(androidx.compose.foundation.text.Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.Handle getDraggingHandle() {
        return (androidx.compose.foundation.text.Handle) this.draggingHandle.getValue();
    }

    public final float getStartHandleLineHeight() {
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation;
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getStart())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getStart().getOffset());
    }

    public final float getEndHandleLineHeight() {
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation;
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation = getAnchorSelectable$foundation(selection.getEnd())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m2411setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final androidx.compose.ui.geometry.Offset m2416getCurrentDragPosition_m7T9E() {
        return (androidx.compose.ui.geometry.Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getPreviousSelectionLayout$foundation, reason: from getter */
    public final androidx.compose.foundation.text.selection.SelectionLayout getPreviousSelectionLayout() {
        return this.previousSelectionLayout;
    }

    public final void setPreviousSelectionLayout$foundation(androidx.compose.foundation.text.selection.SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    /* renamed from: getCoroutineScope$foundation, reason: from getter */
    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void setCoroutineScope$foundation(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
    }

    /* renamed from: getPlatformSelectionBehaviors$foundation, reason: from getter */
    public final androidx.compose.foundation.text.selection.PlatformSelectionBehaviors getPlatformSelectionBehaviors() {
        return this.platformSelectionBehaviors;
    }

    public final void setPlatformSelectionBehaviors$foundation(androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    public final androidx.compose.foundation.text.selection.Selectable getAnchorSelectable$foundation(androidx.compose.foundation.text.selection.Selection.AnchorInfo anchor) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSelectableMap$foundation().get(anchor.getSelectableId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(r8, r13) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoSizes() {
        androidx.compose.ui.geometry.Offset offset;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        androidx.compose.ui.geometry.Offset offset2 = null;
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation(start);
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation(end);
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation != null ? anchorSelectable$foundation.getLayoutCoordinates() : null;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation2 != null ? anchorSelectable$foundation2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || (layoutCoordinates2 == null && layoutCoordinates3 == null)) {
            m2415setStartHandlePosition_kEHs6E(null);
            m2414setEndHandlePosition_kEHs6E(null);
            return;
        }
        androidx.compose.ui.geometry.Rect visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates);
        if (layoutCoordinates2 != null) {
            long mo2374getHandlePositiondBAh8RU = anchorSelectable$foundation.mo2374getHandlePositiondBAh8RU(selection, true);
            if ((mo2374getHandlePositiondBAh8RU & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                offset = androidx.compose.ui.geometry.Offset.m5741boximpl(layoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates2, mo2374getHandlePositiondBAh8RU));
                long m5762unboximpl = offset.m5762unboximpl();
                if (getDraggingHandle() != androidx.compose.foundation.text.Handle.SelectionStart) {
                }
                m2415setStartHandlePosition_kEHs6E(offset);
                if (layoutCoordinates3 != null) {
                    long mo2374getHandlePositiondBAh8RU2 = anchorSelectable$foundation2.mo2374getHandlePositiondBAh8RU(selection, false);
                    if ((9223372034707292159L & mo2374getHandlePositiondBAh8RU2) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(layoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates3, mo2374getHandlePositiondBAh8RU2));
                        long m5762unboximpl2 = m5741boximpl.m5762unboximpl();
                        if (getDraggingHandle() == androidx.compose.foundation.text.Handle.SelectionEnd || androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(visibleBounds, m5762unboximpl2)) {
                            offset2 = m5741boximpl;
                        }
                    }
                }
                m2414setEndHandlePosition_kEHs6E(offset2);
            }
        }
        offset = null;
        m2415setStartHandlePosition_kEHs6E(offset);
        if (layoutCoordinates3 != null) {
        }
        m2414setEndHandlePosition_kEHs6E(offset2);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates requireContainerCoordinates$foundation() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
            }
            return layoutCoordinates;
        }
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
        throw new kotlin.KotlinNothingValueException();
    }

    public final kotlin.Pair<androidx.compose.foundation.text.selection.Selection, androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selection>> selectAllInSelectable$foundation(long selectableId, androidx.compose.foundation.text.selection.Selection previousSelection) {
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        androidx.collection.MutableLongObjectMap mutableLongObjectMapOf = androidx.collection.LongObjectMapKt.mutableLongObjectMapOf();
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
        int size = sort.size();
        androidx.compose.foundation.text.selection.Selection selection = null;
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i);
            androidx.compose.foundation.text.selection.Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selection = androidx.compose.foundation.text.selection.SelectionManagerKt.merge(selection, selectAllSelection);
        }
        if (isInTouchMode() && !kotlin.jvm.internal.Intrinsics.areEqual(selection, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
        }
        return new kotlin.Pair<>(selection, mutableLongObjectMapOf);
    }

    public final boolean isEntireContainerSelected$foundation() {
        androidx.compose.foundation.text.selection.Selection selection;
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
        if (sort.isEmpty()) {
            return true;
        }
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i);
            androidx.compose.ui.text.AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(selectable.getSelectableId())) == null || java.lang.Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final void selectAll$foundation() {
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
        if (sort.isEmpty()) {
            return;
        }
        androidx.collection.MutableLongObjectMap mutableLongObjectMapOf = androidx.collection.LongObjectMapKt.mutableLongObjectMapOf();
        int size = sort.size();
        androidx.compose.foundation.text.selection.Selection selection = null;
        androidx.compose.foundation.text.selection.Selection selection2 = null;
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i);
            androidx.compose.foundation.text.selection.Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(selection);
            androidx.compose.foundation.text.selection.Selection.AnchorInfo start = selection.getStart();
            kotlin.jvm.internal.Intrinsics.checkNotNull(selection2);
            selection = new androidx.compose.foundation.text.selection.Selection(start, selection2.getEnd(), false);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setSubselections(mutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final boolean isTriviallyCollapsedSelection$foundation() {
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(selection.getStart(), selection.getEnd());
    }

    public final boolean isNonEmptySelection$foundation() {
        androidx.compose.foundation.text.selection.Selection selection = getSelection();
        if (selection == null || kotlin.jvm.internal.Intrinsics.areEqual(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selection selection2 = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(sort.get(i).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final androidx.compose.ui.text.AnnotatedString getSelectedText$foundation() {
        int i;
        if (getSelection() == null || this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().isEmpty()) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
        java.util.ListIterator<androidx.compose.foundation.text.selection.Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            androidx.compose.foundation.text.selection.Selection selection = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            int i2 = 0;
            while (i2 < size) {
                androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i2);
                androidx.compose.foundation.text.selection.Selection selection2 = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(selectable.getSelectableId());
                if (selection2 != null) {
                    androidx.compose.ui.text.AnnotatedString text = selectable.getText();
                    long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                    boolean z = i2 >= i;
                    selectable.getSelectableId();
                    builder.append(text, androidx.compose.ui.text.TextRange.m8037getMinimpl(TextRange), androidx.compose.ui.text.TextRange.m8036getMaximpl(TextRange));
                    if (!z) {
                        builder.append('\n');
                    }
                }
                i2++;
            }
        }
        return builder.toAnnotatedString();
    }

    public final kotlin.Pair<androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextRange> getContextTextAndSelection$foundation() {
        int i;
        int i2;
        int i3;
        if (getSelection() != null && !this.getHighResolutionOutputSizeshNQ4ISI.getSelectables$foundation().isEmpty()) {
            int i4 = 0;
            androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
            java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
            java.util.ListIterator<androidx.compose.foundation.text.selection.Selectable> listIterator = sort.listIterator(sort.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                androidx.compose.foundation.text.selection.Selection selection = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(listIterator.previous().getSelectableId());
                if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i != -1) {
                int size = sort.size();
                int i5 = 0;
                i2 = -1;
                i3 = -1;
                while (i5 < size) {
                    androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i5);
                    androidx.compose.foundation.text.selection.Selection selection2 = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(selectable.getSelectableId());
                    if (selection2 != null) {
                        androidx.compose.ui.text.AnnotatedString text = selectable.getText();
                        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                        int i6 = i5 >= i ? 1 : i4;
                        selectable.getSelectableId();
                        if (i2 == -1) {
                            i2 = androidx.compose.ui.text.TextRange.m8037getMinimpl(TextRange);
                            builder.append(text, i4, androidx.compose.ui.text.TextRange.m8037getMinimpl(TextRange));
                        }
                        builder.append(text, androidx.compose.ui.text.TextRange.m8037getMinimpl(TextRange), androidx.compose.ui.text.TextRange.m8036getMaximpl(TextRange));
                        if (i6 == 0) {
                            builder.append('\n');
                        } else {
                            i3 = builder.getLength();
                            builder.append(text, androidx.compose.ui.text.TextRange.m8036getMaximpl(TextRange), text.length());
                        }
                    }
                    i5++;
                    i4 = 0;
                }
            } else {
                i2 = -1;
                i3 = -1;
            }
            androidx.compose.ui.text.AnnotatedString annotatedString = builder.toAnnotatedString();
            if (i2 == -1 || i3 == -1) {
                return null;
            }
            return new kotlin.Pair<>(annotatedString, androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(i2, i3)));
        }
        return null;
    }

    public final void forEachSelectableWithSelection$foundation(kotlin.jvm.functions.Function4<? super java.lang.Long, ? super androidx.compose.ui.text.AnnotatedString, ? super androidx.compose.ui.text.TextRange, ? super java.lang.Boolean, java.lang.Boolean> block) {
        int i;
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
        java.util.ListIterator<androidx.compose.foundation.text.selection.Selectable> listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            androidx.compose.foundation.text.selection.Selection selection = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(listIterator.previous().getSelectableId());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            int i2 = 0;
            while (i2 < size) {
                androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i2);
                androidx.compose.foundation.text.selection.Selection selection2 = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(selectable.getSelectableId());
                if (selection2 != null) {
                    if (!block.invoke(java.lang.Long.valueOf(selectable.getSelectableId()), selectable.getText(), androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset())), java.lang.Boolean.valueOf(i2 >= i)).booleanValue()) {
                        return;
                    }
                }
                i2++;
            }
        }
    }

    public final void copy$foundation() {
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, kotlin.Unit> function1;
        androidx.compose.ui.text.AnnotatedString selectedText$foundation = getSelectedText$foundation();
        if (selectedText$foundation != null) {
            if (selectedText$foundation.length() <= 0) {
                selectedText$foundation = null;
            }
            if (selectedText$foundation == null || (function1 = this.onCopyHandler) == null) {
                return;
            }
            function1.invoke(selectedText$foundation);
        }
    }

    /* renamed from: getShowToolbar$foundation, reason: from getter */
    public final boolean getShowToolbar() {
        return this.showToolbar;
    }

    public final void setShowToolbar$foundation(boolean z) {
        this.showToolbar = z;
        getHighSpeedVideoSizesFor();
    }

    private final void getHighSpeedVideoSizesFor() {
        if (getHasFocus()) {
            if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                if (this.showToolbar && isInTouchMode()) {
                    if (getHighSpeedVideoFpsRangesFor() == null) {
                        return;
                    }
                    this.toolbarRequester.show();
                    return;
                }
                this.toolbarRequester.hide();
                return;
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public final boolean canCopy$foundation() {
        return this.onCopyHandler != null && isNonEmptySelection$foundation();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.platform.TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) {
            if (this.showToolbar && isInTouchMode()) {
                androidx.compose.ui.geometry.Rect highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges != null) {
                    androidx.compose.ui.platform.TextToolbar.showMenu$default(textToolbar, highSpeedVideoFpsRanges, canCopy$foundation() ? new androidx.compose.foundation.text.selection.SelectionManager$updateSelectionTextToolbar$1(this) : null, null, null, isEntireContainerSelected$foundation() ? null : new androidx.compose.foundation.text.selection.SelectionManager$updateSelectionTextToolbar$2(this), null, 12, null);
                    return;
                }
                return;
            }
            if (textToolbar.getStatus() == androidx.compose.ui.platform.TextToolbarStatus.Shown) {
                textToolbar.hide();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.geometry.Rect rect;
        Camera2StreamConfigurationMap();
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation());
        java.util.ArrayList arrayList = new java.util.ArrayList(sort.size());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i);
            androidx.compose.foundation.text.selection.Selection selection = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(selectable.getSelectableId());
            kotlin.Pair pair = selection != null ? kotlin.TuplesKt.to(selectable, selection) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        java.util.List access$firstAndLast = androidx.compose.foundation.text.selection.SelectionManagerKt.access$firstAndLast(arrayList);
        if (access$firstAndLast.isEmpty()) {
            return null;
        }
        androidx.compose.ui.geometry.Rect selectedRegionRect = androidx.compose.foundation.text.selection.SelectionManagerKt.getSelectedRegionRect(access$firstAndLast, layoutCoordinates);
        rect = androidx.compose.foundation.text.selection.SelectionManagerKt.getHighSpeedVideoFpsRangesFor;
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectedRegionRect, rect)) {
            return null;
        }
        androidx.compose.ui.geometry.Rect intersect = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (intersect.getRight() - intersect.getLeft() < 0.0f || intersect.getBottom() - intersect.getTop() < 0.0f) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m5789translatek4lQ0M = intersect.m5789translatek4lQ0M(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return androidx.compose.ui.geometry.Rect.copy$default(m5789translatek4lQ0M, 0.0f, 0.0f, 0.0f, m5789translatek4lQ0M.getBottom() + (androidx.compose.foundation.text.selection.SelectionHandlesKt.getHandleHeight() * 4.0f), 7, null);
    }

    public final void onRelease() {
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        this.getHighResolutionOutputSizeshNQ4ISI.setSubselections(androidx.collection.LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
        }
    }

    public final androidx.compose.foundation.text.TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new androidx.compose.foundation.text.TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public final void mo2103onDownk4lQ0M(long point) {
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
                androidx.compose.ui.geometry.Offset m2420getStartHandlePosition_m7T9E = isStartHandle ? this.m2420getStartHandlePosition_m7T9E() : this.m2419getEndHandlePosition_m7T9E();
                if (m2420getStartHandlePosition_m7T9E != null) {
                    m2420getStartHandlePosition_m7T9E.m5762unboximpl();
                    androidx.compose.foundation.text.selection.Selection selection = this.getSelection();
                    if (selection != null) {
                        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation = this.getAnchorSelectable$foundation(isStartHandle ? selection.getStart() : selection.getEnd());
                        if (anchorSelectable$foundation == null || (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) == null) {
                            return;
                        }
                        long mo2374getHandlePositiondBAh8RU = anchorSelectable$foundation.mo2374getHandlePositiondBAh8RU(selection, isStartHandle);
                        if ((9223372034707292159L & mo2374getHandlePositiondBAh8RU) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            return;
                        }
                        long m2398getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m2398getAdjustedCoordinatesk4lQ0M(mo2374getHandlePositiondBAh8RU);
                        androidx.compose.foundation.text.selection.SelectionManager selectionManager = this;
                        selectionManager.m2411setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(selectionManager.requireContainerCoordinates$foundation().mo7362localPositionOfR5De75A(layoutCoordinates, m2398getAdjustedCoordinatesk4lQ0M)));
                        this.setDraggingHandle(isStartHandle ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd);
                        this.setShowToolbar$foundation(false);
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public final void mo2105onStart3MmeM6k(long startPoint, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                androidx.compose.foundation.text.selection.Selection selection = this.getSelection();
                kotlin.jvm.internal.Intrinsics.checkNotNull(selection);
                androidx.compose.foundation.text.selection.Selectable selectable = this.getHighResolutionOutputSizeshNQ4ISI.getSelectableMap$foundation().get((isStartHandle ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable != null) {
                    androidx.compose.foundation.text.selection.Selectable selectable2 = selectable;
                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        long mo2374getHandlePositiondBAh8RU = selectable2.mo2374getHandlePositiondBAh8RU(selection, isStartHandle);
                        if ((9223372034707292159L & mo2374getHandlePositiondBAh8RU) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            return;
                        }
                        long m2398getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m2398getAdjustedCoordinatesk4lQ0M(mo2374getHandlePositiondBAh8RU);
                        androidx.compose.foundation.text.selection.SelectionManager selectionManager = this;
                        selectionManager.m2412setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation().mo7362localPositionOfR5De75A(layoutCoordinates, m2398getAdjustedCoordinatesk4lQ0M));
                        this.m2413setDragTotalDistancek4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                        return;
                    }
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                    throw new kotlin.KotlinNothingValueException();
                }
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                throw new kotlin.KotlinNothingValueException();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public final void mo2104onDragk4lQ0M(long delta) {
                if (this.getDraggingHandle() != null) {
                    androidx.compose.foundation.text.selection.SelectionManager selectionManager = this;
                    selectionManager.m2413setDragTotalDistancek4lQ0M(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(selectionManager.m2418getDragTotalDistanceF1C5BW0$foundation(), delta));
                    long m5757plusMKHz9U = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.m2417getDragBeginPositionF1C5BW0$foundation(), this.m2418getDragTotalDistanceF1C5BW0$foundation());
                    if (this.m2423updateSelectionqNKwrvQ$foundation(androidx.compose.ui.geometry.Offset.m5741boximpl(m5757plusMKHz9U), this.m2417getDragBeginPositionF1C5BW0$foundation(), isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                        this.m2412setDragBeginPositionk4lQ0M(m5757plusMKHz9U);
                        this.m2413setDragTotalDistancek4lQ0M(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                this.setShowToolbar$foundation(true);
                this.setDraggingHandle(null);
                this.m2411setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                this.setShowToolbar$foundation(true);
                this.setDraggingHandle(null);
                this.m2411setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
                this.setShowToolbar$foundation(true);
                this.setDraggingHandle(null);
                this.m2411setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    private final long getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.LayoutCoordinates p0, long p1) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        return requireContainerCoordinates$foundation().mo7362localPositionOfR5De75A(p0, p1);
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation, reason: not valid java name */
    public final boolean m2423updateSelectionqNKwrvQ$foundation(androidx.compose.ui.geometry.Offset newPosition, long previousPosition, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
        if (newPosition == null) {
            return false;
        }
        return m2422updateSelectionjyLRC_s$foundation(newPosition.m5762unboximpl(), previousPosition, isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-jyLRC_s$foundation, reason: not valid java name */
    public final boolean m2422updateSelectionjyLRC_s$foundation(long position, long previousHandlePosition, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        setDraggingHandle(isStartHandle ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd);
        m2411setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(position));
        androidx.compose.ui.layout.LayoutCoordinates requireContainerCoordinates$foundation = requireContainerCoordinates$foundation();
        java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = this.getHighResolutionOutputSizeshNQ4ISI.sort(requireContainerCoordinates$foundation);
        final androidx.collection.MutableLongIntMap mutableLongIntMapOf = androidx.collection.LongIntMapKt.mutableLongIntMapOf();
        java.util.List<androidx.compose.foundation.text.selection.Selectable> list = sort;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mutableLongIntMapOf.set(sort.get(i).getSelectableId(), i);
        }
        androidx.compose.foundation.text.selection.SelectionLayoutBuilder selectionLayoutBuilder = new androidx.compose.foundation.text.selection.SelectionLayoutBuilder(position, previousHandlePosition, requireContainerCoordinates$foundation, isStartHandle, (previousHandlePosition & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? null : getSelection(), new java.util.Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(androidx.collection.MutableLongIntMap.this.get(((java.lang.Number) t).longValue())), java.lang.Integer.valueOf(androidx.collection.MutableLongIntMap.this.get(((java.lang.Number) t2).longValue())));
            }
        }, null);
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sort.get(i2).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        androidx.compose.foundation.text.selection.SelectionLayout build = selectionLayoutBuilder.build();
        if (build == null || !build.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        androidx.compose.foundation.text.selection.Selection adjust = adjustment.adjust(build);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(adjust, getSelection())) {
            if (shouldPerformHaptics$foundation() && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setSubselections(build.createSubSelections(adjust));
            this.onSelectionChange.invoke(adjust);
            this.getOutputMinFrameDuration = false;
        }
        this.previousSelectionLayout = build;
        return true;
    }

    public final boolean shouldPerformHaptics$foundation() {
        if (isInTouchMode()) {
            java.util.List<androidx.compose.foundation.text.selection.Selectable> selectables$foundation = this.getHighResolutionOutputSizeshNQ4ISI.getSelectables$foundation();
            int size = selectables$foundation.size();
            for (int i = 0; i < size; i++) {
                if (selectables$foundation.get(i).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m2421selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long position) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return;
        }
        java.util.List<androidx.compose.foundation.text.selection.Selectable> selectables$foundation = this.getHighResolutionOutputSizeshNQ4ISI.getSelectables$foundation();
        int size = selectables$foundation.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.selection.Selectable selectable = selectables$foundation.get(i);
            androidx.compose.foundation.text.selection.Selection selection = this.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(selectable.getSelectableId());
            if (selection != null && (layoutCoordinates = selectable.getLayoutCoordinates()) != null) {
                long mo7362localPositionOfR5De75A = layoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates2, position);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = selectable.textLayoutResult();
                if (textLayoutResult != null && androidx.compose.foundation.text.TextLayoutHelperKt.m2134isPositionInsideSelectionuaM50fQ(textLayoutResult, mo7362localPositionOfR5De75A, androidx.compose.ui.text.TextRange.m8027boximpl(selection.m2388toTextRanged9O1mEE()))) {
                    return;
                }
            }
        }
        androidx.compose.foundation.text.selection.SelectionAdjustment word = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord();
        this.previousSelectionLayout = null;
        m2422updateSelectionjyLRC_s$foundation(position, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0(), true, word);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1hh5QF9_hq8yJ1kyk18_ajp60Ek(androidx.compose.foundation.text.selection.SelectionManager selectionManager, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.text.selection.Selection selection) {
        selectionManager.setSelection(selection);
        function1.invoke(selection);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5f2BeCr-smvP3ZGhSZHlQnu7jEc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2403$r8$lambda$5f2BeCrsmvP3ZGhSZHlQnu7jEc(androidx.compose.foundation.text.selection.SelectionManager selectionManager, boolean z, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Offset offset, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
        long m2263coerceIn3MmeM6k;
        long mo7361getSizeYbymL2g = layoutCoordinates.mo7361getSizeYbymL2g();
        androidx.compose.ui.geometry.Rect rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, (int) (mo7361getSizeYbymL2g >> 32), (int) (mo7361getSizeYbymL2g & 4294967295L));
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(rect, offset.m5762unboximpl())) {
            m2263coerceIn3MmeM6k = offset.m5762unboximpl();
        } else {
            m2263coerceIn3MmeM6k = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2263coerceIn3MmeM6k(offset.m5762unboximpl(), rect);
        }
        long highSpeedVideoFpsRanges = selectionManager.getHighSpeedVideoFpsRanges(layoutCoordinates, m2263coerceIn3MmeM6k);
        if ((9223372034707292159L & highSpeedVideoFpsRanges) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            selectionManager.setInTouchMode(z);
            selectionManager.previousSelectionLayout = null;
            selectionManager.m2422updateSelectionjyLRC_s$foundation(highSpeedVideoFpsRanges, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0(), false, selectionAdjustment);
            androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
            selectionManager.setShowToolbar$foundation(false);
            selectionManager.getOutputMinFrameDuration = true;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E_0HSgRgRDdl7OTVFmqFi0XwOAM(androidx.compose.foundation.text.selection.SelectionManager selectionManager, long j) {
        if (selectionManager.getHighResolutionOutputSizeshNQ4ISI.getSubselections().containsKey(j)) {
            selectionManager.getHighResolutionOutputSizeshNQ4ISI(kotlin.Unit.INSTANCE);
            selectionManager.getHighSpeedVideoSizes();
            selectionManager.getHighSpeedVideoSizesFor();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FPk4fbwLO4YoFCte0tZdHKz59eM(androidx.compose.foundation.text.selection.SelectionManager selectionManager, long j) {
        if (selectionManager.getHighResolutionOutputSizeshNQ4ISI.getSubselections().containsKey(j)) {
            selectionManager.onRelease();
            selectionManager.setSelection(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Rect $r8$lambda$HfsDaoxQYROn8cgaTeCYnXFj2kc(androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor = selectionManager.getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = selectionManager.containerLayoutCoordinates;
        if (layoutCoordinates2 != null) {
            return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(highSpeedVideoFpsRangesFor, layoutCoordinates2, layoutCoordinates);
        }
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LSfnV0vw1F0FZ_13R6FfszpV1d0(androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        selectionManager.setContainerLayoutCoordinates(layoutCoordinates);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UAuHUUGChDaxd8XveM5GxC3ntM4(androidx.compose.foundation.text.selection.SelectionManager selectionManager, long j) {
        androidx.compose.foundation.text.selection.Selection.AnchorInfo end;
        androidx.compose.foundation.text.selection.Selection.AnchorInfo start;
        androidx.compose.foundation.text.selection.Selection selection = selectionManager.getSelection();
        if (selection != null && (start = selection.getStart()) != null && j == start.getSelectableId()) {
            selectionManager.m2415setStartHandlePosition_kEHs6E(null);
        }
        androidx.compose.foundation.text.selection.Selection selection2 = selectionManager.getSelection();
        if (selection2 != null && (end = selection2.getEnd()) != null && j == end.getSelectableId()) {
            selectionManager.m2414setEndHandlePosition_kEHs6E(null);
        }
        if (selectionManager.getHighResolutionOutputSizeshNQ4ISI.getSubselections().containsKey(j)) {
            selectionManager.getHighSpeedVideoSizesFor();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, androidx.compose.ui.text.TextRange] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* renamed from: $r8$lambda$WWLHP3A8nr6wjF-ajrgdRrSF4-E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2404$r8$lambda$WWLHP3A8nr6wjFajrgdRrSF4E(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        int i;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        selectionManager.setShowToolbar$foundation(true);
        selectionManager.setDraggingHandle(null);
        selectionManager.m2411setCurrentDragPosition_kEHs6E(null);
        if (selectionManager.getOutputMinFrameDuration && selectionManager.isNonEmptySelection$foundation()) {
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
            java.util.List<androidx.compose.foundation.text.selection.Selectable> sort = selectionManager.getHighResolutionOutputSizeshNQ4ISI.sort(selectionManager.requireContainerCoordinates$foundation());
            java.util.ListIterator<androidx.compose.foundation.text.selection.Selectable> listIterator = sort.listIterator(sort.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                androidx.compose.foundation.text.selection.Selection selection = selectionManager.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(listIterator.previous().getSelectableId());
                if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i != -1) {
                int size = sort.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    androidx.compose.foundation.text.selection.Selectable selectable = sort.get(i2);
                    androidx.compose.foundation.text.selection.Selection selection2 = selectionManager.getHighResolutionOutputSizeshNQ4ISI.getSubselections().get(selectable.getSelectableId());
                    if (selection2 != null) {
                        ?? text = selectable.getText();
                        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(selection2.getStart().getOffset(), selection2.getEnd().getOffset());
                        boolean z = i2 >= i;
                        long selectableId = selectable.getSelectableId();
                        if (z) {
                            objectRef.element = text;
                            objectRef2.element = androidx.compose.ui.text.TextRange.m8027boximpl(TextRange);
                            longRef.element = selectableId;
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (objectRef.element != 0 && objectRef2.element != 0 && longRef.element != 0 && ((java.lang.CharSequence) objectRef.element).length() > 0 && (coroutineScope = selectionManager.coroutineScope) != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(selectionManager, objectRef, objectRef2, longRef, null), 3, null);
            }
        }
        selectionManager.getOutputMinFrameDuration = false;
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZDQLZb9LJigT2BDB86S-Ok9UVew, reason: not valid java name */
    public static /* synthetic */ boolean m2405$r8$lambda$ZDQLZb9LJigT2BDB86SOk9UVew(androidx.compose.foundation.text.selection.SelectionManager selectionManager, boolean z, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Offset offset, androidx.compose.ui.geometry.Offset offset2, boolean z2, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
        long highSpeedVideoFpsRanges = selectionManager.getHighSpeedVideoFpsRanges(layoutCoordinates, offset.m5762unboximpl());
        long highSpeedVideoFpsRanges2 = selectionManager.getHighSpeedVideoFpsRanges(layoutCoordinates, offset2.m5762unboximpl());
        selectionManager.setInTouchMode(z);
        return selectionManager.m2423updateSelectionqNKwrvQ$foundation(androidx.compose.ui.geometry.Offset.m5741boximpl(highSpeedVideoFpsRanges), highSpeedVideoFpsRanges2, z2, selectionAdjustment);
    }

    /* renamed from: $r8$lambda$a8wsMTgWHRSHwyUY5v51-TfiVMU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2406$r8$lambda$a8wsMTgWHRSHwyUY5v51TfiVMU(androidx.compose.foundation.text.selection.SelectionManager selectionManager, boolean z, long j) {
        kotlin.Pair<androidx.compose.foundation.text.selection.Selection, androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selection>> selectAllInSelectable$foundation = selectionManager.selectAllInSelectable$foundation(j, selectionManager.getSelection());
        androidx.compose.foundation.text.selection.Selection component1 = selectAllInSelectable$foundation.component1();
        androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selection> component2 = selectAllInSelectable$foundation.component2();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(component1, selectionManager.getSelection())) {
            selectionManager.getHighResolutionOutputSizeshNQ4ISI.setSubselections(component2);
            selectionManager.onSelectionChange.invoke(component1);
        }
        selectionManager.setInTouchMode(z);
        androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(selectionManager.focusRequester, 0, 1, null);
        selectionManager.setShowToolbar$foundation(false);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cXYyta-etjonqZVFL6caDeBFs7M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2407$r8$lambda$cXYytaetjonqZVFL6caDeBFs7M(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        selectionManager.onRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xOG9ZguvC1lBDLekxob3bgsgLac(androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.foundation.text.selection.Selection selection) {
        selectionManager.setSelection(selection);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ya2iFtGGV3aCI2yBc05zMZmEqCk(androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.ui.focus.FocusState focusState) {
        if (!focusState.getHasFocus() && selectionManager.getHasFocus()) {
            selectionManager.onRelease();
        }
        selectionManager.setHasFocus(focusState.getHasFocus());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zLeWcKaMmRWRj32IAD3cZeEgMgU(androidx.compose.foundation.text.selection.SelectionManager selectionManager, boolean z) {
        selectionManager.setInTouchMode(z);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$isDraggingInProgress(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        return selectionManager.getDraggingHandle() != null;
    }

    public static final /* synthetic */ void access$toolbarCopy(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        selectionManager.onRelease();
    }
}
