package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010"}, d2 = {"Lcom/miteksystems/misnap/core/Frame;", "", "", "close", "()V", "", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "getFrameInfos", "()[Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "frameInfos", "", "getImageBytes", "()[B", "imageBytes", "", "getImageFormat", "()I", "imageFormat", "Landroid/util/Size;", "getImageSize", "()Landroid/util/Size;", "imageSize", "getRotationDegrees", "rotationDegrees", "FrameInfo"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Frame {
    void close();

    com.miteksystems.misnap.core.Frame.FrameInfo[] getFrameInfos();

    byte[] getImageBytes();

    int getImageFormat();

    android.util.Size getImageSize();

    int getRotationDegrees();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "", "<init>", "()V", "TimingFrameInfo", "Lcom/miteksystems/misnap/core/Frame$FrameInfo$TimingFrameInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static abstract class FrameInfo {
        public /* synthetic */ FrameInfo(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/Frame$FrameInfo$TimingFrameInfo;", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "", "timestamp", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/miteksystems/misnap/core/Frame$FrameInfo$TimingFrameInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getTimestamp"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class TimingFrameInfo extends com.miteksystems.misnap.core.Frame.FrameInfo {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final long timestamp;

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TimingFrameInfo(timestamp=");
                sb.append(this.timestamp);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Long.hashCode(this.timestamp);
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo) && this.timestamp == ((com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo) other).timestamp;
            }

            public final com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo copy(long timestamp) {
                return new com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo(timestamp);
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            public static /* synthetic */ com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo copy$default(com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo timingFrameInfo, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = timingFrameInfo.timestamp;
                }
                return timingFrameInfo.copy(j);
            }

            public TimingFrameInfo(long j) {
                super(null);
                this.timestamp = j;
            }
        }

        private FrameInfo() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static com.miteksystems.misnap.core.Frame.FrameInfo[] getFrameInfos(com.miteksystems.misnap.core.Frame frame) {
            return new com.miteksystems.misnap.core.Frame.FrameInfo[0];
        }
    }
}
