package org.betup.ui.fragment.home;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.home.compose.HomeUiState;
import org.betup.ui.tour.compose.HomeTourSteps;
import org.betup.ui.tour.compose.TourState;

/* compiled from: KHomeFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$initLayout$1$1$1", f = "KHomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeFragment$initLayout$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTourActive;
    final /* synthetic */ HomeUiState $screenState;
    final /* synthetic */ TourState $tourState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeFragment$initLayout$1$1$1(boolean z, TourState tourState, HomeUiState homeUiState, Continuation<? super HomeFragment$initLayout$1$1$1> continuation) {
        super(2, continuation);
        this.$isTourActive = z;
        this.$tourState = tourState;
        this.$screenState = homeUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$initLayout$1$1$1(this.$isTourActive, this.$tourState, this.$screenState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFragment$initLayout$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TourState tourState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isTourActive && (tourState = this.$tourState) != null) {
            tourState.setHomeTourSkipContext(HomeTourSteps.INSTANCE.fromUiState(this.$screenState));
        }
        return Unit.INSTANCE;
    }
}
