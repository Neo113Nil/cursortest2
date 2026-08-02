package es.antonborri.home_widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.flutter.plugin.common.EventChannel;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class b extends BroadcastReceiver {
    public final /* synthetic */ EventChannel.EventSink a;

    public b(EventChannel.EventSink eventSink) {
        this.a = eventSink;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean equals$default;
        EventChannel.EventSink eventSink;
        Object obj;
        Uri data;
        equals$default = StringsKt__StringsJVMKt.equals$default(intent != null ? intent.getAction() : null, "es.antonborri.home_widget.action.LAUNCH", false, 2, null);
        if (!equals$default || (eventSink = this.a) == null) {
            return;
        }
        if (intent == null || (data = intent.getData()) == null || (obj = data.toString()) == null) {
            obj = Boolean.TRUE;
        }
        eventSink.success(obj);
    }
}
