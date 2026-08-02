package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class getMagstripeCvmIssuerOptions<T> {
    public abstract T AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException;

    public abstract void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, T t) throws java.io.IOException;

    /* renamed from: com.payair.hce.getMagstripeCvmIssuerOptions$5, reason: invalid class name */
    public final class AnonymousClass5 extends com.payair.hce.getMagstripeCvmIssuerOptions<T> {
        public AnonymousClass5() {
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, T t) throws java.io.IOException {
            if (t == null) {
                getremotepaymentdata.writeReplace();
            } else {
                com.payair.hce.getMagstripeCvmIssuerOptions.this.writeReplace(getremotepaymentdata, t);
            }
        }

        @Override // com.payair.hce.getMagstripeCvmIssuerOptions
        public final T AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
            if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                getackautomaticallyresetbyapplication.RecordsJson();
                return null;
            }
            return (T) com.payair.hce.getMagstripeCvmIssuerOptions.this.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
        }
    }

    public final com.payair.hce.getCiacDecline values(T t) {
        try {
            com.payair.hce.getBusinessLogicModule getbusinesslogicmodule = new com.payair.hce.getBusinessLogicModule();
            writeReplace(getbusinesslogicmodule, t);
            if (!getbusinesslogicmodule.DigitizedCardProfile.isEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected one JSON element but was ");
                sb.append(getbusinesslogicmodule.DigitizedCardProfile);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            return getbusinesslogicmodule.values;
        } catch (java.io.IOException e) {
            throw new com.payair.hce.getPaymentFci(e);
        }
    }
}
