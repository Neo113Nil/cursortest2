package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.media3.common.Format;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements VideoFrameMetadataListener {
    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
        DefaultVideoSink.lambda$new$1(j, j2, format, mediaFormat);
    }
}
