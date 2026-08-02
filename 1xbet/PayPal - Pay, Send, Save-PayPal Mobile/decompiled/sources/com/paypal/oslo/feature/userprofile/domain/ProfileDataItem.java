package com.paypal.oslo.feature.userprofile.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJl\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b\b\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "T", "", "", "id", "displayValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "isPrimary", "isConfirmed", "Lcom/paypal/pds/core/Icon;", "icon", "", "linkedCards", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/paypal/pds/core/Icon;Ljava/lang/Integer;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "()Lcom/paypal/pds/core/Icon;", "component7", "()Ljava/lang/Integer;", "component8", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/paypal/pds/core/Icon;Ljava/lang/Integer;Ljava/lang/Object;)Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getDisplayValue", "getDescription", "Z", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/Integer;", "getLinkedCards", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProfileDataItem<T> {
    public static final int $stable = 0;
    private final T data;
    private final java.lang.String description;
    private final java.lang.String displayValue;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String id;
    private final boolean isConfirmed;
    private final boolean isPrimary;
    private final java.lang.Integer linkedCards;

    public ProfileDataItem(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, com.paypal.pds.core.Icon icon, java.lang.Integer num, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.id = str;
        this.displayValue = str2;
        this.description = str3;
        this.isPrimary = z;
        this.isConfirmed = z2;
        this.icon = icon;
        this.linkedCards = num;
        this.data = t;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getDisplayValue() {
        return this.displayValue;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final boolean isConfirmed() {
        return this.isConfirmed;
    }

    public /* synthetic */ ProfileDataItem(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, com.paypal.pds.core.Icon icon, java.lang.Integer num, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? com.paypal.pds.core.Icon.NoIcon.INSTANCE : icon, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : obj);
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.Integer getLinkedCards() {
        return this.linkedCards;
    }

    public final T getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.displayValue;
        java.lang.String str3 = this.description;
        boolean z = this.isPrimary;
        boolean z2 = this.isConfirmed;
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.Integer num = this.linkedCards;
        T t = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileDataItem(id=");
        sb.append(str);
        sb.append(", displayValue=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", isPrimary=");
        sb.append(z);
        sb.append(", isConfirmed=");
        sb.append(z2);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", linkedCards=");
        sb.append(num);
        sb.append(", data=");
        sb.append(t);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.displayValue.hashCode();
        java.lang.String str = this.description;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isPrimary);
        int hashCode5 = java.lang.Boolean.hashCode(this.isConfirmed);
        int hashCode6 = this.icon.hashCode();
        java.lang.Integer num = this.linkedCards;
        int hashCode7 = num == null ? 0 : num.hashCode();
        T t = this.data;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (t != null ? t.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.ProfileDataItem)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.domain.ProfileDataItem profileDataItem = (com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, profileDataItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayValue, profileDataItem.displayValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, profileDataItem.description) && this.isPrimary == profileDataItem.isPrimary && this.isConfirmed == profileDataItem.isConfirmed && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, profileDataItem.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedCards, profileDataItem.linkedCards) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, profileDataItem.data);
    }

    public final com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<T> copy(java.lang.String id, java.lang.String displayValue, java.lang.String description, boolean isPrimary, boolean isConfirmed, com.paypal.pds.core.Icon icon, java.lang.Integer linkedCards, T data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        return new com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<>(id, displayValue, description, isPrimary, isConfirmed, icon, linkedCards, data);
    }

    public final T component8() {
        return this.data;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Integer getLinkedCards() {
        return this.linkedCards;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDisplayValue() {
        return this.displayValue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
