package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class V5 extends android.os.Handler {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final java.lang.String A06;
    public final android.content.Context A00;
    public final com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final com.facebook.ads.redexgen.core.X9 A03;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -13, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 0, 19, com.google.common.base.Ascii.FF, 2, 10, 3, com.google.common.base.Ascii.GS, 9, 3, com.google.common.base.Ascii.ETB, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC4, 33, com.google.common.base.Ascii.NAK, 7, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, 5, 7, 33, com.google.common.base.Ascii.NAK, 6, com.google.common.base.Ascii.CR, 33, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.DLE};
        if (A05[5].length() == 23) {
            throw new java.lang.RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = com.facebook.ads.redexgen.core.V5.class.getSimpleName();
    }

    public V5(android.content.Context context, com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(android.os.Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = com.facebook.ads.redexgen.core.X9.A00();
        this.A01 = messageHandler;
    }

    public static android.os.Bundle A00() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new org.json.JSONObject().toString());
        return bundle;
    }

    private com.facebook.ads.redexgen.core.C1750id A01(com.facebook.ads.redexgen.core.C1746iY c1746iY, java.lang.String str) {
        com.facebook.ads.redexgen.core.C1750id c1750id = new com.facebook.ads.redexgen.core.C1750id(c1746iY, this.A03, str);
        c1750id.A0G(c1746iY.A0B(), c1746iY.A07());
        return c1750id;
    }

    private com.facebook.ads.redexgen.core.C1747iZ A02(com.facebook.ads.redexgen.core.C1731iI c1731iI, java.lang.String str) {
        com.facebook.ads.redexgen.core.C1747iZ c1747iZ = new com.facebook.ads.redexgen.core.C1747iZ(c1731iI, this.A03, str);
        c1747iZ.A0J(c1731iI.A05, c1731iI.A02, c1731iI.A08);
        return c1747iZ;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message msg) {
        java.lang.String str;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            android.os.Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    com.facebook.ads.redexgen.core.X9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            java.lang.String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            com.facebook.ads.redexgen.core.C1636gi A052 = com.facebook.ads.redexgen.core.C1009Rp.A05(this.A00, callingAppPackage);
            A052.A0F().AJS(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                str = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                str = null;
            }
            if (str == null) {
                if (messenger != null) {
                    com.facebook.ads.redexgen.core.X9.A00().A07(20, callingAppPackage, null, messenger);
                }
                A052.A0F().AHv();
                return;
            }
            switch (msg.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    com.facebook.ads.redexgen.core.V2 A042 = com.facebook.ads.redexgen.core.X9.A00().A04(callingAppPackage);
                    if (A042 == null) {
                        A042 = com.facebook.ads.redexgen.core.X9.A00().A05(callingAppPackage, messenger, str);
                    }
                    com.facebook.ads.redexgen.core.C1746iY intAdModel = com.facebook.ads.redexgen.core.OX.A04(A052, msg.getData(), str);
                    if (A042.A00 == null) {
                        A042.A00 = A01(intAdModel, callingAppPackage);
                    } else if (A042.A00 instanceof com.facebook.ads.redexgen.core.C1750id) {
                        ((com.facebook.ads.redexgen.core.C1750id) A042.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    com.facebook.ads.redexgen.core.X9.A00().A07(1011, callingAppPackage, A00(), messenger);
                    return;
                case 1012:
                case 2002:
                    com.facebook.ads.redexgen.core.X9.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    com.facebook.ads.redexgen.core.V2 A043 = com.facebook.ads.redexgen.core.X9.A00().A04(callingAppPackage);
                    if (A043 == null) {
                        A043 = com.facebook.ads.redexgen.core.X9.A00().A05(callingAppPackage, messenger, str);
                    }
                    com.facebook.ads.redexgen.core.C1731iI A053 = com.facebook.ads.redexgen.core.OX.A05(A052, msg.getData(), str);
                    if (A043.A00 == null) {
                        A043.A00 = A02(A053, callingAppPackage);
                    } else if (A043.A00 instanceof com.facebook.ads.redexgen.core.C1747iZ) {
                        com.facebook.ads.redexgen.core.C1747iZ c1747iZ = (com.facebook.ads.redexgen.core.C1747iZ) A043.A00;
                        java.lang.String adId = A053.A05;
                        c1747iZ.A0J(adId, A053.A02, A053.A08);
                    }
                    com.facebook.ads.redexgen.core.X9.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    com.facebook.ads.redexgen.core.OG A03 = com.facebook.ads.redexgen.core.X9.A00().A03(callingAppPackage);
                    if (A03 instanceof com.facebook.ads.redexgen.core.C1747iZ) {
                        com.facebook.ads.RewardData A01 = com.facebook.ads.redexgen.core.OY.A01(msg.getData());
                        com.facebook.ads.redexgen.core.C1747iZ c1747iZ2 = (com.facebook.ads.redexgen.core.C1747iZ) A03;
                        if (A01 != null) {
                            c1747iZ2.A0I(A01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (java.lang.Throwable th) {
            if (A05[5].length() == 23) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
