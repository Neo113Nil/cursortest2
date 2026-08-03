package com.facebook.share.model;

/* compiled from: ShareVideo.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/facebook/share/model/ShareVideo;", "Lcom/facebook/share/model/ShareMedia;", "Lcom/facebook/share/model/ShareVideo$Builder;", "builder", "(Lcom/facebook/share/model/ShareVideo$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "localUrl", "Landroid/net/Uri;", "getLocalUrl", "()Landroid/net/Uri;", "mediaType", "Lcom/facebook/share/model/ShareMedia$Type;", "getMediaType", "()Lcom/facebook/share/model/ShareMedia$Type;", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareVideo extends com.facebook.share.model.ShareMedia<com.facebook.share.model.ShareVideo, com.facebook.share.model.ShareVideo.Builder> {
    private final android.net.Uri localUrl;
    private final com.facebook.share.model.ShareMedia.Type mediaType;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.ShareVideo> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.ShareVideo>() { // from class: com.facebook.share.model.ShareVideo$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareVideo createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.share.model.ShareVideo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareVideo[] newArray(int size) {
            return new com.facebook.share.model.ShareVideo[size];
        }
    };

    public /* synthetic */ ShareVideo(com.facebook.share.model.ShareVideo.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final android.net.Uri getLocalUrl() {
        return this.localUrl;
    }

    private ShareVideo(com.facebook.share.model.ShareVideo.Builder builder) {
        super(builder);
        this.mediaType = com.facebook.share.model.ShareMedia.Type.VIDEO;
        this.localUrl = builder.getLocalUrl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.mediaType = com.facebook.share.model.ShareMedia.Type.VIDEO;
        this.localUrl = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        out.writeParcelable(this.localUrl, 0);
    }

    @Override // com.facebook.share.model.ShareMedia
    public com.facebook.share.model.ShareMedia.Type getMediaType() {
        return this.mediaType;
    }

    /* compiled from: ShareVideo.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/facebook/share/model/ShareVideo$Builder;", "Lcom/facebook/share/model/ShareMedia$Builder;", "Lcom/facebook/share/model/ShareVideo;", "()V", "localUrl", "Landroid/net/Uri;", "getLocalUrl$facebook_common_release", "()Landroid/net/Uri;", "setLocalUrl$facebook_common_release", "(Landroid/net/Uri;)V", "build", "readFrom", "parcel", "Landroid/os/Parcel;", "readFrom$facebook_common_release", "model", "setLocalUrl", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder extends com.facebook.share.model.ShareMedia.Builder<com.facebook.share.model.ShareVideo, com.facebook.share.model.ShareVideo.Builder> {
        private android.net.Uri localUrl;

        /* renamed from: getLocalUrl$facebook_common_release, reason: from getter */
        public final android.net.Uri getLocalUrl() {
            return this.localUrl;
        }

        public final void setLocalUrl$facebook_common_release(android.net.Uri uri) {
            this.localUrl = uri;
        }

        public final com.facebook.share.model.ShareVideo.Builder setLocalUrl(android.net.Uri localUrl) {
            this.localUrl = localUrl;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.ShareVideo build() {
            return new com.facebook.share.model.ShareVideo(this, null);
        }

        @Override // com.facebook.share.model.ShareMedia.Builder, com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.ShareVideo.Builder readFrom(com.facebook.share.model.ShareVideo model) {
            return model == null ? this : setLocalUrl(model.getLocalUrl());
        }

        public final com.facebook.share.model.ShareVideo.Builder readFrom$facebook_common_release(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((com.facebook.share.model.ShareVideo) parcel.readParcelable(com.facebook.share.model.ShareVideo.class.getClassLoader()));
        }
    }
}
