package com.facetec.sdk;

/* loaded from: classes8.dex */
abstract class bl extends com.facetec.sdk.bf implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, com.facetec.sdk.dh.c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static char[] aM;
    private static boolean aN;
    private static int aO;
    private static int aP;
    private static boolean aQ;
    private static int aT;
    com.facetec.sdk.FaceTecSessionResult B;
    java.lang.String D;
    android.graphics.Bitmap E;
    protected boolean G;
    private volatile com.facetec.sdk.ck J;
    android.widget.ImageView K;
    com.facetec.sdk.db L;
    android.view.View M;
    com.facetec.sdk.cf N;
    private volatile byte[] O;
    private volatile byte[][] P;
    private volatile byte[][] Q;
    private volatile com.facetec.sdk.a R;
    private volatile com.facetec.sdk.bt S;
    private volatile com.facetec.sdk.dj W;
    private com.facetec.sdk.FaceTecIDScanResult aB;
    private java.util.Timer aC;
    private java.util.TimerTask aE;
    private java.util.TimerTask aF;
    private java.util.Timer aG;
    private com.facetec.sdk.cu aJ;
    private com.facetec.sdk.ai ak;
    private android.widget.RelativeLayout an;
    private android.view.View ao;
    private int aq;
    private android.widget.RelativeLayout as;
    private android.widget.RelativeLayout au;
    private android.widget.RelativeLayout av;
    private android.widget.LinearLayout aw;
    private java.lang.String ax;
    private volatile com.facetec.sdk.az e;
    volatile com.facetec.sdk.cx f;
    private volatile com.facetec.sdk.da i;
    volatile com.facetec.sdk.bx j;
    float k;
    java.lang.String l;
    float m;

    /* renamed from: o, reason: collision with root package name */
    com.facetec.sdk.m f3428o;
    com.facetec.sdk.ce q;
    android.widget.RelativeLayout u;
    android.view.View v;
    android.widget.RelativeLayout w;
    android.widget.ImageView x;
    android.widget.RelativeLayout y;
    com.facetec.sdk.bw z;
    private boolean U = false;
    private boolean T = false;
    private boolean X = false;
    private boolean V = false;
    private boolean ac = false;
    private boolean aa = false;
    private boolean Z = false;
    private boolean ab = false;
    private boolean Y = false;
    private boolean ad = false;
    private boolean ag = false;
    private boolean af = false;
    private boolean ae = false;
    boolean g = false;
    java.lang.String h = "";
    boolean n = false;
    private boolean ah = false;
    private boolean am = false;
    private boolean al = false;
    private boolean ai = false;
    private boolean aj = false;
    boolean t = false;
    int p = 0;
    boolean s = false;
    private boolean ap = false;
    private boolean ar = false;
    boolean r = false;
    private boolean at = false;
    private boolean ay = false;
    private int az = 0;
    com.facetec.sdk.FaceTecIDScanNextStep C = com.facetec.sdk.FaceTecIDScanNextStep.SELECTION_SCREEN;
    private com.facetec.sdk.bq aA = new com.facetec.sdk.bq();
    boolean A = false;
    private org.json.JSONObject aD = null;
    boolean I = false;
    boolean F = false;
    private com.facetec.sdk.da.c aL = com.facetec.sdk.da.c.DEFAULT;
    com.facetec.sdk.bl.d H = com.facetec.sdk.bl.d.NOT_STARTED;
    private boolean aK = false;
    private final java.lang.Object aH = new java.lang.Object();
    private boolean aI = false;

    @java.lang.FunctionalInterface
    interface c {
        byte[] getIdScanBytes(java.lang.String str);
    }

    enum d {
        NOT_STARTED,
        PRE_SESSION_STARTED,
        FACESCAN_SESSION_STARTED
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$g(int i, byte b, short s) {
        int i2;
        byte[] bArr = $$c;
        int i3 = 4 - (i * 4);
        int i4 = s * 2;
        int i5 = 122 - b;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3++;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i4) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i3];
            i2++;
            i3++;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aW(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 2;
        int i4 = s2 + 97;
        int i5 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 = (-i4) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5++;
            i7 = i4;
            i4 = bArr[i5];
            i4 = (-i4) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static void aY(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3 = 21 - (b * 17);
        int i4 = i2 + 99;
        int i5 = i * 17;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[18 - i5];
        int i6 = 17 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i4 = i6 + (-i4) + 3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                int i8 = bArr[i3];
                i3++;
                i4 = i4 + (-i8) + 3;
            }
        }
    }

    public static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i2;
        int i9 = ~i3;
        int i10 = ~i6;
        int i11 = (~(i8 | i6)) | (~(i9 | i10 | i2));
        int i12 = (~(i6 | i9 | i2)) | (~(i10 | i8));
        int i13 = ~(i8 | i9);
        int i14 = i3 + i2 + i + (762713021 * i4) + (1579510587 * i5);
        int i15 = i14 * i14;
        int i16 = ((i3 * (-1364308824)) - 1074288667) + ((-1364308824) * i2) + (i11 * 659) + (i12 * 659) + (i13 * 659) + ((-1364308165) * i) + ((-893132913) * i4) + (986770329 * i5) + ((-1162149888) * i15);
        switch (((i3 * (-1846875272)) - 1480523776) + (i2 * (-1846875272)) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + (i13 * (-1613556599)) + (i * 834535424) + (i4 * (-750387200)) + (i5 * (-523632640)) + (i15 * (-1971257344)) + (i16 * i16 * (-1529413632))) {
            case 1:
                com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
                aO = (aT + 19) % 128;
                blVar.R();
                aT = (aO + 101) % 128;
                return null;
            case 2:
                return e(objArr);
            case 3:
                return c(objArr);
            case 4:
                return a(objArr);
            case 5:
                return d(objArr);
            case 6:
                return j(objArr);
            case 7:
                return g(objArr);
            case 8:
                return i(objArr);
            case 9:
                return h(objArr);
            case 10:
                return f(objArr);
            case 11:
                return l(objArr);
            case 12:
                return m(objArr);
            case 13:
                final com.facetec.sdk.bl blVar2 = (com.facetec.sdk.bl) objArr[0];
                final com.facetec.sdk.bl.c cVar = (com.facetec.sdk.bl.c) objArr[1];
                final java.lang.String obj = java.util.UUID.randomUUID().toString();
                blVar2.aB = new com.facetec.sdk.FaceTecIDScanResult(com.facetec.sdk.FaceTecIDScanStatus.SUCCESS);
                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.a(obj, cVar);
                    }
                }).d(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda28
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aj();
                    }
                });
                aO = (aT + 17) % 128;
                return null;
            case 14:
                com.facetec.sdk.bl blVar3 = (com.facetec.sdk.bl) objArr[0];
                aT = (aO + 37) % 128;
                blVar3.V = true;
                blVar3.ak.d();
                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.by.c();
                    }
                });
                aT = (aO + 53) % 128;
                return null;
            case 15:
                com.facetec.sdk.bl blVar4 = (com.facetec.sdk.bl) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                com.facetec.sdk.t.b bVar = (com.facetec.sdk.t.b) objArr[2];
                com.facetec.sdk.cn cnVar = blVar4.f3415a;
                if (cnVar != null) {
                    aT = (aO + 11) % 128;
                    if (cnVar.d.e()) {
                        cnVar.g();
                    }
                }
                com.facetec.sdk.m mVar = blVar4.f3428o;
                if (mVar != null) {
                    aO = (aT + 117) % 128;
                    mVar.d(str, bVar);
                }
                return null;
            case 16:
                return k(objArr);
            case 17:
                return o(objArr);
            case 18:
                android.view.View view = (android.view.View) objArr[0];
                androidx.core.view.WindowInsetsCompat windowInsetsCompat = (androidx.core.view.WindowInsetsCompat) objArr[1];
                aT = (aO + 29) % 128;
                androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = insets.top;
                marginLayoutParams.leftMargin = insets.left;
                marginLayoutParams.bottomMargin = insets.bottom;
                marginLayoutParams.rightMargin = insets.right;
                view.setLayoutParams(marginLayoutParams);
                androidx.core.view.WindowInsetsCompat windowInsetsCompat2 = androidx.core.view.WindowInsetsCompat.CONSUMED;
                aT = (aO + 35) % 128;
                return windowInsetsCompat2;
            case 19:
                return n(objArr);
            case 20:
                return t(objArr);
            case 21:
                return r(objArr);
            case 22:
                return s(objArr);
            case 23:
                return p(objArr);
            case 24:
                return q(objArr);
            case 25:
                return x(objArr);
            case 26:
                final com.facetec.sdk.bl blVar5 = (com.facetec.sdk.bl) objArr[0];
                int i17 = aO;
                aT = (i17 + 11) % 128;
                if (blVar5.ah) {
                    return null;
                }
                blVar5.ah = true;
                if (blVar5.g) {
                    aT = (i17 + 115) % 128;
                    i7 = 50;
                } else {
                    i7 = 400;
                }
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aI();
                    }
                }, i7);
                return null;
            default:
                return b(objArr);
        }
    }

    static void init$0() {
        $$a = new byte[]{67, -46, 57, -86};
        $$b = 68;
    }

    static void init$1() {
        $$d = new byte[]{88, 37, 32, 7, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -12};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
    }

    static void init$2() {
        $$c = new byte[]{107, 68, 103, -87};
        $$f = 153;
    }

    bl() {
    }

    private static void aX(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        long j;
        java.lang.String str3 = str2;
        int i2 = 2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i3 = $11 + 23;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str3.getBytes("ISO-8859-1");
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i4 = $11 + 27;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
        char[] cArr3 = aM;
        int i5 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 43;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i5] = java.lang.Integer.valueOf(cArr3[i6]);
                        java.lang.Object d2 = com.facetec.sdk.al.d(484843984);
                        if (d2 == null) {
                            char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i5);
                            int indexOf = android.text.TextUtils.indexOf("", "", i5);
                            byte b = (byte) i5;
                            java.lang.String $$g = $$g(b, (byte) (b | 57), b);
                            java.lang.Class[] clsArr = new java.lang.Class[1];
                            clsArr[i5] = java.lang.Integer.TYPE;
                            d2 = com.facetec.sdk.al.c(maximumFlingVelocity, 1811 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 23 - indexOf, -1157014744, false, $$g, clsArr);
                        }
                        cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    objArr3[i5] = java.lang.Integer.valueOf(cArr3[i6]);
                    java.lang.Object d3 = com.facetec.sdk.al.d(484843984);
                    if (d3 == null) {
                        byte b2 = (byte) i5;
                        d3 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.makeMeasureSpec(i5, i5), 1811 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.view.KeyEvent.keyCodeFromString("") + 23, -1157014744, false, $$g(b2, (byte) (b2 | 57), b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i2 = 2;
                i5 = 0;
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(aP)};
        java.lang.Object d4 = com.facetec.sdk.al.d(-1796435875);
        if (d4 == null) {
            byte b3 = (byte) 0;
            d4 = com.facetec.sdk.al.c((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 662 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24, 855894693, false, $$g(b3, (byte) (b3 | 56), b3), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue();
        if (aN) {
            hnVar.c = bArr2.length;
            char[] cArr5 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                int i8 = $10 + 85;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr5[hnVar.f3629a] = (char) (cArr3[bArr2[(hnVar.c << 1) >> hnVar.f3629a] * i] % intValue);
                    java.lang.Object[] objArr5 = {hnVar, hnVar};
                    java.lang.Object d5 = com.facetec.sdk.al.d(870267758);
                    if (d5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        d5 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.Color.red(0) + 1236, 24 - android.graphics.Color.blue(0), -1808776810, false, $$g(b4, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                } else {
                    cArr5[hnVar.f3629a] = (char) (cArr3[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i] - intValue);
                    java.lang.Object[] objArr6 = {hnVar, hnVar};
                    java.lang.Object d6 = com.facetec.sdk.al.d(870267758);
                    if (d6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        d6 = com.facetec.sdk.al.c((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1236 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 24, -1808776810, false, $$g(b6, b7, b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d6).invoke(null, objArr6);
                }
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        int i9 = 0;
        if (aQ) {
            hnVar.c = cArr2.length;
            char[] cArr6 = new char[hnVar.c];
            hnVar.f3629a = 0;
            $10 = ($11 + 65) % 128;
            while (hnVar.f3629a < hnVar.c) {
                int i10 = $11 + 45;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr6[hnVar.f3629a] = (char) (cArr3[cArr2[hnVar.c >> hnVar.f3629a] >>> i] % intValue);
                    java.lang.Object[] objArr7 = {hnVar, hnVar};
                    java.lang.Object d7 = com.facetec.sdk.al.d(870267758);
                    if (d7 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        d7 = com.facetec.sdk.al.c((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1236 - android.view.View.resolveSize(0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 24, -1808776810, false, $$g(b8, b9, b9), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d7).invoke(null, objArr7);
                    j = 0;
                } else {
                    cArr6[hnVar.f3629a] = (char) (cArr3[cArr2[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
                    java.lang.Object[] objArr8 = {hnVar, hnVar};
                    java.lang.Object d8 = com.facetec.sdk.al.d(870267758);
                    if (d8 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        j = 0;
                        d8 = com.facetec.sdk.al.c((char) android.graphics.Color.blue(0), 1236 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, -1808776810, false, $$g(b10, b11, b11), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    } else {
                        j = 0;
                    }
                    ((java.lang.reflect.Method) d8).invoke(null, objArr8);
                }
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        hnVar.c = iArr.length;
        char[] cArr7 = new char[hnVar.c];
        while (true) {
            hnVar.f3629a = i9;
            if (hnVar.f3629a >= hnVar.c) {
                objArr[0] = new java.lang.String(cArr7);
                return;
            } else {
                $10 = ($11 + 15) % 128;
                cArr7[hnVar.f3629a] = (char) (cArr3[iArr[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
                i9 = hnVar.f3629a + 1;
            }
        }
    }

    private boolean E() {
        synchronized (this) {
            int i = aT;
            int i2 = i + 115;
            aO = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!this.T) {
                int i3 = i + 47;
                aO = i3 % 128;
                if (i3 % 2 != 0) {
                    isFinishing();
                    throw null;
                }
                if (!isFinishing()) {
                    int i4 = aT + 1;
                    aO = i4 % 128;
                    if (i4 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
            }
            return true;
        }
    }

    private boolean F() {
        if (isFinishing()) {
            return true;
        }
        aT = (aO + 11) % 128;
        if (!hasWindowFocus()) {
            return true;
        }
        int i = aT + 63;
        aO = i % 128;
        if (i % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x036c A[Catch: all -> 0x0443, av -> 0x046e, ak -> 0x0499, TRY_ENTER, TryCatch #4 {ak -> 0x0499, blocks: (B:54:0x016d, B:56:0x01a4, B:57:0x01bf, B:59:0x0216, B:60:0x021f, B:62:0x0227, B:66:0x023f, B:73:0x025e, B:80:0x027a, B:81:0x0292, B:83:0x02b6, B:86:0x02c2, B:88:0x02c6, B:89:0x02dd, B:92:0x02d2, B:93:0x02e4, B:94:0x02ec, B:96:0x0305, B:98:0x0309, B:101:0x0315, B:108:0x0333, B:111:0x0341, B:112:0x034d, B:113:0x034e, B:116:0x02f1, B:117:0x02f4, B:118:0x02f7, B:119:0x02fa, B:120:0x02fd, B:121:0x0300, B:122:0x0303, B:123:0x036c, B:125:0x03e2, B:126:0x03e9, B:129:0x0407, B:132:0x0413, B:137:0x0428, B:138:0x0433, B:139:0x0440, B:142:0x03e6, B:144:0x0274, B:145:0x0259, B:146:0x025c, B:148:0x023d, B:149:0x021d, B:150:0x01b4), top: B:53:0x016d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b6 A[Catch: all -> 0x0443, av -> 0x046e, ak -> 0x0499, TRY_LEAVE, TryCatch #4 {ak -> 0x0499, blocks: (B:54:0x016d, B:56:0x01a4, B:57:0x01bf, B:59:0x0216, B:60:0x021f, B:62:0x0227, B:66:0x023f, B:73:0x025e, B:80:0x027a, B:81:0x0292, B:83:0x02b6, B:86:0x02c2, B:88:0x02c6, B:89:0x02dd, B:92:0x02d2, B:93:0x02e4, B:94:0x02ec, B:96:0x0305, B:98:0x0309, B:101:0x0315, B:108:0x0333, B:111:0x0341, B:112:0x034d, B:113:0x034e, B:116:0x02f1, B:117:0x02f4, B:118:0x02f7, B:119:0x02fa, B:120:0x02fd, B:121:0x0300, B:122:0x0303, B:123:0x036c, B:125:0x03e2, B:126:0x03e9, B:129:0x0407, B:132:0x0413, B:137:0x0428, B:138:0x0433, B:139:0x0440, B:142:0x03e6, B:144:0x0274, B:145:0x0259, B:146:0x025c, B:148:0x023d, B:149:0x021d, B:150:0x01b4), top: B:53:0x016d, outer: #1 }] */
    @Override // com.facetec.sdk.bf, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(android.os.Bundle bundle) {
        int i;
        boolean z;
        com.facetec.sdk.FaceTecSDKStatus faceTecSDKStatus;
        com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus;
        java.lang.String obj;
        synchronized (this) {
            java.lang.Object obj2 = null;
            super.onCreate(null);
            if (bundle != null) {
                setResult(0);
                finish();
                return;
            }
            this.N = new com.facetec.sdk.cf(this);
            if (android.os.Build.VERSION.SDK_INT != 26) {
                setRequestedOrientation(12);
            }
            com.facetec.sdk.dl.d(this);
            if (com.facetec.sdk.dp.d) {
                com.facetec.sdk.dp.a(this);
            }
            com.facetec.sdk.dm.bt();
            this.g = getIntent().getBooleanExtra("facetec.idScanOnlyMode", false);
            if (com.facetec.sdk.FaceTecSessionActivity.e == null && !this.g) {
                aO = (aT + 39) % 128;
                com.facetec.sdk.at.a("FaceTecSessionActivity must be launched with the constructor FaceTecSDK.createAndLaunchSession(...).");
                setResult(0);
                finish();
                return;
            }
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.FULL_SESSION_START, (java.lang.String) null, (java.lang.Throwable) null);
            android.view.Window window = getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            if (!com.facetec.sdk.FaceTecSDK.f3366a.d) {
                getWindow().addFlags(8192);
            }
            if (com.facetec.sdk.FaceTecCustomization.activityThemeId != 0) {
                setTheme(com.facetec.sdk.FaceTecCustomization.activityThemeId);
            }
            java.lang.String stringExtra = getIntent().getStringExtra("facetec.serverSessionToken");
            this.h = stringExtra;
            java.lang.String trim = stringExtra != null ? stringExtra.trim() : "";
            this.h = trim;
            if (trim.isEmpty()) {
                int i2 = aT + 37;
                aO = i2 % 128;
                if (i2 % 2 == 0) {
                    a(com.facetec.sdk.FaceTecSessionStatus.SESSION_EXPIRED, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    return;
                } else {
                    a(com.facetec.sdk.FaceTecSessionStatus.SESSION_EXPIRED, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    throw null;
                }
            }
            setContentView(com.facetec.sdk.R.layout.facetec_main_activity);
            if (com.facetec.sdk.bj.c()) {
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
                com.facetec.sdk.cu cuVar = new com.facetec.sdk.cu(this);
                this.aJ = cuVar;
                registerReceiver(cuVar, intentFilter);
            }
            this.aq = com.facetec.sdk.R.id.signupContainer;
            this.ao = findViewById(com.facetec.sdk.R.id.ftMainLayout);
            this.an = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.contentLayout);
            this.v = findViewById(com.facetec.sdk.R.id.frameShadowView);
            this.u = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.outerContainer);
            this.av = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.faceScanCameraContainer);
            this.y = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.faceScanCameraTransitionView);
            this.au = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.faceScanCameraLayout);
            this.as = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.signupContainer);
            this.w = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.borderCover);
            this.aw = (android.widget.LinearLayout) findViewById(com.facetec.sdk.R.id.brandingLogoContainer);
            this.K = (android.widget.ImageView) findViewById(com.facetec.sdk.R.id.brandingLogoBottom);
            this.M = findViewById(com.facetec.sdk.R.id.overlayBackgroundView);
            setTitle(" ");
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this.an, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda54
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                        androidx.core.view.WindowInsetsCompat a2;
                        a2 = com.facetec.sdk.bl.a(view, windowInsetsCompat);
                        return a2;
                    }
                });
            }
            this.ao.setAccessibilityDelegate(new android.view.View.AccessibilityDelegate() { // from class: com.facetec.sdk.bl.2
                @Override // android.view.View.AccessibilityDelegate
                public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                    com.facetec.sdk.eb.e(accessibilityEvent.toString());
                    return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }
            });
            try {
                try {
                    com.facetec.sdk.FaceTecSDK.setCustomization(com.facetec.sdk.dm.a(com.facetec.sdk.FaceTecSDK.f3366a));
                    com.facetec.sdk.bo.c = com.facetec.sdk.FaceTecSDK.f3366a.g.subtextFont;
                    android.graphics.Typeface typeface = com.facetec.sdk.FaceTecSDK.f3366a.g.buttonFont;
                    com.facetec.sdk.bo.b = com.facetec.sdk.FaceTecSDK.f3366a.g.headerFont;
                    this.d = (android.widget.RelativeLayout) findViewById(com.facetec.sdk.R.id.backgroundCover);
                    this.d.setAlpha(0.0f);
                    if (com.facetec.sdk.FaceTecSDK.f3366a.n.backgroundColor == 0) {
                        this.d.setBackgroundColor(getResources().getColor(com.facetec.sdk.R.color.facetec_outline_shadow_dark));
                    } else {
                        this.d.setBackgroundColor(com.facetec.sdk.FaceTecSDK.f3366a.n.backgroundColor);
                    }
                    this.c = findViewById(com.facetec.sdk.R.id.backgroundColor);
                    com.facetec.sdk.dm.e(findViewById(com.facetec.sdk.R.id.backgroundColor));
                    this.b = new android.os.Handler();
                    this.W = new com.facetec.sdk.dj(this);
                    int intValue = ((java.lang.Integer) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1872583944, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[0], com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1872583935)).intValue();
                    int aS = com.facetec.sdk.dm.aS();
                    int i3 = com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage != 0 ? com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage : com.facetec.sdk.R.drawable.facetec_your_app_logo;
                    if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.customImage != 0) {
                        i = com.facetec.sdk.FaceTecSDK.f3366a.f3361o.customImage;
                        int i4 = aT + 21;
                        aO = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 4 / 5;
                        }
                    } else {
                        i = com.facetec.sdk.R.drawable.facetec_cancel;
                    }
                    if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
                        int i6 = aT + 9;
                        aO = i6 % 128;
                        if (i6 % 2 != 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        if (i == 0) {
                            z = true;
                            if (com.facetec.sdk.FaceTecSessionActivity.e != null && (aS == 0 || i3 == 0)) {
                                z = true;
                            }
                            if (intValue == 0 || z) {
                                aT = (aO + 71) % 128;
                                a(com.facetec.sdk.FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES, (com.facetec.sdk.FaceTecIDScanStatus) null);
                            } else {
                                com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenIdealImage = intValue;
                                com.facetec.sdk.FaceTecSDK.f3366a.g.cameraPermissionsScreenImage = aS;
                                com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage = i3;
                                com.facetec.sdk.FaceTecSDK.f3366a.f3361o.customImage = i;
                            }
                            faceTecSDKStatus = (com.facetec.sdk.FaceTecSDKStatus) com.facetec.sdk.bj.e(new java.lang.Object[]{this}, -1332564622, 1332564630, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
                            if (faceTecSDKStatus == com.facetec.sdk.FaceTecSDKStatus.INITIALIZED) {
                                com.facetec.sdk.eb.d(this);
                                this.f3415a = com.facetec.sdk.cn.c((android.app.Activity) this);
                                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda56
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.facetec.sdk.bl.this.aZ();
                                    }
                                });
                                this.f3428o = new com.facetec.sdk.m(this);
                                com.facetec.sdk.cn.h();
                                com.facetec.sdk.cq.D(com.facetec.sdk.FaceTecSDK.f3366a.p);
                                com.facetec.sdk.cq.a((java.lang.String) com.facetec.sdk.bj.e(new java.lang.Object[0], -1475193129, 1475193136, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c()), com.facetec.sdk.bj.e);
                                this.f3415a.e();
                                com.facetec.sdk.by.e(352003939, -352003939, com.facetec.sdk.my.b(), com.facetec.sdk.my.b(), com.facetec.sdk.my.b(), com.facetec.sdk.my.b(), new java.lang.Object[0]);
                                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda57
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.facetec.sdk.bl.this.P();
                                    }
                                });
                                com.facetec.sdk.ai.d = false;
                                com.facetec.sdk.ai.c((android.app.Activity) this);
                                if (com.facetec.sdk.bd.h) {
                                    com.facetec.sdk.ai.b(this);
                                } else {
                                    com.facetec.sdk.ai.c((android.content.Context) this);
                                }
                                com.facetec.sdk.ap.a(this, com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_START, true, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda58
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.facetec.sdk.bl.this.I();
                                    }
                                });
                                com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda59
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.facetec.sdk.bl.this.aP();
                                    }
                                });
                                if (com.facetec.sdk.dp.d) {
                                    aO = (aT + 55) % 128;
                                    this.ao.post(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda60
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.facetec.sdk.bl.this.aV();
                                        }
                                    });
                                    return;
                                }
                                H();
                                if (com.facetec.sdk.bj.c()) {
                                    int i7 = aT + 101;
                                    aO = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        this.ao.post(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda61
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                com.facetec.sdk.bl.this.aS();
                                            }
                                        });
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    this.ao.post(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda61
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.facetec.sdk.bl.this.aS();
                                        }
                                    });
                                }
                                return;
                            }
                            if (faceTecSDKStatus == com.facetec.sdk.FaceTecSDKStatus.NEVER_INITIALIZED) {
                                aO = (aT + 15) % 128;
                                if (this.g) {
                                    obj = com.facetec.sdk.FaceTecIDScanStatus.INITIALIZATION_NOT_COMPLETED.toString();
                                    d(com.facetec.sdk.FaceTecIDScanStatus.INITIALIZATION_NOT_COMPLETED);
                                } else {
                                    obj = com.facetec.sdk.FaceTecSessionStatus.INITIALIZATION_NOT_COMPLETED.toString();
                                    a(com.facetec.sdk.FaceTecSessionStatus.INITIALIZATION_NOT_COMPLETED, (com.facetec.sdk.FaceTecIDScanStatus) null);
                                }
                                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, obj, (java.lang.Throwable) null);
                                return;
                            }
                            switch (com.facetec.sdk.bl.AnonymousClass5.f3429a[faceTecSDKStatus.ordinal()]) {
                                case 1:
                                    faceTecSessionStatus = com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID;
                                    break;
                                case 2:
                                    faceTecSessionStatus = com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED;
                                    break;
                                case 3:
                                    faceTecSessionStatus = com.facetec.sdk.FaceTecSessionStatus.LOCKED_OUT;
                                    break;
                                case 4:
                                    faceTecSessionStatus = com.facetec.sdk.FaceTecSessionStatus.ENCRYPTION_KEY_INVALID;
                                    break;
                                case 5:
                                    faceTecSessionStatus = com.facetec.sdk.FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED;
                                    break;
                                case 6:
                                    faceTecSessionStatus = com.facetec.sdk.FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED;
                                    break;
                                case 7:
                                    faceTecSessionStatus = com.facetec.sdk.FaceTecSessionStatus.DEVICE_NOT_SUPPORTED;
                                    break;
                                default:
                                    faceTecSessionStatus = null;
                                    break;
                            }
                            if (this.g && faceTecSDKStatus == com.facetec.sdk.FaceTecSDKStatus.DEVICE_LOCKED_OUT) {
                                aT = (aO + 39) % 128;
                                com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus = com.facetec.sdk.FaceTecIDScanStatus.LOCKED_OUT;
                                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, faceTecIDScanStatus.toString(), (java.lang.Throwable) null);
                                d(faceTecIDScanStatus);
                                return;
                            }
                            if (faceTecSessionStatus == null) {
                                com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't start session with status: ");
                                sb.append(faceTecSDKStatus.name());
                                com.facetec.sdk.t.c(this, cVar, sb.toString(), (java.lang.Throwable) null);
                                a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
                                return;
                            }
                            int i8 = aT + 81;
                            aO = i8 % 128;
                            if (i8 % 2 == 0) {
                                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, faceTecSessionStatus.toString(), (java.lang.Throwable) null);
                                a(faceTecSessionStatus, (com.facetec.sdk.FaceTecIDScanStatus) null);
                                return;
                            } else {
                                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, faceTecSessionStatus.toString(), (java.lang.Throwable) null);
                                a(faceTecSessionStatus, (com.facetec.sdk.FaceTecIDScanStatus) null);
                                throw null;
                            }
                        }
                    }
                    z = false;
                    if (com.facetec.sdk.FaceTecSessionActivity.e != null) {
                        z = true;
                    }
                    if (intValue == 0) {
                        com.facetec.sdk.FaceTecSDK.f3366a.g.retryScreenIdealImage = intValue;
                        com.facetec.sdk.FaceTecSDK.f3366a.g.cameraPermissionsScreenImage = aS;
                        com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage = i3;
                        com.facetec.sdk.FaceTecSDK.f3366a.f3361o.customImage = i;
                        faceTecSDKStatus = (com.facetec.sdk.FaceTecSDKStatus) com.facetec.sdk.bj.e(new java.lang.Object[]{this}, -1332564622, 1332564630, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
                        if (faceTecSDKStatus == com.facetec.sdk.FaceTecSDKStatus.INITIALIZED) {
                        }
                    }
                    aT = (aO + 71) % 128;
                    a(com.facetec.sdk.FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    faceTecSDKStatus = (com.facetec.sdk.FaceTecSDKStatus) com.facetec.sdk.bj.e(new java.lang.Object[]{this}, -1332564622, 1332564630, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c());
                    if (faceTecSDKStatus == com.facetec.sdk.FaceTecSDKStatus.INITIALIZED) {
                    }
                } catch (com.facetec.sdk.ak e) {
                    com.facetec.sdk.c cVar2 = com.facetec.sdk.c.CAMERA_ERROR;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("FTCameraException: ");
                    sb2.append(e.getMessage());
                    com.facetec.sdk.t.a(this, e, cVar2, sb2.toString(), !com.facetec.sdk.ai.f3384a, com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE.ordinal());
                    a(com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    return;
                }
            } catch (com.facetec.sdk.av e2) {
                com.facetec.sdk.c cVar3 = com.facetec.sdk.c.SEVERE_ERROR;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("FTInternalException: ");
                sb3.append(e2.getMessage());
                com.facetec.sdk.t.a(this, e2, cVar3, sb3.toString(), !com.facetec.sdk.ai.f3384a, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
                a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
                return;
            } catch (java.lang.Throwable th) {
                com.facetec.sdk.c cVar4 = com.facetec.sdk.c.SEVERE_ERROR;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unknown error: ");
                sb4.append(th.getMessage());
                com.facetec.sdk.t.a(this, th, cVar4, sb4.toString(), !com.facetec.sdk.ai.f3384a, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
                a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aZ() {
        int i = aT + 35;
        aO = i % 128;
        if (i % 2 != 0) {
            com.facetec.sdk.eb.d((android.content.Context) this);
            int i2 = 0 / 0;
        } else {
            com.facetec.sdk.eb.d((android.content.Context) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aV() {
        int i = aT + 107;
        aO = i % 128;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
            if (isFinishing()) {
                return;
            }
        } else if (isFinishing()) {
            return;
        }
        H();
        int i3 = aT + 29;
        aO = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        com.facetec.sdk.dj djVar;
        com.facetec.sdk.bf bfVar;
        com.facetec.sdk.c cVar;
        int i;
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int i2 = aT + 89;
        aO = i2 % 128;
        if (i2 % 2 != 0) {
            blVar.isFinishing();
            throw null;
        }
        if (blVar.isFinishing()) {
            return null;
        }
        com.facetec.sdk.dj djVar2 = blVar.W;
        if (com.facetec.sdk.bj.c()) {
            try {
                com.facetec.sdk.FaceTecSize c2 = com.facetec.sdk.dp.c(djVar2.d.get());
                double d2 = com.facetec.sdk.dp.c().width;
                double d3 = com.facetec.sdk.dp.c().height;
                double d4 = d3 / d2;
                double d5 = c2.height / c2.width;
                try {
                    if (java.lang.Math.abs(d2 - c2.width) <= 0.0d) {
                        return null;
                    }
                    try {
                        bfVar = djVar2.d.get();
                        cVar = com.facetec.sdk.c.UNEXPECTED_ACTIVITY_WINDOW_SIZE;
                        djVar = djVar2;
                    } catch (java.lang.Exception e) {
                        e = e;
                        djVar = djVar2;
                    }
                    try {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("AS: ");
                        sb.append(c2.width);
                        sb.append("x");
                        sb.append(c2.height);
                        sb.append(" (");
                        sb.append(java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.lang.Double.valueOf(d5)));
                        sb.append(") | SS: ");
                        sb.append(d2);
                        sb.append("x");
                        sb.append(d3);
                        sb.append(" (");
                        sb.append(java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.lang.Double.valueOf(d4)));
                        sb.append(")");
                        com.facetec.sdk.t.c(bfVar, cVar, sb.toString(), (java.lang.Throwable) null);
                        return null;
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        com.facetec.sdk.t.c(djVar.d.get(), com.facetec.sdk.c.UNEXPECTED_ACTIVITY_WINDOW_SIZE, "Error getting diagnostic data.", e);
                        i = aT + 3;
                        aO = i % 128;
                        if (i % 2 != 0) {
                        }
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                    djVar = djVar2;
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                djVar = djVar2;
            }
        }
        i = aT + 3;
        aO = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        int i3 = 63 / 0;
        return null;
    }

    private void H() {
        synchronized (this) {
            int i = aO + 125;
            aT = i % 128;
            java.lang.Object obj = null;
            if (i % 2 != 0) {
                if (this.al) {
                    return;
                }
                this.al = true;
                com.facetec.sdk.dm.e();
                com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), -1264052119, com.facetec.sdk.gj.AnonymousClass19.a(), new java.lang.Object[]{this.M}, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), 1264052149);
                com.facetec.sdk.dm.d(this.y);
                try {
                    float j = com.facetec.sdk.ai.j();
                    com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) this.W.d.get();
                    int d2 = (int) (com.facetec.sdk.ay.d(com.facetec.sdk.dm.o()) * com.facetec.sdk.dm.b());
                    com.facetec.sdk.dm.j();
                    if (com.facetec.sdk.dm.b() < 1.0f) {
                        int i2 = com.facetec.sdk.dp.b().width;
                        int i3 = com.facetec.sdk.dp.d ? com.facetec.sdk.dp.b().height : (int) (i2 * j);
                        float b = com.facetec.sdk.dm.b();
                        float f = i2;
                        faceTecSessionActivity.m = b * f;
                        faceTecSessionActivity.k = i3 * b;
                        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) faceTecSessionActivity.m, (int) faceTecSessionActivity.k);
                        int i4 = (int) (f - faceTecSessionActivity.m);
                        layoutParams.setMargins(i4 / 2, (d2 / 2) + 10, i4 / 2, 0);
                        faceTecSessionActivity.u.setLayoutParams(layoutParams);
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(((int) faceTecSessionActivity.m) + d2, ((int) faceTecSessionActivity.k) + d2);
                        int i5 = (int) (f - (faceTecSessionActivity.m + d2));
                        layoutParams2.setMargins(i5 / 2, 10, i5 / 2, 0);
                        faceTecSessionActivity.w.setLayoutParams(layoutParams2);
                        ((android.view.View) faceTecSessionActivity.v.getParent()).setLayoutParams(layoutParams2);
                        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams((int) faceTecSessionActivity.m, (int) faceTecSessionActivity.k);
                        layoutParams3.setMargins(0, 0, 0, 0);
                        faceTecSessionActivity.au.setLayoutParams(layoutParams3);
                        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams((int) faceTecSessionActivity.m, (int) faceTecSessionActivity.k);
                        layoutParams4.setMargins(0, 0, 0, 0);
                        faceTecSessionActivity.as.setLayoutParams(layoutParams4);
                        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                        float d3 = com.facetec.sdk.ay.d(com.facetec.sdk.dm.B()) * b;
                        gradientDrawable.setCornerRadius(d3);
                        int e = com.facetec.sdk.dp.e(faceTecSessionActivity, com.facetec.sdk.FaceTecSDK.f3366a.n.borderColor);
                        gradientDrawable.setStroke(d2, e);
                        faceTecSessionActivity.u.setBackground(gradientDrawable);
                        faceTecSessionActivity.w.setBackground(gradientDrawable);
                        faceTecSessionActivity.u.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
                        faceTecSessionActivity.u.setClipToOutline(true);
                        if (com.facetec.sdk.FaceTecSDK.f3366a.n.elevation > 0) {
                            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
                            gradientDrawable2.setCornerRadius(d3);
                            gradientDrawable2.setStroke(d2, e);
                            gradientDrawable2.setColor(com.facetec.sdk.dp.e(faceTecSessionActivity, com.facetec.sdk.dm.X()));
                            faceTecSessionActivity.v.setBackground(gradientDrawable2);
                            faceTecSessionActivity.v.setElevation(com.facetec.sdk.ay.d(com.facetec.sdk.FaceTecSDK.f3366a.n.elevation));
                            faceTecSessionActivity.v.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
                            faceTecSessionActivity.v.setClipToOutline(false);
                            faceTecSessionActivity.v.requestLayout();
                        }
                    }
                    com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity2 = (com.facetec.sdk.FaceTecSessionActivity) this.W.d.get();
                    if (com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage != 0) {
                        aT = (aO + 5) % 128;
                        if (com.facetec.sdk.FaceTecSDK.f3366a.j.showBrandingImage) {
                            faceTecSessionActivity2.K.setImageDrawable(androidx.core.content.ContextCompat.getDrawable(faceTecSessionActivity2, com.facetec.sdk.FaceTecSDK.f3366a.j.brandingImage));
                            faceTecSessionActivity2.K.setVisibility(0);
                            float f2 = faceTecSessionActivity2.m;
                            if (f2 > 0.0f) {
                                faceTecSessionActivity2.K.setMaxWidth((int) f2);
                            } else {
                                faceTecSessionActivity2.K.setMaxWidth(com.facetec.sdk.dp.b().width);
                            }
                            if ((com.facetec.sdk.dp.a((android.content.Context) faceTecSessionActivity2).getConfiguration().screenLayout & 15) >= 3) {
                                faceTecSessionActivity2.aw.setWeightSum(1.0f);
                                faceTecSessionActivity2.K.setMaxHeight((int) com.facetec.sdk.ay.d(50));
                                android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) faceTecSessionActivity2.K.getLayoutParams();
                                ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) com.facetec.sdk.ay.d(15);
                                layoutParams5.gravity = 48;
                                faceTecSessionActivity2.K.setLayoutParams(layoutParams5);
                                faceTecSessionActivity2.K.requestLayout();
                                faceTecSessionActivity2.aw.requestLayout();
                            }
                        }
                    }
                    this.W.e();
                    if (a() == com.facetec.sdk.bf.e.GRANTED) {
                        X();
                    }
                    Q();
                    return;
                } catch (com.facetec.sdk.ak e2) {
                    com.facetec.sdk.c cVar = com.facetec.sdk.c.CAMERA_ERROR;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("FTCameraException: ");
                    sb.append(e2.getMessage());
                    com.facetec.sdk.t.a(this, e2, cVar, sb.toString(), !com.facetec.sdk.ai.f3384a, com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE.ordinal());
                    a(com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    return;
                }
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        aT = (aO + 89) % 128;
        if (com.facetec.sdk.bj.c()) {
            e(com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED);
            aT = (aO + 67) % 128;
        }
    }

    /* renamed from: com.facetec.sdk.bl$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3429a;

        static {
            int[] iArr = new int[com.facetec.sdk.FaceTecSDKStatus.values().length];
            f3429a = iArr;
            try {
                iArr[com.facetec.sdk.FaceTecSDKStatus.INVALID_DEVICE_KEY_IDENTIFIER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3429a[com.facetec.sdk.FaceTecSDKStatus.NETWORK_ISSUES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3429a[com.facetec.sdk.FaceTecSDKStatus.DEVICE_LOCKED_OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f3429a[com.facetec.sdk.FaceTecSDKStatus.ENCRYPTION_KEY_INVALID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f3429a[com.facetec.sdk.FaceTecSDKStatus.DEVICE_IN_LANDSCAPE_MODE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f3429a[com.facetec.sdk.FaceTecSDKStatus.DEVICE_IN_REVERSE_PORTRAIT_MODE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f3429a[com.facetec.sdk.FaceTecSDKStatus.DEVICE_NOT_SUPPORTED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.am = z;
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_WINDOW_FOCUS_CHANGED, "Has Focus: ".concat(java.lang.String.valueOf(z)), (java.lang.Throwable) null);
        if (a() != com.facetec.sdk.bf.e.GRANTED) {
            return;
        }
        if (!z) {
            if (b() || isFinishing()) {
                return;
            }
            e(z);
            return;
        }
        if (E()) {
            return;
        }
        synchronized (this) {
            boolean z2 = this.Y;
            if (z2 && !this.g) {
                e(com.facetec.sdk.FaceTecIDScanNextStep.SELECTION_SCREEN);
            } else if (z2 && this.g && !this.at) {
                y();
            } else {
                if (!this.ad && (!this.U || this.G || this.g || this.at)) {
                    if (this.z != null && this.ay) {
                        W();
                    } else if (this.ag) {
                        M();
                    } else if (this.af) {
                        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -1360056131, 1360056133, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                    } else if (this.ae) {
                        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -782830998, 782831019, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                    }
                }
                G();
            }
        }
    }

    @Override // com.facetec.sdk.bf, android.app.Activity
    protected void onPause() {
        int i = aT + 3;
        aO = i % 128;
        if (i % 2 != 0) {
            super.onPause();
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_PAUSE, (java.lang.String) null, (java.lang.Throwable) null);
            int i2 = 15 / 0;
            if (a() != com.facetec.sdk.bf.e.GRANTED) {
                return;
            }
        } else {
            super.onPause();
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_PAUSE, (java.lang.String) null, (java.lang.Throwable) null);
            if (a() != com.facetec.sdk.bf.e.GRANTED) {
                return;
            }
        }
        aa();
        if (!this.aj) {
            if (com.facetec.sdk.ai.f3384a) {
                return;
            }
            if (isFinishing()) {
                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda21
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aU();
                    }
                });
            } else if (!b()) {
                int i3 = aO + 39;
                aT = i3 % 128;
                if (i3 % 2 == 0) {
                    e(true);
                } else {
                    e(false);
                }
            }
            com.facetec.sdk.eb.i();
            return;
        }
        int i4 = aT + 111;
        aO = i4 % 128;
        if (i4 % 2 != 0) {
            this.ap = false;
        } else {
            this.ap = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aU() {
        aO = (aT + 23) % 128;
        b(false);
        int i = aO + 69;
        aT = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    protected void onStop() {
        aT = (aO + 19) % 128;
        super.onStop();
        if (a() == com.facetec.sdk.bf.e.GRANTED && !this.am) {
            com.facetec.sdk.ce ceVar = this.q;
            if (ceVar != null) {
                aT = (aO + 29) % 128;
                ceVar.c();
                aO = (aT + 1) % 128;
            }
            this.G = true;
            if (com.facetec.sdk.ai.f3384a || this.Y || this.ad || this.aa) {
                return;
            }
            h(true);
            com.facetec.sdk.eb.i();
            com.facetec.sdk.ai aiVar = this.ak;
            if (aiVar != null) {
                aO = (aT + 41) % 128;
                if (aiVar instanceof com.facetec.sdk.aj) {
                    return;
                }
            }
            if (this.am) {
                return;
            }
            b(true);
        }
    }

    private static /* synthetic */ java.lang.Object q(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int i = (aT + 25) % 128;
        aO = i;
        boolean z = blVar.U;
        int i2 = i + 115;
        aT = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0034, code lost:
    
        if (a() != com.facetec.sdk.bf.e.d) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r9.G = false;
        r0 = r9.ak;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if ((r0 instanceof com.facetec.sdk.aj) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        ((com.facetec.sdk.aj) r0).l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r0 = r9.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r0.d() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        ((com.facetec.sdk.aj) r9.z.d()).l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (com.facetec.sdk.ai.f3384a == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r9.aj != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r0 = com.facetec.sdk.bl.aO + 59;
        com.facetec.sdk.bl.aT = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if ((r0 % 2) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r0 = r9.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r0.f3442o != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r9.z.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r9.ap == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        r9.ap = false;
        B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        if (r9.U == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        r0 = (com.facetec.sdk.bl.aO + 29) % 128;
        com.facetec.sdk.bl.aT = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r9.ar == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        r9.U = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        if (r9.at == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        com.facetec.sdk.bl.aO = (r0 + 99) % 128;
        r1 = r9.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        if (r1 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        r0 = r0 + 29;
        com.facetec.sdk.bl.aO = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b9, code lost:
    
        if ((r0 % 2) != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r1.c() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        r9.z.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cd, code lost:
    
        r9.f3415a = com.facetec.sdk.cn.c((android.app.Activity) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        if (r9.Y != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d7, code lost:
    
        S();
        r9.ak.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
    
        if (E() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e7, code lost:
    
        if (r9.Y == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ea, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        if (r9.ad == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
    
        if (r9.z == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f7, code lost:
    
        if (r9.ay == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fd, code lost:
    
        if (r9.ag == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0100, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0101, code lost:
    
        G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0105, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0106, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0108, code lost:
    
        r5 = com.facetec.sdk.c.SEVERE_ERROR;
        r0 = new java.lang.StringBuilder("Unknown error: ");
        r0.append(r0.getMessage());
        com.facetec.sdk.t.a(r9, r0, r5, r0.toString(), !com.facetec.sdk.ai.f3384a, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
        a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0130, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (a() != com.facetec.sdk.bf.e.d) goto L14;
     */
    @Override // com.facetec.sdk.bf, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onResume() {
        synchronized (this) {
            int i = aT + 107;
            aO = i % 128;
            java.lang.Object obj = null;
            if (i % 2 != 0) {
                super.onResume();
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_RESUME, (java.lang.String) null, (java.lang.Throwable) null);
                int i2 = 53 / 0;
            } else {
                super.onResume();
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_RESUME, (java.lang.String) null, (java.lang.Throwable) null);
            }
        }
    }

    private void G() {
        com.facetec.sdk.eb.i();
        if (this.U && !this.G) {
            try {
                this.U = false;
                this.f3415a = com.facetec.sdk.cn.c((android.app.Activity) this);
                S();
                this.ak.c();
            } catch (java.lang.Throwable th) {
                com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
                sb.append(": ");
                sb.append(th.getMessage());
                com.facetec.sdk.t.a(this, th, cVar, sb.toString(), !com.facetec.sdk.ai.f3384a, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
                a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
                return;
            }
        }
        if (this.ad) {
            int i = aT + 55;
            aO = i % 128;
            java.lang.Object obj = null;
            if (i % 2 == 0) {
                if (!com.facetec.sdk.cg.f(this)) {
                    com.facetec.sdk.cg.a(this);
                } else {
                    int i2 = aO + 107;
                    aT = i2 % 128;
                    if (i2 % 2 != 0) {
                        a(com.facetec.sdk.FaceTecSessionStatus.LOCKED_OUT);
                        int i3 = aO + 41;
                        aT = i3 % 128;
                        if (i3 % 2 != 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    a(com.facetec.sdk.FaceTecSessionStatus.LOCKED_OUT);
                    obj.hashCode();
                    throw null;
                }
            } else {
                com.facetec.sdk.cg.f(this);
                obj.hashCode();
                throw null;
            }
        }
        if (this.f == null || getFragmentManager().findFragmentByTag("RetryFaceScan") == null) {
            if (this.f == null) {
                this.f = com.facetec.sdk.cx.q();
            }
            if (this.ad) {
                getFragmentManager().beginTransaction().add(this.aq, this.f, "RetryFaceScan").commitAllowingStateLoss();
            } else {
                getFragmentManager().beginTransaction().replace(this.aq, this.f, "RetryFaceScan").commitAllowingStateLoss();
            }
        } else {
            this.f.e((android.content.Context) this, true);
        }
        this.ad = false;
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            d(new java.lang.Object[]{this, 0}, com.facetec.sdk.oh.a.c(), 565622430, -565622419, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        }
        d(1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r8.z == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r8.f3415a.b(r8.z.n);
        getFragmentManager().beginTransaction().remove(r8.z).commitAllowingStateLoss();
        r8.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r8.z == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void w() {
        com.facetec.sdk.bw bwVar;
        if (isFinishing() || (bwVar = this.z) == null) {
            return;
        }
        java.lang.Object obj = null;
        if (bwVar.j != com.facetec.sdk.bw.c.FRONT) {
            this.aL = com.facetec.sdk.da.c.BACK_SIDE;
            aT = (aO + 101) % 128;
        } else {
            int i = aT + 17;
            aO = i % 128;
            if (i % 2 != 0) {
                this.aL = com.facetec.sdk.da.c.FRONT_SIDE;
                obj.hashCode();
                throw null;
            }
            this.aL = com.facetec.sdk.da.c.FRONT_SIDE;
        }
        if (!isFinishing()) {
            int i2 = aO + 119;
            aT = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
        }
        this.i = com.facetec.sdk.da.a(true, this.aL);
        getFragmentManager().beginTransaction().add(this.aq, this.i, "Results").commitAllowingStateLoss();
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            af();
        }
        d(new java.lang.Object[]{this, new com.facetec.sdk.bl.c() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda52
            @Override // com.facetec.sdk.bl.c
            public final byte[] getIdScanBytes(java.lang.String str) {
                byte[] h;
                h = com.facetec.sdk.bl.this.h(str);
                return h;
            }
        }}, com.facetec.sdk.oh.a.c(), -2120258639, 2120258652, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] h(java.lang.String str) {
        aT = (aO + 87) % 128;
        byte[] p = com.facetec.sdk.cq.p(str, this.D, "", com.facetec.sdk.bj.g(this).getBoolean(com.facetec.sdk.as.ab, false));
        int i = aT + 71;
        aO = i % 128;
        if (i % 2 == 0) {
            return p;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void e(final com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        aO = (aT + 23) % 128;
        if (this.i != null) {
            this.i.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda49
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.f(faceTecIDScanNextStep);
                }
            });
            return;
        }
        int i = aT + 59;
        aO = i % 128;
        if (i % 2 != 0) {
            e(faceTecIDScanNextStep, true);
            this.Y = false;
        } else {
            e(faceTecIDScanNextStep, false);
            this.Y = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        com.facetec.sdk.da daVar = this.i;
        com.facetec.sdk.da daVar2 = this.i;
        java.util.Objects.requireNonNull(daVar2);
        daVar.a((java.lang.Runnable) new com.facetec.sdk.au.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.g(faceTecIDScanNextStep);
            }
        }));
        int i = aT + 27;
        aO = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        int i;
        if (!isFinishing()) {
            e(faceTecIDScanNextStep, false);
            this.Y = false;
            this.i.b(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.aT();
                }
            });
            i = aT + 7;
        } else {
            i = aT + 1;
        }
        aO = i % 128;
    }

    private static /* synthetic */ java.lang.Object k(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        aO = (aT + 95) % 128;
        blVar.d(0);
        int i = aO + 5;
        aT = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        aT = (aO + 85) % 128;
        e(this.C, true);
        this.Y = true;
        int i = aO + 105;
        aT = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aR() {
        int i;
        int i2 = aT + 9;
        aO = i2 % 128;
        if (i2 % 2 != 0) {
            N();
            i = 8571;
        } else {
            N();
            i = 1000;
        }
        d(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aN() {
        int i = aO + 69;
        aT = i % 128;
        java.lang.Object obj = null;
        if (i % 2 != 0) {
            if (!F() && this.z != null) {
                runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda37
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aR();
                    }
                });
                return;
            }
            int i2 = aT + 71;
            aO = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        F();
        throw null;
    }

    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int i = aT + 33;
        aO = i % 128;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
            if (blVar.F()) {
                return null;
            }
        } else if (blVar.F()) {
            return null;
        }
        if (blVar.z == null) {
            return null;
        }
        blVar.z();
        int i3 = aO + 93;
        aT = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        int i4 = 98 / 0;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aO() {
        aT = (aO + 75) % 128;
        this.z.h();
        aO = (aT + 63) % 128;
    }

    private void N() {
        aO = (aT + 93) % 128;
        this.ay = false;
        getFragmentManager().beginTransaction().replace(this.aq, this.z, "IDScan").commitAllowingStateLoss();
        this.f3415a.a(this.z.n);
        this.z.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.aO();
            }
        }, 100L);
        aT = (aO + 93) % 128;
    }

    private void a(java.lang.String str) {
        com.facetec.sdk.t.a(this, new java.lang.Throwable("FaceTec SDK has experienced an unexpected camera error."), com.facetec.sdk.c.CAMERA_ERROR, "FaceScan: camera is null unexpectedly. From: ".concat(java.lang.String.valueOf(str)), true, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
        a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
        aO = (aT + 93) % 128;
    }

    private void M() {
        int i;
        aO = (aT + 21) % 128;
        if (!F()) {
            this.ag = false;
            android.app.FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            this.J = com.facetec.sdk.ck.e(this.aD);
            beginTransaction.setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).add(this.aq, this.J, "OCRConfirmation").commitAllowingStateLoss();
            d(1000);
            com.facetec.sdk.t.c(com.facetec.sdk.de.RESULT_OCR);
            i = aO + 97;
        } else {
            i = aO + 87;
        }
        aT = i % 128;
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        java.lang.Object obj = null;
        if (!blVar.F()) {
            blVar.af = false;
            android.app.FragmentTransaction beginTransaction = blVar.getFragmentManager().beginTransaction();
            blVar.R = new com.facetec.sdk.a();
            beginTransaction.setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).add(blVar.aq, blVar.R, "AdditionalReview").commitAllowingStateLoss();
            blVar.d(1000);
            com.facetec.sdk.t.c(com.facetec.sdk.de.RESULT_ADDITIONAL_REVIEW);
            aO = (aT + 85) % 128;
            return null;
        }
        int i = aO + 23;
        aT = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r5.F() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r5.F() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r5.ae = false;
        r5.ay = true;
        r1 = r5.getFragmentManager().beginTransaction();
        r5.S = new com.facetec.sdk.bt();
        r1.setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).add(r5.aq, r5.S, "IDFeedback").commitAllowingStateLoss();
        r5.d(1000);
        com.facetec.sdk.t.c(com.facetec.sdk.de.RESULT_ID_FEEDBACK);
        r5 = com.facetec.sdk.bl.aT + 125;
        com.facetec.sdk.bl.aO = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        r2.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object r(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int i = aT + 19;
        aO = i % 128;
        java.lang.Object obj = null;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    @Override // com.facetec.sdk.bf, android.app.Activity
    protected void onDestroy() {
        aO = (aT + 23) % 128;
        super.onDestroy();
        if (com.facetec.sdk.dp.d) {
            com.facetec.sdk.dp.a((com.facetec.sdk.bl) null);
        }
        com.facetec.sdk.eb.a();
        com.facetec.sdk.eb.c();
        com.facetec.sdk.FaceTecSDK.e = com.facetec.sdk.FaceTecSDK.b.NORMAL;
        if (this.H == com.facetec.sdk.bl.d.PRE_SESSION_STARTED) {
            com.facetec.sdk.cq.j(true);
        } else if (this.H == com.facetec.sdk.bl.d.FACESCAN_SESSION_STARTED) {
            aT = (aO + 119) % 128;
            com.facetec.sdk.cq.d(true);
        }
        this.H = com.facetec.sdk.bl.d.NOT_STARTED;
        if (this.b != null) {
            aT = (aO + 65) % 128;
            this.b.removeCallbacksAndMessages(null);
        }
        com.facetec.sdk.cf cfVar = this.N;
        if (cfVar != null) {
            int i = aT + 81;
            aO = i % 128;
            if (i % 2 != 0) {
                cfVar.d();
                int i2 = 14 / 0;
            } else {
                cfVar.d();
            }
        }
        b(true);
        com.facetec.sdk.eb.i();
        Z();
        K();
        com.facetec.sdk.cu cuVar = this.aJ;
        if (cuVar != null) {
            int i3 = aO + 111;
            aT = i3 % 128;
            if (i3 % 2 != 0) {
                unregisterReceiver(cuVar);
            } else {
                unregisterReceiver(cuVar);
                throw null;
            }
        }
    }

    private void K() {
        aO = (aT + 35) % 128;
        this.e = null;
        this.j = null;
        this.f = null;
        this.i = null;
        this.J = null;
        this.R = null;
        this.S = null;
        int i = aO + 15;
        aT = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    private void b(boolean z) {
        com.facetec.sdk.ai aiVar;
        synchronized (this.aH) {
            aiVar = this.ak;
            this.ak = null;
        }
        if (aiVar != null) {
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.SESSION_CAMERA_CLEANUP_CALLED, (java.lang.String) null, (java.lang.Throwable) null);
            aiVar.c(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        java.lang.Object[] b$34ff007e;
        java.lang.Object d2 = com.facetec.sdk.al.d(1606058502);
        if (d2 == null) {
            char keyRepeatTimeout = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
            byte b = (byte) (-1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            aW(b, (byte) (b + 1), (byte) $$a.length, objArr);
            d2 = com.facetec.sdk.al.c(keyRepeatTimeout, (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_VERSION_INFO, capsMode + 23, -128583426, false, (java.lang.String) objArr[0], null);
        }
        long j = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        aX(null, null, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        aX(null, null, 126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr3);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr3[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(1605134981);
        if (d3 == null) {
            char lastIndexOf = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
            int argb = android.graphics.Color.argb(0, 0, 0, 0);
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            byte b2 = (byte) (-1);
            byte b3 = (byte) (b2 + 1);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            aW(b2, b3, (byte) (b3 + 3), objArr4);
            d3 = com.facetec.sdk.al.c(lastIndexOf, argb + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, indexOf + 24, -129822595, false, (java.lang.String) objArr4[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d4 = com.facetec.sdk.al.d(1603287939);
            if (d4 == null) {
                char c2 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                int resolveSize = android.view.View.resolveSize(0, 0);
                byte b4 = (byte) (-1);
                byte b5 = (byte) (b4 + 1);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                aW(b4, b5, (byte) (b5 + 1), objArr5);
                d4 = com.facetec.sdk.al.c(c2, 1057 - indexOf2, 23 - resolveSize, -125877893, false, (java.lang.String) objArr5[0], null);
            }
            java.lang.Object[] objArr6 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            b$34ff007e = new java.lang.Object[]{(java.lang.String[]) objArr6[0], new int[1], new int[]{((int[]) objArr6[2])[0]}, new int[]{((int[]) objArr6[3])[0]}};
            int i = ~java.lang.System.identityHashCode(this);
            int i2 = ((((((~(r3 | (-408977873))) | r5) * 590) - 1610937687) + ((((~((-1192191504) | i)) | 1175142919) | (~(426026456 | i))) * (-1180))) + (((~(i | 1192191503)) | (~((-426026457) | i))) * 590)) - 1763436071;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) b$34ff007e[1])[0] = i4 ^ (i4 << 5);
            int i5 = aO + 59;
            aT = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 5;
            }
        } else {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            aX(null, null, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0096\u0082\u0081\u008f\u0087\u0081\u0095\u0081\u0094", objArr7);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            aX(null, null, 126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u008c\u0083\u0085\u008e\u0098\u0088\u0081\u0097\u008a\u008b\u0086\u008b\u0082\u008c\u0083\u0086", objArr8);
            int intValue = ((java.lang.Integer) cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class).invoke(null, this)).intValue();
            try {
                java.lang.Object[] objArr9 = {-995461662};
                java.lang.Object d5 = com.facetec.sdk.al.d(-583417224);
                if (d5 == null) {
                    d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL, 22 - android.text.TextUtils.indexOf("", "", 0), 2060892288, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                b$34ff007e = com.facetec.sdk.ev.b$34ff007e(intValue, ((java.lang.reflect.Constructor) d5).newInstance(objArr9));
                java.lang.Object d6 = com.facetec.sdk.al.d(1603287939);
                if (d6 == null) {
                    char absoluteGravity = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                    int defaultSize = android.view.View.getDefaultSize(0, 0);
                    int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    aW(b6, b7, (byte) (b7 + 1), objArr10);
                    d6 = com.facetec.sdk.al.c(absoluteGravity, 1058 - defaultSize, normalizeMetaState + 23, -125877893, false, (java.lang.String) objArr10[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, b$34ff007e);
                try {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    aX(null, null, android.graphics.Color.red(0) + 127, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr11);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    aX(null, null, 126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr12);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(1605134981);
                    if (d7 == null) {
                        char scrollDefaultDelay = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int indexOf3 = android.text.TextUtils.indexOf("", "", 0, 0);
                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        aW(b8, b9, (byte) (b9 + 3), objArr13);
                        d7 = com.facetec.sdk.al.c(scrollDefaultDelay, indexOf3 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, (fadingEdgeLength >> 16) + 23, -129822595, false, (java.lang.String) objArr13[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(1606058502);
                    if (d8 == null) {
                        char blue = (char) android.graphics.Color.blue(0);
                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                        byte b10 = (byte) (-1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        aW(b10, (byte) (b10 + 1), (byte) $$a.length, objArr14);
                        d8 = com.facetec.sdk.al.c(blue, 1058 - (maxKeyCode >> 16), 23 - packedPositionType, -128583426, false, (java.lang.String) objArr14[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = b$34ff007e[2];
        int i7 = ((int[]) obj)[0];
        java.lang.Object obj2 = b$34ff007e[3];
        int i8 = ((int[]) obj2)[0];
        if (i8 == i7) {
            int i9 = ((int[]) b$34ff007e[1])[0];
            java.lang.Object[] objArr15 = {(java.lang.String[]) b$34ff007e[0], new int[1], new int[]{((int[]) obj)[0]}, new int[]{((int[]) obj2)[0]}};
            int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
            int i10 = i9 + ((((-167790692) | elapsedRealtime) * (-627)) - 1666370900) + (((~((-896770949) | elapsedRealtime)) | 721447011) * (-627)) + (((~((~elapsedRealtime) | 896770948)) | (~(721447011 | elapsedRealtime))) * 627);
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr15[1])[0] = i12 ^ (i12 << 5);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = (java.lang.String[]) b$34ff007e[0];
        if (strArr != null) {
            aT = (aO + 93) % 128;
            for (java.lang.String str : strArr) {
                arrayList.add(str);
            }
        }
        long j2 = i7 ^ i8;
        int i13 = aO;
        aT = (i13 + 117) % 128;
        aT = (i13 + 15) % 128;
        try {
            java.lang.Object[] objArr16 = {java.lang.Long.valueOf(j2 ^ (-2289555565514326016L)), -533078694L};
            byte[] bArr = $$d;
            byte b11 = bArr[9];
            byte b12 = (byte) (b11 - 1);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            aY(b11, b12, b12, objArr17);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
            byte b13 = bArr[9];
            byte b14 = (byte) (b13 - 1);
            byte b15 = b13;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            aY(b14, b15, b15, objArr18);
            cls4.getMethod((java.lang.String) objArr18[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr16);
            int i14 = ((int[]) b$34ff007e[1])[0];
            java.lang.Object[] objArr19 = {(java.lang.String[]) b$34ff007e[0], new int[1], new int[]{((int[]) b$34ff007e[2])[0]}, new int[]{((int[]) b$34ff007e[3])[0]}};
            int myPid = android.os.Process.myPid();
            int i15 = ~myPid;
            int i16 = ~(778785709 | i15);
            int i17 = i14 + ((((~(839432250 | i15)) | 207831941) * (-1188)) - 452639191) + (((~(myPid | (-839432251))) | 207831941 | i16) * 594) + (((~((-839432251) | i15)) | 268478482 | i16) * 594);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[1])[0] = i19 ^ (i19 << 5);
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aQ() {
        aO = (aT + 119) % 128;
        this.y.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
        aO = (aT + 41) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        int i = aO;
        int i2 = i + 43;
        aT = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            if (this.aI) {
                this.aI = false;
                runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda71
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aQ();
                    }
                });
                return;
            }
            int i3 = i + 111;
            aT = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4.ak == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r4.ak.d(new com.facetec.sdk.bl$$ExternalSyntheticLambda18(r4));
        com.facetec.sdk.bl.aO = (com.facetec.sdk.bl.aT + 31) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        com.facetec.sdk.bl.aO = (r2 + 103) % 128;
        a("Transition in Main Interface");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r4.ak == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void aJ() {
        if (a() != com.facetec.sdk.bf.e.GRANTED || this.g) {
            return;
        }
        this.av.setVisibility(0);
        this.av.setAlpha(1.0f);
        if (this.aI) {
            int i = aO + 43;
            int i2 = i % 128;
            aT = i2;
            if (i % 2 == 0) {
                int i3 = 34 / 0;
            }
        }
        aO = (aT + 69) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = com.facetec.sdk.bl.aO + 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (E() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (E() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r8.ao.animate().alpha(1.0f).setDuration(500).setListener(null).withEndAction(new com.facetec.sdk.bl$$ExternalSyntheticLambda35(r8)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if (r8.g != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        com.facetec.sdk.bl.aO = (com.facetec.sdk.bl.aT + 1) % 128;
        d(new java.lang.Object[]{r8, 0}, com.facetec.sdk.oh.a.c(), 565622430, -565622419, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        com.facetec.sdk.bl.aT = (com.facetec.sdk.bl.aO + 39) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
    
        r0 = com.facetec.sdk.bl.aO + 95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void aI() {
        int i;
        int i2 = aT + 65;
        aO = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        aT = i % 128;
    }

    private void Q() {
        com.facetec.sdk.ai aiVar;
        java.lang.Runnable runnable;
        synchronized (this) {
            com.facetec.sdk.bf.e a2 = a();
            com.facetec.sdk.cq.b();
            if (com.facetec.sdk.FaceTecSDK.f3366a.enableOfficialIDPhoto) {
                com.facetec.sdk.cq.W();
                int i = aO + 57;
                aT = i % 128;
                int i2 = i % 2;
            }
            com.facetec.sdk.cf cfVar = this.N;
            cfVar.e = cfVar.a();
            if (cfVar.e > 0.70000005f) {
                cfVar.d = true;
                cfVar.d(cfVar.e, 0.6f, 0);
                aO = (aT + 125) % 128;
            }
            if (a2 == com.facetec.sdk.bf.e.GRANTED && !this.g) {
                if (this.ak == null) {
                    int i3 = aO + 11;
                    aT = i3 % 128;
                    if (i3 % 2 != 0) {
                        a("Begin Verification");
                        return;
                    } else {
                        a("Begin Verification");
                        int i4 = 16 / 0;
                        return;
                    }
                }
                this.aI = true;
                try {
                    if (this.ai) {
                        int i5 = aT + 119;
                        aO = i5 % 128;
                        if (i5 % 2 != 0) {
                            this.av.setVisibility(1);
                            aiVar = this.ak;
                            runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda45
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.bl.this.aK();
                                }
                            };
                        } else {
                            this.av.setVisibility(0);
                            aiVar = this.ak;
                            runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda45
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.bl.this.aK();
                                }
                            };
                        }
                        aiVar.d(runnable);
                    }
                } catch (java.lang.Exception unused) {
                }
                this.ak.c();
                int i6 = aT + 37;
                aO = i6 % 128;
                int i7 = i6 % 2;
            }
            com.facetec.sdk.t.d = com.facetec.sdk.bj.c();
            com.facetec.sdk.t.f3763a = 0;
            this.j = com.facetec.sdk.bx.e(a2, this.g);
            getFragmentManager().beginTransaction().replace(this.aq, this.j, "PreEnroll").commitAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aK() {
        aO = (aT + 23) % 128;
        R();
        aT = (aO + 35) % 128;
    }

    private void O() {
        float f;
        synchronized (this) {
            if (E()) {
                return;
            }
            if (this.ak == null) {
                a("Start FaceScan");
                aT = (aO + 81) % 128;
                return;
            }
            android.widget.ImageView imageView = this.x;
            if (imageView != null) {
                imageView.setEnabled(false);
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda39
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aL();
                    }
                }, 800L);
                int i = aT + 45;
                aO = i % 128;
                int i2 = i % 2;
            }
            this.ak.c();
            if (com.facetec.sdk.FaceTecSDK.b()) {
                aO = (aT + 125) % 128;
                com.facetec.sdk.cf cfVar = this.N;
                if (!cfVar.f3461a) {
                    cfVar.f3461a = true;
                    cfVar.d = false;
                    cfVar.c = false;
                    float a2 = cfVar.g.a();
                    if (cfVar.g.e) {
                        int i3 = aT + 103;
                        aO = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 16 / 0;
                        }
                        f = 0.55f;
                    } else {
                        f = 0.8f;
                    }
                    cfVar.d(a2, f, 0);
                }
            }
            android.app.FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (this.j == null && this.f == null) {
                beginTransaction.setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).replace(this.aq, this.e, "FaceScan").commitAllowingStateLoss();
                com.facetec.sdk.eb.e(this);
            }
            beginTransaction.replace(this.aq, this.e, "FaceScan").commitAllowingStateLoss();
            this.j = null;
            this.f = null;
            com.facetec.sdk.eb.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aL() {
        aT = (aO + 101) % 128;
        android.widget.ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setEnabled(true);
            aT = (aO + 37) % 128;
        }
    }

    private void a(boolean z) throws java.lang.NullPointerException {
        int i = aT + 45;
        aO = i % 128;
        if (i % 2 != 0) {
            d(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, com.facetec.sdk.oh.a.c(), -612370324, 612370324, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        } else {
            d(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, com.facetec.sdk.oh.a.c(), -612370324, 612370324, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        }
        this.f3415a.c = true;
        this.f3415a.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r11.z != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r11.z.j();
        com.facetec.sdk.bl.aT = (com.facetec.sdk.bl.aO + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001e, code lost:
    
        if (r11.z != null) goto L16;
     */
    @Override // com.facetec.sdk.bf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void e(boolean z) {
        synchronized (this) {
            if (this.at) {
                int i = aO + 91;
                aT = i % 128;
                if (i % 2 == 0) {
                    int i2 = 22 / 0;
                }
                return;
            }
            if (this.U) {
                return;
            }
            this.U = true;
            com.facetec.sdk.ai.e(z);
            if (this.T) {
                return;
            }
            if (!this.at && !this.g) {
                if (a() != com.facetec.sdk.bf.e.GRANTED) {
                    int i3 = aT + 41;
                    aO = i3 % 128;
                    if (i3 % 2 != 0) {
                        a(com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH, (com.facetec.sdk.FaceTecIDScanStatus) null);
                        int i4 = 46 / 0;
                    } else {
                        a(com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    }
                } else if (!E()) {
                    h(true);
                    e(com.facetec.sdk.t.b.SESSION_CONTEXT_SWITCH);
                    d(new java.lang.Object[]{this, false}, com.facetec.sdk.oh.a.c(), -612370324, 612370324, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                }
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH.toString(), (java.lang.Throwable) null);
                return;
            }
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecIDScanStatus.CONTEXT_SWITCH.toString(), (java.lang.Throwable) null);
            return;
        }
    }

    @Override // com.facetec.sdk.bf
    final void p() {
        int i;
        if (this.g) {
            d(com.facetec.sdk.FaceTecIDScanStatus.CAMERA_PERMISSION_DENIED);
            i = aO + 85;
        } else {
            e(com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED);
            i = aO + 25;
        }
        aT = i % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aH() {
        aT = (aO + 39) % 128;
        getFragmentManager().beginTransaction().replace(this.aq, this.i, "Results").addToBackStack("zoom").commitAllowingStateLoss();
        int i = aO + 21;
        aT = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.facetec.sdk.bf
    final void e() {
        synchronized (this) {
            com.facetec.sdk.ai aiVar = this.ak;
            if (aiVar != null) {
                aiVar.e();
            }
            com.facetec.sdk.cq.h();
            if (com.facetec.sdk.FaceTecSessionActivity.e != null) {
                this.i = com.facetec.sdk.da.a(false, this.aL);
                if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                    int i = aT + 77;
                    aO = i % 128;
                    if (i % 2 != 0) {
                        af();
                        int i2 = 24 / 0;
                    } else {
                        af();
                    }
                }
                this.e.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aH();
                    }
                }, 400L);
                aO = (aT + 19) % 128;
            }
        }
    }

    @Override // com.facetec.sdk.bf
    final void c() {
        synchronized (this) {
            com.facetec.sdk.ax.a(this);
            e(com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL);
            com.facetec.sdk.cq.L(com.facetec.sdk.as.ah, ((android.os.PowerManager) getSystemService("power")).isPowerSaveMode());
            d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1884737398, -1884737390, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            try {
                com.facetec.sdk.cg.e(this);
                aO = (aT + 49) % 128;
            } catch (java.lang.Throwable th) {
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.LOG_SUCCESSFUL_ENROLLMENT_ERROR, th.getMessage(), th);
            }
            this.T = true;
            this.X = true;
            if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                aO = (aT + 71) % 128;
                com.facetec.sdk.eb.b(this, com.facetec.sdk.eb.c.UPLOADING);
            }
            try {
                Y();
                int i = aT + 81;
                aO = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } catch (java.lang.Throwable th2) {
                com.facetec.sdk.t.a(this, th2, com.facetec.sdk.c.ASYNC_FACE_SCAN_SUCCESS_TASK_ERROR, th2.getMessage(), true, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
                a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
            }
        }
    }

    private static /* synthetic */ java.lang.Object o(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        aO = (aT + 65) % 128;
        blVar.G();
        int i = aT + 91;
        aO = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        int i2 = 99 / 0;
        return null;
    }

    @Override // com.facetec.sdk.bf
    final void i() {
        synchronized (this) {
            aO = (aT + 113) % 128;
            e(com.facetec.sdk.t.b.USER_FAILED);
            d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1884737398, -1884737390, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            try {
                a(true);
                this.f = com.facetec.sdk.cx.q();
                this.e.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aF();
                    }
                }, 400L);
                int i = aT + 1;
                aO = i % 128;
                if (i % 2 != 0) {
                    int i2 = 36 / 0;
                }
            } catch (java.lang.Throwable th) {
                com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
                sb.append(": ");
                sb.append(th.getMessage());
                com.facetec.sdk.t.a(this, th, cVar, sb.toString(), true, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
                a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        if (r3.at != false) goto L10;
     */
    @Override // com.facetec.sdk.bf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void t() {
        synchronized (this) {
            int i = aT + 3;
            aO = i % 128;
            java.lang.Object obj = null;
            if (i % 2 != 0) {
                h(true);
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED.toString(), (java.lang.Throwable) null);
                if (this.at) {
                    if (!this.g) {
                        a(this.B.getStatus(), com.facetec.sdk.FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED);
                        aO = (aT + 117) % 128;
                        return;
                    }
                    int i2 = aT + 105;
                    aO = i2 % 128;
                    if (i2 % 2 == 0) {
                        a((com.facetec.sdk.FaceTecSessionStatus) null, com.facetec.sdk.FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED);
                        return;
                    } else {
                        a((com.facetec.sdk.FaceTecSessionStatus) null, com.facetec.sdk.FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED);
                        obj.hashCode();
                        throw null;
                    }
                }
                a(com.facetec.sdk.FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED, (com.facetec.sdk.FaceTecIDScanStatus) null);
                return;
            }
            h(false);
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED.toString(), (java.lang.Throwable) null);
        }
    }

    private void a(com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus) {
        synchronized (this) {
            aT = (aO + 13) % 128;
            a(faceTecSessionStatus, (com.facetec.sdk.FaceTecIDScanStatus) null);
            int i = aO + 93;
            aT = i % 128;
            if (i % 2 == 0) {
                int i2 = 72 / 0;
            }
        }
    }

    final void e(com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus) {
        int i = aT + 37;
        aO = i % 128;
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            e(faceTecSessionStatus, (com.facetec.sdk.FaceTecIDScanStatus) null);
        } else {
            e(faceTecSessionStatus, (com.facetec.sdk.FaceTecIDScanStatus) null);
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object g(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus = (com.facetec.sdk.FaceTecIDScanStatus) objArr[1];
        aO = (aT + 1) % 128;
        blVar.e(com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, faceTecIDScanStatus);
        int i = aO + 121;
        aT = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aD() {
        aT = (aO + 33) % 128;
        b(false);
        int i = aO + 7;
        aT = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aE() {
        int i = aT;
        aO = (i + 67) % 128;
        com.facetec.sdk.m mVar = this.f3428o;
        if (mVar != null) {
            aO = (i + 77) % 128;
            mVar.c();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:8|(17:10|(4:12|13|14|15)(1:83)|25|26|27|(1:29)|30|(2:32|33)|34|35|36|37|(2:39|(4:41|42|43|(5:45|(3:47|48|(2:50|51)(0))|57|58|59)(2:61|(5:63|(1:(1:66)(1:67))|68|69|70)(3:71|72|73))))|74|42|43|(0)(0))|85|(5:91|(1:93)(2:98|(1:100))|94|(1:96)|97)|25|26|27|(0)|30|(0)|34|35|36|37|(0)|74|42|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r8.aa == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r8.g != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r8.F != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r1 = new com.facetec.sdk.FaceTecSessionResult(r9, r8.P, r8.Q, r8.O);
        r8.B = r1;
        r8.aa = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r1.getStatus() == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        com.facetec.sdk.t.c(r8, com.facetec.sdk.c.FACESCAN_CALLBACK_CALLED, r8.B.getStatus().toString(), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        com.facetec.sdk.FaceTecSessionActivity.e.processSessionWhileFaceTecSDKWaits(r8.B, new com.facetec.sdk.be(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0179, code lost:
    
        r9 = com.facetec.sdk.R.anim.facetec_fade_out;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
    
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0153, code lost:
    
        com.facetec.sdk.n.b(r10);
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011f, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0120, code lost:
    
        com.facetec.sdk.n.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0045, code lost:
    
        if (r8.aa == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6 A[Catch: all -> 0x011f, TryCatch #3 {all -> 0x011f, blocks: (B:27:0x00dd, B:29:0x00e6, B:30:0x00ee, B:33:0x0112, B:34:0x011c), top: B:26:0x00dd, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a A[Catch: all -> 0x01a2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x0019, B:10:0x002d, B:12:0x0038, B:17:0x0047, B:19:0x004b, B:21:0x004f, B:23:0x0064, B:24:0x0073, B:25:0x00d6, B:32:0x010a, B:35:0x0123, B:37:0x0131, B:39:0x0135, B:41:0x013f, B:42:0x0147, B:43:0x0157, B:45:0x015b, B:47:0x0165, B:54:0x0179, B:57:0x017d, B:61:0x0182, B:63:0x0186, B:66:0x0192, B:68:0x0196, B:71:0x019b, B:77:0x0153, B:80:0x0120, B:82:0x0176, B:83:0x0043, B:85:0x0080, B:87:0x0084, B:89:0x0088, B:91:0x008c, B:93:0x00a1, B:94:0x00b0, B:96:0x00bb, B:97:0x00ca, B:98:0x00a4, B:100:0x00ae, B:15:0x003c, B:51:0x0172, B:27:0x00dd, B:29:0x00e6, B:30:0x00ee, B:33:0x0112, B:34:0x011c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135 A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x0019, B:10:0x002d, B:12:0x0038, B:17:0x0047, B:19:0x004b, B:21:0x004f, B:23:0x0064, B:24:0x0073, B:25:0x00d6, B:32:0x010a, B:35:0x0123, B:37:0x0131, B:39:0x0135, B:41:0x013f, B:42:0x0147, B:43:0x0157, B:45:0x015b, B:47:0x0165, B:54:0x0179, B:57:0x017d, B:61:0x0182, B:63:0x0186, B:66:0x0192, B:68:0x0196, B:71:0x019b, B:77:0x0153, B:80:0x0120, B:82:0x0176, B:83:0x0043, B:85:0x0080, B:87:0x0084, B:89:0x0088, B:91:0x008c, B:93:0x00a1, B:94:0x00b0, B:96:0x00bb, B:97:0x00ca, B:98:0x00a4, B:100:0x00ae, B:15:0x003c, B:51:0x0172, B:27:0x00dd, B:29:0x00e6, B:30:0x00ee, B:33:0x0112, B:34:0x011c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b A[Catch: all -> 0x01a2, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x0019, B:10:0x002d, B:12:0x0038, B:17:0x0047, B:19:0x004b, B:21:0x004f, B:23:0x0064, B:24:0x0073, B:25:0x00d6, B:32:0x010a, B:35:0x0123, B:37:0x0131, B:39:0x0135, B:41:0x013f, B:42:0x0147, B:43:0x0157, B:45:0x015b, B:47:0x0165, B:54:0x0179, B:57:0x017d, B:61:0x0182, B:63:0x0186, B:66:0x0192, B:68:0x0196, B:71:0x019b, B:77:0x0153, B:80:0x0120, B:82:0x0176, B:83:0x0043, B:85:0x0080, B:87:0x0084, B:89:0x0088, B:91:0x008c, B:93:0x00a1, B:94:0x00b0, B:96:0x00bb, B:97:0x00ca, B:98:0x00a4, B:100:0x00ae, B:15:0x003c, B:51:0x0172, B:27:0x00dd, B:29:0x00e6, B:30:0x00ee, B:33:0x0112, B:34:0x011c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182 A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x0019, B:10:0x002d, B:12:0x0038, B:17:0x0047, B:19:0x004b, B:21:0x004f, B:23:0x0064, B:24:0x0073, B:25:0x00d6, B:32:0x010a, B:35:0x0123, B:37:0x0131, B:39:0x0135, B:41:0x013f, B:42:0x0147, B:43:0x0157, B:45:0x015b, B:47:0x0165, B:54:0x0179, B:57:0x017d, B:61:0x0182, B:63:0x0186, B:66:0x0192, B:68:0x0196, B:71:0x019b, B:77:0x0153, B:80:0x0120, B:82:0x0176, B:83:0x0043, B:85:0x0080, B:87:0x0084, B:89:0x0088, B:91:0x008c, B:93:0x00a1, B:94:0x00b0, B:96:0x00bb, B:97:0x00ca, B:98:0x00a4, B:100:0x00ae, B:15:0x003c, B:51:0x0172, B:27:0x00dd, B:29:0x00e6, B:30:0x00ee, B:33:0x0112, B:34:0x011c), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus, com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus) {
        synchronized (this) {
            int i = aT;
            aO = (i + 29) % 128;
            if (!this.X) {
                aO = (i + 31) % 128;
                if (!this.ac) {
                    boolean z = true;
                    this.ac = true;
                    com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda47
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.bl.this.aD();
                        }
                    });
                    com.facetec.sdk.eb.i();
                    if (com.facetec.sdk.FaceTecSessionActivity.e != null) {
                        int i2 = aT + 1;
                        aO = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 11 / 0;
                        }
                        this.T = true;
                        android.content.Intent intent = new android.content.Intent();
                        h(false);
                        if (com.facetec.sdk.bj.c()) {
                            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda48
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.bl.this.aE();
                                }
                            });
                        }
                        com.facetec.sdk.ap.b(this, faceTecSessionStatus);
                        com.facetec.sdk.FaceTecSessionResult faceTecSessionResult = new com.facetec.sdk.FaceTecSessionResult(faceTecSessionStatus, this.P, this.Q, this.O);
                        faceTecSessionResult.e(com.facetec.sdk.cn.b);
                        intent.putExtra(com.facetec.sdk.FaceTecSDK.EXTRA_SESSION_RESULTS, faceTecSessionResult);
                        if (com.facetec.sdk.FaceTecSessionActivity.i != null) {
                            aO = (aT + 63) % 128;
                            b(false);
                            intent.putExtra(com.facetec.sdk.FaceTecSDK.EXTRA_ID_SCAN_RESULTS, this.aB);
                        }
                        this.B = faceTecSessionResult;
                        com.facetec.sdk.FaceTecSessionActivity.e = null;
                        com.facetec.sdk.FaceTecSessionActivity.i = null;
                        setResult(-1, intent);
                        finish();
                        K();
                        if (this.ai) {
                            int i4 = (aT + 7) % 128;
                            aO = i4;
                            if (faceTecIDScanStatus == null) {
                                aT = (i4 + 61) % 128;
                                int i5 = aT + 77;
                                aO = i5 % 128;
                                int i6 = i5 % 2;
                                if (faceTecSessionStatus == com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL) {
                                    int i7 = com.facetec.sdk.FaceTecSDK.f3366a.exitAnimationUnsuccessResourceID;
                                    if (com.facetec.sdk.FaceTecSDK.f3366a.exitAnimationUnsuccessResourceID == -1) {
                                        int i8 = aO + 111;
                                        aT = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            int i9 = 3 / 0;
                                        }
                                    }
                                    overridePendingTransition(0, i7);
                                    return;
                                }
                                if (faceTecSessionStatus != com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY) {
                                    overridePendingTransition(0, 0);
                                    return;
                                }
                                int i10 = com.facetec.sdk.FaceTecSDK.f3366a.exitAnimationSuccessResourceID;
                                if (com.facetec.sdk.FaceTecSDK.f3366a.exitAnimationSuccessResourceID == -1) {
                                    i10 = z ? com.facetec.sdk.R.anim.facetec_fade_out : 0;
                                }
                                overridePendingTransition(0, i10);
                                return;
                            }
                        }
                        z = false;
                        int i52 = aT + 77;
                        aO = i52 % 128;
                        int i62 = i52 % 2;
                        if (faceTecSessionStatus == com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL) {
                        }
                    }
                    if (com.facetec.sdk.FaceTecSessionActivity.i != null && !this.Z && !this.F) {
                        this.aB = new com.facetec.sdk.FaceTecIDScanResult(faceTecIDScanStatus);
                        this.Z = true;
                        com.facetec.sdk.t.b bVar = com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL;
                        if (this.aB.getStatus() == com.facetec.sdk.FaceTecIDScanStatus.USER_CANCELED) {
                            bVar = com.facetec.sdk.t.b.USER_CANCELLED;
                        } else if (this.aB.getStatus() == com.facetec.sdk.FaceTecIDScanStatus.CONTEXT_SWITCH) {
                            bVar = com.facetec.sdk.t.b.SESSION_CONTEXT_SWITCH;
                        }
                        d(bVar, false);
                        if (this.aB.getStatus() != null) {
                            com.facetec.sdk.t.c(this, com.facetec.sdk.c.ID_SCAN_CALLBACK_CALLED, this.aB.getStatus().toString(), (java.lang.Throwable) null);
                        }
                        com.facetec.sdk.FaceTecSessionActivity.i.processIDScanWhileFaceTecSDKWaits(this.aB, new com.facetec.sdk.bs(this));
                    }
                    this.T = true;
                    android.content.Intent intent2 = new android.content.Intent();
                    h(false);
                    if (com.facetec.sdk.bj.c()) {
                    }
                    com.facetec.sdk.ap.b(this, faceTecSessionStatus);
                    com.facetec.sdk.FaceTecSessionResult faceTecSessionResult2 = new com.facetec.sdk.FaceTecSessionResult(faceTecSessionStatus, this.P, this.Q, this.O);
                    faceTecSessionResult2.e(com.facetec.sdk.cn.b);
                    intent2.putExtra(com.facetec.sdk.FaceTecSDK.EXTRA_SESSION_RESULTS, faceTecSessionResult2);
                    if (com.facetec.sdk.FaceTecSessionActivity.i != null) {
                    }
                    this.B = faceTecSessionResult2;
                    com.facetec.sdk.FaceTecSessionActivity.e = null;
                    com.facetec.sdk.FaceTecSessionActivity.i = null;
                    setResult(-1, intent2);
                    finish();
                    K();
                    if (this.ai) {
                    }
                    z = false;
                    int i522 = aT + 77;
                    aO = i522 % 128;
                    int i622 = i522 % 2;
                    if (faceTecSessionStatus == com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.facetec.sdk.cx cxVar) {
        aT = (aO + 121) % 128;
        if (isFinishing()) {
            return;
        }
        getFragmentManager().beginTransaction().replace(this.aq, cxVar, "RetryFaceScan").commitAllowingStateLoss();
        this.f = cxVar;
        int i = aO + 13;
        aT = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void e(int i) {
        aT = (aO + 99) % 128;
        if (!isFinishing()) {
            final com.facetec.sdk.cx q = com.facetec.sdk.cx.q();
            this.b.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda62
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.a(q);
                }
            }, i);
            return;
        }
        int i2 = aO + 109;
        aT = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
    }

    @Override // com.facetec.sdk.bf
    final void h() {
        int i = aT + 115;
        aO = i % 128;
        if (i % 2 != 0) {
            com.facetec.sdk.eb.i();
            boolean z = com.facetec.sdk.az.e;
            throw null;
        }
        com.facetec.sdk.eb.i();
        if (com.facetec.sdk.az.e) {
            e(com.facetec.sdk.t.b.PRE_SESSION_PHASE_2_TIMEOUT);
            aO = (aT + 29) % 128;
        } else {
            e(com.facetec.sdk.t.b.PRE_SESSION_PHASE_1_TIMEOUT);
        }
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1884737398, -1884737390, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        try {
            boolean z2 = com.facetec.sdk.cq.e(this, false).length != 0;
            d(new java.lang.Object[]{this, false}, com.facetec.sdk.oh.a.c(), -612370324, 612370324, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            this.f3415a.i();
            this.f = (com.facetec.sdk.cx) getFragmentManager().findFragmentByTag("RetryFaceScan");
            this.j = (com.facetec.sdk.bx) getFragmentManager().findFragmentByTag("PreEnroll");
            if (this.f != null) {
                aT = (aO + 81) % 128;
                if (this.f.s() && (!this.f.s() || z2)) {
                    this.f.b(false, 500, 0);
                    this.f.b.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                    aT = (aO + 13) % 128;
                }
                this.f.e((android.content.Context) this, true);
                aT = (aO + 95) % 128;
                return;
            }
            if (this.j != null) {
                if (!z2) {
                    this.j.e((android.content.Context) this, true);
                    return;
                }
                this.j.b(false, 500, 0);
                this.j.b.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                int i2 = aT + 53;
                aO = i2 % 128;
                int i3 = i2 % 2;
            }
            e(500);
        } catch (java.lang.Throwable th) {
            com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
            sb.append(": ");
            sb.append(th.getMessage());
            com.facetec.sdk.t.a(this, th, cVar, sb.toString(), true, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
            a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
        }
    }

    private static /* synthetic */ java.lang.Object j(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int i = aO + 59;
        aT = i % 128;
        try {
            if (i % 2 == 0) {
                com.facetec.sdk.eb.i();
                blVar.e(com.facetec.sdk.t.b.SESSION_TIMEOUT);
                d(new java.lang.Object[]{blVar}, com.facetec.sdk.oh.a.c(), 1884737398, -1884737390, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                blVar.a(false);
                blVar.e(2253);
            } else {
                com.facetec.sdk.eb.i();
                blVar.e(com.facetec.sdk.t.b.SESSION_TIMEOUT);
                d(new java.lang.Object[]{blVar}, com.facetec.sdk.oh.a.c(), 1884737398, -1884737390, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                blVar.a(false);
                blVar.e(400);
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
            sb.append(": ");
            sb.append(th.getMessage());
            com.facetec.sdk.t.a(blVar, th, cVar, sb.toString(), true, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
            blVar.a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
            return null;
        }
    }

    @Override // com.facetec.sdk.bf
    final void d(java.lang.String str) {
        boolean z;
        com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
        sb.append(": ");
        sb.append(str);
        java.lang.String obj = sb.toString();
        if (com.facetec.sdk.ai.f3384a) {
            z = false;
        } else {
            aO = (aT + 81) % 128;
            z = true;
        }
        com.facetec.sdk.t.a(this, null, cVar, obj, z, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
        a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
        int i = aT + 13;
        aO = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    @Override // com.facetec.sdk.bf
    final void b(java.lang.String str) {
        java.lang.String str2;
        int i = aO;
        int i2 = i + 65;
        aT = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i3 = i + 89;
            aT = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str2 = str;
        } else {
            str2 = "";
        }
        if (this.at) {
            com.facetec.sdk.t.a(this, new java.lang.Throwable(str2), com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_IDSCAN, "IDScan Camera Error: ".concat(java.lang.String.valueOf(str)), false, com.facetec.sdk.FaceTecIDScanStatus.CAMERA_ERROR.ordinal());
            d(new java.lang.Object[]{this, com.facetec.sdk.FaceTecIDScanStatus.CAMERA_ERROR}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            return;
        }
        com.facetec.sdk.t.a(this, new java.lang.Throwable(str2), com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_FACESCAN, "FaceScan Camera Error: ".concat(java.lang.String.valueOf(str)), true, com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE.ordinal());
        a(com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (com.facetec.sdk.FaceTecIDScanStatus) null);
    }

    @Override // com.facetec.sdk.bf
    final void j() {
        boolean z;
        int i = aT + 71;
        aO = i % 128;
        if (i % 2 != 0) {
            this.L = null;
            this.e = com.facetec.sdk.az.a();
            z = true;
        } else {
            this.L = null;
            this.e = com.facetec.sdk.az.a();
            z = false;
        }
        this.V = z;
        U();
        O();
    }

    @Override // com.facetec.sdk.bf
    final void l() {
        synchronized (this) {
            int i = aT + 125;
            aO = i % 128;
            if (i % 2 != 0) {
                e(com.facetec.sdk.t.b.USER_CANCELLED);
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED.toString(), (java.lang.Throwable) null);
                a(com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED, (com.facetec.sdk.FaceTecIDScanStatus) null);
                int i2 = 48 / 0;
            } else {
                e(com.facetec.sdk.t.b.USER_CANCELLED);
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED.toString(), (java.lang.Throwable) null);
                a(com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED, (com.facetec.sdk.FaceTecIDScanStatus) null);
            }
        }
    }

    @Override // com.facetec.sdk.bf
    final void n() {
        synchronized (this) {
            int i = aO + 107;
            aT = i % 128;
            java.lang.Object obj = null;
            if (i % 2 != 0) {
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED.toString(), (java.lang.Throwable) null);
                if (this.f3415a == null) {
                    return;
                }
                this.f3415a.i();
                this.f3415a.e(true);
                if (!this.f3415a.b(this, false)) {
                    d(com.facetec.sdk.as.r);
                }
                if (this.f != null) {
                    this.f.r();
                }
                int i2 = aO + 89;
                aT = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED.toString(), (java.lang.Throwable) null);
            com.facetec.sdk.cn cnVar = this.f3415a;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.facetec.sdk.bf
    final void q() {
        synchronized (this) {
            int i = aO + 41;
            aT = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (!this.at) {
                e(com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY);
                return;
            }
            d(new java.lang.Object[]{this, com.facetec.sdk.FaceTecIDScanStatus.SUCCESS}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            aO = (aT + 49) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00c5, code lost:
    
        if (r8.aj != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if ((r0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        r0 = r8.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012c, code lost:
    
        if (r0.getAlpha() > 0.0f) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0081, code lost:
    
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) goto L31;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBackPressed() {
        android.widget.ImageView imageView;
        com.facetec.sdk.bw bwVar;
        com.facetec.sdk.bw bwVar2;
        synchronized (this) {
            if (E()) {
                return;
            }
            if (!ae()) {
                if (this.J != null && this.J.c()) {
                    int i = aO + 43;
                    aT = i % 128;
                }
                aT = (aO + 7) % 128;
                if (!((java.lang.Boolean) d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1387399372, -1387399352, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue()) {
                    java.lang.Object obj = null;
                    if (this.x != null) {
                        int i2 = aT + 105;
                        aO = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 63 / 0;
                        }
                    }
                    if (this.f != null && this.f.c()) {
                        imageView = this.f.f3417a;
                    } else if (ag()) {
                        aO = (aT + 19) % 128;
                        imageView = this.j.f3417a;
                    } else {
                        if (this.i != null && this.i.c()) {
                            if (!this.t) {
                                aO = (aT + 101) % 128;
                            }
                            imageView = this.i.g;
                        }
                        if (this.e != null && this.e.c()) {
                            imageView = this.e.b;
                        } else if (!this.at || (bwVar = this.z) == null) {
                            imageView = null;
                        } else {
                            int i4 = aT + 17;
                            aO = i4 % 128;
                            if (i4 % 2 != 0) {
                                android.widget.ImageView imageView2 = bwVar.c;
                                obj.hashCode();
                                throw null;
                            }
                            imageView = bwVar.c;
                        }
                    }
                    if (imageView == null) {
                        com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEFINITELY_BUG_IF_SEEN, "Unexpected Scenario: isCancelButtonVisibleAndEnabled -> cancelButton == null ", (java.lang.Throwable) null);
                    } else if (imageView.getVisibility() == 0) {
                        int i5 = aO + 1;
                        aT = i5 % 128;
                        if (i5 % 2 == 0) {
                            if (imageView.getAlpha() > 2.0f) {
                                if (imageView.isEnabled()) {
                                    if (!this.aj) {
                                        if (this.at && (bwVar2 = this.z) != null) {
                                            if (bwVar2.c()) {
                                                bwVar2.g.a(false, true);
                                                bwVar2.i.a(false, true);
                                                bwVar2.b.a(false, true);
                                                bwVar2.f3441a.a(false, true);
                                            }
                                            d(new java.lang.Object[]{this, com.facetec.sdk.FaceTecIDScanStatus.USER_CANCELED}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                                            return;
                                        }
                                        if (b()) {
                                            aT = (aO + 115) % 128;
                                            c(false);
                                            e(com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED);
                                            return;
                                        }
                                        if (this.f != null) {
                                            int i6 = aT + 25;
                                            aO = i6 % 128;
                                            if (i6 % 2 != 0) {
                                                getFragmentManager().findFragmentByTag("RetryFaceScan");
                                                obj.hashCode();
                                                throw null;
                                            }
                                            if (getFragmentManager().findFragmentByTag("RetryFaceScan") != null) {
                                                ((com.facetec.sdk.bg) getFragmentManager().findFragmentByTag("RetryFaceScan")).i();
                                                return;
                                            }
                                        }
                                        if (ag()) {
                                            if (a() != com.facetec.sdk.bf.e.GRANTED) {
                                                p();
                                                return;
                                            } else {
                                                m();
                                                return;
                                            }
                                        }
                                    }
                                    o();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
    
        if (r12.g != false) goto L23;
     */
    @Override // com.facetec.sdk.bf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void o() {
        synchronized (this) {
            if (this.b != null) {
                int i = aO + 55;
                aT = i % 128;
                if (i % 2 == 0) {
                    this.b.removeCallbacks(null);
                    int i2 = 21 / 0;
                } else {
                    this.b.removeCallbacks(null);
                }
            }
            if (!this.at) {
                e(com.facetec.sdk.t.b.USER_CANCELLED);
                d(new java.lang.Object[]{this, false}, com.facetec.sdk.oh.a.c(), -612370324, 612370324, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                if (this.f3415a == null) {
                    com.facetec.sdk.t.c(this, com.facetec.sdk.c.PHOENIX_HANDLER_UNEXPECTED_NULL, "Coming from onUserCancelled(). Activity State Info: ", (java.lang.Throwable) null);
                } else {
                    this.f3415a.c = true;
                    this.f3415a.f3471a = true;
                    if (this.H == com.facetec.sdk.bl.d.PRE_SESSION_STARTED) {
                        this.f3415a.i();
                    } else if (this.H == com.facetec.sdk.bl.d.FACESCAN_SESSION_STARTED) {
                        aT = (aO + 125) % 128;
                        this.f3415a.e(true);
                        aT = (aO + 65) % 128;
                    }
                }
                try {
                    e(400);
                    return;
                } catch (java.lang.Throwable th) {
                    com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown error: ");
                    sb.append(th.getMessage());
                    com.facetec.sdk.t.a(this, th, cVar, sb.toString(), true, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
                    a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    return;
                }
            }
            int i3 = aO + 17;
            aT = i3 % 128;
            if (i3 % 2 == 0) {
                h(true);
                if (this.g) {
                    a(com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED, com.facetec.sdk.FaceTecIDScanStatus.USER_CANCELED);
                    return;
                }
                if (this.V) {
                    e(com.facetec.sdk.t.b.USER_CANCELLED);
                    a(this.B.getStatus(), com.facetec.sdk.FaceTecIDScanStatus.USER_CANCELED);
                    return;
                }
                a(this.B.getStatus(), com.facetec.sdk.FaceTecIDScanStatus.USER_CANCELED);
                int i4 = aT + 61;
                aO = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            h(false);
        }
    }

    final void x() {
        h(false);
        if (this.b != null) {
            this.b.removeCallbacks(null);
        }
        if (this.V) {
            aO = (aT + 117) % 128;
            e(com.facetec.sdk.t.b.USER_CANCELLED);
            aT = (aO + 97) % 128;
        }
        a(com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (com.facetec.sdk.FaceTecIDScanStatus) null);
    }

    @Override // com.facetec.sdk.bf
    final void k() {
        int i = aT + 17;
        aO = i % 128;
        if (i % 2 == 0) {
            U();
            O();
            int i2 = aO + 35;
            aT = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 33 / 0;
                return;
            }
            return;
        }
        U();
        O();
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.facetec.sdk.bf
    final void m() {
        aO = (aT + 119) % 128;
        d(new java.lang.Object[]{this, false}, com.facetec.sdk.oh.a.c(), -612370324, 612370324, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        e(com.facetec.sdk.t.b.USER_CANCELLED);
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED.toString(), (java.lang.Throwable) null);
        a(com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED, (com.facetec.sdk.FaceTecIDScanStatus) null);
        aT = (aO + 95) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aC() {
        aT = (aO + 21) % 128;
        this.av.setVisibility(0);
        this.av.setAlpha(1.0f);
        aO = (aT + 115) % 128;
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        synchronized (this) {
            aT = (aO + 67) % 128;
            super.onRequestPermissionsResult(i, strArr, iArr);
            c(false);
            if (i == 0) {
                aT = (aO + 41) % 128;
                android.content.SharedPreferences.Editor edit = com.facetec.sdk.bj.g(this).edit();
                edit.putBoolean("cameraPermissionsShown", true);
                edit.apply();
                if (iArr.length == 1) {
                    aT = (aO + 101) % 128;
                    if (iArr[0] == 0) {
                        try {
                            X();
                            if (!this.g) {
                                runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda14
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.facetec.sdk.bl.this.aC();
                                    }
                                });
                                com.facetec.sdk.ai aiVar = this.ak;
                                if (aiVar == null) {
                                    a("Request Permission Result");
                                    return;
                                } else {
                                    this.aI = true;
                                    aiVar.d(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda15
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.facetec.sdk.bl.this.aG();
                                        }
                                    });
                                    this.ak.c();
                                }
                            }
                            this.j.q();
                            return;
                        } catch (java.lang.Exception e) {
                            com.facetec.sdk.c cVar = com.facetec.sdk.c.SEVERE_ERROR;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera Permission Request Error: ");
                            sb.append(e.getMessage());
                            com.facetec.sdk.t.a(this, e, cVar, sb.toString(), !com.facetec.sdk.ai.f3384a, com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal());
                            a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (com.facetec.sdk.FaceTecIDScanStatus) null);
                            return;
                        }
                    }
                }
                if (this.g) {
                    com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecIDScanStatus.CAMERA_PERMISSION_DENIED.toString(), (java.lang.Throwable) null);
                    d(com.facetec.sdk.FaceTecIDScanStatus.CAMERA_PERMISSION_DENIED);
                } else {
                    com.facetec.sdk.t.c(this, com.facetec.sdk.c.NON_FATAL_ERROR, com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.toString(), (java.lang.Throwable) null);
                    a(com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED, (com.facetec.sdk.FaceTecIDScanStatus) null);
                    aT = (aO + 55) % 128;
                }
            }
        }
    }

    private void S() throws com.facetec.sdk.ak {
        synchronized (this) {
            int i = aO + 37;
            aT = i % 128;
            java.lang.Object obj = null;
            if (i % 2 != 0) {
                this.e = com.facetec.sdk.az.a();
                if (this.ak == null) {
                    this.ak = com.facetec.sdk.ai.b(this.av, this, false, false);
                    com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACESCAN_CAMERA_CREATED, (java.lang.String) null, (java.lang.Throwable) null);
                    this.ai = this.ak instanceof com.facetec.sdk.af;
                    int i2 = aT + 85;
                    aO = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 3 / 3;
                    }
                }
            } else {
                this.e = com.facetec.sdk.az.a();
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r0 = r3.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        com.facetec.sdk.bl.aO = (com.facetec.sdk.bl.aT + 105) % 128;
        r3.z = com.facetec.sdk.bw.a(false, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        com.facetec.sdk.t.c(r3, com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_FACESCAN, "Error when setting up primary fragment", (java.lang.Throwable) null);
        a(com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, com.facetec.sdk.FaceTecIDScanStatus.UNSUCCESS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001c, code lost:
    
        S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001a, code lost:
    
        if (com.facetec.sdk.FaceTecSessionActivity.e != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (com.facetec.sdk.FaceTecSessionActivity.e != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void X() throws com.facetec.sdk.ak {
        synchronized (this) {
            int i = aO + 91;
            aT = i % 128;
            if (i % 2 == 0) {
                int i2 = 36 / 0;
            }
        }
    }

    private void U() {
        aO = (aT + 9) % 128;
        com.facetec.sdk.cq.R(com.facetec.sdk.eb.d());
        com.facetec.sdk.az.e = true;
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.PRE_SESSION_PHASE_2_START, (java.lang.String) null, (java.lang.Throwable) null);
        aO = (aT + 87) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        int i = aT;
        aO = (i + 73) % 128;
        if (view != null) {
            int i2 = i + 61;
            aO = i2 % 128;
            if (i2 % 2 != 0) {
                view.setVisibility(5);
            } else {
                view.setVisibility(4);
            }
        }
        this.au.setVisibility(4);
    }

    private void T() {
        final android.view.View view;
        int i = aT;
        aO = (i + 115) % 128;
        com.facetec.sdk.ai aiVar = this.ak;
        if (aiVar != null) {
            aO = (i + 53) % 128;
            view = aiVar.b();
            int i2 = aO + 95;
            aT = i2 % 128;
            int i3 = i2 % 2;
        } else {
            view = null;
        }
        com.facetec.sdk.dm.i(this.y);
        this.y.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.b(view);
            }
        }).start();
        b(false);
    }

    private void d(com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus) {
        synchronized (this) {
            this.T = true;
            this.X = false;
            if (this.f3415a != null) {
                int i = aT + 57;
                aO = i % 128;
                if (i % 2 != 0) {
                    this.f3415a.c();
                    int i2 = 1 / 0;
                } else {
                    this.f3415a.c();
                }
            }
            d(new java.lang.Object[]{this, faceTecIDScanStatus}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            aT = (aO + 15) % 128;
        }
    }

    final void a(com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus, com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus) {
        synchronized (this) {
            this.X = false;
            if (this.f3415a != null) {
                int i = aT;
                aO = (i + 73) % 128;
                if (faceTecIDScanStatus == null) {
                    aO = (i + 13) % 128;
                    this.f3415a.c = true;
                    this.f3415a.c();
                }
            }
            if (E()) {
                int i2 = aT + 35;
                aO = i2 % 128;
                if (i2 % 2 != 0) {
                    com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus2 = com.facetec.sdk.FaceTecIDScanStatus.SKIPPED;
                    throw null;
                }
                if (faceTecIDScanStatus != com.facetec.sdk.FaceTecIDScanStatus.SKIPPED) {
                    int i3 = aO + 33;
                    aT = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.aa = false;
                        return;
                    } else {
                        this.aa = false;
                        return;
                    }
                }
            }
            if (this.at) {
                d(new java.lang.Object[]{this, faceTecIDScanStatus}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                return;
            }
            this.T = true;
            this.X = false;
            if (faceTecIDScanStatus == com.facetec.sdk.FaceTecIDScanStatus.SKIPPED) {
                e(faceTecSessionStatus, faceTecIDScanStatus);
            } else {
                e(faceTecSessionStatus);
            }
        }
    }

    private void h(boolean z) {
        boolean z2;
        synchronized (this) {
            if (this.f3415a != null) {
                com.facetec.sdk.cn.b(new java.lang.Object[]{this.f3415a}, -773064662, 773064665, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
                if (z) {
                    com.facetec.sdk.cn.d();
                    this.f3415a = null;
                } else {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (z2) {
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda50
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.az();
                }
            });
            thread.setPriority(10);
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void az() {
        int i = aT + 29;
        aO = i % 128;
        if (i % 2 != 0) {
            h(true);
        } else {
            h(true);
        }
    }

    private void a(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        synchronized (this) {
            if (com.facetec.sdk.FaceTecSessionActivity.i == null) {
                int i = aT + 9;
                aO = i % 128;
                if (i % 2 != 0) {
                    e(this.B.getStatus());
                    int i2 = 23 / 0;
                } else {
                    e(this.B.getStatus());
                }
                return;
            }
            if (faceTecIDScanNextStep == com.facetec.sdk.FaceTecIDScanNextStep.SKIP) {
                a(this.B.getStatus(), com.facetec.sdk.FaceTecIDScanStatus.SKIPPED);
                return;
            }
            this.T = false;
            if (this.f3415a != null) {
                int i3 = aO + 109;
                aT = i3 % 128;
                if (i3 % 2 == 0) {
                    hasWindowFocus();
                    throw null;
                }
                if (hasWindowFocus()) {
                    e(faceTecIDScanNextStep);
                    aT = (aO + 5) % 128;
                    return;
                }
            }
            aT = (aO + 115) % 128;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(java.lang.String str) {
        aT = (aO + 59) % 128;
        if (this.i != null) {
            this.i.e(str);
            aT = (aO + 45) % 128;
        }
    }

    protected final void c(final java.lang.String str) {
        aO = (aT + 77) % 128;
        runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.i(str);
            }
        });
        aT = (aO + 55) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f) {
        aT = (aO + 19) % 128;
        if (this.i != null) {
            this.i.d(f);
            aO = (aT + 1) % 128;
        }
    }

    protected final void b(final float f) {
        int i = aT + 25;
        aO = i % 128;
        if (i % 2 == 0) {
            runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.a(f);
                }
            });
            return;
        }
        runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.a(f);
            }
        });
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void d(final com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        java.lang.Object obj = null;
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEVELOPER_USED_FACESCAN_CALLBACK, "succeed", (java.lang.Throwable) null);
        if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            com.facetec.sdk.eb.b(this, com.facetec.sdk.eb.c.SUCCESS);
        } else if (!com.facetec.sdk.eb.e) {
            android.content.SharedPreferences.Editor edit = com.facetec.sdk.eb.c.edit();
            edit.putBoolean("facetecMoveCloserSoundHasBeenPlayed", true);
            edit.apply();
            aO = (aT + 73) % 128;
        }
        if (com.facetec.sdk.FaceTecSessionActivity.i != null) {
            aT = (aO + 35) % 128;
            this.Y = true;
        }
        runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.b(faceTecIDScanNextStep);
            }
        });
        int i = aO + 9;
        aT = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (com.facetec.sdk.bd.f3414a != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        r1.a(r7, true, false);
        com.facetec.sdk.bl.aT = (com.facetec.sdk.bl.aO + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r1.i.a(true, com.facetec.sdk.FaceTecCustomization.overrideResultScreenSuccessMessage, new com.facetec.sdk.bl$$ExternalSyntheticLambda8(r1, r7));
        r7 = com.facetec.sdk.bl.aO + 49;
        com.facetec.sdk.bl.aT = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if ((r7 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r7 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (com.facetec.sdk.bd.f3414a != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
    
        if (r1.i != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r1.i != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        r3 = com.facetec.sdk.bl.aO + 21;
        com.facetec.sdk.bl.aT = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r5 = 39 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object n(java.lang.Object[] objArr) {
        final com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        final com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep = (com.facetec.sdk.FaceTecIDScanNextStep) objArr[1];
        int i = aT + 125;
        aO = i % 128;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        aT = (aO + 103) % 128;
        a(faceTecIDScanNextStep);
        int i = aT + 35;
        aO = i % 128;
        if (i % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r5.f3415a.c = false;
        r5.f3415a.e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r5.f3415a.c = false;
        r5.f3415a.e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r5.f3415a != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r5.f3415a != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r0 = com.facetec.sdk.bl.aO + 55;
        com.facetec.sdk.bl.aT = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void u() {
        int i = aT + 53;
        aO = i % 128;
        if (i % 2 != 0) {
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEVELOPER_USED_FACESCAN_CALLBACK, "retry", (java.lang.Throwable) null);
            this.T = true;
            this.X = false;
            this.aa = false;
        } else {
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEVELOPER_USED_FACESCAN_CALLBACK, "retry", (java.lang.Throwable) null);
            this.T = false;
            this.X = false;
            this.aa = false;
        }
        this.ad = true;
        runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.ax();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0 = com.facetec.sdk.bl.aT + 25;
        com.facetec.sdk.bl.aO = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if ((r0 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r0 = r5.i;
        r1 = new com.facetec.sdk.bl$$ExternalSyntheticLambda31(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r0.a(false, null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r0 = r5.i;
        r1 = new com.facetec.sdk.bl$$ExternalSyntheticLambda31(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (com.facetec.sdk.bd.f3414a == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (com.facetec.sdk.bd.f3414a == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        a((com.facetec.sdk.FaceTecIDScanNextStep) null, true, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void ax() {
        int i = aO + 1;
        aT = i % 128;
        if (i % 2 != 0) {
            if (this.i == null) {
                return;
            }
            int i2 = aT + 107;
            aO = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
        } else {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ay() {
        int i = aT + 47;
        aO = i % 128;
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            if (!F()) {
                G();
                return;
            }
            int i2 = aT + 113;
            aO = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        F();
        throw null;
    }

    protected final boolean d(java.lang.String str, com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        java.lang.String T = com.facetec.sdk.cq.T(str, false);
        java.lang.Object obj = null;
        if (T.isEmpty()) {
            aT = (aO + 53) % 128;
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.SCAN_RESULT_BLOB_DECODE_ERROR, (java.lang.String) null, (java.lang.Throwable) null);
            u();
            aT = (aO + 51) % 128;
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(T);
            if (jSONObject.optBoolean("success", false)) {
                int i = aO + 73;
                aT = i % 128;
                if (i % 2 == 0) {
                    d(faceTecIDScanNextStep);
                    return false;
                }
                d(faceTecIDScanNextStep);
                return true;
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.facetec.sdk.cw.c);
            if (optJSONObject != null && optJSONObject.optInt(com.facetec.sdk.cw.b) == 1) {
                int i2 = aO + 59;
                aT = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (!this.aK) {
                    this.L = com.facetec.sdk.db.BLURRY_ONLY;
                    this.aK = true;
                    u();
                    aO = (aT + 47) % 128;
                    return false;
                }
            }
            this.aK = false;
            aO = (aT + 109) % 128;
            u();
            aO = (aT + 47) % 128;
            return false;
        } catch (org.json.JSONException unused) {
            u();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0186, code lost:
    
        if (r5.f3438o != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b2, code lost:
    
        r2.W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019d, code lost:
    
        if (com.facetec.sdk.FaceTecSDK.f3366a.i.disableIDFeedbackScreen != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x019f, code lost:
    
        r12 = com.facetec.sdk.bl.aO + 59;
        com.facetec.sdk.bl.aT = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a8, code lost:
    
        if ((r12 % 2) != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01aa, code lost:
    
        r2.V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ad, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ae, code lost:
    
        r2.V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0195, code lost:
    
        if (r5.f3438o != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        final com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        java.lang.Object obj = null;
        try {
            com.facetec.sdk.bu buVar = new com.facetec.sdk.bu(blVar, com.facetec.sdk.cq.T((java.lang.String) objArr[1], true), blVar.az);
            blVar.r = buVar.f3437a;
            blVar.az = buVar.b;
            blVar.z = com.facetec.sdk.bw.a(buVar.h, blVar.g);
            blVar.A = buVar.r;
            com.facetec.sdk.cz czVar = com.facetec.sdk.cz.UNKNOWN;
            if (!buVar.g) {
                int i = aO + 71;
                aT = i % 128;
                if (i % 2 == 0) {
                    boolean z = buVar.i;
                    obj.hashCode();
                    throw null;
                }
                if (buVar.i) {
                    czVar = com.facetec.sdk.cz.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED;
                } else if (!buVar.j) {
                    aO = (aT + 89) % 128;
                    czVar = com.facetec.sdk.cz.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE;
                } else if (buVar.f || !buVar.k || buVar.s) {
                    czVar = buVar.n ? com.facetec.sdk.cz.IDSCAN_RETRY_BARCODE_NOT_READ : com.facetec.sdk.cz.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH;
                } else {
                    czVar = com.facetec.sdk.cz.IDSCAN_RETRY_FACE_DID_NOT_MATCH;
                    aT = (aO + 81) % 128;
                }
            } else if (buVar.b == 1) {
                czVar = com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT;
            } else if (buVar.b == 3) {
                if (blVar.aj) {
                    czVar = blVar.I ? com.facetec.sdk.cz.IDSCAN_SKIP_OR_ERROR_NFC : com.facetec.sdk.cz.IDSCAN_SUCCESS_NFC;
                } else if (buVar.s) {
                    czVar = com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE;
                } else if (buVar.e) {
                    aT = (aO + 125) % 128;
                    czVar = com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT;
                } else {
                    czVar = com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE;
                }
            } else if (buVar.b == 4) {
                czVar = buVar.l ? com.facetec.sdk.cz.IDSCAN_SUCCESS_ADDITIONAL_REVIEW : com.facetec.sdk.cz.IDSCAN_SUCCESS_USER_CONFIRMATION;
            } else if (buVar.b == 5) {
                czVar = buVar.s ? com.facetec.sdk.cz.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT : buVar.e ? com.facetec.sdk.cz.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT : com.facetec.sdk.cz.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT;
            }
            if (buVar.b == 3 && blVar.aj) {
                czVar = blVar.I ? com.facetec.sdk.cz.IDSCAN_SKIP_OR_ERROR_NFC : com.facetec.sdk.cz.IDSCAN_SUCCESS_NFC;
            }
            blVar.ax = com.facetec.sdk.dm.a(czVar);
            if (buVar.b == 4) {
                int i2 = aO + 41;
                aT = i2 % 128;
                if (i2 % 2 == 0) {
                    boolean z2 = buVar.m;
                    obj.hashCode();
                    throw null;
                }
                if (!buVar.m) {
                    android.content.SharedPreferences.Editor edit = com.facetec.sdk.bj.g(blVar).edit();
                    edit.putBoolean(com.facetec.sdk.as.ab, false);
                    edit.apply();
                }
                if (buVar.l) {
                    blVar.af = true;
                    blVar.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda22
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.bl.this.aA();
                        }
                    });
                } else {
                    blVar.A();
                }
                return true;
            }
            if (buVar.b == 0) {
                blVar.aA = com.facetec.sdk.bq.e(false, com.facetec.sdk.cb.FRONT, com.facetec.sdk.bw.c.FRONT);
                blVar.W();
            } else if (buVar.b == 1) {
                blVar.aA = com.facetec.sdk.bq.e(true, com.facetec.sdk.cb.BACK, com.facetec.sdk.bw.c.BACK);
                if (!com.facetec.sdk.FaceTecSDK.f3366a.i.disableIDFeedbackScreen) {
                    aO = (aT + 25) % 128;
                    blVar.V();
                    return false;
                }
                blVar.W();
            } else if (buVar.b == 2) {
                int i3 = aT + 49;
                aO = i3 % 128;
                if (i3 % 2 != 0) {
                    blVar.aA = com.facetec.sdk.bq.e(true, com.facetec.sdk.cb.BACK, com.facetec.sdk.bw.c.BACK);
                } else {
                    blVar.aA = com.facetec.sdk.bq.e(false, com.facetec.sdk.cb.BACK, com.facetec.sdk.bw.c.BACK);
                }
            } else if (buVar.b == 3) {
                int i4 = aO + 81;
                aT = i4 % 128;
                if (i4 % 2 == 0) {
                    com.facetec.sdk.cn cnVar = blVar.f3415a;
                    throw null;
                }
                if (blVar.f3415a != null) {
                    aT = (aO + 45) % 128;
                    blVar.f3415a.f();
                    blVar.aD = buVar.c;
                    blVar.ag = true;
                    blVar.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda33
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.bl.this.aB();
                        }
                    });
                } else {
                    com.facetec.sdk.c cVar = com.facetec.sdk.c.UNEXPECTED_NULL;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("phoenixHandler is null inside onIDScanResultNextStep(). Session is finished: ");
                    sb.append(blVar.isFinishing());
                    com.facetec.sdk.t.c(blVar, cVar, sb.toString(), (java.lang.Throwable) null);
                }
            } else if (buVar.b == 5) {
                if (buVar.d.optBoolean("hasNFC") && !buVar.d.optBoolean("isPassport")) {
                    blVar.ar = true;
                }
                blVar.l = buVar.c.optString("mrzKey");
                if (blVar.q == null) {
                    blVar.q = new com.facetec.sdk.ce(blVar.i, blVar.ar, blVar);
                }
                blVar.p = 0;
                blVar.b(false);
                blVar.aj = true;
                blVar.Z = false;
                blVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda44
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.ai();
                    }
                });
                com.facetec.sdk.t.c(com.facetec.sdk.de.NFC_START);
            } else {
                blVar.C();
            }
            return false;
        } catch (java.lang.Exception e) {
            if (e instanceof org.json.JSONException) {
                e.printStackTrace();
                d(new java.lang.Object[]{blVar, null}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            } else {
                blVar.C();
            }
            return false;
        }
    }

    private void W() {
        int i = (aO + 55) % 128;
        aT = i;
        this.ay = true;
        if (this.z != null) {
            int i2 = i + 125;
            aO = i2 % 128;
            if (i2 % 2 == 0) {
                if (F()) {
                    return;
                }
                a(this.aA, this.ax);
            } else {
                F();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    final void z() {
        aT = (aO + 39) % 128;
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.ID_FEEDBACK_SHOWN, (java.lang.String) null, (java.lang.Throwable) null);
        W();
        aT = (aO + 73) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(java.lang.Runnable runnable) {
        int i = aO + 3;
        aT = i % 128;
        if (i % 2 != 0) {
            if (F() || runnable == null) {
                return;
            }
            int i2 = aO + 117;
            aT = i2 % 128;
            if (i2 % 2 == 0) {
                runnable.run();
                int i3 = 56 / 0;
                return;
            } else {
                runnable.run();
                return;
            }
        }
        F();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z, final java.lang.Runnable runnable) {
        aT = (aO + 87) % 128;
        if (this.i != null) {
            aO = (aT + 37) % 128;
            this.i.a(z, this.ax, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda40
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.e(runnable);
                }
            });
        }
    }

    private void a(final java.lang.Runnable runnable) {
        java.lang.Runnable runnable2;
        int i = aT + 93;
        aO = i % 128;
        final boolean z = true;
        if (i % 2 != 0) {
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEVELOPER_USED_ID_SCAN_CALLBACK, "succeed", (java.lang.Throwable) null);
            runnable2 = new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.d(z, runnable);
                }
            };
        } else {
            com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEVELOPER_USED_ID_SCAN_CALLBACK, "succeed", (java.lang.Throwable) null);
            runnable2 = new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.d(z, runnable);
                }
            };
        }
        runOnUiThread(runnable2);
    }

    private void V() {
        int i = (aO + 49) % 128;
        aT = i;
        this.ae = true;
        if (this.az != 1) {
            if (ae()) {
                aT = (aO + 55) % 128;
                this.i.d(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.J();
                    }
                });
                return;
            } else {
                d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -782830998, 782831019, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
                return;
            }
        }
        int i2 = i + 81;
        aO = i2 % 128;
        if (i2 % 2 == 0) {
            a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.J();
                }
            });
            return;
        }
        a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.J();
            }
        });
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ java.lang.Object x(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int i = aT + 43;
        aO = i % 128;
        if (i % 2 == 0) {
            d(new java.lang.Object[]{blVar}, com.facetec.sdk.oh.a.c(), -1360056131, 1360056133, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            return null;
        }
        d(new java.lang.Object[]{blVar}, com.facetec.sdk.oh.a.c(), -1360056131, 1360056133, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aB() {
        aO = (aT + 119) % 128;
        M();
        aT = (aO + 47) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r2 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8.R != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        d(new java.lang.Object[]{r8, r8.aB.getStatus()}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r8.i != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        a(new com.facetec.sdk.bl$$ExternalSyntheticLambda65(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r8.R != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001f, code lost:
    
        if (com.facetec.sdk.bd.f3414a == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (com.facetec.sdk.bd.f3414a == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006b, code lost:
    
        a((com.facetec.sdk.FaceTecIDScanNextStep) null, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r0 = com.facetec.sdk.bl.aO + 43;
        com.facetec.sdk.bl.aT = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void A() {
        int i = aO + 75;
        aT = i % 128;
        if (i % 2 == 0) {
            d(com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL, true);
        } else {
            d(com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void as() {
        int i = aO + 93;
        aT = i % 128;
        com.facetec.sdk.FaceTecIDScanStatus status = this.aB.getStatus();
        if (i % 2 != 0) {
            d(new java.lang.Object[]{this, status}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        } else {
            d(new java.lang.Object[]{this, status}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            throw null;
        }
    }

    private void a(final com.facetec.sdk.bq bqVar, final java.lang.String str) {
        boolean z;
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEVELOPER_USED_ID_SCAN_CALLBACK, "retry", (java.lang.Throwable) null);
        this.Z = false;
        com.facetec.sdk.bw bwVar = this.z;
        if (bqVar.d) {
            aO = (aT + 65) % 128;
            z = false;
        } else {
            z = true;
        }
        bwVar.k = z;
        this.z.f = bqVar.f3434a;
        this.z.j = bqVar.c;
        runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.c(bqVar, str);
            }
        });
        int i = aT + 47;
        aO = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        if (r7.S.b == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        r7.S.a(new com.facetec.sdk.bl$$ExternalSyntheticLambda63(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (((java.lang.Boolean) d(new java.lang.Object[]{r7}, com.facetec.sdk.oh.a.c(), 1387399372, -1387399352, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (((java.lang.Boolean) d(new java.lang.Object[]{r7}, com.facetec.sdk.oh.a.c(), 1387399372, -1387399352, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void c(com.facetec.sdk.bq bqVar, java.lang.String str) {
        if (!((java.lang.Boolean) d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1387399372, -1387399352, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue()) {
            if (ae()) {
                aT = (aO + 81) % 128;
                this.i.a(bqVar.d, str, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda64
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.aw();
                    }
                });
                return;
            }
            return;
        }
        if (F()) {
            return;
        }
        int i = aT + 19;
        aO = i % 128;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aw() {
        if (F()) {
            return;
        }
        int i = aO + 17;
        aT = i % 128;
        if (i % 2 == 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.i == null) {
            return;
        }
        if (this.i != null) {
            this.i.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.aN();
                }
            });
        } else {
            N();
            aT = (aO + 63) % 128;
        }
    }

    protected final void C() {
        aO = (aT + 5) % 128;
        java.lang.Object obj = null;
        com.facetec.sdk.t.c(this, com.facetec.sdk.c.DEVELOPER_USED_ID_SCAN_CALLBACK, com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, (java.lang.Throwable) null);
        d(new java.lang.Object[]{this, this.aB.getStatus()}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        int i = aT + 55;
        aO = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void d(int i) {
        if (this.i == null || isFinishing()) {
            aT = (aO + 69) % 128;
        } else if (i != 0) {
            this.i.d(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.au();
                }
            }, i);
        } else {
            aO = (aT + 3) % 128;
            ab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void au() {
        aT = (aO + 121) % 128;
        ab();
        int i = aT + 85;
        aO = i % 128;
        if (i % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ab() {
        aT = (aO + 1) % 128;
        if (!isFinishing()) {
            getFragmentManager().beginTransaction().remove(this.i).commitAllowingStateLoss();
            this.i = null;
        } else {
            aT = (aO + 63) % 128;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(boolean z) {
        com.facetec.sdk.m mVar;
        if (com.facetec.sdk.bj.e()) {
            this.P = com.facetec.sdk.cq.a((android.content.Context) this, false);
            this.Q = com.facetec.sdk.cq.e(this, false);
            if (this.Q.length > 0) {
                this.E = android.graphics.BitmapFactory.decodeByteArray(this.Q[0], 0, this.Q[0].length);
            }
        }
        try {
            if (com.facetec.sdk.bj.c() && z) {
                com.facetec.sdk.FaceTecSessionResult faceTecSessionResult = new com.facetec.sdk.FaceTecSessionResult(com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL, this.P, this.Q, com.facetec.sdk.cq.s());
                faceTecSessionResult.e(com.facetec.sdk.cn.b);
                com.facetec.sdk.m mVar2 = this.f3428o;
                if (mVar2 != null) {
                    mVar2.c(faceTecSessionResult, com.facetec.sdk.bj.e);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (com.facetec.sdk.bj.c() && (mVar = this.f3428o) != null) {
            int i = aO + 45;
            aT = i % 128;
            if (i % 2 != 0) {
                mVar.c();
                aT = (aO + 101) % 128;
            } else {
                mVar.c();
                throw null;
            }
        }
        if (this.e != null) {
            this.e.b();
        }
        aO = (aT + 63) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void av() {
        com.facetec.sdk.FaceTecSessionActivity faceTecSessionActivity;
        this.ab = false;
        this.f = (com.facetec.sdk.cx) getFragmentManager().findFragmentByTag("RetryFaceScan");
        if (this.f != null) {
            int i = aO + 49;
            aT = i % 128;
            java.lang.Object obj = null;
            if (i % 2 == 0) {
                com.facetec.sdk.dd ddVar = this.f.l;
                obj.hashCode();
                throw null;
            }
            if (this.f.l != null) {
                com.facetec.sdk.dd ddVar2 = this.f.l;
                if (ddVar2.f3503o == null && (faceTecSessionActivity = (com.facetec.sdk.FaceTecSessionActivity) ddVar2.getActivity()) != null) {
                    ddVar2.f3503o = faceTecSessionActivity.E;
                    ddVar2.c.setAlpha(0.0f);
                    ddVar2.b();
                    ddVar2.c.animate().alpha(1.0f).setDuration(400L).setListener(null);
                }
            }
        }
        aO = (aT + 111) % 128;
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        final com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        final boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = aT;
        aO = (i + 73) % 128;
        java.lang.Object obj = null;
        if (!blVar.ab) {
            blVar.ab = true;
            com.facetec.sdk.eb.i();
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda67
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.j(booleanValue);
                }
            }).d(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda68
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.av();
                }
            });
            int i2 = aT;
            aO = ((i2 ^ 85) + ((i2 & 85) << 1)) % 128;
            return null;
        }
        int i3 = ((i | 91) << 1) - (i ^ 91);
        aO = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void at() {
        com.facetec.sdk.m mVar;
        aT = (aO + 91) % 128;
        com.facetec.sdk.cn cnVar = this.f3415a;
        if (cnVar != null) {
            cnVar.g();
        }
        try {
            this.O = com.facetec.sdk.cq.s();
        } catch (java.lang.Exception e) {
            com.facetec.sdk.ay.c(e.getMessage());
        }
        if (com.facetec.sdk.bj.e() && this.V) {
            this.P = com.facetec.sdk.cq.a((android.content.Context) this, true);
            this.Q = com.facetec.sdk.cq.e(this, true);
            if (this.Q.length > 0) {
                this.E = android.graphics.BitmapFactory.decodeByteArray(this.Q[0], 0, this.Q[0].length);
            }
        }
        if (com.facetec.sdk.bj.c() && (mVar = this.f3428o) != null) {
            mVar.c();
        }
        if (this.e != null) {
            aO = (aT + 125) % 128;
            this.e.b();
            int i = aT + 55;
            aO = i % 128;
            if (i % 2 != 0) {
                int i2 = 5 / 4;
            }
        }
        aT = (aO + 125) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ar() {
        this.X = false;
        com.facetec.sdk.FaceTecSessionResult faceTecSessionResult = new com.facetec.sdk.FaceTecSessionResult(com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, this.P, this.Q, this.O);
        faceTecSessionResult.e(com.facetec.sdk.cn.b);
        if (com.facetec.sdk.FaceTecSessionActivity.e != null) {
            this.aa = true;
            this.B = faceTecSessionResult;
            if (faceTecSessionResult.getStatus() != null) {
                aO = (aT + 45) % 128;
                com.facetec.sdk.t.c(this, com.facetec.sdk.c.FACESCAN_CALLBACK_CALLED, this.B.getStatus().toString(), (java.lang.Throwable) null);
            }
            com.facetec.sdk.FaceTecSessionActivity.e.processSessionWhileFaceTecSDKWaits(faceTecSessionResult, new com.facetec.sdk.be(this));
            aO = (aT + 9) % 128;
            return;
        }
        e(com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY);
    }

    private void Y() {
        aT = (aO + 83) % 128;
        com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.at();
            }
        }).d(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.ar();
            }
        });
        aT = (aO + 9) % 128;
    }

    private void a(final com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep, final boolean z, final boolean z2) {
        Z();
        com.facetec.sdk.t.g = 0;
        this.aE = new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.a(z, z2, faceTecIDScanNextStep);
            }
        });
        java.util.Timer timer = new java.util.Timer();
        this.aC = timer;
        timer.scheduleAtFixedRate(this.aE, 0L, 1000L);
        aO = (aT + 85) % 128;
    }

    private static /* synthetic */ java.lang.Object p(java.lang.Object[] objArr) {
        final com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) objArr[2]).booleanValue();
        final com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep = (com.facetec.sdk.FaceTecIDScanNextStep) objArr[3];
        boolean z = com.facetec.sdk.t.c;
        if (com.facetec.sdk.bd.c) {
            aT = (aO + 21) % 128;
            z = com.facetec.sdk.t.c && com.facetec.sdk.t.j;
            aT = (aO + 117) % 128;
        }
        if (!z && com.facetec.sdk.t.g < 300) {
            com.facetec.sdk.t.g++;
            return null;
        }
        if (!booleanValue) {
            if (com.facetec.sdk.t.g >= 300) {
                aO = (aT + 45) % 128;
                com.facetec.sdk.t.b(blVar, "i", com.facetec.sdk.t.g);
            }
            if (blVar.R != null || blVar.i == null) {
                d(new java.lang.Object[]{blVar, blVar.aB.getStatus()}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            } else {
                blVar.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda69
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.an();
                    }
                });
            }
        } else if (blVar.i != null) {
            if (com.facetec.sdk.t.g >= 300) {
                com.facetec.sdk.t.b(blVar, "f", com.facetec.sdk.t.g);
            }
            if (booleanValue2) {
                int i = aO + 51;
                aT = i % 128;
                if (i % 2 == 0) {
                    blVar.F();
                    throw null;
                }
                if (blVar.F()) {
                    blVar.Z();
                    return null;
                }
                blVar.i.a(false, null, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda55
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.ap();
                    }
                });
            } else {
                blVar.i.a(true, com.facetec.sdk.FaceTecCustomization.overrideResultScreenSuccessMessage, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda66
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.c(faceTecIDScanNextStep);
                    }
                });
            }
        }
        blVar.Z();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ap() {
        int i = aO + 47;
        aT = i % 128;
        G();
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        int i = aT + 87;
        aO = i % 128;
        a(faceTecIDScanNextStep);
        if (i % 2 != 0) {
            int i2 = 50 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void an() {
        int i = aT + 57;
        aO = i % 128;
        com.facetec.sdk.FaceTecIDScanStatus status = this.aB.getStatus();
        if (i % 2 == 0) {
            d(new java.lang.Object[]{this, status}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        } else {
            d(new java.lang.Object[]{this, status}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void Z() {
        aT = (aO + 35) % 128;
        java.util.Timer timer = this.aC;
        java.lang.Object obj = null;
        if (timer != null) {
            timer.cancel();
            this.aC = null;
            aT = (aO + 55) % 128;
        }
        java.util.TimerTask timerTask = this.aE;
        if (timerTask != null) {
            int i = aO + 103;
            aT = i % 128;
            if (i % 2 != 0) {
                timerTask.cancel();
                this.aE = null;
            } else {
                timerTask.cancel();
                this.aE = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    final void B() {
        aa();
        this.aF = new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.aq();
            }
        });
        java.util.Timer timer = new java.util.Timer();
        this.aG = timer;
        timer.scheduleAtFixedRate(this.aF, 250L, 500L);
        aT = (aO + 53) % 128;
    }

    private static /* synthetic */ java.lang.Object m(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        aT = (aO + 35) % 128;
        if (com.facetec.sdk.ea.b(blVar)) {
            blVar.q.d(false, true);
            blVar.aa();
        }
        int i = aT + 71;
        aO = i % 128;
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void aa() {
        java.util.Timer timer = this.aG;
        if (timer != null) {
            timer.cancel();
            this.aG = null;
        }
        java.util.TimerTask timerTask = this.aF;
        if (timerTask != null) {
            int i = aT + 121;
            aO = i % 128;
            if (i % 2 != 0) {
                timerTask.cancel();
                this.aF = null;
                int i2 = 4 / 0;
            } else {
                timerTask.cancel();
                this.aF = null;
            }
            aT = (aO + 79) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (getFragmentManager().findFragmentByTag("FaceScan") != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        r5.e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        getFragmentManager().beginTransaction().remove(r5.e).commitAllowingStateLoss();
        com.facetec.sdk.bl.aO = (com.facetec.sdk.bl.aT + 75) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (getFragmentManager().findFragmentByTag("FaceScan") != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep, boolean z) {
        if (this.f3415a == null) {
            return;
        }
        this.f3415a.b();
        T();
        if (this.e != null) {
            int i = aT + 105;
            aO = i % 128;
            if (i % 2 != 0) {
                int i2 = 77 / 0;
            }
        }
        if (this.z == null) {
            aT = (aO + 105) % 128;
            this.z = com.facetec.sdk.bw.a(false, this.g);
        }
        if (!this.g) {
            this.B = new com.facetec.sdk.FaceTecSessionResult(this.B.getStatus(), this.P, this.Q, this.O);
            if (this.H == com.facetec.sdk.bl.d.FACESCAN_SESSION_STARTED) {
                this.f3415a.e(true);
            }
        }
        this.C = faceTecIDScanNextStep;
        this.z.b(z);
        this.z.e(this.n);
        ac();
    }

    private void ac() {
        aT = (aO + 105) % 128;
        this.at = true;
        this.D = java.util.UUID.randomUUID().toString();
        this.f3415a.a(this.z.n);
        getFragmentManager().beginTransaction().replace(this.aq, this.z, "IDScan").commitAllowingStateLoss();
        if (this.g) {
            aT = (aO + 27) % 128;
            d(com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL, true);
        }
    }

    public void r() {
        synchronized (this) {
            aT = (aO + 73) % 128;
            this.z.e();
            int i = aO + 85;
            aT = i % 128;
            if (i % 2 == 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] c(org.json.JSONObject jSONObject, java.lang.String str) {
        android.content.SharedPreferences g;
        java.lang.String str2;
        boolean z;
        int i = aT + 117;
        aO = i % 128;
        if (i % 2 != 0) {
            g = com.facetec.sdk.bj.g(this);
            str2 = com.facetec.sdk.as.ab;
            z = true;
        } else {
            g = com.facetec.sdk.bj.g(this);
            str2 = com.facetec.sdk.as.ab;
            z = false;
        }
        boolean z2 = g.getBoolean(str2, z);
        byte[] p = com.facetec.sdk.cq.p(str, this.D, jSONObject.toString(), z2);
        int i2 = aO + 29;
        aT = i2 % 128;
        if (i2 % 2 != 0) {
            return p;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void a(final org.json.JSONObject jSONObject) {
        aT = (aO + 69) % 128;
        d(0);
        com.facetec.sdk.da.c cVar = com.facetec.sdk.da.c.USER_CONFIRMED_INFO;
        this.aL = cVar;
        this.i = com.facetec.sdk.da.a(true, cVar);
        getFragmentManager().beginTransaction().setCustomAnimations(com.facetec.sdk.R.animator.facetec_no_delay_fade_in, 0).add(this.aq, this.i, "Results").commitAllowingStateLoss();
        d(new java.lang.Object[]{this, new com.facetec.sdk.bl.c() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda32
            @Override // com.facetec.sdk.bl.c
            public final byte[] getIdScanBytes(java.lang.String str) {
                byte[] c2;
                c2 = com.facetec.sdk.bl.this.c(jSONObject, str);
                return c2;
            }
        }}, com.facetec.sdk.oh.a.c(), -2120258639, 2120258652, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        aT = (aO + 105) % 128;
    }

    private static /* synthetic */ java.lang.Object h(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        aO = (aT + 41) % 128;
        blVar.x.setEnabled(true);
        int i = aT + 61;
        aO = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d != com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r1.x.animate().alpha(1.0f).setDuration(500).setStartDelay(r6).setListener(null).withEndAction(new com.facetec.sdk.bl$$ExternalSyntheticLambda16(r1)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r6 = com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d;
        r6 = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r1.x != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r1.x != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        r3 = r3 + 97;
        com.facetec.sdk.bl.aO = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object l(java.lang.Object[] objArr) {
        final com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = aO + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i2 = i % 128;
        aT = i2;
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            int i3 = 73 / 0;
        }
        return null;
    }

    private void af() {
        aT = (aO + 99) % 128;
        if (this.x != null && com.facetec.sdk.FaceTecSDK.f3366a.f3361o.d == com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            aT = (aO + 55) % 128;
            this.x.setEnabled(false);
            this.x.animate().alpha(0.0f).setDuration(300L).setStartDelay(0L).setListener(null).withEndAction(null).start();
        }
        int i = aT + 119;
        aO = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object f(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        aT = (aO + 79) % 128;
        blVar.Z = true;
        java.lang.Object obj = null;
        if (blVar.aB.getStatus() != null) {
            int i = aO + 107;
            aT = i % 128;
            if (i % 2 != 0) {
                com.facetec.sdk.t.c(blVar, com.facetec.sdk.c.ID_SCAN_CALLBACK_CALLED, blVar.aB.getStatus().toString(), (java.lang.Throwable) null);
            } else {
                com.facetec.sdk.t.c(blVar, com.facetec.sdk.c.ID_SCAN_CALLBACK_CALLED, blVar.aB.getStatus().toString(), (java.lang.Throwable) null);
                obj.hashCode();
                throw null;
            }
        }
        com.facetec.sdk.FaceTecSessionActivity.i.processIDScanWhileFaceTecSDKWaits(blVar.aB, new com.facetec.sdk.bs(blVar));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ak() {
        aT = (aO + 45) % 128;
        this.q.d(false, false);
        aO = (aT + 21) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ai() {
        com.facetec.sdk.da daVar;
        java.lang.String str;
        java.lang.Runnable runnable;
        aT = (aO + 95) % 128;
        this.av.setVisibility(4);
        if (this.i != null && this.z != null) {
            int i = aT + 63;
            aO = i % 128;
            if (i % 2 != 0) {
                daVar = this.i;
                str = this.ax;
                runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda34
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.ak();
                    }
                };
            } else {
                daVar = this.i;
                str = this.ax;
                runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda34
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.bl.this.ak();
                    }
                };
            }
            daVar.a(true, str, runnable);
        }
        int i2 = aT + 73;
        aO = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        int i = aO + 7;
        aT = i % 128;
        if (i % 2 == 0) {
            super.onNewIntent(intent);
            int i2 = 92 / 0;
            if (this.q == null) {
                return;
            }
        } else {
            super.onNewIntent(intent);
            if (this.q == null) {
                return;
            }
        }
        if (this.q.c != null) {
            this.t = true;
            if (this.q.c.a(intent, this.q.d)) {
                aT = (aO + 93) % 128;
                this.q.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(java.lang.String str) {
        int i = aO + 75;
        aT = i % 128;
        if (i % 2 == 0) {
            this.i.e(true, true, str, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda43
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.al();
                }
            });
        } else {
            this.i.e(false, true, str, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda43
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.al();
                }
            });
        }
        int i2 = aO + 45;
        aT = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] f(java.lang.String str) {
        aT = (aO + 11) % 128;
        byte[] q = com.facetec.sdk.cq.q(str, this.D, false, true, com.facetec.sdk.bj.g(this).getBoolean(com.facetec.sdk.as.ab, false));
        int i = aT + 45;
        aO = i % 128;
        if (i % 2 == 0) {
            return q;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void am() {
        aT = (aO + 11) % 128;
        getFragmentManager().beginTransaction().remove(this.i).commitAllowingStateLoss();
        this.i = null;
        com.facetec.sdk.da.c cVar = com.facetec.sdk.da.c.SKIPPED_NFC;
        this.aL = cVar;
        this.i = com.facetec.sdk.da.a(true, cVar);
        getFragmentManager().beginTransaction().add(this.aq, this.i, "Results").commitAllowingStateLoss();
        d(new java.lang.Object[]{this, new com.facetec.sdk.bl.c() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda42
            @Override // com.facetec.sdk.bl.c
            public final byte[] getIdScanBytes(java.lang.String str) {
                byte[] f;
                f = com.facetec.sdk.bl.this.f(str);
                return f;
            }
        }}, com.facetec.sdk.oh.a.c(), -2120258639, 2120258652, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        aO = (aT + 51) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void al() {
        int i = aT + 3;
        aO = i % 128;
        if (i % 2 == 0) {
            this.i.c(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda53
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.am();
                }
            });
        } else {
            this.i.c(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda53
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.am();
                }
            });
            throw null;
        }
    }

    final void D() {
        aT = (aO + 65) % 128;
        java.lang.Object[] objArr = {com.facetec.sdk.cc.SKIPPED, java.lang.Boolean.valueOf(this.ar)};
        final java.lang.String str = (java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748);
        this.i.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.j(str);
            }
        }, 500L);
        int i = aO + 13;
        aT = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] e(boolean z, java.lang.String str) {
        android.content.SharedPreferences g;
        java.lang.String str2;
        boolean z2;
        int i = aT + 77;
        aO = i % 128;
        if (i % 2 != 0) {
            g = com.facetec.sdk.bj.g(this);
            str2 = com.facetec.sdk.as.ab;
            z2 = true;
        } else {
            g = com.facetec.sdk.bj.g(this);
            str2 = com.facetec.sdk.as.ab;
            z2 = false;
        }
        return com.facetec.sdk.cq.q(str, this.D, z, z2, g.getBoolean(str2, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final boolean z) {
        aT = (aO + 31) % 128;
        getFragmentManager().beginTransaction().remove(this.i).commitAllowingStateLoss();
        this.i = null;
        com.facetec.sdk.da.c cVar = com.facetec.sdk.da.c.NFC;
        this.aL = cVar;
        this.i = com.facetec.sdk.da.a(true, cVar);
        getFragmentManager().beginTransaction().add(this.aq, this.i, "Results").commitAllowingStateLoss();
        d(new java.lang.Object[]{this, new com.facetec.sdk.bl.c() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda9
            @Override // com.facetec.sdk.bl.c
            public final byte[] getIdScanBytes(java.lang.String str) {
                byte[] e;
                e = com.facetec.sdk.bl.this.e(z, str);
                return e;
            }
        }}, com.facetec.sdk.oh.a.c(), -2120258639, 2120258652, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
        aO = (aT + 29) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(final boolean z) {
        aT = (aO + 55) % 128;
        this.i.c(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.f(z);
            }
        });
        int i = aO + 7;
        aT = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final boolean z, java.lang.String str) {
        int i = aO + 71;
        aT = i % 128;
        if (i % 2 != 0) {
            this.i.e(z, z, str, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.i(z);
                }
            });
            aT = (aO + 25) % 128;
        } else {
            this.i.e(z, z, str, new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.i(z);
                }
            });
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object s(java.lang.Object[] objArr) {
        final java.lang.String str;
        final com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        final boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        java.lang.Object obj = null;
        if (!booleanValue) {
            java.lang.Object[] objArr2 = {com.facetec.sdk.cc.FINISHED_WITH_ERROR, java.lang.Boolean.valueOf(blVar.ar)};
            str = (java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr2, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748);
            int i = aT + 41;
            aO = i % 128;
            int i2 = i % 2;
        } else {
            int i3 = aO + 115;
            aT = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.Object[] objArr3 = {com.facetec.sdk.cc.FINISHED_WITH_SUCCESS, java.lang.Boolean.valueOf(blVar.ar)};
                obj.hashCode();
                throw null;
            }
            java.lang.Object[] objArr4 = {com.facetec.sdk.cc.FINISHED_WITH_SUCCESS, java.lang.Boolean.valueOf(blVar.ar)};
            str = (java.lang.String) com.facetec.sdk.dm.b(com.facetec.sdk.gj.AnonymousClass19.a(), 1451195755, com.facetec.sdk.gj.AnonymousClass19.a(), objArr4, com.facetec.sdk.gj.AnonymousClass19.a(), com.facetec.sdk.gj.AnonymousClass19.a(), -1451195748);
        }
        blVar.i.a(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.bl.this.a(booleanValue, str);
            }
        }, 500L);
        return null;
    }

    private void e(final com.facetec.sdk.t.b bVar) {
        aO = (aT + 93) % 128;
        if (com.facetec.sdk.bj.c()) {
            final java.lang.String str = com.facetec.sdk.cn.b;
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.c(str, bVar);
                }
            });
            int i = aT + 95;
            aO = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.facetec.sdk.t.b bVar, java.lang.String str, java.lang.String str2, boolean z) {
        int i = (aT + 119) % 128;
        aO = i;
        com.facetec.sdk.m mVar = this.f3428o;
        if (mVar != null) {
            int i2 = i + 67;
            aT = i2 % 128;
            if (i2 % 2 == 0) {
                mVar.a(bVar, str, str2, this.g, z);
                throw null;
            }
            mVar.a(bVar, str, str2, this.g, z);
            aT = (aO + 5) % 128;
        }
    }

    private void d(final com.facetec.sdk.t.b bVar, final boolean z) {
        aT = (aO + 73) % 128;
        if (com.facetec.sdk.bj.c()) {
            final java.lang.String str = com.facetec.sdk.cn.b;
            final java.lang.String str2 = this.D;
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.bl$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.bl.this.d(bVar, str, str2, z);
                }
            });
            int i = aO + 91;
            aT = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ java.lang.Object i(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        int i = aO + 45;
        aT = i % 128;
        java.lang.Object obj = null;
        if (i % 2 != 0) {
            blVar.P = null;
            blVar.Q = null;
            blVar.O = null;
            return null;
        }
        blVar.P = null;
        blVar.Q = null;
        blVar.O = null;
        obj.hashCode();
        throw null;
    }

    private boolean ag() {
        aO = (aT + 107) % 128;
        if (this.j != null && this.j.c()) {
            return true;
        }
        int i = aO + 117;
        aT = i % 128;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object t(java.lang.Object[] objArr) {
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) objArr[0];
        aT = (aO + 31) % 128;
        if (blVar.S != null) {
            int i = aT + 75;
            aO = i % 128;
            com.facetec.sdk.bt btVar = blVar.S;
            if (i % 2 != 0) {
                btVar.c();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (btVar.c()) {
                aO = (aT + 55) % 128;
                return true;
            }
        }
        return false;
    }

    private boolean ae() {
        if (this.i != null) {
            aO = (aT + 77) % 128;
            if (this.i.c() && !this.t) {
                int i = aT;
                int i2 = i + 109;
                aO = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!this.aj) {
                    aO = (i + 69) % 128;
                    return true;
                }
            }
        }
        aO = (aT + 109) % 128;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, com.facetec.sdk.bl.c cVar) {
        aT = (aO + 49) % 128;
        this.aB.b = str;
        byte[][] y = com.facetec.sdk.cq.y();
        byte[][] w = com.facetec.sdk.cq.w();
        com.facetec.sdk.FaceTecIDScanResult faceTecIDScanResult = this.aB;
        if (y != null) {
            int i = aO + 11;
            aT = i % 128;
            for (int i2 = i % 2 == 0 ? 1 : 0; i2 < y.length; i2++) {
                faceTecIDScanResult.d.add(android.util.Base64.encodeToString(y[i2], 2));
            }
        }
        com.facetec.sdk.FaceTecIDScanResult faceTecIDScanResult2 = this.aB;
        if (w != null) {
            int i3 = aO + 97;
            aT = i3 % 128;
            for (int i4 = i3 % 2 != 0 ? 0 : 1; i4 < w.length; i4++) {
                faceTecIDScanResult2.e.add(android.util.Base64.encodeToString(w[i4], 2));
            }
        }
        this.aB.f3364a = cVar.getIdScanBytes(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aP() {
        java.lang.Object[] objArr;
        char c2;
        int i;
        java.lang.Object[] objArr2;
        aT = (aO + 33) % 128;
        com.facetec.sdk.cq.e();
        com.facetec.sdk.cq.d();
        com.facetec.sdk.cq.I(com.facetec.sdk.d.a());
        java.lang.Object d2 = com.facetec.sdk.al.d(-1876633077);
        if (d2 == null) {
            char red = (char) (1537 - android.graphics.Color.red(0));
            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            byte b = (byte) (-1);
            byte b2 = (byte) (b + 1);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            aW(b, b2, (byte) (b2 + 1), objArr3);
            d2 = com.facetec.sdk.al.c(red, (keyRepeatTimeout >> 16) + 708, 22 - packedPositionGroup, 936091891, false, (java.lang.String) objArr3[0], null);
        }
        long j = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        aX(null, null, (android.os.Process.myPid() >> 22) + 127, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        aX(null, null, (android.os.Process.myPid() >> 22) + 127, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr5);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-1877556598);
        if (d3 == null) {
            char resolveSize = (char) (android.view.View.resolveSize(0, 0) + 1537);
            long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
            float maxVolume = android.media.AudioTrack.getMaxVolume();
            byte b3 = (byte) (-1);
            byte b4 = (byte) (b3 + 1);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            aW(b3, b4, b4, objArr6);
            d3 = com.facetec.sdk.al.c(resolveSize, (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 21, 939112562, false, (java.lang.String) objArr6[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            aO = (aT + 121) % 128;
            java.lang.Object d4 = com.facetec.sdk.al.d(-1874786035);
            if (d4 == null) {
                char c3 = (char) (1537 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                int packedPositionGroup2 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                aW(b5, b6, (byte) (b6 + 3), objArr7);
                d4 = com.facetec.sdk.al.c(c3, offsetBefore + 708, 22 - packedPositionGroup2, 934179829, false, (java.lang.String) objArr7[0], null);
            }
            java.lang.Object[] objArr8 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (java.lang.String[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}};
            int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
            int i2 = ~uptimeMillis;
            int i3 = (((((~((-1366688188) | i2)) | (~((-229133934) | uptimeMillis))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1149284602) + (((~(uptimeMillis | (-1347813779))) | (~(i2 | (-210259525)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) - 338624265;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
            c2 = 3;
        } else {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            aX(null, null, 127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0096\u0082\u0081\u008f\u0087\u0081\u0095\u0081\u0094", objArr9);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            aX(null, null, android.graphics.Color.blue(0) + 127, "\u008c\u0083\u0085\u008e\u0098\u0088\u0081\u0097\u008a\u008b\u0086\u008b\u0082\u008c\u0083\u0086", objArr10);
            try {
                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(((java.lang.Integer) cls2.getMethod((java.lang.String) objArr10[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -338624265};
                java.lang.Object d5 = com.facetec.sdk.al.d(1329445289);
                if (d5 == null) {
                    char indexOf = (char) (1537 - android.text.TextUtils.indexOf("", ""));
                    int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                    int myPid = android.os.Process.myPid();
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    aW(b7, b8, (byte) (b8 + 3), objArr12);
                    d5 = com.facetec.sdk.al.c(indexOf, 708 - resolveSizeAndState, (myPid >> 22) + 22, -388840623, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) d5).invoke(null, objArr11);
                java.lang.Object d6 = com.facetec.sdk.al.d(-1874786035);
                if (d6 == null) {
                    char normalizeMetaState = (char) (1537 - android.view.KeyEvent.normalizeMetaState(0));
                    double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                    int size = android.view.View.MeasureSpec.getSize(0);
                    byte b9 = (byte) (-1);
                    byte b10 = (byte) (b9 + 1);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    aW(b9, b10, (byte) (b10 + 3), objArr13);
                    d6 = com.facetec.sdk.al.c(normalizeMetaState, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 708, size + 22, 934179829, false, (java.lang.String) objArr13[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, objArr);
                try {
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    aX(null, null, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr14);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    aX(null, null, 175 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr15);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr15[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1877556598);
                    if (d7 == null) {
                        char bitsPerPixel = (char) (1536 - android.graphics.ImageFormat.getBitsPerPixel(0));
                        long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                        byte b11 = (byte) (-1);
                        byte b12 = (byte) (b11 + 1);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        aW(b11, b12, b12, objArr16);
                        d7 = com.facetec.sdk.al.c(bitsPerPixel, 709 - (uptimeMillis2 > 0L ? 1 : (uptimeMillis2 == 0L ? 0 : -1)), 22 - (maxKeyCode >> 16), 939112562, false, (java.lang.String) objArr16[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
                    if (d8 == null) {
                        char longPressTimeout = (char) (1537 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                        float complexToFloat = android.util.TypedValue.complexToFloat(0);
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 1);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        aW(b13, b14, (byte) (b14 + 1), objArr17);
                        d8 = com.facetec.sdk.al.c(longPressTimeout, 708 - (doubleTapTimeout >> 16), (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 22, 936091891, false, (java.lang.String) objArr17[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                    c2 = 3;
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = objArr[c2];
        int i6 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[1];
        int i7 = ((int[]) obj2)[0];
        if (i7 == i6) {
            int i8 = ((int[]) objArr[0])[0];
            java.lang.Object[] objArr18 = {new int[1], new int[]{((int[]) obj2)[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) obj)[0]}};
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i9 = ~identityHashCode;
            int i10 = i8 + (((~(i9 | (-603399069))) | 13632272 | (~(992423052 | i9))) * 464) + 1714324264 + (((-589766797) | identityHashCode) * (-464)) + (((~(identityHashCode | 992423052)) | 13632272) * 464);
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            i = 0;
            ((int[]) objArr18[0])[0] = i12 ^ (i12 << 5);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = (java.lang.String[]) objArr[2];
            if (strArr != null) {
                aO = (aT + 63) % 128;
                for (java.lang.String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i7];
            int i13 = i7 - 1;
            iArr[i13] = 1;
            android.widget.Toast.makeText((android.content.Context) null, iArr[((i7 * i13) % 2) - 1], 1).show();
            int i14 = ((int[]) objArr[0])[0];
            java.lang.Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) objArr[3])[0]}};
            int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
            int i15 = i14 + (((~(275747947 | r4)) * (-560)) - 1992010872) + ((~(elapsedRealtime | (-1317022613))) * (-560)) + (((~(1320074173 | (~elapsedRealtime))) | 272696386) * 560);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            i = 0;
            ((int[]) objArr19[0])[0] = i17 ^ (i17 << 5);
        }
        java.lang.Object d9 = com.facetec.sdk.al.d(-1876633077);
        if (d9 == null) {
            char threadPriority = (char) (((android.os.Process.getThreadPriority(i) + 20) >> 6) + 1537);
            int indexOf2 = android.text.TextUtils.indexOf("", "");
            int deadChar = android.view.KeyEvent.getDeadChar(i, i);
            byte b15 = (byte) (-1);
            byte b16 = (byte) (b15 + 1);
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            aW(b15, b16, (byte) (b16 + 1), objArr20);
            d9 = com.facetec.sdk.al.c(threadPriority, 708 - indexOf2, deadChar + 22, 936091891, false, (java.lang.String) objArr20[0], null);
        }
        long j2 = ((java.lang.reflect.Field) d9).getLong(null);
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        aX(null, null, 127 - android.view.View.resolveSize(0, 0), "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr21);
        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr21[0]);
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        aX(null, null, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr22);
        long longValue3 = ((java.lang.Long) cls4.getDeclaredMethod((java.lang.String) objArr22[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d10 = com.facetec.sdk.al.d(-1877556598);
        if (d10 == null) {
            char c4 = (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1537);
            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b17 = (byte) (-1);
            byte b18 = (byte) (b17 + 1);
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            aW(b17, b18, b18, objArr23);
            d10 = com.facetec.sdk.al.c(c4, 708 - (scrollBarSize >> 8), makeMeasureSpec + 22, 939112562, false, (java.lang.String) objArr23[0], null);
        }
        if (j2 == ((longValue3 - ((((java.lang.reflect.Field) d10).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d11 = com.facetec.sdk.al.d(-1874786035);
            if (d11 == null) {
                char c5 = (char) (1537 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                byte b19 = (byte) (-1);
                byte b20 = (byte) (b19 + 1);
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                aW(b19, b20, (byte) (b20 + 3), objArr24);
                d11 = com.facetec.sdk.al.c(c5, 708 - makeMeasureSpec2, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 21, 934179829, false, (java.lang.String) objArr24[0], null);
            }
            java.lang.Object[] objArr25 = (java.lang.Object[]) ((java.lang.reflect.Field) d11).get(null);
            objArr2 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr25[1])[0]}, (java.lang.String[]) objArr25[2], new int[]{((int[]) objArr25[3])[0]}};
            int i18 = (((((~(567902625 | r1)) | (-1037946792)) * (-160)) - 1937014136) + (((~((~android.os.Process.myUid()) | (-1027919496))) | 567902625) * 160)) - 78162966;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[0])[0] = i20 ^ (i20 << 5);
        } else {
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            aX(null, null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0096\u0082\u0081\u008f\u0087\u0081\u0095\u0081\u0094", objArr26);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr26[0]);
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            aX(null, null, 127 - android.graphics.Color.alpha(0), "\u008c\u0083\u0085\u008e\u0098\u0088\u0081\u0097\u008a\u008b\u0086\u008b\u0082\u008c\u0083\u0086", objArr27);
            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(((java.lang.Integer) cls5.getMethod((java.lang.String) objArr27[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -78162966};
            java.lang.Object d12 = com.facetec.sdk.al.d(1329445289);
            if (d12 == null) {
                char keyRepeatTimeout2 = (char) (1537 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                byte b21 = (byte) (-1);
                byte b22 = (byte) (b21 + 1);
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                aW(b21, b22, (byte) (b22 + 3), objArr29);
                d12 = com.facetec.sdk.al.c(keyRepeatTimeout2, (scrollBarSize2 >> 8) + 708, 22 - capsMode, -388840623, false, (java.lang.String) objArr29[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) d12).invoke(null, objArr28);
            java.lang.Object d13 = com.facetec.sdk.al.d(-1874786035);
            if (d13 == null) {
                char fadingEdgeLength = (char) (1537 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
                int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                byte b23 = (byte) (-1);
                byte b24 = (byte) (b23 + 1);
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                aW(b23, b24, (byte) (b24 + 3), objArr30);
                d13 = com.facetec.sdk.al.c(fadingEdgeLength, (scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, trimmedLength + 22, 934179829, false, (java.lang.String) objArr30[0], null);
            }
            ((java.lang.reflect.Field) d13).set(null, objArr2);
            try {
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                aX(null, null, 127 - android.text.TextUtils.getTrimmedLength(""), "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr31);
                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                aX(null, null, 127 - (android.os.Process.myTid() >> 22), "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr32);
                long longValue4 = ((java.lang.Long) cls6.getDeclaredMethod((java.lang.String) objArr32[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Object d14 = com.facetec.sdk.al.d(-1877556598);
                if (d14 == null) {
                    char c6 = (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1537);
                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    int red2 = android.graphics.Color.red(0);
                    byte b25 = (byte) (-1);
                    byte b26 = (byte) (b25 + 1);
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    aW(b25, b26, b26, objArr33);
                    d14 = com.facetec.sdk.al.c(c6, (maximumDrawingCacheSize >> 24) + 708, 22 - red2, 939112562, false, (java.lang.String) objArr33[0], null);
                }
                ((java.lang.reflect.Field) d14).set(null, java.lang.Long.valueOf(longValue4));
                java.lang.Object d15 = com.facetec.sdk.al.d(-1876633077);
                if (d15 == null) {
                    char tapTimeout = (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 1537);
                    long uptimeMillis3 = android.os.SystemClock.uptimeMillis();
                    float maxVolume2 = android.media.AudioTrack.getMaxVolume();
                    byte b27 = (byte) (-1);
                    byte b28 = (byte) (b27 + 1);
                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                    aW(b27, b28, (byte) (b28 + 1), objArr34);
                    d15 = com.facetec.sdk.al.c(tapTimeout, 709 - (uptimeMillis3 > 0L ? 1 : (uptimeMillis3 == 0L ? 0 : -1)), (maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)) + 21, 936091891, false, (java.lang.String) objArr34[0], null);
                }
                ((java.lang.reflect.Field) d15).set(null, java.lang.Long.valueOf(longValue4 >> 11));
            } catch (java.lang.Exception unused2) {
                throw new java.lang.RuntimeException();
            }
        }
        java.lang.Object obj3 = objArr2[3];
        int i21 = ((int[]) obj3)[0];
        java.lang.Object obj4 = objArr2[1];
        int i22 = ((int[]) obj4)[0];
        if (i22 != i21) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) objArr2[2];
            if (strArr2 != null) {
                for (java.lang.String str2 : strArr2) {
                    arrayList2.add(str2);
                }
            }
            throw new java.lang.RuntimeException(java.lang.String.valueOf(i22));
        }
        int i23 = ((int[]) objArr2[0])[0];
        java.lang.Object[] objArr35 = {new int[1], new int[]{((int[]) obj4)[0]}, (java.lang.String[]) objArr2[2], new int[]{((int[]) obj3)[0]}};
        int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
        int i24 = ~maxMemory;
        int i25 = i23 + (((~((-1022733559) | maxMemory)) | 483724484 | (~(573088562 | maxMemory))) * (-754)) + 1325732720 + (((~(maxMemory | (-483724485))) | (~(1056813046 | i24))) * (-754)) + (((-1022733559) | i24) * 754);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr35[0])[0] = i27 ^ (i27 << 5);
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        aO = 0;
        aT = 1;
        aM = new char[]{5912, 5869, 5911, 5865, 5866, 5904, 5933, 5862, 5894, 5856, 5863, 5908, 5868, 5942, 5871, 5910, 5870, 5867, 5897, 5905, 5861, 5906, 5939, 5907};
        aP = -1919674501;
        aQ = true;
        aN = true;
    }

    @Override // com.facetec.sdk.bf, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        int i = aT + 71;
        aO = i % 128;
        super.attachBaseContext(context);
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.facetec.sdk.bf, android.app.Activity
    public void onStart() {
        int i = aO + 77;
        aT = i % 128;
        super.onStart();
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.core.view.WindowInsetsCompat a(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        return (androidx.core.view.WindowInsetsCompat) d(new java.lang.Object[]{view, windowInsetsCompat}, com.facetec.sdk.oh.a.c(), 77875977, -77875959, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aS() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -1404012170, 1404012175, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aT() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1349961954, -1349961938, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aM() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -1529537407, 1529537411, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aF() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -364187389, 364187406, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aG() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -2018492201, 2018492202, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        d(new java.lang.Object[]{this, faceTecIDScanNextStep}, com.facetec.sdk.oh.a.c(), -609146620, 609146639, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aA() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -1739588287, 1739588312, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, boolean z2, com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        d(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), faceTecIDScanNextStep}, com.facetec.sdk.oh.a.c(), 1083883504, -1083883481, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aq() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -573570674, 573570686, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ao() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1437027208, -1437027199, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aj() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1302709388, -1302709378, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(java.lang.String str, com.facetec.sdk.t.b bVar) {
        d(new java.lang.Object[]{this, str, bVar}, com.facetec.sdk.oh.a.c(), -730735074, 730735089, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    private boolean ad() {
        return ((java.lang.Boolean) d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1387399372, -1387399352, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue();
    }

    private void ah() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1884737398, -1884737390, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    final void d(boolean z) {
        d(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, com.facetec.sdk.oh.a.c(), 817135433, -817135411, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    private void a(com.facetec.sdk.bl.c cVar) {
        d(new java.lang.Object[]{this, cVar}, com.facetec.sdk.oh.a.c(), -2120258639, 2120258652, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    final void c(int i) {
        d(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, com.facetec.sdk.oh.a.c(), 565622430, -565622419, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    private void g(boolean z) {
        d(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, com.facetec.sdk.oh.a.c(), -612370324, 612370324, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    protected final boolean e(java.lang.String str) {
        return ((java.lang.Boolean) d(new java.lang.Object[]{this, str}, com.facetec.sdk.oh.a.c(), -1638367869, 1638367872, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue();
    }

    @Override // com.facetec.sdk.bf
    final void g() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -1095307030, 1095307044, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    @Override // com.facetec.sdk.bf
    final void f() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1518533052, -1518533046, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    final void b(com.facetec.sdk.FaceTecIDScanStatus faceTecIDScanStatus) {
        d(new java.lang.Object[]{this, faceTecIDScanStatus}, com.facetec.sdk.oh.a.c(), -400946628, 400946635, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    final void v() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 1210154843, -1210154817, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -782830998, 782831019, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    private void L() {
        d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), -1360056131, 1360056133, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c());
    }

    final boolean s() {
        return ((java.lang.Boolean) d(new java.lang.Object[]{this}, com.facetec.sdk.oh.a.c(), 57224317, -57224293, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue();
    }
}
