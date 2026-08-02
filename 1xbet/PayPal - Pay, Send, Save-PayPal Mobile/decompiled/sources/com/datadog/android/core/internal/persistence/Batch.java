package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/datadog/android/core/internal/persistence/Batch;", "", "", "id", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;[B)V", "component1", "()Ljava/lang/String;", "component2", "()[B", "copy", "(Ljava/lang/String;[B)Lcom/datadog/android/core/internal/persistence/Batch;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "[B", "getData", "Ljava/lang/String;", "getId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Batch {
    private final byte[] data;
    private final java.lang.String id;

    public Batch(java.lang.String str, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.id = str;
        this.data = bArr;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String arrays = java.util.Arrays.toString(this.data);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Batch(id=");
        sb.append(str);
        sb.append(", data=");
        sb.append(arrays);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + java.util.Arrays.hashCode(this.data);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.internal.persistence.Batch)) {
            return false;
        }
        com.datadog.android.core.internal.persistence.Batch batch = (com.datadog.android.core.internal.persistence.Batch) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, batch.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, batch.data);
    }

    public final com.datadog.android.core.internal.persistence.Batch copy(java.lang.String id, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.datadog.android.core.internal.persistence.Batch(id, data);
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.datadog.android.core.internal.persistence.Batch copy$default(com.datadog.android.core.internal.persistence.Batch batch, java.lang.String str, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = batch.id;
        }
        if ((i & 2) != 0) {
            bArr = batch.data;
        }
        return batch.copy(str, bArr);
    }
}
