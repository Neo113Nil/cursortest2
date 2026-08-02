package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class hb implements com.facetec.sdk.gz {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.String, java.lang.Integer> f3622a;
    private static char[] c;
    private static int[] e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, byte b, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 104 - b;
        int i4 = (i * 4) + 4;
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i3 = i4;
            int i6 = i5;
            i2 = 0;
            i4++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{67, 86, -53, 114};
        $$b = 50;
    }

    @Override // com.facetec.sdk.gz
    public final int c(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        java.lang.Integer num = f3622a.get(gtVar.i());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.facetec.sdk.gz
    public final int d(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        java.lang.Integer num = f3622a.get(gtVar.g());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        com.facetec.sdk.hl hlVar = new com.facetec.sdk.hl();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = e;
        int i3 = -915298838;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i5])};
                    java.lang.Object d = com.facetec.sdk.al.d(i3);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 28976), 1693 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 24 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    iArr3[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(null, objArr2)).intValue();
                    i5++;
                    i3 = -915298838;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = e;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                objArr3[i4] = java.lang.Integer.valueOf(iArr5[i6]);
                java.lang.Object d2 = com.facetec.sdk.al.d(-915298838);
                if (d2 == null) {
                    d2 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4) + 28977), android.graphics.drawable.Drawable.resolveOpacity(i4, i4) + 1693, (android.os.Process.myTid() >> 22) + 24, 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                iArr6[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
                i6++;
                i4 = 0;
            }
            i2 = i4;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr5, i2, iArr4, i2, length2);
        hlVar.d = i2;
        while (hlVar.d < iArr.length) {
            int i7 = 16;
            cArr[i2] = (char) (iArr[hlVar.d] >> 16);
            cArr[1] = (char) iArr[hlVar.d];
            cArr[2] = (char) (iArr[hlVar.d + 1] >> 16);
            char c2 = 3;
            cArr[3] = (char) iArr[hlVar.d + 1];
            hlVar.c = (cArr[0] << 16) + cArr[1];
            hlVar.e = (cArr[2] << 16) + cArr[3];
            com.facetec.sdk.hl.d(iArr4);
            int i8 = 0;
            while (i8 < i7) {
                hlVar.c ^= iArr4[i8];
                int c3 = com.facetec.sdk.hl.c(hlVar.c);
                java.lang.Object[] objArr4 = new java.lang.Object[4];
                objArr4[c2] = hlVar;
                objArr4[2] = hlVar;
                objArr4[1] = java.lang.Integer.valueOf(c3);
                objArr4[0] = hlVar;
                java.lang.Object d3 = com.facetec.sdk.al.d(-1807501612);
                if (d3 == null) {
                    byte b = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) (android.view.MotionEvent.axisFromString("") + 1), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 407, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, 866962476, false, $$c(b, (byte) (b | 34), b), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr4)).intValue();
                hlVar.c = hlVar.e;
                hlVar.e = intValue;
                i8++;
                i7 = 16;
                c2 = 3;
            }
            int i9 = hlVar.c;
            hlVar.c = hlVar.e;
            hlVar.e = i9;
            hlVar.e ^= iArr4[16];
            hlVar.c ^= iArr4[17];
            int i10 = hlVar.c;
            int i11 = hlVar.e;
            cArr[0] = (char) (hlVar.c >>> 16);
            cArr[1] = (char) hlVar.c;
            cArr[2] = (char) (hlVar.e >>> 16);
            cArr[3] = (char) hlVar.e;
            com.facetec.sdk.hl.d(iArr4);
            cArr2[hlVar.d * 2] = cArr[0];
            cArr2[(hlVar.d * 2) + 1] = cArr[1];
            cArr2[(hlVar.d * 2) + 2] = cArr[2];
            cArr2[(hlVar.d * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {hlVar, hlVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(-260749244);
            if (d4 == null) {
                byte b2 = (byte) 0;
                d4 = com.facetec.sdk.al.c((char) (18697 - android.widget.ExpandableListView.getPackedPositionType(0L)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1787, android.graphics.Color.argb(0, 0, 0, 0) + 24, 1469723324, false, $$c(b2, (byte) (b2 | com.google.common.base.Ascii.US), b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void f(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.facetec.sdk.hj hjVar = new com.facetec.sdk.hj();
        int i = iArr[0];
        int i2 = 1;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = c;
        java.lang.Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    objArr2[0] = java.lang.Integer.valueOf(cArr[i6]);
                    java.lang.Object d = com.facetec.sdk.al.d(-1287922392);
                    if (d == null) {
                        char c2 = (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        float minVolume = android.media.AudioTrack.getMinVolume();
                        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                        java.lang.Class[] clsArr = new java.lang.Class[i2];
                        clsArr[0] = java.lang.Integer.TYPE;
                        d = com.facetec.sdk.al.c(c2, 2460 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 24 - (scrollBarFadeDuration >> 16), 349480912, false, "c", clsArr);
                    }
                    cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i3);
        if (bArr2 != null) {
            char[] cArr4 = new char[i3];
            hjVar.c = 0;
            char c3 = 0;
            while (hjVar.c < i3) {
                if (bArr2[hjVar.c] == 1) {
                    int i7 = hjVar.c;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[hjVar.c]), java.lang.Integer.valueOf(c3)};
                    java.lang.Object d2 = com.facetec.sdk.al.d(966199657);
                    if (d2 == null) {
                        byte b = (byte) 0;
                        d2 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getSize(0), android.view.View.MeasureSpec.getSize(0) + 2054, 24 - android.view.KeyEvent.normalizeMetaState(0), -1636273263, false, $$c(b, (byte) (b | 6), b), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(obj, objArr3)).charValue();
                } else {
                    int i8 = hjVar.c;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[hjVar.c]), java.lang.Integer.valueOf(c3)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(-1755423365);
                    if (d3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        d3 = com.facetec.sdk.al.c((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 964 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.graphics.Color.alpha(0) + 24, 816916355, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(obj, objArr4)).charValue();
                }
                c3 = cArr4[hjVar.c];
                java.lang.Object[] objArr5 = {hjVar, hjVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1890346561);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    d4 = com.facetec.sdk.al.c((char) (58394 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1763 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 24, 683467591, false, $$c(b4, b5, (byte) (b5 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                obj = null;
                ((java.lang.reflect.Method) d4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i9 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            hjVar.c = 0;
            while (hjVar.c < i3) {
                cArr6[hjVar.c] = cArr3[(i3 - hjVar.c) - 1];
                hjVar.c++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            hjVar.c = 0;
            while (hjVar.c < i3) {
                cArr3[hjVar.c] = (char) (cArr3[hjVar.c] - iArr[2]);
                hjVar.c++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        d();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(new int[]{1875034808, 66251022}, 3 - android.graphics.Color.blue(0), objArr);
        hashMap.put((java.lang.String) objArr[0], 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(new int[]{-729135854, 2134358330}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, objArr2);
        hashMap.put((java.lang.String) objArr2[0], 10);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        f(new int[]{0, 12, 126, 3}, true, "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001", objArr3);
        hashMap.put((java.lang.String) objArr3[0], 4);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(new int[]{556448423, -1305371158, 1800630587, 1364077924, -309321168, -1304365274, 1459704979, 150750393, 852011241, -844130751}, 19 - android.text.TextUtils.getOffsetAfter("", 0), objArr4);
        hashMap.put((java.lang.String) objArr4[0], 11);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b(new int[]{-541845421, 848688880, -2098321462, -489404282, -936210405, -971558294, -1343568663, -1044540780, -1239883987, -556292349, 906174014, -1559764329}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20, objArr5);
        hashMap.put((java.lang.String) objArr5[0], 12);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b(new int[]{-960384069, 1674626017}, 2 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
        hashMap.put((java.lang.String) objArr6[0], 2);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        f(new int[]{12, 4, 0, 2}, false, "\u0001\u0000\u0001\u0001", objArr7);
        hashMap.put((java.lang.String) objArr7[0], 9);
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        f(new int[]{16, 14, 94, 0}, false, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", objArr8);
        hashMap.put((java.lang.String) objArr8[0], 6);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        f(new int[]{30, 18, 24, 0}, true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001", objArr9);
        hashMap.put((java.lang.String) objArr9[0], 8);
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b(new int[]{-1339478542, 32494343, 1708466858, -1114579701, -1428707809, -591873244, 546248459, -1716628380, 46713530, 1577856557, -822294914, 591722207, 1807137959, 1511419423}, android.view.KeyEvent.keyCodeFromString("") + 26, objArr10);
        hashMap.put((java.lang.String) objArr10[0], 3);
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        f(new int[]{48, 19, 0, 0}, false, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001", objArr11);
        hashMap.put((java.lang.String) objArr11[0], 7);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        f(new int[]{67, 12, 0, 2}, false, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", objArr12);
        hashMap.put((java.lang.String) objArr12[0], 5);
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        f(new int[]{79, 4, 0, 0}, true, "\u0000\u0001\u0000\u0001", objArr13);
        hashMap.put((java.lang.String) objArr13[0], 1);
        f3622a = hashMap;
    }

    static void d() {
        e = new int[]{1853609702, -1933796408, 1480838015, 159519949, 1717973247, -463263211, -517647372, -1455815844, -712912892, 1842459660, -494282997, 672466178, -1714094743, 2076469976, -2033593734, 1177669374, -426881059, 116323107};
        c = new char[]{47356, 47220, 47213, 47207, 47200, 47206, 47212, 47221, 47214, 47187, 47193, 47210, 47287, 47337, 47351, 47342, 47333, 47168, 47175, 47174, 47180, 47176, 47179, 47189, 47176, 47168, 47165, 47168, 47190, 47180, 47290, 47338, 47338, 47354, 47106, 47119, 47117, 47106, 47110, 47352, 47353, 47338, 47349, 47355, 47358, 47351, 47351, 47354, 47286, 47330, 47329, 47328, 47342, 47338, 47349, 47351, 47338, 47330, 47327, 47320, 47336, 47351, 47338, 47336, 47338, 47327, 47314, 47264, 47314, 47328, 47330, 47329, 47328, 47342, 47338, 47349, 47351, 47338, 47330, 47283, 47338, 47349, 47338};
    }
}
