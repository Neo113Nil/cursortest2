package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "eTag", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;", "content", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "getETag", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TurnOffAutopayModel {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent content;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
    private final java.lang.String eTag;

    public TurnOffAutopayModel(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent turnOffAutopayContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(turnOffAutopayContent, "");
        this.creditAccountId = str;
        this.creditProductIdentifier = creditProductIdentifier;
        this.eTag = str2;
        this.content = turnOffAutopayContent;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getETag() {
        return this.eTag;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent getContent() {
        return this.content;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str2 = this.eTag;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent turnOffAutopayContent = this.content;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TurnOffAutopayModel(creditAccountId=");
        sb.append(str);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", eTag=");
        sb.append(str2);
        sb.append(", content=");
        sb.append(turnOffAutopayContent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.creditAccountId.hashCode() * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.eTag.hashCode()) * 31) + this.content.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel = (com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, turnOffAutopayModel.creditAccountId) && this.creditProductIdentifier == turnOffAutopayModel.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.eTag, turnOffAutopayModel.eTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, turnOffAutopayModel.content);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String eTag, com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eTag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel(creditAccountId, creditProductIdentifier, eTag, content);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getETag() {
        return this.eTag;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent turnOffAutopayContent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = turnOffAutopayModel.creditAccountId;
        }
        if ((i & 2) != 0) {
            creditProductIdentifier = turnOffAutopayModel.creditProductIdentifier;
        }
        if ((i & 4) != 0) {
            str2 = turnOffAutopayModel.eTag;
        }
        if ((i & 8) != 0) {
            turnOffAutopayContent = turnOffAutopayModel.content;
        }
        return turnOffAutopayModel.copy(str, creditProductIdentifier, str2, turnOffAutopayContent);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
