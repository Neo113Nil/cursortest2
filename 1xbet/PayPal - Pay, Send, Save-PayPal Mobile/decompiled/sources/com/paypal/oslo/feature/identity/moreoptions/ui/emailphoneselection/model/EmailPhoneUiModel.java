package com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010 \u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "", "", "id", "maskedValue", "", "isSelected", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/EmailPhoneUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getMaskedValue", "Z", "getErrorMessage", "isSelectable", "getHasError", "hasError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmailPhoneUiModel {
    public static final int $stable = 0;
    private final java.lang.String errorMessage;
    private final java.lang.String id;
    private final boolean isSelected;
    private final java.lang.String maskedValue;

    public EmailPhoneUiModel(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.maskedValue = str2;
        this.isSelected = z;
        this.errorMessage = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getMaskedValue() {
        return this.maskedValue;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean isSelectable() {
        return this.errorMessage == null;
    }

    public final boolean getHasError() {
        return this.errorMessage != null;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.maskedValue;
        boolean z = this.isSelected;
        java.lang.String str3 = this.errorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailPhoneUiModel(id=");
        sb.append(str);
        sb.append(", maskedValue=");
        sb.append(str2);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(", errorMessage=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.maskedValue.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isSelected);
        java.lang.String str = this.errorMessage;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel emailPhoneUiModel = (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, emailPhoneUiModel.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedValue, emailPhoneUiModel.maskedValue) && this.isSelected == emailPhoneUiModel.isSelected && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, emailPhoneUiModel.errorMessage);
    }

    public final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel copy(java.lang.String id, java.lang.String maskedValue, boolean isSelected, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedValue, "");
        return new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel(id, maskedValue, isSelected, errorMessage);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMaskedValue() {
        return this.maskedValue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.EmailPhoneUiModel emailPhoneUiModel, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailPhoneUiModel.id;
        }
        if ((i & 2) != 0) {
            str2 = emailPhoneUiModel.maskedValue;
        }
        if ((i & 4) != 0) {
            z = emailPhoneUiModel.isSelected;
        }
        if ((i & 8) != 0) {
            str3 = emailPhoneUiModel.errorMessage;
        }
        return emailPhoneUiModel.copy(str, str2, z, str3);
    }
}
