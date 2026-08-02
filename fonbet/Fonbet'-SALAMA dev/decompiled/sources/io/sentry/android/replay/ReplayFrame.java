package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ReplayFrame {
    public static final int $stable = 8;
    private final String screen;
    private final File screenshot;
    private final long timestamp;

    public ReplayFrame(File file, long j, String str) {
        h.e(file, "screenshot");
        this.screenshot = file;
        this.timestamp = j;
        this.screen = str;
    }

    public static /* synthetic */ ReplayFrame copy$default(ReplayFrame replayFrame, File file, long j, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            file = replayFrame.screenshot;
        }
        if ((i7 & 2) != 0) {
            j = replayFrame.timestamp;
        }
        if ((i7 & 4) != 0) {
            str = replayFrame.screen;
        }
        return replayFrame.copy(file, j, str);
    }

    public final File component1() {
        return this.screenshot;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.screen;
    }

    public final ReplayFrame copy(File file, long j, String str) {
        h.e(file, "screenshot");
        return new ReplayFrame(file, j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplayFrame)) {
            return false;
        }
        ReplayFrame replayFrame = (ReplayFrame) obj;
        return h.a(this.screenshot, replayFrame.screenshot) && this.timestamp == replayFrame.timestamp && h.a(this.screen, replayFrame.screen);
    }

    public final String getScreen() {
        return this.screen;
    }

    public final File getScreenshot() {
        return this.screenshot;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = (Long.hashCode(this.timestamp) + (this.screenshot.hashCode() * 31)) * 31;
        String str = this.screen;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.screenshot + ", timestamp=" + this.timestamp + ", screen=" + this.screen + ')';
    }

    public /* synthetic */ ReplayFrame(File file, long j, String str, int i7, e eVar) {
        this(file, j, (i7 & 4) != 0 ? null : str);
    }
}
