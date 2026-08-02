package org.betup.ui.dialogs.controller;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import org.betup.model.remote.api.rest.energy.NewChallengeCreateInteractor;
import org.betup.model.remote.api.rest.energy.NewCreateChallengeModel;
import org.betup.model.remote.entity.challenges.NewChallengeCreatedModel;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.ui.dialogs.events.OpenChallengePreviewDialog;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ChallengeAcceptController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.ChallengeAcceptController$createChallenge$2", f = "ChallengeAcceptController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ChallengeAcceptController$createChallenge$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $moneyPlaced;
    int label;
    final /* synthetic */ ChallengeAcceptController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeAcceptController$createChallenge$2(ChallengeAcceptController challengeAcceptController, long j, Continuation<? super ChallengeAcceptController$createChallenge$2> continuation) {
        super(2, continuation);
        this.this$0 = challengeAcceptController;
        this.$moneyPlaced = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChallengeAcceptController$createChallenge$2(this.this$0, this.$moneyPlaced, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChallengeAcceptController$createChallenge$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        Long value;
        NewCreateChallengeModel newCreateChallengeModel;
        String str;
        Double d;
        String str2;
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
                value = this.this$0.getUserId().getValue();
            } catch (Exception e) {
                Log.e("ChallengeAcceptController", "Error creating challenge: " + e.getMessage(), e);
                mutableStateFlow = this.this$0._isLoading;
                mutableStateFlow.setValue(Boxing.boxBoolean(false));
                mutableStateFlow2 = this.this$0._error;
                mutableStateFlow2.setValue("Error creating challenge: " + e.getMessage());
                try {
                    this.this$0.showMessage(R.string.battles_error);
                } catch (Throwable unused2) {
                }
            }
            if (value != null && value.longValue() != 0) {
                long j = this.$moneyPlaced;
                Long l = this.this$0.get_betId();
                Intrinsics.checkNotNull(l);
                newCreateChallengeModel = new NewCreateChallengeModel(j, l.longValue(), true, CollectionsKt.listOf(value));
                boolean isPrivate = newCreateChallengeModel.isPrivate();
                List<Long> invitedUsers = newCreateChallengeModel.getInvitedUsers();
                Long l2 = this.this$0.get_betId();
                str = this.this$0._betName;
                d = this.this$0.coefficient;
                str2 = this.this$0.groupName;
                Log.d("ChallengeAcceptController", "Creating challenge: isPrivate=" + isPrivate + ", userId=" + value + ", invitedUsers=" + invitedUsers + ", betId=" + l2 + ", betName=" + str + ", coefficient=" + d + ", groupName=" + str2);
                NewChallengeCreateInteractor challengeCreateInteractor = this.this$0.getChallengeCreateInteractor();
                final ChallengeAcceptController challengeAcceptController = this.this$0;
                challengeCreateInteractor.load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener>) new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$createChallenge$2$$ExternalSyntheticLambda2
                    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                    public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                        ChallengeAcceptController$createChallenge$2.invokeSuspend$lambda$2(ChallengeAcceptController.this, fetchedResponseMessage);
                    }
                }, (BaseCachedSharedInteractor.OnFetchedListener) newCreateChallengeModel);
                return Unit.INSTANCE;
            }
            long j2 = this.$moneyPlaced;
            Long l3 = this.this$0.get_betId();
            Intrinsics.checkNotNull(l3);
            newCreateChallengeModel = new NewCreateChallengeModel(j2, l3.longValue(), false, CollectionsKt.emptyList());
            boolean isPrivate2 = newCreateChallengeModel.isPrivate();
            List<Long> invitedUsers2 = newCreateChallengeModel.getInvitedUsers();
            Long l22 = this.this$0.get_betId();
            str = this.this$0._betName;
            d = this.this$0.coefficient;
            str2 = this.this$0.groupName;
            Log.d("ChallengeAcceptController", "Creating challenge: isPrivate=" + isPrivate2 + ", userId=" + value + ", invitedUsers=" + invitedUsers2 + ", betId=" + l22 + ", betName=" + str + ", coefficient=" + d + ", groupName=" + str2);
            NewChallengeCreateInteractor challengeCreateInteractor2 = this.this$0.getChallengeCreateInteractor();
            final ChallengeAcceptController challengeAcceptController2 = this.this$0;
            challengeCreateInteractor2.load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener>) new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$createChallenge$2$$ExternalSyntheticLambda2
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    ChallengeAcceptController$createChallenge$2.invokeSuspend$lambda$2(ChallengeAcceptController.this, fetchedResponseMessage);
                }
            }, (BaseCachedSharedInteractor.OnFetchedListener) newCreateChallengeModel);
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
            final long id = ((NewChallengeCreatedModel) fetchedResponseMessage.getModel()).getId();
            Log.d("ChallengeAcceptController", "Challenge created successfully: " + id);
            Log.d("ChallengeAcceptController", "Full response model: " + fetchedResponseMessage.getModel());
            mutableStateFlow3 = challengeAcceptController._isSuccess;
            mutableStateFlow3.setValue(true);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$createChallenge$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChallengeAcceptController$createChallenge$2.invokeSuspend$lambda$2$lambda$0(id);
                }
            }, 500L);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$createChallenge$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ChallengeAcceptController$createChallenge$2.invokeSuspend$lambda$2$lambda$1();
                }
            }, 3000L);
            function0 = challengeAcceptController.onDismiss;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Log.e("ChallengeAcceptController", "Failed to create challenge: " + fetchedResponseMessage.getStat());
        mutableStateFlow2 = challengeAcceptController._error;
        mutableStateFlow2.setValue("Failed to create challenge");
        try {
            challengeAcceptController.showMessage(R.string.battles_error);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$0(long j) {
        EventBus.getDefault().post(new ChallengeAcceptedOrCreatedEvent(Long.valueOf(j)));
        EventBus.getDefault().post(new OpenChallengePreviewDialog(Integer.valueOf((int) j), null, 2, null));
        EventBus.getDefault().post(new ChallengesChangedMessage());
        Log.d("ChallengeAcceptController", "ChallengesChangedMessage posted successfully after delay");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$1() {
        Log.d("ChallengeAcceptController", "Posting UserProfileUpdatedMessage to update balance after challenge creation");
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }
}
