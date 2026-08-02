package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardNavRequestIds;", "", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "cameraScannerRequestId", "addAddressRequestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-QDVFmTU", "()Ljava/lang/String;", "component1", "component2-QDVFmTU", "component2", "copy-UD5iJxM", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardNavRequestIds;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getCameraScannerRequestId-QDVFmTU", "getAddAddressRequestId-QDVFmTU"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddCardNavRequestIds {
    public static final int $stable = 0;
    private final java.lang.String addAddressRequestId;
    private final java.lang.String cameraScannerRequestId;

    private AddCardNavRequestIds(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.cameraScannerRequestId = str;
        this.addAddressRequestId = str2;
    }

    /* renamed from: getCameraScannerRequestId-QDVFmTU, reason: not valid java name */
    public final java.lang.String m21030getCameraScannerRequestIdQDVFmTU() {
        return this.cameraScannerRequestId;
    }

    /* renamed from: getAddAddressRequestId-QDVFmTU, reason: not valid java name */
    public final java.lang.String m21029getAddAddressRequestIdQDVFmTU() {
        return this.addAddressRequestId;
    }

    public final java.lang.String toString() {
        java.lang.String m11591toStringimpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11591toStringimpl(this.cameraScannerRequestId);
        java.lang.String m11591toStringimpl2 = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11591toStringimpl(this.addAddressRequestId);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardNavRequestIds(cameraScannerRequestId=");
        sb.append(m11591toStringimpl);
        sb.append(", addAddressRequestId=");
        sb.append(m11591toStringimpl2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.core.navigation.result.NavResultRequestId.m11590hashCodeimpl(this.cameraScannerRequestId) * 31) + com.paypal.oslo.core.navigation.result.NavResultRequestId.m11590hashCodeimpl(this.addAddressRequestId);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds addCardNavRequestIds = (com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds) other;
        return com.paypal.oslo.core.navigation.result.NavResultRequestId.m11589equalsimpl0(this.cameraScannerRequestId, addCardNavRequestIds.cameraScannerRequestId) && com.paypal.oslo.core.navigation.result.NavResultRequestId.m11589equalsimpl0(this.addAddressRequestId, addCardNavRequestIds.addAddressRequestId);
    }

    /* renamed from: copy-UD5iJxM, reason: not valid java name */
    public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds m21028copyUD5iJxM(java.lang.String cameraScannerRequestId, java.lang.String addAddressRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraScannerRequestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addAddressRequestId, "");
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds(cameraScannerRequestId, addAddressRequestId, null);
    }

    /* renamed from: component2-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAddAddressRequestId() {
        return this.addAddressRequestId;
    }

    /* renamed from: component1-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getCameraScannerRequestId() {
        return this.cameraScannerRequestId;
    }

    /* renamed from: copy-UD5iJxM$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds m21025copyUD5iJxM$default(com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds addCardNavRequestIds, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addCardNavRequestIds.cameraScannerRequestId;
        }
        if ((i & 2) != 0) {
            str2 = addCardNavRequestIds.addAddressRequestId;
        }
        return addCardNavRequestIds.m21028copyUD5iJxM(str, str2);
    }

    public /* synthetic */ AddCardNavRequestIds(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
