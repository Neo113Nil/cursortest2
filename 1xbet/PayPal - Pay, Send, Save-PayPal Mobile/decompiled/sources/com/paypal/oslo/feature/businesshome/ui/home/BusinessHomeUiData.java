package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData;", "", "", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card;", "cards", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCards", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BusinessHomeUiData {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> cards;

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessHomeUiData(java.util.List<? extends com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.cards = list;
    }

    public final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> getCards() {
        return this.cards;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \b2\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\r\u000e\u000f\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card;", "", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "Companion", "AccountSetup", "InFocus", "BusinessInsights", "EngagementCards", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$AccountSetup;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$BusinessInsights;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$EngagementCards;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$InFocus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Card {
        public static final int $stable = 0;
        public static final java.lang.String ACCOUNT_SETUP_ID = "account_setup";
        public static final java.lang.String BUSINESS_INSIGHTS_ID = "business_insights";
        public static final java.lang.String ENGAGEMENT_CARDS_ID = "engagement_cards";
        public static final java.lang.String IN_FOCUS_ID = "in_focus";

        public abstract java.lang.String getId();

        private Card() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$AccountSetup;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "id", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AccountSetup extends com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.AccountSetup INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.AccountSetup();
            private static final java.lang.String id = com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.ACCOUNT_SETUP_ID;

            public final int hashCode() {
                return 1286140304;
            }

            private AccountSetup() {
                super(null);
            }

            @Override // com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card
            public final java.lang.String getId() {
                return id;
            }

            public final java.lang.String toString() {
                return "AccountSetup";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.AccountSetup)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$InFocus;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "id", "<init>", "(Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$InFocus;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/businesshome/ui/home/InFocusUiData;", "getData", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InFocus extends com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData data;
            private final java.lang.String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InFocus(com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData inFocusUiData, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inFocusUiData, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = inFocusUiData;
                this.id = str;
            }

            public final com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData getData() {
                return this.data;
            }

            public /* synthetic */ InFocus(com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData inFocusUiData, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(inFocusUiData, (i & 2) != 0 ? com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.IN_FOCUS_ID : str);
            }

            @Override // com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card
            public final java.lang.String getId() {
                return this.id;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData inFocusUiData = this.data;
                java.lang.String str = this.id;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InFocus(data=");
                sb.append(inFocusUiData);
                sb.append(", id=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.data.hashCode() * 31) + this.id.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus)) {
                    return false;
                }
                com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus inFocus = (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.data, inFocus.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, inFocus.id);
            }

            public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus copy(com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData data, java.lang.String id) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus(data, id);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus inFocus, com.paypal.oslo.feature.businesshome.ui.home.InFocusUiData inFocusUiData, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    inFocusUiData = inFocus.data;
                }
                if ((i & 2) != 0) {
                    str = inFocus.id;
                }
                return inFocus.copy(inFocusUiData, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$BusinessInsights;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card;", "Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "id", "<init>", "(Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$BusinessInsights;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/businesshome/ui/home/InsightsUiData;", "getData", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BusinessInsights extends com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData data;
            private final java.lang.String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BusinessInsights(com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData insightsUiData, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insightsUiData, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = insightsUiData;
                this.id = str;
            }

            public final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData getData() {
                return this.data;
            }

            public /* synthetic */ BusinessInsights(com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData insightsUiData, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(insightsUiData, (i & 2) != 0 ? com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BUSINESS_INSIGHTS_ID : str);
            }

            @Override // com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card
            public final java.lang.String getId() {
                return this.id;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData insightsUiData = this.data;
                java.lang.String str = this.id;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessInsights(data=");
                sb.append(insightsUiData);
                sb.append(", id=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.data.hashCode() * 31) + this.id.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights)) {
                    return false;
                }
                com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights businessInsights = (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.data, businessInsights.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, businessInsights.id);
            }

            public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights copy(com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData data, java.lang.String id) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights(data, id);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.BusinessInsights businessInsights, com.paypal.oslo.feature.businesshome.ui.home.InsightsUiData insightsUiData, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    insightsUiData = businessInsights.data;
                }
                if ((i & 2) != 0) {
                    str = businessInsights.id;
                }
                return businessInsights.copy(insightsUiData, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$EngagementCards;", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card;", "", "Lcom/paypal/oslo/feature/businesshome/ui/home/EngagementCardUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "id", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeUiData$Card$EngagementCards;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getData", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EngagementCards extends com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> data;
            private final java.lang.String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EngagementCards(java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> list, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = list;
                this.id = str;
            }

            public final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> getData() {
                return this.data;
            }

            public /* synthetic */ EngagementCards(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.ENGAGEMENT_CARDS_ID : str);
            }

            @Override // com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card
            public final java.lang.String getId() {
                return this.id;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> list = this.data;
                java.lang.String str = this.id;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("EngagementCards(data=");
                sb.append(list);
                sb.append(", id=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.data.hashCode() * 31) + this.id.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards)) {
                    return false;
                }
                com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards engagementCards = (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.data, engagementCards.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, engagementCards.id);
            }

            public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards copy(java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> data, java.lang.String id) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards(data, id);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getId() {
                return this.id;
            }

            public final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> component1() {
                return this.data;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards engagementCards, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = engagementCards.data;
                }
                if ((i & 2) != 0) {
                    str = engagementCards.id;
                }
                return engagementCards.copy(list, str);
            }
        }

        public /* synthetic */ Card(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> list = this.cards;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessHomeUiData(cards=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.cards.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData) other).cards);
    }

    public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData copy(java.util.List<? extends com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> cards) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData(cards);
    }

    public final java.util.List<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> component1() {
        return this.cards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData copy$default(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData businessHomeUiData, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = businessHomeUiData.cards;
        }
        return businessHomeUiData.copy(list);
    }
}
