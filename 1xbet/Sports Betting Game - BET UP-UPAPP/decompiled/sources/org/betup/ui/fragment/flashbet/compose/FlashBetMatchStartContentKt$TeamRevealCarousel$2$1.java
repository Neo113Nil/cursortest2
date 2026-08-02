package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: FlashBetMatchStartContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$TeamRevealCarousel$2$1", f = "FlashBetMatchStartContent.kt", i = {1, 2}, l = {578, 582, 583, 585, 586, 587}, m = "invokeSuspend", n = {"totalSpins", "totalSpins"}, s = {"I$0", "I$0"})
/* loaded from: classes4.dex */
final class FlashBetMatchStartContentKt$TeamRevealCarousel$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $cycles;
    final /* synthetic */ long $initialDelayMs;
    final /* synthetic */ Function0<Unit> $onStopped;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ int $size;
    final /* synthetic */ long $spinMsPerPage;
    final /* synthetic */ int $target;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetMatchStartContentKt$TeamRevealCarousel$2$1(int i, long j, int i2, PagerState pagerState, int i3, Function0<Unit> function0, long j2, Continuation<? super FlashBetMatchStartContentKt$TeamRevealCarousel$2$1> continuation) {
        super(2, continuation);
        this.$size = i;
        this.$initialDelayMs = j;
        this.$cycles = i2;
        this.$pagerState = pagerState;
        this.$target = i3;
        this.$onStopped = function0;
        this.$spinMsPerPage = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetMatchStartContentKt$TeamRevealCarousel$2$1(this.$size, this.$initialDelayMs, this.$cycles, this.$pagerState, this.$target, this.$onStopped, this.$spinMsPerPage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetMatchStartContentKt$TeamRevealCarousel$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ad -> B:18:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        PagerState pagerState;
        long j;
        int i3;
        int i4;
        long j2;
        int i5;
        int i6;
        PagerState pagerState2;
        Object deferToNextLayoutFrame;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (this.$size <= 0) {
                    return Unit.INSTANCE;
                }
                this.label = 1;
                if (DelayKt.delay(this.$initialDelayMs, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i7 = this.$size;
                i = i7;
                i2 = this.$cycles * i7;
                pagerState = this.$pagerState;
                j = this.$spinMsPerPage;
                i3 = 0;
                if (i3 < i2) {
                    int currentPage = (pagerState.getCurrentPage() + 1) % i;
                    this.L$0 = pagerState;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.J$0 = j;
                    this.I$2 = i3;
                    this.label = 2;
                    if (PagerState.animateScrollToPage$default(pagerState, currentPage, 0.0f, null, this, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i5 = i;
                    i6 = i2;
                    pagerState2 = pagerState;
                    j2 = j;
                    i4 = i3;
                    this.L$0 = pagerState2;
                    this.I$0 = i6;
                    this.I$1 = i5;
                    this.J$0 = j2;
                    this.I$2 = i4;
                    this.label = 3;
                    if (DelayKt.delay(j2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = j2;
                    i = i5;
                    i2 = i6;
                    pagerState = pagerState2;
                    i3 = i4 + 1;
                    if (i3 < i2) {
                        this.L$0 = null;
                        this.label = 4;
                        if (PagerState.animateScrollToPage$default(this.$pagerState, this.$target, 0.0f, null, this, 6, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.label = 5;
                        if (DelayKt.delay(20L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.label = 6;
                        deferToNextLayoutFrame = FlashBetMatchStartContentKt.deferToNextLayoutFrame(this);
                        if (deferToNextLayoutFrame == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.$onStopped.invoke();
                        return Unit.INSTANCE;
                    }
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                int i72 = this.$size;
                i = i72;
                i2 = this.$cycles * i72;
                pagerState = this.$pagerState;
                j = this.$spinMsPerPage;
                i3 = 0;
                if (i3 < i2) {
                }
                break;
            case 2:
                i4 = this.I$2;
                j2 = this.J$0;
                i5 = this.I$1;
                i6 = this.I$0;
                pagerState2 = (PagerState) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = pagerState2;
                this.I$0 = i6;
                this.I$1 = i5;
                this.J$0 = j2;
                this.I$2 = i4;
                this.label = 3;
                if (DelayKt.delay(j2, this) == coroutine_suspended) {
                }
                j = j2;
                i = i5;
                i2 = i6;
                pagerState = pagerState2;
                i3 = i4 + 1;
                if (i3 < i2) {
                }
                break;
            case 3:
                i4 = this.I$2;
                j2 = this.J$0;
                i5 = this.I$1;
                i6 = this.I$0;
                pagerState2 = (PagerState) this.L$0;
                ResultKt.throwOnFailure(obj);
                j = j2;
                i = i5;
                i2 = i6;
                pagerState = pagerState2;
                i3 = i4 + 1;
                if (i3 < i2) {
                }
                break;
            case 4:
                ResultKt.throwOnFailure(obj);
                this.label = 5;
                if (DelayKt.delay(20L, this) == coroutine_suspended) {
                }
                this.label = 6;
                deferToNextLayoutFrame = FlashBetMatchStartContentKt.deferToNextLayoutFrame(this);
                if (deferToNextLayoutFrame == coroutine_suspended) {
                }
                this.$onStopped.invoke();
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                this.label = 6;
                deferToNextLayoutFrame = FlashBetMatchStartContentKt.deferToNextLayoutFrame(this);
                if (deferToNextLayoutFrame == coroutine_suspended) {
                }
                this.$onStopped.invoke();
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                this.$onStopped.invoke();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
