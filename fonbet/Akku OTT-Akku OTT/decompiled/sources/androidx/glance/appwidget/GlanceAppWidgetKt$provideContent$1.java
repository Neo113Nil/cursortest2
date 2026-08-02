package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetKt", f = "GlanceAppWidget.kt", i = {}, l = {233}, m = "provideContent", n = {}, s = {})
/* loaded from: classes.dex */
public final class GlanceAppWidgetKt$provideContent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public GlanceAppWidgetKt$provideContent$1(Continuation<? super GlanceAppWidgetKt$provideContent$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GlanceAppWidgetKt.provideContent(null, null, this);
    }
}
