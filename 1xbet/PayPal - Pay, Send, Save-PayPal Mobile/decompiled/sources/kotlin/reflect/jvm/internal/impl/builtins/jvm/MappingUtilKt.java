package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class MappingUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createMappedTypeParametersSubstitution(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor2, "");
        classDescriptor.getDeclaredTypeParameters().size();
        classDescriptor2.getDeclaredTypeParameters().size();
        kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion companion = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = declaredTypeParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getTypeConstructor());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters2 = classDescriptor2.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = declaredTypeParameters2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it2.next()).getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(defaultType));
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.createByConstructorsMap$default(companion, kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(arrayList2, arrayList3)), false, 2, null);
    }
}
