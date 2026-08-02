package com.visa.cbp;

/* loaded from: classes5.dex */
public final class setTermsAndConditionsID extends java.io.IOException {
    public static final byte[] $$a = {41, 85, 36, 65};
    public static final int $$b = 54;
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static long b(long j, long j2, long j3, int i) {
        try {
            java.lang.Object[] objArr = {java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Integer.valueOf(i)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getCapsMode("", 0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 258, 25 - android.text.TextUtils.indexOf("", "", 0));
                byte[] bArr = new byte[1];
                bArr[0] = (byte) ($$a != null ? 104 : 4);
                java.lang.String str = new java.lang.String(bArr, 0);
                java.lang.String str2 = str;
                obj = cls.getMethod(str, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj);
            }
            return ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr)).longValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
