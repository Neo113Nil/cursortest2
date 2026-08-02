package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ax {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.String f3407a;
    private static java.lang.String b;
    private static long c;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> d;
    private static boolean e;
    private static int f;
    private static int g;
    private static int i;
    private static int j;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, int i2, int i3) {
        int i4;
        int i5;
        int i6 = (s * 4) + 4;
        int i7 = i3 + 119;
        byte[] bArr = $$a;
        int i8 = 1 - (i2 * 3);
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i8;
            i5 = 0;
            i6++;
            i7 = (-i7) + i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i8) {
                return new java.lang.String(bArr2, 0);
            }
            i9 = i7;
            i7 = bArr[i6];
            i6++;
            i7 = (-i7) + i9;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i8) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i5 == i8) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object b(int i2, int i3, int i4, int i5, int i6, java.lang.Object[] objArr, int i7) {
        int i8 = (~(i7 | i4)) | i3;
        int i9 = i4 | i7 | i3;
        int i10 = ~i7;
        int i11 = i7 + i3 + i5 + ((-421447895) * i6) + ((-859425246) * i2);
        int i12 = i11 * i11;
        int i13 = (i7 * 1303038832) + 2077918271 + (1303038832 * i3) + (i8 * (-49)) + (i9 * (-49)) + (i10 * 49) + (1303038783 * i5) + (1583617559 * i6) + ((-1102559138) * i2) + (510722048 * i12);
        return ((((((((((i7 * (-629045104)) + 1817116672) + (i3 * (-629045104))) + (i8 * (-1407420559))) + (i9 * (-1407420559))) + (i10 * 1407420559)) + (i5 * (-2036465664))) + (i6 * (-2125594624))) + (i2 * 888930304)) + (i12 * 441384960)) + ((i13 * i13) * 607191040) != 1 ? c(objArr) : a(objArr);
    }

    static void init$0() {
        $$a = new byte[]{69, com.google.common.base.Ascii.VT, -116, 92};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    ax() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        g = 0;
        i = 1;
        j = 0;
        f = 1;
        e();
        b = "";
        e = false;
        f3407a = "";
        i = (g + 11) % 128;
    }

    static void e(android.content.Context context) {
        if (e) {
            return;
        }
        d = new java.util.HashMap<>();
        com.facetec.sdk.FaceTecSessionStatus[] values = com.facetec.sdk.FaceTecSessionStatus.values();
        int length = values.length;
        j = (f + 69) % 128;
        int i2 = 0;
        while (i2 < length) {
            int i3 = j + 91;
            f = i3 % 128;
            if (i3 % 2 != 0) {
                d.put(d(values[i2]), 0);
                i2++;
            } else {
                d.put(d(values[i2]), 0);
                i2 += 11;
            }
        }
        d.put("FC", 1);
        b = context.getPackageName();
        f3407a = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        c(context);
        e = true;
    }

    static void e(com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus, android.content.Context context) {
        f = (j + 19) % 128;
        if (e) {
            java.lang.String d2 = d(faceTecSessionStatus);
            if (d.get(d2) != null) {
                java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = d;
                hashMap.put(d2, java.lang.Integer.valueOf(hashMap.get(d2).intValue() + 1));
            } else {
                f = (j + 79) % 128;
                d.put(d2, 0);
            }
            b(context);
            j = (f + 65) % 128;
        }
    }

    private static void h(java.lang.String str, int i2, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 25) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hv hvVar = new com.facetec.sdk.hv();
        hvVar.d = i2;
        int length = cArr2.length;
        long[] jArr = new long[length];
        hvVar.c = 0;
        while (hvVar.c < cArr2.length) {
            int i3 = hvVar.c;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[hvVar.c]), hvVar, hvVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1009843105);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    d2 = com.facetec.sdk.al.c((char) (33464 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 479 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 23 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1679851175, false, $$c(b2, b3, (byte) (b3 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue() ^ (c ^ 2966223176042272838L);
                java.lang.Object[] objArr3 = {hvVar, hvVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(95517984);
                if (d3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    d3 = com.facetec.sdk.al.c((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 591 - android.view.KeyEvent.normalizeMetaState(0), android.view.View.MeasureSpec.getSize(0) + 24, -1570895912, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                $10 = ($11 + 81) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr3 = new char[length];
        hvVar.c = 0;
        while (hvVar.c < cArr2.length) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr3[hvVar.c] = (char) jArr[hvVar.c];
                java.lang.Object[] objArr4 = {hvVar, hvVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(95517984);
                if (d4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    d4 = com.facetec.sdk.al.c((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 590 - android.graphics.ImageFormat.getBitsPerPixel(0), android.view.KeyEvent.normalizeMetaState(0) + 24, -1570895912, false, $$c(b6, b7, b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                java.lang.Object obj = null;
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr3[hvVar.c] = (char) jArr[hvVar.c];
            java.lang.Object[] objArr5 = {hvVar, hvVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(95517984);
            if (d5 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 592 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 24, -1570895912, false, $$c(b8, b9, b9), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static int a() {
        int i2 = f + 113;
        j = i2 % 128;
        if (i2 % 2 == 0) {
            if (!d.containsKey("FC")) {
                j = (f + 59) % 128;
                return 0;
            }
            int intValue = d.get("FC").intValue();
            j = (f + 21) % 128;
            return intValue;
        }
        d.containsKey("FC");
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void a(android.content.Context context) {
        j = (f + 57) % 128;
        if (e) {
            if (d.get("FC") != null) {
                java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = d;
                hashMap.put("FC", java.lang.Integer.valueOf(hashMap.get("FC").intValue() + 1));
            } else {
                f = (j + 107) % 128;
                d.put("FC", 1);
            }
            b(context);
            int i2 = f + 111;
            j = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        int i2 = f + 111;
        j = i2 % 128;
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = d;
        if (i2 % 2 == 0) {
            return hashMap.toString();
        }
        hashMap.toString();
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int d(android.content.Context context) {
        int i2 = j + 69;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            if (!d.containsKey("FC")) {
                f = (j + 23) % 128;
                a(context);
            }
            return d.get("FC").intValue();
        }
        d.containsKey("FC");
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(android.content.Context context) {
        int i2 = f + 73;
        j = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                g(context);
                int i3 = 36 / 0;
            } else {
                g(context);
            }
        } catch (java.io.FileNotFoundException unused) {
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.ay.c(e2.getMessage());
            e2.getStackTrace();
        }
    }

    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        j = (f + 41) % 128;
        try {
            a(context.getCacheDir());
            j = (f + 43) % 128;
            return null;
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.ay.c(e2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        com.facetec.sdk.dk.b(new com.facetec.sdk.ax$$ExternalSyntheticLambda0(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        com.facetec.sdk.ax.f = (r1 + 11) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(final android.content.Context context) {
        int i2 = f + 113;
        int i3 = i2 % 128;
        j = i3;
        if (i2 % 2 != 0) {
            int i4 = 50 / 0;
        }
    }

    private static void g(android.content.Context context) throws java.lang.Exception {
        java.lang.Object[] objArr = {new java.io.File(context.getCacheDir(), b()), c()};
        int d2 = com.facetec.sdk.gh.b.d();
        int d3 = com.facetec.sdk.gh.b.d();
        byte[] bArr = (byte[]) com.facetec.sdk.bm.c(objArr, com.facetec.sdk.gh.b.d(), -1300678471, com.facetec.sdk.gh.b.d(), 1300678472, d2, d3);
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, 0, bArr.length, java.nio.charset.StandardCharsets.UTF_8));
        d.clear();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("history");
        if (optJSONObject != null) {
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            f = (j + 121) % 128;
            while (keys.hasNext()) {
                f = (j + 53) % 128;
                java.lang.String next = keys.next();
                d.put(next, java.lang.Integer.valueOf(optJSONObject.optInt(next)));
            }
        }
        int i2 = f + 23;
        j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void a(java.io.File file) throws java.lang.Exception {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("history", new org.json.JSONObject(d));
        java.lang.Object[] objArr = new java.lang.Object[1];
        h("昪", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 53017, objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), com.facetec.sdk.ay.a(16, 128));
        com.facetec.sdk.bm.b(new java.io.File(file, b()), c(), jSONObject.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
        j = (f + 103) % 128;
    }

    private static java.lang.String b() throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(b);
        sb.append(f3407a);
        sb.append("history_file_internal");
        java.lang.String c2 = com.facetec.sdk.bn.c(sb.toString());
        j = (f + 115) % 128;
        return c2;
    }

    private static byte[] c() throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(b);
        sb.append(f3407a);
        sb.append("history_key");
        byte[] d2 = com.facetec.sdk.bn.d(sb.toString());
        f = (j + 61) % 128;
        return d2;
    }

    /* renamed from: com.facetec.sdk.ax$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.facetec.sdk.FaceTecSessionStatus.values().length];
            b = iArr;
            try {
                iArr[com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED_VIA_HARDWARE_BUTTON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.ENCRYPTION_KEY_INVALID.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.TIMEOUT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.LOCKED_OUT.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.INITIALIZATION_NOT_COMPLETED.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.SESSION_EXPIRED.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                b[com.facetec.sdk.FaceTecSessionStatus.DEVICE_NOT_SUPPORTED.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String d(com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus) {
        int i2 = j + 69;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
            switch (com.facetec.sdk.ax.AnonymousClass2.b[faceTecSessionStatus.ordinal()]) {
                case 1:
                    return "LI";
                case 2:
                    j = (f + 89) % 128;
                    return "DM";
                case 3:
                    return "UC";
                case 4:
                    return "CH";
                case 5:
                    return "PS";
                case 6:
                    int i4 = f + 15;
                    j = i4 % 128;
                    if (i4 % 2 == 0) {
                        return "NP";
                    }
                    throw null;
                case 7:
                    return "CD";
                case 8:
                    return "EI";
                case 9:
                    return "TO";
                case 10:
                    return "CS";
                case 11:
                    return "CE";
                case 12:
                    j = (f + 55) % 128;
                    return "IE";
                case 13:
                    return "LA";
                case 14:
                    return "RP";
                case 15:
                    return "UL";
                case 16:
                    return "GI";
                case 17:
                    return "IN";
                case 18:
                    return "RS";
                case 19:
                    return "SE";
                case 20:
                    return "DN";
                default:
                    return "NA";
            }
        }
        switch (com.facetec.sdk.ax.AnonymousClass2.b[faceTecSessionStatus.ordinal()]) {
            case 1:
                return "LI";
            case 2:
                break;
            case 3:
                return "UC";
            case 4:
                return "CH";
            case 5:
                return "PS";
            case 6:
                break;
            case 7:
                return "CD";
            case 8:
                return "EI";
            case 9:
                return "TO";
            case 10:
                return "CS";
            case 11:
                return "CE";
            case 12:
                break;
            case 13:
                return "LA";
            case 14:
                return "RP";
            case 15:
                return "UL";
            case 16:
                return "GI";
            case 17:
                return "IN";
            case 18:
                return "RS";
            case 19:
                return "SE";
            case 20:
                return "DN";
            default:
                return "NA";
        }
    }

    static void e() {
        c = -6031349684905394658L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(android.content.Context context) {
        int d2 = com.facetec.sdk.oz.d();
        int d3 = com.facetec.sdk.oz.d();
        int d4 = com.facetec.sdk.oz.d();
        b(com.facetec.sdk.oz.d(), 1336232073, d2, d3, d4, new java.lang.Object[]{context}, -1336232072);
    }

    static java.lang.String d() {
        int d2 = com.facetec.sdk.oz.d();
        int d3 = com.facetec.sdk.oz.d();
        int d4 = com.facetec.sdk.oz.d();
        return (java.lang.String) b(com.facetec.sdk.oz.d(), 1391125088, d2, d3, d4, new java.lang.Object[0], -1391125088);
    }
}
