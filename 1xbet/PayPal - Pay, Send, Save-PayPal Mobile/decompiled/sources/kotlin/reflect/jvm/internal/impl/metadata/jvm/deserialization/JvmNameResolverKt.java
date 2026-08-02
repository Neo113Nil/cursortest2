package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes5.dex */
public final class JvmNameResolverKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record> toExpandedRecordsList(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.ensureCapacity(list.size());
        for (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record record : list) {
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
