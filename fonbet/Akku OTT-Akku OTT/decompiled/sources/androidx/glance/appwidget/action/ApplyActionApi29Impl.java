package androidx.glance.appwidget.action;

import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi(29)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/glance/appwidget/action/ApplyActionApi29Impl;", "", "()V", "setIntentIdentifier", "Landroid/content/Intent;", "intent", "viewId", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ApplyActionApi29Impl {
    public static final ApplyActionApi29Impl INSTANCE = new ApplyActionApi29Impl();

    private ApplyActionApi29Impl() {
    }

    @DoNotInline
    public final Intent setIntentIdentifier(Intent intent, int viewId) {
        intent.setIdentifier(String.valueOf(viewId));
        return intent;
    }
}
