package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$12$1", f = "BetListDetailsScreen.kt", i = {}, l = {Opcodes.INVOKESTATIC, 236, 237, 238}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CubicBezierEasing $balloonEase;
    final /* synthetic */ CubicBezierEasing $entranceEase;
    final /* synthetic */ CubicBezierEasing $fadeEase;
    final /* synthetic */ State<List<BetsListModel>> $items$delegate;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetBalloonPulse;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetContentAlpha;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetEntranceProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailsScreenKt$BetListDetailsScreen$12$1(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, State<? extends List<? extends BetsListModel>> state, CubicBezierEasing cubicBezierEasing, CubicBezierEasing cubicBezierEasing2, CubicBezierEasing cubicBezierEasing3, Continuation<? super BetListDetailsScreenKt$BetListDetailsScreen$12$1> continuation) {
        super(2, continuation);
        this.$singleBetEntranceProgress = animatable;
        this.$singleBetBalloonPulse = animatable2;
        this.$singleBetContentAlpha = animatable3;
        this.$items$delegate = state;
        this.$entranceEase = cubicBezierEasing;
        this.$fadeEase = cubicBezierEasing2;
        this.$balloonEase = cubicBezierEasing3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetListDetailsScreenKt$BetListDetailsScreen$12$1(this.$singleBetEntranceProgress, this.$singleBetBalloonPulse, this.$singleBetContentAlpha, this.$items$delegate, this.$entranceEase, this.$fadeEase, this.$balloonEase, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetListDetailsScreenKt$BetListDetailsScreen$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List BetListDetailsScreen$lambda$16;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BetListDetailsScreen$lambda$16 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
            if (BetListDetailsScreen$lambda$16.size() == 1) {
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.$singleBetEntranceProgress, this.$singleBetBalloonPulse, this.$singleBetContentAlpha, this.$entranceEase, this.$fadeEase, this.$balloonEase, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            this.label = 2;
            if (this.$singleBetEntranceProgress.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 3;
            if (this.$singleBetBalloonPulse.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 3;
                    if (this.$singleBetBalloonPulse.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        this.label = 4;
        if (this.$singleBetContentAlpha.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: BetListDetailsScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$12$1$1", f = "BetListDetailsScreen.kt", i = {0, 1, 2, 3}, l = {Opcodes.INVOKEINTERFACE, Opcodes.INVOKEDYNAMIC, Opcodes.NEW, 226, 233}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$coroutineScope", "$this$coroutineScope", "pulseJob"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$12$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CubicBezierEasing $balloonEase;
        final /* synthetic */ CubicBezierEasing $entranceEase;
        final /* synthetic */ CubicBezierEasing $fadeEase;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetBalloonPulse;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetContentAlpha;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetEntranceProgress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, CubicBezierEasing cubicBezierEasing, CubicBezierEasing cubicBezierEasing2, CubicBezierEasing cubicBezierEasing3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$singleBetEntranceProgress = animatable;
            this.$singleBetBalloonPulse = animatable2;
            this.$singleBetContentAlpha = animatable3;
            this.$entranceEase = cubicBezierEasing;
            this.$fadeEase = cubicBezierEasing2;
            this.$balloonEase = cubicBezierEasing3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$singleBetEntranceProgress, this.$singleBetBalloonPulse, this.$singleBetContentAlpha, this.$entranceEase, this.$fadeEase, this.$balloonEase, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ed A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00df A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Job launch$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (this.$singleBetEntranceProgress.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        coroutineScope = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        this.L$0 = coroutineScope;
                        this.label = 3;
                        if (this.$singleBetContentAlpha.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14391(this.$singleBetContentAlpha, 430, this.$fadeEase, null), 3, null);
                        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1(430, this.$singleBetBalloonPulse, this.$balloonEase, null), 3, null);
                        this.L$0 = launch$default;
                        this.label = 4;
                        if (Animatable.animateTo$default(this.$singleBetEntranceProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(430, 0, this.$entranceEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.L$0 = null;
                        this.label = 5;
                        if (launch$default.join(this) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        launch$default = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 5;
                        if (launch$default.join(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14391(this.$singleBetContentAlpha, 430, this.$fadeEase, null), 3, null);
                    launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1(430, this.$singleBetBalloonPulse, this.$balloonEase, null), 3, null);
                    this.L$0 = launch$default;
                    this.label = 4;
                    if (Animatable.animateTo$default(this.$singleBetEntranceProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(430, 0, this.$entranceEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = null;
                    this.label = 5;
                    if (launch$default.join(this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = coroutineScope;
            this.label = 2;
            if (this.$singleBetBalloonPulse.snapTo(Boxing.boxFloat(1.0f), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = coroutineScope;
            this.label = 3;
            if (this.$singleBetContentAlpha.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14391(this.$singleBetContentAlpha, 430, this.$fadeEase, null), 3, null);
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$pulseJob$1(430, this.$singleBetBalloonPulse, this.$balloonEase, null), 3, null);
            this.L$0 = launch$default;
            this.label = 4;
            if (Animatable.animateTo$default(this.$singleBetEntranceProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(430, 0, this.$entranceEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
            }
            this.L$0 = null;
            this.label = 5;
            if (launch$default.join(this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BetListDetailsScreen.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$1", f = "BetListDetailsScreen.kt", i = {}, l = {Opcodes.ATHROW}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$12$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C14391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $entranceMs;
            final /* synthetic */ CubicBezierEasing $fadeEase;
            final /* synthetic */ Animatable<Float, AnimationVector1D> $singleBetContentAlpha;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14391(Animatable<Float, AnimationVector1D> animatable, int i, CubicBezierEasing cubicBezierEasing, Continuation<? super C14391> continuation) {
                super(2, continuation);
                this.$singleBetContentAlpha = animatable;
                this.$entranceMs = i;
                this.$fadeEase = cubicBezierEasing;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C14391(this.$singleBetContentAlpha, this.$entranceMs, this.$fadeEase, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C14391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$singleBetContentAlpha, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(this.$entranceMs, 0, this.$fadeEase, 2, null), null, null, this, 12, null) == coroutine_suspended) {
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
    }
}
