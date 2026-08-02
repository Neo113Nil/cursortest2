package util.h.xy.bv;

/* loaded from: classes5.dex */
public class md extends util.h.xy.bv.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int[] getHighSpeedVideoFpsRangesFor = {-498571747, 892255865, 329351684, -109310916, -1094049064, -1766220830, 1840140297, 496010792, -216577433, -1628690120, -2006214598, -528191591, 1570143864, -319603414, -1555011107, -1013413431, 486262844, 1673075936};
    private static int getHighSpeedVideoSizes = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public md() {
        super(((java.lang.String) r3[0]).intern());
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{760918160, 1145527281, -902508045, 884058833, -328468832, -1685913123, -336105147, -1092296434, -73206256, -1565725866}, 19 - android.graphics.Color.blue(0), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00df, code lost:
    
        if (r3[0] != null) goto L14;
     */
    @Override // util.h.xy.bv.mb
    @util.h.xy.a.a
    /* renamed from: ˏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        util.h.xy.bv.e eVar = new util.h.xy.bv.e(rbVar.m25751());
        eVar.m25744(rbVar.m25745());
        eVar.m25748(rbVar.m25742());
        eVar.m25743(rbVar.m25749());
        eVar.m25746(rbVar.m25750());
        if (rbVar.m25745() != util.h.xy.bv.rb.ra.f1062) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{1939241889, -42622748, 457788303, 452312837, -984927403, -2028083505, 1595812729, 1219320101, 1243685214, 2118230284}, 19 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            return new util.h.xy.an.ra(eVar, false, ((java.lang.String) objArr[0]).intern());
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 111) % 128;
        try {
            java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{1739513232, -909800361, 1003151594, 700143807, -1387309554, -2017735879, 1717135420, 1492581750, 36523577, -327854976, -714130582, 723262280}, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, objArr2);
            byte[] mo25943 = util.h.xy.ck.ra.f1116.m25945().mo25943(util.h.xy.bx.ra.f1063.m25786(m25747.get(((java.lang.String) objArr2[0]).intern())));
            java.util.Map<java.lang.String, java.lang.String> m257472 = rbVar.m25747();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{1739513232, -909800361, 1003151594, 700143807, -1387309554, -2017735879, 1717135420, 1492581750, -824354350, 1189672294}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 18, objArr3);
            byte[] m25787 = util.h.xy.bx.ra.f1063.m25787(mo25943, util.h.xy.bx.ra.f1063.m25786(m257472.get(((java.lang.String) objArr3[0]).intern())));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{741526680, 525089131}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4, objArr4);
            byte[][] m25035 = util.h.xy.ao.mb.m25035(m25787, java.util.Collections.singletonList(((java.lang.String) objArr4[0]).intern()));
            if (m25035.length == 1) {
                int i = Camera2StreamConfigurationMap + 93;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 != 0) {
                    if (m25035[0] != null) {
                        eVar.m25689(util.h.xy.bx.ra.f1063.m25789(m25035[0]));
                        util.h.xy.ar.b.m25095(m25035[0]);
                        util.h.xy.ar.b.m25095(m25787);
                        util.h.xy.an.ra raVar = new util.h.xy.an.ra(eVar, true, null);
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 27) % 128;
                        return raVar;
                    }
                }
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{976432075, -1205729936, -1949986079, -1532087952, 912151735, -1079566287, -1393718236, 1586129347, -1427771195, -1276410601, -1008826855, -674472511, -1529464047, 1249211861, 741526680, 525089131}, 31 - android.view.MotionEvent.axisFromString(""), objArr5);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr5[0]).intern());
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | java.io.IOException | util.h.xy.ck.rc e) {
            e.getMessage();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-2083024323, -1003332878, 811856111, -2026775225, 1329456457, -1506654790, -493467809, -85486925, -567353562, -1281591921, 1336948746, 400819906, -1628717664, -1194369977, -487396836, 1182784808, -1853959106, -918767481, 1546400230, 822993421}, 40 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr6);
            return new util.h.xy.an.ra(eVar, false, ((java.lang.String) objArr6[0]).intern());
        }
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getHighSpeedVideoFpsRangesFor;
        if (iArr3 != null) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 49;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr2[i4] = (int) (iArr3[i4] ^ (-5569649899877129369L));
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 19) % 128;
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoFpsRangesFor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
            int i5 = 0;
            while (i5 < length3) {
                int i6 = getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI = (i6 + 99) % 128;
                iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
                i5++;
                getHighResolutionOutputSizeshNQ4ISI = (i6 + 21) % 128;
                length2 = length2;
            }
            i2 = length2;
            iArr5 = iArr6;
        } else {
            i2 = length2;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, i2);
        cVar.f2626 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i7 = 0; i7 < 16; i7++) {
                cVar.f2627 ^= iArr4[i7];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i8 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i8;
            }
            int i9 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i9;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i10 = cVar.f2627;
            int i11 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }
}
