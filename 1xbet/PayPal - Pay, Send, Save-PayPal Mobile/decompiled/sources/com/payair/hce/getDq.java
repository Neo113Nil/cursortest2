package com.payair.hce;

/* loaded from: classes4.dex */
public final class getDq implements com.payair.hce.getCardholderValidators {
    private final com.payair.hce.getContent AlternateContactlessPaymentDataJson;
    private final com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl DigitizedCardProfile;
    private final com.payair.hce.getPinAutomaticallyResetByApplication valueOf = com.payair.hce.getPinAutomaticallyResetByApplication.AlternateContactlessPaymentDataJson();
    private final com.payair.hce.getIssuerApplicationData values;
    private final com.payair.hce.buildRecords writeReplace;

    public getDq(com.payair.hce.buildRecords buildrecords, com.payair.hce.SdkCoreAlternateContactlessPaymentDataImpl sdkCoreAlternateContactlessPaymentDataImpl, com.payair.hce.getIssuerApplicationData getissuerapplicationdata, com.payair.hce.getContent getcontent) {
        this.writeReplace = buildrecords;
        this.DigitizedCardProfile = sdkCoreAlternateContactlessPaymentDataImpl;
        this.values = getissuerapplicationdata;
        this.AlternateContactlessPaymentDataJson = getcontent;
    }

    private boolean DigitizedCardProfile(java.lang.reflect.Field field, boolean z) {
        com.payair.hce.getIssuerApplicationData getissuerapplicationdata = this.values;
        if (getissuerapplicationdata.valueOf(field.getType()) || getissuerapplicationdata.DigitizedCardProfile(z) || (getissuerapplicationdata.values & field.getModifiers()) != 0) {
            return false;
        }
        if (getissuerapplicationdata.AlternateContactlessPaymentDataJson != -1.0d) {
            com.payair.hce.getCrmCountryCode getcrmcountrycode = (com.payair.hce.getCrmCountryCode) field.getAnnotation(com.payair.hce.getCrmCountryCode.class);
            com.payair.hce.getPpseFci getppsefci = (com.payair.hce.getPpseFci) field.getAnnotation(com.payair.hce.getPpseFci.class);
            if (getcrmcountrycode != null && getcrmcountrycode.DigitizedCardProfile() > getissuerapplicationdata.AlternateContactlessPaymentDataJson) {
                return false;
            }
            if (getppsefci != null && getppsefci.writeReplace() <= getissuerapplicationdata.AlternateContactlessPaymentDataJson) {
                return false;
            }
        }
        if (field.isSynthetic()) {
            return false;
        }
        boolean z2 = getissuerapplicationdata.writeReplace;
        if ((!getissuerapplicationdata.valueOf && com.payair.hce.getIssuerApplicationData.AlternateContactlessPaymentDataJson(field.getType())) || com.payair.hce.getIssuerApplicationData.writeReplace(field.getType())) {
            return false;
        }
        java.util.List<com.payair.hce.valueOf> list = z ? getissuerapplicationdata.RecordsJson : getissuerapplicationdata.getProfileVersion;
        if (list.isEmpty()) {
            return true;
        }
        new com.payair.hce.values(field);
        java.util.Iterator<com.payair.hce.valueOf> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().DigitizedCardProfile()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.Map<java.lang.String, com.payair.hce.getDq.AlternateContactlessPaymentDataJson> values(final com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?> getpinalwaysrequiredifcurrencyprovided, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList;
        boolean z;
        int size;
        int i;
        com.payair.hce.getDq.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson;
        int i2;
        int i3;
        java.lang.reflect.Field[] fieldArr;
        java.lang.Class<?> cls2;
        com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?> getpinalwaysrequiredifcurrencyprovided2;
        boolean z2;
        int i4;
        com.payair.hce.getMagstripeCvmIssuerOptions<?> getmagstripecvmissueroptions;
        java.util.ArrayList arrayList2;
        com.payair.hce.getDq getdq = this;
        com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson2 = iccPrivateKeyCrtComponentsJson;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!cls.isInterface()) {
            java.lang.reflect.Type type = getpinalwaysrequiredifcurrencyprovided.AlternateContactlessPaymentDataJson;
            java.lang.Class<?> cls3 = cls;
            com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?> getpinalwaysrequiredifcurrencyprovided3 = getpinalwaysrequiredifcurrencyprovided;
            while (cls3 != java.lang.Object.class) {
                java.lang.reflect.Field[] declaredFields = cls3.getDeclaredFields();
                int length = declaredFields.length;
                boolean z3 = false;
                int i5 = 0;
                while (i5 < length) {
                    final java.lang.reflect.Field field = declaredFields[i5];
                    boolean DigitizedCardProfile2 = getdq.DigitizedCardProfile(field, true);
                    boolean DigitizedCardProfile3 = getdq.DigitizedCardProfile(field, z3);
                    if (DigitizedCardProfile2 || DigitizedCardProfile3) {
                        getdq.valueOf.writeReplace(field);
                        java.lang.reflect.Type valueOf = com.payair.hce.getCdol1RelatedDataLength.valueOf(getpinalwaysrequiredifcurrencyprovided3.AlternateContactlessPaymentDataJson, cls3, field.getGenericType());
                        com.payair.hce.SdkCoreContactlessPaymentDataImpl sdkCoreContactlessPaymentDataImpl = (com.payair.hce.SdkCoreContactlessPaymentDataImpl) field.getAnnotation(com.payair.hce.SdkCoreContactlessPaymentDataImpl.class);
                        if (sdkCoreContactlessPaymentDataImpl == null) {
                            arrayList2 = java.util.Collections.singletonList(getdq.DigitizedCardProfile.values(field));
                        } else {
                            java.lang.String valueOf2 = sdkCoreContactlessPaymentDataImpl.valueOf();
                            java.lang.String[] writeReplace = sdkCoreContactlessPaymentDataImpl.writeReplace();
                            if (writeReplace.length == 0) {
                                arrayList2 = java.util.Collections.singletonList(valueOf2);
                            } else {
                                z = DigitizedCardProfile2;
                                arrayList = new java.util.ArrayList(writeReplace.length + 1);
                                arrayList.add(valueOf2);
                                for (java.lang.String str : writeReplace) {
                                    arrayList.add(str);
                                }
                                size = arrayList.size();
                                boolean z4 = z;
                                com.payair.hce.getDq.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson2 = null;
                                i = 0;
                                while (i < size) {
                                    com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<?> getpinalwaysrequiredifcurrencyprovided4 = getpinalwaysrequiredifcurrencyprovided3;
                                    java.lang.String str2 = (java.lang.String) arrayList.get(i);
                                    boolean z5 = i != 0 ? false : z4;
                                    final com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided getpinalwaysrequiredifcurrencyprovided5 = new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(valueOf);
                                    com.payair.hce.getDq.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson2;
                                    final boolean valueOf3 = com.payair.hce.getDigitizedCardId.valueOf(getpinalwaysrequiredifcurrencyprovided5.values);
                                    com.payair.hce.SdkCoreCardRiskManagementDataImpl sdkCoreCardRiskManagementDataImpl = (com.payair.hce.SdkCoreCardRiskManagementDataImpl) field.getAnnotation(com.payair.hce.SdkCoreCardRiskManagementDataImpl.class);
                                    if (sdkCoreCardRiskManagementDataImpl != null) {
                                        i4 = i;
                                        getmagstripecvmissueroptions = com.payair.hce.getContent.values(getdq.writeReplace, iccPrivateKeyCrtComponentsJson2, getpinalwaysrequiredifcurrencyprovided5, sdkCoreCardRiskManagementDataImpl);
                                    } else {
                                        i4 = i;
                                        getmagstripecvmissueroptions = null;
                                    }
                                    boolean z6 = getmagstripecvmissueroptions != null;
                                    if (getmagstripecvmissueroptions == null) {
                                        getmagstripecvmissueroptions = iccPrivateKeyCrtComponentsJson2.valueOf(getpinalwaysrequiredifcurrencyprovided5);
                                    }
                                    final com.payair.hce.getMagstripeCvmIssuerOptions<?> getmagstripecvmissueroptions2 = getmagstripecvmissueroptions;
                                    int i6 = i4;
                                    java.lang.reflect.Type type2 = valueOf;
                                    int i7 = size;
                                    java.lang.reflect.Field field2 = field;
                                    int i8 = i5;
                                    final boolean z7 = z6;
                                    java.util.ArrayList arrayList3 = arrayList;
                                    int i9 = length;
                                    java.lang.reflect.Field[] fieldArr2 = declaredFields;
                                    java.lang.Class<?> cls4 = cls3;
                                    alternateContactlessPaymentDataJson2 = (com.payair.hce.getDq.AlternateContactlessPaymentDataJson) linkedHashMap.put(str2, new com.payair.hce.getDq.AlternateContactlessPaymentDataJson(str2, z5, DigitizedCardProfile3) { // from class: com.payair.hce.getDq.5
                                        @Override // com.payair.hce.getDq.AlternateContactlessPaymentDataJson
                                        final void valueOf(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                                            (z7 ? getmagstripecvmissueroptions2 : new com.payair.hce.getU(iccPrivateKeyCrtComponentsJson, getmagstripecvmissueroptions2, getpinalwaysrequiredifcurrencyprovided5.AlternateContactlessPaymentDataJson)).writeReplace(getremotepaymentdata, field.get(obj));
                                        }

                                        @Override // com.payair.hce.getDq.AlternateContactlessPaymentDataJson
                                        final void writeReplace(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                                            java.lang.Object AlternateContactlessPaymentDataJson2 = getmagstripecvmissueroptions2.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                                            if (AlternateContactlessPaymentDataJson2 == null && valueOf3) {
                                                return;
                                            }
                                            field.set(obj, AlternateContactlessPaymentDataJson2);
                                        }

                                        @Override // com.payair.hce.getDq.AlternateContactlessPaymentDataJson
                                        public final boolean valueOf(java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                                            return this.values && field.get(obj) != obj;
                                        }
                                    });
                                    if (alternateContactlessPaymentDataJson3 != null) {
                                        alternateContactlessPaymentDataJson2 = alternateContactlessPaymentDataJson3;
                                    }
                                    i = i6 + 1;
                                    getdq = this;
                                    iccPrivateKeyCrtComponentsJson2 = iccPrivateKeyCrtComponentsJson;
                                    cls3 = cls4;
                                    getpinalwaysrequiredifcurrencyprovided3 = getpinalwaysrequiredifcurrencyprovided4;
                                    size = i7;
                                    z4 = z5;
                                    valueOf = type2;
                                    arrayList = arrayList3;
                                    length = i9;
                                    field = field2;
                                    i5 = i8;
                                    declaredFields = fieldArr2;
                                }
                                alternateContactlessPaymentDataJson = alternateContactlessPaymentDataJson2;
                                i2 = i5;
                                i3 = length;
                                fieldArr = declaredFields;
                                cls2 = cls3;
                                getpinalwaysrequiredifcurrencyprovided2 = getpinalwaysrequiredifcurrencyprovided3;
                                z2 = false;
                                if (alternateContactlessPaymentDataJson == null) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(type);
                                    sb.append(" declares multiple JSON fields named ");
                                    sb.append(alternateContactlessPaymentDataJson.writeReplace);
                                    throw new java.lang.IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                        z = DigitizedCardProfile2;
                        arrayList = arrayList2;
                        size = arrayList.size();
                        boolean z42 = z;
                        com.payair.hce.getDq.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson22 = null;
                        i = 0;
                        while (i < size) {
                        }
                        alternateContactlessPaymentDataJson = alternateContactlessPaymentDataJson22;
                        i2 = i5;
                        i3 = length;
                        fieldArr = declaredFields;
                        cls2 = cls3;
                        getpinalwaysrequiredifcurrencyprovided2 = getpinalwaysrequiredifcurrencyprovided3;
                        z2 = false;
                        if (alternateContactlessPaymentDataJson == null) {
                        }
                    } else {
                        i2 = i5;
                        z2 = z3;
                        i3 = length;
                        fieldArr = declaredFields;
                        cls2 = cls3;
                        getpinalwaysrequiredifcurrencyprovided2 = getpinalwaysrequiredifcurrencyprovided3;
                    }
                    i5 = i2 + 1;
                    getdq = this;
                    iccPrivateKeyCrtComponentsJson2 = iccPrivateKeyCrtComponentsJson;
                    cls3 = cls2;
                    getpinalwaysrequiredifcurrencyprovided3 = getpinalwaysrequiredifcurrencyprovided2;
                    length = i3;
                    z3 = z2;
                    declaredFields = fieldArr;
                }
                java.lang.Class<?> cls5 = cls3;
                getpinalwaysrequiredifcurrencyprovided3 = new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(com.payair.hce.getCdol1RelatedDataLength.valueOf(getpinalwaysrequiredifcurrencyprovided3.AlternateContactlessPaymentDataJson, cls5, cls5.getGenericSuperclass()));
                cls3 = getpinalwaysrequiredifcurrencyprovided3.values;
                getdq = this;
                iccPrivateKeyCrtComponentsJson2 = iccPrivateKeyCrtComponentsJson;
            }
        }
        return linkedHashMap;
    }

    static abstract class AlternateContactlessPaymentDataJson {
        final boolean valueOf;
        final boolean values;
        final java.lang.String writeReplace;

        abstract void valueOf(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract boolean valueOf(java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void writeReplace(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        protected AlternateContactlessPaymentDataJson(java.lang.String str, boolean z, boolean z2) {
            this.writeReplace = str;
            this.values = z;
            this.valueOf = z2;
        }
    }

    public static final class DigitizedCardProfile<T> extends com.payair.hce.getMagstripeCvmIssuerOptions<T> {
        private final java.util.Map<java.lang.String, com.payair.hce.getDq.AlternateContactlessPaymentDataJson> AlternateContactlessPaymentDataJson;
        private final com.payair.hce.getMaximumPinTry<T> valueOf;

        DigitizedCardProfile(com.payair.hce.getMaximumPinTry<T> getmaximumpintry, java.util.Map<java.lang.String, com.payair.hce.getDq.AlternateContactlessPaymentDataJson> map) {
            this.valueOf = getmaximumpintry;
            this.AlternateContactlessPaymentDataJson = map;
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final T AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
            if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                getackautomaticallyresetbyapplication.RecordsJson();
                return null;
            }
            T DigitizedCardProfile = this.valueOf.DigitizedCardProfile();
            try {
                getackautomaticallyresetbyapplication.writeReplace();
                while (getackautomaticallyresetbyapplication.values()) {
                    com.payair.hce.getDq.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.get(getackautomaticallyresetbyapplication.SdkCoreAlternateContactlessPaymentDataImpl());
                    if (alternateContactlessPaymentDataJson != null && alternateContactlessPaymentDataJson.valueOf) {
                        alternateContactlessPaymentDataJson.writeReplace(getackautomaticallyresetbyapplication, DigitizedCardProfile);
                    }
                    getackautomaticallyresetbyapplication.getCvrMaskAnd();
                }
                getackautomaticallyresetbyapplication.DigitizedCardProfile();
                return DigitizedCardProfile;
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            } catch (java.lang.IllegalStateException e2) {
                throw new com.payair.hce.getDualTapResetTimeout(e2);
            }
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, T t) throws java.io.IOException {
            if (t == null) {
                getremotepaymentdata.writeReplace();
                return;
            }
            getremotepaymentdata.AlternateContactlessPaymentDataJson();
            try {
                for (com.payair.hce.getDq.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson : this.AlternateContactlessPaymentDataJson.values()) {
                    if (alternateContactlessPaymentDataJson.valueOf(t)) {
                        getremotepaymentdata.writeReplace(alternateContactlessPaymentDataJson.writeReplace);
                        alternateContactlessPaymentDataJson.valueOf(getremotepaymentdata, t);
                    }
                }
                getremotepaymentdata.values();
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }

    @Override // com.payair.hce.getCardholderValidators
    public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        java.lang.Class<? super T> cls = getpinalwaysrequiredifcurrencyprovided.values;
        if (java.lang.Object.class.isAssignableFrom(cls)) {
            return new com.payair.hce.getDq.DigitizedCardProfile(this.writeReplace.values(getpinalwaysrequiredifcurrencyprovided), values(iccPrivateKeyCrtComponentsJson, getpinalwaysrequiredifcurrencyprovided, cls));
        }
        return null;
    }
}
