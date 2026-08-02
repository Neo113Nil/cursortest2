package org.betup.ui.fragment.bets.sheet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes4.dex */
public final class BettingSheetDialog_MembersInjector implements MembersInjector<BettingSheetDialog> {
    private final Provider<BetsController> betsSlipControllerProvider;

    public BettingSheetDialog_MembersInjector(Provider<BetsController> betsSlipControllerProvider) {
        this.betsSlipControllerProvider = betsSlipControllerProvider;
    }

    public static MembersInjector<BettingSheetDialog> create(Provider<BetsController> betsSlipControllerProvider) {
        return new BettingSheetDialog_MembersInjector(betsSlipControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BettingSheetDialog instance) {
        injectBetsSlipController(instance, this.betsSlipControllerProvider.get());
    }

    public static void injectBetsSlipController(BettingSheetDialog instance, BetsController betsSlipController) {
        instance.betsSlipController = betsSlipController;
    }
}
