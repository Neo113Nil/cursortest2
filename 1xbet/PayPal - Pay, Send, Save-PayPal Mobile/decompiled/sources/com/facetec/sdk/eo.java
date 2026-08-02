package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class eo {
    public static final java.lang.String b = null;
    private com.facetec.sdk.fa A;
    private com.facetec.sdk.fa B;
    private java.util.List<com.facetec.sdk.fb> C;
    private java.lang.ThreadLocal<java.util.Map<com.facetec.sdk.gw<?>, com.facetec.sdk.eo.d<?>>> e;
    private com.facetec.sdk.fl f;
    private com.facetec.sdk.fm g;
    private java.util.concurrent.ConcurrentMap<com.facetec.sdk.gw<?>, com.facetec.sdk.fd<?>> h;
    private com.facetec.sdk.gb i;
    private java.util.List<com.facetec.sdk.fb> j;
    private boolean k;
    private com.facetec.sdk.ek l;
    private java.util.Map<java.lang.reflect.Type, com.facetec.sdk.em<?>> m;
    private boolean n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3553o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private com.facetec.sdk.ey u;
    private int v;
    private java.lang.String w;
    private java.util.List<com.facetec.sdk.fb> x;
    private int y;
    private java.util.List<com.facetec.sdk.ez> z;

    /* renamed from: a, reason: collision with root package name */
    private static com.facetec.sdk.ek f3552a = com.facetec.sdk.eg.IDENTITY;
    public static final com.facetec.sdk.fa d = com.facetec.sdk.fc.DOUBLE;
    public static final com.facetec.sdk.fa c = com.facetec.sdk.fc.LAZILY_PARSED_NUMBER;

    public eo() {
        this(com.facetec.sdk.fm.c, f3552a, java.util.Collections.emptyMap(), false, false, false, true, false, false, false, true, com.facetec.sdk.ey.DEFAULT, b, 2, 2, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), d, c, java.util.Collections.emptyList());
    }

    eo(com.facetec.sdk.fm fmVar, com.facetec.sdk.ek ekVar, java.util.Map<java.lang.reflect.Type, com.facetec.sdk.em<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, com.facetec.sdk.ey eyVar, java.lang.String str, int i, int i2, java.util.List<com.facetec.sdk.fb> list, java.util.List<com.facetec.sdk.fb> list2, java.util.List<com.facetec.sdk.fb> list3, com.facetec.sdk.fa faVar, com.facetec.sdk.fa faVar2, java.util.List<com.facetec.sdk.ez> list4) {
        final com.facetec.sdk.fd<java.lang.Number> fdVar;
        com.facetec.sdk.fd<java.lang.Number> fdVar2;
        com.facetec.sdk.fd<java.lang.Number> fdVar3;
        java.util.ArrayList arrayList = new java.util.ArrayList(list3);
        arrayList.add(new com.facetec.sdk.hg());
        this.e = new java.lang.ThreadLocal<>();
        this.h = new java.util.concurrent.ConcurrentHashMap();
        this.g = fmVar;
        this.l = ekVar;
        this.m = map;
        this.f = new com.facetec.sdk.fl(map, z8, list4);
        this.f3553o = z;
        this.k = z2;
        this.n = z3;
        this.s = z4;
        this.r = z5;
        this.q = z6;
        this.t = z7;
        this.p = z8;
        this.u = eyVar;
        this.w = str;
        this.v = i;
        this.y = i2;
        this.x = list;
        this.C = list2;
        this.A = faVar;
        this.B = faVar2;
        this.z = list4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(com.facetec.sdk.gj.B);
        arrayList2.add(com.facetec.sdk.gd.d(faVar));
        arrayList2.add(fmVar);
        arrayList2.addAll(arrayList);
        arrayList2.add(com.facetec.sdk.gj.t);
        arrayList2.add(com.facetec.sdk.gj.g);
        arrayList2.add(com.facetec.sdk.gj.f3599a);
        arrayList2.add(com.facetec.sdk.gj.c);
        arrayList2.add(com.facetec.sdk.gj.f);
        if (eyVar == com.facetec.sdk.ey.DEFAULT) {
            fdVar = com.facetec.sdk.gj.l;
        } else {
            fdVar = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.eo.1
                @Override // com.facetec.sdk.fd
                public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                    java.lang.Number number2 = number;
                    if (number2 == null) {
                        guVar.g();
                    } else {
                        guVar.d(number2.toString());
                    }
                }

                @Override // com.facetec.sdk.fd
                public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                    if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                        gtVar.k();
                        return null;
                    }
                    return java.lang.Long.valueOf(gtVar.l());
                }
            };
        }
        arrayList2.add(com.facetec.sdk.gj.a(java.lang.Long.TYPE, java.lang.Long.class, fdVar));
        java.lang.Class cls = java.lang.Double.TYPE;
        if (z7) {
            fdVar2 = com.facetec.sdk.gj.f3600o;
        } else {
            fdVar2 = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.eo.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10;
                private static int $11;
                private static int b;
                private static long c;
                private static int d;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static java.lang.String $$e(byte b2, byte b3, short s) {
                    int i3;
                    int i4;
                    byte[] bArr = $$c;
                    int i5 = (b2 * 4) + 4;
                    int i6 = b3 * 3;
                    byte[] bArr2 = new byte[i6 + 1];
                    if (bArr == null) {
                        i4 = i5;
                        int i7 = i6;
                        i3 = 0;
                        i5 += i7;
                        i4++;
                        bArr2[i3] = (byte) i5;
                        if (i3 == i6) {
                            return new java.lang.String(bArr2, 0);
                        }
                        i3++;
                        i7 = bArr[i4];
                        i5 += i7;
                        i4++;
                        bArr2[i3] = (byte) i5;
                        if (i3 == i6) {
                        }
                    } else {
                        int i8 = s + 119;
                        i3 = 0;
                        i4 = i5;
                        i5 = i8;
                        bArr2[i3] = (byte) i5;
                        if (i3 == i6) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void g(int i3, int i4, short s, java.lang.Object[] objArr) {
                    int i5;
                    int i6;
                    byte[] bArr = $$a;
                    int i7 = 4 - (s * 2);
                    int i8 = (i4 * 3) + 1;
                    int i9 = i3 + 97;
                    byte[] bArr2 = new byte[i8];
                    if (bArr == null) {
                        int i10 = i9;
                        i9 = i8;
                        i6 = 0;
                        i9 += i10;
                        i7++;
                        i5 = i6;
                        i6 = i5 + 1;
                        bArr2[i5] = (byte) i9;
                        if (i6 == i8) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        i10 = bArr[i7];
                        i9 += i10;
                        i7++;
                        i5 = i6;
                        i6 = i5 + 1;
                        bArr2[i5] = (byte) i9;
                        if (i6 == i8) {
                        }
                    } else {
                        i5 = 0;
                        i6 = i5 + 1;
                        bArr2[i5] = (byte) i9;
                        if (i6 == i8) {
                        }
                    }
                }

                static void init$0() {
                    $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, kotlin.io.encoding.Base64.padSymbol, -78, -87};
                    $$b = 153;
                }

                static void init$1() {
                    $$c = new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 86, -115, com.visa.cbp.getEncExpo.onUnminimized};
                    $$d = 186;
                }

                private static void f(java.lang.String str2, int i3, java.lang.Object[] objArr) {
                    $11 = ($10 + 23) % 128;
                    char[] charArray = str2 != null ? str2.toCharArray() : str2;
                    com.facetec.sdk.hv hvVar = new com.facetec.sdk.hv();
                    hvVar.d = i3;
                    int length = charArray.length;
                    long[] jArr = new long[length];
                    hvVar.c = 0;
                    while (hvVar.c < charArray.length) {
                        $11 = ($10 + 99) % 128;
                        int i4 = hvVar.c;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[hvVar.c]), hvVar, hvVar};
                            java.lang.Object d2 = com.facetec.sdk.al.d(-1009843105);
                            if (d2 == null) {
                                byte b2 = (byte) 0;
                                d2 = com.facetec.sdk.al.c((char) (android.graphics.Color.alpha(0) + 33463), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, 1679851175, false, $$e(b2, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                            }
                            jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue() ^ (c ^ 2966223176042272838L);
                            java.lang.Object[] objArr3 = {hvVar, hvVar};
                            java.lang.Object d3 = com.facetec.sdk.al.d(95517984);
                            if (d3 == null) {
                                byte b3 = (byte) 0;
                                d3 = com.facetec.sdk.al.c((char) android.text.TextUtils.getOffsetBefore("", 0), 590 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 25, -1570895912, false, $$e(b3, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr = new char[length];
                    hvVar.c = 0;
                    $11 = ($10 + 111) % 128;
                    while (hvVar.c < charArray.length) {
                        cArr[hvVar.c] = (char) jArr[hvVar.c];
                        java.lang.Object[] objArr4 = {hvVar, hvVar};
                        java.lang.Object d4 = com.facetec.sdk.al.d(95517984);
                        if (d4 == null) {
                            byte b4 = (byte) 0;
                            d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.os.Process.myTid() >> 22) + 591, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, -1570895912, false, $$e(b4, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                    }
                    objArr[0] = new java.lang.String(cArr);
                }

                @Override // com.facetec.sdk.fd
                public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                    int i3 = d;
                    int i4 = i3 + 85;
                    b = i4 % 128;
                    java.lang.Number number2 = number;
                    if (i4 % 2 == 0) {
                        java.lang.Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (number2 == null) {
                        b = (i3 + 71) % 128;
                        guVar.g();
                    } else {
                        double doubleValue = number2.doubleValue();
                        com.facetec.sdk.eo.a(doubleValue);
                        guVar.d(doubleValue);
                    }
                }

                @Override // com.facetec.sdk.fd
                public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                    b = (d + 53) % 128;
                    if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                        b = (d + 95) % 128;
                        gtVar.k();
                        return null;
                    }
                    return java.lang.Double.valueOf(gtVar.m());
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    d = 0;
                    b = 1;
                    c = -4086139492799279122L;
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0434, code lost:
                
                    if (r0 != false) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0771, code lost:
                
                    if (r0 != false) goto L72;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x0571, code lost:
                
                    if (android.os.Build.VERSION.SDK_INT > 33) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x047b, code lost:
                
                    if (r0.contains(((java.lang.reflect.Field) r4).get(null)) != false) goto L36;
                 */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0556  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static java.lang.Object[] a(android.content.Context context, int i3, int i4, int i5) {
                    java.lang.Object[] objArr;
                    java.lang.Object[] objArr2;
                    int i6 = b;
                    d = (((i6 | 5) << 1) - (i6 ^ 5)) % 128;
                    if (context == null) {
                        java.lang.Object[] objArr3 = {null, new int[]{i3}, new int[]{i3}, new int[1]};
                        int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i7 = (((~(458865461 | maxMemory)) | 365833134) * 56) + 1767798587 + (((~((~maxMemory) | 365833134)) | 458865461) * 56);
                        int i8 = -(-(i7 * (-764)));
                        int i9 = ~i7;
                        int i10 = ~i3;
                        int i11 = ~((i10 ^ (-1)) | i10);
                        int i12 = i7 | (i7 ^ (-1));
                        int i13 = ~((i12 ^ i3) | (i12 & i3));
                        int i14 = ~((i9 ^ (-1)) | i9);
                        int i15 = (((((i8 << 1) - i8) - (~((((i11 & i13) | (i13 ^ i11)) | (~(i9 | i3))) * 765))) - 1) - (~(-(-(((i14 & i11) | (i14 ^ i11)) * 1530))))) - 1;
                        int i16 = ~(i3 | (i3 ^ (-1)));
                        int i17 = ~((i10 & i9) | (i9 ^ i10));
                        int i18 = ((i16 ^ i17) | (i17 & i16)) * 765;
                        int i19 = -(-((i15 & i18) + (i18 | i15)));
                        int i20 = (i5 & i19) + (i19 | i5);
                        int i21 = i20 << 13;
                        int i22 = (~(i21 & i20)) & (i21 | i20);
                        int i23 = i22 >>> 17;
                        int i24 = (i22 & (~i23)) | ((~i22) & i23);
                        int i25 = i24 << 5;
                        ((int[]) objArr3[3])[0] = (~(i24 & i25)) & (i24 | i25);
                        return objArr3;
                    }
                    d = ((i6 & 95) + (i6 | 95)) % 128;
                    try {
                        int i26 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        f("\ud7c9멕೪齣憋\uf41e䚾⢃뭓෬選抍\uf529䞱⧖받\u0edb鄄掐\uf635墱⫟뵾", ((i26 | 28051) << 1) - (i26 ^ 28051), objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        int red = android.graphics.Color.red(0);
                        int i27 = (red ^ 61211) | (red & 61211);
                        int i28 = ~i3;
                        int i29 = (((red * com.knotapi.knot.utilities.Constants.ID_KROGER) + 22648070) - (~(-(-(((i27 & i28) | (i27 ^ i28)) * (-369)))))) - 1;
                        int i30 = ~red;
                        int i31 = ~(i30 | i28);
                        int i32 = -(-(((i31 & 61211) | (i31 ^ 61211)) * (-369)));
                        int i33 = ((i29 | i32) << 1) - (i29 ^ i32);
                        int i34 = ~(((-61212) & red) | ((-61212) ^ red));
                        int i35 = ~((red ^ i3) | (red & i3));
                        int i36 = (i30 & i28) | (i30 ^ i28);
                        int i37 = -(-(((i35 ^ i34) | (i35 & i34) | (~((61211 ^ i36) | (i36 & 61211)))) * 369));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        f("ퟏ㣖৪᪸殴籟䵦幼꼓뀺胒釨\ue283\uf399쒛핓♾㜌", (i33 ^ i37) + ((i37 & i33) << 1), objArr5);
                        java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr5[0], null).invoke(context, null);
                        int i38 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                        int a2 = com.facetec.sdk.ay.d.a();
                        int i39 = i38 * (-661);
                        int i40 = (((-37905706) | i39) << 1) - (i39 ^ (-37905706));
                        int i41 = ~a2;
                        int i42 = ~i38;
                        int i43 = ~(i42 | (-57347));
                        int i44 = -(-(((i41 & i43) | (i41 ^ i43)) * 1324));
                        int i45 = (i40 & i44) + (i44 | i40);
                        int i46 = ~(i38 | a2);
                        int i47 = ~((a2 & 57346) | (a2 ^ 57346));
                        int i48 = -(-(((i47 & i46) | (i46 ^ i47)) * (-1324)));
                        int i49 = ((i45 | i48) << 1) - (i48 ^ i45);
                        int i50 = ~((i42 ^ 57346) | (57346 & i42));
                        int i51 = ~((i38 ^ (-57347)) | (i38 & (-57347)));
                        int i52 = ((i51 ^ i50) | (i51 & i50)) * 662;
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        f("\ud7c9㟅៊矓埋럎韞\uf793ퟓ㟜៘矽埩럡韶\uf7abퟨ㟶ឰ矐埤럧鞆\uf784힃㞂ធ瞐垓랑鞻\uf79b\ud7ae㞤", (i49 ^ i52) + ((i52 & i49) << 1), objArr6);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                        int i53 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        f("ퟎ㦍\u0b5bᴔ滿", ((61001 | i53) << 1) - (i53 ^ 61001), objArr7);
                        if ((cls3.getField((java.lang.String) objArr7[0]).getInt(invoke) & 2) != 0) {
                            int i54 = (b + 81) % 128;
                            d = i54;
                            int i55 = ((i54 ^ 23) + ((i54 & 23) << 1)) % 128;
                            b = i55;
                            d = ((i55 ^ 23) + ((i55 & 23) << 1)) % 128;
                            objArr = new java.lang.Object[]{null, new int[]{i3}, new int[]{(i3 & (-2)) | (i28 & 1)}, new int[1]};
                            int i56 = ((((~((-105116176) | i28)) | 929814771) * (-1042)) - 1142157314) + (((-105116176) | i3) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-929814772) | i3)) | 824707312 | (~(i28 | (-8717)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
                            int a3 = com.facetec.sdk.ay.d.a();
                            int i57 = i56 * (-496);
                            int i58 = ~i56;
                            int i59 = ((((i57 | (-7936)) << 1) - (i57 ^ (-7936))) - (~((~((i58 ^ (-17)) | (i58 & (-17)))) * 497))) - 1;
                            int i60 = i58 | (-17);
                            int i61 = ~((i60 ^ a3) | (i60 & a3));
                            int i62 = ~a3;
                            int i63 = (i58 ^ i62) | (i58 & i62);
                            int i64 = ~((i63 ^ 16) | (i63 & 16));
                            int i65 = ((i61 ^ i64) | (i61 & i64)) * 497;
                            int i66 = ~((i62 & (-17)) | (i62 ^ (-17)));
                            int i67 = ~((i56 ^ (-17)) | (i56 & (-17)));
                            int i68 = (i67 ^ i66) | (i66 & i67);
                            int i69 = (i58 & 16) | (i58 ^ 16);
                            int i70 = ~((a3 ^ i69) | (a3 & i69));
                            int i71 = -(-((i59 & i65) + (i65 | i59) + (((i68 ^ i70) | (i70 & i68)) * 497)));
                            int i72 = ((i5 | i71) << 1) - (i71 ^ i5);
                            int i73 = i72 << 13;
                            int i74 = (~(i73 & i72)) & (i73 | i72);
                            int i75 = i74 >>> 17;
                            int i76 = (~(i74 & i75)) & (i74 | i75);
                            int i77 = i76 << 5;
                            ((int[]) objArr[3])[0] = (i76 & (~i77)) | ((~i76) & i77);
                        } else {
                            objArr = new java.lang.Object[]{null, new int[]{i3}, new int[]{i3}, new int[1]};
                            int i78 = ((785778403 | i3) * 614) + 226441813 + (((~((-254473252) | i28)) | 235013155 | (~(570225344 | i28))) * (-1228)) + (((~((-19460097) | i28)) | (~(805238499 | i28))) * 614);
                            int a4 = com.facetec.sdk.ay.d.a();
                            int i79 = (i78 * (-432)) + (i5 * 434);
                            int i80 = ~i78;
                            int i81 = (~a4) | i80;
                            int i82 = -(-((~((i81 ^ i5) | (i81 & i5))) * 433));
                            int i83 = (i79 ^ i82) + ((i79 & i82) << 1);
                            int i84 = ~((~i5) | a4);
                            int i85 = ((i84 ^ i80) | (i80 & i84)) * (-433);
                            int i86 = ~((a4 ^ i80) | (a4 & i80));
                            int i87 = ~((i78 ^ i5) | (i78 & i5));
                            int i88 = (i83 & i85) + (i85 | i83) + (((i87 ^ i86) | (i86 & i87)) * 433);
                            int i89 = i88 << 13;
                            int i90 = (~(i89 & i88)) & (i89 | i88);
                            int i91 = i90 ^ (i90 >>> 17);
                            int i92 = i91 << 5;
                            ((int[]) objArr[3])[0] = (i91 & (~i92)) | ((~i91) & i92);
                        }
                        if (((int[]) objArr[2])[0] != i3) {
                            return objArr;
                        }
                        try {
                            java.lang.Object d2 = com.facetec.sdk.al.d(1023220397);
                            if (d2 == null) {
                                char fadingEdgeLength = (char) (42581 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                                int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                byte b2 = (byte) 2;
                                byte b3 = (byte) (b2 - 2);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                g(b2, b3, b3, objArr8);
                                d2 = com.facetec.sdk.al.c(fadingEdgeLength, 1552 - (edgeSlop >> 16), 24 - resolveOpacity, -1693294507, false, (java.lang.String) objArr8[0], new java.lang.Class[0]);
                            }
                            java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) d2).invoke(null, null);
                            java.lang.Object d3 = com.facetec.sdk.al.d(-230269676);
                            if (d3 == null) {
                                char combineMeasuredStates = (char) (android.view.View.combineMeasuredStates(0, 0) + 42581);
                                int threadPriority = android.os.Process.getThreadPriority(0);
                                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                byte length = (byte) $$a.length;
                                byte b4 = (byte) (length - 4);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                g(length, b4, b4, objArr9);
                                d3 = com.facetec.sdk.al.c(combineMeasuredStates, ((threadPriority + 20) >> 6) + 1552, 23 - indexOf, 1437149164, false, (java.lang.String) objArr9[0], null);
                            }
                            if (!set.contains(((java.lang.reflect.Field) d3).get(null))) {
                                int i93 = d;
                                int i94 = (i93 ^ 91) + ((i93 & 91) << 1);
                                b = i94 % 128;
                                int i95 = i94 % 2;
                                java.lang.Object d4 = com.facetec.sdk.al.d(-233963760);
                                if (i95 == 0) {
                                    if (d4 == null) {
                                        char myPid = (char) (42581 - (android.os.Process.myPid() >> 22));
                                        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                        int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop();
                                        byte b5 = (byte) 0;
                                        byte b6 = b5;
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        g(b5, b6, b6, objArr10);
                                        d4 = com.facetec.sdk.al.c(myPid, packedPositionGroup + 1552, 24 - (edgeSlop2 >> 16), 1440908776, false, (java.lang.String) objArr10[0], null);
                                    }
                                    boolean contains = set.contains(((java.lang.reflect.Field) d4).get(null));
                                    int i96 = 46 / 0;
                                } else if (d4 == null) {
                                    char c2 = (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42580);
                                    int threadPriority2 = android.os.Process.getThreadPriority(0);
                                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    g(b7, b8, b8, objArr11);
                                    d4 = com.facetec.sdk.al.c(c2, 1552 - ((threadPriority2 + 20) >> 6), 23 - indexOf2, 1440908776, false, (java.lang.String) objArr11[0], null);
                                }
                                if ((i4 & 32) == 0) {
                                    int i97 = b;
                                    int i98 = ((i97 | 49) << 1) - (i97 ^ 49);
                                    d = i98 % 128;
                                    try {
                                        if (i98 % 2 != 0) {
                                            try {
                                                if (android.os.Build.VERSION.SDK_INT > 101) {
                                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                    f("힇퀞\ud87a삲죋\uf0de老\ue104\ue944釬駺臕訧뉻먏ꊑ\uaafd勉嬋䍦䮳玆篨搱氅ᐝᲴҊ", 2002 - (~(android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr12);
                                                    try {
                                                        java.lang.Object[] objArr13 = {(java.lang.String) objArr12[0]};
                                                        java.lang.Object d5 = com.facetec.sdk.al.d(1450487247);
                                                        if (d5 == null) {
                                                            char touchSlop = (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 6935);
                                                            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                                            int gidForName = android.os.Process.getGidForName("");
                                                            byte b9 = (byte) ($$b & 7);
                                                            byte b10 = (byte) (b9 - 1);
                                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                            g(b9, b10, b10, objArr14);
                                                            d5 = com.facetec.sdk.al.c(touchSlop, 2390 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), 22 - gidForName, -241445065, false, (java.lang.String) objArr14[0], new java.lang.Class[]{java.lang.String.class});
                                                        }
                                                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr13)).longValue();
                                                        long j = 584060746;
                                                        int nextInt = new java.util.Random().nextInt(454287883);
                                                        long j2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                                                        long j3 = -252;
                                                        long j4 = -1;
                                                        long j5 = longValue ^ j4;
                                                        long j6 = nextInt;
                                                        long j7 = j5 | (j6 ^ j4);
                                                        long j8 = j | longValue;
                                                        long j9 = (j6 | j8) ^ j4;
                                                        long j10 = (j2 * j) + (j2 * longValue) + (((((j ^ j4) | j5) ^ j4) | (j7 ^ j4) | j9) * j3) + (j8 * j3) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE * ((j4 ^ (j7 | j)) | j9)) + 1267115895;
                                                        int i99 = ((int) (j10 >> 32)) & (((((-2147212924) | r6) * (-280)) - 1259560678) + (((~(625525872 | i3)) | (~((-2062752284) | i3))) * 140) + (((~((-1521687052) | i3)) | (~(i28 | 2147212923)) | (~(i28 | (-541065233)))) * 140));
                                                        int i100 = (int) j10;
                                                        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                                                        int i101 = ~uptimeMillis;
                                                        int i102 = i100 & ((((~((-1513105937) | i101)) | 75879526) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 304952473 + (((~(i101 | 634246511)) | (-2071472922)) * (-440)) + ((uptimeMillis | (-1513105937)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                                                        if (((i99 ^ i102) | (i99 & i102)) == 1) {
                                                            int i103 = b;
                                                            d = ((i103 ^ 59) + ((i103 & 59) << 1)) % 128;
                                                            int i104 = d;
                                                            b = ((i104 & 83) + (i104 | 83)) % 128;
                                                            java.lang.Object[] objArr15 = {null, new int[]{i3}, new int[]{i3 ^ 10}, new int[1]};
                                                            int myUid = android.os.Process.myUid();
                                                            int i105 = ~myUid;
                                                            int i106 = ((((~(329177763 | myUid)) | 495520832) * 672) - 1566211389) + (((~(myUid | 495520832)) | (~((-329177764) | i105))) * (-672)) + (((~((-495520833) | i105)) | 201393216) * 672);
                                                            int i107 = (i106 ^ 16) + ((i106 & 16) << 1);
                                                            int a5 = com.facetec.sdk.ay.d.a();
                                                            int i108 = (i107 * 868) + (i5 * 868);
                                                            int i109 = ~i107;
                                                            int i110 = ~a5;
                                                            int i111 = ~((i109 ^ i110) | (i109 & i110));
                                                            int i112 = ~i5;
                                                            int i113 = ~((i110 & i112) | (i112 ^ i110));
                                                            int i114 = ((i111 ^ i113) | (i113 & i111)) * (-867);
                                                            int i115 = (i108 & i114) + (i108 | i114);
                                                            int i116 = i109 | i112;
                                                            int i117 = ~i116;
                                                            int i118 = ~((i109 & a5) | (i109 ^ a5));
                                                            int i119 = (i117 ^ i118) | (i117 & i118);
                                                            int i120 = ~((i112 ^ a5) | (i112 & a5));
                                                            int i121 = -(-(((i119 ^ i120) | (i119 & i120)) * (-1734)));
                                                            int i122 = ~((i116 ^ i110) | (i116 & i110));
                                                            int i123 = i5 | i109;
                                                            int i124 = ~((i123 ^ a5) | (i123 & a5));
                                                            int i125 = (i124 ^ i122) | (i124 & i122);
                                                            int i126 = (i107 ^ i112) | (i107 & i112);
                                                            int i127 = ~((i126 ^ a5) | (i126 & a5));
                                                            int i128 = (((i115 & i121) + (i121 | i115)) - (~(((i127 ^ i125) | (i127 & i125)) * 867))) - 1;
                                                            int i129 = (i128 << 13) ^ i128;
                                                            int i130 = i129 ^ (i129 >>> 17);
                                                            int i131 = i130 << 5;
                                                            ((int[]) objArr15[3])[0] = (i130 & (~i131)) | ((~i130) & i131);
                                                            int i132 = d + 81;
                                                            b = i132 % 128;
                                                            if (i132 % 2 != 0) {
                                                                return objArr15;
                                                            }
                                                            java.lang.Object obj = null;
                                                            obj.hashCode();
                                                            throw null;
                                                        }
                                                    } catch (java.lang.Throwable th) {
                                                        java.lang.Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                java.lang.Object[] objArr16 = {(java.lang.String) objArr2[0]};
                                                java.lang.Object d6 = com.facetec.sdk.al.d(1590238701);
                                                if (d6 == null) {
                                                    char packedPositionChild = (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L));
                                                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                    byte length2 = (byte) $$a.length;
                                                    byte b11 = (byte) (length2 - 4);
                                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                    g(length2, b11, b11, objArr17);
                                                    d6 = com.facetec.sdk.al.c(packedPositionChild, 2077 - bitsPerPixel, 24 - packedPositionType, -114923755, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                                                }
                                                java.lang.Object invoke2 = ((java.lang.reflect.Method) d6).invoke(null, objArr16);
                                                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                int i133 = keyRepeatTimeout * 881;
                                                int i134 = ((14315369 | i133) << 1) - (i133 ^ 14315369);
                                                int i135 = ~keyRepeatTimeout;
                                                int i136 = (~((i135 ^ (-16250)) | (i135 & (-16250)))) | (~((i135 & i3) | (i135 ^ i3)));
                                                int i137 = ~((i3 & (-16250)) | (i3 ^ (-16250)));
                                                int i138 = -(-(((i136 ^ i137) | (i136 & i137)) * (-880)));
                                                int i139 = ~((i135 ^ i28) | (i135 & i28));
                                                int i140 = (i139 ^ 16249) | (i139 & 16249);
                                                int i141 = ~(keyRepeatTimeout | i3);
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                f("힙", (i134 & i138) + (i134 | i138) + (((i140 ^ i141) | (i140 & i141)) * (-880)) + ((~((keyRepeatTimeout ^ i3) | (keyRepeatTimeout & i3))) * 880), objArr18);
                                                boolean equals = invoke2.equals((java.lang.String) objArr18[0]);
                                                int i142 = b;
                                                d = ((i142 & 101) + (i142 | 101)) % 128;
                                            } catch (java.lang.Throwable th2) {
                                                java.lang.Throwable cause2 = th2.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th2;
                                            }
                                            int i143 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            objArr2 = new java.lang.Object[1];
                                            f("ퟚ鬊东ㆫ\ue4f9埋ᬓ칔놧擼\ud7c8鬋乑", (i143 & 19660) + (i143 | 19660), objArr2);
                                        }
                                    } catch (java.lang.Exception unused) {
                                    }
                                }
                                java.lang.Object[] objArr19 = {null, new int[]{i3}, new int[]{i3}, new int[1]};
                                int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                                int i144 = ~elapsedRealtime;
                                int i145 = ~(964477484 | elapsedRealtime);
                                int i146 = (((~(elapsedRealtime | (-139778889))) | (~((-824705061) | i144))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 2137002299 + (((~(139778888 | i144)) | i145) * (-1040)) + (((~(i144 | (-964477485))) | (-964483949) | i145) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL);
                                int i147 = -(-((i146 << 1) - i146));
                                int i148 = (i5 & i147) + (i147 | i5);
                                int i149 = i148 << 13;
                                int i150 = ((~i149) & i148) | ((~i148) & i149);
                                int i151 = i150 >>> 17;
                                int i152 = (i150 & (~i151)) | ((~i150) & i151);
                                ((int[]) objArr19[3])[0] = i152 ^ (i152 << 5);
                                return objArr19;
                            }
                            if (android.os.Build.VERSION.SDK_INT == 30) {
                                d = (b + 29) % 128;
                                java.lang.Object[] objArr20 = {null, new int[]{i3}, new int[]{i3}, new int[1]};
                                int myPid2 = android.os.Process.myPid();
                                int i153 = ~myPid2;
                                int i154 = (((~(myPid2 | (-185442006))) | (~((-875561257) | i153)) | 50862660) * (-68)) + 519937247 + ((~((-134579346) | i153)) * (-68)) + (((~(i153 | 185442005)) | (-1010140602)) * 68);
                                int i155 = ~i154;
                                int i156 = ~((i155 ^ i28) | (i155 & i28));
                                int i157 = ~((i3 ^ (-1)) | i3);
                                int i158 = ~((i28 ^ i154) | (i154 & i28));
                                int i159 = (i154 * (-949)) + (((i156 ^ i157) | (i156 & i157)) * 1900) + (((~((i3 & i154) | (i154 ^ i3))) | (~i28)) * (-950)) + (((i28 & i158) | (i158 ^ i28)) * 950);
                                int a6 = com.facetec.sdk.ay.d.a();
                                int i160 = (i159 * (-159)) + (i5 * (-159));
                                int i161 = ~i159;
                                int i162 = ((i161 ^ i5) | (i161 & i5)) * 160;
                                int i163 = (i160 & i162) + (i160 | i162);
                                int i164 = ~a6;
                                int i165 = ~((i164 & i159) | (i164 ^ i159));
                                int i166 = ~((i159 ^ i5) | (i159 & i5));
                                int i167 = -(-(((i165 ^ i166) | (i165 & i166)) * (-160)));
                                int i168 = ~i5;
                                int i169 = ~((i164 ^ i168) | (i164 & i168));
                                int i170 = ((((i163 | i167) << 1) - (i167 ^ i163)) - (~(((i169 ^ i159) | (i169 & i159)) * 160))) - 1;
                                int i171 = i170 << 13;
                                int i172 = ((~i171) & i170) | ((~i170) & i171);
                                int i173 = i172 >>> 17;
                                int i174 = (i172 & (~i173)) | ((~i172) & i173);
                                int i175 = i174 << 5;
                                ((int[]) objArr20[3])[0] = (i174 & (~i175)) | ((~i174) & i175);
                                return objArr20;
                            }
                            if ((i4 & 32) == 0) {
                            }
                            java.lang.Object[] objArr192 = {null, new int[]{i3}, new int[]{i3}, new int[1]};
                            int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                            int i1442 = ~elapsedRealtime2;
                            int i1452 = ~(964477484 | elapsedRealtime2);
                            int i1462 = (((~(elapsedRealtime2 | (-139778889))) | (~((-824705061) | i1442))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 2137002299 + (((~(139778888 | i1442)) | i1452) * (-1040)) + (((~(i1442 | (-964477485))) | (-964483949) | i1452) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL);
                            int i1472 = -(-((i1462 << 1) - i1462));
                            int i1482 = (i5 & i1472) + (i1472 | i5);
                            int i1492 = i1482 << 13;
                            int i1502 = ((~i1492) & i1482) | ((~i1482) & i1492);
                            int i1512 = i1502 >>> 17;
                            int i1522 = (i1502 & (~i1512)) | ((~i1502) & i1512);
                            ((int[]) objArr192[3])[0] = i1522 ^ (i1522 << 5);
                            return objArr192;
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                }
            };
        }
        arrayList2.add(com.facetec.sdk.gj.a(cls, java.lang.Double.class, fdVar2));
        java.lang.Class cls2 = java.lang.Float.TYPE;
        if (z7) {
            fdVar3 = com.facetec.sdk.gj.n;
        } else {
            fdVar3 = new com.facetec.sdk.fd<java.lang.Number>() { // from class: com.facetec.sdk.eo.5
                @Override // com.facetec.sdk.fd
                public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Number number) throws java.io.IOException {
                    java.lang.Number number2 = number;
                    if (number2 == null) {
                        guVar.g();
                        return;
                    }
                    float floatValue = number2.floatValue();
                    com.facetec.sdk.eo.a(floatValue);
                    if (!(number2 instanceof java.lang.Float)) {
                        number2 = java.lang.Float.valueOf(floatValue);
                    }
                    guVar.e(number2);
                }

                @Override // com.facetec.sdk.fd
                public final /* synthetic */ java.lang.Number b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                    if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                        gtVar.k();
                        return null;
                    }
                    return java.lang.Float.valueOf((float) gtVar.m());
                }
            };
        }
        arrayList2.add(com.facetec.sdk.gj.a(cls2, java.lang.Float.class, fdVar3));
        arrayList2.add(com.facetec.sdk.gg.e(faVar2));
        arrayList2.add(com.facetec.sdk.gj.j);
        arrayList2.add(com.facetec.sdk.gj.i);
        arrayList2.add(com.facetec.sdk.gj.d(java.util.concurrent.atomic.AtomicLong.class, new com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicLong>() { // from class: com.facetec.sdk.eo.4
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.concurrent.atomic.AtomicLong atomicLong) throws java.io.IOException {
                com.facetec.sdk.fd.this.a(guVar, java.lang.Long.valueOf(atomicLong.get()));
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.concurrent.atomic.AtomicLong b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicLong(((java.lang.Number) com.facetec.sdk.fd.this.b(gtVar)).longValue());
            }
        }.e()));
        arrayList2.add(com.facetec.sdk.gj.d(java.util.concurrent.atomic.AtomicLongArray.class, new com.facetec.sdk.fd<java.util.concurrent.atomic.AtomicLongArray>() { // from class: com.facetec.sdk.eo.3
            @Override // com.facetec.sdk.fd
            public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.util.concurrent.atomic.AtomicLongArray atomicLongArray) throws java.io.IOException {
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray2 = atomicLongArray;
                guVar.a();
                int length = atomicLongArray2.length();
                for (int i3 = 0; i3 < length; i3++) {
                    com.facetec.sdk.fd.this.a(guVar, java.lang.Long.valueOf(atomicLongArray2.get(i3)));
                }
                guVar.b();
            }

            @Override // com.facetec.sdk.fd
            public final /* synthetic */ java.util.concurrent.atomic.AtomicLongArray b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                gtVar.a();
                while (gtVar.d()) {
                    arrayList3.add(java.lang.Long.valueOf(((java.lang.Number) com.facetec.sdk.fd.this.b(gtVar)).longValue()));
                }
                gtVar.e();
                int size = arrayList3.size();
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = new java.util.concurrent.atomic.AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((java.lang.Long) arrayList3.get(i3)).longValue());
                }
                return atomicLongArray;
            }
        }.e()));
        arrayList2.add(com.facetec.sdk.gj.h);
        arrayList2.add(com.facetec.sdk.gj.k);
        arrayList2.add(com.facetec.sdk.gj.p);
        arrayList2.add(com.facetec.sdk.gj.q);
        arrayList2.add(com.facetec.sdk.gj.d(java.math.BigDecimal.class, com.facetec.sdk.gj.m));
        arrayList2.add(com.facetec.sdk.gj.d(java.math.BigInteger.class, com.facetec.sdk.gj.s));
        arrayList2.add(com.facetec.sdk.gj.d(com.facetec.sdk.fo.class, com.facetec.sdk.gj.r));
        arrayList2.add(com.facetec.sdk.gj.u);
        arrayList2.add(com.facetec.sdk.gj.x);
        arrayList2.add(com.facetec.sdk.gj.v);
        arrayList2.add(com.facetec.sdk.gj.w);
        arrayList2.add(com.facetec.sdk.gj.D);
        arrayList2.add(com.facetec.sdk.gj.y);
        arrayList2.add(com.facetec.sdk.gj.b);
        arrayList2.add(com.facetec.sdk.gc.c);
        arrayList2.add(com.facetec.sdk.gj.A);
        if (com.facetec.sdk.gn.f3610a) {
            arrayList2.add(com.facetec.sdk.gn.c);
            arrayList2.add(com.facetec.sdk.gn.e);
            arrayList2.add(com.facetec.sdk.gn.f);
        }
        arrayList2.add(com.facetec.sdk.fx.d);
        arrayList2.add(com.facetec.sdk.gj.d);
        arrayList2.add(new com.facetec.sdk.fy(this.f));
        arrayList2.add(new com.facetec.sdk.gh(this.f, z2));
        com.facetec.sdk.gb gbVar = new com.facetec.sdk.gb(this.f);
        this.i = gbVar;
        arrayList2.add(gbVar);
        arrayList2.add(com.facetec.sdk.gj.C);
        arrayList2.add(new com.facetec.sdk.ge(this.f, ekVar, fmVar, this.i, list4));
        this.j = java.util.Collections.unmodifiableList(arrayList2);
    }

    static void a(double d2) {
        if (java.lang.Double.isNaN(d2) || java.lang.Double.isInfinite(d2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(d2);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public final <T> com.facetec.sdk.fd<T> a(com.facetec.sdk.gw<T> gwVar) {
        boolean z;
        java.util.Objects.requireNonNull(gwVar, "type must not be null");
        com.facetec.sdk.fd<T> fdVar = (com.facetec.sdk.fd) this.h.get(gwVar);
        if (fdVar != null) {
            return fdVar;
        }
        java.util.Map<com.facetec.sdk.gw<?>, com.facetec.sdk.eo.d<?>> map = this.e.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.e.set(map);
            z = true;
        } else {
            z = false;
        }
        com.facetec.sdk.eo.d<?> dVar = map.get(gwVar);
        if (dVar != null) {
            return dVar;
        }
        try {
            com.facetec.sdk.eo.d<?> dVar2 = new com.facetec.sdk.eo.d<>();
            map.put(gwVar, dVar2);
            java.util.Iterator<com.facetec.sdk.fb> it = this.j.iterator();
            while (it.hasNext()) {
                com.facetec.sdk.fd<T> d2 = it.next().d(this, gwVar);
                if (d2 != null) {
                    com.facetec.sdk.fd<T> fdVar2 = (com.facetec.sdk.fd) this.h.putIfAbsent(gwVar, d2);
                    if (fdVar2 != null) {
                        d2 = fdVar2;
                    }
                    if (dVar2.c != null) {
                        throw new java.lang.AssertionError();
                    }
                    dVar2.c = d2;
                    return d2;
                }
            }
            throw new java.lang.IllegalArgumentException("GSON (2.10) cannot handle ".concat(java.lang.String.valueOf(gwVar)));
        } finally {
            map.remove(gwVar);
            if (z) {
                this.e.remove();
            }
        }
    }

    public final <T> com.facetec.sdk.fd<T> e(com.facetec.sdk.fb fbVar, com.facetec.sdk.gw<T> gwVar) {
        if (!this.j.contains(fbVar)) {
            fbVar = this.i;
        }
        boolean z = false;
        for (com.facetec.sdk.fb fbVar2 : this.j) {
            if (z) {
                com.facetec.sdk.fd<T> d2 = fbVar2.d(this, gwVar);
                if (d2 != null) {
                    return d2;
                }
            } else if (fbVar2 == fbVar) {
                z = true;
            }
        }
        throw new java.lang.IllegalArgumentException("GSON cannot serialize ".concat(java.lang.String.valueOf(gwVar)));
    }

    public final <T> com.facetec.sdk.fd<T> e(java.lang.Class<T> cls) {
        return a((com.facetec.sdk.gw) com.facetec.sdk.gw.c(cls));
    }

    public final com.facetec.sdk.es a(java.lang.Object obj) {
        if (obj == null) {
            return com.facetec.sdk.eq.b;
        }
        return b(obj, obj.getClass());
    }

    private com.facetec.sdk.es b(java.lang.Object obj, java.lang.reflect.Type type) {
        com.facetec.sdk.gf gfVar = new com.facetec.sdk.gf();
        c(obj, type, gfVar);
        return gfVar.c();
    }

    public final java.lang.String c(java.lang.Object obj) {
        if (obj == null) {
            return b(com.facetec.sdk.eq.b);
        }
        return a(obj, obj.getClass());
    }

    private java.lang.String a(java.lang.Object obj, java.lang.reflect.Type type) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    private void a(java.lang.Object obj, java.lang.reflect.Type type, java.lang.Appendable appendable) throws com.facetec.sdk.et {
        try {
            c(obj, type, c(com.facetec.sdk.fv.c(appendable)));
        } catch (java.io.IOException e) {
            throw new com.facetec.sdk.et(e);
        }
    }

    private void c(java.lang.Object obj, java.lang.reflect.Type type, com.facetec.sdk.gu guVar) throws com.facetec.sdk.et {
        com.facetec.sdk.fd a2 = a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(type));
        boolean f = guVar.f();
        guVar.e(true);
        boolean h = guVar.h();
        guVar.c(this.s);
        boolean j = guVar.j();
        guVar.d(this.f3553o);
        try {
            try {
                a2.a(guVar, obj);
            } catch (java.io.IOException e) {
                throw new com.facetec.sdk.et(e);
            } catch (java.lang.AssertionError e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.10): ");
                sb.append(e2.getMessage());
                java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            guVar.e(f);
            guVar.c(h);
            guVar.d(j);
        }
    }

    public final java.lang.String b(com.facetec.sdk.es esVar) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        a(esVar, stringWriter);
        return stringWriter.toString();
    }

    private void a(com.facetec.sdk.es esVar, java.lang.Appendable appendable) throws com.facetec.sdk.et {
        try {
            c(esVar, c(com.facetec.sdk.fv.c(appendable)));
        } catch (java.io.IOException e) {
            throw new com.facetec.sdk.et(e);
        }
    }

    private com.facetec.sdk.gu c(java.io.Writer writer) throws java.io.IOException {
        if (this.n) {
            writer.write(com.google.gson.Gson.JSON_NON_EXECUTABLE_PREFIX);
        }
        com.facetec.sdk.gu guVar = new com.facetec.sdk.gu(writer);
        if (this.r) {
            guVar.e("  ");
        }
        guVar.c(this.s);
        guVar.e(this.q);
        guVar.d(this.f3553o);
        return guVar;
    }

    private com.facetec.sdk.gt a(java.io.Reader reader) {
        com.facetec.sdk.gt gtVar = new com.facetec.sdk.gt(reader);
        gtVar.e(this.q);
        return gtVar;
    }

    private void c(com.facetec.sdk.es esVar, com.facetec.sdk.gu guVar) throws com.facetec.sdk.et {
        boolean f = guVar.f();
        guVar.e(true);
        boolean h = guVar.h();
        guVar.c(this.s);
        boolean j = guVar.j();
        guVar.d(this.f3553o);
        try {
            try {
                com.facetec.sdk.fv.c(esVar, guVar);
            } catch (java.io.IOException e) {
                throw new com.facetec.sdk.et(e);
            } catch (java.lang.AssertionError e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.10): ");
                sb.append(e2.getMessage());
                java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            guVar.e(f);
            guVar.c(h);
            guVar.d(j);
        }
    }

    public final <T> T e(java.lang.String str, java.lang.Class<T> cls) throws com.facetec.sdk.ev {
        return (T) com.facetec.sdk.fw.b(cls).cast(e(str, com.facetec.sdk.gw.c(cls)));
    }

    private <T> T e(java.lang.String str, com.facetec.sdk.gw<T> gwVar) throws com.facetec.sdk.ev {
        if (str == null) {
            return null;
        }
        return (T) a(new java.io.StringReader(str), gwVar);
    }

    private <T> T a(java.io.Reader reader, com.facetec.sdk.gw<T> gwVar) throws com.facetec.sdk.et, com.facetec.sdk.ev {
        com.facetec.sdk.gt a2 = a(reader);
        T t = (T) c(a2, gwVar);
        d(t, a2);
        return t;
    }

    private static void d(java.lang.Object obj, com.facetec.sdk.gt gtVar) {
        if (obj != null) {
            try {
                if (gtVar.f() == com.facetec.sdk.gs.END_DOCUMENT) {
                } else {
                    throw new com.facetec.sdk.ev("JSON document was not fully consumed.");
                }
            } catch (com.facetec.sdk.gv e) {
                throw new com.facetec.sdk.ev(e);
            } catch (java.io.IOException e2) {
                throw new com.facetec.sdk.et(e2);
            }
        }
    }

    private <T> T c(com.facetec.sdk.gt gtVar, com.facetec.sdk.gw<T> gwVar) throws com.facetec.sdk.et, com.facetec.sdk.ev {
        boolean q = gtVar.q();
        boolean z = true;
        gtVar.e(true);
        try {
            try {
                try {
                    gtVar.f();
                    z = false;
                    return a((com.facetec.sdk.gw) gwVar).b(gtVar);
                } catch (java.io.EOFException e) {
                    if (!z) {
                        throw new com.facetec.sdk.ev(e);
                    }
                    gtVar.e(q);
                    return null;
                } catch (java.lang.AssertionError e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.10): ");
                    sb.append(e2.getMessage());
                    java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (java.io.IOException e3) {
                throw new com.facetec.sdk.ev(e3);
            } catch (java.lang.IllegalStateException e4) {
                throw new com.facetec.sdk.ev(e4);
            }
        } finally {
            gtVar.e(q);
        }
    }

    static final class d<T> extends com.facetec.sdk.gi<T> {
        com.facetec.sdk.fd<T> c;

        d() {
        }

        private com.facetec.sdk.fd<T> c() {
            com.facetec.sdk.fd<T> fdVar = this.c;
            if (fdVar != null) {
                return fdVar;
            }
            throw new java.lang.IllegalStateException("Delegate has not been set yet");
        }

        @Override // com.facetec.sdk.gi
        public final com.facetec.sdk.fd<T> b() {
            return c();
        }

        @Override // com.facetec.sdk.fd
        public final T b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            return c().b(gtVar);
        }

        @Override // com.facetec.sdk.fd
        public final void a(com.facetec.sdk.gu guVar, T t) throws java.io.IOException {
            c().a(guVar, t);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{serializeNulls:");
        sb.append(this.f3553o);
        sb.append(",factories:");
        sb.append(this.j);
        sb.append(",instanceCreators:");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
