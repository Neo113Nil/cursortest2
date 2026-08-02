package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "statusCode", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "Lokio/BufferedSource;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "message", "", "cause", "<init>", "(ILjava/util/List;Lokio/BufferedSource;Ljava/lang/String;Ljava/lang/Throwable;)V", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "()I", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "Lokio/BufferedSource;", "getBody", "()Lokio/BufferedSource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloHttpException extends com.apollographql.apollo.exception.ApolloException {
    private final okio.BufferedSource body;
    private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers;
    private final int statusCode;

    public /* synthetic */ ApolloHttpException(int i, java.util.List list, okio.BufferedSource bufferedSource, java.lang.String str, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, bufferedSource, str, (i2 & 16) != 0 ? null : th);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHeaders() {
        return this.headers;
    }

    public final okio.BufferedSource getBody() {
        return this.body;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, okio.BufferedSource bufferedSource, java.lang.String str, java.lang.Throwable th) {
        super(str, th, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = i;
        this.headers = list;
        this.body = bufferedSource;
    }
}
