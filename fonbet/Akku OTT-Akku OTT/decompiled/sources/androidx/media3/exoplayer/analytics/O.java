package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class O implements ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ O(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onDrmKeysRemoved((AnalyticsListener.EventTime) this.a);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FirebaseAnalyticsHostApi.Companion.setUp$lambda$9$0((FirebaseAnalyticsHostApi) this.a, obj, reply);
    }
}
