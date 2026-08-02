package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2nONBElement extends org.bouncycastle.pqc.math.linearalgebra.GF2nElement {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private long[] getOutputFormats;
    private static final long[] getHighSpeedVideoSizes = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES, 4096, 8192, okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE, 32768, 65536, 131072, 262144, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_ITEM_SIZE, com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_DISK_SPACE, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK, kotlinx.coroutines.internal.LockFreeTaskQueueCore.CLOSED_MASK, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] getHighSpeedVideoFpsRangesFor = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_RGB, 33554431, 67108863, 134217727, 268435455, 536870911, kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK, androidx.collection.SieveCacheKt.NodeLinkMask, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
    private static final int[] Camera2StreamConfigurationMap = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement) {
        this.mField = gF2nONBElement.mField;
        this.mDegree = this.mField.getDegree();
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) this.mField).getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) this.mField).getHighSpeedVideoSizes;
        this.getOutputFormats = new long[this.getHighSpeedVideoFpsRanges];
        long[] jArr = gF2nONBElement.getOutputFormats;
        long[] jArr2 = new long[jArr.length];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        java.lang.System.arraycopy(jArr2, 0, this.getOutputFormats, 0, this.getHighSpeedVideoFpsRanges);
    }

    public GF2nONBElement(org.bouncycastle.pqc.math.linearalgebra.GF2nONBField gF2nONBField, java.math.BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.getHighSpeedVideoFpsRanges = gF2nONBField.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = gF2nONBField.getHighSpeedVideoSizes;
        this.getOutputFormats = new long[this.getHighSpeedVideoFpsRanges];
        getHighSpeedVideoFpsRangesFor(bigInteger.toByteArray());
    }

    public GF2nONBElement(org.bouncycastle.pqc.math.linearalgebra.GF2nONBField gF2nONBField, java.security.SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.getHighSpeedVideoFpsRanges = gF2nONBField.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = gF2nONBField.getHighSpeedVideoSizes;
        int i = this.getHighSpeedVideoFpsRanges;
        long[] jArr = new long[i];
        this.getOutputFormats = jArr;
        if (i <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.getOutputFormats;
            jArr2[0] = jArr2[0] >>> (64 - this.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges - 1; i2++) {
                this.getOutputFormats[i2] = secureRandom.nextLong();
            }
            this.getOutputFormats[this.getHighSpeedVideoFpsRanges - 1] = secureRandom.nextLong() >>> (64 - this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public GF2nONBElement(org.bouncycastle.pqc.math.linearalgebra.GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.getHighSpeedVideoFpsRanges = gF2nONBField.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = gF2nONBField.getHighSpeedVideoSizes;
        this.getOutputFormats = new long[this.getHighSpeedVideoFpsRanges];
        getHighSpeedVideoFpsRangesFor(bArr);
    }

    private GF2nONBElement(org.bouncycastle.pqc.math.linearalgebra.GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = this.mField.getDegree();
        this.getHighSpeedVideoFpsRanges = gF2nONBField.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = gF2nONBField.getHighSpeedVideoSizes;
        this.getOutputFormats = jArr;
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement ONE(org.bouncycastle.pqc.math.linearalgebra.GF2nONBField gF2nONBField) {
        int i = gF2nONBField.getHighSpeedVideoFpsRangesFor;
        long[] jArr = new long[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i2 >= i3) {
                jArr[i3] = getHighSpeedVideoFpsRangesFor[gF2nONBField.getHighSpeedVideoSizes - 1];
                return new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i2] = -1;
            i2++;
        }
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement ZERO(org.bouncycastle.pqc.math.linearalgebra.GF2nONBField gF2nONBField) {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(gF2nONBField, new long[gF2nONBField.getHighSpeedVideoFpsRangesFor]);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        int i;
        boolean z;
        char c;
        boolean z2;
        char c2;
        int[][] iArr;
        if (!(gFElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement)) {
            throw new java.lang.RuntimeException("The elements have different representation: not yet implemented");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new java.lang.RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.getOutputFormats;
        long[] jArr2 = gF2nONBElement.getOutputFormats;
        long[] jArr3 = new long[this.getHighSpeedVideoFpsRanges];
        int[][] iArr2 = ((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) this.mField).getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = i2 - 1;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        long[] jArr4 = getHighSpeedVideoSizes;
        long j = jArr4[63];
        long j2 = jArr4[i4 - 1];
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.mDegree) {
            int i7 = i5;
            int i8 = i7;
            while (i7 < this.mDegree) {
                int[] iArr3 = Camera2StreamConfigurationMap;
                int i9 = iArr3[i7];
                int[] iArr4 = iArr2[i7];
                int i10 = iArr4[i5];
                int i11 = iArr3[i10];
                long j3 = jArr[i9];
                long[] jArr5 = getHighSpeedVideoSizes;
                if ((j3 & jArr5[i7 & 63]) != 0) {
                    if ((jArr2[i11] & jArr5[i10 & 63]) != 0) {
                        i8 ^= 1;
                    }
                    int i12 = iArr4[1];
                    iArr = iArr2;
                    if (i12 != -1 && (jArr2[iArr3[i12]] & jArr5[i12 & 63]) != 0) {
                        i8 ^= 1;
                    }
                } else {
                    iArr = iArr2;
                }
                i7++;
                iArr2 = iArr;
                i5 = 0;
            }
            int[][] iArr5 = iArr2;
            int i13 = Camera2StreamConfigurationMap[i6];
            if (i8 != 0) {
                jArr3[i13] = jArr3[i13] ^ getHighSpeedVideoSizes[i6 & 63];
            }
            if (this.getHighSpeedVideoFpsRanges > 1) {
                boolean z3 = (jArr[i3] & 1) == 1;
                int i14 = i2 - 2;
                int i15 = i14;
                while (i15 >= 0) {
                    long j4 = jArr[i15];
                    boolean z4 = (j4 & 1) != 0;
                    long j5 = j4 >>> 1;
                    jArr[i15] = j5;
                    if (z3) {
                        jArr[i15] = j5 ^ j;
                    }
                    i15--;
                    z3 = z4;
                }
                long j6 = jArr[i3] >>> 1;
                jArr[i3] = j6;
                if (z3) {
                    jArr[i3] = j6 ^ j2;
                }
                boolean z5 = (jArr2[i3] & 1) == 1;
                while (i14 >= 0) {
                    long j7 = jArr2[i14];
                    boolean z6 = (j7 & 1) != 0;
                    long j8 = j7 >>> 1;
                    jArr2[i14] = j8;
                    if (z5) {
                        jArr2[i14] = j8 ^ j;
                    }
                    i14--;
                    z5 = z6;
                }
                long j9 = jArr2[i3] >>> 1;
                jArr2[i3] = j9;
                if (z5) {
                    jArr2[i3] = j9 ^ j2;
                }
                i = 0;
            } else {
                i = 0;
                long j10 = jArr[0];
                if ((j10 & 1) == 1) {
                    c = 1;
                    z = true;
                } else {
                    z = false;
                    c = 1;
                }
                long j11 = j10 >>> c;
                jArr[0] = j11;
                if (z) {
                    jArr[0] = j11 ^ j2;
                }
                long j12 = jArr2[0];
                if ((j12 & 1) == 1) {
                    c2 = 1;
                    z2 = true;
                } else {
                    z2 = false;
                    c2 = 1;
                }
                long j13 = j12 >>> c2;
                jArr2[0] = j13;
                if (z2) {
                    jArr2[0] = j13 ^ j2;
                }
            }
            i6++;
            i5 = i;
            iArr2 = iArr5;
        }
        int i16 = i5;
        java.lang.System.arraycopy(jArr3, i16, this.getOutputFormats, i16, this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] jArr = this.getOutputFormats;
        long[] jArr2 = new long[jArr.length];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        int i = this.getHighSpeedVideoFpsRanges - 1;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        long j = getHighSpeedVideoSizes[63];
        boolean z = (jArr2[0] & 1) != 0;
        int i3 = i;
        while (i3 >= 0) {
            long j2 = jArr2[i3];
            boolean z2 = (j2 & 1) != 0;
            long j3 = j2 >>> 1;
            jArr2[i3] = j3;
            if (z) {
                if (i3 == i) {
                    jArr2[i3] = j3 ^ getHighSpeedVideoSizes[i2 - 1];
                } else {
                    jArr2[i3] = j3 ^ j;
                }
            }
            i3--;
            z = z2;
        }
        java.lang.System.arraycopy(jArr2, 0, this.getOutputFormats, 0, this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] jArr = this.getOutputFormats;
        long[] jArr2 = new long[jArr.length];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        int i = this.getHighSpeedVideoFpsRanges - 1;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 - 1;
        long[] jArr3 = getHighSpeedVideoSizes;
        long j = jArr3[63];
        boolean z = (jArr2[i] & jArr3[i3]) != 0;
        int i4 = 0;
        while (i4 < i) {
            long j2 = jArr2[i4];
            boolean z2 = (j2 & j) != 0;
            long j3 = j2 << 1;
            jArr2[i4] = j3;
            if (z) {
                jArr2[i4] = j3 ^ 1;
            }
            i4++;
            z = z2;
        }
        long j4 = jArr2[i];
        long[] jArr4 = getHighSpeedVideoSizes;
        boolean z3 = (jArr4[i3] & j4) != 0;
        long j5 = j4 << 1;
        jArr2[i] = j5;
        if (z) {
            jArr2[i] = j5 ^ 1;
        }
        if (z3) {
            jArr2[i] = jArr4[i2] ^ jArr2[i];
        }
        java.lang.System.arraycopy(jArr2, 0, this.getOutputFormats, 0, this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.lang.String toString(int i) {
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        long[] jArr = this.getOutputFormats;
        int length = jArr.length;
        long[] jArr2 = new long[length];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str = "";
        if (i == 2) {
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                if ((jArr2[length - 1] & (1 << i2)) == 0) {
                    sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append("0");
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(str);
                    sb3.append("1");
                    sb2 = sb3;
                }
                str = sb2.toString();
            }
            for (int i3 = length - 2; i3 >= 0; i3--) {
                for (int i4 = 63; i4 >= 0; i4--) {
                    if ((jArr2[i3] & getHighSpeedVideoSizes[i4]) == 0) {
                        sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append("0");
                    } else {
                        sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append("1");
                    }
                    str = sb.toString();
                }
            }
            return str;
        }
        if (i == 16) {
            char[] cArr = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
            for (int i5 = length - 1; i5 >= 0; i5--) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(cArr[((int) (jArr2[i5] >>> 60)) & 15]);
                java.lang.String obj = sb4.toString();
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(obj);
                sb5.append(cArr[((int) (jArr2[i5] >>> 56)) & 15]);
                java.lang.String obj2 = sb5.toString();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(obj2);
                sb6.append(cArr[((int) (jArr2[i5] >>> 52)) & 15]);
                java.lang.String obj3 = sb6.toString();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(obj3);
                sb7.append(cArr[((int) (jArr2[i5] >>> 48)) & 15]);
                java.lang.String obj4 = sb7.toString();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(obj4);
                sb8.append(cArr[((int) (jArr2[i5] >>> 44)) & 15]);
                java.lang.String obj5 = sb8.toString();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(obj5);
                sb9.append(cArr[((int) (jArr2[i5] >>> 40)) & 15]);
                java.lang.String obj6 = sb9.toString();
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                sb10.append(obj6);
                sb10.append(cArr[((int) (jArr2[i5] >>> 36)) & 15]);
                java.lang.String obj7 = sb10.toString();
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                sb11.append(obj7);
                sb11.append(cArr[((int) (jArr2[i5] >>> 32)) & 15]);
                java.lang.String obj8 = sb11.toString();
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                sb12.append(obj8);
                sb12.append(cArr[((int) (jArr2[i5] >>> 28)) & 15]);
                java.lang.String obj9 = sb12.toString();
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                sb13.append(obj9);
                sb13.append(cArr[((int) (jArr2[i5] >>> 24)) & 15]);
                java.lang.String obj10 = sb13.toString();
                java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                sb14.append(obj10);
                sb14.append(cArr[((int) (jArr2[i5] >>> 20)) & 15]);
                java.lang.String obj11 = sb14.toString();
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                sb15.append(obj11);
                sb15.append(cArr[((int) (jArr2[i5] >>> 16)) & 15]);
                java.lang.String obj12 = sb15.toString();
                java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                sb16.append(obj12);
                sb16.append(cArr[((int) (jArr2[i5] >>> 12)) & 15]);
                java.lang.String obj13 = sb16.toString();
                java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                sb17.append(obj13);
                sb17.append(cArr[((int) (jArr2[i5] >>> 8)) & 15]);
                java.lang.String obj14 = sb17.toString();
                java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                sb18.append(obj14);
                sb18.append(cArr[((int) (jArr2[i5] >>> 4)) & 15]);
                java.lang.String obj15 = sb18.toString();
                java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                sb19.append(obj15);
                sb19.append(cArr[((int) jArr2[i5]) & 15]);
                java.lang.String obj16 = sb19.toString();
                java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
                sb20.append(obj16);
                sb20.append(" ");
                str = sb20.toString();
            }
        }
        return str;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        int i = this.getHighSpeedVideoFpsRanges - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((this.getOutputFormats[i3] & getHighSpeedVideoSizes[i4]) != 0) {
                    i2 ^= 1;
                }
            }
        }
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int i6 = 0; i6 < i5; i6++) {
            if ((this.getOutputFormats[i] & getHighSpeedVideoSizes[i6]) != 0) {
                i2 ^= 1;
            }
        }
        return i2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.lang.String toString() {
        return toString(16);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.math.BigInteger toFlexiBigInt() {
        return new java.math.BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (i2 & 7) << 3;
            bArr[(i - i2) - 1] = (byte) ((this.getOutputFormats[i2 >>> 3] & (255 << i3)) >>> i3);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.getOutputFormats[this.getHighSpeedVideoFpsRanges - 1] & getHighSpeedVideoSizes[this.getHighResolutionOutputSizeshNQ4ISI - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    final boolean getHighSpeedVideoFpsRangesFor(int i) {
        return i >= 0 && i <= this.mDegree && (this.getOutputFormats[i >>> 6] & getHighSpeedVideoSizes[i & 63]) != 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement squareRoot() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement square() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement solveQuadraticEquation() throws java.lang.RuntimeException {
        if (trace() == 1) {
            throw new java.lang.RuntimeException();
        }
        long j = getHighSpeedVideoSizes[63];
        long[] jArr = new long[this.getHighSpeedVideoFpsRanges];
        long j2 = 0;
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges - 1; i++) {
            for (int i2 = 1; i2 < 64; i2++) {
                long[] jArr2 = getHighSpeedVideoSizes;
                long j3 = jArr2[i2];
                long j4 = j3 & this.getOutputFormats[i];
                if ((j4 == 0 || (j2 & jArr2[i2 - 1]) == 0) && (j4 != 0 || (jArr2[i2 - 1] & j2) != 0)) {
                    j2 ^= j3;
                }
            }
            jArr[i] = j2;
            long j5 = j2 & j;
            j2 = ((j5 == 0 || (this.getOutputFormats[i + 1] & 1) != 1) && !(j5 == 0 && (this.getOutputFormats[i + 1] & 1) == 0)) ? 1L : 0L;
        }
        int i3 = this.mDegree;
        long j6 = this.getOutputFormats[this.getHighSpeedVideoFpsRanges - 1];
        for (int i4 = 1; i4 < (i3 & 63); i4++) {
            long[] jArr3 = getHighSpeedVideoSizes;
            long j7 = jArr3[i4];
            long j8 = j7 & j6;
            if ((j8 == 0 || (jArr3[i4 - 1] & j2) == 0) && (j8 != 0 || (jArr3[i4 - 1] & j2) != 0)) {
                j2 ^= j7;
            }
        }
        jArr[this.getHighSpeedVideoFpsRanges - 1] = j2;
        return new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) this.mField, jArr);
    }

    final void getHighSpeedVideoFpsRangesFor() {
        this.getOutputFormats = getHighSpeedVideoSizes();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public org.bouncycastle.pqc.math.linearalgebra.GFElement multiply(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z = true;
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges && z; i++) {
            z = z && this.getOutputFormats[i] == 0;
        }
        return z;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        int i;
        boolean z = true;
        int i2 = 0;
        while (true) {
            i = this.getHighSpeedVideoFpsRanges - 1;
            if (i2 >= i || !z) {
                break;
            }
            z = z && this.getOutputFormats[i2] == -1;
            i2++;
        }
        if (!z) {
            return z;
        }
        if (z) {
            long j = this.getOutputFormats[i];
            long j2 = getHighSpeedVideoFpsRangesFor[this.getHighResolutionOutputSizeshNQ4ISI - 1];
            if ((j & j2) == j2) {
                return true;
            }
        }
        return false;
    }

    public void invertThis() throws java.lang.ArithmeticException {
        if (isZero()) {
            throw new java.lang.ArithmeticException();
        }
        int i = 31;
        boolean z = false;
        while (!z && i >= 0) {
            if (((this.mDegree - 1) & getHighSpeedVideoSizes[i]) != 0) {
                z = true;
            }
            i--;
        }
        ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) this.mField);
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
        int i2 = 1;
        while (i >= 0) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nONBElement.clone();
            for (int i3 = 1; i3 <= i2; i3++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i2 <<= 1;
            if (((this.mDegree - 1) & getHighSpeedVideoSizes[i]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i2++;
            }
            i--;
        }
        gF2nONBElement.squareThis();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public org.bouncycastle.pqc.math.linearalgebra.GFElement invert() throws java.lang.ArithmeticException {
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement increase() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getOutputFormats);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) obj;
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges; i++) {
            if (this.getOutputFormats[i] != gF2nONBElement.getOutputFormats[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.lang.Object clone() {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    final void Camera2StreamConfigurationMap() {
        this.getOutputFormats = new long[this.getHighSpeedVideoFpsRanges];
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        if (!(gFElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement)) {
            throw new java.lang.RuntimeException();
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new java.lang.RuntimeException();
        }
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges; i++) {
            long[] jArr = this.getOutputFormats;
            jArr[i] = jArr[i] ^ gF2nONBElement.getOutputFormats[i];
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public org.bouncycastle.pqc.math.linearalgebra.GFElement add(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    private long[] getHighSpeedVideoSizes() {
        long[] jArr = new long[this.getOutputFormats.length];
        for (int i = 0; i < this.mDegree; i++) {
            if (getHighSpeedVideoFpsRangesFor((this.mDegree - i) - 1)) {
                int i2 = i >>> 6;
                jArr[i2] = jArr[i2] | getHighSpeedVideoSizes[i & 63];
            }
        }
        return jArr;
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        this.getOutputFormats = new long[this.getHighSpeedVideoFpsRanges];
        for (int i = 0; i < bArr.length; i++) {
            long[] jArr = this.getOutputFormats;
            int i2 = i >>> 3;
            jArr[i2] = jArr[i2] | ((bArr[(bArr.length - 1) - i] & 255) << ((i & 7) << 3));
        }
    }
}
