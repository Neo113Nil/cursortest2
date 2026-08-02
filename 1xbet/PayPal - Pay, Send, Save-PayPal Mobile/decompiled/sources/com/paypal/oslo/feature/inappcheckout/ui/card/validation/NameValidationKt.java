package com.paypal.oslo.feature.inappcheckout.ui.card.validation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0007"}, d2 = {"", "firstName", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Lkotlin/Pair;", "", "validateFirstName", "(Ljava/lang/String;Landroid/content/res/Resources;)Lkotlin/Pair;", "lastName", "validateLastName"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameValidationKt {
    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateFirstName(java.lang.String str, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateEmpty(str, resources, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.NameValidationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.NameValidationKt.$r8$lambda$c7TE9W1oXpIsBgafAG66Z0VxnDI((android.content.res.Resources) obj);
            }
        });
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.String> validateLastName(java.lang.String str, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return com.paypal.oslo.feature.inappcheckout.ui.card.validation.ValidationUtilsKt.validateEmpty(str, resources, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.validation.NameValidationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.ui.card.validation.NameValidationKt.m15491$r8$lambda$3DndmZzWMka2anNLsuuO_nQPww((android.content.res.Resources) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$3DndmZzWMka2anNLsuuO_nQ-Pww, reason: not valid java name */
    public static /* synthetic */ java.lang.String m15491$r8$lambda$3DndmZzWMka2anNLsuuO_nQPww(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_last_name_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$c7TE9W1oXpIsBgafAG66Z0VxnDI(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_first_name_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
