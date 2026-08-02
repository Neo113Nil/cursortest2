package com.paypal.oslo.feature.wallet.fifo.common.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;", "", "", "screenTitle", "bankTitle", "bankDescription", "cardTitle", "cardDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScreenTitle", "getBankTitle", "getBankDescription", "getCardTitle", "getCardDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddFIConfig {
    public static final int $stable = 0;
    private final java.lang.String bankDescription;
    private final java.lang.String bankTitle;
    private final java.lang.String cardDescription;
    private final java.lang.String cardTitle;
    private final java.lang.String screenTitle;

    public AddFIConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.screenTitle = str;
        this.bankTitle = str2;
        this.bankDescription = str3;
        this.cardTitle = str4;
        this.cardDescription = str5;
    }

    public /* synthetic */ AddFIConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public final java.lang.String getScreenTitle() {
        return this.screenTitle;
    }

    public final java.lang.String getBankTitle() {
        return this.bankTitle;
    }

    public final java.lang.String getBankDescription() {
        return this.bankDescription;
    }

    public final java.lang.String getCardTitle() {
        return this.cardTitle;
    }

    public final java.lang.String getCardDescription() {
        return this.cardDescription;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.screenTitle;
        java.lang.String str2 = this.bankTitle;
        java.lang.String str3 = this.bankDescription;
        java.lang.String str4 = this.cardTitle;
        java.lang.String str5 = this.cardDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFIConfig(screenTitle=");
        sb.append(str);
        sb.append(", bankTitle=");
        sb.append(str2);
        sb.append(", bankDescription=");
        sb.append(str3);
        sb.append(", cardTitle=");
        sb.append(str4);
        sb.append(", cardDescription=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.screenTitle.hashCode() * 31) + this.bankTitle.hashCode()) * 31) + this.bankDescription.hashCode()) * 31) + this.cardTitle.hashCode()) * 31) + this.cardDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig = (com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.screenTitle, addFIConfig.screenTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankTitle, addFIConfig.bankTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankDescription, addFIConfig.bankDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardTitle, addFIConfig.cardTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDescription, addFIConfig.cardDescription);
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig copy(java.lang.String screenTitle, java.lang.String bankTitle, java.lang.String bankDescription, java.lang.String cardTitle, java.lang.String cardDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenTitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankTitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardTitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDescription, "");
        return new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig(screenTitle, bankTitle, bankDescription, cardTitle, cardDescription);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCardDescription() {
        return this.cardDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCardTitle() {
        return this.cardTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBankDescription() {
        return this.bankDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBankTitle() {
        return this.bankTitle;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getScreenTitle() {
        return this.screenTitle;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig copy$default(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addFIConfig.screenTitle;
        }
        if ((i & 2) != 0) {
            str2 = addFIConfig.bankTitle;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = addFIConfig.bankDescription;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = addFIConfig.cardTitle;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = addFIConfig.cardDescription;
        }
        return addFIConfig.copy(str, str6, str7, str8, str5);
    }

    public AddFIConfig() {
        this(null, null, null, null, null, 31, null);
    }
}
