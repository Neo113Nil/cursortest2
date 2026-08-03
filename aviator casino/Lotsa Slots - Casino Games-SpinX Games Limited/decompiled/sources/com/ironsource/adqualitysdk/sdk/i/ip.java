package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ip {

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2557 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2558;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2559;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f2560;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2561;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2562;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final byte[] f2563;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2564;

    /* renamed from: ｋ, reason: contains not printable characters */
    private javax.crypto.Cipher f2565;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private javax.crypto.Cipher f2566;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private javax.crypto.SecretKey f2567;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m8083() {
        f2564 = 0L;
        f2559 = 0;
        f2560 = (char) 47364;
        f2561 = (char) 7;
        f2558 = new char[]{'K', 'E', 'V', 'A', ' ', 'S', 'O', 'b', 'f', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, io.ktor.util.date.GMTDateParser.SECONDS, 'c', 'a', 't', 'o', 'r', 'P', 'l', 'y', 'n', 'i', io.ktor.util.date.GMTDateParser.MINUTES, 'p', 'e', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'v', '.', 'T', 'g', io.ktor.util.date.GMTDateParser.HOURS, 'I', '2', '-', '1', '|', 'U', 'F', '8', 'H', '(', 'k', ')', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 'L', io.ktor.util.date.GMTDateParser.MONTH, 'N', 'Q', 'R', 'W'};
    }

    static {
        m8083();
        f2563 = new byte[]{com.google.common.base.Ascii.DLE, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i = f2562 + 37;
        f2557 = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    public ip(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        byte[] digest;
        try {
            javax.crypto.SecretKeyFactory secretKeyFactory = javax.crypto.SecretKeyFactory.getInstance(m8085((char) (25355 - android.view.KeyEvent.normalizeMetaState(0)), "\u0000\u0000\u0000\u0000", "ꁶ瘞\u0bbc끣", "梚㡭ꗼဩ㊼\ue37d숈왳\udd9b쥚⸳蒮ꠥ凟數힠Ⳮ⻓ꮧᘷ彉ꚥ\ue62d㟸錀\uaa38䳁뮘뭵", (-1133109600) - android.widget.ExpandableListView.getPackedPositionType(0L)).intern());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            digest = secretKeyFactory.generateSecret(new javax.crypto.spec.PBEKeySpec(sb.toString().toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (java.security.GeneralSecurityException unused) {
            com.ironsource.adqualitysdk.sdk.i.iq.m8092(m8086(19 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u0001\u0002\u0002\u0003\u0004\u0005\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014±", (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 63)).intern(), m8086((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, "\u0011\u0010\u0015\u000e\r\b\u0012\u0013\u0005\u000b\u0012\u0005\u000e\u0014\u0007\u0012\u0016\u0017\r\u0007\u000e\r\u0010\u0018\u0003\u0019\u0018\u001a\u0012\r\u0018\u001b\u0006\u0019\u0010\u0013\u000e\u0014 \u0000\u001b\u0011½½\u0016\u0010\u001a\u0010\u000b\u0006\b\u001a\u001d\u0016\u0013\u0007\b \u0085", (byte) (86 - android.widget.ExpandableListView.getPackedPositionChild(0L))).intern());
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(m8085((char) (android.os.Process.getGidForName("") + 5841), "\u0000\u0000\u0000\u0000", "랚货킾ﴖ", "亁ੴ䪑", android.graphics.Color.argb(0, 0, 0, 0) - 1098045513).intern());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                sb2.append(str3);
                for (char c : sb2.toString().toCharArray()) {
                    messageDigest.update((byte) c);
                }
                digest = messageDigest.digest();
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(m8085((char) (47286 - android.view.View.resolveSize(0, 0)), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", 354353735 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e);
            }
        }
        this.f2567 = new javax.crypto.spec.SecretKeySpec(digest, m8086(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 4, "\u0004\u0002¨", (byte) (85 - (android.view.ViewConfiguration.getScrollBarSize() >> 8))).intern());
        m8084();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m8084() {
        int i = 2 % 2;
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(m8085((char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", "㢽⼽ᥐ啶", "㸬ㄔ踁톆襞⤨㿏\uf7eaﾵ귒㓽럌Ꮐʛหf迿嫳⾜\uf2d9", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            this.f2566 = cipher;
            javax.crypto.SecretKey secretKey = this.f2567;
            byte[] bArr = f2563;
            cipher.init(1, secretKey, new javax.crypto.spec.IvParameterSpec(bArr));
            javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance(m8085((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "㢽⼽ᥐ啶", "㸬ㄔ踁톆襞⤨㿏\uf7eaﾵ귒㓽럌Ꮐʛหf迿嫳⾜\uf2d9", android.view.View.MeasureSpec.getSize(0)).intern());
            this.f2565 = cipher2;
            cipher2.init(2, this.f2567, new javax.crypto.spec.IvParameterSpec(bArr));
            int i2 = f2562 + 51;
            f2557 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.RuntimeException(m8086(android.graphics.Color.green(0) + 21, "!\u0010\u001a\u000b\u0012\u000e\u0019\u0003\u001a\u0010\u001b\u0012\u0010\u000f\u000e\u001a\u001a\u0010\u000b\u0006\u009c", (byte) (android.text.TextUtils.lastIndexOf("", '0') + 107)).intern(), e);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized java.lang.String m8088(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2562 + 67;
        f2557 = i2 % 128;
        if (i2 % 2 == 0) {
            android.text.TextUtils.isEmpty(str);
            throw null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            int i3 = f2562;
            int i4 = i3 + 97;
            f2557 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 3;
            f2557 = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }
        try {
            javax.crypto.Cipher cipher = this.f2566;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8086(40 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0007\u0012\u0016\u001b\u0007\u0011\u0015\u001c\u0013\n\u0015\f\u000e\u0012\u0012\u000e\u000e!\u0017\f\u0014\u001b\u0013\u0018\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014\u0012\u001d\"\u001c", (byte) (109 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern());
            sb.append(str);
            return com.ironsource.adqualitysdk.sdk.i.il.m8076(cipher.doFinal(sb.toString().getBytes(m8086(android.view.View.MeasureSpec.getMode(0) + 5, ")\u0015'\u001d\u008d", (byte) (85 - android.graphics.Color.blue(0))).intern())));
        } catch (java.io.UnsupportedEncodingException e) {
            m8084();
            throw new java.lang.RuntimeException(m8085((char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 47286), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", 354353736 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), e);
        } catch (java.security.GeneralSecurityException e2) {
            m8084();
            throw new java.lang.RuntimeException(m8085((char) (android.graphics.Color.red(0) + 47286), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 354353734).intern(), e2);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized java.lang.String m8087(java.lang.String str) throws com.ironsource.adqualitysdk.sdk.i.ip.d {
        int i = 2 % 2;
        int i2 = f2557 + 119;
        f2562 = i2 % 128;
        int i3 = i2 % 2;
        if (android.text.TextUtils.isEmpty(str)) {
            int i4 = f2557 + 85;
            f2562 = i4 % 128;
            java.lang.Object obj = null;
            if (i4 % 2 == 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
        try {
            try {
                try {
                    java.lang.String str2 = new java.lang.String(this.f2565.doFinal(com.ironsource.adqualitysdk.sdk.i.il.m8069(str)), m8086(4 - android.widget.ExpandableListView.getPackedPositionChild(0L), ")\u0015'\u001d\u008d", (byte) (android.view.View.combineMeasuredStates(0, 0) + 85)).intern());
                    if (str2.indexOf(m8086((android.os.Process.myPid() >> 22) + 40, "\u0007\u0012\u0016\u001b\u0007\u0011\u0015\u001c\u0013\n\u0015\f\u000e\u0012\u0012\u000e\u000e!\u0017\f\u0014\u001b\u0013\u0018\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014\u0012\u001d\"\u001c", (byte) (109 - android.text.TextUtils.getTrimmedLength(""))).intern()) == 0) {
                        return str2.substring(m8086(39 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), "\u0007\u0012\u0016\u001b\u0007\u0011\u0015\u001c\u0013\n\u0015\f\u000e\u0012\u0012\u000e\u000e!\u0017\f\u0014\u001b\u0013\u0018\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014\u0012\u001d\"\u001c", (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 109)).intern().length(), str2.length());
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m8086(39 - (android.os.Process.myTid() >> 22), "%\u0018\n\u001a\u0016\u0010\u0005\u0012\u0014\u0007\u0001\u000b\u0010\u0007\u0011\u001a\u000b.\u000e\u0014\u001a\u000b\u0012\u000e\u0019\u0003\u001a\n\u0007\r\u0000\u0012\u0012\u0001%\u001a\u0014'O", (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 21)).intern());
                    sb.append(str);
                    throw new com.ironsource.adqualitysdk.sdk.i.ip.d(sb.toString());
                } catch (javax.crypto.BadPaddingException e) {
                    m8084();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(e.getMessage());
                    sb2.append(m8085((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51085), "\u0000\u0000\u0000\u0000", "泹Ì軔糇", "鷷", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 738145172).intern());
                    sb2.append(str);
                    throw new com.ironsource.adqualitysdk.sdk.i.ip.d(sb2.toString());
                }
            } catch (javax.crypto.IllegalBlockSizeException e2) {
                m8084();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(e2.getMessage());
                sb3.append(m8085((char) (android.view.KeyEvent.keyCodeFromString("") + 51086), "\u0000\u0000\u0000\u0000", "泹Ì軔糇", "鷷", (-738145172) - android.view.Gravity.getAbsoluteGravity(0, 0)).intern());
                sb3.append(str);
                throw new com.ironsource.adqualitysdk.sdk.i.ip.d(sb3.toString());
            }
        } catch (com.ironsource.adqualitysdk.sdk.i.in e3) {
            m8084();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(e3.getMessage());
            sb4.append(m8085((char) (51086 - android.view.KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", "泹Ì軔糇", "鷷", (-738145172) - android.view.View.MeasureSpec.getMode(0)).intern());
            sb4.append(str);
            throw new com.ironsource.adqualitysdk.sdk.i.ip.d(sb4.toString());
        } catch (java.io.UnsupportedEncodingException e4) {
            throw new java.lang.RuntimeException(m8085((char) (47286 - android.text.TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", 354353735 - android.view.View.resolveSize(0, 0)).intern(), e4);
        }
    }

    public class d extends java.lang.Exception {
        public d(java.lang.String str) {
            super(str);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8085(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2564) ^ f2559) ^ f2560);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8086(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f2558;
            char c = f2561;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                    com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                }
            }
            str2 = new java.lang.String(cArr4);
        }
        return str2;
    }
}
