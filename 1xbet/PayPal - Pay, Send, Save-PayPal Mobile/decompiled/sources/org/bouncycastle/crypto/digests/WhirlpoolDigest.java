package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public final class WhirlpoolDigest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable {
    private static final short[] getOutputFormats;
    private long[] getOutputMinFrameDurationlomOqCM;
    private short[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private long[] getOutputStallDuration;
    private long[] getOutputStallDurationlomOqCM;
    private long[] getValidOutputFormatsForInputhNQ4ISI;
    private long[] isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private final long[] toString;
    private static final int[] getInputFormats = {24, 35, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 135, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 1, 79, 54, 166, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 53, 29, 224, 215, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 46, 75, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 87, 21, 119, 55, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 159, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 74, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 88, 201, 41, 10, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 160, 107, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 93, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 203, 62, 5, 103, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 39, 65, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 167, 125, 149, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 251, 238, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 102, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 23, 71, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 202, 45, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 7, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 90, 131, 51, 99, 2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 113, 200, 25, 73, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 227, 91, 136, 154, 38, 50, 176, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 15, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 128, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 205, 52, 72, 255, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 144, 95, 32, 104, 26, 174, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 84, 147, 34, 100, 241, 115, 18, 64, 8, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 236, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 161, 141, 61, 151, 0, 207, 43, 118, 130, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, 27, 181, 175, 106, 80, 69, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 48, 239, 63, 85, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 101, 186, 47, 192, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, 28, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 77, 146, 117, 6, 138, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 14, 31, 98, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 150, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 165, 226, 97, 179, 33, 156, 30, 67, 199, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 4, 81, 153, 109, 13, 250, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 126, 36, 59, 171, 206, 17, 143, 78, 183, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 60, 129, 148, 247, 185, 19, 44, 211, 231, 110, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 3, 86, 68, 127, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 42, 187, 193, 83, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 11, 157, 108, 49, 116, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 70, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 137, 20, 225, 22, 58, 105, 9, 112, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 204, 66, 152, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 40, 92, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 134};
    private static final long[] getHighResolutionOutputSizeshNQ4ISI = new long[256];
    private static final long[] getHighSpeedVideoFpsRanges = new long[256];
    private static final long[] getHighSpeedVideoFpsRangesFor = new long[256];
    private static final long[] Camera2StreamConfigurationMap = new long[256];
    private static final long[] getHighSpeedVideoSizes = new long[256];
    private static final long[] getHighSpeedVideoSizesFor = new long[256];
    private static final long[] getInputSizeshNQ4ISI = new long[256];
    private static final long[] getOutputMinFrameDuration = new long[256];

    public WhirlpoolDigest() {
        this.toString = new long[11];
        this.getOutputSizeshNQ4ISI = new byte[64];
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getOutputSizes = new short[32];
        this.isOutputSupportedFor = new long[8];
        this.getOutputStallDurationlomOqCM = new long[8];
        this.getOutputMinFrameDurationlomOqCM = new long[8];
        this.getOutputStallDuration = new long[8];
        this.getValidOutputFormatsForInputhNQ4ISI = new long[8];
        for (int i = 0; i < 256; i++) {
            int i2 = getInputFormats[i];
            int i3 = i2 << 1;
            int i4 = ((long) i3) >= 256 ? i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE : i3;
            int i5 = i4 << 1;
            int i6 = ((long) i5) >= 256 ? i5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE : i5;
            int i7 = i6 ^ i2;
            int i8 = i6 << 1;
            if (i8 >= 256) {
                i8 ^= com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE;
            }
            int i9 = i8;
            int i10 = i9 ^ i2;
            getHighResolutionOutputSizeshNQ4ISI[i] = getHighSpeedVideoSizes(i2, i2, i6, i2, i9, i7, i4, i10);
            getHighSpeedVideoFpsRanges[i] = getHighSpeedVideoSizes(i10, i2, i2, i6, i2, i9, i7, i4);
            getHighSpeedVideoFpsRangesFor[i] = getHighSpeedVideoSizes(i4, i10, i2, i2, i6, i2, i9, i7);
            Camera2StreamConfigurationMap[i] = getHighSpeedVideoSizes(i7, i4, i10, i2, i2, i6, i2, i9);
            getHighSpeedVideoSizes[i] = getHighSpeedVideoSizes(i9, i7, i4, i10, i2, i2, i6, i2);
            getHighSpeedVideoSizesFor[i] = getHighSpeedVideoSizes(i2, i9, i7, i4, i10, i2, i2, i6);
            getInputSizeshNQ4ISI[i] = getHighSpeedVideoSizes(i6, i2, i9, i7, i4, i10, i2, i2);
            getOutputMinFrameDuration[i] = getHighSpeedVideoSizes(i2, i6, i2, i9, i7, i4, i10, i2);
        }
        this.toString[0] = 0;
        for (int i11 = 1; i11 <= 10; i11++) {
            int i12 = (i11 - 1) * 8;
            this.toString[i11] = (((((((getHighResolutionOutputSizeshNQ4ISI[i12] & (-72057594037927936L)) ^ (getHighSpeedVideoFpsRanges[i12 + 1] & 71776119061217280L)) ^ (getHighSpeedVideoFpsRangesFor[i12 + 2] & 280375465082880L)) ^ (Camera2StreamConfigurationMap[i12 + 3] & 1095216660480L)) ^ (getHighSpeedVideoSizes[i12 + 4] & com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_ALPHA)) ^ (getHighSpeedVideoSizesFor[i12 + 5] & 16711680)) ^ (getInputSizeshNQ4ISI[i12 + 6] & 65280)) ^ (getOutputMinFrameDuration[i12 + 7] & 255);
        }
    }

    private static long getHighSpeedVideoSizes(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((i2 << 48) ^ (i << 56)) ^ (i3 << 40)) ^ (i4 << 32)) ^ (i5 << 24)) ^ (i6 << 16)) ^ (i7 << 8)) ^ i8;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public final int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public final int getDigestSize() {
        return 64;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        org.bouncycastle.crypto.digests.WhirlpoolDigest whirlpoolDigest = this;
        int i = 0;
        while (i < whirlpoolDigest.getValidOutputFormatsForInputhNQ4ISI.length) {
            long[] jArr = whirlpoolDigest.getOutputStallDuration;
            byte[] bArr = whirlpoolDigest.getOutputSizeshNQ4ISI;
            int i2 = i * 8;
            long j = bArr[i2];
            long j2 = bArr[i2 + 1];
            long j3 = bArr[i2 + 2];
            long j4 = bArr[i2 + 3];
            long j5 = bArr[i2 + 4];
            int i3 = i;
            jArr[i3] = ((bArr[i2 + 5] & 255) << 16) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((bArr[i2 + 6] & 255) << 8) | (bArr[i2 + 7] & 255);
            i = i3 + 1;
            whirlpoolDigest = this;
        }
        processBlock();
        this.isOutputSupportedForhNQ4ISI = 0;
        org.bouncycastle.util.Arrays.fill(this.getOutputSizeshNQ4ISI, (byte) 0);
    }

    @Override // org.bouncycastle.crypto.Digest
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr2[i2] = (byte) (this.getOutputSizes[i2] & 255);
        }
        byte[] bArr3 = this.getOutputSizeshNQ4ISI;
        int i3 = this.isOutputSupportedForhNQ4ISI;
        int i4 = i3 + 1;
        this.isOutputSupportedForhNQ4ISI = i4;
        bArr3[i3] = (byte) (bArr3[i3] | 128);
        if (i4 == bArr3.length) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        if (this.isOutputSupportedForhNQ4ISI > 32) {
            while (this.isOutputSupportedForhNQ4ISI != 0) {
                update((byte) 0);
            }
        }
        while (this.isOutputSupportedForhNQ4ISI <= 32) {
            update((byte) 0);
        }
        java.lang.System.arraycopy(bArr2, 0, this.getOutputSizeshNQ4ISI, 32, 32);
        getHighResolutionOutputSizeshNQ4ISI();
        for (int i5 = 0; i5 < 8; i5++) {
            long j = this.isOutputSupportedFor[i5];
            int i6 = (i5 * 8) + i;
            for (int i7 = 0; i7 < 8; i7++) {
                bArr[i6 + i7] = (byte) ((j >> (56 - (i7 * 8))) & 255);
            }
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public final void update(byte b) {
        byte[] bArr = this.getOutputSizeshNQ4ISI;
        int i = this.isOutputSupportedForhNQ4ISI;
        bArr[i] = b;
        int i2 = i + 1;
        this.isOutputSupportedForhNQ4ISI = i2;
        if (i2 == bArr.length) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        int i3 = 0;
        for (int length = this.getOutputSizes.length - 1; length >= 0; length--) {
            short[] sArr = this.getOutputSizes;
            int i4 = (sArr[length] & 255) + getOutputFormats[length] + i3;
            i3 = i4 >>> 8;
            sArr[length] = (short) (i4 & 255);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public final void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public final void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.digests.WhirlpoolDigest whirlpoolDigest = (org.bouncycastle.crypto.digests.WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest.toString;
        long[] jArr2 = this.toString;
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest.getOutputSizeshNQ4ISI;
        byte[] bArr2 = this.getOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.isOutputSupportedForhNQ4ISI = whirlpoolDigest.isOutputSupportedForhNQ4ISI;
        short[] sArr = whirlpoolDigest.getOutputSizes;
        short[] sArr2 = this.getOutputSizes;
        java.lang.System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest.isOutputSupportedFor;
        long[] jArr4 = this.isOutputSupportedFor;
        java.lang.System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest.getOutputStallDurationlomOqCM;
        long[] jArr6 = this.getOutputStallDurationlomOqCM;
        java.lang.System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest.getOutputMinFrameDurationlomOqCM;
        long[] jArr8 = this.getOutputMinFrameDurationlomOqCM;
        java.lang.System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest.getOutputStallDuration;
        long[] jArr10 = this.getOutputStallDuration;
        java.lang.System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest.getValidOutputFormatsForInputhNQ4ISI;
        long[] jArr12 = this.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public final void reset() {
        this.isOutputSupportedForhNQ4ISI = 0;
        org.bouncycastle.util.Arrays.fill(this.getOutputSizes, (short) 0);
        org.bouncycastle.util.Arrays.fill(this.getOutputSizeshNQ4ISI, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.isOutputSupportedFor, 0L);
        org.bouncycastle.util.Arrays.fill(this.getOutputStallDurationlomOqCM, 0L);
        org.bouncycastle.util.Arrays.fill(this.getOutputMinFrameDurationlomOqCM, 0L);
        org.bouncycastle.util.Arrays.fill(this.getOutputStallDuration, 0L);
        org.bouncycastle.util.Arrays.fill(this.getValidOutputFormatsForInputhNQ4ISI, 0L);
    }

    protected final void processBlock() {
        long[] jArr;
        for (int i = 0; i < 8; i++) {
            long[] jArr2 = this.getValidOutputFormatsForInputhNQ4ISI;
            long j = this.getOutputStallDuration[i];
            long[] jArr3 = this.getOutputStallDurationlomOqCM;
            long j2 = this.isOutputSupportedFor[i];
            jArr3[i] = j2;
            jArr2[i] = j ^ j2;
        }
        int i2 = 1;
        while (i2 <= 10) {
            int i3 = 0;
            while (i3 < 8) {
                long[] jArr4 = this.getOutputMinFrameDurationlomOqCM;
                jArr4[i3] = 0;
                long[] jArr5 = getHighResolutionOutputSizeshNQ4ISI;
                long[] jArr6 = this.getOutputStallDurationlomOqCM;
                long j3 = jArr5[((int) (jArr6[i3 & 7] >>> 56)) & 255];
                jArr4[i3] = j3;
                long j4 = getHighSpeedVideoFpsRanges[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255] ^ j3;
                jArr4[i3] = j4;
                long j5 = j4 ^ getHighSpeedVideoFpsRangesFor[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                jArr4[i3] = j5;
                long j6 = j5 ^ Camera2StreamConfigurationMap[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                jArr4[i3] = j6;
                long j7 = j6 ^ getHighSpeedVideoSizes[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                jArr4[i3] = j7;
                long j8 = j7 ^ getHighSpeedVideoSizesFor[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                jArr4[i3] = j8;
                long j9 = j8 ^ getInputSizeshNQ4ISI[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                jArr4[i3] = j9;
                jArr4[i3] = j9 ^ getOutputMinFrameDuration[((int) jArr6[(i3 - 7) & 7]) & 255];
                i3++;
                i2 = i2;
            }
            int i4 = i2;
            long[] jArr7 = this.getOutputMinFrameDurationlomOqCM;
            long[] jArr8 = this.getOutputStallDurationlomOqCM;
            java.lang.System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = this.getOutputStallDurationlomOqCM;
            jArr9[0] = jArr9[0] ^ this.toString[i4];
            int i5 = 0;
            while (true) {
                jArr = this.getOutputMinFrameDurationlomOqCM;
                if (i5 < 8) {
                    long j10 = this.getOutputStallDurationlomOqCM[i5];
                    jArr[i5] = j10;
                    long[] jArr10 = getHighResolutionOutputSizeshNQ4ISI;
                    long[] jArr11 = this.getValidOutputFormatsForInputhNQ4ISI;
                    long j11 = jArr10[((int) (jArr11[i5 & 7] >>> 56)) & 255] ^ j10;
                    jArr[i5] = j11;
                    long j12 = j11 ^ getHighSpeedVideoFpsRanges[((int) (jArr11[(i5 - 1) & 7] >>> 48)) & 255];
                    jArr[i5] = j12;
                    long j13 = j12 ^ getHighSpeedVideoFpsRangesFor[((int) (jArr11[(i5 - 2) & 7] >>> 40)) & 255];
                    jArr[i5] = j13;
                    long j14 = j13 ^ Camera2StreamConfigurationMap[((int) (jArr11[(i5 - 3) & 7] >>> 32)) & 255];
                    jArr[i5] = j14;
                    long j15 = j14 ^ getHighSpeedVideoSizes[((int) (jArr11[(i5 - 4) & 7] >>> 24)) & 255];
                    jArr[i5] = j15;
                    long j16 = j15 ^ getHighSpeedVideoSizesFor[((int) (jArr11[(i5 - 5) & 7] >>> 16)) & 255];
                    jArr[i5] = j16;
                    long j17 = j16 ^ getInputSizeshNQ4ISI[((int) (jArr11[(i5 - 6) & 7] >>> 8)) & 255];
                    jArr[i5] = j17;
                    jArr[i5] = j17 ^ getOutputMinFrameDuration[((int) jArr11[(i5 - 7) & 7]) & 255];
                    i5++;
                }
            }
            long[] jArr12 = this.getValidOutputFormatsForInputhNQ4ISI;
            java.lang.System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
            i2 = i4 + 1;
        }
        for (int i6 = 0; i6 < 8; i6++) {
            long[] jArr13 = this.isOutputSupportedFor;
            jArr13[i6] = jArr13[i6] ^ (this.getValidOutputFormatsForInputhNQ4ISI[i6] ^ this.getOutputStallDuration[i6]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public final java.lang.String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.util.Memoable
    public final org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.WhirlpoolDigest(this);
    }

    public WhirlpoolDigest(org.bouncycastle.crypto.digests.WhirlpoolDigest whirlpoolDigest) {
        this.toString = new long[11];
        this.getOutputSizeshNQ4ISI = new byte[64];
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getOutputSizes = new short[32];
        this.isOutputSupportedFor = new long[8];
        this.getOutputStallDurationlomOqCM = new long[8];
        this.getOutputMinFrameDurationlomOqCM = new long[8];
        this.getOutputStallDuration = new long[8];
        this.getValidOutputFormatsForInputhNQ4ISI = new long[8];
        reset(whirlpoolDigest);
    }

    static {
        short[] sArr = new short[32];
        getOutputFormats = sArr;
        sArr[31] = 8;
    }
}
