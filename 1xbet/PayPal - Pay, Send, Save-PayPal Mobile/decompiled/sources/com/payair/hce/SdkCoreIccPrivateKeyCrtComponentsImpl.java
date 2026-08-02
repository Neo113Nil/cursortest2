package com.payair.hce;

/* loaded from: classes4.dex */
public final class SdkCoreIccPrivateKeyCrtComponentsImpl extends com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.Object> {
    public static final com.payair.hce.getCardholderValidators values = new com.payair.hce.getCardholderValidators() { // from class: com.payair.hce.SdkCoreIccPrivateKeyCrtComponentsImpl.3
        @Override // com.payair.hce.getCardholderValidators
        public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
            if (getpinalwaysrequiredifcurrencyprovided.values == java.lang.Object.class) {
                return new com.payair.hce.SdkCoreIccPrivateKeyCrtComponentsImpl(iccPrivateKeyCrtComponentsJson);
            }
            return null;
        }
    };
    private final com.payair.hce.IccPrivateKeyCrtComponentsJson valueOf;

    SdkCoreIccPrivateKeyCrtComponentsImpl(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson) {
        this.valueOf = iccPrivateKeyCrtComponentsJson;
    }

    /* renamed from: com.payair.hce.SdkCoreIccPrivateKeyCrtComponentsImpl$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;

        static {
            int[] iArr = new int[com.payair.hce.getAckPreEntryAllowed.values().length];
            AlternateContactlessPaymentDataJson = iArr;
            try {
                iArr[com.payair.hce.getAckPreEntryAllowed.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.getAckPreEntryAllowed.BEGIN_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.getAckPreEntryAllowed.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.getAckPreEntryAllowed.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.getAckPreEntryAllowed.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.getAckPreEntryAllowed.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final java.lang.Object AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        switch (com.payair.hce.SdkCoreIccPrivateKeyCrtComponentsImpl.AnonymousClass1.AlternateContactlessPaymentDataJson[getackautomaticallyresetbyapplication.getProfileVersion().ordinal()]) {
            case 1:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                getackautomaticallyresetbyapplication.AlternateContactlessPaymentDataJson();
                while (getackautomaticallyresetbyapplication.values()) {
                    arrayList.add(AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication));
                }
                getackautomaticallyresetbyapplication.valueOf();
                return arrayList;
            case 2:
                com.payair.hce.getCiacDeclineOnPpms getciacdeclineonppms = new com.payair.hce.getCiacDeclineOnPpms();
                getackautomaticallyresetbyapplication.writeReplace();
                while (getackautomaticallyresetbyapplication.values()) {
                    getciacdeclineonppms.put(getackautomaticallyresetbyapplication.SdkCoreAlternateContactlessPaymentDataImpl(), AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication));
                }
                getackautomaticallyresetbyapplication.DigitizedCardProfile();
                return getciacdeclineonppms;
            case 3:
                return getackautomaticallyresetbyapplication.getAid();
            case 4:
                return java.lang.Double.valueOf(getackautomaticallyresetbyapplication.SdkCoreBusinessLogicModuleImpl());
            case 5:
                return java.lang.Boolean.valueOf(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            case 6:
                getackautomaticallyresetbyapplication.RecordsJson();
                return null;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            getremotepaymentdata.writeReplace();
            return;
        }
        com.payair.hce.getMagstripeCvmIssuerOptions valueOf = this.valueOf.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(obj.getClass()));
        if (valueOf instanceof com.payair.hce.SdkCoreIccPrivateKeyCrtComponentsImpl) {
            getremotepaymentdata.AlternateContactlessPaymentDataJson();
            getremotepaymentdata.values();
        } else {
            valueOf.writeReplace(getremotepaymentdata, obj);
        }
    }
}
