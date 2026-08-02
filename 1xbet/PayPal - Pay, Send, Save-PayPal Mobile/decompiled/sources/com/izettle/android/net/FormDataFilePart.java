package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0019B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Lcom/izettle/android/net/FormDataFilePart;", "", "", "p0", "Ljava/io/File;", "p1", "p2", "Lcom/izettle/android/net/ContentType;", "p3", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/izettle/android/net/ContentType;)V", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "fileName", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "name", "getName", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FormDataFilePart {
    private final com.izettle.android.net.ContentType contentType;
    private final java.io.File file;
    private final java.lang.String fileName;
    private final java.lang.String name;

    private FormDataFilePart(java.lang.String str, java.io.File file, java.lang.String str2, com.izettle.android.net.ContentType contentType) {
        this.name = str;
        this.file = file;
        this.fileName = str2;
        this.contentType = contentType;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final com.izettle.android.net.ContentType getContentType() {
        return this.contentType;
    }

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b"}, d2 = {"Lcom/izettle/android/net/FormDataFilePart$Builder;", "", "<init>", "()V", "Lcom/izettle/android/net/FormDataFilePart;", "build", "()Lcom/izettle/android/net/FormDataFilePart;", "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "setContentType", "(Lcom/izettle/android/net/ContentType;)V", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "", "fileName", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "name", "getName", "setName"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private com.izettle.android.net.ContentType contentType = com.izettle.android.net.ContentType.INSTANCE.getAPPLICATION_OCTET_STREAM();
        private java.io.File file;
        private java.lang.String fileName;
        private java.lang.String name;

        public final java.lang.String getName() {
            return this.name;
        }

        public final void setName(java.lang.String str) {
            this.name = str;
        }

        public final java.io.File getFile() {
            return this.file;
        }

        public final void setFile(java.io.File file) {
            this.file = file;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final void setFileName(java.lang.String str) {
            this.fileName = str;
        }

        public final com.izettle.android.net.ContentType getContentType() {
            return this.contentType;
        }

        public final void setContentType(com.izettle.android.net.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            this.contentType = contentType;
        }

        public final com.izettle.android.net.FormDataFilePart build() {
            java.lang.String str = this.name;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            java.io.File file = this.file;
            if (file == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            java.lang.String str2 = this.fileName;
            if (str2 == null) {
                if (file == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                str2 = file.getName();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            return new com.izettle.android.net.FormDataFilePart(str, file, str2, this.contentType, null);
        }
    }

    public /* synthetic */ FormDataFilePart(java.lang.String str, java.io.File file, java.lang.String str2, com.izettle.android.net.ContentType contentType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, file, str2, contentType);
    }
}
