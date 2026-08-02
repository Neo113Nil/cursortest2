package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/LinkACardModel;", "", "", "text", "Lkotlin/Function0;", "", "onLinkCardClick", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/LinkACardModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lkotlin/jvm/functions/Function0;", "getOnLinkCardClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LinkACardModel {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onLinkCardClick;
    private final java.lang.String text;

    public LinkACardModel(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.text = str;
        this.onLinkCardClick = function0;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLinkCardClick() {
        return this.onLinkCardClick;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onLinkCardClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkACardModel(text=");
        sb.append(str);
        sb.append(", onLinkCardClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.onLinkCardClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.LinkACardModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.LinkACardModel linkACardModel = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.LinkACardModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, linkACardModel.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.onLinkCardClick, linkACardModel.onLinkCardClick);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.LinkACardModel copy(java.lang.String text, kotlin.jvm.functions.Function0<kotlin.Unit> onLinkCardClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLinkCardClick, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.LinkACardModel(text, onLinkCardClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onLinkCardClick;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.LinkACardModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.LinkACardModel linkACardModel, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkACardModel.text;
        }
        if ((i & 2) != 0) {
            function0 = linkACardModel.onLinkCardClick;
        }
        return linkACardModel.copy(str, function0);
    }
}
