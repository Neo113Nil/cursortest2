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
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptRequest;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ChallengeAcceptController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.ChallengeAcceptController$acceptChallenge$2", f = "ChallengeAcceptController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChallengeAcceptController$acceptChallenge$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $currentBetId;
    final /* synthetic */ Long $currentChallengeId;
    int label;
    final /* synthetic */ ChallengeAcceptController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeAcceptController$acceptChallenge$2(ChallengeAcceptController challengeAcceptController, Long l, Long l2, Continuation<? super ChallengeAcceptController$acceptChallenge$2> continuation) {
        super(2, continuation);
        this.this$0 = challengeAcceptController;
        this.$currentChallengeId = l;
        this.$currentBetId = l2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeAcceptController$acceptChallenge$2(this.this$0, this.$currentChallengeId, this.$currentBetId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChallengeAcceptController$acceptChallenge$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableStateFlow3 = this.this$0._isLoading;
                mutableStateFlow3.setValue(Boxing.boxBoolean(true));
                mutableStateFlow4 = this.this$0._error;
                mutableStateFlow4.setValue(null);
                try {
                    this.this$0.showMessage(R.string.battles_loading);
                } catch (Throwable unused) {
                }
                ChallengeAcceptRequest challengeAcceptRequest = new ChallengeAcceptRequest(this.$currentChallengeId.longValue(), 2, this.$currentBetId.longValue());
                ChallengeAcceptInteractor challengeAcceptInteractor = this.this$0.getChallengeAcceptInteractor();
                final ChallengeAcceptController challengeAcceptController = this.this$0;
                challengeAcceptInteractor.load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener>) new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$acceptChallenge$2$$ExternalSyntheticLambda0
                    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                    public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                        ChallengeAcceptController$acceptChallenge$2.invokeSuspend$lambda$2(ChallengeAcceptController.this, fetchedResponseMessage);
                    }
                }, (BaseCachedSharedInteractor.OnFetchedListener) challengeAcceptRequest);
            } catch (Exception e) {
                Log.e("ChallengeAcceptController", "Error accepting challenge: " + e.getMessage(), e);
                mutableStateFlow = this.this$0._isLoading;
                mutableStateFlow.setValue(Boxing.boxBoolean(false));
                mutableStateFlow2 = this.this$0._error;
                mutableStateFlow2.setValue("Error accepting challenge: " + e.getMessage());
                try {
                    this.this$0.showMessage(R.string.battles_error);
                } catch (Throwable unused2) {
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(ChallengeAcceptController challengeAcceptController, FetchedResponseMessage fetchedResponseMessage) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Function0 function0;
        mutableStateFlow = challengeAcceptController._isLoading;
        mutableStateFlow.setValue(false);
        if (Intrinsics.areEqual(fetchedResponseMessage.getStat().name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            final long id = ((V7ChallengeDetailsResponseModel) fetchedResponseMessage.getModel()).getId();
            Log.d("ChallengeAcceptController", "Challenge accepted successfully: " + id);
            mutableStateFlow3 = challengeAcceptController._isSuccess;
            mutableStateFlow3.setValue(true);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$acceptChallenge$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ChallengeAcceptController$acceptChallenge$2.invokeSuspend$lambda$2$lambda$0(id);
                }
            }, 500L);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$acceptChallenge$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ChallengeAcceptController$acceptChallenge$2.invokeSuspend$lambda$2$lambda$1();
                }
            }, 3000L);
            function0 = challengeAcceptController.onDismiss;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Log.e("ChallengeAcceptController", "Failed to accept challenge: " + fetchedResponseMessage.getStat());
        mutableStateFlow2 = challengeAcceptController._error;
        mutableStateFlow2.setValue("Failed to accept challenge");
        try {
            challengeAcceptController.showMessage(R.string.battles_error);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$0(long j) {
        EventBus.getDefault().post(new ChallengeAcceptedOrCreatedEvent(Long.valueOf(j)));
        EventBus.getDefault().post(new ChallengesChangedMessage());
        Log.d("ChallengeAcceptController", "ChallengesChangedMessage posted successfully after delay");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$1() {
        Log.d("ChallengeAcceptController", "Posting UserProfileUpdatedMessage to update balance after challenge acceptance");
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }
}
