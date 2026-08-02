package org.betup.ui.fragment.matches.details;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.betup.services.subscription.SubscriptionService;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsController$loadSubscriptions$1", f = "MatchDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsController$loadSubscriptions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MatchDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchDetailsController$loadSubscriptions$1(MatchDetailsController matchDetailsController, Continuation<? super MatchDetailsController$loadSubscriptions$1> continuation) {
        super(2, continuation);
        this.this$0 = matchDetailsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchDetailsController$loadSubscriptions$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchDetailsController$loadSubscriptions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            DefaultSubscriptionService subscriptionService = this.this$0.getSubscriptionService();
            i = this.this$0.id;
            final MatchDetailsController matchDetailsController = this.this$0;
            subscriptionService.getMatchSubscriptions(i, new SubscriptionService.MatchSubscriptionsLoadListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$loadSubscriptions$1$$ExternalSyntheticLambda0
                @Override // org.betup.services.subscription.SubscriptionService.MatchSubscriptionsLoadListener
                public final void onMatchSubscriptionsGot(List list, boolean z) {
                    MatchDetailsController$loadSubscriptions$1.invokeSuspend$lambda$0(MatchDetailsController.this, list, z);
                }
            });
        } catch (Exception e) {
            Log.e("MatchDetailsController", "Error loading subscriptions: " + e.getMessage(), e);
            mutableStateFlow = this.this$0._error;
            mutableStateFlow.setValue("Error loading subscriptions");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(MatchDetailsController matchDetailsController, List list, boolean z) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        if (z) {
            mutableStateFlow2 = matchDetailsController._isSubscribed;
            List list2 = list;
            mutableStateFlow2.setValue(Boolean.valueOf(!(list2 == null || list2.isEmpty())));
            Log.d("MatchDetailsController", "Subscriptions loaded: " + (list != null ? list.size() : 0));
            return;
        }
        mutableStateFlow = matchDetailsController._error;
        mutableStateFlow.setValue("Error loading subscriptions");
        Log.e("MatchDetailsController", "Error loading subscriptions");
    }
}
