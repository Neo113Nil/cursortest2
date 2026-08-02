package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes5.dex */
public final class JvmNameResolver extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase {
    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JvmNameResolver(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes stringTableTypes, java.lang.String[] strArr) {
        super(strArr, r1, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverKt.toExpandedRecordsList(r2));
        java.util.Set set;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringTableTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.util.List<java.lang.Integer> localNameList = stringTableTypes.getLocalNameList();
        if (localNameList.isEmpty()) {
            set = kotlin.collections.SetsKt.emptySet();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(localNameList);
            set = kotlin.collections.CollectionsKt.toSet(localNameList);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record> recordList = stringTableTypes.getRecordList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(recordList, "");
        this.getHighSpeedVideoFpsRangesFor = stringTableTypes;
    }
}
