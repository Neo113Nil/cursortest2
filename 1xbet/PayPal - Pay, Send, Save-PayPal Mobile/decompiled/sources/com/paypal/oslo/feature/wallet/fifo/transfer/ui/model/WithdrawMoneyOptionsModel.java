package com.paypal.oslo.feature.wallet.fifo.transfer.ui.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionsModel;", "", "Lcom/paypal/pds/core/Icon;", "icon", "", "iconDescription", "", "content", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionType;", "type", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;ILcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionType;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionType;", "copy", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;ILcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionType;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionsModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/String;", "getIconDescription", com.visa.cbp.getEncExpo.warmup, "getContent", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyOptionType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WithdrawMoneyOptionsModel {
    public static final int $stable = 0;
    private final int content;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String iconDescription;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType type;

    public WithdrawMoneyOptionsModel(com.paypal.pds.core.Icon icon, java.lang.String str, int i, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType withdrawMoneyOptionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyOptionType, "");
        this.icon = icon;
        this.iconDescription = str;
        this.content = i;
        this.type = withdrawMoneyOptionType;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String getIconDescription() {
        return this.iconDescription;
    }

    public final int getContent() {
        return this.content;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.String str = this.iconDescription;
        int i = this.content;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType withdrawMoneyOptionType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawMoneyOptionsModel(icon=");
        sb.append(icon);
        sb.append(", iconDescription=");
        sb.append(str);
        sb.append(", content=");
        sb.append(i);
        sb.append(", type=");
        sb.append(withdrawMoneyOptionType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.icon.hashCode() * 31) + this.iconDescription.hashCode()) * 31) + java.lang.Integer.hashCode(this.content)) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel withdrawMoneyOptionsModel = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, withdrawMoneyOptionsModel.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconDescription, withdrawMoneyOptionsModel.iconDescription) && this.content == withdrawMoneyOptionsModel.content && this.type == withdrawMoneyOptionsModel.type;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel copy(com.paypal.pds.core.Icon icon, java.lang.String iconDescription, int content, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel(icon, iconDescription, content, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getIconDescription() {
        return this.iconDescription;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel withdrawMoneyOptionsModel, com.paypal.pds.core.Icon icon, java.lang.String str, int i, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType withdrawMoneyOptionType, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            icon = withdrawMoneyOptionsModel.icon;
        }
        if ((i2 & 2) != 0) {
            str = withdrawMoneyOptionsModel.iconDescription;
        }
        if ((i2 & 4) != 0) {
            i = withdrawMoneyOptionsModel.content;
        }
        if ((i2 & 8) != 0) {
            withdrawMoneyOptionType = withdrawMoneyOptionsModel.type;
        }
        return withdrawMoneyOptionsModel.copy(icon, str, i, withdrawMoneyOptionType);
    }
}
