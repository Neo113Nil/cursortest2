package androidx.compose.foundation.text;

/* compiled from: CoreTextField.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.text.input.ImeOptions $imeOptions;
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager $manager;
    final /* synthetic */ androidx.compose.foundation.text.TextFieldState $state;
    final /* synthetic */ androidx.compose.ui.text.input.TextInputService $textInputService;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$2(androidx.compose.foundation.text.TextFieldState textFieldState, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2> continuation) {
        super(2, continuation);
        this.$state = textFieldState;
        this.$writeable$delegate = state;
        this.$textInputService = textInputService;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = imeOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.runtime.State<java.lang.Boolean> state = this.$writeable$delegate;
                kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        boolean CoreTextField$lambda$8;
                        CoreTextField$lambda$8 = androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField$lambda$8(state);
                        return java.lang.Boolean.valueOf(CoreTextField$lambda$8);
                    }
                });
                final androidx.compose.foundation.text.TextFieldState textFieldState = this.$state;
                final androidx.compose.ui.text.input.TextInputService textInputService = this.$textInputService;
                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                final androidx.compose.ui.text.input.ImeOptions imeOptions = this.$imeOptions;
                this.label = 1;
                if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        return emit(((java.lang.Boolean) obj2).booleanValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                    }

                    public final java.lang.Object emit(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        if (!z || !androidx.compose.foundation.text.TextFieldState.this.getHasFocus()) {
                            androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(androidx.compose.foundation.text.TextFieldState.this);
                        } else {
                            androidx.compose.foundation.text.CoreTextFieldKt.startInputSession(textInputService, androidx.compose.foundation.text.TextFieldState.this, textFieldSelectionManager.getValue$foundation_release(), imeOptions, textFieldSelectionManager.getOffsetMapping());
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(this.$state);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            androidx.compose.foundation.text.CoreTextFieldKt.endInputSession(this.$state);
            throw th;
        }
    }
}
