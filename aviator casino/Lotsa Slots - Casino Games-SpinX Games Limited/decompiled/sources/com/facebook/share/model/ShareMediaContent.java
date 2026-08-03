package com.facebook.share.model;

/* compiled from: ShareMediaContent.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/facebook/share/model/ShareMediaContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/ShareMediaContent$Builder;", "builder", "(Lcom/facebook/share/model/ShareMediaContent$Builder;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "media", "", "Lcom/facebook/share/model/ShareMedia;", "getMedia", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareMediaContent extends com.facebook.share.model.ShareContent<com.facebook.share.model.ShareMediaContent, com.facebook.share.model.ShareMediaContent.Builder> {
    private final java.util.List<com.facebook.share.model.ShareMedia<?, ?>> media;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.ShareMediaContent> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.ShareMediaContent>() { // from class: com.facebook.share.model.ShareMediaContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareMediaContent createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.share.model.ShareMediaContent(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.ShareMediaContent[] newArray(int size) {
            return new com.facebook.share.model.ShareMediaContent[size];
        }
    };

    public /* synthetic */ ShareMediaContent(com.facebook.share.model.ShareMediaContent.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.util.List<com.facebook.share.model.ShareMedia<?, ?>> getMedia() {
        return this.media;
    }

    private ShareMediaContent(com.facebook.share.model.ShareMediaContent.Builder builder) {
        super(builder);
        this.media = kotlin.collections.CollectionsKt.toList(builder.getMedia$facebook_common_release());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMediaContent(android.os.Parcel source) {
        super(source);
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        android.os.Parcelable[] readParcelableArray = source.readParcelableArray(com.facebook.share.model.ShareMedia.class.getClassLoader());
        if (readParcelableArray == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (android.os.Parcelable parcelable : readParcelableArray) {
                com.facebook.share.model.ShareMedia shareMedia = (com.facebook.share.model.ShareMedia) parcelable;
                if (shareMedia != null) {
                    arrayList2.add(shareMedia);
                }
            }
            arrayList = arrayList2;
        }
        this.media = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, flags);
        java.lang.Object[] array = this.media.toArray(new com.facebook.share.model.ShareMedia[0]);
        if (array != null) {
            out.writeParcelableArray((android.os.Parcelable[]) array, flags);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* compiled from: ShareMediaContent.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0018\u00010\nJ\u0018\u0010\u000b\u001a\u00020\u00002\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0010\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0018\u00010\nR\"\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/facebook/share/model/ShareMediaContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/ShareMediaContent;", "()V", "media", "", "Lcom/facebook/share/model/ShareMedia;", "getMedia$facebook_common_release", "()Ljava/util/List;", "addMedia", "", "addMedium", "medium", "build", "readFrom", "content", "setMedia", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder extends com.facebook.share.model.ShareContent.Builder<com.facebook.share.model.ShareMediaContent, com.facebook.share.model.ShareMediaContent.Builder> {
        private final java.util.List<com.facebook.share.model.ShareMedia<?, ?>> media = new java.util.ArrayList();

        public final java.util.List<com.facebook.share.model.ShareMedia<?, ?>> getMedia$facebook_common_release() {
            return this.media;
        }

        public final com.facebook.share.model.ShareMediaContent.Builder addMedium(com.facebook.share.model.ShareMedia<?, ?> medium) {
            com.facebook.share.model.ShareVideo build;
            if (medium != null) {
                if (medium instanceof com.facebook.share.model.SharePhoto) {
                    build = new com.facebook.share.model.SharePhoto.Builder().readFrom((com.facebook.share.model.SharePhoto) medium).build();
                } else if (medium instanceof com.facebook.share.model.ShareVideo) {
                    build = new com.facebook.share.model.ShareVideo.Builder().readFrom((com.facebook.share.model.ShareVideo) medium).build();
                } else {
                    throw new java.lang.IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
                }
                this.media.add(build);
            }
            return this;
        }

        public final com.facebook.share.model.ShareMediaContent.Builder addMedia(java.util.List<? extends com.facebook.share.model.ShareMedia<?, ?>> media) {
            if (media != null) {
                java.util.Iterator<? extends com.facebook.share.model.ShareMedia<?, ?>> it = media.iterator();
                while (it.hasNext()) {
                    addMedium(it.next());
                }
            }
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.ShareMediaContent build() {
            return new com.facebook.share.model.ShareMediaContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.ShareMediaContent.Builder readFrom(com.facebook.share.model.ShareMediaContent content) {
            return content == null ? this : ((com.facebook.share.model.ShareMediaContent.Builder) super.readFrom((com.facebook.share.model.ShareMediaContent.Builder) content)).addMedia(content.getMedia());
        }

        public final com.facebook.share.model.ShareMediaContent.Builder setMedia(java.util.List<? extends com.facebook.share.model.ShareMedia<?, ?>> media) {
            this.media.clear();
            addMedia(media);
            return this;
        }
    }
}
