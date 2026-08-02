package androidx.compose.ui.text.input;

@kotlin.Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010!\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010#J\u000f\u0010$\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010#J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010#J!\u0010.\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u000200H\u0017¢\u0006\u0004\b2\u00103JK\u0010=\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u00162\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010;\u001a\u0002002\u0006\u0010<\u001a\u000200H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010#J\u0017\u0010+\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010)\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR(\u0010L\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u001d0\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d0\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010KR$\u0010N\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00168\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010D\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0U0T8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001b\u0010F\u001a\u00020Y8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b?\u0010Z\u001a\u0004\b)\u0010[R\u0018\u0010R\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010]R\u0014\u0010J\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010_R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020'0`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010a\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010d"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "", "isEditorFocused", "()Z", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "()V", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;)V", "getHighResolutionOutputSizeshNQ4ISI", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "Camera2StreamConfigurationMap", "(Z)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/text/input/InputMethodManager;", "getInputFormats", "Ljava/util/concurrent/Executor;", "getHighSpeedVideoSizes", "Z", "getOutputFormats", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getOutputStallDuration", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getInputSizeshNQ4ISI", "Landroidx/compose/ui/text/input/ImeOptions;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "getOutputMinFrameDuration", "Ljava/util/List;", "Landroid/view/inputmethod/BaseInputConnection;", "Lkotlin/Lazy;", "()Landroid/view/inputmethod/BaseInputConnection;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "Landroidx/compose/runtime/collection/MutableVector;", "getOutputSizes", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "TextInputCommand"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements androidx.compose.ui.text.input.PlatformTextInputService {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Runnable getOutputSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.graphics.Rect getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.CursorAnchorInfoController getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.InputMethodManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.concurrent.Executor getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.ImeOptions getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private java.util.List<java.lang.ref.WeakReference<androidx.compose.ui.text.input.RecordingInputConnection>> getOutputMinFrameDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand> getOutputStallDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.ui.text.input.TextFieldValue state;
    private final android.view.View view;

    public TextInputServiceAndroid(android.view.View view, androidx.compose.ui.input.pointer.MatrixPositionCalculator matrixPositionCalculator, androidx.compose.ui.text.input.InputMethodManager inputMethodManager, java.util.concurrent.Executor executor) {
        this.view = view;
        this.getHighSpeedVideoFpsRangesFor = inputMethodManager;
        this.getHighSpeedVideoSizes = executor;
        this.getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1<java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void Camera2StreamConfigurationMap(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
                Camera2StreamConfigurationMap(list);
                return kotlin.Unit.INSTANCE;
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            public final void getHighSpeedVideoFpsRanges(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.ImeAction imeAction) {
                getHighSpeedVideoFpsRanges(imeAction.getGetHighSpeedVideoFpsRanges());
                return kotlin.Unit.INSTANCE;
            }
        };
        this.state = new androidx.compose.ui.text.input.TextFieldValue("", androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.getHighSpeedVideoSizesFor = androidx.compose.ui.text.input.ImeOptions.INSTANCE.getDefault();
        this.getOutputMinFrameDuration = new java.util.ArrayList();
        this.getInputFormats = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.view.inputmethod.BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final android.view.inputmethod.BaseInputConnection invoke() {
                return new android.view.inputmethod.BaseInputConnection(androidx.compose.ui.text.input.TextInputServiceAndroid.this.getView(), false);
            }

            {
                super(0);
            }
        });
        this.getOutputFormats = new androidx.compose.ui.text.input.CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.getOutputStallDuration = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[16], 0);
    }

    public final android.view.View getView() {
        return this.view;
    }

    public /* synthetic */ TextInputServiceAndroid(android.view.View view, androidx.compose.ui.input.pointer.MatrixPositionCalculator matrixPositionCalculator, androidx.compose.ui.text.input.InputMethodManager inputMethodManager, java.util.concurrent.Executor executor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(view, matrixPositionCalculator, inputMethodManager, (i & 8) != 0 ? androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.asExecutor(android.view.Choreographer.getInstance()) : executor);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TextInputCommand {
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[] getInputFormats;
        public static final androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand("StartInput", 0);
        public static final androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand getHighSpeedVideoSizes = new androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand("StopInput", 1);
        public static final androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand Camera2StreamConfigurationMap = new androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand("ShowKeyboard", 2);
        public static final androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand("HideKeyboard", 3);

        private TextInputCommand(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            getInputFormats = highSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRanges);
        }

        public static androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[] values() {
            return (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[]) getInputFormats.clone();
        }

        public static androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand valueOf(java.lang.String str) {
            return (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) java.lang.Enum.valueOf(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.class, str);
        }

        private static final /* synthetic */ androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[] getHighSpeedVideoFpsRanges() {
            return new androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[]{getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoSizes, Camera2StreamConfigurationMap, getHighSpeedVideoFpsRangesFor};
        }
    }

    /* renamed from: getState$ui, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.inputmethod.BaseInputConnection getHighSpeedVideoFpsRangesFor() {
        return (android.view.inputmethod.BaseInputConnection) this.getInputFormats.getValue();
    }

    public TextInputServiceAndroid(android.view.View view, androidx.compose.ui.input.pointer.MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new androidx.compose.ui.text.input.InputMethodManagerImpl(view), null, 8, null);
    }

    public final android.view.inputmethod.InputConnection createInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        if (!this.Camera2StreamConfigurationMap) {
            return null;
        }
        androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.update(outAttrs, this.getHighSpeedVideoSizesFor, this.state);
        androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.Camera2StreamConfigurationMap(outAttrs);
        androidx.compose.ui.text.input.RecordingInputConnection recordingInputConnection = new androidx.compose.ui.text.input.RecordingInputConnection(this.state, new androidx.compose.ui.text.input.InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public final void onEditCommands(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> editCommands) {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getHighSpeedVideoFpsRanges;
                function1.invoke(editCommands);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public final void mo8232onImeActionKlQnJC8(int imeAction) {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getHighResolutionOutputSizeshNQ4ISI;
                function1.invoke(androidx.compose.ui.text.input.ImeAction.m8198boximpl(imeAction));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public final void onKeyEvent(android.view.KeyEvent event) {
                android.view.inputmethod.BaseInputConnection highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getHighSpeedVideoFpsRangesFor();
                highSpeedVideoFpsRangesFor.sendKeyEvent(event);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public final void onRequestCursorAnchorInfo(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
                androidx.compose.ui.text.input.CursorAnchorInfoController cursorAnchorInfoController;
                cursorAnchorInfoController = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getOutputFormats;
                cursorAnchorInfoController.requestUpdate(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public final void onConnectionClosed(androidx.compose.ui.text.input.RecordingInputConnection inputConnection) {
                java.util.List list;
                java.util.List list2;
                java.util.List list3;
                list = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getOutputMinFrameDuration;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list2 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getOutputMinFrameDuration;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) list2.get(i)).get(), inputConnection)) {
                        list3 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getOutputMinFrameDuration;
                        list3.remove(i);
                        return;
                    }
                }
            }
        }, this.getHighSpeedVideoSizesFor.getAutoCorrect());
        this.getOutputMinFrameDuration.add(new java.lang.ref.WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    /* renamed from: isEditorFocused, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput(androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit> onEditCommand, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
        this.Camera2StreamConfigurationMap = true;
        this.state = value;
        this.getHighSpeedVideoSizesFor = imeOptions;
        this.getHighSpeedVideoFpsRanges = onEditCommand;
        this.getHighResolutionOutputSizeshNQ4ISI = onImeActionPerformed;
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput() {
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void stopInput() {
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1<java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            public final void getHighSpeedVideoFpsRanges(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
                getHighSpeedVideoFpsRanges(list);
                return kotlin.Unit.INSTANCE;
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.ImeAction imeAction) {
                getHighResolutionOutputSizeshNQ4ISI(imeAction.getGetHighSpeedVideoFpsRanges());
                return kotlin.Unit.INSTANCE;
            }
        };
        this.getInputSizeshNQ4ISI = null;
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.getHighSpeedVideoFpsRangesFor);
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand p0) {
        this.getOutputStallDuration.add(p0);
        if (this.getOutputSizes == null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.ui.text.input.TextInputServiceAndroid.getHighSpeedVideoSizes(androidx.compose.ui.text.input.TextInputServiceAndroid.this);
                }
            };
            this.getHighSpeedVideoSizes.execute(runnable);
            this.getOutputSizes = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(androidx.compose.ui.text.input.TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.getOutputSizes = null;
        textInputServiceAndroid.getHighResolutionOutputSizeshNQ4ISI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getHighResolutionOutputSizeshNQ4ISI() {
        android.view.View findFocus;
        if (!this.view.isFocused() && (findFocus = this.view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
            this.getOutputStallDuration.clear();
            return;
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand> mutableVector = this.getOutputStallDuration;
        androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[] textInputCommandArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            getHighSpeedVideoFpsRanges(textInputCommandArr[i], objectRef, objectRef2);
        }
        this.getOutputStallDuration.clear();
        if (kotlin.jvm.internal.Intrinsics.areEqual(objectRef.element, java.lang.Boolean.TRUE)) {
            Camera2StreamConfigurationMap();
        }
        java.lang.Boolean bool = (java.lang.Boolean) objectRef2.element;
        if (bool != null) {
            getHighResolutionOutputSizeshNQ4ISI(bool.booleanValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(objectRef.element, java.lang.Boolean.FALSE)) {
            Camera2StreamConfigurationMap();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void getHighSpeedVideoFpsRanges(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand textInputCommand, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Boolean> objectRef, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Boolean> objectRef2) {
        int i = androidx.compose.ui.text.input.TextInputServiceAndroid.WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        ?? r1 = java.lang.Boolean.TRUE;
        if (i == 1) {
            objectRef.element = r1;
            objectRef2.element = r1;
        } else if (i == 2) {
            objectRef.element = java.lang.Boolean.FALSE;
            objectRef2.element = java.lang.Boolean.FALSE;
        } else {
            if (i != 3 && i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(objectRef.element, java.lang.Boolean.FALSE)) {
                return;
            }
            objectRef2.element = java.lang.Boolean.valueOf(textInputCommand == androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.Camera2StreamConfigurationMap);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateState(androidx.compose.ui.text.input.TextFieldValue oldValue, androidx.compose.ui.text.input.TextFieldValue newValue) {
        boolean z = (androidx.compose.ui.text.TextRange.m8032equalsimpl0(this.state.getSelection(), newValue.getSelection()) && kotlin.jvm.internal.Intrinsics.areEqual(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.getOutputMinFrameDuration.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.input.RecordingInputConnection recordingInputConnection = this.getOutputMinFrameDuration.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui(newValue);
            }
        }
        this.getOutputFormats.invalidate();
        if (kotlin.jvm.internal.Intrinsics.areEqual(oldValue, newValue)) {
            if (z) {
                androidx.compose.ui.text.input.InputMethodManager inputMethodManager = this.getHighSpeedVideoFpsRangesFor;
                int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(newValue.getSelection());
                int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(newValue.getSelection());
                androidx.compose.ui.text.TextRange composition = this.state.getComposition();
                int m8037getMinimpl2 = composition != null ? androidx.compose.ui.text.TextRange.m8037getMinimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
                androidx.compose.ui.text.TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(m8037getMinimpl, m8036getMaximpl, m8037getMinimpl2, composition2 != null ? androidx.compose.ui.text.TextRange.m8036getMaximpl(composition2.getGetHighResolutionOutputSizeshNQ4ISI()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!kotlin.jvm.internal.Intrinsics.areEqual(oldValue.getText(), newValue.getText()) || (androidx.compose.ui.text.TextRange.m8032equalsimpl0(oldValue.getSelection(), newValue.getSelection()) && !kotlin.jvm.internal.Intrinsics.areEqual(oldValue.getComposition(), newValue.getComposition())))) {
            Camera2StreamConfigurationMap();
            return;
        }
        int size2 = this.getOutputMinFrameDuration.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.input.RecordingInputConnection recordingInputConnection2 = this.getOutputMinFrameDuration.get(i2).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @kotlin.Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        android.graphics.Rect rect2;
        this.getInputSizeshNQ4ISI = new android.graphics.Rect(kotlin.math.MathKt.roundToInt(rect.getLeft()), kotlin.math.MathKt.roundToInt(rect.getTop()), kotlin.math.MathKt.roundToInt(rect.getRight()), kotlin.math.MathKt.roundToInt(rect.getBottom()));
        if (!this.getOutputMinFrameDuration.isEmpty() || (rect2 = this.getInputSizeshNQ4ISI) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new android.graphics.Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> textFieldToRootTransform, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        this.getOutputFormats.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    private final void Camera2StreamConfigurationMap() {
        this.getHighSpeedVideoFpsRangesFor.restartInput();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(boolean p0) {
        if (p0) {
            this.getHighSpeedVideoFpsRangesFor.showSoftInput();
        } else {
            this.getHighSpeedVideoFpsRangesFor.hideSoftInput();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.values().length];
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.getHighSpeedVideoSizes.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.Camera2StreamConfigurationMap.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.getHighSpeedVideoFpsRangesFor.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
