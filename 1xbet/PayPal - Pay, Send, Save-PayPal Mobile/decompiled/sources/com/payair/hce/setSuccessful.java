package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSuccessful extends java.lang.Exception {
    private static final byte[] $$a = {14, 101, 71, 43};
    private static final int $$b = 6;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 4;
        int i4 = 66 - (i * 3);
        int i5 = 3 - (s2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i3;
            i4 += i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            i4 += i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static void d(java.lang.Object obj, java.lang.Object obj2) {
        try {
            java.lang.Object[] objArr = {obj, obj2};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj3 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2923, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3038));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((short) 0, 0, (short) 0, objArr2);
                obj3 = cls.getMethod((java.lang.String) objArr2[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
