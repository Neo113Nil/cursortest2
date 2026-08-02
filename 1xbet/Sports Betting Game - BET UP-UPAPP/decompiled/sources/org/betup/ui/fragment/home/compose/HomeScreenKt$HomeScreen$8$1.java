package org.betup.ui.fragment.home.compose;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.explorestack.protobuf.openrtb.LossReason;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1;
import org.betup.ui.tour.compose.HomeTourScroll;
import org.betup.ui.tour.compose.HomeTourScrollController;
import org.betup.ui.tour.compose.HomeTourSteps;
import org.betup.ui.tour.compose.TourStep;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1", f = "HomeScreen.kt", i = {0, 1, 2, 2, 3, 4, 4}, l = {Opcodes.INSTANCEOF, 202, 204, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE, 219}, m = "invokeSuspend", n = {"step", "step", "step", "success", "step", "step", "success"}, s = {"L$0", "L$0", "L$0", "Z$0", "L$0", "L$0", "Z$0"})
/* loaded from: classes4.dex */
final class HomeScreenKt$HomeScreen$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $gameModeTileBottomScreenPx$delegate;
    final /* synthetic */ MutableState<Pair<Integer, Integer>> $gameModesScrollPinnedAt$delegate;
    final /* synthetic */ boolean $isHomeTourScrollAllowed;
    final /* synthetic */ MutableState<Boolean> $isTourProgrammaticScroll$delegate;
    final /* synthetic */ MutableState<TourStep> $lastListScrollTourStep$delegate;
    final /* synthetic */ MutableIntState $lazyListViewportBottomScreenPx$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function1<Boolean, Unit> $onTourScrollFinished;
    final /* synthetic */ Function0<Unit> $onTourScrollStarting;
    final /* synthetic */ Function0<Boolean> $onTrySkipInvisibleTourStep;
    final /* synthetic */ MutableState<Pair<Integer, Integer>> $scrollPinnedAtScrollEnd$delegate;
    final /* synthetic */ boolean $shouldRunHomeTourScroll;
    final /* synthetic */ HomeTourScrollController $tourScrollController;
    final /* synthetic */ TourStep $tourStep;
    final /* synthetic */ HomeUiState $uiState;
    Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$8$1(TourStep tourStep, boolean z, boolean z2, Function0<Boolean> function0, Function1<? super Boolean, Unit> function1, HomeTourScrollController homeTourScrollController, HomeUiState homeUiState, LazyListState lazyListState, Function0<Unit> function02, MutableState<Boolean> mutableState, MutableState<TourStep> mutableState2, MutableState<Pair<Integer, Integer>> mutableState3, MutableState<Pair<Integer, Integer>> mutableState4, MutableIntState mutableIntState, MutableIntState mutableIntState2, Continuation<? super HomeScreenKt$HomeScreen$8$1> continuation) {
        super(2, continuation);
        this.$tourStep = tourStep;
        this.$shouldRunHomeTourScroll = z;
        this.$isHomeTourScrollAllowed = z2;
        this.$onTrySkipInvisibleTourStep = function0;
        this.$onTourScrollFinished = function1;
        this.$tourScrollController = homeTourScrollController;
        this.$uiState = homeUiState;
        this.$listState = lazyListState;
        this.$onTourScrollStarting = function02;
        this.$isTourProgrammaticScroll$delegate = mutableState;
        this.$lastListScrollTourStep$delegate = mutableState2;
        this.$gameModesScrollPinnedAt$delegate = mutableState3;
        this.$scrollPinnedAtScrollEnd$delegate = mutableState4;
        this.$gameModeTileBottomScreenPx$delegate = mutableIntState;
        this.$lazyListViewportBottomScreenPx$delegate = mutableIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$8$1(this.$tourStep, this.$shouldRunHomeTourScroll, this.$isHomeTourScrollAllowed, this.$onTrySkipInvisibleTourStep, this.$onTourScrollFinished, this.$tourScrollController, this.$uiState, this.$listState, this.$onTourScrollStarting, this.$isTourProgrammaticScroll$delegate, this.$lastListScrollTourStep$delegate, this.$gameModesScrollPinnedAt$delegate, this.$scrollPinnedAtScrollEnd$delegate, this.$gameModeTileBottomScreenPx$delegate, this.$lazyListViewportBottomScreenPx$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TourStep tourStep;
        TourStep HomeScreen$lambda$21;
        Pair HomeScreen$lambda$24;
        TourStep tourStep2;
        boolean booleanValue;
        int HomeScreen$lambda$33;
        int HomeScreen$lambda$36;
        int HomeScreen$lambda$332;
        int HomeScreen$lambda$362;
        boolean z;
        Pair HomeScreen$lambda$27;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            tourStep = this.$tourStep;
            if (!this.$shouldRunHomeTourScroll || tourStep == null || !this.$isHomeTourScrollAllowed) {
                HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
                return Unit.INSTANCE;
            }
            if (!HomeTourSteps.INSTANCE.isHomeV2HighlightStep(tourStep)) {
                HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
                return Unit.INSTANCE;
            }
            if (this.$onTrySkipInvisibleTourStep.invoke().booleanValue()) {
                HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
                return Unit.INSTANCE;
            }
            if (HomeTourScroll.INSTANCE.isBottomTabStep(tourStep) || !HomeTourScroll.INSTANCE.requiresScroll(tourStep)) {
                HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
                this.$onTourScrollFinished.invoke(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            HomeScreen$lambda$21 = HomeScreenKt.HomeScreen$lambda$21(this.$lastListScrollTourStep$delegate);
            if (HomeScreen$lambda$21 == tourStep) {
                this.$onTourScrollFinished.invoke(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            if (HomeTourScroll.INSTANCE.isGameModeTileStep(tourStep)) {
                HomeScreen$lambda$24 = HomeScreenKt.HomeScreen$lambda$24(this.$gameModesScrollPinnedAt$delegate);
                if (HomeScreen$lambda$24 != null && this.$tourScrollController.isGameModesTileRowAcceptablyVisible(this.$uiState)) {
                    this.L$0 = tourStep;
                    this.label = 1;
                    if (this.$tourScrollController.awaitScrollPositionSettled(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tourStep2 = tourStep;
                    this.$scrollPinnedAtScrollEnd$delegate.setValue(TuplesKt.to(Boxing.boxInt(this.$listState.getFirstVisibleItemIndex()), Boxing.boxInt(this.$listState.getFirstVisibleItemScrollOffset())));
                    this.$lastListScrollTourStep$delegate.setValue(tourStep2);
                    this.$onTourScrollFinished.invoke(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
            }
            this.$onTourScrollStarting.invoke();
            HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, true);
            this.$gameModeTileBottomScreenPx$delegate.setIntValue(0);
            this.L$0 = tourStep;
            this.label = 2;
            obj = this.$tourScrollController.scrollForStep(tourStep, this.$uiState, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.L$0 = tourStep;
                this.Z$0 = booleanValue;
                this.label = 3;
                if (TimeoutKt.withTimeoutOrNull(900L, new AnonymousClass1(this.$gameModeTileBottomScreenPx$delegate, this.$lazyListViewportBottomScreenPx$delegate, null), this) == coroutine_suspended) {
                }
                HomeScreen$lambda$33 = HomeScreenKt.HomeScreen$lambda$33(this.$gameModeTileBottomScreenPx$delegate);
                if (HomeScreen$lambda$33 > 0) {
                }
            }
            if (booleanValue) {
            }
            HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
            if (booleanValue) {
            }
            this.$onTourScrollFinished.invoke(Boxing.boxBoolean(booleanValue));
            return Unit.INSTANCE;
        }
        if (i == 1) {
            tourStep2 = (TourStep) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.$scrollPinnedAtScrollEnd$delegate.setValue(TuplesKt.to(Boxing.boxInt(this.$listState.getFirstVisibleItemIndex()), Boxing.boxInt(this.$listState.getFirstVisibleItemScrollOffset())));
            this.$lastListScrollTourStep$delegate.setValue(tourStep2);
            this.$onTourScrollFinished.invoke(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
        if (i == 2) {
            tourStep = (TourStep) this.L$0;
            ResultKt.throwOnFailure(obj);
            booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue && HomeTourScroll.INSTANCE.isGameModeTileStep(tourStep)) {
                this.L$0 = tourStep;
                this.Z$0 = booleanValue;
                this.label = 3;
                if (TimeoutKt.withTimeoutOrNull(900L, new AnonymousClass1(this.$gameModeTileBottomScreenPx$delegate, this.$lazyListViewportBottomScreenPx$delegate, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HomeScreen$lambda$33 = HomeScreenKt.HomeScreen$lambda$33(this.$gameModeTileBottomScreenPx$delegate);
                if (HomeScreen$lambda$33 > 0) {
                }
            }
            if (booleanValue) {
            }
            HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
            if (booleanValue) {
            }
            this.$onTourScrollFinished.invoke(Boxing.boxBoolean(booleanValue));
            return Unit.INSTANCE;
        }
        if (i == 3) {
            boolean z2 = this.Z$0;
            TourStep tourStep3 = (TourStep) this.L$0;
            ResultKt.throwOnFailure(obj);
            booleanValue = z2;
            tourStep = tourStep3;
            HomeScreen$lambda$33 = HomeScreenKt.HomeScreen$lambda$33(this.$gameModeTileBottomScreenPx$delegate);
            if (HomeScreen$lambda$33 > 0) {
                HomeScreen$lambda$36 = HomeScreenKt.HomeScreen$lambda$36(this.$lazyListViewportBottomScreenPx$delegate);
                if (HomeScreen$lambda$36 > 0) {
                    HomeTourScrollController homeTourScrollController = this.$tourScrollController;
                    HomeScreen$lambda$332 = HomeScreenKt.HomeScreen$lambda$33(this.$gameModeTileBottomScreenPx$delegate);
                    HomeScreen$lambda$362 = HomeScreenKt.HomeScreen$lambda$36(this.$lazyListViewportBottomScreenPx$delegate);
                    this.L$0 = tourStep;
                    this.label = 4;
                    obj = homeTourScrollController.ensureGameModeTileFullyVisible(HomeScreen$lambda$332, HomeScreen$lambda$362, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanValue = ((Boolean) obj).booleanValue();
                }
            }
            if (booleanValue) {
            }
            HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
            if (booleanValue) {
            }
            this.$onTourScrollFinished.invoke(Boxing.boxBoolean(booleanValue));
            return Unit.INSTANCE;
        }
        if (i != 4) {
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            tourStep = (TourStep) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.$scrollPinnedAtScrollEnd$delegate.setValue(TuplesKt.to(Boxing.boxInt(this.$listState.getFirstVisibleItemIndex()), Boxing.boxInt(this.$listState.getFirstVisibleItemScrollOffset())));
            if (HomeTourScroll.INSTANCE.isGameModeTileStep(tourStep)) {
                MutableState<Pair<Integer, Integer>> mutableState = this.$gameModesScrollPinnedAt$delegate;
                HomeScreen$lambda$27 = HomeScreenKt.HomeScreen$lambda$27(this.$scrollPinnedAtScrollEnd$delegate);
                mutableState.setValue(HomeScreen$lambda$27);
            }
            booleanValue = z;
            HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
            if (booleanValue) {
                this.$lastListScrollTourStep$delegate.setValue(tourStep);
            }
            this.$onTourScrollFinished.invoke(Boxing.boxBoolean(booleanValue));
            return Unit.INSTANCE;
        }
        tourStep = (TourStep) this.L$0;
        ResultKt.throwOnFailure(obj);
        booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            this.L$0 = tourStep;
            this.Z$0 = booleanValue;
            this.label = 5;
            if (this.$tourScrollController.awaitScrollPositionSettled(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = booleanValue;
            this.$scrollPinnedAtScrollEnd$delegate.setValue(TuplesKt.to(Boxing.boxInt(this.$listState.getFirstVisibleItemIndex()), Boxing.boxInt(this.$listState.getFirstVisibleItemScrollOffset())));
            if (HomeTourScroll.INSTANCE.isGameModeTileStep(tourStep)) {
            }
            booleanValue = z;
        }
        HomeScreenKt.HomeScreen$lambda$19(this.$isTourProgrammaticScroll$delegate, false);
        if (booleanValue) {
        }
        this.$onTourScrollFinished.invoke(Boxing.boxBoolean(booleanValue));
        return Unit.INSTANCE;
    }

    /* compiled from: HomeScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1$1", f = "HomeScreen.kt", i = {}, l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ MutableIntState $gameModeTileBottomScreenPx$delegate;
        final /* synthetic */ MutableIntState $lazyListViewportBottomScreenPx$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableIntState mutableIntState, MutableIntState mutableIntState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$gameModeTileBottomScreenPx$delegate = mutableIntState;
            this.$lazyListViewportBottomScreenPx$delegate = mutableIntState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$gameModeTileBottomScreenPx$delegate, this.$lazyListViewportBottomScreenPx$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final MutableIntState mutableIntState = this.$gameModeTileBottomScreenPx$delegate;
                final MutableIntState mutableIntState2 = this.$lazyListViewportBottomScreenPx$delegate;
                final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = HomeScreenKt$HomeScreen$8$1.AnonymousClass1.invokeSuspend$lambda$0(MutableIntState.this, mutableIntState2);
                        return Boolean.valueOf(invokeSuspend$lambda$0);
                    }
                });
                this.label = 1;
                obj = FlowKt.first(new Flow<Boolean>() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1$1$invokeSuspend$$inlined$filter$1$2", f = "HomeScreen.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                        /* renamed from: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$8$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (((Boolean) obj).booleanValue()) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(MutableIntState mutableIntState, MutableIntState mutableIntState2) {
            int HomeScreen$lambda$33;
            int HomeScreen$lambda$36;
            HomeScreen$lambda$33 = HomeScreenKt.HomeScreen$lambda$33(mutableIntState);
            if (HomeScreen$lambda$33 > 0) {
                HomeScreen$lambda$36 = HomeScreenKt.HomeScreen$lambda$36(mutableIntState2);
                if (HomeScreen$lambda$36 > 0) {
                    return true;
                }
            }
            return false;
        }
    }
}
