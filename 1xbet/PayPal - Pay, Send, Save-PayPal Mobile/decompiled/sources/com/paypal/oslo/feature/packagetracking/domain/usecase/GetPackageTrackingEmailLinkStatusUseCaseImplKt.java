package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPackageTrackingEmailLinkStatusUseCaseImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo access$toEmailLinkInfo(com.paypal.oslo.feature.packagetracking.domain.model.EmailLink emailLink) {
        java.lang.String name2 = emailLink.getProvider().name();
        boolean z = true;
        boolean z2 = emailLink.getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED || emailLink.getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED_WITH_INVALID_PERMISSIONS;
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent> events = emailLink.getEvents();
        if (!(events instanceof java.util.Collection) || !events.isEmpty()) {
            for (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent emailLinkEvent : events) {
                if (emailLinkEvent.getType() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType.RELINK_REMINDER && kotlin.jvm.internal.Intrinsics.areEqual(emailLinkEvent.getHasActiveReminder(), java.lang.Boolean.TRUE)) {
                    break;
                }
            }
        }
        z = false;
        return new com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo(name2, z2, z);
    }

    public static final /* synthetic */ java.lang.Exception access$toException(com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError) {
        java.lang.Throwable cause = packageTrackingError.getCause();
        java.lang.Exception exc = cause instanceof java.lang.Exception ? (java.lang.Exception) cause : null;
        return exc == null ? new java.lang.RuntimeException(packageTrackingError.getMessage(), packageTrackingError.getCause()) : exc;
    }
}
