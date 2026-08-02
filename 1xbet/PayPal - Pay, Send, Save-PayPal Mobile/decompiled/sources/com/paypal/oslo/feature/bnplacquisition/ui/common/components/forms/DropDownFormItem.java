package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/DropDownFormItem;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "text", "", "key", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/DropDownFormItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getText", "Ljava/lang/String;", "getKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DropDownFormItem {
    public static final int $stable = 0;
    private final java.lang.String key;
    private final com.paypal.oslo.core.commonui.utils.RefText text;

    public DropDownFormItem(com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.text = refText;
        this.key = str;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
        java.lang.String str = this.key;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DropDownFormItem(text=");
        sb.append(refText);
        sb.append(", key=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.key.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem dropDownFormItem = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, dropDownFormItem.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.key, dropDownFormItem.key);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem copy(com.paypal.oslo.core.commonui.utils.RefText text, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem(text, key);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.DropDownFormItem dropDownFormItem, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = dropDownFormItem.text;
        }
        if ((i & 2) != 0) {
            str = dropDownFormItem.key;
        }
        return dropDownFormItem.copy(refText, str);
    }
}
