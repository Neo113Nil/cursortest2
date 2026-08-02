package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/izettle/android/net/RelatedPart;", "", "", "p0", "Lcom/izettle/android/net/ContentType;", "p1", "<init>", "(Ljava/lang/String;Lcom/izettle/android/net/ContentType;)V", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RelatedPart {
    private final java.lang.String content;
    private final com.izettle.android.net.ContentType contentType;

    private RelatedPart(java.lang.String str, com.izettle.android.net.ContentType contentType) {
        this.content = str;
        this.contentType = contentType;
    }

    public final java.lang.String getContent() {
        return this.content;
    }

    public final com.izettle.android.net.ContentType getContentType() {
        return this.contentType;
    }

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/izettle/android/net/RelatedPart$Builder;", "", "<init>", "()V", "Lcom/izettle/android/net/RelatedPart;", "build", "()Lcom/izettle/android/net/RelatedPart;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "setContentType", "(Lcom/izettle/android/net/ContentType;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String content;
        private com.izettle.android.net.ContentType contentType = com.izettle.android.net.ContentType.INSTANCE.getTEXT_PLAIN_UTF_8();

        public final java.lang.String getContent() {
            return this.content;
        }

        public final void setContent(java.lang.String str) {
            this.content = str;
        }

        public final com.izettle.android.net.ContentType getContentType() {
            return this.contentType;
        }

        public final void setContentType(com.izettle.android.net.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            this.contentType = contentType;
        }

        public final com.izettle.android.net.RelatedPart build() {
            java.lang.String str = this.content;
            if (str != null) {
                return new com.izettle.android.net.RelatedPart(str, this.contentType, null);
            }
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
    }

    public /* synthetic */ RelatedPart(java.lang.String str, com.izettle.android.net.ContentType contentType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, contentType);
    }
}
