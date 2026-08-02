package com.paypal.oslo.feature.wallet.cards.ui.add.success;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardErrorRefreshSectionState;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "text", "Lkotlin/Function0;", "", "onRefresh", "", "showRefreshButton", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lkotlin/jvm/functions/Function0;Z)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lkotlin/jvm/functions/Function0;Z)Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardErrorRefreshSectionState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getText", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "Z", "getShowRefreshButton"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RewardErrorRefreshSectionState {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh;
    private final boolean showRefreshButton;
    private final com.paypal.oslo.core.commonui.utils.RefText text;

    public RewardErrorRefreshSectionState(com.paypal.oslo.core.commonui.utils.RefText refText, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.text = refText;
        this.onRefresh = function0;
        this.showRefreshButton = z;
    }

    public /* synthetic */ RewardErrorRefreshSectionState(com.paypal.oslo.core.commonui.utils.RefText refText, kotlin.jvm.functions.Function0 function0, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(refText, function0, (i & 4) != 0 ? false : z);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public final boolean getShowRefreshButton() {
        return this.showRefreshButton;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onRefresh;
        boolean z = this.showRefreshButton;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardErrorRefreshSectionState(text=");
        sb.append(refText);
        sb.append(", onRefresh=");
        sb.append(function0);
        sb.append(", showRefreshButton=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.text.hashCode() * 31) + this.onRefresh.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showRefreshButton);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState rewardErrorRefreshSectionState = (com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, rewardErrorRefreshSectionState.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRefresh, rewardErrorRefreshSectionState.onRefresh) && this.showRefreshButton == rewardErrorRefreshSectionState.showRefreshButton;
    }

    public final com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState copy(com.paypal.oslo.core.commonui.utils.RefText text, kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, boolean showRefreshButton) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRefresh, "");
        return new com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState(text, onRefresh, showRefreshButton);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowRefreshButton() {
        return this.showRefreshButton;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onRefresh;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState copy$default(com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState rewardErrorRefreshSectionState, com.paypal.oslo.core.commonui.utils.RefText refText, kotlin.jvm.functions.Function0 function0, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = rewardErrorRefreshSectionState.text;
        }
        if ((i & 2) != 0) {
            function0 = rewardErrorRefreshSectionState.onRefresh;
        }
        if ((i & 4) != 0) {
            z = rewardErrorRefreshSectionState.showRefreshButton;
        }
        return rewardErrorRefreshSectionState.copy(refText, function0, z);
    }
}
