package androidx.glance.appwidget;

import android.R;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.state.GlanceAppWidgetStateKt;
import androidx.glance.state.GlanceStateDefinition;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a9\u0010\r\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000e\u0018\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"provideContent", "", "Landroidx/glance/appwidget/GlanceAppWidget;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/glance/GlanceComposable;", "(Landroidx/glance/appwidget/GlanceAppWidget;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAll", "context", "Landroid/content/Context;", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIf", "State", "predicate", "Lkotlin/Function1;", "", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceAppWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidget.kt\nandroidx/glance/appwidget/GlanceAppWidgetKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n1855#2,2:238\n1855#2,2:241\n1#3:240\n*S KotlinDebug\n*F\n+ 1 GlanceAppWidget.kt\nandroidx/glance/appwidget/GlanceAppWidgetKt\n*L\n200#1:238,2\n213#1:241,2\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object provideContent(GlanceAppWidget glanceAppWidget, Function2<? super Composer, ? super Integer, Unit> function2, Continuation<?> continuation) {
        GlanceAppWidgetKt$provideContent$1 glanceAppWidgetKt$provideContent$1;
        int i;
        if (continuation instanceof GlanceAppWidgetKt$provideContent$1) {
            glanceAppWidgetKt$provideContent$1 = (GlanceAppWidgetKt$provideContent$1) continuation;
            int i2 = glanceAppWidgetKt$provideContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetKt$provideContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = glanceAppWidgetKt$provideContent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceAppWidgetKt$provideContent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContentReceiver contentReceiver = (ContentReceiver) glanceAppWidgetKt$provideContent$1.get$context().get(ContentReceiver.INSTANCE);
                    if (contentReceiver == null) {
                        throw new IllegalStateException("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
                    }
                    glanceAppWidgetKt$provideContent$1.label = 1;
                    if (contentReceiver.provideContent(function2, glanceAppWidgetKt$provideContent$1) == coroutine_suspended) {
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
        glanceAppWidgetKt$provideContent$1 = new GlanceAppWidgetKt$provideContent$1(continuation);
        Object obj2 = glanceAppWidgetKt$provideContent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceAppWidgetKt$provideContent$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object updateAll(GlanceAppWidget glanceAppWidget, Context context, Continuation<? super Unit> continuation) {
        GlanceAppWidgetKt$updateAll$1 glanceAppWidgetKt$updateAll$1;
        int i;
        GlanceAppWidget glanceAppWidget2;
        Iterator it;
        if (continuation instanceof GlanceAppWidgetKt$updateAll$1) {
            glanceAppWidgetKt$updateAll$1 = (GlanceAppWidgetKt$updateAll$1) continuation;
            int i2 = glanceAppWidgetKt$updateAll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetKt$updateAll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = glanceAppWidgetKt$updateAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceAppWidgetKt$updateAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GlanceAppWidgetManager glanceAppWidgetManager = new GlanceAppWidgetManager(context);
                    Class<?> cls = glanceAppWidget.getClass();
                    glanceAppWidgetKt$updateAll$1.L$0 = glanceAppWidget;
                    glanceAppWidgetKt$updateAll$1.L$1 = context;
                    glanceAppWidgetKt$updateAll$1.label = 1;
                    obj = glanceAppWidgetManager.getGlanceIds(cls, glanceAppWidgetKt$updateAll$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) glanceAppWidgetKt$updateAll$1.L$2;
                        context = (Context) glanceAppWidgetKt$updateAll$1.L$1;
                        glanceAppWidget2 = (GlanceAppWidget) glanceAppWidgetKt$updateAll$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            GlanceId glanceId = (GlanceId) it.next();
                            glanceAppWidgetKt$updateAll$1.L$0 = glanceAppWidget2;
                            glanceAppWidgetKt$updateAll$1.L$1 = context;
                            glanceAppWidgetKt$updateAll$1.L$2 = it;
                            glanceAppWidgetKt$updateAll$1.label = 2;
                            if (glanceAppWidget2.update(context, glanceId, glanceAppWidgetKt$updateAll$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    context = (Context) glanceAppWidgetKt$updateAll$1.L$1;
                    glanceAppWidget = (GlanceAppWidget) glanceAppWidgetKt$updateAll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                glanceAppWidget2 = glanceAppWidget;
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        glanceAppWidgetKt$updateAll$1 = new GlanceAppWidgetKt$updateAll$1(continuation);
        Object obj2 = glanceAppWidgetKt$updateAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceAppWidgetKt$updateAll$1.label;
        if (i != 0) {
        }
        glanceAppWidget2 = glanceAppWidget;
        it = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ <State> Object updateIf(GlanceAppWidget glanceAppWidget, Context context, Function1<? super State, Boolean> function1, Continuation<? super Unit> continuation) {
        GlanceStateDefinition<?> stateDefinition = glanceAppWidget.getStateDefinition();
        if (stateDefinition == null) {
            throw new IllegalArgumentException("GlanceAppWidget.updateIf cannot be used if no state is defined.");
        }
        GlanceAppWidgetManager glanceAppWidgetManager = new GlanceAppWidgetManager(context);
        Class<?> cls = glanceAppWidget.getClass();
        InlineMarker.mark(0);
        Object glanceIds = glanceAppWidgetManager.getGlanceIds(cls, continuation);
        InlineMarker.mark(1);
        for (GlanceId glanceId : (Iterable) glanceIds) {
            InlineMarker.mark(3);
            InlineMarker.mark(0);
            R.array arrayVar = (Object) GlanceAppWidgetStateKt.getAppWidgetState(context, stateDefinition, glanceId, (Continuation) null);
            InlineMarker.mark(1);
            Intrinsics.reifiedOperationMarker(1, "State");
            if (function1.invoke(arrayVar).booleanValue()) {
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                glanceAppWidget.update(context, glanceId, null);
                InlineMarker.mark(1);
            }
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
