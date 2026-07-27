package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QB extends AbstractRunnableC2417Wc {
    public final /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC2461Xx A00;

    public QB(ViewOnSystemUiVisibilityChangeListenerC2461Xx viewOnSystemUiVisibilityChangeListenerC2461Xx) {
        this.A00 = viewOnSystemUiVisibilityChangeListenerC2461Xx;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        this.A00.A02(false);
    }
}
