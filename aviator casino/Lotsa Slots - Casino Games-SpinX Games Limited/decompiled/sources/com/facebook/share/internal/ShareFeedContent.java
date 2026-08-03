package com.facebook.share.internal;

/* compiled from: ShareFeedContent.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0019H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b¨\u0006 "}, d2 = {"Lcom/facebook/share/internal/ShareFeedContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/internal/ShareFeedContent$Builder;", "builder", "(Lcom/facebook/share/internal/ShareFeedContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "link", "", "getLink", "()Ljava/lang/String;", "linkCaption", "getLinkCaption", "linkDescription", "getLinkDescription", "linkName", "getLinkName", "mediaSource", "getMediaSource", "picture", "getPicture", "toId", "getToId", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareFeedContent extends com.facebook.share.model.ShareContent<com.facebook.share.internal.ShareFeedContent, com.facebook.share.internal.ShareFeedContent.Builder> {
    private final java.lang.String link;
    private final java.lang.String linkCaption;
    private final java.lang.String linkDescription;
    private final java.lang.String linkName;
    private final java.lang.String mediaSource;
    private final java.lang.String picture;
    private final java.lang.String toId;
    public static final android.os.Parcelable.Creator<com.facebook.share.internal.ShareFeedContent> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.internal.ShareFeedContent>() { // from class: com.facebook.share.internal.ShareFeedContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.internal.ShareFeedContent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new com.facebook.share.internal.ShareFeedContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.internal.ShareFeedContent[] newArray(int size) {
            return new com.facebook.share.internal.ShareFeedContent[size];
        }
    };

    public /* synthetic */ ShareFeedContent(com.facebook.share.internal.ShareFeedContent.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getToId() {
        return this.toId;
    }

    public final java.lang.String getLink() {
        return this.link;
    }

    public final java.lang.String getLinkName() {
        return this.linkName;
    }

    public final java.lang.String getLinkCaption() {
        return this.linkCaption;
    }

    public final java.lang.String getLinkDescription() {
        return this.linkDescription;
    }

    public final java.lang.String getPicture() {
        return this.picture;
    }

    public final java.lang.String getMediaSource() {
        return this.mediaSource;
    }

    private ShareFeedContent(com.facebook.share.internal.ShareFeedContent.Builder builder) {
        super(builder);
        this.toId = builder.getToId();
        this.link = builder.getLink();
        this.linkName = builder.getLinkName();
        this.linkCaption = builder.getLinkCaption();
        this.linkDescription = builder.getLinkDescription();
        this.picture = builder.getPicture();
        this.mediaSource = builder.getMediaSource();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        out.writeString(this.toId);
        out.writeString(this.link);
        out.writeString(this.linkName);
        out.writeString(this.linkCaption);
        out.writeString(this.linkDescription);
        out.writeString(this.picture);
        out.writeString(this.mediaSource);
    }

    /* compiled from: ShareFeedContent.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010!\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005J\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006&"}, d2 = {"Lcom/facebook/share/internal/ShareFeedContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/internal/ShareFeedContent;", "()V", "link", "", "getLink$facebook_common_release", "()Ljava/lang/String;", "setLink$facebook_common_release", "(Ljava/lang/String;)V", "linkCaption", "getLinkCaption$facebook_common_release", "setLinkCaption$facebook_common_release", "linkDescription", "getLinkDescription$facebook_common_release", "setLinkDescription$facebook_common_release", "linkName", "getLinkName$facebook_common_release", "setLinkName$facebook_common_release", "mediaSource", "getMediaSource$facebook_common_release", "setMediaSource$facebook_common_release", "picture", "getPicture$facebook_common_release", "setPicture$facebook_common_release", "toId", "getToId$facebook_common_release", "setToId$facebook_common_release", "build", "readFrom", "content", "setLink", "setLinkCaption", "setLinkDescription", "setLinkName", "setMediaSource", "setPicture", "setToId", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder extends com.facebook.share.model.ShareContent.Builder<com.facebook.share.internal.ShareFeedContent, com.facebook.share.internal.ShareFeedContent.Builder> {
        private java.lang.String link;
        private java.lang.String linkCaption;
        private java.lang.String linkDescription;
        private java.lang.String linkName;
        private java.lang.String mediaSource;
        private java.lang.String picture;
        private java.lang.String toId;

        /* renamed from: getToId$facebook_common_release, reason: from getter */
        public final java.lang.String getToId() {
            return this.toId;
        }

        public final void setToId$facebook_common_release(java.lang.String str) {
            this.toId = str;
        }

        /* renamed from: getLink$facebook_common_release, reason: from getter */
        public final java.lang.String getLink() {
            return this.link;
        }

        public final void setLink$facebook_common_release(java.lang.String str) {
            this.link = str;
        }

        /* renamed from: getLinkName$facebook_common_release, reason: from getter */
        public final java.lang.String getLinkName() {
            return this.linkName;
        }

        public final void setLinkName$facebook_common_release(java.lang.String str) {
            this.linkName = str;
        }

        /* renamed from: getLinkCaption$facebook_common_release, reason: from getter */
        public final java.lang.String getLinkCaption() {
            return this.linkCaption;
        }

        public final void setLinkCaption$facebook_common_release(java.lang.String str) {
            this.linkCaption = str;
        }

        /* renamed from: getLinkDescription$facebook_common_release, reason: from getter */
        public final java.lang.String getLinkDescription() {
            return this.linkDescription;
        }

        public final void setLinkDescription$facebook_common_release(java.lang.String str) {
            this.linkDescription = str;
        }

        /* renamed from: getPicture$facebook_common_release, reason: from getter */
        public final java.lang.String getPicture() {
            return this.picture;
        }

        public final void setPicture$facebook_common_release(java.lang.String str) {
            this.picture = str;
        }

        /* renamed from: getMediaSource$facebook_common_release, reason: from getter */
        public final java.lang.String getMediaSource() {
            return this.mediaSource;
        }

        public final void setMediaSource$facebook_common_release(java.lang.String str) {
            this.mediaSource = str;
        }

        public final com.facebook.share.internal.ShareFeedContent.Builder setToId(java.lang.String toId) {
            this.toId = toId;
            return this;
        }

        public final com.facebook.share.internal.ShareFeedContent.Builder setLink(java.lang.String link) {
            this.link = link;
            return this;
        }

        public final com.facebook.share.internal.ShareFeedContent.Builder setLinkName(java.lang.String linkName) {
            this.linkName = linkName;
            return this;
        }

        public final com.facebook.share.internal.ShareFeedContent.Builder setLinkCaption(java.lang.String linkCaption) {
            this.linkCaption = linkCaption;
            return this;
        }

        public final com.facebook.share.internal.ShareFeedContent.Builder setLinkDescription(java.lang.String linkDescription) {
            this.linkDescription = linkDescription;
            return this;
        }

        public final com.facebook.share.internal.ShareFeedContent.Builder setPicture(java.lang.String picture) {
            this.picture = picture;
            return this;
        }

        public final com.facebook.share.internal.ShareFeedContent.Builder setMediaSource(java.lang.String mediaSource) {
            this.mediaSource = mediaSource;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.internal.ShareFeedContent build() {
            return new com.facebook.share.internal.ShareFeedContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.internal.ShareFeedContent.Builder readFrom(com.facebook.share.internal.ShareFeedContent content) {
            return content == null ? this : ((com.facebook.share.internal.ShareFeedContent.Builder) super.readFrom((com.facebook.share.internal.ShareFeedContent.Builder) content)).setToId(content.getToId()).setLink(content.getLink()).setLinkName(content.getLinkName()).setLinkCaption(content.getLinkCaption()).setLinkDescription(content.getLinkDescription()).setPicture(content.getPicture()).setMediaSource(content.getMediaSource());
        }
    }
}
