package com.datadog.android.rum.resource;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/resource/ResourceId;", "", "", "key", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getUuid"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceId {
    private final java.lang.String key;
    private final java.lang.String uuid;

    public ResourceId(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        this.uuid = str2;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getUuid() {
        return this.uuid;
    }

    public final boolean equals(java.lang.Object other) {
        com.datadog.android.rum.resource.ResourceId resourceId;
        java.lang.String str;
        if (!(other instanceof com.datadog.android.rum.resource.ResourceId)) {
            return false;
        }
        java.lang.String str2 = this.uuid;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2) || (str = (resourceId = (com.datadog.android.rum.resource.ResourceId) other).uuid) == null || kotlin.text.StringsKt.isBlank(str)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, ((com.datadog.android.rum.resource.ResourceId) other).key);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uuid, resourceId.uuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.key, resourceId.key);
    }

    public final int hashCode() {
        return this.key.hashCode();
    }
}
