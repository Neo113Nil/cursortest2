package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/DateOfBirthUiModel;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "isRequired", "originalIsoDate", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "isoDateForSubmission", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/DateOfBirthUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Z", "getOriginalIsoDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DateOfBirthUiModel {
    public static final int $stable = 0;
    private final boolean isRequired;
    private final java.lang.String originalIsoDate;
    private final java.lang.String value;

    public DateOfBirthUiModel(java.lang.String str, boolean z, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
        this.isRequired = z;
        this.originalIsoDate = str2;
    }

    public /* synthetic */ DateOfBirthUiModel(java.lang.String str, boolean z, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final java.lang.String getOriginalIsoDate() {
        return this.originalIsoDate;
    }

    public final java.lang.String isoDateForSubmission() {
        java.lang.String str = this.originalIsoDate;
        if (str == null) {
            return null;
        }
        java.lang.String str2 = str;
        return str2.length() != 0 ? str2 : null;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.value;
        boolean z = this.isRequired;
        java.lang.String str2 = this.originalIsoDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateOfBirthUiModel(value=");
        sb.append(str);
        sb.append(", isRequired=");
        sb.append(z);
        sb.append(", originalIsoDate=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isRequired);
        java.lang.String str = this.originalIsoDate;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel dateOfBirthUiModel = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, dateOfBirthUiModel.value) && this.isRequired == dateOfBirthUiModel.isRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.originalIsoDate, dateOfBirthUiModel.originalIsoDate);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel copy(java.lang.String value, boolean isRequired, java.lang.String originalIsoDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel(value, isRequired, originalIsoDate);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOriginalIsoDate() {
        return this.originalIsoDate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel dateOfBirthUiModel, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dateOfBirthUiModel.value;
        }
        if ((i & 2) != 0) {
            z = dateOfBirthUiModel.isRequired;
        }
        if ((i & 4) != 0) {
            str2 = dateOfBirthUiModel.originalIsoDate;
        }
        return dateOfBirthUiModel.copy(str, z, str2);
    }
}
