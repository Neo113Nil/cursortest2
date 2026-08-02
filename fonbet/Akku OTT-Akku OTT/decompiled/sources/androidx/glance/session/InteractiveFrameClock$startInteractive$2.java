package androidx.glance.session;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.session.InteractiveFrameClock$startInteractive$2", f = "InteractiveFrameClock.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DTS_HD}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nInteractiveFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveFrameClock.kt\nandroidx/glance/session/InteractiveFrameClock$startInteractive$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,135:1\n314#2,11:136\n*S KotlinDebug\n*F\n+ 1 InteractiveFrameClock.kt\nandroidx/glance/session/InteractiveFrameClock$startInteractive$2\n*L\n65#1:136,11\n*E\n"})
/* loaded from: classes.dex */
public final class InteractiveFrameClock$startInteractive$2 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InteractiveFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveFrameClock$startInteractive$2(InteractiveFrameClock interactiveFrameClock, Continuation<? super InteractiveFrameClock$startInteractive$2> continuation) {
        super(2, continuation);
        this.this$0 = interactiveFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InteractiveFrameClock$startInteractive$2(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.stopInteractive();
            final InteractiveFrameClock interactiveFrameClock = this.this$0;
            this.L$0 = interactiveFrameClock;
            this.label = 1;
            C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(this));
            c1100n.r();
            obj2 = interactiveFrameClock.lock;
            synchronized (obj2) {
                i = interactiveFrameClock.interactiveHz;
                interactiveFrameClock.currentHz = i;
                interactiveFrameClock.interactiveCoroutine = c1100n;
                Unit unit = Unit.INSTANCE;
            }
            c1100n.t(new Function1<Throwable, Unit>() { // from class: androidx.glance.session.InteractiveFrameClock$startInteractive$2$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Object obj3;
                    int i3;
                    obj3 = InteractiveFrameClock.this.lock;
                    InteractiveFrameClock interactiveFrameClock2 = InteractiveFrameClock.this;
                    synchronized (obj3) {
                        i3 = interactiveFrameClock2.baselineHz;
                        interactiveFrameClock2.currentHz = i3;
                        interactiveFrameClock2.interactiveCoroutine = null;
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            });
            Object q = c1100n.q();
            if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (q == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((InteractiveFrameClock$startInteractive$2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
