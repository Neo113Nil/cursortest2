package org.betup.ui.dialogs;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BetPlacedDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$1$1", f = "BetPlacedDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetPlacedDialog$onCreateView$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    int label;
    final /* synthetic */ BetPlacedDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetPlacedDialog$onCreateView$1$1$1$1(BetPlacedDialog betPlacedDialog, State<Boolean> state, Continuation<? super BetPlacedDialog$onCreateView$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = betPlacedDialog;
        this.$isLoading$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetPlacedDialog$onCreateView$1$1$1$1(this.this$0, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetPlacedDialog$onCreateView$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean invoke$lambda$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isResumed()) {
            invoke$lambda$1 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$1(this.$isLoading$delegate);
            if (!invoke$lambda$1) {
                this.this$0.getScreenTracker().setCurrentScreen(this.this$0.presentationScreenKey(), this.this$0.presentationScreenContext());
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
