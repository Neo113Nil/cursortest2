package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageSettingsReducerKt {
    public static final /* synthetic */ java.lang.String access$findRelinkReminderDate(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success success, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent> events;
        java.lang.Object obj2;
        java.util.Iterator<T> it = success.getEmailAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj).getProvider() == emailProvider) {
                break;
            }
        }
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLink emailLink = (com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj;
        if (emailLink != null && (events = emailLink.getEvents()) != null) {
            java.util.Iterator<T> it2 = events.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent emailLinkEvent = (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent) obj2;
                if (emailLinkEvent.getType() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType.RELINK_REMINDER && kotlin.jvm.internal.Intrinsics.areEqual(emailLinkEvent.getHasActiveReminder(), java.lang.Boolean.TRUE)) {
                    break;
                }
            }
            com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent emailLinkEvent2 = (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent) obj2;
            if (emailLinkEvent2 != null) {
                return emailLinkEvent2.getReminderDateMessage();
            }
        }
        return null;
    }
}
