package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u0001CB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u0015*\u00020$H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00105R \u00107\u001a\b\u0012\u0004\u0012\u000204068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010=R \u0010?\u001a\b\u0012\u0004\u0012\u00020<0>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;", "formatOrdinalUseCase", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "frequency", "", "initialize", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "event", "handleEvent", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;)V", "Ljava/time/DayOfWeek;", "dayOfWeek", "", "getNarrowFormattedDayOfWeek", "(Ljava/time/DayOfWeek;)Ljava/lang/String;", "", "dateEpoch", "", "isDateSelectable", "(J)Z", "Lkotlin/Function1;", "Ljava/time/LocalDate;", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;)Ljava/time/LocalDate;", "getHighSpeedVideoFpsRanges", "(Ljava/time/LocalDate;)Ljava/lang/String;", "", "getHighSpeedVideoSizes", "(I)Ljava/lang/String;", "getOutputFormats", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Locale;", "getUserLocale", "()Ljava/util/Locale;", "userLocale", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FrequencyViewModel extends androidx.view.ViewModel {
    private static final java.time.LocalDate getHighResolutionOutputSizeshNQ4ISI;
    private static final java.time.LocalDate getHighSpeedVideoFpsRanges;
    private static final java.time.LocalDate getHighSpeedVideoSizes;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect> effect;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public FrequencyViewModel(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase formatOrdinalUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatOrdinalUseCase, "");
        this.Camera2StreamConfigurationMap = localeInformation;
        this.getHighResolutionOutputSizeshNQ4ISI = dateTimeFormatUseCase;
        this.getHighSpeedVideoFpsRangesFor = formatOrdinalUseCase;
        java.time.LocalDate localDate = getHighSpeedVideoSizes;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState(null, localDate, null, null, null, null, localDate.getDayOfMonth(), null, null, false, 957, null));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final java.util.Locale getUserLocale() {
        return this.Camera2StreamConfigurationMap.getUserLocale();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect> getEffect() {
        return this.effect;
    }

    public final void initialize(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency) {
        if (frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) {
            handleEvent(new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay(((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) frequency).getDayOfWeek()));
            return;
        }
        if (frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) {
            handleEvent(new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay(((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) frequency).getDayOfWeek()));
        } else if (frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) {
            handleEvent(new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay(((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) frequency).getStartDate()));
        } else if (frequency != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final void handleEvent(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent event) {
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState value;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState copy;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState value2;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState copy2;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState value3;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState copy3;
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly weekly;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState value4;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState copy4;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState copy5;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState copy6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay)) {
            if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay)) {
                if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSaveButtonClick.INSTANCE)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputClick.INSTANCE)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputDismiss.INSTANCE)) {
                                if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
                                do {
                                    value = mutableStateFlow.getValue();
                                    copy = r4.copy((r22 & 1) != 0 ? r4.selectedFrequencyTypeUi : ((com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType) event).getFrequency(), (r22 & 2) != 0 ? r4.startDate : null, (r22 & 4) != 0 ? r4.weeklyDayOfWeek : null, (r22 & 8) != 0 ? r4.formattedWeeklyDayOfWeek : null, (r22 & 16) != 0 ? r4.biWeeklyDayOfWeek : null, (r22 & 32) != 0 ? r4.formattedBiWeeklyDayOfWeek : null, (r22 & 64) != 0 ? r4.monthlyDayOfMonth : 0, (r22 & 128) != 0 ? r4.formattedMonthDay : null, (r22 & 256) != 0 ? r4.formattedMonthDayOrdinal : null, (r22 & 512) != 0 ? value.shouldShowCalendarDialog : false);
                                } while (!mutableStateFlow.compareAndSet(value, copy));
                                return;
                            }
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow2 = this.getHighSpeedVideoFpsRanges;
                            do {
                                value2 = mutableStateFlow2.getValue();
                                copy2 = r3.copy((r22 & 1) != 0 ? r3.selectedFrequencyTypeUi : null, (r22 & 2) != 0 ? r3.startDate : null, (r22 & 4) != 0 ? r3.weeklyDayOfWeek : null, (r22 & 8) != 0 ? r3.formattedWeeklyDayOfWeek : null, (r22 & 16) != 0 ? r3.biWeeklyDayOfWeek : null, (r22 & 32) != 0 ? r3.formattedBiWeeklyDayOfWeek : null, (r22 & 64) != 0 ? r3.monthlyDayOfMonth : 0, (r22 & 128) != 0 ? r3.formattedMonthDay : null, (r22 & 256) != 0 ? r3.formattedMonthDayOrdinal : null, (r22 & 512) != 0 ? value2.shouldShowCalendarDialog : false);
                            } while (!mutableStateFlow2.compareAndSet(value2, copy2));
                            return;
                        }
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow3 = this.getHighSpeedVideoFpsRanges;
                        do {
                            value3 = mutableStateFlow3.getValue();
                            copy3 = r3.copy((r22 & 1) != 0 ? r3.selectedFrequencyTypeUi : null, (r22 & 2) != 0 ? r3.startDate : null, (r22 & 4) != 0 ? r3.weeklyDayOfWeek : null, (r22 & 8) != 0 ? r3.formattedWeeklyDayOfWeek : null, (r22 & 16) != 0 ? r3.biWeeklyDayOfWeek : null, (r22 & 32) != 0 ? r3.formattedBiWeeklyDayOfWeek : null, (r22 & 64) != 0 ? r3.monthlyDayOfMonth : 0, (r22 & 128) != 0 ? r3.formattedMonthDay : null, (r22 & 256) != 0 ? r3.formattedMonthDayOrdinal : null, (r22 & 512) != 0 ? value3.shouldShowCalendarDialog : true);
                        } while (!mutableStateFlow3.compareAndSet(value3, copy3));
                        return;
                    }
                    int i = com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRanges.getValue().getSelectedFrequencyTypeUi().ordinal()];
                    if (i == 1) {
                        weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly(this.getHighSpeedVideoFpsRanges.getValue().getWeeklyDayOfWeek());
                    } else if (i == 2) {
                        weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly(this.getHighSpeedVideoFpsRanges.getValue().getBiWeeklyDayOfWeek());
                    } else {
                        if (i != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        weekly = new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly(this.getHighSpeedVideoFpsRanges.getValue().getStartDate());
                    }
                    this.getHighSpeedVideoSizes.tryEmit(new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEffect.GoBackWithResult(this.getHighSpeedVideoFpsRanges.getValue().getStartDate(), weekly));
                    return;
                }
                com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay onSelectMonthlyDay = (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay) event;
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow4 = this.getHighSpeedVideoFpsRanges;
                do {
                    value4 = mutableStateFlow4.getValue();
                    com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState frequencyUiState = value4;
                    com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi = com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.MONTHLY;
                    java.time.LocalDate startDate = onSelectMonthlyDay.getStartDate();
                    int dayOfMonth = onSelectMonthlyDay.getStartDate().getDayOfMonth();
                    java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(onSelectMonthlyDay.getStartDate());
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(onSelectMonthlyDay.getStartDate().getDayOfMonth());
                    java.lang.String displayName = frequencyUiState.getWeeklyDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, getUserLocale());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "");
                    java.lang.String displayName2 = frequencyUiState.getBiWeeklyDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, getUserLocale());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName2, "");
                    copy4 = frequencyUiState.copy((r22 & 1) != 0 ? frequencyUiState.selectedFrequencyTypeUi : frequencyTypeUi, (r22 & 2) != 0 ? frequencyUiState.startDate : startDate, (r22 & 4) != 0 ? frequencyUiState.weeklyDayOfWeek : null, (r22 & 8) != 0 ? frequencyUiState.formattedWeeklyDayOfWeek : displayName, (r22 & 16) != 0 ? frequencyUiState.biWeeklyDayOfWeek : null, (r22 & 32) != 0 ? frequencyUiState.formattedBiWeeklyDayOfWeek : displayName2, (r22 & 64) != 0 ? frequencyUiState.monthlyDayOfMonth : dayOfMonth, (r22 & 128) != 0 ? frequencyUiState.formattedMonthDay : highSpeedVideoFpsRanges, (r22 & 256) != 0 ? frequencyUiState.formattedMonthDayOrdinal : highSpeedVideoSizes, (r22 & 512) != 0 ? frequencyUiState.shouldShowCalendarDialog : false);
                } while (!mutableStateFlow4.compareAndSet(value4, copy4));
                return;
            }
            final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay onSelectBiweeklyDay = (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay) event;
            java.time.LocalDate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.$r8$lambda$uJBXh1_zvYcTHt0J8hJmjl7pUlM(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay.this, (java.time.LocalDate) obj));
                }
            });
            int min = java.lang.Math.min(this.getHighSpeedVideoFpsRanges.getValue().getMonthlyDayOfMonth(), Camera2StreamConfigurationMap.lengthOfMonth());
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow5 = this.getHighSpeedVideoFpsRanges;
            while (true) {
                com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState value5 = mutableStateFlow5.getValue();
                com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi2 = com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.BIWEEKLY;
                java.time.DayOfWeek dayOfWeek = onSelectBiweeklyDay.getDayOfWeek();
                java.lang.String displayName3 = onSelectBiweeklyDay.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, getUserLocale());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName3, "");
                java.time.DayOfWeek dayOfWeek2 = onSelectBiweeklyDay.getDayOfWeek();
                java.lang.String displayName4 = onSelectBiweeklyDay.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, getUserLocale());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName4, "");
                java.time.LocalDate withDayOfMonth = Camera2StreamConfigurationMap.withDayOfMonth(min);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withDayOfMonth, "");
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow6 = mutableStateFlow5;
                int i2 = min;
                copy5 = r4.copy((r22 & 1) != 0 ? r4.selectedFrequencyTypeUi : frequencyTypeUi2, (r22 & 2) != 0 ? r4.startDate : Camera2StreamConfigurationMap, (r22 & 4) != 0 ? r4.weeklyDayOfWeek : dayOfWeek2, (r22 & 8) != 0 ? r4.formattedWeeklyDayOfWeek : displayName4, (r22 & 16) != 0 ? r4.biWeeklyDayOfWeek : dayOfWeek, (r22 & 32) != 0 ? r4.formattedBiWeeklyDayOfWeek : displayName3, (r22 & 64) != 0 ? r4.monthlyDayOfMonth : 0, (r22 & 128) != 0 ? r4.formattedMonthDay : getHighSpeedVideoFpsRanges(withDayOfMonth), (r22 & 256) != 0 ? r4.formattedMonthDayOrdinal : getHighSpeedVideoSizes(min), (r22 & 512) != 0 ? value5.shouldShowCalendarDialog : false);
                if (mutableStateFlow6.compareAndSet(value5, copy5)) {
                    return;
                }
                mutableStateFlow5 = mutableStateFlow6;
                min = i2;
            }
        } else {
            final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay onSelectWeeklyDay = (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay) event;
            java.time.LocalDate Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.m12072$r8$lambda$mySt4oW8uwm59l5ZnFqdYvhPyU(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay.this, (java.time.LocalDate) obj));
                }
            });
            int min2 = java.lang.Math.min(this.getHighSpeedVideoFpsRanges.getValue().getMonthlyDayOfMonth(), Camera2StreamConfigurationMap2.lengthOfMonth());
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow7 = this.getHighSpeedVideoFpsRanges;
            while (true) {
                com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState value6 = mutableStateFlow7.getValue();
                com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi3 = com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.WEEKLY;
                java.time.DayOfWeek dayOfWeek3 = onSelectWeeklyDay.getDayOfWeek();
                java.lang.String displayName5 = onSelectWeeklyDay.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, getUserLocale());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName5, "");
                java.time.DayOfWeek dayOfWeek4 = onSelectWeeklyDay.getDayOfWeek();
                java.lang.String displayName6 = onSelectWeeklyDay.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, getUserLocale());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName6, "");
                java.time.LocalDate withDayOfMonth2 = Camera2StreamConfigurationMap2.withDayOfMonth(min2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withDayOfMonth2, "");
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState> mutableStateFlow8 = mutableStateFlow7;
                int i3 = min2;
                copy6 = r4.copy((r22 & 1) != 0 ? r4.selectedFrequencyTypeUi : frequencyTypeUi3, (r22 & 2) != 0 ? r4.startDate : Camera2StreamConfigurationMap2, (r22 & 4) != 0 ? r4.weeklyDayOfWeek : dayOfWeek3, (r22 & 8) != 0 ? r4.formattedWeeklyDayOfWeek : displayName5, (r22 & 16) != 0 ? r4.biWeeklyDayOfWeek : dayOfWeek4, (r22 & 32) != 0 ? r4.formattedBiWeeklyDayOfWeek : displayName6, (r22 & 64) != 0 ? r4.monthlyDayOfMonth : 0, (r22 & 128) != 0 ? r4.formattedMonthDay : getHighSpeedVideoFpsRanges(withDayOfMonth2), (r22 & 256) != 0 ? r4.formattedMonthDayOrdinal : getHighSpeedVideoSizes(min2), (r22 & 512) != 0 ? value6.shouldShowCalendarDialog : false);
                if (mutableStateFlow8.compareAndSet(value6, copy6)) {
                    return;
                }
                mutableStateFlow7 = mutableStateFlow8;
                min2 = i3;
            }
        }
    }

    public final java.lang.String getNarrowFormattedDayOfWeek(java.time.DayOfWeek dayOfWeek) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        java.lang.String displayName = dayOfWeek.getDisplayName(java.time.format.TextStyle.NARROW, getUserLocale());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "");
        return displayName;
    }

    public final boolean isDateSelectable(long dateEpoch) {
        return getHighSpeedVideoSizes.atStartOfDay(java.time.ZoneOffset.UTC).toInstant().toEpochMilli() <= dateEpoch && dateEpoch <= getHighSpeedVideoFpsRanges.atStartOfDay(java.time.ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    private static java.time.LocalDate Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super java.time.LocalDate, java.lang.Boolean> p0) {
        java.time.LocalDate localDate = getHighResolutionOutputSizeshNQ4ISI;
        do {
            localDate = localDate.plusDays(1L);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        } while (!p0.invoke(localDate).booleanValue());
        return localDate;
    }

    private final java.lang.String getHighSpeedVideoFpsRanges(java.time.LocalDate p0) {
        java.time.ZoneId zoneId = this.Camera2StreamConfigurationMap.getTimezone().toZoneId();
        com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration = new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(new com.paypal.oslo.core.i18n.domain.model.CustomStyle(com.miteksystems.misnap.core.DateUtil.ICAO_FULL_DATE_FORMAT), null, 2, null);
        com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Date from = java.util.Date.from(p0.atStartOfDay(zoneId).toInstant());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        java.lang.String id = zoneId.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        java.lang.String orNull = dateTimeFormatUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, id), dateTimeConfiguration).getOrNull();
        if (orNull != null) {
            return orNull;
        }
        java.lang.String localDate = p0.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        return localDate;
    }

    private final java.lang.String getHighSpeedVideoSizes(int i) {
        java.lang.Object value;
        arrow.core.Either invoke$default = com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase.invoke$default(this.getHighSpeedVideoFpsRangesFor, i, null, 2, null);
        if (invoke$default instanceof arrow.core.Either.Left) {
            value = java.lang.String.valueOf(i);
        } else {
            if (!(invoke$default instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            value = ((arrow.core.Either.Right) invoke$default).getValue();
        }
        return (java.lang.String) value;
    }

    static {
        java.time.LocalDate now = java.time.LocalDate.now();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
        getHighResolutionOutputSizeshNQ4ISI = now;
        java.time.LocalDate plusDays = now.plusDays(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plusDays, "");
        getHighSpeedVideoSizes = plusDays;
        java.time.LocalDate plusYears = now.plusYears(1L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plusYears, "");
        getHighSpeedVideoFpsRanges = plusYears;
    }

    /* renamed from: $r8$lambda$my-St4oW8uwm59l5ZnFqdYvhPyU, reason: not valid java name */
    public static /* synthetic */ boolean m12072$r8$lambda$mySt4oW8uwm59l5ZnFqdYvhPyU(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay onSelectWeeklyDay, java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        return onSelectWeeklyDay.getDayOfWeek() == localDate.getDayOfWeek();
    }

    public static /* synthetic */ boolean $r8$lambda$uJBXh1_zvYcTHt0J8hJmjl7pUlM(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay onSelectBiweeklyDay, java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        return onSelectBiweeklyDay.getDayOfWeek() == localDate.getDayOfWeek();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.values().length];
            try {
                iArr[com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.WEEKLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.BIWEEKLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.MONTHLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
