package org.betup.ui.dialogs;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.subscription.SubscriptionType;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.betup.services.subscription.SubscriptionService;

/* compiled from: NotificationDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.NotificationDialogFragment$onCreateView$1$1$1$1", f = "NotificationDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class NotificationDialogFragment$onCreateView$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<List<SubscriptionType>> $loadedSubscriptions$delegate;
    int label;
    final /* synthetic */ NotificationDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationDialogFragment$onCreateView$1$1$1$1(NotificationDialogFragment notificationDialogFragment, MutableState<List<SubscriptionType>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super NotificationDialogFragment$onCreateView$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationDialogFragment;
        this.$loadedSubscriptions$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationDialogFragment$onCreateView$1$1$1$1(this.this$0, this.$loadedSubscriptions$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationDialogFragment$onCreateView$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List invoke$lambda$1;
        int i;
        int i2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            invoke$lambda$1 = NotificationDialogFragment$onCreateView$1$1.invoke$lambda$1(this.$loadedSubscriptions$delegate);
            if (invoke$lambda$1 == null) {
                i = this.this$0.matchId;
                if (i > 0) {
                    DefaultSubscriptionService subscriptionService = this.this$0.getSubscriptionService();
                    i2 = this.this$0.matchId;
                    final MutableState<List<SubscriptionType>> mutableState = this.$loadedSubscriptions$delegate;
                    final MutableState<Boolean> mutableState2 = this.$isLoading$delegate;
                    subscriptionService.getMatchSubscriptions(i2, new SubscriptionService.MatchSubscriptionsLoadListener() { // from class: org.betup.ui.dialogs.NotificationDialogFragment$onCreateView$1$1$1$1.1
                        @Override // org.betup.services.subscription.SubscriptionService.MatchSubscriptionsLoadListener
                        public void onMatchSubscriptionsGot(List<? extends SubscriptionType> types, boolean success) {
                            MutableState<List<SubscriptionType>> mutableState3 = mutableState;
                            if (!success || types == null) {
                                types = CollectionsKt.emptyList();
                            }
                            mutableState3.setValue(types);
                            NotificationDialogFragment$onCreateView$1$1.invoke$lambda$5(mutableState2, false);
                        }
                    });
                } else {
                    this.$loadedSubscriptions$delegate.setValue(CollectionsKt.emptyList());
                    NotificationDialogFragment$onCreateView$1$1.invoke$lambda$5(this.$isLoading$delegate, false);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
