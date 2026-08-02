package okhttp3.internal.publicsuffix;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00118\u0017@\u0017X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0017@\u0017X\u0097.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "()V", "Lokio/Source;", "listSource", "()Lokio/Source;", "", "ensureLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/CountDownLatch;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/CountDownLatch;", "getHighSpeedVideoSizes", "Lokio/ByteString;", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "Lokio/ByteString;", "getBytes", "()Lokio/ByteString;", "setBytes", "(Lokio/ByteString;)V", "exceptionBytes", "getExceptionBytes", "setExceptionBytes", "Ljava/io/IOException;", "Ljava/io/IOException;", "getHighResolutionOutputSizeshNQ4ISI", "", "getPath", "()Ljava/lang/Object;", "path"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BasePublicSuffixList implements okhttp3.internal.publicsuffix.PublicSuffixList {
    public okio.ByteString bytes;
    public okio.ByteString exceptionBytes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.io.IOException getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.CountDownLatch getHighSpeedVideoSizes = new java.util.concurrent.CountDownLatch(1);

    public abstract java.lang.Object getPath();

    public abstract okio.Source listSource();

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public okio.ByteString getBytes() {
        okio.ByteString byteString = this.bytes;
        if (byteString != null) {
            return byteString;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public void setBytes(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        this.bytes = byteString;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public okio.ByteString getExceptionBytes() {
        okio.ByteString byteString = this.exceptionBytes;
        if (byteString != null) {
            return byteString;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public void setExceptionBytes(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        this.exceptionBytes = byteString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r1 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r1 != false) goto L33;
     */
    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ensureLoaded() {
        okio.BufferedSource buffer;
        if (!this.Camera2StreamConfigurationMap.get()) {
            boolean z = false;
            if (this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
                while (true) {
                    try {
                        try {
                            try {
                                try {
                                    buffer = okio.Okio.buffer(listSource());
                                    break;
                                } catch (java.lang.Throwable th) {
                                    if (z) {
                                        java.lang.Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (java.io.IOException e) {
                                this.getHighResolutionOutputSizeshNQ4ISI = e;
                            }
                        } finally {
                            this.getHighSpeedVideoSizes.countDown();
                        }
                    } catch (java.io.InterruptedIOException unused) {
                        java.lang.Thread.interrupted();
                        z = true;
                    }
                }
                try {
                    okio.BufferedSource bufferedSource = buffer;
                    okio.ByteString readByteString = bufferedSource.readByteString(bufferedSource.readInt());
                    okio.ByteString readByteString2 = bufferedSource.readByteString(bufferedSource.readInt());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(buffer, null);
                    synchronized (this) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(readByteString);
                        setBytes(readByteString);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(readByteString2);
                        setExceptionBytes(readByteString2);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                } finally {
                }
            }
        }
        try {
            this.getHighSpeedVideoSizes.await();
        } catch (java.lang.InterruptedException unused2) {
            java.lang.Thread.currentThread().interrupt();
        }
        if (this.bytes != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to load ");
        sb.append(getPath());
        sb.append(" resource.");
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(sb.toString());
        illegalStateException.initCause(this.getHighResolutionOutputSizeshNQ4ISI);
        throw illegalStateException;
    }
}
