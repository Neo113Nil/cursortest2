package org.betup.ui.dialogs.controller;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.R;
import org.betup.bus.ChallengesChangedMessage;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ChallengePreviewController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.ChallengePreviewController$cancelChallenge$1$1$1", f = "ChallengePreviewController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChallengePreviewController$cancelChallenge$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $challengeId;
    final /* synthetic */ FetchedResponseMessage<V7ChallengeDetailsResponseModel, Long> $response;
    int label;
    final /* synthetic */ ChallengePreviewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengePreviewController$cancelChallenge$1$1$1(ChallengePreviewController challengePreviewController, FetchedResponseMessage<V7ChallengeDetailsResponseModel, Long> fetchedResponseMessage, long j, Continuation<? super ChallengePreviewController$cancelChallenge$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = challengePreviewController;
        this.$response = fetchedResponseMessage;
        this.$challengeId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengePreviewController$cancelChallenge$1$1$1(this.this$0, this.$response, this.$challengeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChallengePreviewController$cancelChallenge$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        boolean z;
        Function0 function0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._isCancelInProgress;
            mutableStateFlow.setValue(Boxing.boxBoolean(false));
            z = this.this$0.isBound;
            if (!z) {
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(this.$response.getStat().name(), "SUCCESS") && this.$response.getModel() != null) {
                Log.d(ChallengePreviewController.TAG, "Challenge canceled successfully: " + this.$challengeId);
                MainActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    SnackbarHelper.showShort(activity, R.string.battle_cancel_success);
                }
                Handler handler = new Handler(Looper.getMainLooper());
                final long j = this.$challengeId;
                handler.postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.controller.ChallengePreviewController$cancelChallenge$1$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChallengePreviewController$cancelChallenge$1$1$1.invokeSuspend$lambda$0(j);
                    }
                }, 300L);
                function0 = this.this$0.onDismiss;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                Log.e(ChallengePreviewController.TAG, "Failed to cancel challenge: " + this.$response.getStat());
                int i = Intrinsics.areEqual(this.$response.getStat().name(), "NOT_ALLOWED") ? R.string.battle_cancel_conflict : R.string.battles_error;
                MainActivity activity2 = this.this$0.getActivity();
                if (activity2 != null) {
                    SnackbarHelper.showShort(activity2, i);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(long j) {
        EventBus.getDefault().post(new ChallengeAcceptedOrCreatedEvent(Long.valueOf(j)));
        EventBus.getDefault().post(new ChallengesChangedMessage());
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }
}
