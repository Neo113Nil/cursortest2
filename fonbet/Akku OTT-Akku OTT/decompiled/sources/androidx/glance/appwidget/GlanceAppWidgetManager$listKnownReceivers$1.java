package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", i = {}, l = {242}, m = "listKnownReceivers$glance_appwidget_release", n = {}, s = {})
/* loaded from: classes.dex */
public final class GlanceAppWidgetManager$listKnownReceivers$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidgetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$listKnownReceivers$1(GlanceAppWidgetManager glanceAppWidgetManager, Continuation<? super GlanceAppWidgetManager$listKnownReceivers$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidgetManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.listKnownReceivers$glance_appwidget_release(this);
    }
}
