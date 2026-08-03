package kotlinx.io.bytestring;

/* compiled from: ByteStringJvmExt.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u001a\u0010\b\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002\u001a\u001a\u0010\f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0011"}, d2 = {"decodeToString", "", "Lkotlinx/io/bytestring/ByteString;", "charset", "Ljava/nio/charset/Charset;", "encodeToByteString", "asReadOnlyByteBuffer", "Ljava/nio/ByteBuffer;", "getByteString", "length", "", "at", "putByteString", "", "string", "checkIndexAndCapacity", "idx", "kotlinx-io-bytestring"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteStringJvmExtKt {
    public static final java.lang.String decodeToString(kotlinx.io.bytestring.ByteString byteString, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(byteString.getData(), charset);
    }

    public static final kotlinx.io.bytestring.ByteString encodeToByteString(java.lang.String str, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        kotlinx.io.bytestring.ByteString.Companion companion = kotlinx.io.bytestring.ByteString.INSTANCE;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return companion.wrap$kotlinx_io_bytestring(bytes);
    }

    public static final java.nio.ByteBuffer asReadOnlyByteBuffer(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations unsafeByteStringOperations = kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE;
        java.nio.ByteBuffer asReadOnlyBuffer = java.nio.ByteBuffer.wrap(byteString.getData()).asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString getByteString$default(java.nio.ByteBuffer byteBuffer, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = byteBuffer.remaining();
        }
        return getByteString(byteBuffer, i);
    }

    public static final kotlinx.io.bytestring.ByteString getByteString(java.nio.ByteBuffer byteBuffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("length should be non-negative (was " + i + ')');
        }
        if (byteBuffer.remaining() < i) {
            throw new java.lang.IndexOutOfBoundsException("length (" + i + ") exceeds remaining bytes count ({" + byteBuffer.remaining() + "})");
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE.wrapUnsafe(bArr);
    }

    public static final kotlinx.io.bytestring.ByteString getByteString(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        checkIndexAndCapacity(byteBuffer, i, i2);
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = byteBuffer.get(i + i3);
        }
        return kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE.wrapUnsafe(bArr);
    }

    public static final void putByteString(java.nio.ByteBuffer byteBuffer, kotlinx.io.bytestring.ByteString string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations unsafeByteStringOperations = kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE;
        byteBuffer.put(string.getData());
    }

    public static final void putByteString(java.nio.ByteBuffer byteBuffer, int i, kotlinx.io.bytestring.ByteString string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        checkIndexAndCapacity(byteBuffer, i, string.getSize());
        kotlin.ranges.IntRange indices = kotlinx.io.bytestring.ByteStringKt.getIndices(string);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            byteBuffer.put(i + first, string.get(first));
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    private static final void checkIndexAndCapacity(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0 || i >= byteBuffer.limit()) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i + " is out of this ByteBuffer's bounds: [0, " + byteBuffer.limit() + ')');
        }
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException("length should be non-negative (was " + i2 + ')');
        }
        if (i + i2 <= byteBuffer.limit()) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("There's not enough space to put ByteString of length " + i2 + " starting from index " + i);
    }
}
