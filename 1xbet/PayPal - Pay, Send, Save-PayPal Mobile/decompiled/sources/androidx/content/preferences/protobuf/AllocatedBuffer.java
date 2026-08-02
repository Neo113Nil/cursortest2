package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes7.dex */
abstract class AllocatedBuffer {
    public abstract boolean Camera2StreamConfigurationMap();

    public abstract byte[] getHighResolutionOutputSizeshNQ4ISI();

    public abstract int getHighSpeedVideoFpsRanges();

    public abstract boolean getHighSpeedVideoFpsRangesFor();

    public abstract int getHighSpeedVideoSizes();

    public abstract androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoSizes(int i);

    public abstract int getOutputFormats();

    public abstract java.nio.ByteBuffer getOutputMinFrameDuration();

    AllocatedBuffer() {
    }

    public static androidx.content.preferences.protobuf.AllocatedBuffer getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        return new androidx.content.preferences.protobuf.AllocatedBuffer.AnonymousClass2(bArr, 0, bArr.length);
    }

    public static androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoSizes(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("bytes.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        return new androidx.content.preferences.protobuf.AllocatedBuffer.AnonymousClass2(bArr, i, i2);
    }

    public static androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoFpsRanges(final java.nio.ByteBuffer byteBuffer) {
        androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(byteBuffer, "buffer");
        return new androidx.content.preferences.protobuf.AllocatedBuffer() { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.1
            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final boolean Camera2StreamConfigurationMap() {
                return true;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final java.nio.ByteBuffer getOutputMinFrameDuration() {
                return byteBuffer;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final boolean getHighSpeedVideoFpsRangesFor() {
                return byteBuffer.hasArray();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final byte[] getHighResolutionOutputSizeshNQ4ISI() {
                return byteBuffer.array();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final int getHighSpeedVideoSizes() {
                return byteBuffer.arrayOffset();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final int getOutputFormats() {
                return byteBuffer.position();
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoSizes(int i) {
                androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(byteBuffer, i);
                return this;
            }

            @Override // androidx.content.preferences.protobuf.AllocatedBuffer
            public final int getHighSpeedVideoFpsRanges() {
                return byteBuffer.limit();
            }
        };
    }

    /* renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$2, reason: invalid class name */
    class AnonymousClass2 extends androidx.content.preferences.protobuf.AllocatedBuffer {
        final /* synthetic */ byte[] Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final boolean Camera2StreamConfigurationMap() {
            return false;
        }

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final boolean getHighSpeedVideoFpsRangesFor() {
            return true;
        }

        AnonymousClass2(byte[] bArr, int i, int i2) {
            this.Camera2StreamConfigurationMap = bArr;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
        }

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final java.nio.ByteBuffer getOutputMinFrameDuration() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final byte[] getHighResolutionOutputSizeshNQ4ISI() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final int getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final int getOutputFormats() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final androidx.content.preferences.protobuf.AllocatedBuffer getHighSpeedVideoSizes(int i) {
            if (i < 0 || i > this.getHighSpeedVideoFpsRangesFor) {
                throw new java.lang.IllegalArgumentException("Invalid position: ".concat(java.lang.String.valueOf(i)));
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.AllocatedBuffer
        public final int getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }
}
