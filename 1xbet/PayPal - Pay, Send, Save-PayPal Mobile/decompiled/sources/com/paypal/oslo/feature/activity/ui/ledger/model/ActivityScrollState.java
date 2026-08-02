package com.paypal.oslo.feature.activity.ui.ledger.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityScrollState;", "", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityScrollState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityScrollState {
    public static final int $stable = 0;
    private final int firstVisibleItemIndex;
    private final int firstVisibleItemScrollOffset;

    public ActivityScrollState(int i, int i2) {
        this.firstVisibleItemIndex = i;
        this.firstVisibleItemScrollOffset = i2;
    }

    public /* synthetic */ ActivityScrollState(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFirstVisibleItemIndex() {
        return this.firstVisibleItemIndex;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    public final java.lang.String toString() {
        int i = this.firstVisibleItemIndex;
        int i2 = this.firstVisibleItemScrollOffset;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityScrollState(firstVisibleItemIndex=");
        sb.append(i);
        sb.append(", firstVisibleItemScrollOffset=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.firstVisibleItemIndex) * 31) + java.lang.Integer.hashCode(this.firstVisibleItemScrollOffset);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState activityScrollState = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState) other;
        return this.firstVisibleItemIndex == activityScrollState.firstVisibleItemIndex && this.firstVisibleItemScrollOffset == activityScrollState.firstVisibleItemScrollOffset;
    }

    public final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState copy(int firstVisibleItemIndex, int firstVisibleItemScrollOffset) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState(firstVisibleItemIndex, firstVisibleItemScrollOffset);
    }

    /* renamed from: component2, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    /* renamed from: component1, reason: from getter */
    public final int getFirstVisibleItemIndex() {
        return this.firstVisibleItemIndex;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState activityScrollState, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = activityScrollState.firstVisibleItemIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = activityScrollState.firstVisibleItemScrollOffset;
        }
        return activityScrollState.copy(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActivityScrollState() {
        this(r2, r2, 3, null);
        int i = 0;
    }
}
