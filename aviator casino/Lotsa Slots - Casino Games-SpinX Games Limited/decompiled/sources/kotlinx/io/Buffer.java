package kotlinx.io;

/* compiled from: Buffer.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010!\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020 H\u0017J\b\u0010-\u001a\u00020 H\u0016J\b\u0010.\u001a\u00020 H\u0016J\"\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u00002\b\b\u0002\u00101\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u00020\u0011J\r\u00103\u001a\u00020\u0011H\u0000¢\u0006\u0002\b4J\u0011\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u0011H\u0086\u0002J\u0006\u00107\u001a\u00020 J\u0010\u00108\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0011H\u0016J \u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020;2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(H\u0016J\u0018\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0018\u0010<\u001a\u00020 2\u0006\u0010:\u001a\u00020=2\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0010\u0010>\u001a\u00020\u00112\u0006\u0010:\u001a\u00020=H\u0016J\b\u0010?\u001a\u00020\u0001H\u0016J\u0010\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020(H\u0001J \u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020;2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(H\u0016J\u0018\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020D2\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0018\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0010\u0010E\u001a\u00020\u00112\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020$H\u0016J\u0010\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020&H\u0016J\u0010\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020(H\u0016J\u0010\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020\u0011H\u0016J\u0006\u0010N\u001a\u00020\u0000J\b\u0010O\u001a\u00020 H\u0016J\b\u0010P\u001a\u00020QH\u0016J\r\u0010R\u001a\u00020 H\u0000¢\u0006\u0002\bSJ\b\u0010T\u001a\u00020 H\u0001J\u001b\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u001eH\u0082\bR&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00008VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u001c¨\u0006X"}, d2 = {"Lkotlinx/io/Buffer;", "Lkotlinx/io/Source;", "Lkotlinx/io/Sink;", "<init>", "()V", "head", "Lkotlinx/io/Segment;", "getHead$annotations", "getHead", "()Lkotlinx/io/Segment;", "setHead", "(Lkotlinx/io/Segment;)V", "tail", "getTail$annotations", "getTail", "setTail", "size", "", "getSize", "()J", "sizeMut", "getSizeMut$annotations", "getSizeMut", "setSizeMut", "(J)V", "buffer", "getBuffer$annotations", "getBuffer", "()Lkotlinx/io/Buffer;", "exhausted", "", "require", "", "byteCount", "request", "readByte", "", "readShort", "", "readInt", "", "readLong", "throwEof", "", "hintEmit", "emit", "flush", "copyTo", "out", "startIndex", "endIndex", "completeSegmentByteCount", "completeSegmentByteCount$kotlinx_io_core", "get", "position", "clear", "skip", "readAtMostTo", "sink", "", "readTo", "Lkotlinx/io/RawSink;", "transferTo", "peek", "writableSegment", "minimumCapacity", "write", "source", "Lkotlinx/io/RawSource;", "transferFrom", "writeByte", "byte", "writeShort", "short", "writeInt", "int", "writeLong", com.adjust.sdk.Constants.LONG, "copy", "close", "toString", "", "recycleHead", "recycleHead$kotlinx_io_core", "recycleTail", "pushSegment", "newTail", "tryCompact", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Buffer implements kotlinx.io.Source, kotlinx.io.Sink {
    private kotlinx.io.Segment head;
    private long sizeMut;
    private kotlinx.io.Segment tail;

    public static /* synthetic */ void getBuffer$annotations() {
    }

    public static /* synthetic */ void getHead$annotations() {
    }

    public static /* synthetic */ void getSizeMut$annotations() {
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
    }

    @Override // kotlinx.io.Sink
    public void emit() {
    }

    @Override // kotlinx.io.Sink, kotlinx.io.RawSink, java.io.Flushable
    public void flush() {
    }

    @Override // kotlinx.io.Source, kotlinx.io.Sink
    public kotlinx.io.Buffer getBuffer() {
        return this;
    }

    @Override // kotlinx.io.Sink
    public void hintEmit() {
    }

    public final /* synthetic */ kotlinx.io.Segment getHead() {
        return this.head;
    }

    public final /* synthetic */ void setHead(kotlinx.io.Segment segment) {
        this.head = segment;
    }

    public final /* synthetic */ kotlinx.io.Segment getTail() {
        return this.tail;
    }

    public final /* synthetic */ void setTail(kotlinx.io.Segment segment) {
        this.tail = segment;
    }

    /* renamed from: getSize, reason: from getter */
    public final long getSizeMut() {
        return this.sizeMut;
    }

    public final /* synthetic */ long getSizeMut() {
        return this.sizeMut;
    }

    public final /* synthetic */ void setSizeMut(long j) {
        this.sizeMut = j;
    }

    @Override // kotlinx.io.Source
    public boolean exhausted() {
        return getSizeMut() == 0;
    }

    @Override // kotlinx.io.Source
    public void require(long byteCount) {
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSizeMut() >= byteCount) {
            return;
        }
        throw new java.io.EOFException("Buffer doesn't contain required number of bytes (size: " + getSizeMut() + ", required: " + byteCount + ')');
    }

    @Override // kotlinx.io.Source
    public boolean request(long byteCount) {
        if (byteCount >= 0) {
            return getSizeMut() >= byteCount;
        }
        throw new java.lang.IllegalArgumentException(("byteCount: " + byteCount + " < 0").toString());
    }

    @Override // kotlinx.io.Source
    public byte readByte() {
        kotlinx.io.Segment segment = this.head;
        if (segment == null) {
            throwEof(1L);
            throw new kotlin.KotlinNothingValueException();
        }
        int size = segment.getSize();
        if (size == 0) {
            recycleHead$kotlinx_io_core();
            return readByte();
        }
        byte readByte$kotlinx_io_core = segment.readByte$kotlinx_io_core();
        this.sizeMut--;
        if (size == 1) {
            recycleHead$kotlinx_io_core();
        }
        return readByte$kotlinx_io_core;
    }

    @Override // kotlinx.io.Source
    public short readShort() {
        kotlinx.io.Segment segment = this.head;
        if (segment == null) {
            throwEof(2L);
            throw new kotlin.KotlinNothingValueException();
        }
        int size = segment.getSize();
        if (size < 2) {
            require(2L);
            if (size == 0) {
                recycleHead$kotlinx_io_core();
                return readShort();
            }
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        short readShort$kotlinx_io_core = segment.readShort$kotlinx_io_core();
        this.sizeMut -= 2;
        if (size == 2) {
            recycleHead$kotlinx_io_core();
        }
        return readShort$kotlinx_io_core;
    }

    @Override // kotlinx.io.Source
    public int readInt() {
        kotlinx.io.Segment segment = this.head;
        if (segment == null) {
            throwEof(4L);
            throw new kotlin.KotlinNothingValueException();
        }
        int size = segment.getSize();
        if (size < 4) {
            require(4L);
            if (size == 0) {
                recycleHead$kotlinx_io_core();
                return readInt();
            }
            return (readShort() << 16) | (readShort() & kotlin.UShort.MAX_VALUE);
        }
        int readInt$kotlinx_io_core = segment.readInt$kotlinx_io_core();
        this.sizeMut -= 4;
        if (size == 4) {
            recycleHead$kotlinx_io_core();
        }
        return readInt$kotlinx_io_core;
    }

    @Override // kotlinx.io.Source
    public long readLong() {
        kotlinx.io.Segment segment = this.head;
        if (segment == null) {
            throwEof(8L);
            throw new kotlin.KotlinNothingValueException();
        }
        int size = segment.getSize();
        if (size < 8) {
            require(8L);
            if (size == 0) {
                recycleHead$kotlinx_io_core();
                return readLong();
            }
            return (readInt() << 32) | (readInt() & 4294967295L);
        }
        long readLong$kotlinx_io_core = segment.readLong$kotlinx_io_core();
        this.sizeMut -= 8;
        if (size == 8) {
            recycleHead$kotlinx_io_core();
        }
        return readLong$kotlinx_io_core;
    }

    private final java.lang.Void throwEof(long byteCount) {
        throw new java.io.EOFException("Buffer doesn't contain required number of bytes (size: " + getSizeMut() + ", required: " + byteCount + ')');
    }

    public static /* synthetic */ void copyTo$default(kotlinx.io.Buffer buffer, kotlinx.io.Buffer buffer2, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.getSizeMut();
        }
        buffer.copyTo(buffer2, j3, j2);
    }

    public final void copyTo(kotlinx.io.Buffer out, long startIndex, long endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        kotlinx.io._UtilKt.checkBounds(getSizeMut(), startIndex, endIndex);
        if (startIndex == endIndex) {
            return;
        }
        long j = endIndex - startIndex;
        out.sizeMut += j;
        kotlinx.io.Segment segment = this.head;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (startIndex < segment.getLimit() - segment.getPos()) {
                break;
            }
            startIndex -= segment.getLimit() - segment.getPos();
            segment = segment.getNext();
        }
        while (j > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            kotlinx.io.Segment sharedCopy$kotlinx_io_core = segment.sharedCopy$kotlinx_io_core();
            sharedCopy$kotlinx_io_core.setPos(sharedCopy$kotlinx_io_core.getPos() + ((int) startIndex));
            sharedCopy$kotlinx_io_core.setLimit(java.lang.Math.min(sharedCopy$kotlinx_io_core.getPos() + ((int) j), sharedCopy$kotlinx_io_core.getLimit()));
            if (out.getHead() == null) {
                out.setHead(sharedCopy$kotlinx_io_core);
                out.setTail(sharedCopy$kotlinx_io_core);
            } else {
                kotlinx.io.Segment tail = out.getTail();
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
                out.setTail(tail.push$kotlinx_io_core(sharedCopy$kotlinx_io_core));
            }
            j -= sharedCopy$kotlinx_io_core.getLimit() - sharedCopy$kotlinx_io_core.getPos();
            segment = segment.getNext();
            startIndex = 0;
        }
    }

    public final long completeSegmentByteCount$kotlinx_io_core() {
        long sizeMut = getSizeMut();
        if (sizeMut == 0) {
            return 0L;
        }
        kotlinx.io.Segment segment = this.tail;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        return (segment.getLimit() >= 8192 || !segment.owner) ? sizeMut : sizeMut - (segment.getLimit() - segment.getPos());
    }

    public final byte get(long position) {
        long j = 0;
        if (position < 0 || position >= getSizeMut()) {
            throw new java.lang.IndexOutOfBoundsException("position (" + position + ") is not within the range [0..size(" + getSizeMut() + "))");
        }
        if (position == 0) {
            kotlinx.io.Segment segment = this.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            return segment.getUnchecked$kotlinx_io_core(0);
        }
        if (getHead() == null) {
            kotlinx.io.Segment segment2 = null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(null);
            segment2.getUnchecked$kotlinx_io_core((int) (position - (-1)));
            throw null;
        }
        if (getSizeMut() - position < position) {
            kotlinx.io.Segment tail = getTail();
            long sizeMut = getSizeMut();
            while (tail != null && sizeMut > position) {
                sizeMut -= tail.getLimit() - tail.getPos();
                if (sizeMut <= position) {
                    break;
                }
                tail = tail.getPrev();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
            return tail.getUnchecked$kotlinx_io_core((int) (position - sizeMut));
        }
        kotlinx.io.Segment head = getHead();
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j;
            if (limit > position) {
                break;
            }
            head = head.getNext();
            j = limit;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        return head.getUnchecked$kotlinx_io_core((int) (position - j));
    }

    public final void clear() {
        skip(getSizeMut());
    }

    @Override // kotlinx.io.Source
    public void skip(long byteCount) {
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + byteCount + ") < 0").toString());
        }
        long j = byteCount;
        while (j > 0) {
            kotlinx.io.Segment segment = this.head;
            if (segment == null) {
                throw new java.io.EOFException("Buffer exhausted before skipping " + byteCount + " bytes.");
            }
            int min = (int) java.lang.Math.min(j, segment.getLimit() - segment.getPos());
            long j2 = min;
            this.sizeMut -= j2;
            j -= j2;
            segment.setPos(segment.getPos() + min);
            if (segment.getPos() == segment.getLimit()) {
                recycleHead$kotlinx_io_core();
            }
        }
    }

    @Override // kotlinx.io.Source
    public int readAtMostTo(byte[] sink, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlinx.io._UtilKt.checkBounds(sink.length, startIndex, endIndex);
        kotlinx.io.Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = java.lang.Math.min(endIndex - startIndex, segment.getSize());
        segment.readTo$kotlinx_io_core(sink, startIndex, startIndex + min);
        this.sizeMut -= min;
        if (kotlinx.io.SegmentKt.isEmpty(segment)) {
            recycleHead$kotlinx_io_core();
        }
        return min;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(kotlinx.io.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + byteCount + ") < 0").toString());
        }
        if (getSizeMut() == 0) {
            return -1L;
        }
        if (byteCount > getSizeMut()) {
            byteCount = getSizeMut();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // kotlinx.io.Source
    public void readTo(kotlinx.io.RawSink sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + byteCount + ") < 0").toString());
        }
        if (getSizeMut() < byteCount) {
            sink.write(this, getSizeMut());
            throw new java.io.EOFException("Buffer exhausted before writing " + byteCount + " bytes. Only " + getSizeMut() + " bytes were written.");
        }
        sink.write(this, byteCount);
    }

    @Override // kotlinx.io.Source
    public long transferTo(kotlinx.io.RawSink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long sizeMut = getSizeMut();
        if (sizeMut > 0) {
            sink.write(this, sizeMut);
        }
        return sizeMut;
    }

    @Override // kotlinx.io.Source
    public kotlinx.io.Source peek() {
        return kotlinx.io.CoreKt.buffered(new kotlinx.io.PeekSource(this));
    }

    public final /* synthetic */ kotlinx.io.Segment writableSegment(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new java.lang.IllegalArgumentException(("unexpected capacity (" + minimumCapacity + "), should be in range [1, 8192]").toString());
        }
        kotlinx.io.Segment segment = this.tail;
        if (segment == null) {
            kotlinx.io.Segment take = kotlinx.io.SegmentPool.take();
            this.head = take;
            this.tail = take;
            return take;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        if (segment.getLimit() + minimumCapacity <= 8192 && segment.owner) {
            return segment;
        }
        kotlinx.io.Segment push$kotlinx_io_core = segment.push$kotlinx_io_core(kotlinx.io.SegmentPool.take());
        this.tail = push$kotlinx_io_core;
        return push$kotlinx_io_core;
    }

    @Override // kotlinx.io.Sink
    public void write(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlinx.io._UtilKt.checkBounds(source.length, startIndex, endIndex);
        int i = startIndex;
        while (i < endIndex) {
            kotlinx.io.Segment writableSegment = writableSegment(1);
            int min = java.lang.Math.min(endIndex - i, writableSegment.getRemainingCapacity()) + i;
            writableSegment.write$kotlinx_io_core(source, i, min);
            i = min;
        }
        this.sizeMut += endIndex - startIndex;
    }

    @Override // kotlinx.io.Sink
    public void write(kotlinx.io.RawSource source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + byteCount + ") < 0").toString());
        }
        long j = byteCount;
        while (j > 0) {
            long readAtMostTo = source.readAtMostTo(this, j);
            if (readAtMostTo == -1) {
                throw new java.io.EOFException("Source exhausted before reading " + byteCount + " bytes. Only " + (byteCount - j) + " were read.");
            }
            j -= readAtMostTo;
        }
    }

    @Override // kotlinx.io.RawSink
    public void write(kotlinx.io.Buffer source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        kotlinx.io._UtilKt.checkOffsetAndCount(source.sizeMut, 0L, byteCount);
        while (byteCount > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(source.head);
            if (byteCount < r0.getSize()) {
                kotlinx.io.Segment segment = this.tail;
                if (segment != null && segment.owner) {
                    if ((segment.getLimit() + byteCount) - (segment.getShared$kotlinx_io_core() ? 0 : segment.getPos()) <= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        kotlinx.io.Segment segment2 = source.head;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                        segment2.writeTo$kotlinx_io_core(segment, (int) byteCount);
                        source.sizeMut -= byteCount;
                        this.sizeMut += byteCount;
                        return;
                    }
                }
                kotlinx.io.Segment segment3 = source.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                source.head = segment3.split$kotlinx_io_core((int) byteCount);
            }
            kotlinx.io.Segment segment4 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
            long size = segment4.getSize();
            kotlinx.io.Segment pop$kotlinx_io_core = segment4.pop$kotlinx_io_core();
            source.head = pop$kotlinx_io_core;
            if (pop$kotlinx_io_core == null) {
                source.tail = null;
            }
            if (getHead() == null) {
                setHead(segment4);
                setTail(segment4);
            } else {
                kotlinx.io.Segment tail = getTail();
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
                setTail(tail.push$kotlinx_io_core(segment4).compact$kotlinx_io_core());
                kotlinx.io.Segment tail2 = getTail();
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail2);
                if (tail2.getPrev() == null) {
                    setHead(getTail());
                }
            }
            source.sizeMut -= size;
            this.sizeMut += size;
            byteCount -= size;
        }
    }

    @Override // kotlinx.io.Sink
    public long transferFrom(kotlinx.io.RawSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long readAtMostTo = source.readAtMostTo(this, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (readAtMostTo == -1) {
                return j;
            }
            j += readAtMostTo;
        }
    }

    @Override // kotlinx.io.Sink
    public void writeByte(byte r5) {
        writableSegment(1).writeByte$kotlinx_io_core(r5);
        this.sizeMut++;
    }

    @Override // kotlinx.io.Sink
    public void writeShort(short r5) {
        writableSegment(2).writeShort$kotlinx_io_core(r5);
        this.sizeMut += 2;
    }

    @Override // kotlinx.io.Sink
    public void writeInt(int r5) {
        writableSegment(4).writeInt$kotlinx_io_core(r5);
        this.sizeMut += 4;
    }

    @Override // kotlinx.io.Sink
    public void writeLong(long r3) {
        writableSegment(8).writeLong$kotlinx_io_core(r3);
        this.sizeMut += 8;
    }

    public final kotlinx.io.Buffer copy() {
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        if (getSizeMut() == 0) {
            return buffer;
        }
        kotlinx.io.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        kotlinx.io.Segment sharedCopy$kotlinx_io_core = segment.sharedCopy$kotlinx_io_core();
        buffer.head = sharedCopy$kotlinx_io_core;
        buffer.tail = sharedCopy$kotlinx_io_core;
        for (kotlinx.io.Segment next = segment.getNext(); next != null; next = next.getNext()) {
            kotlinx.io.Segment segment2 = buffer.tail;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            buffer.tail = segment2.push$kotlinx_io_core(next.sharedCopy$kotlinx_io_core());
        }
        buffer.sizeMut = getSizeMut();
        return buffer;
    }

    public java.lang.String toString() {
        kotlinx.io.unsafe.SegmentReadContext segmentReadContext;
        if (getSizeMut() == 0) {
            return "Buffer(size=0)";
        }
        long j = 64;
        int min = (int) java.lang.Math.min(j, getSizeMut());
        java.lang.StringBuilder sb = new java.lang.StringBuilder((min * 2) + (getSizeMut() > j ? 1 : 0));
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        int i = 0;
        for (kotlinx.io.Segment head = getHead(); head != null; head = head.getNext()) {
            segmentReadContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentReadContextImpl;
            int i2 = 0;
            while (i < min && i2 < head.getSize()) {
                int i3 = i2 + 1;
                byte unchecked = segmentReadContext.getUnchecked(head, i2);
                i++;
                sb.append(kotlinx.io._UtilKt.getHEX_DIGIT_CHARS()[(unchecked >> 4) & 15]);
                sb.append(kotlinx.io._UtilKt.getHEX_DIGIT_CHARS()[unchecked & com.google.common.base.Ascii.SI]);
                i2 = i3;
            }
        }
        if (getSizeMut() > j) {
            sb.append(kotlin.text.Typography.ellipsis);
        }
        return "Buffer(size=" + getSizeMut() + " hex=" + ((java.lang.Object) sb) + ')';
    }

    public final void recycleHead$kotlinx_io_core() {
        kotlinx.io.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        kotlinx.io.Segment next = segment.getNext();
        this.head = next;
        if (next == null) {
            this.tail = null;
        } else {
            next.setPrev(null);
        }
        segment.setNext(null);
        kotlinx.io.SegmentPool.recycle(segment);
    }

    public final /* synthetic */ void recycleTail() {
        kotlinx.io.Segment segment = this.tail;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        kotlinx.io.Segment prev = segment.getPrev();
        this.tail = prev;
        if (prev == null) {
            this.head = null;
        } else {
            prev.setNext(null);
        }
        segment.setPrev(null);
        kotlinx.io.SegmentPool.recycle(segment);
    }

    private final void pushSegment(kotlinx.io.Segment newTail, boolean tryCompact) {
        if (getHead() == null) {
            setHead(newTail);
            setTail(newTail);
            return;
        }
        if (tryCompact) {
            kotlinx.io.Segment tail = getTail();
            kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
            setTail(tail.push$kotlinx_io_core(newTail).compact$kotlinx_io_core());
            kotlinx.io.Segment tail2 = getTail();
            kotlin.jvm.internal.Intrinsics.checkNotNull(tail2);
            if (tail2.getPrev() == null) {
                setHead(getTail());
                return;
            }
            return;
        }
        kotlinx.io.Segment tail3 = getTail();
        kotlin.jvm.internal.Intrinsics.checkNotNull(tail3);
        setTail(tail3.push$kotlinx_io_core(newTail));
    }

    static /* synthetic */ void pushSegment$default(kotlinx.io.Buffer buffer, kotlinx.io.Segment segment, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (buffer.getHead() == null) {
            buffer.setHead(segment);
            buffer.setTail(segment);
            return;
        }
        if (z) {
            kotlinx.io.Segment tail = buffer.getTail();
            kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
            buffer.setTail(tail.push$kotlinx_io_core(segment).compact$kotlinx_io_core());
            kotlinx.io.Segment tail2 = buffer.getTail();
            kotlin.jvm.internal.Intrinsics.checkNotNull(tail2);
            if (tail2.getPrev() == null) {
                buffer.setHead(buffer.getTail());
                return;
            }
            return;
        }
        kotlinx.io.Segment tail3 = buffer.getTail();
        kotlin.jvm.internal.Intrinsics.checkNotNull(tail3);
        buffer.setTail(tail3.push$kotlinx_io_core(segment));
    }
}
