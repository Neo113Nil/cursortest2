package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration;", "", "Headless", "TippingScreen", "Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration$Headless;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration$TippingScreen;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface GratuityFeatureConfiguration {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration$Headless;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration;", "", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration$Headless;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getGratuityAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Headless implements com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration {
        public static final int $stable = 0;
        private final long gratuityAmount;

        public Headless(long j) {
            this.gratuityAmount = j;
        }

        public final long getGratuityAmount() {
            return this.gratuityAmount;
        }

        public final java.lang.String toString() {
            long j = this.gratuityAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Headless(gratuityAmount=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.gratuityAmount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless) && this.gratuityAmount == ((com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless) other).gratuityAmount;
        }

        public final com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless copy(long gratuityAmount) {
            return new com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless(gratuityAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final long getGratuityAmount() {
            return this.gratuityAmount;
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless copy$default(com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.Headless headless, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = headless.gratuityAmount;
            }
            return headless.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration$TippingScreen;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration;", "", "", "percentages", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/zettle/sdk/feature/taptopay/ui/payment/GratuityFeatureConfiguration$TippingScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPercentages"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TippingScreen implements com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration {
        public static final int $stable = 8;
        private final java.util.List<java.lang.Float> percentages;

        public TippingScreen(java.util.List<java.lang.Float> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.percentages = list;
        }

        public final java.util.List<java.lang.Float> getPercentages() {
            return this.percentages;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.Float> list = this.percentages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TippingScreen(percentages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.percentages.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.percentages, ((com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen) other).percentages);
        }

        public final com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen copy(java.util.List<java.lang.Float> percentages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentages, "");
            return new com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen(percentages);
        }

        public final java.util.List<java.lang.Float> component1() {
            return this.percentages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen copy$default(com.zettle.sdk.feature.taptopay.ui.payment.GratuityFeatureConfiguration.TippingScreen tippingScreen, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = tippingScreen.percentages;
            }
            return tippingScreen.copy(list);
        }
    }
}
