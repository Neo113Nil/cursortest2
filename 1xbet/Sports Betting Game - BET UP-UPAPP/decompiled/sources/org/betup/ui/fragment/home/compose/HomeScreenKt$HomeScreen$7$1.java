package org.betup.ui.fragment.home.compose;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.ui.tour.compose.HomeTourScrollController;
import org.betup.ui.tour.compose.HomeTourScrollDebug;
import org.betup.ui.tour.compose.TourStep;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$7$1", f = "HomeScreen.kt", i = {0, 1}, l = {Opcodes.DCMPG, 154}, m = "invokeSuspend", n = {"saved", "saved"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class HomeScreenKt$HomeScreen$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $lastShouldShowTourOverlay$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ MutableState<Pair<Integer, Integer>> $scrollPinnedAtScrollEnd$delegate;
    final /* synthetic */ boolean $shouldShowTourOverlay;
    final /* synthetic */ HomeTourScrollController $tourScrollController;
    final /* synthetic */ TourStep $tourStep;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$7$1(boolean z, LazyListState lazyListState, TourStep tourStep, HomeTourScrollController homeTourScrollController, MutableState<Boolean> mutableState, MutableState<Pair<Integer, Integer>> mutableState2, Continuation<? super HomeScreenKt$HomeScreen$7$1> continuation) {
        super(2, continuation);
        this.$shouldShowTourOverlay = z;
        this.$listState = lazyListState;
        this.$tourStep = tourStep;
        this.$tourScrollController = homeTourScrollController;
        this.$lastShouldShowTourOverlay$delegate = mutableState;
        this.$scrollPinnedAtScrollEnd$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$7$1(this.$shouldShowTourOverlay, this.$listState, this.$tourStep, this.$tourScrollController, this.$lastShouldShowTourOverlay$delegate, this.$scrollPinnedAtScrollEnd$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean HomeScreen$lambda$30;
        Pair HomeScreen$lambda$27;
        Pair pair;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HomeScreen$lambda$30 = HomeScreenKt.HomeScreen$lambda$30(this.$lastShouldShowTourOverlay$delegate);
            if (!HomeScreen$lambda$30 && this.$shouldShowTourOverlay) {
                HomeScreen$lambda$27 = HomeScreenKt.HomeScreen$lambda$27(this.$scrollPinnedAtScrollEnd$delegate);
                HomeTourScrollDebug.INSTANCE.logOverlayShowTransition(this.$tourStep, HomeScreen$lambda$27 != null ? (Integer) HomeScreen$lambda$27.getFirst() : null, HomeScreen$lambda$27 != null ? (Integer) HomeScreen$lambda$27.getSecond() : null, this.$listState.getFirstVisibleItemIndex(), this.$listState.getFirstVisibleItemScrollOffset());
                if (HomeScreen$lambda$27 != null) {
                    this.L$0 = HomeScreen$lambda$27;
                    this.label = 1;
                    if (this.$tourScrollController.restoreScrollPositionIfDrifted(((Number) HomeScreen$lambda$27.getFirst()).intValue(), ((Number) HomeScreen$lambda$27.getSecond()).intValue(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            HomeScreenKt.HomeScreen$lambda$31(this.$lastShouldShowTourOverlay$delegate, this.$shouldShowTourOverlay);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = (Pair) this.L$0;
            ResultKt.throwOnFailure(obj);
            HomeTourScrollDebug.INSTANCE.logOverlayShowSettled(this.$tourStep, this.$listState.getFirstVisibleItemIndex(), this.$listState.getFirstVisibleItemScrollOffset(), pair == null ? (Integer) pair.getFirst() : null, pair != null ? (Integer) pair.getSecond() : null);
            HomeScreenKt.HomeScreen$lambda$31(this.$lastShouldShowTourOverlay$delegate, this.$shouldShowTourOverlay);
            return Unit.INSTANCE;
        }
        HomeScreen$lambda$27 = (Pair) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = HomeScreen$lambda$27;
        this.label = 2;
        if (DelayKt.delay(100L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        pair = HomeScreen$lambda$27;
        HomeTourScrollDebug.INSTANCE.logOverlayShowSettled(this.$tourStep, this.$listState.getFirstVisibleItemIndex(), this.$listState.getFirstVisibleItemScrollOffset(), pair == null ? (Integer) pair.getFirst() : null, pair != null ? (Integer) pair.getSecond() : null);
        HomeScreenKt.HomeScreen$lambda$31(this.$lastShouldShowTourOverlay$delegate, this.$shouldShowTourOverlay);
        return Unit.INSTANCE;
    }
}
