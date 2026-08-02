package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0016\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0011*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\f2\u001a\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010$\u001a\u00020#*\u00020\u000bH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u0014\u0010'\u001a\u00020&*\u00020\u000bH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b+\u0010\"\u001a\u001c\u0010-\u001a\u00020#*\u00020\u000b2\u0006\u0010,\u001a\u00020\fH\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u0014\u00100\u001a\u00020/*\u00020\u000bH\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00102\u001a\u00020/*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b2\u00103\u001a0\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u00105\u001a\u0002042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u001c\u00109\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u001c\u0010;\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b;\u0010:\u001a\u001c\u0010=\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010<\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b=\u0010>\u001a\u001c\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b6\u0010@\u001a,\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u0010A\u001a\u0014\u0010B\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010B\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bB\u0010D\u001a\u001c\u0010F\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010E\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bF\u0010G\u001a\u001c\u0010H\u001a\u00020/*\u00020\u000b2\u0006\u0010E\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bH\u0010I\u001a,\u0010F\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bF\u0010J\u001a\u0014\u0010K\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bK\u0010\"\u001a\u0014\u0010L\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bL\u0010\"\u001a\u0014\u0010M\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0004\bM\u0010N\u001a\u001c\u0010M\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bM\u0010O\u001a\u001c\u0010P\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\b¢\u0006\u0004\bP\u0010Q\u001a$\u0010H\u001a\u00020/*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bH\u0010R\u001a\u001c\u0010T\u001a\u00020\f*\u00020\u000b2\u0006\u0010E\u001a\u00020SH\u0080\b¢\u0006\u0004\bT\u0010U\u001a\u001c\u0010V\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bV\u0010\u0010\u001a\u0016\u0010W\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\bW\u0010X\u001a\u001c\u0010Z\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010Y\u001a\u00020\fH\u0080\b¢\u0006\u0004\bZ\u0010\u0010\u001a\u0014\u0010[\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b[\u0010*\u001a,\u0010_\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b_\u0010`\u001a\u001c\u0010b\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010a\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bb\u0010c\u001a\u001c\u0010e\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020dH\u0080\b¢\u0006\u0004\be\u0010f\u001a$\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020d2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b6\u0010g\u001a\u001c\u0010i\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010h\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bi\u0010c\u001a\u001c\u0010k\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010j\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bk\u0010c\u001a\u001c\u0010m\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010l\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bm\u0010c\u001a\u001c\u0010n\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\bn\u0010:\u001a$\u00106\u001a\u00020/*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b6\u0010R\u001a$\u0010F\u001a\u00020\f*\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bF\u0010o\u001a,\u0010q\u001a\u00020\f*\u00020\u000b2\u0006\u0010h\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010p\u001a\u00020\fH\u0080\b¢\u0006\u0004\bq\u0010r\u001aA\u0010q\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010p\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\bq\u0010s\u001a$\u0010u\u001a\u00020\f*\u00020\u000b2\u0006\u0010t\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bu\u0010v\u001a4\u0010w\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bw\u0010x\u001a\u001e\u0010{\u001a\u00020\b*\u00020\u000b2\b\u0010z\u001a\u0004\u0018\u00010yH\u0080\b¢\u0006\u0004\b{\u0010|\u001a\u0014\u0010}\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b}\u0010*\u001a\u0014\u0010~\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0004\b~\u0010\u007f\u001a\u0016\u0010\u0080\u0001\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0005\b\u0080\u0001\u0010N\u001a\u001f\u0010\u0080\u0001\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a!\u0010\u0084\u0001\u001a\u00030\u0082\u0001*\u00020\u000b2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a!\u0010\u0086\u0001\u001a\u00030\u0082\u0001*\u00020\u000b2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001\u001a\u0018\u0010\u0087\u0001\u001a\u00020\u0002*\u00030\u0082\u0001H\u0080\b¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a \u0010\u0089\u0001\u001a\u00020\u0002*\u00030\u0082\u00012\u0006\u0010\u001d\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a!\u0010\u008c\u0001\u001a\u00020\f*\u00030\u0082\u00012\u0007\u0010\u008b\u0001\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a!\u0010\u008f\u0001\u001a\u00020\f*\u00030\u0082\u00012\u0007\u0010\u008e\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0018\u0010\u0091\u0001\u001a\u00020/*\u00030\u0082\u0001H\u0080\b¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u001f\u0010\u0093\u0001\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0017\u0010\u0097\u0001\u001a\u00020\u00028\u0000X\u0081T¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0018\u0010\u009c\u0001\u001a\u00030\u0099\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0017\u0010\u009d\u0001\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0017\u0010\u009f\u0001\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokio/Segment;", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "", "segmentPos", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "bytesOffset", "bytesLimit", "", "rangeEquals", "(Lokio/Segment;I[BII)Z", "Lokio/Buffer;", "", "newline", "", "readUtf8Line", "(Lokio/Buffer;J)Ljava/lang/String;", "T", "fromIndex", "Lkotlin/Function2;", "lambda", "seek", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lokio/Options;", "options", "selectTruncated", "selectPrefix", "(Lokio/Buffer;Lokio/Options;Z)I", "out", "offset", "byteCount", "commonCopyTo", "(Lokio/Buffer;Lokio/Buffer;JJ)Lokio/Buffer;", "commonCompleteSegmentByteCount", "(Lokio/Buffer;)J", "", "commonReadByte", "(Lokio/Buffer;)B", "", "commonReadShort", "(Lokio/Buffer;)S", "commonReadInt", "(Lokio/Buffer;)I", "commonReadLong", "pos", "commonGet", "(Lokio/Buffer;J)B", "", "commonClear", "(Lokio/Buffer;)V", "commonSkip", "(Lokio/Buffer;J)V", "Lokio/ByteString;", "byteString", "commonWrite", "(Lokio/Buffer;Lokio/ByteString;II)Lokio/Buffer;", "v", "commonWriteDecimalLong", "(Lokio/Buffer;J)Lokio/Buffer;", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "(Lokio/Buffer;I)Lokio/Segment;", "source", "(Lokio/Buffer;[B)Lokio/Buffer;", "(Lokio/Buffer;[BII)Lokio/Buffer;", "commonReadByteArray", "(Lokio/Buffer;)[B", "(Lokio/Buffer;J)[B", "sink", "commonRead", "(Lokio/Buffer;[B)I", "commonReadFully", "(Lokio/Buffer;[B)V", "(Lokio/Buffer;[BII)I", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "(Lokio/Buffer;)Lokio/ByteString;", "(Lokio/Buffer;J)Lokio/ByteString;", "commonSelect", "(Lokio/Buffer;Lokio/Options;)I", "(Lokio/Buffer;Lokio/Buffer;J)V", "Lokio/Sink;", "commonReadAll", "(Lokio/Buffer;Lokio/Sink;)J", "commonReadUtf8", "commonReadUtf8Line", "(Lokio/Buffer;)Ljava/lang/String;", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "string", "beginIndex", "endIndex", "commonWriteUtf8", "(Lokio/Buffer;Ljava/lang/String;II)Lokio/Buffer;", "codePoint", "commonWriteUtf8CodePoint", "(Lokio/Buffer;I)Lokio/Buffer;", "Lokio/Source;", "commonWriteAll", "(Lokio/Buffer;Lokio/Source;)J", "(Lokio/Buffer;Lokio/Source;J)Lokio/Buffer;", util.h.xy.cb.b.f1091, "commonWriteByte", lib.android.paypal.com.magnessdk.g.n2, "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "(Lokio/Buffer;Lokio/Buffer;J)J", "toIndex", "commonIndexOf", "(Lokio/Buffer;BJJ)J", "(Lokio/Buffer;Lokio/ByteString;JJII)J", "targetBytes", "commonIndexOfElement", "(Lokio/Buffer;Lokio/ByteString;J)J", "commonRangeEquals", "(Lokio/Buffer;JLokio/ByteString;II)Z", "", "other", "commonEquals", "(Lokio/Buffer;Ljava/lang/Object;)Z", "commonHashCode", "commonCopy", "(Lokio/Buffer;)Lokio/Buffer;", "commonSnapshot", "(Lokio/Buffer;I)Lokio/ByteString;", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadUnsafe", "(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "commonReadAndWriteUnsafe", "commonNext", "(Lokio/Buffer$UnsafeCursor;)I", "commonSeek", "(Lokio/Buffer$UnsafeCursor;J)I", "newSize", "commonResizeBuffer", "(Lokio/Buffer$UnsafeCursor;J)J", "minByteCount", "commonExpandBuffer", "(Lokio/Buffer$UnsafeCursor;I)J", "commonClose", "(Lokio/Buffer$UnsafeCursor;)V", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", com.visa.cbp.getEncExpo.warmup, "", "getHighResolutionOutputSizeshNQ4ISI", "[J", "Camera2StreamConfigurationMap", "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Buffer {
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;
    private static final byte[] HEX_DIGIT_BYTES = okio._JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    private static final long[] getHighResolutionOutputSizeshNQ4ISI = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, com.gemalto.mfs.mwsdk.payment.engine.remote.DSRPConstants.MAX_AMOUNT_LIMIT, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(okio.Segment segment, int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i4 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final java.lang.String readUtf8Line(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == 13) {
                java.lang.String readUtf8 = buffer.readUtf8(j2);
                buffer.skip(2L);
                return readUtf8;
            }
        }
        java.lang.String readUtf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return readUtf82;
    }

    public static final <T> T seek(okio.Buffer buffer, long j, kotlin.jvm.functions.Function2<? super okio.Segment, ? super java.lang.Long, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return function2.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            return function2.invoke(segment, java.lang.Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 <= j) {
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j2 = j3;
            } else {
                return function2.invoke(segment, java.lang.Long.valueOf(j2));
            }
        }
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, okio.Options options, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r19 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int selectPrefix(okio.Buffer buffer, okio.Options options, boolean z) {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        okio.Segment segment = buffer.head;
        int i4 = -1;
        if (segment == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment.data;
        int i5 = segment.pos;
        int i6 = segment.limit;
        int[] trie = options.getTrie();
        okio.Segment segment2 = segment;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = trie[i8];
            int i10 = i8 + 2;
            int i11 = trie[i8 + 1];
            if (i11 != i4) {
                i7 = i11;
            }
            if (segment2 == null) {
                break;
            }
            if (i9 >= 0) {
                int i12 = i5 + 1;
                byte b = bArr[i5];
                for (int i13 = i10; i13 != i10 + i9; i13++) {
                    if ((b & 255) == trie[i13]) {
                        int i14 = trie[i13 + i9];
                        if (i12 == i6) {
                            segment2 = segment2.next;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                            i12 = segment2.pos;
                            bArr = segment2.data;
                            i6 = segment2.limit;
                            if (segment2 == segment) {
                                segment2 = null;
                            }
                        }
                        i5 = i12;
                        i = i14;
                        if (i >= 0) {
                            return i;
                        }
                        i8 = -i;
                        i4 = -1;
                    }
                }
                break loop0;
            }
            int i15 = i10;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i15 + 1;
                if ((bArr[i5] & 255) != trie[i15]) {
                    break loop0;
                }
                boolean z2 = i17 == (i9 * (-1)) + i10;
                if (i16 == i6) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    okio.Segment segment3 = segment2.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    i3 = segment3.pos;
                    byte[] bArr2 = segment3.data;
                    i2 = segment3.limit;
                    if (segment3 != segment) {
                        segment2 = segment3;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment2 = null;
                    }
                } else {
                    i2 = i6;
                    i3 = i16;
                }
                if (z2) {
                    i = trie[i17];
                    i5 = i3;
                    i6 = i2;
                    break;
                }
                i5 = i3;
                i6 = i2;
                i15 = i17;
            }
        }
        return i7;
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer buffer2, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer2, "");
        okio.SegmentedByteString.checkOffsetAndCount(buffer.size(), j, j2);
        if (j2 != 0) {
            buffer2.setSize$okio(buffer2.size() + j2);
            okio.Segment segment = buffer.head;
            while (true) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                if (j < segment.limit - segment.pos) {
                    break;
                }
                j -= segment.limit - segment.pos;
                segment = segment.next;
            }
            while (j2 > 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                okio.Segment sharedCopy = segment.sharedCopy();
                sharedCopy.pos += (int) j;
                sharedCopy.limit = java.lang.Math.min(sharedCopy.pos + ((int) j2), sharedCopy.limit);
                if (buffer2.head == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy.prev;
                    buffer2.head = sharedCopy.next;
                } else {
                    okio.Segment segment2 = buffer2.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    okio.Segment segment3 = segment2.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    segment3.push(sharedCopy);
                }
                j2 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j = 0;
            }
        }
        return buffer;
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (segment2.limit - segment2.pos);
    }

    public static final byte commonReadByte(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        buffer.setSize$okio(buffer.size() - 1);
        if (i3 == i2) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
            return b;
        }
        segment.pos = i3;
        return b;
    }

    public static final short commonReadShort(okio.Buffer buffer) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() < 2) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i3 = segment.pos;
        int i4 = segment.limit;
        if (i4 - i3 < 2) {
            byte readByte = buffer.readByte();
            i = buffer.readByte() & 255;
            i2 = readByte & 255;
        } else {
            byte[] bArr = segment.data;
            byte b = bArr[i3];
            int i5 = i3 + 2;
            byte b2 = bArr[i3 + 1];
            buffer.setSize$okio(buffer.size() - 2);
            if (i5 == i4) {
                buffer.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            } else {
                segment.pos = i5;
            }
            i = b2 & 255;
            i2 = b & 255;
        }
        return (short) (i | (i2 << 8));
    }

    public static final int commonReadInt(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() < 4) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        buffer.setSize$okio(buffer.size() - 4);
        if (i3 == i2) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
            return i4;
        }
        segment.pos = i3;
        return i4;
    }

    public static final long commonReadLong(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() < 8) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        int i3 = i + 8;
        long j6 = (bArr[i + 5] & 255) << 16;
        long j7 = j6 | ((j5 & 255) << 24) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i3 == i2) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
            return j7;
        }
        segment.pos = i3;
        return j7;
    }

    public static final byte commonGet(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
        okio.Segment segment = buffer.head;
        if (segment == null) {
            okio.Segment segment2 = null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(null);
            byte[] bArr = segment2.data;
            throw null;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j) - size)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j) - j2)];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j2 = j3;
        }
    }

    public static final void commonClear(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        buffer.skip(buffer.size());
    }

    public static final void commonSkip(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        while (j > 0) {
            okio.Segment segment = buffer.head;
            if (segment == null) {
                throw new java.io.EOFException();
            }
            int min = (int) java.lang.Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            buffer.setSize$okio(buffer.size() - j2);
            j -= j2;
            segment.pos += min;
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, okio.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        int access$countDigitsIn = access$countDigitsIn(j);
        if (z) {
            access$countDigitsIn++;
        }
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(access$countDigitsIn);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit + access$countDigitsIn;
        while (j != 0) {
            i--;
            bArr[i] = getHEX_DIGIT_BYTES()[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i - 1] = 45;
        }
        writableSegment$okio.limit += access$countDigitsIn;
        buffer.setSize$okio(buffer.size() + access$countDigitsIn);
        return buffer;
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (writableSegment$okio.limit + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    public static final okio.Segment commonWritableSegment(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (i <= 0 || i > 8192) {
            throw new java.lang.IllegalArgumentException("unexpected capacity".toString());
        }
        if (buffer.head == null) {
            okio.Segment take = okio.SegmentPool.take();
            buffer.head = take;
            take.prev = take;
            take.next = take;
            return take;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(okio.SegmentPool.take()) : segment2;
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return buffer.write(bArr, 0, bArr.length);
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        long j = i2;
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            okio.Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = java.lang.Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            kotlin.collections.ArraysKt.copyInto(bArr, writableSegment$okio.data, writableSegment$okio.limit, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return buffer.readByteArray(buffer.size());
    }

    public static final byte[] commonReadByteArray(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j < 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.lang.IllegalArgumentException("byteCount: ".concat(java.lang.String.valueOf(j)).toString());
        }
        if (buffer.size() < j) {
            throw new java.io.EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final int commonRead(okio.Buffer buffer, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final void commonReadFully(okio.Buffer buffer, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i = 0;
        while (i < bArr.length) {
            int read = buffer.read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            i += read;
        }
    }

    public static final int commonRead(okio.Buffer buffer, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i, i2);
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int min = java.lang.Math.min(i2, segment.limit - segment.pos);
        kotlin.collections.ArraysKt.copyInto(segment.data, bArr, i, segment.pos, segment.pos + min);
        segment.pos += min;
        buffer.setSize$okio(buffer.size() - min);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return min;
    }

    public static final long commonReadDecimalLong(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        boolean z = false;
        int i = 0;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            okio.Segment segment = buffer.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        okio.Buffer writeByte = new okio.Buffer().writeDecimalLong(j).writeByte((int) b);
                        if (!z2) {
                            writeByte.readByte();
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Number too large: ");
                        sb.append(writeByte.readUtf8());
                        throw new java.lang.NumberFormatException(sb.toString());
                    }
                    j = (j * 10) + i4;
                } else {
                    if (b != 45 || i != 0) {
                        z = true;
                        break;
                    }
                    j2--;
                    z2 = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                buffer.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i);
        if (i >= (z2 ? 2 : 1)) {
            return z2 ? j : -j;
        }
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        java.lang.String str = z2 ? "Expected a digit" : "Expected a digit or '-'";
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(" but was 0x");
        sb2.append(okio.SegmentedByteString.toHexString(buffer.getByte(0L)));
        throw new java.lang.NumberFormatException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer buffer) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            okio.Segment segment = buffer.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b - 55;
                } else {
                    if (i2 == 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                        sb.append(okio.SegmentedByteString.toHexString(b));
                        throw new java.lang.NumberFormatException(sb.toString());
                    }
                    z = true;
                    if (i3 != i4) {
                        buffer.head = segment.pop();
                        okio.SegmentPool.recycle(segment);
                    } else {
                        segment.pos = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    okio.Buffer writeByte = new okio.Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Number too large: ");
                    sb2.append(writeByte.readUtf8());
                    throw new java.lang.NumberFormatException(sb2.toString());
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i2);
        return j;
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return buffer.readByteString(buffer.size());
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j < 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.lang.IllegalArgumentException("byteCount: ".concat(java.lang.String.valueOf(j)).toString());
        }
        if (buffer.size() < j) {
            throw new java.io.EOFException();
        }
        if (j >= 4096) {
            okio.ByteString snapshot = buffer.snapshot((int) j);
            buffer.skip(j);
            return snapshot;
        }
        return new okio.ByteString(buffer.readByteArray(j));
    }

    public static final int commonSelect(okio.Buffer buffer, okio.Options options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        int selectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonReadFully(okio.Buffer buffer, okio.Buffer buffer2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer2, "");
        if (buffer.size() < j) {
            buffer2.write(buffer, buffer.size());
            throw new java.io.EOFException();
        }
        buffer2.write(buffer, j);
    }

    public static final long commonReadAll(okio.Buffer buffer, okio.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final java.lang.String commonReadUtf8(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j < 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.lang.IllegalArgumentException("byteCount: ".concat(java.lang.String.valueOf(j)).toString());
        }
        if (buffer.size() < j) {
            throw new java.io.EOFException();
        }
        if (j == 0) {
            return "";
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        if (segment.pos + j > segment.limit) {
            return okio.internal._Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i = (int) j;
        java.lang.String commonToUtf8String = okio.internal._Utf8Kt.commonToUtf8String(segment.data, segment.pos, segment.pos + i);
        segment.pos += i;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return commonToUtf8String;
    }

    public static final java.lang.String commonReadUtf8Line(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        long indexOf = buffer.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("limit < 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long indexOf = buffer.indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (j2 < buffer.size() && buffer.getByte(j2 - 1) == 13 && buffer.getByte(j2) == 10) {
            return readUtf8Line(buffer, j2);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, java.lang.Math.min(32L, buffer.size()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\\n not found: limit=");
        sb.append(java.lang.Math.min(buffer.size(), j));
        sb.append(" content=");
        sb.append(buffer2.readByteString().hex());
        sb.append(kotlin.text.Typography.ellipsis);
        throw new java.io.EOFException(sb.toString());
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer buffer) {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() == 0) {
            throw new java.io.EOFException();
        }
        byte b = buffer.getByte(0L);
        if ((b & 128) == 0) {
            i = b & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & com.google.common.base.Ascii.US;
            i2 = 2;
            i3 = 128;
        } else if ((b & com.visa.cbp.getEncExpo.onUnminimized) == 224) {
            i = b & com.google.common.base.Ascii.SI;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                buffer.skip(1L);
                return 65533;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (buffer.size() < j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size < ");
            sb.append(i2);
            sb.append(": ");
            sb.append(buffer.size());
            sb.append(" (to read code point prefixed 0x");
            sb.append(okio.SegmentedByteString.toHexString(b));
            sb.append(')');
            throw new java.io.EOFException(sb.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = buffer.getByte(j2);
            if ((b2 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
                buffer.skip(j2);
                return 65533;
            }
            i = (i << 6) | (b2 & 63);
        }
        buffer.skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, java.lang.String str, int i, int i2) {
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0: ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i2 > str.length()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                okio.Segment writableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = writableSegment$okio.data;
                int i3 = writableSegment$okio.limit - i;
                int min = java.lang.Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = (i3 + i) - writableSegment$okio.limit;
                writableSegment$okio.limit += i5;
                buffer.setSize$okio(buffer.size() + i5);
            } else {
                if (charAt2 < 2048) {
                    okio.Segment writableSegment$okio2 = buffer.writableSegment$okio(2);
                    writableSegment$okio2.data[writableSegment$okio2.limit] = (byte) ((charAt2 >> 6) | 192);
                    writableSegment$okio2.data[writableSegment$okio2.limit + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit += 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    okio.Segment writableSegment$okio3 = buffer.writableSegment$okio(3);
                    writableSegment$okio3.data[writableSegment$okio3.limit] = (byte) ((charAt2 >> '\f') | 224);
                    writableSegment$okio3.data[writableSegment$okio3.limit + 1] = (byte) (((charAt2 >> 6) & 63) | 128);
                    writableSegment$okio3.data[writableSegment$okio3.limit + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit += 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i6 = i + 1;
                    char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        buffer.writeByte(63);
                        i = i6;
                    } else {
                        int i7 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        okio.Segment writableSegment$okio4 = buffer.writableSegment$okio(4);
                        writableSegment$okio4.data[writableSegment$okio4.limit] = (byte) ((i7 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        writableSegment$okio4.data[writableSegment$okio4.limit + 1] = (byte) (((i7 >> 12) & 63) | 128);
                        writableSegment$okio4.data[writableSegment$okio4.limit + 2] = (byte) (((i7 >> 6) & 63) | 128);
                        writableSegment$okio4.data[writableSegment$okio4.limit + 3] = (byte) ((i7 & 63) | 128);
                        writableSegment$okio4.limit += 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (i < 128) {
            buffer.writeByte(i);
            return buffer;
        }
        if (i < 2048) {
            okio.Segment writableSegment$okio = buffer.writableSegment$okio(2);
            writableSegment$okio.data[writableSegment$okio.limit] = (byte) ((i >> 6) | 192);
            writableSegment$okio.data[writableSegment$okio.limit + 1] = (byte) ((i & 63) | 128);
            writableSegment$okio.limit += 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i && i < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i < 65536) {
            okio.Segment writableSegment$okio2 = buffer.writableSegment$okio(3);
            writableSegment$okio2.data[writableSegment$okio2.limit] = (byte) ((i >> 12) | 224);
            writableSegment$okio2.data[writableSegment$okio2.limit + 1] = (byte) (((i >> 6) & 63) | 128);
            writableSegment$okio2.data[writableSegment$okio2.limit + 2] = (byte) ((i & 63) | 128);
            writableSegment$okio2.limit += 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i <= 1114111) {
            okio.Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
            writableSegment$okio3.data[writableSegment$okio3.limit] = (byte) ((i >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            writableSegment$okio3.data[writableSegment$okio3.limit + 1] = (byte) (((i >> 12) & 63) | 128);
            writableSegment$okio3.data[writableSegment$okio3.limit + 2] = (byte) (((i >> 6) & 63) | 128);
            writableSegment$okio3.data[writableSegment$okio3.limit + 3] = (byte) ((i & 63) | 128);
            writableSegment$okio3.limit += 4;
            buffer.setSize$okio(buffer.size() + 4);
            return buffer;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected code point: 0x");
        sb.append(okio.SegmentedByteString.toHexString(i));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final long commonWriteAll(okio.Buffer buffer, okio.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        long j = 0;
        while (true) {
            long read = source.read(buffer, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static final okio.Buffer commonWrite(okio.Buffer buffer, okio.Source source, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        while (j > 0) {
            long read = source.read(buffer, j);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            j -= read;
        }
        return buffer;
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        writableSegment$okio.limit = i + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final void commonWrite(okio.Buffer buffer, okio.Buffer buffer2, long j) {
        okio.Segment segment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer2, "");
        if (buffer2 == buffer) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        okio.SegmentedByteString.checkOffsetAndCount(buffer2.size(), 0L, j);
        while (j > 0) {
            okio.Segment segment2 = buffer2.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            int i = segment2.limit;
            kotlin.jvm.internal.Intrinsics.checkNotNull(buffer2.head);
            if (j < i - r1.pos) {
                if (buffer.head != null) {
                    okio.Segment segment3 = buffer.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                        okio.Segment segment4 = buffer2.head;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                        segment4.writeTo(segment, (int) j);
                        buffer2.setSize$okio(buffer2.size() - j);
                        buffer.setSize$okio(buffer.size() + j);
                        return;
                    }
                }
                okio.Segment segment5 = buffer2.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment5);
                buffer2.head = segment5.split((int) j);
            }
            okio.Segment segment6 = buffer2.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment6);
            long j2 = segment6.limit - segment6.pos;
            buffer2.head = segment6.pop();
            if (buffer.head == null) {
                buffer.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6.prev;
            } else {
                okio.Segment segment7 = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment7);
                okio.Segment segment8 = segment7.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment8);
                segment8.push(segment6).compact();
            }
            buffer2.setSize$okio(buffer2.size() - j2);
            buffer.setSize$okio(buffer.size() + j2);
            j -= j2;
        }
    }

    public static final long commonRead(okio.Buffer buffer, okio.Buffer buffer2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer2, "");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        buffer2.write(buffer, j);
        return j;
    }

    public static final long commonIndexOf(okio.Buffer buffer, byte b, long j, long j2) {
        okio.Segment segment;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        long j3 = 0;
        if (0 > j || j > j2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size=");
            sb.append(buffer.size());
            sb.append(" fromIndex=");
            sb.append(j);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (j2 > buffer.size()) {
            j2 = buffer.size();
        }
        if (j == j2 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            j3 = buffer.size();
            while (j3 > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j3 -= segment.limit - segment.pos;
            }
            if (segment == null) {
                return -1L;
            }
            while (j3 < j2) {
                byte[] bArr = segment.data;
                int min = (int) java.lang.Math.min(segment.limit, (segment.pos + j2) - j3);
                i = (int) ((segment.pos + j) - j3);
                while (i < min) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j3 = j4;
        }
        if (segment == null) {
            return -1L;
        }
        while (j3 < j2) {
            byte[] bArr2 = segment.data;
            int min2 = (int) java.lang.Math.min(segment.limit, (segment.pos + j2) - j3);
            i = (int) ((segment.pos + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j = j3;
        }
        return -1L;
        return (i - segment.pos) + j3;
    }

    public static final long commonIndexOf(okio.Buffer buffer, okio.ByteString byteString, long j, long j2, int i, int i2) {
        okio.Segment segment;
        int i3;
        long j3 = j;
        long j4 = j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        long j5 = i2;
        okio.SegmentedByteString.checkOffsetAndCount(byteString.size(), i, j5);
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("byteCount == 0".toString());
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new java.lang.IllegalArgumentException("fromIndex < 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
        if (j3 > j4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex > toIndex: ");
            sb.append(j3);
            sb.append(" > ");
            sb.append(j4);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (j4 > buffer.size()) {
            j4 = buffer.size();
        }
        long j7 = -1;
        if (j3 == j4 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j3 < j3) {
            j6 = buffer.size();
            while (j6 > j3) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j6 -= segment.limit - segment.pos;
            }
            if (segment == null) {
                return -1L;
            }
            byte[] internalArray$okio = byteString.internalArray$okio();
            byte b = internalArray$okio[i];
            long min = java.lang.Math.min(j4, (buffer.size() - j5) + 1);
            while (j6 < min) {
                byte[] bArr = segment.data;
                int min2 = (int) java.lang.Math.min(segment.limit, (segment.pos + min) - j6);
                i3 = (int) ((segment.pos + j3) - j6);
                while (i3 < min2) {
                    if (bArr[i3] != b || !rangeEquals(segment, i3 + 1, internalArray$okio, i + 1, i2)) {
                        i3++;
                    }
                }
                j6 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j3 = j6;
                j7 = -1;
            }
            return j7;
        }
        while (true) {
            long j8 = (segment.limit - segment.pos) + j6;
            if (j8 > j3) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j6 = j8;
        }
        if (segment == null) {
            return -1L;
        }
        byte[] internalArray$okio2 = byteString.internalArray$okio();
        byte b2 = internalArray$okio2[i];
        long min3 = java.lang.Math.min(j4, (buffer.size() - j5) + 1);
        while (j6 < min3) {
            byte[] bArr2 = segment.data;
            int min4 = (int) java.lang.Math.min(segment.limit, (segment.pos + min3) - j6);
            i3 = (int) ((segment.pos + j3) - j6);
            while (i3 < min4) {
                if (bArr2[i3] == b2 && rangeEquals(segment, i3 + 1, internalArray$okio2, i + 1, i2)) {
                }
                i3++;
            }
            j6 += segment.limit - segment.pos;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j3 = j6;
        }
        return -1L;
        return (i3 - segment.pos) + j6;
    }

    public static final boolean commonRangeEquals(okio.Buffer buffer, long j, okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return i2 >= 0 && j >= 0 && ((long) i2) + j <= buffer.size() && i >= 0 && i + i2 <= byteString.size() && (i2 == 0 || commonIndexOf(buffer, byteString, j, j + 1, i, i2) != -1);
    }

    public static final boolean commonEquals(okio.Buffer buffer, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        long j = 0;
        if (buffer.size() == 0) {
            return true;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = buffer2.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        int i = segment.pos;
        int i2 = segment2.pos;
        long j2 = 0;
        while (j2 < buffer.size()) {
            long min = java.lang.Math.min(segment.limit - i, segment2.limit - i2);
            long j3 = j;
            while (j3 < min) {
                if (segment.data[i] != segment2.data[i2]) {
                    return false;
                }
                j3++;
                i++;
                i2++;
            }
            if (i == segment.limit) {
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                i2 = segment2.pos;
            }
            j2 += min;
            j = 0;
        }
        return true;
    }

    public static final int commonHashCode(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i;
    }

    public static final okio.Buffer commonCopy(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        okio.Segment segment = buffer.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment sharedCopy = segment.sharedCopy();
        buffer2.head = sharedCopy;
        sharedCopy.prev = buffer2.head;
        sharedCopy.next = sharedCopy.prev;
        for (okio.Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            okio.Segment segment3 = sharedCopy.prev;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.size() > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size > Int.MAX_VALUE: ");
            sb.append(buffer.size());
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return buffer.snapshot((int) buffer.size());
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer buffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (i == 0) {
            return okio.ByteString.EMPTY;
        }
        okio.SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i);
        okio.Segment segment = buffer.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i3 += segment.limit - segment.pos;
            i4++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        okio.Segment segment2 = buffer.head;
        int i5 = 0;
        while (i2 < i) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            bArr[i5] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i5] = java.lang.Math.min(i2, i);
            iArr[bArr.length + i5] = segment2.pos;
            segment2.shared = true;
            i5++;
            segment2 = segment2.next;
        }
        return new okio.C0706SegmentedByteString(bArr, iArr);
    }

    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        okio.Buffer.UnsafeCursor resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new java.lang.IllegalStateException("already attached to a buffer".toString());
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = false;
        return resolveDefaultParameter;
    }

    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        okio.Buffer.UnsafeCursor resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new java.lang.IllegalStateException("already attached to a buffer".toString());
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = true;
        return resolveDefaultParameter;
    }

    public static final int commonNext(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        long j = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
        if (j != buffer.size()) {
            return unsafeCursor.seek(unsafeCursor.offset == -1 ? 0L : unsafeCursor.offset + (unsafeCursor.end - unsafeCursor.start));
        }
        throw new java.lang.IllegalStateException("no more bytes".toString());
    }

    public static final int commonSeek(okio.Buffer.UnsafeCursor unsafeCursor, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (j < -1 || j > buffer.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("offset=");
            sb.append(j);
            sb.append(" > size=");
            sb.append(buffer.size());
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        okio.Segment segment = buffer.head;
        okio.Segment segment2 = buffer.head;
        long j2 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j3 = unsafeCursor.offset;
            int i = unsafeCursor.start;
            kotlin.jvm.internal.Intrinsics.checkNotNull(unsafeCursor.getSegment());
            long j4 = j3 - (i - r10.pos);
            if (j4 > j) {
                segment2 = unsafeCursor.getSegment();
                size = j4;
            } else {
                segment = unsafeCursor.getSegment();
                j2 = j4;
            }
        }
        if (size - j > j - j2) {
            while (true) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                if (j < (segment.limit - segment.pos) + j2) {
                    break;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
            }
        } else {
            while (size > j) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                segment2 = segment2.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                size -= segment2.limit - segment2.pos;
            }
            j2 = size;
            segment = segment2;
        }
        if (unsafeCursor.readWrite) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (segment.shared) {
                okio.Segment unsharedCopy = segment.unsharedCopy();
                if (buffer.head == segment) {
                    buffer.head = unsharedCopy;
                }
                segment = segment.push(unsharedCopy);
                okio.Segment segment3 = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segment);
        unsafeCursor.offset = j;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        unsafeCursor.data = segment.data;
        unsafeCursor.start = segment.pos + ((int) (j - j2));
        unsafeCursor.end = segment.limit;
        return unsafeCursor.end - unsafeCursor.start;
    }

    public static final long commonResizeBuffer(okio.Buffer.UnsafeCursor unsafeCursor, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new java.lang.IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        if (j <= size) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("newSize < 0: ".concat(java.lang.String.valueOf(j)).toString());
            }
            long j2 = size - j;
            while (true) {
                if (j2 <= 0) {
                    break;
                }
                okio.Segment segment = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                okio.Segment segment2 = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                long j3 = segment2.limit - segment2.pos;
                if (j3 <= j2) {
                    buffer.head = segment2.pop();
                    okio.SegmentPool.recycle(segment2);
                    j2 -= j3;
                } else {
                    segment2.limit -= (int) j2;
                    break;
                }
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j4 = j - size;
            boolean z = true;
            while (j4 > 0) {
                okio.Segment writableSegment$okio = buffer.writableSegment$okio(1);
                int min = (int) java.lang.Math.min(j4, 8192 - writableSegment$okio.limit);
                writableSegment$okio.limit += min;
                j4 -= min;
                if (z) {
                    unsafeCursor.setSegment$okio(writableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = writableSegment$okio.data;
                    unsafeCursor.start = writableSegment$okio.limit - min;
                    unsafeCursor.end = writableSegment$okio.limit;
                    z = false;
                }
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final long commonExpandBuffer(okio.Buffer.UnsafeCursor unsafeCursor, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("minByteCount <= 0: ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i > 8192) {
            throw new java.lang.IllegalArgumentException("minByteCount > Segment.SIZE: ".concat(java.lang.String.valueOf(i)).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new java.lang.IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        okio.Segment writableSegment$okio = buffer.writableSegment$okio(i);
        int i2 = 8192 - writableSegment$okio.limit;
        writableSegment$okio.limit = 8192;
        long j = i2;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(writableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = writableSegment$okio.data;
        unsafeCursor.start = 8192 - i2;
        unsafeCursor.end = 8192;
        return j;
    }

    public static final void commonClose(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        if (unsafeCursor.buffer == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer".toString());
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonIndexOfElement(okio.Buffer buffer, okio.ByteString byteString, long j) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        long j2 = 0;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("fromIndex < 0: ".concat(java.lang.String.valueOf(j)).toString());
        }
        okio.Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            j2 = buffer.size();
            while (j2 > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j2 -= segment.limit - segment.pos;
            }
            if (segment == null) {
                return -1L;
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b2 = byteString.getByte(1);
                while (j2 < buffer.size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        i2 = segment.pos;
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    j = j2;
                }
            } else {
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j2 < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i4 = segment.limit;
                    while (i < i4) {
                        byte b4 = bArr2[i];
                        for (byte b5 : internalArray$okio) {
                            if (b4 == b5) {
                                i2 = segment.pos;
                            }
                        }
                        i++;
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    j = j2;
                }
            }
            return -1L;
        }
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j2 = j3;
        }
        if (segment == null) {
            return -1L;
        }
        if (byteString.size() == 2) {
            byte b6 = byteString.getByte(0);
            byte b7 = byteString.getByte(1);
            while (j2 < buffer.size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i5 = segment.limit;
                while (i < i5) {
                    byte b8 = bArr3[i];
                    if (b8 != b6 && b8 != b7) {
                        i++;
                    }
                    i2 = segment.pos;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j = j2;
            }
        } else {
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j2 < buffer.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i6 = segment.limit;
                while (i < i6) {
                    byte b9 = bArr4[i];
                    for (byte b10 : internalArray$okio2) {
                        if (b9 == b10) {
                            i2 = segment.pos;
                        }
                    }
                    i++;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j = j2;
            }
        }
        return -1L;
        return (i - i2) + j2;
    }

    public static final /* synthetic */ int access$countDigitsIn(long j) {
        int numberOfLeadingZeros = ((64 - java.lang.Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        return numberOfLeadingZeros + (j > getHighResolutionOutputSizeshNQ4ISI[numberOfLeadingZeros] ? 1 : 0);
    }
}
