package org.betup.bus;

/* loaded from: classes2.dex */
public class ShowNotEnoughBetcoinsVideoOfferMessage {
    private final long oneClickQuickBetStakeBetcoins;

    public ShowNotEnoughBetcoinsVideoOfferMessage() {
        this(0L);
    }

    public ShowNotEnoughBetcoinsVideoOfferMessage(long oneClickQuickBetStakeBetcoins) {
        this.oneClickQuickBetStakeBetcoins = oneClickQuickBetStakeBetcoins;
    }

    public long getOneClickQuickBetStakeBetcoins() {
        return this.oneClickQuickBetStakeBetcoins;
    }
}
