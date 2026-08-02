package com.apollographql.apollo.cache.normalized.sql;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/ApolloInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApolloInitializer implements androidx.startup.Initializer<kotlin.Unit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.cache.normalized.sql.ApolloInitializer.Companion INSTANCE = new com.apollographql.apollo.cache.normalized.sql.ApolloInitializer.Companion(null);
    public static android.content.Context context;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context2) {
        create2(context2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "");
        INSTANCE.setContext$apollo_normalized_cache_sqlite_release(context2);
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return new java.util.ArrayList();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0001X\u0080.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/ApolloInitializer$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext$apollo_normalized_cache_sqlite_release", "()Landroid/content/Context;", "setContext$apollo_normalized_cache_sqlite_release", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final android.content.Context getContext$apollo_normalized_cache_sqlite_release() {
            android.content.Context context = com.apollographql.apollo.cache.normalized.sql.ApolloInitializer.context;
            if (context != null) {
                return context;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final void setContext$apollo_normalized_cache_sqlite_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            com.apollographql.apollo.cache.normalized.sql.ApolloInitializer.context = context;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
