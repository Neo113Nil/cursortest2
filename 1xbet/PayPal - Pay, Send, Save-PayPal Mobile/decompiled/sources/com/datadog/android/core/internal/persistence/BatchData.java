package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/datadog/android/core/internal/persistence/BatchData;", "", "Lcom/datadog/android/core/internal/persistence/BatchId;", "id", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "metadata", "<init>", "(Lcom/datadog/android/core/internal/persistence/BatchId;Ljava/util/List;[B)V", "component1", "()Lcom/datadog/android/core/internal/persistence/BatchId;", "component2", "()Ljava/util/List;", "component3", "()[B", "copy", "(Lcom/datadog/android/core/internal/persistence/BatchId;Ljava/util/List;[B)Lcom/datadog/android/core/internal/persistence/BatchData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getData", "Lcom/datadog/android/core/internal/persistence/BatchId;", "getId", "[B", "getMetadata"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BatchData {
    private final java.util.List<com.datadog.android.api.storage.RawBatchEvent> data;
    private final com.datadog.android.core.internal.persistence.BatchId id;
    private final byte[] metadata;

    public BatchData(com.datadog.android.core.internal.persistence.BatchId batchId, java.util.List<com.datadog.android.api.storage.RawBatchEvent> list, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = batchId;
        this.data = list;
        this.metadata = bArr;
    }

    public /* synthetic */ BatchData(com.datadog.android.core.internal.persistence.BatchId batchId, java.util.List list, byte[] bArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(batchId, list, (i & 4) != 0 ? null : bArr);
    }

    public final com.datadog.android.core.internal.persistence.BatchId getId() {
        return this.id;
    }

    public final java.util.List<com.datadog.android.api.storage.RawBatchEvent> getData() {
        return this.data;
    }

    public final byte[] getMetadata() {
        return this.metadata;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.datadog.android.core.internal.persistence.BatchData batchData = (com.datadog.android.core.internal.persistence.BatchData) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.id, batchData.id) || !kotlin.jvm.internal.Intrinsics.areEqual(this.data, batchData.data)) {
            return false;
        }
        byte[] bArr = this.metadata;
        if (bArr != null) {
            byte[] bArr2 = batchData.metadata;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (batchData.metadata != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.data.hashCode();
        byte[] bArr = this.metadata;
        return (((hashCode * 31) + hashCode2) * 31) + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public final java.lang.String toString() {
        com.datadog.android.core.internal.persistence.BatchId batchId = this.id;
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> list = this.data;
        java.lang.String arrays = java.util.Arrays.toString(this.metadata);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatchData(id=");
        sb.append(batchId);
        sb.append(", data=");
        sb.append(list);
        sb.append(", metadata=");
        sb.append(arrays);
        sb.append(")");
        return sb.toString();
    }

    public final com.datadog.android.core.internal.persistence.BatchData copy(com.datadog.android.core.internal.persistence.BatchId id, java.util.List<com.datadog.android.api.storage.RawBatchEvent> data, byte[] metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.datadog.android.core.internal.persistence.BatchData(id, data, metadata);
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getMetadata() {
        return this.metadata;
    }

    public final java.util.List<com.datadog.android.api.storage.RawBatchEvent> component2() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.core.internal.persistence.BatchId getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.core.internal.persistence.BatchData copy$default(com.datadog.android.core.internal.persistence.BatchData batchData, com.datadog.android.core.internal.persistence.BatchId batchId, java.util.List list, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            batchId = batchData.id;
        }
        if ((i & 2) != 0) {
            list = batchData.data;
        }
        if ((i & 4) != 0) {
            bArr = batchData.metadata;
        }
        return batchData.copy(batchId, list, bArr);
    }
}
