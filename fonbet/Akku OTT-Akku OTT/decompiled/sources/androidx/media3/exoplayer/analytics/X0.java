package androidx.media3.exoplayer.analytics;

import android.media.AudioTrack;
import android.media.metrics.PlaybackErrorEvent;
import com.facebook.appevents.C0692d;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class X0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ X0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaMetricsListener) this.b).lambda$maybeReportPlaybackError$0((PlaybackErrorEvent) this.c);
                break;
            case 1:
                String applicationId = (String) this.b;
                C0692d event = (C0692d) this.c;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.gps.ara.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                        Intrinsics.checkNotNullParameter(event, "$event");
                        com.facebook.appevents.gps.ara.a.a.c(applicationId, event);
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.gps.ara.a.class);
                        return;
                    }
                }
                break;
            case 2:
                DefaultAudioSink.lambda$releaseAudioTrackAsync$0((AudioTrack) this.b, (ConditionVariable) this.c);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$log$6((Map) this.b, (TaskCompletionSource) this.c);
                break;
        }
    }
}
