package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ClickableTextSegment;", "", "", "textResId", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(ILandroidx/navigation3/runtime/NavKey;)V", "component1", "()I", "component2", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(ILandroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ClickableTextSegment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTextResId", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ClickableTextSegment {
    public static final int $stable = 8;
    private final androidx.navigation3.runtime.NavKey destination;
    private final int textResId;

    public ClickableTextSegment(int i, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        this.textResId = i;
        this.destination = navKey;
    }

    public final int getTextResId() {
        return this.textResId;
    }

    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    public final java.lang.String toString() {
        int i = this.textResId;
        androidx.navigation3.runtime.NavKey navKey = this.destination;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClickableTextSegment(textResId=");
        sb.append(i);
        sb.append(", destination=");
        sb.append(navKey);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.textResId) * 31) + this.destination.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment clickableTextSegment = (com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment) other;
        return this.textResId == clickableTextSegment.textResId && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, clickableTextSegment.destination);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment copy(int textResId, androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment(textResId, destination);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getDestination() {
        return this.destination;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextResId() {
        return this.textResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment clickableTextSegment, int i, androidx.navigation3.runtime.NavKey navKey, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = clickableTextSegment.textResId;
        }
        if ((i2 & 2) != 0) {
            navKey = clickableTextSegment.destination;
        }
        return clickableTextSegment.copy(i, navKey);
    }
}
