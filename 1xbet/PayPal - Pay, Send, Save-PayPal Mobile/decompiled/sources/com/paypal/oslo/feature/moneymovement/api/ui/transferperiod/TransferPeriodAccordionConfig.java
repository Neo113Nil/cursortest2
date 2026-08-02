package com.paypal.oslo.feature.moneymovement.api.ui.transferperiod;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;", "", "", "label", "", "showChevron", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Z", "getShowChevron", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TransferPeriodAccordionConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig.Companion(null);
    private final java.lang.String label;
    private final boolean showChevron;

    public TransferPeriodAccordionConfig(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.label = str;
        this.showChevron = z;
    }

    public /* synthetic */ TransferPeriodAccordionConfig(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Transfer period" : str, (i & 2) != 0 ? true : z);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final boolean getShowChevron() {
        return this.showChevron;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;", "standard", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferPeriodAccordionConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig standard() {
            return new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig(null, false, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        boolean z = this.showChevron;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferPeriodAccordionConfig(label=");
        sb.append(str);
        sb.append(", showChevron=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.label.hashCode() * 31) + java.lang.Boolean.hashCode(this.showChevron);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig transferPeriodAccordionConfig = (com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, transferPeriodAccordionConfig.label) && this.showChevron == transferPeriodAccordionConfig.showChevron;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig copy(java.lang.String label, boolean showChevron) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig(label, showChevron);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowChevron() {
        return this.showChevron;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig copy$default(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferPeriodAccordionConfig transferPeriodAccordionConfig, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = transferPeriodAccordionConfig.label;
        }
        if ((i & 2) != 0) {
            z = transferPeriodAccordionConfig.showChevron;
        }
        return transferPeriodAccordionConfig.copy(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferPeriodAccordionConfig() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
