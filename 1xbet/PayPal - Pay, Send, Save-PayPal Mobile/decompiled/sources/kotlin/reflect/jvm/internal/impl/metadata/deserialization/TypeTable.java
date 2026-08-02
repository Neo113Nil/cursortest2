package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class TypeTable {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> getHighSpeedVideoSizes;

    public TypeTable(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        java.util.ArrayList typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeList2, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> list = typeList2;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) obj;
                if (i >= firstNullable) {
                    type = type.toBuilder().setNullable(true).build();
                }
                arrayList.add(type);
                i++;
            }
            typeList = arrayList;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeList, "");
        this.getHighSpeedVideoSizes = typeList;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type get(int i) {
        return this.getHighSpeedVideoSizes.get(i);
    }
}
