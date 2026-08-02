package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressFieldInfo;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "addressField", "", "label", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Field;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Field;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/AddressFieldInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "getAddressField", "Ljava/lang/String;", "getLabel", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddressFieldInfo {
    private final com.paypal.oslo.core.i18n.domain.model.Field addressField;
    private final java.lang.String label;
    private final java.lang.String value;

    public AddressFieldInfo(com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        this.addressField = field;
        this.label = str;
        this.value = str2;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Field getAddressField() {
        return this.addressField;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.i18n.domain.model.Field field = this.addressField;
        java.lang.String str = this.label;
        java.lang.String str2 = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressFieldInfo(addressField=");
        sb.append(field);
        sb.append(", label=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.addressField.hashCode();
        java.lang.String str = this.label;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.value;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo addressFieldInfo = (com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.addressField, addressFieldInfo.addressField) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, addressFieldInfo.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, addressFieldInfo.value);
    }

    public final com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo copy(com.paypal.oslo.core.i18n.domain.model.Field addressField, java.lang.String label, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressField, "");
        return new com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo(addressField, label, value);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Field getAddressField() {
        return this.addressField;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo copy$default(com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo addressFieldInfo, com.paypal.oslo.core.i18n.domain.model.Field field, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            field = addressFieldInfo.addressField;
        }
        if ((i & 2) != 0) {
            str = addressFieldInfo.label;
        }
        if ((i & 4) != 0) {
            str2 = addressFieldInfo.value;
        }
        return addressFieldInfo.copy(field, str, str2);
    }
}
