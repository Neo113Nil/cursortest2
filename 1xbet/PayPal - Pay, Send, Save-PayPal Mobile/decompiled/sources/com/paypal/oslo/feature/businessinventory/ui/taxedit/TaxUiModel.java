package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/TaxUiModel;", "Landroid/os/Parcelable;", "", "id", "label", "percentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/TaxUiModel;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getLabel", "getPercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TaxUiModel implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel> CREATOR = new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel.Creator();
    private final java.lang.String id;
    private final java.lang.String label;
    private final java.lang.String percentage;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TaxUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.label = str2;
        this.percentage = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getPercentage() {
        return this.percentage;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.label);
        dest.writeString(this.percentage);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.label;
        java.lang.String str3 = this.percentage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxUiModel(id=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(", percentage=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.label.hashCode()) * 31) + this.percentage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel taxUiModel = (com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, taxUiModel.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, taxUiModel.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.percentage, taxUiModel.percentage);
    }

    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel copy(java.lang.String id, java.lang.String label, java.lang.String percentage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentage, "");
        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel(id, label, percentage);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel[] newArray(int i) {
            return new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPercentage() {
        return this.percentage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel copy$default(com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel taxUiModel, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = taxUiModel.id;
        }
        if ((i & 2) != 0) {
            str2 = taxUiModel.label;
        }
        if ((i & 4) != 0) {
            str3 = taxUiModel.percentage;
        }
        return taxUiModel.copy(str, str2, str3);
    }
}
