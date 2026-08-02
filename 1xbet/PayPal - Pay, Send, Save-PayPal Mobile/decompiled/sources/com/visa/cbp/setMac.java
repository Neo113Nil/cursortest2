package com.visa.cbp;

/* loaded from: classes5.dex */
public final class setMac {
    public static final byte[] $$a = {115, 60, -59, 115};
    public static final int $$b = 98;
    public int BuildConfig;
    public int valueOf;

    public static void e(java.lang.Object obj, java.lang.Object obj2) {
        try {
            java.lang.Object[] objArr = {obj, obj2};
            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
            if (obj3 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 44627), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1566, android.view.KeyEvent.normalizeMetaState(0) + 19);
                java.lang.String str = new java.lang.String("j".getBytes(), 0);
                java.lang.String str2 = str;
                obj3 = cls.getMethod(str, java.lang.Object.class, java.lang.Object.class);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj3);
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
