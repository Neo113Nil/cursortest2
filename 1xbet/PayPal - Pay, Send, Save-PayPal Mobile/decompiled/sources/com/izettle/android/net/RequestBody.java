package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/net/RequestBody;", "", "", "getContentLength", "()J", "contentLength", "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "inputStream", "Companion", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.net.RequestBody.Companion INSTANCE = com.izettle.android.net.RequestBody.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/izettle/android/net/RequestBody$Builder;", "", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Builder {
        com.izettle.android.net.RequestBody build();
    }

    long getContentLength();

    com.izettle.android.net.ContentType getContentType();

    java.io.InputStream getInputStream();

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/net/RequestBody$Companion;", "", "<init>", "()V", "Ljava/io/InputStream;", "inputStream", "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "contentLength", "Lcom/izettle/android/net/RequestBody;", "from", "(Ljava/io/InputStream;Lcom/izettle/android/net/ContentType;J)Lcom/izettle/android/net/RequestBody;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.net.RequestBody.Companion getHighSpeedVideoSizes = new com.izettle.android.net.RequestBody.Companion();

        private Companion() {
        }

        public final com.izettle.android.net.RequestBody from(final java.io.InputStream inputStream, final com.izettle.android.net.ContentType contentType, final long contentLength) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            return new com.izettle.android.net.RequestBody(inputStream, contentType, contentLength) { // from class: com.izettle.android.net.RequestBody$Companion$from$1
                private final long contentLength;
                private final com.izettle.android.net.ContentType contentType;
                private final java.io.InputStream inputStream;

                {
                    this.inputStream = inputStream;
                    this.contentType = contentType;
                    this.contentLength = contentLength;
                }

                @Override // com.izettle.android.net.RequestBody
                public final java.io.InputStream getInputStream() {
                    return this.inputStream;
                }

                @Override // com.izettle.android.net.RequestBody
                public final com.izettle.android.net.ContentType getContentType() {
                    return this.contentType;
                }

                @Override // com.izettle.android.net.RequestBody
                public final long getContentLength() {
                    return this.contentLength;
                }
            };
        }
    }
}
