package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadScreen", "CountrySelected", "PermissionGranted", "DismissCountryPicker", "DismissPermissionRequest", "EditLocationClicked", "LocationDetected", "CheckLocation", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$CheckLocation;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$CountrySelected;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$DismissCountryPicker;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$DismissPermissionRequest;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$EditLocationClicked;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$LocationDetected;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$PermissionGranted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ShowToPayEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ShowToPayEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "", "userCountryCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$LoadScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUserCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadScreen extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 0;
        private final java.lang.String userCountryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadScreen(java.lang.String str) {
            super("ShowToPayEvent.LoadScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.userCountryCode = str;
        }

        public final java.lang.String getUserCountryCode() {
            return this.userCountryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.userCountryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadScreen(userCountryCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.userCountryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.userCountryCode, ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen) other).userCountryCode);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen copy(java.lang.String userCountryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userCountryCode, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen(userCountryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUserCountryCode() {
            return this.userCountryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen loadScreen, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loadScreen.userCountryCode;
            }
            return loadScreen.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$CountrySelected;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$CountrySelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "getCountry"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CountrySelected extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail country;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountrySelected(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
            super("ShowToPayEvent.CountrySelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryPhoneDetail, "");
            this.country = countryPhoneDetail;
        }

        public final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail getCountry() {
            return this.country;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail = this.country;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CountrySelected(country=");
            sb.append(countryPhoneDetail);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.country.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected) other).country);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected copy(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail country) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected(country);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail getCountry() {
            return this.country;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected countrySelected, com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                countryPhoneDetail = countrySelected.country;
            }
            return countrySelected.copy(countryPhoneDetail);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$PermissionGranted;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermissionGranted extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.PermissionGranted INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.PermissionGranted();

        public final int hashCode() {
            return 1715280028;
        }

        private PermissionGranted() {
            super("ShowToPayEvent.PermissionGranted", null);
        }

        public final java.lang.String toString() {
            return "PermissionGranted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.PermissionGranted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$DismissCountryPicker;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissCountryPicker extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissCountryPicker INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissCountryPicker();

        public final int hashCode() {
            return -1197290326;
        }

        private DismissCountryPicker() {
            super("ShowToPayEvent.DismissCountryPicker", null);
        }

        public final java.lang.String toString() {
            return "DismissCountryPicker";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissCountryPicker)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$DismissPermissionRequest;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissPermissionRequest extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissPermissionRequest INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissPermissionRequest();

        public final int hashCode() {
            return 554341286;
        }

        private DismissPermissionRequest() {
            super("ShowToPayEvent.DismissPermissionRequest", null);
        }

        public final java.lang.String toString() {
            return "DismissPermissionRequest";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissPermissionRequest)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$EditLocationClicked;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditLocationClicked extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.EditLocationClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.EditLocationClicked();

        public final int hashCode() {
            return 564023800;
        }

        private EditLocationClicked() {
            super("ShowToPayEvent.EditLocationClicked", null);
        }

        public final java.lang.String toString() {
            return "EditLocationClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.EditLocationClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$LocationDetected;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "", "countryCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$LocationDetected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocationDetected extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 0;
        private final java.lang.String countryCode;

        public LocationDetected(java.lang.String str) {
            super("ShowToPayEvent.LocationDetected", null);
            this.countryCode = str;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationDetected(countryCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.countryCode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected) other).countryCode);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected copy(java.lang.String countryCode) {
            return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected(countryCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected locationDetected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = locationDetected.countryCode;
            }
            return locationDetected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent$CheckLocation;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckLocation extends com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CheckLocation INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CheckLocation();

        public final int hashCode() {
            return -1804279923;
        }

        private CheckLocation() {
            super("ShowToPayEvent.CheckLocation", null);
        }

        public final java.lang.String toString() {
            return "CheckLocation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CheckLocation)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ShowToPayEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
