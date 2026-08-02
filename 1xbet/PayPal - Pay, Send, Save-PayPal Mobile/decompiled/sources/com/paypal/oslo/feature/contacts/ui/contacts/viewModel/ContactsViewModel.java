package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 E2\u00020\u0001:\u0002FEB?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u0014\u0010/\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00101\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0010048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u0010)\u001a\u0014\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010:R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u0002050;8\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010A\u001a\b\u0012\u0004\u0012\u0002090@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/viewModel/ContactsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "getCountriesListUseCase", "Lcom/paypal/oslo/feature/contacts/ui/utils/PhoneNumberDisplayFormatter;", "phoneNumberDisplayFormatter", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "searchStrategy", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "config", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "contactSearchNetworkType", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;Lcom/paypal/oslo/feature/contacts/ui/utils/PhoneNumberDisplayFormatter;Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;)V", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "loadRecentSearches", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;)V", "deleteAllRecentSearches", "", "id", "deleteARecentSearch", "(Ljava/lang/String;)V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "createContactRecentSearch", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "createStringRecentSearch", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCountriesListUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/contacts/ui/utils/PhoneNumberDisplayFormatter;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/Job;", "getInputFormats", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/state/ContactsState;", "getOutputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/contacts/ui/contacts/effect/ContactsEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactsViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent, com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect> getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent> getInputFormats;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState> state;
    private static final com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.Companion Companion = new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/viewModel/ContactsViewModel$Factory;", "", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "searchStrategy", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "config", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "contactSearchNetworkType", "Lcom/paypal/oslo/feature/contacts/ui/contacts/viewModel/ContactsViewModel;", "create", "(Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;)Lcom/paypal/oslo/feature/contacts/ui/contacts/viewModel/ContactsViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel create(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy searchStrategy, com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig config, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @dagger.assisted.AssistedInject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ContactsViewModel(com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase, com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter, @dagger.assisted.Assisted com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, @dagger.assisted.Assisted com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, @dagger.assisted.Assisted com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        java.lang.String lowerCase;
        java.util.List emptyList;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCountriesListUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberDisplayFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsSearchStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchNetworkType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.getHighSpeedVideoFpsRangesFor = getCountriesListUseCase;
        this.getHighSpeedVideoFpsRanges = phoneNumberDisplayFormatter;
        this.getHighResolutionOutputSizeshNQ4ISI = contactsSearchStrategy;
        this.getHighSpeedVideoSizes = contactSearchScreenConfig;
        this.Camera2StreamConfigurationMap = contactSearchNetworkType;
        this.getOutputMinFrameDuration = localeProvider;
        this.getInputFormats = new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent>() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent> input) {
                kotlinx.coroutines.Job job;
                kotlinx.coroutines.Job launch$default;
                kotlinx.coroutines.Job job2;
                kotlinx.coroutines.Job launch$default2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged) {
                    job2 = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this.getHighSpeedVideoSizesFor;
                    if (job2 != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    java.lang.String obj2 = kotlin.text.StringsKt.trim(((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged) event).getQuery()).toString();
                    if (obj2.length() == 0) {
                        input.getEventDispatcher().invoke(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCleared.INSTANCE);
                        return;
                    }
                    com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this;
                    launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$1(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this, obj2, input, null), 3, null);
                    contactsViewModel.getHighSpeedVideoSizesFor = launch$default2;
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered) {
                    job = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this.getHighSpeedVideoSizesFor;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel2 = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this;
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$searchMiddleware$1$invoke$2(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this, event, input, null), 3, null);
                    contactsViewModel2.getHighSpeedVideoSizesFor = launch$default;
                }
            }
        };
        java.lang.String country = localeProvider.getUserLocale().getCountry();
        kotlin.jvm.internal.Intrinsics.checkNotNull(country);
        country = country.length() <= 0 ? null : country;
        if (country != null) {
            lowerCase = country.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        java.lang.String country2 = java.util.Locale.US.getCountry();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country2, "");
        lowerCase = country2.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> invoke = getCountriesListUseCase.invoke();
        if (invoke instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) invoke).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUiKt.toCountryUi((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) it.next()));
            }
            emptyList = arrayList;
        } else if (invoke instanceof arrow.core.Either.Left) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.Iterator it2 = emptyList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi) obj).getId(), lowerCase, true)) {
                    break;
                }
            }
        }
        com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent, com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ContactsViewModel.store", new com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState(null, null, this.getHighSpeedVideoSizes.getCtaTypes(), new com.paypal.oslo.feature.contacts.ui.contacts.state.PhoneInputState(null, null, null, false, (com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi) obj, null, emptyList, lowerCase, 47, null), 3, 0 == true ? 1 : 0), com.paypal.oslo.feature.contacts.ui.contacts.reducer.ContactsReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf(this.getInputFormats), androidx.view.ViewModelKt.getViewModelScope(contactsViewModel));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.state = mviStateStore.getUiState();
        this.effect = mviStateStore.getUiEffect();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(contactsViewModel), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (java.lang.Character.isDigit(kotlin.text.StringsKt.first(r11)) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0 A[PHI: r9
      0x00f0: PHI (r9v2 java.lang.Object) = (r9v15 java.lang.Object), (r9v16 java.lang.Object), (r9v17 java.lang.Object) binds: [B:23:0x006b, B:27:0x007d, B:19:0x00ed] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$formatQueryForCountry(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$formatQueryForCountry$1 contactsViewModel$formatQueryForCountry$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState value;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object obj2;
        java.lang.String str7;
        java.lang.Object formatCountryPickerQuery;
        if (continuation instanceof com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$formatQueryForCountry$1) {
            contactsViewModel$formatQueryForCountry$1 = (com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$formatQueryForCountry$1) continuation;
            if ((contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj3 = contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoSizesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.lang.String str8 = str;
                    obj2 = str;
                    if (str8.length() != 0) {
                        if (kotlin.text.StringsKt.first(str8) != '+') {
                            obj2 = str;
                        }
                        value = contactsViewModel.getInputSizeshNQ4ISI.getUiState().getValue();
                        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi selectedCountry = value.getPhoneInput().getSelectedCountry();
                        java.lang.String id = selectedCountry != null ? selectedCountry.getId() : null;
                        if (id != null) {
                            com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter = contactsViewModel.getHighSpeedVideoFpsRanges;
                            contactsViewModel$formatQueryForCountry$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRangesFor = str2;
                            contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                            contactsViewModel$formatQueryForCountry$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                            contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration = 1;
                            java.lang.Object stripExtensionIfPresent = phoneNumberDisplayFormatter.stripExtensionIfPresent(str, id, contactsViewModel$formatQueryForCountry$1);
                            if (stripExtensionIfPresent != coroutine_suspended) {
                                obj = stripExtensionIfPresent;
                                str5 = str;
                                str6 = id;
                            }
                            return coroutine_suspended;
                        }
                        str3 = id;
                        str4 = str;
                        str7 = str;
                        com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter2 = contactsViewModel.getHighSpeedVideoFpsRanges;
                        contactsViewModel$formatQueryForCountry$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                        contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                        contactsViewModel$formatQueryForCountry$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration = 2;
                        formatCountryPickerQuery = phoneNumberDisplayFormatter2.formatCountryPickerQuery(str4, str2, contactsViewModel$formatQueryForCountry$1);
                        obj2 = formatCountryPickerQuery;
                        if (formatCountryPickerQuery == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj3);
                    return obj3;
                }
                str6 = (java.lang.String) contactsViewModel$formatQueryForCountry$1.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState contactsState = (com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState) contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoSizes;
                java.lang.String str9 = (java.lang.String) contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRangesFor;
                str5 = (java.lang.String) contactsViewModel$formatQueryForCountry$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj3);
                obj = obj3;
                value = contactsState;
                str2 = str9;
                str4 = (java.lang.String) obj;
                java.lang.String str10 = str5;
                str3 = str6;
                str7 = str10;
                com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter22 = contactsViewModel.getHighSpeedVideoFpsRanges;
                contactsViewModel$formatQueryForCountry$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                contactsViewModel$formatQueryForCountry$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration = 2;
                formatCountryPickerQuery = phoneNumberDisplayFormatter22.formatCountryPickerQuery(str4, str2, contactsViewModel$formatQueryForCountry$1);
                obj2 = formatCountryPickerQuery;
                if (formatCountryPickerQuery == coroutine_suspended) {
                    return obj2;
                }
            }
        }
        contactsViewModel$formatQueryForCountry$1 = new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$formatQueryForCountry$1(contactsViewModel, continuation);
        java.lang.Object obj32 = contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        str4 = (java.lang.String) obj;
        java.lang.String str102 = str5;
        str3 = str6;
        str7 = str102;
        com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter222 = contactsViewModel.getHighSpeedVideoFpsRanges;
        contactsViewModel$formatQueryForCountry$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
        contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
        contactsViewModel$formatQueryForCountry$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
        contactsViewModel$formatQueryForCountry$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
        contactsViewModel$formatQueryForCountry$1.getOutputMinFrameDuration = 2;
        formatCountryPickerQuery = phoneNumberDisplayFormatter222.formatCountryPickerQuery(str4, str2, contactsViewModel$formatQueryForCountry$1);
        obj2 = formatCountryPickerQuery;
        if (formatCountryPickerQuery == coroutine_suspended) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.contacts.ui.contacts.effect.ContactsEffect> getEffect() {
        return this.effect;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$1", f = "ContactsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.loadRecentSearches$default(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void processEvent(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged) {
            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged searchQueryChanged = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged) event;
            if (kotlin.jvm.internal.Intrinsics.areEqual(searchQueryChanged.getQuery(), this.getInputSizeshNQ4ISI.getUiState().getValue().getPhoneInput().getSearchQuery())) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleSearchQueryChanged$1(this, searchQueryChanged, null), 3, null);
            this.getInputSizeshNQ4ISI.onEvent(event);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleCountrySelected$1((com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected) event, this, null), 3, null);
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches)) {
            if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches)) {
                if (!(event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch)) {
                    if (event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleCreateContactRecentSearch$1(this, (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch) event, null), 3, null);
                        return;
                    } else if (event instanceof com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleCreateStringRecentSearch$1(this, (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch) event, null), 3, null);
                        return;
                    } else {
                        this.getInputSizeshNQ4ISI.onEvent(event);
                        return;
                    }
                }
                com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch deleteARecentSearch = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch) event;
                this.getInputSizeshNQ4ISI.onEvent(deleteARecentSearch);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleDeleteARecentSearch$1(this, deleteARecentSearch, null), 3, null);
                return;
            }
            com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches deleteAllRecentSearches = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches) event;
            this.getInputSizeshNQ4ISI.onEvent(deleteAllRecentSearches);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleDeleteAllRecentSearches$1(this, deleteAllRecentSearches, null), 3, null);
            return;
        }
        com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches loadRecentSearches = (com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches) event;
        this.getInputSizeshNQ4ISI.onEvent(loadRecentSearches);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleLoadRecentSearches$1(this, loadRecentSearches, null), 3, null);
    }

    public static /* synthetic */ void loadRecentSearches$default(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            networkType = com.paypal.oslo.feature.contacts.api.NetworkType.P2P;
        }
        contactsViewModel.loadRecentSearches(networkType);
    }

    public final void loadRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        processEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.LoadRecentSearches(networkType));
    }

    public static /* synthetic */ void deleteAllRecentSearches$default(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            networkType = com.paypal.oslo.feature.contacts.api.NetworkType.P2P;
        }
        contactsViewModel.deleteAllRecentSearches(networkType);
    }

    public final void deleteAllRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        processEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteAllRecentSearches(networkType));
    }

    public final void deleteARecentSearch(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        processEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.DeleteARecentSearch(id));
    }

    public static /* synthetic */ void createContactRecentSearch$default(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            networkType = com.paypal.oslo.feature.contacts.api.NetworkType.P2P;
        }
        contactsViewModel.createContactRecentSearch(str, networkType);
    }

    public final void createContactRecentSearch(java.lang.String contactId, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        processEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateContactRecentSearch(contactId, networkType));
    }

    public static /* synthetic */ void createStringRecentSearch$default(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            networkType = com.paypal.oslo.feature.contacts.api.NetworkType.P2P;
        }
        contactsViewModel.createStringRecentSearch(str, networkType);
    }

    public final void createStringRecentSearch(java.lang.String value, com.paypal.oslo.feature.contacts.api.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        processEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CreateStringRecentSearch(value, networkType));
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/viewModel/ContactsViewModel$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ boolean $r8$lambda$rQ8ys71NSrUtoIPJEJrtOm7ou80(com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryUi2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(countryUi2.getId(), countryUi.getId());
    }

    public static final /* synthetic */ java.lang.String access$buildSearchQuery(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, java.lang.String str, com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState contactsState) {
        java.lang.String unFormattedPhone = contactsState.getPhoneInput().getUnFormattedPhone();
        if (kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) unFormattedPhone, '+', false, 2, (java.lang.Object) null)) {
            return unFormattedPhone;
        }
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi selectedCountry = contactsState.getPhoneInput().getSelectedCountry();
        java.lang.String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (java.lang.Character.isDigit(str2.charAt(i2))) {
                i++;
            }
        }
        boolean z = i >= 10;
        java.lang.Character firstOrNull = kotlin.text.StringsKt.firstOrNull(str2);
        if (firstOrNull == null || !java.lang.Character.isDigit(firstOrNull.charValue()) || selectedCountry == null || !z) {
            return str;
        }
        java.lang.String dialCode = selectedCountry.getDialCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(dialCode);
        sb.append(str);
        return sb.toString();
    }

    public static final /* synthetic */ java.lang.String access$computeDisplayText(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.FormattingResult formattingResult, com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, boolean z, java.lang.String str) {
        java.lang.String displayText = formattingResult.getDisplayText();
        boolean startsWith$default = kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) formattingResult.getNormalizedQuery(), '+', false, 2, (java.lang.Object) null);
        boolean z2 = formattingResult.getNormalizedQuery().length() > 0 && (java.lang.Character.isDigit(kotlin.text.StringsKt.first(formattingResult.getNormalizedQuery())) || kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) formattingResult.getNormalizedQuery(), '+', false, 2, (java.lang.Object) null));
        boolean z3 = countryUi != null && z;
        boolean z4 = displayText == null && z2 && z3;
        if ((displayText == null || !kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) displayText, '+', false, 2, (java.lang.Object) null)) && (!startsWith$default || displayText == null)) {
            if (displayText != null && z3) {
                java.lang.String dialCode = countryUi.getDialCode();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(dialCode);
                sb.append(" ");
                sb.append(displayText);
                return sb.toString();
            }
            if (z4) {
                return str;
            }
        }
        return displayText;
    }

    public static final /* synthetic */ java.lang.String access$computeNormalizedQuery(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.FormattingResult formattingResult, com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, boolean z) {
        if (!kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) formattingResult.getNormalizedQuery(), '+', false, 2, (java.lang.Object) null) && formattingResult.getNormalizedQuery().length() > 0 && ((java.lang.Character.isDigit(kotlin.text.StringsKt.first(formattingResult.getNormalizedQuery())) || kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) formattingResult.getNormalizedQuery(), '+', false, 2, (java.lang.Object) null)) && countryUi != null && z)) {
            java.lang.String dialCode = countryUi.getDialCode();
            java.lang.String normalizedQuery = formattingResult.getNormalizedQuery();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(dialCode);
            sb.append(normalizedQuery);
            return sb.toString();
        }
        return formattingResult.getNormalizedQuery();
    }

    public static final /* synthetic */ java.lang.Object access$executeSearch(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, java.lang.String str, final kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.m24097catch(contactsViewModel.getHighResolutionOutputSizeshNQ4ISI.search(str, contactsViewModel.Camera2StreamConfigurationMap), new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$executeSearch$2(function1, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$executeSearch$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult contactsSearchResult = (com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult) obj;
                if (contactsSearchResult instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Loading) {
                    function1.invoke(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchStarted.INSTANCE);
                } else if (contactsSearchResult instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore) {
                    function1.invoke(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchLoadingMore(((com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.LoadingMore) contactsSearchResult).getContacts()));
                } else if (contactsSearchResult instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success) {
                    function1.invoke(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchCompleted(((com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Success) contactsSearchResult).getContacts()));
                } else {
                    if (!(contactsSearchResult instanceof com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error error = (com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult.Error) contactsSearchResult;
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.contacts.LoggerKt.log, com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events.CONTACT_SEARCH_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", error.getError())), null, 4, null);
                    function1.invoke(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchFailed(error.getError()));
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.List access$updateRecentCountries(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, java.util.List list, final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi) {
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list);
        kotlin.collections.CollectionsKt.removeAll(mutableList, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.$r8$lambda$rQ8ys71NSrUtoIPJEJrtOm7ou80(com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi.this, (com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi) obj));
            }
        });
        mutableList.add(0, countryUi);
        if (mutableList.size() > 6) {
            mutableList.remove(kotlin.collections.CollectionsKt.getLastIndex(mutableList));
        }
        return mutableList;
    }
}
