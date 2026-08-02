package com.datadog.android.core.persistence.datastore;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/datadog/android/core/persistence/datastore/DataStoreContent;", "", "T", "", "versionCode", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ILjava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "copy", "(ILjava/lang/Object;)Lcom/datadog/android/core/persistence/datastore/DataStoreContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData", com.visa.cbp.getEncExpo.warmup, "getVersionCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DataStoreContent<T> {
    private final T data;
    private final int versionCode;

    public DataStoreContent(int i, T t) {
        this.versionCode = i;
        this.data = t;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final T getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        int i = this.versionCode;
        T t = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataStoreContent(versionCode=");
        sb.append(i);
        sb.append(", data=");
        sb.append(t);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.versionCode);
        T t = this.data;
        return (hashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.persistence.datastore.DataStoreContent)) {
            return false;
        }
        com.datadog.android.core.persistence.datastore.DataStoreContent dataStoreContent = (com.datadog.android.core.persistence.datastore.DataStoreContent) other;
        return this.versionCode == dataStoreContent.versionCode && kotlin.jvm.internal.Intrinsics.areEqual(this.data, dataStoreContent.data);
    }

    public final com.datadog.android.core.persistence.datastore.DataStoreContent<T> copy(int versionCode, T data) {
        return new com.datadog.android.core.persistence.datastore.DataStoreContent<>(versionCode, data);
    }

    public final T component2() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.core.persistence.datastore.DataStoreContent copy$default(com.datadog.android.core.persistence.datastore.DataStoreContent dataStoreContent, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            i = dataStoreContent.versionCode;
        }
        if ((i2 & 2) != 0) {
            obj = dataStoreContent.data;
        }
        return dataStoreContent.copy(i, obj);
    }
}
