package com.adobe.marketing.mobile.aepcomposeui.state;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/state/ImageOnlyCardUIState;", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "", "dismissed", "displayed", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/adobe/marketing/mobile/aepcomposeui/state/ImageOnlyCardUIState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getDismissed", "getDisplayed"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ImageOnlyCardUIState extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState {
    public static final int $stable = 0;
    private final boolean dismissed;
    private final boolean displayed;

    public /* synthetic */ ImageOnlyCardUIState(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    @Override // com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState
    public final boolean getDismissed() {
        return this.dismissed;
    }

    @Override // com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState
    public final boolean getDisplayed() {
        return this.displayed;
    }

    public ImageOnlyCardUIState(boolean z, boolean z2) {
        super(z, z2);
        this.dismissed = z;
        this.displayed = z2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageOnlyCardUIState(dismissed=");
        sb.append(this.dismissed);
        sb.append(", displayed=");
        sb.append(this.displayed);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.dismissed;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.displayed;
        return (r0 * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.adobe.marketing.mobile.aepcomposeui.state.ImageOnlyCardUIState)) {
            return false;
        }
        com.adobe.marketing.mobile.aepcomposeui.state.ImageOnlyCardUIState imageOnlyCardUIState = (com.adobe.marketing.mobile.aepcomposeui.state.ImageOnlyCardUIState) other;
        return this.dismissed == imageOnlyCardUIState.dismissed && this.displayed == imageOnlyCardUIState.displayed;
    }

    public final com.adobe.marketing.mobile.aepcomposeui.state.ImageOnlyCardUIState copy(boolean dismissed, boolean displayed) {
        return new com.adobe.marketing.mobile.aepcomposeui.state.ImageOnlyCardUIState(dismissed, displayed);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisplayed() {
        return this.displayed;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDismissed() {
        return this.dismissed;
    }

    public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.state.ImageOnlyCardUIState copy$default(com.adobe.marketing.mobile.aepcomposeui.state.ImageOnlyCardUIState imageOnlyCardUIState, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = imageOnlyCardUIState.dismissed;
        }
        if ((i & 2) != 0) {
            z2 = imageOnlyCardUIState.displayed;
        }
        return imageOnlyCardUIState.copy(z, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageOnlyCardUIState() {
        this(r2, r2, 3, null);
        boolean z = false;
    }
}
