package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/izettle/android/net/MultiPartBody;", "Lcom/izettle/android/net/RequestBody;", "Ljava/io/InputStream;", "p0", "Lcom/izettle/android/net/ContentType;", "p1", "", "p2", "<init>", "(Ljava/io/InputStream;Lcom/izettle/android/net/ContentType;J)V", "contentLength", "J", "getContentLength", "()J", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/izettle/android/net/ContentType;", "getContentType", "()Lcom/izettle/android/net/ContentType;", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MultiPartBody implements com.izettle.android.net.RequestBody {
    private final long contentLength;
    private final com.izettle.android.net.ContentType contentType;
    private final java.io.InputStream inputStream;

    private MultiPartBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j) {
        this.inputStream = inputStream;
        this.contentType = contentType;
        this.contentLength = j;
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

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011"}, d2 = {"Lcom/izettle/android/net/MultiPartBody$Builder;", "Lcom/izettle/android/net/MultiPart$Builder;", "TBuilder", "Lcom/izettle/android/net/RequestBody$Builder;", "p0", "<init>", "(Lcom/izettle/android/net/MultiPart$Builder;)V", "Lcom/izettle/android/net/MultiPartBody;", "build", "()Lcom/izettle/android/net/MultiPartBody;", "multiPartBuilder", "Lcom/izettle/android/net/MultiPart$Builder;", "getMultiPartBuilder", "()Lcom/izettle/android/net/MultiPart$Builder;", "FormData", "Related", "Lcom/izettle/android/net/MultiPartBody$Builder$FormData;", "Lcom/izettle/android/net/MultiPartBody$Builder$Related;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Builder<TBuilder extends com.izettle.android.net.MultiPart.Builder> implements com.izettle.android.net.RequestBody.Builder {
        private final TBuilder multiPartBuilder;

        private Builder(TBuilder tbuilder) {
            this.multiPartBuilder = tbuilder;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/izettle/android/net/MultiPartBody$Builder$FormData;", "Lcom/izettle/android/net/MultiPartBody$Builder;", "Lcom/izettle/android/net/MultiPart$Builder$FormData;", "<init>", "()V", "Lkotlin/Function1;", "Lcom/izettle/android/net/FormDataFieldPart$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "field", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/MultiPartBody$Builder$FormData;", "Lcom/izettle/android/net/FormDataFilePart$Builder;", "file"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FormData extends com.izettle.android.net.MultiPartBody.Builder<com.izettle.android.net.MultiPart.Builder.FormData> {
            public FormData() {
                super(new com.izettle.android.net.MultiPart.Builder.FormData(), null);
            }

            public final com.izettle.android.net.MultiPartBody.Builder.FormData field(kotlin.jvm.functions.Function1<? super com.izettle.android.net.FormDataFieldPart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                getMultiPartBuilder().field(block);
                return this;
            }

            public final com.izettle.android.net.MultiPartBody.Builder.FormData file(kotlin.jvm.functions.Function1<? super com.izettle.android.net.FormDataFilePart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                getMultiPartBuilder().file(block);
                return this;
            }
        }

        public final TBuilder getMultiPartBuilder() {
            return this.multiPartBuilder;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/izettle/android/net/MultiPartBody$Builder$Related;", "Lcom/izettle/android/net/MultiPartBody$Builder;", "Lcom/izettle/android/net/MultiPart$Builder$Related;", "<init>", "()V", "Lkotlin/Function1;", "Lcom/izettle/android/net/RelatedFilePart$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "file", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/MultiPartBody$Builder$Related;", "Lcom/izettle/android/net/RelatedPart$Builder;", "part"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Related extends com.izettle.android.net.MultiPartBody.Builder<com.izettle.android.net.MultiPart.Builder.Related> {
            public Related() {
                super(new com.izettle.android.net.MultiPart.Builder.Related(), null);
            }

            public final com.izettle.android.net.MultiPartBody.Builder.Related part(kotlin.jvm.functions.Function1<? super com.izettle.android.net.RelatedPart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                getMultiPartBuilder().part(block);
                return this;
            }

            public final com.izettle.android.net.MultiPartBody.Builder.Related file(kotlin.jvm.functions.Function1<? super com.izettle.android.net.RelatedFilePart.Builder, kotlin.Unit> block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                getMultiPartBuilder().file(block);
                return this;
            }
        }

        @Override // com.izettle.android.net.RequestBody.Builder
        public com.izettle.android.net.MultiPartBody build() {
            com.izettle.android.net.MultiPart build = this.multiPartBuilder.build();
            return new com.izettle.android.net.MultiPartBody(build.getInputStream(), new com.izettle.android.net.ContentType(build.getMediaType(), null), build.getContentLength(), null);
        }

        public /* synthetic */ Builder(com.izettle.android.net.MultiPart.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }

    public /* synthetic */ MultiPartBody(java.io.InputStream inputStream, com.izettle.android.net.ContentType contentType, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, contentType, j);
    }
}
