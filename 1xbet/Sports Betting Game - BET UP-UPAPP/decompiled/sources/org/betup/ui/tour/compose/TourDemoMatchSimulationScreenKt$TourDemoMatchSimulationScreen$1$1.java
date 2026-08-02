package org.betup.ui.tour.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: TourDemoMatchSimulationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1", f = "TourDemoMatchSimulationScreen.kt", i = {}, l = {Opcodes.RET}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Pair<Integer, Boolean>> $goalEvents;
    final /* synthetic */ MutableState<Boolean> $isMatchEnded$delegate;
    final /* synthetic */ Function0<Unit> $onSimulationComplete;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableIntState $score1$delegate;
    final /* synthetic */ MutableIntState $score2$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1(List<Pair<Integer, Boolean>> list, Function0<Unit> function0, Animatable<Float, AnimationVector1D> animatable, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState<Boolean> mutableState, Continuation<? super TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1> continuation) {
        super(2, continuation);
        this.$goalEvents = list;
        this.$onSimulationComplete = function0;
        this.$progress = animatable;
        this.$score1$delegate = mutableIntState;
        this.$score2$delegate = mutableIntState2;
        this.$isMatchEnded$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1(this.$goalEvents, this.$onSimulationComplete, this.$progress, this.$score1$delegate, this.$score2$delegate, this.$isMatchEnded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: TourDemoMatchSimulationScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1$1", f = "TourDemoMatchSimulationScreen.kt", i = {0}, l = {Opcodes.PUTFIELD, 189}, m = "invokeSuspend", n = {"elapsedMs"}, s = {"J$0"})
    /* renamed from: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Pair<Integer, Boolean>> $goalEvents;
        final /* synthetic */ MutableState<Boolean> $isMatchEnded$delegate;
        final /* synthetic */ Function0<Unit> $onSimulationComplete;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
        final /* synthetic */ MutableIntState $score1$delegate;
        final /* synthetic */ MutableIntState $score2$delegate;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<Pair<Integer, Boolean>> list, Function0<Unit> function0, Animatable<Float, AnimationVector1D> animatable, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$goalEvents = list;
            this.$onSimulationComplete = function0;
            this.$progress = animatable;
            this.$score1$delegate = mutableIntState;
            this.$score2$delegate = mutableIntState2;
            this.$isMatchEnded$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$goalEvents, this.$onSimulationComplete, this.$progress, this.$score1$delegate, this.$score2$delegate, this.$isMatchEnded$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TourDemoMatchSimulationScreen.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1$1$1", f = "TourDemoMatchSimulationScreen.kt", i = {}, l = {Opcodes.LOOKUPSWITCH}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C14441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14441(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C14441> continuation) {
                super(2, continuation);
                this.$progress = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C14441(this.$progress, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C14441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$progress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, 0, EasingKt.getLinearEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
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

        /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0051 -> B:12:0x0054). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            int progressToMinute;
            Iterator<T> it;
            int i;
            Iterator<T> it2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            long j2 = 200;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C14441(this.$progress, null), 3, null);
                j = 0;
                if (j < 20000) {
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onSimulationComplete.invoke();
                    return Unit.INSTANCE;
                }
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                j += j2;
                progressToMinute = TourDemoMatchSimulationScreenKt.progressToMinute(RangesKt.coerceIn(j / 20000, 0.0f, 1.0f));
                MutableIntState mutableIntState = this.$score1$delegate;
                List<Pair<Integer, Boolean>> list = this.$goalEvents;
                int i3 = 0;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        if (((Number) pair.getFirst()).intValue() <= progressToMinute && ((Boolean) pair.getSecond()).booleanValue() && (i = i + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i = 0;
                }
                mutableIntState.setIntValue(i);
                MutableIntState mutableIntState2 = this.$score2$delegate;
                List<Pair<Integer, Boolean>> list2 = this.$goalEvents;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        if (((Number) pair2.getFirst()).intValue() <= progressToMinute && !((Boolean) pair2.getSecond()).booleanValue() && (i3 = i3 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                mutableIntState2.setIntValue(i3);
                j2 = 200;
                if (j < 20000) {
                    this.J$0 = j;
                    this.label = 1;
                    if (DelayKt.delay(j2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j += j2;
                    progressToMinute = TourDemoMatchSimulationScreenKt.progressToMinute(RangesKt.coerceIn(j / 20000, 0.0f, 1.0f));
                    MutableIntState mutableIntState3 = this.$score1$delegate;
                    List<Pair<Integer, Boolean>> list3 = this.$goalEvents;
                    int i32 = 0;
                    if (list3 instanceof Collection) {
                    }
                    it = list3.iterator();
                    i = 0;
                    while (it.hasNext()) {
                    }
                    mutableIntState3.setIntValue(i);
                    MutableIntState mutableIntState22 = this.$score2$delegate;
                    List<Pair<Integer, Boolean>> list22 = this.$goalEvents;
                    if (list22 instanceof Collection) {
                    }
                    it2 = list22.iterator();
                    while (it2.hasNext()) {
                    }
                    mutableIntState22.setIntValue(i32);
                    j2 = 200;
                    if (j < 20000) {
                        TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$8(this.$isMatchEnded$delegate, true);
                        this.label = 2;
                        if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.$onSimulationComplete.invoke();
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.$goalEvents, this.$onSimulationComplete, this.$progress, this.$score1$delegate, this.$score2$delegate, this.$isMatchEnded$delegate, null), this) == coroutine_suspended) {
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
