package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.AppWidgetSession", f = "AppWidgetSession.kt", i = {0}, l = {212, 213}, m = "waitForReady", n = {"it"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AppWidgetSession$waitForReady$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$waitForReady$1(AppWidgetSession appWidgetSession, Continuation<? super AppWidgetSession$waitForReady$1> continuation) {
        super(continuation);
        this.this$0 = appWidgetSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitForReady(this);
    }
}
