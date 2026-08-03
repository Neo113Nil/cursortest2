package androidx.compose.foundation.text2;

/* compiled from: BasicSecureTextField.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text2/SecureTextFieldController;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "getCodepointTransformation", "()Landroidx/compose/foundation/text2/input/CodepointTransformation;", "focusChangeModifier", "Landroidx/compose/ui/Modifier;", "getFocusChangeModifier", "()Landroidx/compose/ui/Modifier;", "passwordRevealFilter", "Landroidx/compose/foundation/text2/PasswordRevealFilter;", "getPasswordRevealFilter", "()Landroidx/compose/foundation/text2/PasswordRevealFilter;", "resetTimerSignal", "Lkotlinx/coroutines/channels/Channel;", "", "scheduleHide", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SecureTextFieldController {
    public static final int $stable = 8;
    private final androidx.compose.foundation.text2.PasswordRevealFilter passwordRevealFilter = new androidx.compose.foundation.text2.PasswordRevealFilter(new androidx.compose.foundation.text2.SecureTextFieldController$passwordRevealFilter$1(this));
    private final androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation = new androidx.compose.foundation.text2.input.CodepointTransformation() { // from class: androidx.compose.foundation.text2.SecureTextFieldController$$ExternalSyntheticLambda0
        @Override // androidx.compose.foundation.text2.input.CodepointTransformation
        public final int transform(int i, int i2) {
            int codepointTransformation$lambda$0;
            codepointTransformation$lambda$0 = androidx.compose.foundation.text2.SecureTextFieldController.codepointTransformation$lambda$0(androidx.compose.foundation.text2.SecureTextFieldController.this, i, i2);
            return codepointTransformation$lambda$0;
        }
    };
    private final androidx.compose.ui.Modifier focusChangeModifier = androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.SecureTextFieldController$focusChangeModifier$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState) {
            invoke2(focusState);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.focus.FocusState focusState) {
            if (focusState.isFocused()) {
                return;
            }
            androidx.compose.foundation.text2.SecureTextFieldController.this.getPasswordRevealFilter().hide();
        }
    });
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> resetTimerSignal = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    public SecureTextFieldController(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text2.SecureTextFieldController.AnonymousClass1(null), 3, null);
    }

    public final androidx.compose.foundation.text2.PasswordRevealFilter getPasswordRevealFilter() {
        return this.passwordRevealFilter;
    }

    public final androidx.compose.foundation.text2.input.CodepointTransformation getCodepointTransformation() {
        return this.codepointTransformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int codepointTransformation$lambda$0(androidx.compose.foundation.text2.SecureTextFieldController secureTextFieldController, int i, int i2) {
        if (i == secureTextFieldController.passwordRevealFilter.getRevealCodepointIndex$foundation_release()) {
            return i2;
        }
        return 8226;
    }

    public final androidx.compose.ui.Modifier getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    /* compiled from: BasicSecureTextField.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.SecureTextFieldController$1", f = "BasicSecureTextField.kt", i = {}, l = {384}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text2.SecureTextFieldController$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.SecureTextFieldController.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return androidx.compose.foundation.text2.SecureTextFieldController.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text2.SecureTextFieldController.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.consumeAsFlow(androidx.compose.foundation.text2.SecureTextFieldController.this.resetTimerSignal), new androidx.compose.foundation.text2.SecureTextFieldController.AnonymousClass1.C00321(androidx.compose.foundation.text2.SecureTextFieldController.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* compiled from: BasicSecureTextField.kt */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.SecureTextFieldController$1$1", f = "BasicSecureTextField.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text2.SecureTextFieldController$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00321 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int label;
            final /* synthetic */ androidx.compose.foundation.text2.SecureTextFieldController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00321(androidx.compose.foundation.text2.SecureTextFieldController secureTextFieldController, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.SecureTextFieldController.AnonymousClass1.C00321> continuation) {
                super(2, continuation);
                this.this$0 = secureTextFieldController;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.text2.SecureTextFieldController.AnonymousClass1.C00321(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.text2.SecureTextFieldController.AnonymousClass1.C00321) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (kotlinx.coroutines.DelayKt.delay(androidx.compose.foundation.BasicTooltipDefaults.TooltipDuration, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.this$0.getPasswordRevealFilter().hide();
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleHide() {
        if (kotlinx.coroutines.channels.ChannelResult.m12328isSuccessimpl(this.resetTimerSignal.mo10716trySendJP2dKIU(kotlin.Unit.INSTANCE))) {
            return;
        }
        this.passwordRevealFilter.hide();
    }
}
