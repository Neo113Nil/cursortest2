package com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "toNameErrorMessage", "(Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;Landroid/content/Context;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "", "InvalidNameCharacters", "Ljava/lang/String;", "InvalidNameFormat"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameContextualErrorMapperKt {
    public static final java.lang.String InvalidNameCharacters = "INVALID_NAME_CHARACTERS";
    public static final java.lang.String InvalidNameFormat = "INVALID_NAME_FORMAT";

    public static final com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage toNameErrorMessage(com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String issue = contextualInfo.getIssue();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(issue, InvalidNameCharacters) && !kotlin.jvm.internal.Intrinsics.areEqual(issue, InvalidNameFormat)) {
            return null;
        }
        java.lang.String string = context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_invalid_character_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(string, null, 2, null);
    }
}
