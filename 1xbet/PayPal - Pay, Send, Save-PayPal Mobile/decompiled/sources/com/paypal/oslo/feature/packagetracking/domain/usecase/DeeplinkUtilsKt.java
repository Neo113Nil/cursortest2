package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "isDeepLinkRelink", "(Ljava/lang/String;)Z", "showShouldRelinkBanner", "isNativePushReminder", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "toEmailProvider", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeeplinkUtilsKt {
    public static final boolean isDeepLinkRelink(java.lang.String str) {
        if (str == null) {
            return false;
        }
        int hashCode = str.hashCode();
        return hashCode != -1468594000 ? hashCode != -467267595 ? hashCode == 131301094 && str.equals("gmail_reminder_push") : str.equals("gmail_expired_push") : str.equals("resume_email_sync");
    }

    public static final boolean showShouldRelinkBanner(java.lang.String str) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "gmail_expired_push") || kotlin.jvm.internal.Intrinsics.areEqual(str, "resume_email_sync");
    }

    public static final boolean isNativePushReminder(java.lang.String str) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "gmail_reminder_push");
    }

    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider toEmailProvider(java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            str2 = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        } else {
            str2 = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "gmail")) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "outlook")) {
            return com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK;
        }
        return null;
    }
}
