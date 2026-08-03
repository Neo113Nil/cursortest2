package kotlinx.io;

/* compiled from: PeekSource.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlinx/io/PeekSource;", "Lkotlinx/io/RawSource;", "upstream", "Lkotlinx/io/Source;", "<init>", "(Lkotlinx/io/Source;)V", "buffer", "Lkotlinx/io/Buffer;", "getBuffer$annotations", "()V", "expectedSegment", "Lkotlinx/io/Segment;", "expectedPos", "", "closed", "", "pos", "", "readAtMostTo", "sink", "byteCount", "close", "", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PeekSource implements kotlinx.io.RawSource {
    private final kotlinx.io.Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private kotlinx.io.Segment expectedSegment;
    private long pos;
    private final kotlinx.io.Source upstream;

    private static /* synthetic */ void getBuffer$annotations() {
    }

    public PeekSource(kotlinx.io.Source upstream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        kotlinx.io.Buffer bufferField = upstream.getBufferField();
        this.buffer = bufferField;
        this.expectedSegment = bufferField.getHead();
        kotlinx.io.Segment head = bufferField.getHead();
        this.expectedPos = head != null ? head.getPos() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3 == r4.getPos()) goto L15;
     */
    @Override // kotlinx.io.RawSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readAtMostTo(kotlinx.io.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(!this.closed)) {
            throw new java.lang.IllegalStateException("Source is closed.".toString());
        }
        if (byteCount >= 0) {
            kotlinx.io.Segment segment = this.expectedSegment;
            if (segment != null) {
                if (segment == this.buffer.getHead()) {
                    int i = this.expectedPos;
                    kotlinx.io.Segment head = this.buffer.getHead();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(head);
                }
                throw new java.lang.IllegalStateException("Peek source is invalid because upstream source was used".toString());
            }
            if (byteCount == 0) {
                return 0L;
            }
            if (!this.upstream.request(this.pos + 1)) {
                return -1L;
            }
            if (this.expectedSegment == null && this.buffer.getHead() != null) {
                this.expectedSegment = this.buffer.getHead();
                kotlinx.io.Segment head2 = this.buffer.getHead();
                kotlin.jvm.internal.Intrinsics.checkNotNull(head2);
                this.expectedPos = head2.getPos();
            }
            long min = java.lang.Math.min(byteCount, this.buffer.getSizeMut() - this.pos);
            kotlinx.io.Buffer buffer = this.buffer;
            long j = this.pos;
            buffer.copyTo(sink, j, j + min);
            this.pos += min;
            return min;
        }
        throw new java.lang.IllegalArgumentException(("byteCount (" + byteCount + ") < 0").toString());
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }
}
