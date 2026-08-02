package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ContextualAlertUiModel;", "", "", "text", "Lcom/paypal/pds/components/ContextualAlertStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "<init>", "(ILcom/paypal/pds/components/ContextualAlertStyle;)V", "component1", "()I", "component2", "()Lcom/paypal/pds/components/ContextualAlertStyle;", "copy", "(ILcom/paypal/pds/components/ContextualAlertStyle;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ContextualAlertUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getText", "Lcom/paypal/pds/components/ContextualAlertStyle;", "getStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ContextualAlertUiModel {
    public static final int $stable = com.paypal.pds.components.ContextualAlertStyle.$stable;
    private final com.paypal.pds.components.ContextualAlertStyle style;
    private final int text;

    public ContextualAlertUiModel(int i, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualAlertStyle, "");
        this.text = i;
        this.style = contextualAlertStyle;
    }

    public final int getText() {
        return this.text;
    }

    public /* synthetic */ ContextualAlertUiModel(int i, com.paypal.pds.components.ContextualAlertStyle.Neutral neutral, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE : neutral);
    }

    public final com.paypal.pds.components.ContextualAlertStyle getStyle() {
        return this.style;
    }

    public final java.lang.String toString() {
        int i = this.text;
        com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle = this.style;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContextualAlertUiModel(text=");
        sb.append(i);
        sb.append(", style=");
        sb.append(contextualAlertStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.text) * 31) + this.style.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel contextualAlertUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel) other;
        return this.text == contextualAlertUiModel.text && kotlin.jvm.internal.Intrinsics.areEqual(this.style, contextualAlertUiModel.style);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel copy(int text, com.paypal.pds.components.ContextualAlertStyle style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel(text, style);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.components.ContextualAlertStyle getStyle() {
        return this.style;
    }

    /* renamed from: component1, reason: from getter */
    public final int getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel contextualAlertUiModel, int i, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = contextualAlertUiModel.text;
        }
        if ((i2 & 2) != 0) {
            contextualAlertStyle = contextualAlertUiModel.style;
        }
        return contextualAlertUiModel.copy(i, contextualAlertStyle);
    }
}
