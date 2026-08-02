package com.payair.hce;

/* loaded from: classes4.dex */
public final class getBusinessLogicModule extends com.payair.hce.getRemotePaymentData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final com.payair.hce.getCvmResetTimeout getAid;
    private static final java.io.Writer getProfileVersion;
    public final java.util.List<com.payair.hce.getCiacDecline> DigitizedCardProfile;
    private java.lang.String RecordsJson;
    public com.payair.hce.getCiacDecline values;

    private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3 = (i * 3) + 99;
        int i4 = i2 * 3;
        byte[] bArr = $$a;
        int i5 = (s * 3) + 4;
        byte[] bArr2 = new byte[i4 + 21];
        int i6 = i4 + 20;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i3 = (i6 + (-i5)) - 1;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                int i8 = bArr[i5];
                i5++;
                i3 = (i3 + (-i8)) - 1;
            }
        }
    }

    @Override // com.payair.hce.getRemotePaymentData, java.io.Flushable
    public final void flush() throws java.io.IOException {
    }

    static {
        init$0();
        getProfileVersion = new java.io.Writer() { // from class: com.payair.hce.getBusinessLogicModule.3
            @Override // java.io.Writer
            public final void write(char[] cArr, int i, int i2) {
                throw new java.lang.AssertionError();
            }

            @Override // java.io.Writer, java.io.Flushable
            public final void flush() throws java.io.IOException {
                throw new java.lang.AssertionError();
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws java.io.IOException {
                throw new java.lang.AssertionError();
            }
        };
        getAid = new com.payair.hce.getCvmResetTimeout(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
    }

    public getBusinessLogicModule() {
        super(getProfileVersion);
        this.DigitizedCardProfile = new java.util.ArrayList();
        this.values = com.payair.hce.SdkCoreBusinessLogicModuleImpl.values;
    }

    private void valueOf(com.payair.hce.getCiacDecline getciacdecline) {
        if (this.RecordsJson == null) {
            if (this.DigitizedCardProfile.isEmpty()) {
                this.values = getciacdecline;
                return;
            }
            java.util.List<com.payair.hce.getCiacDecline> list = this.DigitizedCardProfile;
            com.payair.hce.getCiacDecline getciacdecline2 = list.get(list.size() - 1);
            byte b = (byte) ($$a[5] - 1);
            byte b2 = b;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(b, b2, b2, objArr);
            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(getciacdecline2)) {
                com.payair.hce.getAid getaid = (com.payair.hce.getAid) getciacdecline2;
                if (getciacdecline == null) {
                    getciacdecline = com.payair.hce.SdkCoreBusinessLogicModuleImpl.values;
                }
                getaid.DigitizedCardProfile.add(getciacdecline);
                return;
            }
            throw new java.lang.IllegalStateException();
        }
        if (!(getciacdecline instanceof com.payair.hce.SdkCoreBusinessLogicModuleImpl) || this.AlternateContactlessPaymentDataJson) {
            java.util.List<com.payair.hce.getCiacDecline> list2 = this.DigitizedCardProfile;
            com.payair.hce.getGpoResponse getgporesponse = (com.payair.hce.getGpoResponse) list2.get(list2.size() - 1);
            java.lang.String str = this.RecordsJson;
            com.payair.hce.getCiacDeclineOnPpms<java.lang.String, com.payair.hce.getCiacDecline> getciacdeclineonppms = getgporesponse.valueOf;
            if (getciacdecline == null) {
                getciacdecline = com.payair.hce.SdkCoreBusinessLogicModuleImpl.values;
            }
            getciacdeclineonppms.put(str, getciacdecline);
        }
        this.RecordsJson = null;
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData DigitizedCardProfile() throws java.io.IOException {
        com.payair.hce.getAid getaid = new com.payair.hce.getAid();
        valueOf(getaid);
        this.DigitizedCardProfile.add(getaid);
        return this;
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData valueOf() throws java.io.IOException {
        if (this.DigitizedCardProfile.isEmpty() || this.RecordsJson != null) {
            throw new java.lang.IllegalStateException();
        }
        java.util.List<com.payair.hce.getCiacDecline> list = this.DigitizedCardProfile;
        com.payair.hce.getCiacDecline getciacdecline = list.get(list.size() - 1);
        byte b = (byte) ($$a[5] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(getciacdecline)) {
            java.util.List<com.payair.hce.getCiacDecline> list2 = this.DigitizedCardProfile;
            list2.remove(list2.size() - 1);
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData AlternateContactlessPaymentDataJson() throws java.io.IOException {
        com.payair.hce.getGpoResponse getgporesponse = new com.payair.hce.getGpoResponse();
        valueOf(getgporesponse);
        this.DigitizedCardProfile.add(getgporesponse);
        return this;
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData values() throws java.io.IOException {
        if (this.DigitizedCardProfile.isEmpty() || this.RecordsJson != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.DigitizedCardProfile.get(r0.size() - 1) instanceof com.payair.hce.getGpoResponse) {
            this.DigitizedCardProfile.remove(r0.size() - 1);
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData writeReplace(java.lang.String str) throws java.io.IOException {
        if (this.DigitizedCardProfile.isEmpty() || this.RecordsJson != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.DigitizedCardProfile.get(r0.size() - 1) instanceof com.payair.hce.getGpoResponse) {
            this.RecordsJson = str;
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData writeReplace() throws java.io.IOException {
        valueOf(com.payair.hce.SdkCoreBusinessLogicModuleImpl.values);
        return this;
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData valueOf(boolean z) throws java.io.IOException {
        valueOf(new com.payair.hce.getCvmResetTimeout(java.lang.Boolean.valueOf(z)));
        return this;
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData valueOf(long j) throws java.io.IOException {
        valueOf(new com.payair.hce.getCvmResetTimeout(java.lang.Long.valueOf(j)));
        return this;
    }

    @Override // com.payair.hce.getRemotePaymentData, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (!this.DigitizedCardProfile.isEmpty()) {
            throw new java.io.IOException("Incomplete document");
        }
        this.DigitizedCardProfile.add(getAid);
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData DigitizedCardProfile(java.lang.String str) throws java.io.IOException {
        if (str != null) {
            valueOf(new com.payair.hce.getCvmResetTimeout(str));
            return this;
        }
        valueOf(com.payair.hce.SdkCoreBusinessLogicModuleImpl.values);
        return this;
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData valueOf(java.lang.Boolean bool) throws java.io.IOException {
        if (bool != null) {
            valueOf(new com.payair.hce.getCvmResetTimeout(bool));
            return this;
        }
        valueOf(com.payair.hce.SdkCoreBusinessLogicModuleImpl.values);
        return this;
    }

    @Override // com.payair.hce.getRemotePaymentData
    public final com.payair.hce.getRemotePaymentData writeReplace(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            valueOf(com.payair.hce.SdkCoreBusinessLogicModuleImpl.values);
            return this;
        }
        if (!this.valueOf) {
            double doubleValue = number.doubleValue();
            if (java.lang.Double.isNaN(doubleValue) || java.lang.Double.isInfinite(doubleValue)) {
                throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(number)));
            }
        }
        valueOf(new com.payair.hce.getCvmResetTimeout(number));
        return this;
    }

    static void init$0() {
        $$a = new byte[]{94, 46, -101, 115, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -58, 1, com.visa.cbp.getEncExpo.onUnminimized, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -41, 4};
        $$b = 175;
    }
}
