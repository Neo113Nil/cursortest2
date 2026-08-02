package com.visa.cbp.external.version;

/* loaded from: classes16.dex */
public class VisaSDKVersion {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ReplenishAckRequest;
    private static int valueOf;
    private static char[] values;
    private com.visa.cbp.external.version.JarVersion jarVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5;
        int i6 = (i2 * 4) + 4;
        int i7 = 1 - (i * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i5 = 0;
            i6++;
            i3 = i9 + i8;
            i4 = i5;
            int i10 = i3;
            int i11 = i6;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i10;
            if (i5 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i11];
            i9 = i10;
            i6 = i11;
            i6++;
            i3 = i9 + i8;
            i4 = i5;
            int i102 = i3;
            int i112 = i6;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i102;
            if (i5 == i7) {
            }
        } else {
            i3 = 100 - s;
            i4 = 0;
            int i1022 = i3;
            int i1122 = i6;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i1022;
            if (i5 == i7) {
            }
        }
    }

    public void setJarVersion(com.visa.cbp.external.version.JarVersion jarVersion) {
        int i = valueOf;
        int i2 = i + 91;
        ReplenishAckRequest = i2 % 128;
        this.jarVersion = jarVersion;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 65;
        ReplenishAckRequest = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public com.visa.cbp.external.version.JarVersion getJarVersion() {
        int i = ReplenishAckRequest + 93;
        valueOf = i % 128;
        com.visa.cbp.external.version.JarVersion jarVersion = this.jarVersion;
        if (i % 2 == 0) {
            return jarVersion;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, new int[]{0, 26, 0, 24}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.jarVersion.toString());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        ReplenishAckRequest = (valueOf + 95) % 128;
        return obj;
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c;
        java.lang.String str2 = str;
        int i = $11 + 65;
        $10 = i % 128;
        byte[] bArr = str2;
        if (i % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.visa.cbp.ReplenishResponse replenishResponse = new com.visa.cbp.ReplenishResponse();
        char c2 = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr3 = values;
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c2] = java.lang.Integer.valueOf(cArr3[i6]);
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-586396651);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.graphics.PointF.length(f, f) > f ? 1 : (android.graphics.PointF.length(f, f) == f ? 0 : -1)), (android.os.Process.myPid() >> 22) + 1701, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-586396651, obj);
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i6++;
                    c2 = 0;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i3];
        java.lang.System.arraycopy(cArr3, i2, cArr5, 0, i3);
        if (bArr2 != null) {
            int i7 = $11 + 99;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr2 = new char[i3];
                replenishResponse.ConfirmReplenishRequest = 1;
                c = 1;
            } else {
                cArr2 = new char[i3];
                replenishResponse.ConfirmReplenishRequest = 0;
                c = 0;
            }
            while (replenishResponse.ConfirmReplenishRequest < i3) {
                $10 = ($11 + 91) % 128;
                if (bArr2[replenishResponse.ConfirmReplenishRequest] == 1) {
                    int i8 = $11 + 27;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = replenishResponse.ConfirmReplenishRequest;
                        try {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr5[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                            if (obj2 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1656, 20 - android.view.View.MeasureSpec.getSize(0));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                b(0, 0, (short) 1, objArr5);
                                obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj2);
                            }
                            cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                            throw null;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i10 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr5[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1656 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 20 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b(0, 0, (short) 1, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj3);
                        }
                        cArr2[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i11 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr5[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1678831086);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21017), 348 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 32);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(0, 0, (short) 3, objArr9);
                            obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1678831086, obj4);
                        }
                        cArr2[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                        $10 = ($11 + 59) % 128;
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                c = cArr2[replenishResponse.ConfirmReplenishRequest];
                try {
                    java.lang.Object[] objArr10 = {replenishResponse, replenishResponse};
                    java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(116191609);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 59971), 1741 - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf("", "", 0, 0) + 40)).getMethod(util.h.xy.cb.b.f1091, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(116191609, obj5);
                    }
                    ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                } catch (java.lang.Throwable th5) {
                    java.lang.Throwable cause5 = th5.getCause();
                    if (cause5 == null) {
                        throw th5;
                    }
                    throw cause5;
                }
            }
            cArr5 = cArr2;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            java.lang.System.arraycopy(cArr5, 0, cArr6, 0, i3);
            int i12 = i3 - i5;
            java.lang.System.arraycopy(cArr6, 0, cArr5, i12, i5);
            java.lang.System.arraycopy(cArr6, i5, cArr5, 0, i12);
            $10 = ($11 + 39) % 128;
        }
        if (z) {
            int i13 = $11 + 41;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr = new char[i3];
                replenishResponse.ConfirmReplenishRequest = 1;
            } else {
                cArr = new char[i3];
                replenishResponse.ConfirmReplenishRequest = 0;
            }
            while (replenishResponse.ConfirmReplenishRequest < i3) {
                cArr[replenishResponse.ConfirmReplenishRequest] = cArr5[(i3 - replenishResponse.ConfirmReplenishRequest) - 1];
                replenishResponse.ConfirmReplenishRequest++;
            }
            cArr5 = cArr;
        }
        if (i4 > 0) {
            replenishResponse.ConfirmReplenishRequest = 0;
            int i14 = $10 + 11;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            while (replenishResponse.ConfirmReplenishRequest < i3) {
                cArr5[replenishResponse.ConfirmReplenishRequest] = (char) (cArr5[replenishResponse.ConfirmReplenishRequest] - iArr[2]);
                replenishResponse.ConfirmReplenishRequest++;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{104, 48, 108, -119};
        $$b = 72;
    }

    public static long d(int i, java.lang.Object obj, java.lang.Object obj2) {
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i), obj, obj2};
            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1810087414);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59972 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1741 - android.view.View.resolveSizeAndState(0, 0, 0), 40 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("x", java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1810087414, obj3);
            }
            return ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr)).longValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        ReplenishAckRequest = 1;
        values = new char[]{26523, 26560, 26562, 26590, 26567, 26609, 26568, 26565, 26569, 26590, 26584, 26562, 26560, 26562, 26590, 26567, 26609, 26620, 26603, 26599, 26614, 26566, 26562, 26611, 26597, 26617};
    }
}
