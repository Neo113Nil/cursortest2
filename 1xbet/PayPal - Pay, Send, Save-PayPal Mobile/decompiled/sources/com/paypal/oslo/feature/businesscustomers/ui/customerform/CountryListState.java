package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState;", "", "<init>", "()V", "Loaded", "Loading", "Error", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState$Error;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState$Loaded;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CountryListState {
    public static final int $stable = 0;

    private CountryListState() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState$Loaded;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "countries", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState$Loaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCountries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loaded extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> countries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.countries = list;
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> getCountries() {
            return this.countries;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list = this.countries;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded(countries=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.countries.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.countries, ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded) other).countries);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded copy(java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> countries) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countries, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded(countries);
        }

        public final java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> component1() {
            return this.countries;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loaded loaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loaded.countries;
            }
            return loaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState$Loading;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loading INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loading();

        public final int hashCode() {
            return -1621765369;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState$Error;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CountryListState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Error INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Error();

        public final int hashCode() {
            return -727598445;
        }

        private Error() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerform.CountryListState.Error)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CountryListState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
