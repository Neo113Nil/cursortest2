package androidx.glance.appwidget;

import androidx.glance.appwidget.GlanceRemoteViewsService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory", f = "GlanceRemoteViewsService.kt", i = {}, l = {127, 128}, m = "startSessionAndWaitUntilReady", n = {}, s = {})
/* loaded from: classes.dex */
public final class GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceRemoteViewsService.GlanceRemoteViewsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1(GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, Continuation<? super GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1> continuation) {
        super(continuation);
        this.this$0 = glanceRemoteViewsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startSessionAndWaitUntilReady;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startSessionAndWaitUntilReady = this.this$0.startSessionAndWaitUntilReady(null, this);
        return startSessionAndWaitUntilReady;
    }
}
