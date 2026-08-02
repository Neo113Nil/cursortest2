package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/inputmethod/EditorInfo;", "Landroid/view/inputmethod/InputConnection;", "getHighSpeedVideoSizes", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "Landroidx/compose/runtime/collection/MutableVector;", "", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InputMethodSession {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.PlatformTextInputMethodRequest getHighSpeedVideoFpsRangesFor;
    boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.WeakReference<androidx.compose.ui.text.input.NullableInputConnectionWrapper>> Camera2StreamConfigurationMap = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.WeakReference[16], 0);

    public InputMethodSession(androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = platformTextInputMethodRequest;
        this.getHighSpeedVideoFpsRanges = function0;
    }

    public final android.view.inputmethod.InputConnection getHighSpeedVideoSizes(android.view.inputmethod.EditorInfo p0) {
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return null;
            }
            androidx.compose.ui.text.input.NullableInputConnectionWrapper NullableInputConnectionWrapper = androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.getHighSpeedVideoFpsRangesFor.createInputConnection(p0), new kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.NullableInputConnectionWrapper, kotlin.Unit>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.input.NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    getHighSpeedVideoSizes(nullableInputConnectionWrapper);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(androidx.compose.ui.text.input.NullableInputConnectionWrapper nullableInputConnectionWrapper) {
                    androidx.compose.runtime.collection.MutableVector mutableVector;
                    androidx.compose.runtime.collection.MutableVector mutableVector2;
                    kotlin.jvm.functions.Function0 function0;
                    androidx.compose.runtime.collection.MutableVector mutableVector3;
                    nullableInputConnectionWrapper.disposeDelegate();
                    mutableVector = androidx.compose.ui.platform.InputMethodSession.this.Camera2StreamConfigurationMap;
                    java.lang.Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            break;
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual((androidx.compose.ui.node.WeakReference) objArr[i], nullableInputConnectionWrapper)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        mutableVector3 = androidx.compose.ui.platform.InputMethodSession.this.Camera2StreamConfigurationMap;
                        mutableVector3.removeAt(i);
                    }
                    mutableVector2 = androidx.compose.ui.platform.InputMethodSession.this.Camera2StreamConfigurationMap;
                    if (mutableVector2.getSize() == 0) {
                        function0 = androidx.compose.ui.platform.InputMethodSession.this.getHighSpeedVideoFpsRanges;
                        function0.invoke();
                    }
                }

                {
                    super(1);
                }
            });
            this.Camera2StreamConfigurationMap.add(new androidx.compose.ui.node.WeakReference<>(NullableInputConnectionWrapper));
            return NullableInputConnectionWrapper;
        }
    }
}
