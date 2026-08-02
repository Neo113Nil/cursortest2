package okio;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a<\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00060\u0006j\u0002`\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f*\n\u0010\u0011\"\u00020\u00062\u00020\u0006*\n\u0010\u0013\"\u00020\u00122\u00020\u0012*\n\u0010\u0015\"\u00020\u00142\u00020\u0014*\n\u0010\u0017\"\u00020\u00162\u00020\u0016*\n\u0010\u0019\"\u00020\u00182\u00020\u0018*\n\u0010\u001b\"\u00020\u001a2\u00020\u001a*\n\u0010\u001d\"\u00020\u001c2\u00020\u001c*\n\u0010\u001f\"\u00020\u001e2\u00020\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "", "toUtf8String", "([B)Ljava/lang/String;", "asUtf8ToByteArray", "(Ljava/lang/String;)[B", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/getHighResolutionOutputSizeshNQ4ISI;", "newLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "T", "Lkotlin/Function0;", "action", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/IOException;", "getHighSpeedVideoSizes", "Ljava/net/ProtocolException;", "getHighSpeedVideoFpsRanges", "Ljava/io/EOFException;", "Camera2StreamConfigurationMap", "Ljava/io/FileNotFoundException;", "getInputFormats", "Ljava/io/Closeable;", "getOutputFormats", "Ljava/util/zip/Deflater;", "getInputSizeshNQ4ISI", "Ljava/util/zip/Inflater;", "getHighSpeedVideoSizesFor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _JvmPlatformKt {
    public static final java.lang.String toUtf8String(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }

    public static final byte[] asUtf8ToByteArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    public static final java.util.concurrent.locks.ReentrantLock newLock() {
        return new java.util.concurrent.locks.ReentrantLock();
    }

    public static final <T> T withLock(java.util.concurrent.locks.ReentrantLock reentrantLock, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reentrantLock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            return function0.invoke();
        } finally {
            reentrantLock2.unlock();
        }
    }
}
