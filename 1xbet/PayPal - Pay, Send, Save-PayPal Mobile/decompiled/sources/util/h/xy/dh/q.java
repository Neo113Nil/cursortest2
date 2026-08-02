package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class q {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static char[] getHighSpeedVideoSizes = {42479, 42385, 42444, 42466, 42397, 42471, 42392, 42479, 42473, 42471, 42464, 42396, 42396, 42297, 42301, 42371, 42413, 42423, 42418, 42415, 42416, 42418, 42410, 42261, 42495, 42465, 42471, 42470, 42466, 42464, 42396, 42392, 42365, 42267, 42347, 42336, 42245, 42252, 42262, 42258, 42256, 42262, 42255};

    private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        char c;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i = getHighSpeedVideoFpsRanges + 59;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = getHighSpeedVideoSizes;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr3[i6] = (char) (cArr2[i6] ^ (-8125198844289309347L));
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        java.lang.System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr2 != null) {
            int i7 = getHighSpeedVideoFpsRanges + 61;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            if (i7 % 2 != 0) {
                cArr = new char[i3];
                maVar.f2631 = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                maVar.f2631 = 0;
                c = 0;
            }
            while (maVar.f2631 < i3) {
                if (bArr2[maVar.f2631] == 1) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 85) % 128;
                    cArr[maVar.f2631] = (char) (((cArr4[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr[maVar.f2631] = (char) ((cArr4[maVar.f2631] * 2) - c);
                }
                c = cArr[maVar.f2631];
                maVar.f2631++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 47) % 128;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i8 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr4, i8, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr4, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr6[maVar.f2631] = cArr4[(i3 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr4[maVar.f2631] = (char) (cArr4[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m26331(int i, int i2) {
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 107) % 128;
        if (i == 64) {
            sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(true, new int[]{0, 13, 113, 2}, null, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(i2);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{13, 1, 108, 0}, "\u0001", objArr2);
            obj = objArr2[0];
        } else {
            if (i != 128) {
                if (i != 192) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(false, new int[]{32, 11, 0, 3}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr3);
                    sb2.append(((java.lang.String) objArr3[0]).intern());
                    sb2.append(i2);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(false, new int[]{13, 1, 108, 0}, "\u0001", objArr4);
                    sb2.append(((java.lang.String) objArr4[0]).intern());
                    java.lang.String obj2 = sb2.toString();
                    int i3 = getHighResolutionOutputSizeshNQ4ISI + 51;
                    Camera2StreamConfigurationMap = i3 % 128;
                    if (i3 % 2 != 0) {
                        return obj2;
                    }
                    throw null;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{23, 9, 112, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", objArr5);
                sb3.append(((java.lang.String) objArr5[0]).intern());
                sb3.append(i2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{13, 1, 108, 0}, "\u0001", objArr6);
                sb3.append(((java.lang.String) objArr6[0]).intern());
                java.lang.String obj3 = sb3.toString();
                int i4 = Camera2StreamConfigurationMap + 97;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    return obj3;
                }
                throw null;
            }
            sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{14, 9, 161, 1}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000", objArr7);
            sb.append(((java.lang.String) objArr7[0]).intern());
            sb.append(i2);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{13, 1, 108, 0}, "\u0001", objArr8);
            obj = objArr8[0];
        }
        sb.append(((java.lang.String) obj).intern());
        return sb.toString();
    }
}
