package androidx.glance.appwidget;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function0;", "", "Landroidx/glance/GlanceComposable;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.AppWidgetComposerKt$compose$5", f = "AppWidgetComposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppWidgetComposerKt$compose$5 extends SuspendLambda implements Function2<Function2<? super Composer, ? super Integer, ? extends Unit>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public AppWidgetComposerKt$compose$5(Continuation<? super AppWidgetComposerKt$compose$5> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppWidgetComposerKt$compose$5 appWidgetComposerKt$compose$5 = new AppWidgetComposerKt$compose$5(continuation);
        appWidgetComposerKt$compose$5.L$0 = obj;
        return appWidgetComposerKt$compose$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Continuation<? super Boolean> continuation) {
        return invoke2((Function2<? super Composer, ? super Integer, Unit>) function2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((Function2) this.L$0) != null);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Function2<? super Composer, ? super Integer, Unit> function2, Continuation<? super Boolean> continuation) {
        return ((AppWidgetComposerKt$compose$5) create(function2, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
