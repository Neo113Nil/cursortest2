package org.betup.ui.fragment.notifications.compose;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.betup.model.local.entity.Event;
import org.betup.ui.fragment.notifications.controller.NotificationsController;

/* compiled from: NotificationsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationsScreen$2$1", f = "NotificationsScreen.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class NotificationsScreenKt$NotificationsScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NotificationsController $controller;
    final /* synthetic */ State<Boolean> $hasMore$delegate;
    final /* synthetic */ State<Boolean> $isLoadingMore$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ State<List<Event>> $notifications$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NotificationsScreenKt$NotificationsScreen$2$1(LazyListState lazyListState, NotificationsController notificationsController, State<? extends List<? extends Event>> state, State<Boolean> state2, State<Boolean> state3, Continuation<? super NotificationsScreenKt$NotificationsScreen$2$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$controller = notificationsController;
        this.$notifications$delegate = state;
        this.$isLoadingMore$delegate = state2;
        this.$hasMore$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationsScreenKt$NotificationsScreen$2$1(this.$listState, this.$controller, this.$notifications$delegate, this.$isLoadingMore$delegate, this.$hasMore$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationsScreenKt$NotificationsScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationsScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = NotificationsScreenKt$NotificationsScreen$2$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final NotificationsController notificationsController = this.$controller;
            final State<List<Event>> state = this.$notifications$delegate;
            final State<Boolean> state2 = this.$isLoadingMore$delegate;
            final State<Boolean> state3 = this.$hasMore$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.notifications.compose.NotificationsScreenKt$NotificationsScreen$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    List NotificationsScreen$lambda$2;
                    List NotificationsScreen$lambda$22;
                    boolean NotificationsScreen$lambda$4;
                    boolean NotificationsScreen$lambda$5;
                    NotificationsScreen$lambda$2 = NotificationsScreenKt.NotificationsScreen$lambda$2(state);
                    if (!NotificationsScreen$lambda$2.isEmpty() && num != null) {
                        int intValue = num.intValue();
                        NotificationsScreen$lambda$22 = NotificationsScreenKt.NotificationsScreen$lambda$2(state);
                        if (intValue >= NotificationsScreen$lambda$22.size() - 3) {
                            NotificationsScreen$lambda$4 = NotificationsScreenKt.NotificationsScreen$lambda$4(state2);
                            if (!NotificationsScreen$lambda$4) {
                                NotificationsScreen$lambda$5 = NotificationsScreenKt.NotificationsScreen$lambda$5(state3);
                                if (NotificationsScreen$lambda$5) {
                                    NotificationsController.this.loadMore();
                                }
                            }
                        }
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
    public static final Integer invokeSuspend$lambda$0(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }
}
