package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;", "", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "key", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "isActive", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Z)V", "component1", "()Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "component2", "()Ljava/util/Map;", "component3", "()Z", "copy", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Z)Lcom/datadog/android/rum/internal/domain/scope/RumViewInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAttributes", "Z", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "getKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RumViewInfo {
    private final java.util.Map<java.lang.String, java.lang.Object> attributes;
    private final boolean isActive;
    private final com.datadog.android.rum.internal.domain.scope.RumScopeKey key;

    public RumViewInfo(com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumScopeKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.key = rumScopeKey;
        this.attributes = map;
        this.isActive = z;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumScopeKey getKey() {
        return this.key;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return this.attributes;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final java.lang.String toString() {
        com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey = this.key;
        java.util.Map<java.lang.String, java.lang.Object> map = this.attributes;
        boolean z = this.isActive;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RumViewInfo(key=");
        sb.append(rumScopeKey);
        sb.append(", attributes=");
        sb.append(map);
        sb.append(", isActive=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.key.hashCode() * 31) + this.attributes.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isActive);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.scope.RumViewInfo)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.scope.RumViewInfo rumViewInfo = (com.datadog.android.rum.internal.domain.scope.RumViewInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.key, rumViewInfo.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, rumViewInfo.attributes) && this.isActive == rumViewInfo.isActive;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumViewInfo copy(com.datadog.android.rum.internal.domain.scope.RumScopeKey key, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, boolean isActive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        return new com.datadog.android.rum.internal.domain.scope.RumViewInfo(key, attributes, isActive);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component2() {
        return this.attributes;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumScopeKey getKey() {
        return this.key;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.rum.internal.domain.scope.RumViewInfo copy$default(com.datadog.android.rum.internal.domain.scope.RumViewInfo rumViewInfo, com.datadog.android.rum.internal.domain.scope.RumScopeKey rumScopeKey, java.util.Map map, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rumScopeKey = rumViewInfo.key;
        }
        if ((i & 2) != 0) {
            map = rumViewInfo.attributes;
        }
        if ((i & 4) != 0) {
            z = rumViewInfo.isActive;
        }
        return rumViewInfo.copy(rumScopeKey, map, z);
    }
}
