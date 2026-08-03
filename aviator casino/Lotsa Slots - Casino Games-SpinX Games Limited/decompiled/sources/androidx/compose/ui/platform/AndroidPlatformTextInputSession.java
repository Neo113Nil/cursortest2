package androidx.compose.ui.platform;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010\u001eR\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlinx/coroutines/CoroutineScope;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "coroutineScope", "(Landroid/view/View;Landroidx/compose/ui/text/input/TextInputService;Lkotlinx/coroutines/CoroutineScope;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "isReadyForConnection", "", "()Z", "methodSessionMutex", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/InputMethodSession;", "Ljava/util/concurrent/atomic/AtomicReference;", "getView", "()Landroid/view/View;", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "startInputMethod", "", "request", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements androidx.compose.ui.platform.PlatformTextInputSessionScope, kotlinx.coroutines.CoroutineScope {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> methodSessionMutex = androidx.compose.ui.SessionMutex.m1751constructorimpl();
    private final androidx.compose.ui.text.input.TextInputService textInputService;
    private final android.view.View view;

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    public AndroidPlatformTextInputSession(android.view.View view, androidx.compose.ui.text.input.TextInputService textInputService, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = coroutineScope;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public android.view.View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        androidx.compose.ui.platform.InputMethodSession inputMethodSession = (androidx.compose.ui.platform.InputMethodSession) androidx.compose.ui.SessionMutex.m1755getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object startInputMethod(final androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) continuation;
            if ((androidPlatformTextInputSession$startInputMethod$1.label & Integer.MIN_VALUE) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidPlatformTextInputSession$startInputMethod$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidPlatformTextInputSession$startInputMethod$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<T>> atomicReference = this.methodSessionMutex;
                    kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.InputMethodSession> function1 = new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.platform.InputMethodSession>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final androidx.compose.ui.platform.InputMethodSession invoke(final kotlinx.coroutines.CoroutineScope coroutineScope) {
                            return new androidx.compose.ui.platform.InputMethodSession(androidx.compose.ui.platform.PlatformTextInputMethodRequest.this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                    invoke2();
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(kotlinx.coroutines.CoroutineScope.this, null, 1, null);
                                }
                            });
                        }
                    };
                    androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3(this, null);
                    androidPlatformTextInputSession$startInputMethod$1.label = 1;
                    if (androidx.compose.ui.SessionMutex.m1758withSessionCancellingPreviousimpl(atomicReference, function1, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1) == coroutine_suspended) {
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
        java.lang.Object obj2 = androidPlatformTextInputSession$startInputMethod$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidPlatformTextInputSession$startInputMethod$1.label;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public final android.view.inputmethod.InputConnection createInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        androidx.compose.ui.platform.InputMethodSession inputMethodSession = (androidx.compose.ui.platform.InputMethodSession) androidx.compose.ui.SessionMutex.m1755getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(outAttrs);
        }
        return null;
    }
}
