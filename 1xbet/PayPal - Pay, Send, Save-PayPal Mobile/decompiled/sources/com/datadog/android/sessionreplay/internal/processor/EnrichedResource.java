package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;", "", "", "resource", "", "filename", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "([BLjava/lang/String;Ljava/lang/String;)V", "component1$dd_sdk_android_session_replay_release", "()[B", "component2$dd_sdk_android_session_replay_release", "()Ljava/lang/String;", "component3$dd_sdk_android_session_replay_release", "copy", "([BLjava/lang/String;Ljava/lang/String;)Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFilename$dd_sdk_android_session_replay_release", "getMimeType$dd_sdk_android_session_replay_release", "[B", "getResource$dd_sdk_android_session_replay_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EnrichedResource {
    public static final java.lang.String APPLICATION_ID_KEY = "applicationId";
    public static final java.lang.String APPLICATION_KEY = "application";
    public static final java.lang.String FILENAME_KEY = "filename";
    public static final java.lang.String ID_KEY = "id";
    public static final java.lang.String MIME_TYPE = "mimeType";
    private final java.lang.String filename;
    private final java.lang.String mimeType;
    private final byte[] resource;

    public EnrichedResource(byte[] bArr, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.resource = bArr;
        this.filename = str;
        this.mimeType = str2;
    }

    public /* synthetic */ EnrichedResource(byte[] bArr, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, str, (i & 4) != 0 ? null : str2);
    }

    public final byte[] getResource$dd_sdk_android_session_replay_release() {
        return this.resource;
    }

    public final java.lang.String getFilename$dd_sdk_android_session_replay_release() {
        return this.filename;
    }

    public final java.lang.String getMimeType$dd_sdk_android_session_replay_release() {
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
        com.datadog.android.sessionreplay.internal.processor.EnrichedResource enrichedResource = (com.datadog.android.sessionreplay.internal.processor.EnrichedResource) other;
        if (java.util.Arrays.equals(this.resource, enrichedResource.resource)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.filename, enrichedResource.filename);
        }
        return false;
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.resource) * 31) + this.filename.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String arrays = java.util.Arrays.toString(this.resource);
        java.lang.String str = this.filename;
        java.lang.String str2 = this.mimeType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrichedResource(resource=");
        sb.append(arrays);
        sb.append(", filename=");
        sb.append(str);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final com.datadog.android.sessionreplay.internal.processor.EnrichedResource copy(byte[] resource, java.lang.String filename, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filename, "");
        return new com.datadog.android.sessionreplay.internal.processor.EnrichedResource(resource, filename, mimeType);
    }

    /* renamed from: component3$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component2$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.lang.String getFilename() {
        return this.filename;
    }

    /* renamed from: component1$dd_sdk_android_session_replay_release, reason: from getter */
    public final byte[] getResource() {
        return this.resource;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.internal.processor.EnrichedResource copy$default(com.datadog.android.sessionreplay.internal.processor.EnrichedResource enrichedResource, byte[] bArr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = enrichedResource.resource;
        }
        if ((i & 2) != 0) {
            str = enrichedResource.filename;
        }
        if ((i & 4) != 0) {
            str2 = enrichedResource.mimeType;
        }
        return enrichedResource.copy(bArr, str, str2);
    }
}
