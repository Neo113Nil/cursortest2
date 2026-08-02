package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public final class UploadDataProviders {

    interface FileChannelProvider {
        java.nio.channels.FileChannel getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException;
    }

    public static org.chromium.net.UploadDataProvider create(final java.io.File file) {
        return new org.chromium.net.apihelpers.UploadDataProviders.FileUploadProvider(new org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.1
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public final java.nio.channels.FileChannel getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
                return new java.io.FileInputStream(file).getChannel();
            }
        }, (byte) 0);
    }

    public static org.chromium.net.UploadDataProvider create(final android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return new org.chromium.net.apihelpers.UploadDataProviders.FileUploadProvider(new org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.2
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public final java.nio.channels.FileChannel getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new java.lang.IllegalArgumentException("Not a file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(parcelFileDescriptor))));
            }
        }, (byte) 0);
    }

    public static org.chromium.net.UploadDataProvider create(java.nio.ByteBuffer byteBuffer) {
        return new org.chromium.net.apihelpers.UploadDataProviders.ByteBufferUploadProvider(byteBuffer.slice(), (byte) 0);
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new org.chromium.net.apihelpers.UploadDataProviders.ByteBufferUploadProvider(java.nio.ByteBuffer.wrap(bArr, i, i2).slice(), (byte) 0);
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    static final class FileUploadProvider extends org.chromium.net.UploadDataProvider {
        private final org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider getHighResolutionOutputSizeshNQ4ISI;
        private volatile java.nio.channels.FileChannel getHighSpeedVideoFpsRanges;
        private final java.lang.Object getHighSpeedVideoSizes;

        private FileUploadProvider(org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider fileChannelProvider) {
            this.getHighSpeedVideoSizes = new java.lang.Object();
            this.getHighResolutionOutputSizeshNQ4ISI = fileChannelProvider;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() throws java.io.IOException {
            return getHighSpeedVideoFpsRanges().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            java.nio.channels.FileChannel highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            int i = 0;
            while (i == 0) {
                int read = highSpeedVideoFpsRanges.read(byteBuffer);
                if (read == -1) {
                    break;
                } else {
                    i += read;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(org.chromium.net.UploadDataSink uploadDataSink) throws java.io.IOException {
            getHighSpeedVideoFpsRanges().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private java.nio.channels.FileChannel getHighSpeedVideoFpsRanges() throws java.io.IOException {
            if (this.getHighSpeedVideoFpsRanges == null) {
                synchronized (this.getHighSpeedVideoSizes) {
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
            }
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            java.nio.channels.FileChannel fileChannel = this.getHighSpeedVideoFpsRanges;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        /* synthetic */ FileUploadProvider(org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider fileChannelProvider, byte b) {
            this(fileChannelProvider);
        }
    }

    static final class ByteBufferUploadProvider extends org.chromium.net.UploadDataProvider {
        private final java.nio.ByteBuffer getHighSpeedVideoSizes;

        private ByteBufferUploadProvider(java.nio.ByteBuffer byteBuffer) {
            this.getHighSpeedVideoSizes = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return this.getHighSpeedVideoSizes.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.getHighSpeedVideoSizes.remaining()) {
                byteBuffer.put(this.getHighSpeedVideoSizes);
            } else {
                int limit = this.getHighSpeedVideoSizes.limit();
                java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoSizes;
                byteBuffer.put(this.getHighSpeedVideoSizes);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindSucceeded();
        }

        /* synthetic */ ByteBufferUploadProvider(java.nio.ByteBuffer byteBuffer, byte b) {
            this(byteBuffer);
        }
    }

    private UploadDataProviders() {
    }
}
