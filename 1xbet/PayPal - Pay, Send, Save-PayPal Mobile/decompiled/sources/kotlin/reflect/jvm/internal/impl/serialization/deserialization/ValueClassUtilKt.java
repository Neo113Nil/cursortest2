package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (r6 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<T> loadValueClassRepresentation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r5, boolean z, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, ? extends T> function1, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends T> function12) {
        T invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        if (r5.hasInlineClassUnderlyingPropertyName()) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, r5.getInlineClassUnderlyingPropertyName());
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type inlineClassUnderlyingType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.inlineClassUnderlyingType(r5, typeTable);
            if ((inlineClassUnderlyingType == null || (invoke = function1.invoke(inlineClassUnderlyingType)) == null) && (invoke = function12.invoke(name2)) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot determine underlying type for value class ");
                sb.append(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, r5.getFqName()));
                sb.append(" with property ");
                sb.append(name2);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            return new kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation(name2, invoke);
        }
        if (!z || !kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VALUE_CLASS.get(r5.getFlags()).booleanValue()) {
            return null;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor> constructorList = r5.getConstructorList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructorList, "");
        java.util.Iterator<T> it = constructorList.iterator();
        boolean z2 = false;
        java.lang.Object obj = null;
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SECONDARY.get(((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) next).getFlags()).booleanValue()) {
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    obj = next;
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) obj;
        if (constructor == null) {
            return null;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list = valueParameterList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter : list) {
            kotlin.reflect.jvm.internal.impl.name.Name name3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, valueParameter.getName());
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameter);
            arrayList.add(kotlin.TuplesKt.to(name3, function1.invoke(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(valueParameter, typeTable))));
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation(arrayList);
    }
}
