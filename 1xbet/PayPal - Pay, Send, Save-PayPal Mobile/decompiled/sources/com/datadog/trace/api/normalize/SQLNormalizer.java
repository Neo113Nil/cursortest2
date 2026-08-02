package com.datadog.trace.api.normalize;

/* loaded from: classes8.dex */
public final class SQLNormalizer {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.api.normalize.SQLNormalizer.class);
    private static final java.util.BitSet getHighResolutionOutputSizeshNQ4ISI = new java.util.BitSet();
    private static final java.util.BitSet getHighSpeedVideoFpsRanges = new java.util.BitSet();

    static {
        byte[] bArr = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 45, 43, 46};
        for (int i = 0; i < 13; i++) {
            getHighResolutionOutputSizeshNQ4ISI.set(bArr[i] & 255);
        }
        byte[] bArr2 = {44, 40, 41, 124};
        for (int i2 = 0; i2 < 4; i2++) {
            getHighSpeedVideoFpsRanges.set(bArr2[i2] & 255);
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (java.lang.Character.isWhitespace((char) i3)) {
                getHighSpeedVideoFpsRanges.set(i3);
            }
        }
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString normalizeCharSequence(java.lang.CharSequence charSequence) {
        return normalize(charSequence.toString());
    }

    public static com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString normalize(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        try {
            java.util.BitSet bitSet = new java.util.BitSet(bytes.length);
            boolean z = false;
            int i = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                boolean z4 = true;
                if (i >= bytes.length) {
                    break;
                }
                byte b = bytes[i];
                if (b != 39 || z2) {
                    if (b != 92) {
                        z4 = false;
                    }
                    z2 = (!z2) & z4;
                    bitSet.set(i, getHighSpeedVideoFpsRanges.get(b & 255) & (!z3));
                } else {
                    z3 = !z3;
                }
                i++;
            }
            int length = bytes.length;
            int previousSetBit = length > 0 ? bitSet.previousSetBit(length - 1) : -1;
            int i2 = length;
            while (length > 0 && previousSetBit > 0) {
                int i3 = previousSetBit + 1;
                int i4 = length - 1;
                if (i4 == i3) {
                    if (java.lang.Character.isDigit(bytes[i3])) {
                        bytes[i3] = 63;
                        z = true;
                        int i5 = previousSetBit;
                        previousSetBit = bitSet.previousSetBit(previousSetBit - 1);
                        length = i5;
                    } else {
                        int i52 = previousSetBit;
                        previousSetBit = bitSet.previousSetBit(previousSetBit - 1);
                        length = i52;
                    }
                } else {
                    if (i3 < i4) {
                        byte b2 = bytes[i3];
                        if (b2 == 39) {
                            if (bytes[i4] == 39) {
                                java.lang.System.arraycopy(bytes, length, bytes, previousSetBit + 2, i2 - length);
                                bytes[i3] = 63;
                                i2 -= i4 - i3;
                                z = true;
                            }
                        }
                        if (getHighResolutionOutputSizeshNQ4ISI.get(b2 & 255)) {
                            if (bytes[previousSetBit + 2] == 45) {
                                if (bytes[i3] != 45) {
                                }
                            }
                            java.lang.System.arraycopy(bytes, length, bytes, previousSetBit + 2, i2 - length);
                            bytes[i3] = 63;
                            i2 -= i4 - i3;
                            z = true;
                        }
                        if ((bytes[i3] | 32) == 120) {
                            int i6 = previousSetBit + 2;
                            if (i6 < i4) {
                                if (bytes[i6] != 39) {
                                }
                                java.lang.System.arraycopy(bytes, length, bytes, previousSetBit + 2, i2 - length);
                                bytes[i3] = 63;
                                i2 -= i4 - i3;
                                z = true;
                            }
                        }
                    }
                    int i522 = previousSetBit;
                    previousSetBit = bitSet.previousSetBit(previousSetBit - 1);
                    length = i522;
                }
            }
            if (z) {
                return com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(java.util.Arrays.copyOf(bytes, i2));
            }
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoFpsRangesFor.debug("Error normalizing sql {}", str, th);
        }
        return com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(str, bytes);
    }
}
