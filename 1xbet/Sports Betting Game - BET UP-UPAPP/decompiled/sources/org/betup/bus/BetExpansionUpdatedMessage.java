package org.betup.bus;

/* loaded from: classes2.dex */
public class BetExpansionUpdatedMessage {
    private final boolean shouldExpand;

    public BetExpansionUpdatedMessage(boolean shouldExpand) {
        this.shouldExpand = shouldExpand;
    }

    public boolean isShouldExpand() {
        return this.shouldExpand;
    }
}
