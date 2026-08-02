package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010\"\u001a\u00020\bH\u0000¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\bH\u0080@¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0006\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0000¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b-\u0010$J\u000f\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b/\u0010$J\u000f\u00100\u001a\u00020\u000bH\u0000¢\u0006\u0004\b0\u0010$J\u000f\u00101\u001a\u00020\u000bH\u0000¢\u0006\u0004\b1\u0010$J\u001b\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00102\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u0004\u0018\u0001062\b\b\u0002\u00102\u001a\u00020\u000bH\u0000¢\u0006\u0004\b7\u00108J\u0011\u00109\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u00109\u001a\u00020\b2\u0006\u0010;\u001a\u000206H\u0000¢\u0006\u0004\b9\u0010<J\u0011\u0010=\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0004\b=\u0010:J\u0011\u0010>\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\bH\u0000¢\u0006\u0004\b@\u0010\u0016J\u000f\u0010A\u001a\u00020\bH\u0000¢\u0006\u0004\bA\u0010\u0016J\u0017\u0010D\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010L\u001a\u00020\u00172\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\bM\u0010\u0014J\u000f\u0010N\u001a\u00020\bH\u0000¢\u0006\u0004\bN\u0010\u0016J\u0011\u0010O\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\bO\u0010:J\u000f\u0010P\u001a\u00020\bH\u0000¢\u0006\u0004\bP\u0010\u0016J\u0015\u0010R\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bQ\u0010\u001eJ\u000f\u0010S\u001a\u00020\u000bH\u0000¢\u0006\u0004\bS\u0010$J\u000f\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ?\u0010M\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020\u000bH\u0002¢\u0006\u0004\bM\u0010^J\u0017\u0010M\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020_H\u0002¢\u0006\u0004\bM\u0010`J\u001f\u0010a\u001a\u00020W2\u0006\u0010\u0007\u001a\u0002062\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u0010bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010c\u001a\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR.\u0010n\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0m8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010u\u001a\u0004\u0018\u00010t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020W0{8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b|\u0010}R'\u0010~\u001a\u00020W2\u0006\u0010~\u001a\u00020W8A@AX\u0080\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u0004\u0018\u0001068AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010?R*\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R2\u0010\u008d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u008c\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R,\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R,\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R,\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R,\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R,\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R,\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R0\u0010Á\u0001\u001a\u00020\u000b2\u0007\u0010½\u0001\u001a\u00020\u000b8G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\b¾\u0001\u0010}\u001a\u0005\b¿\u0001\u0010$\"\u0005\bÀ\u0001\u0010\u0014R0\u0010Å\u0001\u001a\u00020\u000b2\u0007\u0010½\u0001\u001a\u00020\u000b8G@GX\u0087\u008e\u0002¢\u0006\u0015\n\u0005\bÂ\u0001\u0010}\u001a\u0005\bÃ\u0001\u0010$\"\u0005\bÄ\u0001\u0010\u0014R\u0017\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b*\u0010Æ\u0001R\u0019\u0010M\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\t\u0010Ç\u0001R\u0017\u0010\t\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\ba\u0010Æ\u0001R8\u0010Î\u0001\u001a\u0005\u0018\u00010È\u00012\n\u0010½\u0001\u001a\u0005\u0018\u00010È\u00018G@CX\u0087\u008e\u0002¢\u0006\u0017\n\u0005\bÉ\u0001\u0010}\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R5\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010½\u0001\u001a\u0004\u0018\u00010\u00178G@CX\u0087\u008e\u0002¢\u0006\u0016\n\u0005\bÏ\u0001\u0010}\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0005\bÒ\u0001\u0010\u001aR\u0019\u0010a\u001a\u00030Ô\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u0017\u0010O\u001a\u00020W8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bM\u0010×\u0001R\u001c\u0010Õ\u0001\u001a\u0005\u0018\u00010Ø\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010Û\u0001\u001a\u0004\u0018\u00010\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\bÛ\u0001\u0010Ç\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0005\bÞ\u0001\u0010\nR,\u0010ß\u0001\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010}\u001a\u0004\bM\u0010$\"\u0004\b\t\u0010\u0014R1\u0010á\u0001\u001a\u00030à\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u001f\n\u0006\bá\u0001\u0010â\u0001\u0012\u0005\bç\u0001\u0010\u0016\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R\u0015\u0010ë\u0001\u001a\u00030è\u00018G¢\u0006\b\u001a\u0006\bé\u0001\u0010ê\u0001R\u001e\u0010ì\u0001\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\u000f\n\u0006\bì\u0001\u0010í\u0001\u001a\u0005\bî\u0001\u0010\u0011R \u0010ð\u0001\u001a\u00030ï\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R'\u0010ô\u0001\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0005\bö\u0001\u0010$\"\u0005\b÷\u0001\u0010\u0014R\u001d\u0010ú\u0001\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\u000e\u0012\u0005\bù\u0001\u0010\u0016\u001a\u0005\bø\u0001\u0010$R\u0014\u0010|\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010$R\u0015\u0010Ù\u0001\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010$"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "Landroidx/compose/ui/text/TextRange;", "p0", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/text/TextRange;)V", "", "isStartHandle", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver$foundation", "()Landroidx/compose/foundation/text/TextDragObserver;", "showFloatingToolbar", "enterSelectionMode$foundation", "(Z)V", "exitSelectionMode$foundation", "()V", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "deselect-_kEHs6E$foundation", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "range", "setSelectionPreviewHighlight-5zc-tL8$foundation", "(J)V", "setSelectionPreviewHighlight", "setDeletionPreviewHighlight-5zc-tL8$foundation", "setDeletionPreviewHighlight", "clearPreviewHighlight$foundation", "canShowCopyMenuItem$foundation", "()Z", "isCopyAllowed$foundation", "updateClipboardEntry$foundation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Pair;", "", "Camera2StreamConfigurationMap", "()Lkotlin/Pair;", "canShowPasteMenuItem$foundation", "isPasteAllowed$foundation", "canShowCutMenuItem$foundation", "isCutAllowed$foundation", "canShowSelectAllMenuItem$foundation", "canShowAutofillMenuItem$foundation", "cancelSelection", "Lkotlinx/coroutines/Job;", "copy$foundation", "(Z)Lkotlinx/coroutines/Job;", "Landroidx/compose/ui/text/AnnotatedString;", "copyWithResult$foundation", "(Z)Landroidx/compose/ui/text/AnnotatedString;", "paste$foundation", "()Lkotlinx/coroutines/Job;", "text", "(Landroidx/compose/ui/text/AnnotatedString;)V", "cut$foundation", "cutWithResult$foundation", "()Landroidx/compose/ui/text/AnnotatedString;", "selectAll$foundation", "autofill$foundation", "getHandlePosition-tuRUvjQ$foundation", "(Z)J", "getHandlePosition", "", "getHandleLineHeight$foundation", "(Z)F", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "getHighResolutionOutputSizeshNQ4ISI", "showSelectionToolbar$foundation", "getInputFormats", "hideSelectionToolbar$foundation", "selectWordAtPositionIfNotAlreadySelected-k-4lQ0M", "selectWordAtPositionIfNotAlreadySelected", "isTextChanged$foundation", "Landroidx/compose/ui/geometry/Rect;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/input/TextFieldValue;", "p1", "p2", "p3", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "p4", "p5", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "Landroidx/compose/foundation/text/HandleState;", "(Landroidx/compose/foundation/text/HandleState;)V", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Lkotlin/Function1;", "onValueChange", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$foundation", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizesFor", "Landroidx/compose/runtime/MutableState;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue$foundation", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "getTransformedText$foundation", "transformedText", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "Lkotlin/Function0;", "requestAutofillAction", "Lkotlin/jvm/functions/Function0;", "getRequestAutofillAction$foundation", "()Lkotlin/jvm/functions/Function0;", "setRequestAutofillAction$foundation", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/platform/Clipboard;", "clipboard", "Landroidx/compose/ui/platform/Clipboard;", "getClipboard$foundation", "()Landroidx/compose/ui/platform/Clipboard;", "setClipboard$foundation", "(Landroidx/compose/ui/platform/Clipboard;)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$foundation", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$foundation", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "platformSelectionBehaviors", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "getPlatformSelectionBehaviors$foundation", "()Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "setPlatformSelectionBehaviors$foundation", "(Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "editable$delegate", "getEditable", "setEditable", "editable", "enabled$delegate", "getEnabled", "setEnabled", "enabled", "J", "Landroidx/compose/ui/text/TextRange;", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "", "getOutputMinFrameDuration", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "latestSelection", "getLatestSelection-MzsxiRA$foundation", "()Landroidx/compose/ui/text/TextRange;", "setLatestSelection-OEnZFl4$foundation", "getOutputFormats", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "toolbarRequester", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "getToolbarRequester$foundation", "()Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "setToolbarRequester$foundation", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;)V", "getToolbarRequester$foundation$annotations", "Landroidx/compose/ui/Modifier;", "getContextMenuAreaModifier", "()Landroidx/compose/ui/Modifier;", "contextMenuAreaModifier", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "textToolbarShownViaProvider", "Z", "getTextToolbarShownViaProvider$foundation", "setTextToolbarShownViaProvider$foundation", "getTextToolbarShown$foundation", "getTextToolbarShown$foundation$annotations", "textToolbarShown"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private long Camera2StreamConfigurationMap;
    private androidx.compose.ui.platform.Clipboard clipboard;
    private kotlinx.coroutines.CoroutineScope coroutineScope;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentDragPosition;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState draggingHandle;

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState editable;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState enabled;
    private androidx.compose.ui.focus.FocusRequester focusRequester;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.TextFieldValue getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.text.TextRange getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.text.selection.SelectionLayout getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
    private androidx.compose.ui.text.TextRange latestSelection;
    private final androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver;
    private androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange;
    private androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors;
    private kotlin.jvm.functions.Function0<kotlin.Unit> requestAutofillAction;
    private androidx.compose.foundation.text.LegacyTextFieldState state;
    private androidx.compose.ui.platform.TextToolbar textToolbar;
    private boolean textToolbarShownViaProvider;
    private androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester;
    private final androidx.compose.foundation.text.TextDragObserver touchSelectionObserver;
    private final androidx.compose.foundation.text.UndoManager undoManager;
    private androidx.compose.ui.text.input.VisualTransformation visualTransformation;

    public static /* synthetic */ void getTextToolbarShown$foundation$annotations() {
    }

    public static /* synthetic */ void getToolbarRequester$foundation$annotations() {
    }

    public TextFieldSelectionManager(androidx.compose.foundation.text.UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = androidx.compose.foundation.text.ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit inputSizeshNQ4ISI;
                inputSizeshNQ4ISI = androidx.compose.foundation.text.selection.TextFieldSelectionManager.getInputSizeshNQ4ISI();
                return inputSizeshNQ4ISI;
            }
        };
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue((java.lang.String) null, 0L, (androidx.compose.ui.text.TextRange) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = androidx.compose.ui.text.input.VisualTransformation.INSTANCE.getNone();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.editable = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.Camera2StreamConfigurationMap = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        this.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        this.draggingHandle = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.getHighSpeedVideoFpsRanges = -1;
        this.getInputFormats = new androidx.compose.ui.text.input.TextFieldValue((java.lang.String) null, 0L, (androidx.compose.ui.text.TextRange) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.getOutputFormats = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.toolbarRequester = new androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl();
        this.touchSelectionObserver = new androidx.compose.foundation.text.TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private androidx.compose.ui.text.TextRange getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private boolean Camera2StreamConfigurationMap = true;

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private androidx.compose.foundation.text.selection.SelectionAdjustment getHighSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public final void mo2103onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public final void mo2105onStart3MmeM6k(long startPoint, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                androidx.compose.ui.text.input.TextFieldValue highSpeedVideoFpsRanges;
                long j;
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult2;
                long highResolutionOutputSizeshNQ4ISI;
                if (androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getEnabled() && androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getDraggingHandle() == null) {
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(androidx.compose.foundation.text.Handle.SelectionEnd);
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoFpsRanges = -1;
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoFpsRanges = selectionAdjustment;
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.hideSelectionToolbar$foundation();
                    androidx.compose.foundation.text.LegacyTextFieldState state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                    if (state == null || (layoutResult2 = state.getLayoutResult()) == null || !layoutResult2.m2137isPositionOnTextk4lQ0M(startPoint)) {
                        androidx.compose.foundation.text.LegacyTextFieldState state2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                        if (state2 != null && (layoutResult = state2.getLayoutResult()) != null) {
                            androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                            int transformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(androidx.compose.foundation.text.TextLayoutResultProxy.m2135getOffsetForPosition3MmeM6k$default(layoutResult, startPoint, false, 2, null));
                            highSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.TextFieldSelectionManager.getHighSpeedVideoFpsRanges(textFieldSelectionManager.getValue$foundation().getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation(false);
                            androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation().invoke(highSpeedVideoFpsRanges);
                            textFieldSelectionManager.m2450setLatestSelectionOEnZFl4$foundation(androidx.compose.ui.text.TextRange.m8027boximpl(highSpeedVideoFpsRanges.getSelection()));
                        }
                        this.Camera2StreamConfigurationMap = false;
                    } else {
                        if (androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0) {
                            return;
                        }
                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.enterSelectionMode$foundation(false);
                        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                        highResolutionOutputSizeshNQ4ISI = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation(), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 5, (java.lang.Object) null), startPoint, true, false, this.getHighSpeedVideoFpsRanges, true);
                        androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.text.TextRange.m8027boximpl(highResolutionOutputSizeshNQ4ISI);
                        this.getHighSpeedVideoSizes = androidx.compose.ui.text.TextRange.m8027boximpl(highResolutionOutputSizeshNQ4ISI);
                    }
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HandleState.None);
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.Camera2StreamConfigurationMap = startPoint;
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                    j = textFieldSelectionManager3.Camera2StreamConfigurationMap;
                    textFieldSelectionManager3.m2442setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(j));
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x010e  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void mo2104onDragk4lQ0M(long delta) {
                long j;
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                long j2;
                long j3;
                androidx.compose.ui.text.TextRange textRange;
                androidx.compose.ui.text.TextRange textRange2;
                long j4;
                int m2136getOffsetForPosition3MmeM6k;
                androidx.compose.ui.text.TextRange textRange3;
                long highResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.text.TextRange textRange4;
                long j5;
                androidx.compose.foundation.text.selection.SelectionAdjustment word;
                if (!androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getEnabled() || androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0) {
                    return;
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                j = textFieldSelectionManager.getHighSpeedVideoSizes;
                textFieldSelectionManager.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j, delta);
                androidx.compose.foundation.text.LegacyTextFieldState state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                    j2 = textFieldSelectionManager2.Camera2StreamConfigurationMap;
                    j3 = textFieldSelectionManager2.getHighSpeedVideoSizes;
                    textFieldSelectionManager2.m2442setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j2, j3)));
                    textRange = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI;
                    if (textRange == null) {
                        androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m2444getCurrentDragPosition_m7T9E();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(m2444getCurrentDragPosition_m7T9E);
                        if (!layoutResult.m2137isPositionOnTextk4lQ0M(m2444getCurrentDragPosition_m7T9E.m5762unboximpl())) {
                            androidx.compose.ui.text.input.OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                            j5 = textFieldSelectionManager2.Camera2StreamConfigurationMap;
                            int transformedToOriginal = offsetMapping.transformedToOriginal(androidx.compose.foundation.text.TextLayoutResultProxy.m2135getOffsetForPosition3MmeM6k$default(layoutResult, j5, false, 2, null));
                            androidx.compose.ui.text.input.OffsetMapping offsetMapping2 = textFieldSelectionManager2.getOffsetMapping();
                            androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m2444getCurrentDragPosition_m7T9E();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(m2444getCurrentDragPosition_m7T9E2);
                            if (transformedToOriginal == offsetMapping2.transformedToOriginal(androidx.compose.foundation.text.TextLayoutResultProxy.m2135getOffsetForPosition3MmeM6k$default(layoutResult, m2444getCurrentDragPosition_m7T9E2.m5762unboximpl(), false, 2, null))) {
                                word = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();
                            } else {
                                word = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord();
                            }
                            androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment = word;
                            androidx.compose.ui.text.input.TextFieldValue value$foundation = textFieldSelectionManager2.getValue$foundation();
                            androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E3 = textFieldSelectionManager2.m2444getCurrentDragPosition_m7T9E();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(m2444getCurrentDragPosition_m7T9E3);
                            highResolutionOutputSizeshNQ4ISI = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI(value$foundation, m2444getCurrentDragPosition_m7T9E3.m5762unboximpl(), false, false, selectionAdjustment, true);
                            this.getHighSpeedVideoSizes = androidx.compose.ui.text.TextRange.m8027boximpl(highResolutionOutputSizeshNQ4ISI);
                            textRange4 = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI;
                            if (!androidx.compose.ui.text.TextRange.m8031equalsimpl(highResolutionOutputSizeshNQ4ISI, textRange4)) {
                                this.Camera2StreamConfigurationMap = false;
                            }
                        }
                    }
                    textRange2 = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI;
                    if (textRange2 != null) {
                        m2136getOffsetForPosition3MmeM6k = androidx.compose.ui.text.TextRange.m8039getStartimpl(textRange2.getGetHighResolutionOutputSizeshNQ4ISI());
                    } else {
                        j4 = textFieldSelectionManager2.Camera2StreamConfigurationMap;
                        m2136getOffsetForPosition3MmeM6k = layoutResult.m2136getOffsetForPosition3MmeM6k(j4, false);
                    }
                    androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E4 = textFieldSelectionManager2.m2444getCurrentDragPosition_m7T9E();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(m2444getCurrentDragPosition_m7T9E4);
                    int m2136getOffsetForPosition3MmeM6k2 = layoutResult.m2136getOffsetForPosition3MmeM6k(m2444getCurrentDragPosition_m7T9E4.m5762unboximpl(), false);
                    textRange3 = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI;
                    if (textRange3 == null && m2136getOffsetForPosition3MmeM6k == m2136getOffsetForPosition3MmeM6k2) {
                        return;
                    }
                    androidx.compose.ui.text.input.TextFieldValue value$foundation2 = textFieldSelectionManager2.getValue$foundation();
                    androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E5 = textFieldSelectionManager2.m2444getCurrentDragPosition_m7T9E();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(m2444getCurrentDragPosition_m7T9E5);
                    highResolutionOutputSizeshNQ4ISI = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI(value$foundation2, m2444getCurrentDragPosition_m7T9E5.m5762unboximpl(), false, false, this.getHighSpeedVideoFpsRanges, true);
                    this.getHighSpeedVideoSizes = androidx.compose.ui.text.TextRange.m8027boximpl(highResolutionOutputSizeshNQ4ISI);
                    textRange4 = textFieldSelectionManager2.getHighResolutionOutputSizeshNQ4ISI;
                    if (!androidx.compose.ui.text.TextRange.m8031equalsimpl(highResolutionOutputSizeshNQ4ISI, textRange4)) {
                    }
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                Camera2StreamConfigurationMap();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                Camera2StreamConfigurationMap();
            }

            private final void Camera2StreamConfigurationMap() {
                androidx.compose.ui.text.TextRange textRange;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(null);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2442setCurrentDragPosition_kEHs6E(null);
                this.getHighSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(true);
                androidx.compose.ui.text.TextRange textRange2 = this.getHighSpeedVideoSizes;
                boolean m8033getCollapsedimpl = androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textRange2 != null ? textRange2.getGetHighResolutionOutputSizeshNQ4ISI() : androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation().getSelection());
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(m8033getCollapsedimpl ? androidx.compose.foundation.text.HandleState.Cursor : androidx.compose.foundation.text.HandleState.Selection);
                androidx.compose.foundation.text.LegacyTextFieldState state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state != null) {
                    state.setShowSelectionHandleStart(!m8033getCollapsedimpl && androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, true));
                }
                androidx.compose.foundation.text.LegacyTextFieldState state2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state2 != null) {
                    state2.setShowSelectionHandleEnd(!m8033getCollapsedimpl && androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false));
                }
                androidx.compose.foundation.text.LegacyTextFieldState state3 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state3 != null) {
                    state3.setShowCursorHandle(m8033getCollapsedimpl && androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, true));
                }
                if (this.Camera2StreamConfigurationMap) {
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                    textRange = textFieldSelectionManager.getHighResolutionOutputSizeshNQ4ISI;
                    textFieldSelectionManager.getHighSpeedVideoSizes(textRange);
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        };
        this.mouseSelectionObserver = new androidx.compose.foundation.text.selection.MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            private androidx.compose.ui.text.TextRange initialSelection;
            private boolean isDoubleOrTripleClickSelectionOnly = true;

            /* renamed from: isDoubleOrTripleClickSelectionOnly, reason: from getter */
            public final boolean getIsDoubleOrTripleClickSelectionOnly() {
                return this.isDoubleOrTripleClickSelectionOnly;
            }

            public final void setDoubleOrTripleClickSelectionOnly(boolean z) {
                this.isDoubleOrTripleClickSelectionOnly = z;
            }

            public final androidx.compose.ui.text.TextRange getInitialSelection() {
                return this.initialSelection;
            }

            public final void setInitialSelection(androidx.compose.ui.text.TextRange textRange) {
                this.initialSelection = textRange;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public final boolean mo2312onExtendk4lQ0M(long downPosition) {
                androidx.compose.foundation.text.LegacyTextFieldState state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state == null || state.getLayoutResult() == null || !androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getEnabled()) {
                    return false;
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoFpsRanges = -1;
                androidx.compose.ui.focus.FocusRequester focusRequester = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                updateMouseSelection(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation(), downPosition, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public final boolean mo2313onExtendDragk4lQ0M(long dragPosition) {
                androidx.compose.foundation.text.LegacyTextFieldState state;
                if (!androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getEnabled() || androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0 || (state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation(), dragPosition, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public final boolean mo2314onStart9KIMszo(long downPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, int clickCount) {
                androidx.compose.foundation.text.LegacyTextFieldState state;
                long j;
                if (!androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getEnabled() || androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0 || (state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                androidx.compose.ui.focus.FocusRequester focusRequester = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.Camera2StreamConfigurationMap = downPosition;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoFpsRanges = -1;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.enterSelectionMode$foundation$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, false, 1, null);
                androidx.compose.ui.text.input.TextFieldValue value$foundation = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation();
                j = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.Camera2StreamConfigurationMap;
                long updateMouseSelection = updateMouseSelection(value$foundation, j, true, adjustment);
                if (clickCount >= 2) {
                    this.isDoubleOrTripleClickSelectionOnly = true;
                    this.initialSelection = androidx.compose.ui.text.TextRange.m8027boximpl(updateMouseSelection);
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public final boolean mo2311onDrag3MmeM6k(long dragPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
                androidx.compose.foundation.text.LegacyTextFieldState state;
                if (!androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getEnabled() || androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation().getText().length() == 0 || (state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getValue$foundation(), dragPosition, false, adjustment);
                return true;
            }

            public final long updateMouseSelection(androidx.compose.ui.text.input.TextFieldValue value, long currentPosition, boolean isStartOfSelection, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment) {
                long highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(value, currentPosition, isStartOfSelection, false, adjustment, false);
                if (!androidx.compose.ui.text.TextRange.m8031equalsimpl(highResolutionOutputSizeshNQ4ISI, this.initialSelection)) {
                    this.isDoubleOrTripleClickSelectionOnly = false;
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highResolutionOutputSizeshNQ4ISI) ? androidx.compose.foundation.text.HandleState.Cursor : androidx.compose.foundation.text.HandleState.Selection);
                return highResolutionOutputSizeshNQ4ISI;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final void onDragDone() {
                if (this.isDoubleOrTripleClickSelectionOnly) {
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoSizes(this.initialSelection);
                }
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(androidx.compose.foundation.text.UndoManager undoManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager);
    }

    public final androidx.compose.foundation.text.UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* renamed from: getOffsetMapping$foundation, reason: from getter */
    public final androidx.compose.ui.text.input.OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping$foundation(androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getInputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> getOnValueChange$foundation() {
        return this.onValueChange;
    }

    public final void setOnValueChange$foundation(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1) {
        this.onValueChange = function1;
    }

    /* renamed from: getState$foundation, reason: from getter */
    public final androidx.compose.foundation.text.LegacyTextFieldState getState() {
        return this.state;
    }

    public final void setState$foundation(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final androidx.compose.ui.text.input.TextFieldValue getValue$foundation() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public final void setValue$foundation(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        this.getHighSpeedVideoFpsRangesFor.setValue(textFieldValue);
        this.latestSelection = androidx.compose.ui.text.TextRange.m8027boximpl(textFieldValue.getSelection());
    }

    public final androidx.compose.ui.text.AnnotatedString getTransformedText$foundation() {
        androidx.compose.foundation.text.TextDelegate textDelegate;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    /* renamed from: getVisualTransformation$foundation, reason: from getter */
    public final androidx.compose.ui.text.input.VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final void setVisualTransformation$foundation(androidx.compose.ui.text.input.VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRequestAutofillAction$foundation() {
        return this.requestAutofillAction;
    }

    public final void setRequestAutofillAction$foundation(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.requestAutofillAction = function0;
    }

    /* renamed from: getClipboard$foundation, reason: from getter */
    public final androidx.compose.ui.platform.Clipboard getClipboard() {
        return this.clipboard;
    }

    public final void setClipboard$foundation(androidx.compose.ui.platform.Clipboard clipboard) {
        this.clipboard = clipboard;
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

    public final androidx.compose.ui.platform.TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(androidx.compose.ui.platform.TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final androidx.compose.ui.hapticfeedback.HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((java.lang.Boolean) this.editable.getValue()).booleanValue();
    }

    public final void setEditable(boolean z) {
        this.editable.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((java.lang.Boolean) this.enabled.getValue()).booleanValue();
    }

    public final void setEnabled(boolean z) {
        this.enabled.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(androidx.compose.foundation.text.Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.Handle getDraggingHandle() {
        return (androidx.compose.foundation.text.Handle) this.draggingHandle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m2442setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E() {
        return (androidx.compose.ui.geometry.Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getLatestSelection-MzsxiRA$foundation, reason: not valid java name and from getter */
    public final androidx.compose.ui.text.TextRange getLatestSelection() {
        return this.latestSelection;
    }

    /* renamed from: setLatestSelection-OEnZFl4$foundation, reason: not valid java name */
    public final void m2450setLatestSelectionOEnZFl4$foundation(androidx.compose.ui.text.TextRange textRange) {
        this.latestSelection = textRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return ((java.lang.Boolean) this.getOutputFormats.getValue()).booleanValue();
    }

    private final void getHighSpeedVideoSizes(boolean z) {
        this.getOutputFormats.setValue(java.lang.Boolean.valueOf(z));
    }

    /* renamed from: getToolbarRequester$foundation, reason: from getter */
    public final androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester getToolbarRequester() {
        return this.toolbarRequester;
    }

    public final void setToolbarRequester$foundation(androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester) {
        this.toolbarRequester = toolbarRequester;
    }

    public final androidx.compose.ui.Modifier getContextMenuAreaModifier() {
        return !getEnabled() ? androidx.compose.ui.Modifier.INSTANCE : androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt.textContextMenuToolbarHandler(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(androidx.compose.ui.Modifier.INSTANCE, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.selection.TextFieldSelectionManager.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, (androidx.compose.ui.layout.LayoutCoordinates) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2;
        androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor = textFieldSelectionManager.getHighSpeedVideoFpsRangesFor();
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
        if (legacyTextFieldState == null || (layoutCoordinates2 = legacyTextFieldState.getLayoutCoordinates()) == null) {
            return null;
        }
        return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerModifierKt.translateRootToDestination(highSpeedVideoFpsRangesFor, layoutCoordinates2, layoutCoordinates);
    }

    /* renamed from: getTouchSelectionObserver$foundation, reason: from getter */
    public final androidx.compose.foundation.text.TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    /* renamed from: getMouseSelectionObserver$foundation, reason: from getter */
    public final androidx.compose.foundation.text.selection.MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(androidx.compose.ui.text.TextRange p0) {
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors;
        androidx.compose.ui.text.AnnotatedString transformedText$foundation;
        java.lang.String text;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        if (p0 == null || (platformSelectionBehaviors = this.platformSelectionBehaviors) == null || (transformedText$foundation = getTransformedText$foundation()) == null || (text = transformedText$foundation.getText()) == null) {
            return;
        }
        androidx.compose.ui.text.input.OffsetMapping offsetMapping = this.offsetMapping;
        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(p0.getGetHighResolutionOutputSizeshNQ4ISI())), offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(p0.getGetHighResolutionOutputSizeshNQ4ISI())));
        if (text.length() <= 0 || androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(TextRange) || (coroutineScope = this.coroutineScope) == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1(platformSelectionBehaviors, text, TextRange, p0, this, offsetMapping, null), 3, null);
    }

    public final androidx.compose.foundation.text.TextDragObserver handleDragObserver$foundation(final boolean isStartHandle) {
        return new androidx.compose.foundation.text.TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public final void mo2105onStart3MmeM6k(long startPoint, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public final void mo2103onDownk4lQ0M(long point) {
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(isStartHandle ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd);
                long m2398getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m2398getAdjustedCoordinatesk4lQ0M(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2446getHandlePositiontuRUvjQ$foundation(isStartHandle));
                androidx.compose.foundation.text.LegacyTextFieldState state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long m2139translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m2139translateInnerToDecorationCoordinatesMKHz9U$foundation(m2398getAdjustedCoordinatesk4lQ0M);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.Camera2StreamConfigurationMap = m2139translateInnerToDecorationCoordinatesMKHz9U$foundation;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2442setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(m2139translateInnerToDecorationCoordinatesMKHz9U$foundation));
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoFpsRanges = -1;
                androidx.compose.foundation.text.LegacyTextFieldState state2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state2 != null) {
                    state2.setInTouchMode(true);
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(null);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2442setCurrentDragPosition_kEHs6E(null);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public final void mo2104onDragk4lQ0M(long delta) {
                long j;
                long j2;
                long j3;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                j = textFieldSelectionManager.getHighSpeedVideoSizes;
                textFieldSelectionManager.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j, delta);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.Camera2StreamConfigurationMap;
                j3 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoSizes;
                textFieldSelectionManager2.m2442setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j2, j3)));
                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager3 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                androidx.compose.ui.text.input.TextFieldValue value$foundation = textFieldSelectionManager3.getValue$foundation();
                androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2444getCurrentDragPosition_m7T9E();
                kotlin.jvm.internal.Intrinsics.checkNotNull(m2444getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.getHighResolutionOutputSizeshNQ4ISI(value$foundation, m2444getCurrentDragPosition_m7T9E.m5762unboximpl(), false, isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(null);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2442setCurrentDragPosition_kEHs6E(null);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(true);
            }
        };
    }

    public final androidx.compose.foundation.text.TextDragObserver cursorDragObserver$foundation() {
        return new androidx.compose.foundation.text.TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public final void mo2103onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(null);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2442setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public final void mo2105onStart3MmeM6k(long startPoint, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment) {
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                long m2398getAdjustedCoordinatesk4lQ0M = androidx.compose.foundation.text.selection.SelectionHandlesKt.m2398getAdjustedCoordinatesk4lQ0M(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2446getHandlePositiontuRUvjQ$foundation(true));
                androidx.compose.foundation.text.LegacyTextFieldState state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long m2139translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m2139translateInnerToDecorationCoordinatesMKHz9U$foundation(m2398getAdjustedCoordinatesk4lQ0M);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.Camera2StreamConfigurationMap = m2139translateInnerToDecorationCoordinatesMKHz9U$foundation;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2442setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(m2139translateInnerToDecorationCoordinatesMKHz9U$foundation));
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(androidx.compose.foundation.text.Handle.Cursor);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getHighResolutionOutputSizeshNQ4ISI(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public final void mo2104onDragk4lQ0M(long delta) {
                long j;
                androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
                long j2;
                long j3;
                androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedBack;
                androidx.compose.ui.text.input.TextFieldValue highSpeedVideoFpsRanges;
                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                j = textFieldSelectionManager.getHighSpeedVideoSizes;
                textFieldSelectionManager.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j, delta);
                androidx.compose.foundation.text.LegacyTextFieldState state = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.Camera2StreamConfigurationMap;
                j3 = textFieldSelectionManager2.getHighSpeedVideoSizes;
                textFieldSelectionManager2.m2442setCurrentDragPosition_kEHs6E(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j2, j3)));
                androidx.compose.ui.text.input.OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                androidx.compose.ui.geometry.Offset m2444getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m2444getCurrentDragPosition_m7T9E();
                kotlin.jvm.internal.Intrinsics.checkNotNull(m2444getCurrentDragPosition_m7T9E);
                int transformedToOriginal = offsetMapping.transformedToOriginal(androidx.compose.foundation.text.TextLayoutResultProxy.m2135getOffsetForPosition3MmeM6k$default(layoutResult, m2444getCurrentDragPosition_m7T9E.m5762unboximpl(), false, 2, null));
                long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                if (androidx.compose.ui.text.TextRange.m8032equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation().getSelection())) {
                    return;
                }
                androidx.compose.foundation.text.LegacyTextFieldState state2 = textFieldSelectionManager2.getState();
                if ((state2 == null || state2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
                }
                kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange$foundation = textFieldSelectionManager2.getOnValueChange$foundation();
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.selection.TextFieldSelectionManager.getHighSpeedVideoFpsRanges(textFieldSelectionManager2.getValue$foundation().getAnnotatedString(), TextRange);
                onValueChange$foundation.invoke(highSpeedVideoFpsRanges);
                textFieldSelectionManager2.m2450setLatestSelectionOEnZFl4$foundation(androidx.compose.ui.text.TextRange.m8027boximpl(TextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.setDraggingHandle(null);
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.this.m2442setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public static /* synthetic */ void enterSelectionMode$foundation$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation(z);
    }

    public final void enterSelectionMode$foundation(boolean showFloatingToolbar) {
        androidx.compose.ui.focus.FocusRequester focusRequester;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.getInputFormats = getValue$foundation();
        getHighResolutionOutputSizeshNQ4ISI(showFloatingToolbar);
        getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HandleState.Selection);
    }

    public final void exitSelectionMode$foundation() {
        getHighResolutionOutputSizeshNQ4ISI(false);
        getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HandleState.None);
    }

    /* renamed from: deselect-_kEHs6E$foundation$default, reason: not valid java name */
    public static /* synthetic */ void m2441deselect_kEHs6E$foundation$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.geometry.Offset offset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m2443deselect_kEHs6E$foundation(offset);
    }

    /* renamed from: deselect-_kEHs6E$foundation, reason: not valid java name */
    public final void m2443deselect_kEHs6E$foundation(androidx.compose.ui.geometry.Offset position) {
        int m8036getMaximpl;
        if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getValue$foundation().getSelection())) {
            androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            if (position != null && layoutResult != null) {
                m8036getMaximpl = this.offsetMapping.transformedToOriginal(androidx.compose.foundation.text.TextLayoutResultProxy.m2135getOffsetForPosition3MmeM6k$default(layoutResult, position.m5762unboximpl(), false, 2, null));
            } else {
                m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(getValue$foundation().getSelection());
            }
            androidx.compose.ui.text.input.TextFieldValue m8275copy3r_uNRQ$default = androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(getValue$foundation(), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRangeKt.TextRange(m8036getMaximpl), (androidx.compose.ui.text.TextRange) null, 5, (java.lang.Object) null);
            this.onValueChange.invoke(m8275copy3r_uNRQ$default);
            this.latestSelection = androidx.compose.ui.text.TextRange.m8027boximpl(m8275copy3r_uNRQ$default.getSelection());
        }
        getHighResolutionOutputSizeshNQ4ISI((position == null || getValue$foundation().getText().length() <= 0) ? androidx.compose.foundation.text.HandleState.None : androidx.compose.foundation.text.HandleState.Cursor);
        getHighResolutionOutputSizeshNQ4ISI(false);
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation, reason: not valid java name */
    public final void m2451setSelectionPreviewHighlight5zctL8$foundation(long range) {
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m2076setSelectionPreviewHighlightRange5zctL8(range);
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m2073setDeletionPreviewHighlightRange5zctL8(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE());
        }
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation();
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation, reason: not valid java name */
    public final void m2449setDeletionPreviewHighlight5zctL8$foundation(long range) {
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m2073setDeletionPreviewHighlightRange5zctL8(range);
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m2076setSelectionPreviewHighlightRange5zctL8(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE());
        }
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation();
    }

    public final void clearPreviewHighlight$foundation() {
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m2073setDeletionPreviewHighlightRange5zctL8(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE());
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m2076setSelectionPreviewHighlightRange5zctL8(androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE());
        }
    }

    /* renamed from: getTextToolbarShownViaProvider$foundation, reason: from getter */
    public final boolean getTextToolbarShownViaProvider() {
        return this.textToolbarShownViaProvider;
    }

    public final void setTextToolbarShownViaProvider$foundation(boolean z) {
        this.textToolbarShownViaProvider = z;
    }

    public final boolean getTextToolbarShown$foundation() {
        if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
            return this.textToolbarShownViaProvider;
        }
        androidx.compose.ui.platform.TextToolbar textToolbar = this.textToolbar;
        return (textToolbar != null ? textToolbar.getStatus() : null) == androidx.compose.ui.platform.TextToolbarStatus.Shown;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges() {
        return this.visualTransformation instanceof androidx.compose.ui.text.input.PasswordVisualTransformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoSizes() {
        return !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getValue$foundation().getSelection());
    }

    public final boolean isCopyAllowed$foundation() {
        return getHighSpeedVideoSizes() && !getHighSpeedVideoFpsRanges();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateClipboardEntry$foundation(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1 textFieldSelectionManager$updateClipboardEntry$1;
        int i;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager;
        if (continuation instanceof androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1) {
            textFieldSelectionManager$updateClipboardEntry$1 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1) continuation;
            if ((textFieldSelectionManager$updateClipboardEntry$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                textFieldSelectionManager$updateClipboardEntry$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = textFieldSelectionManager$updateClipboardEntry$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textFieldSelectionManager$updateClipboardEntry$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.platform.Clipboard clipboard = this.clipboard;
                    if (clipboard != null && androidx.compose.foundation.internal.ClipboardUtils_androidKt.isReadSupported(clipboard)) {
                        textFieldSelectionManager$updateClipboardEntry$1.getHighSpeedVideoFpsRanges = this;
                        textFieldSelectionManager$updateClipboardEntry$1.getHighSpeedVideoSizes = 1;
                        obj = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.hasAvailableTextToPaste(this, textFieldSelectionManager$updateClipboardEntry$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        textFieldSelectionManager = this;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) textFieldSelectionManager$updateClipboardEntry$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                textFieldSelectionManager.getHighSpeedVideoSizes(((java.lang.Boolean) obj).booleanValue());
                return kotlin.Unit.INSTANCE;
            }
        }
        textFieldSelectionManager$updateClipboardEntry$1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1(this, continuation);
        java.lang.Object obj2 = textFieldSelectionManager$updateClipboardEntry$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textFieldSelectionManager$updateClipboardEntry$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        textFieldSelectionManager.getHighSpeedVideoSizes(((java.lang.Boolean) obj2).booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.Pair<java.lang.String, androidx.compose.ui.text.TextRange> Camera2StreamConfigurationMap() {
        java.lang.String text;
        androidx.compose.ui.text.TextRange textRange;
        androidx.compose.ui.text.AnnotatedString transformedText$foundation = getTransformedText$foundation();
        if (transformedText$foundation == null || (text = transformedText$foundation.getText()) == null || (textRange = this.latestSelection) == null) {
            return null;
        }
        long getHighResolutionOutputSizeshNQ4ISI = textRange.getGetHighResolutionOutputSizeshNQ4ISI();
        return new kotlin.Pair<>(text, androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(getHighResolutionOutputSizeshNQ4ISI)), this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(getHighResolutionOutputSizeshNQ4ISI)))));
    }

    public final boolean isPasteAllowed$foundation() {
        return getEditable();
    }

    public final boolean isCutAllowed$foundation() {
        return getHighSpeedVideoSizes() && getEditable() && !getHighSpeedVideoFpsRanges();
    }

    public final boolean canShowSelectAllMenuItem$foundation() {
        return androidx.compose.ui.text.TextRange.m8035getLengthimpl(getValue$foundation().getSelection()) != getValue$foundation().getText().length();
    }

    public final boolean canShowAutofillMenuItem$foundation() {
        return getEditable() && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getValue$foundation().getSelection());
    }

    public static /* synthetic */ kotlinx.coroutines.Job copy$foundation$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionManager.copy$foundation(z);
    }

    public final kotlinx.coroutines.Job copy$foundation(boolean cancelSelection) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            return null;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1(this, cancelSelection, null), 1, null);
        return launch$default;
    }

    public static /* synthetic */ androidx.compose.ui.text.AnnotatedString copyWithResult$foundation$default(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionManager.copyWithResult$foundation(z);
    }

    public final kotlinx.coroutines.Job paste$foundation() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            return null;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1(this, null), 1, null);
        return launch$default;
    }

    public final kotlinx.coroutines.Job cut$foundation() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            return null;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1(this, null), 1, null);
        return launch$default;
    }

    public final void selectAll$foundation() {
        androidx.compose.ui.text.input.TextFieldValue highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getValue$foundation().getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(0, getValue$foundation().getText().length()));
        this.onValueChange.invoke(highSpeedVideoFpsRanges);
        this.latestSelection = androidx.compose.ui.text.TextRange.m8027boximpl(highSpeedVideoFpsRanges.getSelection());
        this.getInputFormats = androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(this.getInputFormats, (androidx.compose.ui.text.AnnotatedString) null, highSpeedVideoFpsRanges.getSelection(), (androidx.compose.ui.text.TextRange) null, 5, (java.lang.Object) null);
        enterSelectionMode$foundation(true);
    }

    public final void autofill$foundation() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation, reason: not valid java name */
    public final long m2446getHandlePositiontuRUvjQ$foundation(boolean isStartHandle) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.ui.text.TextLayoutResult value;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        androidx.compose.ui.text.AnnotatedString transformedText$foundation = getTransformedText$foundation();
        if (transformedText$foundation == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(transformedText$foundation.getText(), value.getLayoutInput().getText().getText())) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        long selection = getValue$foundation().getSelection();
        return androidx.compose.foundation.text.selection.TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(isStartHandle ? androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) : androidx.compose.ui.text.TextRange.m8034getEndimpl(selection)), isStartHandle, androidx.compose.ui.text.TextRange.m8038getReversedimpl(getValue$foundation().getSelection()));
    }

    public final float getHandleLineHeight$foundation(boolean isStartHandle) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.ui.text.TextLayoutResult value;
        int m8039getStartimpl = isStartHandle ? androidx.compose.ui.text.TextRange.m8039getStartimpl(getValue$foundation().getSelection()) : androidx.compose.ui.text.TextRange.m8034getEndimpl(getValue$foundation().getSelection());
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return 0.0f;
        }
        return androidx.compose.foundation.text.TextLayoutHelperKt.getLineHeight(value, m8039getStartimpl);
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation, reason: not valid java name */
    public final long m2445getCursorPositiontuRUvjQ$foundation(androidx.compose.ui.unit.Density density) {
        int originalToTransformed = this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(getValue$foundation().getSelection()));
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutResult);
        androidx.compose.ui.text.TextLayoutResult value = layoutResult.getValue();
        androidx.compose.ui.geometry.Rect cursorRect = value.getCursorRect(kotlin.ranges.RangesKt.coerceIn(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(cursorRect.getLeft() + (density.mo1418toPx0680j_4(androidx.compose.foundation.text.TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2.0f)) << 32) | (java.lang.Float.floatToRawIntBits(cursorRect.getBottom()) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(boolean p0) {
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(p0);
        }
        if (p0) {
            showSelectionToolbar$foundation();
        } else {
            hideSelectionToolbar$foundation();
        }
    }

    public final void showSelectionToolbar$foundation() {
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState;
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getEnabled() && ((legacyTextFieldState = this.state) == null || legacyTextFieldState.isInTouchMode())) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                    this.toolbarRequester.show();
                } else {
                    getInputFormats();
                }
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    private final kotlinx.coroutines.Job getInputFormats() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            return null;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this, null), 1, null);
        return launch$default;
    }

    public final void hideSelectionToolbar$foundation() {
        androidx.compose.ui.platform.TextToolbar textToolbar;
        if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
            this.toolbarRequester.hide();
            return;
        }
        androidx.compose.ui.platform.TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != androidx.compose.ui.platform.TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m2448selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long position) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || androidx.compose.foundation.text.TextLayoutHelperKt.m2134isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m2138translateDecorationToInnerCoordinatesMKHz9U$foundation(position), androidx.compose.ui.text.TextRange.m8027boximpl(getValue$foundation().getSelection()))) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(getValue$foundation(), position, true, false, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord(), false);
    }

    public final boolean isTextChanged$foundation() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats.getText(), getValue$foundation().getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor() {
        long j;
        float f;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.text.TextLayoutResult value;
        androidx.compose.ui.geometry.Rect cursorRect;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2;
        androidx.compose.ui.text.TextLayoutResult value2;
        androidx.compose.ui.geometry.Rect cursorRect2;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates4;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getIsLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(getValue$foundation().getSelection()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(getValue$foundation().getSelection()));
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = this.state;
                long m5768getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : layoutCoordinates4.mo7364localToRootMKHz9U(m2446getHandlePositiontuRUvjQ$foundation(true));
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState3 = this.state;
                long m5768getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : layoutCoordinates3.mo7364localToRootMKHz9U(m2446getHandlePositiontuRUvjQ$foundation(false));
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState4 = this.state;
                float f2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    j = m5768getZeroF1C5BW02;
                    f = 0.0f;
                } else {
                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    j = m5768getZeroF1C5BW02;
                    f = java.lang.Float.intBitsToFloat((int) (layoutCoordinates2.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(originalToTransformed)) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
                }
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    androidx.compose.foundation.text.TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    f2 = java.lang.Float.intBitsToFloat((int) (layoutCoordinates.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits((layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(originalToTransformed2)) == null) ? 0.0f : cursorRect.getTop()) & 4294967295L))) & 4294967295L));
                }
                int i = (int) (m5768getZeroF1C5BW0 >> 32);
                int i2 = (int) (j >> 32);
                return new androidx.compose.ui.geometry.Rect(java.lang.Math.min(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), java.lang.Math.min(f, f2), java.lang.Math.max(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), java.lang.Math.max(java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW0 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + (androidx.compose.ui.unit.Dp.m8601constructorimpl(25.0f) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.input.TextFieldValue p0, long p1, boolean p2, boolean p3, androidx.compose.foundation.text.selection.SelectionAdjustment p4, boolean p5) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback;
        int i;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        }
        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(p0.getSelection())), this.offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(p0.getSelection())));
        boolean z = false;
        int m2136getOffsetForPosition3MmeM6k = layoutResult.m2136getOffsetForPosition3MmeM6k(p1, false);
        int m8039getStartimpl = (p3 || p2) ? m2136getOffsetForPosition3MmeM6k : androidx.compose.ui.text.TextRange.m8039getStartimpl(TextRange);
        int m8034getEndimpl = (!p3 || p2) ? m2136getOffsetForPosition3MmeM6k : androidx.compose.ui.text.TextRange.m8034getEndimpl(TextRange);
        androidx.compose.foundation.text.selection.SelectionLayout selectionLayout = this.getOutputMinFrameDuration;
        int i2 = -1;
        if (!p2 && selectionLayout != null && (i = this.getHighSpeedVideoFpsRanges) != -1) {
            i2 = i;
        }
        androidx.compose.foundation.text.selection.SelectionLayout m2402getTextFieldSelectionLayoutRcvTLA = androidx.compose.foundation.text.selection.SelectionLayoutKt.m2402getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), m8039getStartimpl, m8034getEndimpl, i2, TextRange, p2, p3);
        if (!m2402getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return p0.getSelection();
        }
        this.getOutputMinFrameDuration = m2402getTextFieldSelectionLayoutRcvTLA;
        this.getHighSpeedVideoFpsRanges = m2136getOffsetForPosition3MmeM6k;
        androidx.compose.foundation.text.selection.Selection adjust = p4.adjust(m2402getTextFieldSelectionLayoutRcvTLA);
        long TextRange2 = androidx.compose.ui.text.TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(adjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(adjust.getEnd().getOffset()));
        if (androidx.compose.ui.text.TextRange.m8032equalsimpl0(TextRange2, p0.getSelection())) {
            return p0.getSelection();
        }
        boolean z2 = androidx.compose.ui.text.TextRange.m8038getReversedimpl(TextRange2) != androidx.compose.ui.text.TextRange.m8038getReversedimpl(p0.getSelection()) && androidx.compose.ui.text.TextRange.m8032equalsimpl0(androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(TextRange2), androidx.compose.ui.text.TextRange.m8039getStartimpl(TextRange2)), p0.getSelection());
        boolean z3 = androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(TextRange2) && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(p0.getSelection());
        if (p5 && p0.getText().length() > 0 && !z2 && !z3 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(getHighSpeedVideoFpsRanges(p0.getAnnotatedString(), TextRange2));
        this.latestSelection = androidx.compose.ui.text.TextRange.m8027boximpl(TextRange2);
        if (!p5) {
            getHighResolutionOutputSizeshNQ4ISI(!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(TextRange2));
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(p5);
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(TextRange2) && androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, true));
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(TextRange2) && androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, false));
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 != null) {
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(TextRange2) && androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(this, true)) {
                z = true;
            }
            legacyTextFieldState5.setShowCursorHandle(z);
        }
        return TextRange2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HandleState p0) {
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == p0) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.compose.ui.text.input.TextFieldValue getHighSpeedVideoFpsRanges(androidx.compose.ui.text.AnnotatedString p0, long p1) {
        return new androidx.compose.ui.text.input.TextFieldValue(p0, p1, (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean canShowCopyMenuItem$foundation() {
        androidx.compose.ui.platform.Clipboard clipboard;
        return getHighSpeedVideoSizes() && !getHighSpeedVideoFpsRanges() && (clipboard = this.clipboard) != null && androidx.compose.foundation.internal.ClipboardUtils_androidKt.isWriteSupported(clipboard);
    }

    public final boolean canShowPasteMenuItem$foundation() {
        androidx.compose.ui.platform.Clipboard clipboard;
        return getEditable() && getHighResolutionOutputSizeshNQ4ISI() && (clipboard = this.clipboard) != null && androidx.compose.foundation.internal.ClipboardUtils_androidKt.isReadSupported(clipboard);
    }

    public final boolean canShowCutMenuItem$foundation() {
        androidx.compose.ui.platform.Clipboard clipboard;
        return getHighSpeedVideoSizes() && getEditable() && !getHighSpeedVideoFpsRanges() && (clipboard = this.clipboard) != null && androidx.compose.foundation.internal.ClipboardUtils_androidKt.isWriteSupported(clipboard);
    }

    public final androidx.compose.ui.text.AnnotatedString copyWithResult$foundation(boolean cancelSelection) {
        if (!getHighSpeedVideoSizes() || getHighSpeedVideoFpsRanges()) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString selectedText = androidx.compose.ui.text.input.TextFieldValueKt.getSelectedText(getValue$foundation());
        if (!cancelSelection) {
            return selectedText;
        }
        int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(getValue$foundation().getSelection());
        this.onValueChange.invoke(getHighSpeedVideoFpsRanges(getValue$foundation().getAnnotatedString(), androidx.compose.ui.text.TextRangeKt.TextRange(m8036getMaximpl, m8036getMaximpl)));
        getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HandleState.None);
        return selectedText;
    }

    public final void paste$foundation(androidx.compose.ui.text.AnnotatedString text) {
        if (getEditable()) {
            androidx.compose.ui.text.AnnotatedString plus = androidx.compose.ui.text.input.TextFieldValueKt.getTextBeforeSelection(getValue$foundation(), getValue$foundation().getText().length()).plus(text).plus(androidx.compose.ui.text.input.TextFieldValueKt.getTextAfterSelection(getValue$foundation(), getValue$foundation().getText().length()));
            int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(getValue$foundation().getSelection()) + text.length();
            this.onValueChange.invoke(getHighSpeedVideoFpsRanges(plus, androidx.compose.ui.text.TextRangeKt.TextRange(m8037getMinimpl, m8037getMinimpl)));
            getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HandleState.None);
            androidx.compose.foundation.text.UndoManager undoManager = this.undoManager;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
    }

    public final androidx.compose.ui.text.AnnotatedString cutWithResult$foundation() {
        if (!getHighSpeedVideoSizes() || !getEditable() || getHighSpeedVideoFpsRanges()) {
            return null;
        }
        androidx.compose.ui.text.AnnotatedString selectedText = androidx.compose.ui.text.input.TextFieldValueKt.getSelectedText(getValue$foundation());
        androidx.compose.ui.text.AnnotatedString plus = androidx.compose.ui.text.input.TextFieldValueKt.getTextBeforeSelection(getValue$foundation(), getValue$foundation().getText().length()).plus(androidx.compose.ui.text.input.TextFieldValueKt.getTextAfterSelection(getValue$foundation(), getValue$foundation().getText().length()));
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(getValue$foundation().getSelection());
        this.onValueChange.invoke(getHighSpeedVideoFpsRanges(plus, androidx.compose.ui.text.TextRangeKt.TextRange(m8037getMinimpl, m8037getMinimpl)));
        getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.HandleState.None);
        androidx.compose.foundation.text.UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return selectedText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
