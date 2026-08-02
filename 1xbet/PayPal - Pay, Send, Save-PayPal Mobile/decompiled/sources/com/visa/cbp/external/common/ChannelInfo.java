package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class ChannelInfo {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    private static char[] ConfirmReplenishRequest;
    private static int ReplenishAckRequest;
    private static int valueOf;
    private java.lang.String encryptionScheme;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (s * 4);
        int i5 = 110 - (i * 2);
        byte[] bArr = $$a;
        int i6 = 4 - (b * 4);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i5;
            i5 = bArr[i6];
            i6++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public void init() {
        java.lang.Object obj;
        int i = valueOf + 67;
        ReplenishAckRequest = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((byte) (102 / (android.view.ViewConfiguration.getTouchSlop() - 26)), "\u0001\u0002\u0005\u0007\u0000\u0006㘜", android.text.TextUtils.getTrimmedLength("") + 111, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((byte) (73 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), "\u0001\u0002\u0005\u0007\u0000\u0006㘜", android.text.TextUtils.getTrimmedLength("") + 7, objArr2);
            obj = objArr2[0];
        }
        this.encryptionScheme = ((java.lang.String) obj).intern();
    }

    public java.lang.String getEncryptionScheme() {
        int i = ReplenishAckRequest;
        int i2 = i + 95;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.encryptionScheme;
        valueOf = (i + 69) % 128;
        return str;
    }

    public void setEncryptionScheme(java.lang.String str) {
        int i = ReplenishAckRequest + 33;
        valueOf = i % 128;
        this.encryptionScheme = str;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.visa.cbp.Signature signature = new com.visa.cbp.Signature();
        char[] cArr2 = ConfirmReplenishRequest;
        if (cArr2 != null) {
            int i4 = $11 + 103;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i3])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(314573188);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 21401), 1781 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 25 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("k", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(314573188, obj);
                    }
                    cArr[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 53) % 128;
            cArr2 = cArr;
        }
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(BuildConfig)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(314573188);
            long j = 0;
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.indexOf("", "") + 21401), 1782 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 26 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).getMethod("k", java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(314573188, obj2);
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                $10 = ($11 + 65) % 128;
                signature.BuildConfig = 0;
                while (signature.BuildConfig < i2) {
                    signature.valueOf = charArray[signature.BuildConfig];
                    signature.ReplenishAckRequest = charArray[signature.BuildConfig + 1];
                    if (signature.valueOf == signature.ReplenishAckRequest) {
                        cArr3[signature.BuildConfig] = (char) (signature.valueOf - b);
                        cArr3[signature.BuildConfig + 1] = (char) (signature.ReplenishAckRequest - b);
                    } else {
                        try {
                            java.lang.Object[] objArr4 = {signature, signature, java.lang.Integer.valueOf(charValue), signature, signature, java.lang.Integer.valueOf(charValue), signature, signature, java.lang.Integer.valueOf(charValue), signature, signature, java.lang.Integer.valueOf(charValue), signature};
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1991430142);
                            if (obj3 == null) {
                                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.elapsedRealtimeNanos() > j ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 205, 19 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                b(1, (byte) 0, (short) 0, objArr5);
                                obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1991430142, obj3);
                            }
                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue() == signature.getTvls) {
                                $11 = ($10 + 105) % 128;
                                try {
                                    java.lang.Object[] objArr6 = {signature, signature, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), signature, signature, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), signature, java.lang.Integer.valueOf(charValue), signature};
                                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-693002299);
                                    if (obj4 == null) {
                                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (39552 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), 653 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 20);
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        b(0, (byte) 0, (short) 0, objArr7);
                                        obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-693002299, obj4);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue();
                                    int i5 = signature.values;
                                    int i6 = signature.getTvls;
                                    cArr3[signature.BuildConfig] = cArr2[intValue];
                                    cArr3[signature.BuildConfig + 1] = cArr2[(i5 * charValue) + i6];
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else if (signature.ConfirmReplenishRequest == signature.values) {
                                signature.getTokenInfo = ((signature.getTokenInfo + charValue) - 1) % charValue;
                                signature.getTvls = ((signature.getTvls + charValue) - 1) % charValue;
                                int i7 = signature.ConfirmReplenishRequest;
                                int i8 = signature.getTokenInfo;
                                int i9 = signature.values;
                                int i10 = signature.getTvls;
                                cArr3[signature.BuildConfig] = cArr2[(i7 * charValue) + i8];
                                cArr3[signature.BuildConfig + 1] = cArr2[(i9 * charValue) + i10];
                            } else {
                                int i11 = signature.ConfirmReplenishRequest;
                                int i12 = signature.getTvls;
                                int i13 = signature.values;
                                int i14 = signature.getTokenInfo;
                                cArr3[signature.BuildConfig] = cArr2[(i11 * charValue) + i12];
                                cArr3[signature.BuildConfig + 1] = cArr2[(i13 * charValue) + i14];
                            }
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    signature.BuildConfig += 2;
                    j = 0;
                }
            }
            int i15 = 0;
            while (i15 < i) {
                cArr3[i15] = (char) (cArr3[i15] ^ 13722);
                i15++;
                $11 = ($10 + 49) % 128;
            }
            objArr[0] = new java.lang.String(cArr3);
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.RS, -55, 87};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ReplenishAckRequest = 0;
        valueOf = 1;
        ConfirmReplenishRequest = new char[]{34885, 34884, 34886, 34908, 34902, 34910, 34887, 34881, 34888};
        BuildConfig = (char) 48526;
    }
}
