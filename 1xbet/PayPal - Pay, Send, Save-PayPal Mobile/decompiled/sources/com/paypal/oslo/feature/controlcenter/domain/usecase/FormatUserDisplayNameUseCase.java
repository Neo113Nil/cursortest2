package com.paypal.oslo.feature.controlcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/domain/usecase/FormatUserDisplayNameUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;", "nameFormatUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;)V", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "userProfile", "", "invoke", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FormatUserDisplayNameUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FormatUserDisplayNameUseCase(com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameFormatUseCase, "");
        this.getHighSpeedVideoFpsRanges = nameFormatUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase$invoke$1 formatUserDisplayNameUseCase$invoke$1;
        int i;
        int i2;
        com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase$invoke$1) {
            formatUserDisplayNameUseCase$invoke$1 = (com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase$invoke$1) continuation;
            if ((formatUserDisplayNameUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                formatUserDisplayNameUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = formatUserDisplayNameUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatUserDisplayNameUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{userProfile.getGivenName(), userProfile.getMiddleName(), userProfile.getSurname(), userProfile.getSecondSurname()});
                    if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
                        java.util.Iterator it = listOf.iterator();
                        while (it.hasNext()) {
                            if (((java.lang.String) it.next()) != null) {
                                i2 = 0;
                                break;
                            }
                        }
                    }
                    i2 = 1;
                    if (i2 != 0) {
                        return userProfile.getFullName();
                    }
                    java.lang.String givenName = userProfile.getGivenName();
                    java.lang.String m11414constructorimpl = givenName != null ? com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(givenName) : null;
                    java.lang.String middleName = userProfile.getMiddleName();
                    java.lang.String m11429constructorimpl = middleName != null ? com.paypal.oslo.core.i18n.domain.model.MiddleName.m11429constructorimpl(middleName) : null;
                    java.lang.String surname = userProfile.getSurname();
                    java.lang.String m11523constructorimpl = surname != null ? com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl(surname) : null;
                    java.lang.String secondSurname = userProfile.getSecondSurname();
                    com.paypal.oslo.core.i18n.domain.model.NameInput.Person person = new com.paypal.oslo.core.i18n.domain.model.NameInput.Person(new com.paypal.oslo.core.i18n.domain.model.PersonName(m11414constructorimpl, m11429constructorimpl, m11523constructorimpl, secondSurname != null ? com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11478constructorimpl(secondSurname) : null, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person2 = new com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person((com.paypal.oslo.core.i18n.domain.model.NameStyle) null, (java.lang.String) null, (com.paypal.oslo.core.i18n.domain.model.PersonType) null, (com.paypal.oslo.core.i18n.domain.model.FormatOptions) null, (java.util.Locale) null, 31, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    formatUserDisplayNameUseCase$invoke$1.Camera2StreamConfigurationMap = userProfile;
                    formatUserDisplayNameUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(person);
                    formatUserDisplayNameUseCase$invoke$1.getHighSpeedVideoFpsRanges = i2;
                    formatUserDisplayNameUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = this.getHighSpeedVideoFpsRanges.invoke(person, person2, formatUserDisplayNameUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    userProfile2 = userProfile;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = formatUserDisplayNameUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    userProfile2 = (com.paypal.oslo.feature.controlcenter.domain.model.UserProfile) formatUserDisplayNameUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "Name formatting failed, using raw name as fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.NameError) ((arrow.core.Either.Left) either).getValue()).getDescription())), null, 4, null);
                    return userProfile2.getFullName();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        formatUserDisplayNameUseCase$invoke$1 = new com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = formatUserDisplayNameUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatUserDisplayNameUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
