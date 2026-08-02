package io.sentry.android.replay.video;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MuxerConfig {
    public static final int $stable = 8;
    private final int bitRate;
    private final File file;
    private final int frameRate;
    private final String mimeType;
    private int recordingHeight;
    private int recordingWidth;

    public MuxerConfig(File file, int i7, int i8, int i9, int i10, String str) {
        h.e(file, "file");
        h.e(str, "mimeType");
        this.file = file;
        this.recordingWidth = i7;
        this.recordingHeight = i8;
        this.frameRate = i9;
        this.bitRate = i10;
        this.mimeType = str;
    }

    public static /* synthetic */ MuxerConfig copy$default(MuxerConfig muxerConfig, File file, int i7, int i8, int i9, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = muxerConfig.file;
        }
        if ((i11 & 2) != 0) {
            i7 = muxerConfig.recordingWidth;
        }
        int i12 = i7;
        if ((i11 & 4) != 0) {
            i8 = muxerConfig.recordingHeight;
        }
        int i13 = i8;
        if ((i11 & 8) != 0) {
            i9 = muxerConfig.frameRate;
        }
        int i14 = i9;
        if ((i11 & 16) != 0) {
            i10 = muxerConfig.bitRate;
        }
        int i15 = i10;
        if ((i11 & 32) != 0) {
            str = muxerConfig.mimeType;
        }
        return muxerConfig.copy(file, i12, i13, i14, i15, str);
    }

    public final File component1() {
        return this.file;
    }

    public final int component2() {
        return this.recordingWidth;
    }

    public final int component3() {
        return this.recordingHeight;
    }

    public final int component4() {
        return this.frameRate;
    }

    public final int component5() {
        return this.bitRate;
    }

    public final String component6() {
        return this.mimeType;
    }

    public final MuxerConfig copy(File file, int i7, int i8, int i9, int i10, String str) {
        h.e(file, "file");
        h.e(str, "mimeType");
        return new MuxerConfig(file, i7, i8, i9, i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MuxerConfig)) {
            return false;
        }
        MuxerConfig muxerConfig = (MuxerConfig) obj;
        return h.a(this.file, muxerConfig.file) && this.recordingWidth == muxerConfig.recordingWidth && this.recordingHeight == muxerConfig.recordingHeight && this.frameRate == muxerConfig.frameRate && this.bitRate == muxerConfig.bitRate && h.a(this.mimeType, muxerConfig.mimeType);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final File getFile() {
        return this.file;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public int hashCode() {
        return this.mimeType.hashCode() + ((Integer.hashCode(this.bitRate) + ((Integer.hashCode(this.frameRate) + ((Integer.hashCode(this.recordingHeight) + ((Integer.hashCode(this.recordingWidth) + (this.file.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setRecordingHeight(int i7) {
        this.recordingHeight = i7;
    }

    public final void setRecordingWidth(int i7) {
        this.recordingWidth = i7;
    }

    public String toString() {
        return "MuxerConfig(file=" + this.file + ", recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ", mimeType=" + this.mimeType + ')';
    }

    public /* synthetic */ MuxerConfig(File file, int i7, int i8, int i9, int i10, String str, int i11, e eVar) {
        this(file, i7, i8, i9, i10, (i11 & 32) != 0 ? "video/avc" : str);
    }
}
