package org.betup.ui.tour.compose;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HomeTourScrollController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController$awaitItemIndexVisible$2", f = "HomeTourScrollController.kt", i = {}, l = {517}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeTourScrollController$awaitItemIndexVisible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ HomeTourScrollController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeTourScrollController$awaitItemIndexVisible$2(HomeTourScrollController homeTourScrollController, int i, Continuation<? super HomeTourScrollController$awaitItemIndexVisible$2> continuation) {
        super(2, continuation);
        this.this$0 = homeTourScrollController;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeTourScrollController$awaitItemIndexVisible$2(this.this$0, this.$index, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((HomeTourScrollController$awaitItemIndexVisible$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final HomeTourScrollController homeTourScrollController = this.this$0;
            final int i2 = this.$index;
            final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.tour.compose.HomeTourScrollController$awaitItemIndexVisible$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = HomeTourScrollController$awaitItemIndexVisible$2.invokeSuspend$lambda$1(HomeTourScrollController.this, i2);
                    return Boolean.valueOf(invokeSuspend$lambda$1);
                }
            });
            this.label = 1;
            obj = FlowKt.first(new Flow<Boolean>() { // from class: org.betup.ui.tour.compose.HomeTourScrollController$awaitItemIndexVisible$2$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: org.betup.ui.tour.compose.HomeTourScrollController$awaitItemIndexVisible$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "org.betup.ui.tour.compose.HomeTourScrollController$awaitItemIndexVisible$2$invokeSuspend$$inlined$filter$1$2", f = "HomeTourScrollController.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    /* renamed from: org.betup.ui.tour.compose.HomeTourScrollController$awaitItemIndexVisible$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (((Boolean) obj).booleanValue()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(HomeTourScrollController homeTourScrollController, int i) {
        LazyListState lazyListState;
        lazyListState = homeTourScrollController.listState;
        List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        if ((visibleItemsInfo instanceof Collection) && visibleItemsInfo.isEmpty()) {
            return false;
        }
        Iterator<T> it = visibleItemsInfo.iterator();
        while (it.hasNext()) {
            if (((LazyListItemInfo) it.next()).getIndex() == i) {
                return true;
            }
        }
        return false;
    }
}
