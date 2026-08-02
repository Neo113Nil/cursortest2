package com.google.zxing.datamatrix.encoder;

/* loaded from: classes9.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 92, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, new int[]{28, 24, 185, 166, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 116, 255, 110, 61}, new int[]{175, 138, 205, 12, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 39, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 60, 97, 120}, new int[]{41, 153, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 91, 61, 42, 142, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 97, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 100, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, new int[]{156, 97, 192, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 100, 39, 188, 75, 66, 61, 241, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 109, 129, 94, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 225, 48, 90, 188}, new int[]{15, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 9, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 71, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 2, 188, 160, 153, 145, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 79, 108, 82, 27, 174, 186, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, new int[]{52, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 88, 205, 109, 39, 176, 21, 155, 197, 251, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 155, 21, 5, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 12, 181, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 53, 75, 34, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 121, 17, 138, 110, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 141, 136, 120, 151, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 93, 255}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 127, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 130, 250, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 181, 102, 120, 84, 179, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 251, 80, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 8, 175, 95, 100, 9, 167, 105, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, 111, 57, 121, 21, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 57, 54, 101, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 202, 69, 50, 150, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 226, 5, 9, 5}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 132, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 96, 32, 117, 22, 238, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 238, 231, 205, 188, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 87, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 106, 16, 147, 118, 23, 37, 90, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 205, 131, 88, 120, 100, 66, 138, 186, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 82, 44, 176, 87, 187, 147, 160, 175, 69, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 92, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 225, 19}, new int[]{175, 9, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 238, 12, 17, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, 100, 29, 175, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 192, 215, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 150, 159, 36, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 38, 200, 132, 54, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 146, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 117, 203, 29, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 144, 238, 22, 150, 201, 117, 62, 207, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 13, 137, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 127, 67, 247, 28, 155, 43, 203, 107, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 53, 143, 46}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 93, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 50, 144, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 39, 118, 202, 188, 201, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 143, 108, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 37, 185, 112, 134, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 63, 197, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 250, 106, 185, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 175, 64, 114, 71, 161, 44, 147, 6, 27, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 4, 107, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 7, 94, 166, 224, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 86, 47, 11, 204}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 89, 251, 149, 159, 56, 89, 33, 147, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 154, 36, 73, 127, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 136, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 197, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 68, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 93, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 15, 160, 227, 236, 66, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 153, 185, 202, 167, 179, 25, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 96, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 231, 136, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 239, 181, 241, 59, 52, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 25, 49, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 211, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
    private static final int[] LOG = new int[256];
    private static final int[] ALOG = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            ALOG[i2] = i;
            LOG[i] = i2;
            i *= 2;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    public static java.lang.String encodeECC200(java.lang.String str, com.google.zxing.datamatrix.encoder.SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new java.lang.IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int i = 0;
            while (i < interleavedBlockCount) {
                int i2 = i + 1;
                iArr[i] = symbolInfo.getDataLengthForInterleavedBlock(i2);
                iArr2[i] = symbolInfo.getErrorLengthForInterleavedBlock(i2);
                i = i2;
            }
            for (int i3 = 0; i3 < interleavedBlockCount; i3++) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < symbolInfo.getDataCapacity(); i4 += interleavedBlockCount) {
                    sb2.append(str.charAt(i4));
                }
                java.lang.String createECCBlock = createECCBlock(sb2.toString(), iArr2[i3]);
                int i5 = 0;
                int i6 = i3;
                while (i6 < iArr2[i3] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i6, createECCBlock.charAt(i5));
                    i6 += interleavedBlockCount;
                    i5++;
                }
            }
        }
        return sb.toString();
    }

    private static java.lang.String createECCBlock(java.lang.CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            }
            if (iArr[i4] == i) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(java.lang.String.valueOf(i)));
        }
        int[] iArr2 = FACTORS[i4];
        char[] cArr = new char[i];
        for (int i5 = 0; i5 < i; i5++) {
            cArr[i5] = 0;
        }
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            int i7 = i - 1;
            int charAt = cArr[i7] ^ charSequence.charAt(i6);
            while (i7 > 0) {
                if (charAt != 0 && (i3 = iArr2[i7]) != 0) {
                    char c = cArr[i7 - 1];
                    int[] iArr3 = ALOG;
                    int[] iArr4 = LOG;
                    cArr[i7] = (char) (iArr3[(iArr4[charAt] + iArr4[i3]) % 255] ^ c);
                } else {
                    cArr[i7] = cArr[i7 - 1];
                }
                i7--;
            }
            if (charAt != 0 && (i2 = iArr2[0]) != 0) {
                int[] iArr5 = ALOG;
                int[] iArr6 = LOG;
                cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i2]) % 255];
            } else {
                cArr[0] = 0;
            }
        }
        char[] cArr2 = new char[i];
        for (int i8 = 0; i8 < i; i8++) {
            cArr2[i8] = cArr[(i - i8) - 1];
        }
        return java.lang.String.valueOf(cArr2);
    }
}
