package com.paypal.oslo.feature.inappcheckout.analytics.ryp;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\f\r\u000e\u000f\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "", "<init>", "()V", "ComponentData", "ScreenContext", "Interaction", "ScreenShown", "ScreenLoaded", "ScreenDismissed", "ComponentViewed", "ComponentInteracted", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentInteracted;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentViewed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenDismissed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenLoaded;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenShown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class RypAnalyticsEvent {
    public static final int $stable = 0;

    private RypAnalyticsEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JP\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", "", "", "compName", "itemName", "intent", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "fundingInstruments", "selectedFi", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;)Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCompName", "getItemName", "getIntent", "Ljava/util/List;", "getFundingInstruments", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "getSelectedFi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ComponentData {
        public static final int $stable = 8;
        private final java.lang.String compName;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments;
        private final java.lang.String intent;
        private final java.lang.String itemName;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFi;

        public ComponentData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.compName = str;
            this.itemName = str2;
            this.intent = str3;
            this.fundingInstruments = list;
            this.selectedFi = fundingInstrument;
        }

        public final java.lang.String getCompName() {
            return this.compName;
        }

        public final java.lang.String getItemName() {
            return this.itemName;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public /* synthetic */ ComponentData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : fundingInstrument);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument getSelectedFi() {
            return this.selectedFi;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.compName;
            java.lang.String str2 = this.itemName;
            java.lang.String str3 = this.intent;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list = this.fundingInstruments;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument = this.selectedFi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ComponentData(compName=");
            sb.append(str);
            sb.append(", itemName=");
            sb.append(str2);
            sb.append(", intent=");
            sb.append(str3);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(", selectedFi=");
            sb.append(fundingInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.compName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.itemName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.intent;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            int hashCode4 = this.fundingInstruments.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument = this.selectedFi;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (fundingInstrument != null ? fundingInstrument.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData = (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.compName, componentData.compName) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemName, componentData.itemName) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, componentData.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, componentData.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFi, componentData.selectedFi);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData copy(java.lang.String compName, java.lang.String itemName, java.lang.String intent, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData(compName, itemName, intent, fundingInstruments, selectedFi);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument getSelectedFi() {
            return this.selectedFi;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> component4() {
            return this.fundingInstruments;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getItemName() {
            return this.itemName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCompName() {
            return this.compName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData copy$default(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = componentData.compName;
            }
            if ((i & 2) != 0) {
                str2 = componentData.itemName;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = componentData.intent;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                list = componentData.fundingInstruments;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                fundingInstrument = componentData.selectedFi;
            }
            return componentData.copy(str, str4, str5, list2, fundingInstrument);
        }

        public ComponentData() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenContext;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "checkoutEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "selectedFi", "", "fundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "getCheckoutEntity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "getSelectedFi", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenContext {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity checkoutEntity;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments;
        private final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFi;

        public ScreenContext(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.checkoutEntity = initializeCheckoutContextEntity;
            this.selectedFi = fundingInstrument;
            this.fundingInstruments = list;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity getCheckoutEntity() {
            return this.checkoutEntity;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument getSelectedFi() {
            return this.selectedFi;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity = this.checkoutEntity;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument = this.selectedFi;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list = this.fundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenContext(checkoutEntity=");
            sb.append(initializeCheckoutContextEntity);
            sb.append(", selectedFi=");
            sb.append(fundingInstrument);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity = this.checkoutEntity;
            int hashCode = initializeCheckoutContextEntity == null ? 0 : initializeCheckoutContextEntity.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument = this.selectedFi;
            return (((hashCode * 31) + (fundingInstrument != null ? fundingInstrument.hashCode() : 0)) * 31) + this.fundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext screenContext = (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutEntity, screenContext.checkoutEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFi, screenContext.selectedFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, screenContext.fundingInstruments);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext copy(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity checkoutEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument selectedFi, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> fundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext(checkoutEntity, selectedFi, fundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> component3() {
            return this.fundingInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument getSelectedFi() {
            return this.selectedFi;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity getCheckoutEntity() {
            return this.checkoutEntity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext copy$default(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext screenContext, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                initializeCheckoutContextEntity = screenContext.checkoutEntity;
            }
            if ((i & 2) != 0) {
                fundingInstrument = screenContext.selectedFi;
            }
            if ((i & 4) != 0) {
                list = screenContext.fundingInstruments;
            }
            return screenContext.copy(initializeCheckoutContextEntity, fundingInstrument, list);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$Interaction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "CLICKED", "SELECTED", "UNSELECTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Interaction {
        public static final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction CLICKED;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction SELECTED;
        public static final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction UNSELECTED;
        private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction[] getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String rawValue;

        private Interaction(java.lang.String str, int i, java.lang.String str2) {
            this.rawValue = str2;
        }

        public final java.lang.String getRawValue() {
            return this.rawValue;
        }

        static {
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction interaction = new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction("CLICKED", 0, "clicked");
            CLICKED = interaction;
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction interaction2 = new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction("SELECTED", 1, com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag);
            SELECTED = interaction2;
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction interaction3 = new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction("UNSELECTED", 2, "unselected");
            UNSELECTED = interaction3;
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction[] interactionArr = {interaction, interaction2, interaction3};
            getHighResolutionOutputSizeshNQ4ISI = interactionArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(interactionArr);
        }

        public static com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction[] values() {
            return (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenShown;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "", "isBackToThisScreen", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenShown;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenShown extends com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent {
        public static final int $stable = 0;
        private final boolean isBackToThisScreen;

        public ScreenShown(boolean z) {
            super(null);
            this.isBackToThisScreen = z;
        }

        public /* synthetic */ ScreenShown(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean isBackToThisScreen() {
            return this.isBackToThisScreen;
        }

        public final java.lang.String toString() {
            boolean z = this.isBackToThisScreen;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenShown(isBackToThisScreen=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isBackToThisScreen);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown) && this.isBackToThisScreen == ((com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown) other).isBackToThisScreen;
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown copy(boolean isBackToThisScreen) {
            return new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown(isBackToThisScreen);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsBackToThisScreen() {
            return this.isBackToThisScreen;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown copy$default(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenShown screenShown, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = screenShown.isBackToThisScreen;
            }
            return screenShown.copy(z);
        }

        public ScreenShown() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenLoaded;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenContext;", "context", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenContext;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenContext;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenContext;)Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenContext;", "getContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLoaded extends com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenLoaded(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext screenContext) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenContext, "");
            this.context = screenContext;
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext getContext() {
            return this.context;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext screenContext = this.context;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenLoaded(context=");
            sb.append(screenContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.context.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, ((com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded) other).context);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded copy(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded(context);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext getContext() {
            return this.context;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded copy$default(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenLoaded screenLoaded, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenContext screenContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                screenContext = screenLoaded.context;
            }
            return screenLoaded.copy(screenContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ScreenDismissed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenDismissed extends com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenDismissed INSTANCE = new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenDismissed();

        public final int hashCode() {
            return 142933794;
        }

        private ScreenDismissed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ScreenDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ScreenDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentViewed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isEnabled", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;Z)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;Z)Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentViewed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", "getData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ComponentViewed extends com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData data;
        private final boolean isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentViewed(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentData, "");
            this.data = componentData;
            this.isEnabled = z;
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData getData() {
            return this.data;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData = this.data;
            boolean z = this.isEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ComponentViewed(data=");
            sb.append(componentData);
            sb.append(", isEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Boolean.hashCode(this.isEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed componentViewed = (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, componentViewed.data) && this.isEnabled == componentViewed.isEnabled;
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed copy(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData data, boolean isEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed(data, isEnabled);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed copy$default(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentViewed componentViewed, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                componentData = componentViewed.data;
            }
            if ((i & 2) != 0) {
                z = componentViewed.isEnabled;
            }
            return componentViewed.copy(componentData, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentInteracted;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$Interaction;", "type", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$Interaction;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$Interaction;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$Interaction;)Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentInteracted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$ComponentData;", "getData", "Lcom/paypal/oslo/feature/inappcheckout/analytics/ryp/RypAnalyticsEvent$Interaction;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ComponentInteracted extends com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData data;
        private final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentInteracted(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction interaction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "");
            this.data = componentData;
            this.type = interaction;
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData getData() {
            return this.data;
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData = this.data;
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction interaction = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ComponentInteracted(data=");
            sb.append(componentData);
            sb.append(", type=");
            sb.append(interaction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted componentInteracted = (com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, componentInteracted.data) && this.type == componentInteracted.type;
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted copy(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData data, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted(data, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted copy$default(com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentInteracted componentInteracted, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.ComponentData componentData, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsEvent.Interaction interaction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                componentData = componentInteracted.data;
            }
            if ((i & 2) != 0) {
                interaction = componentInteracted.type;
            }
            return componentInteracted.copy(componentData, interaction);
        }
    }

    public /* synthetic */ RypAnalyticsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
