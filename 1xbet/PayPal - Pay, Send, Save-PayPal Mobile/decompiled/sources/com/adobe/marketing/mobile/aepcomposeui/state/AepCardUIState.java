package com.adobe.marketing.mobile.aepcomposeui.state;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "", "", "dismissed", "displayed", "<init>", "(ZZ)V", "Z", "getDismissed", "()Z", "getDisplayed"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class AepCardUIState {
    public static final int $stable = 0;
    private final boolean dismissed;
    private final boolean displayed;

    public AepCardUIState(boolean z, boolean z2) {
        this.dismissed = z;
        this.displayed = z2;
    }

    public boolean getDismissed() {
        return this.dismissed;
    }

    public boolean getDisplayed() {
        return this.displayed;
    }
}
