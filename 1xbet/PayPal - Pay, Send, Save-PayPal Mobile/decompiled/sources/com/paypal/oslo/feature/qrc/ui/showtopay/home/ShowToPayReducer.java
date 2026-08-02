package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect;", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "getCountriesListUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiState;Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShowToPayReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ShowToPayReducer(com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCountriesListUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getCountriesListUseCase;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ShowToPayReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState state, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent event) {
        java.util.Set set;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel copy;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel copy2;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel copy3;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel copy4;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel copy5;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel copy6;
        java.util.List emptyList;
        java.lang.Object obj;
        java.util.Set set2;
        java.lang.String countryName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Content)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Content content = (com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Content) state;
            if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.EditLocationClicked)) {
                if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected) {
                    com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail country = ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected) event).getCountry();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(country.getCountryCode(), content.getUiModel().getUserCountryCode())) {
                        copy5 = r5.copy((r18 & 1) != 0 ? r5.userCountryCode : null, (r18 & 2) != 0 ? r5.selectedCountryCode : null, (r18 & 4) != 0 ? r5.selectedCountryName : null, (r18 & 8) != 0 ? r5.countries : null, (r18 & 16) != 0 ? r5.allCountries : null, (r18 & 32) != 0 ? r5.pendingCountry : country, (r18 & 64) != 0 ? r5.showCountryPicker : false, (r18 & 128) != 0 ? content.getUiModel().showPermissionRequest : true);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy5), null, 2, null);
                    }
                    copy4 = r5.copy((r18 & 1) != 0 ? r5.userCountryCode : null, (r18 & 2) != 0 ? r5.selectedCountryCode : country.getCountryCode(), (r18 & 4) != 0 ? r5.selectedCountryName : country.getCountryName(), (r18 & 8) != 0 ? r5.countries : null, (r18 & 16) != 0 ? r5.allCountries : null, (r18 & 32) != 0 ? r5.pendingCountry : null, (r18 & 64) != 0 ? r5.showCountryPicker : false, (r18 & 128) != 0 ? content.getUiModel().showPermissionRequest : false);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy4), null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.PermissionGranted)) {
                    if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissCountryPicker)) {
                        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissPermissionRequest)) {
                            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CheckLocation) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected) {
                                com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected locationDetected = (com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LocationDetected) event;
                                if (locationDetected.getCountryCode() != null) {
                                    set = com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducerKt.getHighSpeedVideoSizes;
                                    if (set.contains(locationDetected.getCountryCode())) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_readiness));
                                    }
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content, event);
                        }
                        copy = r6.copy((r18 & 1) != 0 ? r6.userCountryCode : null, (r18 & 2) != 0 ? r6.selectedCountryCode : null, (r18 & 4) != 0 ? r6.selectedCountryName : null, (r18 & 8) != 0 ? r6.countries : null, (r18 & 16) != 0 ? r6.allCountries : null, (r18 & 32) != 0 ? r6.pendingCountry : null, (r18 & 64) != 0 ? r6.showCountryPicker : false, (r18 & 128) != 0 ? content.getUiModel().showPermissionRequest : false);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy), null, 2, null);
                    }
                    copy2 = r6.copy((r18 & 1) != 0 ? r6.userCountryCode : null, (r18 & 2) != 0 ? r6.selectedCountryCode : null, (r18 & 4) != 0 ? r6.selectedCountryName : null, (r18 & 8) != 0 ? r6.countries : null, (r18 & 16) != 0 ? r6.allCountries : null, (r18 & 32) != 0 ? r6.pendingCountry : null, (r18 & 64) != 0 ? r6.showCountryPicker : false, (r18 & 128) != 0 ? content.getUiModel().showPermissionRequest : false);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy2), null, 2, null);
                }
                copy3 = r6.copy((r18 & 1) != 0 ? r6.userCountryCode : null, (r18 & 2) != 0 ? r6.selectedCountryCode : null, (r18 & 4) != 0 ? r6.selectedCountryName : null, (r18 & 8) != 0 ? r6.countries : null, (r18 & 16) != 0 ? r6.allCountries : null, (r18 & 32) != 0 ? r6.pendingCountry : null, (r18 & 64) != 0 ? r6.showCountryPicker : false, (r18 & 128) != 0 ? content.getUiModel().showPermissionRequest : false);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content.copy(copy3), new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_confirming_location));
            }
            copy6 = r6.copy((r18 & 1) != 0 ? r6.userCountryCode : null, (r18 & 2) != 0 ? r6.selectedCountryCode : null, (r18 & 4) != 0 ? r6.selectedCountryName : null, (r18 & 8) != 0 ? r6.countries : null, (r18 & 16) != 0 ? r6.allCountries : null, (r18 & 32) != 0 ? r6.pendingCountry : null, (r18 & 64) != 0 ? r6.showCountryPicker : true, (r18 & 128) != 0 ? content.getUiModel().showPermissionRequest : false);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy6), null, 2, null);
        }
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Initial initial = (com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen) {
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            if (invoke instanceof arrow.core.Either.Right) {
                emptyList = (java.util.List) ((arrow.core.Either.Right) invoke).getValue();
            } else if (invoke instanceof arrow.core.Either.Left) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.List list = emptyList;
            java.util.List list2 = list;
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj).getCountryCode(), ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen) event).getUserCountryCode())) {
                    break;
                }
            }
            com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail = (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj;
            set2 = com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducerKt.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen loadScreen = (com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen) event;
            java.util.Set plus = kotlin.collections.SetsKt.plus((java.util.Set<? extends java.lang.String>) set2, loadScreen.getUserCountryCode());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (plus.contains(((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj2).getCountryCode())) {
                    arrayList.add(obj2);
                }
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Content(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel(loadScreen.getUserCountryCode(), loadScreen.getUserCountryCode(), (countryPhoneDetail == null || (countryName = countryPhoneDetail.getCountryName()) == null) ? loadScreen.getUserCountryCode() : countryName, arrayList, list, null, false, false, 224, null)), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
