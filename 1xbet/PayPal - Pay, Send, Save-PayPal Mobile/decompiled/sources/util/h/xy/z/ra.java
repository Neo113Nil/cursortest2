package util.h.xy.z;

/* loaded from: classes5.dex */
public class ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final java.lang.String f2622 = "util.h.xy.z.ra";

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 95) + (i | 95);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.db.a m27719() {
        util.h.xy.db.a aVar = new util.h.xy.db.a() { // from class: util.h.xy.z.ra.5
            private static byte[] Camera2StreamConfigurationMap = {32, -80, 69, -72, 67, 65, -93, -67, -77, 92, -80, 92, 107, -5, 75, 69, -71, -77, 92, -80, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.VT, -125, -91, 91, -71};
            private static int getHighResolutionOutputSizeshNQ4ISI = -408872966;
            private static short[] getHighSpeedVideoFpsRanges = null;
            private static int getHighSpeedVideoFpsRangesFor = 1894742639;
            private static int getHighSpeedVideoSizes = 0;
            private static int getOutputFormats = 1;
            private static int getOutputMinFrameDuration = -1329090571;

            @Override // util.h.xy.db.a
            /* renamed from: ˏ */
            public final byte[] mo26125() {
                getHighSpeedVideoSizes = (getOutputFormats + 81) % 128;
                try {
                    byte[] m24548 = util.h.xy.ad.a.m24548(util.h.xy.z.mb.m27715());
                    int i = getOutputFormats + 47;
                    getHighSpeedVideoSizes = i % 128;
                    if (i % 2 == 0) {
                        return m24548;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Exception e) {
                    java.lang.String str = util.h.xy.z.ra.f2622;
                    e.getMessage();
                    try {
                        int i2 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                        int identityHashCode = java.lang.System.identityHashCode(this);
                        int i3 = (i2 ^ (-1466349613)) | (i2 & (-1466349613));
                        int i4 = (i2 * 503) + 1160519573 + (i3 * (-502));
                        int i5 = ~i2;
                        int i6 = ~identityHashCode;
                        int i7 = (i6 ^ i5) | (i5 & i6);
                        int i8 = (~(i5 | 1466349612)) | (~i7);
                        int i9 = ~(identityHashCode | i3);
                        int i10 = -(-(((i8 ^ i9) | (i8 & i9)) * (-502)));
                        int i11 = ~((-1466349613) | i7);
                        short normalizeMetaState = (short) android.view.KeyEvent.normalizeMetaState(0);
                        int i12 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                        int identityHashCode2 = java.lang.System.identityHashCode(this);
                        int i13 = ~identityHashCode2;
                        int i14 = ~((i13 & (-107)) | (i13 ^ (-107)));
                        int i15 = ((((i12 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + 55640) + (((i14 ^ i12) | (i14 & i12)) * (-1042))) - (~(-(-(((identityHashCode2 ^ (-107)) | (identityHashCode2 & (-107))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))))) - 1;
                        int i16 = ~i12;
                        int i17 = ~(i16 | 106);
                        int i18 = ~((identityHashCode2 ^ i16) | (i16 & identityHashCode2));
                        int i19 = (i18 ^ i17) | (i18 & i17);
                        int i20 = ~((i12 ^ i13) | (i12 & i13) | (-107));
                        int i21 = -(-(((i20 ^ i19) | (i20 & i19)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                        byte b = (byte) ((i15 & i21) + (i21 | i15));
                        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                        int identityHashCode3 = java.lang.System.identityHashCode(this);
                        int i22 = combineMeasuredStates * (-167);
                        int i23 = ~combineMeasuredStates;
                        int i24 = ~identityHashCode3;
                        int i25 = (i23 ^ 34) | (i23 & 34);
                        int i26 = -(-((~(i25 | identityHashCode3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                        int i27 = ~(i24 | i23);
                        int i28 = ~(i23 | (-35));
                        int i29 = (i28 & i27) | (i28 ^ i27);
                        int i30 = combineMeasuredStates | 34;
                        int i31 = ~((i30 ^ identityHashCode3) | (i30 & identityHashCode3));
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((((i4 | i10) << 1) - (i10 ^ i4)) + (((i11 & i9) | (i9 ^ i11)) * 502), normalizeMetaState, b, ((((((i22 | 5845) << 1) - (i22 ^ 5845)) + (((~i25) | (~((i24 & 34) | (i24 ^ 34)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) - (~i26)) - 1) + (((i31 & i29) | (i29 ^ i31)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), 1756467890 - (~(-(-android.graphics.Color.green(0)))), objArr);
                        byte[] bArr = new byte[37];
                        ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
                        return util.h.xy.ad.a.m24548(bArr);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }

            private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = i2 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L)));
                int i5 = i4 == -1 ? 1 : 0;
                if (i5 != 0) {
                    byte[] bArr = Camera2StreamConfigurationMap;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        i4 = (byte) (((byte) (Camera2StreamConfigurationMap[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
                    } else {
                        i4 = (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
                    }
                }
                if (i4 > 0) {
                    meVar.f2647 = ((i + i4) - 2) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i5;
                    meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr3 = Camera2StreamConfigurationMap;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i7 = 0; i7 < length2; i7++) {
                            bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                        }
                        bArr3 = bArr4;
                    }
                    boolean z = bArr3 != null;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i4) {
                        if (z) {
                            byte[] bArr5 = Camera2StreamConfigurationMap;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = getHighSpeedVideoFpsRanges;
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
        };
        int i = getHighSpeedVideoFpsRangesFor + 95;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.db.a m27720() {
        util.h.xy.db.a aVar = new util.h.xy.db.a() { // from class: util.h.xy.z.ra.4
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static long getHighSpeedVideoSizes = -2781884523705434062L;

            private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
                char[] charArray = str.toCharArray();
                util.h.xz.b.a aVar2 = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
                aVar2.f2623 = 4;
                while (aVar2.f2623 < m27721.length) {
                    aVar2.f2624 = aVar2.f2623 - 4;
                    m27721[aVar2.f2623] = (char) ((m27721[aVar2.f2623] ^ m27721[aVar2.f2623 % 4]) ^ (aVar2.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
                    aVar2.f2623++;
                }
                objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // util.h.xy.db.a
            /* renamed from: ˏ */
            public final byte[] mo26125() {
                int i = getHighSpeedVideoFpsRanges + 121;
                Camera2StreamConfigurationMap = i % 128;
                try {
                    if (i % 2 != 0) {
                        return util.h.xy.ad.a.m24548(util.h.xy.z.mb.m27712());
                    }
                    util.h.xy.ad.a.m24548(util.h.xy.z.mb.m27712());
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Exception e) {
                    java.lang.String str = util.h.xy.z.ra.f2622;
                    e.getMessage();
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("㼦㽌⧺冁痦薤侳➜\udf60焋啝ݦﾃᅢ㓉曙鹧ゆᒛ䙐뻥퀵\uf402\ua638嵼\uf3b9ퟶ薁紹錝", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                        byte[] bArr = new byte[37];
                        ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
                        byte[] m24548 = util.h.xy.ad.a.m24548(bArr);
                        int i2 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = (((i2 | 1) << 1) - (i2 ^ 1)) % 128;
                        return m24548;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
        };
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 21) << 1) - (i ^ 21);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }
}
