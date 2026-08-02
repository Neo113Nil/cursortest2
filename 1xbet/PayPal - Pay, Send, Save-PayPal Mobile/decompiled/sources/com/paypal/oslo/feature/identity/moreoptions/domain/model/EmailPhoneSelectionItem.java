package com.paypal.oslo.feature.identity.moreoptions.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/EmailPhoneSelectionItem;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "displayValue", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/ContactType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/ContactType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/ContactType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/ContactType;)Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/EmailPhoneSelectionItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getDisplayValue", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/ContactType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmailPhoneSelectionItem {
    public static final int $stable = 0;
    private final java.lang.String displayValue;
    private final com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType type;
    private final java.lang.String value;

    public EmailPhoneSelectionItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType contactType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactType, "");
        this.value = str;
        this.displayValue = str2;
        this.type = contactType;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String getDisplayValue() {
        return this.displayValue;
    }

    public final com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.value;
        java.lang.String str2 = this.displayValue;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType contactType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailPhoneSelectionItem(value=");
        sb.append(str);
        sb.append(", displayValue=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(contactType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.value.hashCode() * 31) + this.displayValue.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.moreoptions.domain.model.EmailPhoneSelectionItem)) {
            return false;
        }
        com.paypal.oslo.feature.identity.moreoptions.domain.model.EmailPhoneSelectionItem emailPhoneSelectionItem = (com.paypal.oslo.feature.identity.moreoptions.domain.model.EmailPhoneSelectionItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, emailPhoneSelectionItem.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayValue, emailPhoneSelectionItem.displayValue) && this.type == emailPhoneSelectionItem.type;
    }

    public final com.paypal.oslo.feature.identity.moreoptions.domain.model.EmailPhoneSelectionItem copy(java.lang.String value, java.lang.String displayValue, com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.identity.moreoptions.domain.model.EmailPhoneSelectionItem(value, displayValue, type);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDisplayValue() {
        return this.displayValue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.domain.model.EmailPhoneSelectionItem copy$default(com.paypal.oslo.feature.identity.moreoptions.domain.model.EmailPhoneSelectionItem emailPhoneSelectionItem, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType contactType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailPhoneSelectionItem.value;
        }
        if ((i & 2) != 0) {
            str2 = emailPhoneSelectionItem.displayValue;
        }
        if ((i & 4) != 0) {
            contactType = emailPhoneSelectionItem.type;
        }
        return emailPhoneSelectionItem.copy(str, str2, contactType);
    }
}
