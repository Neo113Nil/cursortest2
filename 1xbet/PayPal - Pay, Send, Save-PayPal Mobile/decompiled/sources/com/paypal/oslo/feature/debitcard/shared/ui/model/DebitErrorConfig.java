package com.paypal.oslo.feature.debitcard.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\n\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\u0082\u0001\n#$%&'()*+,"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "", "Lcom/paypal/pds/core/Icon;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/paypal/pds/core/Icon;IIII)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "title", com.visa.cbp.getEncExpo.warmup, "getTitle", "()I", "subtitle", "getSubtitle", "buttonText", "getButtonText", "maxRetriesAllowed", "getMaxRetriesAllowed", "Recoverable", "NoNetwork", "Fatal", "ContactCustomerService", "Ineligible", "InContextRecoverable", "InContextNoNetwork", "InContextFatal", "InContextContactCustomerService", "InContextIneligible", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$ContactCustomerService;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$Fatal;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextContactCustomerService;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextFatal;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextIneligible;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextNoNetwork;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextRecoverable;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$NoNetwork;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$Recoverable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitErrorConfig {
    public static final int $stable = 0;
    private final int buttonText;
    private final com.paypal.pds.core.Icon icon;
    private final int maxRetriesAllowed;
    private final int subtitle;
    private final int title;

    private DebitErrorConfig(com.paypal.pds.core.Icon icon, int i, int i2, int i3, int i4) {
        this.icon = icon;
        this.title = i;
        this.subtitle = i2;
        this.buttonText = i3;
        this.maxRetriesAllowed = i4;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final int getButtonText() {
        return this.buttonText;
    }

    public final int getMaxRetriesAllowed() {
        return this.maxRetriesAllowed;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$Recoverable;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Recoverable extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Recoverable INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Recoverable();

        public final int hashCode() {
            return -143660217;
        }

        private Recoverable() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_try_again_description, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_try_again, 1, null);
        }

        public final java.lang.String toString() {
            return "Recoverable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Recoverable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$NoNetwork;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoNetwork extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.NoNetwork INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.NoNetwork();

        public final int hashCode() {
            return -1686396426;
        }

        private NoNetwork() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_no_network_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_no_network_message, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_try_again, Integer.MAX_VALUE, null);
        }

        public final java.lang.String toString() {
            return "NoNetwork";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.NoNetwork)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$Fatal;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fatal extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Fatal INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Fatal();

        public final int hashCode() {
            return 1758497357;
        }

        private Fatal() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_retry_later, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_ok, 0, null);
        }

        public final java.lang.String toString() {
            return "Fatal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Fatal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$ContactCustomerService;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactCustomerService extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.ContactCustomerService INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.ContactCustomerService();

        public final int hashCode() {
            return -1971945842;
        }

        private ContactCustomerService() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_contact_customer_service_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_contact_customer_service_message, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_contact_us, 0, null);
        }

        public final java.lang.String toString() {
            return "ContactCustomerService";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.ContactCustomerService)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ineligible extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Ineligible INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Ineligible();

        public final int hashCode() {
            return 773972563;
        }

        private Ineligible() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_tokenization_error_ineligible_card_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_tokenization_error_ineligible_card_body, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_ok, 0, null);
        }

        public final java.lang.String toString() {
            return "Ineligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.Ineligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextRecoverable;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InContextRecoverable extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextRecoverable INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextRecoverable();

        public final int hashCode() {
            return -1295005397;
        }

        private InContextRecoverable() {
            super(com.paypal.pds.core.Icon.Alert.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_try_again_description, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_in_context_error_reload_description, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_reload, 1, null);
        }

        public final java.lang.String toString() {
            return "InContextRecoverable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextRecoverable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextNoNetwork;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InContextNoNetwork extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextNoNetwork INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextNoNetwork();

        public final int hashCode() {
            return 1883351258;
        }

        private InContextNoNetwork() {
            super(com.paypal.pds.core.Icon.Signal.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_no_network_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_in_context_error_no_network_description, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_reload, Integer.MAX_VALUE, null);
        }

        public final java.lang.String toString() {
            return "InContextNoNetwork";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextNoNetwork)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextFatal;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InContextFatal extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextFatal INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextFatal();

        public final int hashCode() {
            return -1454005455;
        }

        private InContextFatal() {
            super(com.paypal.pds.core.Icon.Alert.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_in_context_error_fatal_description, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_done, 0, null);
        }

        public final java.lang.String toString() {
            return "InContextFatal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextFatal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextContactCustomerService;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InContextContactCustomerService extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextContactCustomerService INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextContactCustomerService();

        public final int hashCode() {
            return -2085500374;
        }

        private InContextContactCustomerService() {
            super(com.paypal.pds.core.Icon.Alert.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_contact_customer_service_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_in_context_error_risk_denied_description, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_contact_us, 0, null);
        }

        public final java.lang.String toString() {
            return "InContextContactCustomerService";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextContactCustomerService)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig$InContextIneligible;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InContextIneligible extends com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextIneligible INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextIneligible();

        public final int hashCode() {
            return -232998929;
        }

        private InContextIneligible() {
            super(com.paypal.pds.core.Icon.Alert.INSTANCE, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_tokenization_error_ineligible_card_title, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_tokenization_error_ineligible_card_body, com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_ok, 0, null);
        }

        public final java.lang.String toString() {
            return "InContextIneligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorConfig.InContextIneligible)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitErrorConfig(com.paypal.pds.core.Icon icon, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, i, i2, i3, i4);
    }
}
