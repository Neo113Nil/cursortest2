package com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze;

/* loaded from: classes11.dex */
public final class SnoozeViewModel_Factory_Impl implements com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel.Factory {
    private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.C0313SnoozeViewModel_Factory getHighSpeedVideoSizes;

    private SnoozeViewModel_Factory_Impl(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.C0313SnoozeViewModel_Factory c0313SnoozeViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0313SnoozeViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel.Factory
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel create(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs snoozeHalfSheetArgs) {
        return this.getHighSpeedVideoSizes.get(snoozeHalfSheetArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel.Factory> create(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.C0313SnoozeViewModel_Factory c0313SnoozeViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel_Factory_Impl(c0313SnoozeViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.C0313SnoozeViewModel_Factory c0313SnoozeViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel_Factory_Impl(c0313SnoozeViewModel_Factory));
    }
}
