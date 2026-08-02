package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/ValidationError;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "text", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/ValidationError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ValidationError {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final com.paypal.oslo.core.commonui.utils.RefText text;

    public ValidationError(com.paypal.oslo.core.commonui.utils.RefText refText) {
        this.text = refText;
    }

    public /* synthetic */ ValidationError(com.paypal.oslo.core.commonui.utils.RefText refText, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : refText);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(text=");
        sb.append(refText);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
        if (refText == null) {
            return 0;
        }
        return refText.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationError) other).text);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationError copy(com.paypal.oslo.core.commonui.utils.RefText text) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationError(text);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.ValidationError validationError, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = validationError.text;
        }
        return validationError.copy(refText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationError() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
