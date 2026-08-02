package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.ExoPlayer;

/* renamed from: androidx.media3.exoplayer.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0440t implements com.google.common.base.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0440t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        AnalyticsCollector lambda$setAnalyticsCollector$21;
        com.google.android.exoplayer2.analytics.AnalyticsCollector lambda$setAnalyticsCollector$212;
        switch (this.a) {
            case 0:
                lambda$setAnalyticsCollector$21 = ExoPlayer.Builder.lambda$setAnalyticsCollector$21((AnalyticsCollector) this.b, (Clock) obj);
                return lambda$setAnalyticsCollector$21;
            default:
                lambda$setAnalyticsCollector$212 = ExoPlayer.Builder.lambda$setAnalyticsCollector$21((com.google.android.exoplayer2.analytics.AnalyticsCollector) this.b, (com.google.android.exoplayer2.util.Clock) obj);
                return lambda$setAnalyticsCollector$212;
        }
    }
}
