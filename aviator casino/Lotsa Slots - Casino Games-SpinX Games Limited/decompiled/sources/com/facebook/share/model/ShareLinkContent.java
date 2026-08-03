package com.facebook.share.model;

/* compiled from: ShareLinkContent.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/facebook/share/model/ShareLinkContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/ShareLinkContent$Builder;", "builder", "(Lcom/facebook/share/model/ShareLinkContent$Builder;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_QUOTE, "", "getQuote", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareLinkContent extends com.facebook.share.model.ShareContent<com.facebook.share.model.ShareLinkContent, com.facebook.share.model.ShareLinkContent.Builder> {
    private final java.lang.String quote;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.ShareLinkContent> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.ShareLinkContent>() { // from class: com.facebook.share.model.ShareLinkContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareLinkContent createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.share.model.ShareLinkContent(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareLinkContent[] newArray(int size) {
            return new com.facebook.share.model.ShareLinkContent[size];
        }
    };

    public /* synthetic */ ShareLinkContent(com.facebook.share.model.ShareLinkContent.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getQuote() {
        return this.quote;
    }

    private ShareLinkContent(com.facebook.share.model.ShareLinkContent.Builder builder) {
        super(builder);
        this.quote = builder.getQuote();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.quote = source.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        out.writeString(this.quote);
    }

    /* compiled from: ShareLinkContent.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/facebook/share/model/ShareLinkContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/ShareLinkContent;", "()V", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_QUOTE, "", "getQuote$facebook_common_release", "()Ljava/lang/String;", "setQuote$facebook_common_release", "(Ljava/lang/String;)V", "build", "readFrom", "model", "setQuote", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder extends com.facebook.share.model.ShareContent.Builder<com.facebook.share.model.ShareLinkContent, com.facebook.share.model.ShareLinkContent.Builder> {
        private java.lang.String quote;

        /* renamed from: getQuote$facebook_common_release, reason: from getter */
        public final java.lang.String getQuote() {
            return this.quote;
        }

        public final void setQuote$facebook_common_release(java.lang.String str) {
            this.quote = str;
        }

        public final com.facebook.share.model.ShareLinkContent.Builder setQuote(java.lang.String quote) {
            this.quote = quote;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.ShareLinkContent build() {
            return new com.facebook.share.model.ShareLinkContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.ShareLinkContent.Builder readFrom(com.facebook.share.model.ShareLinkContent model) {
            return model == null ? this : ((com.facebook.share.model.ShareLinkContent.Builder) super.readFrom((com.facebook.share.model.ShareLinkContent.Builder) model)).setQuote(model.getQuote());
        }
    }
}
