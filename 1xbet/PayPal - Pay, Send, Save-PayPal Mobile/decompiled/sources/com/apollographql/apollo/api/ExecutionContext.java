package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u00132\u00020\u0001:\u0003\u0014\u0015\u0013J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext;", "", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "E", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "get", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "plus", "(Lcom/apollographql/apollo/api/ExecutionContext;)Lcom/apollographql/apollo/api/ExecutionContext;", "minusKey", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext;", "Companion", "Key", "Element"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExecutionContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.api.ExecutionContext.Companion INSTANCE = com.apollographql.apollo.api.ExecutionContext.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final com.apollographql.apollo.api.ExecutionContext Empty = com.apollographql.apollo.api.EmptyExecutionContext.INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "E", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Key<E extends com.apollographql.apollo.api.ExecutionContext.Element> {
    }

    <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super com.apollographql.apollo.api.ExecutionContext.Element, ? extends R> operation);

    <E extends com.apollographql.apollo.api.ExecutionContext.Element> E get(com.apollographql.apollo.api.ExecutionContext.Key<E> key);

    com.apollographql.apollo.api.ExecutionContext minusKey(com.apollographql.apollo.api.ExecutionContext.Key<?> key);

    default com.apollographql.apollo.api.ExecutionContext plus(com.apollographql.apollo.api.ExecutionContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return context == com.apollographql.apollo.api.EmptyExecutionContext.INSTANCE ? this : (com.apollographql.apollo.api.ExecutionContext) context.fold(this, new kotlin.jvm.functions.Function2() { // from class: com.apollographql.apollo.api.ExecutionContext$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.apollographql.apollo.api.ExecutionContext.m9950$r8$lambda$q7p9G8k0VTqVPjoeJsMz1yIDwo((com.apollographql.apollo.api.ExecutionContext) obj, (com.apollographql.apollo.api.ExecutionContext.Element) obj2);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lcom/apollographql/apollo/api/ExecutionContext;", "E", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "get", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Element extends com.apollographql.apollo.api.ExecutionContext {
        com.apollographql.apollo.api.ExecutionContext.Key<?> getKey();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.apollographql.apollo.api.ExecutionContext
        default <E extends com.apollographql.apollo.api.ExecutionContext.Element> E get(com.apollographql.apollo.api.ExecutionContext.Key<E> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getKey(), key)) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            return this;
        }

        @Override // com.apollographql.apollo.api.ExecutionContext
        default <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super com.apollographql.apollo.api.ExecutionContext.Element, ? extends R> operation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            return operation.invoke(initial, this);
        }

        @Override // com.apollographql.apollo.api.ExecutionContext
        default com.apollographql.apollo.api.ExecutionContext minusKey(com.apollographql.apollo.api.ExecutionContext.Key<?> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(getKey(), key) ? com.apollographql.apollo.api.EmptyExecutionContext.INSTANCE : this;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionContext$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/ExecutionContext;", "Empty", "Lcom/apollographql/apollo/api/ExecutionContext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ com.apollographql.apollo.api.ExecutionContext.Companion getHighResolutionOutputSizeshNQ4ISI = new com.apollographql.apollo.api.ExecutionContext.Companion();

        private Companion() {
        }
    }

    /* renamed from: $r8$lambda$q7p9G8k0VTqVPj-oeJsMz1yIDwo, reason: not valid java name */
    static /* synthetic */ com.apollographql.apollo.api.ExecutionContext m9950$r8$lambda$q7p9G8k0VTqVPjoeJsMz1yIDwo(com.apollographql.apollo.api.ExecutionContext executionContext, com.apollographql.apollo.api.ExecutionContext.Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        com.apollographql.apollo.api.ExecutionContext minusKey = executionContext.minusKey(element.getKey());
        return minusKey == com.apollographql.apollo.api.EmptyExecutionContext.INSTANCE ? element : new com.apollographql.apollo.api.CombinedExecutionContext(minusKey, element);
    }
}
