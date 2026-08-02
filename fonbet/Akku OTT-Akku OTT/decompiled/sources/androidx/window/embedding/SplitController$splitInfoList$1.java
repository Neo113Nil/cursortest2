package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.credentials.ExecutorC0293h;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.channels.t;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/t;", "", "Landroidx/window/embedding/SplitInfo;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/t;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.window.embedding.SplitController$splitInfoList$1", f = "SplitController.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SplitController$splitInfoList$1 extends SuspendLambda implements Function2<t<? super List<? extends SplitInfo>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SplitController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitController$splitInfoList$1(SplitController splitController, Activity activity, Continuation<? super SplitController$splitInfoList$1> continuation) {
        super(2, continuation);
        this.this$0 = splitController;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplitController$splitInfoList$1 splitController$splitInfoList$1 = new SplitController$splitInfoList$1(this.this$0, this.$activity, continuation);
        splitController$splitInfoList$1.L$0 = obj;
        return splitController$splitInfoList$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(t<? super List<? extends SplitInfo>> tVar, Continuation<? super Unit> continuation) {
        return invoke2((t<? super List<SplitInfo>>) tVar, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EmbeddingBackend embeddingBackend;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final t tVar = (t) this.L$0;
            final Consumer<List<SplitInfo>> consumer = new Consumer() { // from class: androidx.window.embedding.h
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj2) {
                    t.this.c((List) obj2);
                }
            };
            embeddingBackend = this.this$0.embeddingBackend;
            embeddingBackend.addSplitListenerForActivity(this.$activity, new ExecutorC0293h(), consumer);
            final SplitController splitController = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.window.embedding.SplitController$splitInfoList$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    EmbeddingBackend embeddingBackend2;
                    embeddingBackend2 = SplitController.this.embeddingBackend;
                    embeddingBackend2.removeSplitListenerForActivity(consumer);
                }
            };
            this.label = 1;
            if (r.a(tVar, function0, this) == coroutine_suspended) {
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t<? super List<SplitInfo>> tVar, Continuation<? super Unit> continuation) {
        return ((SplitController$splitInfoList$1) create(tVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
