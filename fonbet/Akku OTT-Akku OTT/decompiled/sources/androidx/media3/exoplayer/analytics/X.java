package androidx.media3.exoplayer.analytics;

import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.datatransport.runtime.synchronization.b;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.ListenerSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class X implements ListenerSet.Event, b.a, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ X(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a() {
        com.facebook.internal.n nVar = (com.facebook.internal.n) this.b;
        String appId = (String) this.c;
        if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z = false;
            boolean z2 = nVar != null && nVar.g;
            com.facebook.w wVar = com.facebook.w.a;
            com.facebook.S s = com.facebook.S.a;
            if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.S.class)) {
                try {
                    com.facebook.S.a.e();
                    z = com.facebook.S.g.a();
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.S.class);
                }
            }
            if (z2 && z) {
                com.facebook.appevents.codeless.b bVar = com.facebook.appevents.codeless.b.a;
                bVar.getClass();
                if (com.facebook.internal.instrument.crashshield.a.b(bVar)) {
                    return;
                }
                try {
                    if (com.facebook.appevents.codeless.b.h) {
                        return;
                    }
                    com.facebook.appevents.codeless.b.h = true;
                    com.facebook.w.c().execute(new androidx.core.widget.b(appId, 3));
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, bVar);
                }
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.a.a(th3, com.facebook.appevents.codeless.b.class);
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b.a
    public Object execute() {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.m) this.b;
        return mVar.c.F((com.google.android.datatransport.runtime.d) this.c);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$59((AnalyticsListener.EventTime) this.b, (VideoSize) this.c, (AnalyticsListener) obj);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.b, (AudioAttributes) this.c);
                break;
        }
    }
}
