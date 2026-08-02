package com.paypal.oslo.feature.bnplservicing.ui.plandetails.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/LinkUiModel;", "Landroid/os/Parcelable;", "", "relativePath", "staticUrl", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/LinkUiModel;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRelativePath", "getStaticUrl", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document$Link$Type;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LinkUiModel implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel> CREATOR = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel.Creator();
    private final java.lang.String relativePath;
    private final java.lang.String staticUrl;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public LinkUiModel(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type) {
        this.relativePath = str;
        this.staticUrl = str2;
        this.type = type;
    }

    public /* synthetic */ LinkUiModel(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : type);
    }

    public final java.lang.String getRelativePath() {
        return this.relativePath;
    }

    public final java.lang.String getStaticUrl() {
        return this.staticUrl;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.relativePath);
        dest.writeString(this.staticUrl);
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type = this.type;
        if (type == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(type.name());
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.relativePath;
        java.lang.String str2 = this.staticUrl;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkUiModel(relativePath=");
        sb.append(str);
        sb.append(", staticUrl=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(type);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.relativePath;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.staticUrl;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type = this.type;
        return (((hashCode * 31) + hashCode2) * 31) + (type != null ? type.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel linkUiModel = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.relativePath, linkUiModel.relativePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.staticUrl, linkUiModel.staticUrl) && this.type == linkUiModel.type;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel copy(java.lang.String relativePath, java.lang.String staticUrl, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel(relativePath, staticUrl, type);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type getType() {
        return this.type;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel[] newArray(int i) {
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.valueOf(parcel.readString()));
        }
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStaticUrl() {
        return this.staticUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRelativePath() {
        return this.relativePath;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel linkUiModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type type, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkUiModel.relativePath;
        }
        if ((i & 2) != 0) {
            str2 = linkUiModel.staticUrl;
        }
        if ((i & 4) != 0) {
            type = linkUiModel.type;
        }
        return linkUiModel.copy(str, str2, type);
    }

    public LinkUiModel() {
        this(null, null, null, 7, null);
    }
}
