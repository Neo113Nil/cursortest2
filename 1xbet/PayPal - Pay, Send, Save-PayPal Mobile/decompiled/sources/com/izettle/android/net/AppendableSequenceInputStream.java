package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R$\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00078\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lcom/izettle/android/net/AppendableSequenceInputStream;", "Ljava/io/InputStream;", "Ljava/io/SequenceInputStream;", "proxy", "<init>", "(Ljava/io/SequenceInputStream;)V", "inputStream", "", "length", "", "append", "(Ljava/io/InputStream;J)V", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "()I", "close", "()V", "readlimit", "mark", "(I)V", "", "markSupported", "()Z", "read", "", util.h.xy.cb.b.f1091, "([B)I", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "([BII)I", "reset", "n", "skip", "(J)J", "p0", "J", "getLength", "()J", "getHighSpeedVideoFpsRangesFor", "Ljava/io/SequenceInputStream;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppendableSequenceInputStream extends java.io.InputStream {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<java.io.InputStream> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.io.SequenceInputStream Camera2StreamConfigurationMap;
    private long length;

    public /* synthetic */ AppendableSequenceInputStream(java.io.SequenceInputStream sequenceInputStream, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.io.SequenceInputStream(java.util.Collections.emptyEnumeration()) : sequenceInputStream);
    }

    public AppendableSequenceInputStream(java.io.SequenceInputStream sequenceInputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequenceInputStream, "");
        this.Camera2StreamConfigurationMap = sequenceInputStream;
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
    }

    public final long getLength() {
        return this.length;
    }

    public final void append(java.io.InputStream inputStream, long length) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        this.getHighSpeedVideoSizes.add(inputStream);
        this.length += length;
        this.Camera2StreamConfigurationMap = new java.io.SequenceInputStream(java.util.Collections.enumeration(this.getHighSpeedVideoSizes));
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.Camera2StreamConfigurationMap.read();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.Camera2StreamConfigurationMap.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.close();
    }

    @Override // java.io.InputStream
    public final void mark(int readlimit) {
        this.Camera2StreamConfigurationMap.mark(readlimit);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.Camera2StreamConfigurationMap.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
        return this.Camera2StreamConfigurationMap.read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] b, int off, int len) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
        return this.Camera2StreamConfigurationMap.read(b, off, len);
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.Camera2StreamConfigurationMap.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long n) {
        return this.Camera2StreamConfigurationMap.skip(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppendableSequenceInputStream() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
