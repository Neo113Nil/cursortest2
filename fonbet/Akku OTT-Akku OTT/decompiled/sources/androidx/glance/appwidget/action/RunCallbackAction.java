package androidx.glance.appwidget.action;

import android.content.Context;
import androidx.glance.GlanceId;
import androidx.glance.action.Action;
import androidx.glance.action.ActionParameters;
import io.flutter.plugins.firebase.analytics.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0019\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/action/RunCallbackAction;", "Landroidx/glance/action/Action;", "callbackClass", "Ljava/lang/Class;", "Landroidx/glance/appwidget/action/ActionCallback;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "(Ljava/lang/Class;Landroidx/glance/action/ActionParameters;)V", "getCallbackClass", "()Ljava/lang/Class;", "getParameters", "()Landroidx/glance/action/ActionParameters;", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RunCallbackAction implements Action {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Class<? extends ActionCallback> callbackClass;
    private final ActionParameters parameters;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/glance/appwidget/action/RunCallbackAction$Companion;", "", "()V", "run", "", "context", "Landroid/content/Context;", "className", "", "glanceId", "Landroidx/glance/GlanceId;", Constants.PARAMETERS, "Landroidx/glance/action/ActionParameters;", "(Landroid/content/Context;Ljava/lang/String;Landroidx/glance/GlanceId;Landroidx/glance/action/ActionParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object run(Context context, String str, GlanceId glanceId, ActionParameters actionParameters, Continuation<? super Unit> continuation) {
            Class<?> cls = Class.forName(str);
            if (!ActionCallback.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("Provided class must implement ActionCallback.");
            }
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
            Object onAction = ((ActionCallback) newInstance).onAction(context, glanceId, actionParameters, continuation);
            return onAction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? onAction : Unit.INSTANCE;
        }

        private Companion() {
        }
    }

    public RunCallbackAction(Class<? extends ActionCallback> cls, ActionParameters actionParameters) {
        this.callbackClass = cls;
        this.parameters = actionParameters;
    }

    public final Class<? extends ActionCallback> getCallbackClass() {
        return this.callbackClass;
    }

    public final ActionParameters getParameters() {
        return this.parameters;
    }
}
