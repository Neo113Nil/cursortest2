package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/zettle/sdk/CardReaderTippingConfiguration;", "", "Lcom/zettle/sdk/ZettleReaderTippingStyle;", "zettleReaderTippingStyle", "Lcom/zettle/sdk/PayPalReaderTippingStyle;", "payPalReaderTippingStyle", "<init>", "(Lcom/zettle/sdk/ZettleReaderTippingStyle;Lcom/zettle/sdk/PayPalReaderTippingStyle;)V", "component1", "()Lcom/zettle/sdk/ZettleReaderTippingStyle;", "component2", "()Lcom/zettle/sdk/PayPalReaderTippingStyle;", "copy", "(Lcom/zettle/sdk/ZettleReaderTippingStyle;Lcom/zettle/sdk/PayPalReaderTippingStyle;)Lcom/zettle/sdk/CardReaderTippingConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/PayPalReaderTippingStyle;", "getPayPalReaderTippingStyle", "Lcom/zettle/sdk/ZettleReaderTippingStyle;", "getZettleReaderTippingStyle"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CardReaderTippingConfiguration {
    private final com.zettle.sdk.PayPalReaderTippingStyle payPalReaderTippingStyle;
    private final com.zettle.sdk.ZettleReaderTippingStyle zettleReaderTippingStyle;

    public CardReaderTippingConfiguration(com.zettle.sdk.ZettleReaderTippingStyle zettleReaderTippingStyle, com.zettle.sdk.PayPalReaderTippingStyle payPalReaderTippingStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleReaderTippingStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalReaderTippingStyle, "");
        this.zettleReaderTippingStyle = zettleReaderTippingStyle;
        this.payPalReaderTippingStyle = payPalReaderTippingStyle;
    }

    public /* synthetic */ CardReaderTippingConfiguration(com.zettle.sdk.ZettleReaderTippingStyle zettleReaderTippingStyle, com.zettle.sdk.PayPalReaderTippingStyle.None none, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.zettle.sdk.ZettleReaderTippingStyle.None : zettleReaderTippingStyle, (i & 2) != 0 ? com.zettle.sdk.PayPalReaderTippingStyle.None.INSTANCE : none);
    }

    public final com.zettle.sdk.ZettleReaderTippingStyle getZettleReaderTippingStyle() {
        return this.zettleReaderTippingStyle;
    }

    public final com.zettle.sdk.PayPalReaderTippingStyle getPayPalReaderTippingStyle() {
        return this.payPalReaderTippingStyle;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.ZettleReaderTippingStyle zettleReaderTippingStyle = this.zettleReaderTippingStyle;
        com.zettle.sdk.PayPalReaderTippingStyle payPalReaderTippingStyle = this.payPalReaderTippingStyle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardReaderTippingConfiguration(zettleReaderTippingStyle=");
        sb.append(zettleReaderTippingStyle);
        sb.append(", payPalReaderTippingStyle=");
        sb.append(payPalReaderTippingStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.zettleReaderTippingStyle.hashCode() * 31) + this.payPalReaderTippingStyle.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.CardReaderTippingConfiguration)) {
            return false;
        }
        com.zettle.sdk.CardReaderTippingConfiguration cardReaderTippingConfiguration = (com.zettle.sdk.CardReaderTippingConfiguration) other;
        return this.zettleReaderTippingStyle == cardReaderTippingConfiguration.zettleReaderTippingStyle && kotlin.jvm.internal.Intrinsics.areEqual(this.payPalReaderTippingStyle, cardReaderTippingConfiguration.payPalReaderTippingStyle);
    }

    public final com.zettle.sdk.CardReaderTippingConfiguration copy(com.zettle.sdk.ZettleReaderTippingStyle zettleReaderTippingStyle, com.zettle.sdk.PayPalReaderTippingStyle payPalReaderTippingStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleReaderTippingStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalReaderTippingStyle, "");
        return new com.zettle.sdk.CardReaderTippingConfiguration(zettleReaderTippingStyle, payPalReaderTippingStyle);
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.PayPalReaderTippingStyle getPayPalReaderTippingStyle() {
        return this.payPalReaderTippingStyle;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.ZettleReaderTippingStyle getZettleReaderTippingStyle() {
        return this.zettleReaderTippingStyle;
    }

    public static /* synthetic */ com.zettle.sdk.CardReaderTippingConfiguration copy$default(com.zettle.sdk.CardReaderTippingConfiguration cardReaderTippingConfiguration, com.zettle.sdk.ZettleReaderTippingStyle zettleReaderTippingStyle, com.zettle.sdk.PayPalReaderTippingStyle payPalReaderTippingStyle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zettleReaderTippingStyle = cardReaderTippingConfiguration.zettleReaderTippingStyle;
        }
        if ((i & 2) != 0) {
            payPalReaderTippingStyle = cardReaderTippingConfiguration.payPalReaderTippingStyle;
        }
        return cardReaderTippingConfiguration.copy(zettleReaderTippingStyle, payPalReaderTippingStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardReaderTippingConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
