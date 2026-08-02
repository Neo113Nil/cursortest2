package com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection;", "", "<init>", "()V", "UseYourBank", "EligibleCards", "ComingSoon", "IneligibleCardsFooter", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$ComingSoon;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$EligibleCards;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$IneligibleCardsFooter;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$UseYourBank;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class FiSection {
    public static final int $stable = 0;

    private FiSection() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$UseYourBank;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "itemTitle", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$UseYourBank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getItemTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UseYourBank extends com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText itemTitle;
        private final com.paypal.oslo.core.commonui.utils.RefText title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UseYourBank(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            this.title = refText;
            this.itemTitle = refText2;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getItemTitle() {
            return this.itemTitle;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.itemTitle;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UseYourBank(title=");
            sb.append(refText);
            sb.append(", itemTitle=");
            sb.append(refText2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.itemTitle.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank useYourBank = (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, useYourBank.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemTitle, useYourBank.itemTitle);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText itemTitle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemTitle, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank(title, itemTitle);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getItemTitle() {
            return this.itemTitle;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank copy$default(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank useYourBank, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = useYourBank.title;
            }
            if ((i & 2) != 0) {
                refText2 = useYourBank.itemTitle;
            }
            return useYourBank.copy(refText, refText2);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$EligibleCards;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiCard;", "cards", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$EligibleCards;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "Ljava/util/List;", "getCards"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibleCards extends com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> cards;
        private final com.paypal.oslo.core.commonui.utils.RefText title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibleCards(com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.title = refText;
            this.cards = list;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> getCards() {
            return this.cards;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> list = this.cards;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleCards(title=");
            sb.append(refText);
            sb.append(", cards=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.cards.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards eligibleCards = (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, eligibleCards.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, eligibleCards.cards);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards copy(com.paypal.oslo.core.commonui.utils.RefText title, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> cards) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards(title, cards);
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> component2() {
            return this.cards;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards copy$default(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards eligibleCards, com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = eligibleCards.title;
            }
            if ((i & 2) != 0) {
                list = eligibleCards.cards;
            }
            return eligibleCards.copy(refText, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$ComingSoon;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiCard;", "cards", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$ComingSoon;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "Ljava/util/List;", "getCards"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ComingSoon extends com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> cards;
        private final com.paypal.oslo.core.commonui.utils.RefText title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComingSoon(com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.title = refText;
            this.cards = list;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> getCards() {
            return this.cards;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> list = this.cards;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ComingSoon(title=");
            sb.append(refText);
            sb.append(", cards=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.cards.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon comingSoon = (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, comingSoon.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, comingSoon.cards);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon copy(com.paypal.oslo.core.commonui.utils.RefText title, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> cards) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon(title, cards);
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> component2() {
            return this.cards;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon copy$default(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon comingSoon, com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = comingSoon.title;
            }
            if ((i & 2) != 0) {
                list = comingSoon.cards;
            }
            return comingSoon.copy(refText, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$IneligibleCardsFooter;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "text", "linkText", "", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiCard;", "cards", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection$IneligibleCardsFooter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getText", "getLinkText", "Ljava/util/List;", "getCards"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibleCardsFooter extends com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> cards;
        private final com.paypal.oslo.core.commonui.utils.RefText linkText;
        private final com.paypal.oslo.core.commonui.utils.RefText text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IneligibleCardsFooter(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.text = refText;
            this.linkText = refText2;
            this.cards = list;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getText() {
            return this.text;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getLinkText() {
            return this.linkText;
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> getCards() {
            return this.cards;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.linkText;
            java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> list = this.cards;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IneligibleCardsFooter(text=");
            sb.append(refText);
            sb.append(", linkText=");
            sb.append(refText2);
            sb.append(", cards=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.text.hashCode() * 31) + this.linkText.hashCode()) * 31) + this.cards.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter ineligibleCardsFooter = (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, ineligibleCardsFooter.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkText, ineligibleCardsFooter.linkText) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, ineligibleCardsFooter.cards);
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter copy(com.paypal.oslo.core.commonui.utils.RefText text, com.paypal.oslo.core.commonui.utils.RefText linkText, java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> cards) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
            return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter(text, linkText, cards);
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard> component3() {
            return this.cards;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getLinkText() {
            return this.linkText;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getText() {
            return this.text;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter copy$default(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter ineligibleCardsFooter, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = ineligibleCardsFooter.text;
            }
            if ((i & 2) != 0) {
                refText2 = ineligibleCardsFooter.linkText;
            }
            if ((i & 4) != 0) {
                list = ineligibleCardsFooter.cards;
            }
            return ineligibleCardsFooter.copy(refText, refText2, list);
        }
    }

    public /* synthetic */ FiSection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
