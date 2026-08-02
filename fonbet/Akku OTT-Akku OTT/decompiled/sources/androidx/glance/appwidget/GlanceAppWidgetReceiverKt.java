package androidx.glance.appwidget;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0082\b¨\u0006\u0004"}, d2 = {"runAndLogExceptions", "", "block", "Lkotlin/Function0;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlanceAppWidgetReceiverKt {
    private static final void runAndLogExceptions(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            AppWidgetUtilsKt.logException(th);
        }
    }
}
