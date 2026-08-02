package com.paypal.oslo.feature.onboarding.signup.ui.validation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroid/content/Context;", "context", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationSuccess;", "validationResults", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "buildValidationAlerts", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "", "showPasswordHints", "buildValidationAlertsWithOptions", "(Landroid/content/Context;Ljava/util/List;Z)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidationUtilsKt {
    public static final java.util.List<com.paypal.pds.components.textinput.ValidationAlert> buildValidationAlerts(android.content.Context context, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return buildValidationAlertsWithOptions(context, list, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        if (r8 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        if (r0.size() <= 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        return kotlin.collections.CollectionsKt.take(r0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
    
        return kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new com.paypal.oslo.feature.onboarding.signup.ui.validation.ValidationUtilsKt$$ExternalSyntheticLambda1(r6, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:1: B:29:0x009d->B:48:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.pds.components.textinput.ValidationAlert> buildValidationAlertsWithOptions(final android.content.Context context, java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list, boolean z) {
        com.paypal.oslo.feature.onboarding.validators.domain.ValidationError validationError;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            final com.paypal.oslo.feature.onboarding.validators.domain.ValidationError validationError2 = null;
            com.paypal.pds.components.textinput.ValidationAlert validationAlert = null;
            if (it.hasNext()) {
                arrow.core.Either either = (arrow.core.Either) it.next();
                if (either instanceof arrow.core.Either.Right) {
                    pair = kotlin.TuplesKt.to(((com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess) ((arrow.core.Either.Right) either).getValue()).getMessageResId(), com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE.invoke(com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.onboarding.validators.domain.ValidationError validationError3 = (com.paypal.oslo.feature.onboarding.validators.domain.ValidationError) ((arrow.core.Either.Left) either).getValue();
                    pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(validationError3.getMessageResId()), com.paypal.oslo.feature.onboarding.validators.ui.ValidatorMapperKt.toAlertStyle(validationError3.getStyle()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.Integer num = (java.lang.Integer) pair.component1();
                final com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle = (com.paypal.pds.components.ContextualAlertStyle) pair.component2();
                if (num != null) {
                    final int intValue = num.intValue();
                    validationAlert = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.validation.ValidationUtilsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.onboarding.signup.ui.validation.ValidationUtilsKt.$r8$lambda$PEnfv5zOhHZgmF89tUckBieNTNE(context, intValue, contextualAlertStyle, (java.lang.String) obj);
                        }
                    });
                }
                if (validationAlert != null) {
                    arrayList.add(validationAlert);
                }
            } else {
                java.util.ArrayList arrayList2 = arrayList;
                java.util.Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    arrow.core.Either either2 = (arrow.core.Either) it2.next();
                    if (either2 instanceof arrow.core.Either.Right) {
                    } else if (either2 instanceof arrow.core.Either.Left) {
                        validationError = (com.paypal.oslo.feature.onboarding.validators.domain.ValidationError) ((arrow.core.Either.Left) either2).getValue();
                        if (validationError.getStyle() == com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle.NEGATIVE) {
                            if (validationError == null) {
                                validationError2 = validationError;
                                break;
                            }
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    validationError = null;
                    if (validationError == null) {
                    }
                }
            }
        }
    }

    /* renamed from: $r8$lambda$2VNx-01I756nThZ3QCyy5QAVCOE, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m16502$r8$lambda$2VNx01I756nThZ3QCyy5QAVCOE(android.content.Context context, com.paypal.oslo.feature.onboarding.validators.domain.ValidationError validationError, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = context.getString(validationError.getMessageResId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(string, com.paypal.oslo.feature.onboarding.validators.ui.ValidatorMapperKt.toAlertStyle(validationError.getStyle()), false, null, null, 28, null);
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$PEnfv5zOhHZgmF89tUckBieNTNE(android.content.Context context, int i, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = context.getString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(string, contextualAlertStyle, false, null, null, 28, null);
    }
}
