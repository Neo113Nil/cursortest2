package androidx.glance.appwidget;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.glance.GlanceId;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import kotlinx.coroutines.channels.t;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0002*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00040\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/channels/t;", "Lkotlin/Function0;", "", "Landroidx/glance/GlanceComposable;", "Landroidx/compose/runtime/Composable;", "<anonymous>", "(Lkotlinx/coroutines/channels/t;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1", f = "AppWidgetUtils.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppWidgetUtilsKt$runGlance$1 extends SuspendLambda implements Function2<t<? super Function2<? super Composer, ? super Integer, ? extends Unit>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ GlanceId $id;
    final /* synthetic */ GlanceAppWidget $this_runGlance;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1", f = "AppWidgetUtils.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ GlanceId $id;
        final /* synthetic */ GlanceAppWidget $this_runGlance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_runGlance = glanceAppWidget;
            this.$context = context;
            this.$id = glanceId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_runGlance, this.$context, this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GlanceAppWidget glanceAppWidget = this.$this_runGlance;
                Context context = this.$context;
                GlanceId glanceId = this.$id;
                this.label = 1;
                if (glanceAppWidget.provideGlance(context, glanceId, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetUtilsKt$runGlance$1(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Continuation<? super AppWidgetUtilsKt$runGlance$1> continuation) {
        super(2, continuation);
        this.$this_runGlance = glanceAppWidget;
        this.$context = context;
        this.$id = glanceId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppWidgetUtilsKt$runGlance$1 appWidgetUtilsKt$runGlance$1 = new AppWidgetUtilsKt$runGlance$1(this.$this_runGlance, this.$context, this.$id, continuation);
        appWidgetUtilsKt$runGlance$1.L$0 = obj;
        return appWidgetUtilsKt$runGlance$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(t<? super Function2<? super Composer, ? super Integer, ? extends Unit>> tVar, Continuation<? super Unit> continuation) {
        return invoke2((t<? super Function2<? super Composer, ? super Integer, Unit>>) tVar, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppWidgetUtilsKt$runGlance$1$receiver$1 appWidgetUtilsKt$runGlance$1$receiver$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1(new AtomicReference(null), (t) this.L$0);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_runGlance, this.$context, this.$id, null);
            this.label = 1;
            if (C1082i.f(anonymousClass1, appWidgetUtilsKt$runGlance$1$receiver$1, this) == coroutine_suspended) {
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
    public final Object invoke2(t<? super Function2<? super Composer, ? super Integer, Unit>> tVar, Continuation<? super Unit> continuation) {
        return ((AppWidgetUtilsKt$runGlance$1) create(tVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
