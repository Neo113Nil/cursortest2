package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/apollographql/apollo/api/http/ByteStringHttpBody;", "Lcom/apollographql/apollo/api/http/HttpBody;", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lokio/ByteString;", "byteString", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "string", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/BufferedSink;", "bufferedSink", "", "writeTo", "(Lokio/BufferedSink;)V", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lokio/ByteString;", "getHighSpeedVideoFpsRanges", "", "getContentLength", "()J", "contentLength"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteStringHttpBody implements com.apollographql.apollo.api.http.HttpBody {
    private final java.lang.String contentType;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.ByteString getHighSpeedVideoFpsRanges;

    public ByteStringHttpBody(java.lang.String str, okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        this.contentType = str;
        this.getHighSpeedVideoFpsRanges = byteString;
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final java.lang.String getContentType() {
        return this.contentType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteStringHttpBody(java.lang.String str, java.lang.String str2) {
        this(str, okio.ByteString.INSTANCE.encodeUtf8(str2));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final long getContentLength() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // com.apollographql.apollo.api.http.HttpBody
    public final void writeTo(okio.BufferedSink bufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        bufferedSink.write(this.getHighSpeedVideoFpsRanges);
    }
}
