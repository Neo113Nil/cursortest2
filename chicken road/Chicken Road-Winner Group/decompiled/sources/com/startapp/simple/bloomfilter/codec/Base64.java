package com.startapp.simple.bloomfilter.codec;

import B0.c;
import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z3) {
        return encodeBase64(bArr, z3, false);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    public void decode(byte[] bArr, int i3, int i4, BaseNCodec.Context context) {
        byte b3;
        if (context.eof) {
            return;
        }
        if (i4 < 0) {
            context.eof = true;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i6 = i3 + 1;
            byte b4 = bArr[i3];
            if (b4 == 61) {
                context.eof = true;
                break;
            }
            if (b4 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b4 < bArr2.length && (b3 = bArr2[b4]) >= 0) {
                    int i7 = (context.modulus + 1) % 4;
                    context.modulus = i7;
                    int i8 = (context.ibitWorkArea << 6) + b3;
                    context.ibitWorkArea = i8;
                    if (i7 == 0) {
                        int i9 = context.pos;
                        int i10 = i9 + 1;
                        context.pos = i10;
                        ensureBufferSize[i9] = (byte) ((i8 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int i11 = i9 + 2;
                        context.pos = i11;
                        ensureBufferSize[i10] = (byte) ((i8 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        context.pos = i9 + 3;
                        ensureBufferSize[i11] = (byte) (i8 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                }
            }
            i5++;
            i3 = i6;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i12 = context.modulus;
        if (i12 != 1) {
            if (i12 == 2) {
                int i13 = context.ibitWorkArea >> 4;
                context.ibitWorkArea = i13;
                int i14 = context.pos;
                context.pos = i14 + 1;
                ensureBufferSize2[i14] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            }
            if (i12 != 3) {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
            int i15 = context.ibitWorkArea;
            int i16 = i15 >> 2;
            context.ibitWorkArea = i16;
            int i17 = context.pos;
            int i18 = i17 + 1;
            context.pos = i18;
            ensureBufferSize2[i17] = (byte) ((i15 >> 10) & KotlinVersion.MAX_COMPONENT_VALUE);
            context.pos = i17 + 2;
            ensureBufferSize2[i18] = (byte) (i16 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    public void encode(byte[] bArr, int i3, int i4, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i4 >= 0) {
            int i5 = 0;
            while (i5 < i4) {
                byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
                int i6 = (context.modulus + 1) % 3;
                context.modulus = i6;
                int i7 = i3 + 1;
                int i8 = bArr[i3];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = (context.ibitWorkArea << 8) + i8;
                context.ibitWorkArea = i9;
                if (i6 == 0) {
                    int i10 = context.pos;
                    int i11 = i10 + 1;
                    context.pos = i11;
                    byte[] bArr2 = this.encodeTable;
                    ensureBufferSize[i10] = bArr2[(i9 >> 18) & MASK_6BITS];
                    int i12 = i10 + 2;
                    context.pos = i12;
                    ensureBufferSize[i11] = bArr2[(i9 >> 12) & MASK_6BITS];
                    int i13 = i10 + 3;
                    context.pos = i13;
                    ensureBufferSize[i12] = bArr2[(i9 >> 6) & MASK_6BITS];
                    int i14 = i10 + 4;
                    context.pos = i14;
                    ensureBufferSize[i13] = bArr2[i9 & MASK_6BITS];
                    int i15 = context.currentLinePos + 4;
                    context.currentLinePos = i15;
                    int i16 = this.lineLength;
                    if (i16 > 0 && i16 <= i15) {
                        byte[] bArr3 = this.lineSeparator;
                        System.arraycopy(bArr3, 0, ensureBufferSize, i14, bArr3.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i5++;
                i3 = i7;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i17 = context.pos;
        int i18 = context.modulus;
        if (i18 != 0) {
            if (i18 == 1) {
                int i19 = i17 + 1;
                context.pos = i19;
                byte[] bArr4 = this.encodeTable;
                int i20 = context.ibitWorkArea;
                ensureBufferSize2[i17] = bArr4[(i20 >> 2) & MASK_6BITS];
                int i21 = i17 + 2;
                context.pos = i21;
                ensureBufferSize2[i19] = bArr4[(i20 << 4) & MASK_6BITS];
                if (bArr4 == STANDARD_ENCODE_TABLE) {
                    int i22 = i17 + 3;
                    context.pos = i22;
                    ensureBufferSize2[i21] = 61;
                    context.pos = i17 + 4;
                    ensureBufferSize2[i22] = 61;
                }
            } else {
                if (i18 != 2) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i23 = i17 + 1;
                context.pos = i23;
                byte[] bArr5 = this.encodeTable;
                int i24 = context.ibitWorkArea;
                ensureBufferSize2[i17] = bArr5[(i24 >> 10) & MASK_6BITS];
                int i25 = i17 + 2;
                context.pos = i25;
                ensureBufferSize2[i23] = bArr5[(i24 >> 4) & MASK_6BITS];
                int i26 = i17 + 3;
                context.pos = i26;
                ensureBufferSize2[i25] = bArr5[(i24 << 2) & MASK_6BITS];
                if (bArr5 == STANDARD_ENCODE_TABLE) {
                    context.pos = i17 + 4;
                    ensureBufferSize2[i26] = 61;
                }
            }
        }
        int i27 = context.currentLinePos;
        int i28 = context.pos;
        int i29 = (i28 - i17) + i27;
        context.currentLinePos = i29;
        if (this.lineLength <= 0 || i29 <= 0) {
            return;
        }
        byte[] bArr6 = this.lineSeparator;
        System.arraycopy(bArr6, 0, ensureBufferSize2, i28, bArr6.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // com.startapp.simple.bloomfilter.codec.BaseNCodec
    public boolean isInAlphabet(byte b3) {
        if (b3 < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return b3 < bArr.length && bArr[b3] != -1;
    }

    public Base64(boolean z3) {
        this(76, CHUNK_SEPARATOR, z3);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z3, boolean z4) {
        return encodeBase64(bArr, z3, z4, Integer.MAX_VALUE);
    }

    public Base64(int i3) {
        this(i3, CHUNK_SEPARATOR);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z3, boolean z4, int i3) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z3 ? new Base64(z4) : new Base64(0, CHUNK_SEPARATOR, z4);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i3) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i3);
    }

    public Base64(int i3, byte[] bArr) {
        this(i3, bArr, false);
    }

    public Base64(int i3, byte[] bArr, boolean z3) {
        super(3, 4, i3, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException(c.k("lineSeparator must not contain base64 characters: [", StringUtils.newStringUtf8(bArr), "]"));
            }
            if (i3 > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z3 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }
}
