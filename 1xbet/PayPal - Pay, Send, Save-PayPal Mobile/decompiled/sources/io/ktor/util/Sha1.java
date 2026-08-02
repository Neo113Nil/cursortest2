package io.ktor.util;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a"}, d2 = {"Lio/ktor/util/Sha1;", "Lio/ktor/util/HashFunction;", "<init>", "()V", "", "input", "", "offset", "length", "", "update", "([BII)V", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "([BI)V", org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, "()[B", "", "getOutputMinFrameDuration", "J", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "[B", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "", "getInputFormats", "[I", "Camera2StreamConfigurationMap", "getOutputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Sha1 implements io.ktor.util.HashFunction {

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoSizes = new byte[64];

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int[] getHighSpeedVideoFpsRangesFor = new int[80];

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap = 1732584193;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI = -271733879;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getInputFormats = -1732584194;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getOutputFormats = 271733878;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getOutputMinFrameDuration = -1009589776;

    @Override // io.ktor.util.HashFunction
    public final void update(byte[] input, int offset, int length) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        this.getHighSpeedVideoFpsRanges += length;
        int i = offset + length;
        byte[] bArr = this.getHighSpeedVideoSizes;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 > 0) {
            int i3 = length + i2;
            if (i3 < 64) {
                kotlin.collections.ArraysKt.copyInto(input, bArr, i2, offset, i);
                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                return;
            } else {
                int i4 = (64 - i2) + offset;
                kotlin.collections.ArraysKt.copyInto(input, bArr, i2, offset, i4);
                getHighSpeedVideoFpsRangesFor(bArr, 0);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                offset = i4;
            }
        }
        while (offset < i) {
            int i5 = offset + 64;
            if (i5 > i) {
                kotlin.collections.ArraysKt.copyInto(input, bArr, 0, offset, i);
                this.getHighResolutionOutputSizeshNQ4ISI = i - offset;
                return;
            } else {
                getHighSpeedVideoFpsRangesFor(input, offset);
                offset = i5;
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(byte[] p0, int p1) {
        int i;
        int access$leftRotate;
        int i2;
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= 16) {
                break;
            }
            byte b = p0[p1];
            iArr[i4] = (p0[p1 + 3] & 255) | ((p0[p1 + 1] & 255) << 16) | ((b & 255) << 24) | ((p0[p1 + 2] & 255) << 8);
            i4++;
            p1 += 4;
        }
        for (i = 16; i < 80; i++) {
            iArr[i] = io.ktor.util.HashFunctionKt.access$leftRotate(((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16], 1);
        }
        int i5 = this.Camera2StreamConfigurationMap;
        int i6 = this.getInputSizeshNQ4ISI;
        int i7 = this.getInputFormats;
        int i8 = this.getOutputFormats;
        int i9 = this.getOutputMinFrameDuration;
        while (i3 < 80) {
            if (i3 < 20) {
                access$leftRotate = io.ktor.util.HashFunctionKt.access$leftRotate(i5, 5) + (((i7 ^ i8) & i6) ^ i8) + i9 + 1518500249;
                i2 = iArr[i3];
            } else if (i3 < 40) {
                access$leftRotate = io.ktor.util.HashFunctionKt.access$leftRotate(i5, 5) + ((i6 ^ i7) ^ i8) + i9 + 1859775393;
                i2 = iArr[i3];
            } else if (i3 < 60) {
                access$leftRotate = ((io.ktor.util.HashFunctionKt.access$leftRotate(i5, 5) + (((i7 | i8) & i6) | (i7 & i8))) + i9) - 1894007588;
                i2 = iArr[i3];
            } else {
                access$leftRotate = ((io.ktor.util.HashFunctionKt.access$leftRotate(i5, 5) + ((i6 ^ i7) ^ i8)) + i9) - 899497514;
                i2 = iArr[i3];
            }
            int access$leftRotate2 = io.ktor.util.HashFunctionKt.access$leftRotate(i6, 30);
            i3++;
            i6 = i5;
            i5 = i2 + access$leftRotate;
            i9 = i8;
            i8 = i7;
            i7 = access$leftRotate2;
        }
        this.Camera2StreamConfigurationMap += i5;
        this.getInputSizeshNQ4ISI += i6;
        this.getInputFormats += i7;
        this.getOutputFormats += i8;
        this.getOutputMinFrameDuration += i9;
    }

    @Override // io.ktor.util.HashFunction
    public final byte[] digest() {
        byte[] bArr = this.getHighSpeedVideoSizes;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        long j = this.getHighSpeedVideoFpsRanges * 8;
        int i2 = i + 1;
        bArr[i] = Byte.MIN_VALUE;
        if (i2 > 56) {
            kotlin.collections.ArraysKt.fill(bArr, (byte) 0, i2, 64);
            getHighSpeedVideoFpsRangesFor(bArr, 0);
            kotlin.collections.ArraysKt.fill(bArr, (byte) 0, 0, i2);
        } else {
            kotlin.collections.ArraysKt.fill(bArr, (byte) 0, i2, 56);
        }
        bArr[56] = (byte) (j >>> 56);
        bArr[57] = (byte) (j >>> 48);
        bArr[58] = (byte) (j >>> 40);
        bArr[59] = (byte) (j >>> 32);
        bArr[60] = (byte) (j >>> 24);
        bArr[61] = (byte) (j >>> 16);
        bArr[62] = (byte) (j >>> 8);
        bArr[63] = (byte) j;
        getHighSpeedVideoFpsRangesFor(bArr, 0);
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = this.getInputSizeshNQ4ISI;
        int i5 = this.getInputFormats;
        int i6 = this.getOutputFormats;
        int i7 = this.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRanges = 0L;
        kotlin.collections.ArraysKt.fill$default(this.getHighSpeedVideoSizes, (byte) 0, 0, 0, 6, (java.lang.Object) null);
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        kotlin.collections.ArraysKt.fill$default(this.getHighSpeedVideoFpsRangesFor, 0, 0, 0, 6, (java.lang.Object) null);
        this.Camera2StreamConfigurationMap = 1732584193;
        this.getInputSizeshNQ4ISI = -271733879;
        this.getInputFormats = -1732584194;
        this.getOutputFormats = 271733878;
        this.getOutputMinFrameDuration = -1009589776;
        return new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3, (byte) (i4 >> 24), (byte) (i4 >> 16), (byte) (i4 >> 8), (byte) i4, (byte) (i5 >> 24), (byte) (i5 >> 16), (byte) (i5 >> 8), (byte) i5, (byte) (i6 >> 24), (byte) (i6 >> 16), (byte) (i6 >> 8), (byte) i6, (byte) (i7 >> 24), (byte) (i7 >> 16), (byte) (i7 >> 8), (byte) i7};
    }
}
