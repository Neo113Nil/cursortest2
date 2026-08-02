package com.payair.hce;

/* loaded from: classes4.dex */
public final class IccPrivateKeyCrtComponentsJson {
    private static com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?> AlternateContactlessPaymentDataJson = new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(java.lang.Object.class);
    private java.lang.ThreadLocal<java.util.Map<com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?>, com.payair.hce.IccPrivateKeyCrtComponentsJson.values<?>>> DigitizedCardProfile;
    private com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl IccPrivateKeyCrtComponentsJson;
    private java.util.List<com.payair.hce.getCardholderValidators> RecordsJson;
    private com.payair.hce.getIssuerApplicationData SdkCoreAlternateContactlessPaymentDataImpl;
    private boolean SdkCoreBusinessLogicModuleImpl;
    private java.util.List<com.payair.hce.getCardholderValidators> SdkCoreCardRiskManagementDataImpl;
    private java.util.Map<java.lang.reflect.Type, com.payair.hce.RecordsJson<?>> getAid;
    private int getApplicationLifeCycleData;
    private java.lang.String getCardLayoutDescription;
    private java.util.List<com.payair.hce.getCardholderValidators> getCardholderValidators;
    private boolean getCiacDecline;
    private int getCvmResetTimeout;
    private boolean getCvrMaskAnd;
    private boolean getDualTapResetTimeout;
    private boolean getGpoResponse;
    private boolean getPaymentFci;
    private boolean getProfileVersion;
    private com.payair.hce.getMchipCvmIssuerOptions getSecurityWord;
    private com.payair.hce.getContent valueOf;
    private com.payair.hce.buildRecords values;
    private java.util.Map<com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?>, com.payair.hce.getMagstripeCvmIssuerOptions<?>> writeReplace;

    public IccPrivateKeyCrtComponentsJson() {
        this(com.payair.hce.getIssuerApplicationData.DigitizedCardProfile, com.payair.hce.getProfileVersion.IDENTITY, java.util.Collections.emptyMap(), com.payair.hce.getMchipCvmIssuerOptions.DEFAULT, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList());
    }

    private IccPrivateKeyCrtComponentsJson(com.payair.hce.getIssuerApplicationData getissuerapplicationdata, com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl sdkCoreAlternateContactlessPaymentDataImpl, java.util.Map<java.lang.reflect.Type, com.payair.hce.RecordsJson<?>> map, com.payair.hce.getMchipCvmIssuerOptions getmchipcvmissueroptions, java.util.List<com.payair.hce.getCardholderValidators> list, java.util.List<com.payair.hce.getCardholderValidators> list2, java.util.List<com.payair.hce.getCardholderValidators> list3) {
        final com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.Number> getmagstripecvmissueroptions;
        java.util.ArrayList arrayList = new java.util.ArrayList(list3);
        arrayList.add(new com.payair.hce.CardContactlessPaymentDataJson());
        this.DigitizedCardProfile = new java.lang.ThreadLocal<>();
        this.writeReplace = new java.util.concurrent.ConcurrentHashMap();
        this.SdkCoreAlternateContactlessPaymentDataImpl = getissuerapplicationdata;
        this.IccPrivateKeyCrtComponentsJson = sdkCoreAlternateContactlessPaymentDataImpl;
        this.getAid = map;
        this.values = new com.payair.hce.buildRecords(map);
        this.getProfileVersion = false;
        this.getCiacDecline = false;
        this.SdkCoreBusinessLogicModuleImpl = false;
        this.getPaymentFci = true;
        this.getGpoResponse = false;
        this.getCvrMaskAnd = false;
        this.getDualTapResetTimeout = false;
        this.getSecurityWord = getmchipcvmissueroptions;
        this.getCardLayoutDescription = null;
        this.getApplicationLifeCycleData = 2;
        this.getCvmResetTimeout = 2;
        this.getCardholderValidators = list;
        this.SdkCoreCardRiskManagementDataImpl = list2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getCdol1RelatedDataLength);
        arrayList2.add(com.payair.hce.SdkCoreIccPrivateKeyCrtComponentsImpl.values);
        arrayList2.add(getissuerapplicationdata);
        arrayList2.addAll(arrayList);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getApplicationLifeCycleData);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getAid);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.AlternateContactlessPaymentDataJson);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.writeReplace);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.IccPrivateKeyCrtComponentsJson);
        if (getmchipcvmissueroptions == com.payair.hce.getMchipCvmIssuerOptions.DEFAULT) {
            getmagstripecvmissueroptions = com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getPaymentFci;
        } else {
            getmagstripecvmissueroptions = new com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.Number>() { // from class: com.payair.hce.IccPrivateKeyCrtComponentsJson.5
                @Override // com.payair.hce.getMagstripeCvmIssuerOptions
                public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Number number) throws java.io.IOException {
                    java.lang.Number number2 = number;
                    if (number2 == null) {
                        getremotepaymentdata.writeReplace();
                    } else {
                        getremotepaymentdata.DigitizedCardProfile(number2.toString());
                    }
                }

                @Override // com.payair.hce.getMagstripeCvmIssuerOptions
                public final /* synthetic */ java.lang.Number AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
                    if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                        getackautomaticallyresetbyapplication.RecordsJson();
                        return null;
                    }
                    return java.lang.Long.valueOf(getackautomaticallyresetbyapplication.getPaymentFci());
                }
            };
        }
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.writeReplace(java.lang.Long.TYPE, java.lang.Long.class, getmagstripecvmissueroptions));
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.writeReplace(java.lang.Double.TYPE, java.lang.Double.class, new com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.Number>() { // from class: com.payair.hce.IccPrivateKeyCrtComponentsJson.2
            @Override // com.payair.hce.getMagstripeCvmIssuerOptions
            public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Number number) throws java.io.IOException {
                java.lang.Number number2 = number;
                if (number2 == null) {
                    getremotepaymentdata.writeReplace();
                } else {
                    com.payair.hce.IccPrivateKeyCrtComponentsJson.values(number2.doubleValue());
                    getremotepaymentdata.writeReplace(number2);
                }
            }

            @Override // com.payair.hce.getMagstripeCvmIssuerOptions
            public final /* synthetic */ java.lang.Number AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
                if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                    getackautomaticallyresetbyapplication.RecordsJson();
                    return null;
                }
                return java.lang.Double.valueOf(getackautomaticallyresetbyapplication.SdkCoreBusinessLogicModuleImpl());
            }
        }));
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.writeReplace(java.lang.Float.TYPE, java.lang.Float.class, new com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.Number>() { // from class: com.payair.hce.IccPrivateKeyCrtComponentsJson.4
            @Override // com.payair.hce.getMagstripeCvmIssuerOptions
            public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Number number) throws java.io.IOException {
                java.lang.Number number2 = number;
                if (number2 == null) {
                    getremotepaymentdata.writeReplace();
                } else {
                    com.payair.hce.IccPrivateKeyCrtComponentsJson.values(number2.floatValue());
                    getremotepaymentdata.writeReplace(number2);
                }
            }

            @Override // com.payair.hce.getMagstripeCvmIssuerOptions
            public final /* synthetic */ java.lang.Number AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
                if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                    getackautomaticallyresetbyapplication.RecordsJson();
                    return null;
                }
                return java.lang.Float.valueOf((float) getackautomaticallyresetbyapplication.SdkCoreBusinessLogicModuleImpl());
            }
        }));
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getGpoResponse);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.RecordsJson);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getProfileVersion);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.values(java.util.concurrent.atomic.AtomicLong.class, new com.payair.hce.getMagstripeCvmIssuerOptions.AnonymousClass5()));
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.values(java.util.concurrent.atomic.AtomicLongArray.class, new com.payair.hce.getMagstripeCvmIssuerOptions.AnonymousClass5()));
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.SdkCoreAlternateContactlessPaymentDataImpl);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getCvrMaskAnd);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getSecurityWord);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getCardLayoutDescription);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.values(java.math.BigDecimal.class, com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getDualTapResetTimeout));
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.values(java.math.BigInteger.class, com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getCvmResetTimeout));
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getCardholderValidators);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getMchipCvmIssuerOptions);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getAdditionalCheckTable);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getMagstripeCvmIssuerOptions);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getPpseFci);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.SdkCoreCardRiskManagementDataImpl);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.DigitizedCardProfile);
        arrayList2.add(com.payair.hce.getMppLiteModule.AlternateContactlessPaymentDataJson);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getCrmCountryCode);
        arrayList2.add(com.payair.hce.getDp.DigitizedCardProfile);
        arrayList2.add(com.payair.hce.getP.values);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.SdkCoreContactlessPaymentDataImpl);
        arrayList2.add(com.payair.hce.build.DigitizedCardProfile);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.valueOf);
        arrayList2.add(new com.payair.hce.wipe(this.values));
        arrayList2.add(new com.payair.hce.getQ(this.values, false));
        com.payair.hce.getContent getcontent = new com.payair.hce.getContent(this.values);
        this.valueOf = getcontent;
        arrayList2.add(getcontent);
        arrayList2.add(com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.getPinIvCvc3Track2);
        arrayList2.add(new com.payair.hce.getDq(this.values, sdkCoreAlternateContactlessPaymentDataImpl, getissuerapplicationdata, this.valueOf));
        this.RecordsJson = java.util.Collections.unmodifiableList(arrayList2);
    }

    static void values(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> valueOf(com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        boolean z;
        com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = (com.payair.hce.getMagstripeCvmIssuerOptions) this.writeReplace.get(getpinalwaysrequiredifcurrencyprovided);
        if (getmagstripecvmissueroptions != null) {
            return getmagstripecvmissueroptions;
        }
        java.util.Map<com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?>, com.payair.hce.IccPrivateKeyCrtComponentsJson.values<?>> map = this.DigitizedCardProfile.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.DigitizedCardProfile.set(map);
            z = true;
        } else {
            z = false;
        }
        com.payair.hce.IccPrivateKeyCrtComponentsJson.values<?> valuesVar = map.get(getpinalwaysrequiredifcurrencyprovided);
        if (valuesVar != null) {
            return valuesVar;
        }
        try {
            com.payair.hce.IccPrivateKeyCrtComponentsJson.values<?> valuesVar2 = new com.payair.hce.IccPrivateKeyCrtComponentsJson.values<>();
            map.put(getpinalwaysrequiredifcurrencyprovided, valuesVar2);
            java.util.Iterator<com.payair.hce.getCardholderValidators> it = this.RecordsJson.iterator();
            while (it.hasNext()) {
                com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile = it.next().DigitizedCardProfile(this, getpinalwaysrequiredifcurrencyprovided);
                if (DigitizedCardProfile != null) {
                    if (valuesVar2.writeReplace != null) {
                        throw new java.lang.AssertionError();
                    }
                    valuesVar2.writeReplace = DigitizedCardProfile;
                    this.writeReplace.put(getpinalwaysrequiredifcurrencyprovided, DigitizedCardProfile);
                    return DigitizedCardProfile;
                }
            }
            throw new java.lang.IllegalArgumentException("GSON (2.8.6) cannot handle ".concat(java.lang.String.valueOf(getpinalwaysrequiredifcurrencyprovided)));
        } finally {
            map.remove(getpinalwaysrequiredifcurrencyprovided);
            if (z) {
                this.DigitizedCardProfile.remove();
            }
        }
    }

    public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.getCardholderValidators getcardholdervalidators, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        if (!this.RecordsJson.contains(getcardholdervalidators)) {
            getcardholdervalidators = this.valueOf;
        }
        boolean z = false;
        for (com.payair.hce.getCardholderValidators getcardholdervalidators2 : this.RecordsJson) {
            if (z) {
                com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile = getcardholdervalidators2.DigitizedCardProfile(this, getpinalwaysrequiredifcurrencyprovided);
                if (DigitizedCardProfile != null) {
                    return DigitizedCardProfile;
                }
            } else if (getcardholdervalidators2 == getcardholdervalidators) {
                z = true;
            }
        }
        throw new java.lang.IllegalArgumentException("GSON cannot serialize ".concat(java.lang.String.valueOf(getpinalwaysrequiredifcurrencyprovided)));
    }

    public final java.lang.String values(java.lang.Object obj) {
        if (obj == null) {
            com.payair.hce.SdkCoreBusinessLogicModuleImpl sdkCoreBusinessLogicModuleImpl = com.payair.hce.SdkCoreBusinessLogicModuleImpl.values;
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                com.payair.hce.getRemotePaymentData getremotepaymentdata = new com.payair.hce.getRemotePaymentData(stringWriter);
                getremotepaymentdata.AlternateContactlessPaymentDataJson = false;
                boolean z = getremotepaymentdata.valueOf;
                getremotepaymentdata.valueOf = true;
                boolean z2 = getremotepaymentdata.writeReplace;
                getremotepaymentdata.writeReplace = this.getPaymentFci;
                boolean z3 = getremotepaymentdata.AlternateContactlessPaymentDataJson;
                getremotepaymentdata.AlternateContactlessPaymentDataJson = false;
                try {
                    try {
                        try {
                            com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.buildRecords.writeReplace(getremotepaymentdata, sdkCoreBusinessLogicModuleImpl);
                            return stringWriter.toString();
                        } finally {
                            getremotepaymentdata.valueOf = z;
                            getremotepaymentdata.writeReplace = z2;
                            getremotepaymentdata.AlternateContactlessPaymentDataJson = z3;
                        }
                    } catch (java.io.IOException e) {
                        throw new com.payair.hce.getPaymentFci(e);
                    }
                } catch (java.lang.AssertionError e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.8.6): ");
                    sb.append(e2.getMessage());
                    java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (java.io.IOException e3) {
                throw new com.payair.hce.getPaymentFci(e3);
            }
        }
        java.lang.Class<?> cls = obj.getClass();
        java.io.StringWriter stringWriter2 = new java.io.StringWriter();
        try {
            com.payair.hce.getRemotePaymentData getremotepaymentdata2 = new com.payair.hce.getRemotePaymentData(stringWriter2);
            getremotepaymentdata2.AlternateContactlessPaymentDataJson = false;
            values(obj, cls, getremotepaymentdata2);
            return stringWriter2.toString();
        } catch (java.io.IOException e4) {
            throw new com.payair.hce.getPaymentFci(e4);
        }
    }

    private static void DigitizedCardProfile(java.lang.Object obj, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) {
        if (obj != null) {
            try {
                if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.END_DOCUMENT) {
                } else {
                    throw new com.payair.hce.getPaymentFci("JSON document was not fully consumed.");
                }
            } catch (com.payair.hce.SdkCoreMppLiteModuleImpl e) {
                throw new com.payair.hce.getDualTapResetTimeout(e);
            } catch (java.io.IOException e2) {
                throw new com.payair.hce.getPaymentFci(e2);
            }
        }
    }

    static final class values<T> extends com.payair.hce.getMagstripeCvmIssuerOptions<T> {
        com.payair.hce.getMagstripeCvmIssuerOptions<T> writeReplace;

        values() {
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final T AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
            com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = this.writeReplace;
            if (getmagstripecvmissueroptions == null) {
                throw new java.lang.IllegalStateException();
            }
            return getmagstripecvmissueroptions.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, T t) throws java.io.IOException {
            com.payair.hce.getMagstripeCvmIssuerOptions<T> getmagstripecvmissueroptions = this.writeReplace;
            if (getmagstripecvmissueroptions == null) {
                throw new java.lang.IllegalStateException();
            }
            getmagstripecvmissueroptions.writeReplace(getremotepaymentdata, t);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{serializeNulls:");
        sb.append(this.getProfileVersion);
        sb.append(",factories:");
        sb.append(this.RecordsJson);
        sb.append(",instanceCreators:");
        sb.append(this.values);
        sb.append("}");
        return sb.toString();
    }

    private void values(java.lang.Object obj, java.lang.reflect.Type type, com.payair.hce.getRemotePaymentData getremotepaymentdata) throws com.payair.hce.getPaymentFci {
        com.payair.hce.getMagstripeCvmIssuerOptions valueOf = valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(type));
        boolean z = getremotepaymentdata.valueOf;
        getremotepaymentdata.valueOf = true;
        boolean z2 = getremotepaymentdata.writeReplace;
        getremotepaymentdata.writeReplace = this.getPaymentFci;
        boolean z3 = getremotepaymentdata.AlternateContactlessPaymentDataJson;
        getremotepaymentdata.AlternateContactlessPaymentDataJson = false;
        try {
            try {
                try {
                    valueOf.writeReplace(getremotepaymentdata, obj);
                } catch (java.io.IOException e) {
                    throw new com.payair.hce.getPaymentFci(e);
                }
            } catch (java.lang.AssertionError e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.8.6): ");
                sb.append(e2.getMessage());
                java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            getremotepaymentdata.valueOf = z;
            getremotepaymentdata.writeReplace = z2;
            getremotepaymentdata.AlternateContactlessPaymentDataJson = z3;
        }
    }

    public final <T> T writeReplace(java.lang.String str, java.lang.Class<T> cls) throws com.payair.hce.getDualTapResetTimeout {
        return (T) com.payair.hce.getDigitizedCardId.values(cls).cast(str == null ? null : values(new java.io.StringReader(str), cls));
    }

    public final <T> T values(java.io.Reader reader, java.lang.reflect.Type type) throws com.payair.hce.getPaymentFci, com.payair.hce.getDualTapResetTimeout {
        com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication = new com.payair.hce.getAckAutomaticallyResetByApplication(reader);
        getackautomaticallyresetbyapplication.DigitizedCardProfile = false;
        T t = (T) DigitizedCardProfile(getackautomaticallyresetbyapplication, type);
        DigitizedCardProfile(t, getackautomaticallyresetbyapplication);
        return t;
    }

    private <T> T DigitizedCardProfile(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, java.lang.reflect.Type type) throws com.payair.hce.getPaymentFci, com.payair.hce.getDualTapResetTimeout {
        boolean z = getackautomaticallyresetbyapplication.DigitizedCardProfile;
        boolean z2 = true;
        getackautomaticallyresetbyapplication.DigitizedCardProfile = true;
        try {
            try {
                try {
                    getackautomaticallyresetbyapplication.getProfileVersion();
                    z2 = false;
                    return valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(type)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                } catch (java.lang.AssertionError e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.8.6): ");
                    sb.append(e.getMessage());
                    java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
                    assertionError.initCause(e);
                    throw assertionError;
                } catch (java.lang.IllegalStateException e2) {
                    throw new com.payair.hce.getDualTapResetTimeout(e2);
                }
            } catch (java.io.EOFException e3) {
                if (!z2) {
                    throw new com.payair.hce.getDualTapResetTimeout(e3);
                }
                getackautomaticallyresetbyapplication.DigitizedCardProfile = z;
                return null;
            } catch (java.io.IOException e4) {
                throw new com.payair.hce.getDualTapResetTimeout(e4);
            }
        } finally {
            getackautomaticallyresetbyapplication.DigitizedCardProfile = z;
        }
    }
}
