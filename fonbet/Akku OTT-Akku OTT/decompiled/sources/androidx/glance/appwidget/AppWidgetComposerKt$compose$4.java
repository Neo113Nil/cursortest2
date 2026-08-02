package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.AppWidgetComposerKt", f = "AppWidgetComposer.kt", i = {0, 0, 0, 0, 0}, l = {122, 115}, m = "compose-DR8WL-M", n = {"context", "id", "options", "size", "state"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
public final class AppWidgetComposerKt$compose$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public AppWidgetComposerKt$compose$4(Continuation<? super AppWidgetComposerKt$compose$4> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AppWidgetComposerKt.m1280composeDR8WLM(null, null, null, null, null, null, this);
    }
}
