package com.paypal.oslo.feature.contacts.api.configs;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;", "", "NoQuery", "ThresholdExceeded", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext$NoQuery;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext$ThresholdExceeded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContactsCTAContext {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext$NoQuery;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoQuery implements com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.NoQuery INSTANCE = new com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.NoQuery();

        public final int hashCode() {
            return -869204378;
        }

        private NoQuery() {
        }

        public final java.lang.String toString() {
            return "NoQuery";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.NoQuery)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext$ThresholdExceeded;", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAContext;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThresholdExceeded implements com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.ThresholdExceeded INSTANCE = new com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.ThresholdExceeded();

        public final int hashCode() {
            return 509757693;
        }

        private ThresholdExceeded() {
        }

        public final java.lang.String toString() {
            return "ThresholdExceeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.api.configs.ContactsCTAContext.ThresholdExceeded)) {
                return false;
            }
            return true;
        }
    }
}
