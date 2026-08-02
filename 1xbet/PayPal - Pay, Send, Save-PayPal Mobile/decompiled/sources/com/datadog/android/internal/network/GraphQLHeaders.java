package com.datadog.android.internal.network;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/internal/network/GraphQLHeaders;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "headerValue", "Ljava/lang/String;", "getHeaderValue", "()Ljava/lang/String;", "DD_GRAPHQL_NAME_HEADER", "DD_GRAPHQL_VARIABLES_HEADER", "DD_GRAPHQL_TYPE_HEADER", "DD_GRAPHQL_PAYLOAD_HEADER"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum GraphQLHeaders {
    DD_GRAPHQL_NAME_HEADER("_dd-custom-header-graph-ql-operation-name"),
    DD_GRAPHQL_VARIABLES_HEADER("_dd-custom-header-graph-ql-variables"),
    DD_GRAPHQL_TYPE_HEADER("_dd-custom-header-graph-ql-operation-type"),
    DD_GRAPHQL_PAYLOAD_HEADER("_dd-custom-header-graph-ql-payload");

    private final java.lang.String headerValue;

    GraphQLHeaders(java.lang.String str) {
        this.headerValue = str;
    }

    public final java.lang.String getHeaderValue() {
        return this.headerValue;
    }
}
