package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/apollographql/apollo/api/EmptyExecutionContext;", "Lcom/apollographql/apollo/api/ExecutionContext;", "<init>", "()V", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "E", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "get", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "plus", "(Lcom/apollographql/apollo/api/ExecutionContext;)Lcom/apollographql/apollo/api/ExecutionContext;", "minusKey", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyExecutionContext implements com.apollographql.apollo.api.ExecutionContext {
    public static final com.apollographql.apollo.api.EmptyExecutionContext INSTANCE = new com.apollographql.apollo.api.EmptyExecutionContext();

    private EmptyExecutionContext() {
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final com.apollographql.apollo.api.ExecutionContext minusKey(com.apollographql.apollo.api.ExecutionContext.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final com.apollographql.apollo.api.ExecutionContext plus(com.apollographql.apollo.api.ExecutionContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return context;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final <E extends com.apollographql.apollo.api.ExecutionContext.Element> E get(com.apollographql.apollo.api.ExecutionContext.Key<E> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return null;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super com.apollographql.apollo.api.ExecutionContext.Element, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return initial;
    }
}
