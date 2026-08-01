package com.unity3d.services.store;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreWebViewEventSender.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\"\u00020\u0001¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/services/store/StoreWebViewEventSender;", "", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "<init>", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "send", "", NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/services/store/StoreEvent;", "params", "", "(Lcom/unity3d/services/store/StoreEvent;[Ljava/lang/Object;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoreWebViewEventSender {
    private final IEventSender eventSender;

    public StoreWebViewEventSender(IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final void send(StoreEvent event, Object... params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        this.eventSender.sendEvent(WebViewEventCategory.STORE, event, Arrays.copyOf(params, params.length));
    }
}
