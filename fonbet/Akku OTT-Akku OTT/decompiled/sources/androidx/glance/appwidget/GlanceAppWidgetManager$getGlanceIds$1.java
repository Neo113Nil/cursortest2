package androidx.glance.appwidget;

import androidx.glance.appwidget.GlanceAppWidget;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", i = {0, 0}, l = {102}, m = "getGlanceIds", n = {"this", "provider"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetManager$getGlanceIds$1<T extends GlanceAppWidget> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceAppWidgetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$getGlanceIds$1(GlanceAppWidgetManager glanceAppWidgetManager, Continuation<? super GlanceAppWidgetManager$getGlanceIds$1> continuation) {
        super(continuation);
        this.this$0 = glanceAppWidgetManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getGlanceIds(null, this);
    }
}
