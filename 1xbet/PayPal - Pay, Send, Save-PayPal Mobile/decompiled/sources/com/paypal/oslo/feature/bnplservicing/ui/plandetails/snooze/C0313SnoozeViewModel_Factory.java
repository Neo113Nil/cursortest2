package com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze;

/* renamed from: com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0313SnoozeViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeReducer> getHighSpeedVideoSizes;

    private C0313SnoozeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel get(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs snoozeHalfSheetArgs) {
        return newInstance(snoozeHalfSheetArgs, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.C0313SnoozeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.C0313SnoozeViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel newInstance(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs snoozeHalfSheetArgs, com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeReducer snoozeReducer, com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase postSnoozeUseCase) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel(snoozeHalfSheetArgs, snoozeReducer, postSnoozeUseCase);
    }
}
