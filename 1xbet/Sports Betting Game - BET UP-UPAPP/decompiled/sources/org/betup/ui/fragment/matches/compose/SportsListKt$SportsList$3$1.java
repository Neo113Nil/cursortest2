package org.betup.ui.fragment.matches.compose;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: SportsList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.compose.SportsListKt$SportsList$3$1", f = "SportsList.kt", i = {}, l = {Opcodes.L2F}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SportsListKt$SportsList$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onListPositionChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SportsListKt$SportsList$3$1(LazyListState lazyListState, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super SportsListKt$SportsList$3$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$onListPositionChanged = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportsListKt$SportsList$3$1(this.$listState, this.$onListPositionChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportsListKt$SportsList$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$SportsList$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Pair invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = SportsListKt$SportsList$3$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final Function2<Integer, Integer, Unit> function2 = this.$onListPositionChanged;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.matches.compose.SportsListKt$SportsList$3$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Pair<Integer, Integer>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Pair<Integer, Integer> pair, Continuation<? super Unit> continuation) {
                    int intValue = pair.component1().intValue();
                    int intValue2 = pair.component2().intValue();
                    Function2<Integer, Integer, Unit> function22 = function2;
                    if (function22 != null) {
                        function22.invoke(Boxing.boxInt(intValue), Boxing.boxInt(intValue2));
                    }
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invokeSuspend$lambda$0(LazyListState lazyListState) {
        return TuplesKt.to(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
    }
}
