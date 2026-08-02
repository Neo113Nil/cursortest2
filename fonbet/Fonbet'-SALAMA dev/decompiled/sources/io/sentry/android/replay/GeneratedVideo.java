package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class GeneratedVideo {
    public static final int $stable = 8;
    private final long duration;
    private final int frameCount;
    private final File video;

    public GeneratedVideo(File file, int i7, long j) {
        h.e(file, RRWebVideoEvent.EVENT_TAG);
        this.video = file;
        this.frameCount = i7;
        this.duration = j;
    }

    public static /* synthetic */ GeneratedVideo copy$default(GeneratedVideo generatedVideo, File file, int i7, long j, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            file = generatedVideo.video;
        }
        if ((i8 & 2) != 0) {
            i7 = generatedVideo.frameCount;
        }
        if ((i8 & 4) != 0) {
            j = generatedVideo.duration;
        }
        return generatedVideo.copy(file, i7, j);
    }

    public final File component1() {
        return this.video;
    }

    public final int component2() {
        return this.frameCount;
    }

    public final long component3() {
        return this.duration;
    }

    public final GeneratedVideo copy(File file, int i7, long j) {
        h.e(file, RRWebVideoEvent.EVENT_TAG);
        return new GeneratedVideo(file, i7, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneratedVideo)) {
            return false;
        }
        GeneratedVideo generatedVideo = (GeneratedVideo) obj;
        return h.a(this.video, generatedVideo.video) && this.frameCount == generatedVideo.frameCount && this.duration == generatedVideo.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final File getVideo() {
        return this.video;
    }

    public int hashCode() {
        return Long.hashCode(this.duration) + ((Integer.hashCode(this.frameCount) + (this.video.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.video + ", frameCount=" + this.frameCount + ", duration=" + this.duration + ')';
    }
}
