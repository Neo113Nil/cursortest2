package com.apollographql.apollo;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012BG\u0012>\u0010\b\u001a:\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012*\u0012(\u0012\u0004\u0012\u00020\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u00050\u00030\u00030\u0002¢\u0006\u0004\b\t\u0010\nRR\u0010\b\u001a:\u00126\u00124\u0012\u0004\u0012\u00020\u0004\u0012*\u0012(\u0012\u0004\u0012\u00020\u0004\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u00050\u00030\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/CacheDumpProviderContext;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lkotlin/Function0;", "", "", "Lkotlin/Pair;", "", "", "cacheDumpProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function0;", "getCacheDumpProvider", "()Lkotlin/jvm/functions/Function0;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheDumpProviderContext implements com.apollographql.apollo.api.ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final com.apollographql.apollo.CacheDumpProviderContext.Companion INSTANCE = new com.apollographql.apollo.CacheDumpProviderContext.Companion(null);
    private final kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>>>>> cacheDumpProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public CacheDumpProviderContext(kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends kotlin.Pair<java.lang.Integer, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.cacheDumpProvider = function0;
    }

    public final kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>>>>> getCacheDumpProvider() {
        return this.cacheDumpProvider;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/CacheDumpProviderContext$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/CacheDumpProviderContext;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.CacheDumpProviderContext$Key, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.apollographql.apollo.CacheDumpProviderContext> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
