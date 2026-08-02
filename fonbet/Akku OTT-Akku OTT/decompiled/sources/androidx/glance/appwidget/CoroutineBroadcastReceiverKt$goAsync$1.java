package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$1", f = "CoroutineBroadcastReceiver.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class CoroutineBroadcastReceiverKt$goAsync$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<K, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ K $coroutineScope;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineBroadcastReceiverKt$goAsync$1(Function2<? super K, ? super Continuation<? super Unit>, ? extends Object> function2, K k, BroadcastReceiver.PendingResult pendingResult, Continuation<? super CoroutineBroadcastReceiverKt$goAsync$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$coroutineScope = k;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoroutineBroadcastReceiverKt$goAsync$1 coroutineBroadcastReceiverKt$goAsync$1 = new CoroutineBroadcastReceiverKt$goAsync$1(this.$block, this.$coroutineScope, this.$pendingResult, continuation);
        coroutineBroadcastReceiverKt$goAsync$1.L$0 = obj;
        return coroutineBroadcastReceiverKt$goAsync$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        K k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    K k2 = (K) this.L$0;
                    Function2<K, Continuation<? super Unit>, Object> function2 = this.$block;
                    this.label = 1;
                    if (function2.invoke(k2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                k = this.$coroutineScope;
            } catch (Throwable th) {
                try {
                    this.$pendingResult.finish();
                } catch (IllegalStateException unused) {
                }
                throw th;
            }
        } catch (CancellationException e) {
            try {
                throw e;
            } catch (Throwable th2) {
                L.b(this.$coroutineScope, null);
                throw th2;
            }
        } catch (Throwable unused2) {
            k = this.$coroutineScope;
        }
        L.b(k, null);
        try {
            this.$pendingResult.finish();
        } catch (IllegalStateException unused3) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((CoroutineBroadcastReceiverKt$goAsync$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
