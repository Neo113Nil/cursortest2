package androidx.compose.ui.text.input;

/* compiled from: TextInputServiceAndroid.android.kt */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001RB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020%H\u0016J\u0006\u00107\u001a\u00020\u0016J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020:H\u0017J\b\u0010;\u001a\u00020%H\u0002J\b\u0010<\u001a\u00020%H\u0002J\u0010\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020/H\u0002J\u0010\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0016H\u0002J\b\u0010A\u001a\u00020%H\u0016J\b\u0010B\u001a\u00020%H\u0016JF\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020 2\u0018\u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020%0\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020%0\"H\u0016J\b\u0010D\u001a\u00020%H\u0016J\u001a\u0010E\u001a\u00020%2\b\u0010F\u001a\u0004\u0018\u00010)2\u0006\u0010G\u001a\u00020)H\u0016JD\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020%0\"2\u0006\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020:H\u0016R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0004\u0012\u00020%0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020%0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006S"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PositionCalculator;)V", "rootPositionCalculator", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputCommandProcessorExecutor", "Ljava/util/concurrent/Executor;", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", "baseInputConnection", "Landroid/view/inputmethod/BaseInputConnection;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "cursorAnchorInfoController", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "editorHasFocus", "", "focusedRect", "Landroid/graphics/Rect;", "frameCallback", "Ljava/lang/Runnable;", "ics", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onEditCommand", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "<set-?>", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "textInputCommandQueue", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "getView", "()Landroid/view/View;", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "hideSoftwareKeyboard", "isEditorFocused", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "processInputCommands", "restartInputImmediately", "sendInputCommand", com.ironsource.sdk.controller.f.b.g, "setKeyboardVisibleImmediately", com.helpshift.HelpshiftEvent.DATA_SDK_VISIBLE, "showSoftwareKeyboard", "startInput", "value", "stopInput", "updateState", "oldValue", "newValue", "updateTextLayoutResult", "textFieldValue", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "textFieldToRootTransform", "Landroidx/compose/ui/graphics/Matrix;", "innerTextFieldBounds", "decorationBoxBounds", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements androidx.compose.ui.text.input.PlatformTextInputService {
    public static final int $stable = 8;

    /* renamed from: baseInputConnection$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy baseInputConnection;
    private final androidx.compose.ui.text.input.CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private android.graphics.Rect focusedRect;
    private java.lang.Runnable frameCallback;
    private java.util.List<java.lang.ref.WeakReference<androidx.compose.ui.text.input.RecordingInputConnection>> ics;
    private androidx.compose.ui.text.input.ImeOptions imeOptions;
    private final java.util.concurrent.Executor inputCommandProcessorExecutor;
    private final androidx.compose.ui.text.input.InputMethodManager inputMethodManager;
    private kotlin.jvm.functions.Function1<? super java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit> onEditCommand;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed;
    private androidx.compose.ui.text.input.TextFieldValue state;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand> textInputCommandQueue;
    private final android.view.View view;

    /* compiled from: TextInputServiceAndroid.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.values().length];
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.StartInput.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.StopInput.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(android.view.View view, androidx.compose.ui.input.pointer.PositionCalculator positionCalculator, androidx.compose.ui.text.input.InputMethodManager inputMethodManager, java.util.concurrent.Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new kotlin.jvm.functions.Function1<java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
                invoke2(list);
                return kotlin.Unit.INSTANCE;
            }
        };
        this.onImeActionPerformed = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m4207invokeKlQnJC8(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.ImeAction imeAction) {
                m4207invokeKlQnJC8(imeAction.getValue());
                return kotlin.Unit.INSTANCE;
            }
        };
        this.state = new androidx.compose.ui.text.input.TextFieldValue("", androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.imeOptions = androidx.compose.ui.text.input.ImeOptions.INSTANCE.getDefault();
        this.ics = new java.util.ArrayList();
        this.baseInputConnection = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.view.inputmethod.BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.view.inputmethod.BaseInputConnection invoke() {
                return new android.view.inputmethod.BaseInputConnection(androidx.compose.ui.text.input.TextInputServiceAndroid.this.getView(), false);
            }
        });
        this.cursorAnchorInfoController = new androidx.compose.ui.text.input.CursorAnchorInfoController(positionCalculator, inputMethodManager);
        this.textInputCommandQueue = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[16], 0);
    }

    public final android.view.View getView() {
        return this.view;
    }

    public /* synthetic */ TextInputServiceAndroid(android.view.View view, androidx.compose.ui.input.pointer.PositionCalculator positionCalculator, androidx.compose.ui.text.input.InputMethodManager inputMethodManager, java.util.concurrent.Executor executor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(view, positionCalculator, inputMethodManager, (i & 8) != 0 ? androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.asExecutor(android.view.Choreographer.getInstance()) : executor);
    }

    /* renamed from: getState$ui_release, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.inputmethod.BaseInputConnection getBaseInputConnection() {
        return (android.view.inputmethod.BaseInputConnection) this.baseInputConnection.getValue();
    }

    public TextInputServiceAndroid(android.view.View view, androidx.compose.ui.input.pointer.PositionCalculator positionCalculator) {
        this(view, positionCalculator, new androidx.compose.ui.text.input.InputMethodManagerImpl(view), null, 8, null);
    }

    public final android.view.inputmethod.InputConnection createInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.update(outAttrs, this.imeOptions, this.state);
        androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt.updateWithEmojiCompat(outAttrs);
        androidx.compose.ui.text.input.RecordingInputConnection recordingInputConnection = new androidx.compose.ui.text.input.RecordingInputConnection(this.state, new androidx.compose.ui.text.input.InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> editCommands) {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.onEditCommand;
                function1.invoke(editCommands);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo4159onImeActionKlQnJC8(int imeAction) {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.onImeActionPerformed;
                function1.invoke(androidx.compose.ui.text.input.ImeAction.m4128boximpl(imeAction));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(android.view.KeyEvent event) {
                android.view.inputmethod.BaseInputConnection baseInputConnection;
                baseInputConnection = androidx.compose.ui.text.input.TextInputServiceAndroid.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(event);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
                androidx.compose.ui.text.input.CursorAnchorInfoController cursorAnchorInfoController;
                cursorAnchorInfoController = androidx.compose.ui.text.input.TextInputServiceAndroid.this.cursorAnchorInfoController;
                cursorAnchorInfoController.requestUpdate(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(androidx.compose.ui.text.input.RecordingInputConnection inputConnection) {
                java.util.List list;
                java.util.List list2;
                java.util.List list3;
                list = androidx.compose.ui.text.input.TextInputServiceAndroid.this.ics;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list2 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.ics;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) list2.get(i)).get(), inputConnection)) {
                        list3 = androidx.compose.ui.text.input.TextInputServiceAndroid.this.ics;
                        list3.remove(i);
                        return;
                    }
                }
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new java.lang.ref.WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    /* renamed from: isEditorFocused, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit> onEditCommand, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        sendInputCommand(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new kotlin.jvm.functions.Function1<java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
                invoke2(list);
                return kotlin.Unit.INSTANCE;
            }
        };
        this.onImeActionPerformed = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m4208invokeKlQnJC8(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.ImeAction imeAction) {
                m4208invokeKlQnJC8(imeAction.getValue());
                return kotlin.Unit.INSTANCE;
            }
        };
        this.focusedRect = null;
        sendInputCommand(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.HideKeyboard);
    }

    private final void sendInputCommand(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand command) {
        this.textInputCommandQueue.add(command);
        if (this.frameCallback == null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.ui.text.input.TextInputServiceAndroid.sendInputCommand$lambda$1(androidx.compose.ui.text.input.TextInputServiceAndroid.this);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(androidx.compose.ui.text.input.TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processInputCommands() {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand> mutableVector = this.textInputCommandQueue;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand[] content = mutableVector.getContent();
            int i = 0;
            do {
                processInputCommands$applyToState(content[i], objectRef, objectRef2);
                i++;
            } while (i < size);
        }
        this.textInputCommandQueue.clear();
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) objectRef.element, (java.lang.Object) true)) {
            restartInputImmediately();
        }
        java.lang.Boolean bool = (java.lang.Boolean) objectRef2.element;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) objectRef.element, (java.lang.Object) false)) {
            restartInputImmediately();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Boolean] */
    private static final void processInputCommands$applyToState(androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand textInputCommand, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Boolean> objectRef, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Boolean> objectRef2) {
        int i = androidx.compose.ui.text.input.TextInputServiceAndroid.WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i == 1) {
            objectRef.element = true;
            objectRef2.element = true;
        } else if (i == 2) {
            objectRef.element = false;
            objectRef2.element = false;
        } else if ((i == 3 || i == 4) && !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) objectRef.element, (java.lang.Object) false)) {
            objectRef2.element = java.lang.Boolean.valueOf(textInputCommand == androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand.ShowKeyboard);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(androidx.compose.ui.text.input.TextFieldValue oldValue, androidx.compose.ui.text.input.TextFieldValue newValue) {
        boolean z = (androidx.compose.ui.text.TextRange.m3957equalsimpl0(this.state.getSelection(), newValue.getSelection()) && kotlin.jvm.internal.Intrinsics.areEqual(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.input.RecordingInputConnection recordingInputConnection = this.ics.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(newValue);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (kotlin.jvm.internal.Intrinsics.areEqual(oldValue, newValue)) {
            if (z) {
                androidx.compose.ui.text.input.InputMethodManager inputMethodManager = this.inputMethodManager;
                int m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(newValue.getSelection());
                int m3961getMaximpl = androidx.compose.ui.text.TextRange.m3961getMaximpl(newValue.getSelection());
                androidx.compose.ui.text.TextRange composition = this.state.getComposition();
                int m3962getMinimpl2 = composition != null ? androidx.compose.ui.text.TextRange.m3962getMinimpl(composition.getPackedValue()) : -1;
                androidx.compose.ui.text.TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(m3962getMinimpl, m3961getMaximpl, m3962getMinimpl2, composition2 != null ? androidx.compose.ui.text.TextRange.m3961getMaximpl(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!kotlin.jvm.internal.Intrinsics.areEqual(oldValue.getText(), newValue.getText()) || (androidx.compose.ui.text.TextRange.m3957equalsimpl0(oldValue.getSelection(), newValue.getSelection()) && !kotlin.jvm.internal.Intrinsics.areEqual(oldValue.getComposition(), newValue.getComposition())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.input.RecordingInputConnection recordingInputConnection2 = this.ics.get(i2).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @kotlin.Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        android.graphics.Rect rect2;
        this.focusedRect = new android.graphics.Rect(kotlin.math.MathKt.roundToInt(rect.getLeft()), kotlin.math.MathKt.roundToInt(rect.getTop()), kotlin.math.MathKt.roundToInt(rect.getRight()), kotlin.math.MathKt.roundToInt(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new android.graphics.Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> textFieldToRootTransform, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void setKeyboardVisibleImmediately(boolean visible) {
        if (visible) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }
}
