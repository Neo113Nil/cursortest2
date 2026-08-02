package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class POPTokenPayload {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ReplenishAckRequest;
    private static int valueOf;
    private static long values;
    java.lang.String[] aud;
    com.visa.cbp.sdk.facade.Auth auth;
    java.lang.String body_hash;
    com.visa.cbp.sdk.facade.Cnf cnf;
    long exp;
    com.visa.cbp.sdk.facade.Headers headers;
    long iat;
    java.lang.String iss;
    java.lang.String jti;
    java.lang.String method;
    java.lang.String path;
    java.lang.String sub;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = 122 - (s * 56);
        int i5 = i2 * 4;
        int i6 = (i * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i6;
            int i9 = i8 + 1;
            i4 = i6 + i7;
            i6 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i3++;
            int i10 = i4;
            i8 = i6;
            i6 = i10;
            int i92 = i8 + 1;
            i4 = i6 + i7;
            i6 = i92;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public POPTokenPayload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.aud = null;
        this.body_hash = null;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.iat = calendar.getTimeInMillis() / 1000;
        calendar.add(13, 59);
        this.exp = calendar.getTimeInMillis() / 1000;
        this.iss = str2;
        this.sub = str2;
        this.jti = str3;
        this.path = str4;
        this.method = str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("乏\ue111丧뮹\udce7椫됣╌\ua4c7❧䠬\ud8ec飘탚\ue5c4䎝౩籔酐\uf642\ue3a1\ue9ee਼\u1afe", android.text.TextUtils.indexOf("", ""), objArr);
        this.aud = new java.lang.String[]{((java.lang.String) objArr[0]).intern()};
        this.cnf = new com.visa.cbp.sdk.facade.Cnf(str5);
        this.headers = new com.visa.cbp.sdk.facade.Headers();
        this.auth = new com.visa.cbp.sdk.facade.Auth();
    }

    public void setHeaders(com.visa.cbp.sdk.facade.Headers headers) {
        int i = ReplenishAckRequest;
        valueOf = (i + 61) % 128;
        this.headers = headers;
        int i2 = i + 71;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void setAuth(com.visa.cbp.sdk.facade.Auth auth) {
        int i = valueOf;
        int i2 = i + 99;
        ReplenishAckRequest = i2 % 128;
        this.auth = auth;
        if (i2 % 2 != 0) {
            throw null;
        }
        ReplenishAckRequest = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    public void setBody_hash(java.lang.String str) {
        int i = valueOf;
        ReplenishAckRequest = (i + 67) % 128;
        this.body_hash = str;
        ReplenishAckRequest = (i + 17) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 75;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.visa.cbp.getSignature getsignature = new com.visa.cbp.getSignature();
        char[] valueOf2 = com.visa.cbp.getSignature.valueOf(values ^ 525091148651277305L, cArr, i);
        getsignature.valueOf = 4;
        while (getsignature.valueOf < valueOf2.length) {
            $10 = ($11 + 63) % 128;
            getsignature.ConfirmReplenishRequest = getsignature.valueOf - 4;
            int i3 = getsignature.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(valueOf2[getsignature.valueOf] ^ valueOf2[getsignature.valueOf % 4]), java.lang.Long.valueOf(getsignature.ConfirmReplenishRequest), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-330680783);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), android.widget.ExpandableListView.getPackedPositionType(0L) + 1467, 19 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-330680783, obj);
                }
                valueOf2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                try {
                    java.lang.Object[] objArr4 = {getsignature, getsignature};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(81232025);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 49745), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 125, android.view.View.MeasureSpec.getMode(0) + 29);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, 0, (short) 1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(81232025, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new java.lang.String(valueOf2, 4, valueOf2.length - 4);
    }

    public /* synthetic */ POPTokenPayload() {
    }

    static void init$0() {
        $$a = new byte[]{2, com.google.common.base.Ascii.CAN, 98, 103};
        $$b = 83;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ReplenishAckRequest = 0;
        valueOf = 1;
        values = 3220821612651606309L;
    }
}
