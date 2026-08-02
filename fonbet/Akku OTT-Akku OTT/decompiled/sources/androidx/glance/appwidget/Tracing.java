package androidx.glance.appwidget;

import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/Tracing;", "", "()V", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getEnabled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "beginGlanceAppWidgetUpdate", "", "endGlanceAppWidgetUpdate", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Tracing {
    public static final Tracing INSTANCE = new Tracing();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);
    public static final int $stable = 8;

    private Tracing() {
    }

    public final void beginGlanceAppWidgetUpdate() {
        if (Build.VERSION.SDK_INT < 29 || !enabled.get()) {
            return;
        }
        TracingApi29Impl.INSTANCE.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    public final void endGlanceAppWidgetUpdate() {
        if (Build.VERSION.SDK_INT < 29 || !enabled.get()) {
            return;
        }
        TracingApi29Impl.INSTANCE.endAsyncSection("GlanceAppWidget::update", 0);
    }

    public final AtomicBoolean getEnabled() {
        return enabled;
    }
}
