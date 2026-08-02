package com.paypal.oslo.feature.userprofile.ui.utils.email;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailValidator;", "", "<init>", "()V", "", "email", "Landroid/content/Context;", "context", "validateEmailFormat", "(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;", com.visa.cbp.DeviceInfo.valueOf, "current", "", "hasEmailChanged", "(Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmailValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public EmailValidator() {
    }

    public final java.lang.String validateEmailFormat(java.lang.String email, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String str = email;
        if (kotlin.text.StringsKt.isBlank(str) || !android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_enter_a_valid_email_to_continue);
        }
        return null;
    }

    public final boolean hasEmailChanged(java.lang.String original, java.lang.String current) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(original, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
        return !kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(original).toString(), kotlin.text.StringsKt.trim(current).toString());
    }
}
