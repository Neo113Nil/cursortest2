package com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\rH\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\t\u0010\u0012J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\t\u0010\u0014J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\t\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/NativeDestinationResolver;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionDestinationVisitor;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DirectApplication;", "destination", "visit", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DirectApplication;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DocumentUpload;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$DocumentUpload;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$ApplicationDecline;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionInternalDeeplinkDestination$ApplicationDecline;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$DirectApplication;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination$ApplicationBilling;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCUSAcquisitionExternalDestination$DirectApplication;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCUSAcquisitionExternalDestination$DirectApplication;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCUSAcquisitionExternalDestination$ApplicationBilling;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCUSAcquisitionExternalDestination$ApplicationBilling;)V", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/ApplicationLandingDestination;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/ApplicationLandingDestination;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NativeDestinationResolver implements com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor<kotlin.Unit> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

    public NativeDestinationResolver(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination applicationLandingDestination) {
        visit2(applicationLandingDestination);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling) {
        visit2(applicationBilling);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication) {
        visit2(directApplication);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline applicationDecline) {
        visit2(applicationDecline);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication directApplication) {
        visit2(directApplication);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload documentUpload) {
        visit2(documentUpload);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling applicationBilling) {
        visit2(applicationBilling);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestinationVisitor
    public final /* bridge */ /* synthetic */ kotlin.Unit visit(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication directApplication) {
        visit2(directApplication);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    /* renamed from: visit, reason: avoid collision after fix types in other method */
    public final void visit2(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI.navigate(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver$$ExternalSyntheticLambda0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(destination)));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y9wNDxcJYfpwPEn5xAAR_gTPNmA(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination(acquisitionLandingNavigationArgs));
        return kotlin.Unit.INSTANCE;
    }
}
