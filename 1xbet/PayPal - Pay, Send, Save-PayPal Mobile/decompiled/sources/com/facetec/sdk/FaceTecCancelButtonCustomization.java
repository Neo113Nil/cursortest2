package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class FaceTecCancelButtonCustomization {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static char[] f3358a;
    private static long c;
    private static int e;
    private static int f;
    public int customImage = 0;
    com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation d = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT;
    android.graphics.Rect b = null;
    public boolean hideForCameraPermissions = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(short s, byte b, short s2) {
        int i;
        int i2;
        int i3 = 106 - b;
        byte[] bArr = $$c;
        int i4 = (s2 * 2) + 1;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i3 = (-i3) + i6;
            i = i2;
            i5++;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = i3;
            i3 = bArr[i5];
            i3 = (-i3) + i6;
            i = i2;
            i5++;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i5++;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 101 - i;
        int i5 = s2 * 2;
        byte[] bArr = $$a;
        int i6 = 4 - (s * 2);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            int i9 = i6;
            i4 += i7;
            i2 = i8;
            i3 = i9 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i9 = i3;
            i4 += i7;
            i2 = i8;
            i3 = i9 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i6;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{57, -76, -24, 116};
        $$b = 78;
    }

    static void init$1() {
        $$c = new byte[]{64, com.google.common.base.Ascii.SYN, -17, -83};
        $$d = 85;
    }

    public enum ButtonLocation {
        TOP_LEFT("Top Left"),
        TOP_RIGHT("Top Right"),
        CUSTOM(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME),
        DISABLED("Disabled");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f3359a;

        ButtonLocation(java.lang.String str) {
            this.f3359a = str;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.f3359a;
        }
    }

    private static void g(char c2, int i, int i2, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i3 = $11 + 33;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = hhVar.e;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(f3358a[i >>> i4])};
                    java.lang.Object d = com.facetec.sdk.al.d(-719238807);
                    if (d == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (-b);
                        d = com.facetec.sdk.al.c((char) (45149 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 2150 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + 24, 1926116241, false, $$e(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(c), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d2 = com.facetec.sdk.al.d(671690243);
                    if (d2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        d2 = com.facetec.sdk.al.c((char) android.view.View.combineMeasuredStates(0, 0), 1834 - android.text.TextUtils.getCapsMode("", 0, 0), 24 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), -1880730373, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {hhVar, hhVar};
                    java.lang.Object d3 = com.facetec.sdk.al.d(898558648);
                    if (d3 == null) {
                        char c3 = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                        float complexToFloat = android.util.TypedValue.complexToFloat(0);
                        byte length = (byte) $$c.length;
                        d3 = com.facetec.sdk.al.c(c3, trimmedLength + 2341, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 24, -1839099840, false, $$e((byte) (-1), length, (byte) (length - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = hhVar.e;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(f3358a[i + i5])};
                java.lang.Object d4 = com.facetec.sdk.al.d(-719238807);
                if (d4 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (-b5);
                    d4 = com.facetec.sdk.al.c((char) (45150 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), 2150 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 24 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1926116241, false, $$e(b5, b6, (byte) (b6 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(c), java.lang.Integer.valueOf(c2)};
                java.lang.Object d5 = com.facetec.sdk.al.d(671690243);
                if (d5 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    d5 = com.facetec.sdk.al.c((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1834 - android.graphics.Color.blue(0), 24 - android.widget.ExpandableListView.getPackedPositionGroup(0L), -1880730373, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr6)).longValue();
                java.lang.Object[] objArr7 = {hhVar, hhVar};
                java.lang.Object d6 = com.facetec.sdk.al.d(898558648);
                if (d6 == null) {
                    char indexOf = (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                    double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                    byte length2 = (byte) $$c.length;
                    d6 = com.facetec.sdk.al.c(indexOf, combineMeasuredStates + 2341, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 24, -1839099840, false, $$e((byte) (-1), length2, (byte) (length2 - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            $11 = ($10 + 97) % 128;
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr8 = {hhVar, hhVar};
            java.lang.Object d7 = com.facetec.sdk.al.d(898558648);
            if (d7 == null) {
                char myPid = (char) (android.os.Process.myPid() >> 22);
                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                byte length3 = (byte) $$c.length;
                d7 = com.facetec.sdk.al.c(myPid, argb + 2341, (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 24, -1839099840, false, $$e((byte) (-1), length3, (byte) (length3 - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d7).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final void setCustomLocation(android.graphics.Rect rect) {
        int i = f + 61;
        int i2 = i % 128;
        e = i2;
        if (i % 2 == 0) {
            this.b = rect;
            f = (i2 + 109) % 128;
        } else {
            this.b = rect;
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final android.graphics.Rect getCustomLocation() {
        int i = f;
        int i2 = i + 41;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        android.graphics.Rect rect = this.b;
        e = (i + 47) % 128;
        return rect;
    }

    public final void setLocation(com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation buttonLocation) {
        if (buttonLocation == null) {
            buttonLocation = com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT;
        } else {
            int i = f + 125;
            int i2 = i % 128;
            e = i2;
            if (i % 2 != 0) {
                throw null;
            }
            f = (i2 + 75) % 128;
        }
        this.d = buttonLocation;
    }

    public final com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation getLocation() {
        int i = (f + 41) % 128;
        e = i;
        com.facetec.sdk.FaceTecCancelButtonCustomization.ButtonLocation buttonLocation = this.d;
        int i2 = i + 73;
        f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return buttonLocation;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        e = 0;
        f = 1;
        char[] cArr = new char[2156];
        java.nio.ByteBuffer.wrap("l59NÆ\u001f\u0093ü8õÅ\u008d\u0093U8&Åþ\u0092Ì?\u0093Åy\u00922?5ÄÛ\u0091®?~ÄX\u0091\u001f>ùË©\u0090µ>IË:\u0090û=ÉÊ\u009fl59NÆ\u001f\u0093ü8õÅ\u008d\u0093U8&Åþ\u0092Ì?\u0093Åy\u00922?5ÄÊ\u0091£?jÄO\u0091%>îËª\u0090\u0098>YË>\u0090þ\u0016îC\u0095¼Äé'B.¿Vé\u008eBý¿%è\u0017EH¿¢èéEî¾\u0012ëhE¯¾\u0092\u0002\u0081Wí¨·ýMVA«3ýáV\u009a«[ürQ+«\u0091ü\u0089Q±ªbÿ\u001aQÈª÷ÿ½PV¥1þ<Pï¥\u008aþZS{¤<þÇýÍ¨·Wö\u0002\u0011©\rTv\u0002¥©\u009cT\u0012\u0003 ®mT\u0082¤ßñ¥\u000eä[\u0003ð\u001f\rs[¹ðÍ\r^Z0÷b\r\u008fZÀ\u009aBÏ.0ie\u009eÎÌ3ïe)Î\u00123¿d\u009bÉÀ3\u0012d[Éx2\u0089gÜÉ\u00192<l59NÆ\u001b\u0093þ8»ÅÅ\u0093\u00148)Åê\u0092ß?\u0093Åd\u0092<?\u0005lh9EÆT\u0093è8µÅ\u0085\u0093N8dÅè\u0092Ï?\u009eÅx\u00925?\u0003ÄÞ\u0091\u0095?tÄO\u0091\u000e>ÕË¾\u0090\u0084>IË{lh9EÆT\u0093è8µÅ\u0085\u0093N8dÅè\u0092Ï?\u009eÅx\u00925?\u0003ÄÞ\u0091\u0095?tÄO\u0091\u000e>ÕË¾\u0090\u0084>IËxl59YÆ\u0003\u0093ù8®Å\u008f\u0093W8eÅö\u0092Ã?\u0098Å%\u00926?\u0003ÄØ\u0091¤?xÄ\u0004\u0091\t>ålx9CÆ\u001d\u0093ä8µÅ\u0092lF9kèd½\bBR\u0017¨¼ÿAÞ\u0017\u0006¼4A©\u0016\u0092»ÅAt\u0016e»^@\u0086\u0015î»\u001d@6\u0015\u0006ºµOî\u0014Öº\u001eO6\u0014¨¹\u0094NÅ\u0014/¹yNT\u0013\u0087õÛ ·_í\n\u0017¡@\\a\n¹¡\u008b\\\u0016\u000b-¦z\\Ë\u000bÚ¦á]9\bQ¦¢]\u0089\b¹§\u0014RF\tk§¤l59YÆ\u0003\u0093ù8®Å\u008f\u0093W8eÅö\u0092Ã?\u0098Å%\u00926?\u0003ÄØ\u0091¤?\u007fÄG\u0091\u000f>ÜË\u0097\u0090\u009a>HË%\u0090ê=\u0084Ê\u0089\u0090el59NÆ\u001f\u0093ü8õÅ\u0084\u0093_8'Åï\u0092Í?\u008fÅo\u0092)?\u001e\u001e)K\u0004´\u0015á©Jî·Âá\u0017Jo·õà\u0083MÔ·8àolt9OÆ\u001b\u0093ù8¿ÅÄ\u0093T8/Åî\u0084&ÑI.\u001b{öÐª-Ö{OÐ0-åzÜ×\u009a-`z:×\r,Ìy´×zlt9OÆ\u0017\u0093ÿ8©Å\u008clh9EÆT\u0093ú8¨Å\u0085\u0093^8?Åù\u0092Þ?ÔÅg\u0092;?\u0004ÄÏ\u0091¬?{ÄI\u0091\u000e>ÿË¨\u0090\u008f>Hft3FÌ\u001d\u0099úlj9OÆ\b\u0093ù8³Å\u0099\u0093N8dÅé\u0092Ó?\u0089Å$\u00928?\u000eÄ\u0094\u0091®?\u007fÄH\u0091\u000f>íËô\u0090\u008d>JË?\u0090´=ÌÊ\u009b\u0090a=?Ê5\u0097Ý<ºÊo\u0097u<\bÉï\u0096´#\u008eÉ_\u00968#ÿÈØ\u009d\u0017È27ub\u0084ÉÎ4äb3É\u00194\u0094c®Îô4YcEÎs5é`ÓÎ\u000255`rÏ\u0090:\u0089aðÏ7:BaÉÌ±;æa\u001cÌB;Hf ÍÇ;\u0012f\bÍq8\u0092gÉÒó8(gE ¹u\u009c\u008aÛß*t`\u0089Jß\u009dt·\u0089:Þ\u0000sZ\u0089÷ÞësÝ\u0088GÝ}s¬\u0088\u009bÝÜr>\u0087'ÜKr\u0086\u0087·Ü*q\b\u0086@H~\u001d[â\u001c·í\u001c§á\u008d·Z\u001cpáý¶Ç\u001b\u009dá0¶,\u001b\u001aà\u0080µº\u001bkà\\µ\u001b\u001aùïà´\u008c\u001aAïp´â\u0019ßî\u008d\nÓ_ö ±õ@^\n£ õ÷^Ý£PôjY0£\u009dô\u0081Y·¢-÷\u0017YÆ¢ñ÷¶XT\u00adMö!Xì\u00adÝöN[p¬ ¨.ý\u000b\u0002LW½ü÷\u0001ÝW\nü \u0001\u00adV\u0097ûÍ\u0001`V|ûJ\u0000ÐUêû;\u0000\fUKú©\u000f°TÜú\u0011\u000f T³ù\u0080\u000eÝll9HÆ\u0015\u0093ò8©Å\u008cl59ZÆ\b\u0093å8¹ÅÅ\u0093W8%Åþ\u0092ß?\u0096Åo\u0092)ll9HÆ\u0015\u0093ò8½Å\u009f\u0093_89Åîl59YÆ\u0003\u0093ù8®Å\u008f\u0093W8eÅü\u0092Ø?\u009bÅg\u0092??\u001dÄÕ\u0091¸?qÄ\u0005\u0091\r>ãË´\u0090\u008e>UË=\u0090é=\u0087Ê\u0089\u0090s=)Ê\u001e\u0097ß<§ÊE\u0097Y<\u001fÉø\u0096¬#\u008fÉH\u0096d#ðÈË\u0095\u0088l59\\Æ\u001f\u0093ä8¾Å\u0085\u0093H8eÅö\u0092Ã?\u0098Å<\u0092n?EÄÒ\u0091½?5ÄK\u0091\u000f>îË³\u0090\u0085>\u0014Ë:\u0090è=ÃÊ\u0097\u0090k=(Ê\u0013\u0097\u0094<½Ês\u0097D<\u001eÉå\u0096\u00ad#\u0099É\u0014\u00969#õ\u0090dÅ\r:NoµÄï9Ôo\u0019Ä49§n\u0092ÃÉ9mn?Ã\u00148\u0083mìÃd8\u0013m\\Â¸7älÖÂ\u001b7tl¸Á\u009e6ÙluÁ|6Rk\u0085Àÿ6$k\fÀX5õjøßÔáÍ´¡Kû\u001e\u0001µVHw\u001e¯µ\u009dH\u000e\u001f;²`HÄ\u001f\u0096²½I!\u001c^²\u008dI§\u001cæ³-FC\u001d{³¦FÞ\u001d=°;Gl\u001d\u0086°ÇGà\u001a$±SG\u0081\u001a·±¯D\u0011\u001bR®bDì\u001bÁ®\r3\u001cff\u0099'ÌÀgÜ\u009aªÌ}g\n\u009aÇÍ¬`º\u009aMÍ\u001a`7\u009b½Î\u0080`_\u009blÎ&aÇ\u0094\u0080Ï¦aa\u0094\u0015ÏÚbà\u0095¶Ï\rb\u0001\u0095 éò¼àC»\u0016\\½\u0018@*\u0016á½\u008c@Z\u0017k6Hcc\u009c6ÉÃb\u0092\u009fºÉsly9BÆ\b\u0093å8·Å\u0083\u0093O8'lh9EÆT\u0093ú8¨Å\u0085\u0093^8?Åù\u0092Þ?ÔÅn\u0092??\u001cÄÓ\u0091©?\u007fll9HÆ\u0015\u0093ò8âÅÜ\u0093Jl}9OÆ\u0014\u0093ï8¨Å\u0083\u0093Yl}9OÆ\u0014\u0093ï8¨Å\u0083\u0093Y8\u0015Åâ\u0092\u0092?Ì¤#ñ\u0011\u000eJ[±ðö\rÝ[\u0007ðK\r¼ZÌ÷\u0092\r\u000bZ2÷\u0000lh9EÆT\u0093ú8¨Å\u0085\u0093^8?Åù\u0092Þ?ÔÅg\u00925?\u000eÄß\u0091¦P\u0002\u0005%úzm¹8\u0081ÇÉ\u0092 9}ÄX\u0092\u00939þ\u008e\u001dÛ\u001c$LqìÚÎ'Ùq\u0012Úx'µp\u0081ÝÙ'lpzÝC&\u008es¬Ý\u001f&\u0004sNÜ£)ñrÉl[9DÆ\u001e\u0093ø8µÅ\u0083\u0093^8jÅÉ\u0092î?±Å*\u00928?\u001fÄÓ\u0091¦?nÄ\n\u0091\u001c>åË¨\u0090Ê>BËr\u0090¬Z\u0083\u000f\u009cðÆ¥ \u000emó[¥\u0086\u000e²ó\u0011¤6\tióò¤à\tÇò\u000b§~\t¶òÒ§Ä\b=ýp¦\u0012\b\u009aýª¦t\u000b-ü\u0014¦ælh9EÆT\u0093â8»Å\u0098\u0093^8=Åû\u0092Ø?\u009fl}9EÆ\u0016\u0093î8¼Å\u0083\u0093I8\"ll9HÆ\u0015\u0093ò8âÅÜ=/h\f\u0097SÂ®iõ\u0094Ølh9EÆT\u0093ú8¨Å\u0085\u0093^8?Åù\u0092Þ?ÔÅh\u0092(?\u000bÄÔ\u0091®lh9EÆT\u0093á8¿Å\u0098\u0093T8/Åö\u0092\u0084?\u008bÅo\u00927?\u001fl+lh9EÆT\u0093ù8¿Å\u0089\u0093O88Åÿiw)Â|ï\u0083þÖB}\u0005\u0080)Öü}\u0084\u0080\u001e×pz\"\u0080Ï×\u0094zµ\u0081sÔ\u0014l|9_Æ\u0016\u0093æ8\u0085Å\u0092\u0093\u00028|lh9EÆT\u0093è8¯Å\u0083\u0093V8.Å´\u0092Ì?\u0093Åd\u0092=?\u000fÄÈ\u0091º?hÄC\u0091\u0014>þ4«a\u0099\u009eÂË9`~\u009dUË\u008f`³\u009d?Ê\u0018gG\u009dóÊëgÙ\u009c\u0002Éyg¾\u009c\u0095ÉÏåR°`O;\u001aÀ±\u0087L¬\u001av±:LÍ\u001b½¶ãL\n\u001b\u0006¶!Mþ\u0018º¶MM=\u0018c·\u008aB\u0092\u0019 ·{B\u0000\u0019Ç´ìC¶\u0019z´\rC}\u001e£p;%\tÚR\u008f©$îÙÅ\u008f\u001f$#Ù»\u008e\u0083#ÓÙ+\u008ep#IØ£\u008dÿ#8Ø\u0007\u008d\u0013\"«×ù\u008cÂ\"\u0019×~\u008cµ!\u008f¯\u0002ú0\u0005kP\u0090û×\u0006üP&û\u001a\u0006\u0093Q·üê\u0006\rQ\u001dü#\u0007µR\u009aü\u0013\u00077Rjý\u008d\b\u009dS£ý5\u00926Ç\u000e8^m¦Æý;Äm^Ær;µl\u008aÁî;&laÁI:\u009eoïÁ4:>oIÀù5§n\u008eÀ\u00165dn¿Ã\u00844Ãn(Ãr4~i\u0089Â¹4glh9EÆT\u0093è8µÅ\u0085\u0093N8&Åõ\u0092Ë?\u009eÅo\u0092(\u0003µV\u0098©\u0089ü5WhªXü\u0093Wþª*ý\u0016P@ª²ý©PÕ«\u0012þ~P««\u0093þ\u0089Q1¤nÿYQ\u0080¤òÿ5R\u0007¥Uÿ¾Ré¥Ãl[9DÆ\u001e\u0093ø8µÅ\u0083\u0093^8gÅâ\u0092\u0092?Ìa\u00914¼Ë\u00ad\u009e\u00115VÈz\u009e¯5×ÈM\u009f72jÈ\u0080\u009fÓ2ÿÉ\"\u009cJ2ÍÉº\u009cçln9OÆ\t\u0093þ8÷k\u0096>¡Áö\u0094\u001b?\u0011Â|\u0094©?ÌÂQ\u0095>8zÂ\u0082\u0095Ê8¢Ã/\u0096]8\u0090Ã¿\u0096ìlk9OÆ\u0017\u0093ÿ8ôÅ\u0082\u0093M8dÅ÷\u0092Ë?\u0093Åd\u00921?\u000fÄÃ\u0091¹cû6ßÉ\u0087\u009co7dÊ\t\u009cÌ7ôÊl\u009d[0\u0001Êÿ\u009d\u00950\u0099ËK\u009e70ïËÈ\u009e\u008bs\u009d&¹Ùá\u008c\t'\u0002Úo\u008cª'\u0092Ú\u0000\u008d? hÚ£\u008dÈ ùÛ\"\u008eO \u0085Û¨\u008eõBa\u0017Lè]½è\u0016¶ë\u0091½]\u0016&ëÿ¼\u008d\u0011\u0092ëm¼7\u0011\u0011êÜ¿ª\u0011wê\r¿\u0002\u0010æå¾¾\u0096\u0010Wlh9EÆT\u0093è8µÅ\u0085\u0093N8dÅë\u0092Ï?\u0097Å\u007f\u0092t?\u000bÄÌ\u0091®?EÄD\u0091\u001b>çË¿\u00957À\u001a?\u000bjºÁá<ØjKÁw<°k\u009cÆÉ<1k+ÆS=\u008chûÆ\"=\u0010hWÇ¥2÷iÜÇ\u000b2alh9EÆT\u0093ú8¨Å\u0085\u0093^8?Åù\u0092Þ?ÔÅh\u0092/?\u0003ÄÖ\u0091®?4ÄL\u0091\u0013>äË½\u0090\u008f>HË:\u0090è=ÃÊ\u0094\u0090~lh9EÆT\u0093ù8£Å\u0099\u0093N8/Å÷\u0092\u0084?\u0098Å\u007f\u00923?\u0006ÄÞ\u0091ä?|ÄC\u0091\u0014>íË¿\u0090\u0098>JË8\u0090ó=ÄÊ\u008elh9EÆT\u0093ù8£Å\u0099\u0093N8/Å÷\u0092õ?\u009fÅr\u0092.?DÄØ\u0091¿?sÄF\u0091\u001e>¤Ë¼\u0090\u0083>TË-\u0090ÿ=ØÊ\u008a\u0090x=3Ê\u0004\u0097Îm]8pÇa\u0092É9\u008aÄ±\u0092k9\u0010ÄÝ\u0093±>\u00adÄJ\u0093\u0006>3Åë\u0090Ñ>IÅv\u0090!?ØÊ\u008a\u0091\u00ad?\u007fÊ\r\u0091Æ<ñË»lh9EÆT\u0093ü8¿Å\u0084\u0093^8%Åè\u0092õ?\u009eÅf\u00921?\u0007Ä\u0094\u0091¨?oÄC\u0091\u0016>îËô\u0090\u008c>SË$\u0090ý=ÏÊ\u0088\u0090z=(Ê\u0003\u0097Ô<¾l2l69\nl l3l59NÆ\u001f\u0093ü8õÅ\u009b\u0093_8'Åï\u0092õ?\u008aÅc\u0092*?\u000fl59NÆ\u001f\u0093ü8õÅ\u0099\u0093U8)Åñ\u0092Ï?\u008eÅ%\u00928?\u000bÄÉ\u0091¯?xÄK\u0091\u0014>îË\u0085\u0090\u008d>_Ë$\u0090ã=Îl59NÆ\u001f\u0093ü8õÅ\u0099\u0093U8)Åñ\u0092Ï?\u008eÅ%\u0092=?\u000fÄÔ\u0091³?~\u0012\u0010Gk¸:íÙFÐ»¼ípF\f»ÔìêA«»\u0000ì\u000eA*ºòï\u009aA[Ùï\u008c\u0083sÙ&#\u008d/pA&\u0085\u008dýp5'/\u008aTp¢'á\u008aÓq\u0005l59YÆ\u0003\u0093ù8®Å\u008f\u0093W8eÅö\u0092Ã?\u0098Å%\u00926?\u0003ÄØ\u0091©?EÄG\u0091\u001b>æË¶\u0090\u0085>YË\u0015\u0090þ=ÏÊ\u0098\u0090\u007f==Ê5\u0097Ë<¯Êw\u0097_<TÉù\u0096µl59NÆ\u001f\u0093ü8õÅ\u0088\u0093I8>ÅÅ\u0092Í?\u008aÅyl59NÆ\u001f\u0093ü8õÅ\u0088\u0093I8>ÅÅ\u0092Þ?\u0093Åg\u0092?Jr\u001f\tàXµ»\u001e²ãÞµ\u0012\u001enã¶´\u0088\u0019Éãb´\u007f\u0019^â\u0089·ë\u00192â\u0001·Y\u0018¨íï¶É¢æ÷\u008a\bÐ]*ö}\u000b\\]\u0084ö¶\u000b%\\\u0010ñK\u000bö\\åñÐ\n\u000b_{ñº\n\u008d_Ïð6\u0005e^]ð\u008c\u0005ë^\u0016ó\u0013\u0004G^°ó§\u0004ÊY\u0006l59NÆ\u001f\u0093ü8õÅ\u0088\u0093I8>Åû\u0092É?\u0099ÅoãW¶,I}\u001c\u009e·\u0097Jê\u001c+·\\J\u009f\u001d±°êJ\u0007l59NÆ\u001f\u0093ü8õÅ\u0088\u0093I8>Å÷\u0092Ï?\u009dÅdl59NÆ\u001f\u0093ü8õÅ\u0088\u0093I8>Åõ\u0092Ø?\u0093Åo\u00199LB³\u0013æðMù°\u0084æEM2°àçËJ\u0085°afÜ3§Ìö\u0099\u00152\u001cÏa\u0099 2×Ï\u0003\u0098$5rÏ\u008a\u0098Ã5àã9¶BI\u0013\u001cð·ùJ\u0084\u001cE·2JÉ\u001dÏ°\u009bJcl59NÆ\u001b\u0093þ8»ÅÅ\u0093^8%Åí\u0092Ä?\u0096Åe\u0092;?\u000eÄÉ\u0091å?4ÄR\u0091\u0018>¥Ë¸\u0090\u0099>NË!Ck\u0016\u0019éJ¼ \u0017«êÃ¼\r\u0017zê ½\u009b\u0010Óê'½+\u0010vë\u0097¾à\u0010\u0017ë\u001c¾E\u0011¦äá¿Ð\u0011\"ä{¿¨\u0012\u0090åÁ¿&l59ZÆ\b\u0093å8¹ÅÅ\u0093S8%Åê\u0092Å?\u0088Å~\u0092)l*9LÆ\u001c\u0093ª8àl59ZÆ\b\u0093å8¹ÅÅ\u0093I8/Åö\u0092Ì?ÕÅg\u0092;?\u001aÄÉl}9XÆ\u001b\u0093æ8¶Å\u0085\u0093Y8dÅý\u0092Å?\u0096Ån\u0092<?\u0003ÄÉ\u0091¢?4ÄY\u0091\u0015lv9CÆ\u0018\u0093Í8\u0096Å¯\u0093i8\u0015Åø\u0092Ù?\u008eÅ$\u0092)?\u0005w\u009c\"æÝ§\u0088@#\\Þ.\u0088ö#\u0087ÞZ\u0089b$\fÞÀ\u0089\u009c$§ßv\u008a\u0000$Àß\u00ad\u008a«%NÐ\u001fo\u009b:¥Åì\u0090\f;JÆ}\u0090¸;ÊÆ\u0012\u0091:l59OÆ\u000e\u0093é8õÅ\u0087\u0093U8?Åô\u0092Þ?\u0089l59NÆ\u001b\u0093þ8»ÅÅ\u0093^8%Åí\u0092Ä?\u0096Åe\u0092;?\u000eÄÉ\u0091å?4ÄN\u0091\n>¥Ë»\u0090\u009a>JË9\u0090´=ÒÊ\u0097\u0090f9\u000ela\u00933ÆÞm\u0082\u0090þÆbm\u0001\u0090ÔÇøj¯\u0090WÇ\u000e½¿è§\u0017ôB\fé^\u0014aB«éÀl59NÆ\u001b\u0093þ8»ÅÅ\u0093W8#Åé\u0092É?ÕÅz\u0092(?\u0005ÄÜ\u0091£?vÄO\u0091\t>¥Ë¹\u0090\u009f>HËe\u0090ª=\u0085Ê\u0099\u0090e=7ÊD\u0097×<£Êy\u0097X<\u0015Éü\u0096³#\u0098ÉN\u0096d#÷ÈÏ\u0095\u0097#\u007fÈ3\u0095\u0007\"ß".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
        f3358a = cArr;
        c = 6913179067819309354L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:171|(4:173|(1:175)(1:352)|176|177)(5:353|354|(1:356)|357|358)|180|181|(1:183)|184|(5:186|(1:188)|189|190|(28:192|193|194|(1:196)(1:296)|197|(1:199)(4:291|(1:293)|294|295)|200|(1:290)(5:204|(8:207|208|(1:210)(1:287)|211|212|(2:285|286)(3:214|(5:216|(1:218)|219|220|(2:222|223)(1:282))(1:284)|283)|224|205)|288|289|225)|226|(2:227|(4:229|(6:231|232|(1:234)(1:277)|235|236|(2:239|240)(1:238))|278|279)(2:280|281))|241|242|243|244|245|(1:247)|248|249|250|251|252|(1:254)(1:266)|255|256|257|(1:259)|260|261))(1:350)|297|(2:299|(5:301|302|(1:304)(1:335)|305|306)(5:336|337|(1:339)(1:343)|340|341))|344|345|(1:347)(1:349)|348|193|194|(0)(0)|197|(0)(0)|200|(1:202)|290|226|(3:227|(0)(0)|279)|241|242|243|244|245|(0)|248|249|250|251|252|(0)(0)|255|256|257|(0)|260|261) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x1923, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) != 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x1a28, code lost:
    
        r2 = r32;
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x389f, code lost:
    
        r2 = r32;
        r14 = (r3 & (-152)) | (r2 & 151);
        r79 = r79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x389d, code lost:
    
        r79 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x2829, code lost:
    
        if (r6 != null) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x2a19, code lost:
    
        r14 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x2a1b, code lost:
    
        r5 = r5 + 34;
        r5 = (r5 | (-33)) + (r5 & (-33));
        r8 = r19;
        r4 = r21;
        r1 = r32;
        r6 = r45;
        r11 = 24;
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x289f, code lost:
    
        r4 = ~(((-959522780) & r3) | ((-959522780) ^ r3));
        r4 = ((r4 ^ 421602842) | (421602842 & r4)) * 992;
        r7 = ~((-959522780) | r3);
        r7 = (r7 ^ 421602842) | (421602842 & r7);
        r8 = (959522779 & r2) | (959522779 ^ r2);
        r8 = ~((r8 ^ 497382970) | (497382970 & r8));
        r7 = -(-(((r7 ^ r8) | (r7 & r8)) * (-496)));
        r8 = ~((847573955 & r3) | (847573955 ^ r3));
        r12 = (((-915865584) | r8) * (-814)) + 205235921;
        r13 = ~((68570286 & r2) | (68570286 ^ r2));
        r13 = (r13 & 278658) | (278658 ^ r13);
        r8 = ((r8 ^ r13) | (r8 & r13)) * 407;
        r13 = ~(((-847573956) & r3) | ((-847573956) ^ r3));
        r13 = (r13 ^ 278658) | (278658 & r13);
        r14 = ~(((-68570287) & r3) | (r3 ^ (-68570287)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x2957, code lost:
    
        if ((((((r4 & 386159973) + (r4 | 386159973)) - (~r7)) - 1) + (((497382970 ^ r3) | (r3 & 497382970)) * 496)) <= ((((r12 | r8) << 1) - (r8 ^ r12)) + (((r13 & r14) | (r13 ^ r14)) * 407))) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x295d, code lost:
    
        if (r6.length() == 0) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x2961, code lost:
    
        if (r11.length == 1) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x2963, code lost:
    
        r4 = com.facetec.sdk.FaceTecCancelButtonCustomization.f;
        com.facetec.sdk.FaceTecCancelButtonCustomization.e = ((r4 ^ 19) + ((r4 & 19) << 1)) % 128;
        r4 = r1.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x2971, code lost:
    
        if (r7 >= r4) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x2979, code lost:
    
        if (r6.contains(r1[r7]) == false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x2989, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x297b, code lost:
    
        r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.e + 25;
        com.facetec.sdk.FaceTecCancelButtonCustomization.f = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x2985, code lost:
    
        if ((r1 % 2) != 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x298c, code lost:
    
        r1 = (r5 & 10) + (r5 | 10);
        r1 = (r1 & r2) | ((~r1) & r3);
        r4 = ((r10 | 1) << 1) - (r10 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x299c, code lost:
    
        if (r4 <= 1) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x299e, code lost:
    
        com.facetec.sdk.FaceTecCancelButtonCustomization.e = (com.facetec.sdk.FaceTecCancelButtonCustomization.f + 91) % 128;
        r7 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r8 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        r10 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        r13 = new java.lang.Object[1];
        g(r7, (r8 ^ 1606) + ((r8 & 1606) << 1), (r10 & 50) + (r10 | 50), r13);
        r7 = 0;
        r9.append((java.lang.String) r13[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x29da, code lost:
    
        r9.append(r11[r7]);
        r7 = -(-android.os.Process.getGidForName(r21));
        r8 = -(-android.widget.ExpandableListView.getPackedPositionChild(0));
        r13 = new java.lang.Object[1];
        g((char) (((r7 | 1) << 1) - (r7 ^ 1)), (r8 ^ 1609) + ((r8 & 1609) << 1), 0 - (~(-(-android.view.View.resolveSizeAndState(0, 0, 0)))), r13);
        r9.append((java.lang.String) r13[0]);
        r9.append(r6);
        r14 = r1;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x29d9, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x2a14, code lost:
    
        r6.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x2a18, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x289d, code lost:
    
        if (r6 != null) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x1a13, code lost:
    
        r1 = com.facetec.sdk.FaceTecCancelButtonCustomization.f;
        com.facetec.sdk.FaceTecCancelButtonCustomization.e = (((r1 | 23) << 1) - (r1 ^ 23)) % 128;
        r2 = r32;
        r1 = (r7 & (-221)) | (r2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x1a11, code lost:
    
        if (((r1 ^ r2) | (r1 & r2)) != 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0c27, code lost:
    
        if (r7.isFile() != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0c20, code lost:
    
        if (r7.isFile() != false) goto L428;
     */
    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6595 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0cbd A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0ea0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0f99 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x10a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x124c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x1587  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1718 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x181e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x2ad7 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x2b20  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x3548  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x37af A[Catch: all -> 0x3891, TryCatch #1 {all -> 0x3891, blocks: (B:245:0x37a2, B:247:0x37af, B:248:0x37ee), top: B:244:0x37a2, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x388a A[Catch: Exception -> 0x389f, TryCatch #7 {Exception -> 0x389f, blocks: (B:252:0x3860, B:254:0x388a, B:270:0x3892, B:272:0x389b, B:273:0x389c, B:245:0x37a2, B:247:0x37af, B:248:0x37ee), top: B:244:0x37a2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x38f4 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x388d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x372f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x2b23 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x2b15  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x3a19  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x16ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x14ef  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x10d4  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0f22 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0ae0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0668 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0b23 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:6:0x00cc, B:8:0x00d9, B:9:0x0114, B:19:0x02a9, B:21:0x02b6, B:22:0x02ef, B:29:0x0414, B:31:0x0421, B:32:0x045a, B:38:0x0662, B:40:0x0668, B:41:0x069a, B:65:0x09bb, B:67:0x09c8, B:68:0x0a10, B:78:0x0b16, B:80:0x0b23, B:81:0x0b5c, B:100:0x0cb0, B:102:0x0cbd, B:103:0x0cf4, B:112:0x0ea2, B:114:0x0eaf, B:115:0x0eed, B:122:0x0f8c, B:124:0x0f99, B:125:0x0fdf, B:140:0x12e4, B:142:0x12f1, B:143:0x132a, B:152:0x1589, B:154:0x1596, B:155:0x15d7, B:165:0x1712, B:167:0x1718, B:168:0x1753, B:173:0x182e, B:175:0x1840, B:176:0x1884, B:181:0x1a69, B:183:0x1a76, B:184:0x1ab1, B:186:0x1aba, B:188:0x1ad2, B:189:0x1b17, B:194:0x2aca, B:196:0x2ad7, B:197:0x2b17, B:208:0x30c7, B:210:0x30d4, B:211:0x3118, B:232:0x357b, B:234:0x3588, B:235:0x35dc, B:257:0x38e7, B:259:0x38f4, B:260:0x392a, B:216:0x31fd, B:218:0x320a, B:219:0x3245, B:291:0x2b23, B:293:0x2b3b, B:294:0x2b81, B:302:0x27bd, B:304:0x27ca, B:305:0x2814, B:337:0x2838, B:339:0x2845, B:340:0x288b, B:354:0x1930, B:356:0x1942, B:357:0x197a, B:367:0x13d7, B:369:0x13e4, B:370:0x141f, B:380:0x1130, B:382:0x113d, B:383:0x118f, B:421:0x053e, B:423:0x054b, B:424:0x058e, B:434:0x05ee, B:436:0x05fb, B:437:0x0638), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0c0d  */
    /* JADX WARN: Type inference failed for: r10v424 */
    /* JADX WARN: Type inference failed for: r10v425, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v439 */
    /* JADX WARN: Type inference failed for: r1v179 */
    /* JADX WARN: Type inference failed for: r5v524, types: [java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r5v525 */
    /* JADX WARN: Type inference failed for: r5v570 */
    /* JADX WARN: Type inference failed for: r5v588 */
    /* JADX WARN: Type inference failed for: r79v16 */
    /* JADX WARN: Type inference failed for: r79v5 */
    /* JADX WARN: Type inference failed for: r79v8 */
    /* JADX WARN: Type inference failed for: r8v536, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] a(android.content.Context context, int i, int i2, int i3) {
        int i4;
        java.lang.String str;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        int i6;
        java.lang.String str4;
        long j;
        int i7;
        java.lang.String str5;
        int i8;
        java.lang.Object d;
        java.lang.String str6;
        java.io.File file;
        java.lang.String str7;
        int i9;
        java.lang.String[] strArr;
        int i10;
        int i11;
        java.lang.String str8;
        int i12;
        java.lang.Object d2;
        java.lang.String str9;
        int i13;
        java.io.File file2;
        int i14;
        java.lang.Object d3;
        java.lang.String lowerCase;
        java.lang.Object[] objArr;
        int i15;
        java.lang.String[] strArr2;
        int i16;
        int i17;
        int i18;
        java.lang.Object d4;
        int i19;
        int i20;
        long j2;
        long j3;
        long j4;
        int i21;
        int i22;
        int i23;
        java.lang.String[] strArr3;
        int i24;
        int i25;
        int i26;
        int i27;
        java.lang.Object d5;
        int i28;
        int i29;
        int i30;
        java.lang.String[] strArr4;
        int i31;
        long j5;
        long j6;
        long j7;
        int i32;
        int i33;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        java.lang.String str10;
        long j13;
        java.lang.String[] strArr5;
        int i34;
        long j14;
        int i35;
        java.lang.String[] strArr6;
        java.lang.String str11;
        java.lang.String[][] strArr7;
        java.lang.String str12;
        java.lang.String[] strArr8;
        java.lang.Object d6;
        java.lang.String str13;
        java.lang.Object invoke;
        int i36;
        java.lang.String str14;
        java.lang.String[] strArr9;
        int i37;
        ?? r5;
        int i38;
        android.content.Context context2;
        int i39;
        int i40;
        java.lang.String str15;
        int i41;
        android.content.Context context3;
        java.lang.Object d7;
        java.lang.Object d8;
        android.content.Context context4;
        java.lang.String[] strArr10;
        int i42;
        int i43;
        int i44;
        java.lang.String[] strArr11;
        java.lang.String[] strArr12;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        java.lang.String[] strArr13;
        java.lang.String next;
        java.lang.String[] strArr14;
        int i50;
        java.util.Scanner useDelimiter;
        java.lang.String str16;
        int i51 = i;
        java.lang.String str17 = "";
        int i52 = -android.text.TextUtils.indexOf("", "");
        char c2 = (char) ((i52 & com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE) + (i52 | com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE));
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        int i53 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        int i54 = 1;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        g(c2, 910 - (longPressTimeout >> 16), ((i53 | 9) << 1) - (i53 ^ 9), objArr2);
        int i55 = 0;
        java.lang.String str18 = (java.lang.String) objArr2[0];
        char absoluteGravity = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
        int i56 = -android.graphics.Color.rgb(0, 0, 0);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        g(absoluteGravity, doubleTapTimeout >> 16, ((-16777189) & i56) + (i56 | (-16777189)), objArr3);
        java.lang.String str19 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        g((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 27 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 25 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        java.lang.String str20 = (java.lang.String) objArr4[0];
        char makeMeasureSpec = (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 31451);
        int blue = android.graphics.Color.blue(0);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        g(makeMeasureSpec, (blue ^ 52) + ((blue & 52) << 1), 18 - android.text.TextUtils.getTrimmedLength(""), objArr5);
        java.lang.String str21 = (java.lang.String) objArr5[0];
        char c3 = (char) (28341 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
        int i57 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int i58 = -android.text.TextUtils.getTrimmedLength("");
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        g(c3, (i57 ^ 69) + ((i57 & 69) << 1), ((i58 | 28) << 1) - (i58 ^ 28), objArr6);
        java.lang.String[] strArr15 = {str19, str20, str21, (java.lang.String) objArr6[0]};
        int i59 = 0;
        while (true) {
            if (i59 >= 4) {
                i4 = i51;
                str = str17;
                str2 = str18;
                break;
            }
            try {
                java.lang.Object[] objArr7 = {strArr15[i59]};
                java.lang.Object d9 = com.facetec.sdk.al.d(1450487247);
                if (d9 == null) {
                    char modifierMetaStateMask = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.CAN);
                    int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                    byte b = (byte) i55;
                    byte b2 = b;
                    java.lang.Object[] objArr8 = new java.lang.Object[i54];
                    h(b, b2, (byte) (b2 + 3), objArr8);
                    java.lang.String str22 = (java.lang.String) objArr8[i55];
                    java.lang.Class[] clsArr = new java.lang.Class[i54];
                    clsArr[i55] = java.lang.String.class;
                    d9 = com.facetec.sdk.al.c(modifierMetaStateMask, 2389 - packedPositionGroup, 23 - (touchSlop >> 8), -241445065, false, str22, clsArr);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d9).invoke(null, objArr7)).longValue();
                long j15 = 1342617506;
                str2 = str18;
                int i60 = i59;
                long j16 = 52;
                java.lang.String[] strArr16 = strArr15;
                long j17 = i51;
                str = str17;
                long j18 = -1;
                long j19 = j17 ^ j18;
                long j20 = j19 | j15;
                long j21 = longValue ^ j18;
                long j22 = j15 ^ j18;
                long j23 = ((-51) * j15) + (53 * longValue) + (((j20 | longValue) ^ j18) * j16) + ((-52) * (((j21 | j19) ^ j18) | ((j21 | j15) ^ j18) | (j20 ^ j18))) + (j16 * ((j18 ^ (longValue | j22)) | ((j22 | j19) ^ j18))) + 508559135;
                int myTid = android.os.Process.myTid();
                int i61 = ~myTid;
                int i62 = ((int) (j23 >> 32)) & ((((-1992909191) | myTid) * (-50)) + 867926458 + (((~(myTid | 2009950670)) | (~((-1145118977) | i61))) * 50) + (((~((-1992909191) | i61)) | (~(i61 | 864831694)) | 1145118976) * 50));
                i4 = i;
                int i63 = ~i4;
                int i64 = ((int) j23) & (((((~(2078233232 | i63)) | 641006822) * (-602)) - 581154124) + (((~(2078233232 | i4)) | 69250150 | (~((-1506476561) | i63))) * (-301)) + ((~(641006822 | i63)) * 301));
                if (((i62 ^ i64) | (i62 & i64)) != 0) {
                    int i65 = e;
                    f = (((i65 | 101) << 1) - (i65 ^ 101)) % 128;
                    int i66 = ((i60 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) << 1) - (i60 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    i51 = ((~i66) & i4) | (i66 & i63);
                    break;
                }
                i59 = (i60 ^ 1) + ((i60 & 1) << 1);
                i51 = i4;
                str18 = str2;
                strArr15 = strArr16;
                str17 = str;
                i55 = 0;
                i54 = 1;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i67 = 3;
        int i68 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
        int i69 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        g((char) ((37368 ^ i68) + ((i68 & 37368) << 1)), (i69 & 97) + (i69 | 97), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, objArr9);
        int i70 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
        java.lang.String str23 = str;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        g((char) ((51433 ^ i70) + ((i70 & 51433) << 1)), 110 - android.view.KeyEvent.keyCodeFromString(str), 12 - (~(-android.text.TextUtils.indexOf(str23, str23))), objArr10);
        int i71 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        g((char) ((63095 & i71) + (i71 | 63095)), ((minimumFlingVelocity | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (minimumFlingVelocity ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 18, objArr11);
        java.lang.String[] strArr17 = {(java.lang.String) objArr9[0], (java.lang.String) objArr10[0], (java.lang.String) objArr11[0]};
        int i72 = 0;
        while (true) {
            if (i72 >= i67) {
                i5 = i51;
                str3 = str23;
                i6 = i4;
                break;
            }
            java.lang.Object[] objArr12 = {strArr17[i72]};
            java.lang.Object d10 = com.facetec.sdk.al.d(2084539986);
            if (d10 == null) {
                char maximumDrawingCacheSize = (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6935);
                int alpha = android.graphics.Color.alpha(0);
                int defaultSize = android.view.View.getDefaultSize(0, 0);
                byte b3 = (byte) 0;
                byte b4 = b3;
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                h(b3, b4, b4, objArr13);
                d10 = com.facetec.sdk.al.c(maximumDrawingCacheSize, 2389 - alpha, defaultSize + 23, -607062870, false, (java.lang.String) objArr13[0], new java.lang.Class[]{java.lang.String.class});
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d10).invoke(null, objArr12)).longValue();
            long j24 = -443360909;
            java.lang.String[] strArr18 = strArr17;
            str3 = str23;
            long j25 = -1;
            long j26 = longValue2 ^ j25;
            i5 = i51;
            long uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
            long j27 = uptimeMillis ^ j25;
            long j28 = ((-830) * j24) + (832 * longValue2) + ((((j26 | j27) ^ j25) | (((j24 | longValue2) | uptimeMillis) ^ j25)) * (-831)) + ((-1662) * (((j26 | j24) | uptimeMillis) ^ j25)) + (831 * (((uptimeMillis | longValue2) ^ j25) | (((j24 ^ j25) | j27) ^ j25) | ((j24 | uptimeMillis) ^ j25))) + 1415510251;
            int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
            int i73 = ((int) (j28 >> 32)) & ((((~((-1445618181) | uptimeMillis2)) | (~((-8391770) | uptimeMillis2))) * 69) + 346902868 + (((~(uptimeMillis2 | 160730329)) | (-1606348510) | (~(1597956740 | uptimeMillis2))) * (-69)) + 1921426048);
            int i74 = ~i4;
            int i75 = ((int) j28) & (((262417 | i74) * (-192)) + 1788176917 + (((~(651634973 | i74)) | (-785853854)) * (-384)) + (((~(i74 | (-134218881))) | (~(785853853 | i4)) | (~((-651372557) | i4))) * 192));
            if (((i73 ^ i75) | (i73 & i75)) != 0) {
                i6 = ((i72 & 270) + (i72 | 270)) ^ i4;
                break;
            }
            int i76 = ((i72 | 101) << 1) - (i72 ^ 101);
            i72 = (i76 & (-100)) + (i76 | (-100));
            i51 = i5;
            str23 = str3;
            strArr17 = strArr18;
            i67 = 3;
        }
        int i77 = ~i4;
        int i78 = i5;
        int i79 = ((~i78) & i4) | (i78 & i77);
        int i80 = (i79 | (-i79)) >> 31;
        int i81 = (i6 & (~i80)) | (i78 & i80);
        char c4 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int i82 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i83 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        g(c4, (i82 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE) + (i82 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE), ((i83 | 14) << 1) - (i83 ^ 14), objArr14);
        java.lang.Object[] objArr15 = {(java.lang.String) objArr14[0]};
        java.lang.Object d11 = com.facetec.sdk.al.d(2084539986);
        if (d11 == null) {
            char axisFromString = (char) (6934 - android.view.MotionEvent.axisFromString(str3));
            str4 = str3;
            int indexOf = android.text.TextUtils.indexOf(str4, str4);
            int indexOf2 = android.text.TextUtils.indexOf(str4, str4);
            byte b5 = (byte) 0;
            byte b6 = b5;
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            h(b5, b6, b6, objArr16);
            d11 = com.facetec.sdk.al.c(axisFromString, 2389 - indexOf, 23 - indexOf2, -607062870, false, (java.lang.String) objArr16[0], new java.lang.Class[]{java.lang.String.class});
        } else {
            str4 = str3;
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr15)).longValue();
        long j29 = -103737746;
        long j30 = -1;
        long j31 = longValue3 ^ j30;
        long j32 = i4;
        long j33 = j32 ^ j30;
        long j34 = ((-830) * j29) + (832 * longValue3) + ((-831) * (((j31 | j33) ^ j30) | (((j29 | longValue3) | j32) ^ j30))) + ((-1662) * (((j31 | j29) | j32) ^ j30)) + (831 * (((longValue3 | j32) ^ j30) | ((j29 | j32) ^ j30) | (((j29 ^ j30) | j33) ^ j30))) + 1075887088;
        int myTid2 = android.os.Process.myTid();
        int i84 = ((int) (j34 >> 32)) & (((((~((-168637013) | myTid2)) | 168632916) * 104) - 2005432166) + ((~((~myTid2) | 1268593494)) * (-104)) + ((myTid2 | 1268589398) * 104));
        int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
        int i85 = ((int) j34) & ((((~(124870455 | uptimeMillis3)) | 103831090) * (-502)) + 1975007239 + ((~((~uptimeMillis3) | (-1208524865))) * (-502)) + (((~(uptimeMillis3 | 1312355954)) | 124870455) * 502));
        if (((i84 ^ i85) | (i85 & i84)) == 0) {
            char indexOf3 = (char) android.text.TextUtils.indexOf(str4, str4, 0, 0);
            int i86 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            g(indexOf3, (i86 ^ 155) + ((i86 & 155) << 1), 23 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr17);
            java.lang.Object[] objArr18 = {(java.lang.String) objArr17[0]};
            java.lang.Object d12 = com.facetec.sdk.al.d(1590238701);
            if (d12 == null) {
                char modifierMetaStateMask2 = (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                int lastIndexOf = android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                byte b7 = (byte) 0;
                byte b8 = b7;
                j = j32;
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                h(b7, b8, b8, objArr19);
                d12 = com.facetec.sdk.al.c(modifierMetaStateMask2, 2079 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), 23 - lastIndexOf, -114923755, false, (java.lang.String) objArr19[0], new java.lang.Class[]{java.lang.String.class});
            } else {
                j = j32;
            }
            java.lang.String str24 = (java.lang.String) ((java.lang.reflect.Method) d12).invoke(null, objArr18);
            if (str24 != null) {
                int i87 = e;
                int i88 = ((i87 | 125) << 1) - (i87 ^ 125);
                f = i88 % 128;
                if (i88 % 2 == 0) {
                    str24.length();
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (str24.length() != 0) {
                    i7 = i77;
                    i8 = (i7 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE) | (i4 & (-268));
                }
            }
            i7 = i77;
            char c5 = (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i89 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            g(c5, (i89 ^ 179) + ((i89 & 179) << 1), android.view.MotionEvent.axisFromString(str4) + 25, objArr20);
            java.lang.Object[] objArr21 = {(java.lang.String) objArr20[0]};
            java.lang.Object d13 = com.facetec.sdk.al.d(1590238701);
            if (d13 == null) {
                char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                int red = android.graphics.Color.red(0);
                long elapsedRealtimeNanos2 = android.os.SystemClock.elapsedRealtimeNanos();
                byte b9 = (byte) 0;
                byte b10 = b9;
                str5 = str4;
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                h(b9, b10, b10, objArr22);
                d13 = com.facetec.sdk.al.c(resolveOpacity, red + 2078, 25 - (elapsedRealtimeNanos2 > 0L ? 1 : (elapsedRealtimeNanos2 == 0L ? 0 : -1)), -114923755, false, (java.lang.String) objArr22[0], new java.lang.Class[]{java.lang.String.class});
            } else {
                str5 = str4;
            }
            java.lang.String str25 = (java.lang.String) ((java.lang.reflect.Method) d13).invoke(null, objArr21);
            i8 = (str25 == null || str25.length() == 0) ? i4 : (i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE) & (~(i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE));
            int i90 = ((~i81) & i4) | (i81 & i7);
            int i91 = (i90 | (-i90)) >> 31;
            int i92 = ((~i91) & i8) | (i81 & i91);
            d = com.facetec.sdk.al.d(-318294282);
            if (d == null) {
                char resolveSizeAndState = (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 28045);
                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                int myPid = android.os.Process.myPid();
                byte b11 = (byte) 0;
                byte b12 = b11;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                h(b11, b12, (byte) (b12 + 1), objArr23);
                d = com.facetec.sdk.al.c(resolveSizeAndState, combineMeasuredStates + 2318, (myPid >> 22) + 23, 1256737806, false, (java.lang.String) objArr23[0], new java.lang.Class[0]);
            }
            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, null)).longValue();
            long j35 = -1512004639;
            long j36 = j35 ^ j30;
            long j37 = longValue4 ^ j30;
            int i93 = i7;
            long freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
            long j38 = 490;
            long j39 = (491 * j35) + ((-489) * longValue4) + ((j36 | j37 | (freeMemory ^ j30)) * (-490)) + ((((j37 | freeMemory) ^ j30) | ((j37 | j35) ^ j30)) * j38) + (j38 * j36) + 1943822740;
            int i94 = (((int) (j39 >> 32)) & ((((138428928 | r2) * (-476)) - 1423240662) + ((~((-69665) | i)) * 952) + ((~(i93 | (-69665))) * 476))) | (((int) j39) & ((((~(i93 | 2130443195)) | (~((-1613437107) | i))) * 988) + 261173773 + (((~(1954232499 | i)) | 176210696 | (~(i93 | (-1613437107)))) * 988)));
            int d14 = com.facetec.sdk.mt.c.d();
            int i95 = -(-(i94 * (-987)));
            int i96 = ((i95 | (-989)) << 1) - (i95 ^ (-989));
            int i97 = ~i94;
            int i98 = ~d14;
            int i99 = (i97 & i98) | (i97 ^ i98);
            int i100 = -(-(((~(i99 | (~i99))) | (~((d14 ^ (-1)) | d14))) * 988));
            int i101 = (((i96 | i100) << 1) - (i96 ^ i100)) + (((i97 ^ (-1)) | i97) * (-988));
            int i102 = (~((d14 ^ i97) | (d14 & i97))) | (~i97);
            int i103 = (~i98) | i98;
            int i104 = ~((i103 ^ i94) | (i103 & i94));
            int i105 = -(-(((i102 ^ i104) | (i102 & i104)) * 988));
            int i106 = (((i101 | i105) << 1) - (i105 ^ i101)) + 200;
            int i107 = -i94;
            int i108 = ((i94 ^ i107) | (i94 & i107)) >> 31;
            int i109 = (~i108) & i;
            int i110 = i108 & ((i106 & i93) | ((~i106) & i));
            int i111 = ((~i92) & i) | (i92 & i93);
            int i112 = -i111;
            int i113 = ((i111 ^ i112) | (i111 & i112)) >> 31;
            int i114 = ((i110 ^ i109) | (i110 & i109)) & (~i113);
            int i115 = i92 & i113;
            int i116 = (i114 ^ i115) | (i115 & i114);
            int i117 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i118 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i119 = -android.view.View.resolveSizeAndState(0, 0, 0);
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            g((char) (((i117 | 1) << 1) - (i117 ^ 1)), (i118 & 203) + (i118 | 203), (i119 ^ 20) + ((i119 & 20) << 1), objArr24);
            java.lang.String str26 = (java.lang.String) objArr24[0];
            char c6 = (char) ((-2) - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))));
            int i120 = -(android.os.Process.myTid() >> 22);
            int i121 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            g(c6, ((i120 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) << 1) - (i120 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), (i121 & 6) + (i121 | 6), objArr25);
            str6 = (java.lang.String) objArr25[0];
            file = new java.io.File(str26);
            if (file.exists() && file.isFile()) {
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                    str7 = str5;
                    try {
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        g((char) android.text.TextUtils.getOffsetAfter(str7, 0), 230 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, objArr26);
                        useDelimiter = scanner.useDelimiter((java.lang.String) objArr26[0]);
                        if (useDelimiter.hasNext()) {
                            str16 = str7;
                        } else {
                            int i122 = e + 95;
                            f = i122 % 128;
                            if (i122 % 2 == 0) {
                                str16 = useDelimiter.next();
                                int i123 = 18 / 0;
                            } else {
                                str16 = useDelimiter.next();
                            }
                        }
                        useDelimiter.close();
                    } catch (java.io.IOException unused) {
                    }
                } catch (java.io.IOException unused2) {
                }
                if (str16.contains(str6)) {
                    i9 = 1;
                    int i124 = -i9;
                    int i125 = ((i9 ^ i124) | (i9 & i124)) >> 31;
                    int i126 = (~i125) & i;
                    int i127 = i125 & ((i & (-263)) | (i93 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                    int i128 = (~(i & i116)) & (i | i116);
                    int i129 = -i128;
                    int i130 = ((i128 ^ i129) | (i128 & i129)) >> 31;
                    int i131 = ((i127 ^ i126) | (i127 & i126)) & (~i130);
                    int i132 = i116 & i130;
                    int i133 = (i132 ^ i131) | (i132 & i131);
                    int i134 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                    int i135 = -android.view.View.MeasureSpec.getMode(0);
                    int i136 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    g((char) ((33873 ^ i134) + ((i134 & 33873) << 1)), 230 - (~i135), (i136 ^ 32) + ((i136 & 32) << 1), objArr27);
                    java.lang.String str27 = (java.lang.String) objArr27[0];
                    int i137 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i138 = -android.text.TextUtils.getTrimmedLength(str7);
                    int i139 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i140 = i139 * 615;
                    int i141 = (i140 & (-14099)) + (i140 | (-14099));
                    int i142 = ~i139;
                    int i143 = ~((i142 & 23) | (i142 ^ 23));
                    int i144 = (i143 & i) | (i ^ i143);
                    int i145 = ~((i139 & (-24)) | (i139 ^ (-24)));
                    int i146 = ((i144 & i145) | (i144 ^ i145)) * 614;
                    int i147 = ~((i142 ^ i93) | (i142 & i93));
                    int i148 = (i147 ^ i143) | (i143 & i147);
                    int i149 = ~((i93 ^ 23) | (i93 & 23));
                    int i150 = (i142 ^ (-24)) | (i142 & (-24));
                    int i151 = ~((i150 ^ i93) | (i150 & i93));
                    int i152 = (i139 ^ i93) | (i139 & i93);
                    int i153 = ~((i152 ^ 23) | (i152 & 23));
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    g((char) ((39405 & i137) + (i137 | 39405)), ((i138 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) << 1) - (i138 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), ((((((i141 | i146) << 1) - (i146 ^ i141)) - (~(-(-(((i148 ^ i149) | (i148 & i149)) * (-1228)))))) - 1) - (~(((i153 & i151) | (i153 ^ i151)) * 614))) - 1, objArr28);
                    java.lang.String str28 = (java.lang.String) objArr28[0];
                    char c7 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int i154 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    g(c7, 285 - resolveOpacity2, ((i154 | 28) << 1) - (i154 ^ 28), objArr29);
                    java.lang.String str29 = (java.lang.String) objArr29[0];
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    g((char) android.view.KeyEvent.getDeadChar(0, 0), 314 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - (~(-(-android.view.View.resolveSizeAndState(0, 0, 0)))), objArr30);
                    strArr = new java.lang.String[]{str27, str28, str29, (java.lang.String) objArr30[0]};
                    i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            i11 = i;
                            str8 = str7;
                            i12 = i11;
                            break;
                        }
                        java.lang.Object[] objArr31 = {strArr[i10]};
                        java.lang.Object d15 = com.facetec.sdk.al.d(1873189073);
                        if (d15 == null) {
                            char c8 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6934);
                            int indexOf4 = android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            strArr14 = strArr;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            h(b13, b14, (byte) (b14 + 1), objArr32);
                            d15 = com.facetec.sdk.al.c(c8, 2388 - indexOf4, 24 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), -934682071, false, (java.lang.String) objArr32[0], new java.lang.Class[]{java.lang.String.class});
                        } else {
                            strArr14 = strArr;
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d15).invoke(null, objArr31)).longValue();
                        long j40 = -896778896;
                        i50 = i10;
                        str8 = str7;
                        long j41 = -502;
                        long j42 = longValue5 ^ j30;
                        long j43 = ((-501) * j40) + (503 * longValue5) + ((((j42 | j) ^ j30) | ((longValue5 | j40) ^ j30)) * j41) + (j41 * (((j42 | j33) | j40) ^ j30)) + (502 * (j42 | (((j40 ^ j30) | j) ^ j30))) + 1833858539;
                        int myUid = android.os.Process.myUid();
                        int i155 = ((int) (j43 >> 32)) & (((((~((-58702524) | myUid)) | (-1495928935)) * (-668)) - 293728094) + (((~((-1495928935) | myUid)) | (-58702524)) * 1336) + ((myUid | (-19533859)) * 668));
                        int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                        int i156 = ((int) j43) & ((((~(1434342271 | elapsedCpuTime)) | (~((~elapsedCpuTime) | (-2884139)))) * (-318)) + 1295806251 + (((~((-1080824368) | elapsedCpuTime)) | 1077940229) * (-318)) + (((~(elapsedCpuTime | 1080824367)) | 356402042) * 318));
                        if (((i155 ^ i156) | (i155 & i156)) != 0) {
                            int i157 = e;
                            int i158 = ((i157 | 85) << 1) - (i157 ^ 85);
                            f = i158 % 128;
                            int i159 = i158 % 2 == 0 ? i50 / 10955 : i50 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                            i11 = i;
                            i12 = (i159 & i93) | ((~i159) & i11);
                        } else {
                            i10 = ((i50 & 1) << 1) + (i50 ^ 1);
                            strArr = strArr14;
                            str7 = str8;
                        }
                    }
                    int i160 = i11 ^ i133;
                    int i161 = -i160;
                    int i162 = ((i160 ^ i161) | (i160 & i161)) >> 31;
                    int i163 = (i12 & (~i162)) | (i133 & i162);
                    java.lang.String str30 = str8;
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    g((char) (29249 - android.text.TextUtils.getOffsetAfter(str30, 0)), android.graphics.Color.blue(0) + 327, 12 - (~(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr33);
                    java.lang.Object[] objArr34 = {(java.lang.String) objArr33[0]};
                    d2 = com.facetec.sdk.al.d(1590238701);
                    if (d2 == null) {
                        char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                        int trimmedLength = android.text.TextUtils.getTrimmedLength(str30);
                        int axisFromString2 = android.view.MotionEvent.axisFromString(str30);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        h(b15, b16, b16, objArr35);
                        d2 = com.facetec.sdk.al.c(scrollBarSize, trimmedLength + 2078, 23 - axisFromString2, -114923755, false, (java.lang.String) objArr35[0], new java.lang.Class[]{java.lang.String.class});
                    }
                    str9 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr34);
                    if (str9 != null) {
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        g((char) android.view.Gravity.getAbsoluteGravity(0, 0), 339 - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, objArr36);
                        if (str9.contains((java.lang.String) objArr36[0])) {
                            i13 = (i11 & (-251)) | (i93 & 250);
                            int i164 = ((~i163) & i11) | (i163 & i93);
                            int i165 = -i164;
                            int i166 = ((i164 ^ i165) | (i164 & i165)) >> 31;
                            int i167 = i13 & (~i166);
                            int i168 = i163 & i166;
                            int i169 = (i168 ^ i167) | (i168 & i167);
                            int i170 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                            int i171 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            g((char) (((59411 | i170) << 1) - (i170 ^ 59411)), (i171 ^ 349) + ((i171 & 349) << 1), android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr37);
                            java.lang.String str31 = (java.lang.String) objArr37[0];
                            char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i172 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            g(maximumFlingVelocity, (i172 & 366) + (i172 | 366), 5 - (~(-android.graphics.Color.green(0))), objArr38);
                            java.lang.String str32 = (java.lang.String) objArr38[0];
                            file2 = new java.io.File(str31);
                            if (file2.exists()) {
                                int i173 = f + 109;
                                e = i173 % 128;
                                if (i173 % 2 != 0) {
                                    int i174 = 0 / 0;
                                }
                                try {
                                    java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                    char normalizeMetaState = (char) android.view.KeyEvent.normalizeMetaState(0);
                                    int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                    int i175 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    g(normalizeMetaState, 229 - normalizeMetaState2, (i175 & 2) + (i175 | 2), objArr39);
                                    java.util.Scanner useDelimiter2 = scanner2.useDelimiter((java.lang.String) objArr39[0]);
                                    next = useDelimiter2.hasNext() ? useDelimiter2.next() : str30;
                                    useDelimiter2.close();
                                } catch (java.io.IOException unused3) {
                                }
                                if (next.contains(str32)) {
                                    i14 = i11 ^ 251;
                                    int i176 = i11 ^ i169;
                                    int i177 = -i176;
                                    int i178 = ((i176 ^ i177) | (i176 & i177)) >> 31;
                                    int i179 = i14 & (~i178);
                                    int i180 = i169 & i178;
                                    int i181 = (i180 ^ i179) | (i180 & i179);
                                    char c9 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                    int i182 = -android.graphics.Color.rgb(0, 0, 0);
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    g(c9, ((-16776844) & i182) + (i182 | (-16776844)), 23 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr40);
                                    java.lang.Object[] objArr41 = {(java.lang.String) objArr40[0]};
                                    d3 = com.facetec.sdk.al.d(1590238701);
                                    if (d3 == null) {
                                        char keyCodeFromString = (char) android.view.KeyEvent.keyCodeFromString(str30);
                                        int normalizeMetaState3 = android.view.KeyEvent.normalizeMetaState(0);
                                        int axisFromString3 = android.view.MotionEvent.axisFromString(str30);
                                        byte b17 = (byte) 0;
                                        byte b18 = b17;
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        h(b17, b18, b18, objArr42);
                                        d3 = com.facetec.sdk.al.c(keyCodeFromString, normalizeMetaState3 + 2078, 23 - axisFromString3, -114923755, false, (java.lang.String) objArr42[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d3).invoke(null, objArr41)).toLowerCase();
                                    int i183 = -android.view.View.resolveSize(0, 0);
                                    int i184 = ~((i183 ^ 2569) | (i183 & 2569));
                                    int i185 = ~(i183 | i11);
                                    int i186 = ((786723 - (~(i183 * 306))) - (~(-(-(((i184 ^ i185) | (i184 & i185)) * 305))))) - 1;
                                    int i187 = ~(i183 | i93);
                                    int i188 = -(-(((i187 ^ (-2570)) | (i187 & (-2570))) * 305));
                                    char c10 = (char) (((i186 | i188) << 1) - (i188 ^ i186));
                                    int i189 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                    int i190 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                    objArr = new java.lang.Object[1];
                                    g(c10, (i189 ^ 396) + ((i189 & 396) << 1), ((i190 | 4) << 1) - (i190 ^ 4), objArr);
                                    if (lowerCase.contains((java.lang.String) objArr[0])) {
                                        int i191 = f;
                                        int i192 = (i191 ^ 43) + ((i191 & 43) << 1);
                                        e = i192 % 128;
                                        i15 = i192 % 2 != 0 ? i11 ^ 21438 : (i11 & (-265)) | (i93 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
                                    } else {
                                        i15 = i11;
                                    }
                                    int i193 = i11 ^ i181;
                                    int i194 = (i193 | (-i193)) >> 31;
                                    int i195 = i15 & (~i194);
                                    int i196 = i181 & i194;
                                    int i197 = (i196 ^ i195) | (i196 & i195);
                                    int i198 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i199 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int green = android.graphics.Color.green(0);
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    g((char) ((i198 ^ 1) + ((i198 & 1) << 1)), (i199 ^ 398) + ((i199 & 398) << 1), (green & 42) + (green | 42), objArr43);
                                    java.lang.String str33 = (java.lang.String) objArr43[0];
                                    char c11 = (char) (61820 - (~android.graphics.Color.alpha(0)));
                                    int i200 = -android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int i201 = -android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    g(c11, (i200 ^ 440) + ((i200 & 440) << 1), (i201 ^ 39) + ((i201 & 39) << 1), objArr44);
                                    java.lang.String str34 = (java.lang.String) objArr44[0];
                                    int i202 = -(-android.text.TextUtils.getCapsMode(str30, 0, 0));
                                    int i203 = -android.view.View.MeasureSpec.getMode(0);
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    g((char) ((i202 ^ 19667) + ((i202 & 19667) << 1)), (i203 & 481) + (i203 | 481), 25 - (~(-android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr45);
                                    java.lang.String str35 = (java.lang.String) objArr45[0];
                                    int indexOf5 = android.text.TextUtils.indexOf(str30, str30, 0, 0);
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    g((char) ((indexOf5 ^ 9236) + ((indexOf5 & 9236) << 1)), 508 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 26 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr46);
                                    java.lang.String str36 = (java.lang.String) objArr46[0];
                                    char c12 = (char) (26296 - (~android.view.View.getDefaultSize(0, 0)));
                                    int i204 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                    int alpha2 = android.graphics.Color.alpha(0);
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    g(c12, 533 - (~i204), (alpha2 ^ 27) + ((alpha2 & 27) << 1), objArr47);
                                    java.lang.String str37 = (java.lang.String) objArr47[0];
                                    char c13 = (char) (50243 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
                                    int i205 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    g(c13, (i205 & 562) + (i205 | 562), 27 - android.text.TextUtils.getTrimmedLength(str30), objArr48);
                                    strArr2 = new java.lang.String[]{str33, str34, str35, str36, str37, (java.lang.String) objArr48[0]};
                                    i16 = 6;
                                    i17 = 0;
                                    while (true) {
                                        if (i17 >= i16) {
                                            i18 = i11;
                                            break;
                                        }
                                        java.lang.Object[] objArr49 = {strArr2[i17]};
                                        java.lang.Object d16 = com.facetec.sdk.al.d(1590238701);
                                        if (d16 == null) {
                                            char indexOf6 = (char) android.text.TextUtils.indexOf(str30, str30, 0, 0);
                                            int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString(str30);
                                            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                            byte b19 = (byte) 0;
                                            byte b20 = b19;
                                            strArr13 = strArr2;
                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                            h(b19, b20, b20, objArr50);
                                            d16 = com.facetec.sdk.al.c(indexOf6, keyCodeFromString2 + 2078, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 23, -114923755, false, (java.lang.String) objArr50[0], new java.lang.Class[]{java.lang.String.class});
                                        } else {
                                            strArr13 = strArr2;
                                        }
                                        java.lang.String str38 = (java.lang.String) ((java.lang.reflect.Method) d16).invoke(null, objArr49);
                                        if (str38 != null && str38.length() != 0) {
                                            int i206 = e;
                                            f = ((i206 & 23) + (i206 | 23)) % 128;
                                            i18 = (i11 & (-266)) | (i93 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE);
                                            break;
                                        }
                                        int i207 = ((i17 | 59) << 1) - (i17 ^ 59);
                                        i17 = ((i207 | (-58)) << 1) - (i207 ^ (-58));
                                        strArr2 = strArr13;
                                        i16 = 6;
                                    }
                                    int i208 = (~(i11 & i197)) & (i11 | i197);
                                    int i209 = -i208;
                                    int i210 = ((i208 ^ i209) | (i208 & i209)) >> 31;
                                    int i211 = i18 & (~i210);
                                    int i212 = i197 & i210;
                                    int i213 = (i212 ^ i211) | (i212 & i211);
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    g((char) (android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 59412), 347 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 16 - (~(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))), objArr51);
                                    java.lang.String str39 = (java.lang.String) objArr51[0];
                                    char packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                                    int i214 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                    int i215 = -(-android.text.TextUtils.indexOf(str30, str30, 0));
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    g(packedPositionType, ((i214 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR) << 1) - (i214 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR), (i215 ^ 6) + ((i215 & 6) << 1), objArr52);
                                    java.lang.Object[] objArr53 = {str39, (java.lang.String) objArr52[0]};
                                    d4 = com.facetec.sdk.al.d(-100890377);
                                    if (d4 == null) {
                                        char c14 = (char) (23781 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                        int myPid2 = android.os.Process.myPid();
                                        int red2 = android.graphics.Color.red(0);
                                        byte b21 = (byte) 0;
                                        byte b22 = b21;
                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                        h(b21, b22, (byte) (b22 + 3), objArr54);
                                        d4 = com.facetec.sdk.al.c(c14, 1364 - (myPid2 >> 22), 24 - red2, 1578365455, false, (java.lang.String) objArr54[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                    }
                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr53)).longValue();
                                    long j44 = -301827732;
                                    int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                    long j45 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                                    long j46 = -520;
                                    long j47 = -1042;
                                    long j48 = freeMemory2;
                                    long j49 = j48 ^ j30;
                                    long j50 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                    long j51 = j44 ^ j30;
                                    long j52 = (((((j45 * j44) + (j46 * longValue6)) + ((j44 | ((j49 | longValue6) ^ j30)) * j47)) + ((longValue6 | j48) * j50)) + (((((j51 | (longValue6 ^ j30)) ^ j30) | ((j51 | j48) ^ j30)) | (((j49 | j44) | longValue6) ^ j30)) * j50)) - 1718236415;
                                    int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    int i216 = (~((-1231491374) | maxMemory)) | 138608685;
                                    i19 = ((int) (j52 >> 32)) & ((i216 * 992) + 1537498186 + ((i216 | (~((~maxMemory) | 1298617725))) * (-496)) + ((maxMemory | 205735037) * 496));
                                    int i217 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                                    int i218 = ~(112608238 | i217);
                                    i20 = ((int) j52) & ((((-1549834649) | i218) * 764) + 316485077 + (((~(i217 | (-1549834649))) | 69206408) * (-1528)) + (((-1524030071) | i218) * 764));
                                    if (((i20 ^ i19) | (i19 & i20)) != 0) {
                                        int i219 = f;
                                        int i220 = (i219 & 93) + (i219 | 93);
                                        e = i220 % 128;
                                        if (i220 % 2 != 0) {
                                            i22 = (~(i11 & 4446)) & (i11 | 4446);
                                            i49 = i93;
                                        } else {
                                            i49 = i93;
                                            i22 = (i11 & (-261)) | (i49 & com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
                                        }
                                        i21 = i49;
                                        j3 = j47;
                                        j2 = j50;
                                        j4 = j45;
                                    } else {
                                        char indexOf7 = (char) (android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
                                        int i221 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int i222 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        g(indexOf7, (i221 & 594) + (i221 | 594), ((i222 | 13) << 1) - (i222 ^ 13), objArr55);
                                        java.lang.String str40 = (java.lang.String) objArr55[0];
                                        char combineMeasuredStates2 = (char) android.view.View.combineMeasuredStates(0, 0);
                                        int i223 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int i224 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        j2 = j50;
                                        g(combineMeasuredStates2, ((i223 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO) << 1) - (i223 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO), ((i224 | 9) << 1) - (i224 ^ 9), objArr56);
                                        java.lang.Object[] objArr57 = {str40, (java.lang.String) objArr56[0]};
                                        java.lang.Object d17 = com.facetec.sdk.al.d(-100890377);
                                        if (d17 == null) {
                                            char keyRepeatTimeout = (char) (23780 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                                            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                                            byte b23 = (byte) 0;
                                            byte b24 = b23;
                                            j4 = j45;
                                            j3 = j47;
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            h(b23, b24, (byte) (b24 + 3), objArr58);
                                            d17 = com.facetec.sdk.al.c(keyRepeatTimeout, 1365 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), 25 - (elapsedRealtime2 > 0L ? 1 : (elapsedRealtime2 == 0L ? 0 : -1)), 1578365455, false, (java.lang.String) objArr58[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                        } else {
                                            j3 = j47;
                                            j4 = j45;
                                        }
                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d17).invoke(null, objArr57)).longValue();
                                        long j53 = -901671084;
                                        long j54 = -301;
                                        i21 = i93;
                                        long myUid2 = android.os.Process.myUid();
                                        long j55 = longValue7 ^ j30;
                                        long j56 = ((((((-300) * j53) + (302 * longValue7)) + ((((longValue7 | j53) | myUid2) ^ j30) * j54)) + (j54 * (((j55 | myUid2) ^ j30) | (((myUid2 ^ j30) | j53) ^ j30)))) + (301 * (((myUid2 | (j53 ^ j30)) ^ j30) | j55))) - 1118393063;
                                        int i225 = ~(i21 | 500549125);
                                        int i226 = ((int) (j56 >> 32)) & ((((134299648 | i225) * (-970)) - 215808328) + ((i225 | 366249477) * 970));
                                        int elapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                                        int i227 = ~elapsedRealtime3;
                                        int i228 = ((int) j56) & ((((~((-1552846873) | i227)) | 1304894013) * 226) + 2055568080 + (((~(i227 | (-268992513))) | (~((-1304894014) | elapsedRealtime3)) | 21039653) * (-113)) + ((~(elapsedRealtime3 | (-1552846873))) * 113));
                                        i22 = ((i226 ^ i228) | (i226 & i228)) != 0 ? (~(i11 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE)) & (i11 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE) : i11;
                                    }
                                    int i229 = ((~i213) & i11) | (i213 & i21);
                                    int i230 = -i229;
                                    int i231 = ((i229 ^ i230) | (i229 & i230)) >> 31;
                                    int i232 = i22 & (~i231);
                                    int i233 = i213 & i231;
                                    int i234 = (i232 ^ i233) | (i232 & i233);
                                    if ((i2 & 8) == 0) {
                                        char indexOf8 = (char) (android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                                        long zoomControlsTimeout2 = android.view.ViewConfiguration.getZoomControlsTimeout();
                                        int i235 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        g(indexOf8, 618 - (zoomControlsTimeout2 > 0L ? 1 : (zoomControlsTimeout2 == 0L ? 0 : -1)), (i235 ^ 42) + ((i235 & 42) << 1), objArr59);
                                        java.lang.String str41 = (java.lang.String) objArr59[0];
                                        char normalizeMetaState4 = (char) android.view.KeyEvent.normalizeMetaState(0);
                                        int i236 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        int i237 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        g(normalizeMetaState4, 660 - (~i236), (i237 & 41) + (i237 | 41), objArr60);
                                        java.lang.String str42 = (java.lang.String) objArr60[0];
                                        int i238 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        int i239 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                                        g((char) (((64593 | i238) << 1) - (i238 ^ 64593)), (i239 & androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_FROM) + (i239 | androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_FROM), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38, objArr61);
                                        java.lang.String[] strArr19 = {str41, str42, (java.lang.String) objArr61[0]};
                                        int i240 = 0;
                                        for (int i241 = 3; i240 < i241; i241 = 3) {
                                            int i242 = e + 67;
                                            f = i242 % 128;
                                            if (i242 % 2 == 0) {
                                                java.lang.Object[] objArr62 = {strArr19[i240]};
                                                java.lang.Object d18 = com.facetec.sdk.al.d(1873189073);
                                                if (d18 == null) {
                                                    char windowTouchSlop = (char) (6935 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                    int resolveOpacity3 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                    int argb = android.graphics.Color.argb(0, 0, 0, 0);
                                                    byte b25 = (byte) 0;
                                                    byte b26 = b25;
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    h(b25, b26, (byte) (b26 + 1), objArr63);
                                                    d18 = com.facetec.sdk.al.c(windowTouchSlop, 2389 - resolveOpacity3, argb + 23, -934682071, false, (java.lang.String) objArr63[0], new java.lang.Class[]{java.lang.String.class});
                                                }
                                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d18).invoke(null, objArr62)).longValue();
                                                long j57 = -1000221914;
                                                long j58 = 590;
                                                long j59 = longValue8 ^ j30;
                                                long j60 = ((j59 | j33) ^ j30) | ((j59 | j57) ^ j30) | ((j33 | j57) ^ j30);
                                                long j61 = j57 ^ j30;
                                                long j62 = ((-589) * j57) + (591 * longValue8) + ((j60 | (((j61 | longValue8) | j) ^ j30)) * j58) + ((-1180) * j60) + (j58 * (((j33 | longValue8) ^ j30) | ((j61 | j33) ^ j30))) + 1937301557;
                                                int i243 = ((int) (j62 >> 57)) & ((((((~((-1240544996) | r3)) | 162600643) * 1504) - 1320242614) + ((~(android.os.Process.myUid() | (-1077944353))) * (-1504))) - 1275729472);
                                                i23 = i;
                                                int i244 = ((int) j62) & ((((~(i21 | (-1953716539))) | (-904024348)) * (-865)) + 308419348 + ((~(1953716538 | i23)) * 865) + (((~(i21 | 1953716538)) | (~(i21 | (-904024348)))) * 865));
                                                if (((i243 ^ i244) | (i243 & i244)) != 0) {
                                                    int i245 = i240 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE;
                                                    i48 = ((~i245) & i23) | (i245 & i21);
                                                    break;
                                                }
                                                int i246 = (i240 & 126) + (i240 | 126);
                                                i240 = (i246 & (-125)) + (i246 | (-125));
                                                i11 = i23;
                                            } else {
                                                i23 = i11;
                                                java.lang.Object[] objArr64 = {strArr19[i240]};
                                                java.lang.Object d19 = com.facetec.sdk.al.d(1873189073);
                                                if (d19 == null) {
                                                    char argb2 = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 6935);
                                                    int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                                                    int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay();
                                                    byte b27 = (byte) 0;
                                                    byte b28 = b27;
                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                    h(b27, b28, (byte) (b28 + 1), objArr65);
                                                    d19 = com.facetec.sdk.al.c(argb2, 2389 - (scrollDefaultDelay >> 16), 23 - (scrollDefaultDelay2 >> 16), -934682071, false, (java.lang.String) objArr65[0], new java.lang.Class[]{java.lang.String.class});
                                                }
                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr64)).longValue();
                                                long j63 = -444767922;
                                                long j64 = -167;
                                                long j65 = longValue9 ^ j30;
                                                long j66 = (j64 * j63) + (j64 * longValue9) + (336 * ((((j63 ^ j30) | j65) ^ j30) | ((j65 | j) ^ j30))) + ((-168) * (((longValue9 | j63) ^ j30) | ((j63 | j) ^ j30))) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE * (j65 | ((j33 | j63) ^ j30))) + 1381847565;
                                                int i247 = ((int) (j66 >> 32)) & ((((~(i21 | (-1918267868))) | 844509273 | (~(2013231611 | i23))) * 717) + 883994834 + (((~((-1918267868) | i23)) | (~(i21 | 2013231611)) | 844509273) * 717));
                                                int myPid3 = android.os.Process.myPid();
                                                int i248 = ~myPid3;
                                                int i249 = ((int) j66) & ((((~((-269647974) | i248)) | (~(1706874383 | myPid3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 297025371 + (((~(myPid3 | (-1081350))) | (~(i248 | 1975441007))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                if (((i249 ^ i247) | (i247 & i249)) != 0) {
                                                    int i2452 = i240 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE;
                                                    i48 = ((~i2452) & i23) | (i2452 & i21);
                                                    break;
                                                }
                                                int i2462 = (i240 & 126) + (i240 | 126);
                                                i240 = (i2462 & (-125)) + (i2462 | (-125));
                                                i11 = i23;
                                            }
                                        }
                                        i23 = i11;
                                        i48 = i23;
                                        int i250 = ((~i234) & i23) | (i234 & i21);
                                        int i251 = -i250;
                                        int i252 = ((i250 ^ i251) | (i250 & i251)) >> 31;
                                        i234 = (i234 & i252) | (i48 & (~i252));
                                    } else {
                                        i23 = i11;
                                    }
                                    int i253 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                    int myPid4 = android.os.Process.myPid() >> 22;
                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                    g((char) ((36344 & i253) + (i253 | 36344)), (scrollBarFadeDuration & 739) + (scrollBarFadeDuration | 739), (myPid4 & 41) + (myPid4 | 41), objArr66);
                                    java.lang.String str43 = (java.lang.String) objArr66[0];
                                    int i254 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int i255 = i254 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                                    int i256 = ((-5237615) & i255) + (i255 | (-5237615)) + ((~((i254 ^ i23) | (i254 & i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                                    int i257 = (i254 ^ (-24362)) | (i254 & (-24362));
                                    int i258 = -(-(((i257 ^ i21) | (i257 & i21)) * (-216)));
                                    int i259 = ((i256 | i258) << 1) - (i258 ^ i256);
                                    int i260 = -(-(((~(i254 | i21)) | 24361) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                                    char c15 = (char) ((i259 ^ i260) + ((i260 & i259) << 1));
                                    int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int i261 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                    g(c15, 780 - makeMeasureSpec2, (i261 ^ 30) + ((i261 & 30) << 1), objArr67);
                                    strArr3 = new java.lang.String[]{str43, (java.lang.String) objArr67[0]};
                                    i24 = 2;
                                    i25 = 0;
                                    while (true) {
                                        if (i25 >= i24) {
                                            i26 = i23;
                                            int i262 = f;
                                            e = ((i262 & 71) + (i262 | 71)) % 128;
                                            i27 = i26;
                                            break;
                                        }
                                        java.lang.Object[] objArr68 = {strArr3[i25]};
                                        java.lang.Object d20 = com.facetec.sdk.al.d(1450487247);
                                        if (d20 == null) {
                                            char modifierMetaStateMask3 = (char) (6934 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                            int red3 = android.graphics.Color.red(0);
                                            float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                                            byte b29 = (byte) 0;
                                            byte b30 = b29;
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            h(b29, b30, (byte) (b30 + 3), objArr69);
                                            d20 = com.facetec.sdk.al.c(modifierMetaStateMask3, red3 + 2389, 24 - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), -241445065, false, (java.lang.String) objArr69[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d20).invoke(null, objArr68)).longValue();
                                        long j67 = 1651762985;
                                        strArr12 = strArr3;
                                        long j68 = 52;
                                        i45 = i25;
                                        long nextInt = new java.util.Random().nextInt(1770607745) ^ j30;
                                        long j69 = nextInt | j67;
                                        long j70 = longValue10 ^ j30;
                                        long j71 = j67 ^ j30;
                                        long j72 = ((-51) * j67) + (53 * longValue10) + (((j69 | longValue10) ^ j30) * j68) + ((-52) * (((j70 | j67) ^ j30) | ((j70 | nextInt) ^ j30) | (j69 ^ j30))) + (j68 * (((j71 | longValue10) ^ j30) | ((nextInt | j71) ^ j30))) + 199413656;
                                        int i263 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                        int i264 = ~i263;
                                        int i265 = ~(142100105 | i264);
                                        int i266 = ((int) (j72 >> 32)) & ((((~(i264 | (-142100106))) | (~((-1295126306) | i264)) | 137364993 | (~(1299861417 | i263))) * (-84)) + 1905160562 + (((~(i263 | (-142100106))) | 1295126305 | i265) * (-84)) + (((-1299861418) | i265) * 84));
                                        i26 = i;
                                        int i267 = ((int) j72) & (((i21 | 335544592) * (-192)) + 1788176917 + (((~(i21 | 1959561564)) | 186790562) * (-384)) + (((~((-186790563) | i26)) | (~(i21 | 2146352126)) | (~((-1624016973) | i26))) * 192));
                                        if (((i266 ^ i267) | (i266 & i267)) != 0) {
                                            int i268 = e;
                                            int i269 = (i268 ^ 51) + ((i268 & 51) << 1);
                                            f = i269 % 128;
                                            if (i269 % 2 == 0) {
                                                int i270 = i45 / 14260;
                                                i46 = ~(i26 & i270);
                                                i47 = i270 | i26;
                                            } else {
                                                int i271 = (i45 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE) + ((i45 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE) << 1);
                                                i46 = i271 | i26;
                                                i47 = ~(i271 & i26);
                                            }
                                            i27 = i46 & i47;
                                        } else {
                                            int i272 = (i45 ^ (-70)) + ((i45 & (-70)) << 1);
                                            i25 = ((i272 | 71) << 1) - (i272 ^ 71);
                                            strArr3 = strArr12;
                                            i23 = i26;
                                            i24 = 2;
                                        }
                                    }
                                    int i273 = ((~i234) & i26) | (i234 & i21);
                                    int i274 = -i273;
                                    int i275 = ((i273 ^ i274) | (i273 & i274)) >> 31;
                                    int i276 = i27 & (~i275);
                                    int i277 = i234 & i275;
                                    int i278 = (i277 ^ i276) | (i277 & i276);
                                    d5 = com.facetec.sdk.al.d(-1270134912);
                                    if (d5 == null) {
                                        char c16 = (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45150);
                                        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                                        int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity();
                                        byte b31 = (byte) 0;
                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                        h(b31, b31, (byte) $$a.length, objArr70);
                                        d5 = com.facetec.sdk.al.c(c16, 2150 - (keyRepeatDelay >> 16), 24 - (minimumFlingVelocity2 >> 16), 329530744, false, (java.lang.String) objArr70[0], new java.lang.Class[0]);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
                                    long j73 = -1272221696;
                                    int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    long j74 = -183;
                                    long j75 = 185;
                                    long j76 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                    long j77 = j73 ^ j30;
                                    long j78 = maxMemory2;
                                    long j79 = j78 ^ j30;
                                    long j80 = -184;
                                    long j81 = (((((j74 * j73) + (j75 * longValue11)) + ((((j77 | longValue11) ^ j30) | ((j79 | longValue11) ^ j30)) * j76)) + ((j78 | (((longValue11 ^ j30) | j73) ^ j30)) * j80)) + (((j77 | j79) ^ j30) * j76)) - 552700797;
                                    int elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
                                    int i279 = ~(2020424372 | elapsedCpuTime2);
                                    i28 = ((int) (j81 >> 32)) & (((((~(elapsedCpuTime2 | 583197961)) | ((~((-2020424373) | elapsedCpuTime2)) | 1479350964)) * (-880)) - 818885110) + (((~((~elapsedCpuTime2) | (-2020424373))) | (-583197962) | i279) * (-880)) + (i279 * 880));
                                    int myUid3 = android.os.Process.myUid();
                                    int i280 = ~myUid3;
                                    i29 = ((int) j81) & ((((~(1505216840 | myUid3)) | (-1572862943) | (~(67990430 | myUid3))) * (-754)) + 2070432247 + (((~(myUid3 | 1572862942)) | (~((-1504872513) | i280))) * (-754)) + ((1505216840 | i280) * 754));
                                    if (((i29 ^ i28) | (i28 & i29)) != 1) {
                                        int i281 = e;
                                        int i282 = ((i281 | 105) << 1) - (i281 ^ 105);
                                        f = i282 % 128;
                                        if (i282 % 2 == 0) {
                                            java.lang.Object[] objArr71 = {0};
                                            java.lang.Object d21 = com.facetec.sdk.al.d(-1836228463);
                                            if (d21 == null) {
                                                char scrollBarSize2 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                int resolveSize = android.view.View.resolveSize(0, 0);
                                                float minVolume = android.media.AudioTrack.getMinVolume();
                                                byte b32 = (byte) 0;
                                                byte b33 = b32;
                                                j6 = j75;
                                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                h(b32, b33, (byte) (b33 + 1), objArr72);
                                                d21 = com.facetec.sdk.al.c(scrollBarSize2, 455 - resolveSize, 24 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 895621737, false, (java.lang.String) objArr72[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                            } else {
                                                j6 = j75;
                                            }
                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d21).invoke(null, objArr71)).longValue();
                                            long j82 = 482110584;
                                            j7 = j74;
                                            j5 = j80;
                                            long elapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
                                            long j83 = j82 ^ j30;
                                            i31 = i278;
                                            long j84 = 381;
                                            long j85 = ((((((-380) * j82) + (382 * longValue12)) + ((-381) * ((longValue12 | elapsedRealtime4) | j83))) + (((((j83 | (longValue12 ^ j30)) ^ j30) | (((elapsedRealtime4 ^ j30) | longValue12) ^ j30)) | ((j82 | longValue12) ^ j30)) * j84)) + (j84 * ((j83 | longValue12) ^ j30))) - 1852638189;
                                            int myPid5 = android.os.Process.myPid();
                                            int i283 = ((int) (j85 >> 14)) & ((((~((-10538009) | myPid5)) | 1447764419) * (-756)) + 107266906 + (((~myPid5) | (-10538009)) * 756));
                                            int myTid3 = android.os.Process.myTid();
                                            int i284 = ((int) j85) & (((((~((-904394414) | myTid3)) | 532831996) * (-668)) - 602611055) + (((~(532831996 | myTid3)) | (-904394414)) * 1336) + ((myTid3 | (-539336706)) * 668));
                                        } else {
                                            i31 = i278;
                                            j5 = j80;
                                            j6 = j75;
                                            j7 = j74;
                                            java.lang.Object[] objArr73 = {1};
                                            java.lang.Object d22 = com.facetec.sdk.al.d(-1836228463);
                                            if (d22 == null) {
                                                char pressedStateDuration = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                int minimumFlingVelocity3 = android.view.ViewConfiguration.getMinimumFlingVelocity();
                                                int myPid6 = android.os.Process.myPid();
                                                byte b34 = (byte) 0;
                                                byte b35 = b34;
                                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                h(b34, b35, (byte) (b35 + 1), objArr74);
                                                d22 = com.facetec.sdk.al.c(pressedStateDuration, 455 - (minimumFlingVelocity3 >> 16), 24 - (myPid6 >> 22), 895621737, false, (java.lang.String) objArr74[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                                            }
                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr73)).longValue();
                                            long j86 = 215722201;
                                            long j87 = -964;
                                            long j88 = longValue13 ^ j30;
                                            long elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
                                            long j89 = ((((((-963) * j86) + j87) + (965 * longValue13)) + (((j86 ^ j30) | ((j88 | elapsedCpuTime3) ^ j30)) * j87)) + (j87 * ((((elapsedCpuTime3 ^ j30) | j88) ^ j30) | ((j88 | j86) ^ j30)))) - 1586249806;
                                            int myTid4 = android.os.Process.myTid();
                                            int i285 = ((int) (j89 >> 32)) & ((((~((~myTid4) | (-276955158))) * (-116)) - 2072279902) + ((1849523648 | myTid4) * 116) + (((~(myTid4 | 412297237)) | 1714181568) * 116));
                                            int i286 = ((int) j89) & ((((i21 | 1369714863) * (-757)) - 804460558) + ((~((-135350529) | i26)) * 1514) + (((~(i21 | (-1488026023))) | 1352675494 | (~(1505065391 | i26))) * 757));
                                        }
                                        int i287 = (~(i26 & i31)) & (i26 | i31);
                                        int i288 = -i287;
                                        int i289 = ((i287 ^ i288) | (i287 & i288)) >> 31;
                                        int i290 = (i33 & (~i289)) | (i31 & i289);
                                        char indexOf9 = (char) android.text.TextUtils.indexOf(str30, str30, 0, 0);
                                        int scrollBarSize3 = android.view.ViewConfiguration.getScrollBarSize();
                                        int threadPriority = android.os.Process.getThreadPriority(0);
                                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                                        g(indexOf9, 372 - (scrollBarSize3 >> 8), 22 - (~(-(((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6))), objArr75);
                                        java.lang.Object[] objArr76 = {(java.lang.String) objArr75[0]};
                                        java.lang.Object d23 = com.facetec.sdk.al.d(1590238701);
                                        if (d23 == null) {
                                            char lastIndexOf2 = (char) ((-1) - android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                                            int defaultSize2 = android.view.View.getDefaultSize(0, 0);
                                            int offsetAfter = android.text.TextUtils.getOffsetAfter(str30, 0);
                                            byte b36 = (byte) 0;
                                            byte b37 = b36;
                                            java.lang.Object[] objArr77 = new java.lang.Object[1];
                                            h(b36, b37, b37, objArr77);
                                            d23 = com.facetec.sdk.al.c(lastIndexOf2, 2078 - defaultSize2, 24 - offsetAfter, -114923755, false, (java.lang.String) objArr77[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        java.lang.Object invoke2 = ((java.lang.reflect.Method) d23).invoke(null, objArr76);
                                        try {
                                            if (invoke2 != null) {
                                                java.lang.Object[] objArr78 = {invoke2, 42};
                                                java.lang.Object d24 = com.facetec.sdk.al.d(-582857820);
                                                if (d24 == null) {
                                                    char mirror = (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
                                                    int packedPositionGroup2 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    byte b38 = (byte) 0;
                                                    byte b39 = b38;
                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                    h(b38, b39, (byte) (b39 + 1), objArr79);
                                                    d24 = com.facetec.sdk.al.c(mirror, (jumpTapTimeout >> 16) + 2365, packedPositionGroup2 + 24, 2058170716, false, (java.lang.String) objArr79[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                }
                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) d24).invoke(null, objArr78)).longValue();
                                                long j90 = -126649933;
                                                long j91 = -159;
                                                long j92 = 160;
                                                long j93 = (j91 * j90) + (j91 * longValue14) + (((j90 ^ j30) | longValue14) * j92) + ((-160) * (((j33 | j90) ^ j30) | ((j90 | longValue14) ^ j30))) + (j92 * ((((longValue14 ^ j30) | j33) ^ j30) | j90)) + 1285847331;
                                                int myPid7 = android.os.Process.myPid();
                                                int i291 = ~((-1659494919) | myPid7);
                                                if (((((int) j93) & ((((~(1659494918 | myPid7)) | 219548760 | (~((-222268509) | myPid7))) * (-880)) + 818884229 + (((~((~myPid7) | 1659494918)) | 222268508 | i291) * (-880)) + (i291 * 880))) | (((int) (j93 >> 32)) & (((((~(2135916474 | i26)) | (~((-71832609) | i32))) * 497) - 593294187) + (((~(793657018 | i32)) | 1342259456 | (~((-71832609) | i26))) * 497)))) == 1986687685) {
                                                    str10 = str30;
                                                    strArr5 = null;
                                                    i30 = i26;
                                                    j8 = j46;
                                                    j9 = j76;
                                                    j10 = j6;
                                                    j11 = j7;
                                                    j13 = j30;
                                                    j12 = j4;
                                                    char tapTimeout = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                                    int trimmedLength2 = android.text.TextUtils.getTrimmedLength(str10);
                                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                    g(tapTimeout, (trimmedLength2 ^ 891) + ((trimmedLength2 & 891) << 1), 15 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr80);
                                                    java.lang.Object[] objArr81 = {(java.lang.String) objArr80[0]};
                                                    d6 = com.facetec.sdk.al.d(1590238701);
                                                    if (d6 != null) {
                                                        char c17 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                                                        java.lang.String str44 = str10;
                                                        int indexOf10 = android.text.TextUtils.indexOf(str44, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                        int axisFromString4 = android.view.MotionEvent.axisFromString(str44);
                                                        byte b40 = (byte) 0;
                                                        byte b41 = b40;
                                                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                        h(b40, b41, b41, objArr82);
                                                        str13 = str44;
                                                        d6 = com.facetec.sdk.al.c(c17, indexOf10 + 2079, axisFromString4 + 25, -114923755, false, (java.lang.String) objArr82[0], new java.lang.Class[]{java.lang.String.class});
                                                    } else {
                                                        str13 = str10;
                                                    }
                                                    invoke = ((java.lang.reflect.Method) d6).invoke(null, objArr81);
                                                    if (invoke != null) {
                                                        i36 = 0;
                                                    } else {
                                                        java.lang.Object[] objArr83 = {invoke, 42};
                                                        java.lang.Object d25 = com.facetec.sdk.al.d(-582857820);
                                                        if (d25 == null) {
                                                            char c18 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                                                            int rgb = android.graphics.Color.rgb(0, 0, 0);
                                                            byte b42 = (byte) 0;
                                                            byte b43 = b42;
                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                            h(b42, b43, (byte) (b43 + 1), objArr84);
                                                            d25 = com.facetec.sdk.al.c(c18, (maxKeyCode >> 16) + 2365, rgb + 16777240, 2058170716, false, (java.lang.String) objArr84[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                        }
                                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) d25).invoke(null, objArr83)).longValue();
                                                        long j94 = -805953300;
                                                        long j95 = j94 ^ j13;
                                                        long j96 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                        long j97 = j96 ^ j13;
                                                        long j98 = (j11 * j94) + (j10 * longValue15) + ((((j95 | longValue15) ^ j13) | ((j97 | longValue15) ^ j13)) * j9) + (((((longValue15 ^ j13) | j94) ^ j13) | j96) * j5) + (((j95 | j97) ^ j13) * j9) + 1965150698;
                                                        int i292 = ~((-211656517) | i30);
                                                        int i293 = ((int) (j98 >> 32)) & (((76613888 | i292) * (-280)) + 1223274258 + ((i292 | (~((-1225569895) | i30))) * 140) + (((~((-135042629) | i30)) | (~((-76613889) | i32)) | (~((-1090527267) | i32))) * 140));
                                                        int nextInt2 = new java.util.Random().nextInt();
                                                        int i294 = ~nextInt2;
                                                        int i295 = ((int) j98) & ((((959347132 | nextInt2) * (-50)) - 1144917205) + (((~(nextInt2 | (-824586393))) | (~((-1073807362) | i294))) * 50) + (((~(959347132 | i294)) | (~(i294 | (-1898393754))) | 1073807361) * 50));
                                                        i36 = (i295 ^ i293) | (i293 & i295);
                                                    }
                                                    if (i36 != 1986687685 || i36 == -1514516938) {
                                                        str14 = str13;
                                                        strArr9 = strArr5;
                                                        i37 = i290;
                                                    } else {
                                                        e = (f + 95) % 128;
                                                        char doubleTapTimeout2 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                        int i296 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                        int i297 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                        g(doubleTapTimeout2, (i296 & 1610) + (i296 | 1610), ((i297 | 13) << 1) - (i297 ^ 13), objArr85);
                                                        java.lang.String str45 = (java.lang.String) objArr85[0];
                                                        char c19 = (char) ((-2) - (~(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                        int i298 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int i299 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                        g(c19, ((i298 | 1624) << 1) - (i298 ^ 1624), (i299 & 26) + (i299 | 26), objArr86);
                                                        java.lang.String str46 = (java.lang.String) objArr86[0];
                                                        char packedPositionType2 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                                                        int i300 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                                                        int d26 = com.facetec.sdk.mt.c.d();
                                                        int i301 = ~i300;
                                                        int i302 = ~d26;
                                                        int i303 = ~((i301 ^ i302) | (i301 & i302));
                                                        int i304 = ((i300 * 866) - 1424736) + (((i303 ^ (-1650)) | (i303 & (-1650))) * (-865));
                                                        int i305 = (~((d26 & i300) | (i300 ^ d26))) * 865;
                                                        int i306 = (i304 & i305) + (i305 | i304);
                                                        int i307 = ~((i302 ^ (-1650)) | (i302 & (-1650)));
                                                        int i308 = ~((i300 ^ i302) | (i300 & i302));
                                                        int i309 = ((i308 ^ i307) | (i308 & i307)) * 865;
                                                        int i310 = -(-android.text.TextUtils.indexOf(str13, str13, 0, 0));
                                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                        g(packedPositionType2, ((i306 | i309) << 1) - (i309 ^ i306), (i310 ^ 17) + ((i310 & 17) << 1), objArr87);
                                                        java.lang.String str47 = (java.lang.String) objArr87[0];
                                                        int i311 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int i312 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                        int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                                                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                        g((char) ((i311 & 32293) + (i311 | 32293)), (i312 & 1666) + (i312 | 1666), ((jumpTapTimeout2 | 17) << 1) - (jumpTapTimeout2 ^ 17), objArr88);
                                                        java.lang.String str48 = (java.lang.String) objArr88[0];
                                                        int i313 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                        int i314 = -android.text.TextUtils.getOffsetBefore(str13, 0);
                                                        int i315 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                        g((char) ((46554 & i313) + (i313 | 46554)), (i314 ^ 1684) + ((i314 & 1684) << 1), ((i315 | 15) << 1) - (i315 ^ 15), objArr89);
                                                        java.lang.String str49 = (java.lang.String) objArr89[0];
                                                        char c20 = (char) ((-2) - (~(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                                        int i316 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                        g(c20, (i316 ^ 1699) + ((i316 & 1699) << 1), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, objArr90);
                                                        java.lang.String str50 = (java.lang.String) objArr90[0];
                                                        char alpha3 = (char) android.graphics.Color.alpha(0);
                                                        int i317 = -android.view.View.MeasureSpec.getSize(0);
                                                        int i318 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                        g(alpha3, ((i317 | 1736) << 1) - (i317 ^ 1736), (i318 & 12) + (i318 | 12), objArr91);
                                                        java.lang.String str51 = (java.lang.String) objArr91[0];
                                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                        g((char) android.view.Gravity.getAbsoluteGravity(0, 0), 1748 - (~(-(-android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), 12 - (~(-(-android.view.View.getDefaultSize(0, 0)))), objArr92);
                                                        java.lang.String str52 = (java.lang.String) objArr92[0];
                                                        char offsetBefore = (char) (android.text.TextUtils.getOffsetBefore(str13, 0) + 9799);
                                                        int i319 = -(-android.text.TextUtils.getTrimmedLength(str13));
                                                        int i320 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                        g(offsetBefore, (i319 ^ 1761) + ((i319 & 1761) << 1), ((i320 | 22) << 1) - (i320 ^ 22), objArr93);
                                                        java.lang.String str53 = (java.lang.String) objArr93[0];
                                                        int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout() >> 16;
                                                        int i321 = -android.text.TextUtils.indexOf(str13, str13, 0, 0);
                                                        int i322 = i321 * (-563);
                                                        int i323 = ~i321;
                                                        int i324 = (~((i32 ^ (-1784)) | (i32 & (-1784)))) | i323;
                                                        int i325 = ~((i30 ^ 1783) | (i30 & 1783));
                                                        int i326 = i323 | 1783;
                                                        int i327 = (((((1007395 | i322) << 1) - (i322 ^ 1007395)) - (~(((i324 & i325) | (i324 ^ i325)) * (-564)))) - 1) + ((~((i326 & i30) | (i326 ^ i30))) * 1128);
                                                        int i328 = -(-(((~((i321 ^ 1783) | (i321 & 1783))) | (~(i323 | i32))) * 564));
                                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                        g((char) (((52947 | tapTimeout2) << 1) - (tapTimeout2 ^ 52947)), ((i327 | i328) << 1) - (i328 ^ i327), 30 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8))), objArr94);
                                                        java.lang.String str54 = (java.lang.String) objArr94[0];
                                                        char mode = (char) android.view.View.MeasureSpec.getMode(0);
                                                        int i329 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                        g(mode, ((i329 | 1814) << 1) - (i329 ^ 1814), 10 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr95);
                                                        java.lang.String str55 = (java.lang.String) objArr95[0];
                                                        int i330 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                        int d27 = com.facetec.sdk.mt.c.d();
                                                        int i331 = ~((i330 ^ d27) | (i330 & d27));
                                                        int i332 = ((i330 * 673) - 49296158) + (((i331 ^ 36706) | (36706 & i331)) * 672);
                                                        int i333 = ~i330;
                                                        int i334 = ~d27;
                                                        int i335 = ~((i333 ^ i334) | (i333 & i334));
                                                        int i336 = ~((d27 ^ 36706) | (36706 & d27));
                                                        int i337 = -(-(((i336 ^ i335) | (i336 & i335)) * (-672)));
                                                        int i338 = ((i332 | i337) << 1) - (i337 ^ i332);
                                                        int i339 = ((~(i330 | (-36707))) | (~(((-36707) ^ i334) | ((-36707) & i334)))) * 672;
                                                        char c21 = (char) (((i338 | i339) << 1) - (i339 ^ i338));
                                                        int i340 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                        int i341 = -(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                        g(c21, 1825 - (~i340), (i341 ^ 11) + ((i341 & 11) << 1), objArr96);
                                                        java.lang.String str56 = (java.lang.String) objArr96[0];
                                                        char c22 = (char) ((-2) - (~(-android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))));
                                                        int i342 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        int minimumFlingVelocity4 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                        int d28 = com.facetec.sdk.mt.c.d();
                                                        int i343 = minimumFlingVelocity4 * 677;
                                                        int i344 = (((i343 | (-8100)) << 1) - (i343 ^ (-8100))) + (((minimumFlingVelocity4 ^ d28) | (minimumFlingVelocity4 & d28) | (-13)) * (-676));
                                                        int i345 = ~((minimumFlingVelocity4 ^ (-13)) | (minimumFlingVelocity4 & (-13)));
                                                        int i346 = ~d28;
                                                        int i347 = ~((i346 & minimumFlingVelocity4) | (i346 ^ minimumFlingVelocity4));
                                                        int i348 = ((i345 ^ i347) | (i345 & i347)) * 676;
                                                        int i349 = ~minimumFlingVelocity4;
                                                        int i350 = ~((i349 ^ (-13)) | (i349 & (-13)));
                                                        int i351 = ~((i346 ^ (-13)) | (i346 & (-13)));
                                                        int i352 = (minimumFlingVelocity4 ^ 12) | (minimumFlingVelocity4 & 12);
                                                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                        strArr9 = strArr5;
                                                        g(c22, ((i342 | 1839) << 1) - (i342 ^ 1839), (((i344 | i348) << 1) - (i348 ^ i344)) + (((~((i352 ^ d28) | (i352 & d28))) | (i350 & i351) | (i350 ^ i351)) * 676), objArr97);
                                                        java.lang.String str57 = (java.lang.String) objArr97[0];
                                                        char argb3 = (char) android.graphics.Color.argb(0, 0, 0, 0);
                                                        int i353 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int resolveOpacity4 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                        g(argb3, ((i353 | 1850) << 1) - (i353 ^ 1850), ((resolveOpacity4 | 12) << 1) - (resolveOpacity4 ^ 12), objArr98);
                                                        java.lang.String str58 = (java.lang.String) objArr98[0];
                                                        char trimmedLength3 = (char) (android.text.TextUtils.getTrimmedLength(str13) + 29964);
                                                        int i354 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                        int i355 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                        g(trimmedLength3, ((i354 | 1861) << 1) - (i354 ^ 1861), (i355 ^ 13) + ((i355 & 13) << 1), objArr99);
                                                        java.lang.String str59 = (java.lang.String) objArr99[0];
                                                        int i356 = -android.view.View.MeasureSpec.getMode(0);
                                                        int i357 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                        g((char) ((i356 & 2793) + (i356 | 2793)), (i357 ^ 1873) + ((i357 & 1873) << 1), 14 - (~(-(-android.text.TextUtils.indexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))), objArr100);
                                                        java.lang.String str60 = (java.lang.String) objArr100[0];
                                                        int i358 = -android.text.TextUtils.indexOf(str13, str13);
                                                        int i359 = -(-android.view.View.resolveSize(0, 0));
                                                        int i360 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                        g((char) ((36620 & i358) + (i358 | 36620)), 1887 - (~i359), (i360 ^ 13) + ((i360 & 13) << 1), objArr101);
                                                        java.lang.String str61 = (java.lang.String) objArr101[0];
                                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                        g((char) android.view.View.MeasureSpec.getMode(0), 1900 - android.text.TextUtils.getCapsMode(str13, 0, 0), 24 - android.view.View.getDefaultSize(0, 0), objArr102);
                                                        java.lang.String str62 = (java.lang.String) objArr102[0];
                                                        char c23 = (char) (12125 - (~(-(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))));
                                                        long zoomControlsTimeout3 = android.view.ViewConfiguration.getZoomControlsTimeout();
                                                        int i361 = -(-android.view.View.resolveSize(0, 0));
                                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                        g(c23, 1925 - (zoomControlsTimeout3 > 0L ? 1 : (zoomControlsTimeout3 == 0L ? 0 : -1)), (i361 & 28) + (i361 | 28), objArr103);
                                                        java.lang.String[] strArr20 = {str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, (java.lang.String) objArr103[0]};
                                                        f = (e + 69) % 128;
                                                        int i362 = 0;
                                                        while (i362 < 19) {
                                                            java.lang.String str63 = strArr20[i362];
                                                            java.lang.Object[] objArr104 = {str63};
                                                            java.lang.Object d29 = com.facetec.sdk.al.d(1873189073);
                                                            if (d29 == null) {
                                                                char gidForName = (char) (android.os.Process.getGidForName(str13) + 6936);
                                                                int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout();
                                                                int myPid8 = android.os.Process.myPid();
                                                                byte b44 = (byte) 0;
                                                                byte b45 = b44;
                                                                strArr11 = strArr20;
                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                h(b44, b45, (byte) (b45 + 1), objArr105);
                                                                d29 = com.facetec.sdk.al.c(gidForName, 2389 - (longPressTimeout2 >> 16), (myPid8 >> 22) + 23, -934682071, false, (java.lang.String) objArr105[0], new java.lang.Class[]{java.lang.String.class});
                                                            } else {
                                                                strArr11 = strArr20;
                                                            }
                                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) d29).invoke(null, objArr104)).longValue();
                                                            long j99 = -634244453;
                                                            int i363 = i362;
                                                            long j100 = longValue16 ^ j13;
                                                            i43 = i290;
                                                            java.lang.String str64 = str13;
                                                            long j101 = 676;
                                                            long j102 = (677 * j99) + ((-675) * longValue16) + ((-676) * (j99 | j | j100)) + ((((j100 | j99) ^ j13) | ((j33 | j99) ^ j13)) * j101) + (j101 * ((((j99 ^ j13) | j100) ^ j13) | ((j100 | j33) ^ j13) | (((longValue16 | j99) | j) ^ j13))) + 1571324096;
                                                            int i364 = ((int) (j102 >> 32)) & ((((~((-745567270) | i32)) | (-2112173616)) * (-328)) + 652085058 + (((-2112173616) | i30) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(745567269 | i30)) | (-2113238576) | (~((-744502310) | i32))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                                                            int i365 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                            int i366 = ((int) j102) & ((((1091571973 | r6) * (-476)) - 1602468895) + ((~((-131217) | i365)) * 952) + ((~((~i365) | (-131217))) * 476));
                                                            if (((i364 ^ i366) | (i364 & i366)) != 0) {
                                                                str14 = str64;
                                                            } else {
                                                                char maximumFlingVelocity2 = (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2793);
                                                                str14 = str64;
                                                                int i367 = -(-android.text.TextUtils.lastIndexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                                int doubleTapTimeout3 = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                g(maximumFlingVelocity2, 1874 - (~i367), (doubleTapTimeout3 ^ 14) + ((doubleTapTimeout3 & 14) << 1), objArr106);
                                                                if (str63.equals((java.lang.String) objArr106[0])) {
                                                                    java.lang.Object[] objArr107 = {str63};
                                                                    java.lang.Object d30 = com.facetec.sdk.al.d(1873189073);
                                                                    if (d30 == null) {
                                                                        char lastIndexOf3 = (char) (android.text.TextUtils.lastIndexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6936);
                                                                        float length = android.graphics.PointF.length(0.0f, 0.0f);
                                                                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                                                                        byte b46 = (byte) 0;
                                                                        byte b47 = b46;
                                                                        java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                        h(b46, b47, (byte) (b47 + 1), objArr108);
                                                                        d30 = com.facetec.sdk.al.c(lastIndexOf3, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 2389, 23 - (fadingEdgeLength >> 16), -934682071, false, (java.lang.String) objArr108[0], new java.lang.Class[]{java.lang.String.class});
                                                                    }
                                                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) d30).invoke(null, objArr107)).longValue();
                                                                    long j103 = -1116953432;
                                                                    long nextInt3 = new java.util.Random().nextInt(1112295136);
                                                                    long j104 = nextInt3 ^ j13;
                                                                    long j105 = j103 ^ j13;
                                                                    long j106 = (j12 * j103) + (j8 * longValue17) + ((j103 | ((j104 | longValue17) ^ j13)) * j3) + ((longValue17 | nextInt3) * j2) + (((((longValue17 ^ j13) | j105) ^ j13) | ((nextInt3 | j105) ^ j13) | (((j103 | j104) | longValue17) ^ j13)) * j2) + 2054033075;
                                                                    int myPid9 = android.os.Process.myPid();
                                                                    int i368 = ~myPid9;
                                                                    int i369 = ((int) (j106 >> 32)) & ((((~(1344687165 | i368)) | (-1513053720)) * (-90)) + 1687905420 + (((~(1344687165 | myPid9)) | 1344687125) * (-45)) + (((~(myPid9 | 1513053719)) | 1344687165 | (~(i368 | (-1513053720)))) * 45));
                                                                    int i370 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                                    int i371 = ~i370;
                                                                    int i372 = ~((-1547041837) | i370);
                                                                    int i373 = ((int) j106) & ((((~(i370 | 109815426)) | (~((-42599043) | i371))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 1135091149 + (((~((-109815427) | i371)) | i372) * (-1040)) + (((~(i371 | 1547041836)) | 67216384 | i372) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                                                                    if (((i369 ^ i373) | (i369 & i373)) != 0) {
                                                                        int i374 = e;
                                                                        f = (((i374 | 73) << 1) - (i374 ^ 73)) % 128;
                                                                    }
                                                                }
                                                                i362 = ((i363 | 1) << 1) - (i363 ^ 1);
                                                                str13 = str14;
                                                                strArr20 = strArr11;
                                                                i290 = i43;
                                                            }
                                                            i44 = i363;
                                                        }
                                                        i43 = i290;
                                                        str14 = str13;
                                                        i44 = -1;
                                                        int i375 = ((i44 | 130) << 1) - (i44 ^ 130);
                                                        int i376 = ~i44;
                                                        int i377 = -i376;
                                                        int i378 = ((i376 ^ i377) | (i376 & i377)) >> 31;
                                                        int i379 = i30 ^ i43;
                                                        int i380 = -i379;
                                                        int i381 = ((i379 ^ i380) | (i379 & i380)) >> 31;
                                                        int i382 = (((((~i375) & i30) | (i375 & i32)) & i378) | ((~i378) & i30)) & (~i381);
                                                        int i383 = i43 & i381;
                                                        i37 = (i382 ^ i383) | (i383 & i382);
                                                        int i384 = f;
                                                        e = ((i384 ^ 97) + ((i384 & 97) << 1)) % 128;
                                                    }
                                                    char c24 = (char) ((-2) - (~(-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))));
                                                    int i385 = -android.graphics.Color.blue(0);
                                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                    g(c24, ((i385 | 1952) << 1) - (i385 ^ 1952), 12 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), objArr109);
                                                    java.lang.String str65 = (java.lang.String) objArr109[0];
                                                    char maxKeyCode2 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                                    int i386 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                    int i387 = -android.graphics.Color.blue(0);
                                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                    g(maxKeyCode2, ((i386 | 1965) << 1) - (i386 ^ 1965), (i387 ^ 5) + ((i387 & 5) << 1), objArr110);
                                                    java.lang.String[] strArr21 = {str65, (java.lang.String) objArr110[0]};
                                                    char green2 = (char) android.graphics.Color.green(0);
                                                    int lastIndexOf4 = android.text.TextUtils.lastIndexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int i388 = -android.view.KeyEvent.getDeadChar(0, 0);
                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                    g(green2, lastIndexOf4 + 1971, ((i388 | 15) << 1) - (i388 ^ 15), objArr111);
                                                    java.lang.String str66 = (java.lang.String) objArr111[0];
                                                    char lastIndexOf5 = (char) (android.text.TextUtils.lastIndexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
                                                    int i389 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                    g(lastIndexOf5, (i389 & 1985) + (i389 | 1985), 17 - (~(-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), objArr112);
                                                    java.lang.String str67 = (java.lang.String) objArr112[0];
                                                    char red4 = (char) android.graphics.Color.red(0);
                                                    int i390 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int scrollBarFadeDuration2 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    g(red4, (i390 & androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE) + (i390 | androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE), ((scrollBarFadeDuration2 | 14) << 1) - (scrollBarFadeDuration2 ^ 14), objArr113);
                                                    java.lang.String[] strArr22 = {str66, str67, (java.lang.String) objArr113[0]};
                                                    char jumpTapTimeout3 = (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 7081);
                                                    int i391 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i392 = -android.view.View.MeasureSpec.getMode(0);
                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                    g(jumpTapTimeout3, (i391 ^ 2019) + ((i391 & 2019) << 1), ((i392 | 21) << 1) - (i392 ^ 21), objArr114);
                                                    java.lang.String str68 = (java.lang.String) objArr114[0];
                                                    int threadPriority2 = android.os.Process.getThreadPriority(0);
                                                    char c25 = (char) (994 - (~(-(((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6))));
                                                    int i393 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                    g(c25, ((i393 | 2038) << 1) - (i393 ^ 2038), 10 - (~android.os.Process.getGidForName(str14)), objArr115);
                                                    java.lang.String[] strArr23 = {str68, (java.lang.String) objArr115[0]};
                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                    g((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 2049 - android.graphics.Color.red(0), (-38) - (~(-(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr116);
                                                    java.lang.String str69 = (java.lang.String) objArr116[0];
                                                    char c26 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int i394 = -android.view.View.MeasureSpec.getMode(0);
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    g(c26, (i394 & com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) + (i394 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED), 6 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr117);
                                                    java.lang.String[] strArr24 = {str69, (java.lang.String) objArr117[0]};
                                                    char maximumFlingVelocity3 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int combineMeasuredStates3 = android.view.View.combineMeasuredStates(0, 0);
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    g(maximumFlingVelocity3, (combineMeasuredStates3 & 2060) + (combineMeasuredStates3 | 2060), 26 - (~(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr118);
                                                    java.lang.String str70 = (java.lang.String) objArr118[0];
                                                    char c27 = (char) (994 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))));
                                                    int packedPositionGroup3 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    int i395 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                    g(c27, packedPositionGroup3 + 2039, ((i395 | 10) << 1) - (i395 ^ 10), objArr119);
                                                    r5 = new java.lang.String[][]{strArr21, strArr22, strArr23, strArr24, new java.lang.String[]{str70, (java.lang.String) objArr119[0]}};
                                                    int i396 = -1;
                                                    i38 = 0;
                                                    context2 = context;
                                                    loop7: while (true) {
                                                        if (i38 < 5) {
                                                            i39 = i37;
                                                            i40 = i32;
                                                            str15 = str14;
                                                            i41 = i30;
                                                            context3 = context2;
                                                            break;
                                                        }
                                                        e = (f + 31) % 128;
                                                        ?? r8 = r5[i38];
                                                        ?? r10 = r8[0];
                                                        java.lang.String[] strArr25 = (java.lang.String[]) java.util.Arrays.copyOfRange((java.lang.Object[]) r8, 1, r8.length);
                                                        int length2 = strArr25.length;
                                                        int i397 = 0;
                                                        while (i397 < length2) {
                                                            int i398 = e;
                                                            f = ((i398 & 51) + (i398 | 51)) % 128;
                                                            int i399 = (i396 ^ (-9)) + ((i396 & (-9)) << 1);
                                                            i396 = ((i399 | 10) << 1) - (i399 ^ 10);
                                                            java.lang.Object[] objArr120 = {r10, strArr25[i397]};
                                                            java.lang.Object d31 = com.facetec.sdk.al.d(-100890377);
                                                            if (d31 == null) {
                                                                char modifierMetaStateMask4 = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 23781);
                                                                float complexToFloat = android.util.TypedValue.complexToFloat(0);
                                                                int mode2 = android.view.View.MeasureSpec.getMode(0);
                                                                byte b48 = (byte) 0;
                                                                byte b49 = b48;
                                                                context4 = r5;
                                                                strArr10 = strArr25;
                                                                i42 = length2;
                                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                h(b48, b49, (byte) (b49 + 3), objArr121);
                                                                d31 = com.facetec.sdk.al.c(modifierMetaStateMask4, 1364 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), mode2 + 24, 1578365455, false, (java.lang.String) objArr121[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                                            } else {
                                                                context4 = r5;
                                                                strArr10 = strArr25;
                                                                i42 = length2;
                                                            }
                                                            long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) d31).invoke(null, objArr120)).longValue();
                                                            long j107 = -1191291309;
                                                            long j108 = -115;
                                                            java.lang.Object obj2 = r10;
                                                            int i400 = i397;
                                                            str15 = str14;
                                                            long myPid10 = android.os.Process.myPid();
                                                            i39 = i37;
                                                            i40 = i32;
                                                            long j109 = 116;
                                                            long j110 = longValue18 ^ j13;
                                                            long j111 = (((((j108 * j107) + (j108 * longValue18)) + ((-116) * ((longValue18 | ((myPid10 ^ j13) | j107)) ^ j13))) + ((j107 | myPid10) * j109)) + (j109 * (((j110 | myPid10) ^ j13) | (((j107 ^ j13) | j110) ^ j13)))) - 828772838;
                                                            int myTid5 = android.os.Process.myTid();
                                                            int i401 = ~myTid5;
                                                            int i402 = ((int) (j111 >> 32)) & ((((~(1719465156 | i401)) | (-1138275729)) * (-90)) + 1687905420 + (((~(1719465156 | myTid5)) | 1113109632) * (-45)) + (((~(myTid5 | 1138275728)) | 1719465156 | (~(i401 | (-1138275729)))) * 45));
                                                            int elapsedCpuTime4 = (int) android.os.Process.getElapsedCpuTime();
                                                            int i403 = ((int) j111) & (((((~((-182189936) | r5)) | 173648486) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-173648487) | elapsedCpuTime4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(elapsedCpuTime4 | (-8541450))) | (~((~elapsedCpuTime4) | 1619416345)) | (-1793064832)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                                            if (((i403 ^ i402) | (i402 & i403)) != 0) {
                                                                int i404 = f;
                                                                e = ((i404 & 41) + (i404 | 41)) % 128;
                                                                int i405 = i396 * (-590);
                                                                int i406 = ((100640 | i405) << 1) - (i405 ^ 100640);
                                                                int i407 = (~(i396 | (-171))) * (-1182);
                                                                int i408 = (i406 ^ i407) + ((i407 & i406) << 1);
                                                                int i409 = ~i396;
                                                                int i410 = (i409 & (-171)) | (i409 ^ (-171));
                                                                int i411 = ~((i410 ^ i40) | (i410 & i40));
                                                                int i412 = ~((i396 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE) | (i396 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE));
                                                                int i413 = -(-(((i411 ^ i412) | (i411 & i412)) * (-591)));
                                                                int i414 = ((i408 | i413) << 1) - (i413 ^ i408);
                                                                int i415 = -(-((i409 | (i30 ^ (-171)) | (i30 & (-171))) * 591));
                                                                int i416 = (i414 ^ i415) + ((i415 & i414) << 1);
                                                                i41 = ((~i416) & i30) | (i416 & i40);
                                                                context3 = context4;
                                                                break loop7;
                                                            }
                                                            int i417 = ((i400 | 52) << 1) - (i400 ^ 52);
                                                            i397 = (i417 ^ (-51)) + ((i417 & (-51)) << 1);
                                                            r5 = context4;
                                                            strArr25 = strArr10;
                                                            r10 = obj2;
                                                            i37 = i39;
                                                            str14 = str15;
                                                            i32 = i40;
                                                            length2 = i42;
                                                        }
                                                        int i418 = i37;
                                                        context2 = r5;
                                                        int i419 = (i38 ^ 40) + ((i38 & 40) << 1);
                                                        i38 = (i419 & (-39)) + (i419 | (-39));
                                                        i37 = i418;
                                                        str14 = str14;
                                                        i32 = i32;
                                                    }
                                                    int i420 = (~(i30 & i39)) & (i30 | i39);
                                                    int i421 = -i420;
                                                    int i422 = ((i420 ^ i421) | (i420 & i421)) >> 31;
                                                    int i423 = (~i422) & i41;
                                                    int i424 = i39 & i422;
                                                    ?? r1 = (i424 & i423) | (i423 ^ i424);
                                                    int trimmedLength4 = android.text.TextUtils.getTrimmedLength(str15);
                                                    long elapsedCpuTime5 = android.os.Process.getElapsedCpuTime();
                                                    int blue2 = android.graphics.Color.blue(0);
                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                    g((char) (((trimmedLength4 | 21819) << 1) - (trimmedLength4 ^ 21819)), 2089 - (elapsedCpuTime5 > 0L ? 1 : (elapsedCpuTime5 == 0L ? 0 : -1)), ((blue2 | 13) << 1) - (blue2 ^ 13), objArr122);
                                                    java.lang.String str71 = (java.lang.String) objArr122[0];
                                                    char c28 = (char) (53728 - (~(-(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))));
                                                    int i425 = -(-android.graphics.Color.blue(0));
                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                    g(c28, (i425 ^ 2101) + ((i425 & 2101) << 1), 8 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr123);
                                                    java.lang.Object[] objArr124 = {str71, (java.lang.String) objArr123[0]};
                                                    d8 = com.facetec.sdk.al.d(-100890377);
                                                    if (d8 == null) {
                                                        char maximumFlingVelocity4 = (char) (23780 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                        byte modifierMetaStateMask5 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                                                        int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                                        byte b50 = (byte) 0;
                                                        byte b51 = b50;
                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                        h(b50, b51, (byte) (b51 + 3), objArr125);
                                                        d8 = com.facetec.sdk.al.c(maximumFlingVelocity4, modifierMetaStateMask5 + 1365, 24 - (keyRepeatTimeout2 >> 16), 1578365455, false, (java.lang.String) objArr125[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                                                    }
                                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, objArr124)).longValue();
                                                    long j112 = -1849687693;
                                                    long j113 = -755;
                                                    long j114 = ((j112 ^ j13) | (longValue19 ^ j13)) ^ j13;
                                                    long j115 = longValue19 | j112;
                                                    ?? r79 = r1;
                                                    long maxMemory3 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                                    long j116 = (((((j112 * j113) + (j113 * longValue19)) + (1512 * j114)) + ((-756) * (((j115 | maxMemory3) ^ j13) | j114))) + (756 * (j115 | (maxMemory3 ^ j13)))) - 170376454;
                                                    int i426 = ((int) (j116 >> 32)) & (((((~(2090818342 | i30)) | (-2130665344)) * (-140)) - 1692931746) + ((~((-39847002) | i30)) * 70) + (((~((-653591932) | i30)) | (-1516920414)) * 70));
                                                    int i427 = (int) j116;
                                                    int myUid4 = android.os.Process.myUid();
                                                    int i428 = ~myUid4;
                                                    int i429 = i427 & ((((((~((-1940019005) | i428)) | 849498904) | r4) * (-502)) - 190538907) + (((~(myUid4 | 2008241981)) | (~(i428 | (-1090520101)))) * 502));
                                                    int i430 = ((i426 ^ i429) | (i426 & i429)) == 0 ? i30 ^ 150 : i30;
                                                    int i431 = i40;
                                                    int i432 = i30 ^ r79;
                                                    int i433 = -i432;
                                                    int i434 = ((i432 ^ i433) | (i432 & i433)) >> 31;
                                                    int i435 = (~i434) & i430;
                                                    int i436 = r79 & i434;
                                                    int i437 = (i436 ^ i435) | (i435 & i436);
                                                    char c29 = (char) ((-android.os.Process.getGidForName(str15)) - 1);
                                                    int i438 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    java.lang.String str72 = str15;
                                                    int i439 = -(-android.text.TextUtils.indexOf(str72, str72, 0));
                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                    g(c29, (i438 ^ 2110) + ((i438 & 2110) << 1), (i439 ^ 47) + ((i439 & 47) << 1), objArr126);
                                                    java.lang.Object[] objArr127 = {(java.lang.String) objArr126[0]};
                                                    d7 = com.facetec.sdk.al.d(2084539986);
                                                    if (d7 == null) {
                                                        char capsMode = (char) (android.text.TextUtils.getCapsMode(str72, 0, 0) + 6935);
                                                        int windowTouchSlop2 = android.view.ViewConfiguration.getWindowTouchSlop();
                                                        int minimumFlingVelocity5 = android.view.ViewConfiguration.getMinimumFlingVelocity();
                                                        byte b52 = (byte) 0;
                                                        byte b53 = b52;
                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                        h(b52, b53, b53, objArr128);
                                                        d7 = com.facetec.sdk.al.c(capsMode, 2389 - (windowTouchSlop2 >> 8), 23 - (minimumFlingVelocity5 >> 16), -607062870, false, (java.lang.String) objArr128[0], new java.lang.Class[]{java.lang.String.class});
                                                    }
                                                    long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr127)).longValue();
                                                    long j117 = 595077996;
                                                    long j118 = 868;
                                                    long j119 = j117 ^ j13;
                                                    i21 = i431;
                                                    long j120 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                                    long j121 = j120 ^ j13;
                                                    long j122 = longValue20 ^ j13;
                                                    long j123 = j119 | j122;
                                                    long j124 = (j118 * j117) + (j118 * longValue20) + ((-867) * (((j119 | j121) ^ j13) | ((j122 | j121) ^ j13))) + ((-1734) * ((j123 ^ j13) | ((j119 | j120) ^ j13) | ((j122 | j120) ^ j13))) + (867 * ((((longValue20 | j119) | j120) ^ j13) | ((j123 | j121) ^ j13) | (((j122 | j117) | j120) ^ j13))) + 377071346;
                                                    int nextInt4 = new java.util.Random().nextInt(1752682811);
                                                    int i440 = ~nextInt4;
                                                    int i441 = ((int) (j124 >> 32)) & ((((~((-33645587) | i440)) | 33579024) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106 + ((~((-33579025) | nextInt4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(nextInt4 | (-66563))) | (~(i440 | (-1403580825))) | 1370001800) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                                    int i442 = ((int) j124) & (((((~((-1515284028) | i30)) | (-1515546172)) * (-502)) - 577333493) + ((~(i21 | (-173089314))) * (-502)) + (((~((-1342456859) | i30)) | (-1515284028)) * 502));
                                                    int i443 = ((i442 ^ i441) | (i441 & i442)) * 263;
                                                    int i444 = i30 ^ i437;
                                                    int i445 = -i444;
                                                    int i446 = ((i444 ^ i445) | (i444 & i445)) >> 31;
                                                    int i447 = (((~i443) & i30) | (i443 & i21)) & (~i446);
                                                    int i448 = i437 & i446;
                                                    i278 = (i447 ^ i448) | (i448 & i447);
                                                    strArr4 = strArr9;
                                                }
                                            }
                                            java.lang.Object[] objArr1242 = {str71, (java.lang.String) objArr123[0]};
                                            d8 = com.facetec.sdk.al.d(-100890377);
                                            if (d8 == null) {
                                            }
                                            long longValue192 = ((java.lang.Long) ((java.lang.reflect.Method) d8).invoke(null, objArr1242)).longValue();
                                            long j1122 = -1849687693;
                                            long j1132 = -755;
                                            long j1142 = ((j1122 ^ j13) | (longValue192 ^ j13)) ^ j13;
                                            long j1152 = longValue192 | j1122;
                                            ?? r792 = r1;
                                            long maxMemory32 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                            long j1162 = (((((j1122 * j1132) + (j1132 * longValue192)) + (1512 * j1142)) + ((-756) * (((j1152 | maxMemory32) ^ j13) | j1142))) + (756 * (j1152 | (maxMemory32 ^ j13)))) - 170376454;
                                            int i4262 = ((int) (j1162 >> 32)) & (((((~(2090818342 | i30)) | (-2130665344)) * (-140)) - 1692931746) + ((~((-39847002) | i30)) * 70) + (((~((-653591932) | i30)) | (-1516920414)) * 70));
                                            int i4272 = (int) j1162;
                                            int myUid42 = android.os.Process.myUid();
                                            int i4282 = ~myUid42;
                                            int i4292 = i4272 & ((((((~((-1940019005) | i4282)) | 849498904) | r4) * (-502)) - 190538907) + (((~(myUid42 | 2008241981)) | (~(i4282 | (-1090520101)))) * 502));
                                            if (((i4262 ^ i4292) | (i4262 & i4292)) == 0) {
                                            }
                                            int i4312 = i40;
                                            int i4322 = i30 ^ r792;
                                            int i4332 = -i4322;
                                            int i4342 = ((i4322 ^ i4332) | (i4322 & i4332)) >> 31;
                                            int i4352 = (~i4342) & i430;
                                            int i4362 = r792 & i4342;
                                            int i4372 = (i4362 ^ i4352) | (i4352 & i4362);
                                            char c292 = (char) ((-android.os.Process.getGidForName(str15)) - 1);
                                            int i4382 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            java.lang.String str722 = str15;
                                            int i4392 = -(-android.text.TextUtils.indexOf(str722, str722, 0));
                                            java.lang.Object[] objArr1262 = new java.lang.Object[1];
                                            g(c292, (i4382 ^ 2110) + ((i4382 & 2110) << 1), (i4392 ^ 47) + ((i4392 & 47) << 1), objArr1262);
                                            java.lang.Object[] objArr1272 = {(java.lang.String) objArr1262[0]};
                                            d7 = com.facetec.sdk.al.d(2084539986);
                                            if (d7 == null) {
                                            }
                                            long longValue202 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr1272)).longValue();
                                            long j1172 = 595077996;
                                            long j1182 = 868;
                                            long j1192 = j1172 ^ j13;
                                            i21 = i4312;
                                            long j1202 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                            long j1212 = j1202 ^ j13;
                                            long j1222 = longValue202 ^ j13;
                                            long j1232 = j1192 | j1222;
                                            long j1242 = (j1182 * j1172) + (j1182 * longValue202) + ((-867) * (((j1192 | j1212) ^ j13) | ((j1222 | j1212) ^ j13))) + ((-1734) * ((j1232 ^ j13) | ((j1192 | j1202) ^ j13) | ((j1222 | j1202) ^ j13))) + (867 * ((((longValue202 | j1192) | j1202) ^ j13) | ((j1232 | j1212) ^ j13) | (((j1222 | j1172) | j1202) ^ j13))) + 377071346;
                                            int nextInt42 = new java.util.Random().nextInt(1752682811);
                                            int i4402 = ~nextInt42;
                                            int i4412 = ((int) (j1242 >> 32)) & ((((~((-33645587) | i4402)) | 33579024) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106 + ((~((-33579025) | nextInt42)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(nextInt42 | (-66563))) | (~(i4402 | (-1403580825))) | 1370001800) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                            int i4422 = ((int) j1242) & (((((~((-1515284028) | i30)) | (-1515546172)) * (-502)) - 577333493) + ((~(i21 | (-173089314))) * (-502)) + (((~((-1342456859) | i30)) | (-1515284028)) * 502));
                                            int i4432 = ((i4422 ^ i4412) | (i4412 & i4422)) * 263;
                                            int i4442 = i30 ^ i4372;
                                            int i4452 = -i4442;
                                            int i4462 = ((i4442 ^ i4452) | (i4442 & i4452)) >> 31;
                                            int i4472 = (((~i4432) & i30) | (i4432 & i21)) & (~i4462);
                                            int i4482 = i4372 & i4462;
                                            i278 = (i4472 ^ i4482) | (i4482 & i4472);
                                            strArr4 = strArr9;
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                        char keyRepeatTimeout3 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int i449 = -android.view.View.MeasureSpec.getMode(0);
                                        int i450 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                        g(keyRepeatTimeout3, (i449 & 372) + (i449 | 372), (i450 ^ 71) + ((i450 & 71) << 1), objArr129);
                                        java.lang.String str73 = (java.lang.String) objArr129[0];
                                        char fadingEdgeLength2 = (char) (34223 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                        int offsetBefore2 = android.text.TextUtils.getOffsetBefore(str30, 0);
                                        int i451 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                        g(fadingEdgeLength2, 810 - offsetBefore2, ((i451 | 10) << 1) - (i451 ^ 10), objArr130);
                                        java.lang.String str74 = (java.lang.String) objArr130[0];
                                        int i452 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i453 = -(-android.graphics.Color.red(0));
                                        int i454 = -(-android.graphics.Color.rgb(0, 0, 0));
                                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                                        g((char) ((i452 ^ 23079) + ((i452 & 23079) << 1)), 819 - (~i453), ((16777223 | i454) << 1) - (16777223 ^ i454), objArr131);
                                        java.lang.String str75 = (java.lang.String) objArr131[0];
                                        char keyRepeatDelay2 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i455 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int i456 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                                        g(keyRepeatDelay2, ((i455 | 827) << 1) - (i455 ^ 827), (i456 & 7) + (i456 | 7), objArr132);
                                        java.lang.String[] strArr26 = {str73, str74, str75, (java.lang.String) objArr132[0]};
                                        char c30 = (char) ((-android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)) - 1);
                                        int i457 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int d32 = com.facetec.sdk.mt.c.d();
                                        int i458 = i457 * (-501);
                                        int i459 = ((419502 | i458) << 1) - (419502 ^ i458);
                                        int i460 = ~(d32 | (-835));
                                        int i461 = ~((i457 ^ 834) | (i457 & 834));
                                        int i462 = ((i460 ^ i461) | (i461 & i460)) * (-502);
                                        int i463 = (i459 & i462) + (i462 | i459);
                                        int i464 = ~d32;
                                        int i465 = (~((i464 ^ (-835)) | (i464 & (-835)) | i457)) * (-502);
                                        int i466 = ~((~i457) | d32);
                                        int i467 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                        g(c30, (i463 ^ i465) + ((i465 & i463) << 1) + (((i466 & (-835)) | (i466 ^ (-835))) * 502), ((i467 | 17) << 1) - (i467 ^ 17), objArr133);
                                        java.lang.String str76 = (java.lang.String) objArr133[0];
                                        char doubleTapTimeout4 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                                        g(doubleTapTimeout4, (deadChar ^ 852) + ((deadChar & 852) << 1), 7 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr134);
                                        java.lang.String str77 = (java.lang.String) objArr134[0];
                                        char c31 = (char) ((-2) - (~(-(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))));
                                        int scrollBarFadeDuration3 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                        int i468 = -android.text.TextUtils.getCapsMode(str30, 0, 0);
                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                        g(c31, 859 - (scrollBarFadeDuration3 >> 16), ((i468 | 7) << 1) - (i468 ^ 7), objArr135);
                                        java.lang.String str78 = (java.lang.String) objArr135[0];
                                        char defaultSize3 = (char) android.view.View.getDefaultSize(0, 0);
                                        int i469 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                        g(defaultSize3, ((i469 | 866) << 1) - (i469 ^ 866), 10 - (~(-android.view.View.getDefaultSize(0, 0))), objArr136);
                                        java.lang.String str79 = (java.lang.String) objArr136[0];
                                        int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                                        int packedPositionGroup4 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                        int i470 = -android.text.TextUtils.getOffsetAfter(str30, 0);
                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                        g((char) (((16828510 | rgb2) << 1) - (rgb2 ^ 16828510)), 876 - (~packedPositionGroup4), (i470 & 14) + (i470 | 14), objArr137);
                                        java.lang.String[] strArr27 = {str76, str77, str78, str79, (java.lang.String) objArr137[0]};
                                        java.lang.Object[] objArr138 = new java.lang.Object[1];
                                        g((char) android.widget.ExpandableListView.getPackedPositionType(0L), 891 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 17, objArr138);
                                        java.lang.String str80 = (java.lang.String) objArr138[0];
                                        int i471 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i472 = -(-android.text.TextUtils.indexOf(str30, str30, 0, 0));
                                        int i473 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int d33 = com.facetec.sdk.mt.c.d();
                                        int i474 = ~((~i473) | 3);
                                        int i475 = ~((i473 ^ (-4)) | (i473 & (-4)));
                                        int i476 = (i474 & i475) | (i474 ^ i475);
                                        int i477 = ~((d33 & i473) | (i473 ^ d33));
                                        int i478 = ~(i473 | (-4));
                                        java.lang.Object[] objArr139 = new java.lang.Object[1];
                                        g((char) ((i471 ^ 15467) + ((i471 & 15467) << 1)), (i472 ^ 907) + ((i472 & 907) << 1), (((((((i473 * 659) - 1971) - (~(-(-(((i476 & i477) | (i476 ^ i477)) * (-658)))))) - 1) - (~(i475 * 658))) - 1) - (~(-(-(((i477 ^ i478) | (i478 & i477)) * 658))))) - 1, objArr139);
                                        java.lang.String str81 = (java.lang.String) objArr139[0];
                                        char c32 = (char) (57925 - (~(-(android.view.ViewConfiguration.getEdgeSlop() >> 16))));
                                        int i479 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int i480 = -android.view.View.resolveSize(0, 0);
                                        java.lang.Object[] objArr140 = new java.lang.Object[1];
                                        g(c32, 917 - (~i479), (i480 & 22) + (i480 | 22), objArr140);
                                        java.lang.String str82 = (java.lang.String) objArr140[0];
                                        char keyRepeatDelay3 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i481 = -android.text.TextUtils.getCapsMode(str30, 0, 0);
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        g(keyRepeatDelay3, ((i481 | 940) << 1) - (i481 ^ 940), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, objArr141);
                                        java.lang.String str83 = (java.lang.String) objArr141[0];
                                        int i482 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        char c33 = (char) ((i482 ^ 14040) + ((i482 & 14040) << 1));
                                        int size = android.view.View.MeasureSpec.getSize(0);
                                        int i483 = -android.view.View.resolveSize(0, 0);
                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                        g(c33, size + 965, (i483 ^ 28) + ((i483 & 28) << 1), objArr142);
                                        j8 = j46;
                                        j9 = j76;
                                        j10 = j6;
                                        java.lang.String[] strArr28 = {str80, str81, str2, str82, str83, (java.lang.String) objArr142[0]};
                                        char c34 = (char) (0 - (~android.view.MotionEvent.axisFromString(str30)));
                                        int i484 = -(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                        int i485 = -(-android.view.View.resolveSize(0, 0));
                                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                                        g(c34, ((i484 | 992) << 1) - (i484 ^ 992), (i485 & 11) + (i485 | 11), objArr143);
                                        java.lang.String str84 = (java.lang.String) objArr143[0];
                                        java.lang.Object[] objArr144 = new java.lang.Object[1];
                                        g((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1003 - (~(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 7 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr144);
                                        java.lang.String str85 = (java.lang.String) objArr144[0];
                                        char normalizeMetaState5 = (char) android.view.KeyEvent.normalizeMetaState(0);
                                        int i486 = -android.graphics.Color.alpha(0);
                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                        g(normalizeMetaState5, (i486 ^ 1012) + ((i486 & 1012) << 1), 6 - android.text.TextUtils.indexOf(str30, str30), objArr145);
                                        java.lang.String str86 = (java.lang.String) objArr145[0];
                                        char alpha4 = (char) (android.graphics.Color.alpha(0) + 20807);
                                        int i487 = -android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int i488 = ~i487;
                                        int i489 = ~((i488 ^ 1017) | (i488 & 1017));
                                        int i490 = ~((i487 ^ (-1018)) | (i487 & (-1018)));
                                        int i491 = (i489 ^ i490) | (i489 & i490);
                                        int i492 = ~(i26 | (-1018));
                                        int i493 = (i487 * 399) + 405783 + (((i491 ^ i492) | (i491 & i492)) * 398);
                                        int i494 = -(-(((i487 & 1017) | (i487 ^ 1017)) * (-1194)));
                                        int i495 = (i493 ^ i494) + ((i493 & i494) << 1);
                                        int i496 = ~((i32 ^ (-1018)) | (i32 & (-1018)));
                                        int i497 = (i496 ^ i489) | (i496 & i489);
                                        int i498 = ((i497 ^ i490) | (i490 & i497)) * 398;
                                        int capsMode2 = android.text.TextUtils.getCapsMode(str30, 0, 0);
                                        int i499 = ~((capsMode2 ^ (-7)) | (capsMode2 & (-7)));
                                        int i500 = ~((i32 ^ 6) | (i32 & 6));
                                        int i501 = (capsMode2 * (-1939)) + 5826 + (((i499 ^ i500) | (i499 & i500)) * (-970));
                                        int i502 = ~capsMode2;
                                        int i503 = -(-((~((i502 ^ 6) | (i502 & 6))) * 1940));
                                        int i504 = (i501 & i503) + (i501 | i503);
                                        int i505 = ~(i502 | (-7));
                                        int i506 = ~(i32 | 6);
                                        int i507 = -(-(((i505 ^ i506) | (i505 & i506)) * 970));
                                        java.lang.Object[] objArr146 = new java.lang.Object[1];
                                        g(alpha4, (i495 ^ i498) + ((i498 & i495) << 1), (i504 & i507) + (i507 | i504), objArr146);
                                        java.lang.String[] strArr29 = {str84, str85, str86, (java.lang.String) objArr146[0]};
                                        char resolveSize2 = (char) android.view.View.resolveSize(0, 0);
                                        int i508 = -android.view.View.getDefaultSize(0, 0);
                                        int i509 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                        g(resolveSize2, (i508 ^ 1024) + ((i508 & 1024) << 1), (i509 ^ 17) + ((i509 & 17) << 1), objArr147);
                                        java.lang.String str87 = (java.lang.String) objArr147[0];
                                        char tapTimeout3 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                        int i510 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                        int i511 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                        g(tapTimeout3, ((i510 | 859) << 1) - (i510 ^ 859), ((i511 | 8) << 1) - (i511 ^ 8), objArr148);
                                        java.lang.String str88 = (java.lang.String) objArr148[0];
                                        char c35 = (char) ((-2) - (~(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                        int scrollBarFadeDuration4 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                        int i512 = -android.view.View.MeasureSpec.getSize(0);
                                        java.lang.Object[] objArr149 = new java.lang.Object[1];
                                        g(c35, ((scrollBarFadeDuration4 | 827) << 1) - (scrollBarFadeDuration4 ^ 827), (i512 & 8) + (i512 | 8), objArr149);
                                        java.lang.String[] strArr30 = {str87, str88, (java.lang.String) objArr149[0]};
                                        java.lang.Object[] objArr150 = new java.lang.Object[1];
                                        g((char) ((-android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)) - 1), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 992, 12 - (~(-android.view.MotionEvent.axisFromString(str30))), objArr150);
                                        java.lang.String str89 = (java.lang.String) objArr150[0];
                                        char c36 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i513 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        int i514 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        java.lang.Object[] objArr151 = new java.lang.Object[1];
                                        g(c36, 1053 - (~i513), (i514 & 1) + (i514 | 1), objArr151);
                                        java.lang.String[] strArr31 = {str89, (java.lang.String) objArr151[0]};
                                        char c37 = (char) ((-49) - (~(-(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))));
                                        int i515 = -(-android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        int i516 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                        java.lang.Object[] objArr152 = new java.lang.Object[1];
                                        g(c37, (i515 & 1056) + (i515 | 1056), (i516 & 9) + (i516 | 9), objArr152);
                                        java.lang.String str90 = (java.lang.String) objArr152[0];
                                        int i517 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        int i518 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                                        g((char) (((i517 | 1373) << 1) - (i517 ^ 1373)), (i518 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO) + ((i518 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO) << 1), -android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr153);
                                        java.lang.String[] strArr32 = {str90, (java.lang.String) objArr153[0]};
                                        int keyRepeatTimeout4 = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                        int windowTouchSlop3 = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                                        g((char) (((keyRepeatTimeout4 | 17834) << 1) - (keyRepeatTimeout4 ^ 17834)), ((windowTouchSlop3 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_LAYER_COMPS) << 1) - (windowTouchSlop3 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_LAYER_COMPS), android.text.TextUtils.getOffsetBefore(str30, 0) + 16, objArr154);
                                        java.lang.String str91 = (java.lang.String) objArr154[0];
                                        int i519 = -(-(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                        int maximumFlingVelocity5 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                                        int i520 = -(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                                        g((char) ((i519 & 15467) + (i519 | 15467)), 906 - (~(maximumFlingVelocity5 >> 16)), (i520 & 3) + (i520 | 3), objArr155);
                                        java.lang.String str92 = (java.lang.String) objArr155[0];
                                        char scrollBarFadeDuration5 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int keyRepeatDelay4 = android.view.ViewConfiguration.getKeyRepeatDelay();
                                        int gidForName2 = android.os.Process.getGidForName(str30);
                                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                                        g(scrollBarFadeDuration5, 852 - (keyRepeatDelay4 >> 16), ((gidForName2 | 8) << 1) - (gidForName2 ^ 8), objArr156);
                                        java.lang.String str93 = (java.lang.String) objArr156[0];
                                        char maxKeyCode3 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                        int i521 = -android.view.View.getDefaultSize(0, 0);
                                        int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                                        g(maxKeyCode3, (i521 ^ 1081) + ((i521 & 1081) << 1), (makeMeasureSpec3 ^ 8) + ((makeMeasureSpec3 & 8) << 1), objArr157);
                                        java.lang.String str94 = (java.lang.String) objArr157[0];
                                        char size2 = (char) android.view.View.MeasureSpec.getSize(0);
                                        int indexOf11 = android.text.TextUtils.indexOf(str30, str30, 0, 0);
                                        int i522 = -(-android.view.View.resolveSize(0, 0));
                                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                                        g(size2, 866 - indexOf11, (i522 ^ 11) + ((i522 & 11) << 1), objArr158);
                                        java.lang.String str95 = (java.lang.String) objArr158[0];
                                        int i523 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int i524 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                        int i525 = -(android.os.Process.myTid() >> 22);
                                        java.lang.Object[] objArr159 = new java.lang.Object[1];
                                        g((char) (((51294 | i523) << 1) - (i523 ^ 51294)), ((i524 | 876) << 1) - (i524 ^ 876), ((i525 | 14) << 1) - (i525 ^ 14), objArr159);
                                        java.lang.String[] strArr33 = {str91, str92, str93, str94, str95, (java.lang.String) objArr159[0]};
                                        char trimmedLength5 = (char) android.text.TextUtils.getTrimmedLength(str30);
                                        int i526 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                                        int i527 = -android.graphics.Color.alpha(0);
                                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                                        g(trimmedLength5, 1088 - (~i526), ((i527 | 20) << 1) - (i527 ^ 20), objArr160);
                                        java.lang.String str96 = (java.lang.String) objArr160[0];
                                        int i528 = -android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                        int i529 = -android.graphics.Color.alpha(0);
                                        int alpha5 = android.graphics.Color.alpha(0);
                                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                                        g((char) ((i528 & 22741) + (i528 | 22741)), ((i529 | 1109) << 1) - (i529 ^ 1109), (alpha5 ^ 19) + ((alpha5 & 19) << 1), objArr161);
                                        java.lang.String str97 = (java.lang.String) objArr161[0];
                                        char indexOf12 = (char) (35118 - android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        int fadingEdgeLength3 = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                        java.lang.Object[] objArr162 = new java.lang.Object[1];
                                        g(indexOf12, (fadingEdgeLength3 & 1128) + (fadingEdgeLength3 | 1128), 30 - (~(android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr162);
                                        java.lang.String str98 = (java.lang.String) objArr162[0];
                                        char indexOf13 = (char) (7237 - android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                                        int i530 = (((packedPositionChild * 860) - 995280) - (~(-(-(((packedPositionChild ^ i26) | (packedPositionChild & i26)) * (-859)))))) - 1;
                                        int i531 = ~packedPositionChild;
                                        int i532 = (i531 & (-1161)) | (i531 ^ (-1161));
                                        int i533 = ((~((i532 ^ i26) | (i532 & i26))) | (~((i32 ^ packedPositionChild) | (i32 & packedPositionChild)))) * 859;
                                        int i534 = (i530 & i533) + (i530 | i533);
                                        int i535 = ((~((packedPositionChild ^ (-1161)) | (packedPositionChild & (-1161)))) | (~((i32 ^ (-1161)) | (i32 & (-1161))))) * 859;
                                        java.lang.Object[] objArr163 = new java.lang.Object[1];
                                        g(indexOf13, ((i534 | i535) << 1) - (i535 ^ i534), android.text.TextUtils.indexOf(str30, str30) + 26, objArr163);
                                        java.lang.String str99 = (java.lang.String) objArr163[0];
                                        char c38 = (char) (50046 - (~(-(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))));
                                        int longPressTimeout3 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                                        g(c38, (longPressTimeout3 ^ 1185) + ((longPressTimeout3 & 1185) << 1), 22 - (~(-(-android.view.View.resolveSize(0, 0)))), objArr164);
                                        java.lang.String str100 = (java.lang.String) objArr164[0];
                                        char c39 = (char) (65097 - (~(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                        int i536 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                        int i537 = -android.text.TextUtils.getOffsetBefore(str30, 0);
                                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                                        g(c39, (i536 & 1208) + (i536 | 1208), (i537 & 33) + (i537 | 33), objArr165);
                                        i30 = i26;
                                        long j125 = j30;
                                        j11 = j7;
                                        j12 = j4;
                                        java.lang.String[] strArr34 = {str96, str97, str98, str99, str100, (java.lang.String) objArr165[0], str2};
                                        char scrollBarFadeDuration6 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                        java.lang.String str101 = str30;
                                        int i538 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                                        g(scrollBarFadeDuration6, (maximumDrawingCacheSize2 ^ 1241) + ((maximumDrawingCacheSize2 & 1241) << 1), (i538 ^ 13) + ((i538 & 13) << 1), objArr166);
                                        java.lang.String str102 = (java.lang.String) objArr166[0];
                                        char c40 = (char) (23078 - (~(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                        int i539 = -android.text.TextUtils.getOffsetAfter(str101, 0);
                                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                                        g(c40, ((i539 | 820) << 1) - (i539 ^ 820), 8 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr167);
                                        java.lang.String[] strArr35 = {str102, (java.lang.String) objArr167[0]};
                                        char c41 = (char) (28636 - (~(-android.view.KeyEvent.getDeadChar(0, 0))));
                                        int longPressTimeout4 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                        int i540 = -(-android.text.TextUtils.indexOf(str101, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                                        g(c41, (longPressTimeout4 ^ 1254) + ((longPressTimeout4 & 1254) << 1), (i540 ^ 31) + ((i540 & 31) << 1), objArr168);
                                        java.lang.String str103 = (java.lang.String) objArr168[0];
                                        char c42 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                        int i541 = -android.text.TextUtils.indexOf(str101, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                                        g(c42, ((i541 | 1283) << 1) - (i541 ^ 1283), 11 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr169);
                                        java.lang.String[] strArr36 = {str103, (java.lang.String) objArr169[0]};
                                        int i542 = -(-android.view.View.MeasureSpec.getMode(0));
                                        int makeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int i543 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                                        g((char) (((i542 | 3577) << 1) - (i542 ^ 3577)), 1295 - makeMeasureSpec4, ((i543 | 19) << 1) - (i543 ^ 19), objArr170);
                                        java.lang.String str104 = (java.lang.String) objArr170[0];
                                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                                        g((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1314, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 5, objArr171);
                                        java.lang.String[] strArr37 = {str104, (java.lang.String) objArr171[0]};
                                        int i544 = -(-(android.os.Process.myPid() >> 22));
                                        int i545 = -android.text.TextUtils.getOffsetBefore(str101, 0);
                                        int i546 = -android.view.View.MeasureSpec.getSize(0);
                                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                                        g((char) ((i544 ^ 2021) + ((i544 & 2021) << 1)), 1318 - (~i545), (i546 & 19) + (i546 | 19), objArr172);
                                        java.lang.String[] strArr38 = {(java.lang.String) objArr172[0]};
                                        char modifierMetaStateMask6 = (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1);
                                        int threadPriority3 = (android.os.Process.getThreadPriority(0) + 20) >> 6;
                                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                                        g(modifierMetaStateMask6, (threadPriority3 & 1338) + (threadPriority3 | 1338), android.view.Gravity.getAbsoluteGravity(0, 0) + 16, objArr173);
                                        java.lang.String[] strArr39 = {(java.lang.String) objArr173[0]};
                                        char indexOf14 = (char) (3983 - android.text.TextUtils.indexOf(str101, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        int touchSlop2 = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                        int d34 = com.facetec.sdk.mt.c.d();
                                        int i547 = touchSlop2 * (-391);
                                        int i548 = ((-264030) ^ i547) + ((i547 & (-264030)) << 1);
                                        int i549 = ((~((touchSlop2 ^ (-1355)) | (touchSlop2 & (-1355)))) | (~((d34 ^ 1354) | (d34 & 1354)))) * (-196);
                                        int i550 = -(-(((touchSlop2 ^ 1354) | (touchSlop2 & 1354)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                                        int i551 = ~touchSlop2;
                                        int i552 = ~((i551 ^ (-1355)) | (i551 & (-1355)));
                                        int i553 = ~(d34 | 1354);
                                        int i554 = -android.text.TextUtils.indexOf(str101, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                                        g(indexOf14, ((((i548 & i549) + (i549 | i548)) - (~i550)) - 1) + (((i552 ^ i553) | (i552 & i553)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), ((i554 | 18) << 1) - (i554 ^ 18), objArr174);
                                        java.lang.String[] strArr40 = {(java.lang.String) objArr174[0]};
                                        java.lang.Object[] objArr175 = new java.lang.Object[1];
                                        g((char) (android.text.TextUtils.indexOf(str101, str101) + 8182), 1372 - (~(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))), android.view.KeyEvent.getDeadChar(0, 0) + 19, objArr175);
                                        java.lang.String[] strArr41 = {(java.lang.String) objArr175[0]};
                                        char scrollBarSize4 = (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 11785);
                                        int i555 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int d35 = com.facetec.sdk.mt.c.d();
                                        int i556 = (i555 * (-589)) + 822672;
                                        int i557 = ~d35;
                                        int i558 = ~((i557 ^ (-1393)) | (i557 & (-1393)));
                                        int i559 = ~(i555 | (-1393));
                                        int i560 = (i559 & i558) | (i558 ^ i559);
                                        int i561 = ~((i557 ^ i555) | (i557 & i555));
                                        int i562 = (i560 ^ i561) | (i560 & i561);
                                        int i563 = ~i555;
                                        int i564 = i563 | 1392;
                                        int i565 = ~((i564 ^ d35) | (d35 & i564));
                                        int i566 = ((i565 ^ i562) | (i565 & i562)) * 590;
                                        int i567 = ~((i555 ^ (-1393)) | (i555 & (-1393)));
                                        int i568 = (i558 & i567) | (i558 ^ i567);
                                        int i569 = ~(i555 | i557);
                                        int i570 = (((i556 ^ i566) + ((i566 & i556) << 1)) - (~(((i569 ^ i568) | (i568 & i569)) * (-1180)))) - 1;
                                        int i571 = ~(i563 | i557);
                                        int i572 = ~((i557 ^ 1392) | (i557 & 1392));
                                        int i573 = ((i571 ^ i572) | (i571 & i572)) * 590;
                                        int i574 = -android.os.Process.getGidForName(str101);
                                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                                        g(scrollBarSize4, ((i570 | i573) << 1) - (i573 ^ i570), (i574 ^ 22) + ((i574 & 22) << 1), objArr176);
                                        java.lang.String[] strArr42 = {(java.lang.String) objArr176[0]};
                                        char tapTimeout4 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                        int i575 = -android.text.TextUtils.indexOf(str101, str101, 0, 0);
                                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                                        g(tapTimeout4, (i575 & 1415) + (i575 | 1415), 20 - (~(-android.view.KeyEvent.getDeadChar(0, 0))), objArr177);
                                        java.lang.String[] strArr43 = {(java.lang.String) objArr177[0]};
                                        int i576 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int defaultSize4 = android.view.View.getDefaultSize(0, 0);
                                        int d36 = com.facetec.sdk.mt.c.d();
                                        int i577 = (defaultSize4 * (-496)) - 712256;
                                        int i578 = ~defaultSize4;
                                        int i579 = (~(i578 | (-1437))) * 497;
                                        int i580 = (i577 ^ i579) + ((i577 & i579) << 1);
                                        int i581 = (i578 & (-1437)) | (i578 ^ (-1437));
                                        int i582 = ~d36;
                                        int i583 = (i582 ^ (-1437)) | (i582 & (-1437));
                                        int i584 = ((~((i581 ^ d36) | (i581 & d36))) | (~((i583 & defaultSize4) | (i583 ^ defaultSize4)))) * 497;
                                        int i585 = ((i580 | i584) << 1) - (i584 ^ i580);
                                        int i586 = (~(i578 | 1436)) | (~((i578 ^ i582) | (i582 & i578)));
                                        int i587 = defaultSize4 | (-1437);
                                        int i588 = ~((d36 ^ i587) | (i587 & d36));
                                        int i589 = ((i588 ^ i586) | (i588 & i586)) * 497;
                                        int i590 = -android.view.MotionEvent.axisFromString(str101);
                                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                                        g((char) (((63840 | i576) << 1) - (i576 ^ 63840)), (i585 ^ i589) + ((i589 & i585) << 1), (i590 ^ 23) + ((i590 & 23) << 1), objArr178);
                                        java.lang.String str105 = str2;
                                        java.lang.String[] strArr44 = {(java.lang.String) objArr178[0], str105};
                                        int lastIndexOf6 = android.text.TextUtils.lastIndexOf(str101, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                        char c43 = (char) ((lastIndexOf6 ^ 1) + ((lastIndexOf6 & 1) << 1));
                                        int green3 = android.graphics.Color.green(0);
                                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                                        g(c43, (green3 & 1460) + (green3 | 1460), 27 - (~(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr179);
                                        java.lang.String[] strArr45 = {(java.lang.String) objArr179[0], str105};
                                        char alpha6 = (char) android.graphics.Color.alpha(0);
                                        int i591 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                                        g(alpha6, (i591 ^ 1489) + ((i591 & 1489) << 1), 26 - (~(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr180);
                                        java.lang.String[] strArr46 = {(java.lang.String) objArr180[0], str105};
                                        int i592 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int d37 = com.facetec.sdk.mt.c.d();
                                        int i593 = i592 * (-391);
                                        int i594 = ~i592;
                                        int i595 = ~(d37 | (~d37));
                                        int i596 = (i593 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE) + (i593 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE) + (((i594 & i595) | (i594 ^ i595)) * (-196));
                                        int i597 = (i596 ^ (-392)) + ((i596 & (-392)) << 1);
                                        int i598 = ~i594;
                                        int i599 = -(-(((i598 ^ i595) | (i598 & i595)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                                        int i600 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        int i601 = -(-android.text.TextUtils.getCapsMode(str101, 0, 0));
                                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                                        g((char) ((i597 ^ i599) + ((i599 & i597) << 1)), (i600 ^ 1516) + ((i600 & 1516) << 1), (i601 & 31) + (i601 | 31), objArr181);
                                        java.lang.String[] strArr47 = {(java.lang.String) objArr181[0], str105};
                                        char c44 = (char) (309 - (~android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                        int maximumDrawingCacheSize3 = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                        int i602 = -android.text.TextUtils.indexOf(str101, str101, 0, 0);
                                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                                        g(c44, ((maximumDrawingCacheSize3 | 1546) << 1) - (maximumDrawingCacheSize3 ^ 1546), ((i602 | 27) << 1) - (i602 ^ 27), objArr182);
                                        java.lang.String[] strArr48 = {(java.lang.String) objArr182[0], str105};
                                        char absoluteGravity2 = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                                        int i603 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        int i604 = -(android.os.Process.myTid() >> 22);
                                        java.lang.Object[] objArr183 = new java.lang.Object[1];
                                        g(absoluteGravity2, (i603 ^ 1573) + ((i603 & 1573) << 1), (i604 & 32) + (i604 | 32), objArr183);
                                        java.lang.String[][] strArr49 = {strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, strArr47, strArr48, new java.lang.String[]{(java.lang.String) objArr183[0], str105}};
                                        int i605 = 1;
                                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                                        g((char) android.text.TextUtils.indexOf(str101, str101, 0), 1604 - (~(-android.text.TextUtils.indexOf(str101, str101, 0))), 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr184);
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder((java.lang.String) objArr184[0]);
                                        int i606 = i30;
                                        int i607 = 0;
                                        int i608 = 0;
                                        int i609 = 24;
                                        while (i607 < i609) {
                                            int i610 = e;
                                            int i611 = ((i610 | 59) << i605) - (i610 ^ 59);
                                            f = i611 % 128;
                                            if (i611 % 2 == 0) {
                                                strArr6 = strArr49[i607];
                                                java.lang.Object[] objArr185 = {strArr6[i605]};
                                                java.lang.Object d38 = com.facetec.sdk.al.d(1590238701);
                                                if (d38 == null) {
                                                    char minimumFlingVelocity6 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int scrollDefaultDelay3 = android.view.ViewConfiguration.getScrollDefaultDelay();
                                                    int blue3 = android.graphics.Color.blue(0);
                                                    j14 = j125;
                                                    byte b54 = (byte) 0;
                                                    byte b55 = b54;
                                                    i34 = i290;
                                                    i35 = i606;
                                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                    h(b54, b55, b55, objArr186);
                                                    d38 = com.facetec.sdk.al.c(minimumFlingVelocity6, (scrollDefaultDelay3 >> 16) + 2078, blue3 + 24, -114923755, false, (java.lang.String) objArr186[0], new java.lang.Class[]{java.lang.String.class});
                                                } else {
                                                    i34 = i290;
                                                    j14 = j125;
                                                    i35 = i606;
                                                }
                                                str12 = (java.lang.String) ((java.lang.reflect.Method) d38).invoke(null, objArr185);
                                                strArr8 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr6, 1, strArr6.length);
                                                str11 = str101;
                                                strArr7 = strArr49;
                                            } else {
                                                i34 = i290;
                                                j14 = j125;
                                                i35 = i606;
                                                strArr6 = strArr49[i607];
                                                java.lang.Object[] objArr187 = {strArr6[0]};
                                                java.lang.Object d39 = com.facetec.sdk.al.d(1590238701);
                                                if (d39 == null) {
                                                    char fadingEdgeLength4 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int scrollBarFadeDuration7 = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                                    int indexOf15 = android.text.TextUtils.indexOf(str101, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    byte b56 = (byte) 0;
                                                    byte b57 = b56;
                                                    str11 = str101;
                                                    strArr7 = strArr49;
                                                    java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                    h(b56, b57, b57, objArr188);
                                                    d39 = com.facetec.sdk.al.c(fadingEdgeLength4, 2078 - (scrollBarFadeDuration7 >> 16), 23 - indexOf15, -114923755, false, (java.lang.String) objArr188[0], new java.lang.Class[]{java.lang.String.class});
                                                } else {
                                                    str11 = str101;
                                                    strArr7 = strArr49;
                                                }
                                                str12 = (java.lang.String) ((java.lang.reflect.Method) d39).invoke(null, objArr187);
                                                strArr8 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr6, 1, strArr6.length);
                                            }
                                        }
                                        int i612 = i290;
                                        str10 = str101;
                                        j13 = j125;
                                        int i613 = i606;
                                        char size3 = (char) android.view.View.MeasureSpec.getSize(0);
                                        int i614 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                                        g(size3, (i614 ^ 1610) + ((i614 & 1610) << 1), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr189);
                                        sb.append((java.lang.String) objArr189[0]);
                                        java.lang.Object[] objArr190 = new java.lang.Object[2];
                                        if (i608 > 2) {
                                            objArr190[1] = new int[1];
                                            java.lang.String[] strArr50 = {sb.toString()};
                                            ((int[]) objArr190[1])[0] = i613;
                                            objArr190[0] = strArr50;
                                        } else {
                                            objArr190[1] = new int[]{i30};
                                            objArr190[0] = null;
                                        }
                                        int i615 = i30 ^ i612;
                                        int i616 = -i615;
                                        int i617 = ((i615 ^ i616) | (i615 & i616)) >> 31;
                                        int i618 = ((int[]) objArr190[1])[0] & (~i617);
                                        int i619 = i612 & i617;
                                        i290 = (i619 ^ i618) | (i618 & i619);
                                        strArr5 = (java.lang.String[]) objArr190[0];
                                        char tapTimeout5 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                        int trimmedLength22 = android.text.TextUtils.getTrimmedLength(str10);
                                        java.lang.Object[] objArr802 = new java.lang.Object[1];
                                        g(tapTimeout5, (trimmedLength22 ^ 891) + ((trimmedLength22 & 891) << 1), 15 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr802);
                                        java.lang.Object[] objArr812 = {(java.lang.String) objArr802[0]};
                                        d6 = com.facetec.sdk.al.d(1590238701);
                                        if (d6 != null) {
                                        }
                                        invoke = ((java.lang.reflect.Method) d6).invoke(null, objArr812);
                                        if (invoke != null) {
                                        }
                                        if (i36 != 1986687685) {
                                        }
                                        str14 = str13;
                                        strArr9 = strArr5;
                                        i37 = i290;
                                        char c242 = (char) ((-2) - (~(-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))));
                                        int i3852 = -android.graphics.Color.blue(0);
                                        java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                        g(c242, ((i3852 | 1952) << 1) - (i3852 ^ 1952), 12 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))), objArr1092);
                                        java.lang.String str652 = (java.lang.String) objArr1092[0];
                                        char maxKeyCode22 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                        int i3862 = -(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                        int i3872 = -android.graphics.Color.blue(0);
                                        java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                        g(maxKeyCode22, ((i3862 | 1965) << 1) - (i3862 ^ 1965), (i3872 ^ 5) + ((i3872 & 5) << 1), objArr1102);
                                        java.lang.String[] strArr212 = {str652, (java.lang.String) objArr1102[0]};
                                        char green22 = (char) android.graphics.Color.green(0);
                                        int lastIndexOf42 = android.text.TextUtils.lastIndexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int i3882 = -android.view.KeyEvent.getDeadChar(0, 0);
                                        java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                        g(green22, lastIndexOf42 + 1971, ((i3882 | 15) << 1) - (i3882 ^ 15), objArr1112);
                                        java.lang.String str662 = (java.lang.String) objArr1112[0];
                                        char lastIndexOf52 = (char) (android.text.TextUtils.lastIndexOf(str14, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
                                        int i3892 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                        g(lastIndexOf52, (i3892 & 1985) + (i3892 | 1985), 17 - (~(-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), objArr1122);
                                        java.lang.String str672 = (java.lang.String) objArr1122[0];
                                        char red42 = (char) android.graphics.Color.red(0);
                                        int i3902 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int scrollBarFadeDuration22 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                        java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                        g(red42, (i3902 & androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE) + (i3902 | androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE), ((scrollBarFadeDuration22 | 14) << 1) - (scrollBarFadeDuration22 ^ 14), objArr1132);
                                        java.lang.String[] strArr222 = {str662, str672, (java.lang.String) objArr1132[0]};
                                        char jumpTapTimeout32 = (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 7081);
                                        int i3912 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        int i3922 = -android.view.View.MeasureSpec.getMode(0);
                                        java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                        g(jumpTapTimeout32, (i3912 ^ 2019) + ((i3912 & 2019) << 1), ((i3922 | 21) << 1) - (i3922 ^ 21), objArr1142);
                                        java.lang.String str682 = (java.lang.String) objArr1142[0];
                                        int threadPriority22 = android.os.Process.getThreadPriority(0);
                                        char c252 = (char) (994 - (~(-(((threadPriority22 & 20) + (threadPriority22 | 20)) >> 6))));
                                        int i3932 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                        java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                        g(c252, ((i3932 | 2038) << 1) - (i3932 ^ 2038), 10 - (~android.os.Process.getGidForName(str14)), objArr1152);
                                        java.lang.String[] strArr232 = {str682, (java.lang.String) objArr1152[0]};
                                        java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                        g((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 2049 - android.graphics.Color.red(0), (-38) - (~(-(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))), objArr1162);
                                        java.lang.String str692 = (java.lang.String) objArr1162[0];
                                        char c262 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i3942 = -android.view.View.MeasureSpec.getMode(0);
                                        java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                        g(c262, (i3942 & com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED) + (i3942 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED), 6 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr1172);
                                        java.lang.String[] strArr242 = {str692, (java.lang.String) objArr1172[0]};
                                        char maximumFlingVelocity32 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int combineMeasuredStates32 = android.view.View.combineMeasuredStates(0, 0);
                                        java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                        g(maximumFlingVelocity32, (combineMeasuredStates32 & 2060) + (combineMeasuredStates32 | 2060), 26 - (~(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr1182);
                                        java.lang.String str702 = (java.lang.String) objArr1182[0];
                                        char c272 = (char) (994 - (~(-(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))));
                                        int packedPositionGroup32 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                        int i3952 = -(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                        g(c272, packedPositionGroup32 + 2039, ((i3952 | 10) << 1) - (i3952 ^ 10), objArr1192);
                                        r5 = new java.lang.String[][]{strArr212, strArr222, strArr232, strArr242, new java.lang.String[]{str702, (java.lang.String) objArr1192[0]}};
                                        int i3962 = -1;
                                        i38 = 0;
                                        context2 = context;
                                        loop7: while (true) {
                                            if (i38 < 5) {
                                            }
                                            int i4182 = i37;
                                            context2 = r5;
                                            int i4192 = (i38 ^ 40) + ((i38 & 40) << 1);
                                            i38 = (i4192 & (-39)) + (i4192 | (-39));
                                            i37 = i4182;
                                            str14 = str14;
                                            i32 = i32;
                                        }
                                        int i4202 = (~(i30 & i39)) & (i30 | i39);
                                        int i4212 = -i4202;
                                        int i4222 = ((i4202 ^ i4212) | (i4202 & i4212)) >> 31;
                                        int i4232 = (~i4222) & i41;
                                        int i4242 = i39 & i4222;
                                        ?? r12 = (i4242 & i4232) | (i4232 ^ i4242);
                                        int trimmedLength42 = android.text.TextUtils.getTrimmedLength(str15);
                                        long elapsedCpuTime52 = android.os.Process.getElapsedCpuTime();
                                        int blue22 = android.graphics.Color.blue(0);
                                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                        g((char) (((trimmedLength42 | 21819) << 1) - (trimmedLength42 ^ 21819)), 2089 - (elapsedCpuTime52 > 0L ? 1 : (elapsedCpuTime52 == 0L ? 0 : -1)), ((blue22 | 13) << 1) - (blue22 ^ 13), objArr1222);
                                        java.lang.String str712 = (java.lang.String) objArr1222[0];
                                        char c282 = (char) (53728 - (~(-(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))));
                                        int i4252 = -(-android.graphics.Color.blue(0));
                                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                        g(c282, (i4252 ^ 2101) + ((i4252 & 2101) << 1), 8 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr1232);
                                    } else {
                                        i30 = i26;
                                        strArr4 = null;
                                    }
                                    int i620 = ((~i278) & i30) | (i278 & i21);
                                    java.lang.Object[] objArr191 = {new int[]{(r2 & (~r3)) | r5}, strArr4, new int[]{i278}, new int[]{i30}};
                                    int i621 = (((((~(i21 | (-972415929))) | (~((-1056259806) | i30))) * (-370)) + 1019420143) + ((((~(i30 | (-972415929))) | (~(i21 | (-1056259806)))) | (-1073086462)) * (-370))) - 1904999708;
                                    int i622 = -(-(((i620 | (-i620)) >> 31) & 16));
                                    int i623 = -(-((i621 ^ i622) + ((i622 & i621) << 1)));
                                    int i624 = (i3 & i623) + (i3 | i623);
                                    int i625 = i624 << 13;
                                    int i626 = ((~i625) & i624) | ((~i624) & i625);
                                    int i627 = i626 ^ (i626 >>> 17);
                                    int i628 = i627 << 5;
                                    int i629 = (~i627) & i628;
                                    return objArr191;
                                }
                            }
                            i14 = i11;
                            int i1762 = i11 ^ i169;
                            int i1772 = -i1762;
                            int i1782 = ((i1762 ^ i1772) | (i1762 & i1772)) >> 31;
                            int i1792 = i14 & (~i1782);
                            int i1802 = i169 & i1782;
                            int i1812 = (i1802 ^ i1792) | (i1802 & i1792);
                            char c92 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                            int i1822 = -android.graphics.Color.rgb(0, 0, 0);
                            java.lang.Object[] objArr402 = new java.lang.Object[1];
                            g(c92, ((-16776844) & i1822) + (i1822 | (-16776844)), 23 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr402);
                            java.lang.Object[] objArr412 = {(java.lang.String) objArr402[0]};
                            d3 = com.facetec.sdk.al.d(1590238701);
                            if (d3 == null) {
                            }
                            lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d3).invoke(null, objArr412)).toLowerCase();
                            int i1832 = -android.view.View.resolveSize(0, 0);
                            int i1842 = ~((i1832 ^ 2569) | (i1832 & 2569));
                            int i1852 = ~(i1832 | i11);
                            int i1862 = ((786723 - (~(i1832 * 306))) - (~(-(-(((i1842 ^ i1852) | (i1842 & i1852)) * 305))))) - 1;
                            int i1872 = ~(i1832 | i93);
                            int i1882 = -(-(((i1872 ^ (-2570)) | (i1872 & (-2570))) * 305));
                            char c102 = (char) (((i1862 | i1882) << 1) - (i1882 ^ i1862));
                            int i1892 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                            int i1902 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                            objArr = new java.lang.Object[1];
                            g(c102, (i1892 ^ 396) + ((i1892 & 396) << 1), ((i1902 | 4) << 1) - (i1902 ^ 4), objArr);
                            if (lowerCase.contains((java.lang.String) objArr[0])) {
                            }
                            int i1932 = i11 ^ i1812;
                            int i1942 = (i1932 | (-i1932)) >> 31;
                            int i1952 = i15 & (~i1942);
                            int i1962 = i1812 & i1942;
                            int i1972 = (i1962 ^ i1952) | (i1962 & i1952);
                            int i1982 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i1992 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int green4 = android.graphics.Color.green(0);
                            java.lang.Object[] objArr432 = new java.lang.Object[1];
                            g((char) ((i1982 ^ 1) + ((i1982 & 1) << 1)), (i1992 ^ 398) + ((i1992 & 398) << 1), (green4 & 42) + (green4 | 42), objArr432);
                            java.lang.String str332 = (java.lang.String) objArr432[0];
                            char c112 = (char) (61820 - (~android.graphics.Color.alpha(0)));
                            int i2002 = -android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int i2012 = -android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                            java.lang.Object[] objArr442 = new java.lang.Object[1];
                            g(c112, (i2002 ^ 440) + ((i2002 & 440) << 1), (i2012 ^ 39) + ((i2012 & 39) << 1), objArr442);
                            java.lang.String str342 = (java.lang.String) objArr442[0];
                            int i2022 = -(-android.text.TextUtils.getCapsMode(str30, 0, 0));
                            int i2032 = -android.view.View.MeasureSpec.getMode(0);
                            java.lang.Object[] objArr452 = new java.lang.Object[1];
                            g((char) ((i2022 ^ 19667) + ((i2022 & 19667) << 1)), (i2032 & 481) + (i2032 | 481), 25 - (~(-android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr452);
                            java.lang.String str352 = (java.lang.String) objArr452[0];
                            int indexOf52 = android.text.TextUtils.indexOf(str30, str30, 0, 0);
                            java.lang.Object[] objArr462 = new java.lang.Object[1];
                            g((char) ((indexOf52 ^ 9236) + ((indexOf52 & 9236) << 1)), 508 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 26 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr462);
                            java.lang.String str362 = (java.lang.String) objArr462[0];
                            char c122 = (char) (26296 - (~android.view.View.getDefaultSize(0, 0)));
                            int i2042 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int alpha22 = android.graphics.Color.alpha(0);
                            java.lang.Object[] objArr472 = new java.lang.Object[1];
                            g(c122, 533 - (~i2042), (alpha22 ^ 27) + ((alpha22 & 27) << 1), objArr472);
                            java.lang.String str372 = (java.lang.String) objArr472[0];
                            char c132 = (char) (50243 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
                            int i2052 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr482 = new java.lang.Object[1];
                            g(c132, (i2052 & 562) + (i2052 | 562), 27 - android.text.TextUtils.getTrimmedLength(str30), objArr482);
                            strArr2 = new java.lang.String[]{str332, str342, str352, str362, str372, (java.lang.String) objArr482[0]};
                            i16 = 6;
                            i17 = 0;
                            while (true) {
                                if (i17 >= i16) {
                                }
                                int i2072 = ((i17 | 59) << 1) - (i17 ^ 59);
                                i17 = ((i2072 | (-58)) << 1) - (i2072 ^ (-58));
                                strArr2 = strArr13;
                                i16 = 6;
                            }
                            int i2082 = (~(i11 & i1972)) & (i11 | i1972);
                            int i2092 = -i2082;
                            int i2102 = ((i2082 ^ i2092) | (i2082 & i2092)) >> 31;
                            int i2112 = i18 & (~i2102);
                            int i2122 = i1972 & i2102;
                            int i2132 = (i2122 ^ i2112) | (i2122 & i2112);
                            java.lang.Object[] objArr512 = new java.lang.Object[1];
                            g((char) (android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 59412), 347 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 16 - (~(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))), objArr512);
                            java.lang.String str392 = (java.lang.String) objArr512[0];
                            char packedPositionType3 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i2142 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i2152 = -(-android.text.TextUtils.indexOf(str30, str30, 0));
                            java.lang.Object[] objArr522 = new java.lang.Object[1];
                            g(packedPositionType3, ((i2142 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR) << 1) - (i2142 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR), (i2152 ^ 6) + ((i2152 & 6) << 1), objArr522);
                            java.lang.Object[] objArr532 = {str392, (java.lang.String) objArr522[0]};
                            d4 = com.facetec.sdk.al.d(-100890377);
                            if (d4 == null) {
                            }
                            long longValue62 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr532)).longValue();
                            long j442 = -301827732;
                            int freeMemory22 = (int) java.lang.Runtime.getRuntime().freeMemory();
                            long j452 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                            long j462 = -520;
                            long j472 = -1042;
                            long j482 = freeMemory22;
                            long j492 = j482 ^ j30;
                            long j502 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                            long j512 = j442 ^ j30;
                            long j522 = (((((j452 * j442) + (j462 * longValue62)) + ((j442 | ((j492 | longValue62) ^ j30)) * j472)) + ((longValue62 | j482) * j502)) + (((((j512 | (longValue62 ^ j30)) ^ j30) | ((j512 | j482) ^ j30)) | (((j492 | j442) | longValue62) ^ j30)) * j502)) - 1718236415;
                            int maxMemory4 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            int i2162 = (~((-1231491374) | maxMemory4)) | 138608685;
                            i19 = ((int) (j522 >> 32)) & ((i2162 * 992) + 1537498186 + ((i2162 | (~((~maxMemory4) | 1298617725))) * (-496)) + ((maxMemory4 | 205735037) * 496));
                            int i2172 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                            int i2182 = ~(112608238 | i2172);
                            i20 = ((int) j522) & ((((-1549834649) | i2182) * 764) + 316485077 + (((~(i2172 | (-1549834649))) | 69206408) * (-1528)) + (((-1524030071) | i2182) * 764));
                            if (((i20 ^ i19) | (i19 & i20)) != 0) {
                            }
                            int i2292 = ((~i2132) & i11) | (i2132 & i21);
                            int i2302 = -i2292;
                            int i2312 = ((i2292 ^ i2302) | (i2292 & i2302)) >> 31;
                            int i2322 = i22 & (~i2312);
                            int i2332 = i2132 & i2312;
                            int i2342 = (i2322 ^ i2332) | (i2322 & i2332);
                            if ((i2 & 8) == 0) {
                            }
                            int i2532 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int scrollBarFadeDuration8 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            int myPid42 = android.os.Process.myPid() >> 22;
                            java.lang.Object[] objArr662 = new java.lang.Object[1];
                            g((char) ((36344 & i2532) + (i2532 | 36344)), (scrollBarFadeDuration8 & 739) + (scrollBarFadeDuration8 | 739), (myPid42 & 41) + (myPid42 | 41), objArr662);
                            java.lang.String str432 = (java.lang.String) objArr662[0];
                            int i2542 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i2552 = i2542 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                            int i2562 = ((-5237615) & i2552) + (i2552 | (-5237615)) + ((~((i2542 ^ i23) | (i2542 & i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                            int i2572 = (i2542 ^ (-24362)) | (i2542 & (-24362));
                            int i2582 = -(-(((i2572 ^ i21) | (i2572 & i21)) * (-216)));
                            int i2592 = ((i2562 | i2582) << 1) - (i2582 ^ i2562);
                            int i2602 = -(-(((~(i2542 | i21)) | 24361) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                            char c152 = (char) ((i2592 ^ i2602) + ((i2602 & i2592) << 1));
                            int makeMeasureSpec22 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i2612 = -(-android.view.KeyEvent.normalizeMetaState(0));
                            java.lang.Object[] objArr672 = new java.lang.Object[1];
                            g(c152, 780 - makeMeasureSpec22, (i2612 ^ 30) + ((i2612 & 30) << 1), objArr672);
                            strArr3 = new java.lang.String[]{str432, (java.lang.String) objArr672[0]};
                            i24 = 2;
                            i25 = 0;
                            while (true) {
                                if (i25 >= i24) {
                                }
                                int i2722 = (i45 ^ (-70)) + ((i45 & (-70)) << 1);
                                i25 = ((i2722 | 71) << 1) - (i2722 ^ 71);
                                strArr3 = strArr12;
                                i23 = i26;
                                i24 = 2;
                            }
                            int i2732 = ((~i2342) & i26) | (i2342 & i21);
                            int i2742 = -i2732;
                            int i2752 = ((i2732 ^ i2742) | (i2732 & i2742)) >> 31;
                            int i2762 = i27 & (~i2752);
                            int i2772 = i2342 & i2752;
                            int i2782 = (i2772 ^ i2762) | (i2772 & i2762);
                            d5 = com.facetec.sdk.al.d(-1270134912);
                            if (d5 == null) {
                            }
                            long longValue112 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
                            long j732 = -1272221696;
                            int maxMemory22 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            long j742 = -183;
                            long j752 = 185;
                            long j762 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                            long j772 = j732 ^ j30;
                            long j782 = maxMemory22;
                            long j792 = j782 ^ j30;
                            long j802 = -184;
                            long j812 = (((((j742 * j732) + (j752 * longValue112)) + ((((j772 | longValue112) ^ j30) | ((j792 | longValue112) ^ j30)) * j762)) + ((j782 | (((longValue112 ^ j30) | j732) ^ j30)) * j802)) + (((j772 | j792) ^ j30) * j762)) - 552700797;
                            int elapsedCpuTime22 = (int) android.os.Process.getElapsedCpuTime();
                            int i2792 = ~(2020424372 | elapsedCpuTime22);
                            i28 = ((int) (j812 >> 32)) & (((((~(elapsedCpuTime22 | 583197961)) | ((~((-2020424373) | elapsedCpuTime22)) | 1479350964)) * (-880)) - 818885110) + (((~((~elapsedCpuTime22) | (-2020424373))) | (-583197962) | i2792) * (-880)) + (i2792 * 880));
                            int myUid32 = android.os.Process.myUid();
                            int i2802 = ~myUid32;
                            i29 = ((int) j812) & ((((~(1505216840 | myUid32)) | (-1572862943) | (~(67990430 | myUid32))) * (-754)) + 2070432247 + (((~(myUid32 | 1572862942)) | (~((-1504872513) | i2802))) * (-754)) + ((1505216840 | i2802) * 754));
                            if (((i29 ^ i28) | (i28 & i29)) != 1) {
                            }
                            int i6202 = ((~i2782) & i30) | (i2782 & i21);
                            java.lang.Object[] objArr1912 = {new int[]{(i627 & (~i628)) | i629}, strArr4, new int[]{i2782}, new int[]{i30}};
                            int i6212 = (((((~(i21 | (-972415929))) | (~((-1056259806) | i30))) * (-370)) + 1019420143) + ((((~(i30 | (-972415929))) | (~(i21 | (-1056259806)))) | (-1073086462)) * (-370))) - 1904999708;
                            int i6222 = -(-(((i6202 | (-i6202)) >> 31) & 16));
                            int i6232 = -(-((i6212 ^ i6222) + ((i6222 & i6212) << 1)));
                            int i6242 = (i3 & i6232) + (i3 | i6232);
                            int i6252 = i6242 << 13;
                            int i6262 = ((~i6252) & i6242) | ((~i6242) & i6252);
                            int i6272 = i6262 ^ (i6262 >>> 17);
                            int i6282 = i6272 << 5;
                            int i6292 = (~i6272) & i6282;
                            return objArr1912;
                        }
                    }
                    i13 = i11;
                    int i1642 = ((~i163) & i11) | (i163 & i93);
                    int i1652 = -i1642;
                    int i1662 = ((i1642 ^ i1652) | (i1642 & i1652)) >> 31;
                    int i1672 = i13 & (~i1662);
                    int i1682 = i163 & i1662;
                    int i1692 = (i1682 ^ i1672) | (i1682 & i1672);
                    int i1702 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                    int i1712 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    java.lang.Object[] objArr372 = new java.lang.Object[1];
                    g((char) (((59411 | i1702) << 1) - (i1702 ^ 59411)), (i1712 ^ 349) + ((i1712 & 349) << 1), android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr372);
                    java.lang.String str312 = (java.lang.String) objArr372[0];
                    char maximumFlingVelocity6 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i1722 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                    java.lang.Object[] objArr382 = new java.lang.Object[1];
                    g(maximumFlingVelocity6, (i1722 & 366) + (i1722 | 366), 5 - (~(-android.graphics.Color.green(0))), objArr382);
                    java.lang.String str322 = (java.lang.String) objArr382[0];
                    file2 = new java.io.File(str312);
                    if (file2.exists()) {
                    }
                    i14 = i11;
                    int i17622 = i11 ^ i1692;
                    int i17722 = -i17622;
                    int i17822 = ((i17622 ^ i17722) | (i17622 & i17722)) >> 31;
                    int i17922 = i14 & (~i17822);
                    int i18022 = i1692 & i17822;
                    int i18122 = (i18022 ^ i17922) | (i18022 & i17922);
                    char c922 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    int i18222 = -android.graphics.Color.rgb(0, 0, 0);
                    java.lang.Object[] objArr4022 = new java.lang.Object[1];
                    g(c922, ((-16776844) & i18222) + (i18222 | (-16776844)), 23 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr4022);
                    java.lang.Object[] objArr4122 = {(java.lang.String) objArr4022[0]};
                    d3 = com.facetec.sdk.al.d(1590238701);
                    if (d3 == null) {
                    }
                    lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d3).invoke(null, objArr4122)).toLowerCase();
                    int i18322 = -android.view.View.resolveSize(0, 0);
                    int i18422 = ~((i18322 ^ 2569) | (i18322 & 2569));
                    int i18522 = ~(i18322 | i11);
                    int i18622 = ((786723 - (~(i18322 * 306))) - (~(-(-(((i18422 ^ i18522) | (i18422 & i18522)) * 305))))) - 1;
                    int i18722 = ~(i18322 | i93);
                    int i18822 = -(-(((i18722 ^ (-2570)) | (i18722 & (-2570))) * 305));
                    char c1022 = (char) (((i18622 | i18822) << 1) - (i18822 ^ i18622));
                    int i18922 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                    int i19022 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                    objArr = new java.lang.Object[1];
                    g(c1022, (i18922 ^ 396) + ((i18922 & 396) << 1), ((i19022 | 4) << 1) - (i19022 ^ 4), objArr);
                    if (lowerCase.contains((java.lang.String) objArr[0])) {
                    }
                    int i19322 = i11 ^ i18122;
                    int i19422 = (i19322 | (-i19322)) >> 31;
                    int i19522 = i15 & (~i19422);
                    int i19622 = i18122 & i19422;
                    int i19722 = (i19622 ^ i19522) | (i19622 & i19522);
                    int i19822 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i19922 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int green42 = android.graphics.Color.green(0);
                    java.lang.Object[] objArr4322 = new java.lang.Object[1];
                    g((char) ((i19822 ^ 1) + ((i19822 & 1) << 1)), (i19922 ^ 398) + ((i19922 & 398) << 1), (green42 & 42) + (green42 | 42), objArr4322);
                    java.lang.String str3322 = (java.lang.String) objArr4322[0];
                    char c1122 = (char) (61820 - (~android.graphics.Color.alpha(0)));
                    int i20022 = -android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int i20122 = -android.text.TextUtils.lastIndexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    java.lang.Object[] objArr4422 = new java.lang.Object[1];
                    g(c1122, (i20022 ^ 440) + ((i20022 & 440) << 1), (i20122 ^ 39) + ((i20122 & 39) << 1), objArr4422);
                    java.lang.String str3422 = (java.lang.String) objArr4422[0];
                    int i20222 = -(-android.text.TextUtils.getCapsMode(str30, 0, 0));
                    int i20322 = -android.view.View.MeasureSpec.getMode(0);
                    java.lang.Object[] objArr4522 = new java.lang.Object[1];
                    g((char) ((i20222 ^ 19667) + ((i20222 & 19667) << 1)), (i20322 & 481) + (i20322 | 481), 25 - (~(-android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr4522);
                    java.lang.String str3522 = (java.lang.String) objArr4522[0];
                    int indexOf522 = android.text.TextUtils.indexOf(str30, str30, 0, 0);
                    java.lang.Object[] objArr4622 = new java.lang.Object[1];
                    g((char) ((indexOf522 ^ 9236) + ((indexOf522 & 9236) << 1)), 508 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 26 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr4622);
                    java.lang.String str3622 = (java.lang.String) objArr4622[0];
                    char c1222 = (char) (26296 - (~android.view.View.getDefaultSize(0, 0)));
                    int i20422 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int alpha222 = android.graphics.Color.alpha(0);
                    java.lang.Object[] objArr4722 = new java.lang.Object[1];
                    g(c1222, 533 - (~i20422), (alpha222 ^ 27) + ((alpha222 & 27) << 1), objArr4722);
                    java.lang.String str3722 = (java.lang.String) objArr4722[0];
                    char c1322 = (char) (50243 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
                    int i20522 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr4822 = new java.lang.Object[1];
                    g(c1322, (i20522 & 562) + (i20522 | 562), 27 - android.text.TextUtils.getTrimmedLength(str30), objArr4822);
                    strArr2 = new java.lang.String[]{str3322, str3422, str3522, str3622, str3722, (java.lang.String) objArr4822[0]};
                    i16 = 6;
                    i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                        }
                        int i20722 = ((i17 | 59) << 1) - (i17 ^ 59);
                        i17 = ((i20722 | (-58)) << 1) - (i20722 ^ (-58));
                        strArr2 = strArr13;
                        i16 = 6;
                    }
                    int i20822 = (~(i11 & i19722)) & (i11 | i19722);
                    int i20922 = -i20822;
                    int i21022 = ((i20822 ^ i20922) | (i20822 & i20922)) >> 31;
                    int i21122 = i18 & (~i21022);
                    int i21222 = i19722 & i21022;
                    int i21322 = (i21222 ^ i21122) | (i21222 & i21122);
                    java.lang.Object[] objArr5122 = new java.lang.Object[1];
                    g((char) (android.text.TextUtils.indexOf(str30, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 59412), 347 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 16 - (~(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))), objArr5122);
                    java.lang.String str3922 = (java.lang.String) objArr5122[0];
                    char packedPositionType32 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                    int i21422 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int i21522 = -(-android.text.TextUtils.indexOf(str30, str30, 0));
                    java.lang.Object[] objArr5222 = new java.lang.Object[1];
                    g(packedPositionType32, ((i21422 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR) << 1) - (i21422 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR), (i21522 ^ 6) + ((i21522 & 6) << 1), objArr5222);
                    java.lang.Object[] objArr5322 = {str3922, (java.lang.String) objArr5222[0]};
                    d4 = com.facetec.sdk.al.d(-100890377);
                    if (d4 == null) {
                    }
                    long longValue622 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr5322)).longValue();
                    long j4422 = -301827732;
                    int freeMemory222 = (int) java.lang.Runtime.getRuntime().freeMemory();
                    long j4522 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                    long j4622 = -520;
                    long j4722 = -1042;
                    long j4822 = freeMemory222;
                    long j4922 = j4822 ^ j30;
                    long j5022 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                    long j5122 = j4422 ^ j30;
                    long j5222 = (((((j4522 * j4422) + (j4622 * longValue622)) + ((j4422 | ((j4922 | longValue622) ^ j30)) * j4722)) + ((longValue622 | j4822) * j5022)) + (((((j5122 | (longValue622 ^ j30)) ^ j30) | ((j5122 | j4822) ^ j30)) | (((j4922 | j4422) | longValue622) ^ j30)) * j5022)) - 1718236415;
                    int maxMemory42 = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i21622 = (~((-1231491374) | maxMemory42)) | 138608685;
                    i19 = ((int) (j5222 >> 32)) & ((i21622 * 992) + 1537498186 + ((i21622 | (~((~maxMemory42) | 1298617725))) * (-496)) + ((maxMemory42 | 205735037) * 496));
                    int i21722 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                    int i21822 = ~(112608238 | i21722);
                    i20 = ((int) j5222) & ((((-1549834649) | i21822) * 764) + 316485077 + (((~(i21722 | (-1549834649))) | 69206408) * (-1528)) + (((-1524030071) | i21822) * 764));
                    if (((i20 ^ i19) | (i19 & i20)) != 0) {
                    }
                    int i22922 = ((~i21322) & i11) | (i21322 & i21);
                    int i23022 = -i22922;
                    int i23122 = ((i22922 ^ i23022) | (i22922 & i23022)) >> 31;
                    int i23222 = i22 & (~i23122);
                    int i23322 = i21322 & i23122;
                    int i23422 = (i23222 ^ i23322) | (i23222 & i23322);
                    if ((i2 & 8) == 0) {
                    }
                    int i25322 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int scrollBarFadeDuration82 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    int myPid422 = android.os.Process.myPid() >> 22;
                    java.lang.Object[] objArr6622 = new java.lang.Object[1];
                    g((char) ((36344 & i25322) + (i25322 | 36344)), (scrollBarFadeDuration82 & 739) + (scrollBarFadeDuration82 | 739), (myPid422 & 41) + (myPid422 | 41), objArr6622);
                    java.lang.String str4322 = (java.lang.String) objArr6622[0];
                    int i25422 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i25522 = i25422 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                    int i25622 = ((-5237615) & i25522) + (i25522 | (-5237615)) + ((~((i25422 ^ i23) | (i25422 & i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                    int i25722 = (i25422 ^ (-24362)) | (i25422 & (-24362));
                    int i25822 = -(-(((i25722 ^ i21) | (i25722 & i21)) * (-216)));
                    int i25922 = ((i25622 | i25822) << 1) - (i25822 ^ i25622);
                    int i26022 = -(-(((~(i25422 | i21)) | 24361) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                    char c1522 = (char) ((i25922 ^ i26022) + ((i26022 & i25922) << 1));
                    int makeMeasureSpec222 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i26122 = -(-android.view.KeyEvent.normalizeMetaState(0));
                    java.lang.Object[] objArr6722 = new java.lang.Object[1];
                    g(c1522, 780 - makeMeasureSpec222, (i26122 ^ 30) + ((i26122 & 30) << 1), objArr6722);
                    strArr3 = new java.lang.String[]{str4322, (java.lang.String) objArr6722[0]};
                    i24 = 2;
                    i25 = 0;
                    while (true) {
                        if (i25 >= i24) {
                        }
                        int i27222 = (i45 ^ (-70)) + ((i45 & (-70)) << 1);
                        i25 = ((i27222 | 71) << 1) - (i27222 ^ 71);
                        strArr3 = strArr12;
                        i23 = i26;
                        i24 = 2;
                    }
                    int i27322 = ((~i23422) & i26) | (i23422 & i21);
                    int i27422 = -i27322;
                    int i27522 = ((i27322 ^ i27422) | (i27322 & i27422)) >> 31;
                    int i27622 = i27 & (~i27522);
                    int i27722 = i23422 & i27522;
                    int i27822 = (i27722 ^ i27622) | (i27722 & i27622);
                    d5 = com.facetec.sdk.al.d(-1270134912);
                    if (d5 == null) {
                    }
                    long longValue1122 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
                    long j7322 = -1272221696;
                    int maxMemory222 = (int) java.lang.Runtime.getRuntime().maxMemory();
                    long j7422 = -183;
                    long j7522 = 185;
                    long j7622 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                    long j7722 = j7322 ^ j30;
                    long j7822 = maxMemory222;
                    long j7922 = j7822 ^ j30;
                    long j8022 = -184;
                    long j8122 = (((((j7422 * j7322) + (j7522 * longValue1122)) + ((((j7722 | longValue1122) ^ j30) | ((j7922 | longValue1122) ^ j30)) * j7622)) + ((j7822 | (((longValue1122 ^ j30) | j7322) ^ j30)) * j8022)) + (((j7722 | j7922) ^ j30) * j7622)) - 552700797;
                    int elapsedCpuTime222 = (int) android.os.Process.getElapsedCpuTime();
                    int i27922 = ~(2020424372 | elapsedCpuTime222);
                    i28 = ((int) (j8122 >> 32)) & (((((~(elapsedCpuTime222 | 583197961)) | ((~((-2020424373) | elapsedCpuTime222)) | 1479350964)) * (-880)) - 818885110) + (((~((~elapsedCpuTime222) | (-2020424373))) | (-583197962) | i27922) * (-880)) + (i27922 * 880));
                    int myUid322 = android.os.Process.myUid();
                    int i28022 = ~myUid322;
                    i29 = ((int) j8122) & ((((~(1505216840 | myUid322)) | (-1572862943) | (~(67990430 | myUid322))) * (-754)) + 2070432247 + (((~(myUid322 | 1572862942)) | (~((-1504872513) | i28022))) * (-754)) + ((1505216840 | i28022) * 754));
                    if (((i29 ^ i28) | (i28 & i29)) != 1) {
                    }
                    int i62022 = ((~i27822) & i30) | (i27822 & i21);
                    java.lang.Object[] objArr19122 = {new int[]{(i6272 & (~i6282)) | i6292}, strArr4, new int[]{i27822}, new int[]{i30}};
                    int i62122 = (((((~(i21 | (-972415929))) | (~((-1056259806) | i30))) * (-370)) + 1019420143) + ((((~(i30 | (-972415929))) | (~(i21 | (-1056259806)))) | (-1073086462)) * (-370))) - 1904999708;
                    int i62222 = -(-(((i62022 | (-i62022)) >> 31) & 16));
                    int i62322 = -(-((i62122 ^ i62222) + ((i62222 & i62122) << 1)));
                    int i62422 = (i3 & i62322) + (i3 | i62322);
                    int i62522 = i62422 << 13;
                    int i62622 = ((~i62522) & i62422) | ((~i62422) & i62522);
                    int i62722 = i62622 ^ (i62622 >>> 17);
                    int i62822 = i62722 << 5;
                    int i62922 = (~i62722) & i62822;
                    return objArr19122;
                }
                i9 = 0;
                int i1242 = -i9;
                int i1252 = ((i9 ^ i1242) | (i9 & i1242)) >> 31;
                int i1262 = (~i1252) & i;
                int i1272 = i1252 & ((i & (-263)) | (i93 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                int i1282 = (~(i & i116)) & (i | i116);
                int i1292 = -i1282;
                int i1302 = ((i1282 ^ i1292) | (i1282 & i1292)) >> 31;
                int i1312 = ((i1272 ^ i1262) | (i1272 & i1262)) & (~i1302);
                int i1322 = i116 & i1302;
                int i1332 = (i1322 ^ i1312) | (i1322 & i1312);
                int i1342 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                int i1352 = -android.view.View.MeasureSpec.getMode(0);
                int i1362 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                java.lang.Object[] objArr272 = new java.lang.Object[1];
                g((char) ((33873 ^ i1342) + ((i1342 & 33873) << 1)), 230 - (~i1352), (i1362 ^ 32) + ((i1362 & 32) << 1), objArr272);
                java.lang.String str272 = (java.lang.String) objArr272[0];
                int i1372 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i1382 = -android.text.TextUtils.getTrimmedLength(str7);
                int i1392 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                int i1402 = i1392 * 615;
                int i1412 = (i1402 & (-14099)) + (i1402 | (-14099));
                int i1422 = ~i1392;
                int i1432 = ~((i1422 & 23) | (i1422 ^ 23));
                int i1442 = (i1432 & i) | (i ^ i1432);
                int i1452 = ~((i1392 & (-24)) | (i1392 ^ (-24)));
                int i1462 = ((i1442 & i1452) | (i1442 ^ i1452)) * 614;
                int i1472 = ~((i1422 ^ i93) | (i1422 & i93));
                int i1482 = (i1472 ^ i1432) | (i1432 & i1472);
                int i1492 = ~((i93 ^ 23) | (i93 & 23));
                int i1502 = (i1422 ^ (-24)) | (i1422 & (-24));
                int i1512 = ~((i1502 ^ i93) | (i1502 & i93));
                int i1522 = (i1392 ^ i93) | (i1392 & i93);
                int i1532 = ~((i1522 ^ 23) | (i1522 & 23));
                java.lang.Object[] objArr282 = new java.lang.Object[1];
                g((char) ((39405 & i1372) + (i1372 | 39405)), ((i1382 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) << 1) - (i1382 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), ((((((i1412 | i1462) << 1) - (i1462 ^ i1412)) - (~(-(-(((i1482 ^ i1492) | (i1482 & i1492)) * (-1228)))))) - 1) - (~(((i1532 & i1512) | (i1532 ^ i1512)) * 614))) - 1, objArr282);
                java.lang.String str282 = (java.lang.String) objArr282[0];
                char c72 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int resolveOpacity22 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                int i1542 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                java.lang.Object[] objArr292 = new java.lang.Object[1];
                g(c72, 285 - resolveOpacity22, ((i1542 | 28) << 1) - (i1542 ^ 28), objArr292);
                java.lang.String str292 = (java.lang.String) objArr292[0];
                java.lang.Object[] objArr302 = new java.lang.Object[1];
                g((char) android.view.KeyEvent.getDeadChar(0, 0), 314 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - (~(-(-android.view.View.resolveSizeAndState(0, 0, 0)))), objArr302);
                strArr = new java.lang.String[]{str272, str282, str292, (java.lang.String) objArr302[0]};
                i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                    }
                    i10 = ((i50 & 1) << 1) + (i50 ^ 1);
                    strArr = strArr14;
                    str7 = str8;
                }
                int i1602 = i11 ^ i1332;
                int i1612 = -i1602;
                int i1622 = ((i1602 ^ i1612) | (i1602 & i1612)) >> 31;
                int i1632 = (i12 & (~i1622)) | (i1332 & i1622);
                java.lang.String str302 = str8;
                java.lang.Object[] objArr332 = new java.lang.Object[1];
                g((char) (29249 - android.text.TextUtils.getOffsetAfter(str302, 0)), android.graphics.Color.blue(0) + 327, 12 - (~(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr332);
                java.lang.Object[] objArr342 = {(java.lang.String) objArr332[0]};
                d2 = com.facetec.sdk.al.d(1590238701);
                if (d2 == null) {
                }
                str9 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr342);
                if (str9 != null) {
                }
                i13 = i11;
                int i16422 = ((~i1632) & i11) | (i1632 & i93);
                int i16522 = -i16422;
                int i16622 = ((i16422 ^ i16522) | (i16422 & i16522)) >> 31;
                int i16722 = i13 & (~i16622);
                int i16822 = i1632 & i16622;
                int i16922 = (i16822 ^ i16722) | (i16822 & i16722);
                int i17022 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
                int i17122 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                java.lang.Object[] objArr3722 = new java.lang.Object[1];
                g((char) (((59411 | i17022) << 1) - (i17022 ^ 59411)), (i17122 ^ 349) + ((i17122 & 349) << 1), android.text.TextUtils.lastIndexOf(str302, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr3722);
                java.lang.String str3122 = (java.lang.String) objArr3722[0];
                char maximumFlingVelocity62 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i17222 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                java.lang.Object[] objArr3822 = new java.lang.Object[1];
                g(maximumFlingVelocity62, (i17222 & 366) + (i17222 | 366), 5 - (~(-android.graphics.Color.green(0))), objArr3822);
                java.lang.String str3222 = (java.lang.String) objArr3822[0];
                file2 = new java.io.File(str3122);
                if (file2.exists()) {
                }
                i14 = i11;
                int i176222 = i11 ^ i16922;
                int i177222 = -i176222;
                int i178222 = ((i176222 ^ i177222) | (i176222 & i177222)) >> 31;
                int i179222 = i14 & (~i178222);
                int i180222 = i16922 & i178222;
                int i181222 = (i180222 ^ i179222) | (i180222 & i179222);
                char c9222 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                int i182222 = -android.graphics.Color.rgb(0, 0, 0);
                java.lang.Object[] objArr40222 = new java.lang.Object[1];
                g(c9222, ((-16776844) & i182222) + (i182222 | (-16776844)), 23 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr40222);
                java.lang.Object[] objArr41222 = {(java.lang.String) objArr40222[0]};
                d3 = com.facetec.sdk.al.d(1590238701);
                if (d3 == null) {
                }
                lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d3).invoke(null, objArr41222)).toLowerCase();
                int i183222 = -android.view.View.resolveSize(0, 0);
                int i184222 = ~((i183222 ^ 2569) | (i183222 & 2569));
                int i185222 = ~(i183222 | i11);
                int i186222 = ((786723 - (~(i183222 * 306))) - (~(-(-(((i184222 ^ i185222) | (i184222 & i185222)) * 305))))) - 1;
                int i187222 = ~(i183222 | i93);
                int i188222 = -(-(((i187222 ^ (-2570)) | (i187222 & (-2570))) * 305));
                char c10222 = (char) (((i186222 | i188222) << 1) - (i188222 ^ i186222));
                int i189222 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                int i190222 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                objArr = new java.lang.Object[1];
                g(c10222, (i189222 ^ 396) + ((i189222 & 396) << 1), ((i190222 | 4) << 1) - (i190222 ^ 4), objArr);
                if (lowerCase.contains((java.lang.String) objArr[0])) {
                }
                int i193222 = i11 ^ i181222;
                int i194222 = (i193222 | (-i193222)) >> 31;
                int i195222 = i15 & (~i194222);
                int i196222 = i181222 & i194222;
                int i197222 = (i196222 ^ i195222) | (i196222 & i195222);
                int i198222 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i199222 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int green422 = android.graphics.Color.green(0);
                java.lang.Object[] objArr43222 = new java.lang.Object[1];
                g((char) ((i198222 ^ 1) + ((i198222 & 1) << 1)), (i199222 ^ 398) + ((i199222 & 398) << 1), (green422 & 42) + (green422 | 42), objArr43222);
                java.lang.String str33222 = (java.lang.String) objArr43222[0];
                char c11222 = (char) (61820 - (~android.graphics.Color.alpha(0)));
                int i200222 = -android.text.TextUtils.lastIndexOf(str302, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int i201222 = -android.text.TextUtils.lastIndexOf(str302, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                java.lang.Object[] objArr44222 = new java.lang.Object[1];
                g(c11222, (i200222 ^ 440) + ((i200222 & 440) << 1), (i201222 ^ 39) + ((i201222 & 39) << 1), objArr44222);
                java.lang.String str34222 = (java.lang.String) objArr44222[0];
                int i202222 = -(-android.text.TextUtils.getCapsMode(str302, 0, 0));
                int i203222 = -android.view.View.MeasureSpec.getMode(0);
                java.lang.Object[] objArr45222 = new java.lang.Object[1];
                g((char) ((i202222 ^ 19667) + ((i202222 & 19667) << 1)), (i203222 & 481) + (i203222 | 481), 25 - (~(-android.text.TextUtils.indexOf(str302, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr45222);
                java.lang.String str35222 = (java.lang.String) objArr45222[0];
                int indexOf5222 = android.text.TextUtils.indexOf(str302, str302, 0, 0);
                java.lang.Object[] objArr46222 = new java.lang.Object[1];
                g((char) ((indexOf5222 ^ 9236) + ((indexOf5222 & 9236) << 1)), 508 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 26 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr46222);
                java.lang.String str36222 = (java.lang.String) objArr46222[0];
                char c12222 = (char) (26296 - (~android.view.View.getDefaultSize(0, 0)));
                int i204222 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int alpha2222 = android.graphics.Color.alpha(0);
                java.lang.Object[] objArr47222 = new java.lang.Object[1];
                g(c12222, 533 - (~i204222), (alpha2222 ^ 27) + ((alpha2222 & 27) << 1), objArr47222);
                java.lang.String str37222 = (java.lang.String) objArr47222[0];
                char c13222 = (char) (50243 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
                int i205222 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                java.lang.Object[] objArr48222 = new java.lang.Object[1];
                g(c13222, (i205222 & 562) + (i205222 | 562), 27 - android.text.TextUtils.getTrimmedLength(str302), objArr48222);
                strArr2 = new java.lang.String[]{str33222, str34222, str35222, str36222, str37222, (java.lang.String) objArr48222[0]};
                i16 = 6;
                i17 = 0;
                while (true) {
                    if (i17 >= i16) {
                    }
                    int i207222 = ((i17 | 59) << 1) - (i17 ^ 59);
                    i17 = ((i207222 | (-58)) << 1) - (i207222 ^ (-58));
                    strArr2 = strArr13;
                    i16 = 6;
                }
                int i208222 = (~(i11 & i197222)) & (i11 | i197222);
                int i209222 = -i208222;
                int i210222 = ((i208222 ^ i209222) | (i208222 & i209222)) >> 31;
                int i211222 = i18 & (~i210222);
                int i212222 = i197222 & i210222;
                int i213222 = (i212222 ^ i211222) | (i212222 & i211222);
                java.lang.Object[] objArr51222 = new java.lang.Object[1];
                g((char) (android.text.TextUtils.indexOf(str302, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 59412), 347 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 16 - (~(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))), objArr51222);
                java.lang.String str39222 = (java.lang.String) objArr51222[0];
                char packedPositionType322 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                int i214222 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i215222 = -(-android.text.TextUtils.indexOf(str302, str302, 0));
                java.lang.Object[] objArr52222 = new java.lang.Object[1];
                g(packedPositionType322, ((i214222 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR) << 1) - (i214222 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR), (i215222 ^ 6) + ((i215222 & 6) << 1), objArr52222);
                java.lang.Object[] objArr53222 = {str39222, (java.lang.String) objArr52222[0]};
                d4 = com.facetec.sdk.al.d(-100890377);
                if (d4 == null) {
                }
                long longValue6222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr53222)).longValue();
                long j44222 = -301827732;
                int freeMemory2222 = (int) java.lang.Runtime.getRuntime().freeMemory();
                long j45222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
                long j46222 = -520;
                long j47222 = -1042;
                long j48222 = freeMemory2222;
                long j49222 = j48222 ^ j30;
                long j50222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                long j51222 = j44222 ^ j30;
                long j52222 = (((((j45222 * j44222) + (j46222 * longValue6222)) + ((j44222 | ((j49222 | longValue6222) ^ j30)) * j47222)) + ((longValue6222 | j48222) * j50222)) + (((((j51222 | (longValue6222 ^ j30)) ^ j30) | ((j51222 | j48222) ^ j30)) | (((j49222 | j44222) | longValue6222) ^ j30)) * j50222)) - 1718236415;
                int maxMemory422 = (int) java.lang.Runtime.getRuntime().maxMemory();
                int i216222 = (~((-1231491374) | maxMemory422)) | 138608685;
                i19 = ((int) (j52222 >> 32)) & ((i216222 * 992) + 1537498186 + ((i216222 | (~((~maxMemory422) | 1298617725))) * (-496)) + ((maxMemory422 | 205735037) * 496));
                int i217222 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
                int i218222 = ~(112608238 | i217222);
                i20 = ((int) j52222) & ((((-1549834649) | i218222) * 764) + 316485077 + (((~(i217222 | (-1549834649))) | 69206408) * (-1528)) + (((-1524030071) | i218222) * 764));
                if (((i20 ^ i19) | (i19 & i20)) != 0) {
                }
                int i229222 = ((~i213222) & i11) | (i213222 & i21);
                int i230222 = -i229222;
                int i231222 = ((i229222 ^ i230222) | (i229222 & i230222)) >> 31;
                int i232222 = i22 & (~i231222);
                int i233222 = i213222 & i231222;
                int i234222 = (i232222 ^ i233222) | (i232222 & i233222);
                if ((i2 & 8) == 0) {
                }
                int i253222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int scrollBarFadeDuration822 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                int myPid4222 = android.os.Process.myPid() >> 22;
                java.lang.Object[] objArr66222 = new java.lang.Object[1];
                g((char) ((36344 & i253222) + (i253222 | 36344)), (scrollBarFadeDuration822 & 739) + (scrollBarFadeDuration822 | 739), (myPid4222 & 41) + (myPid4222 | 41), objArr66222);
                java.lang.String str43222 = (java.lang.String) objArr66222[0];
                int i254222 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                int i255222 = i254222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                int i256222 = ((-5237615) & i255222) + (i255222 | (-5237615)) + ((~((i254222 ^ i23) | (i254222 & i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                int i257222 = (i254222 ^ (-24362)) | (i254222 & (-24362));
                int i258222 = -(-(((i257222 ^ i21) | (i257222 & i21)) * (-216)));
                int i259222 = ((i256222 | i258222) << 1) - (i258222 ^ i256222);
                int i260222 = -(-(((~(i254222 | i21)) | 24361) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                char c15222 = (char) ((i259222 ^ i260222) + ((i260222 & i259222) << 1));
                int makeMeasureSpec2222 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int i261222 = -(-android.view.KeyEvent.normalizeMetaState(0));
                java.lang.Object[] objArr67222 = new java.lang.Object[1];
                g(c15222, 780 - makeMeasureSpec2222, (i261222 ^ 30) + ((i261222 & 30) << 1), objArr67222);
                strArr3 = new java.lang.String[]{str43222, (java.lang.String) objArr67222[0]};
                i24 = 2;
                i25 = 0;
                while (true) {
                    if (i25 >= i24) {
                    }
                    int i272222 = (i45 ^ (-70)) + ((i45 & (-70)) << 1);
                    i25 = ((i272222 | 71) << 1) - (i272222 ^ 71);
                    strArr3 = strArr12;
                    i23 = i26;
                    i24 = 2;
                }
                int i273222 = ((~i234222) & i26) | (i234222 & i21);
                int i274222 = -i273222;
                int i275222 = ((i273222 ^ i274222) | (i273222 & i274222)) >> 31;
                int i276222 = i27 & (~i275222);
                int i277222 = i234222 & i275222;
                int i278222 = (i277222 ^ i276222) | (i277222 & i276222);
                d5 = com.facetec.sdk.al.d(-1270134912);
                if (d5 == null) {
                }
                long longValue11222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
                long j73222 = -1272221696;
                int maxMemory2222 = (int) java.lang.Runtime.getRuntime().maxMemory();
                long j74222 = -183;
                long j75222 = 185;
                long j76222 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                long j77222 = j73222 ^ j30;
                long j78222 = maxMemory2222;
                long j79222 = j78222 ^ j30;
                long j80222 = -184;
                long j81222 = (((((j74222 * j73222) + (j75222 * longValue11222)) + ((((j77222 | longValue11222) ^ j30) | ((j79222 | longValue11222) ^ j30)) * j76222)) + ((j78222 | (((longValue11222 ^ j30) | j73222) ^ j30)) * j80222)) + (((j77222 | j79222) ^ j30) * j76222)) - 552700797;
                int elapsedCpuTime2222 = (int) android.os.Process.getElapsedCpuTime();
                int i279222 = ~(2020424372 | elapsedCpuTime2222);
                i28 = ((int) (j81222 >> 32)) & (((((~(elapsedCpuTime2222 | 583197961)) | ((~((-2020424373) | elapsedCpuTime2222)) | 1479350964)) * (-880)) - 818885110) + (((~((~elapsedCpuTime2222) | (-2020424373))) | (-583197962) | i279222) * (-880)) + (i279222 * 880));
                int myUid3222 = android.os.Process.myUid();
                int i280222 = ~myUid3222;
                i29 = ((int) j81222) & ((((~(1505216840 | myUid3222)) | (-1572862943) | (~(67990430 | myUid3222))) * (-754)) + 2070432247 + (((~(myUid3222 | 1572862942)) | (~((-1504872513) | i280222))) * (-754)) + ((1505216840 | i280222) * 754));
                if (((i29 ^ i28) | (i28 & i29)) != 1) {
                }
                int i620222 = ((~i278222) & i30) | (i278222 & i21);
                java.lang.Object[] objArr191222 = {new int[]{(i62722 & (~i62822)) | i62922}, strArr4, new int[]{i278222}, new int[]{i30}};
                int i621222 = (((((~(i21 | (-972415929))) | (~((-1056259806) | i30))) * (-370)) + 1019420143) + ((((~(i30 | (-972415929))) | (~(i21 | (-1056259806)))) | (-1073086462)) * (-370))) - 1904999708;
                int i622222 = -(-(((i620222 | (-i620222)) >> 31) & 16));
                int i623222 = -(-((i621222 ^ i622222) + ((i622222 & i621222) << 1)));
                int i624222 = (i3 & i623222) + (i3 | i623222);
                int i625222 = i624222 << 13;
                int i626222 = ((~i625222) & i624222) | ((~i624222) & i625222);
                int i627222 = i626222 ^ (i626222 >>> 17);
                int i628222 = i627222 << 5;
                int i629222 = (~i627222) & i628222;
                return objArr191222;
            }
            str7 = str5;
            i9 = 0;
            int i12422 = -i9;
            int i12522 = ((i9 ^ i12422) | (i9 & i12422)) >> 31;
            int i12622 = (~i12522) & i;
            int i12722 = i12522 & ((i & (-263)) | (i93 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
            int i12822 = (~(i & i116)) & (i | i116);
            int i12922 = -i12822;
            int i13022 = ((i12822 ^ i12922) | (i12822 & i12922)) >> 31;
            int i13122 = ((i12722 ^ i12622) | (i12722 & i12622)) & (~i13022);
            int i13222 = i116 & i13022;
            int i13322 = (i13222 ^ i13122) | (i13222 & i13122);
            int i13422 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
            int i13522 = -android.view.View.MeasureSpec.getMode(0);
            int i13622 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            java.lang.Object[] objArr2722 = new java.lang.Object[1];
            g((char) ((33873 ^ i13422) + ((i13422 & 33873) << 1)), 230 - (~i13522), (i13622 ^ 32) + ((i13622 & 32) << 1), objArr2722);
            java.lang.String str2722 = (java.lang.String) objArr2722[0];
            int i13722 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i13822 = -android.text.TextUtils.getTrimmedLength(str7);
            int i13922 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            int i14022 = i13922 * 615;
            int i14122 = (i14022 & (-14099)) + (i14022 | (-14099));
            int i14222 = ~i13922;
            int i14322 = ~((i14222 & 23) | (i14222 ^ 23));
            int i14422 = (i14322 & i) | (i ^ i14322);
            int i14522 = ~((i13922 & (-24)) | (i13922 ^ (-24)));
            int i14622 = ((i14422 & i14522) | (i14422 ^ i14522)) * 614;
            int i14722 = ~((i14222 ^ i93) | (i14222 & i93));
            int i14822 = (i14722 ^ i14322) | (i14322 & i14722);
            int i14922 = ~((i93 ^ 23) | (i93 & 23));
            int i15022 = (i14222 ^ (-24)) | (i14222 & (-24));
            int i15122 = ~((i15022 ^ i93) | (i15022 & i93));
            int i15222 = (i13922 ^ i93) | (i13922 & i93);
            int i15322 = ~((i15222 ^ 23) | (i15222 & 23));
            java.lang.Object[] objArr2822 = new java.lang.Object[1];
            g((char) ((39405 & i13722) + (i13722 | 39405)), ((i13822 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) << 1) - (i13822 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), ((((((i14122 | i14622) << 1) - (i14622 ^ i14122)) - (~(-(-(((i14822 ^ i14922) | (i14822 & i14922)) * (-1228)))))) - 1) - (~(((i15322 & i15122) | (i15322 ^ i15122)) * 614))) - 1, objArr2822);
            java.lang.String str2822 = (java.lang.String) objArr2822[0];
            char c722 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int resolveOpacity222 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int i15422 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            java.lang.Object[] objArr2922 = new java.lang.Object[1];
            g(c722, 285 - resolveOpacity222, ((i15422 | 28) << 1) - (i15422 ^ 28), objArr2922);
            java.lang.String str2922 = (java.lang.String) objArr2922[0];
            java.lang.Object[] objArr3022 = new java.lang.Object[1];
            g((char) android.view.KeyEvent.getDeadChar(0, 0), 314 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - (~(-(-android.view.View.resolveSizeAndState(0, 0, 0)))), objArr3022);
            strArr = new java.lang.String[]{str2722, str2822, str2922, (java.lang.String) objArr3022[0]};
            i10 = 0;
            while (true) {
                if (i10 >= 4) {
                }
                i10 = ((i50 & 1) << 1) + (i50 ^ 1);
                strArr = strArr14;
                str7 = str8;
            }
            int i16022 = i11 ^ i13322;
            int i16122 = -i16022;
            int i16222 = ((i16022 ^ i16122) | (i16022 & i16122)) >> 31;
            int i16322 = (i12 & (~i16222)) | (i13322 & i16222);
            java.lang.String str3022 = str8;
            java.lang.Object[] objArr3322 = new java.lang.Object[1];
            g((char) (29249 - android.text.TextUtils.getOffsetAfter(str3022, 0)), android.graphics.Color.blue(0) + 327, 12 - (~(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr3322);
            java.lang.Object[] objArr3422 = {(java.lang.String) objArr3322[0]};
            d2 = com.facetec.sdk.al.d(1590238701);
            if (d2 == null) {
            }
            str9 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr3422);
            if (str9 != null) {
            }
            i13 = i11;
            int i164222 = ((~i16322) & i11) | (i16322 & i93);
            int i165222 = -i164222;
            int i166222 = ((i164222 ^ i165222) | (i164222 & i165222)) >> 31;
            int i167222 = i13 & (~i166222);
            int i168222 = i16322 & i166222;
            int i169222 = (i168222 ^ i167222) | (i168222 & i167222);
            int i170222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
            int i171222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            java.lang.Object[] objArr37222 = new java.lang.Object[1];
            g((char) (((59411 | i170222) << 1) - (i170222 ^ 59411)), (i171222 ^ 349) + ((i171222 & 349) << 1), android.text.TextUtils.lastIndexOf(str3022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr37222);
            java.lang.String str31222 = (java.lang.String) objArr37222[0];
            char maximumFlingVelocity622 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i172222 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
            java.lang.Object[] objArr38222 = new java.lang.Object[1];
            g(maximumFlingVelocity622, (i172222 & 366) + (i172222 | 366), 5 - (~(-android.graphics.Color.green(0))), objArr38222);
            java.lang.String str32222 = (java.lang.String) objArr38222[0];
            file2 = new java.io.File(str31222);
            if (file2.exists()) {
            }
            i14 = i11;
            int i1762222 = i11 ^ i169222;
            int i1772222 = -i1762222;
            int i1782222 = ((i1762222 ^ i1772222) | (i1762222 & i1772222)) >> 31;
            int i1792222 = i14 & (~i1782222);
            int i1802222 = i169222 & i1782222;
            int i1812222 = (i1802222 ^ i1792222) | (i1802222 & i1792222);
            char c92222 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
            int i1822222 = -android.graphics.Color.rgb(0, 0, 0);
            java.lang.Object[] objArr402222 = new java.lang.Object[1];
            g(c92222, ((-16776844) & i1822222) + (i1822222 | (-16776844)), 23 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr402222);
            java.lang.Object[] objArr412222 = {(java.lang.String) objArr402222[0]};
            d3 = com.facetec.sdk.al.d(1590238701);
            if (d3 == null) {
            }
            lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d3).invoke(null, objArr412222)).toLowerCase();
            int i1832222 = -android.view.View.resolveSize(0, 0);
            int i1842222 = ~((i1832222 ^ 2569) | (i1832222 & 2569));
            int i1852222 = ~(i1832222 | i11);
            int i1862222 = ((786723 - (~(i1832222 * 306))) - (~(-(-(((i1842222 ^ i1852222) | (i1842222 & i1852222)) * 305))))) - 1;
            int i1872222 = ~(i1832222 | i93);
            int i1882222 = -(-(((i1872222 ^ (-2570)) | (i1872222 & (-2570))) * 305));
            char c102222 = (char) (((i1862222 | i1882222) << 1) - (i1882222 ^ i1862222));
            int i1892222 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
            int i1902222 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
            objArr = new java.lang.Object[1];
            g(c102222, (i1892222 ^ 396) + ((i1892222 & 396) << 1), ((i1902222 | 4) << 1) - (i1902222 ^ 4), objArr);
            if (lowerCase.contains((java.lang.String) objArr[0])) {
            }
            int i1932222 = i11 ^ i1812222;
            int i1942222 = (i1932222 | (-i1932222)) >> 31;
            int i1952222 = i15 & (~i1942222);
            int i1962222 = i1812222 & i1942222;
            int i1972222 = (i1962222 ^ i1952222) | (i1962222 & i1952222);
            int i1982222 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i1992222 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int green4222 = android.graphics.Color.green(0);
            java.lang.Object[] objArr432222 = new java.lang.Object[1];
            g((char) ((i1982222 ^ 1) + ((i1982222 & 1) << 1)), (i1992222 ^ 398) + ((i1992222 & 398) << 1), (green4222 & 42) + (green4222 | 42), objArr432222);
            java.lang.String str332222 = (java.lang.String) objArr432222[0];
            char c112222 = (char) (61820 - (~android.graphics.Color.alpha(0)));
            int i2002222 = -android.text.TextUtils.lastIndexOf(str3022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int i2012222 = -android.text.TextUtils.lastIndexOf(str3022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr442222 = new java.lang.Object[1];
            g(c112222, (i2002222 ^ 440) + ((i2002222 & 440) << 1), (i2012222 ^ 39) + ((i2012222 & 39) << 1), objArr442222);
            java.lang.String str342222 = (java.lang.String) objArr442222[0];
            int i2022222 = -(-android.text.TextUtils.getCapsMode(str3022, 0, 0));
            int i2032222 = -android.view.View.MeasureSpec.getMode(0);
            java.lang.Object[] objArr452222 = new java.lang.Object[1];
            g((char) ((i2022222 ^ 19667) + ((i2022222 & 19667) << 1)), (i2032222 & 481) + (i2032222 | 481), 25 - (~(-android.text.TextUtils.indexOf(str3022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr452222);
            java.lang.String str352222 = (java.lang.String) objArr452222[0];
            int indexOf52222 = android.text.TextUtils.indexOf(str3022, str3022, 0, 0);
            java.lang.Object[] objArr462222 = new java.lang.Object[1];
            g((char) ((indexOf52222 ^ 9236) + ((indexOf52222 & 9236) << 1)), 508 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 26 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr462222);
            java.lang.String str362222 = (java.lang.String) objArr462222[0];
            char c122222 = (char) (26296 - (~android.view.View.getDefaultSize(0, 0)));
            int i2042222 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int alpha22222 = android.graphics.Color.alpha(0);
            java.lang.Object[] objArr472222 = new java.lang.Object[1];
            g(c122222, 533 - (~i2042222), (alpha22222 ^ 27) + ((alpha22222 & 27) << 1), objArr472222);
            java.lang.String str372222 = (java.lang.String) objArr472222[0];
            char c132222 = (char) (50243 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
            int i2052222 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            java.lang.Object[] objArr482222 = new java.lang.Object[1];
            g(c132222, (i2052222 & 562) + (i2052222 | 562), 27 - android.text.TextUtils.getTrimmedLength(str3022), objArr482222);
            strArr2 = new java.lang.String[]{str332222, str342222, str352222, str362222, str372222, (java.lang.String) objArr482222[0]};
            i16 = 6;
            i17 = 0;
            while (true) {
                if (i17 >= i16) {
                }
                int i2072222 = ((i17 | 59) << 1) - (i17 ^ 59);
                i17 = ((i2072222 | (-58)) << 1) - (i2072222 ^ (-58));
                strArr2 = strArr13;
                i16 = 6;
            }
            int i2082222 = (~(i11 & i1972222)) & (i11 | i1972222);
            int i2092222 = -i2082222;
            int i2102222 = ((i2082222 ^ i2092222) | (i2082222 & i2092222)) >> 31;
            int i2112222 = i18 & (~i2102222);
            int i2122222 = i1972222 & i2102222;
            int i2132222 = (i2122222 ^ i2112222) | (i2122222 & i2112222);
            java.lang.Object[] objArr512222 = new java.lang.Object[1];
            g((char) (android.text.TextUtils.indexOf(str3022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 59412), 347 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 16 - (~(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))), objArr512222);
            java.lang.String str392222 = (java.lang.String) objArr512222[0];
            char packedPositionType3222 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
            int i2142222 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i2152222 = -(-android.text.TextUtils.indexOf(str3022, str3022, 0));
            java.lang.Object[] objArr522222 = new java.lang.Object[1];
            g(packedPositionType3222, ((i2142222 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR) << 1) - (i2142222 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR), (i2152222 ^ 6) + ((i2152222 & 6) << 1), objArr522222);
            java.lang.Object[] objArr532222 = {str392222, (java.lang.String) objArr522222[0]};
            d4 = com.facetec.sdk.al.d(-100890377);
            if (d4 == null) {
            }
            long longValue62222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr532222)).longValue();
            long j442222 = -301827732;
            int freeMemory22222 = (int) java.lang.Runtime.getRuntime().freeMemory();
            long j452222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
            long j462222 = -520;
            long j472222 = -1042;
            long j482222 = freeMemory22222;
            long j492222 = j482222 ^ j30;
            long j502222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
            long j512222 = j442222 ^ j30;
            long j522222 = (((((j452222 * j442222) + (j462222 * longValue62222)) + ((j442222 | ((j492222 | longValue62222) ^ j30)) * j472222)) + ((longValue62222 | j482222) * j502222)) + (((((j512222 | (longValue62222 ^ j30)) ^ j30) | ((j512222 | j482222) ^ j30)) | (((j492222 | j442222) | longValue62222) ^ j30)) * j502222)) - 1718236415;
            int maxMemory4222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            int i2162222 = (~((-1231491374) | maxMemory4222)) | 138608685;
            i19 = ((int) (j522222 >> 32)) & ((i2162222 * 992) + 1537498186 + ((i2162222 | (~((~maxMemory4222) | 1298617725))) * (-496)) + ((maxMemory4222 | 205735037) * 496));
            int i2172222 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
            int i2182222 = ~(112608238 | i2172222);
            i20 = ((int) j522222) & ((((-1549834649) | i2182222) * 764) + 316485077 + (((~(i2172222 | (-1549834649))) | 69206408) * (-1528)) + (((-1524030071) | i2182222) * 764));
            if (((i20 ^ i19) | (i19 & i20)) != 0) {
            }
            int i2292222 = ((~i2132222) & i11) | (i2132222 & i21);
            int i2302222 = -i2292222;
            int i2312222 = ((i2292222 ^ i2302222) | (i2292222 & i2302222)) >> 31;
            int i2322222 = i22 & (~i2312222);
            int i2332222 = i2132222 & i2312222;
            int i2342222 = (i2322222 ^ i2332222) | (i2322222 & i2332222);
            if ((i2 & 8) == 0) {
            }
            int i2532222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int scrollBarFadeDuration8222 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
            int myPid42222 = android.os.Process.myPid() >> 22;
            java.lang.Object[] objArr662222 = new java.lang.Object[1];
            g((char) ((36344 & i2532222) + (i2532222 | 36344)), (scrollBarFadeDuration8222 & 739) + (scrollBarFadeDuration8222 | 739), (myPid42222 & 41) + (myPid42222 | 41), objArr662222);
            java.lang.String str432222 = (java.lang.String) objArr662222[0];
            int i2542222 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            int i2552222 = i2542222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
            int i2562222 = ((-5237615) & i2552222) + (i2552222 | (-5237615)) + ((~((i2542222 ^ i23) | (i2542222 & i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            int i2572222 = (i2542222 ^ (-24362)) | (i2542222 & (-24362));
            int i2582222 = -(-(((i2572222 ^ i21) | (i2572222 & i21)) * (-216)));
            int i2592222 = ((i2562222 | i2582222) << 1) - (i2582222 ^ i2562222);
            int i2602222 = -(-(((~(i2542222 | i21)) | 24361) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
            char c152222 = (char) ((i2592222 ^ i2602222) + ((i2602222 & i2592222) << 1));
            int makeMeasureSpec22222 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i2612222 = -(-android.view.KeyEvent.normalizeMetaState(0));
            java.lang.Object[] objArr672222 = new java.lang.Object[1];
            g(c152222, 780 - makeMeasureSpec22222, (i2612222 ^ 30) + ((i2612222 & 30) << 1), objArr672222);
            strArr3 = new java.lang.String[]{str432222, (java.lang.String) objArr672222[0]};
            i24 = 2;
            i25 = 0;
            while (true) {
                if (i25 >= i24) {
                }
                int i2722222 = (i45 ^ (-70)) + ((i45 & (-70)) << 1);
                i25 = ((i2722222 | 71) << 1) - (i2722222 ^ 71);
                strArr3 = strArr12;
                i23 = i26;
                i24 = 2;
            }
            int i2732222 = ((~i2342222) & i26) | (i2342222 & i21);
            int i2742222 = -i2732222;
            int i2752222 = ((i2732222 ^ i2742222) | (i2732222 & i2742222)) >> 31;
            int i2762222 = i27 & (~i2752222);
            int i2772222 = i2342222 & i2752222;
            int i2782222 = (i2772222 ^ i2762222) | (i2772222 & i2762222);
            d5 = com.facetec.sdk.al.d(-1270134912);
            if (d5 == null) {
            }
            long longValue112222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
            long j732222 = -1272221696;
            int maxMemory22222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            long j742222 = -183;
            long j752222 = 185;
            long j762222 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            long j772222 = j732222 ^ j30;
            long j782222 = maxMemory22222;
            long j792222 = j782222 ^ j30;
            long j802222 = -184;
            long j812222 = (((((j742222 * j732222) + (j752222 * longValue112222)) + ((((j772222 | longValue112222) ^ j30) | ((j792222 | longValue112222) ^ j30)) * j762222)) + ((j782222 | (((longValue112222 ^ j30) | j732222) ^ j30)) * j802222)) + (((j772222 | j792222) ^ j30) * j762222)) - 552700797;
            int elapsedCpuTime22222 = (int) android.os.Process.getElapsedCpuTime();
            int i2792222 = ~(2020424372 | elapsedCpuTime22222);
            i28 = ((int) (j812222 >> 32)) & (((((~(elapsedCpuTime22222 | 583197961)) | ((~((-2020424373) | elapsedCpuTime22222)) | 1479350964)) * (-880)) - 818885110) + (((~((~elapsedCpuTime22222) | (-2020424373))) | (-583197962) | i2792222) * (-880)) + (i2792222 * 880));
            int myUid32222 = android.os.Process.myUid();
            int i2802222 = ~myUid32222;
            i29 = ((int) j812222) & ((((~(1505216840 | myUid32222)) | (-1572862943) | (~(67990430 | myUid32222))) * (-754)) + 2070432247 + (((~(myUid32222 | 1572862942)) | (~((-1504872513) | i2802222))) * (-754)) + ((1505216840 | i2802222) * 754));
            if (((i29 ^ i28) | (i28 & i29)) != 1) {
            }
            int i6202222 = ((~i2782222) & i30) | (i2782222 & i21);
            java.lang.Object[] objArr1912222 = {new int[]{(i627222 & (~i628222)) | i629222}, strArr4, new int[]{i2782222}, new int[]{i30}};
            int i6212222 = (((((~(i21 | (-972415929))) | (~((-1056259806) | i30))) * (-370)) + 1019420143) + ((((~(i30 | (-972415929))) | (~(i21 | (-1056259806)))) | (-1073086462)) * (-370))) - 1904999708;
            int i6222222 = -(-(((i6202222 | (-i6202222)) >> 31) & 16));
            int i6232222 = -(-((i6212222 ^ i6222222) + ((i6222222 & i6212222) << 1)));
            int i6242222 = (i3 & i6232222) + (i3 | i6232222);
            int i6252222 = i6242222 << 13;
            int i6262222 = ((~i6252222) & i6242222) | ((~i6242222) & i6252222);
            int i6272222 = i6262222 ^ (i6262222 >>> 17);
            int i6282222 = i6272222 << 5;
            int i6292222 = (~i6272222) & i6282222;
            return objArr1912222;
        }
        i8 = (~(i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE)) & (i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
        j = j32;
        i7 = i77;
        str5 = str4;
        int i902 = ((~i81) & i4) | (i81 & i7);
        int i912 = (i902 | (-i902)) >> 31;
        int i922 = ((~i912) & i8) | (i81 & i912);
        d = com.facetec.sdk.al.d(-318294282);
        if (d == null) {
        }
        long longValue42 = ((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, null)).longValue();
        long j352 = -1512004639;
        long j362 = j352 ^ j30;
        long j372 = longValue42 ^ j30;
        int i932 = i7;
        long freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
        long j382 = 490;
        long j392 = (491 * j352) + ((-489) * longValue42) + ((j362 | j372 | (freeMemory3 ^ j30)) * (-490)) + ((((j372 | freeMemory3) ^ j30) | ((j372 | j352) ^ j30)) * j382) + (j382 * j362) + 1943822740;
        int i942 = (((int) (j392 >> 32)) & ((((138428928 | r2) * (-476)) - 1423240662) + ((~((-69665) | i)) * 952) + ((~(i932 | (-69665))) * 476))) | (((int) j392) & ((((~(i932 | 2130443195)) | (~((-1613437107) | i))) * 988) + 261173773 + (((~(1954232499 | i)) | 176210696 | (~(i932 | (-1613437107)))) * 988)));
        int d142 = com.facetec.sdk.mt.c.d();
        int i952 = -(-(i942 * (-987)));
        int i962 = ((i952 | (-989)) << 1) - (i952 ^ (-989));
        int i972 = ~i942;
        int i982 = ~d142;
        int i992 = (i972 & i982) | (i972 ^ i982);
        int i1002 = -(-(((~(i992 | (~i992))) | (~((d142 ^ (-1)) | d142))) * 988));
        int i1012 = (((i962 | i1002) << 1) - (i962 ^ i1002)) + (((i972 ^ (-1)) | i972) * (-988));
        int i1022 = (~((d142 ^ i972) | (d142 & i972))) | (~i972);
        int i1032 = (~i982) | i982;
        int i1042 = ~((i1032 ^ i942) | (i1032 & i942));
        int i1052 = -(-(((i1022 ^ i1042) | (i1022 & i1042)) * 988));
        int i1062 = (((i1012 | i1052) << 1) - (i1052 ^ i1012)) + 200;
        int i1072 = -i942;
        int i1082 = ((i942 ^ i1072) | (i942 & i1072)) >> 31;
        int i1092 = (~i1082) & i;
        int i1102 = i1082 & ((i1062 & i932) | ((~i1062) & i));
        int i1112 = ((~i922) & i) | (i922 & i932);
        int i1122 = -i1112;
        int i1132 = ((i1112 ^ i1122) | (i1112 & i1122)) >> 31;
        int i1142 = ((i1102 ^ i1092) | (i1102 & i1092)) & (~i1132);
        int i1152 = i922 & i1132;
        int i1162 = (i1142 ^ i1152) | (i1152 & i1142);
        int i1172 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        int i1182 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
        int i1192 = -android.view.View.resolveSizeAndState(0, 0, 0);
        java.lang.Object[] objArr242 = new java.lang.Object[1];
        g((char) (((i1172 | 1) << 1) - (i1172 ^ 1)), (i1182 & 203) + (i1182 | 203), (i1192 ^ 20) + ((i1192 & 20) << 1), objArr242);
        java.lang.String str262 = (java.lang.String) objArr242[0];
        char c62 = (char) ((-2) - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))));
        int i1202 = -(android.os.Process.myTid() >> 22);
        int i1212 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
        java.lang.Object[] objArr252 = new java.lang.Object[1];
        g(c62, ((i1202 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE) << 1) - (i1202 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), (i1212 & 6) + (i1212 | 6), objArr252);
        str6 = (java.lang.String) objArr252[0];
        file = new java.io.File(str262);
        if (file.exists()) {
            java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file));
            str7 = str5;
            java.lang.Object[] objArr262 = new java.lang.Object[1];
            g((char) android.text.TextUtils.getOffsetAfter(str7, 0), 230 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, objArr262);
            useDelimiter = scanner3.useDelimiter((java.lang.String) objArr262[0]);
            if (useDelimiter.hasNext()) {
            }
            useDelimiter.close();
            if (str16.contains(str6)) {
            }
            i9 = 0;
            int i124222 = -i9;
            int i125222 = ((i9 ^ i124222) | (i9 & i124222)) >> 31;
            int i126222 = (~i125222) & i;
            int i127222 = i125222 & ((i & (-263)) | (i932 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
            int i128222 = (~(i & i1162)) & (i | i1162);
            int i129222 = -i128222;
            int i130222 = ((i128222 ^ i129222) | (i128222 & i129222)) >> 31;
            int i131222 = ((i127222 ^ i126222) | (i127222 & i126222)) & (~i130222);
            int i132222 = i1162 & i130222;
            int i133222 = (i132222 ^ i131222) | (i132222 & i131222);
            int i134222 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
            int i135222 = -android.view.View.MeasureSpec.getMode(0);
            int i136222 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            java.lang.Object[] objArr27222 = new java.lang.Object[1];
            g((char) ((33873 ^ i134222) + ((i134222 & 33873) << 1)), 230 - (~i135222), (i136222 ^ 32) + ((i136222 & 32) << 1), objArr27222);
            java.lang.String str27222 = (java.lang.String) objArr27222[0];
            int i137222 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i138222 = -android.text.TextUtils.getTrimmedLength(str7);
            int i139222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            int i140222 = i139222 * 615;
            int i141222 = (i140222 & (-14099)) + (i140222 | (-14099));
            int i142222 = ~i139222;
            int i143222 = ~((i142222 & 23) | (i142222 ^ 23));
            int i144222 = (i143222 & i) | (i ^ i143222);
            int i145222 = ~((i139222 & (-24)) | (i139222 ^ (-24)));
            int i146222 = ((i144222 & i145222) | (i144222 ^ i145222)) * 614;
            int i147222 = ~((i142222 ^ i932) | (i142222 & i932));
            int i148222 = (i147222 ^ i143222) | (i143222 & i147222);
            int i149222 = ~((i932 ^ 23) | (i932 & 23));
            int i150222 = (i142222 ^ (-24)) | (i142222 & (-24));
            int i151222 = ~((i150222 ^ i932) | (i150222 & i932));
            int i152222 = (i139222 ^ i932) | (i139222 & i932);
            int i153222 = ~((i152222 ^ 23) | (i152222 & 23));
            java.lang.Object[] objArr28222 = new java.lang.Object[1];
            g((char) ((39405 & i137222) + (i137222 | 39405)), ((i138222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) << 1) - (i138222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), ((((((i141222 | i146222) << 1) - (i146222 ^ i141222)) - (~(-(-(((i148222 ^ i149222) | (i148222 & i149222)) * (-1228)))))) - 1) - (~(((i153222 & i151222) | (i153222 ^ i151222)) * 614))) - 1, objArr28222);
            java.lang.String str28222 = (java.lang.String) objArr28222[0];
            char c7222 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int resolveOpacity2222 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int i154222 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            java.lang.Object[] objArr29222 = new java.lang.Object[1];
            g(c7222, 285 - resolveOpacity2222, ((i154222 | 28) << 1) - (i154222 ^ 28), objArr29222);
            java.lang.String str29222 = (java.lang.String) objArr29222[0];
            java.lang.Object[] objArr30222 = new java.lang.Object[1];
            g((char) android.view.KeyEvent.getDeadChar(0, 0), 314 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - (~(-(-android.view.View.resolveSizeAndState(0, 0, 0)))), objArr30222);
            strArr = new java.lang.String[]{str27222, str28222, str29222, (java.lang.String) objArr30222[0]};
            i10 = 0;
            while (true) {
                if (i10 >= 4) {
                }
                i10 = ((i50 & 1) << 1) + (i50 ^ 1);
                strArr = strArr14;
                str7 = str8;
            }
            int i160222 = i11 ^ i133222;
            int i161222 = -i160222;
            int i162222 = ((i160222 ^ i161222) | (i160222 & i161222)) >> 31;
            int i163222 = (i12 & (~i162222)) | (i133222 & i162222);
            java.lang.String str30222 = str8;
            java.lang.Object[] objArr33222 = new java.lang.Object[1];
            g((char) (29249 - android.text.TextUtils.getOffsetAfter(str30222, 0)), android.graphics.Color.blue(0) + 327, 12 - (~(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr33222);
            java.lang.Object[] objArr34222 = {(java.lang.String) objArr33222[0]};
            d2 = com.facetec.sdk.al.d(1590238701);
            if (d2 == null) {
            }
            str9 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr34222);
            if (str9 != null) {
            }
            i13 = i11;
            int i1642222 = ((~i163222) & i11) | (i163222 & i932);
            int i1652222 = -i1642222;
            int i1662222 = ((i1642222 ^ i1652222) | (i1642222 & i1652222)) >> 31;
            int i1672222 = i13 & (~i1662222);
            int i1682222 = i163222 & i1662222;
            int i1692222 = (i1682222 ^ i1672222) | (i1682222 & i1672222);
            int i1702222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
            int i1712222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
            java.lang.Object[] objArr372222 = new java.lang.Object[1];
            g((char) (((59411 | i1702222) << 1) - (i1702222 ^ 59411)), (i1712222 ^ 349) + ((i1712222 & 349) << 1), android.text.TextUtils.lastIndexOf(str30222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr372222);
            java.lang.String str312222 = (java.lang.String) objArr372222[0];
            char maximumFlingVelocity6222 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i1722222 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
            java.lang.Object[] objArr382222 = new java.lang.Object[1];
            g(maximumFlingVelocity6222, (i1722222 & 366) + (i1722222 | 366), 5 - (~(-android.graphics.Color.green(0))), objArr382222);
            java.lang.String str322222 = (java.lang.String) objArr382222[0];
            file2 = new java.io.File(str312222);
            if (file2.exists()) {
            }
            i14 = i11;
            int i17622222 = i11 ^ i1692222;
            int i17722222 = -i17622222;
            int i17822222 = ((i17622222 ^ i17722222) | (i17622222 & i17722222)) >> 31;
            int i17922222 = i14 & (~i17822222);
            int i18022222 = i1692222 & i17822222;
            int i18122222 = (i18022222 ^ i17922222) | (i18022222 & i17922222);
            char c922222 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
            int i18222222 = -android.graphics.Color.rgb(0, 0, 0);
            java.lang.Object[] objArr4022222 = new java.lang.Object[1];
            g(c922222, ((-16776844) & i18222222) + (i18222222 | (-16776844)), 23 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr4022222);
            java.lang.Object[] objArr4122222 = {(java.lang.String) objArr4022222[0]};
            d3 = com.facetec.sdk.al.d(1590238701);
            if (d3 == null) {
            }
            lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d3).invoke(null, objArr4122222)).toLowerCase();
            int i18322222 = -android.view.View.resolveSize(0, 0);
            int i18422222 = ~((i18322222 ^ 2569) | (i18322222 & 2569));
            int i18522222 = ~(i18322222 | i11);
            int i18622222 = ((786723 - (~(i18322222 * 306))) - (~(-(-(((i18422222 ^ i18522222) | (i18422222 & i18522222)) * 305))))) - 1;
            int i18722222 = ~(i18322222 | i932);
            int i18822222 = -(-(((i18722222 ^ (-2570)) | (i18722222 & (-2570))) * 305));
            char c1022222 = (char) (((i18622222 | i18822222) << 1) - (i18822222 ^ i18622222));
            int i18922222 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
            int i19022222 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
            objArr = new java.lang.Object[1];
            g(c1022222, (i18922222 ^ 396) + ((i18922222 & 396) << 1), ((i19022222 | 4) << 1) - (i19022222 ^ 4), objArr);
            if (lowerCase.contains((java.lang.String) objArr[0])) {
            }
            int i19322222 = i11 ^ i18122222;
            int i19422222 = (i19322222 | (-i19322222)) >> 31;
            int i19522222 = i15 & (~i19422222);
            int i19622222 = i18122222 & i19422222;
            int i19722222 = (i19622222 ^ i19522222) | (i19622222 & i19522222);
            int i19822222 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i19922222 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int green42222 = android.graphics.Color.green(0);
            java.lang.Object[] objArr4322222 = new java.lang.Object[1];
            g((char) ((i19822222 ^ 1) + ((i19822222 & 1) << 1)), (i19922222 ^ 398) + ((i19922222 & 398) << 1), (green42222 & 42) + (green42222 | 42), objArr4322222);
            java.lang.String str3322222 = (java.lang.String) objArr4322222[0];
            char c1122222 = (char) (61820 - (~android.graphics.Color.alpha(0)));
            int i20022222 = -android.text.TextUtils.lastIndexOf(str30222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int i20122222 = -android.text.TextUtils.lastIndexOf(str30222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr4422222 = new java.lang.Object[1];
            g(c1122222, (i20022222 ^ 440) + ((i20022222 & 440) << 1), (i20122222 ^ 39) + ((i20122222 & 39) << 1), objArr4422222);
            java.lang.String str3422222 = (java.lang.String) objArr4422222[0];
            int i20222222 = -(-android.text.TextUtils.getCapsMode(str30222, 0, 0));
            int i20322222 = -android.view.View.MeasureSpec.getMode(0);
            java.lang.Object[] objArr4522222 = new java.lang.Object[1];
            g((char) ((i20222222 ^ 19667) + ((i20222222 & 19667) << 1)), (i20322222 & 481) + (i20322222 | 481), 25 - (~(-android.text.TextUtils.indexOf(str30222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr4522222);
            java.lang.String str3522222 = (java.lang.String) objArr4522222[0];
            int indexOf522222 = android.text.TextUtils.indexOf(str30222, str30222, 0, 0);
            java.lang.Object[] objArr4622222 = new java.lang.Object[1];
            g((char) ((indexOf522222 ^ 9236) + ((indexOf522222 & 9236) << 1)), 508 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 26 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr4622222);
            java.lang.String str3622222 = (java.lang.String) objArr4622222[0];
            char c1222222 = (char) (26296 - (~android.view.View.getDefaultSize(0, 0)));
            int i20422222 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int alpha222222 = android.graphics.Color.alpha(0);
            java.lang.Object[] objArr4722222 = new java.lang.Object[1];
            g(c1222222, 533 - (~i20422222), (alpha222222 ^ 27) + ((alpha222222 & 27) << 1), objArr4722222);
            java.lang.String str3722222 = (java.lang.String) objArr4722222[0];
            char c1322222 = (char) (50243 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
            int i20522222 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            java.lang.Object[] objArr4822222 = new java.lang.Object[1];
            g(c1322222, (i20522222 & 562) + (i20522222 | 562), 27 - android.text.TextUtils.getTrimmedLength(str30222), objArr4822222);
            strArr2 = new java.lang.String[]{str3322222, str3422222, str3522222, str3622222, str3722222, (java.lang.String) objArr4822222[0]};
            i16 = 6;
            i17 = 0;
            while (true) {
                if (i17 >= i16) {
                }
                int i20722222 = ((i17 | 59) << 1) - (i17 ^ 59);
                i17 = ((i20722222 | (-58)) << 1) - (i20722222 ^ (-58));
                strArr2 = strArr13;
                i16 = 6;
            }
            int i20822222 = (~(i11 & i19722222)) & (i11 | i19722222);
            int i20922222 = -i20822222;
            int i21022222 = ((i20822222 ^ i20922222) | (i20822222 & i20922222)) >> 31;
            int i21122222 = i18 & (~i21022222);
            int i21222222 = i19722222 & i21022222;
            int i21322222 = (i21222222 ^ i21122222) | (i21222222 & i21122222);
            java.lang.Object[] objArr5122222 = new java.lang.Object[1];
            g((char) (android.text.TextUtils.indexOf(str30222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 59412), 347 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 16 - (~(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))), objArr5122222);
            java.lang.String str3922222 = (java.lang.String) objArr5122222[0];
            char packedPositionType32222 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
            int i21422222 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i21522222 = -(-android.text.TextUtils.indexOf(str30222, str30222, 0));
            java.lang.Object[] objArr5222222 = new java.lang.Object[1];
            g(packedPositionType32222, ((i21422222 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR) << 1) - (i21422222 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR), (i21522222 ^ 6) + ((i21522222 & 6) << 1), objArr5222222);
            java.lang.Object[] objArr5322222 = {str3922222, (java.lang.String) objArr5222222[0]};
            d4 = com.facetec.sdk.al.d(-100890377);
            if (d4 == null) {
            }
            long longValue622222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr5322222)).longValue();
            long j4422222 = -301827732;
            int freeMemory222222 = (int) java.lang.Runtime.getRuntime().freeMemory();
            long j4522222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
            long j4622222 = -520;
            long j4722222 = -1042;
            long j4822222 = freeMemory222222;
            long j4922222 = j4822222 ^ j30;
            long j5022222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
            long j5122222 = j4422222 ^ j30;
            long j5222222 = (((((j4522222 * j4422222) + (j4622222 * longValue622222)) + ((j4422222 | ((j4922222 | longValue622222) ^ j30)) * j4722222)) + ((longValue622222 | j4822222) * j5022222)) + (((((j5122222 | (longValue622222 ^ j30)) ^ j30) | ((j5122222 | j4822222) ^ j30)) | (((j4922222 | j4422222) | longValue622222) ^ j30)) * j5022222)) - 1718236415;
            int maxMemory42222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            int i21622222 = (~((-1231491374) | maxMemory42222)) | 138608685;
            i19 = ((int) (j5222222 >> 32)) & ((i21622222 * 992) + 1537498186 + ((i21622222 | (~((~maxMemory42222) | 1298617725))) * (-496)) + ((maxMemory42222 | 205735037) * 496));
            int i21722222 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
            int i21822222 = ~(112608238 | i21722222);
            i20 = ((int) j5222222) & ((((-1549834649) | i21822222) * 764) + 316485077 + (((~(i21722222 | (-1549834649))) | 69206408) * (-1528)) + (((-1524030071) | i21822222) * 764));
            if (((i20 ^ i19) | (i19 & i20)) != 0) {
            }
            int i22922222 = ((~i21322222) & i11) | (i21322222 & i21);
            int i23022222 = -i22922222;
            int i23122222 = ((i22922222 ^ i23022222) | (i22922222 & i23022222)) >> 31;
            int i23222222 = i22 & (~i23122222);
            int i23322222 = i21322222 & i23122222;
            int i23422222 = (i23222222 ^ i23322222) | (i23222222 & i23322222);
            if ((i2 & 8) == 0) {
            }
            int i25322222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int scrollBarFadeDuration82222 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
            int myPid422222 = android.os.Process.myPid() >> 22;
            java.lang.Object[] objArr6622222 = new java.lang.Object[1];
            g((char) ((36344 & i25322222) + (i25322222 | 36344)), (scrollBarFadeDuration82222 & 739) + (scrollBarFadeDuration82222 | 739), (myPid422222 & 41) + (myPid422222 | 41), objArr6622222);
            java.lang.String str4322222 = (java.lang.String) objArr6622222[0];
            int i25422222 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            int i25522222 = i25422222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
            int i25622222 = ((-5237615) & i25522222) + (i25522222 | (-5237615)) + ((~((i25422222 ^ i23) | (i25422222 & i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            int i25722222 = (i25422222 ^ (-24362)) | (i25422222 & (-24362));
            int i25822222 = -(-(((i25722222 ^ i21) | (i25722222 & i21)) * (-216)));
            int i25922222 = ((i25622222 | i25822222) << 1) - (i25822222 ^ i25622222);
            int i26022222 = -(-(((~(i25422222 | i21)) | 24361) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
            char c1522222 = (char) ((i25922222 ^ i26022222) + ((i26022222 & i25922222) << 1));
            int makeMeasureSpec222222 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i26122222 = -(-android.view.KeyEvent.normalizeMetaState(0));
            java.lang.Object[] objArr6722222 = new java.lang.Object[1];
            g(c1522222, 780 - makeMeasureSpec222222, (i26122222 ^ 30) + ((i26122222 & 30) << 1), objArr6722222);
            strArr3 = new java.lang.String[]{str4322222, (java.lang.String) objArr6722222[0]};
            i24 = 2;
            i25 = 0;
            while (true) {
                if (i25 >= i24) {
                }
                int i27222222 = (i45 ^ (-70)) + ((i45 & (-70)) << 1);
                i25 = ((i27222222 | 71) << 1) - (i27222222 ^ 71);
                strArr3 = strArr12;
                i23 = i26;
                i24 = 2;
            }
            int i27322222 = ((~i23422222) & i26) | (i23422222 & i21);
            int i27422222 = -i27322222;
            int i27522222 = ((i27322222 ^ i27422222) | (i27322222 & i27422222)) >> 31;
            int i27622222 = i27 & (~i27522222);
            int i27722222 = i23422222 & i27522222;
            int i27822222 = (i27722222 ^ i27622222) | (i27722222 & i27622222);
            d5 = com.facetec.sdk.al.d(-1270134912);
            if (d5 == null) {
            }
            long longValue1122222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
            long j7322222 = -1272221696;
            int maxMemory222222 = (int) java.lang.Runtime.getRuntime().maxMemory();
            long j7422222 = -183;
            long j7522222 = 185;
            long j7622222 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            long j7722222 = j7322222 ^ j30;
            long j7822222 = maxMemory222222;
            long j7922222 = j7822222 ^ j30;
            long j8022222 = -184;
            long j8122222 = (((((j7422222 * j7322222) + (j7522222 * longValue1122222)) + ((((j7722222 | longValue1122222) ^ j30) | ((j7922222 | longValue1122222) ^ j30)) * j7622222)) + ((j7822222 | (((longValue1122222 ^ j30) | j7322222) ^ j30)) * j8022222)) + (((j7722222 | j7922222) ^ j30) * j7622222)) - 552700797;
            int elapsedCpuTime222222 = (int) android.os.Process.getElapsedCpuTime();
            int i27922222 = ~(2020424372 | elapsedCpuTime222222);
            i28 = ((int) (j8122222 >> 32)) & (((((~(elapsedCpuTime222222 | 583197961)) | ((~((-2020424373) | elapsedCpuTime222222)) | 1479350964)) * (-880)) - 818885110) + (((~((~elapsedCpuTime222222) | (-2020424373))) | (-583197962) | i27922222) * (-880)) + (i27922222 * 880));
            int myUid322222 = android.os.Process.myUid();
            int i28022222 = ~myUid322222;
            i29 = ((int) j8122222) & ((((~(1505216840 | myUid322222)) | (-1572862943) | (~(67990430 | myUid322222))) * (-754)) + 2070432247 + (((~(myUid322222 | 1572862942)) | (~((-1504872513) | i28022222))) * (-754)) + ((1505216840 | i28022222) * 754));
            if (((i29 ^ i28) | (i28 & i29)) != 1) {
            }
            int i62022222 = ((~i27822222) & i30) | (i27822222 & i21);
            java.lang.Object[] objArr19122222 = {new int[]{(i6272222 & (~i6282222)) | i6292222}, strArr4, new int[]{i27822222}, new int[]{i30}};
            int i62122222 = (((((~(i21 | (-972415929))) | (~((-1056259806) | i30))) * (-370)) + 1019420143) + ((((~(i30 | (-972415929))) | (~(i21 | (-1056259806)))) | (-1073086462)) * (-370))) - 1904999708;
            int i62222222 = -(-(((i62022222 | (-i62022222)) >> 31) & 16));
            int i62322222 = -(-((i62122222 ^ i62222222) + ((i62222222 & i62122222) << 1)));
            int i62422222 = (i3 & i62322222) + (i3 | i62322222);
            int i62522222 = i62422222 << 13;
            int i62622222 = ((~i62522222) & i62422222) | ((~i62422222) & i62522222);
            int i62722222 = i62622222 ^ (i62622222 >>> 17);
            int i62822222 = i62722222 << 5;
            int i62922222 = (~i62722222) & i62822222;
            return objArr19122222;
        }
        str7 = str5;
        i9 = 0;
        int i1242222 = -i9;
        int i1252222 = ((i9 ^ i1242222) | (i9 & i1242222)) >> 31;
        int i1262222 = (~i1252222) & i;
        int i1272222 = i1252222 & ((i & (-263)) | (i932 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int i1282222 = (~(i & i1162)) & (i | i1162);
        int i1292222 = -i1282222;
        int i1302222 = ((i1282222 ^ i1292222) | (i1282222 & i1292222)) >> 31;
        int i1312222 = ((i1272222 ^ i1262222) | (i1272222 & i1262222)) & (~i1302222);
        int i1322222 = i1162 & i1302222;
        int i1332222 = (i1322222 ^ i1312222) | (i1322222 & i1312222);
        int i1342222 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
        int i1352222 = -android.view.View.MeasureSpec.getMode(0);
        int i1362222 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        java.lang.Object[] objArr272222 = new java.lang.Object[1];
        g((char) ((33873 ^ i1342222) + ((i1342222 & 33873) << 1)), 230 - (~i1352222), (i1362222 ^ 32) + ((i1362222 & 32) << 1), objArr272222);
        java.lang.String str272222 = (java.lang.String) objArr272222[0];
        int i1372222 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        int i1382222 = -android.text.TextUtils.getTrimmedLength(str7);
        int i1392222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
        int i1402222 = i1392222 * 615;
        int i1412222 = (i1402222 & (-14099)) + (i1402222 | (-14099));
        int i1422222 = ~i1392222;
        int i1432222 = ~((i1422222 & 23) | (i1422222 ^ 23));
        int i1442222 = (i1432222 & i) | (i ^ i1432222);
        int i1452222 = ~((i1392222 & (-24)) | (i1392222 ^ (-24)));
        int i1462222 = ((i1442222 & i1452222) | (i1442222 ^ i1452222)) * 614;
        int i1472222 = ~((i1422222 ^ i932) | (i1422222 & i932));
        int i1482222 = (i1472222 ^ i1432222) | (i1432222 & i1472222);
        int i1492222 = ~((i932 ^ 23) | (i932 & 23));
        int i1502222 = (i1422222 ^ (-24)) | (i1422222 & (-24));
        int i1512222 = ~((i1502222 ^ i932) | (i1502222 & i932));
        int i1522222 = (i1392222 ^ i932) | (i1392222 & i932);
        int i1532222 = ~((i1522222 ^ 23) | (i1522222 & 23));
        java.lang.Object[] objArr282222 = new java.lang.Object[1];
        g((char) ((39405 & i1372222) + (i1372222 | 39405)), ((i1382222 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) << 1) - (i1382222 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE), ((((((i1412222 | i1462222) << 1) - (i1462222 ^ i1412222)) - (~(-(-(((i1482222 ^ i1492222) | (i1482222 & i1492222)) * (-1228)))))) - 1) - (~(((i1532222 & i1512222) | (i1532222 ^ i1512222)) * 614))) - 1, objArr282222);
        java.lang.String str282222 = (java.lang.String) objArr282222[0];
        char c72222 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int resolveOpacity22222 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        int i1542222 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        java.lang.Object[] objArr292222 = new java.lang.Object[1];
        g(c72222, 285 - resolveOpacity22222, ((i1542222 | 28) << 1) - (i1542222 ^ 28), objArr292222);
        java.lang.String str292222 = (java.lang.String) objArr292222[0];
        java.lang.Object[] objArr302222 = new java.lang.Object[1];
        g((char) android.view.KeyEvent.getDeadChar(0, 0), 314 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - (~(-(-android.view.View.resolveSizeAndState(0, 0, 0)))), objArr302222);
        strArr = new java.lang.String[]{str272222, str282222, str292222, (java.lang.String) objArr302222[0]};
        i10 = 0;
        while (true) {
            if (i10 >= 4) {
            }
            i10 = ((i50 & 1) << 1) + (i50 ^ 1);
            strArr = strArr14;
            str7 = str8;
        }
        int i1602222 = i11 ^ i1332222;
        int i1612222 = -i1602222;
        int i1622222 = ((i1602222 ^ i1612222) | (i1602222 & i1612222)) >> 31;
        int i1632222 = (i12 & (~i1622222)) | (i1332222 & i1622222);
        java.lang.String str302222 = str8;
        java.lang.Object[] objArr332222 = new java.lang.Object[1];
        g((char) (29249 - android.text.TextUtils.getOffsetAfter(str302222, 0)), android.graphics.Color.blue(0) + 327, 12 - (~(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr332222);
        java.lang.Object[] objArr342222 = {(java.lang.String) objArr332222[0]};
        d2 = com.facetec.sdk.al.d(1590238701);
        if (d2 == null) {
        }
        str9 = (java.lang.String) ((java.lang.reflect.Method) d2).invoke(null, objArr342222);
        if (str9 != null) {
        }
        i13 = i11;
        int i16422222 = ((~i1632222) & i11) | (i1632222 & i932);
        int i16522222 = -i16422222;
        int i16622222 = ((i16422222 ^ i16522222) | (i16422222 & i16522222)) >> 31;
        int i16722222 = i13 & (~i16622222);
        int i16822222 = i1632222 & i16622222;
        int i16922222 = (i16822222 ^ i16722222) | (i16822222 & i16722222);
        int i17022222 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
        int i17122222 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
        java.lang.Object[] objArr3722222 = new java.lang.Object[1];
        g((char) (((59411 | i17022222) << 1) - (i17022222 ^ 59411)), (i17122222 ^ 349) + ((i17122222 & 349) << 1), android.text.TextUtils.lastIndexOf(str302222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr3722222);
        java.lang.String str3122222 = (java.lang.String) objArr3722222[0];
        char maximumFlingVelocity62222 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        int i17222222 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
        java.lang.Object[] objArr3822222 = new java.lang.Object[1];
        g(maximumFlingVelocity62222, (i17222222 & 366) + (i17222222 | 366), 5 - (~(-android.graphics.Color.green(0))), objArr3822222);
        java.lang.String str3222222 = (java.lang.String) objArr3822222[0];
        file2 = new java.io.File(str3122222);
        if (file2.exists()) {
        }
        i14 = i11;
        int i176222222 = i11 ^ i16922222;
        int i177222222 = -i176222222;
        int i178222222 = ((i176222222 ^ i177222222) | (i176222222 & i177222222)) >> 31;
        int i179222222 = i14 & (~i178222222);
        int i180222222 = i16922222 & i178222222;
        int i181222222 = (i180222222 ^ i179222222) | (i180222222 & i179222222);
        char c9222222 = (char) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask())));
        int i182222222 = -android.graphics.Color.rgb(0, 0, 0);
        java.lang.Object[] objArr40222222 = new java.lang.Object[1];
        g(c9222222, ((-16776844) & i182222222) + (i182222222 | (-16776844)), 23 - (~(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr40222222);
        java.lang.Object[] objArr41222222 = {(java.lang.String) objArr40222222[0]};
        d3 = com.facetec.sdk.al.d(1590238701);
        if (d3 == null) {
        }
        lowerCase = ((java.lang.String) ((java.lang.reflect.Method) d3).invoke(null, objArr41222222)).toLowerCase();
        int i183222222 = -android.view.View.resolveSize(0, 0);
        int i184222222 = ~((i183222222 ^ 2569) | (i183222222 & 2569));
        int i185222222 = ~(i183222222 | i11);
        int i186222222 = ((786723 - (~(i183222222 * 306))) - (~(-(-(((i184222222 ^ i185222222) | (i184222222 & i185222222)) * 305))))) - 1;
        int i187222222 = ~(i183222222 | i932);
        int i188222222 = -(-(((i187222222 ^ (-2570)) | (i187222222 & (-2570))) * 305));
        char c10222222 = (char) (((i186222222 | i188222222) << 1) - (i188222222 ^ i186222222));
        int i189222222 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
        int i190222222 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
        objArr = new java.lang.Object[1];
        g(c10222222, (i189222222 ^ 396) + ((i189222222 & 396) << 1), ((i190222222 | 4) << 1) - (i190222222 ^ 4), objArr);
        if (lowerCase.contains((java.lang.String) objArr[0])) {
        }
        int i193222222 = i11 ^ i181222222;
        int i194222222 = (i193222222 | (-i193222222)) >> 31;
        int i195222222 = i15 & (~i194222222);
        int i196222222 = i181222222 & i194222222;
        int i197222222 = (i196222222 ^ i195222222) | (i196222222 & i195222222);
        int i198222222 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i199222222 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        int green422222 = android.graphics.Color.green(0);
        java.lang.Object[] objArr43222222 = new java.lang.Object[1];
        g((char) ((i198222222 ^ 1) + ((i198222222 & 1) << 1)), (i199222222 ^ 398) + ((i199222222 & 398) << 1), (green422222 & 42) + (green422222 | 42), objArr43222222);
        java.lang.String str33222222 = (java.lang.String) objArr43222222[0];
        char c11222222 = (char) (61820 - (~android.graphics.Color.alpha(0)));
        int i200222222 = -android.text.TextUtils.lastIndexOf(str302222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i201222222 = -android.text.TextUtils.lastIndexOf(str302222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr44222222 = new java.lang.Object[1];
        g(c11222222, (i200222222 ^ 440) + ((i200222222 & 440) << 1), (i201222222 ^ 39) + ((i201222222 & 39) << 1), objArr44222222);
        java.lang.String str34222222 = (java.lang.String) objArr44222222[0];
        int i202222222 = -(-android.text.TextUtils.getCapsMode(str302222, 0, 0));
        int i203222222 = -android.view.View.MeasureSpec.getMode(0);
        java.lang.Object[] objArr45222222 = new java.lang.Object[1];
        g((char) ((i202222222 ^ 19667) + ((i202222222 & 19667) << 1)), (i203222222 & 481) + (i203222222 | 481), 25 - (~(-android.text.TextUtils.indexOf(str302222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))), objArr45222222);
        java.lang.String str35222222 = (java.lang.String) objArr45222222[0];
        int indexOf5222222 = android.text.TextUtils.indexOf(str302222, str302222, 0, 0);
        java.lang.Object[] objArr46222222 = new java.lang.Object[1];
        g((char) ((indexOf5222222 ^ 9236) + ((indexOf5222222 & 9236) << 1)), 508 - (~(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 26 - (~(-(-(android.view.ViewConfiguration.getTouchSlop() >> 8)))), objArr46222222);
        java.lang.String str36222222 = (java.lang.String) objArr46222222[0];
        char c12222222 = (char) (26296 - (~android.view.View.getDefaultSize(0, 0)));
        int i204222222 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
        int alpha2222222 = android.graphics.Color.alpha(0);
        java.lang.Object[] objArr47222222 = new java.lang.Object[1];
        g(c12222222, 533 - (~i204222222), (alpha2222222 ^ 27) + ((alpha2222222 & 27) << 1), objArr47222222);
        java.lang.String str37222222 = (java.lang.String) objArr47222222[0];
        char c13222222 = (char) (50243 - (~(-android.widget.ExpandableListView.getPackedPositionType(0L))));
        int i205222222 = -(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
        java.lang.Object[] objArr48222222 = new java.lang.Object[1];
        g(c13222222, (i205222222 & 562) + (i205222222 | 562), 27 - android.text.TextUtils.getTrimmedLength(str302222), objArr48222222);
        strArr2 = new java.lang.String[]{str33222222, str34222222, str35222222, str36222222, str37222222, (java.lang.String) objArr48222222[0]};
        i16 = 6;
        i17 = 0;
        while (true) {
            if (i17 >= i16) {
            }
            int i207222222 = ((i17 | 59) << 1) - (i17 ^ 59);
            i17 = ((i207222222 | (-58)) << 1) - (i207222222 ^ (-58));
            strArr2 = strArr13;
            i16 = 6;
        }
        int i208222222 = (~(i11 & i197222222)) & (i11 | i197222222);
        int i209222222 = -i208222222;
        int i210222222 = ((i208222222 ^ i209222222) | (i208222222 & i209222222)) >> 31;
        int i211222222 = i18 & (~i210222222);
        int i212222222 = i197222222 & i210222222;
        int i213222222 = (i212222222 ^ i211222222) | (i212222222 & i211222222);
        java.lang.Object[] objArr51222222 = new java.lang.Object[1];
        g((char) (android.text.TextUtils.indexOf(str302222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 59412), 347 - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 16 - (~(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))), objArr51222222);
        java.lang.String str39222222 = (java.lang.String) objArr51222222[0];
        char packedPositionType322222 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
        int i214222222 = -(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
        int i215222222 = -(-android.text.TextUtils.indexOf(str302222, str302222, 0));
        java.lang.Object[] objArr52222222 = new java.lang.Object[1];
        g(packedPositionType322222, ((i214222222 | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR) << 1) - (i214222222 ^ com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR), (i215222222 ^ 6) + ((i215222222 & 6) << 1), objArr52222222);
        java.lang.Object[] objArr53222222 = {str39222222, (java.lang.String) objArr52222222[0]};
        d4 = com.facetec.sdk.al.d(-100890377);
        if (d4 == null) {
        }
        long longValue6222222 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr53222222)).longValue();
        long j44222222 = -301827732;
        int freeMemory2222222 = (int) java.lang.Runtime.getRuntime().freeMemory();
        long j45222222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL;
        long j46222222 = -520;
        long j47222222 = -1042;
        long j48222222 = freeMemory2222222;
        long j49222222 = j48222222 ^ j30;
        long j50222222 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
        long j51222222 = j44222222 ^ j30;
        long j52222222 = (((((j45222222 * j44222222) + (j46222222 * longValue6222222)) + ((j44222222 | ((j49222222 | longValue6222222) ^ j30)) * j47222222)) + ((longValue6222222 | j48222222) * j50222222)) + (((((j51222222 | (longValue6222222 ^ j30)) ^ j30) | ((j51222222 | j48222222) ^ j30)) | (((j49222222 | j44222222) | longValue6222222) ^ j30)) * j50222222)) - 1718236415;
        int maxMemory422222 = (int) java.lang.Runtime.getRuntime().maxMemory();
        int i216222222 = (~((-1231491374) | maxMemory422222)) | 138608685;
        i19 = ((int) (j52222222 >> 32)) & ((i216222222 * 992) + 1537498186 + ((i216222222 | (~((~maxMemory422222) | 1298617725))) * (-496)) + ((maxMemory422222 | 205735037) * 496));
        int i217222222 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
        int i218222222 = ~(112608238 | i217222222);
        i20 = ((int) j52222222) & ((((-1549834649) | i218222222) * 764) + 316485077 + (((~(i217222222 | (-1549834649))) | 69206408) * (-1528)) + (((-1524030071) | i218222222) * 764));
        if (((i20 ^ i19) | (i19 & i20)) != 0) {
        }
        int i229222222 = ((~i213222222) & i11) | (i213222222 & i21);
        int i230222222 = -i229222222;
        int i231222222 = ((i229222222 ^ i230222222) | (i229222222 & i230222222)) >> 31;
        int i232222222 = i22 & (~i231222222);
        int i233222222 = i213222222 & i231222222;
        int i234222222 = (i232222222 ^ i233222222) | (i232222222 & i233222222);
        if ((i2 & 8) == 0) {
        }
        int i253222222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        int scrollBarFadeDuration822222 = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
        int myPid4222222 = android.os.Process.myPid() >> 22;
        java.lang.Object[] objArr66222222 = new java.lang.Object[1];
        g((char) ((36344 & i253222222) + (i253222222 | 36344)), (scrollBarFadeDuration822222 & 739) + (scrollBarFadeDuration822222 | 739), (myPid4222222 & 41) + (myPid4222222 | 41), objArr66222222);
        java.lang.String str43222222 = (java.lang.String) objArr66222222[0];
        int i254222222 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        int i255222222 = i254222222 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
        int i256222222 = ((-5237615) & i255222222) + (i255222222 | (-5237615)) + ((~((i254222222 ^ i23) | (i254222222 & i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        int i257222222 = (i254222222 ^ (-24362)) | (i254222222 & (-24362));
        int i258222222 = -(-(((i257222222 ^ i21) | (i257222222 & i21)) * (-216)));
        int i259222222 = ((i256222222 | i258222222) << 1) - (i258222222 ^ i256222222);
        int i260222222 = -(-(((~(i254222222 | i21)) | 24361) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
        char c15222222 = (char) ((i259222222 ^ i260222222) + ((i260222222 & i259222222) << 1));
        int makeMeasureSpec2222222 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i261222222 = -(-android.view.KeyEvent.normalizeMetaState(0));
        java.lang.Object[] objArr67222222 = new java.lang.Object[1];
        g(c15222222, 780 - makeMeasureSpec2222222, (i261222222 ^ 30) + ((i261222222 & 30) << 1), objArr67222222);
        strArr3 = new java.lang.String[]{str43222222, (java.lang.String) objArr67222222[0]};
        i24 = 2;
        i25 = 0;
        while (true) {
            if (i25 >= i24) {
            }
            int i272222222 = (i45 ^ (-70)) + ((i45 & (-70)) << 1);
            i25 = ((i272222222 | 71) << 1) - (i272222222 ^ 71);
            strArr3 = strArr12;
            i23 = i26;
            i24 = 2;
        }
        int i273222222 = ((~i234222222) & i26) | (i234222222 & i21);
        int i274222222 = -i273222222;
        int i275222222 = ((i273222222 ^ i274222222) | (i273222222 & i274222222)) >> 31;
        int i276222222 = i27 & (~i275222222);
        int i277222222 = i234222222 & i275222222;
        int i278222222 = (i277222222 ^ i276222222) | (i277222222 & i276222222);
        d5 = com.facetec.sdk.al.d(-1270134912);
        if (d5 == null) {
        }
        long longValue11222222 = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, null)).longValue();
        long j73222222 = -1272221696;
        int maxMemory2222222 = (int) java.lang.Runtime.getRuntime().maxMemory();
        long j74222222 = -183;
        long j75222222 = 185;
        long j76222222 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
        long j77222222 = j73222222 ^ j30;
        long j78222222 = maxMemory2222222;
        long j79222222 = j78222222 ^ j30;
        long j80222222 = -184;
        long j81222222 = (((((j74222222 * j73222222) + (j75222222 * longValue11222222)) + ((((j77222222 | longValue11222222) ^ j30) | ((j79222222 | longValue11222222) ^ j30)) * j76222222)) + ((j78222222 | (((longValue11222222 ^ j30) | j73222222) ^ j30)) * j80222222)) + (((j77222222 | j79222222) ^ j30) * j76222222)) - 552700797;
        int elapsedCpuTime2222222 = (int) android.os.Process.getElapsedCpuTime();
        int i279222222 = ~(2020424372 | elapsedCpuTime2222222);
        i28 = ((int) (j81222222 >> 32)) & (((((~(elapsedCpuTime2222222 | 583197961)) | ((~((-2020424373) | elapsedCpuTime2222222)) | 1479350964)) * (-880)) - 818885110) + (((~((~elapsedCpuTime2222222) | (-2020424373))) | (-583197962) | i279222222) * (-880)) + (i279222222 * 880));
        int myUid3222222 = android.os.Process.myUid();
        int i280222222 = ~myUid3222222;
        i29 = ((int) j81222222) & ((((~(1505216840 | myUid3222222)) | (-1572862943) | (~(67990430 | myUid3222222))) * (-754)) + 2070432247 + (((~(myUid3222222 | 1572862942)) | (~((-1504872513) | i280222222))) * (-754)) + ((1505216840 | i280222222) * 754));
        if (((i29 ^ i28) | (i28 & i29)) != 1) {
        }
        int i620222222 = ((~i278222222) & i30) | (i278222222 & i21);
        java.lang.Object[] objArr191222222 = {new int[]{(i62722222 & (~i62822222)) | i62922222}, strArr4, new int[]{i278222222}, new int[]{i30}};
        int i621222222 = (((((~(i21 | (-972415929))) | (~((-1056259806) | i30))) * (-370)) + 1019420143) + ((((~(i30 | (-972415929))) | (~(i21 | (-1056259806)))) | (-1073086462)) * (-370))) - 1904999708;
        int i622222222 = -(-(((i620222222 | (-i620222222)) >> 31) & 16));
        int i623222222 = -(-((i621222222 ^ i622222222) + ((i622222222 & i621222222) << 1)));
        int i624222222 = (i3 & i623222222) + (i3 | i623222222);
        int i625222222 = i624222222 << 13;
        int i626222222 = ((~i625222222) & i624222222) | ((~i624222222) & i625222222);
        int i627222222 = i626222222 ^ (i626222222 >>> 17);
        int i628222222 = i627222222 << 5;
        int i629222222 = (~i627222222) & i628222222;
        return objArr191222222;
    }
}
