package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \n2\u00020\u0001:\u0003\u000b\f\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand;", "", "", "p0", "<init>", "(I)V", "cvvLength", com.visa.cbp.getEncExpo.warmup, "getCvvLength", "()I", "Companion", "Amex", "Default", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand$Amex;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand$Default;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardBrand {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Companion(null);
    private final int cvvLength;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand$Amex;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amex extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Amex INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Amex();

        public final int hashCode() {
            return -839739921;
        }

        private Amex() {
            super(4, null);
        }

        public final java.lang.String toString() {
            return "Amex";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Amex)) {
                return false;
            }
            return true;
        }
    }

    private CardBrand(int i) {
        this.cvvLength = i;
    }

    public final int getCvvLength() {
        return this.cvvLength;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand$Default;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Default extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Default INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Default();

        public final int hashCode() {
            return -368622543;
        }

        private Default() {
            super(3, null);
        }

        public final java.lang.String toString() {
            return "Default";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Default)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand$Companion;", "", "<init>", "()V", "", "brand", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardBrand;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand fromString(java.lang.String brand) {
            if (!kotlin.text.StringsKt.equals(brand, "AMEX", true) && !kotlin.text.StringsKt.equals(brand, "AMERICAN_EXPRESS", true)) {
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Default.INSTANCE;
            }
            return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.Amex.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardBrand(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
