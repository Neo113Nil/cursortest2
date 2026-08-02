package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class g extends util.h.xy.dh.mh implements util.h.xy.dh.mc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 328772119;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int getInputFormats = 898933913;
    private static short[] getInputSizeshNQ4ISI = null;
    private static byte[] getOutputFormats = {com.visa.cbp.getEncExpo.startTransaction, -72, -102, -33, -114, 37, -113, -105, -40, -37, 35, 45, -9, -40, -37, -114, -117, -39, -40, Byte.MIN_VALUE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -44, 84, 39, com.google.common.base.Ascii.ESC, 126, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, Byte.MIN_VALUE, -115, -38, -107, 17, 86, -35, -116, 36, -117, 34, -59};
    private static int getOutputMinFrameDuration = -408873001;
    private util.h.xy.dh.c getHighSpeedVideoSizesFor;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 29) % 128;
        util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoSizesFor.mo26279();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 49) % 128;
        return mo26279;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.c m26374() {
        int i = Camera2StreamConfigurationMap + 87;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.dh.c cVar = this.getHighSpeedVideoSizesFor;
        if (cVar instanceof util.h.xy.dh.mm) {
            return util.h.xy.dh.rh.m26336((util.h.xy.dh.mm) cVar, false);
        }
        util.h.xy.dj.rc m26400 = util.h.xy.dj.rc.m26400(cVar);
        int i2 = getHighSpeedVideoFpsRangesFor + 83;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return m26400;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m26375() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 89;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.getHighSpeedVideoSizesFor instanceof util.h.xy.dh.mm;
        Camera2StreamConfigurationMap = (i + 117) % 128;
        return z;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dj.g m26373(java.lang.Object obj) {
        java.lang.StringBuilder sb;
        int i;
        boolean z;
        char c;
        int i2;
        int i3;
        if (obj == null || (obj instanceof util.h.xy.dj.g)) {
            return (util.h.xy.dj.g) obj;
        }
        if (obj instanceof util.h.xy.dj.rc) {
            return new util.h.xy.dj.g((util.h.xy.dj.rc) obj);
        }
        if (obj instanceof util.h.xy.dh.rh) {
            return new util.h.xy.dj.g((util.h.xy.dh.rh) obj);
        }
        if (obj instanceof util.h.xy.dh.mi) {
            return new util.h.xy.dj.g((util.h.xy.dh.mi) obj);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        short normalizeMetaState = (short) (android.view.KeyEvent.normalizeMetaState(0) + 86);
        byte packedPositionGroup = (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 80);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            int i4 = 768232639 - trimmedLength;
            int i5 = (-15) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int intValue = 197542522 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22);
            util.h.xz.b.me meVar = new util.h.xz.b.me();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            int i6 = i5 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
            boolean z2 = i6 == -1;
            if (z2) {
                byte[] bArr = getOutputFormats;
                if (bArr != null) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 41) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                        i7++;
                        length = length;
                        sb2 = sb2;
                    }
                    sb = sb2;
                    bArr = bArr2;
                } else {
                    sb = sb2;
                }
                i6 = bArr != null ? (byte) (((byte) (getOutputFormats[((int) (getInputFormats ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)))) : (short) (((short) (getInputSizeshNQ4ISI[((int) (getInputFormats ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            } else {
                sb = sb2;
            }
            if (i6 > 0) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (i8 + 53) % 128;
                int i9 = (int) (getInputFormats ^ (-2689713159175858216L));
                if (z2) {
                    getHighSpeedVideoSizes = (i8 + 21) % 128;
                    i = 1;
                } else {
                    i = 0;
                }
                meVar.f2647 = ((i4 + i6) - 2) + i9 + i;
                meVar.f2644 = (char) (intValue + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
                sb3.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                byte[] bArr3 = getOutputFormats;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
                    z = true;
                } else {
                    z = false;
                }
                int i11 = 1;
                while (true) {
                    meVar.f2645 = i11;
                    if (meVar.f2645 >= i6) {
                        break;
                    }
                    int i12 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoSizes = (i12 + 75) % 128;
                    if (z) {
                        int i13 = i12 + 9;
                        getHighSpeedVideoSizes = i13 % 128;
                        if (i13 % 2 == 0) {
                            byte[] bArr5 = getOutputFormats;
                            meVar.f2647 = meVar.f2647;
                            i3 = meVar.f2646 % (((byte) (((byte) (bArr5[r3] - 2689713159175858216L)) << normalizeMetaState)) ^ packedPositionGroup);
                            meVar.f2644 = (char) i3;
                            sb3.append(meVar.f2644);
                            meVar.f2646 = meVar.f2644;
                            i11 = meVar.f2645 + 1;
                        } else {
                            byte[] bArr6 = getOutputFormats;
                            meVar.f2647 = meVar.f2647 - 1;
                            byte b = (byte) (bArr6[r3] ^ (-2689713159175858216L));
                            c = meVar.f2646;
                            i2 = (byte) (b + normalizeMetaState);
                        }
                    } else {
                        short[] sArr = getInputSizeshNQ4ISI;
                        meVar.f2647 = meVar.f2647 - 1;
                        short s = (short) (sArr[r3] ^ (-2689713159175858216L));
                        c = meVar.f2646;
                        i2 = (short) (s + normalizeMetaState);
                    }
                    i3 = c + (i2 ^ packedPositionGroup);
                    meVar.f2644 = (char) i3;
                    sb3.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    i11 = meVar.f2645 + 1;
                }
            }
            objArr[0] = sb3.toString();
            java.lang.StringBuilder sb4 = sb;
            sb4.append(((java.lang.String) objArr[0]).intern());
            sb4.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb4.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public g(util.h.xy.dh.mi miVar) {
        this.getHighSpeedVideoSizesFor = miVar;
    }

    public g(util.h.xy.dh.rh rhVar) {
        this.getHighSpeedVideoSizesFor = new util.h.xy.dh.ag(false, 0, rhVar);
    }

    public g(util.h.xy.dj.rc rcVar) {
        this.getHighSpeedVideoSizesFor = rcVar;
    }
}
