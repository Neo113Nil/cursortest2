package com.payair.hce;

/* loaded from: classes4.dex */
public class getAckAutomaticallyResetByApplication implements java.io.Closeable {
    private static final char[] values = com.google.gson.Gson.JSON_NON_EXECUTABLE_PREFIX.toCharArray();
    private final java.io.Reader AlternateContactlessPaymentDataJson;
    private long IccPrivateKeyCrtComponentsJson;
    private java.lang.String[] SdkCoreBusinessLogicModuleImpl;
    private java.lang.String getCiacDecline;
    private int[] getCvmResetTimeout;
    private int[] getGpoResponse;
    private int getPaymentFci;
    public boolean DigitizedCardProfile = false;
    private final char[] writeReplace = new char[1024];
    private int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private int RecordsJson = 0;
    private int getProfileVersion = 0;
    private int getAid = 0;
    int valueOf = 0;
    private int getCvrMaskAnd = 1;

    static {
        com.payair.hce.getAlternateContactlessPaymentData.writeReplace = new com.payair.hce.getAlternateContactlessPaymentData() { // from class: com.payair.hce.getAckAutomaticallyResetByApplication.3
            @Override // com.payair.hce.getAlternateContactlessPaymentData
            public final void values(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
                if (getackautomaticallyresetbyapplication instanceof com.payair.hce.getCardMetadata) {
                    com.payair.hce.getCardMetadata getcardmetadata = (com.payair.hce.getCardMetadata) getackautomaticallyresetbyapplication;
                    getcardmetadata.writeReplace(com.payair.hce.getAckPreEntryAllowed.NAME);
                    java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) getcardmetadata.writeReplace[getcardmetadata.values - 1]).next();
                    getcardmetadata.AlternateContactlessPaymentDataJson(entry.getValue());
                    getcardmetadata.AlternateContactlessPaymentDataJson(new com.payair.hce.getCvmResetTimeout((java.lang.String) entry.getKey()));
                    return;
                }
                int i = getackautomaticallyresetbyapplication.valueOf;
                if (i == 0) {
                    i = getackautomaticallyresetbyapplication.getDualTapResetTimeout();
                }
                if (i == 13) {
                    getackautomaticallyresetbyapplication.valueOf = 9;
                    return;
                }
                if (i == 12) {
                    getackautomaticallyresetbyapplication.valueOf = 8;
                } else {
                    if (i == 14) {
                        getackautomaticallyresetbyapplication.valueOf = 10;
                        return;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a name but was ");
                    sb.append(getackautomaticallyresetbyapplication.getProfileVersion());
                    sb.append(getackautomaticallyresetbyapplication.getSecurityWord());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            }
        };
    }

    public getAckAutomaticallyResetByApplication(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.getGpoResponse = iArr;
        iArr[0] = 6;
        this.SdkCoreBusinessLogicModuleImpl = new java.lang.String[32];
        this.getCvmResetTimeout = new int[32];
        if (reader == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        this.AlternateContactlessPaymentDataJson = reader;
    }

    public void AlternateContactlessPaymentDataJson() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 3) {
            writeReplace(1);
            this.getCvmResetTimeout[this.getCvrMaskAnd - 1] = 0;
            this.valueOf = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(getProfileVersion());
            sb.append(getSecurityWord());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public void valueOf() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 4) {
            int i2 = this.getCvrMaskAnd;
            this.getCvrMaskAnd = i2 - 1;
            int[] iArr = this.getCvmResetTimeout;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.valueOf = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_ARRAY but was ");
        sb.append(getProfileVersion());
        sb.append(getSecurityWord());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public void writeReplace() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 1) {
            writeReplace(3);
            this.valueOf = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(getProfileVersion());
            sb.append(getSecurityWord());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public void DigitizedCardProfile() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 2) {
            int i2 = this.getCvrMaskAnd;
            int i3 = i2 - 1;
            this.getCvrMaskAnd = i3;
            this.SdkCoreBusinessLogicModuleImpl[i3] = null;
            int[] iArr = this.getCvmResetTimeout;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.valueOf = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_OBJECT but was ");
        sb.append(getProfileVersion());
        sb.append(getSecurityWord());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public boolean values() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public com.payair.hce.getAckPreEntryAllowed getProfileVersion() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        switch (i) {
            case 1:
                return com.payair.hce.getAckPreEntryAllowed.BEGIN_OBJECT;
            case 2:
                return com.payair.hce.getAckPreEntryAllowed.END_OBJECT;
            case 3:
                return com.payair.hce.getAckPreEntryAllowed.BEGIN_ARRAY;
            case 4:
                return com.payair.hce.getAckPreEntryAllowed.END_ARRAY;
            case 5:
            case 6:
                return com.payair.hce.getAckPreEntryAllowed.BOOLEAN;
            case 7:
                return com.payair.hce.getAckPreEntryAllowed.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.payair.hce.getAckPreEntryAllowed.STRING;
            case 12:
            case 13:
            case 14:
                return com.payair.hce.getAckPreEntryAllowed.NAME;
            case 15:
            case 16:
                return com.payair.hce.getAckPreEntryAllowed.NUMBER;
            case 17:
                return com.payair.hce.getAckPreEntryAllowed.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    final int getDualTapResetTimeout() throws java.io.IOException {
        int values2;
        int[] iArr = this.getGpoResponse;
        int i = this.getCvrMaskAnd - 1;
        int i2 = iArr[i];
        if (i2 == 1) {
            iArr[i] = 2;
        } else if (i2 == 2) {
            int values3 = values(true);
            if (values3 != 44) {
                if (values3 != 59) {
                    if (values3 == 93) {
                        this.valueOf = 4;
                        return 4;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unterminated array");
                    sb.append(getSecurityWord());
                    throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb.toString());
                }
                if (!this.DigitizedCardProfile) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb2.append(getSecurityWord());
                    throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb2.toString());
                }
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i] = 4;
                if (i2 == 5 && (values2 = values(true)) != 44) {
                    if (values2 != 59) {
                        if (values2 == 125) {
                            this.valueOf = 2;
                            return 2;
                        }
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unterminated object");
                        sb3.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb3.toString());
                    }
                    if (!this.DigitizedCardProfile) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                        sb4.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb4.toString());
                    }
                }
                int values4 = values(true);
                if (values4 == 34) {
                    this.valueOf = 13;
                    return 13;
                }
                if (values4 == 39) {
                    if (!this.DigitizedCardProfile) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                        sb5.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb5.toString());
                    }
                    this.valueOf = 12;
                    return 12;
                }
                if (values4 == 125) {
                    if (i2 == 5) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Expected name");
                        sb6.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb6.toString());
                    }
                    this.valueOf = 2;
                    return 2;
                }
                if (!this.DigitizedCardProfile) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb7.append(getSecurityWord());
                    throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb7.toString());
                }
                this.SdkCoreAlternateContactlessPaymentDataImpl--;
                if (!writeReplace((char) values4)) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Expected name");
                    sb8.append(getSecurityWord());
                    throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb8.toString());
                }
                this.valueOf = 14;
                return 14;
            }
            if (i2 == 4) {
                iArr[i] = 5;
                int values5 = values(true);
                if (values5 != 58) {
                    if (values5 == 61) {
                        if (!this.DigitizedCardProfile) {
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                            sb9.append(getSecurityWord());
                            throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb9.toString());
                        }
                        if (this.SdkCoreAlternateContactlessPaymentDataImpl < this.RecordsJson || valueOf(1)) {
                            char[] cArr = this.writeReplace;
                            int i3 = this.SdkCoreAlternateContactlessPaymentDataImpl;
                            if (cArr[i3] == '>') {
                                this.SdkCoreAlternateContactlessPaymentDataImpl = i3 + 1;
                            }
                        }
                    } else {
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Expected ':'");
                        sb10.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb10.toString());
                    }
                }
            } else if (i2 == 6) {
                if (this.DigitizedCardProfile) {
                    getCardholderValidators();
                }
                this.getGpoResponse[this.getCvrMaskAnd - 1] = 7;
            } else if (i2 == 7) {
                if (values(false) == -1) {
                    this.valueOf = 17;
                    return 17;
                }
                if (!this.DigitizedCardProfile) {
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb11.append(getSecurityWord());
                    throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb11.toString());
                }
                this.SdkCoreAlternateContactlessPaymentDataImpl--;
            } else if (i2 == 8) {
                throw new java.lang.IllegalStateException("JsonReader is closed");
            }
        }
        int values6 = values(true);
        if (values6 == 34) {
            this.valueOf = 9;
            return 9;
        }
        if (values6 == 39) {
            if (!this.DigitizedCardProfile) {
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                sb12.append(getSecurityWord());
                throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb12.toString());
            }
            this.valueOf = 8;
            return 8;
        }
        if (values6 != 44 && values6 != 59) {
            if (values6 == 91) {
                this.valueOf = 3;
                return 3;
            }
            if (values6 != 93) {
                if (values6 == 123) {
                    this.valueOf = 1;
                    return 1;
                }
                this.SdkCoreAlternateContactlessPaymentDataImpl--;
                int cardLayoutDescription = getCardLayoutDescription();
                if (cardLayoutDescription != 0) {
                    return cardLayoutDescription;
                }
                int cvmResetTimeout = getCvmResetTimeout();
                if (cvmResetTimeout != 0) {
                    return cvmResetTimeout;
                }
                if (!writeReplace(this.writeReplace[this.SdkCoreAlternateContactlessPaymentDataImpl])) {
                    java.lang.StringBuilder sb13 = new java.lang.StringBuilder("Expected value");
                    sb13.append(getSecurityWord());
                    throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb13.toString());
                }
                if (!this.DigitizedCardProfile) {
                    java.lang.StringBuilder sb14 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                    sb14.append(getSecurityWord());
                    throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb14.toString());
                }
                this.valueOf = 10;
                return 10;
            }
            if (i2 == 1) {
                this.valueOf = 4;
                return 4;
            }
        }
        if (i2 == 1 || i2 == 2) {
            if (!this.DigitizedCardProfile) {
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                sb15.append(getSecurityWord());
                throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb15.toString());
            }
            this.SdkCoreAlternateContactlessPaymentDataImpl--;
            this.valueOf = 7;
            return 7;
        }
        java.lang.StringBuilder sb16 = new java.lang.StringBuilder("Unexpected value");
        sb16.append(getSecurityWord());
        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb16.toString());
    }

    private int getCardLayoutDescription() throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        int i;
        char c = this.writeReplace[this.SdkCoreAlternateContactlessPaymentDataImpl];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.SdkCoreAlternateContactlessPaymentDataImpl + i2 >= this.RecordsJson && !valueOf(i2 + 1)) {
                return 0;
            }
            char c2 = this.writeReplace[this.SdkCoreAlternateContactlessPaymentDataImpl + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.SdkCoreAlternateContactlessPaymentDataImpl + length < this.RecordsJson || valueOf(length + 1)) && writeReplace(this.writeReplace[this.SdkCoreAlternateContactlessPaymentDataImpl + length])) {
            return 0;
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl += length;
        this.valueOf = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        if (r9 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0090, code lost:
    
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        if (r11 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        if (r12 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        if (r11 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (r11 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        r18.IccPrivateKeyCrtComponentsJson = r12;
        r18.SdkCoreAlternateContactlessPaymentDataImpl += r8;
        r18.valueOf = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if (r9 == 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r9 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (r9 == 7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        r18.getPaymentFci = r8;
        r18.valueOf = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008a, code lost:
    
        if (writeReplace(r14) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getCvmResetTimeout() throws java.io.IOException {
        char c;
        int i;
        char[] cArr = this.writeReplace;
        int i2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i3 = this.RecordsJson;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = false;
        boolean z2 = true;
        long j = 0;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 != cArr.length) {
                    if (!valueOf(i5 + 1)) {
                        break;
                    }
                    i2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
                    i3 = this.RecordsJson;
                } else {
                    return i4;
                }
            }
            char c3 = cArr[i2 + i5];
            if (c3 != '+') {
                if (c3 == 'E' || c3 == 'e') {
                    i = 0;
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c2 = 5;
                } else if (c3 == '-') {
                    c = 6;
                    i = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c3 == '.') {
                    i = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else {
                    if (c3 < '0' || c3 > '9') {
                        break;
                    }
                    if (c2 == 1 || c2 == 0) {
                        j = -(c3 - '0');
                        c2 = 2;
                    } else if (c2 == 2) {
                        if (j == 0) {
                            return 0;
                        }
                        long j2 = (10 * j) - (c3 - '0');
                        z2 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                        j = j2;
                    } else if (c2 == 3) {
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        c2 = 7;
                    }
                    i = 0;
                }
                i5++;
                i4 = i;
            } else {
                c = 6;
                i = 0;
                if (c2 != 5) {
                    return 0;
                }
            }
            c2 = c;
            i5++;
            i4 = i;
        }
    }

    public java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() throws java.io.IOException {
        java.lang.String valueOf;
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 14) {
            valueOf = getApplicationLifeCycleData();
        } else if (i == 12) {
            valueOf = valueOf('\'');
        } else if (i == 13) {
            valueOf = valueOf('\"');
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a name but was ");
            sb.append(getProfileVersion());
            sb.append(getSecurityWord());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.valueOf = 0;
        this.SdkCoreBusinessLogicModuleImpl[this.getCvrMaskAnd - 1] = valueOf;
        return valueOf;
    }

    public java.lang.String getAid() throws java.io.IOException {
        java.lang.String str;
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 10) {
            str = getApplicationLifeCycleData();
        } else if (i == 8) {
            str = valueOf('\'');
        } else if (i == 9) {
            str = valueOf('\"');
        } else if (i == 11) {
            str = this.getCiacDecline;
            this.getCiacDecline = null;
        } else if (i == 15) {
            str = java.lang.Long.toString(this.IccPrivateKeyCrtComponentsJson);
        } else if (i == 16) {
            str = new java.lang.String(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, this.getPaymentFci);
            this.SdkCoreAlternateContactlessPaymentDataImpl += this.getPaymentFci;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a string but was ");
            sb.append(getProfileVersion());
            sb.append(getSecurityWord());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.valueOf = 0;
        int[] iArr = this.getCvmResetTimeout;
        int i2 = this.getCvrMaskAnd - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean IccPrivateKeyCrtComponentsJson() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 5) {
            this.valueOf = 0;
            int[] iArr = this.getCvmResetTimeout;
            int i2 = this.getCvrMaskAnd - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.valueOf = 0;
            int[] iArr2 = this.getCvmResetTimeout;
            int i3 = this.getCvrMaskAnd - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a boolean but was ");
        sb.append(getProfileVersion());
        sb.append(getSecurityWord());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public void RecordsJson() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 7) {
            this.valueOf = 0;
            int[] iArr = this.getCvmResetTimeout;
            int i2 = this.getCvrMaskAnd - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected null but was ");
        sb.append(getProfileVersion());
        sb.append(getSecurityWord());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public double SdkCoreBusinessLogicModuleImpl() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 15) {
            this.valueOf = 0;
            int[] iArr = this.getCvmResetTimeout;
            int i2 = this.getCvrMaskAnd - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.IccPrivateKeyCrtComponentsJson;
        }
        if (i == 16) {
            this.getCiacDecline = new java.lang.String(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, this.getPaymentFci);
            this.SdkCoreAlternateContactlessPaymentDataImpl += this.getPaymentFci;
        } else if (i == 8 || i == 9) {
            this.getCiacDecline = valueOf(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.getCiacDecline = getApplicationLifeCycleData();
        } else if (i != 11) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a double but was ");
            sb.append(getProfileVersion());
            sb.append(getSecurityWord());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.valueOf = 11;
        double parseDouble = java.lang.Double.parseDouble(this.getCiacDecline);
        if (!this.DigitizedCardProfile && (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble))) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(getSecurityWord());
            throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb2.toString());
        }
        this.getCiacDecline = null;
        this.valueOf = 0;
        int[] iArr2 = this.getCvmResetTimeout;
        int i3 = this.getCvrMaskAnd - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public long getPaymentFci() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 15) {
            this.valueOf = 0;
            int[] iArr = this.getCvmResetTimeout;
            int i2 = this.getCvrMaskAnd - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.IccPrivateKeyCrtComponentsJson;
        }
        if (i == 16) {
            this.getCiacDecline = new java.lang.String(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, this.getPaymentFci);
            this.SdkCoreAlternateContactlessPaymentDataImpl += this.getPaymentFci;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a long but was ");
                sb.append(getProfileVersion());
                sb.append(getSecurityWord());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (i == 10) {
                this.getCiacDecline = getApplicationLifeCycleData();
            } else {
                this.getCiacDecline = valueOf(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = java.lang.Long.parseLong(this.getCiacDecline);
                this.valueOf = 0;
                int[] iArr2 = this.getCvmResetTimeout;
                int i3 = this.getCvrMaskAnd - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.valueOf = 11;
        double parseDouble = java.lang.Double.parseDouble(this.getCiacDecline);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a long but was ");
            sb2.append(this.getCiacDecline);
            sb2.append(getSecurityWord());
            throw new java.lang.NumberFormatException(sb2.toString());
        }
        this.getCiacDecline = null;
        this.valueOf = 0;
        int[] iArr3 = this.getCvmResetTimeout;
        int i4 = this.getCvrMaskAnd - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    private java.lang.String valueOf(char c) throws java.io.IOException {
        char[] cArr = this.writeReplace;
        java.lang.StringBuilder sb = null;
        while (true) {
            int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = this.RecordsJson;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.SdkCoreAlternateContactlessPaymentDataImpl = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new java.lang.String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.SdkCoreAlternateContactlessPaymentDataImpl = i4;
                        int i6 = i4 - i;
                        if (sb == null) {
                            sb = new java.lang.StringBuilder(java.lang.Math.max(i6 << 1, 16));
                        }
                        sb.append(cArr, i, i6 - 1);
                        sb.append(getMagstripeCvmIssuerOptions());
                    } else {
                        if (c2 == '\n') {
                            this.getProfileVersion++;
                            this.getAid = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max((i3 - i) << 1, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.SdkCoreAlternateContactlessPaymentDataImpl = i3;
                    if (!valueOf(1)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unterminated string");
                        sb2.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb2.toString());
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x004a, code lost:
    
        if (r5.DigitizedCardProfile == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004d, code lost:
    
        r1 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
        r1.append(getSecurityWord());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0064, code lost:
    
        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(r1.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String getApplicationLifeCycleData() throws java.io.IOException {
        java.lang.String obj;
        java.lang.StringBuilder sb = null;
        do {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.SdkCoreAlternateContactlessPaymentDataImpl + i2;
                if (i3 < this.RecordsJson) {
                    char c = this.writeReplace[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 < this.writeReplace.length) {
                    if (!valueOf(i2 + 1)) {
                    }
                } else {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max(i2, 16));
                    }
                    sb.append(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, i2);
                    this.SdkCoreAlternateContactlessPaymentDataImpl += i2;
                }
            }
            i = i2;
            if (sb != null) {
                obj = new java.lang.String(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, i);
            } else {
                sb.append(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, i);
                obj = sb.toString();
            }
            this.SdkCoreAlternateContactlessPaymentDataImpl += i;
            return obj;
        } while (valueOf(1));
        if (sb != null) {
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl += i;
        return obj;
    }

    private void values(char c) throws java.io.IOException {
        char[] cArr = this.writeReplace;
        while (true) {
            int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = this.RecordsJson;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.SdkCoreAlternateContactlessPaymentDataImpl = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.SdkCoreAlternateContactlessPaymentDataImpl = i3;
                        getMagstripeCvmIssuerOptions();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.getProfileVersion++;
                            this.getAid = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.SdkCoreAlternateContactlessPaymentDataImpl = i;
                    if (!valueOf(1)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unterminated string");
                        sb.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb.toString());
                    }
                }
            }
        }
    }

    public int getCiacDecline() throws java.io.IOException {
        int i = this.valueOf;
        if (i == 0) {
            i = getDualTapResetTimeout();
        }
        if (i == 15) {
            long j = this.IccPrivateKeyCrtComponentsJson;
            int i2 = (int) j;
            if (j != i2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected an int but was ");
                sb.append(this.IccPrivateKeyCrtComponentsJson);
                sb.append(getSecurityWord());
                throw new java.lang.NumberFormatException(sb.toString());
            }
            this.valueOf = 0;
            int[] iArr = this.getCvmResetTimeout;
            int i3 = this.getCvrMaskAnd - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.getCiacDecline = new java.lang.String(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, this.getPaymentFci);
            this.SdkCoreAlternateContactlessPaymentDataImpl += this.getPaymentFci;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected an int but was ");
                sb2.append(getProfileVersion());
                sb2.append(getSecurityWord());
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            if (i == 10) {
                this.getCiacDecline = getApplicationLifeCycleData();
            } else {
                this.getCiacDecline = valueOf(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = java.lang.Integer.parseInt(this.getCiacDecline);
                this.valueOf = 0;
                int[] iArr2 = this.getCvmResetTimeout;
                int i4 = this.getCvrMaskAnd - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.valueOf = 11;
        double parseDouble = java.lang.Double.parseDouble(this.getCiacDecline);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected an int but was ");
            sb3.append(this.getCiacDecline);
            sb3.append(getSecurityWord());
            throw new java.lang.NumberFormatException(sb3.toString());
        }
        this.getCiacDecline = null;
        this.valueOf = 0;
        int[] iArr3 = this.getCvmResetTimeout;
        int i6 = this.getCvrMaskAnd - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.valueOf = 0;
        this.getGpoResponse[0] = 8;
        this.getCvrMaskAnd = 1;
        this.AlternateContactlessPaymentDataJson.close();
    }

    public void getCvrMaskAnd() throws java.io.IOException {
        int i;
        int i2 = 0;
        do {
            int i3 = this.valueOf;
            if (i3 == 0) {
                i3 = getDualTapResetTimeout();
            }
            if (i3 == 3) {
                writeReplace(1);
            } else if (i3 == 1) {
                writeReplace(3);
            } else {
                if (i3 == 4) {
                    this.getCvrMaskAnd--;
                } else if (i3 == 2) {
                    this.getCvrMaskAnd--;
                } else {
                    if (i3 == 14 || i3 == 10) {
                        do {
                            int i4 = 0;
                            while (true) {
                                i = this.SdkCoreAlternateContactlessPaymentDataImpl + i4;
                                if (i < this.RecordsJson) {
                                    char c = this.writeReplace[i];
                                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                        if (c != '#') {
                                            if (c != ',') {
                                                if (c != '/' && c != '=') {
                                                    if (c != '{' && c != '}' && c != ':') {
                                                        if (c != ';') {
                                                            switch (c) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i4++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.SdkCoreAlternateContactlessPaymentDataImpl = i;
                                }
                            }
                            if (!this.DigitizedCardProfile) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                                sb.append(getSecurityWord());
                                throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb.toString());
                            }
                            this.SdkCoreAlternateContactlessPaymentDataImpl = i;
                        } while (valueOf(1));
                    } else if (i3 == 8 || i3 == 12) {
                        values('\'');
                    } else if (i3 == 9 || i3 == 13) {
                        values('\"');
                    } else if (i3 == 16) {
                        this.SdkCoreAlternateContactlessPaymentDataImpl += this.getPaymentFci;
                    }
                    this.valueOf = 0;
                }
                i2--;
                this.valueOf = 0;
            }
            i2++;
            this.valueOf = 0;
        } while (i2 != 0);
        int[] iArr = this.getCvmResetTimeout;
        int i5 = this.getCvrMaskAnd - 1;
        iArr[i5] = iArr[i5] + 1;
        this.SdkCoreBusinessLogicModuleImpl[i5] = "null";
    }

    private void writeReplace(int i) {
        int i2 = this.getCvrMaskAnd;
        int[] iArr = this.getGpoResponse;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.getGpoResponse = java.util.Arrays.copyOf(iArr, i3);
            this.getCvmResetTimeout = java.util.Arrays.copyOf(this.getCvmResetTimeout, i3);
            this.SdkCoreBusinessLogicModuleImpl = (java.lang.String[]) java.util.Arrays.copyOf(this.SdkCoreBusinessLogicModuleImpl, i3);
        }
        int[] iArr2 = this.getGpoResponse;
        int i4 = this.getCvrMaskAnd;
        this.getCvrMaskAnd = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean valueOf(int i) throws java.io.IOException {
        int i2;
        int i3;
        char[] cArr = this.writeReplace;
        int i4 = this.getAid;
        int i5 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        this.getAid = i4 - i5;
        int i6 = this.RecordsJson;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.RecordsJson = i7;
            java.lang.System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.RecordsJson = 0;
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = 0;
        do {
            java.io.Reader reader = this.AlternateContactlessPaymentDataJson;
            int i8 = this.RecordsJson;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.RecordsJson + read;
            this.RecordsJson = i2;
            if (this.getProfileVersion == 0 && (i3 = this.getAid) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.SdkCoreAlternateContactlessPaymentDataImpl++;
                this.getAid = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private int values(boolean z) throws java.io.IOException {
        char c;
        char[] cArr = this.writeReplace;
        int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = this.RecordsJson;
        while (true) {
            if (i == i2) {
                this.SdkCoreAlternateContactlessPaymentDataImpl = i;
                if (!valueOf(1)) {
                    if (!z) {
                        return -1;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("End of input");
                    sb.append(getSecurityWord());
                    throw new java.io.EOFException(sb.toString());
                }
                i = this.SdkCoreAlternateContactlessPaymentDataImpl;
                i2 = this.RecordsJson;
            }
            int i3 = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.getProfileVersion++;
                this.getAid = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.SdkCoreAlternateContactlessPaymentDataImpl = i3;
                    if (i3 == i2) {
                        this.SdkCoreAlternateContactlessPaymentDataImpl = i;
                        boolean valueOf = valueOf(2);
                        this.SdkCoreAlternateContactlessPaymentDataImpl++;
                        if (!valueOf) {
                            break;
                        }
                    }
                    if (!this.DigitizedCardProfile) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                        sb2.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb2.toString());
                    }
                    int i4 = this.SdkCoreAlternateContactlessPaymentDataImpl;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.SdkCoreAlternateContactlessPaymentDataImpl = i4 + 1;
                        if (DigitizedCardProfile("*/")) {
                            i = this.SdkCoreAlternateContactlessPaymentDataImpl + 2;
                            i2 = this.RecordsJson;
                        } else {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unterminated comment");
                            sb3.append(getSecurityWord());
                            throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb3.toString());
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.SdkCoreAlternateContactlessPaymentDataImpl = i4 + 1;
                        getMchipCvmIssuerOptions();
                        i = this.SdkCoreAlternateContactlessPaymentDataImpl;
                        i2 = this.RecordsJson;
                    }
                } else if (c == '#') {
                    this.SdkCoreAlternateContactlessPaymentDataImpl = i3;
                    if (!this.DigitizedCardProfile) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
                        sb4.append(getSecurityWord());
                        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb4.toString());
                    }
                    getMchipCvmIssuerOptions();
                    i = this.SdkCoreAlternateContactlessPaymentDataImpl;
                    i2 = this.RecordsJson;
                } else {
                    this.SdkCoreAlternateContactlessPaymentDataImpl = i3;
                    return c;
                }
            }
            i = i3;
        }
        return c;
    }

    private void getMchipCvmIssuerOptions() throws java.io.IOException {
        char c;
        do {
            if (this.SdkCoreAlternateContactlessPaymentDataImpl >= this.RecordsJson && !valueOf(1)) {
                return;
            }
            char[] cArr = this.writeReplace;
            int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = i + 1;
            this.SdkCoreAlternateContactlessPaymentDataImpl = i2;
            c = cArr[i];
            if (c == '\n') {
                this.getProfileVersion++;
                this.getAid = i2;
                return;
            }
        } while (c != '\r');
    }

    private boolean DigitizedCardProfile(java.lang.String str) throws java.io.IOException {
        int i;
        int length = str.length();
        while (true) {
            if (this.SdkCoreAlternateContactlessPaymentDataImpl + length > this.RecordsJson && !valueOf(length)) {
                return false;
            }
            char[] cArr = this.writeReplace;
            int i2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
            if (cArr[i2] != '\n') {
                while (i < length) {
                    i = this.writeReplace[this.SdkCoreAlternateContactlessPaymentDataImpl + i] == str.charAt(i) ? i + 1 : 0;
                }
                return true;
            }
            this.getProfileVersion++;
            this.getAid = i2 + 1;
            this.SdkCoreAlternateContactlessPaymentDataImpl++;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(getSecurityWord());
        return sb.toString();
    }

    final java.lang.String getSecurityWord() {
        int i = this.getProfileVersion;
        int i2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i3 = this.getAid;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        sb.append(getGpoResponse());
        return sb.toString();
    }

    public java.lang.String getGpoResponse() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int i = this.getCvrMaskAnd;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.getGpoResponse[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.getCvmResetTimeout[i2]);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                java.lang.String str = this.SdkCoreBusinessLogicModuleImpl[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    private char getMagstripeCvmIssuerOptions() throws java.io.IOException {
        int i;
        if (this.SdkCoreAlternateContactlessPaymentDataImpl != this.RecordsJson || valueOf(1)) {
            char[] cArr = this.writeReplace;
            int i2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
            int i3 = i2 + 1;
            this.SdkCoreAlternateContactlessPaymentDataImpl = i3;
            char c = cArr[i2];
            if (c == '\n') {
                this.getProfileVersion++;
                this.getAid = i3;
                return c;
            }
            if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
                return c;
            }
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c == 'u') {
                if (i2 + 5 <= this.RecordsJson || valueOf(4)) {
                    int i4 = this.SdkCoreAlternateContactlessPaymentDataImpl;
                    char c2 = 0;
                    for (int i5 = i4; i5 < i4 + 4; i5++) {
                        char c3 = this.writeReplace[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 >= '0' && c3 <= '9') {
                            i = c3 - '0';
                        } else if (c3 >= 'a' && c3 <= 'f') {
                            i = c3 - 'W';
                        } else {
                            if (c3 < 'A' || c3 > 'F') {
                                throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(this.writeReplace, this.SdkCoreAlternateContactlessPaymentDataImpl, 4)));
                            }
                            i = c3 - '7';
                        }
                        c2 = (char) (c4 + i);
                    }
                    this.SdkCoreAlternateContactlessPaymentDataImpl += 4;
                    return c2;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unterminated escape sequence");
                sb.append(getSecurityWord());
                throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb.toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid escape sequence");
            sb2.append(getSecurityWord());
            throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unterminated escape sequence");
        sb3.append(getSecurityWord());
        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb3.toString());
    }

    private void getCardholderValidators() throws java.io.IOException {
        values(true);
        int i = this.SdkCoreAlternateContactlessPaymentDataImpl - 1;
        this.SdkCoreAlternateContactlessPaymentDataImpl = i;
        char[] cArr = values;
        if (i + cArr.length > this.RecordsJson && !valueOf(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = values;
            if (i2 < cArr2.length) {
                if (this.writeReplace[this.SdkCoreAlternateContactlessPaymentDataImpl + i2] != cArr2[i2]) {
                    return;
                } else {
                    i2++;
                }
            } else {
                this.SdkCoreAlternateContactlessPaymentDataImpl += cArr2.length;
                return;
            }
        }
    }

    private boolean writeReplace(char c) throws java.io.IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        if (this.DigitizedCardProfile) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Use JsonReader.setLenient(true) to accept malformed JSON");
        sb.append(getSecurityWord());
        throw new com.payair.hce.SdkCoreMppLiteModuleImpl(sb.toString());
    }
}
