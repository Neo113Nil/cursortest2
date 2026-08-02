package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class CardAcceptor {
    public static final byte[] $$a = {43, -112, -106, -108};
    public static final int $$b = 157;
    private com.visa.cbp.mpqr.facade.BillingAddress address;
    private java.lang.String idCode;

    /* renamed from: name, reason: collision with root package name */
    private java.lang.String f6678name;
    private java.lang.String terminalId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = (s2 * 2) + 1;
        int i6 = 4 - (s * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i3 = i6;
            int i7 = i5;
            i4 = 0;
            i6 += i7;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i6 += i7;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i6 = 105 - (i * 3);
            i3 = i6;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public java.lang.String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(java.lang.String str) {
        this.terminalId = str;
    }

    public com.visa.cbp.mpqr.facade.BillingAddress getAddress() {
        return this.address;
    }

    public void setAddress(com.visa.cbp.mpqr.facade.BillingAddress billingAddress) {
        this.address = billingAddress;
    }

    public java.lang.String getName() {
        return this.f6678name;
    }

    public void setName(java.lang.String str) {
        this.f6678name = str;
    }

    public java.lang.String getIdCode() {
        return this.idCode;
    }

    public void setIdCode(java.lang.String str) {
        this.idCode = str;
    }

    public static long a(int i) {
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 959 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 19 - android.view.MotionEvent.axisFromString(""));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(0, (short) 0, (short) 0, objArr2);
                obj = cls.getMethod((java.lang.String) objArr2[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj);
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
