package com.paypal.oslo.feature.home.ui.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotProviderImpl;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel$Factory;", "viewModelFactory", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel$Factory;)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "includedTypes", "", "Render", "(Landroidx/compose/ui/Modifier;Ljava/util/Set;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotViewModel$Factory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSnapshotProviderImpl implements com.paypal.oslo.feature.home.api.AccountSnapshotProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AccountSnapshotProviderImpl(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = factory;
    }

    @Override // com.paypal.oslo.feature.home.api.AccountSnapshotProvider
    public final void Render(androidx.compose.ui.Modifier modifier, java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(1287875126);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1287875126, i, -1, "com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl.Render (AccountSnapshotProviderImpl.kt:62)");
        }
        com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt.AccountSnapshotSection(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, modifier, set, composer, (i << 6) & 8064, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
