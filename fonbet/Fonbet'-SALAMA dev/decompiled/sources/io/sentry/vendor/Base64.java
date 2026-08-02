package io.sentry.vendor;

import W5.AbstractC0486a1;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    public static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int i7);

        public abstract boolean process(byte[] bArr, int i7, int i8, boolean z4);
    }

    public static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i7, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i7 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // io.sentry.vendor.Base64.Coder
        public int maxOutputSize(int i7) {
            return AbstractC0486a1.q(i7, 3, 4, 10);
        }

        @Override // io.sentry.vendor.Base64.Coder
        public boolean process(byte[] bArr, int i7, int i8, boolean z4) {
            int i9 = this.state;
            if (i9 == 6) {
                return false;
            }
            int i10 = i8 + i7;
            int i11 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i12 = 0;
            int i13 = i11;
            int i14 = i9;
            int i15 = i7;
            while (i15 < i10) {
                if (i14 == 0) {
                    while (true) {
                        int i16 = i15 + 4;
                        if (i16 > i10 || (i13 = (iArr[bArr[i15] & 255] << 18) | (iArr[bArr[i15 + 1] & 255] << 12) | (iArr[bArr[i15 + 2] & 255] << 6) | iArr[bArr[i15 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i12 + 2] = (byte) i13;
                        bArr2[i12 + 1] = (byte) (i13 >> 8);
                        bArr2[i12] = (byte) (i13 >> 16);
                        i12 += 3;
                        i15 = i16;
                    }
                    if (i15 >= i10) {
                        break;
                    }
                }
                int i17 = i15 + 1;
                int i18 = iArr[bArr[i15] & 255];
                if (i14 != 0) {
                    if (i14 == 1) {
                        if (i18 < 0) {
                            if (i18 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i18 |= i13 << 6;
                    } else if (i14 == 2) {
                        if (i18 < 0) {
                            if (i18 == -2) {
                                bArr2[i12] = (byte) (i13 >> 4);
                                i12++;
                                i14 = 4;
                            } else if (i18 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i18 |= i13 << 6;
                    } else if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 == 5 && i18 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i18 == -2) {
                            i14++;
                        } else if (i18 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i18 >= 0) {
                        int i19 = i18 | (i13 << 6);
                        bArr2[i12 + 2] = (byte) i19;
                        bArr2[i12 + 1] = (byte) (i19 >> 8);
                        bArr2[i12] = (byte) (i19 >> 16);
                        i12 += 3;
                        i13 = i19;
                        i14 = 0;
                    } else if (i18 == -2) {
                        bArr2[i12 + 1] = (byte) (i13 >> 2);
                        bArr2[i12] = (byte) (i13 >> 10);
                        i12 += 2;
                        i14 = 5;
                    } else if (i18 != -1) {
                        this.state = 6;
                        return false;
                    }
                    i14++;
                    i13 = i18;
                } else {
                    if (i18 < 0) {
                        if (i18 != -1) {
                            this.state = 6;
                            return false;
                        }
                    }
                    i14++;
                    i13 = i18;
                }
                i15 = i17;
            }
            if (!z4) {
                this.state = i14;
                this.value = i13;
                this.op = i12;
                return true;
            }
            if (i14 == 1) {
                this.state = 6;
                return false;
            }
            if (i14 == 2) {
                bArr2[i12] = (byte) (i13 >> 4);
                i12++;
            } else if (i14 == 3) {
                int i20 = i12 + 1;
                bArr2[i12] = (byte) (i13 >> 10);
                i12 += 2;
                bArr2[i20] = (byte) (i13 >> 2);
            } else if (i14 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i14;
            this.op = i12;
            return true;
        }
    }

    public static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i7, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (i7 & 1) == 0;
            boolean z4 = (i7 & 2) == 0;
            this.do_newline = z4;
            this.do_cr = (i7 & 4) != 0;
            this.alphabet = (i7 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z4 ? 19 : -1;
        }

        @Override // io.sentry.vendor.Base64.Coder
        public int maxOutputSize(int i7) {
            return AbstractC0486a1.q(i7, 8, 5, 10);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        @Override // io.sentry.vendor.Base64.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] decode(String str, int i7) {
        return decode(str.getBytes(), i7);
    }

    public static byte[] encode(byte[] bArr, int i7) {
        return encode(bArr, 0, bArr.length, i7);
    }

    public static String encodeToString(byte[] bArr, int i7) {
        try {
            return new String(encode(bArr, i7), "US-ASCII");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    public static byte[] decode(byte[] bArr, int i7) {
        return decode(bArr, 0, bArr.length, i7);
    }

    public static byte[] encode(byte[] bArr, int i7, int i8, int i9) {
        Encoder encoder = new Encoder(i9, null);
        int i10 = (i8 / 3) * 4;
        if (!encoder.do_padding) {
            int i11 = i8 % 3;
            if (i11 == 1) {
                i10 += 2;
            } else if (i11 == 2) {
                i10 += 3;
            }
        } else if (i8 % 3 > 0) {
            i10 += 4;
        }
        if (encoder.do_newline && i8 > 0) {
            i10 += (((i8 - 1) / 57) + 1) * (encoder.do_cr ? 2 : 1);
        }
        encoder.output = new byte[i10];
        encoder.process(bArr, i7, i8, true);
        return encoder.output;
    }

    public static byte[] decode(byte[] bArr, int i7, int i8, int i9) {
        Decoder decoder = new Decoder(i9, new byte[(i8 * 3) / 4]);
        if (decoder.process(bArr, i7, i8, true)) {
            int i10 = decoder.op;
            byte[] bArr2 = decoder.output;
            if (i10 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr2, 0, bArr3, 0, i10);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String encodeToString(byte[] bArr, int i7, int i8, int i9) {
        try {
            return new String(encode(bArr, i7, i8, i9), "US-ASCII");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }
}
