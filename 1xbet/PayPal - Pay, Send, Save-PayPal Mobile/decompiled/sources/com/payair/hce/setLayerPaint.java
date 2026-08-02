package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\u0007\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\u0006\"\u0004\b\f\u0010\nR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\t\u0010\n"}, d2 = {"Lcom/payair/hce/setLayerPaint;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "writeReplace", "Ljava/lang/String;", "valueOf", "(Ljava/lang/String;)V", "AlternateContactlessPaymentDataJson", "DigitizedCardProfile", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setLayerPaint {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "transportKey")
    private java.lang.String writeReplace;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "macKey")
    private java.lang.String values;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "dataEncryptionKey")
    private java.lang.String AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        switch ((i * 46) + (i2 * 46) + (((~(i4 | i5)) | i) * (-90)) + (((~(i2 | i)) | (~(i4 | i3))) * (-45)) + (((~((~i) | i3)) | i4 | (~(i | i5))) * 45)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                return values(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return RecordsJson(objArr);
            case 6:
                return getProfileVersion(objArr);
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        values = ((-2) - (~(((i | 80) << 1) - (i ^ 80)))) % 128;
        setlayerpaint.writeReplace = str;
        int i2 = ((i | 45) << 1) - (i ^ 45);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i ^ 69;
        int i3 = (i & 69) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        java.lang.String str = setlayerpaint.writeReplace;
        if (i4 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 51;
        int i3 = -(-((i ^ 51) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        values = i4 % 128;
        java.lang.String str = setlayerpaint.values;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = i + 117;
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i | 99) << 1;
        int i3 = -((i & (-100)) | ((~i) & 99));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        values = i4;
        setlayerpaint.values = str;
        int i5 = i4 + 55;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 7;
        values = i2 % 128;
        java.lang.String str = setlayerpaint.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i & 85;
        int i4 = (i ^ 85) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = values;
        int i2 = i & 9;
        int i3 = -(-((i ^ 9) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        setlayerpaint.AlternateContactlessPaymentDataJson = str;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setLayerPaint setlayerpaint = (com.payair.hce.setLayerPaint) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 117) << 1) - (i ^ 117);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.String str = setlayerpaint.writeReplace;
            java.lang.String str2 = setlayerpaint.values;
            java.lang.String str3 = setlayerpaint.AlternateContactlessPaymentDataJson;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PayairMobileKeys{transportKey='");
            sb.append(str);
            sb.append("', macKey='");
            sb.append(str2);
            sb.append("', dataEncryptionKey='");
            sb.append(str3);
            sb.append("'}");
            java.lang.String obj = sb.toString();
            int i3 = values;
            AlternateContactlessPaymentDataJson = (((i3 | 59) << 1) - (i3 ^ 59)) % 128;
            return obj;
        }
        java.lang.String str4 = setlayerpaint.writeReplace;
        java.lang.String str5 = setlayerpaint.values;
        java.lang.String str6 = setlayerpaint.AlternateContactlessPaymentDataJson;
        throw null;
    }

    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1751468746, 1751468746, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -378468804, 378468807, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2145535827, -2145535826, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -357788409, 357788411, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 280009314, -280009308, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 1179723462, -1179723458, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -2072861118, 2072861123, java.lang.System.identityHashCode(this));
    }
}
