package androidx.media3.exoplayer.analytics;

import android.content.Intent;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.media3.exoplayer.analytics.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0363j0 implements ListenerSet.Event, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0363j0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioTrackReleased((AnalyticsListener.EventTime) this.b, (AudioSink.AudioTrackConfig) this.c);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 1:
                ((EnhancedIntentService) this.b).lambda$onStartCommand$1((Intent) this.c, task);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.setConsent$lambda$0((FlutterFirebaseAnalyticsPlugin) this.b, (Function1) this.c, task);
                break;
        }
    }
}
