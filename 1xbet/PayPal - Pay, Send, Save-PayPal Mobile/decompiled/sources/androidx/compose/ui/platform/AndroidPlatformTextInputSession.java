package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0011\u0010!\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/View;", "view", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/TextInputService;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "", "startInputMethod", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/input/TextInputService;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/InputMethodSession;", "Ljava/util/concurrent/atomic/AtomicReference;", "Camera2StreamConfigurationMap", "", "isReadyForConnection", "()Z", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements androidx.compose.ui.platform.PlatformTextInputSessionScope, kotlinx.coroutines.CoroutineScope {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<androidx.compose.ui.platform.InputMethodSession>> Camera2StreamConfigurationMap = androidx.compose.ui.SessionMutex.m5517constructorimpl();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.TextInputService getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;
    private final android.view.View view;

    public AndroidPlatformTextInputSession(android.view.View view, androidx.compose.ui.text.input.TextInputService textInputService, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.view = view;
        this.getHighSpeedVideoFpsRanges = textInputService;
        this.getHighSpeedVideoSizes = coroutineScope;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public final android.view.View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        androidx.compose.ui.platform.InputMethodSession inputMethodSession = (androidx.compose.ui.platform.InputMethodSession) androidx.compose.ui.SessionMutex.m5520getCurrentSessionimpl(this.Camera2StreamConfigurationMap);
        return inputMethodSession != null && (inputMethodSession.getHighResolutionOutputSizeshNQ4ISI ^ true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startInputMethod(final androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) continuation;
            if ((androidPlatformTextInputSession$startInputMethod$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = androidPlatformTextInputSession$startInputMethod$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidPlatformTextInputSession$startInputMethod$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<androidx.compose.ui.platform.InputMethodSession>> atomicReference = this.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.InputMethodSession> function1 = new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.InputMethodSession>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final androidx.compose.ui.platform.InputMethodSession invoke(kotlinx.coroutines.CoroutineScope coroutineScope) {
                            androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest2 = androidx.compose.ui.platform.PlatformTextInputMethodRequest.this;
                            final androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession = this;
                            return new androidx.compose.ui.platform.InputMethodSession(platformTextInputMethodRequest2, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2.1
                                public final void Camera2StreamConfigurationMap() {
                                    kotlinx.coroutines.CoroutineScope coroutineScope2;
                                    coroutineScope2 = androidx.compose.ui.platform.AndroidPlatformTextInputSession.this.getHighSpeedVideoSizes;
                                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final /* synthetic */ kotlin.Unit invoke() {
                                    Camera2StreamConfigurationMap();
                                    return kotlin.Unit.INSTANCE;
                                }

                                {
                                    super(0);
                                }
                            });
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3(this, null);
                    androidPlatformTextInputSession$startInputMethod$1.getHighSpeedVideoFpsRanges = 1;
                    if (androidx.compose.ui.SessionMutex.m5523withSessionCancellingPreviousimpl(atomicReference, function1, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidPlatformTextInputSession$startInputMethod$1 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1(this, continuation);
        java.lang.Object obj2 = androidPlatformTextInputSession$startInputMethod$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidPlatformTextInputSession$startInputMethod$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public final android.view.inputmethod.InputConnection createInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        androidx.compose.ui.platform.InputMethodSession inputMethodSession = (androidx.compose.ui.platform.InputMethodSession) androidx.compose.ui.SessionMutex.m5520getCurrentSessionimpl(this.Camera2StreamConfigurationMap);
        if (inputMethodSession != null) {
            return inputMethodSession.getHighSpeedVideoSizes(outAttrs);
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRangesFor();
    }
}
