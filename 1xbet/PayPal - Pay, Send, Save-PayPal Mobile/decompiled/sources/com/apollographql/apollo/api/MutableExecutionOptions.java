package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00028\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00028\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0018\u001a\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0018\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/MutableExecutionOptions;", "T", "Lcom/apollographql/apollo/api/ExecutionOptions;", "Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "addExecutionContext", "(Lcom/apollographql/apollo/api/ExecutionContext;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethod", "(Lcom/apollographql/apollo/api/http/HttpMethod;)Ljava/lang/Object;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "httpHeaders", "(Ljava/util/List;)Ljava/lang/Object;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHttpHeader", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "sendApqExtensions", "(Ljava/lang/Boolean;)Ljava/lang/Object;", "sendDocument", "enableAutoPersistedQueries", "canBeBatched"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MutableExecutionOptions<T> extends com.apollographql.apollo.api.ExecutionOptions {
    T addExecutionContext(com.apollographql.apollo.api.ExecutionContext executionContext);

    T addHttpHeader(java.lang.String name2, java.lang.String value);

    T canBeBatched(java.lang.Boolean canBeBatched);

    T enableAutoPersistedQueries(java.lang.Boolean enableAutoPersistedQueries);

    T httpHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders);

    T httpMethod(com.apollographql.apollo.api.http.HttpMethod httpMethod);

    T sendApqExtensions(java.lang.Boolean sendApqExtensions);

    T sendDocument(java.lang.Boolean sendDocument);
}
