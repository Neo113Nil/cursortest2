package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "", "T", "<init>", "()V", "Phone", "Mask", "PasteFilter", "Sensitive", "Currency", "ValidationTiming", "KeyboardNavigation", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Currency;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$KeyboardNavigation;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Mask;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$PasteFilter;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Phone;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Sensitive;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$ValidationTiming;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class MetadataKey<T> {
    public static final int $stable = 0;

    private MetadataKey() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Phone;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/PhoneMetadata;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PhoneMetadata> {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Phone INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Phone();

        public final int hashCode() {
            return -1344817572;
        }

        private Phone() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Phone";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Phone)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Mask;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MaskFieldMetadata;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Mask extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MaskFieldMetadata> {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Mask INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Mask();

        public final int hashCode() {
            return 233617470;
        }

        private Mask() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Mask";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Mask)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$PasteFilter;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/PasteFilterMetadata;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasteFilter extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.PasteFilterMetadata> {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter();

        public final int hashCode() {
            return 1933109849;
        }

        private PasteFilter() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasteFilter";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.PasteFilter)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Sensitive;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/SensitiveFieldMetadata;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Sensitive extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.SensitiveFieldMetadata> {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Sensitive INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Sensitive();

        public final int hashCode() {
            return 1331142788;
        }

        private Sensitive() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Sensitive";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Sensitive)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$Currency;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/CurrencyFieldMetadata;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Currency extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata> {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Currency INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Currency();

        public final int hashCode() {
            return 1850255459;
        }

        private Currency() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Currency";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Currency)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$ValidationTiming;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/ValidationTimingMetadata;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationTiming extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationTimingMetadata> {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.ValidationTiming INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.ValidationTiming();

        public final int hashCode() {
            return -1465553803;
        }

        private ValidationTiming() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ValidationTiming";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.ValidationTiming)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey$KeyboardNavigation;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/KeyboardNavigationMetadata;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KeyboardNavigation extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.KeyboardNavigationMetadata> {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.KeyboardNavigation INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.KeyboardNavigation();

        public final int hashCode() {
            return 1572855597;
        }

        private KeyboardNavigation() {
            super(null);
        }

        public final java.lang.String toString() {
            return "KeyboardNavigation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.KeyboardNavigation)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ MetadataKey(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
