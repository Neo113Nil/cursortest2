package com.facebook.share.model;

/* compiled from: ShareVideoContent.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001d\u001eB\u000f\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005B\u000f\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/facebook/share/model/ShareVideoContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/ShareVideoContent$Builder;", "Lcom/facebook/share/model/ShareModel;", "builder", "(Lcom/facebook/share/model/ShareVideoContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "contentDescription", "", "getContentDescription", "()Ljava/lang/String;", "contentTitle", "getContentTitle", "previewPhoto", "Lcom/facebook/share/model/SharePhoto;", "getPreviewPhoto", "()Lcom/facebook/share/model/SharePhoto;", "video", "Lcom/facebook/share/model/ShareVideo;", "getVideo", "()Lcom/facebook/share/model/ShareVideo;", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareVideoContent extends com.facebook.share.model.ShareContent<com.facebook.share.model.ShareVideoContent, com.facebook.share.model.ShareVideoContent.Builder> implements com.facebook.share.model.ShareModel {
    private final java.lang.String contentDescription;
    private final java.lang.String contentTitle;
    private final com.facebook.share.model.SharePhoto previewPhoto;
    private final com.facebook.share.model.ShareVideo video;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.ShareVideoContent> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.ShareVideoContent>() { // from class: com.facebook.share.model.ShareVideoContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareVideoContent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new com.facebook.share.model.ShareVideoContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareVideoContent[] newArray(int size) {
            return new com.facebook.share.model.ShareVideoContent[size];
        }
    };

    public /* synthetic */ ShareVideoContent(com.facebook.share.model.ShareVideoContent.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final java.lang.String getContentTitle() {
        return this.contentTitle;
    }

    public final com.facebook.share.model.SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    public final com.facebook.share.model.ShareVideo getVideo() {
        return this.video;
    }

    private ShareVideoContent(com.facebook.share.model.ShareVideoContent.Builder builder) {
        super(builder);
        this.contentDescription = builder.getContentDescription();
        this.contentTitle = builder.getContentTitle();
        this.previewPhoto = builder.getPreviewPhoto();
        this.video = builder.getVideo();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(android.os.Parcel parcel) {
        super(parcel);
        com.facebook.share.model.SharePhoto build;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        com.facebook.share.model.SharePhoto.Builder readFrom$facebook_common_release = new com.facebook.share.model.SharePhoto.Builder().readFrom$facebook_common_release(parcel);
        if (readFrom$facebook_common_release.getImageUrl() != null || readFrom$facebook_common_release.getBitmap() != null) {
            build = readFrom$facebook_common_release.build();
        } else {
            build = null;
        }
        this.previewPhoto = build;
        this.video = new com.facebook.share.model.ShareVideo.Builder().readFrom$facebook_common_release(parcel).build();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        out.writeString(this.contentDescription);
        out.writeString(this.contentTitle);
        out.writeParcelable(this.previewPhoto, 0);
        out.writeParcelable(this.video, 0);
    }

    /* compiled from: ShareVideoContent.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/facebook/share/model/ShareVideoContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/ShareVideoContent;", "()V", "contentDescription", "", "getContentDescription$facebook_common_release", "()Ljava/lang/String;", "setContentDescription$facebook_common_release", "(Ljava/lang/String;)V", "contentTitle", "getContentTitle$facebook_common_release", "setContentTitle$facebook_common_release", "previewPhoto", "Lcom/facebook/share/model/SharePhoto;", "getPreviewPhoto$facebook_common_release", "()Lcom/facebook/share/model/SharePhoto;", "setPreviewPhoto$facebook_common_release", "(Lcom/facebook/share/model/SharePhoto;)V", "video", "Lcom/facebook/share/model/ShareVideo;", "getVideo$facebook_common_release", "()Lcom/facebook/share/model/ShareVideo;", "setVideo$facebook_common_release", "(Lcom/facebook/share/model/ShareVideo;)V", "build", "readFrom", "content", "setContentDescription", "setContentTitle", "setPreviewPhoto", "setVideo", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder extends com.facebook.share.model.ShareContent.Builder<com.facebook.share.model.ShareVideoContent, com.facebook.share.model.ShareVideoContent.Builder> {
        private java.lang.String contentDescription;
        private java.lang.String contentTitle;
        private com.facebook.share.model.SharePhoto previewPhoto;
        private com.facebook.share.model.ShareVideo video;

        /* renamed from: getContentDescription$facebook_common_release, reason: from getter */
        public final java.lang.String getContentDescription() {
            return this.contentDescription;
        }

        public final void setContentDescription$facebook_common_release(java.lang.String str) {
            this.contentDescription = str;
        }

        /* renamed from: getContentTitle$facebook_common_release, reason: from getter */
        public final java.lang.String getContentTitle() {
            return this.contentTitle;
        }

        public final void setContentTitle$facebook_common_release(java.lang.String str) {
            this.contentTitle = str;
        }

        /* renamed from: getPreviewPhoto$facebook_common_release, reason: from getter */
        public final com.facebook.share.model.SharePhoto getPreviewPhoto() {
            return this.previewPhoto;
        }

        public final void setPreviewPhoto$facebook_common_release(com.facebook.share.model.SharePhoto sharePhoto) {
            this.previewPhoto = sharePhoto;
        }

        /* renamed from: getVideo$facebook_common_release, reason: from getter */
        public final com.facebook.share.model.ShareVideo getVideo() {
            return this.video;
        }

        public final void setVideo$facebook_common_release(com.facebook.share.model.ShareVideo shareVideo) {
            this.video = shareVideo;
        }

        public final com.facebook.share.model.ShareVideoContent.Builder setContentDescription(java.lang.String contentDescription) {
            this.contentDescription = contentDescription;
            return this;
        }

        public final com.facebook.share.model.ShareVideoContent.Builder setContentTitle(java.lang.String contentTitle) {
            this.contentTitle = contentTitle;
            return this;
        }

        public final com.facebook.share.model.ShareVideoContent.Builder setPreviewPhoto(com.facebook.share.model.SharePhoto previewPhoto) {
            this.previewPhoto = previewPhoto == null ? null : new com.facebook.share.model.SharePhoto.Builder().readFrom(previewPhoto).build();
            return this;
        }

        public final com.facebook.share.model.ShareVideoContent.Builder setVideo(com.facebook.share.model.ShareVideo video) {
            if (video == null) {
                return this;
            }
            this.video = new com.facebook.share.model.ShareVideo.Builder().readFrom(video).build();
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.ShareVideoContent build() {
            return new com.facebook.share.model.ShareVideoContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.ShareVideoContent.Builder readFrom(com.facebook.share.model.ShareVideoContent content) {
            return content == null ? this : ((com.facebook.share.model.ShareVideoContent.Builder) super.readFrom((com.facebook.share.model.ShareVideoContent.Builder) content)).setContentDescription(content.getContentDescription()).setContentTitle(content.getContentTitle()).setPreviewPhoto(content.getPreviewPhoto()).setVideo(content.getVideo());
        }
    }
}
