package R1;

import android.media.MediaCodecInfo;
import android.media.session.MediaSession;
import android.webkit.WebViewRenderProcess;
import com.ryanheise.audioservice.AudioService;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(int i7, int i8, int i9) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i7, i8, i9);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ MediaSession g(AudioService audioService) {
        return new MediaSession(audioService, "media-session", null);
    }

    public static /* bridge */ /* synthetic */ WebViewRenderProcess i(Object obj) {
        return (WebViewRenderProcess) obj;
    }

    public static /* synthetic */ void l() {
    }
}
