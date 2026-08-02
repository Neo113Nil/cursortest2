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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1", f = "GlanceAppWidgetReceiver.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"$this$forEach$iv"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nGlanceAppWidgetReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidgetReceiver.kt\nandroidx/glance/appwidget/GlanceAppWidgetReceiver$onDeleted$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,187:1\n13600#2,2:188\n*S KotlinDebug\n*F\n+ 1 GlanceAppWidgetReceiver.kt\nandroidx/glance/appwidget/GlanceAppWidgetReceiver$onDeleted$1\n*L\n129#1:188,2\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetReceiver$onDeleted$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] $appWidgetIds;
    final /* synthetic */ Context $context;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GlanceAppWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onDeleted$1(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int[] iArr, Continuation<? super GlanceAppWidgetReceiver$onDeleted$1> continuation) {
        super(2, continuation);
        this.this$0 = glanceAppWidgetReceiver;
        this.$context = context;
        this.$appWidgetIds = iArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlanceAppWidgetReceiver$onDeleted$1 glanceAppWidgetReceiver$onDeleted$1 = new GlanceAppWidgetReceiver$onDeleted$1(this.this$0, this.$context, this.$appWidgetIds, continuation);
        glanceAppWidgetReceiver$onDeleted$1.L$0 = obj;
        return glanceAppWidgetReceiver$onDeleted$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x005b -> B:5:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GlanceAppWidgetReceiver glanceAppWidgetReceiver;
        int length;
        Context context;
        int i;
        int[] iArr;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.updateManager((K) this.L$0, this.$context);
            int[] iArr2 = this.$appWidgetIds;
            GlanceAppWidgetReceiver glanceAppWidgetReceiver2 = this.this$0;
            Context context2 = this.$context;
            glanceAppWidgetReceiver = glanceAppWidgetReceiver2;
            length = iArr2.length;
            context = context2;
            i = 0;
            iArr = iArr2;
            if (i < length) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.I$1;
            i = this.I$0;
            context = (Context) this.L$2;
            glanceAppWidgetReceiver = (GlanceAppWidgetReceiver) this.L$1;
            iArr = (int[]) this.L$0;
            ResultKt.throwOnFailure(obj);
            i++;
            if (i < length) {
                int i3 = iArr[i];
                GlanceAppWidget glanceAppWidget = glanceAppWidgetReceiver.getGlanceAppWidget();
                this.L$0 = iArr;
                this.L$1 = glanceAppWidgetReceiver;
                this.L$2 = context;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
                if (glanceAppWidget.deleted$glance_appwidget_release(context, i3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
                if (i < length) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((GlanceAppWidgetReceiver$onDeleted$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
