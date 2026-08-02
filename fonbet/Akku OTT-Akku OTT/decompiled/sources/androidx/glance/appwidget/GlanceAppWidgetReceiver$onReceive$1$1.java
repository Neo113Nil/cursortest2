package androidx.glance.appwidget;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onReceive$1$1", f = "GlanceAppWidgetReceiver.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class GlanceAppWidgetReceiver$onReceive$1$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $actionKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ int $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GlanceAppWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onReceive$1$1(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int i, String str, Continuation<? super GlanceAppWidgetReceiver$onReceive$1$1> continuation) {
        super(2, continuation);
        this.this$0 = glanceAppWidgetReceiver;
        this.$context = context;
        this.$id = i;
        this.$actionKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlanceAppWidgetReceiver$onReceive$1$1 glanceAppWidgetReceiver$onReceive$1$1 = new GlanceAppWidgetReceiver$onReceive$1$1(this.this$0, this.$context, this.$id, this.$actionKey, continuation);
        glanceAppWidgetReceiver$onReceive$1$1.L$0 = obj;
        return glanceAppWidgetReceiver$onReceive$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.updateManager((K) this.L$0, this.$context);
            GlanceAppWidget glanceAppWidget = this.this$0.getGlanceAppWidget();
            Context context = this.$context;
            int i2 = this.$id;
            String str = this.$actionKey;
            this.label = 1;
            if (GlanceAppWidget.triggerAction$glance_appwidget_release$default(glanceAppWidget, context, i2, str, null, this, 8, null) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((GlanceAppWidgetReceiver$onReceive$1$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
