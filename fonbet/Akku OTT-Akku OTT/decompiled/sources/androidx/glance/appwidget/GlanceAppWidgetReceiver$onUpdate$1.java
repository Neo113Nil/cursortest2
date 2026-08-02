package androidx.glance.appwidget;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1048c;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import kotlinx.coroutines.M;
import kotlinx.coroutines.S;
import kotlinx.coroutines.T;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1", f = "GlanceAppWidgetReceiver.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGlanceAppWidgetReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidgetReceiver.kt\nandroidx/glance/appwidget/GlanceAppWidgetReceiver$onUpdate$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,187:1\n11365#2:188\n11700#2,3:189\n*S KotlinDebug\n*F\n+ 1 GlanceAppWidgetReceiver.kt\nandroidx/glance/appwidget/GlanceAppWidgetReceiver$onUpdate$1\n*L\n107#1:188\n107#1:189,3\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetReceiver$onUpdate$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] $appWidgetIds;
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GlanceAppWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onUpdate$1(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int[] iArr, Continuation<? super GlanceAppWidgetReceiver$onUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = glanceAppWidgetReceiver;
        this.$context = context;
        this.$appWidgetIds = iArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlanceAppWidgetReceiver$onUpdate$1 glanceAppWidgetReceiver$onUpdate$1 = new GlanceAppWidgetReceiver$onUpdate$1(this.this$0, this.$context, this.$appWidgetIds, continuation);
        glanceAppWidgetReceiver$onUpdate$1.L$0 = obj;
        return glanceAppWidgetReceiver$onUpdate$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            K k = (K) this.L$0;
            this.this$0.updateManager(k, this.$context);
            int[] iArr = this.$appWidgetIds;
            GlanceAppWidgetReceiver glanceAppWidgetReceiver = this.this$0;
            Context context = this.$context;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                a = C1082i.a(k, EmptyCoroutineContext.INSTANCE, M.a, new GlanceAppWidgetReceiver$onUpdate$1$1$1(glanceAppWidgetReceiver, context, i2, null));
                arrayList.add(a);
            }
            this.label = 1;
            if ((arrayList.isEmpty() ? CollectionsKt.emptyList() : new C1048c((S[]) arrayList.toArray(new S[0])).a(this)) == coroutine_suspended) {
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
        return ((GlanceAppWidgetReceiver$onUpdate$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
