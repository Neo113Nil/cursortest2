package androidx.glance.appwidget.action;

import android.content.Context;
import androidx.glance.GlanceId;
import androidx.glance.action.ActionParameters;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallback;", "", "onAction", "", "context", "Landroid/content/Context;", "glanceId", "Landroidx/glance/GlanceId;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Landroidx/glance/action/ActionParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ActionCallback {
    Object onAction(Context context, GlanceId glanceId, ActionParameters actionParameters, Continuation<? super Unit> continuation);
}
