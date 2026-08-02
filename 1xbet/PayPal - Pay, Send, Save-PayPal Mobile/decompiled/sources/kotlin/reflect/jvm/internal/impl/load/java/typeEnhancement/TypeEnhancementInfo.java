package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class TypeEnhancementInfo {
    private final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> getHighSpeedVideoSizes;

    public TypeEnhancementInfo(java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoSizes = map;
    }

    public final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> getMap() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo copyForWarnings() {
        java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> map = this.getHighSpeedVideoSizes;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.copy$default((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) entry.getValue(), null, null, false, true, 7, null));
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo(linkedHashMap);
    }
}
