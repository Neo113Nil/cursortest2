package com.apollographql.apollo.cache.normalized.sql.internal.json;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/Records;", "", "", "_id", "", "key", "record", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/sql/internal/json/Records;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "get_id", "Ljava/lang/String;", "getKey", "getRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Records {
    private final long _id;
    private final java.lang.String key;
    private final java.lang.String record;

    public Records(long j, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this._id = j;
        this.key = str;
        this.record = str2;
    }

    public final long get_id() {
        return this._id;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getRecord() {
        return this.record;
    }

    public final java.lang.String toString() {
        long j = this._id;
        java.lang.String str = this.key;
        java.lang.String str2 = this.record;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Records(_id=");
        sb.append(j);
        sb.append(", key=");
        sb.append(str);
        sb.append(", record=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Long.hashCode(this._id) * 31) + this.key.hashCode()) * 31) + this.record.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.apollographql.apollo.cache.normalized.sql.internal.json.Records)) {
            return false;
        }
        com.apollographql.apollo.cache.normalized.sql.internal.json.Records records = (com.apollographql.apollo.cache.normalized.sql.internal.json.Records) other;
        return this._id == records._id && kotlin.jvm.internal.Intrinsics.areEqual(this.key, records.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.record, records.record);
    }

    public final com.apollographql.apollo.cache.normalized.sql.internal.json.Records copy(long _id, java.lang.String key, java.lang.String record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.Records(_id, key, record);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRecord() {
        return this.record;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    /* renamed from: component1, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    public static /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.Records copy$default(com.apollographql.apollo.cache.normalized.sql.internal.json.Records records, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = records._id;
        }
        if ((i & 2) != 0) {
            str = records.key;
        }
        if ((i & 4) != 0) {
            str2 = records.record;
        }
        return records.copy(j, str, str2);
    }
}
