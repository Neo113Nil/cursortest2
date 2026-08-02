package org.chromium.net.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
final class InputStreamChannel implements ReadableByteChannel {
    private static final int MAX_TMP_BUFFER_SIZE = 16384;
    private static final int MIN_TMP_BUFFER_SIZE = 4096;
    private final InputStream mInputStream;
    private final AtomicBoolean mIsOpen = new AtomicBoolean(true);

    private InputStreamChannel(InputStream inputStream) {
        this.mInputStream = inputStream;
    }

    static ReadableByteChannel wrap(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new InputStreamChannel(inputStream);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer dst) throws IOException {
        if (dst.hasArray()) {
            int read = this.mInputStream.read(dst.array(), dst.arrayOffset() + dst.position(), dst.remaining());
            if (read <= 0) {
                return read;
            }
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.mInputStream.available(), 4096), dst.remaining()))];
        int read2 = this.mInputStream.read(bArr);
        if (read2 > 0) {
            dst.put(bArr, 0, read2);
        }
        return read2;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.mIsOpen.get();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.mIsOpen.compareAndSet(true, false)) {
            this.mInputStream.close();
        }
    }
}
