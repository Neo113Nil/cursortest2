package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0004#$%&B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Content;", "content", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Offer;", "offers", "", "snoozeAlertText", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Content;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Content;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Content;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Content;", "getContent", "Ljava/util/List;", "getOffers", "Ljava/lang/String;", "getSnoozeAlertText", "setSnoozeAlertText", "(Ljava/lang/String;)V", "Content", "Offer", "OfferContent", "CalculationInputs"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Snooze {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content content;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer> offers;
    private java.lang.String snoozeAlertText;

    public Snooze(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content content, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.content = content;
        this.offers = list;
        this.snoozeAlertText = str;
    }

    public /* synthetic */ Snooze(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content content, java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(content, list, (i & 4) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content getContent() {
        return this.content;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer> getOffers() {
        return this.offers;
    }

    public final java.lang.String getSnoozeAlertText() {
        return this.snoozeAlertText;
    }

    public final void setSnoozeAlertText(java.lang.String str) {
        this.snoozeAlertText = str;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Content;", "", "", "postponeText", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Content;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPostponeText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content {
        public static final int $stable = 0;
        private final java.lang.String postponeText;

        public Content(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.postponeText = str;
        }

        public final java.lang.String getPostponeText() {
            return this.postponeText;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.postponeText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(postponeText=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.postponeText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.postponeText, ((com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content) other).postponeText);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content copy(java.lang.String postponeText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postponeText, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content(postponeText);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPostponeText() {
            return this.postponeText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content content, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = content.postponeText;
            }
            return content.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J \u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001cR\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b9\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b:\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b;\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b<\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Offer;", "", "", "formattedDate", "formattedDay", "formattedMonth", "formattedYear", "formattedFee", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;", "fee", "adjustedTotalAmount", "originalBalance", "formattedAdjustedTotalAmount", "defermentDuration", "id", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$OfferContent;", "content", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$CalculationInputs;", "calculationInputs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$OfferContent;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$CalculationInputs;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$OfferContent;", "component13", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$CalculationInputs;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$OfferContent;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$CalculationInputs;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$Offer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedDate", "getFormattedDay", "getFormattedMonth", "getFormattedYear", "getFormattedFee", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;", "getFee", "getAdjustedTotalAmount", "getOriginalBalance", "getFormattedAdjustedTotalAmount", "getDefermentDuration", "getId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$OfferContent;", "getContent", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$CalculationInputs;", "getCalculationInputs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Offer {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount adjustedTotalAmount;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs calculationInputs;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent content;
        private final java.lang.String defermentDuration;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount fee;
        private final java.lang.String formattedAdjustedTotalAmount;
        private final java.lang.String formattedDate;
        private final java.lang.String formattedDay;
        private final java.lang.String formattedFee;
        private final java.lang.String formattedMonth;
        private final java.lang.String formattedYear;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount originalBalance;

        public Offer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount2, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount3, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent offerContent, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs calculationInputs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculationInputs, "");
            this.formattedDate = str;
            this.formattedDay = str2;
            this.formattedMonth = str3;
            this.formattedYear = str4;
            this.formattedFee = str5;
            this.fee = amount;
            this.adjustedTotalAmount = amount2;
            this.originalBalance = amount3;
            this.formattedAdjustedTotalAmount = str6;
            this.defermentDuration = str7;
            this.id = str8;
            this.content = offerContent;
            this.calculationInputs = calculationInputs;
        }

        public /* synthetic */ Offer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount2, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount3, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent offerContent, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs calculationInputs, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, amount, amount2, amount3, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, str8, offerContent, calculationInputs);
        }

        public final java.lang.String getFormattedDate() {
            return this.formattedDate;
        }

        public final java.lang.String getFormattedDay() {
            return this.formattedDay;
        }

        public final java.lang.String getFormattedMonth() {
            return this.formattedMonth;
        }

        public final java.lang.String getFormattedYear() {
            return this.formattedYear;
        }

        public final java.lang.String getFormattedFee() {
            return this.formattedFee;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getFee() {
            return this.fee;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getAdjustedTotalAmount() {
            return this.adjustedTotalAmount;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getOriginalBalance() {
            return this.originalBalance;
        }

        public final java.lang.String getFormattedAdjustedTotalAmount() {
            return this.formattedAdjustedTotalAmount;
        }

        public final java.lang.String getDefermentDuration() {
            return this.defermentDuration;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent getContent() {
            return this.content;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs getCalculationInputs() {
            return this.calculationInputs;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedDate;
            java.lang.String str2 = this.formattedDay;
            java.lang.String str3 = this.formattedMonth;
            java.lang.String str4 = this.formattedYear;
            java.lang.String str5 = this.formattedFee;
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount = this.fee;
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount2 = this.adjustedTotalAmount;
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount3 = this.originalBalance;
            java.lang.String str6 = this.formattedAdjustedTotalAmount;
            java.lang.String str7 = this.defermentDuration;
            java.lang.String str8 = this.id;
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent offerContent = this.content;
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs calculationInputs = this.calculationInputs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Offer(formattedDate=");
            sb.append(str);
            sb.append(", formattedDay=");
            sb.append(str2);
            sb.append(", formattedMonth=");
            sb.append(str3);
            sb.append(", formattedYear=");
            sb.append(str4);
            sb.append(", formattedFee=");
            sb.append(str5);
            sb.append(", fee=");
            sb.append(amount);
            sb.append(", adjustedTotalAmount=");
            sb.append(amount2);
            sb.append(", originalBalance=");
            sb.append(amount3);
            sb.append(", formattedAdjustedTotalAmount=");
            sb.append(str6);
            sb.append(", defermentDuration=");
            sb.append(str7);
            sb.append(", id=");
            sb.append(str8);
            sb.append(", content=");
            sb.append(offerContent);
            sb.append(", calculationInputs=");
            sb.append(calculationInputs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.formattedDate;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.formattedDay;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.formattedMonth;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.formattedYear;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.formattedFee;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            int hashCode6 = this.fee.hashCode();
            int hashCode7 = this.adjustedTotalAmount.hashCode();
            int hashCode8 = this.originalBalance.hashCode();
            java.lang.String str6 = this.formattedAdjustedTotalAmount;
            int hashCode9 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.defermentDuration;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str7 != null ? str7.hashCode() : 0)) * 31) + this.id.hashCode()) * 31) + this.content.hashCode()) * 31) + this.calculationInputs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer offer = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedDate, offer.formattedDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedDay, offer.formattedDay) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMonth, offer.formattedMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedYear, offer.formattedYear) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedFee, offer.formattedFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.fee, offer.fee) && kotlin.jvm.internal.Intrinsics.areEqual(this.adjustedTotalAmount, offer.adjustedTotalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalBalance, offer.originalBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAdjustedTotalAmount, offer.formattedAdjustedTotalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.defermentDuration, offer.defermentDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, offer.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, offer.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.calculationInputs, offer.calculationInputs);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer copy(java.lang.String formattedDate, java.lang.String formattedDay, java.lang.String formattedMonth, java.lang.String formattedYear, java.lang.String formattedFee, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount fee, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount adjustedTotalAmount, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount originalBalance, java.lang.String formattedAdjustedTotalAmount, java.lang.String defermentDuration, java.lang.String id, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent content, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs calculationInputs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adjustedTotalAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculationInputs, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer(formattedDate, formattedDay, formattedMonth, formattedYear, formattedFee, fee, adjustedTotalAmount, originalBalance, formattedAdjustedTotalAmount, defermentDuration, id, content, calculationInputs);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getFormattedAdjustedTotalAmount() {
            return this.formattedAdjustedTotalAmount;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getOriginalBalance() {
            return this.originalBalance;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getAdjustedTotalAmount() {
            return this.adjustedTotalAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getFee() {
            return this.fee;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFormattedFee() {
            return this.formattedFee;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFormattedYear() {
            return this.formattedYear;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFormattedMonth() {
            return this.formattedMonth;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFormattedDay() {
            return this.formattedDay;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs getCalculationInputs() {
            return this.calculationInputs;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent getContent() {
            return this.content;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getDefermentDuration() {
            return this.defermentDuration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedDate() {
            return this.formattedDate;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$OfferContent;", "", "", "payOnActionText", "newTotalAmountText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$OfferContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPayOnActionText", "getNewTotalAmountText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OfferContent {
        public static final int $stable = 0;
        private final java.lang.String newTotalAmountText;
        private final java.lang.String payOnActionText;

        public OfferContent(java.lang.String str, java.lang.String str2) {
            this.payOnActionText = str;
            this.newTotalAmountText = str2;
        }

        public /* synthetic */ OfferContent(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getPayOnActionText() {
            return this.payOnActionText;
        }

        public final java.lang.String getNewTotalAmountText() {
            return this.newTotalAmountText;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.payOnActionText;
            java.lang.String str2 = this.newTotalAmountText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OfferContent(payOnActionText=");
            sb.append(str);
            sb.append(", newTotalAmountText=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.payOnActionText;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.newTotalAmountText;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent offerContent = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.payOnActionText, offerContent.payOnActionText) && kotlin.jvm.internal.Intrinsics.areEqual(this.newTotalAmountText, offerContent.newTotalAmountText);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent copy(java.lang.String payOnActionText, java.lang.String newTotalAmountText) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent(payOnActionText, newTotalAmountText);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNewTotalAmountText() {
            return this.newTotalAmountText;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPayOnActionText() {
            return this.payOnActionText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.OfferContent offerContent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = offerContent.payOnActionText;
            }
            if ((i & 2) != 0) {
                str2 = offerContent.newTotalAmountText;
            }
            return offerContent.copy(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OfferContent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$CalculationInputs;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;", "legalLimitRateThreshold", "", "centralBankRate", "legalLimitRate", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze$CalculationInputs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Amount;", "getLegalLimitRateThreshold", "Ljava/lang/String;", "getCentralBankRate", "getLegalLimitRate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CalculationInputs {
        public static final int $stable = 0;
        private final java.lang.String centralBankRate;
        private final java.lang.String legalLimitRate;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount legalLimitRateThreshold;

        public CalculationInputs(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.legalLimitRateThreshold = amount;
            this.centralBankRate = str;
            this.legalLimitRate = str2;
        }

        public /* synthetic */ CalculationInputs(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(amount, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getLegalLimitRateThreshold() {
            return this.legalLimitRateThreshold;
        }

        public final java.lang.String getCentralBankRate() {
            return this.centralBankRate;
        }

        public final java.lang.String getLegalLimitRate() {
            return this.legalLimitRate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount = this.legalLimitRateThreshold;
            java.lang.String str = this.centralBankRate;
            java.lang.String str2 = this.legalLimitRate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CalculationInputs(legalLimitRateThreshold=");
            sb.append(amount);
            sb.append(", centralBankRate=");
            sb.append(str);
            sb.append(", legalLimitRate=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.legalLimitRateThreshold.hashCode();
            java.lang.String str = this.centralBankRate;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.legalLimitRate;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs calculationInputs = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.legalLimitRateThreshold, calculationInputs.legalLimitRateThreshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.centralBankRate, calculationInputs.centralBankRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalLimitRate, calculationInputs.legalLimitRate);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs copy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount legalLimitRateThreshold, java.lang.String centralBankRate, java.lang.String legalLimitRate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalLimitRateThreshold, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs(legalLimitRateThreshold, centralBankRate, legalLimitRate);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLegalLimitRate() {
            return this.legalLimitRate;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCentralBankRate() {
            return this.centralBankRate;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount getLegalLimitRateThreshold() {
            return this.legalLimitRateThreshold;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.CalculationInputs calculationInputs, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Amount amount, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = calculationInputs.legalLimitRateThreshold;
            }
            if ((i & 2) != 0) {
                str = calculationInputs.centralBankRate;
            }
            if ((i & 4) != 0) {
                str2 = calculationInputs.legalLimitRate;
            }
            return calculationInputs.copy(amount, str, str2);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content content = this.content;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer> list = this.offers;
        java.lang.String str = this.snoozeAlertText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Snooze(content=");
        sb.append(content);
        sb.append(", offers=");
        sb.append(list);
        sb.append(", snoozeAlertText=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.content.hashCode();
        int hashCode2 = this.offers.hashCode();
        java.lang.String str = this.snoozeAlertText;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze snooze = (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, snooze.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.offers, snooze.offers) && kotlin.jvm.internal.Intrinsics.areEqual(this.snoozeAlertText, snooze.snoozeAlertText);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze copy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content content, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer> offers, java.lang.String snoozeAlertText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offers, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze(content, offers, snoozeAlertText);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSnoozeAlertText() {
        return this.snoozeAlertText;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Offer> component2() {
        return this.offers;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content getContent() {
        return this.content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze snooze, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze.Content content, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            content = snooze.content;
        }
        if ((i & 2) != 0) {
            list = snooze.offers;
        }
        if ((i & 4) != 0) {
            str = snooze.snoozeAlertText;
        }
        return snooze.copy(content, list, str);
    }
}
