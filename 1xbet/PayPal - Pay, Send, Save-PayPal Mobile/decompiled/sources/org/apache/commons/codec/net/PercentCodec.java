package org.apache.commons.codec.net;

/* loaded from: classes17.dex */
public class PercentCodec implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder {
    private int Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private final java.util.BitSet getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public PercentCodec() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.BitSet();
        this.getHighSpeedVideoFpsRanges = Integer.MAX_VALUE;
        this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
        this.getHighSpeedVideoSizes = false;
        getHighSpeedVideoFpsRangesFor((byte) 37);
    }

    public PercentCodec(byte[] bArr, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.BitSet();
        this.getHighSpeedVideoFpsRanges = Integer.MAX_VALUE;
        this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
        this.getHighSpeedVideoSizes = z;
        if (bArr != null) {
            for (byte b : bArr) {
                getHighSpeedVideoFpsRangesFor(b);
            }
        }
        getHighSpeedVideoFpsRangesFor((byte) 37);
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws org.apache.commons.codec.DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be Percent decoded");
        throw new org.apache.commons.codec.DecoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be Percent encoded");
        throw new org.apache.commons.codec.EncoderException(sb.toString());
    }

    private void getHighSpeedVideoFpsRangesFor(byte b) {
        if (b < 0) {
            throw new java.lang.IllegalArgumentException("byte must be >= 0");
        }
        this.getHighSpeedVideoFpsRangesFor.set(b);
        if (b < this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges = b;
        }
        if (b > this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = b;
        }
    }

    private boolean Camera2StreamConfigurationMap(byte b) {
        if (b >= 0) {
            return b >= this.getHighSpeedVideoFpsRanges && b <= this.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor.get(b);
        }
        return true;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws org.apache.commons.codec.DecoderException {
        if (bArr == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= bArr.length) {
                break;
            }
            if (bArr[i2] == 37) {
                i4 = 3;
            }
            i2 += i4;
            i3++;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i3);
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                try {
                    i += 2;
                    allocate.put((byte) ((org.apache.commons.codec.net.Utils.getHighSpeedVideoFpsRanges(bArr[i + 1]) << 4) + org.apache.commons.codec.net.Utils.getHighSpeedVideoFpsRanges(bArr[i])));
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    throw new org.apache.commons.codec.DecoderException("Invalid percent decoding: ", e);
                }
            } else if (this.getHighSpeedVideoSizes && b == 43) {
                allocate.put((byte) 32);
            } else {
                allocate.put(b);
            }
            i++;
        }
        return allocate.array();
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) throws org.apache.commons.codec.EncoderException {
        int i;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (Camera2StreamConfigurationMap(bArr[i2])) {
                i = 3;
            }
            i3 += i;
            i2++;
        }
        i = i3 == bArr.length ? 0 : 1;
        if (i == 0) {
            if (this.getHighSpeedVideoSizes) {
                for (byte b : bArr) {
                    if (b != 32) {
                    }
                }
            }
            return bArr;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i3);
        for (byte b2 : bArr) {
            if (i != 0 && Camera2StreamConfigurationMap(b2)) {
                if (b2 < 0) {
                    b2 = (byte) (b2 + 256);
                }
                char highResolutionOutputSizeshNQ4ISI = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(b2 >> 4);
                char highResolutionOutputSizeshNQ4ISI2 = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(b2);
                allocate.put((byte) 37);
                allocate.put((byte) highResolutionOutputSizeshNQ4ISI);
                allocate.put((byte) highResolutionOutputSizeshNQ4ISI2);
            } else if (this.getHighSpeedVideoSizes && b2 == 32) {
                allocate.put((byte) 43);
            } else {
                allocate.put(b2);
            }
        }
        return allocate.array();
    }
}
