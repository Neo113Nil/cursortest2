package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetCardFlashOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1", f = "FlashBetCardFlashOverlay.kt", i = {0, 1, 2, 3}, l = {Opcodes.I2C, Opcodes.I2S, Opcodes.LCMP, Opcodes.FCMPL, Opcodes.IF_ACMPNE, Opcodes.GOTO, 172}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $glowProgress;
    final /* synthetic */ boolean $isHighImpact;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $scaleProgress;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $shakeOffset;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $slideProgress;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, Animatable<Float, AnimationVector1D> animatable4, boolean z, Continuation<? super FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1> continuation) {
        super(2, continuation);
        this.$slideProgress = animatable;
        this.$scaleProgress = animatable2;
        this.$glowProgress = animatable3;
        this.$shakeOffset = animatable4;
        this.$isHighImpact = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1 flashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1 = new FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1(this.$slideProgress, this.$scaleProgress, this.$glowProgress, this.$shakeOffset, this.$isHighImpact, continuation);
        flashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1.L$0 = obj;
        return flashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Animatable<Float, AnimationVector1D> animatable;
        Iterator it;
        Iterator it2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (this.$slideProgress.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = coroutineScope;
                this.label = 2;
                if (this.$scaleProgress.snapTo(Boxing.boxFloat(0.55f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = coroutineScope;
                this.label = 3;
                if (this.$glowProgress.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = coroutineScope;
                this.label = 4;
                if (this.$shakeOffset.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$slideProgress, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$scaleProgress, null), 3, null);
                this.L$0 = null;
                this.label = 5;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(160, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(0.42f), AnimationSpecKt.tween$default(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (this.$isHighImpact) {
                    List listOf = CollectionsKt.listOf((Object[]) new Float[]{Boxing.boxFloat(10.0f), Boxing.boxFloat(-8.0f), Boxing.boxFloat(5.0f), Boxing.boxFloat(-3.0f), Boxing.boxFloat(0.0f)});
                    animatable = this.$shakeOffset;
                    it = listOf.iterator();
                    it2 = it;
                    Animatable<Float, AnimationVector1D> animatable2 = animatable;
                    while (it2.hasNext()) {
                        Float boxFloat = Boxing.boxFloat(((Number) it2.next()).floatValue());
                        TweenSpec tween$default = AnimationSpecKt.tween$default(42, 0, null, 6, null);
                        this.L$0 = animatable2;
                        this.L$1 = it2;
                        this.label = 7;
                        if (Animatable.animateTo$default(animatable2, boxFloat, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.label = 2;
                if (this.$scaleProgress.snapTo(Boxing.boxFloat(0.55f), this) == coroutine_suspended) {
                }
                this.L$0 = coroutineScope;
                this.label = 3;
                if (this.$glowProgress.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                }
                this.L$0 = coroutineScope;
                this.label = 4;
                if (this.$shakeOffset.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$slideProgress, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$scaleProgress, null), 3, null);
                this.L$0 = null;
                this.label = 5;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(160, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(0.42f), AnimationSpecKt.tween$default(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                if (this.$isHighImpact) {
                }
                return Unit.INSTANCE;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.label = 3;
                if (this.$glowProgress.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                }
                this.L$0 = coroutineScope;
                this.label = 4;
                if (this.$shakeOffset.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$slideProgress, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$scaleProgress, null), 3, null);
                this.L$0 = null;
                this.label = 5;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(160, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(0.42f), AnimationSpecKt.tween$default(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                if (this.$isHighImpact) {
                }
                return Unit.INSTANCE;
            case 3:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.label = 4;
                if (this.$shakeOffset.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$slideProgress, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$scaleProgress, null), 3, null);
                this.L$0 = null;
                this.label = 5;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(160, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(0.42f), AnimationSpecKt.tween$default(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                if (this.$isHighImpact) {
                }
                return Unit.INSTANCE;
            case 4:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$slideProgress, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$scaleProgress, null), 3, null);
                this.L$0 = null;
                this.label = 5;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(160, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                this.label = 6;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(0.42f), AnimationSpecKt.tween$default(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                if (this.$isHighImpact) {
                }
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                this.label = 6;
                if (Animatable.animateTo$default(this.$glowProgress, Boxing.boxFloat(0.42f), AnimationSpecKt.tween$default(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
                }
                if (this.$isHighImpact) {
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                if (this.$isHighImpact) {
                }
                return Unit.INSTANCE;
            case 7:
                it = (Iterator) this.L$1;
                animatable = (Animatable) this.L$0;
                ResultKt.throwOnFailure(obj);
                it2 = it;
                Animatable<Float, AnimationVector1D> animatable22 = animatable;
                while (it2.hasNext()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FlashBetCardFlashOverlay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1$1", f = "FlashBetCardFlashOverlay.kt", i = {}, l = {Opcodes.DCMPG}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $slideProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$slideProgress = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$slideProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Animatable.animateTo$default(this.$slideProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.tween$default(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, this, 12, null) == coroutine_suspended) {
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

    /* compiled from: FlashBetCardFlashOverlay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1$2", f = "FlashBetCardFlashOverlay.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt$FlashBetEventFlashOverlay$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $scaleProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$scaleProgress = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$scaleProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Animatable.animateTo$default(this.$scaleProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.spring$default(0.5f, 400.0f, null, 4, null), null, null, this, 12, null) == coroutine_suspended) {
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
