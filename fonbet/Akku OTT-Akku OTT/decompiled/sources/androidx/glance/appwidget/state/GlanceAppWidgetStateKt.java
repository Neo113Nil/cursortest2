package androidx.glance.appwidget.state;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.AppWidgetId;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.state.GlanceState;
import androidx.glance.state.GlanceStateDefinition;
import androidx.glance.state.PreferencesGlanceStateDefinition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001aE\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001aY\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a+\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"getAppWidgetState", ExifInterface.GPS_DIRECTION_TRUE, "context", "Landroid/content/Context;", "definition", "Landroidx/glance/state/GlanceStateDefinition;", "glanceId", "Landroidx/glance/GlanceId;", "(Landroid/content/Context;Landroidx/glance/state/GlanceStateDefinition;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAppWidgetState", "", "updateState", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/MutablePreferences;", "Lkotlin/coroutines/Continuation;", "", "(Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/content/Context;Landroidx/glance/state/GlanceStateDefinition;Landroidx/glance/GlanceId;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/glance/appwidget/GlanceAppWidget;", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceAppWidgetState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidgetState.kt\nandroidx/glance/appwidget/state/GlanceAppWidgetStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceAppWidgetStateKt {
    public static final <T> Object getAppWidgetState(Context context, GlanceStateDefinition<T> glanceStateDefinition, GlanceId glanceId, Continuation<? super T> continuation) {
        if (glanceId instanceof AppWidgetId) {
            return GlanceState.INSTANCE.getValue(context, glanceStateDefinition, AppWidgetUtilsKt.createUniqueRemoteUiName(((AppWidgetId) glanceId).getAppWidgetId()), continuation);
        }
        throw new IllegalArgumentException("The glance ID is not the one of an App Widget");
    }

    public static final <T> Object updateAppWidgetState(Context context, GlanceStateDefinition<T> glanceStateDefinition, GlanceId glanceId, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (glanceId instanceof AppWidgetId) {
            return GlanceState.INSTANCE.updateValue(context, glanceStateDefinition, AppWidgetUtilsKt.createUniqueRemoteUiName(((AppWidgetId) glanceId).getAppWidgetId()), function2, continuation);
        }
        throw new IllegalArgumentException("The glance ID is not the one of an App Widget");
    }

    public static final <T> Object getAppWidgetState(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Continuation<? super T> continuation) {
        GlanceStateDefinition<?> stateDefinition = glanceAppWidget.getStateDefinition();
        if (stateDefinition != null) {
            Object appWidgetState = getAppWidgetState(context, stateDefinition, glanceId, continuation);
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return appWidgetState;
        }
        throw new IllegalStateException("No state defined in this provider");
    }

    public static final Object updateAppWidgetState(Context context, GlanceId glanceId, Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object updateAppWidgetState = updateAppWidgetState(context, PreferencesGlanceStateDefinition.INSTANCE, glanceId, new GlanceAppWidgetStateKt$updateAppWidgetState$4(function2, null), continuation);
        return updateAppWidgetState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAppWidgetState : Unit.INSTANCE;
    }
}
