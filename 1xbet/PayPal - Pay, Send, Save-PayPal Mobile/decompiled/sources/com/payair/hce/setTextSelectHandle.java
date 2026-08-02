package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextSelectHandle extends com.payair.hce.setTextSelectHandleLeft {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static short[] DigitizedCardProfile;
    private static int RecordsJson;
    private static int getProfileVersion;
    private static int valueOf;
    private static byte[] values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (s * 3) + 104;
        int i6 = 4 - (i2 * 2);
        byte[] bArr = $$a;
        int i7 = (i * 4) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6++;
            i5 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i6++;
            i5 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        int i = RecordsJson + 109;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (obj != null) {
            com.payair.hce.setSelection DigitizedCardProfile2 = DigitizedCardProfile();
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2, java.lang.String.valueOf(((java.util.Date) obj).getTime())}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile2));
            int i2 = RecordsJson + 65;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        com.payair.hce.setSelection DigitizedCardProfile3 = DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(1635236905 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 242895795 - android.view.MotionEvent.axisFromString(""), android.view.KeyEvent.keyCodeFromString("") - 122, (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777270), (short) ((-107) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile3, ((java.lang.String) objArr[0]).intern()}, 300113520, -300113519, java.lang.System.identityHashCode(DigitizedCardProfile3));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = 2;
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(writeReplace)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 30 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i7 = $11 + 29;
                $10 = i7 % 128;
                if (i7 % 2 == 0) {
                    z = true;
                    if (z) {
                        byte[] bArr2 = values;
                        if (bArr2 != null) {
                            int length2 = bArr2.length;
                            byte[] bArr3 = new byte[length2];
                            int i8 = 0;
                            while (i8 < length2) {
                                int i9 = $11 + 81;
                                $10 = i9 % 128;
                                if (i9 % i6 != 0) {
                                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i8])};
                                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj2 == null) {
                                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 5088 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("e", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                    }
                                    bArr3[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                                } else {
                                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr2[i8])};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 5088 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                                    }
                                    bArr3[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                                    i8++;
                                }
                                i6 = 2;
                            }
                            bArr2 = bArr3;
                        }
                        if (bArr2 != null) {
                            byte[] bArr4 = values;
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                            }
                            intValue = (byte) (((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (writeReplace ^ (-4897270311952305750L))));
                        } else {
                            intValue = (short) (((short) (DigitizedCardProfile[i2 + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (writeReplace ^ (-4897270311952305750L))));
                            $10 = ($11 + 115) % 128;
                        }
                    }
                    if (intValue > 0) {
                        int i10 = (int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L));
                        if (z) {
                            $10 = ($11 + 81) % 128;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i10 + i4;
                        java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(valueOf), sb};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj5 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2364, (char) android.text.TextUtils.getTrimmedLength(""));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((short) 0, 0, 0, objArr7);
                            obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr5 = values;
                        if (bArr5 != null) {
                            int i11 = $11 + 51;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                length = bArr5.length;
                                bArr = new byte[length];
                                i5 = 1;
                            } else {
                                length = bArr5.length;
                                bArr = new byte[length];
                                i5 = 0;
                            }
                            while (i5 < length) {
                                bArr[i5] = (byte) (bArr5[i5] ^ (-4897270311952305750L));
                                i5++;
                            }
                            bArr5 = bArr;
                        }
                        if (bArr5 != null) {
                            int i12 = $11 + 5;
                            $10 = i12 % 128;
                            if (i12 % 2 == 0) {
                                z2 = true;
                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                    if (z2) {
                                        $10 = ($11 + 57) % 128;
                                        byte[] bArr6 = values;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    } else {
                                        short[] sArr = DigitizedCardProfile;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                    }
                                    sb.append(gettrack2constructiondata.values);
                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                    gettrack2constructiondata.DigitizedCardProfile++;
                                }
                            }
                        }
                        z2 = false;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            z = false;
            if (z) {
            }
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson = -293501466;
        writeReplace = 520368595;
        valueOf = -2121501201;
        values = new byte[]{33, 10, -127, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
    }

    static void init$0() {
        $$a = new byte[]{41, 86, 91, 57};
        $$b = 7;
    }
}
