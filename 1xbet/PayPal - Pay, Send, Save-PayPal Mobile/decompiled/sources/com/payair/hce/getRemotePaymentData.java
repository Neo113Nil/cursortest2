package com.payair.hce;

/* loaded from: classes4.dex */
public class getRemotePaymentData implements java.io.Closeable, java.io.Flushable {
    private static final java.lang.String[] DigitizedCardProfile;
    private static final java.lang.String[] values = new java.lang.String[128];
    public boolean AlternateContactlessPaymentDataJson;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private java.lang.String RecordsJson;
    private final java.io.Writer getAid;
    private java.lang.String getPaymentFci;
    public boolean valueOf;
    public boolean writeReplace;
    private int[] getProfileVersion = new int[32];
    private int SdkCoreAlternateContactlessPaymentDataImpl = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            values[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = values;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        DigitizedCardProfile = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public getRemotePaymentData(java.io.Writer writer) {
        writeReplace(6);
        this.IccPrivateKeyCrtComponentsJson = io.ktor.sse.ServerSentEventKt.COLON;
        this.AlternateContactlessPaymentDataJson = true;
        if (writer == null) {
            throw new java.lang.NullPointerException("out == null");
        }
        this.getAid = writer;
    }

    public com.payair.hce.getRemotePaymentData valueOf() throws java.io.IOException {
        return values(1, 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    public com.payair.hce.getRemotePaymentData values() throws java.io.IOException {
        return values(3, 5, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
    }

    private void writeReplace(int i) {
        int i2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int[] iArr = this.getProfileVersion;
        if (i2 == iArr.length) {
            this.getProfileVersion = java.util.Arrays.copyOf(iArr, i2 << 1);
        }
        int[] iArr2 = this.getProfileVersion;
        int i3 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        this.SdkCoreAlternateContactlessPaymentDataImpl = i3 + 1;
        iArr2[i3] = i;
    }

    public com.payair.hce.getRemotePaymentData writeReplace(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            throw new java.lang.NullPointerException("name == null");
        }
        if (this.getPaymentFci != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.SdkCoreAlternateContactlessPaymentDataImpl == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.getPaymentFci = str;
        return this;
    }

    public com.payair.hce.getRemotePaymentData DigitizedCardProfile(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return writeReplace();
        }
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        RecordsJson();
        valueOf(str);
        return this;
    }

    public final com.payair.hce.getRemotePaymentData AlternateContactlessPaymentDataJson(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return writeReplace();
        }
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        RecordsJson();
        this.getAid.append((java.lang.CharSequence) str);
        return this;
    }

    public com.payair.hce.getRemotePaymentData writeReplace() throws java.io.IOException {
        java.lang.String str = this.getPaymentFci;
        if (str != null) {
            if (!this.AlternateContactlessPaymentDataJson) {
                this.getPaymentFci = null;
                return this;
            }
            if (str != null) {
                IccPrivateKeyCrtComponentsJson();
                valueOf(this.getPaymentFci);
                this.getPaymentFci = null;
            }
        }
        RecordsJson();
        this.getAid.write("null");
        return this;
    }

    public com.payair.hce.getRemotePaymentData valueOf(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return writeReplace();
        }
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        RecordsJson();
        this.getAid.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public com.payair.hce.getRemotePaymentData writeReplace(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return writeReplace();
        }
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        java.lang.String obj = number.toString();
        if (!this.valueOf && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(number)));
        }
        RecordsJson();
        this.getAid.append((java.lang.CharSequence) obj);
        return this;
    }

    public void flush() throws java.io.IOException {
        if (this.SdkCoreAlternateContactlessPaymentDataImpl == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.getAid.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.getAid.close();
        int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i > 1 || (i == 1 && this.getProfileVersion[i - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(java.lang.String str) throws java.io.IOException {
        int i;
        java.lang.String str2;
        java.lang.String[] strArr = this.writeReplace ? DigitizedCardProfile : values;
        this.getAid.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.getAid.write(str, i2, i - i2);
                }
                this.getAid.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.getAid.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.getAid.write(str, i2, length - i2);
        }
        this.getAid.write(34);
    }

    private void SdkCoreAlternateContactlessPaymentDataImpl() throws java.io.IOException {
        if (this.RecordsJson != null) {
            this.getAid.write(10);
            int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
            for (int i2 = 1; i2 < i; i2++) {
                this.getAid.write(this.RecordsJson);
            }
        }
    }

    public com.payair.hce.getRemotePaymentData DigitizedCardProfile() throws java.io.IOException {
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        RecordsJson();
        writeReplace(1);
        this.getAid.write(91);
        return this;
    }

    public com.payair.hce.getRemotePaymentData AlternateContactlessPaymentDataJson() throws java.io.IOException {
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        RecordsJson();
        writeReplace(3);
        this.getAid.write(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        return this;
    }

    private com.payair.hce.getRemotePaymentData values(int i, int i2, char c) throws java.io.IOException {
        int i3 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i3 == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i4 = i3 - 1;
        int i5 = this.getProfileVersion[i4];
        if (i5 != i2 && i5 != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.getPaymentFci != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dangling name: ");
            sb.append(this.getPaymentFci);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = i4;
        if (i5 == i2) {
            SdkCoreAlternateContactlessPaymentDataImpl();
        }
        this.getAid.write(c);
        return this;
    }

    public com.payair.hce.getRemotePaymentData valueOf(boolean z) throws java.io.IOException {
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        RecordsJson();
        this.getAid.write(z ? "true" : "false");
        return this;
    }

    public com.payair.hce.getRemotePaymentData valueOf(long j) throws java.io.IOException {
        if (this.getPaymentFci != null) {
            IccPrivateKeyCrtComponentsJson();
            valueOf(this.getPaymentFci);
            this.getPaymentFci = null;
        }
        RecordsJson();
        this.getAid.write(java.lang.Long.toString(j));
        return this;
    }

    private void IccPrivateKeyCrtComponentsJson() throws java.io.IOException {
        int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.getProfileVersion[i - 1];
        if (i2 == 5) {
            this.getAid.write(44);
        } else if (i2 != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        SdkCoreAlternateContactlessPaymentDataImpl();
        this.getProfileVersion[this.SdkCoreAlternateContactlessPaymentDataImpl - 1] = 4;
    }

    private void RecordsJson() throws java.io.IOException {
        int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int[] iArr = this.getProfileVersion;
        int i2 = i - 1;
        int i3 = iArr[i2];
        if (i3 == 1) {
            iArr[i2] = 2;
            SdkCoreAlternateContactlessPaymentDataImpl();
            return;
        }
        if (i3 == 2) {
            this.getAid.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            SdkCoreAlternateContactlessPaymentDataImpl();
        } else {
            if (i3 == 4) {
                this.getAid.append((java.lang.CharSequence) this.IccPrivateKeyCrtComponentsJson);
                this.getProfileVersion[this.SdkCoreAlternateContactlessPaymentDataImpl - 1] = 5;
                return;
            }
            if (i3 != 6) {
                if (i3 == 7) {
                    if (!this.valueOf) {
                        throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new java.lang.IllegalStateException("Nesting problem.");
                }
            }
            iArr[i2] = 7;
        }
    }
}
