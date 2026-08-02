package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÀ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/MapperTypeWrapper;", "Landroid/view/View;", "T", "", "Ljava/lang/Class;", "type", "Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "mapper", "<init>", "(Ljava/lang/Class;Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;)V", "component1$dd_sdk_android_session_replay_release", "()Ljava/lang/Class;", "component2$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "copy", "(Ljava/lang/Class;Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;)Lcom/datadog/android/sessionreplay/MapperTypeWrapper;", "other", "", "equals", "(Ljava/lang/Object;)Z", "getUnsafeMapper", "", "hashCode", "()I", "view", "supportsView", "(Landroid/view/View;)Z", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "getMapper$dd_sdk_android_session_replay_release", "Ljava/lang/Class;", "getType$dd_sdk_android_session_replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MapperTypeWrapper<T extends android.view.View> {
    private final com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<T> mapper;
    private final java.lang.Class<T> type;

    /* JADX WARN: Multi-variable type inference failed */
    public MapperTypeWrapper(java.lang.Class<T> cls, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<? super T> wireframeMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframeMapper, "");
        this.type = cls;
        this.mapper = wireframeMapper;
    }

    public final java.lang.Class<T> getType$dd_sdk_android_session_replay_release() {
        return this.type;
    }

    public final com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<T> getMapper$dd_sdk_android_session_replay_release() {
        return this.mapper;
    }

    public final boolean supportsView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return this.type.isAssignableFrom(view.getClass());
    }

    public final com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View> getUnsafeMapper() {
        com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<T> wireframeMapper = this.mapper;
        kotlin.jvm.internal.Intrinsics.checkNotNull(wireframeMapper, "");
        return wireframeMapper;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.datadog.android.sessionreplay.MapperTypeWrapper) other).type);
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Class<T> cls = this.type;
        com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<T> wireframeMapper = this.mapper;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MapperTypeWrapper(type=");
        sb.append(cls);
        sb.append(", mapper=");
        sb.append(wireframeMapper);
        sb.append(")");
        return sb.toString();
    }

    public final com.datadog.android.sessionreplay.MapperTypeWrapper<T> copy(java.lang.Class<T> type, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<? super T> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        return new com.datadog.android.sessionreplay.MapperTypeWrapper<>(type, mapper);
    }

    public final com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<T> component2$dd_sdk_android_session_replay_release() {
        return this.mapper;
    }

    public final java.lang.Class<T> component1$dd_sdk_android_session_replay_release() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.sessionreplay.MapperTypeWrapper copy$default(com.datadog.android.sessionreplay.MapperTypeWrapper mapperTypeWrapper, java.lang.Class cls, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper wireframeMapper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cls = mapperTypeWrapper.type;
        }
        if ((i & 2) != 0) {
            wireframeMapper = mapperTypeWrapper.mapper;
        }
        return mapperTypeWrapper.copy(cls, wireframeMapper);
    }
}
