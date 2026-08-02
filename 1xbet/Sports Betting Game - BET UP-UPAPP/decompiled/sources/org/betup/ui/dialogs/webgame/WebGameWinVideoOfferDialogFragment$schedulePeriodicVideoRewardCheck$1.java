package org.betup.ui.dialogs.webgame;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;

/* compiled from: WebGameWinVideoOfferDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment$schedulePeriodicVideoRewardCheck$1", f = "WebGameWinVideoOfferDialogFragment.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class WebGameWinVideoOfferDialogFragment$schedulePeriodicVideoRewardCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebGameWinVideoOfferDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebGameWinVideoOfferDialogFragment$schedulePeriodicVideoRewardCheck$1(WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment, Continuation<? super WebGameWinVideoOfferDialogFragment$schedulePeriodicVideoRewardCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = webGameWinVideoOfferDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebGameWinVideoOfferDialogFragment$schedulePeriodicVideoRewardCheck$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebGameWinVideoOfferDialogFragment$schedulePeriodicVideoRewardCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        PromoService.PromoPlacement promoPlacement;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.isAdded()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isAdded()) {
            try {
                this.this$0.getVideoRewardService().triggerCaching();
                VideoRewardService videoRewardService = this.this$0.getVideoRewardService();
                promoPlacement = this.this$0.placement;
                j = this.this$0.referencedValue;
                videoRewardService.getVideoRewardInfo(promoPlacement, Boxing.boxLong(j), null);
                if (this.this$0.isAdded()) {
                    mutableStateFlow = this.this$0._isVideoAvailable;
                    if (!((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                        this.label = 1;
                        if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (this.this$0.isAdded()) {
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(WebGameWinVideoOfferDialogFragment.TAG, "Periodic video reward check failed", e);
            }
        }
        return Unit.INSTANCE;
    }
}
