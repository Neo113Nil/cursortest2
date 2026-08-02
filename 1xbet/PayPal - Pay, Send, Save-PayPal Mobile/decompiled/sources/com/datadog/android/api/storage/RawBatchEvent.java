package com.datadog.android.api.storage;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/api/storage/RawBatchEvent;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "metadata", "<init>", "([B[B)V", "component1", "()[B", "component2", "copy", "([B[B)Lcom/datadog/android/api/storage/RawBatchEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[B", "getData", "getMetadata", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RawBatchEvent {
    private static final com.datadog.android.api.storage.RawBatchEvent.Companion Companion = new com.datadog.android.api.storage.RawBatchEvent.Companion(null);
    private static final byte[] getHighSpeedVideoFpsRanges = new byte[0];
    private final byte[] data;
    private final byte[] metadata;

    public RawBatchEvent(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        this.data = bArr;
        this.metadata = bArr2;
    }

    public final byte[] getData() {
        return this.data;
    }

    public /* synthetic */ RawBatchEvent(byte[] bArr, byte[] bArr2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? getHighSpeedVideoFpsRanges : bArr2);
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
        com.datadog.android.api.storage.RawBatchEvent rawBatchEvent = (com.datadog.android.api.storage.RawBatchEvent) other;
        return java.util.Arrays.equals(this.data, rawBatchEvent.data) && java.util.Arrays.equals(this.metadata, rawBatchEvent.metadata);
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.data) * 31) + java.util.Arrays.hashCode(this.metadata);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/storage/RawBatchEvent$Companion;", "", "<init>", "()V", "", "getHighSpeedVideoFpsRanges", "[B", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String arrays = java.util.Arrays.toString(this.data);
        java.lang.String arrays2 = java.util.Arrays.toString(this.metadata);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RawBatchEvent(data=");
        sb.append(arrays);
        sb.append(", metadata=");
        sb.append(arrays2);
        sb.append(")");
        return sb.toString();
    }

    public final com.datadog.android.api.storage.RawBatchEvent copy(byte[] data, byte[] metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.datadog.android.api.storage.RawBatchEvent(data, metadata);
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getMetadata() {
        return this.metadata;
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public static /* synthetic */ com.datadog.android.api.storage.RawBatchEvent copy$default(com.datadog.android.api.storage.RawBatchEvent rawBatchEvent, byte[] bArr, byte[] bArr2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = rawBatchEvent.data;
        }
        if ((i & 2) != 0) {
            bArr2 = rawBatchEvent.metadata;
        }
        return rawBatchEvent.copy(bArr, bArr2);
    }
}
