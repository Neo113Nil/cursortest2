package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/android/threeds/data/model/RecurrenceInfo;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_AMOUNT_TYPE, "frequencyType", "recurringExpiry", "recurringFrequency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/RecurrenceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmountType", "getFrequencyType", "getRecurringExpiry", "getRecurringFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RecurrenceInfo {
    public static final int $stable = 0;

    @com.google.gson.annotations.SerializedName("amount_type")
    private final java.lang.String amountType;

    @com.google.gson.annotations.SerializedName("frequency_type")
    private final java.lang.String frequencyType;

    @com.google.gson.annotations.SerializedName("recurring_expiry")
    private final java.lang.String recurringExpiry;

    @com.google.gson.annotations.SerializedName("recurring_frequency")
    private final java.lang.String recurringFrequency;

    public RecurrenceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.amountType = str;
        this.frequencyType = str2;
        this.recurringExpiry = str3;
        this.recurringFrequency = str4;
    }

    public /* synthetic */ RecurrenceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "FIXED" : str, (i & 2) != 0 ? "FIXED" : str2, str3, str4);
    }

    public final java.lang.String getAmountType() {
        return this.amountType;
    }

    public final java.lang.String getFrequencyType() {
        return this.frequencyType;
    }

    public final java.lang.String getRecurringExpiry() {
        return this.recurringExpiry;
    }

    public final java.lang.String getRecurringFrequency() {
        return this.recurringFrequency;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amountType;
        java.lang.String str2 = this.frequencyType;
        java.lang.String str3 = this.recurringExpiry;
        java.lang.String str4 = this.recurringFrequency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecurrenceInfo(amountType=");
        sb.append(str);
        sb.append(", frequencyType=");
        sb.append(str2);
        sb.append(", recurringExpiry=");
        sb.append(str3);
        sb.append(", recurringFrequency=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.amountType;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.frequencyType;
        return (((((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.recurringExpiry.hashCode()) * 31) + this.recurringFrequency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.RecurrenceInfo)) {
            return false;
        }
        com.paypal.android.threeds.data.model.RecurrenceInfo recurrenceInfo = (com.paypal.android.threeds.data.model.RecurrenceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountType, recurrenceInfo.amountType) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyType, recurrenceInfo.frequencyType) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurringExpiry, recurrenceInfo.recurringExpiry) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurringFrequency, recurrenceInfo.recurringFrequency);
    }

    public final com.paypal.android.threeds.data.model.RecurrenceInfo copy(java.lang.String amountType, java.lang.String frequencyType, java.lang.String recurringExpiry, java.lang.String recurringFrequency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringExpiry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringFrequency, "");
        return new com.paypal.android.threeds.data.model.RecurrenceInfo(amountType, frequencyType, recurringExpiry, recurringFrequency);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getRecurringFrequency() {
        return this.recurringFrequency;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRecurringExpiry() {
        return this.recurringExpiry;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFrequencyType() {
        return this.frequencyType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmountType() {
        return this.amountType;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.RecurrenceInfo copy$default(com.paypal.android.threeds.data.model.RecurrenceInfo recurrenceInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = recurrenceInfo.amountType;
        }
        if ((i & 2) != 0) {
            str2 = recurrenceInfo.frequencyType;
        }
        if ((i & 4) != 0) {
            str3 = recurrenceInfo.recurringExpiry;
        }
        if ((i & 8) != 0) {
            str4 = recurrenceInfo.recurringFrequency;
        }
        return recurrenceInfo.copy(str, str2, str3, str4);
    }
}
