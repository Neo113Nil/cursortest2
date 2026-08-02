package com.chuckerteam.chucker.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/chuckerteam/chucker/api/BodyDecoder;", "", "Lokhttp3/Request;", "request", "Lokio/ByteString;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "decodeRequest", "(Lokhttp3/Request;Lokio/ByteString;)Ljava/lang/String;", "Lokhttp3/Response;", "response", "decodeResponse", "(Lokhttp3/Response;Lokio/ByteString;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BodyDecoder {
    java.lang.String decodeRequest(okhttp3.Request request, okio.ByteString body) throws java.io.IOException;

    java.lang.String decodeResponse(okhttp3.Response response, okio.ByteString body) throws java.io.IOException;
}
