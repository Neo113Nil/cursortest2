package androidx.glance.appwidget;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.AppWidgetComposerKt", f = "AppWidgetComposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {56, 57, 84, 99, 99}, m = "compose-1pU2XAk", n = {"context", "id", "sizeMode", "size", "options", "state", "configManager", FirebaseAnalytics.Param.CONTENT, "appWidgetId", "context", "id", "sizeMode", "size", "options", FirebaseAnalytics.Param.CONTENT, "layoutConfig", "appWidgetId", "context", "layoutConfig", "root", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes.dex */
public final class AppWidgetComposerKt$compose$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;

    public AppWidgetComposerKt$compose$1(Continuation<? super AppWidgetComposerKt$compose$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AppWidgetComposerKt.m1278compose1pU2XAk(null, null, null, null, null, null, null, null, this);
    }
}
