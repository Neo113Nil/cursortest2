package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class ke {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2999 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3000 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f3001 = 2369173896520347829L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8353(com.ironsource.adqualitysdk.sdk.i.je jeVar) {
        int i = 2 % 2;
        int i2 = f2999 + 3;
        f3000 = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.util.concurrent.Executors.newSingleThreadExecutor().execute(jeVar);
            int i4 = f2999 + 61;
            f3000 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8351("틭튬㙿ڮङᘇ栢葭ၘ얚ⵎ䊀圼職\uee7fƩ髽伽", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern(), m8351("りハຶ㹱ﴖ扊鰎\uf03a\uf22cﴟ\ud94d㛁땇뢈ᩱ痹碟矩咗룱㮻㋀釕ｋﻍ\uf04f틬ɨꀁ콰", 1 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static long m8354() {
        int i = 2 % 2;
        int i2 = f3000 + 79;
        f2999 = i2 % 128;
        if (i2 % 2 != 0) {
            java.util.Calendar.getInstance().getTimeInMillis();
            throw null;
        }
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
        int i3 = f3000 + 87;
        f2999 = i3 % 128;
        if (i3 % 2 == 0) {
            return timeInMillis;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static long m8356() {
        int i = 2 % 2;
        int i2 = f2999 + 99;
        f3000 = i2 % 128;
        if (i2 % 2 != 0) {
            return android.os.SystemClock.elapsedRealtime();
        }
        android.os.SystemClock.elapsedRealtime();
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e4, code lost:
    
        if (r3 == null) goto L27;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m8352(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        javax.crypto.CipherInputStream cipherInputStream;
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            byte[] decode = android.util.Base64.decode(str.getBytes(), 0);
            byte[] copyOfRange = java.util.Arrays.copyOfRange(decode, 16, decode.length);
            try {
                byte[] m8357 = m8357(str3);
                byte[] m83572 = m8357(str4);
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(m8351("䚟䛞\uff00쿰틈\ue3f1돱燁萈ೋ\uf6b5뜭썧䤖㖙\uf465໖虡筏㤎䶫썬븜绹", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                cipher.init(2, javax.crypto.SecretKeyFactory.getInstance(m8351("\ue0c0\ue090쌁\uf3f6떸ꬸ풗㥰≝ボ野ﾆ攬畩勫벱꣸먂ᱫ熕\uebd2ｍ\ud956㘖⺡㶋騛쬸灺˯䟷衠덜䟅À亀\uf633萘", 1 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m8351("辁迃恞储乄袿", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern()).generateSecret(new javax.crypto.spec.PBEKeySpec(str2.toCharArray(), m83572, 1, 256)), new javax.crypto.spec.IvParameterSpec(m8357, 0, cipher.getBlockSize()));
                cipherInputStream = new javax.crypto.CipherInputStream(new java.io.ByteArrayInputStream(copyOfRange), cipher);
                try {
                    m8351("Ⱜⱹй㓘씌㩛ꐠꡩ\ueec0", -android.os.Process.getGidForName("")).intern();
                    byte[] bArr = new byte[8192];
                    for (int read = cipherInputStream.read(bArr); read >= 0; read = cipherInputStream.read(bArr)) {
                        sb.append(new java.lang.String(bArr, 0, read, m8351("Ⱜⱹй㓘씌㩛ꐠꡩ\ueec0", android.view.View.combineMeasuredStates(0, 0) + 1).intern()));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    try {
                        com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8351("틭튬㙿ڮङᘇ栢葭ၘ얚ⵎ䊀圼職\uee7fƩ髽伽", 1 - (android.view.ViewConfiguration.getTapTimeout() >> 16)).intern(), m8351("␡⑤娈櫏쯙例꫁\uddfb\ue687ꦡ\uef83ᬝꇪ\uec27Ⲳ堼氩⍐扑長⽑晾ꜗ튖\uea6c꒿\ue430", 1 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, false);
                    } catch (java.lang.Throwable th2) {
                        if (cipherInputStream != null) {
                            try {
                                cipherInputStream.close();
                                int i2 = f3000 + 121;
                                f2999 = i2 % 128;
                                if (i2 % 2 != 0) {
                                    int i3 = 4 % 3;
                                }
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                cipherInputStream = null;
            }
            try {
                cipherInputStream.close();
            } catch (java.lang.Throwable unused2) {
            }
        } catch (java.lang.Throwable th4) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8351("틭튬㙿ڮङᘇ栢葭ၘ얚ⵎ䊀圼職\uee7fƩ髽伽", 1 - android.text.TextUtils.indexOf("", "")).intern(), m8351("輡轤퇀\ue107䈟ꗁ⌇㞱䶇≩時\uf140૬柼ꕹ뉯윳ꢖ\uebd9缾萔\ueda6⻗㣗䅵⽭涱엣\u1fb5ည뀒", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), th4, false);
        }
        java.lang.String obj = sb.toString();
        int i4 = f2999 + 73;
        f3000 = i4 % 128;
        if (i4 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m8357(java.lang.String str) {
        int i = 2 % 2;
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i2 = 0;
        while (i2 < length) {
            int i3 = f3000 + 13;
            f2999 = i3 % 128;
            int i4 = i3 % 2;
            bArr[i2 / 2] = (byte) ((java.lang.Character.digit(str.charAt(i2), 16) << 4) + java.lang.Character.digit(str.charAt(i2 + 1), 16));
            i2 += 2;
            int i5 = f3000 + 3;
            f2999 = i5 % 128;
            int i6 = i5 % 2;
        }
        return bArr;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.util.List m8355(java.util.List list, java.util.List list2) {
        int i = 2 % 2;
        java.util.HashSet hashSet = new java.util.HashSet(list);
        if (list2 != null) {
            int i2 = f2999 + 91;
            f3000 = i2 % 128;
            int i3 = i2 % 2;
            hashSet.addAll(list2);
            int i4 = f3000 + 95;
            f2999 = i4 % 128;
            int i5 = i4 % 2;
        }
        return new java.util.ArrayList(hashSet);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m8351(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f3001, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f3001));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
