package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/Gratuity;", "", "<init>", "()V", "GratuityAmount", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "ReaderTipping", "Lcom/zettle/sdk/Gratuity$GratuityAmount;", "Lcom/zettle/sdk/Gratuity$None;", "Lcom/zettle/sdk/Gratuity$ReaderTipping;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class Gratuity {
    private Gratuity() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/Gratuity$None;", "Lcom/zettle/sdk/Gratuity;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends com.zettle.sdk.Gratuity {
        public static final com.zettle.sdk.Gratuity.None INSTANCE = new com.zettle.sdk.Gratuity.None();

        private None() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/Gratuity$ReaderTipping;", "Lcom/zettle/sdk/Gratuity;", "Lcom/zettle/sdk/CardReaderTippingConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lcom/zettle/sdk/CardReaderTippingConfiguration;)V", "Lcom/zettle/sdk/CardReaderTippingConfiguration;", "getConfiguration", "()Lcom/zettle/sdk/CardReaderTippingConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ReaderTipping extends com.zettle.sdk.Gratuity {
        private final com.zettle.sdk.CardReaderTippingConfiguration configuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReaderTipping(com.zettle.sdk.CardReaderTippingConfiguration cardReaderTippingConfiguration) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReaderTippingConfiguration, "");
            this.configuration = cardReaderTippingConfiguration;
        }

        public final com.zettle.sdk.CardReaderTippingConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/Gratuity$GratuityAmount;", "Lcom/zettle/sdk/Gratuity;", "Lcom/zettle/sdk/Amount;", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "<init>", "(Lcom/zettle/sdk/Amount;)V", "component1", "()Lcom/zettle/sdk/Amount;", "copy", "(Lcom/zettle/sdk/Amount;)Lcom/zettle/sdk/Gratuity$GratuityAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/Amount;", "getGratuityAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class GratuityAmount extends com.zettle.sdk.Gratuity {
        private final com.zettle.sdk.Amount gratuityAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GratuityAmount(com.zettle.sdk.Amount amount) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.gratuityAmount = amount;
        }

        public final com.zettle.sdk.Amount getGratuityAmount() {
            return this.gratuityAmount;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.Amount amount = this.gratuityAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GratuityAmount(gratuityAmount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.gratuityAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.Gratuity.GratuityAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.gratuityAmount, ((com.zettle.sdk.Gratuity.GratuityAmount) other).gratuityAmount);
        }

        public final com.zettle.sdk.Gratuity.GratuityAmount copy(com.zettle.sdk.Amount gratuityAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gratuityAmount, "");
            return new com.zettle.sdk.Gratuity.GratuityAmount(gratuityAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.Amount getGratuityAmount() {
            return this.gratuityAmount;
        }

        public static /* synthetic */ com.zettle.sdk.Gratuity.GratuityAmount copy$default(com.zettle.sdk.Gratuity.GratuityAmount gratuityAmount, com.zettle.sdk.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = gratuityAmount.gratuityAmount;
            }
            return gratuityAmount.copy(amount);
        }
    }

    public /* synthetic */ Gratuity(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
