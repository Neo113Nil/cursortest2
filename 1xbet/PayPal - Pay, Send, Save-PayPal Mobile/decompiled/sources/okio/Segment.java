package okio;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b!\u0010 "}, d2 = {"Lokio/Segment;", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "pos", "limit", "", "shared", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "([BIIZZ)V", "sharedCopy", "()Lokio/Segment;", "unsharedCopy", "pop", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, com.adjust.sdk.Constants.PUSH, "(Lokio/Segment;)Lokio/Segment;", "byteCount", "split", "(I)Lokio/Segment;", "", "compact", "sink", "writeTo", "(Lokio/Segment;I)V", "[B", com.visa.cbp.getEncExpo.warmup, "Z", io.ktor.http.LinkHeader.Rel.Next, "Lokio/Segment;", "prev", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Segment {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public okio.Segment next;
    public boolean owner;
    public int pos;
    public okio.Segment prev;
    public boolean shared;

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final okio.Segment sharedCopy() {
        this.shared = true;
        return new okio.Segment(this.data, this.pos, this.limit, true, false);
    }

    public final okio.Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return new okio.Segment(copyOf, this.pos, this.limit, false, true);
    }

    public final okio.Segment pop() {
        okio.Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        okio.Segment segment2 = this.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        segment2.next = this.next;
        okio.Segment segment3 = this.next;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final okio.Segment push(okio.Segment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
        segment.prev = this;
        segment.next = this.next;
        okio.Segment segment2 = this.next;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final okio.Segment split(int byteCount) {
        okio.Segment take;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new java.lang.IllegalArgumentException("byteCount out of range".toString());
        }
        if (byteCount >= 1024) {
            take = sharedCopy();
        } else {
            take = okio.SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = take.data;
            int i = this.pos;
            kotlin.collections.ArraysKt.copyInto$default(bArr, bArr2, 0, i, i + byteCount, 2, (java.lang.Object) null);
        }
        take.limit = take.pos + byteCount;
        this.pos += byteCount;
        okio.Segment segment = this.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        segment.push(take);
        return take;
    }

    public final void compact() {
        int i;
        okio.Segment segment = this.prev;
        if (segment == this) {
            throw new java.lang.IllegalStateException("cannot compact".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        if (segment.owner) {
            int i2 = this.limit - this.pos;
            okio.Segment segment2 = this.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            int i3 = segment2.limit;
            okio.Segment segment3 = this.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
            if (segment3.shared) {
                i = 0;
            } else {
                okio.Segment segment4 = this.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                i = segment4.pos;
            }
            if (i2 > (8192 - i3) + i) {
                return;
            }
            okio.Segment segment5 = this.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment5);
            writeTo(segment5, i2);
            pop();
            okio.SegmentPool.recycle(this);
        }
    }

    public final void writeTo(okio.Segment sink, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (!sink.owner) {
            throw new java.lang.IllegalStateException("only owner can write".toString());
        }
        int i = sink.limit;
        int i2 = i + byteCount;
        if (i2 > 8192) {
            if (sink.shared) {
                throw new java.lang.IllegalArgumentException();
            }
            int i3 = sink.pos;
            if (i2 - i3 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            kotlin.collections.ArraysKt.copyInto$default(bArr, bArr, 0, i3, i, 2, (java.lang.Object) null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i4 = sink.limit;
        int i5 = this.pos;
        kotlin.collections.ArraysKt.copyInto(bArr2, bArr3, i4, i5, i5 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }
}
