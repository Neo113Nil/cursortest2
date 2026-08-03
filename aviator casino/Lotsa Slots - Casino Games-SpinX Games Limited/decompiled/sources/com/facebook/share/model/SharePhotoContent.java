package com.facebook.share.model;

/* compiled from: SharePhotoContent.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/facebook/share/model/SharePhotoContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/SharePhotoContent$Builder;", "builder", "(Lcom/facebook/share/model/SharePhotoContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "photos", "", "Lcom/facebook/share/model/SharePhoto;", "getPhotos", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SharePhotoContent extends com.facebook.share.model.ShareContent<com.facebook.share.model.SharePhotoContent, com.facebook.share.model.SharePhotoContent.Builder> {
    private final java.util.List<com.facebook.share.model.SharePhoto> photos;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.SharePhotoContent> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.SharePhotoContent>() { // from class: com.facebook.share.model.SharePhotoContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.SharePhotoContent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new com.facebook.share.model.SharePhotoContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.SharePhotoContent[] newArray(int size) {
            return new com.facebook.share.model.SharePhotoContent[size];
        }
    };

    public /* synthetic */ SharePhotoContent(com.facebook.share.model.SharePhotoContent.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.util.List<com.facebook.share.model.SharePhoto> getPhotos() {
        return this.photos;
    }

    private SharePhotoContent(com.facebook.share.model.SharePhotoContent.Builder builder) {
        super(builder);
        this.photos = kotlin.collections.CollectionsKt.toList(builder.getPhotos$facebook_common_release());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.photos = kotlin.collections.CollectionsKt.toList(com.facebook.share.model.SharePhoto.Builder.INSTANCE.readPhotoListFrom$facebook_common_release(parcel));
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        com.facebook.share.model.SharePhoto.Builder.INSTANCE.writePhotoListTo$facebook_common_release(out, flags, this.photos);
    }

    /* compiled from: SharePhotoContent.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u000b\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u0010\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/facebook/share/model/SharePhotoContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/SharePhotoContent;", "()V", "photos", "", "Lcom/facebook/share/model/SharePhoto;", "getPhotos$facebook_common_release", "()Ljava/util/List;", "addPhoto", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "addPhotos", "", "build", "readFrom", "content", "setPhotos", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder extends com.facebook.share.model.ShareContent.Builder<com.facebook.share.model.SharePhotoContent, com.facebook.share.model.SharePhotoContent.Builder> {
        private final java.util.List<com.facebook.share.model.SharePhoto> photos = new java.util.ArrayList();

        public final java.util.List<com.facebook.share.model.SharePhoto> getPhotos$facebook_common_release() {
            return this.photos;
        }

        public final com.facebook.share.model.SharePhotoContent.Builder addPhoto(com.facebook.share.model.SharePhoto photo) {
            if (photo != null) {
                this.photos.add(new com.facebook.share.model.SharePhoto.Builder().readFrom(photo).build());
            }
            return this;
        }

        public final com.facebook.share.model.SharePhotoContent.Builder addPhotos(java.util.List<com.facebook.share.model.SharePhoto> photos) {
            if (photos != null) {
                java.util.Iterator<com.facebook.share.model.SharePhoto> it = photos.iterator();
                while (it.hasNext()) {
                    addPhoto(it.next());
                }
            }
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.SharePhotoContent build() {
            return new com.facebook.share.model.SharePhotoContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.SharePhotoContent.Builder readFrom(com.facebook.share.model.SharePhotoContent content) {
            return content == null ? this : ((com.facebook.share.model.SharePhotoContent.Builder) super.readFrom((com.facebook.share.model.SharePhotoContent.Builder) content)).addPhotos(content.getPhotos());
        }

        public final com.facebook.share.model.SharePhotoContent.Builder setPhotos(java.util.List<com.facebook.share.model.SharePhoto> photos) {
            this.photos.clear();
            addPhotos(photos);
            return this;
        }
    }
}
