package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationError;", "Lcom/paypal/oslo/feature/oneonboarding/validators/domain/ValidationSuccess;", "validationResults", "", "showHints", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "buildValidationAlertsWithOptions", "(Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidationUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[LOOP:1: B:41:0x00ee->B:68:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.pds.components.textinput.ValidationAlert> buildValidationAlertsWithOptions(java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> list, boolean z, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError validationError;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        composer.startReplaceGroup(1421818234);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1421818234, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator.buildValidationAlertsWithOptions (ValidationUtils.kt:40)");
        }
        if (list.isEmpty()) {
            java.util.List<com.paypal.pds.components.textinput.ValidationAlert> emptyList = kotlin.collections.CollectionsKt.emptyList();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return emptyList;
        }
        composer.startReplaceGroup(567735236);
        java.util.List<? extends arrow.core.Either<com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess>> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            final com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError validationError2 = null;
            com.paypal.pds.components.textinput.ValidationAlert invoke = null;
            if (it.hasNext()) {
                arrow.core.Either either = (arrow.core.Either) it.next();
                if (either instanceof arrow.core.Either.Right) {
                    pair = kotlin.TuplesKt.to(((com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationSuccess) ((arrow.core.Either.Right) either).getValue()).getMessageResId(), com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError validationError3 = (com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError) ((arrow.core.Either.Left) either).getValue();
                    pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(validationError3.getMessageResId()), com.paypal.oslo.feature.oneonboarding.validators.ui.ValidatorMapperKt.toAlertStyle(validationError3.getStyle()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.Integer num = (java.lang.Integer) pair.component1();
                final com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle = (com.paypal.pds.components.ContextualAlertStyle) pair.component2();
                if (num == null) {
                    composer.startReplaceGroup(340175851);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(340175852);
                    final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(num.intValue(), composer, 0);
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed = composer.changed(stringResource);
                    boolean changedInstance = composer.changedInstance(contextualAlertStyle);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator.ValidationUtilsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator.ValidationUtilsKt.m16762$r8$lambda$wfQkaMlICZ7py_kO4Mqpk7A0m8(stringResource, contextualAlertStyle, (java.lang.String) obj);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
                    composer.endReplaceGroup();
                }
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            } else {
                java.util.ArrayList arrayList2 = arrayList;
                composer.endReplaceGroup();
                java.util.Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    arrow.core.Either either2 = (arrow.core.Either) it2.next();
                    if (either2 instanceof arrow.core.Either.Right) {
                    } else if (either2 instanceof arrow.core.Either.Left) {
                        validationError = (com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError) ((arrow.core.Either.Left) either2).getValue();
                        if (validationError.getStyle() == com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationErrorStyle.NEGATIVE) {
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
                if (z && arrayList2.size() > 2) {
                    composer.startReplaceGroup(420809362);
                    composer.endReplaceGroup();
                    arrayList2 = kotlin.collections.CollectionsKt.take(arrayList2, 2);
                } else if (validationError2 != null) {
                    composer.startReplaceGroup(420963773);
                    final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(validationError2.getMessageResId(), composer, 0);
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion2 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed2 = composer.changed(stringResource2);
                    boolean changed3 = composer.changed(validationError2);
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator.ValidationUtilsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.password.validator.ValidationUtilsKt.$r8$lambda$btcwFkdeVdy47haPiOuCe5cZZrI(stringResource2, validationError2, (java.lang.String) obj);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    arrayList2 = kotlin.collections.CollectionsKt.listOf(companion2.invoke((kotlin.jvm.functions.Function1) rememberedValue2));
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(567780867);
                    composer.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return arrayList2;
            }
        }
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$btcwFkdeVdy47haPiOuCe5cZZrI(java.lang.String str, com.paypal.oslo.feature.oneonboarding.validators.domain.ValidationError validationError, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.oslo.feature.oneonboarding.validators.ui.ValidatorMapperKt.toAlertStyle(validationError.getStyle()), false, null, null, 28, null);
    }

    /* renamed from: $r8$lambda$wfQkaMlI-CZ7py_kO4Mqpk7A0m8, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m16762$r8$lambda$wfQkaMlICZ7py_kO4Mqpk7A0m8(java.lang.String str, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, contextualAlertStyle, false, null, null, 28, null);
    }
}
