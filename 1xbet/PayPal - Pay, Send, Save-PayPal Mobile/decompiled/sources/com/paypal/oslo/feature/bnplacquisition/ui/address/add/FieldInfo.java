package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/FieldInfo;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "formFieldId", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "", "prefilledValue", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/FieldInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "getFormFieldId", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "Ljava/lang/String;", "getPrefilledValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FieldInfo {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId;
    private final java.lang.String prefilledValue;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public FieldInfo(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.formFieldId = formFieldId;
        this.title = refText;
        this.prefilledValue = str;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFormFieldId() {
        return this.formFieldId;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final java.lang.String getPrefilledValue() {
        return this.prefilledValue;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = this.formFieldId;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        java.lang.String str = this.prefilledValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldInfo(formFieldId=");
        sb.append(formFieldId);
        sb.append(", title=");
        sb.append(refText);
        sb.append(", prefilledValue=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.formFieldId.hashCode() * 31) + this.title.hashCode()) * 31) + this.prefilledValue.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo fieldInfo = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo) other;
        return this.formFieldId == fieldInfo.formFieldId && kotlin.jvm.internal.Intrinsics.areEqual(this.title, fieldInfo.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.prefilledValue, fieldInfo.prefilledValue);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo copy(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.core.commonui.utils.RefText title, java.lang.String prefilledValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefilledValue, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo(formFieldId, title, prefilledValue);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPrefilledValue() {
        return this.prefilledValue;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getFormFieldId() {
        return this.formFieldId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.FieldInfo fieldInfo, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            formFieldId = fieldInfo.formFieldId;
        }
        if ((i & 2) != 0) {
            refText = fieldInfo.title;
        }
        if ((i & 4) != 0) {
            str = fieldInfo.prefilledValue;
        }
        return fieldInfo.copy(formFieldId, refText, str);
    }
}
