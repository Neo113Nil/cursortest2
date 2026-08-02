package com.datadog.android.sessionreplay.internal.net;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/ResourceEvent;", "", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "identifier", "", "resourceData", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()[B", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Lcom/datadog/android/sessionreplay/internal/net/ResourceEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getApplicationId", "getIdentifier", "getMimeType", "[B", "getResourceData"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResourceEvent {
    private final java.lang.String applicationId;
    private final java.lang.String identifier;
    private final java.lang.String mimeType;
    private final byte[] resourceData;

    public ResourceEvent(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.applicationId = str;
        this.identifier = str2;
        this.resourceData = bArr;
        this.mimeType = str3;
    }

    public /* synthetic */ ResourceEvent(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bArr, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public final java.lang.String getIdentifier() {
        return this.identifier;
    }

    public final byte[] getResourceData() {
        return this.resourceData;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.datadog.android.sessionreplay.internal.net.ResourceEvent resourceEvent = (com.datadog.android.sessionreplay.internal.net.ResourceEvent) other;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.applicationId, resourceEvent.applicationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.identifier, resourceEvent.identifier)) {
            return java.util.Arrays.equals(this.resourceData, resourceEvent.resourceData);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.applicationId.hashCode() * 31) + this.identifier.hashCode()) * 31) + java.util.Arrays.hashCode(this.resourceData);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.applicationId;
        java.lang.String str2 = this.identifier;
        java.lang.String arrays = java.util.Arrays.toString(this.resourceData);
        java.lang.String str3 = this.mimeType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceEvent(applicationId=");
        sb.append(str);
        sb.append(", identifier=");
        sb.append(str2);
        sb.append(", resourceData=");
        sb.append(arrays);
        sb.append(", mimeType=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final com.datadog.android.sessionreplay.internal.net.ResourceEvent copy(java.lang.String applicationId, java.lang.String identifier, byte[] resourceData, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceData, "");
        return new com.datadog.android.sessionreplay.internal.net.ResourceEvent(applicationId, identifier, resourceData, mimeType);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getResourceData() {
        return this.resourceData;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.internal.net.ResourceEvent copy$default(com.datadog.android.sessionreplay.internal.net.ResourceEvent resourceEvent, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = resourceEvent.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = resourceEvent.identifier;
        }
        if ((i & 4) != 0) {
            bArr = resourceEvent.resourceData;
        }
        if ((i & 8) != 0) {
            str3 = resourceEvent.mimeType;
        }
        return resourceEvent.copy(str, str2, bArr, str3);
    }
}
