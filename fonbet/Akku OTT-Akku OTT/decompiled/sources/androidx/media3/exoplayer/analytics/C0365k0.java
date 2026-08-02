package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.media3.exoplayer.analytics.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0365k0 implements ListenerSet.Event, ListenerSet.Event, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0365k0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onAudioSinkError((AnalyticsListener.EventTime) this.b, (Exception) this.c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDownstreamFormatChanged((AnalyticsListener.EventTime) this.b, (MediaLoadData) this.c);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAnalyticsPlugin.resetAnalyticsData$lambda$0((FlutterFirebaseAnalyticsPlugin) this.b, (Function1) this.c, task);
    }
}
