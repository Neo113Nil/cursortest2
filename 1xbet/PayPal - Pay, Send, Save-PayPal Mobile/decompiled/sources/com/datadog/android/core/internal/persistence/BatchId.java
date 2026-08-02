package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/datadog/android/core/internal/persistence/BatchId;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/core/internal/persistence/BatchId;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/io/File;", "file", "matchesFile", "(Ljava/io/File;)Z", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BatchId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.persistence.BatchId.Companion INSTANCE = new com.datadog.android.core.internal.persistence.BatchId.Companion(null);
    private final java.lang.String id;

    public BatchId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final boolean matchesFile(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(com.datadog.android.core.internal.persistence.BatchId.Companion.access$extractFileId(INSTANCE, file), this.id);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/BatchId$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/datadog/android/core/internal/persistence/BatchId;", "fromFile", "(Ljava/io/File;)Lcom/datadog/android/core/internal/persistence/BatchId;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.core.internal.persistence.BatchId fromFile(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            return new com.datadog.android.core.internal.persistence.BatchId(absolutePath);
        }

        public static final /* synthetic */ java.lang.String access$extractFileId(com.datadog.android.core.internal.persistence.BatchId.Companion companion, java.io.File file) {
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            return absolutePath;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatchId(id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.datadog.android.core.internal.persistence.BatchId) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.core.internal.persistence.BatchId) other).id);
    }

    public final com.datadog.android.core.internal.persistence.BatchId copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.datadog.android.core.internal.persistence.BatchId(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.datadog.android.core.internal.persistence.BatchId copy$default(com.datadog.android.core.internal.persistence.BatchId batchId, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = batchId.id;
        }
        return batchId.copy(str);
    }
}
