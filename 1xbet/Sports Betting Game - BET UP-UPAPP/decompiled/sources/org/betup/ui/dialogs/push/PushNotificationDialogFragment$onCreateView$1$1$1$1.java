package org.betup.ui.dialogs.push;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.ui.common.compose.HapticFeedbackEffect;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.dialogs.push.PushNotificationData;

/* compiled from: PushNotificationDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.push.PushNotificationDialogFragment$onCreateView$1$1$1$1", f = "PushNotificationDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class PushNotificationDialogFragment$onCreateView$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PushNotificationData $data;
    int label;
    final /* synthetic */ PushNotificationDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushNotificationDialogFragment$onCreateView$1$1$1$1(PushNotificationData pushNotificationData, PushNotificationDialogFragment pushNotificationDialogFragment, Continuation<? super PushNotificationDialogFragment$onCreateView$1$1$1$1> continuation) {
        super(2, continuation);
        this.$data = pushNotificationData;
        this.this$0 = pushNotificationDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushNotificationDialogFragment$onCreateView$1$1$1$1(this.$data, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PushNotificationDialogFragment$onCreateView$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HapticFeedbackType hapticFeedbackType;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PushNotificationData pushNotificationData = this.$data;
        if (pushNotificationData instanceof PushNotificationData.BetResult) {
            hapticFeedbackType = HapticFeedbackEffect.forBetState(BetState.fromInt(((PushNotificationData.BetResult) pushNotificationData).getBetState()));
        } else if ((pushNotificationData instanceof PushNotificationData.AchievementUnlocked) || (pushNotificationData instanceof PushNotificationData.Reward)) {
            hapticFeedbackType = HapticFeedbackType.Win;
        } else {
            hapticFeedbackType = HapticFeedbackEffect.forPushNotification(pushNotificationData.getNotificationType());
        }
        HapticFeedbackEffect.perform(this.this$0.requireActivity(), hapticFeedbackType);
        return Unit.INSTANCE;
    }
}
