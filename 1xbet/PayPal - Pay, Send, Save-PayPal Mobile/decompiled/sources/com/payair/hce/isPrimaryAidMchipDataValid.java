package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class isPrimaryAidMchipDataValid<T extends com.payair.hce.setMobilePinInitialConfiguration> implements com.payair.hce.isMobilePinInitialConfiguration {
    private static int[] SdkCoreBusinessLogicModuleImpl = {1600150115, 918941429, 1853062286, 144117915, -1415057661, 1434655888, -488011073, 1903161586, -2094537620, 633575477, -1442266466, -1903607452, -2058417243, 1830523470, -270797678, 1895373557, 96554562, 1925369278};
    private static int getCvrMaskAnd = 0;
    private static int getPaymentFci = 1;
    protected com.payair.hce.setPinIvCvc3Track2 AlternateContactlessPaymentDataJson;
    private java.util.List<java.lang.Byte> DigitizedCardProfile;
    private java.util.List<java.lang.Byte> IccPrivateKeyCrtComponentsJson;
    private java.util.List<com.payair.hce.onDeleteCardCompleted.valueOf> RecordsJson;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl = true;
    private java.util.List<java.lang.Byte> getAid;
    private java.util.List<java.lang.Byte> getProfileVersion;
    protected T valueOf;
    protected com.payair.hce.setMaximumPinTry values;
    private java.util.List<java.lang.Byte> writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i4 | i3);
        int i6 = ~i2;
        int i7 = ~i3;
        return ((((i * 141) + (i2 * (-139))) + (((~(i4 | i2)) | i5) * (-280))) + ((i5 | (~(i6 | i3))) * 140)) + (((~(i | (i7 | i6))) | ((~(i2 | (i4 | i7))) | (~(i3 | (i4 | i6))))) * 140) != 1 ? writeReplace(objArr) : valueOf(objArr);
    }

    protected abstract T DigitizedCardProfile(byte[] bArr) throws com.payair.hce.digitize;

    protected abstract com.payair.hce.getContactlessSupported valueOf() throws com.payair.hce.getAtcCount;

    @Override // com.payair.hce.isMobilePinInitialConfiguration
    public final void values(byte[] bArr, com.payair.hce.setMaximumPinTry setmaximumpintry) throws com.payair.hce.digitize {
        int i = getCvrMaskAnd + 9;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            this.valueOf = DigitizedCardProfile(bArr);
            this.values = setmaximumpintry;
            this.AlternateContactlessPaymentDataJson = com.payair.hce.setMaximumPinTry.valueOf();
        } else {
            this.valueOf = DigitizedCardProfile(bArr);
            this.values = setmaximumpintry;
            this.AlternateContactlessPaymentDataJson = com.payair.hce.setMaximumPinTry.valueOf();
            throw null;
        }
    }

    protected final void DigitizedCardProfile(byte b) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.writeReplace = arrayList;
        arrayList.add(java.lang.Byte.valueOf(b));
        getCvrMaskAnd = (getPaymentFci + 79) % 128;
    }

    protected final void DigitizedCardProfile(java.util.List<java.lang.Byte> list) {
        int i = getPaymentFci;
        getCvrMaskAnd = (i + 3) % 128;
        this.DigitizedCardProfile = list;
        getCvrMaskAnd = (i + 15) % 128;
    }

    protected final void AlternateContactlessPaymentDataJson() {
        this.DigitizedCardProfile = new java.util.ArrayList();
        int i = 1;
        while (i <= 255) {
            int i2 = getPaymentFci + 47;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 != 0) {
                this.DigitizedCardProfile.add(java.lang.Byte.valueOf((byte) i));
                i += 97;
            } else {
                this.DigitizedCardProfile.add(java.lang.Byte.valueOf((byte) i));
                i++;
            }
            getPaymentFci = (getCvrMaskAnd + 37) % 128;
        }
    }

    protected final void writeReplace(byte b) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.DigitizedCardProfile = arrayList;
        arrayList.add(java.lang.Byte.valueOf(b));
        getCvrMaskAnd = (getPaymentFci + 87) % 128;
    }

    protected final void AlternateContactlessPaymentDataJson(java.util.List<java.lang.Byte> list) {
        int i = getPaymentFci + 31;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            this.getAid = list;
        } else {
            this.getAid = list;
            throw null;
        }
    }

    protected final void AlternateContactlessPaymentDataJson(byte b) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getAid = arrayList;
        arrayList.add(java.lang.Byte.valueOf(b));
        int i = getPaymentFci + 9;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    protected final void values(byte b, byte b2) {
        int i = b & 255;
        this.getProfileVersion = new java.util.ArrayList();
        while (i <= (b2 & 255)) {
            getPaymentFci = (getCvrMaskAnd + 75) % 128;
            this.getProfileVersion.add(java.lang.Byte.valueOf((byte) i));
            i++;
            getPaymentFci = (getCvrMaskAnd + 59) % 128;
        }
    }

    protected final void DigitizedCardProfile() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.IccPrivateKeyCrtComponentsJson = arrayList;
        arrayList.add((byte) 0);
        getPaymentFci = (getCvrMaskAnd + 119) % 128;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.isPrimaryAidMchipDataValid isprimaryaidmchipdatavalid = (com.payair.hce.isPrimaryAidMchipDataValid) objArr[0];
        java.util.List<com.payair.hce.onDeleteCardCompleted.valueOf> list = (java.util.List) objArr[1];
        int i = getPaymentFci + 55;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            isprimaryaidmchipdatavalid.RecordsJson = list;
            return null;
        }
        isprimaryaidmchipdatavalid.RecordsJson = list;
        throw null;
    }

    protected final void DigitizedCardProfile(com.payair.hce.onDeleteCardCompleted.valueOf valueof) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.RecordsJson = arrayList;
        arrayList.add(valueof);
        getPaymentFci = (getCvrMaskAnd + 121) % 128;
    }

    protected final void values() {
        int i = (getCvrMaskAnd + 125) % 128;
        getPaymentFci = i;
        this.SdkCoreAlternateContactlessPaymentDataImpl = false;
        int i2 = i + 125;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bb, code lost:
    
        if (r8.valueOf.SdkCoreBusinessLogicModuleImpl() == (((short) (r8.valueOf.IccPrivateKeyCrtComponentsJson() & 20558)) * 97)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        android.view.ViewConfiguration.getWindowTouchSlop();
        r0 = r8.valueOf.IccPrivateKeyCrtComponentsJson();
        new java.lang.Object[]{java.lang.Byte.valueOf(r0), getClass().getSimpleName()};
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f4, code lost:
    
        if ((r8 instanceof com.payair.hce.setAckAutomaticallyResetByApplication) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
    
        if ((r8 instanceof com.payair.hce.setAckAlwaysRequiredIfCurrencyNotProvided) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0201, code lost:
    
        throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0209, code lost:
    
        throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d1, code lost:
    
        com.payair.hce.isPrimaryAidMchipDataValid.getPaymentFci = (com.payair.hce.isPrimaryAidMchipDataValid.getCvrMaskAnd + 49) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
    
        if (r8.valueOf.SdkCoreBusinessLogicModuleImpl() == (((short) (r8.valueOf.IccPrivateKeyCrtComponentsJson() & 255)) + 6)) goto L69;
     */
    @Override // com.payair.hce.isMobilePinInitialConfiguration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.payair.hce.getContactlessSupported IccPrivateKeyCrtComponentsJson() throws com.payair.hce.getAtcCount {
        getPaymentFci = (getCvrMaskAnd + 105) % 128;
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        new java.lang.Object[]{getClass().getSimpleName()};
        java.util.List<java.lang.Byte> list = this.writeReplace;
        if (list != null && !list.isEmpty() && !this.writeReplace.contains(java.lang.Byte.valueOf(this.valueOf.getAid()))) {
            android.view.View.resolveSize(0, 0);
            byte aid = this.valueOf.getAid();
            new java.lang.Object[]{java.lang.Byte.valueOf(aid), getClass().getSimpleName()};
            throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getDp);
        }
        java.util.List<java.lang.Byte> list2 = this.DigitizedCardProfile;
        if (list2 == null || list2.isEmpty() || this.DigitizedCardProfile.contains(java.lang.Byte.valueOf(this.valueOf.RecordsJson()))) {
            java.util.List<java.lang.Byte> list3 = this.getAid;
            if (list3 != null && !list3.isEmpty()) {
                java.util.List<java.lang.Byte> list4 = this.getAid;
                T t = this.valueOf;
                if (!list4.contains(java.lang.Byte.valueOf(((java.lang.Byte) com.payair.hce.setMobilePinInitialConfiguration.valueOf(new java.lang.Object[]{t}, 1301847775, -1301847775, java.lang.System.identityHashCode(t))).byteValue()))) {
                    android.os.Process.getThreadPriority(0);
                    T t2 = this.valueOf;
                    byte byteValue = ((java.lang.Byte) com.payair.hce.setMobilePinInitialConfiguration.valueOf(new java.lang.Object[]{t2}, 1301847775, -1301847775, java.lang.System.identityHashCode(t2))).byteValue();
                    new java.lang.Object[]{java.lang.Byte.valueOf(byteValue), getClass().getSimpleName()};
                }
            }
            java.util.List<java.lang.Byte> list5 = this.getProfileVersion;
            if (list5 != null && !list5.isEmpty() && !this.getProfileVersion.contains(java.lang.Byte.valueOf(this.valueOf.IccPrivateKeyCrtComponentsJson()))) {
                android.os.SystemClock.elapsedRealtime();
                byte IccPrivateKeyCrtComponentsJson = this.valueOf.IccPrivateKeyCrtComponentsJson();
                new java.lang.Object[]{java.lang.Byte.valueOf(IccPrivateKeyCrtComponentsJson), getClass().getSimpleName()};
                if ((this instanceof com.payair.hce.setAckAutomaticallyResetByApplication) || (this instanceof com.payair.hce.setAckAlwaysRequiredIfCurrencyNotProvided)) {
                    throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getQ);
                }
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getQ);
            }
            java.util.List<java.lang.Byte> list6 = this.IccPrivateKeyCrtComponentsJson;
            if (list6 != null && !list6.isEmpty() && !this.IccPrivateKeyCrtComponentsJson.contains(java.lang.Byte.valueOf(this.valueOf.getProfileVersion()))) {
                android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                byte profileVersion = this.valueOf.getProfileVersion();
                new java.lang.Object[]{java.lang.Byte.valueOf(profileVersion), getClass().getSimpleName()};
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getP);
            }
            if (this.SdkCoreAlternateContactlessPaymentDataImpl) {
                int i = getCvrMaskAnd + 107;
                getPaymentFci = i % 128;
                if (i % 2 == 0) {
                }
            }
            java.util.List<com.payair.hce.onDeleteCardCompleted.valueOf> list7 = this.RecordsJson;
            if (list7 != null && !list7.isEmpty()) {
                com.payair.hce.onDeleteCardCompleted.valueOf valueOf = this.values.writeReplace().valueOf();
                if (!this.RecordsJson.contains(valueOf)) {
                    android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    new java.lang.Object[]{valueOf.toString(), getClass().getSimpleName()};
                    getPaymentFci = (getCvrMaskAnd + 93) % 128;
                    if ((this instanceof com.payair.hce.setAckAutomaticallyResetByApplication) || (this instanceof com.payair.hce.setAckAlwaysRequiredIfCurrencyNotProvided)) {
                        throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided);
                    }
                    throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided);
                }
            }
            com.payair.hce.getContactlessSupported valueOf2 = valueOf();
            com.payair.hce.access202 AlternateContactlessPaymentDataJson = this.values.AlternateContactlessPaymentDataJson();
            valueOf2.DigitizedCardProfile((com.payair.hce.access300) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 490902825, -490902823, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)));
            android.view.ViewConfiguration.getTouchSlop();
            new java.lang.Object[]{getClass().getSimpleName()};
            return valueOf2;
        }
        android.view.ViewConfiguration.getZoomControlsTimeout();
        byte RecordsJson = this.valueOf.RecordsJson();
        new java.lang.Object[]{java.lang.Byte.valueOf(RecordsJson), getClass().getSimpleName()};
        int i2 = getCvrMaskAnd + 121;
        getPaymentFci = i2 % 128;
        int i3 = i2 % 2;
        if (!(this instanceof com.payair.hce.setAckAutomaticallyResetByApplication)) {
            int i4 = getCvrMaskAnd + 3;
            getPaymentFci = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (!(this instanceof com.payair.hce.setAckAlwaysRequiredIfCurrencyNotProvided)) {
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getDq);
            }
        }
        throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getDq);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.util.List list = (java.util.List) objArr[0];
        if (!list.isEmpty()) {
            if (!list.contains(com.payair.hce.resetAuthenticationReferences.getProfileVersion) && !list.contains(com.payair.hce.resetAuthenticationReferences.AlternateContactlessPaymentDataJson) && !list.contains(com.payair.hce.resetAuthenticationReferences.RecordsJson) && !list.contains(com.payair.hce.resetAuthenticationReferences.writeReplace)) {
                getPaymentFci = (getCvrMaskAnd + 107) % 128;
                if (!list.contains(com.payair.hce.resetAuthenticationReferences.DigitizedCardProfile)) {
                    return com.payair.hce.reInitialize.writeReplace;
                }
            }
            return com.payair.hce.reInitialize.DigitizedCardProfile;
        }
        int i = getCvrMaskAnd + 15;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            return com.payair.hce.reInitialize.valueOf;
        }
        com.payair.hce.reInitialize reinitialize = com.payair.hce.reInitialize.valueOf;
        throw null;
    }

    protected static com.payair.hce.reInitialize valueOf(java.util.List<com.payair.hce.resetAuthenticationReferences> list) {
        return (com.payair.hce.reInitialize) valueOf(new java.lang.Object[]{list}, -153455829, 153455830, (int) java.lang.System.currentTimeMillis());
    }

    protected final void writeReplace(java.util.List<com.payair.hce.onDeleteCardCompleted.valueOf> list) {
        valueOf(new java.lang.Object[]{this, list}, -540096131, 540096131, java.lang.System.identityHashCode(this));
    }
}
