package androidx.glance.appwidget.action;

import android.content.Intent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/action/SendBroadcastIntentAction;", "Landroidx/glance/appwidget/action/SendBroadcastAction;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getIntent", "()Landroid/content/Intent;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendBroadcastIntentAction implements SendBroadcastAction {
    private final Intent intent;

    public SendBroadcastIntentAction(Intent intent) {
        this.intent = intent;
    }

    public final Intent getIntent() {
        return this.intent;
    }
}
