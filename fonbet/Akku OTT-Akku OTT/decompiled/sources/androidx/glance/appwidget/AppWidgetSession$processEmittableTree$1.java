package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.AppWidgetSession", f = "AppWidgetSession.kt", i = {0, 0, 0}, l = {124, 154, 154, 154, 154}, m = "processEmittableTree", n = {"this", "context", "root"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class AppWidgetSession$processEmittableTree$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$processEmittableTree$1(AppWidgetSession appWidgetSession, Continuation<? super AppWidgetSession$processEmittableTree$1> continuation) {
        super(continuation);
        this.this$0 = appWidgetSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processEmittableTree(null, null, this);
    }
}
