package androidx.media3.common;

/* loaded from: classes7.dex */
public class FrameInfo {
    public final androidx.media3.common.Format format;
    public final long offsetToAddUs;

    public FrameInfo(androidx.media3.common.Format format, long j) {
        com.google.common.base.Preconditions.checkArgument(format.colorInfo != null, "format colorInfo must be set");
        com.google.common.base.Preconditions.checkArgument(format.width > 0, "format width must be positive, but is: %s", format.width);
        com.google.common.base.Preconditions.checkArgument(format.height > 0, "format height must be positive, but is: %s", format.height);
        this.format = format;
        this.offsetToAddUs = j;
    }
}
