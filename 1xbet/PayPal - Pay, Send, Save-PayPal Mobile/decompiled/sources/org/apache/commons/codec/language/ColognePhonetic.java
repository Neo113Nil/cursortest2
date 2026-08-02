package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class ColognePhonetic implements org.apache.commons.codec.StringEncoder {
    private static final char[] getHighSpeedVideoFpsRanges = {'A', 'E', 'I', 'J', 'O', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, io.ktor.util.date.GMTDateParser.YEAR};
    private static final char[] getHighResolutionOutputSizeshNQ4ISI = {'C', 'S', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO};
    private static final char[] getInputFormats = {'F', 'P', 'V', 'W'};
    private static final char[] getOutputMinFrameDuration = {'G', 'K', 'Q'};
    private static final char[] getHighSpeedVideoSizes = {'C', 'K', 'Q'};
    private static final char[] getHighSpeedVideoFpsRangesFor = {'A', 'H', 'K', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 'O', 'Q', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};
    private static final char[] getHighSpeedVideoSizesFor = {'S', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO};
    private static final char[] Camera2StreamConfigurationMap = {'A', 'H', 'K', 'O', 'Q', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};
    private static final char[] getOutputFormats = {'D', 'T', 'X'};

    static abstract class CologneBuffer {
        protected final char[] getHighResolutionOutputSizeshNQ4ISI;
        protected int getHighSpeedVideoFpsRangesFor;

        protected abstract char[] getHighResolutionOutputSizeshNQ4ISI(int i);

        public CologneBuffer(char[] cArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = cArr;
            this.getHighSpeedVideoFpsRangesFor = cArr.length;
        }

        public CologneBuffer(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = new char[i];
            this.getHighSpeedVideoFpsRangesFor = 0;
        }

        public final int Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public java.lang.String toString() {
            return new java.lang.String(getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor));
        }

        public final boolean getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRangesFor == 0;
        }
    }

    final class CologneInputBuffer extends org.apache.commons.codec.language.ColognePhonetic.CologneBuffer {
        public CologneInputBuffer(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        protected final char[] getHighResolutionOutputSizeshNQ4ISI(int i) {
            char[] cArr = new char[i];
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI.length - this.getHighSpeedVideoFpsRangesFor, cArr, 0, i);
            return cArr;
        }

        public final char getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI[this.getHighResolutionOutputSizeshNQ4ISI.length - this.getHighSpeedVideoFpsRangesFor];
        }

        public final char getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRangesFor--;
            return this.getHighResolutionOutputSizeshNQ4ISI[this.getHighResolutionOutputSizeshNQ4ISI.length - this.getHighSpeedVideoFpsRangesFor];
        }
    }

    final class CologneOutputBuffer extends org.apache.commons.codec.language.ColognePhonetic.CologneBuffer {
        private char getHighSpeedVideoFpsRanges;

        public CologneOutputBuffer(int i) {
            super(i);
            this.getHighSpeedVideoFpsRanges = kotlinx.io.files.FileSystemKt.UnixPathSeparator;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        protected final char[] getHighResolutionOutputSizeshNQ4ISI(int i) {
            return java.util.Arrays.copyOfRange(this.getHighResolutionOutputSizeshNQ4ISI, 0, i);
        }

        public final void getHighSpeedVideoSizes(char c) {
            if (c != '-' && this.getHighSpeedVideoFpsRanges != c && (c != '0' || this.getHighSpeedVideoFpsRangesFor == 0)) {
                this.getHighResolutionOutputSizeshNQ4ISI[this.getHighSpeedVideoFpsRangesFor] = c;
                this.getHighSpeedVideoFpsRangesFor++;
            }
            this.getHighSpeedVideoFpsRanges = c;
        }
    }

    public java.lang.String colognePhonetic(java.lang.String str) {
        if (str == null) {
            return null;
        }
        org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer cologneInputBuffer = new org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer(getHighSpeedVideoSizes(str));
        org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer cologneOutputBuffer = new org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer(cologneInputBuffer.Camera2StreamConfigurationMap() * 2);
        char c = '-';
        while (!cologneInputBuffer.getHighSpeedVideoFpsRanges()) {
            char highSpeedVideoFpsRangesFor = cologneInputBuffer.getHighSpeedVideoFpsRangesFor();
            char highResolutionOutputSizeshNQ4ISI = !cologneInputBuffer.getHighSpeedVideoFpsRanges() ? cologneInputBuffer.getHighResolutionOutputSizeshNQ4ISI() : '-';
            if (highSpeedVideoFpsRangesFor >= 'A' && highSpeedVideoFpsRangesFor <= 'Z') {
                char[] cArr = getHighSpeedVideoFpsRanges;
                int length = cArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (cArr[i2] == highSpeedVideoFpsRangesFor) {
                            cologneOutputBuffer.getHighSpeedVideoSizes(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        } else {
                            i2++;
                        }
                    } else if (highSpeedVideoFpsRangesFor == 'B' || (highSpeedVideoFpsRangesFor == 'P' && highResolutionOutputSizeshNQ4ISI != 'H')) {
                        cologneOutputBuffer.getHighSpeedVideoSizes('1');
                    } else {
                        if (highSpeedVideoFpsRangesFor == 'D' || highSpeedVideoFpsRangesFor == 'T') {
                            for (char c2 : getHighResolutionOutputSizeshNQ4ISI) {
                                if (c2 != highResolutionOutputSizeshNQ4ISI) {
                                }
                            }
                            cologneOutputBuffer.getHighSpeedVideoSizes('2');
                        }
                        char[] cArr2 = getInputFormats;
                        int length2 = cArr2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                char[] cArr3 = getOutputMinFrameDuration;
                                int length3 = cArr3.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length3) {
                                        if (highSpeedVideoFpsRangesFor == 'X') {
                                            for (char c3 : getHighSpeedVideoSizes) {
                                                if (c3 != c) {
                                                }
                                            }
                                            cologneOutputBuffer.getHighSpeedVideoSizes('4');
                                            cologneOutputBuffer.getHighSpeedVideoSizes('8');
                                        }
                                        if (highSpeedVideoFpsRangesFor != 'S' && highSpeedVideoFpsRangesFor != 'Z') {
                                            if (highSpeedVideoFpsRangesFor == 'C') {
                                                if (cologneOutputBuffer.getHighSpeedVideoFpsRanges()) {
                                                    char[] cArr4 = getHighSpeedVideoFpsRangesFor;
                                                    int length4 = cArr4.length;
                                                    while (true) {
                                                        if (i >= length4) {
                                                            cologneOutputBuffer.getHighSpeedVideoSizes('8');
                                                        } else if (cArr4[i] == highResolutionOutputSizeshNQ4ISI) {
                                                            cologneOutputBuffer.getHighSpeedVideoSizes('4');
                                                        } else {
                                                            i++;
                                                        }
                                                    }
                                                } else {
                                                    char[] cArr5 = getHighSpeedVideoSizesFor;
                                                    int length5 = cArr5.length;
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i5 >= length5) {
                                                            char[] cArr6 = Camera2StreamConfigurationMap;
                                                            int length6 = cArr6.length;
                                                            while (i < length6) {
                                                                if (cArr6[i] == highResolutionOutputSizeshNQ4ISI) {
                                                                    cologneOutputBuffer.getHighSpeedVideoSizes('4');
                                                                } else {
                                                                    i++;
                                                                }
                                                            }
                                                        } else if (cArr5[i5] != c) {
                                                            i5++;
                                                        }
                                                    }
                                                    cologneOutputBuffer.getHighSpeedVideoSizes('8');
                                                }
                                            } else {
                                                char[] cArr7 = getOutputFormats;
                                                int length7 = cArr7.length;
                                                while (true) {
                                                    if (i >= length7) {
                                                        if (highSpeedVideoFpsRangesFor != 'H') {
                                                            if (highSpeedVideoFpsRangesFor == 'R') {
                                                                cologneOutputBuffer.getHighSpeedVideoSizes('7');
                                                            } else {
                                                                switch (highSpeedVideoFpsRangesFor) {
                                                                    case 'L':
                                                                        cologneOutputBuffer.getHighSpeedVideoSizes('5');
                                                                        break;
                                                                    case 'M':
                                                                    case 'N':
                                                                        cologneOutputBuffer.getHighSpeedVideoSizes('6');
                                                                        break;
                                                                }
                                                            }
                                                        } else {
                                                            cologneOutputBuffer.getHighSpeedVideoSizes('-');
                                                        }
                                                    } else if (cArr7[i] == highSpeedVideoFpsRangesFor) {
                                                        cologneOutputBuffer.getHighSpeedVideoSizes('8');
                                                    } else {
                                                        i++;
                                                    }
                                                }
                                            }
                                        } else {
                                            cologneOutputBuffer.getHighSpeedVideoSizes('8');
                                        }
                                    } else if (cArr3[i4] == highSpeedVideoFpsRangesFor) {
                                        cologneOutputBuffer.getHighSpeedVideoSizes('4');
                                    } else {
                                        i4++;
                                    }
                                }
                            } else if (cArr2[i3] == highSpeedVideoFpsRangesFor) {
                                cologneOutputBuffer.getHighSpeedVideoSizes('3');
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                c = highSpeedVideoFpsRangesFor;
            }
        }
        return cologneOutputBuffer.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("This method's parameter was expected to be of the type ");
            sb.append(java.lang.String.class.getName());
            sb.append(". But actually it was of the type ");
            sb.append(obj.getClass().getName());
            sb.append(".");
            throw new org.apache.commons.codec.EncoderException(sb.toString());
        }
        return encode((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return colognePhonetic(str);
    }

    public boolean isEncodeEqual(java.lang.String str, java.lang.String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    private static char[] getHighSpeedVideoSizes(java.lang.String str) {
        char[] charArray = str.toUpperCase(java.util.Locale.GERMAN).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 196) {
                charArray[i] = 'A';
            } else if (c == 214) {
                charArray[i] = 'O';
            } else if (c == 220) {
                charArray[i] = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT;
            }
        }
        return charArray;
    }
}
