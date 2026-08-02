package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;", "nameFormatUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;)V", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME, "", "formatName", "(Lcom/paypal/oslo/core/i18n/domain/model/PersonName;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "formattedName", "Lkotlinx/coroutines/flow/StateFlow;", "getFormattedName", "()Lkotlinx/coroutines/flow/StateFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameViewDisplayComponentViewModel extends androidx.view.ViewModel {
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> formattedName;
    private final com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.i18n.domain.model.PersonName> getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public NameViewDisplayComponentViewModel(com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameFormatUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = nameFormatUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.i18n.domain.model.PersonName> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.formattedName = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.mapLatest(MutableStateFlow, new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formattedName$1(this, null)), androidx.view.ViewModelKt.getViewModelScope(this), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), "");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$formatNameWithFallback(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel, com.paypal.oslo.core.i18n.domain.model.PersonName personName, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formatNameWithFallback$1 nameViewDisplayComponentViewModel$formatNameWithFallback$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formatNameWithFallback$1) {
            nameViewDisplayComponentViewModel$formatNameWithFallback$1 = (com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formatNameWithFallback$1) continuation;
            if ((nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase = nameViewDisplayComponentViewModel.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.core.i18n.domain.model.NameInput.Person person = new com.paypal.oslo.core.i18n.domain.model.NameInput.Person(personName);
                    com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person2 = new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person((com.paypal.oslo.core.i18n.domain.model.NameStyle) null, (java.lang.String) null, (com.paypal.oslo.core.i18n.domain.model.PersonType) null, (com.paypal.oslo.core.i18n.domain.model.FormatOptions) null, (java.util.Locale) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighSpeedVideoFpsRangesFor = personName;
                    nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighSpeedVideoSizes = 1;
                    obj = nameFormatUseCase.invoke(person, person2, nameViewDisplayComponentViewModel$formatNameWithFallback$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    personName = (com.paypal.oslo.core.i18n.domain.model.PersonName) nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "NameFormatUseCase formatting failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.NameError) ((arrow.core.Either.Left) either).getValue()).getDescription())), null, 4, null);
                    com.paypal.oslo.core.i18n.domain.model.Field[] fieldArr = new com.paypal.oslo.core.i18n.domain.model.Field[4];
                    java.lang.String m11446getGivenNamedfzjkSU = personName.m11446getGivenNamedfzjkSU();
                    fieldArr[0] = m11446getGivenNamedfzjkSU != null ? com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(m11446getGivenNamedfzjkSU) : null;
                    java.lang.String m11447getMiddleName114sck0 = personName.m11447getMiddleName114sck0();
                    fieldArr[1] = m11447getMiddleName114sck0 != null ? com.paypal.oslo.core.i18n.domain.model.MiddleName.m11428boximpl(m11447getMiddleName114sck0) : null;
                    java.lang.String m11449getSurName5MXJos4 = personName.m11449getSurName5MXJos4();
                    fieldArr[2] = m11449getSurName5MXJos4 != null ? com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(m11449getSurName5MXJos4) : null;
                    java.lang.String m11448getSecondSurnamedtlYlO0 = personName.m11448getSecondSurnamedtlYlO0();
                    fieldArr[3] = m11448getSecondSurnamedtlYlO0 != null ? com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11477boximpl(m11448getSecondSurnamedtlYlO0) : null;
                    return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) fieldArr), " ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel.m17053$r8$lambda$VNnPuozNDhEBvCRjxquqWeSenM((com.paypal.oslo.core.i18n.domain.model.Field) obj2);
                        }
                    }, 30, null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        nameViewDisplayComponentViewModel$formatNameWithFallback$1 = new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel$formatNameWithFallback$1(nameViewDisplayComponentViewModel, continuation);
        java.lang.Object obj2 = nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nameViewDisplayComponentViewModel$formatNameWithFallback$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getFormattedName() {
        return this.formattedName;
    }

    public final void formatName(com.paypal.oslo.core.i18n.domain.model.PersonName personName) {
        this.getHighSpeedVideoSizes.setValue(personName);
    }

    /* renamed from: $r8$lambda$VNnPuozNDhEBvCRjxquq-WeSenM, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m17053$r8$lambda$VNnPuozNDhEBvCRjxquqWeSenM(com.paypal.oslo.core.i18n.domain.model.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        return field.getValue();
    }
}
