package org.betup.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.betup.R;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.fragment.home.controller.HomeDailyQuestEvent;
import org.betup.utils.SnackbarHelper;

/* compiled from: MainActivityDailyQuestObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1", f = "MainActivityDailyQuestObserver.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeDailyQuestController $homeDailyQuestController;
    final /* synthetic */ MainActivity $this_bindDailyQuestEvents;
    final /* synthetic */ UserService $userService;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1(MainActivity mainActivity, HomeDailyQuestController homeDailyQuestController, UserService userService, Continuation<? super MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1> continuation) {
        super(2, continuation);
        this.$this_bindDailyQuestEvents = mainActivity;
        this.$homeDailyQuestController = homeDailyQuestController;
        this.$userService = userService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1(this.$this_bindDailyQuestEvents, this.$homeDailyQuestController, this.$userService, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: MainActivityDailyQuestObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.ui.MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1$1", f = "MainActivityDailyQuestObserver.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: org.betup.ui.MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeDailyQuestController $homeDailyQuestController;
        final /* synthetic */ MainActivity $this_bindDailyQuestEvents;
        final /* synthetic */ UserService $userService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeDailyQuestController homeDailyQuestController, MainActivity mainActivity, UserService userService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$homeDailyQuestController = homeDailyQuestController;
            this.$this_bindDailyQuestEvents = mainActivity;
            this.$userService = userService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$homeDailyQuestController, this.$this_bindDailyQuestEvents, this.$userService, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MainActivityDailyQuestObserver.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: org.betup.ui.MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C14381<T> implements FlowCollector {
            final /* synthetic */ HomeDailyQuestController $homeDailyQuestController;
            final /* synthetic */ MainActivity $this_bindDailyQuestEvents;
            final /* synthetic */ UserService $userService;

            C14381(MainActivity mainActivity, HomeDailyQuestController homeDailyQuestController, UserService userService) {
                this.$this_bindDailyQuestEvents = mainActivity;
                this.$homeDailyQuestController = homeDailyQuestController;
                this.$userService = userService;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((HomeDailyQuestEvent) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(final HomeDailyQuestEvent homeDailyQuestEvent, Continuation<? super Unit> continuation) {
                if (homeDailyQuestEvent instanceof HomeDailyQuestEvent.ShowError) {
                    SnackbarHelper.showShort(this.$this_bindDailyQuestEvents, ((HomeDailyQuestEvent.ShowError) homeDailyQuestEvent).getMessageResId());
                } else {
                    if (!(homeDailyQuestEvent instanceof HomeDailyQuestEvent.ShowClaimableNotification)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MainActivity mainActivity = this.$this_bindDailyQuestEvents;
                    final HomeDailyQuestController homeDailyQuestController = this.$homeDailyQuestController;
                    final UserService userService = this.$userService;
                    SnackbarHelper.showShortWithAction(mainActivity, R.string.home_daily_quests_complete_notification, R.string.home_daily_quests_claim_reward, new Runnable() { // from class: org.betup.ui.MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1$1$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MainActivityDailyQuestObserverKt$bindDailyQuestEvents$1.AnonymousClass1.C14381.emit$lambda$0(HomeDailyQuestController.this, homeDailyQuestEvent, userService);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void emit$lambda$0(HomeDailyQuestController homeDailyQuestController, HomeDailyQuestEvent homeDailyQuestEvent, UserService userService) {
                homeDailyQuestController.claim(((HomeDailyQuestEvent.ShowClaimableNotification) homeDailyQuestEvent).getQuestId(), userService);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$homeDailyQuestController.getEvents().collect(new C14381(this.$this_bindDailyQuestEvents, this.$homeDailyQuestController, this.$userService), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$this_bindDailyQuestEvents, Lifecycle.State.STARTED, new AnonymousClass1(this.$homeDailyQuestController, this.$this_bindDailyQuestEvents, this.$userService, null), this) == coroutine_suspended) {
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
