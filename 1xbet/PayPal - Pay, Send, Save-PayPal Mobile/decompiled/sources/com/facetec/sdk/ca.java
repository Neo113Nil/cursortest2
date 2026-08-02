package com.facetec.sdk;

/* loaded from: classes8.dex */
class ca {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static /* synthetic */ boolean f3456a;
    private static long b;
    private static char c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;

    enum c {
        NOT_PRESENT,
        INVALID,
        VALIDATED
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(short s, byte b2, short s2) {
        int i;
        int i2;
        int i3 = 3 - (s2 * 3);
        int i4 = (b2 * 4) + 1;
        byte[] bArr = $$a;
        int i5 = s + 108;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = i3 + (-i6);
            i = i2;
            i3 = i7;
            i5 = i8;
            int i9 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i9];
            i3 = i5;
            i7 = i9;
            int i82 = i3 + (-i6);
            i = i2;
            i3 = i7;
            i5 = i82;
            int i92 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i922 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{104, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -78, -77};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        g = 0;
        f = 1;
        d = 0;
        h = 1;
        a();
        android.os.SystemClock.elapsedRealtimeNanos();
        android.os.Process.getGidForName("");
        android.text.TextUtils.indexOf("", "", 0, 0);
        android.graphics.Color.rgb(0, 0, 0);
        int i = g;
        f = (i + 13) % 128;
        int i2 = i + 89;
        f = i2 % 128;
        int i3 = i2 % 2;
        f3456a = true;
    }

    ca() {
    }

    static com.facetec.sdk.ca.c a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.util.Properties properties = new java.util.Properties();
        try {
            properties.load(new java.io.StringReader(str));
            java.lang.String property = properties.getProperty(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "");
            java.lang.String replaceAll = properties.getProperty("appId", "").replaceAll("\"", "");
            java.lang.String property2 = properties.getProperty("key", "");
            if (property.isEmpty() || replaceAll.isEmpty() || property2.isEmpty()) {
                return com.facetec.sdk.ca.c.INVALID;
            }
            java.lang.String property3 = properties.getProperty("features", "");
            if (!d(context, replaceAll)) {
                h = (d + 63) % 128;
                return com.facetec.sdk.ca.c.INVALID;
            }
            try {
                java.util.Date parse = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).parse(property);
                int i = d + 111;
                h = i % 128;
                if (i % 2 == 0) {
                    replaceAll.equals("*");
                    throw null;
                }
                long j = replaceAll.equals("*") ? 7L : 14L;
                if (!f3456a && parse == null) {
                    throw new java.lang.AssertionError();
                }
                if (new java.util.Date().after(new java.util.Date(parse.getTime() + java.util.concurrent.TimeUnit.DAYS.toMillis(j)))) {
                    return com.facetec.sdk.ca.c.INVALID;
                }
                byte[] e2 = e(property2);
                byte[] copyOfRange = java.util.Arrays.copyOfRange(e2, 1, e2.length);
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(replaceAll);
                    sb.append(property);
                    sb.append(property3);
                    java.lang.String obj = sb.toString();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    i(186834030 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "浾⋜뜋뺑", (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "ꂡ넝䅼懮跎銃侴갋ʅ繁埍ꀄ\ue0f7퀃彨ꇿ莰鯊薶듀稗", "\u0000\u0000\u0000\u0000", objArr);
                    boolean a2 = a(com.facetec.sdk.bn.d(((java.lang.String) objArr[0]).intern().getBytes(), obj), copyOfRange);
                    if (a2) {
                        d = (h + 55) % 128;
                        if (!property3.isEmpty() && java.util.Arrays.asList(property3.split(",")).contains("rlo")) {
                            d = (h + 121) % 128;
                            com.facetec.sdk.cg.f3462a = true;
                            d = (h + 83) % 128;
                        }
                    }
                    return a2 ? com.facetec.sdk.ca.c.VALIDATED : com.facetec.sdk.ca.c.INVALID;
                } catch (java.lang.Exception unused) {
                    return com.facetec.sdk.ca.c.INVALID;
                }
            } catch (java.text.ParseException unused2) {
                return com.facetec.sdk.ca.c.INVALID;
            }
        } catch (java.io.IOException unused3) {
            return com.facetec.sdk.ca.c.NOT_PRESENT;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException, java.security.SignatureException, java.security.NoSuchProviderException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        i(1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "惟啞\ued77䞁", (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "푸녉픻య㕾뤆埳ڻ啌\ud834ʵ诡⽩뒟쮵봥萌빵⽈보ᛝﻦᜂ煡⩉ᦾᱠ뚧慎㫯\uf648⯥똡쌐讝꾄╭쉡缂\uf1e4荚\uefa2䅭㻥ㄑ杩ᝆ豨\uf8a0ᤗ篭댞ﱔꘉ춖攚陏빌\u0ef9䪧篎甚绷处፸젺\ue30aᢅ퐂力읒晞穬บ\uea99⭋숧䚎\ued1f털纝\uf377ꪴⓘ옂⫲炒쪢廮䊑怍麪臂젲⌖벱欄\udb35뇩痭\uf5cc혭䋻朐\udfb8逊텮驶챕翶綎믜⢁쌆誃콚縺섾ౢ籣옞༵䜥臍̡\uec16", "\u0000\u0000\u0000\u0000", objArr);
        java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("EC").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(((java.lang.String) objArr[0]).intern(), 0)));
        java.security.Signature signature = java.security.Signature.getInstance("SHA256withECDSA");
        signature.initVerify(generatePublic);
        signature.update(bArr);
        boolean verify = signature.verify(bArr2);
        h = (d + 5) % 128;
        return verify;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void i(int i, java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        java.lang.Object obj = null;
        if (str2 != 0) {
            int i2 = $10 + 31;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                str2.toCharArray();
                obj.hashCode();
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            $10 = ($11 + 41) % 128;
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = cArr4.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr4, 0, cArr5, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c2);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        hsVar.d = 0;
        $11 = ($10 + 103) % 128;
        while (hsVar.d < length3) {
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1265265027);
                if (d2 == null) {
                    byte b2 = (byte) 3;
                    byte b3 = (byte) (b2 - 3);
                    d2 = com.facetec.sdk.al.c((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd, android.widget.ExpandableListView.getPackedPositionChild(0L) + 25, 326823045, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class});
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1957241543);
                if (d3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    d3 = com.facetec.sdk.al.c((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1505, 24 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), -750364609, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Object.class});
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                java.lang.Object[] objArr4 = {hsVar, java.lang.Integer.valueOf(cArr5[hsVar.d % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1182647832);
                if (d4 == null) {
                    byte b6 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) (android.graphics.Color.green(0) + 26699), 639 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 23, 510477072, false, $$c((byte) 6, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object d5 = com.facetec.sdk.al.d(1279455729);
                if (d5 == null) {
                    byte b7 = (byte) 0;
                    d5 = com.facetec.sdk.al.c((char) (409 - android.text.TextUtils.getOffsetBefore("", 0)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2198, 24 - android.widget.ExpandableListView.getPackedPositionGroup(0L), -340948215, false, $$c((byte) ($$b & 30), b7, b7), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).charValue();
                cArr5[intValue2] = hsVar.b;
                cArr7[hsVar.d] = (char) ((((cArr5[intValue2] ^ cArr3[hsVar.d]) ^ (b ^ 9010024738234916139L)) ^ ((int) (e ^ 9010024738234916139L))) ^ ((char) (c ^ 9010024738234916139L)));
                hsVar.d++;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        int i3 = $11 + 9;
        $10 = i3 % 128;
        if (i3 % 2 == 0) {
            objArr[0] = str4;
        } else {
            int i4 = 1 / 0;
            objArr[0] = str4;
        }
    }

    private static byte[] e(java.lang.String str) {
        int length;
        byte[] bArr;
        int i;
        int i2 = h + 125;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            length = str.length();
            bArr = new byte[length % 5];
            i = 1;
        } else {
            length = str.length();
            bArr = new byte[length / 2];
            i = 0;
        }
        while (i < length) {
            h = (d + 51) % 128;
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) + java.lang.Character.digit(str.charAt(i + 1), 16));
            i += 2;
        }
        return bArr;
    }

    private static boolean d(android.content.Context context, java.lang.String str) {
        boolean equals;
        d = (h + 109) % 128;
        java.lang.String[] split = str.split(",");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            int i2 = d + 43;
            h = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.String str2 = split[i];
                if (str2.endsWith("*")) {
                    equals = context.getPackageName().startsWith(str2.substring(0, str2.length() - 1));
                } else {
                    equals = str2.equals(context.getPackageName());
                }
                if (equals) {
                    return true;
                }
            } else {
                split[i].endsWith("*");
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    static void a() {
        b = 9010024738234916139L;
        e = 603544875;
        c = (char) 19920;
    }
}
