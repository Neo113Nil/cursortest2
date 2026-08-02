package com.discover.mpos.sdk.initialization;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/discover/mpos/sdk/initialization/CustomInitializer;", "", "randomNumberGenerator", "Lcom/discover/mpos/sdk/security/RandomNumberGenerator;", "connectors", "", "Lcom/discover/mpos/sdk/card/connectors/ConnectorType;", "Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "(Lcom/discover/mpos/sdk/security/RandomNumberGenerator;Ljava/util/Map;)V", "getConnectors", "()Ljava/util/Map;", "getRandomNumberGenerator", "()Lcom/discover/mpos/sdk/security/RandomNumberGenerator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class CustomInitializer {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.security.RandomNumberGenerator f3219a;
    private final java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> b;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomInitializer(com.discover.mpos.sdk.security.RandomNumberGenerator randomNumberGenerator, java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, ? extends com.discover.mpos.sdk.card.connectors.CardConnector> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomNumberGenerator, "");
        this.f3219a = randomNumberGenerator;
        this.b = map;
    }

    public final com.discover.mpos.sdk.security.RandomNumberGenerator getRandomNumberGenerator() {
        return this.f3219a;
    }

    public /* synthetic */ CustomInitializer(com.discover.mpos.sdk.security.RandomNumberGenerator randomNumberGenerator, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(randomNumberGenerator, (i & 2) != 0 ? null : map);
    }

    public final java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> getConnectors() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomInitializer(randomNumberGenerator=");
        sb.append(this.f3219a);
        sb.append(", connectors=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.security.RandomNumberGenerator randomNumberGenerator = this.f3219a;
        int hashCode = randomNumberGenerator != null ? randomNumberGenerator.hashCode() : 0;
        java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> map = this.b;
        return (hashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.initialization.CustomInitializer)) {
            return false;
        }
        com.discover.mpos.sdk.initialization.CustomInitializer customInitializer = (com.discover.mpos.sdk.initialization.CustomInitializer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3219a, customInitializer.f3219a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, customInitializer.b);
    }

    public final com.discover.mpos.sdk.initialization.CustomInitializer copy(com.discover.mpos.sdk.security.RandomNumberGenerator randomNumberGenerator, java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, ? extends com.discover.mpos.sdk.card.connectors.CardConnector> connectors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomNumberGenerator, "");
        return new com.discover.mpos.sdk.initialization.CustomInitializer(randomNumberGenerator, connectors);
    }

    public final java.util.Map<com.discover.mpos.sdk.card.connectors.ConnectorType, com.discover.mpos.sdk.card.connectors.CardConnector> component2() {
        return this.b;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.security.RandomNumberGenerator getF3219a() {
        return this.f3219a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.discover.mpos.sdk.initialization.CustomInitializer copy$default(com.discover.mpos.sdk.initialization.CustomInitializer customInitializer, com.discover.mpos.sdk.security.RandomNumberGenerator randomNumberGenerator, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            randomNumberGenerator = customInitializer.f3219a;
        }
        if ((i & 2) != 0) {
            map = customInitializer.b;
        }
        return customInitializer.copy(randomNumberGenerator, map);
    }
}
