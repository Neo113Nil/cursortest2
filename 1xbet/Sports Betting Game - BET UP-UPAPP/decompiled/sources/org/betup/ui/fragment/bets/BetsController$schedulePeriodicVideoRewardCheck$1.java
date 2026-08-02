package org.betup.ui.fragment.bets;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.services.offer.PromoService;
import org.betup.ui.MainActivity;

/* compiled from: BetsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.BetsController$schedulePeriodicVideoRewardCheck$1", f = "BetsController.kt", i = {0}, l = {1252}, m = "invokeSuspend", n = {"currentActivity"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class BetsController$schedulePeriodicVideoRewardCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $betId;
    final /* synthetic */ PromoService.PromoPlacement $placement;
    final /* synthetic */ Long $referencedValue;
    Object L$0;
    int label;
    final /* synthetic */ BetsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetsController$schedulePeriodicVideoRewardCheck$1(BetsController betsController, int i, PromoService.PromoPlacement promoPlacement, Long l, Continuation<? super BetsController$schedulePeriodicVideoRewardCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = betsController;
        this.$betId = i;
        this.$placement = promoPlacement;
        this.$referencedValue = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetsController$schedulePeriodicVideoRewardCheck$1(this.this$0, this.$betId, this.$placement, this.$referencedValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetsController$schedulePeriodicVideoRewardCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:5:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainActivity mainActivity;
        MainActivity mainActivity2;
        long j;
        MainActivity mainActivity3;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mainActivity = this.this$0.activity;
            mainActivity2 = mainActivity;
            if (mainActivity2 != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mainActivity2 = (MainActivity) this.L$0;
        ResultKt.throwOnFailure(obj);
        mainActivity3 = this.this$0.activity;
        if (mainActivity3 != null && !mainActivity3.isFinishing() && !mainActivity3.isDestroyed()) {
            mutableStateFlow = this.this$0._isBonusAvailable;
            if (!((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                List<BetsListModel> value = this.this$0.getBetList().getValue();
                int i2 = this.$betId;
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        Integer id = ((BetsListModel) it.next()).getId();
                        if (id != null && id.intValue() == i2) {
                            Log.d("BetsController", "Periodic check: Checking video reward availability for bet " + this.$betId + ", placement=" + this.$placement);
                            this.this$0.getVideoRewardService().triggerCaching();
                            this.this$0.getVideoRewardService().getVideoRewardInfo(this.$placement, this.$referencedValue, null);
                        }
                    }
                }
            }
            Log.d("BetsController", "Periodic check: Stopping - button available or bet not found");
            return Unit.INSTANCE;
        }
        if (mainActivity2 != null && !mainActivity2.isFinishing() && !mainActivity2.isDestroyed()) {
            j = this.this$0.VIDEO_REWARD_CHECK_INTERVAL;
            this.L$0 = mainActivity2;
            this.label = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mainActivity3 = this.this$0.activity;
            if (mainActivity3 != null) {
                mutableStateFlow = this.this$0._isBonusAvailable;
                if (!((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                }
                Log.d("BetsController", "Periodic check: Stopping - button available or bet not found");
            }
            if (mainActivity2 != null) {
                j = this.this$0.VIDEO_REWARD_CHECK_INTERVAL;
                this.L$0 = mainActivity2;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                }
                mainActivity3 = this.this$0.activity;
                if (mainActivity3 != null) {
                }
                if (mainActivity2 != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
