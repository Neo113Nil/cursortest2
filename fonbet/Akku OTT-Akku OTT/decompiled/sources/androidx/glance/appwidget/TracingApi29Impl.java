package androidx.glance.appwidget;

import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(29)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/TracingApi29Impl;", "", "()V", "beginAsyncSection", "", "methodName", "", "cookie", "", "endAsyncSection", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TracingApi29Impl {
    public static final TracingApi29Impl INSTANCE = new TracingApi29Impl();

    private TracingApi29Impl() {
    }

    @DoNotInline
    public final void beginAsyncSection(String methodName, int cookie) {
        Trace.beginAsyncSection(methodName, cookie);
    }

    @DoNotInline
    public final void endAsyncSection(String methodName, int cookie) {
        Trace.endAsyncSection(methodName, cookie);
    }
}
