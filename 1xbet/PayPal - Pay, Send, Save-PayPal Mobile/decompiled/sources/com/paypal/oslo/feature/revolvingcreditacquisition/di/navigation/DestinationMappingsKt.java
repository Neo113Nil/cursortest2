package com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\bH\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/ApplicationLandingDestination;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "toLandingNavigationArgs", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/ApplicationLandingDestination;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCUSAcquisitionExternalDestination;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCUSAcquisitionExternalDestination;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DirectApplication;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DirectApplication;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DocumentUpload;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DocumentUpload;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$ApplicationDecline;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$ApplicationDecline;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCTermsWebViewDestination;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;", "toWebViewNavigationArgs", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCTermsWebViewDestination;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionWebViewNavigationArgs;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DestinationMappingsKt {
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs toLandingNavigationArgs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination applicationLandingDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLandingDestination, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs(applicationLandingDestination.getCreditProductIdentifier(), applicationLandingDestination.getWebUrl(), applicationLandingDestination.getSource());
    }

    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs toLandingNavigationArgs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination cBMCAcquisitionExternalDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cBMCAcquisitionExternalDestination, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs(cBMCAcquisitionExternalDestination.getCreditProductIdentifier(), cBMCAcquisitionExternalDestination.getUrl(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs toLandingNavigationArgs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination pPCCUSAcquisitionExternalDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pPCCUSAcquisitionExternalDestination, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs(pPCCUSAcquisitionExternalDestination.getCreditProductIdentifier(), pPCCUSAcquisitionExternalDestination.getUrl(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs toLandingNavigationArgs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication directApplication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directApplication, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs(directApplication.getCpi(), directApplication.getUrl(), directApplication.getSource());
    }

    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs toLandingNavigationArgs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload documentUpload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentUpload, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs(documentUpload.getCpi(), documentUpload.getUrl(), documentUpload.getSource());
    }

    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs toLandingNavigationArgs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline applicationDecline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationDecline, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs(applicationDecline.getCpi(), applicationDecline.getUrl(), applicationDecline.getSource());
    }

    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs toWebViewNavigationArgs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination pPCCTermsWebViewDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pPCCTermsWebViewDestination, "");
        com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier = com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US;
        java.lang.String path = pPCCTermsWebViewDestination.getPath();
        if (path == null) {
            path = com.paypal.oslo.feature.revolvingcreditacquisition.api.model.WebUrlConstants.PPCC_TERMS;
        }
        java.lang.String source = pPCCTermsWebViewDestination.getSource();
        if (source == null) {
            source = com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL;
        }
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionWebViewNavigationArgs(creditProductIdentifier, path, source, false);
    }
}
