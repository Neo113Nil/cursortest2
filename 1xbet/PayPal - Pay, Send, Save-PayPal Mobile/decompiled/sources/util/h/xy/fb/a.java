package util.h.xy.fb;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 1;
    private static long getHighResolutionOutputSizeshNQ4ISI = -7221064056019586018L;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    public static final class ra<T> implements java.util.Iterator<T> {
        private static int Camera2StreamConfigurationMap = 0;
        private static long getHighResolutionOutputSizeshNQ4ISI = 5311946463697402773L;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;
        private final T[] getHighSpeedVideoSizesFor;
        private int getOutputFormats = 0;

        private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 105) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
                aVar.f2623++;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 45) % 128;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        }

        @Override // java.util.Iterator
        public final void remove() {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ꭦꬥಥ닦\ud85a轹뗲匃ꗽ鹠꒨䈃뛫국韫焳蟟발蛕急郓덅\uf1c9ἳ\ue1d6숄\ue0beී\uf2b1톽폴㳔쎤\ue0ec슁⯋\udcb4\uf799춅\udaa3", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1, objArr);
            throw new java.lang.UnsupportedOperationException(((java.lang.String) objArr[0]).intern());
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = (getHighSpeedVideoSizes + 1) % 128;
            Camera2StreamConfigurationMap = i;
            int i2 = this.getOutputFormats;
            T[] tArr = this.getHighSpeedVideoSizesFor;
            if (i2 != tArr.length) {
                this.getOutputFormats = i2 + 1;
                T t = tArr[i2];
                getHighSpeedVideoSizes = (i + 5) % 128;
                return t;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("瓣璬䠓雚♉쯛釔굞穸\udac4肔밇楧\ue9d3돕輳塑\uf8feꋿ鹠伓", 1 - android.view.View.MeasureSpec.getMode(0), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(this.getOutputFormats);
            throw new java.util.NoSuchElementException(sb.toString());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = getHighSpeedVideoSizes;
            int i2 = i + 11;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                int length = this.getHighSpeedVideoSizesFor.length;
                throw null;
            }
            if (this.getOutputFormats >= this.getHighSpeedVideoSizesFor.length) {
                return false;
            }
            Camera2StreamConfigurationMap = (i + 97) % 128;
            return true;
        }

        public ra(T[] tArr) {
            this.getHighSpeedVideoSizesFor = tArr;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoSizes + 65;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighResolutionOutputSizeshNQ4ISI ^ (-7508379876853140581L));
            dVar.f2629++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 39) % 128;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i4 = getHighSpeedVideoFpsRangesFor + 37;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629;
            } else {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m26816(java.lang.Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = i2 + 19;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                java.lang.Object obj = objArr[i];
                throw null;
            }
            if (objArr[i] == null) {
                return true;
            }
            i++;
            getHighSpeedVideoFpsRanges = (i2 + 87) % 128;
        }
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26822(byte[] bArr, byte b) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 49;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length + 1];
            java.lang.System.arraycopy(bArr, 0, bArr2, 1, length);
            bArr2[0] = b;
            return bArr2;
        }
        byte[] bArr3 = {b};
        int i3 = i + 51;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr3;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26824(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i4 + 63) % 128;
        int i5 = i4 + 33;
        int i6 = i5 % 128;
        Camera2StreamConfigurationMap = i6;
        if (i5 % 2 != 0 ? (i3 = i2 - i) < 0 : (i3 = i2 >>> i) < 0) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("䞥苤촛", 50527 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
            stringBuffer.append(((java.lang.String) objArr[0]).intern()).append(i2);
            throw new java.lang.IllegalArgumentException(stringBuffer.toString());
        }
        int i7 = i6 + 59;
        getHighSpeedVideoFpsRanges = i7 % 128;
        if (i7 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr2 = new byte[i3];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, java.lang.Math.min(bArr.length - i, i3));
        int i8 = Camera2StreamConfigurationMap + 79;
        getHighSpeedVideoFpsRanges = i8 % 128;
        if (i8 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26823(byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRanges + 5;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArr2 = new byte[i];
            java.lang.System.arraycopy(bArr, 1, bArr2, 0, java.lang.Math.min(bArr.length, i));
            return bArr2;
        }
        byte[] bArr3 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, java.lang.Math.min(bArr.length, i));
        return bArr3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26821(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 43;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr2 = bArr != null ? (byte[]) bArr.clone() : null;
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 89) % 128;
        return bArr2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m26825(char[] cArr) {
        int i;
        char c;
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i2 + 67) % 128;
        if (cArr == null) {
            getHighSpeedVideoFpsRanges = (i2 + 37) % 128;
            int i3 = i2 + 5;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int length = cArr.length;
        int i4 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i4;
            }
            int i5 = getHighSpeedVideoFpsRanges + 87;
            int i6 = i5 % 128;
            Camera2StreamConfigurationMap = i6;
            if (i5 % 2 == 0) {
                i = i4 % 24202;
                c = cArr[length];
            } else {
                i = i4 * 257;
                c = cArr[length];
            }
            i4 = i ^ c;
            getHighSpeedVideoFpsRanges = (i6 + 17) % 128;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m26819(byte[] bArr, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRanges + 41;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (bArr == null) {
            getHighSpeedVideoFpsRanges = (i4 + 61) % 128;
            return 0;
        }
        int i5 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i5;
            }
            i5 = (i5 * 257) ^ bArr[i + i2];
            int i6 = getHighSpeedVideoFpsRanges + 69;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m26817(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 115) % 128;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            i = (i * 257) ^ bArr[length];
        }
        int i2 = Camera2StreamConfigurationMap + 5;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return i;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26826(byte[] bArr, byte b) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 91) % 128;
        java.util.Arrays.fill(bArr, b);
        int i = Camera2StreamConfigurationMap + 65;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m26827(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int i = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (i + 103) % 128;
            if (bArr2 != null) {
                if (bArr == bArr2) {
                    Camera2StreamConfigurationMap = (i + 85) % 128;
                    return true;
                }
                int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
                int length2 = bArr.length ^ bArr2.length;
                int i2 = 0;
                while (i2 != length) {
                    int i3 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getHighSpeedVideoFpsRanges = i3 % 128;
                    if (i3 % 2 != 0) {
                        length2 |= bArr[i2] ^ bArr2[i2];
                        i2 += 103;
                    } else {
                        length2 |= bArr[i2] ^ bArr2[i2];
                        i2++;
                    }
                }
                while (length < bArr2.length) {
                    int i4 = Camera2StreamConfigurationMap + 19;
                    getHighSpeedVideoFpsRanges = i4 % 128;
                    if (i4 % 2 != 0) {
                        byte b = bArr2[length];
                        length2 |= b ^ (~b);
                        length += 40;
                    } else {
                        byte b2 = bArr2[length];
                        length2 |= b2 ^ (~b2);
                        length++;
                    }
                }
                boolean z = length2 == 0;
                int i5 = getHighSpeedVideoFpsRanges + 23;
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 != 0) {
                    return z;
                }
                throw null;
            }
        }
        return false;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m26818(char[] cArr, char[] cArr2) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 117) % 128;
        boolean equals = java.util.Arrays.equals(cArr, cArr2);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 17) % 128;
        return equals;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m26820(byte[] bArr, byte[] bArr2) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 29) % 128;
        boolean equals = java.util.Arrays.equals(bArr, bArr2);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 83) % 128;
        return equals;
    }
}
