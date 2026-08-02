package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "result", "Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1", f = "GetAccountSettingsUseCase.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10}, l = {62, 101, 102, 102, 107, 107, 110, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 140, 140, 66}, m = "invokeSuspend", n = {"$this$transformLatest", "result", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "isAccountDiscoverable", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "isAccountDiscoverable", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "formattedName", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "formattedName", "isAccountDiscoverable", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rawPersonName", "formattedName", "isAccountDiscoverable", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$2", "$this$transformLatest", "result", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-GetAccountSettingsUseCase$invoke$1$1"}, nl = {63, 102, 102, 103, 107, 110, 113, 140, 140, 141, 152}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class GetAccountSettingsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>>, arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.AccountSettingsData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0522, code lost:
    
        if (r3.emit(r1, r29) != r10) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0360, code lost:
    
        if (r4 == r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02b6, code lost:
    
        if (r2.emit(r1, r29) != r10) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        if (r8.emit(null, r29) != r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x058a, code lost:
    
        if (r8.emit(r2, r29) != r10) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027f  */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase;
        com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings;
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person rawPersonName;
        java.lang.Object obj2;
        boolean z;
        boolean z2;
        java.lang.Object Camera2StreamConfigurationMap;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        arrow.core.Either either;
        int i;
        int i2;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository;
        java.lang.Object accountDiscoverabilityStatus;
        arrow.core.Either either2;
        com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings2;
        com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase2;
        int i3;
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData2;
        int i4;
        java.lang.Object obj3;
        java.lang.Object Camera2StreamConfigurationMap2;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        int i5;
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData3;
        java.lang.Boolean bool;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person3;
        int i6;
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData4;
        com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase3;
        arrow.core.Either either3;
        boolean z3;
        com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase;
        java.lang.Object invoke;
        ?? r19;
        java.lang.Object value;
        java.lang.Object obj4;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository2;
        java.lang.Object accountDiscoverabilityStatus2;
        com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData5;
        com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase4;
        arrow.core.Either either4;
        int i7;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person4;
        com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings3;
        java.lang.String str;
        java.lang.Object Camera2StreamConfigurationMap3;
        kotlinx.coroutines.flow.FlowCollector flowCollector3;
        java.lang.String str2;
        com.paypal.oslo.core.i18n.domain.model.NameInput.Person person5;
        arrow.core.Either either5;
        java.lang.Boolean bool2;
        kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDurationlomOqCM;
        arrow.core.Either either6 = (arrow.core.Either) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getOutputSizeshNQ4ISI) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                if (either6 == null) {
                    this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                    this.getOutputSizeshNQ4ISI = 1;
                    break;
                } else {
                    getAccountSettingsUseCase = this.getOutputStallDuration;
                    accountSettingsStrings = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (either6 instanceof arrow.core.Either.Right) {
                        accountSettingsData = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) ((arrow.core.Either.Right) either6).getValue();
                        rawPersonName = accountSettingsData.getRawPersonName();
                        if (rawPersonName != null) {
                            obj2 = null;
                            this.getOutputMinFrameDurationlomOqCM = flowCollector4;
                            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                            this.getOutputFormats = getAccountSettingsUseCase;
                            this.getInputFormats = accountSettingsStrings;
                            this.getHighSpeedVideoSizesFor = accountSettingsData;
                            this.getOutputMinFrameDuration = rawPersonName;
                            this.getInputSizeshNQ4ISI = flowCollector4;
                            this.getHighSpeedVideoFpsRanges = 0;
                            this.getHighSpeedVideoFpsRangesFor = 0;
                            this.getOutputSizeshNQ4ISI = 5;
                            z = false;
                            z2 = true;
                            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(accountSettingsData, accountSettingsStrings, getAccountSettingsUseCase, null, null, this);
                            if (Camera2StreamConfigurationMap != coroutine_suspended) {
                                person = rawPersonName;
                                flowCollector = flowCollector4;
                                either = either6;
                                i = 0;
                                i2 = 0;
                                this.getOutputMinFrameDurationlomOqCM = flowCollector4;
                                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                this.getOutputFormats = getAccountSettingsUseCase;
                                this.getInputFormats = accountSettingsStrings;
                                this.getHighSpeedVideoSizesFor = accountSettingsData;
                                this.getOutputMinFrameDuration = person;
                                this.getInputSizeshNQ4ISI = obj2;
                                this.getHighSpeedVideoFpsRanges = i2;
                                this.getHighSpeedVideoFpsRangesFor = i;
                                this.getOutputSizeshNQ4ISI = 6;
                                if (flowCollector.emit(Camera2StreamConfigurationMap, this) != coroutine_suspended) {
                                    person3 = person;
                                    i6 = i2;
                                    accountSettingsData4 = accountSettingsData;
                                    getAccountSettingsUseCase3 = getAccountSettingsUseCase;
                                    either3 = either;
                                    z3 = z2;
                                    nameFormatUseCase = getAccountSettingsUseCase3.getHighSpeedVideoFpsRanges;
                                    com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person6 = new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person((com.paypal.oslo.core.i18n.domain.model.NameStyle) null, (java.lang.String) null, (com.paypal.oslo.core.i18n.domain.model.PersonType) null, (com.paypal.oslo.core.i18n.domain.model.FormatOptions) null, (java.util.Locale) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                    this.getOutputMinFrameDurationlomOqCM = flowCollector4;
                                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                                    this.getOutputFormats = getAccountSettingsUseCase3;
                                    this.getInputFormats = accountSettingsStrings;
                                    this.getHighSpeedVideoSizesFor = accountSettingsData4;
                                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person3);
                                    this.getHighSpeedVideoFpsRanges = i6;
                                    this.getHighSpeedVideoFpsRangesFor = i;
                                    this.getOutputSizeshNQ4ISI = 7;
                                    invoke = nameFormatUseCase.invoke(person3, person6, this);
                                    r19 = z3;
                                    break;
                                }
                            }
                        } else {
                            if (kotlin.text.StringsKt.isBlank(accountSettingsData.getProfileName().getValue())) {
                                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
                                com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileLoading = com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getProfileLoading();
                                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                                pairArr[0] = kotlin.TuplesKt.to("profile_name_empty", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(accountSettingsData.getProfileName().getValue().length() == 0));
                                pairArr[1] = kotlin.TuplesKt.to("profile_name_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.text.StringsKt.isBlank(accountSettingsData.getProfileName().getValue())));
                                pairArr[2] = kotlin.TuplesKt.to("profile_name_length", kotlin.coroutines.jvm.internal.Boxing.boxInt(accountSettingsData.getProfileName().getValue().length()));
                                com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(logger, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(profileLoading, "Profile name blank with no raw person name, skipping formatting", "name_blank_no_raw_person_name", kotlin.collections.MapsKt.mapOf(pairArr), null, 8, null));
                            }
                            iSettingsRepository = getAccountSettingsUseCase.getHighResolutionOutputSizeshNQ4ISI;
                            this.getOutputMinFrameDurationlomOqCM = flowCollector4;
                            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                            this.getOutputFormats = getAccountSettingsUseCase;
                            this.getInputFormats = accountSettingsStrings;
                            this.getHighSpeedVideoSizesFor = accountSettingsData;
                            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rawPersonName);
                            this.getHighSpeedVideoFpsRanges = 0;
                            this.getHighSpeedVideoFpsRangesFor = 0;
                            this.getOutputSizeshNQ4ISI = 2;
                            accountDiscoverabilityStatus = iSettingsRepository.getAccountDiscoverabilityStatus(this);
                            if (accountDiscoverabilityStatus != coroutine_suspended) {
                                either2 = either6;
                                accountSettingsStrings2 = accountSettingsStrings;
                                getAccountSettingsUseCase2 = getAccountSettingsUseCase;
                                i3 = 0;
                                accountSettingsData2 = accountSettingsData;
                                i4 = 0;
                                java.lang.Boolean bool3 = (java.lang.Boolean) accountDiscoverabilityStatus;
                                java.lang.String value2 = accountSettingsData2.getProfileName().getValue();
                                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData2);
                                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rawPersonName);
                                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool3);
                                this.getOutputMinFrameDuration = flowCollector4;
                                this.getHighSpeedVideoFpsRanges = i4;
                                this.getHighSpeedVideoFpsRangesFor = i3;
                                this.getOutputSizeshNQ4ISI = 3;
                                obj3 = null;
                                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(accountSettingsData2, accountSettingsStrings2, getAccountSettingsUseCase2, value2, bool3, this);
                                if (Camera2StreamConfigurationMap2 != coroutine_suspended) {
                                    person2 = rawPersonName;
                                    flowCollector2 = flowCollector4;
                                    i5 = i3;
                                    accountSettingsData3 = accountSettingsData2;
                                    bool = bool3;
                                    this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData3);
                                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person2);
                                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                                    this.getOutputMinFrameDuration = obj3;
                                    this.getHighSpeedVideoFpsRanges = i4;
                                    this.getHighSpeedVideoFpsRangesFor = i5;
                                    this.getOutputSizeshNQ4ISI = 4;
                                    break;
                                }
                            }
                        }
                    } else {
                        if (!(either6 instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError = (com.paypal.oslo.feature.settings.domain.error.SettingsError) ((arrow.core.Either.Left) either6).getValue();
                        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            defaultRaise.raise(settingsError);
                            throw new kotlin.KotlinNothingValueException();
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            defaultRaise.complete();
                            arrow.core.Either.Left left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                            this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(settingsError);
                            this.getHighSpeedVideoFpsRanges = 0;
                            this.getHighSpeedVideoFpsRangesFor = 0;
                            this.getOutputSizeshNQ4ISI = 11;
                            break;
                        } catch (java.lang.Throwable th) {
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 2:
                int i8 = this.getHighSpeedVideoFpsRangesFor;
                int i9 = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.core.i18n.domain.model.NameInput.Person person7 = (com.paypal.oslo.core.i18n.domain.model.NameInput.Person) this.getOutputMinFrameDuration;
                com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData6 = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings4 = (com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings) this.getInputFormats;
                com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase5 = (com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase) this.getOutputFormats;
                arrow.core.Either either7 = (arrow.core.Either) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                accountSettingsData2 = accountSettingsData6;
                accountSettingsStrings2 = accountSettingsStrings4;
                i3 = i8;
                getAccountSettingsUseCase2 = getAccountSettingsUseCase5;
                either2 = either7;
                i4 = i9;
                rawPersonName = person7;
                accountDiscoverabilityStatus = obj;
                java.lang.Boolean bool32 = (java.lang.Boolean) accountDiscoverabilityStatus;
                java.lang.String value22 = accountSettingsData2.getProfileName().getValue();
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData2);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rawPersonName);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool32);
                this.getOutputMinFrameDuration = flowCollector4;
                this.getHighSpeedVideoFpsRanges = i4;
                this.getHighSpeedVideoFpsRangesFor = i3;
                this.getOutputSizeshNQ4ISI = 3;
                obj3 = null;
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(accountSettingsData2, accountSettingsStrings2, getAccountSettingsUseCase2, value22, bool32, this);
                if (Camera2StreamConfigurationMap2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                i5 = this.getHighSpeedVideoFpsRangesFor;
                int i10 = this.getHighSpeedVideoFpsRanges;
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
                bool = (java.lang.Boolean) this.getHighSpeedVideoSizesFor;
                person2 = (com.paypal.oslo.core.i18n.domain.model.NameInput.Person) this.getInputFormats;
                accountSettingsData3 = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) this.getOutputFormats;
                arrow.core.Either either8 = (arrow.core.Either) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                obj3 = null;
                either2 = either8;
                i4 = i10;
                Camera2StreamConfigurationMap2 = obj;
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData3);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person2);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                this.getOutputMinFrameDuration = obj3;
                this.getHighSpeedVideoFpsRanges = i4;
                this.getHighSpeedVideoFpsRangesFor = i5;
                this.getOutputSizeshNQ4ISI = 4;
                break;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 5:
                i = this.getHighSpeedVideoFpsRangesFor;
                int i11 = this.getHighSpeedVideoFpsRanges;
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                person = (com.paypal.oslo.core.i18n.domain.model.NameInput.Person) this.getOutputMinFrameDuration;
                accountSettingsData = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) this.getHighSpeedVideoSizesFor;
                accountSettingsStrings = (com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings) this.getInputFormats;
                getAccountSettingsUseCase = (com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase) this.getOutputFormats;
                arrow.core.Either either9 = (arrow.core.Either) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                z = false;
                z2 = true;
                either = either9;
                i2 = i11;
                obj2 = null;
                Camera2StreamConfigurationMap = obj;
                this.getOutputMinFrameDurationlomOqCM = flowCollector4;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = getAccountSettingsUseCase;
                this.getInputFormats = accountSettingsStrings;
                this.getHighSpeedVideoSizesFor = accountSettingsData;
                this.getOutputMinFrameDuration = person;
                this.getInputSizeshNQ4ISI = obj2;
                this.getHighSpeedVideoFpsRanges = i2;
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getOutputSizeshNQ4ISI = 6;
                if (flowCollector.emit(Camera2StreamConfigurationMap, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                i = this.getHighSpeedVideoFpsRangesFor;
                i6 = this.getHighSpeedVideoFpsRanges;
                person3 = (com.paypal.oslo.core.i18n.domain.model.NameInput.Person) this.getOutputMinFrameDuration;
                accountSettingsData4 = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings5 = (com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings) this.getInputFormats;
                com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase6 = (com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase) this.getOutputFormats;
                either3 = (arrow.core.Either) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                z = false;
                z3 = true;
                accountSettingsStrings = accountSettingsStrings5;
                getAccountSettingsUseCase3 = getAccountSettingsUseCase6;
                nameFormatUseCase = getAccountSettingsUseCase3.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person62 = new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person((com.paypal.oslo.core.i18n.domain.model.NameStyle) null, (java.lang.String) null, (com.paypal.oslo.core.i18n.domain.model.PersonType) null, (com.paypal.oslo.core.i18n.domain.model.FormatOptions) null, (java.util.Locale) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                this.getOutputMinFrameDurationlomOqCM = flowCollector4;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                this.getOutputFormats = getAccountSettingsUseCase3;
                this.getInputFormats = accountSettingsStrings;
                this.getHighSpeedVideoSizesFor = accountSettingsData4;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person3);
                this.getHighSpeedVideoFpsRanges = i6;
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getOutputSizeshNQ4ISI = 7;
                invoke = nameFormatUseCase.invoke(person3, person62, this);
                r19 = z3;
                break;
            case 7:
                i = this.getHighSpeedVideoFpsRangesFor;
                i6 = this.getHighSpeedVideoFpsRanges;
                person3 = (com.paypal.oslo.core.i18n.domain.model.NameInput.Person) this.getOutputMinFrameDuration;
                accountSettingsData4 = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) this.getHighSpeedVideoSizesFor;
                accountSettingsStrings = (com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings) this.getInputFormats;
                getAccountSettingsUseCase3 = (com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase) this.getOutputFormats;
                either3 = (arrow.core.Either) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                z = false;
                r19 = 1;
                invoke = obj;
                arrow.core.Either either10 = (arrow.core.Either) invoke;
                if (either10 instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.NameError nameError = (com.paypal.oslo.core.i18n.domain.model.NameError) ((arrow.core.Either.Left) either10).getValue();
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.settings.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(nameError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    com.paypal.android.logger.Logger.d$default(logger2, "Name formatting failed, using fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, 4, null);
                    value = accountSettingsData4.getProfileName().getValue();
                } else {
                    if (!(either10 instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    value = ((arrow.core.Either.Right) either10).getValue();
                }
                java.lang.String str3 = (java.lang.String) value;
                java.lang.String str4 = str3;
                if (kotlin.text.StringsKt.isBlank(str4)) {
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.settings.LoggerKt.log;
                    com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileLoading2 = com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getProfileLoading();
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[6];
                    obj4 = coroutine_suspended;
                    pairArr2[0] = kotlin.TuplesKt.to("formatted_name_empty", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(str4.length() == 0 ? r19 : z));
                    pairArr2[r19] = kotlin.TuplesKt.to("formatted_name_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.text.StringsKt.isBlank(str4)));
                    pairArr2[2] = kotlin.TuplesKt.to("formatted_name_length", kotlin.coroutines.jvm.internal.Boxing.boxInt(str3.length()));
                    pairArr2[3] = kotlin.TuplesKt.to("profile_name_value_empty", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(accountSettingsData4.getProfileName().getValue().length() == 0 ? r19 : false));
                    pairArr2[4] = kotlin.TuplesKt.to("profile_name_value_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.text.StringsKt.isBlank(accountSettingsData4.getProfileName().getValue())));
                    pairArr2[5] = kotlin.TuplesKt.to("profile_name_value_length", kotlin.coroutines.jvm.internal.Boxing.boxInt(accountSettingsData4.getProfileName().getValue().length()));
                    com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(logger3, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(profileLoading2, "Formatted name is blank after i18n formatting", "name_blank_after_i18n", kotlin.collections.MapsKt.mapOf(pairArr2), null, 8, null));
                } else {
                    obj4 = coroutine_suspended;
                }
                iSettingsRepository2 = getAccountSettingsUseCase3.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputMinFrameDurationlomOqCM = flowCollector4;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                this.getOutputFormats = getAccountSettingsUseCase3;
                this.getInputFormats = accountSettingsStrings;
                this.getHighSpeedVideoSizesFor = accountSettingsData4;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person3);
                this.getInputSizeshNQ4ISI = str3;
                this.getHighSpeedVideoFpsRanges = i6;
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getOutputSizeshNQ4ISI = 8;
                accountDiscoverabilityStatus2 = iSettingsRepository2.getAccountDiscoverabilityStatus(this);
                coroutine_suspended = obj4;
                if (accountDiscoverabilityStatus2 != coroutine_suspended) {
                    accountSettingsData5 = accountSettingsData4;
                    getAccountSettingsUseCase4 = getAccountSettingsUseCase3;
                    either4 = either3;
                    i7 = i6;
                    person4 = person3;
                    accountSettingsStrings3 = accountSettingsStrings;
                    str = str3;
                    java.lang.Boolean bool4 = (java.lang.Boolean) accountDiscoverabilityStatus2;
                    this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either4);
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData5);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person4);
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    this.getOutputMinFrameDuration = flowCollector4;
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool4);
                    this.getHighSpeedVideoFpsRanges = i7;
                    this.getHighSpeedVideoFpsRangesFor = i;
                    this.getOutputSizeshNQ4ISI = 9;
                    Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(accountSettingsData5, accountSettingsStrings3, getAccountSettingsUseCase4, str, bool4, this);
                    if (Camera2StreamConfigurationMap3 != coroutine_suspended) {
                        flowCollector3 = flowCollector4;
                        str2 = str;
                        person5 = person4;
                        either5 = either4;
                        bool2 = bool4;
                        this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either5);
                        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData5);
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person5);
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool2);
                        this.getInputSizeshNQ4ISI = null;
                        this.getHighSpeedVideoFpsRanges = i7;
                        this.getHighSpeedVideoFpsRangesFor = i;
                        this.getOutputSizeshNQ4ISI = 10;
                        break;
                    }
                }
                return coroutine_suspended;
            case 8:
                i = this.getHighSpeedVideoFpsRangesFor;
                int i12 = this.getHighSpeedVideoFpsRanges;
                java.lang.String str5 = (java.lang.String) this.getInputSizeshNQ4ISI;
                com.paypal.oslo.core.i18n.domain.model.NameInput.Person person8 = (com.paypal.oslo.core.i18n.domain.model.NameInput.Person) this.getOutputMinFrameDuration;
                com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData7 = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings6 = (com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings) this.getInputFormats;
                com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase7 = (com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase) this.getOutputFormats;
                arrow.core.Either either11 = (arrow.core.Either) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                person4 = person8;
                accountSettingsData5 = accountSettingsData7;
                getAccountSettingsUseCase4 = getAccountSettingsUseCase7;
                either4 = either11;
                i7 = i12;
                str = str5;
                accountSettingsStrings3 = accountSettingsStrings6;
                accountDiscoverabilityStatus2 = obj;
                java.lang.Boolean bool42 = (java.lang.Boolean) accountDiscoverabilityStatus2;
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either4);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData5);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person4);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getOutputMinFrameDuration = flowCollector4;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool42);
                this.getHighSpeedVideoFpsRanges = i7;
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getOutputSizeshNQ4ISI = 9;
                Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(accountSettingsData5, accountSettingsStrings3, getAccountSettingsUseCase4, str, bool42, this);
                if (Camera2StreamConfigurationMap3 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 9:
                i = this.getHighSpeedVideoFpsRangesFor;
                int i13 = this.getHighSpeedVideoFpsRanges;
                bool2 = (java.lang.Boolean) this.getInputSizeshNQ4ISI;
                flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
                str2 = (java.lang.String) this.getHighSpeedVideoSizesFor;
                person5 = (com.paypal.oslo.core.i18n.domain.model.NameInput.Person) this.getInputFormats;
                com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData8 = (com.paypal.oslo.feature.settings.domain.model.AccountSettingsData) this.getOutputFormats;
                either5 = (arrow.core.Either) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                accountSettingsData5 = accountSettingsData8;
                i7 = i13;
                Camera2StreamConfigurationMap3 = obj;
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either6);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either5);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData5);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person5);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool2);
                this.getInputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = i7;
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getOutputSizeshNQ4ISI = 10;
                break;
            case 10:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 11:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8 A[Catch: all -> 0x004f, RaiseCancellationException -> 0x0052, TryCatch #3 {RaiseCancellationException -> 0x0052, all -> 0x004f, blocks: (B:11:0x004b, B:12:0x00ae, B:17:0x00b8, B:18:0x00d7, B:23:0x00c5, B:24:0x00e2, B:25:0x00e7, B:26:0x00e8, B:27:0x00f8), top: B:10:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData, com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings, com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase, java.lang.String str, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> continuation) {
        com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1$2$buildSection$1 getAccountSettingsUseCase$invoke$1$2$buildSection$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration;
        com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData;
        if (continuation instanceof com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1$2$buildSection$1) {
            getAccountSettingsUseCase$invoke$1$2$buildSection$1 = (com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1$2$buildSection$1) continuation;
            if ((getAccountSettingsUseCase$invoke$1$2$buildSection$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                getAccountSettingsUseCase$invoke$1$2$buildSection$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1$2$buildSection$1 getAccountSettingsUseCase$invoke$1$2$buildSection$12 = getAccountSettingsUseCase$invoke$1$2$buildSection$1;
                java.lang.Object obj = getAccountSettingsUseCase$invoke$1$2$buildSection$12.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAccountSettingsUseCase$invoke$1$2$buildSection$12.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper accountSettingsDataMapper = com.paypal.oslo.feature.settings.domain.mapper.accountsettings.AccountSettingsDataMapper.INSTANCE;
                        settingsDynamicConfiguration = getAccountSettingsUseCase.getHighSpeedVideoSizes;
                        formatAddressUseCase = getAccountSettingsUseCase.getHighSpeedVideoFpsRangesFor;
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsData);
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSettingsStrings);
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getAccountSettingsUseCase);
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoSizesFor = defaultRaise;
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getOutputStallDurationlomOqCM = defaultRaise3;
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoSizes = 0;
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoFpsRangesFor = 0;
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.Camera2StreamConfigurationMap = 0;
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoFpsRanges = 0;
                        getAccountSettingsUseCase$invoke$1$2$buildSection$12.getOutputMinFrameDurationlomOqCM = 1;
                        java.lang.Object map = accountSettingsDataMapper.map(accountSettingsData, accountSettingsStrings, settingsDynamicConfiguration, formatAddressUseCase, str, bool, getAccountSettingsUseCase$invoke$1$2$buildSection$12);
                        if (map == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = map;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoFpsRanges;
                    int i3 = getAccountSettingsUseCase$invoke$1$2$buildSection$12.Camera2StreamConfigurationMap;
                    int i4 = getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) getAccountSettingsUseCase$invoke$1$2$buildSection$12.getOutputStallDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) getAccountSettingsUseCase$invoke$1$2$buildSection$12.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    raise.raise((com.paypal.oslo.feature.settings.domain.error.SettingsError) ((arrow.core.Ior.Left) ior).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    settingsSectionUiData = (com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData) ((arrow.core.Ior.Right) ior).getValue();
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    settingsSectionUiData = (com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData) ((arrow.core.Ior.Both) ior).getRightValue();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(settingsSectionUiData);
            }
        }
        getAccountSettingsUseCase$invoke$1$2$buildSection$1 = new com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1$2$buildSection$1(continuation);
        com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1$2$buildSection$1 getAccountSettingsUseCase$invoke$1$2$buildSection$122 = getAccountSettingsUseCase$invoke$1$2$buildSection$1;
        java.lang.Object obj2 = getAccountSettingsUseCase$invoke$1$2$buildSection$122.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAccountSettingsUseCase$invoke$1$2$buildSection$122.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> flowCollector, arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.AccountSettingsData> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1 getAccountSettingsUseCase$invoke$1 = new com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1(this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        getAccountSettingsUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = flowCollector;
        getAccountSettingsUseCase$invoke$1.Camera2StreamConfigurationMap = either;
        return getAccountSettingsUseCase$invoke$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAccountSettingsUseCase$invoke$1(com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase getAccountSettingsUseCase, com.paypal.oslo.feature.settings.domain.util.AccountSettingsStrings accountSettingsStrings, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1> continuation) {
        super(3, continuation);
        this.getOutputStallDuration = getAccountSettingsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = accountSettingsStrings;
    }
}
