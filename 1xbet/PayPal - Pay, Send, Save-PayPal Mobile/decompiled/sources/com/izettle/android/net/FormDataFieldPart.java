package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/izettle/android/net/FormDataFieldPart;", "", "", "p0", "p1", "Lcom/izettle/android/net/ContentType;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/izettle/android/net/ContentType;)V", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FormDataFieldPart {
    private final com.izettle.android.net.ContentType contentType;
    private final java.lang.String name;
    private final java.lang.String value;

    private FormDataFieldPart(java.lang.String str, java.lang.String str2, com.izettle.android.net.ContentType contentType) {
        this.name = str;
        this.value = str2;
        this.contentType = contentType;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final com.izettle.android.net.ContentType getContentType() {
        return this.contentType;
    }

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014"}, d2 = {"Lcom/izettle/android/net/FormDataFieldPart$Builder;", "", "<init>", "()V", "Lcom/izettle/android/net/FormDataFieldPart;", "build", "()Lcom/izettle/android/net/FormDataFieldPart;", "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "setContentType", "(Lcom/izettle/android/net/ContentType;)V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "setValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private com.izettle.android.net.ContentType contentType = com.izettle.android.net.ContentType.INSTANCE.getTEXT_PLAIN_UTF_8();
        private java.lang.String name;
        private java.lang.String value;

        public final java.lang.String getName() {
            return this.name;
        }

        public final void setName(java.lang.String str) {
            this.name = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final void setValue(java.lang.String str) {
            this.value = str;
        }

        public final com.izettle.android.net.ContentType getContentType() {
            return this.contentType;
        }

        public final void setContentType(com.izettle.android.net.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            this.contentType = contentType;
        }

        public final com.izettle.android.net.FormDataFieldPart build() {
            java.lang.String str = this.name;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            java.lang.String str2 = this.value;
            if (str2 != null) {
                return new com.izettle.android.net.FormDataFieldPart(str, str2, this.contentType, null);
            }
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
    }

    public /* synthetic */ FormDataFieldPart(java.lang.String str, java.lang.String str2, com.izettle.android.net.ContentType contentType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, contentType);
    }
}
