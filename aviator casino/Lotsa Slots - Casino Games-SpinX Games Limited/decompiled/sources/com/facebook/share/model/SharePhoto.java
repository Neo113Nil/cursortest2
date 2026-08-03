package com.facebook.share.model;

/* compiled from: SharePhoto.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001dH\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lcom/facebook/share/model/SharePhoto;", "Lcom/facebook/share/model/ShareMedia;", "Lcom/facebook/share/model/SharePhoto$Builder;", "builder", "(Lcom/facebook/share/model/SharePhoto$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM, "", "getCaption", "()Ljava/lang/String;", com.helpshift.proactive.InAppViewConstants.IMAGE_URL, "Landroid/net/Uri;", "getImageUrl", "()Landroid/net/Uri;", "mediaType", "Lcom/facebook/share/model/ShareMedia$Type;", "getMediaType", "()Lcom/facebook/share/model/ShareMedia$Type;", "userGenerated", "", "getUserGenerated", "()Z", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SharePhoto extends com.facebook.share.model.ShareMedia<com.facebook.share.model.SharePhoto, com.facebook.share.model.SharePhoto.Builder> {
    private final android.graphics.Bitmap bitmap;
    private final java.lang.String caption;
    private final android.net.Uri imageUrl;
    private final com.facebook.share.model.ShareMedia.Type mediaType;
    private final boolean userGenerated;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.SharePhoto> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.SharePhoto>() { // from class: com.facebook.share.model.SharePhoto$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.SharePhoto createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.share.model.SharePhoto(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.SharePhoto[] newArray(int size) {
            return new com.facebook.share.model.SharePhoto[size];
        }
    };

    public /* synthetic */ SharePhoto(com.facebook.share.model.SharePhoto.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final android.graphics.Bitmap getBitmap() {
        return this.bitmap;
    }

    public final android.net.Uri getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getUserGenerated() {
        return this.userGenerated;
    }

    public final java.lang.String getCaption() {
        return this.caption;
    }

    private SharePhoto(com.facebook.share.model.SharePhoto.Builder builder) {
        super(builder);
        this.mediaType = com.facebook.share.model.ShareMedia.Type.PHOTO;
        this.bitmap = builder.getBitmap();
        this.imageUrl = builder.getImageUrl();
        this.userGenerated = builder.getUserGenerated();
        this.caption = builder.getCaption();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.mediaType = com.facebook.share.model.ShareMedia.Type.PHOTO;
        this.bitmap = (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader());
        this.imageUrl = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        out.writeParcelable(this.bitmap, 0);
        out.writeParcelable(this.imageUrl, 0);
        out.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        out.writeString(this.caption);
    }

    @Override // com.facebook.share.model.ShareMedia
    public com.facebook.share.model.ShareMedia.Type getMediaType() {
        return this.mediaType;
    }

    /* compiled from: SharePhoto.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\r@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/facebook/share/model/SharePhoto$Builder;", "Lcom/facebook/share/model/ShareMedia$Builder;", "Lcom/facebook/share/model/SharePhoto;", "()V", "<set-?>", "Landroid/graphics/Bitmap;", "bitmap", "getBitmap$facebook_common_release", "()Landroid/graphics/Bitmap;", "", com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM, "getCaption$facebook_common_release", "()Ljava/lang/String;", "Landroid/net/Uri;", com.helpshift.proactive.InAppViewConstants.IMAGE_URL, "getImageUrl$facebook_common_release", "()Landroid/net/Uri;", "", "userGenerated", "getUserGenerated$facebook_common_release", "()Z", "build", "readFrom", "parcel", "Landroid/os/Parcel;", "readFrom$facebook_common_release", "model", "setBitmap", "setCaption", "setImageUrl", "setUserGenerated", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder extends com.facebook.share.model.ShareMedia.Builder<com.facebook.share.model.SharePhoto, com.facebook.share.model.SharePhoto.Builder> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.share.model.SharePhoto.Builder.Companion INSTANCE = new com.facebook.share.model.SharePhoto.Builder.Companion(null);
        private android.graphics.Bitmap bitmap;
        private java.lang.String caption;
        private android.net.Uri imageUrl;
        private boolean userGenerated;

        /* renamed from: getBitmap$facebook_common_release, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        /* renamed from: getImageUrl$facebook_common_release, reason: from getter */
        public final android.net.Uri getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: getUserGenerated$facebook_common_release, reason: from getter */
        public final boolean getUserGenerated() {
            return this.userGenerated;
        }

        /* renamed from: getCaption$facebook_common_release, reason: from getter */
        public final java.lang.String getCaption() {
            return this.caption;
        }

        public final com.facebook.share.model.SharePhoto.Builder setBitmap(android.graphics.Bitmap bitmap) {
            this.bitmap = bitmap;
            return this;
        }

        public final com.facebook.share.model.SharePhoto.Builder setImageUrl(android.net.Uri imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public final com.facebook.share.model.SharePhoto.Builder setUserGenerated(boolean userGenerated) {
            this.userGenerated = userGenerated;
            return this;
        }

        public final com.facebook.share.model.SharePhoto.Builder setCaption(java.lang.String caption) {
            this.caption = caption;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.SharePhoto build() {
            return new com.facebook.share.model.SharePhoto(this, null);
        }

        @Override // com.facebook.share.model.ShareMedia.Builder, com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.SharePhoto.Builder readFrom(com.facebook.share.model.SharePhoto model) {
            return model == null ? this : ((com.facebook.share.model.SharePhoto.Builder) super.readFrom((com.facebook.share.model.SharePhoto.Builder) model)).setBitmap(model.getBitmap()).setImageUrl(model.getImageUrl()).setUserGenerated(model.getUserGenerated()).setCaption(model.getCaption());
        }

        public final com.facebook.share.model.SharePhoto.Builder readFrom$facebook_common_release(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((com.facebook.share.model.SharePhoto) parcel.readParcelable(com.facebook.share.model.SharePhoto.class.getClassLoader()));
        }

        /* compiled from: SharePhoto.kt */
        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/share/model/SharePhoto$Builder$Companion;", "", "()V", "readPhotoListFrom", "", "Lcom/facebook/share/model/SharePhoto;", "parcel", "Landroid/os/Parcel;", "readPhotoListFrom$facebook_common_release", "writePhotoListTo", "", "out", "parcelFlags", "", "photos", "writePhotoListTo$facebook_common_release", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final void writePhotoListTo$facebook_common_release(android.os.Parcel out, int parcelFlags, java.util.List<com.facebook.share.model.SharePhoto> photos) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photos, "photos");
                java.lang.Object[] array = photos.toArray(new com.facebook.share.model.SharePhoto[0]);
                if (array != null) {
                    out.writeParcelableArray((com.facebook.share.model.SharePhoto[]) array, parcelFlags);
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }

            public final java.util.List<com.facebook.share.model.SharePhoto> readPhotoListFrom$facebook_common_release(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                java.util.List<com.facebook.share.model.ShareMedia<?, ?>> readListFrom$facebook_common_release = com.facebook.share.model.ShareMedia.Builder.INSTANCE.readListFrom$facebook_common_release(parcel);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : readListFrom$facebook_common_release) {
                    if (obj instanceof com.facebook.share.model.SharePhoto) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
    }
}
