package com.payair.hce;

/* loaded from: classes4.dex */
public final class getQ implements com.payair.hce.getCardholderValidators {
    private final com.payair.hce.buildRecords AlternateContactlessPaymentDataJson;
    final boolean DigitizedCardProfile = false;

    public getQ(com.payair.hce.buildRecords buildrecords, boolean z) {
        this.AlternateContactlessPaymentDataJson = buildrecords;
    }

    final class writeReplace<K, V> extends com.payair.hce.getMagstripeCvmIssuerOptions<java.util.Map<K, V>> {
        private static final byte[] $$a = {5, 98, 33, 67, 13, -1, -62, 67, -14, com.google.common.base.Ascii.EM, -23, 9, 10, -67, 59, -4, 3, -54, 58, -1, 16, -50, 41, -4};
        private static final int $$b = 149;
        private final com.payair.hce.getMagstripeCvmIssuerOptions<K> DigitizedCardProfile;
        private final com.payair.hce.getMagstripeCvmIssuerOptions<V> valueOf;
        private final com.payair.hce.getMaximumPinTry<? extends java.util.Map<K, V>> values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, int i3, java.lang.Object[] objArr) {
            int i4;
            int i5 = 3 - (i3 * 3);
            int i6 = 99 - (i2 * 2);
            int i7 = i * 3;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i7 + 21];
            if (bArr == null) {
                int i8 = i5;
                int i9 = 0;
                i6 = (i5 + i6) - 1;
                i5 = i8;
                i4 = i9;
                int i10 = i5 + 1;
                bArr2[i4] = (byte) i6;
                i9 = i4 + 1;
                if (i4 == i7 + 20) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                byte b = bArr[i10];
                i5 = i6;
                i6 = b;
                i8 = i10;
                i6 = (i5 + i6) - 1;
                i5 = i8;
                i4 = i9;
                int i102 = i5 + 1;
                bArr2[i4] = (byte) i6;
                i9 = i4 + 1;
                if (i4 == i7 + 20) {
                }
            } else {
                i4 = 0;
                int i1022 = i5 + 1;
                bArr2[i4] = (byte) i6;
                i9 = i4 + 1;
                if (i4 == i7 + 20) {
                }
            }
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
            java.lang.String str;
            boolean parseBoolean;
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                getremotepaymentdata.writeReplace();
                return;
            }
            if (!com.payair.hce.getQ.this.DigitizedCardProfile) {
                getremotepaymentdata.AlternateContactlessPaymentDataJson();
                for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                    getremotepaymentdata.writeReplace(java.lang.String.valueOf(entry.getKey()));
                    this.valueOf.writeReplace(getremotepaymentdata, entry.getValue());
                }
                getremotepaymentdata.values();
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (java.util.Map.Entry<K, V> entry2 : map.entrySet()) {
                com.payair.hce.getCiacDecline values = this.DigitizedCardProfile.values(entry2.getKey());
                arrayList.add(values);
                arrayList2.add(entry2.getValue());
                boolean z2 = true;
                byte b = (byte) ($$a[5] + 1);
                byte b2 = b;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(b, b2, b2, objArr);
                if (!java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(values) && !(values instanceof com.payair.hce.getGpoResponse)) {
                    z2 = false;
                }
                z |= z2;
            }
            if (z) {
                getremotepaymentdata.DigitizedCardProfile();
                int size = arrayList.size();
                while (i < size) {
                    getremotepaymentdata.DigitizedCardProfile();
                    com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.buildRecords.writeReplace(getremotepaymentdata, (com.payair.hce.getCiacDecline) arrayList.get(i));
                    this.valueOf.writeReplace(getremotepaymentdata, arrayList2.get(i));
                    getremotepaymentdata.valueOf();
                    i++;
                }
                getremotepaymentdata.valueOf();
                return;
            }
            getremotepaymentdata.AlternateContactlessPaymentDataJson();
            int size2 = arrayList.size();
            while (i < size2) {
                com.payair.hce.getCiacDecline getciacdecline = (com.payair.hce.getCiacDecline) arrayList.get(i);
                if (getciacdecline instanceof com.payair.hce.getCvmResetTimeout) {
                    com.payair.hce.getCvmResetTimeout valueOf = getciacdecline.valueOf();
                    if (valueOf.DigitizedCardProfile instanceof java.lang.Number) {
                        str = java.lang.String.valueOf(valueOf.AlternateContactlessPaymentDataJson());
                    } else if (valueOf.DigitizedCardProfile instanceof java.lang.Boolean) {
                        if (valueOf.DigitizedCardProfile instanceof java.lang.Boolean) {
                            parseBoolean = ((java.lang.Boolean) valueOf.DigitizedCardProfile).booleanValue();
                        } else {
                            parseBoolean = java.lang.Boolean.parseBoolean(valueOf.DigitizedCardProfile());
                        }
                        str = java.lang.Boolean.toString(parseBoolean);
                    } else if (valueOf.DigitizedCardProfile instanceof java.lang.String) {
                        str = valueOf.DigitizedCardProfile();
                    } else {
                        throw new java.lang.AssertionError();
                    }
                } else if (getciacdecline instanceof com.payair.hce.SdkCoreBusinessLogicModuleImpl) {
                    str = "null";
                } else {
                    throw new java.lang.AssertionError();
                }
                getremotepaymentdata.writeReplace(str);
                this.valueOf.writeReplace(getremotepaymentdata, arrayList2.get(i));
                i++;
            }
            getremotepaymentdata.values();
        }

        public writeReplace(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, java.lang.reflect.Type type, com.payair.hce.getMagstripeCvmIssuerOptions<K> getmagstripecvmissueroptions, java.lang.reflect.Type type2, com.payair.hce.getMagstripeCvmIssuerOptions<V> getmagstripecvmissueroptions2, com.payair.hce.getMaximumPinTry<? extends java.util.Map<K, V>> getmaximumpintry) {
            this.DigitizedCardProfile = new com.payair.hce.getU(iccPrivateKeyCrtComponentsJson, getmagstripecvmissueroptions, type);
            this.valueOf = new com.payair.hce.getU(iccPrivateKeyCrtComponentsJson, getmagstripecvmissueroptions2, type2);
            this.values = getmaximumpintry;
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
            com.payair.hce.getAckPreEntryAllowed profileVersion = getackautomaticallyresetbyapplication.getProfileVersion();
            if (profileVersion == com.payair.hce.getAckPreEntryAllowed.NULL) {
                getackautomaticallyresetbyapplication.RecordsJson();
                return null;
            }
            java.util.Map<K, V> DigitizedCardProfile = this.values.DigitizedCardProfile();
            if (profileVersion == com.payair.hce.getAckPreEntryAllowed.BEGIN_ARRAY) {
                getackautomaticallyresetbyapplication.AlternateContactlessPaymentDataJson();
                while (getackautomaticallyresetbyapplication.values()) {
                    getackautomaticallyresetbyapplication.AlternateContactlessPaymentDataJson();
                    K AlternateContactlessPaymentDataJson = this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                    if (DigitizedCardProfile.put(AlternateContactlessPaymentDataJson, this.valueOf.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication)) != null) {
                        throw new com.payair.hce.getDualTapResetTimeout("duplicate key: ".concat(java.lang.String.valueOf(AlternateContactlessPaymentDataJson)));
                    }
                    getackautomaticallyresetbyapplication.valueOf();
                }
                getackautomaticallyresetbyapplication.valueOf();
                return DigitizedCardProfile;
            }
            getackautomaticallyresetbyapplication.writeReplace();
            while (getackautomaticallyresetbyapplication.values()) {
                com.payair.hce.getAlternateContactlessPaymentData.writeReplace.values(getackautomaticallyresetbyapplication);
                K AlternateContactlessPaymentDataJson2 = this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                if (DigitizedCardProfile.put(AlternateContactlessPaymentDataJson2, this.valueOf.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication)) != null) {
                    throw new com.payair.hce.getDualTapResetTimeout("duplicate key: ".concat(java.lang.String.valueOf(AlternateContactlessPaymentDataJson2)));
                }
            }
            getackautomaticallyresetbyapplication.DigitizedCardProfile();
            return DigitizedCardProfile;
        }
    }

    @Override // com.payair.hce.getCardholderValidators
    public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.Boolean> getmagstripecvmissueroptions;
        java.lang.reflect.Type type = getpinalwaysrequiredifcurrencyprovided.AlternateContactlessPaymentDataJson;
        if (!java.util.Map.class.isAssignableFrom(getpinalwaysrequiredifcurrencyprovided.values)) {
            return null;
        }
        java.lang.reflect.Type[] values = com.payair.hce.getCdol1RelatedDataLength.values(type, com.payair.hce.getCdol1RelatedDataLength.valueOf(type));
        java.lang.reflect.Type type2 = values[0];
        if (type2 == java.lang.Boolean.TYPE || type2 == java.lang.Boolean.class) {
            getmagstripecvmissueroptions = com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.values;
        } else {
            getmagstripecvmissueroptions = iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(type2));
        }
        com.payair.hce.getMagstripeCvmIssuerOptions<T> valueOf = iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<>(values[1]));
        com.payair.hce.getMaximumPinTry<T> values2 = this.AlternateContactlessPaymentDataJson.values(getpinalwaysrequiredifcurrencyprovided);
        return new com.payair.hce.getQ.writeReplace(iccPrivateKeyCrtComponentsJson, values[0], getmagstripecvmissueroptions, values[1], valueOf, values2);
    }
}
