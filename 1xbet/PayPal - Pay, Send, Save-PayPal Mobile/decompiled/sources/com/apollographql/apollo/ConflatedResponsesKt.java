package com.apollographql.apollo;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"+\u0010\u0004\u001a\u00020\u0002\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b8G¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n"}, d2 = {"T", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "", "conflateResponses", "conflateFetchPolicyInterceptorResponses", "(Lcom/apollographql/apollo/api/MutableExecutionOptions;Z)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "getConflateFetchPolicyInterceptorResponses", "(Lcom/apollographql/apollo/api/ApolloRequest;)Z", "getConflateFetchPolicyInterceptorResponses$annotations", "(Lcom/apollographql/apollo/api/ApolloRequest;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConflatedResponsesKt {
    public static /* synthetic */ void getConflateFetchPolicyInterceptorResponses$annotations(com.apollographql.apollo.api.ApolloRequest apolloRequest) {
    }

    @kotlin.Deprecated(message = "Handle each ApolloResponse.exception instead")
    public static final <T> T conflateFetchPolicyInterceptorResponses(com.apollographql.apollo.api.MutableExecutionOptions<T> mutableExecutionOptions, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableExecutionOptions, "");
        return mutableExecutionOptions.addExecutionContext(new com.apollographql.apollo.ConflateResponsesContext(z));
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> boolean getConflateFetchPolicyInterceptorResponses(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloRequest, "");
        com.apollographql.apollo.ConflateResponsesContext conflateResponsesContext = (com.apollographql.apollo.ConflateResponsesContext) apolloRequest.getExecutionContext().get(com.apollographql.apollo.ConflateResponsesContext.INSTANCE);
        if (conflateResponsesContext != null) {
            return conflateResponsesContext.getConflateResponses();
        }
        return false;
    }
}
