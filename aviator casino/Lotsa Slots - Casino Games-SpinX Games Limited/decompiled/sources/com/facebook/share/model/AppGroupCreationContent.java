package com.facebook.share.model;

/* compiled from: AppGroupCreationContent.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent;", "Lcom/facebook/share/model/ShareModel;", "builder", "Lcom/facebook/share/model/AppGroupCreationContent$Builder;", "(Lcom/facebook/share/model/AppGroupCreationContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "appGroupPrivacy", "Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "getAppGroupPrivacy", "()Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "description", "", "getDescription", "()Ljava/lang/String;", "name", "getName", "describeContents", "", "writeToParcel", "", "out", "flags", "AppGroupPrivacy", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppGroupCreationContent implements com.facebook.share.model.ShareModel {
    private final com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy;
    private final java.lang.String description;
    private final java.lang.String name;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.AppGroupCreationContent> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.AppGroupCreationContent>() { // from class: com.facebook.share.model.AppGroupCreationContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.AppGroupCreationContent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new com.facebook.share.model.AppGroupCreationContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.AppGroupCreationContent[] newArray(int size) {
            return new com.facebook.share.model.AppGroupCreationContent[size];
        }
    };

    public /* synthetic */ AppGroupCreationContent(com.facebook.share.model.AppGroupCreationContent.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy getAppGroupPrivacy() {
        return this.appGroupPrivacy;
    }

    private AppGroupCreationContent(com.facebook.share.model.AppGroupCreationContent.Builder builder) {
        this.name = builder.getName();
        this.description = builder.getDescription();
        this.appGroupPrivacy = builder.getAppGroupPrivacy();
    }

    public AppGroupCreationContent(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeSerializable(this.appGroupPrivacy);
    }

    /* compiled from: AppGroupCreationContent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "", "(Ljava/lang/String;I)V", "Open", "Closed", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum AppGroupPrivacy {
        Open,
        Closed;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy[] valuesCustom() {
            com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy[] valuesCustom = values();
            return (com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: AppGroupCreationContent.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/share/model/AppGroupCreationContent;", "()V", "appGroupPrivacy", "Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "getAppGroupPrivacy$facebook_common_release", "()Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "setAppGroupPrivacy$facebook_common_release", "(Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;)V", "description", "", "getDescription$facebook_common_release", "()Ljava/lang/String;", "setDescription$facebook_common_release", "(Ljava/lang/String;)V", "name", "getName$facebook_common_release", "setName$facebook_common_release", "build", "readFrom", "content", "setAppGroupPrivacy", "setDescription", "setName", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder implements com.facebook.share.model.ShareModelBuilder<com.facebook.share.model.AppGroupCreationContent, com.facebook.share.model.AppGroupCreationContent.Builder> {
        private com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy;
        private java.lang.String description;
        private java.lang.String name;

        /* renamed from: getName$facebook_common_release, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public final void setName$facebook_common_release(java.lang.String str) {
            this.name = str;
        }

        /* renamed from: getDescription$facebook_common_release, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public final void setDescription$facebook_common_release(java.lang.String str) {
            this.description = str;
        }

        /* renamed from: getAppGroupPrivacy$facebook_common_release, reason: from getter */
        public final com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy getAppGroupPrivacy() {
            return this.appGroupPrivacy;
        }

        public final void setAppGroupPrivacy$facebook_common_release(com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
        }

        public final com.facebook.share.model.AppGroupCreationContent.Builder setName(java.lang.String name) {
            this.name = name;
            return this;
        }

        public final com.facebook.share.model.AppGroupCreationContent.Builder setDescription(java.lang.String description) {
            this.description = description;
            return this;
        }

        public final com.facebook.share.model.AppGroupCreationContent.Builder setAppGroupPrivacy(com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.AppGroupCreationContent build() {
            return new com.facebook.share.model.AppGroupCreationContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.AppGroupCreationContent.Builder readFrom(com.facebook.share.model.AppGroupCreationContent content) {
            return content == null ? this : setName(content.getName()).setDescription(content.getDescription()).setAppGroupPrivacy(content.getAppGroupPrivacy());
        }
    }
}
