package com.paypal.oslo.feature.savings.domain.util;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/util/GoalsFieldValidator;", "", "Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;", "fetchGoalsUseCase", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;)V", "", "goalName", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "validateGoalName", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "targetAmount", "originalTargetAmount", "validateTargetAmount", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalValidationError;", "excludeGoalId", "", "isDuplicateGoalName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GoalsFieldValidator {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GoalsFieldValidator(com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchGoalsUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fetchGoalsUseCase;
    }

    public final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validateGoalName(java.lang.String goalName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalName, "");
        if (kotlin.text.StringsKt.isBlank(kotlin.text.StringsKt.trim(goalName).toString())) {
            return com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.EmptyGoalName.INSTANCE;
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validateTargetAmount$default(com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return goalsFieldValidator.validateTargetAmount(str, str2);
    }

    public static /* synthetic */ java.lang.Object isDuplicateGoalName$default(com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator goalsFieldValidator, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return goalsFieldValidator.isDuplicateGoalName(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isDuplicateGoalName(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator$isDuplicateGoalName$1 goalsFieldValidator$isDuplicateGoalName$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator$isDuplicateGoalName$1) {
            goalsFieldValidator$isDuplicateGoalName$1 = (com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator$isDuplicateGoalName$1) continuation;
            if ((goalsFieldValidator$isDuplicateGoalName$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                goalsFieldValidator$isDuplicateGoalName$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator$isDuplicateGoalName$1 goalsFieldValidator$isDuplicateGoalName$12 = goalsFieldValidator$isDuplicateGoalName$1;
                java.lang.Object obj = goalsFieldValidator$isDuplicateGoalName$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = goalsFieldValidator$isDuplicateGoalName$12.getHighSpeedVideoSizes;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    goalsFieldValidator$isDuplicateGoalName$12.getHighResolutionOutputSizeshNQ4ISI = str;
                    goalsFieldValidator$isDuplicateGoalName$12.Camera2StreamConfigurationMap = str2;
                    goalsFieldValidator$isDuplicateGoalName$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase.invoke$default(fetchGoalsUseCase, null, false, goalsFieldValidator$isDuplicateGoalName$12, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) goalsFieldValidator$isDuplicateGoalName$12.Camera2StreamConfigurationMap;
                    str = (java.lang.String) goalsFieldValidator$isDuplicateGoalName$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    java.lang.String obj2 = kotlin.text.StringsKt.trim(str).toString();
                    java.util.Locale locale = java.util.Locale.getDefault();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String lowerCase = obj2.toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list2 = list;
                    if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                        for (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO : list2) {
                            if (str2 == null || !kotlin.jvm.internal.Intrinsics.areEqual(goalSummaryDTO.getId(), str2)) {
                                java.lang.String obj3 = kotlin.text.StringsKt.trim(goalSummaryDTO.getTitle()).toString();
                                java.util.Locale locale2 = java.util.Locale.getDefault();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                                java.lang.String lowerCase2 = obj3.toLowerCase(locale2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                                if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase2, lowerCase)) {
                                    break;
                                }
                            }
                        }
                    }
                    z = false;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        goalsFieldValidator$isDuplicateGoalName$1 = new com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator$isDuplicateGoalName$1(this, continuation);
        com.paypal.oslo.feature.savings.domain.util.GoalsFieldValidator$isDuplicateGoalName$1 goalsFieldValidator$isDuplicateGoalName$122 = goalsFieldValidator$isDuplicateGoalName$1;
        java.lang.Object obj4 = goalsFieldValidator$isDuplicateGoalName$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = goalsFieldValidator$isDuplicateGoalName$122.getHighSpeedVideoSizes;
        boolean z2 = true;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj4;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError validateTargetAmount(java.lang.String targetAmount, java.lang.String originalTargetAmount) {
        java.lang.Double doubleOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        if (originalTargetAmount != null && ((doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(originalTargetAmount)) == null || doubleOrNull.doubleValue() <= 0.0d)) {
            return null;
        }
        java.lang.String obj = kotlin.text.StringsKt.trim(targetAmount).toString();
        double longValue = (kotlin.text.StringsKt.toLongOrNull(obj) != null ? r1.longValue() : 0L) / 100.0d;
        if (!((originalTargetAmount == null) && obj.length() == 0) && (obj.length() == 0 || longValue < 10.0d)) {
            return com.paypal.oslo.feature.savings.domain.model.goals.GoalValidationError.TargetAmountBelowMinimum.INSTANCE;
        }
        return null;
    }
}
