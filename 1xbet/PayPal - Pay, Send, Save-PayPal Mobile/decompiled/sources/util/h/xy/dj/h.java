package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class h extends util.h.xy.dh.mh implements util.h.xy.dh.mc {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static char[] getInputSizeshNQ4ISI = {42342, 42450, 42275, 42461, 42456, 42272, 42455, 42342, 42452, 42447, 42455, 42452, 42459, 42452, 42445, 42342, 42248, 42441, 42448, 42455, 42450, 42275, 42273, 42460, 42342, 42452, 42457, 42296, 42395, 42396, 42396, 42398, 42389, 42394, 42433, 42434, 42466, 42468};
    util.h.xy.dh.c Camera2StreamConfigurationMap;

    private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        int i2 = getHighSpeedVideoFpsRangesFor + 109;
        getHighSpeedVideoSizes = i2 % 128;
        byte[] bArr = str2;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getInputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 37) % 128;
                cArr2[i7] = (char) (cArr[i7] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr2 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 103) % 128;
            char[] cArr4 = new char[i4];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i4) {
                if (bArr2[maVar.f2631] == 1) {
                    int i8 = getHighSpeedVideoSizes + 55;
                    getHighSpeedVideoFpsRangesFor = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] % 5) >> c);
                    } else {
                        cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    }
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 69) % 128;
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i9 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                cArr6[maVar.f2631] = cArr3[(i4 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                int i10 = getHighSpeedVideoSizes + 63;
                getHighSpeedVideoFpsRangesFor = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] / iArr[2]);
                    i = maVar.f2631;
                } else {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                    i = maVar.f2631 + 1;
                }
                maVar.f2631 = i;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoFpsRanges + 85;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.mi mo26279 = this.Camera2StreamConfigurationMap.mo26279();
        if (i % 2 == 0) {
            return mo26279;
        }
        throw new java.lang.ArithmeticException();
    }

    private static util.h.xy.dj.rb getHighSpeedVideoSizes(util.h.xy.dh.mm mmVar) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        if (mmVar.m26327()) {
            return util.h.xy.dj.rb.m26396(mmVar, true);
        }
        util.h.xy.dj.rb m26396 = util.h.xy.dj.rb.m26396(mmVar, false);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 89) % 128;
        return m26396;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dh.c m26377() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 91) % 128;
        util.h.xy.dh.c cVar = this.Camera2StreamConfigurationMap;
        if (!(cVar instanceof util.h.xy.dh.mm)) {
            return util.h.xy.dj.rd.m26403(cVar);
        }
        int i2 = i + 41;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        util.h.xy.dh.mm mmVar = (util.h.xy.dh.mm) cVar;
        if (i2 % 2 != 0) {
            mmVar.m26330();
            throw null;
        }
        int m26330 = mmVar.m26330();
        if (m26330 == 1) {
            return util.h.xy.dj.e.m26367(mmVar, false);
        }
        if (m26330 == 2) {
            util.h.xy.dj.rb highSpeedVideoSizes = getHighSpeedVideoSizes(mmVar);
            int i3 = getHighSpeedVideoFpsRanges + 115;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                return highSpeedVideoSizes;
            }
            throw new java.lang.ArithmeticException();
        }
        if (m26330 == 3) {
            return util.h.xy.dj.rf.m26409(mmVar, false);
        }
        if (m26330 == 4) {
            return util.h.xy.dj.mf.m26391(mmVar, false);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{27, 11, 85, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", objArr);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.f m26378() {
        util.h.xy.dh.c cVar = this.Camera2StreamConfigurationMap;
        if (!(cVar instanceof util.h.xy.dh.mm)) {
            return util.h.xy.dj.rd.m26403(cVar).m26406();
        }
        int i = getHighSpeedVideoFpsRanges + 115;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.mm mmVar = (util.h.xy.dh.mm) cVar;
        if (i % 2 != 0) {
            mmVar.m26330();
            throw null;
        }
        int m26330 = mmVar.m26330();
        if (m26330 == 1) {
            return util.h.xy.dj.e.m26367(mmVar, false).m26369();
        }
        if (m26330 == 2) {
            util.h.xy.dh.f m26398 = getHighSpeedVideoSizes(mmVar).m26398();
            int i2 = getHighSpeedVideoFpsRanges + 103;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return m26398;
            }
            throw new java.lang.ArithmeticException();
        }
        if (m26330 == 3) {
            return util.h.xy.dj.rf.m26409(mmVar, false).m26412();
        }
        if (m26330 != 4) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{27, 11, 85, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dh.f fVar = new util.h.xy.dh.f(0L);
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 45;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return fVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dj.h m26376(java.lang.Object obj) {
        if (obj != null) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
            if (!(obj instanceof util.h.xy.dj.h)) {
                if (obj instanceof util.h.xy.dh.l) {
                    util.h.xy.dj.h hVar = new util.h.xy.dj.h((util.h.xy.dh.l) obj);
                    int i = getHighSpeedVideoFpsRanges + 67;
                    getHighResolutionOutputSizeshNQ4ISI = i % 128;
                    if (i % 2 == 0) {
                        return hVar;
                    }
                    throw new java.lang.ArithmeticException();
                }
                if (obj instanceof util.h.xy.dh.mm) {
                    return new util.h.xy.dj.h((util.h.xy.dh.mm) obj);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(true, new int[]{0, 27, 27, 15}, null, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (util.h.xy.dj.h) obj;
    }

    public h(util.h.xy.dh.mi miVar) {
        this.Camera2StreamConfigurationMap = miVar;
    }

    public h(util.h.xy.dj.rd rdVar) {
        this.Camera2StreamConfigurationMap = rdVar;
    }
}
