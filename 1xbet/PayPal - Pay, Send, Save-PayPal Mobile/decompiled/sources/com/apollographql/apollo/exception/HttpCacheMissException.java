package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/exception/HttpCacheMissException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "message", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpCacheMissException extends com.apollographql.apollo.exception.ApolloException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCacheMissException(java.lang.String str, java.lang.Exception exc) {
        super(str, exc, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public /* synthetic */ HttpCacheMissException(java.lang.String str, java.lang.Exception exc, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : exc);
    }
}
