package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import androidx.glance.appwidget.ContentReceiver;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.channels.t;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u008a@"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/glance/GlanceComposable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppWidgetUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppWidgetUtils.kt\nandroidx/glance/appwidget/AppWidgetUtilsKt$runGlance$1$receiver$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,254:1\n314#2,11:255\n*S KotlinDebug\n*F\n+ 1 AppWidgetUtils.kt\nandroidx/glance/appwidget/AppWidgetUtilsKt$runGlance$1$receiver$1\n*L\n246#1:255,11\n*E\n"})
/* loaded from: classes.dex */
public final class AppWidgetUtilsKt$runGlance$1$receiver$1 implements ContentReceiver {
    final /* synthetic */ t<Function2<? super Composer, ? super Integer, Unit>> $$this$channelFlow;
    final /* synthetic */ AtomicReference<InterfaceC1096l<?>> $contentCoroutine;

    /* JADX WARN: Multi-variable type inference failed */
    public AppWidgetUtilsKt$runGlance$1$receiver$1(AtomicReference<InterfaceC1096l<?>> atomicReference, t<? super Function2<? super Composer, ? super Integer, Unit>> tVar) {
        this.$contentCoroutine = atomicReference;
        this.$$this$channelFlow = tVar;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) ContentReceiver.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) ContentReceiver.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return ContentReceiver.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return ContentReceiver.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.glance.appwidget.ContentReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object provideContent(Function2<? super Composer, ? super Integer, Unit> function2, Continuation<?> continuation) {
        AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1;
        int i;
        if (continuation instanceof AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) {
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = (AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) continuation;
            int i2 = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AtomicReference<InterfaceC1096l<?>> atomicReference = this.$contentCoroutine;
                    final t<Function2<? super Composer, ? super Integer, Unit>> tVar = this.$$this$channelFlow;
                    appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.L$0 = function2;
                    appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.L$1 = atomicReference;
                    appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.L$2 = tVar;
                    appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label = 1;
                    C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1));
                    c1100n.r();
                    c1100n.t(new Function1<Throwable, Unit>() { // from class: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            tVar.c(null);
                        }
                    });
                    InterfaceC1096l<?> andSet = atomicReference.getAndSet(c1100n);
                    if (andSet != null) {
                        Boxing.boxBoolean(andSet.cancel(null));
                    }
                    tVar.c(function2);
                    Object q = c1100n.q();
                    if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1);
                    }
                    if (q == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(this, continuation);
        Object obj2 = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
