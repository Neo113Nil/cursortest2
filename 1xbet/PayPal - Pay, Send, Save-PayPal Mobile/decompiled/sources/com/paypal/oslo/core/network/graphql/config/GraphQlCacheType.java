package com.paypal.oslo.core.network.graphql.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "", "<init>", "()V", "MemoryCache", "DbCache", "NoCache", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType$DbCache;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType$MemoryCache;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType$NoCache;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class GraphQlCacheType {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType$MemoryCache;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MemoryCache extends com.paypal.oslo.core.network.graphql.config.GraphQlCacheType {
        public static final com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.MemoryCache INSTANCE = new com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.MemoryCache();

        private MemoryCache() {
            super(null);
        }
    }

    private GraphQlCacheType() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType$DbCache;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "", "dbName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType$DbCache;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDbName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DbCache extends com.paypal.oslo.core.network.graphql.config.GraphQlCacheType {
        private final java.lang.String dbName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DbCache(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.dbName = str;
        }

        public final java.lang.String getDbName() {
            return this.dbName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.dbName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DbCache(dbName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.dbName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache) && kotlin.jvm.internal.Intrinsics.areEqual(this.dbName, ((com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache) other).dbName);
        }

        public final com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache copy(java.lang.String dbName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbName, "");
            return new com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache(dbName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDbName() {
            return this.dbName;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache copy$default(com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache dbCache, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dbCache.dbName;
            }
            return dbCache.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType$NoCache;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoCache extends com.paypal.oslo.core.network.graphql.config.GraphQlCacheType {
        public static final com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.NoCache INSTANCE = new com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.NoCache();

        private NoCache() {
            super(null);
        }
    }

    public /* synthetic */ GraphQlCacheType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
