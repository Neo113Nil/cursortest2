package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SkeinEngine implements org.bouncycastle.util.Memoable {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    private static final java.util.Hashtable getHighSpeedVideoSizes;
    final org.bouncycastle.crypto.engines.ThreefishEngine Camera2StreamConfigurationMap;
    long[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private long[] getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizesFor;
    private org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] getInputFormats;
    private org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final org.bouncycastle.crypto.digests.SkeinEngine.UBI getOutputMinFrameDuration;

    class UBI {
        final org.bouncycastle.crypto.digests.SkeinEngine.UbiTweak Camera2StreamConfigurationMap = new org.bouncycastle.crypto.digests.SkeinEngine.UbiTweak();
        int getHighResolutionOutputSizeshNQ4ISI;
        private long[] getHighSpeedVideoFpsRanges;
        private byte[] getHighSpeedVideoFpsRangesFor;

        private void getHighSpeedVideoFpsRangesFor(long[] jArr) {
            org.bouncycastle.crypto.digests.SkeinEngine.this.Camera2StreamConfigurationMap.init(true, org.bouncycastle.crypto.digests.SkeinEngine.this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap);
            int i = 0;
            while (true) {
                long[] jArr2 = this.getHighSpeedVideoFpsRanges;
                if (i >= jArr2.length) {
                    break;
                }
                jArr2[i] = org.bouncycastle.crypto.engines.ThreefishEngine.bytesToWord(this.getHighSpeedVideoFpsRangesFor, i * 8);
                i++;
            }
            org.bouncycastle.crypto.digests.SkeinEngine.this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoFpsRanges, jArr);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = jArr[i2] ^ this.getHighSpeedVideoFpsRanges[i2];
            }
        }

        public final void getHighSpeedVideoSizes(long[] jArr) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
                if (i >= bArr.length) {
                    long[] jArr2 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                    jArr2[1] = jArr2[1] | Long.MIN_VALUE;
                    getHighSpeedVideoFpsRangesFor(jArr);
                    return;
                }
                bArr[i] = 0;
                i++;
            }
        }

        public final void Camera2StreamConfigurationMap(org.bouncycastle.crypto.digests.SkeinEngine.UBI ubi) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(ubi.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
            this.getHighResolutionOutputSizeshNQ4ISI = ubi.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(ubi.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges);
            org.bouncycastle.crypto.digests.SkeinEngine.UbiTweak ubiTweak = this.Camera2StreamConfigurationMap;
            org.bouncycastle.crypto.digests.SkeinEngine.UbiTweak ubiTweak2 = ubi.Camera2StreamConfigurationMap;
            ubiTweak.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(ubiTweak2.Camera2StreamConfigurationMap, ubiTweak.Camera2StreamConfigurationMap);
            ubiTweak.getHighSpeedVideoSizes = ubiTweak2.getHighSpeedVideoSizes;
        }

        public final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, long[] jArr) {
            int i3 = 0;
            while (i2 > i3) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoFpsRangesFor.length) {
                    getHighSpeedVideoFpsRangesFor(jArr);
                    this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(false);
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                }
                int min = java.lang.Math.min(i2 - i3, this.getHighSpeedVideoFpsRangesFor.length - this.getHighResolutionOutputSizeshNQ4ISI);
                java.lang.System.arraycopy(bArr, i + i3, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, min);
                i3 += min;
                this.getHighResolutionOutputSizeshNQ4ISI += min;
                this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(min);
            }
        }

        public UBI(int i) {
            this.getHighSpeedVideoFpsRangesFor = new byte[i];
            this.getHighSpeedVideoFpsRanges = new long[i / 8];
        }
    }

    static class UbiTweak {
        long[] Camera2StreamConfigurationMap = {0, 0};
        boolean getHighSpeedVideoSizes = false;

        public UbiTweak() {
            Camera2StreamConfigurationMap(true);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((int) ((this.Camera2StreamConfigurationMap[1] >>> 56) & 63));
            sb.append(" first: ");
            sb.append((this.Camera2StreamConfigurationMap[1] & 4611686018427387904L) != 0);
            sb.append(", final: ");
            sb.append((this.Camera2StreamConfigurationMap[1] & Long.MIN_VALUE) != 0);
            return sb.toString();
        }

        public final void Camera2StreamConfigurationMap(boolean z) {
            if (z) {
                long[] jArr = this.Camera2StreamConfigurationMap;
                jArr[1] = jArr[1] | 4611686018427387904L;
            } else {
                long[] jArr2 = this.Camera2StreamConfigurationMap;
                jArr2[1] = jArr2[1] & (-4611686018427387905L);
            }
        }

        public final void getHighSpeedVideoFpsRangesFor(int i) {
            if (!this.getHighSpeedVideoSizes) {
                long[] jArr = this.Camera2StreamConfigurationMap;
                long j = jArr[0] + i;
                jArr[0] = j;
                if (j > 9223372034707292160L) {
                    this.getHighSpeedVideoSizes = true;
                    return;
                }
                return;
            }
            long[] jArr2 = this.Camera2StreamConfigurationMap;
            long j2 = jArr2[0];
            long j3 = jArr2[1] & 4294967295L;
            long[] jArr3 = new long[3];
            jArr3[0] = j2 & 4294967295L;
            jArr3[1] = (j2 >>> 32) & 4294967295L;
            jArr3[2] = j3;
            long j4 = i;
            for (int i2 = 0; i2 < 3; i2++) {
                long j5 = j4 + jArr3[i2];
                jArr3[i2] = j5;
                j4 = j5 >>> 32;
            }
            long[] jArr4 = this.Camera2StreamConfigurationMap;
            jArr4[0] = ((jArr3[1] & 4294967295L) << 32) | (jArr3[0] & 4294967295L);
            jArr4[1] = (jArr3[2] & 4294967295L) | ((-4294967296L) & jArr4[1]);
        }
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoSizes = hashtable;
        int i = 256 / 8;
        int i2 = 128 / 8;
        hashtable.put(org.bouncycastle.util.Integers.valueOf(1048608), new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        int i3 = 160 / 8;
        hashtable.put(org.bouncycastle.util.Integers.valueOf(1310752), new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        int i4 = 224 / 8;
        hashtable.put(org.bouncycastle.util.Integers.valueOf(1835040), new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        hashtable.put(org.bouncycastle.util.Integers.valueOf(2097184), new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        int i5 = 512 / 8;
        hashtable.put(org.bouncycastle.util.Integers.valueOf(1048640), new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        hashtable.put(org.bouncycastle.util.Integers.valueOf(1310784), new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        hashtable.put(org.bouncycastle.util.Integers.valueOf(1835072), new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        int i6 = 384 / 8;
        hashtable.put(org.bouncycastle.util.Integers.valueOf(3145792), new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        hashtable.put(org.bouncycastle.util.Integers.valueOf(4194368), new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    private void getHighSpeedVideoFpsRangesFor(int i, byte[] bArr) {
        org.bouncycastle.crypto.digests.SkeinEngine.UBI ubi = this.getOutputMinFrameDuration;
        org.bouncycastle.crypto.digests.SkeinEngine.UbiTweak ubiTweak = ubi.Camera2StreamConfigurationMap;
        long[] jArr = ubiTweak.Camera2StreamConfigurationMap;
        jArr[0] = 0;
        jArr[1] = 0;
        ubiTweak.getHighSpeedVideoSizes = false;
        ubiTweak.Camera2StreamConfigurationMap(true);
        long[] jArr2 = ubi.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        jArr2[1] = (jArr2[1] & (-274877906944L)) | ((i & 63) << 56);
        ubi.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(bArr, 0, bArr.length, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getOutputMinFrameDuration.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private void Camera2StreamConfigurationMap(int i) {
        org.bouncycastle.crypto.digests.SkeinEngine.UBI ubi = this.getOutputMinFrameDuration;
        org.bouncycastle.crypto.digests.SkeinEngine.UbiTweak ubiTweak = ubi.Camera2StreamConfigurationMap;
        long[] jArr = ubiTweak.Camera2StreamConfigurationMap;
        jArr[0] = 0;
        jArr[1] = 0;
        ubiTweak.getHighSpeedVideoSizes = false;
        ubiTweak.Camera2StreamConfigurationMap(true);
        long[] jArr2 = ubi.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
        jArr2[1] = (jArr2[1] & (-274877906944L)) | ((i & 63) << 56);
        ubi.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public int doFinal(byte[] bArr, int i) {
        int i2;
        org.bouncycastle.crypto.digests.SkeinEngine.UBI ubi = this.getOutputMinFrameDuration;
        if (ubi == null) {
            throw new java.lang.IllegalArgumentException("Skein engine is not initialised.");
        }
        if (bArr.length < this.getHighSpeedVideoSizesFor + i) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer is too short to hold output");
        }
        ubi.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.getInputSizeshNQ4ISI != null) {
            int i3 = 0;
            while (true) {
                org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] parameterArr = this.getInputSizeshNQ4ISI;
                if (i3 >= parameterArr.length) {
                    break;
                }
                org.bouncycastle.crypto.digests.SkeinEngine.Parameter parameter = parameterArr[i3];
                getHighSpeedVideoFpsRangesFor(parameter.getType(), parameter.getValue());
                i3++;
            }
        }
        int blockSize = getBlockSize();
        int i4 = ((this.getHighSpeedVideoSizesFor + blockSize) - 1) / blockSize;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 * blockSize;
            int min = java.lang.Math.min(blockSize, this.getHighSpeedVideoSizesFor - i6);
            int i7 = i + i6;
            int i8 = 8;
            byte[] bArr2 = new byte[8];
            org.bouncycastle.crypto.engines.ThreefishEngine.wordToBytes(i5, bArr2, 0);
            long[] jArr = new long[this.getHighResolutionOutputSizeshNQ4ISI.length];
            Camera2StreamConfigurationMap(63);
            this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(bArr2, 0, 8, jArr);
            this.getOutputMinFrameDuration.getHighSpeedVideoSizes(jArr);
            int i9 = (min + 7) / 8;
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10 * 8;
                int min2 = java.lang.Math.min(i8, min - i11);
                if (min2 == i8) {
                    org.bouncycastle.crypto.engines.ThreefishEngine.wordToBytes(jArr[i10], bArr, i11 + i7);
                    i2 = i9;
                } else {
                    i2 = i9;
                    org.bouncycastle.crypto.engines.ThreefishEngine.wordToBytes(jArr[i10], bArr2, 0);
                    java.lang.System.arraycopy(bArr2, 0, bArr, i11 + i7, min2);
                }
                i10++;
                i9 = i2;
                i8 = 8;
            }
        }
        reset();
        return this.getHighSpeedVideoSizesFor;
    }

    public void init(org.bouncycastle.crypto.params.SkeinParameters skeinParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputFormats = null;
        this.getInputSizeshNQ4ISI = null;
        if (skeinParameters != null) {
            if (skeinParameters.getKey().length < 16) {
                throw new java.lang.IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            java.util.Hashtable parameters = skeinParameters.getParameters();
            java.util.Enumeration keys = parameters.keys();
            java.util.Vector vector = new java.util.Vector();
            java.util.Vector vector2 = new java.util.Vector();
            while (keys.hasMoreElements()) {
                java.lang.Integer num = (java.lang.Integer) keys.nextElement();
                byte[] bArr = (byte[]) parameters.get(num);
                if (num.intValue() == 0) {
                    this.getHighSpeedVideoFpsRanges = bArr;
                } else if (num.intValue() < 48) {
                    vector.addElement(new org.bouncycastle.crypto.digests.SkeinEngine.Parameter(num.intValue(), bArr));
                } else {
                    vector2.addElement(new org.bouncycastle.crypto.digests.SkeinEngine.Parameter(num.intValue(), bArr));
                }
            }
            org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] parameterArr = new org.bouncycastle.crypto.digests.SkeinEngine.Parameter[vector.size()];
            this.getInputFormats = parameterArr;
            vector.copyInto(parameterArr);
            getHighSpeedVideoFpsRangesFor(this.getInputFormats);
            org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] parameterArr2 = new org.bouncycastle.crypto.digests.SkeinEngine.Parameter[vector2.size()];
            this.getInputSizeshNQ4ISI = parameterArr2;
            vector2.copyInto(parameterArr2);
            getHighSpeedVideoFpsRangesFor(this.getInputSizeshNQ4ISI);
        }
        long[] jArr = (long[]) getHighSpeedVideoSizes.get(org.bouncycastle.util.Integers.valueOf((getOutputSize() << 16) | getBlockSize()));
        int i = 0;
        if (this.getHighSpeedVideoFpsRanges != null || jArr == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new long[getBlockSize() / 8];
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
            if (bArr2 != null) {
                getHighSpeedVideoFpsRangesFor(0, bArr2);
            }
            getHighSpeedVideoFpsRangesFor(4, new org.bouncycastle.crypto.digests.SkeinEngine.Configuration(this.getHighSpeedVideoSizesFor * 8).getHighSpeedVideoSizes);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(jArr);
        }
        if (this.getInputFormats != null) {
            while (true) {
                org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] parameterArr3 = this.getInputFormats;
                if (i >= parameterArr3.length) {
                    break;
                }
                org.bouncycastle.crypto.digests.SkeinEngine.Parameter parameter = parameterArr3[i];
                getHighSpeedVideoFpsRangesFor(parameter.getType(), parameter.getValue());
                i++;
            }
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
        Camera2StreamConfigurationMap(48);
    }

    public void update(byte[] bArr, int i, int i2) {
        org.bouncycastle.crypto.digests.SkeinEngine.UBI ubi = this.getOutputMinFrameDuration;
        if (ubi == null) {
            throw new java.lang.IllegalArgumentException("Skein engine is not initialised.");
        }
        ubi.Camera2StreamConfigurationMap(bArr, i, i2, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public void update(byte b) {
        byte[] bArr = this.getOutputFormats;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.digests.SkeinEngine skeinEngine = (org.bouncycastle.crypto.digests.SkeinEngine) memoable;
        if (getBlockSize() != skeinEngine.getBlockSize() || this.getHighSpeedVideoSizesFor != skeinEngine.getHighSpeedVideoSizesFor) {
            throw new java.lang.IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
        }
        getHighSpeedVideoSizes(skeinEngine);
    }

    public void reset() {
        long[] jArr = this.getHighSpeedVideoFpsRangesFor;
        long[] jArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        Camera2StreamConfigurationMap(48);
    }

    public int getOutputSize() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int getBlockSize() {
        return this.Camera2StreamConfigurationMap.getBlockSize();
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SkeinEngine(this);
    }

    private static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] parameterArr) {
        if (parameterArr != null) {
            for (int i = 1; i < parameterArr.length; i++) {
                org.bouncycastle.crypto.digests.SkeinEngine.Parameter parameter = parameterArr[i];
                int i2 = i;
                while (i2 > 0) {
                    int i3 = i2 - 1;
                    if (parameter.getType() < parameterArr[i3].getType()) {
                        parameterArr[i2] = parameterArr[i3];
                        i2 = i3;
                    }
                }
                parameterArr[i2] = parameter;
            }
        }
    }

    public static class Parameter {
        private int Camera2StreamConfigurationMap;
        private byte[] getHighSpeedVideoFpsRangesFor;

        public byte[] getValue() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public int getType() {
            return this.Camera2StreamConfigurationMap;
        }

        public Parameter(int i, byte[] bArr) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = bArr;
        }
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.crypto.digests.SkeinEngine skeinEngine) {
        this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(skeinEngine.getOutputMinFrameDuration);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(skeinEngine.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(skeinEngine.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(skeinEngine.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges);
        this.getInputFormats = getHighSpeedVideoFpsRanges(skeinEngine.getInputFormats, this.getInputFormats);
        this.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(skeinEngine.getInputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
    }

    private static org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] parameterArr, org.bouncycastle.crypto.digests.SkeinEngine.Parameter[] parameterArr2) {
        if (parameterArr == null) {
            return null;
        }
        if (parameterArr2 == null || parameterArr2.length != parameterArr.length) {
            parameterArr2 = new org.bouncycastle.crypto.digests.SkeinEngine.Parameter[parameterArr.length];
        }
        java.lang.System.arraycopy(parameterArr, 0, parameterArr2, 0, parameterArr2.length);
        return parameterArr2;
    }

    static class Configuration {
        byte[] getHighSpeedVideoSizes;

        public Configuration(long j) {
            byte[] bArr = new byte[32];
            this.getHighSpeedVideoSizes = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = 65;
            bArr[3] = org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE;
            bArr[4] = 1;
            bArr[5] = 0;
            org.bouncycastle.crypto.engines.ThreefishEngine.wordToBytes(j, bArr, 8);
        }
    }

    public SkeinEngine(org.bouncycastle.crypto.digests.SkeinEngine skeinEngine) {
        this(skeinEngine.getBlockSize() * 8, skeinEngine.getOutputSize() * 8);
        getHighSpeedVideoSizes(skeinEngine);
    }

    public SkeinEngine(int i, int i2) {
        this.getOutputFormats = new byte[1];
        if (i2 % 8 != 0) {
            throw new java.lang.IllegalArgumentException("Output size must be a multiple of 8 bits. :".concat(java.lang.String.valueOf(i2)));
        }
        this.getHighSpeedVideoSizesFor = i2 / 8;
        org.bouncycastle.crypto.engines.ThreefishEngine threefishEngine = new org.bouncycastle.crypto.engines.ThreefishEngine(i);
        this.Camera2StreamConfigurationMap = threefishEngine;
        this.getOutputMinFrameDuration = new org.bouncycastle.crypto.digests.SkeinEngine.UBI(threefishEngine.getBlockSize());
    }
}
