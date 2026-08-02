package org.betup.ui.fragment.flashbet;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartUiState;

/* compiled from: FlashBetMatchStartFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment$onViewCreated$1", f = "FlashBetMatchStartFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetMatchStartFragment$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlashBetMatchStartFragment$onViewCreated$backCallback$1 $backCallback;
    int label;
    final /* synthetic */ FlashBetMatchStartFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetMatchStartFragment$onViewCreated$1(FlashBetMatchStartFragment flashBetMatchStartFragment, FlashBetMatchStartFragment$onViewCreated$backCallback$1 flashBetMatchStartFragment$onViewCreated$backCallback$1, Continuation<? super FlashBetMatchStartFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = flashBetMatchStartFragment;
        this.$backCallback = flashBetMatchStartFragment$onViewCreated$backCallback$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetMatchStartFragment$onViewCreated$1(this.this$0, this.$backCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetMatchStartFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<FlashBetMatchStartUiState> uiState = this.this$0.getController().getUiState();
            final FlashBetMatchStartFragment$onViewCreated$backCallback$1 flashBetMatchStartFragment$onViewCreated$backCallback$1 = this.$backCallback;
            this.label = 1;
            if (uiState.collect(new FlowCollector() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment$onViewCreated$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((FlashBetMatchStartUiState) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(FlashBetMatchStartUiState flashBetMatchStartUiState, Continuation<? super Unit> continuation) {
                    setEnabled(FlashBetMatchStartContentKt.isSessionCommitted(flashBetMatchStartUiState));
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
