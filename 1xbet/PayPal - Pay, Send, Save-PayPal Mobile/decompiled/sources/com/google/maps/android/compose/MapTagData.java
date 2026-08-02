package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/google/maps/android/compose/MapTagData;", "", "Landroid/content/ComponentCallbacks;", "componentCallbacks", "Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "lifecycleObserver", "<init>", "(Landroid/content/ComponentCallbacks;Lcom/google/maps/android/compose/MapLifecycleEventObserver;)V", "component1", "()Landroid/content/ComponentCallbacks;", "component2", "()Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "copy", "(Landroid/content/ComponentCallbacks;Lcom/google/maps/android/compose/MapLifecycleEventObserver;)Lcom/google/maps/android/compose/MapTagData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/ComponentCallbacks;", "getComponentCallbacks", "Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "getLifecycleObserver"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class MapTagData {
    private final android.content.ComponentCallbacks componentCallbacks;
    private final com.google.maps.android.compose.MapLifecycleEventObserver lifecycleObserver;

    public MapTagData(android.content.ComponentCallbacks componentCallbacks, com.google.maps.android.compose.MapLifecycleEventObserver mapLifecycleEventObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapLifecycleEventObserver, "");
        this.componentCallbacks = componentCallbacks;
        this.lifecycleObserver = mapLifecycleEventObserver;
    }

    public final android.content.ComponentCallbacks getComponentCallbacks() {
        return this.componentCallbacks;
    }

    public final com.google.maps.android.compose.MapLifecycleEventObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapTagData(componentCallbacks=");
        sb.append(this.componentCallbacks);
        sb.append(", lifecycleObserver=");
        sb.append(this.lifecycleObserver);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.componentCallbacks.hashCode() * 31) + this.lifecycleObserver.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.maps.android.compose.MapTagData)) {
            return false;
        }
        com.google.maps.android.compose.MapTagData mapTagData = (com.google.maps.android.compose.MapTagData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.componentCallbacks, mapTagData.componentCallbacks) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifecycleObserver, mapTagData.lifecycleObserver);
    }

    public final com.google.maps.android.compose.MapTagData copy(android.content.ComponentCallbacks componentCallbacks, com.google.maps.android.compose.MapLifecycleEventObserver lifecycleObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleObserver, "");
        return new com.google.maps.android.compose.MapTagData(componentCallbacks, lifecycleObserver);
    }

    /* renamed from: component2, reason: from getter */
    public final com.google.maps.android.compose.MapLifecycleEventObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    /* renamed from: component1, reason: from getter */
    public final android.content.ComponentCallbacks getComponentCallbacks() {
        return this.componentCallbacks;
    }

    public static /* synthetic */ com.google.maps.android.compose.MapTagData copy$default(com.google.maps.android.compose.MapTagData mapTagData, android.content.ComponentCallbacks componentCallbacks, com.google.maps.android.compose.MapLifecycleEventObserver mapLifecycleEventObserver, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            componentCallbacks = mapTagData.componentCallbacks;
        }
        if ((i & 2) != 0) {
            mapLifecycleEventObserver = mapTagData.lifecycleObserver;
        }
        return mapTagData.copy(componentCallbacks, mapLifecycleEventObserver);
    }
}
