package com.discover.mpos.sdk.core.debug;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J!\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0014R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/DefaultDebugDataStorage;", "Lcom/discover/mpos/sdk/core/debug/DebugDataStorage;", "", "", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Ljava/util/Map;)V", "", "clear", "()V", "key", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "obj", "put", "(Ljava/lang/String;Lcom/discover/mpos/sdk/core/emv/EmvData;)V", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;[B)V", "Ljava/util/Map;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DefaultDebugDataStorage implements com.discover.mpos.sdk.core.debug.DebugDataStorage {
    private final java.util.Map<java.lang.String, java.lang.String> storage;

    public DefaultDebugDataStorage(java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.storage = map;
    }

    public /* synthetic */ DefaultDebugDataStorage(java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
    }

    @Override // com.discover.mpos.sdk.core.debug.DebugDataStorage
    public final void put(java.lang.String key, com.discover.mpos.sdk.core.emv.EmvData obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.storage.put(key, obj.toHexString());
    }

    @Override // com.discover.mpos.sdk.core.debug.DebugDataStorage
    public final void put(java.lang.String key, byte[] obj) {
        java.lang.String hexString;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.Map<java.lang.String, java.lang.String> map = this.storage;
        if (obj != null && (hexString = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(obj)) != null) {
            str = hexString;
        }
        map.put(key, str);
    }

    @Override // com.discover.mpos.sdk.core.debug.DebugDataStorage
    public final void put(java.lang.String key, boolean obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.storage.put(key, java.lang.String.valueOf(obj));
    }

    @Override // com.discover.mpos.sdk.core.debug.DebugDataStorage
    public final java.lang.String get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.String str = this.storage.get(key);
        return str == null ? "" : str;
    }

    @Override // com.discover.mpos.sdk.core.debug.DebugDataStorage
    public final void clear() {
        this.storage.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDebugDataStorage() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
