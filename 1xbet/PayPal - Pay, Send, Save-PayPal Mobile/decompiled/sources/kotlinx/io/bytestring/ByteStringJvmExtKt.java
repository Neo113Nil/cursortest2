package kotlinx.io.bytestring;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\r\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0013\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0015\u001a#\u0010\u0018\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlinx/io/bytestring/ByteString;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "decodeToString", "(Lkotlinx/io/bytestring/ByteString;Ljava/nio/charset/Charset;)Ljava/lang/String;", "encodeToByteString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lkotlinx/io/bytestring/ByteString;", "Ljava/nio/ByteBuffer;", "asReadOnlyByteBuffer", "(Lkotlinx/io/bytestring/ByteString;)Ljava/nio/ByteBuffer;", "", "length", "getByteString", "(Ljava/nio/ByteBuffer;I)Lkotlinx/io/bytestring/ByteString;", "at", "(Ljava/nio/ByteBuffer;II)Lkotlinx/io/bytestring/ByteString;", "string", "", "putByteString", "(Ljava/nio/ByteBuffer;Lkotlinx/io/bytestring/ByteString;)V", "(Ljava/nio/ByteBuffer;ILkotlinx/io/bytestring/ByteString;)V", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/nio/ByteBuffer;II)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteStringJvmExtKt {
    public static final java.lang.String decodeToString(kotlinx.io.bytestring.ByteString byteString, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        return new java.lang.String(byteString.getGetHighSpeedVideoFpsRanges(), charset);
    }

    public static final kotlinx.io.bytestring.ByteString encodeToByteString(java.lang.String str, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        kotlinx.io.bytestring.ByteString.Companion companion = kotlinx.io.bytestring.ByteString.INSTANCE;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return companion.wrap$kotlinx_io_bytestring(bytes);
    }

    public static final java.nio.ByteBuffer asReadOnlyByteBuffer(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations unsafeByteStringOperations = kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE;
        java.nio.ByteBuffer asReadOnlyBuffer = java.nio.ByteBuffer.wrap(byteString.getGetHighSpeedVideoFpsRanges()).asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "");
        return asReadOnlyBuffer;
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString getByteString$default(java.nio.ByteBuffer byteBuffer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = byteBuffer.remaining();
        }
        return getByteString(byteBuffer, i);
    }

    public static final kotlinx.io.bytestring.ByteString getByteString(java.nio.ByteBuffer byteBuffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("length should be non-negative (was ");
            sb.append(i);
            sb.append(')');
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (byteBuffer.remaining() < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("length (");
            sb2.append(i);
            sb2.append(") exceeds remaining bytes count ({");
            sb2.append(byteBuffer.remaining());
            sb2.append("})");
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE.wrapUnsafe(bArr);
    }

    public static final kotlinx.io.bytestring.ByteString getByteString(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        getHighSpeedVideoFpsRangesFor(byteBuffer, i, i2);
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = byteBuffer.get(i + i3);
        }
        return kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE.wrapUnsafe(bArr);
    }

    public static final void putByteString(java.nio.ByteBuffer byteBuffer, kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations unsafeByteStringOperations = kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE;
        byteBuffer.put(byteString.getGetHighSpeedVideoFpsRanges());
    }

    public static final void putByteString(java.nio.ByteBuffer byteBuffer, int i, kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        getHighSpeedVideoFpsRangesFor(byteBuffer, i, byteString.getSize());
        kotlin.ranges.IntRange indices = kotlinx.io.bytestring.ByteStringKt.getIndices(byteString);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            byteBuffer.put(i + first, byteString.get(first));
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0 || i >= byteBuffer.limit()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(i);
            sb.append(" is out of this ByteBuffer's bounds: [0, ");
            sb.append(byteBuffer.limit());
            sb.append(')');
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("length should be non-negative (was ");
            sb2.append(i2);
            sb2.append(')');
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i + i2 <= byteBuffer.limit()) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("There's not enough space to put ByteString of length ");
        sb3.append(i2);
        sb3.append(" starting from index ");
        sb3.append(i);
        throw new java.lang.IndexOutOfBoundsException(sb3.toString());
    }
}
