package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0090\u0001\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\tH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0092\u0001\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\tH\u0080@¢\u0006\u0004\b\u0016\u0010\u001a\"\u001a\u0010\u001b\u001a\u00020\u00138\u0000X\u0080T¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputSession;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "onImeAction", "Lkotlin/Function0;", "updateSelectionState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "stylusHandwritingTrigger", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "updateTouchMode", "", "platformSpecificTextInputSession", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TIA_DEBUG", "Z", "getTIA_DEBUG$annotations", "()V", "", "", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTextInputSession_androidKt {
    public static final boolean TIA_DEBUG = false;
    private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"*/*", "image/*", androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED};

    static /* synthetic */ void getHighSpeedVideoSizes() {
    }

    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) continuation;
            if ((androidTextInputSession_androidKt$platformSpecificTextInputSession$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$12 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
                java.lang.Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.text.input.internal.ComposeInputMethodManager ComposeInputMethodManager = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(platformTextInputSession.getView());
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, function1, function0, ComposeInputMethodManager, mutableSharedFlow, viewConfiguration, function12, androidTextInputSession_androidKt$platformSpecificTextInputSession$12) == coroutine_suspended) {
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
        androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(continuation);
        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$122 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        java.lang.Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2;
        int i;
        if (continuation instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) continuation;
            if ((androidTextInputSession_androidKt$platformSpecificTextInputSession$2.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$2.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(mutableSharedFlow, transformedTextFieldState, textLayoutState, composeInputMethodManager, platformTextInputSession, imeOptions, receiveContentConfiguration, function1, function0, viewConfiguration, function12, null);
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$2.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(androidTextInputSession_androidKt$platformSpecificTextInputSession$3, androidTextInputSession_androidKt$platformSpecificTextInputSession$2) == coroutine_suspended) {
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
        androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(continuation);
        java.lang.Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }
}
