package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0006Ù\u0001Ú\u0001Û\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010%\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&JE\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u0014\u0010/\u001a\u00020+*\u00020.H\u0086@¢\u0006\u0004\b/\u00100J\u001c\u00102\u001a\u00020+*\u00020.2\u0006\u00101\u001a\u00020\bH\u0086@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020+H\u0086@¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020+2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020+¢\u0006\u0004\b:\u0010;J\u0014\u0010<\u001a\u00020+*\u00020.H\u0086@¢\u0006\u0004\b<\u00100J:\u0010B\u001a\u00020+*\u00020.2\b\u0010>\u001a\u0004\u0018\u00010=2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020+0?2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020+0?H\u0086@¢\u0006\u0004\bB\u0010CJ\u0015\u0010H\u001a\u00020\b2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0014\u0010%\u001a\u00020+*\u00020.H\u0082@¢\u0006\u0004\b%\u00100J\"\u0010I\u001a\u00020+*\u00020.2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020+0?H\u0086@¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020+¢\u0006\u0004\bK\u0010;J\u001c\u0010\u001b\u001a\u00020+*\u00020.2\u0006\u0010\"\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001b\u00103J\u001f\u0010L\u001a\u00020\u00182\u0006\u00101\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020D2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u001d\u0010U\u001a\u00020+2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020D¢\u0006\u0004\bS\u0010TJ\r\u0010V\u001a\u00020+¢\u0006\u0004\bV\u0010;J\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\u001cJ\u0010\u0010X\u001a\u00020\bH\u0086\b¢\u0006\u0004\bX\u0010\u001cJ\u0010\u0010Y\u001a\u00020+H\u0086@¢\u0006\u0004\bY\u00105J\u000f\u0010[\u001a\u0004\u0018\u00010Z¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\b¢\u0006\u0004\b]\u0010\u001cJ\u0010\u0010^\u001a\u00020\bH\u0086\b¢\u0006\u0004\b^\u0010\u001cJ\u001a\u0010`\u001a\u00020+2\b\b\u0002\u0010_\u001a\u00020\bH\u0086@¢\u0006\u0004\b`\u0010aJ\u001b\u0010b\u001a\u0004\u0018\u00010Z2\b\b\u0002\u0010_\u001a\u00020\bH\u0000¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020+H\u0086@¢\u0006\u0004\bd\u00105J\r\u0010e\u001a\u00020\b¢\u0006\u0004\be\u0010\u001cJ\u0010\u0010f\u001a\u00020\bH\u0086\b¢\u0006\u0004\bf\u0010\u001cJ\u0010\u0010g\u001a\u00020+H\u0086@¢\u0006\u0004\bg\u00105J\u0010\u0010h\u001a\u00020+H\u0082@¢\u0006\u0004\bh\u00105J\u0017\u0010j\u001a\u00020+2\u0006\u0010i\u001a\u00020ZH\u0000¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\b¢\u0006\u0004\bl\u0010\u001cJ\r\u0010m\u001a\u00020+¢\u0006\u0004\bm\u0010;J\r\u0010n\u001a\u00020\b¢\u0006\u0004\bn\u0010\u001cJ\r\u0010o\u001a\u00020+¢\u0006\u0004\bo\u0010;J\r\u0010p\u001a\u00020+¢\u0006\u0004\bp\u0010;JK\u0010|\u001a\u00020y2\u0006\u0010q\u001a\u00020#2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020r2\u0006\u00101\u001a\u00020\b2\u0006\u0010v\u001a\u00020u2\b\b\u0002\u0010w\u001a\u00020\b2\b\b\u0002\u0010x\u001a\u00020\bH\u0000¢\u0006\u0004\bz\u0010{R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010}\u001a\u0004\b~\u0010\u007fR\u001d\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u0005\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010\u0083\u0001R%\u0010\u000b\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u000b\u0010\u0084\u0001\u001a\u0004\b\u000b\u0010\u001c\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010h\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bh\u0010\u0084\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010N\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b%\u0010\u008a\u0001R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u0012\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008e\u0001R&\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b8\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\t\u0010\u0084\u0001\u001a\u0005\b\u008f\u0001\u0010\u001cR&\u0010\n\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b8\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\n\u0010\u0084\u0001\u001a\u0005\b\u0090\u0001\u0010\u001cR)\u0010(\u001a\u0004\u0018\u00010'8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0005\b(\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R2\u0010\u009c\u0001\u001a\u00020\b2\u0007\u0010\u0099\u0001\u001a\u00020\b8G@GX\u0087\u008e\u0002¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010\u001c\"\u0006\b\u009d\u0001\u0010\u0086\u0001R1\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010?8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R4\u0010¥\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010¤\u0001\u0018\u00010?8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u009f\u0001\u001a\u0006\b¦\u0001\u0010¡\u0001\"\u0006\b§\u0001\u0010£\u0001R0\u0010¨\u0001\u001a\u00020D2\u0006\u0010\"\u001a\u00020D8C@CX\u0083\u008e\u0002¢\u0006\u0016\n\u0006\b¨\u0001\u0010\u009b\u0001\u001a\u0005\bN\u0010©\u0001\"\u0005\b\u001b\u0010ª\u0001R0\u0010«\u0001\u001a\u00020D2\u0006\u0010\"\u001a\u00020D8C@CX\u0083\u008e\u0002¢\u0006\u0016\n\u0006\b\u0098\u0001\u0010\u009b\u0001\u001a\u0005\b%\u0010©\u0001\"\u0005\bh\u0010ª\u0001R\u0014\u0010\u00ad\u0001\u001a\u00020D8G¢\u0006\b\u001a\u0006\b¬\u0001\u0010©\u0001R7\u0010³\u0001\u001a\u0004\u0018\u00010P2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010P8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0006\b®\u0001\u0010\u009b\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R5\u0010º\u0001\u001a\u00030´\u00012\b\u0010\u0099\u0001\u001a\u00030´\u00018G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0006\bµ\u0001\u0010\u009b\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R2\u0010¾\u0001\u001a\u00020\b2\u0007\u0010\u0099\u0001\u001a\u00020\b8G@GX\u0087\u008e\u0002¢\u0006\u0017\n\u0006\b»\u0001\u0010\u009b\u0001\u001a\u0005\b¼\u0001\u0010\u001c\"\u0006\b½\u0001\u0010\u0086\u0001R0\u0010Á\u0001\u001a\u0002062\u0006\u0010\"\u001a\u0002068C@CX\u0083\u008e\u0002¢\u0006\u0016\n\u0006\b¿\u0001\u0010\u009b\u0001\u001a\u0006\b\u0089\u0001\u0010À\u0001\"\u0004\b%\u00109R2\u0010Å\u0001\u001a\u00020\b2\u0007\u0010\u0099\u0001\u001a\u00020\b8G@AX\u0087\u008e\u0002¢\u0006\u0017\n\u0006\bÂ\u0001\u0010\u009b\u0001\u001a\u0005\bÃ\u0001\u0010\u001c\"\u0006\bÄ\u0001\u0010\u0086\u0001R\u0016\u0010Ç\u0001\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u001cR\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010È\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b«\u0001\u0010É\u0001R\u0019\u0010Ë\u0001\u001a\u00020r8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Ê\u0001R,\u0010Í\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R!\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001d8AX\u0081\u0084\u0002¢\u0006\u000f\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0005\bÕ\u0001\u0010\u001fR\u0019\u0010\u0087\u0001\u001a\u00030×\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bN\u0010Ø\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/ui/unit/Density;", "density", "", "enabled", "readOnly", "isFocused", "isPassword", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "toolbarRequester", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "platformSelectionBehaviors", "Landroidx/compose/ui/platform/Clipboard;", "clipboard", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZLandroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;Landroidx/compose/ui/platform/Clipboard;)V", "includePosition", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getCursorHandleState$foundation", "(Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "Camera2StreamConfigurationMap", "()Z", "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "()Landroidx/compose/ui/geometry/Rect;", "getFocusRect", "Landroidx/compose/ui/text/TextLayoutResult;", "p0", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/foundation/text/input/TextFieldCharSequence;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "showTextToolbar", "", "update", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/ui/platform/Clipboard;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;Landroidx/compose/ui/unit/Density;ZZZ)V", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "cursorHandleGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isStartHandle", "selectionHandleGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startToolbarAndHandlesVisibilityObserver", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "textToolbarState", "updateTextToolbarState", "(Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;)V", "dispose", "()V", "detectTouchMode", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "requestFocus", "showKeyboard", "detectTextFieldTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "offset", "placeCursorAtNearestOffset-k-4lQ0M", "(J)Z", "placeCursorAtNearestOffset", "textFieldSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeSuggestSelectionRange", "getSelectionHandleState$foundation", "(ZZ)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "getHighResolutionOutputSizeshNQ4ISI", "(Z)J", "Landroidx/compose/foundation/text/Handle;", "handle", com.daon.sdk.face.license.License.FEATURE_POSITION, "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateHandleDragging", "clearHandleDragging", "canShowCutMenuItem", "isCutAllowed", "cut", "Landroidx/compose/ui/text/AnnotatedString;", "cutWithResult", "()Landroidx/compose/ui/text/AnnotatedString;", "canShowCopyMenuItem", "isCopyAllowed", "cancelSelection", "copy", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyWithResult$foundation", "(Z)Landroidx/compose/ui/text/AnnotatedString;", "updateClipboardEntry", "canShowPasteMenuItem", "isPasteAllowed", "paste", "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onPasteEvent$foundation", "(Landroidx/compose/ui/text/AnnotatedString;)V", "canShowSelectAllMenuItem", "selectAll", "canShowAutofillMenuItem", "autofill", "deselect", "textFieldCharSequence", "", "startOffset", "endOffset", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "allowPreviousSelectionCollapsed", "isStartOfSelection", "Landroidx/compose/ui/text/TextRange;", "updateSelection-SsL-Rf8$foundation", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZZ)J", "updateSelection", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getTextFieldState$foundation", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getTextLayoutState$foundation", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/ui/unit/Density;", "Z", "setFocused", "(Z)V", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "getPlatformSelectionBehaviors$foundation", "()Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "Landroidx/compose/ui/platform/Clipboard;", "getEnabled", "getReadOnly", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "getOutputFormats", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "getHighSpeedVideoSizesFor", "<set-?>", "isInTouchMode$delegate", "Landroidx/compose/runtime/MutableState;", "isInTouchMode", "setInTouchMode", "requestAutofillAction", "Lkotlin/jvm/functions/Function0;", "getRequestAutofillAction", "()Lkotlin/jvm/functions/Function0;", "setRequestAutofillAction", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "getReceiveContentConfiguration", "setReceiveContentConfiguration", "getOutputMinFrameDuration", "()J", "(J)V", "getInputFormats", "getHandleDragPosition-F1C5BW0", "handleDragPosition", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "directDragGestureInitiator$delegate", "getDirectDragGestureInitiator", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "setDirectDragGestureInitiator", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;)V", "directDragGestureInitiator", "showCursorHandle$delegate", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "getOutputStallDurationlomOqCM", "()Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "getInputSizeshNQ4ISI", "textToolbarShown$delegate", "getTextToolbarShown", "setTextToolbarShown$foundation", "textToolbarShown", "getEditable$foundation", "editable", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", com.visa.cbp.getEncExpo.warmup, "getOutputSizeshNQ4ISI", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getPressInteraction", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "setPressInteraction", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "derivedVisibleContentBounds$delegate", "Landroidx/compose/runtime/State;", "getDerivedVisibleContentBounds$foundation", "derivedVisibleContentBounds", "Landroidx/compose/foundation/text/input/internal/selection/ClipboardPasteState;", "Landroidx/compose/foundation/text/input/internal/selection/ClipboardPasteState;", "InputType", "TextFieldMouseSelectionObserver", "TextFieldTextDragObserver"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private androidx.compose.ui.unit.Density Camera2StreamConfigurationMap;

    /* renamed from: derivedVisibleContentBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State derivedVisibleContentBounds;
    private boolean enabled;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.text.input.internal.selection.ClipboardPasteState getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.platform.Clipboard getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.text.selection.SelectionLayout getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getInputSizeshNQ4ISI;
    private androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
    private boolean isFocused;
    private final androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors;
    private androidx.compose.foundation.interaction.PressInteraction.Press pressInteraction;
    private boolean readOnly;
    private kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> receiveContentConfiguration;
    private kotlin.jvm.functions.Function0<kotlin.Unit> requestAutofillAction;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState showCursorHandle;
    private final androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState;
    private final androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState;

    /* renamed from: textToolbarShown$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState textToolbarShown;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isInTouchMode = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
    private final androidx.compose.runtime.MutableState getOutputMinFrameDuration = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()), null, 2, null);

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getInputFormats = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()), null, 2, null);

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState draggingHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: directDragGestureInitiator$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState directDragGestureInitiator = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None, null, 2, null);

    /* renamed from: $r8$lambda$9_kQI-PFxoiu5o4pm7KsR2mzK70, reason: not valid java name */
    public static /* synthetic */ boolean m2300$r8$lambda$9_kQIPFxoiu5o4pm7KsR2mzK70(androidx.compose.ui.geometry.Rect rect) {
        return rect == null;
    }

    public TextFieldSelectionState(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.unit.Density density, boolean z, boolean z2, boolean z3, boolean z4, androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors, androidx.compose.ui.platform.Clipboard clipboard) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.Camera2StreamConfigurationMap = density;
        this.isFocused = z3;
        this.getHighSpeedVideoSizes = z4;
        this.getHighSpeedVideoFpsRanges = toolbarRequester;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
        this.getHighSpeedVideoFpsRangesFor = clipboard;
        this.enabled = z;
        this.readOnly = z2;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.showCursorHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getInputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None, null, 2, null);
        this.textToolbarShown = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getOutputSizeshNQ4ISI = -1;
        this.derivedVisibleContentBounds = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$jxSVhbxSqwojClui0XKiWfYB4p4(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this);
            }
        });
        this.getOutputMinFrameDurationlomOqCM = new androidx.compose.foundation.text.input.internal.selection.ClipboardPasteState(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: getTextFieldState$foundation, reason: from getter */
    public final androidx.compose.foundation.text.input.internal.TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: getTextLayoutState$foundation, reason: from getter */
    public final androidx.compose.foundation.text.input.internal.TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    /* renamed from: getPlatformSelectionBehaviors$foundation, reason: from getter */
    public final androidx.compose.foundation.text.selection.PlatformSelectionBehaviors getPlatformSelectionBehaviors() {
        return this.platformSelectionBehaviors;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final androidx.compose.ui.hapticfeedback.HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((java.lang.Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode.setValue(java.lang.Boolean.valueOf(z));
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    public final void setRequestAutofillAction(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.requestAutofillAction = function0;
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.foundation.content.internal.ReceiveContentConfiguration> getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final void setReceiveContentConfiguration(kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> function0) {
        this.receiveContentConfiguration = function0;
    }

    private final void Camera2StreamConfigurationMap(long j) {
        this.getOutputMinFrameDuration.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long getHighResolutionOutputSizeshNQ4ISI() {
        return ((androidx.compose.ui.geometry.Offset) this.getOutputMinFrameDuration.getValue()).m5762unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long getHighSpeedVideoFpsRangesFor() {
        return ((androidx.compose.ui.geometry.Offset) this.getInputFormats.getValue()).m5762unboximpl();
    }

    private final void getHighSpeedVideoSizes(long j) {
        this.getInputFormats.setValue(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m2307getHandleDragPositionF1C5BW0() {
        if ((getHighSpeedVideoFpsRangesFor() & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        if ((getHighResolutionOutputSizeshNQ4ISI() & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2264fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, getHighSpeedVideoFpsRangesFor());
        }
        long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(highSpeedVideoFpsRangesFor, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(highResolutionOutputSizeshNQ4ISI, textLayoutNodeCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(textLayoutNodeCoordinates) : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.Handle getDraggingHandle() {
        return (androidx.compose.foundation.text.Handle) this.draggingHandle.getValue();
    }

    public final void setDraggingHandle(androidx.compose.foundation.text.Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Touch", "Mouse"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType Mouse;
        public static final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType None;
        public static final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType Touch;
        private static final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType[] getHighResolutionOutputSizeshNQ4ISI;

        private InputType(java.lang.String str, int i) {
        }

        static {
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType inputType = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 0);
            None = inputType;
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType inputType2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType("Touch", 1);
            Touch = inputType2;
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType inputType3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType("Mouse", 2);
            Mouse = inputType3;
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType[] inputTypeArr = {inputType, inputType2, inputType3};
            getHighResolutionOutputSizeshNQ4ISI = inputTypeArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(inputTypeArr);
        }

        public static androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType[] values() {
            return (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType valueOf(java.lang.String str) {
            return (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType) java.lang.Enum.valueOf(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType getDirectDragGestureInitiator() {
        return (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType) this.directDragGestureInitiator.getValue();
    }

    public final void setDirectDragGestureInitiator(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType inputType) {
        this.directDragGestureInitiator.setValue(inputType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((java.lang.Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.input.internal.selection.TextToolbarState getHighSpeedVideoFpsRanges() {
        return (androidx.compose.foundation.text.input.internal.selection.TextToolbarState) this.getInputSizeshNQ4ISI.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState) {
        this.getInputSizeshNQ4ISI.setValue(textToolbarState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getTextToolbarShown() {
        return ((java.lang.Boolean) this.textToolbarShown.getValue()).booleanValue();
    }

    public final void setTextToolbarShown$foundation(boolean z) {
        this.textToolbarShown.setValue(java.lang.Boolean.valueOf(z));
    }

    public final boolean getEditable$foundation() {
        return this.enabled && !this.readOnly;
    }

    public final androidx.compose.foundation.interaction.PressInteraction.Press getPressInteraction() {
        return this.pressInteraction;
    }

    public final void setPressInteraction(androidx.compose.foundation.interaction.PressInteraction.Press press) {
        this.pressInteraction = press;
    }

    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState getCursorHandleState$foundation(boolean includePosition) {
        androidx.compose.foundation.text.input.TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z = getDirectDragGestureInitiator() == androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None;
        androidx.compose.foundation.text.Handle draggingHandle = getDraggingHandle();
        if (!showCursorHandle || !z || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(visualText.getSelection()) || !visualText.shouldShowSelection() || visualText.length() <= 0 || (draggingHandle != androidx.compose.foundation.text.Handle.Cursor && !Camera2StreamConfigurationMap())) {
            return androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
        }
        return new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState(true, includePosition ? getCursorRect().m5779getBottomCenterF1C5BW0() : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0(), 0.0f, androidx.compose.ui.text.style.ResolvedTextDirection.Ltr, false, null);
    }

    private final boolean Camera2StreamConfigurationMap() {
        androidx.compose.ui.geometry.Rect visibleBounds;
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = null;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long m5779getBottomCenterF1C5BW0 = getCursorRect().m5779getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
            if (textLayoutNodeCoordinates != null && textLayoutNodeCoordinates.isAttached()) {
                layoutCoordinates = textLayoutNodeCoordinates;
            }
            if (layoutCoordinates == null || (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
                return false;
            }
            return androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(visibleBounds, m5779getBottomCenterF1C5BW0);
        } catch (java.lang.Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final androidx.compose.ui.geometry.Rect getCursorRect() {
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        return layoutResult == null ? androidx.compose.ui.geometry.Rect.INSTANCE.getZero() : getHighSpeedVideoFpsRangesFor(layoutResult, this.textFieldState.getVisualText());
    }

    public final androidx.compose.ui.geometry.Rect getFocusRect() {
        androidx.compose.ui.geometry.Rect bounds;
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        if (!this.isFocused) {
            return androidx.compose.ui.focus.FocusProperties.INSTANCE.getUnsetFocusRect();
        }
        androidx.compose.foundation.text.input.TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(visualText.getSelection())) {
            bounds = getHighSpeedVideoFpsRangesFor(layoutResult, visualText);
        } else if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(visualText.getSelection())) {
            bounds = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        } else {
            int lineForOffset = layoutResult.getLineForOffset(androidx.compose.ui.text.TextRange.m8039getStartimpl(visualText.getSelection()));
            int lineForOffset2 = layoutResult.getLineForOffset(androidx.compose.ui.text.TextRange.m8034getEndimpl(visualText.getSelection()));
            if (lineForOffset == lineForOffset2) {
                float horizontalPosition = layoutResult.getHorizontalPosition(androidx.compose.ui.text.TextRange.m8039getStartimpl(visualText.getSelection()), true);
                float horizontalPosition2 = layoutResult.getHorizontalPosition(androidx.compose.ui.text.TextRange.m8034getEndimpl(visualText.getSelection()), true);
                bounds = new androidx.compose.ui.geometry.Rect(java.lang.Math.min(horizontalPosition, horizontalPosition2), layoutResult.getLineTop(lineForOffset), java.lang.Math.max(horizontalPosition, horizontalPosition2), layoutResult.getLineBottom(lineForOffset2));
            } else {
                bounds = layoutResult.getPathForRange(androidx.compose.ui.text.TextRange.m8037getMinimpl(visualText.getSelection()), androidx.compose.ui.text.TextRange.m8036getMaximpl(visualText.getSelection())).getBounds();
            }
        }
        return androidx.compose.foundation.text.input.internal.TextLayoutStateKt.fromTextLayoutToDecoration(this.textLayoutState, bounds);
    }

    private final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.TextLayoutResult p0, androidx.compose.foundation.text.input.TextFieldCharSequence p1) {
        float right;
        float rint;
        if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(p1.getSelection())) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        androidx.compose.ui.geometry.Rect cursorRect = p0.getCursorRect(androidx.compose.ui.text.TextRange.m8039getStartimpl(p1.getSelection()));
        float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast((float) java.lang.Math.floor(this.Camera2StreamConfigurationMap.mo1418toPx0680j_4(androidx.compose.foundation.text.TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
        if (p0.getLayoutInput().getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            right = cursorRect.getLeft() + (coerceAtLeast / 2.0f);
        } else {
            right = cursorRect.getRight() - (coerceAtLeast / 2.0f);
        }
        float f = coerceAtLeast / 2.0f;
        float coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(right, ((int) (p0.getSize() >> 32)) - f), f);
        if (((int) coerceAtLeast) % 2 == 1) {
            rint = ((float) java.lang.Math.floor(coerceAtLeast2)) + 0.5f;
        } else {
            rint = (float) java.lang.Math.rint(coerceAtLeast2);
        }
        return new androidx.compose.ui.geometry.Rect(rint - f, cursorRect.getTop(), rint + f, cursorRect.getBottom());
    }

    public final java.lang.Object cursorHandleGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object selectionHandleGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startToolbarAndHandlesVisibilityObserver(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1;
        int i;
        try {
            if (continuation instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) {
                textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) continuation;
                if ((textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2(this, null);
                        textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.getHighSpeedVideoSizes = 1;
                        obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2, textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    setShowCursorHandle(false);
                    if (getHighSpeedVideoFpsRanges() != androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None) {
                        if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                            this.getHighSpeedVideoFpsRanges.hide();
                        } else {
                            androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler textToolbarHandler = this.getHighSpeedVideoSizesFor;
                            if (textToolbarHandler != null) {
                                textToolbarHandler.hideTextToolbar();
                            }
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            setShowCursorHandle(false);
            if (getHighSpeedVideoFpsRanges() != androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            setShowCursorHandle(false);
            if (getHighSpeedVideoFpsRanges() != androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None) {
                if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                    this.getHighSpeedVideoFpsRanges.hide();
                } else {
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler textToolbarHandler2 = this.getHighSpeedVideoSizesFor;
                    if (textToolbarHandler2 != null) {
                        textToolbarHandler2.hideTextToolbar();
                    }
                }
            }
            throw th;
        }
        textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1(this, continuation);
        java.lang.Object obj2 = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.getHighSpeedVideoSizes;
    }

    public final void updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState) {
        getHighSpeedVideoFpsRangesFor(textToolbarState);
    }

    public final java.lang.Object detectTouchMode(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2(this, null), continuation);
        return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object detectTextFieldTapGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object detectTextFieldTapGestures = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.detectTextFieldTapGestures(this, pointerInputScope, mutableInteractionSource, function0, function02, continuation);
        return detectTextFieldTapGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTextFieldTapGestures : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2308placeCursorAtNearestOffsetk4lQ0M(long offset) {
        int m8011getOffsetForPositionk4lQ0M;
        androidx.compose.foundation.text.input.internal.IndexTransformationType indexTransformationType;
        int m8039getStartimpl;
        long TextRange;
        androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity;
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (m8011getOffsetForPositionk4lQ0M = layoutResult.m8011getOffsetForPositionk4lQ0M(offset)) == -1) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long m2270mapFromTransformedjx7JFs = transformedTextFieldState.m2270mapFromTransformedjx7JFs(m8011getOffsetForPositionk4lQ0M);
        long m2273mapToTransformedGEjPoXI = transformedTextFieldState.m2273mapToTransformedGEjPoXI(m2270mapFromTransformedjx7JFs);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2270mapFromTransformedjx7JFs) && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2273mapToTransformedGEjPoXI)) {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Untransformed;
        } else if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2270mapFromTransformedjx7JFs) && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2273mapToTransformedGEjPoXI)) {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Replacement;
        } else if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2270mapFromTransformedjx7JFs) && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2273mapToTransformedGEjPoXI)) {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Insertion;
        } else {
            indexTransformationType = androidx.compose.foundation.text.input.internal.IndexTransformationType.Deletion;
        }
        int i = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.WhenMappings.$EnumSwitchMapping$0[indexTransformationType.ordinal()];
        androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity2 = null;
        if (i != 1) {
            if (i == 2) {
                m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2270mapFromTransformedjx7JFs);
            } else if (i == 3) {
                if (androidx.compose.foundation.text.input.internal.MathUtilsKt.m2237findClosestRect9KIMszo(offset, layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m8039getStartimpl(m2273mapToTransformedGEjPoXI)), layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2273mapToTransformedGEjPoXI))) < 0) {
                    selectionWedgeAffinity = new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.WedgeAffinity.Start);
                } else {
                    selectionWedgeAffinity = new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.WedgeAffinity.End);
                }
                selectionWedgeAffinity2 = selectionWedgeAffinity;
                m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2270mapFromTransformedjx7JFs);
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.foundation.text.input.internal.MathUtilsKt.m2237findClosestRect9KIMszo(offset, layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m8039getStartimpl(m2273mapToTransformedGEjPoXI)), layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2273mapToTransformedGEjPoXI))) >= 0) {
                    m8039getStartimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(m2270mapFromTransformedjx7JFs);
                }
            }
            TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(m8039getStartimpl);
            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(TextRange, this.textFieldState.getUntransformedText().getSelection()) && (selectionWedgeAffinity2 == null || kotlin.jvm.internal.Intrinsics.areEqual(selectionWedgeAffinity2, this.textFieldState.getSelectionWedgeAffinity()))) {
                return false;
            }
            this.textFieldState.m2276selectUntransformedCharsIn5zctL8(TextRange);
            if (selectionWedgeAffinity2 != null) {
                this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity2);
            }
            return true;
        }
        m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2270mapFromTransformedjx7JFs);
        TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(m8039getStartimpl);
        if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(TextRange, this.textFieldState.getUntransformedText().getSelection())) {
        }
        this.textFieldState.m2276selectUntransformedCharsIn5zctL8(TextRange);
        if (selectionWedgeAffinity2 != null) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        java.lang.Throwable th;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        if (continuation instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) {
            textFieldSelectionState$detectCursorHandleDragGestures$1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) continuation;
            if ((textFieldSelectionState$detectCursorHandleDragGestures$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectCursorHandleDragGestures$1.Camera2StreamConfigurationMap -= 2147483648;
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$12 = textFieldSelectionState$detectCursorHandleDragGestures$1;
                java.lang.Object obj = textFieldSelectionState$detectCursorHandleDragGestures$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionState$detectCursorHandleDragGestures$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef3.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
                    final kotlin.jvm.internal.Ref.LongRef longRef4 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef4.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
                    try {
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2303$r8$lambda$lu8V41_qcsAKmIo0deTcPZcA7o(kotlin.jvm.internal.Ref.LongRef.this, this, longRef4, (androidx.compose.ui.geometry.Offset) obj2);
                            }
                        };
                        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2299$r8$lambda$3X0mw6glcO9nja89pyW92Kxgg0(kotlin.jvm.internal.Ref.LongRef.this, longRef4, this);
                            }
                        };
                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$2NWoBWQu16F79WamnCMlVPRH00g(kotlin.jvm.internal.Ref.LongRef.this, longRef4, this);
                            }
                        };
                        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$LbnJ6RDB3rlwZZu7sDNWbfnGOmQ(kotlin.jvm.internal.Ref.LongRef.this, this, longRef3, (androidx.compose.ui.input.pointer.PointerInputChange) obj2, (androidx.compose.ui.geometry.Offset) obj3);
                            }
                        };
                        textFieldSelectionState$detectCursorHandleDragGestures$12.getHighSpeedVideoFpsRangesFor = longRef3;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.getHighSpeedVideoSizes = longRef4;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.Camera2StreamConfigurationMap = 1;
                        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(pointerInputScope, function1, function0, function02, function2, textFieldSelectionState$detectCursorHandleDragGestures$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        longRef = longRef3;
                        longRef2 = longRef4;
                    } catch (java.lang.Throwable th2) {
                        longRef = longRef3;
                        th = th2;
                        longRef2 = longRef4;
                        getHighSpeedVideoSizes(longRef, longRef2, this);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectCursorHandleDragGestures$12.getHighSpeedVideoSizes;
                    longRef = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectCursorHandleDragGestures$12.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        getHighSpeedVideoSizes(longRef, longRef2, this);
                        throw th;
                    }
                }
                getHighSpeedVideoSizes(longRef, longRef2, this);
                return kotlin.Unit.INSTANCE;
            }
        }
        textFieldSelectionState$detectCursorHandleDragGestures$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1(this, continuation);
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$122 = textFieldSelectionState$detectCursorHandleDragGestures$1;
        java.lang.Object obj2 = textFieldSelectionState$detectCursorHandleDragGestures$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$detectCursorHandleDragGestures$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        getHighSpeedVideoSizes(longRef, longRef2, this);
        return kotlin.Unit.INSTANCE;
    }

    private static final void getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.LongRef longRef, kotlin.jvm.internal.Ref.LongRef longRef2, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        if ((longRef.element & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    public final java.lang.Object textFieldSelectionGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object textFieldSelectionGestures = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt.textFieldSelectionGestures(this, pointerInputScope, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldMouseSelectionObserver(function0), new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldTextDragObserver(function0), continuation);
        return textFieldSelectionGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? textFieldSelectionGestures : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "Lkotlin/Function0;", "", "p0", "<init>", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "p1", "", "p2", "", "onStart-9KIMszo", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;I)Z", "onStart", "onDrag-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onDrag", "Landroidx/compose/ui/text/TextLayoutResult;", "p3", "Landroidx/compose/ui/text/TextRange;", "getHighSpeedVideoFpsRanges", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/ui/text/TextLayoutResult;Z)J", "onDragDone", "()V", "onExtend-k-4lQ0M", "(J)Z", "onExtend", "onExtendDrag-k-4lQ0M", "onExtendDrag", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoSizes", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class TextFieldMouseSelectionObserver implements androidx.compose.foundation.text.selection.MouseSelectionObserver {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor = -1;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private long getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        private boolean getHighSpeedVideoSizes = true;

        public TextFieldMouseSelectionObserver(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.Camera2StreamConfigurationMap = function0;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-9KIMszo, reason: not valid java name */
        public final boolean mo2314onStart9KIMszo(long p0, androidx.compose.foundation.text.selection.SelectionAdjustment p1, int p2) {
            androidx.compose.ui.text.TextLayoutResult layoutResult = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().getLayoutResult();
            if (!androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getEnabled() || layoutResult == null || androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().getVisualText().length() == 0) {
                return false;
            }
            this.getHighSpeedVideoSizes = p2 >= 2;
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldMouseSelectionObserver.getHighSpeedVideoFpsRangesFor();
                }
            });
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.setDirectDragGestureInitiator(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.Mouse);
            this.Camera2StreamConfigurationMap.invoke();
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = p0;
            this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.text.TextRange.m8039getStartimpl(getHighSpeedVideoFpsRanges(p0, p1, layoutResult, true));
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public final boolean mo2311onDrag3MmeM6k(final long p0, androidx.compose.foundation.text.selection.SelectionAdjustment p1) {
            androidx.compose.ui.text.TextLayoutResult layoutResult = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().getLayoutResult();
            if (!androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getEnabled() || layoutResult == null || androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().getVisualText().length() == 0) {
                return false;
            }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldMouseSelectionObserver.getHighSpeedVideoFpsRanges(p0);
                }
            });
            if (androidx.compose.ui.text.TextRange.m8032equalsimpl0(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().getVisualText().getSelection(), getHighSpeedVideoFpsRanges(p0, p1, layoutResult, false))) {
                return true;
            }
            this.getHighSpeedVideoSizes = false;
            return true;
        }

        private final long getHighSpeedVideoFpsRanges(long p0, androidx.compose.foundation.text.selection.SelectionAdjustment p1, androidx.compose.ui.text.TextLayoutResult p2, boolean p3) {
            int length = p2.getLayoutInput().getText().length();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i < 0 || i > length) {
                i = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().m2259getOffsetForPosition3MmeM6k(this.getHighResolutionOutputSizeshNQ4ISI, false);
            }
            int m2259getOffsetForPosition3MmeM6k = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().m2259getOffsetForPosition3MmeM6k(p0, false);
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this;
            long m2310updateSelectionSsLRf8$foundation = textFieldSelectionState.m2310updateSelectionSsLRf8$foundation(textFieldSelectionState.getTextFieldState().getVisualText(), i, m2259getOffsetForPosition3MmeM6k, false, p1, false, p3);
            if (this.getHighSpeedVideoFpsRangesFor == -1 && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2310updateSelectionSsLRf8$foundation)) {
                this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2310updateSelectionSsLRf8$foundation);
            }
            if (androidx.compose.ui.text.TextRange.m8038getReversedimpl(m2310updateSelectionSsLRf8$foundation)) {
                m2310updateSelectionSsLRf8$foundation = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2310updateSelectionSsLRf8$foundation), androidx.compose.ui.text.TextRange.m8039getStartimpl(m2310updateSelectionSsLRf8$foundation));
            }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().m2275selectCharsIn5zctL8(m2310updateSelectionSsLRf8$foundation);
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection);
            return m2310updateSelectionSsLRf8$foundation;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public final void onDragDone() {
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldMouseSelectionObserver.getHighResolutionOutputSizeshNQ4ISI();
                }
            });
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.setDirectDragGestureInitiator(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None);
            if (this.getHighSpeedVideoSizes) {
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.maybeSuggestSelectionRange();
            }
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public final boolean mo2312onExtendk4lQ0M(long p0) {
            androidx.compose.ui.text.TextLayoutResult layoutResult = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().getLayoutResult();
            if (!androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getEnabled() || layoutResult == null || androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().getVisualText().length() == 0) {
                return false;
            }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldMouseSelectionObserver.getHighSpeedVideoFpsRanges();
                }
            });
            this.getHighSpeedVideoSizes = false;
            this.Camera2StreamConfigurationMap.invoke();
            getHighSpeedVideoFpsRanges(p0, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone(), layoutResult, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public final boolean mo2313onExtendDragk4lQ0M(long p0) {
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldMouseSelectionObserver.getHighSpeedVideoSizes();
                }
            });
            return true;
        }

        public static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges(long j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Mouse.onDrag ");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(j));
            return sb.toString();
        }

        public static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
            return "Mouse.onStart";
        }

        public static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
            return "Mouse.onExtendDrag";
        }

        public static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "Mouse.onDragDone";
        }

        public static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
            return "Mouse.onExtend";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver;", "Landroidx/compose/foundation/text/TextDragObserver;", "Lkotlin/Function0;", "", "p0", "<init>", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "getHighSpeedVideoFpsRangesFor", "()V", "Landroidx/compose/ui/geometry/Offset;", "onDown-k-4lQ0M", "(J)V", "onDown", "onUp", "onStop", "onCancel", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "p1", "onStart-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "onStart", "onDrag-k-4lQ0M", "onDrag", "getOutputMinFrameDuration", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "J", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/Handle;", "Landroidx/compose/foundation/text/Handle;", "", "getOutputFormats", "Z", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class TextFieldTextDragObserver implements androidx.compose.foundation.text.TextDragObserver {

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRanges = -1;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private long Camera2StreamConfigurationMap = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private long getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.compose.foundation.text.Handle getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.text.Handle.SelectionEnd;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private boolean getInputSizeshNQ4ISI = true;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.compose.foundation.text.selection.SelectionAdjustment getHighSpeedVideoSizesFor = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDown-k-4lQ0M */
        public final void mo2103onDownk4lQ0M(long p0) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onUp() {
        }

        public TextFieldTextDragObserver(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.getHighSpeedVideoSizes = function0;
        }

        private final void getHighSpeedVideoFpsRangesFor() {
            if ((this.Camera2StreamConfigurationMap & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldTextDragObserver.getHighResolutionOutputSizeshNQ4ISI();
                    }
                });
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.clearHandleDragging();
                this.getHighSpeedVideoFpsRanges = -1;
                this.Camera2StreamConfigurationMap = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getOutputSizeshNQ4ISI = -1;
                this.getHighSpeedVideoSizesFor = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.setDirectDragGestureInitiator(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None);
                this.getHighSpeedVideoSizes.invoke();
                if (this.getInputSizeshNQ4ISI) {
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.maybeSuggestSelectionRange();
                }
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onStop() {
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onCancel() {
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-3MmeM6k */
        public final void mo2105onStart3MmeM6k(final long p0, androidx.compose.foundation.text.selection.SelectionAdjustment p1) {
            if (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getEnabled()) {
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldTextDragObserver.Camera2StreamConfigurationMap(p0);
                    }
                });
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.m2309updateHandleDraggingUv8p0NA(this.getHighSpeedVideoFpsRangesFor, p0);
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.setShowCursorHandle(false);
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.setDirectDragGestureInitiator(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.Touch);
                this.Camera2StreamConfigurationMap = p0;
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getOutputSizeshNQ4ISI = -1;
                this.getInputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizesFor = p1;
                if (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().getLayoutResult() == null) {
                    return;
                }
                if (!androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().m2260isPositionOnTextk4lQ0M(p0)) {
                    int m2256getOffsetForPosition3MmeM6k$default = androidx.compose.foundation.text.input.internal.TextLayoutState.m2256getOffsetForPosition3MmeM6k$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState(), p0, false, 2, null);
                    androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
                    }
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().placeCursorBeforeCharAt(m2256getOffsetForPosition3MmeM6k$default);
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.setShowCursorHandle(true);
                    this.getInputSizeshNQ4ISI = false;
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Cursor);
                    return;
                }
                if (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().getVisualText().length() == 0) {
                    return;
                }
                int m2256getOffsetForPosition3MmeM6k$default2 = androidx.compose.foundation.text.input.internal.TextLayoutState.m2256getOffsetForPosition3MmeM6k$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState(), p0, false, 2, null);
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this;
                long m2306updateSelectionSsLRf8$foundation$default = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2306updateSelectionSsLRf8$foundation$default(textFieldSelectionState, new androidx.compose.foundation.text.input.TextFieldCharSequence(textFieldSelectionState.getTextFieldState().getVisualText(), androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), null, null, null, null, 60, null), m2256getOffsetForPosition3MmeM6k$default2, m2256getOffsetForPosition3MmeM6k$default2, false, this.getHighSpeedVideoSizesFor, false, false, 96, null);
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().m2275selectCharsIn5zctL8(m2306updateSelectionSsLRf8$foundation$default);
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection);
                this.getHighSpeedVideoFpsRanges = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2306updateSelectionSsLRf8$foundation$default);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public final void mo2104onDragk4lQ0M(long p0) {
            int intValue;
            int m2259getOffsetForPosition3MmeM6k;
            androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment;
            androidx.compose.foundation.text.Handle handle;
            if (!androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getEnabled() || androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().getLayoutResult() == null || androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().getVisualText().length() == 0) {
                return;
            }
            long m5757plusMKHz9U = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.getHighResolutionOutputSizeshNQ4ISI, p0);
            this.getHighResolutionOutputSizeshNQ4ISI = m5757plusMKHz9U;
            final long m5757plusMKHz9U2 = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.Camera2StreamConfigurationMap, m5757plusMKHz9U);
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldTextDragObserver.getHighSpeedVideoFpsRangesFor(m5757plusMKHz9U2);
                }
            });
            if (this.getHighSpeedVideoFpsRanges < 0 && !androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().m2260isPositionOnTextk4lQ0M(m5757plusMKHz9U2)) {
                intValue = androidx.compose.foundation.text.input.internal.TextLayoutState.m2256getOffsetForPosition3MmeM6k$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState(), this.Camera2StreamConfigurationMap, false, 2, null);
                m2259getOffsetForPosition3MmeM6k = androidx.compose.foundation.text.input.internal.TextLayoutState.m2256getOffsetForPosition3MmeM6k$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState(), m5757plusMKHz9U2, false, 2, null);
                if (intValue == m2259getOffsetForPosition3MmeM6k) {
                    selectionAdjustment = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();
                } else {
                    selectionAdjustment = this.getHighSpeedVideoSizesFor;
                }
            } else {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges);
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().m2259getOffsetForPosition3MmeM6k(this.Camera2StreamConfigurationMap, false);
                m2259getOffsetForPosition3MmeM6k = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextLayoutState().m2259getOffsetForPosition3MmeM6k(m5757plusMKHz9U2, false);
                if (this.getHighSpeedVideoFpsRanges < 0 && intValue == m2259getOffsetForPosition3MmeM6k) {
                    return;
                }
                selectionAdjustment = this.getHighSpeedVideoSizesFor;
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection);
            }
            int i = intValue;
            int i2 = m2259getOffsetForPosition3MmeM6k;
            androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment2 = selectionAdjustment;
            long selection = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().getVisualText().getSelection();
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this;
            long m2306updateSelectionSsLRf8$foundation$default = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2306updateSelectionSsLRf8$foundation$default(textFieldSelectionState, textFieldSelectionState.getTextFieldState().getVisualText(), i, i2, false, selectionAdjustment2, false, false, 64, null);
            if (this.getHighSpeedVideoFpsRanges == -1 && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2306updateSelectionSsLRf8$foundation$default)) {
                this.getHighSpeedVideoFpsRanges = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2306updateSelectionSsLRf8$foundation$default);
            }
            if (androidx.compose.ui.text.TextRange.m8038getReversedimpl(m2306updateSelectionSsLRf8$foundation$default)) {
                m2306updateSelectionSsLRf8$foundation$default = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2306updateSelectionSsLRf8$foundation$default), androidx.compose.ui.text.TextRange.m8039getStartimpl(m2306updateSelectionSsLRf8$foundation$default));
            }
            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(m2306updateSelectionSsLRf8$foundation$default, selection)) {
                if (androidx.compose.ui.text.TextRange.m8039getStartimpl(m2306updateSelectionSsLRf8$foundation$default) == androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) || androidx.compose.ui.text.TextRange.m8034getEndimpl(m2306updateSelectionSsLRf8$foundation$default) != androidx.compose.ui.text.TextRange.m8034getEndimpl(selection)) {
                    if (androidx.compose.ui.text.TextRange.m8039getStartimpl(m2306updateSelectionSsLRf8$foundation$default) == androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) && androidx.compose.ui.text.TextRange.m8034getEndimpl(m2306updateSelectionSsLRf8$foundation$default) != androidx.compose.ui.text.TextRange.m8034getEndimpl(selection)) {
                        handle = androidx.compose.foundation.text.Handle.SelectionEnd;
                    } else if ((androidx.compose.ui.text.TextRange.m8039getStartimpl(m2306updateSelectionSsLRf8$foundation$default) + androidx.compose.ui.text.TextRange.m8034getEndimpl(m2306updateSelectionSsLRf8$foundation$default)) / 2.0f > (androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) + androidx.compose.ui.text.TextRange.m8034getEndimpl(selection)) / 2.0f) {
                        handle = androidx.compose.foundation.text.Handle.SelectionEnd;
                    }
                    this.getHighSpeedVideoFpsRangesFor = handle;
                    this.getInputSizeshNQ4ISI = false;
                }
                handle = androidx.compose.foundation.text.Handle.SelectionStart;
                this.getHighSpeedVideoFpsRangesFor = handle;
                this.getInputSizeshNQ4ISI = false;
            }
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(selection) || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2306updateSelectionSsLRf8$foundation$default)) {
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getTextFieldState().m2275selectCharsIn5zctL8(m2306updateSelectionSsLRf8$foundation$default);
            }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.m2309updateHandleDraggingUv8p0NA(this.getHighSpeedVideoFpsRangesFor, m5757plusMKHz9U2);
        }

        public static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor(long j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Touch.onDrag at ");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(j));
            return sb.toString();
        }

        public static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "Touch.onDragStop";
        }

        public static /* synthetic */ java.lang.String Camera2StreamConfigurationMap(long j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Touch.onDragStart after longPress at ");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(j));
            return sb.toString();
        }
    }

    public final void maybeSuggestSelectionRange() {
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = this.platformSelectionBehaviors;
        if (platformSelectionBehaviors != null) {
            java.lang.CharSequence text = this.textFieldState.getVisualText().getText();
            long selection = this.textFieldState.getVisualText().getSelection();
            if (text.length() <= 0 || androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(selection)) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1(platformSelectionBehaviors, text, selection, this, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, final boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$1;
        int i;
        final androidx.compose.foundation.text.Handle handle;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        if (continuation instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1) {
            textFieldSelectionState$detectSelectionHandleDragGestures$1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1) continuation;
            if ((textFieldSelectionState$detectSelectionHandleDragGestures$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectSelectionHandleDragGestures$1.Camera2StreamConfigurationMap -= 2147483648;
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$12 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
                java.lang.Object obj = textFieldSelectionState$detectSelectionHandleDragGestures$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionState$detectSelectionHandleDragGestures$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef3.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
                    final kotlin.jvm.internal.Ref.LongRef longRef4 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef4.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    final androidx.compose.foundation.text.Handle handle2 = z ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd;
                    try {
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$fXxtd1QVF8cwlN2bJEdqphBJvEw(kotlin.jvm.internal.Ref.LongRef.this, this, z, handle2, longRef4, (androidx.compose.ui.geometry.Offset) obj2);
                            }
                        };
                        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2302$r8$lambda$c6AJbQ0Ra1PtU1K13GYxQZRLFY(kotlin.jvm.internal.Ref.LongRef.this, this, longRef4);
                            }
                        };
                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2304$r8$lambda$nEeC4uPeYNkrig6H5Qy7NFe6ow(kotlin.jvm.internal.Ref.LongRef.this, this, longRef4);
                            }
                        };
                        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2301$r8$lambda$ZvbrjfpnY6zjYBFh9zdRiXenfg(kotlin.jvm.internal.Ref.LongRef.this, this, handle2, longRef3, z, (androidx.compose.ui.input.pointer.PointerInputChange) obj2, (androidx.compose.ui.geometry.Offset) obj3);
                            }
                        };
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.getHighSpeedVideoSizes = longRef3;
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.getHighSpeedVideoFpsRangesFor = longRef4;
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.getHighSpeedVideoFpsRanges = handle2;
                        textFieldSelectionState$detectSelectionHandleDragGestures$12.Camera2StreamConfigurationMap = 1;
                        handle = handle2;
                        longRef = longRef4;
                        try {
                            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(pointerInputScope, function1, function0, function02, function2, textFieldSelectionState$detectSelectionHandleDragGestures$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            longRef2 = longRef3;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            longRef2 = longRef3;
                            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$MjPszjZri4JYIlaRsCC4il17F2Q(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, handle);
                                }
                            });
                            if (getDraggingHandle() == handle) {
                                getHighSpeedVideoFpsRanges(longRef2, this, longRef);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        handle = handle2;
                        longRef = longRef4;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    handle = (androidx.compose.foundation.text.Handle) textFieldSelectionState$detectSelectionHandleDragGestures$12.getHighSpeedVideoFpsRanges;
                    longRef = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectSelectionHandleDragGestures$12.getHighSpeedVideoFpsRangesFor;
                    longRef2 = (kotlin.jvm.internal.Ref.LongRef) textFieldSelectionState$detectSelectionHandleDragGestures$12.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$MjPszjZri4JYIlaRsCC4il17F2Q(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, handle);
                            }
                        });
                        if (getDraggingHandle() == handle) {
                        }
                        throw th;
                    }
                }
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$MjPszjZri4JYIlaRsCC4il17F2Q(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, handle);
                    }
                });
                if (getDraggingHandle() == handle) {
                    getHighSpeedVideoFpsRanges(longRef2, this, longRef);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        textFieldSelectionState$detectSelectionHandleDragGestures$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1(this, continuation);
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$122 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
        java.lang.Object obj2 = textFieldSelectionState$detectSelectionHandleDragGestures$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$detectSelectionHandleDragGestures$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.access$logDebug(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.$r8$lambda$MjPszjZri4JYIlaRsCC4il17F2Q(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, handle);
            }
        });
        if (getDraggingHandle() == handle) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.internal.Ref.LongRef longRef2) {
        if ((longRef.element & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            textFieldSelectionState.clearHandleDragging();
            longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            textFieldSelectionState.getOutputSizeshNQ4ISI = -1;
        }
    }

    public final androidx.compose.ui.geometry.Rect getDerivedVisibleContentBounds$foundation() {
        return (androidx.compose.ui.geometry.Rect) this.derivedVisibleContentBounds.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(r1, r5) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState getSelectionHandleState$foundation(boolean isStartHandle, boolean includePosition) {
        androidx.compose.ui.geometry.Rect visibleBounds;
        androidx.compose.foundation.text.Handle handle = isStartHandle ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd;
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
        }
        long selection = this.textFieldState.getVisualText().getSelection();
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(selection)) {
            return androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
        }
        long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(isStartHandle);
        if (getDirectDragGestureInitiator() == androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None) {
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = null;
            if (getDraggingHandle() != handle) {
                androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
                if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
                    textLayoutNodeCoordinates = null;
                }
                if (textLayoutNodeCoordinates != null) {
                    androidx.compose.ui.geometry.Rect visibleBounds2 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates);
                    if (visibleBounds2 != null) {
                    }
                }
            }
            if (!this.textFieldState.getVisualText().shouldShowSelection()) {
                return androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
            }
            androidx.compose.ui.text.style.ResolvedTextDirection bidiRunDirection = layoutResult.getBidiRunDirection(isStartHandle ? androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) : java.lang.Math.max(androidx.compose.ui.text.TextRange.m8034getEndimpl(selection) - 1, 0));
            boolean m8038getReversedimpl = androidx.compose.ui.text.TextRange.m8038getReversedimpl(selection);
            if (!includePosition) {
                highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            } else {
                androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates2 = this.textLayoutState.getTextLayoutNodeCoordinates();
                if (textLayoutNodeCoordinates2 != null && textLayoutNodeCoordinates2.isAttached()) {
                    layoutCoordinates = textLayoutNodeCoordinates2;
                }
                if (layoutCoordinates != null && (visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(layoutCoordinates)) != null) {
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2263coerceIn3MmeM6k(highResolutionOutputSizeshNQ4ISI, visibleBounds);
                }
            }
            return new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState(true, highResolutionOutputSizeshNQ4ISI, androidx.compose.foundation.text.TextLayoutHelperKt.getLineHeight(layoutResult, isStartHandle ? androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) : androidx.compose.ui.text.TextRange.m8034getEndimpl(selection)), bidiRunDirection, m8038getReversedimpl, null);
        }
        return androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.INSTANCE.getHidden();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighResolutionOutputSizeshNQ4ISI(boolean p0) {
        int m8034getEndimpl;
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        long selection = this.textFieldState.getVisualText().getSelection();
        if (p0) {
            m8034getEndimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(selection);
        } else {
            m8034getEndimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(selection);
        }
        return androidx.compose.foundation.text.selection.TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, m8034getEndimpl, p0, androidx.compose.ui.text.TextRange.m8038getReversedimpl(selection));
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m2309updateHandleDraggingUv8p0NA(androidx.compose.foundation.text.Handle handle, long position) {
        setDraggingHandle(handle);
        getHighSpeedVideoSizes(position);
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        getHighSpeedVideoSizes(androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
        Camera2StreamConfigurationMap(androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
    }

    public final boolean isCutAllowed() {
        return (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getTextFieldState().getVisualText().getSelection()) || !getEditable$foundation() || this.getHighSpeedVideoSizes) ? false : true;
    }

    public final java.lang.Object cut(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object clipEntry;
        androidx.compose.ui.text.AnnotatedString cutWithResult = cutWithResult();
        return (cutWithResult != null && (clipEntry = this.getHighSpeedVideoFpsRangesFor.setClipEntry(androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(cutWithResult), continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? clipEntry : kotlin.Unit.INSTANCE;
    }

    public final boolean isCopyAllowed() {
        return (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getTextFieldState().getVisualText().getSelection()) || this.getHighSpeedVideoSizes) ? false : true;
    }

    public static /* synthetic */ java.lang.Object copy$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionState.copy(z, continuation);
    }

    public final java.lang.Object copy(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object clipEntry;
        androidx.compose.ui.text.AnnotatedString copyWithResult$foundation = copyWithResult$foundation(z);
        return (copyWithResult$foundation != null && (clipEntry = this.getHighSpeedVideoFpsRangesFor.setClipEntry(androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(copyWithResult$foundation), continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? clipEntry : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString copyWithResult$foundation$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionState.copyWithResult$foundation(z);
    }

    public final java.lang.Object updateClipboardEntry(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object update = this.getOutputMinFrameDurationlomOqCM.update(continuation);
        return update == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? update : kotlin.Unit.INSTANCE;
    }

    public final boolean isPasteAllowed() {
        return getEditable$foundation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (getHighSpeedVideoSizes(r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        if (r12 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (getHighSpeedVideoSizes(r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object paste(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 textFieldSelectionState$paste$1;
        int i;
        androidx.compose.foundation.content.internal.ReceiveContentConfiguration invoke;
        androidx.compose.ui.platform.ClipEntry clipEntry;
        java.lang.String readPlainText;
        if (continuation instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1) {
            textFieldSelectionState$paste$1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1) continuation;
            if ((textFieldSelectionState$paste$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$paste$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = textFieldSelectionState$paste$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionState$paste$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> function0 = this.receiveContentConfiguration;
                    if (function0 == null || (invoke = function0.invoke()) == null) {
                        textFieldSelectionState$paste$1.Camera2StreamConfigurationMap = 1;
                    } else {
                        androidx.compose.ui.platform.Clipboard clipboard = this.getHighSpeedVideoFpsRangesFor;
                        textFieldSelectionState$paste$1.getHighSpeedVideoFpsRangesFor = invoke;
                        textFieldSelectionState$paste$1.Camera2StreamConfigurationMap = 2;
                        obj = clipboard.getClipEntry(textFieldSelectionState$paste$1);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                invoke = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) textFieldSelectionState$paste$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.platform.ClipEntry clipEntry2 = (androidx.compose.ui.platform.ClipEntry) obj;
                if (clipEntry2 != null) {
                    androidx.compose.foundation.content.TransferableContent onReceive = invoke.getReceiveContentListener().onReceive(new androidx.compose.foundation.content.TransferableContent(clipEntry2, clipEntry2.getClipMetadata(), androidx.compose.foundation.content.TransferableContent.Source.INSTANCE.m1375getClipboardkB6V9T0(), null, 8, null));
                    if (onReceive != null && (clipEntry = onReceive.getClipEntry()) != null && (readPlainText = androidx.compose.foundation.content.TransferableContent_androidKt.readPlainText(clipEntry)) != null) {
                        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, readPlainText, false, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                textFieldSelectionState$paste$1.getHighSpeedVideoFpsRangesFor = null;
                textFieldSelectionState$paste$1.Camera2StreamConfigurationMap = 3;
            }
        }
        textFieldSelectionState$paste$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1(this, continuation);
        java.lang.Object obj2 = textFieldSelectionState$paste$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$paste$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 textFieldSelectionState$pasteAsPlainText$1;
        int i;
        androidx.compose.ui.platform.ClipEntry clipEntry;
        if (continuation instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1) {
            textFieldSelectionState$pasteAsPlainText$1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1) continuation;
            if ((textFieldSelectionState$pasteAsPlainText$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$pasteAsPlainText$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = textFieldSelectionState$pasteAsPlainText$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionState$pasteAsPlainText$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.platform.Clipboard clipboard = this.getHighSpeedVideoFpsRangesFor;
                    textFieldSelectionState$pasteAsPlainText$1.getHighSpeedVideoFpsRanges = 1;
                    obj = clipboard.getClipEntry(textFieldSelectionState$pasteAsPlainText$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str = (java.lang.String) obj;
                        if (str != null) {
                            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, str, false, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                clipEntry = (androidx.compose.ui.platform.ClipEntry) obj;
                if (clipEntry != null) {
                    textFieldSelectionState$pasteAsPlainText$1.getHighSpeedVideoFpsRanges = 2;
                    obj = androidx.compose.foundation.internal.ClipboardUtils_androidKt.readText(clipEntry, textFieldSelectionState$pasteAsPlainText$1);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        textFieldSelectionState$pasteAsPlainText$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1(this, continuation);
        java.lang.Object obj2 = textFieldSelectionState$pasteAsPlainText$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionState$pasteAsPlainText$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        clipEntry = (androidx.compose.ui.platform.ClipEntry) obj2;
        if (clipEntry != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final boolean canShowSelectAllMenuItem() {
        return androidx.compose.ui.text.TextRange.m8035getLengthimpl(this.textFieldState.getVisualText().getSelection()) != this.textFieldState.getVisualText().length();
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    public final boolean canShowAutofillMenuItem() {
        return getEditable$foundation() && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.textFieldState.getVisualText().getSelection());
    }

    public final void autofill() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void deselect() {
        if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.textFieldState.getVisualText().getSelection())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None);
    }

    /* renamed from: updateSelection-SsL-Rf8$foundation$default, reason: not valid java name */
    public static /* synthetic */ long m2306updateSelectionSsLRf8$foundation$default(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, int i, int i2, boolean z, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment, boolean z2, boolean z3, int i3, java.lang.Object obj) {
        return textFieldSelectionState.m2310updateSelectionSsLRf8$foundation(textFieldCharSequence, i, i2, z, selectionAdjustment, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3);
    }

    /* renamed from: updateSelection-SsL-Rf8$foundation, reason: not valid java name */
    public final long m2310updateSelectionSsLRf8$foundation(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed, boolean isStartOfSelection) {
        long m2388toTextRanged9O1mEE;
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        androidx.compose.ui.text.TextRange m8027boximpl = androidx.compose.ui.text.TextRange.m8027boximpl(textFieldCharSequence.getSelection());
        long getHighResolutionOutputSizeshNQ4ISI = m8027boximpl.getGetHighResolutionOutputSizeshNQ4ISI();
        if (isStartOfSelection || (!allowPreviousSelectionCollapsed && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getHighResolutionOutputSizeshNQ4ISI))) {
            m8027boximpl = null;
        }
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            m2388toTextRanged9O1mEE = androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        } else if (m8027boximpl == null && kotlin.jvm.internal.Intrinsics.areEqual(adjustment, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacter())) {
            m2388toTextRanged9O1mEE = androidx.compose.ui.text.TextRangeKt.TextRange(startOffset, endOffset);
        } else {
            androidx.compose.foundation.text.selection.SelectionLayout m2402getTextFieldSelectionLayoutRcvTLA = androidx.compose.foundation.text.selection.SelectionLayoutKt.m2402getTextFieldSelectionLayoutRcvTLA(layoutResult, startOffset, endOffset, this.getOutputSizeshNQ4ISI, m8027boximpl != null ? m8027boximpl.getGetHighResolutionOutputSizeshNQ4ISI() : androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), m8027boximpl == null, isStartHandle);
            if (m8027boximpl != null && !m2402getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.getOutputFormats)) {
                m2388toTextRanged9O1mEE = m8027boximpl.getGetHighResolutionOutputSizeshNQ4ISI();
            } else {
                m2388toTextRanged9O1mEE = adjustment.adjust(m2402getTextFieldSelectionLayoutRcvTLA).m2388toTextRanged9O1mEE();
                this.getOutputFormats = m2402getTextFieldSelectionLayoutRcvTLA;
                this.getOutputSizeshNQ4ISI = !isStartHandle ? endOffset : startOffset;
            }
        }
        if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(m2388toTextRanged9O1mEE, textFieldCharSequence.getSelection())) {
            boolean z = androidx.compose.ui.text.TextRange.m8038getReversedimpl(m2388toTextRanged9O1mEE) != androidx.compose.ui.text.TextRange.m8038getReversedimpl(textFieldCharSequence.getSelection()) && androidx.compose.ui.text.TextRange.m8032equalsimpl0(androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2388toTextRanged9O1mEE), androidx.compose.ui.text.TextRange.m8039getStartimpl(m2388toTextRanged9O1mEE)), textFieldCharSequence.getSelection());
            if (isInTouchMode() && !z && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
            }
        }
        return m2388toTextRanged9O1mEE;
    }

    public final boolean canShowCutMenuItem() {
        return !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getTextFieldState().getVisualText().getSelection()) && getEditable$foundation() && !this.getHighSpeedVideoSizes && androidx.compose.foundation.internal.ClipboardUtils_androidKt.isWriteSupported(this.getHighSpeedVideoFpsRangesFor);
    }

    public final androidx.compose.ui.text.AnnotatedString cutWithResult() {
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getTextFieldState().getVisualText().getSelection()) || !getEditable$foundation() || this.getHighSpeedVideoSizes) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(this.textFieldState.getVisualText()).toString(), null, 2, null);
        this.textFieldState.deleteSelectedText();
        return annotatedString;
    }

    public final boolean canShowCopyMenuItem() {
        return (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getTextFieldState().getVisualText().getSelection()) || this.getHighSpeedVideoSizes || !androidx.compose.foundation.internal.ClipboardUtils_androidKt.isWriteSupported(this.getHighSpeedVideoFpsRangesFor)) ? false : true;
    }

    public final androidx.compose.ui.text.AnnotatedString copyWithResult$foundation(boolean cancelSelection) {
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getTextFieldState().getVisualText().getSelection()) || this.getHighSpeedVideoSizes) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString annotatedString = new androidx.compose.ui.text.AnnotatedString(androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(this.textFieldState.getVisualText()).toString(), null, 2, null);
        if (cancelSelection) {
            this.textFieldState.collapseSelectionToMax();
        }
        return annotatedString;
    }

    public final boolean canShowPasteMenuItem() {
        if (!getEditable$foundation() || !androidx.compose.foundation.internal.ClipboardUtils_androidKt.isReadSupported(this.getHighSpeedVideoFpsRangesFor)) {
            return false;
        }
        if (this.getOutputMinFrameDurationlomOqCM.getCamera2StreamConfigurationMap()) {
            return true;
        }
        kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> function0 = this.receiveContentConfiguration;
        return (function0 != null ? function0.invoke() : null) != null && this.getOutputMinFrameDurationlomOqCM.getGetHighSpeedVideoFpsRangesFor();
    }

    public final void onPasteEvent$foundation(androidx.compose.ui.text.AnnotatedString value) {
        if (getEditable$foundation()) {
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, value.getText(), false, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2NWoBWQu16F79WamnCMlVPRH00g(kotlin.jvm.internal.Ref.LongRef longRef, kotlin.jvm.internal.Ref.LongRef longRef2, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        getHighSpeedVideoSizes(longRef, longRef2, textFieldSelectionState);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3X0mw6glcO9nja-89pyW92Kxgg0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2299$r8$lambda$3X0mw6glcO9nja89pyW92Kxgg0(kotlin.jvm.internal.Ref.LongRef longRef, kotlin.jvm.internal.Ref.LongRef longRef2, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        getHighSpeedVideoSizes(longRef, longRef2, textFieldSelectionState);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LbnJ6RDB3rlwZZu7sDNWbfnGOmQ(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.internal.Ref.LongRef longRef2, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
        longRef.element = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(longRef.element, offset.m5762unboximpl());
        textFieldSelectionState.m2309updateHandleDraggingUv8p0NA(androidx.compose.foundation.text.Handle.Cursor, androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(longRef2.element, longRef.element));
        if (textFieldSelectionState.m2308placeCursorAtNearestOffsetk4lQ0M(textFieldSelectionState.m2307getHandleDragPositionF1C5BW0())) {
            pointerInputChange.consume();
            androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$MjPszjZri4JYIlaRsCC4il17F2Q(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.Handle handle) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Selection Handle drag cancelled for draggingHandle: ");
        sb.append(textFieldSelectionState.getDraggingHandle());
        sb.append(" definedOn: ");
        sb.append(handle);
        return sb.toString();
    }

    /* renamed from: $r8$lambda$ZvbrjfpnY6zjYBFh9zdRiX-enfg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2301$r8$lambda$ZvbrjfpnY6zjYBFh9zdRiXenfg(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.Handle handle, kotlin.jvm.internal.Ref.LongRef longRef2, boolean z, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
        int m8039getStartimpl;
        int m8011getOffsetForPositionk4lQ0M;
        longRef.element = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(longRef.element, offset.m5762unboximpl());
        androidx.compose.ui.text.TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
        if (layoutResult != null) {
            textFieldSelectionState.m2309updateHandleDraggingUv8p0NA(handle, androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(longRef2.element, longRef.element));
            if (z) {
                m8039getStartimpl = layoutResult.m8011getOffsetForPositionk4lQ0M(textFieldSelectionState.m2307getHandleDragPositionF1C5BW0());
            } else {
                m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldSelectionState.textFieldState.getVisualText().getSelection());
            }
            int i = m8039getStartimpl;
            if (z) {
                m8011getOffsetForPositionk4lQ0M = androidx.compose.ui.text.TextRange.m8034getEndimpl(textFieldSelectionState.textFieldState.getVisualText().getSelection());
            } else {
                m8011getOffsetForPositionk4lQ0M = layoutResult.m8011getOffsetForPositionk4lQ0M(textFieldSelectionState.m2307getHandleDragPositionF1C5BW0());
            }
            long selection = textFieldSelectionState.textFieldState.getVisualText().getSelection();
            long m2306updateSelectionSsLRf8$foundation$default = m2306updateSelectionSsLRf8$foundation$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), i, m8011getOffsetForPositionk4lQ0M, z, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), false, false, 96, null);
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(selection) || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2306updateSelectionSsLRf8$foundation$default)) {
                textFieldSelectionState.textFieldState.m2275selectCharsIn5zctL8(m2306updateSelectionSsLRf8$foundation$default);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c6AJ-bQ0Ra1PtU1K13GYxQZRLFY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2302$r8$lambda$c6AJbQ0Ra1PtU1K13GYxQZRLFY(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.internal.Ref.LongRef longRef2) {
        getHighSpeedVideoFpsRanges(longRef, textFieldSelectionState, longRef2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fXxtd1QVF8cwlN2bJEdqphBJvEw(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, androidx.compose.foundation.text.Handle handle, kotlin.jvm.internal.Ref.LongRef longRef2, androidx.compose.ui.geometry.Offset offset) {
        longRef.element = androidx.compose.foundation.text.selection.SelectionHandlesKt.m2398getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getHighResolutionOutputSizeshNQ4ISI(z));
        textFieldSelectionState.m2309updateHandleDraggingUv8p0NA(handle, longRef.element);
        longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        textFieldSelectionState.getOutputSizeshNQ4ISI = -1;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Rect $r8$lambda$jxSVhbxSqwojClui0XKiWfYB4p4(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        androidx.compose.ui.geometry.Rect rect;
        boolean m8033getCollapsedimpl = androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textFieldSelectionState.textFieldState.getVisualText().getSelection());
        if (((!m8033getCollapsedimpl || textFieldSelectionState.getHighSpeedVideoFpsRanges() != androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Cursor) && (m8033getCollapsedimpl || textFieldSelectionState.getHighSpeedVideoFpsRanges() != androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection)) || textFieldSelectionState.getDraggingHandle() != null || !textFieldSelectionState.isInTouchMode()) {
            return null;
        }
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textFieldSelectionState.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect visibleBounds = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates);
        androidx.compose.ui.geometry.Rect m5792Recttz77jQw = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(textLayoutNodeCoordinates.mo7364localToRootMKHz9U(visibleBounds.m5787getTopLeftF1C5BW0()), visibleBounds.m5785getSizeNHjbRc());
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates2 = textFieldSelectionState.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates2 == null || !textLayoutNodeCoordinates2.isAttached()) {
            textLayoutNodeCoordinates2 = null;
        }
        if (textLayoutNodeCoordinates2 != null) {
            androidx.compose.foundation.text.input.TextFieldCharSequence visualText = textFieldSelectionState.textFieldState.getVisualText();
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(visualText.getSelection())) {
                androidx.compose.ui.geometry.Rect cursorRect = textFieldSelectionState.getCursorRect();
                rect = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(textLayoutNodeCoordinates2.mo7364localToRootMKHz9U(cursorRect.m5787getTopLeftF1C5BW0()), cursorRect.m5785getSizeNHjbRc());
            } else {
                long mo7364localToRootMKHz9U = textLayoutNodeCoordinates2.mo7364localToRootMKHz9U(textFieldSelectionState.getHighResolutionOutputSizeshNQ4ISI(true));
                long mo7364localToRootMKHz9U2 = textLayoutNodeCoordinates2.mo7364localToRootMKHz9U(textFieldSelectionState.getHighResolutionOutputSizeshNQ4ISI(false));
                androidx.compose.ui.text.TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
                if (layoutResult == null) {
                    rect = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
                } else {
                    float top = layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m8039getStartimpl(visualText.getSelection())).getTop();
                    int i = (int) (mo7364localToRootMKHz9U >> 32);
                    int i2 = (int) (mo7364localToRootMKHz9U2 >> 32);
                    rect = new androidx.compose.ui.geometry.Rect(java.lang.Math.min(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (textLayoutNodeCoordinates2.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L))) & 4294967295L)), java.lang.Float.intBitsToFloat((int) (textLayoutNodeCoordinates2.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(layoutResult.getCursorRect(androidx.compose.ui.text.TextRange.m8034getEndimpl(visualText.getSelection())).getTop()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L))), java.lang.Math.max(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), java.lang.Math.max(java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U & 4294967295L)), java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U2 & 4294967295L))));
                }
            }
            if (rect.overlaps(m5792Recttz77jQw)) {
                return rect.intersect(m5792Recttz77jQw);
            }
            return null;
        }
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("textLayoutCoordinates should not be null.");
        throw new kotlin.KotlinNothingValueException();
    }

    /* renamed from: $r8$lambda$lu8V41_qcsAKmIo0-deTcPZcA7o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2303$r8$lambda$lu8V41_qcsAKmIo0deTcPZcA7o(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.internal.Ref.LongRef longRef2, androidx.compose.ui.geometry.Offset offset) {
        longRef.element = androidx.compose.foundation.text.selection.SelectionHandlesKt.m2398getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getCursorRect().m5779getBottomCenterF1C5BW0());
        longRef2.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        textFieldSelectionState.setInTouchMode(true);
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textFieldSelectionState.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        textFieldSelectionState.Camera2StreamConfigurationMap(textLayoutNodeCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(textLayoutNodeCoordinates) : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
        textFieldSelectionState.m2309updateHandleDraggingUv8p0NA(androidx.compose.foundation.text.Handle.Cursor, longRef.element);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nEeC4uP-eYNkrig6H5Qy7NFe6ow, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2304$r8$lambda$nEeC4uPeYNkrig6H5Qy7NFe6ow(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.jvm.internal.Ref.LongRef longRef2) {
        getHighSpeedVideoFpsRanges(longRef, textFieldSelectionState, longRef2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$hideTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
            textFieldSelectionState.getHighSpeedVideoFpsRanges.hide();
            return;
        }
        androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler textToolbarHandler = textFieldSelectionState.getHighSpeedVideoSizesFor;
        if (textToolbarHandler != null) {
            textToolbarHandler.hideTextToolbar();
        }
    }

    public static final /* synthetic */ void access$markStartContentVisibleOffset(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textFieldSelectionState.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        textFieldSelectionState.Camera2StreamConfigurationMap(textLayoutNodeCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(textLayoutNodeCoordinates) : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
    }

    public static final /* synthetic */ java.lang.Object access$observeTextChanges(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.drop(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.foundation.text.input.TextFieldCharSequence visualText;
                visualText = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.textFieldState.getVisualText();
                return visualText;
            }
        }), androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$3.getHighSpeedVideoFpsRangesFor), 1).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.setShowCursorHandle(false);
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.updateTextToolbarState(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None);
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$observeTextToolbarVisibility(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.geometry.Rect derivedVisibleContentBounds$foundation;
                derivedVisibleContentBounds$foundation = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this.getDerivedVisibleContentBounds$foundation();
                return derivedVisibleContentBounds$foundation;
            }
        });
        if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
            snapshotFlow = kotlinx.coroutines.flow.FlowKt.distinctUntilChangedBy(snapshotFlow, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m2300$r8$lambda$9_kQIPFxoiu5o4pm7KsR2mzK70((androidx.compose.ui.geometry.Rect) obj));
                }
            });
        }
        java.lang.Object collect = snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                androidx.compose.ui.geometry.Rect rect = (androidx.compose.ui.geometry.Rect) obj;
                if (rect != null) {
                    java.lang.Object access$showTextToolbar = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$showTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, rect, continuation2);
                    return access$showTextToolbar == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? access$showTextToolbar : kotlin.Unit.INSTANCE;
                }
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$hideTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this);
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$showTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation continuation) {
        if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
            textFieldSelectionState.getHighSpeedVideoFpsRanges.show();
        } else {
            androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler textToolbarHandler = textFieldSelectionState.getHighSpeedVideoSizesFor;
            if (textToolbarHandler != null) {
                java.lang.Object showTextToolbar = textToolbarHandler.showTextToolbar(textFieldSelectionState, rect, continuation);
                return showTextToolbar == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? showTextToolbar : kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void dispose() {
        if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
            this.getHighSpeedVideoFpsRanges.hide();
        } else {
            androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler textToolbarHandler = this.getHighSpeedVideoSizesFor;
            if (textToolbarHandler != null) {
                textToolbarHandler.hideTextToolbar();
            }
        }
        this.hapticFeedBack = null;
    }

    public final void update(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack, androidx.compose.ui.platform.Clipboard clipboard, androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler showTextToolbar, androidx.compose.ui.unit.Density density, boolean enabled, boolean readOnly, boolean isPassword) {
        if (!enabled) {
            if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                this.getHighSpeedVideoFpsRanges.hide();
            } else {
                androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler textToolbarHandler = this.getHighSpeedVideoSizesFor;
                if (textToolbarHandler != null) {
                    textToolbarHandler.hideTextToolbar();
                }
            }
        }
        this.hapticFeedBack = hapticFeedBack;
        this.getHighSpeedVideoFpsRangesFor = clipboard;
        this.getHighSpeedVideoSizesFor = showTextToolbar;
        this.Camera2StreamConfigurationMap = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.getHighSpeedVideoSizes = isPassword;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.input.internal.IndexTransformationType.values().length];
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Insertion.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.IndexTransformationType.Replacement.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
