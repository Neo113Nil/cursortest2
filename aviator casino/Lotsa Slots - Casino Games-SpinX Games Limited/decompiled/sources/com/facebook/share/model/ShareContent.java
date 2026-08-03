package com.facebook.share.model;

/* compiled from: ShareContent.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0000*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004:\u0001%B\u001b\b\u0014\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\u0010\u0006B\u000f\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001fH\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/facebook/share/model/ShareContent;", "M", "B", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/ShareModel;", "builder", "(Lcom/facebook/share/model/ShareContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "contentUrl", "Landroid/net/Uri;", "getContentUrl", "()Landroid/net/Uri;", "pageId", "", "getPageId", "()Ljava/lang/String;", "peopleIds", "", "getPeopleIds", "()Ljava/util/List;", "placeId", "getPlaceId", "ref", "getRef", "shareHashtag", "Lcom/facebook/share/model/ShareHashtag;", "getShareHashtag", "()Lcom/facebook/share/model/ShareHashtag;", "describeContents", "", "readUnmodifiableStringList", "writeToParcel", "", "out", "flags", "Builder", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ShareContent<M extends com.facebook.share.model.ShareContent<M, B>, B extends com.facebook.share.model.ShareContent.Builder<M, B>> implements com.facebook.share.model.ShareModel {
    private final android.net.Uri contentUrl;
    private final java.lang.String pageId;
    private final java.util.List<java.lang.String> peopleIds;
    private final java.lang.String placeId;
    private final java.lang.String ref;
    private final com.facebook.share.model.ShareHashtag shareHashtag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final android.net.Uri getContentUrl() {
        return this.contentUrl;
    }

    public final java.util.List<java.lang.String> getPeopleIds() {
        return this.peopleIds;
    }

    public final java.lang.String getPlaceId() {
        return this.placeId;
    }

    public final java.lang.String getPageId() {
        return this.pageId;
    }

    public final java.lang.String getRef() {
        return this.ref;
    }

    public final com.facebook.share.model.ShareHashtag getShareHashtag() {
        return this.shareHashtag;
    }

    protected ShareContent(com.facebook.share.model.ShareContent.Builder<M, B> builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        this.contentUrl = builder.getContentUrl();
        this.peopleIds = builder.getPeopleIds$facebook_common_release();
        this.placeId = builder.getPlaceId();
        this.pageId = builder.getPageId();
        this.ref = builder.getRef();
        this.shareHashtag = builder.getHashtag();
    }

    protected ShareContent(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.contentUrl = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
        this.peopleIds = readUnmodifiableStringList(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.shareHashtag = new com.facebook.share.model.ShareHashtag.Builder().readFrom$facebook_common_release(parcel).build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.contentUrl, 0);
        out.writeStringList(this.peopleIds);
        out.writeString(this.placeId);
        out.writeString(this.pageId);
        out.writeString(this.ref);
        out.writeParcelable(this.shareHashtag, 0);
    }

    private final java.util.List<java.lang.String> readUnmodifiableStringList(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    /* compiled from: ShareContent.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0019\b&\u0018\u0000*\u0014\b\u0002\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00002\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0017\u0010$\u001a\u00028\u00032\b\u0010%\u001a\u0004\u0018\u00018\u0002H\u0016¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00028\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00028\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010*J\u001b\u0010+\u001a\u00028\u00032\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00028\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010*J\u0015\u0010.\u001a\u00028\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010*J\u0015\u0010/\u001a\u00028\u00032\b\u00100\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00101R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010!\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u00062"}, d2 = {"Lcom/facebook/share/model/ShareContent$Builder;", "M", "Lcom/facebook/share/model/ShareContent;", "B", "Lcom/facebook/share/model/ShareModelBuilder;", "()V", "contentUrl", "Landroid/net/Uri;", "getContentUrl$facebook_common_release", "()Landroid/net/Uri;", "setContentUrl$facebook_common_release", "(Landroid/net/Uri;)V", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_HASHTAG, "Lcom/facebook/share/model/ShareHashtag;", "getHashtag$facebook_common_release", "()Lcom/facebook/share/model/ShareHashtag;", "setHashtag$facebook_common_release", "(Lcom/facebook/share/model/ShareHashtag;)V", "pageId", "", "getPageId$facebook_common_release", "()Ljava/lang/String;", "setPageId$facebook_common_release", "(Ljava/lang/String;)V", "peopleIds", "", "getPeopleIds$facebook_common_release", "()Ljava/util/List;", "setPeopleIds$facebook_common_release", "(Ljava/util/List;)V", "placeId", "getPlaceId$facebook_common_release", "setPlaceId$facebook_common_release", "ref", "getRef$facebook_common_release", "setRef$facebook_common_release", "readFrom", "content", "(Lcom/facebook/share/model/ShareContent;)Lcom/facebook/share/model/ShareContent$Builder;", "setContentUrl", "(Landroid/net/Uri;)Lcom/facebook/share/model/ShareContent$Builder;", "setPageId", "(Ljava/lang/String;)Lcom/facebook/share/model/ShareContent$Builder;", "setPeopleIds", "(Ljava/util/List;)Lcom/facebook/share/model/ShareContent$Builder;", "setPlaceId", "setRef", "setShareHashtag", "shareHashtag", "(Lcom/facebook/share/model/ShareHashtag;)Lcom/facebook/share/model/ShareContent$Builder;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class Builder<M extends com.facebook.share.model.ShareContent<M, B>, B extends com.facebook.share.model.ShareContent.Builder<M, B>> implements com.facebook.share.model.ShareModelBuilder<M, B> {
        private android.net.Uri contentUrl;
        private com.facebook.share.model.ShareHashtag hashtag;
        private java.lang.String pageId;
        private java.util.List<java.lang.String> peopleIds;
        private java.lang.String placeId;
        private java.lang.String ref;

        /* renamed from: getContentUrl$facebook_common_release, reason: from getter */
        public final android.net.Uri getContentUrl() {
            return this.contentUrl;
        }

        public final void setContentUrl$facebook_common_release(android.net.Uri uri) {
            this.contentUrl = uri;
        }

        public final java.util.List<java.lang.String> getPeopleIds$facebook_common_release() {
            return this.peopleIds;
        }

        public final void setPeopleIds$facebook_common_release(java.util.List<java.lang.String> list) {
            this.peopleIds = list;
        }

        /* renamed from: getPlaceId$facebook_common_release, reason: from getter */
        public final java.lang.String getPlaceId() {
            return this.placeId;
        }

        public final void setPlaceId$facebook_common_release(java.lang.String str) {
            this.placeId = str;
        }

        /* renamed from: getPageId$facebook_common_release, reason: from getter */
        public final java.lang.String getPageId() {
            return this.pageId;
        }

        public final void setPageId$facebook_common_release(java.lang.String str) {
            this.pageId = str;
        }

        /* renamed from: getRef$facebook_common_release, reason: from getter */
        public final java.lang.String getRef() {
            return this.ref;
        }

        public final void setRef$facebook_common_release(java.lang.String str) {
            this.ref = str;
        }

        /* renamed from: getHashtag$facebook_common_release, reason: from getter */
        public final com.facebook.share.model.ShareHashtag getHashtag() {
            return this.hashtag;
        }

        public final void setHashtag$facebook_common_release(com.facebook.share.model.ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
        }

        public final B setContentUrl(android.net.Uri contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }

        public final B setPeopleIds(java.util.List<java.lang.String> peopleIds) {
            this.peopleIds = peopleIds == null ? null : java.util.Collections.unmodifiableList(peopleIds);
            return this;
        }

        public final B setPlaceId(java.lang.String placeId) {
            this.placeId = placeId;
            return this;
        }

        public final B setPageId(java.lang.String pageId) {
            this.pageId = pageId;
            return this;
        }

        public final B setRef(java.lang.String ref) {
            this.ref = ref;
            return this;
        }

        public final B setShareHashtag(com.facebook.share.model.ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public B readFrom(M content) {
            return content == null ? this : (B) setContentUrl(content.getContentUrl()).setPeopleIds(content.getPeopleIds()).setPlaceId(content.getPlaceId()).setPageId(content.getPageId()).setRef(content.getRef()).setShareHashtag(content.getShareHashtag());
        }
    }
}
