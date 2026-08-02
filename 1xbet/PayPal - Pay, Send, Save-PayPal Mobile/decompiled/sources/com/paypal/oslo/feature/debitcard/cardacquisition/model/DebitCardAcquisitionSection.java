package com.paypal.oslo.feature.debitcard.cardacquisition.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionSection;", "", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionWidgetType;", "widgetType", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionImageWidget;", "imageWidget", "", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionTextWidget;", "texts", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionWidgetType;Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionImageWidget;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionWidgetType;", "component2", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionImageWidget;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionWidgetType;Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionImageWidget;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionWidgetType;", "getWidgetType", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionImageWidget;", "getImageWidget", "Ljava/util/List;", "getTexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DebitCardAcquisitionSection {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget imageWidget;
    private final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget> texts;
    private final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType widgetType;

    public DebitCardAcquisitionSection(com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType debitCardAcquisitionWidgetType, com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget debitCardAcquisitionImageWidget, java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionWidgetType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.widgetType = debitCardAcquisitionWidgetType;
        this.imageWidget = debitCardAcquisitionImageWidget;
        this.texts = list;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType getWidgetType() {
        return this.widgetType;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget getImageWidget() {
        return this.imageWidget;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget> getTexts() {
        return this.texts;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType debitCardAcquisitionWidgetType = this.widgetType;
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget debitCardAcquisitionImageWidget = this.imageWidget;
        java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget> list = this.texts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardAcquisitionSection(widgetType=");
        sb.append(debitCardAcquisitionWidgetType);
        sb.append(", imageWidget=");
        sb.append(debitCardAcquisitionImageWidget);
        sb.append(", texts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.widgetType.hashCode();
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget debitCardAcquisitionImageWidget = this.imageWidget;
        return (((hashCode * 31) + (debitCardAcquisitionImageWidget == null ? 0 : debitCardAcquisitionImageWidget.hashCode())) * 31) + this.texts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection debitCardAcquisitionSection = (com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection) other;
        return this.widgetType == debitCardAcquisitionSection.widgetType && kotlin.jvm.internal.Intrinsics.areEqual(this.imageWidget, debitCardAcquisitionSection.imageWidget) && kotlin.jvm.internal.Intrinsics.areEqual(this.texts, debitCardAcquisitionSection.texts);
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection copy(com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType widgetType, com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget imageWidget, java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget> texts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(texts, "");
        return new com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection(widgetType, imageWidget, texts);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget> component3() {
        return this.texts;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget getImageWidget() {
        return this.imageWidget;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType getWidgetType() {
        return this.widgetType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection debitCardAcquisitionSection, com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType debitCardAcquisitionWidgetType, com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget debitCardAcquisitionImageWidget, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardAcquisitionWidgetType = debitCardAcquisitionSection.widgetType;
        }
        if ((i & 2) != 0) {
            debitCardAcquisitionImageWidget = debitCardAcquisitionSection.imageWidget;
        }
        if ((i & 4) != 0) {
            list = debitCardAcquisitionSection.texts;
        }
        return debitCardAcquisitionSection.copy(debitCardAcquisitionWidgetType, debitCardAcquisitionImageWidget, list);
    }
}
