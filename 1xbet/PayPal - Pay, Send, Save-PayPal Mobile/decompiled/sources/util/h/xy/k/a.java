package util.h.xy.k;

/* loaded from: classes5.dex */
public class a {
    private static short[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static byte[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes = util.h.xy.k.a.class.getName();
        getInputFormats = (getHighSpeedVideoFpsRanges + 19) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26907(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int pressedStateDuration;
        int i;
        synchronized (util.h.xy.k.a.class) {
            android.content.Context applicationContext = util.h.xy.ag.a.m24556().m24558().getApplicationContext();
            util.h.xy.au.mf.m25169().m25180(null, false, applicationContext);
            util.h.xy.v.mb.m27670(applicationContext);
            util.h.xy.bu.d.m25655().m25659();
            try {
                util.h.xy.da.mc.m26263(applicationContext);
            } catch (util.h.xy.da.b unused) {
            }
            try {
                util.h.xy.ak.rc.f89.m25000();
            } catch (java.lang.Exception unused2) {
            }
            try {
                util.h.xy.n.rc.f2267.m26989();
            } catch (java.lang.Exception unused3) {
            }
            try {
                util.h.xy.by.b.f1066.m25793();
            } catch (java.lang.Exception unused4) {
            }
            try {
                util.h.xy.ak.a.f74.m24960();
            } catch (java.lang.Exception unused5) {
            }
            try {
                util.h.xy.n.mb.f2254.m26986();
            } catch (java.lang.Exception unused6) {
            }
            try {
                util.h.xy.by.mb.f1069.m25821();
            } catch (java.lang.Exception unused7) {
            }
            try {
                util.h.xy.ak.ra.f87.m24999();
            } catch (java.lang.Exception unused8) {
            }
            try {
                util.h.xy.by.ra.f1070.m25822();
            } catch (java.lang.Exception unused9) {
            }
            try {
                util.h.xy.n.ma.f2247.m26983();
            } catch (java.lang.Exception unused10) {
            }
            try {
                util.h.xy.ak.b.f76.m24962();
                util.h.xy.j.ma.f2241.m26898(null);
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused11) {
            }
            util.h.xy.t.mb.f2417.m27440();
            try {
                if (util.h.xy.ci.ra.m25931().m25934() == null) {
                    util.h.xy.ci.ra.m25931().m25936(applicationContext);
                }
                util.h.xy.ci.a.m25928().m25929();
                util.h.xy.by.ma.f1067.m25801();
                try {
                    util.h.xy.z.b.m27708(util.h.xy.ag.a.m24556().m24558()).m27710();
                } catch (java.lang.Exception unused12) {
                }
                if (util.h.xy.av.ra.m25237(applicationContext)) {
                    int i2 = getInputFormats + 39;
                    getHighSpeedVideoFpsRanges = i2 % 128;
                    if (i2 % 2 != 0) {
                        pressedStateDuration = (-2076463886) - (android.view.ViewConfiguration.getPressedStateDuration() - 76);
                        i = 115;
                    } else {
                        pressedStateDuration = (-2076463886) + (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                        i = -68;
                    }
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(pressedStateDuration, (short) (i - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (-32) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1215210789, objArr);
                        util.h.xy.av.ra.m25235(applicationContext, ((java.lang.String) objArr[0]).intern());
                        int i3 = getInputFormats + 119;
                        getHighSpeedVideoFpsRanges = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                util.h.xy.av.ra.m25229(applicationContext);
                if (z) {
                    android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                    util.h.xy.t.mb.f2417.m27466(m24558);
                    util.h.xy.by.ma.f1067.m25804(m24558);
                    util.h.xy.ak.b.f76.m24963(m24558);
                }
                util.h.xy.u.a.f2431.m27484();
                util.h.xy.u.c.m27498();
                util.h.xy.k.ra.f2243.m26943();
                util.h.xy.bw.b.m25780();
                util.h.xy.y.mb.m27701(util.h.xy.ag.a.m24556().m24558());
                try {
                    util.h.xy.p.mb.m27038();
                } catch (java.lang.Exception unused13) {
                }
                try {
                    util.h.xy.g.c.m26868();
                    getHighSpeedVideoFpsRanges = (getInputFormats + 9) % 128;
                } catch (java.lang.Exception unused14) {
                }
                util.h.xy.p.ra.m27048();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 2076463880, (short) (84 - android.view.KeyEvent.getDeadChar(0, 0)), (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (-33) - android.graphics.Color.green(0), (-1215210832) - android.text.TextUtils.getTrimmedLength(""), objArr2);
                util.h.xy.p.ra.m27052(((java.lang.String) objArr2[0]).intern());
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-2076463880) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (83 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-33) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (-1231988048) - android.graphics.Color.rgb(0, 0, 0), objArr3);
                util.h.xy.p.ra.m27047(((java.lang.String) objArr3[0]).intern());
                util.h.xy.ak.ma.f84.m24990();
                getInputFormats = (getHighSpeedVideoFpsRanges + 111) % 128;
            } catch (java.lang.Exception e) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-2076463942) - android.graphics.ImageFormat.getBitsPerPixel(0), (short) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 82), (byte) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 17 - android.graphics.Color.green(0), (-1215210816) - android.text.TextUtils.indexOf("", ""), objArr4);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr4[0]).intern(), e);
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            byte[] bArr = getInputSizeshNQ4ISI;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 59) % 128;
                i5 = (byte) (((byte) (getInputSizeshNQ4ISI[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (Camera2StreamConfigurationMap[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            int i7 = (int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L));
            if (z2) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 83) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getInputSizeshNQ4ISI;
            if (bArr3 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 95) % 128;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i8 = 0;
                while (i8 < length2) {
                    bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                    i8++;
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                z = true;
            } else {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = getInputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = Camera2StreamConfigurationMap;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = -1671084899;
        getOutputMinFrameDuration = -408872961;
        getOutputFormats = -1345342882;
        getInputSizeshNQ4ISI = new byte[]{-60, -119, -99, -125, -98, -114, -122, -99, 124, -34, -118, -123, -25, -117, -113, -113, 86, -62, -99, 124, -38, -118, 89, -85, -100, -33, -121, -120, -121, -106, -109, -125, 77, -43, -120, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.registerForActivityResult, -115, -107, -117, 125, -43, -97, -127, -100, 113, -37, -107, 126, -42, -119, -109, -115, -126, -75, -99, -101, -26, -25, -117, -111, 118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 117, com.visa.cbp.getEncExpo.IResultReceiver, 124, -40, -40, -40};
    }
}
