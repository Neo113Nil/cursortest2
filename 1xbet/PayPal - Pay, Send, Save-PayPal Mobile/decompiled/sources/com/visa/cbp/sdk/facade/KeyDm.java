package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class KeyDm {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long BuildConfig;
    private static char[] valueOf;
    java.lang.String alg;
    java.util.List<com.visa.cbp.sdk.facade.DkmPart> dkm_parts;
    java.lang.String mac_tag_alg;
    java.lang.String nonce;
    java.lang.String op_profile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (b * 4);
        byte[] bArr = $$a;
        int i5 = i * 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i4;
            int i6 = i5;
            i2 = 0;
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i5) {
            }
        } else {
            int i7 = 106 - b2;
            i2 = 0;
            i3 = i4;
            i4 = i7;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i5) {
            }
        }
    }

    public KeyDm(java.lang.String str, java.util.List<com.visa.cbp.sdk.facade.DkmPart> list) {
        this.dkm_parts = null;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 15, android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 14039), objArr);
        this.alg = ((java.lang.String) objArr[0]).intern();
        this.nonce = str;
        this.op_profile = "https://www.visa.com/key_dm/op_profile/concat-kdf/default";
        this.dkm_parts = list;
        this.mac_tag_alg = org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA256;
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.visa.cbp.ReplenishRequest replenishRequest = new com.visa.cbp.ReplenishRequest();
        long[] jArr = new long[i];
        replenishRequest.ConfirmReplenishRequest = 0;
        $11 = ($10 + 103) % 128;
        while (replenishRequest.ConfirmReplenishRequest < i) {
            int i3 = replenishRequest.ConfirmReplenishRequest;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(valueOf[i2 + replenishRequest.ConfirmReplenishRequest])};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.resolveSize(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 958, 20 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, (byte) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj);
                }
                try {
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(replenishRequest.ConfirmReplenishRequest), java.lang.Long.valueOf(BuildConfig), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.getGidForName("") + 1), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 257, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 25);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, 0, (byte) 2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj2);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    try {
                        java.lang.Object[] objArr6 = {replenishRequest, replenishRequest};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (44626 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1566 - android.text.TextUtils.indexOf("", ""), 19 - android.graphics.Color.green(0));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((byte) 0, 0, (byte) 0, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
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
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i];
        replenishRequest.ConfirmReplenishRequest = 0;
        while (replenishRequest.ConfirmReplenishRequest < i) {
            $11 = ($10 + 39) % 128;
            cArr[replenishRequest.ConfirmReplenishRequest] = (char) jArr[replenishRequest.ConfirmReplenishRequest];
            try {
                java.lang.Object[] objArr8 = {replenishRequest, replenishRequest};
                java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.KeyEvent.getDeadChar(0, 0) + 44626), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1566, 19 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b((byte) 0, 0, (byte) 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public /* synthetic */ KeyDm() {
    }

    static void init$0() {
        $$a = new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -9, 72, 100};
        $$b = 183;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = new char[]{39586, 56714, 5351, 20430, 34352, 63745, 12308, 27478, 41861, 6883, 23970, 37950, 53091, 1536, 31023};
        BuildConfig = -3521664940672095470L;
    }
}
