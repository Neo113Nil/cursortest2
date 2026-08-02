package com.apollographql.apollo.cache.normalized.sql.internal.json;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/RecordsForKeys;", "", "", "key", "record", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/sql/internal/json/RecordsForKeys;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "getRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecordsForKeys {
    private final java.lang.String key;
    private final java.lang.String record;

    public RecordsForKeys(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.record = str2;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getRecord() {
        return this.record;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.key;
        java.lang.String str2 = this.record;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecordsForKeys(key=");
        sb.append(str);
        sb.append(", record=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.key.hashCode() * 31) + this.record.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys)) {
            return false;
        }
        com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys recordsForKeys = (com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.key, recordsForKeys.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.record, recordsForKeys.record);
    }

    public final com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys copy(java.lang.String key, java.lang.String record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys(key, record);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRecord() {
        return this.record;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    public static /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys copy$default(com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys recordsForKeys, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = recordsForKeys.key;
        }
        if ((i & 2) != 0) {
            str2 = recordsForKeys.record;
        }
        return recordsForKeys.copy(str, str2);
    }
}
