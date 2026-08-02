package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetDeeplinkStateSettingsPageUseCase;", "", "<init>", "()V", "", "source", "triggerPoint", "emailProvider", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetDeeplinkStateSettingsPageUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetDeeplinkStateSettingsPageUseCase() {
    }

    public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState invoke(java.lang.String source, java.lang.String triggerPoint, java.lang.String emailProvider) {
        com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink relink;
        java.lang.String str;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider2;
        if (source == null && triggerPoint == null && emailProvider == null) {
            return com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.None.INSTANCE;
        }
        if (!com.paypal.oslo.feature.packagetracking.domain.usecase.DeeplinkUtilsKt.isDeepLinkRelink(triggerPoint) || (str = emailProvider) == null || str.length() == 0 || (emailProvider2 = com.paypal.oslo.feature.packagetracking.domain.usecase.DeeplinkUtilsKt.toEmailProvider(emailProvider)) == null) {
            relink = null;
        } else if (com.paypal.oslo.feature.packagetracking.domain.usecase.DeeplinkUtilsKt.isNativePushReminder(triggerPoint)) {
            relink = new com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush(emailProvider2);
        } else {
            relink = new com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink(emailProvider2, com.paypal.oslo.feature.packagetracking.domain.usecase.DeeplinkUtilsKt.showShouldRelinkBanner(triggerPoint));
        }
        return relink == null ? new com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings(source, triggerPoint, emailProvider) : relink;
    }
}
