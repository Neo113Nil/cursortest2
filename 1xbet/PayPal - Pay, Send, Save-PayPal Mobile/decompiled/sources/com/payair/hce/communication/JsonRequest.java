package com.payair.hce.communication;

/* loaded from: classes4.dex */
public class JsonRequest {
    private static int getAid = 86;
    private static int getPaymentFci = 1;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "masterpassAPI")
    private static boolean getProfileVersion = false;
    private transient boolean AlternateContactlessPaymentDataJson;
    private transient boolean DigitizedCardProfile;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "orderRef")
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private transient boolean RecordsJson;
    private transient boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private transient boolean valueOf;
    private transient java.lang.String values;
    private transient java.lang.Object writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i2) | i);
        int i5 = ~(i3 | i);
        int i6 = (i * 659) + (i2 * (-657)) + (((~((~i) | i2)) | i4 | i5) * (-658)) + (i4 * 658) + ((i5 | i4) * 658);
        return i6 != 1 ? i6 != 2 ? writeReplace(objArr) : valueOf(objArr) : DigitizedCardProfile(objArr);
    }

    static {
        int i = 86 % 2;
    }

    public JsonRequest() {
        this.values = null;
        this.writeReplace = null;
        this.AlternateContactlessPaymentDataJson = true;
        this.DigitizedCardProfile = true;
        this.valueOf = false;
        this.RecordsJson = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        this.IccPrivateKeyCrtComponentsJson = null;
    }

    public JsonRequest(java.lang.String str) {
        this.writeReplace = null;
        this.AlternateContactlessPaymentDataJson = true;
        this.DigitizedCardProfile = true;
        this.valueOf = false;
        this.RecordsJson = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        this.IccPrivateKeyCrtComponentsJson = null;
        this.values = str;
    }

    public JsonRequest(java.lang.String str, boolean z) {
        this.writeReplace = null;
        this.AlternateContactlessPaymentDataJson = true;
        this.DigitizedCardProfile = true;
        this.valueOf = false;
        this.RecordsJson = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        this.IccPrivateKeyCrtComponentsJson = null;
        this.values = str;
        getProfileVersion = z;
    }

    public JsonRequest(java.lang.String str, boolean z, java.lang.Object obj) {
        this.AlternateContactlessPaymentDataJson = true;
        this.DigitizedCardProfile = true;
        this.valueOf = false;
        this.RecordsJson = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        this.IccPrivateKeyCrtComponentsJson = null;
        this.values = str;
        getProfileVersion = z;
        this.writeReplace = obj;
    }

    public JsonRequest(java.lang.String str, int i) {
        this.writeReplace = null;
        this.AlternateContactlessPaymentDataJson = true;
        this.DigitizedCardProfile = true;
        this.valueOf = false;
        this.RecordsJson = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        this.IccPrivateKeyCrtComponentsJson = null;
        this.values = str;
        setType(i);
    }

    public JsonRequest(java.lang.String str, java.lang.Object obj) {
        this.AlternateContactlessPaymentDataJson = true;
        this.DigitizedCardProfile = true;
        this.valueOf = false;
        this.RecordsJson = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        this.IccPrivateKeyCrtComponentsJson = null;
        this.values = str;
        this.writeReplace = obj;
    }

    public JsonRequest(java.lang.String str, org.json.JSONObject jSONObject, int i) {
        this.AlternateContactlessPaymentDataJson = true;
        this.DigitizedCardProfile = true;
        this.valueOf = false;
        this.RecordsJson = false;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        this.IccPrivateKeyCrtComponentsJson = null;
        this.values = str;
        this.writeReplace = jSONObject;
        setType(i);
    }

    public void setType(int i) {
        int i2 = getPaymentFci;
        int i3 = i2 & 119;
        int i4 = ((i2 ^ 119) | i3) << 1;
        int i5 = -((i2 | 119) & (~i3));
        int i6 = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        getAid = i6;
        if (i == 1) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = true;
            this.RecordsJson = false;
            this.valueOf = false;
            getPaymentFci = (((i6 & (-114)) | ((~i6) & 113)) + ((i6 & 113) << 1)) % 128;
            return;
        }
        if (i == 2) {
            this.RecordsJson = true;
            this.valueOf = false;
            this.SdkCoreAlternateContactlessPaymentDataImpl = false;
            int i7 = i6 + 107;
            getPaymentFci = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
        } else {
            if (i != 3) {
                return;
            }
            this.valueOf = true;
            this.RecordsJson = false;
            this.SdkCoreAlternateContactlessPaymentDataImpl = false;
            int i8 = ((i6 ^ 40) + ((i6 & 40) << 1)) - 1;
            getPaymentFci = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public int getJsonRequestType() {
        int i = getPaymentFci;
        int i2 = i & 57;
        int i3 = ((((~i2) & (i | 57)) - (~(-(-(i2 << 1))))) - 1) % 128;
        getAid = i3;
        if (!this.valueOf) {
            if (!this.RecordsJson) {
                if (!this.SdkCoreAlternateContactlessPaymentDataImpl) {
                    int i4 = i3 & 75;
                    int i5 = -(-(i3 | 75));
                    getPaymentFci = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
                    return 0;
                }
                int i6 = i & 17;
                int i7 = ((i6 - (~(-(-((i ^ 17) | i6))))) - 1) % 128;
                getAid = i7;
                getPaymentFci = (((i7 & 10) + (i7 | 10)) - 1) % 128;
                return 1;
            }
            int i8 = ((i & (-30)) | ((~i) & 29)) + ((i & 29) << 1);
            int i9 = i8 % 128;
            getAid = i9;
            int i10 = i8 % 2 == 0 ? 2 : 3;
            int i11 = (((i9 ^ 39) | (i9 & 39)) << 1) - ((i9 & (-40)) | ((~i9) & 39));
            getPaymentFci = i11 % 128;
            if (i11 % 2 != 0) {
                return i10;
            }
            throw new java.lang.ArithmeticException();
        }
        int i12 = i & 93;
        int i13 = i | 93;
        int i14 = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        getAid = i14;
        int i15 = i14 & 37;
        getPaymentFci = ((i15 - (~((i14 ^ 37) | i15))) - 1) % 128;
        return 3;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonRequest jsonRequest = (com.payair.hce.communication.JsonRequest) objArr[0];
        int i = getPaymentFci;
        int i2 = ((i | 13) << 1) - (i ^ 13);
        getAid = i2 % 128;
        java.lang.String str = jsonRequest.values;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setSpecialRequestUrl(java.lang.String str) {
        int i = getAid;
        int i2 = ~i;
        int i3 = (i & (-48)) | (i2 & 47);
        int i4 = -(-((i & 47) << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        getPaymentFci = i5 % 128;
        if (i5 % 2 != 0) {
            this.values = str;
            int i6 = (i & (-16)) | (i2 & 15);
            int i7 = (i & 15) << 1;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            getPaymentFci = i8 % 128;
            if (i8 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.values = str;
        throw null;
    }

    public java.lang.Object getjSONObject() {
        int i = getAid;
        getPaymentFci = ((-2) - (~(((i | 78) << 1) - (i ^ 78)))) % 128;
        java.lang.Object obj = this.writeReplace;
        getPaymentFci = (i + 51) % 128;
        return obj;
    }

    public void setjSONObject(org.json.JSONObject jSONObject) {
        int i = getPaymentFci;
        int i2 = i & 69;
        int i3 = (~i2) & (i | 69);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getAid = i5 % 128;
        if (i5 % 2 == 0) {
            this.writeReplace = jSONObject;
            int i6 = (i ^ 25) + ((i & 25) << 1);
            getAid = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.writeReplace = jSONObject;
        throw null;
    }

    public boolean gotPostData() {
        int i = getPaymentFci;
        int i2 = (i & (-48)) | ((~i) & 47);
        int i3 = (i & 47) << 1;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getAid = i4;
        boolean z = this.RecordsJson;
        int i5 = i4 & 23;
        int i6 = (i4 ^ 23) | i5;
        getPaymentFci = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        return z;
    }

    public boolean gotPutData() {
        int i = getPaymentFci;
        int i2 = (i & (-84)) | ((~i) & 83);
        int i3 = (i & 83) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        getAid = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i6 = i5 & 15;
        int i7 = ((i5 ^ 15) | i6) << 1;
        int i8 = -((i5 | 15) & (~i6));
        getPaymentFci = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
        return z;
    }

    public boolean gotDeleteData() {
        int i = getPaymentFci;
        int i2 = i & 49;
        int i3 = (i ^ 49) | i2;
        getAid = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        boolean z = this.valueOf;
        int i4 = ((i & 46) + (i | 46)) - 1;
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    public boolean isSendHeaders() {
        int i = getAid;
        int i2 = i | 15;
        int i3 = ((i2 << 1) - ((~(i & 15)) & i2)) % 128;
        getPaymentFci = i3;
        boolean z = this.AlternateContactlessPaymentDataJson;
        int i4 = ((i3 ^ 58) + ((i3 & 58) << 1)) - 1;
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void setSendHeaders(boolean z) {
        int i = getAid;
        int i2 = (-2) - (~((i & 114) + (i | 114)));
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            this.AlternateContactlessPaymentDataJson = z;
            int i3 = i & 61;
            int i4 = -(-((i ^ 61) | i3));
            int i5 = (i3 & i4) + (i3 | i4);
            getPaymentFci = i5 % 128;
            if (i5 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.AlternateContactlessPaymentDataJson = z;
        throw null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonRequest [specialRequestUrl=");
        sb.append((java.lang.String) values(new java.lang.Object[]{this}, -2120511387, 2120511388, java.lang.System.identityHashCode(this)));
        sb.append(", jSONObject=");
        sb.append(getjSONObject());
        sb.append("]");
        java.lang.String obj = sb.toString();
        int i = getPaymentFci;
        int i2 = ((i | 84) << 1) - (i ^ 84);
        getAid = ((~i2) + (i2 << 1)) % 128;
        return obj;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonRequest jsonRequest = (com.payair.hce.communication.JsonRequest) objArr[0];
        int i = getAid;
        int i2 = i & 21;
        int i3 = (i2 + ((i ^ 21) | i2)) % 128;
        getPaymentFci = i3;
        boolean z = jsonRequest.DigitizedCardProfile;
        int i4 = (i3 & (-40)) | ((~i3) & 39);
        int i5 = (i3 & 39) << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        getAid = i6 % 128;
        if (i6 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    public void setSendAuthenticationHeader(boolean z) {
        int i = getPaymentFci;
        int i2 = i & 41;
        getAid = ((i2 - (~((i ^ 41) | i2))) - 1) % 128;
        this.DigitizedCardProfile = z;
        getAid = ((-2) - (~(i + 38))) % 128;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonRequest jsonRequest = (com.payair.hce.communication.JsonRequest) objArr[0];
        int i = getPaymentFci;
        int i2 = (i & (-6)) | ((~i) & 5);
        int i3 = (i & 5) << 1;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        getAid = i4;
        java.lang.String str = jsonRequest.IccPrivateKeyCrtComponentsJson;
        int i5 = i4 & 113;
        int i6 = (i4 ^ 113) | i5;
        int i7 = (i5 & i6) + (i5 | i6);
        getPaymentFci = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setOrderRef(java.lang.String str) {
        this.IccPrivateKeyCrtComponentsJson = str;
        int i = getAid;
        int i2 = i & 45;
        int i3 = (i2 - (~((i ^ 45) | i2))) - 1;
        getPaymentFci = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -930130167, 930130167, java.lang.System.identityHashCode(this));
    }

    final boolean values() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -590464632, 590464634, java.lang.System.identityHashCode(this))).booleanValue();
    }

    final java.lang.String valueOf() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -2120511387, 2120511388, java.lang.System.identityHashCode(this));
    }
}
