package androidx.compose.foundation.lazy;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: LazyListItemProviderImpl.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1", f = "LazyListItemProviderImpl.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class LazyListItemProviderImplKt$rememberItemProvider$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<IntRange> $nearestItemsRangeState;
    final /* synthetic */ LazyListState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListItemProviderImplKt$rememberItemProvider$1(LazyListState lazyListState, MutableState<IntRange> mutableState, Continuation<? super LazyListItemProviderImplKt$rememberItemProvider$1> continuation) {
        super(2, continuation);
        this.$state = lazyListState;
        this.$nearestItemsRangeState = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyListItemProviderImplKt$rememberItemProvider$1(this.$state, this.$nearestItemsRangeState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyListItemProviderImplKt$rememberItemProvider$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$state;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<IntRange>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final IntRange invoke() {
                    IntRange calculateNearestItemsRange;
                    calculateNearestItemsRange = LazyListItemProviderImplKt.calculateNearestItemsRange(LazyListState.this.getFirstVisibleItemIndex());
                    return calculateNearestItemsRange;
                }
            });
            final MutableState<IntRange> mutableState = this.$nearestItemsRangeState;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector<IntRange>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(IntRange intRange, Continuation continuation) {
                    return emit2(intRange, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit, reason: avoid collision after fix types in other method */
                public final Object emit2(IntRange intRange, Continuation<? super Unit> continuation) {
                    mutableState.setValue(intRange);
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
}
