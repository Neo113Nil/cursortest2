package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", i = {}, l = {923, 923}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionManager$paste$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r5 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r5 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.platform.Clipboard clipboard = this.getHighResolutionOutputSizeshNQ4ISI.getClipboard();
            if (clipboard != null) {
                this.getHighSpeedVideoSizes = 1;
                obj = clipboard.getClipEntry(this);
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.text.AnnotatedString annotatedString = (androidx.compose.ui.text.AnnotatedString) obj;
            if (annotatedString != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.paste$foundation(annotatedString);
                return kotlin.Unit.INSTANCE;
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.ui.platform.ClipEntry clipEntry = (androidx.compose.ui.platform.ClipEntry) obj;
        if (clipEntry != null) {
            this.getHighSpeedVideoSizes = 2;
            obj = androidx.compose.foundation.internal.ClipboardUtils_androidKt.readAnnotatedString(clipEntry, this);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$paste$1(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldSelectionManager;
    }
}
