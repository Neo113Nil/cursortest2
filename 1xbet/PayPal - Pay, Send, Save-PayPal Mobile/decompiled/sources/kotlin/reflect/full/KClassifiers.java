package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a;\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\t\u0010\n\u001aM\u0010\r\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u001b\u0010\u0019\u001a\u00020\b*\u00020\u00008G¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlin/reflect/KClassifier;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/KType;", "createType", "(Lkotlin/reflect/KClassifier;Ljava/util/List;ZLjava/util/List;)Lkotlin/reflect/KType;", "Lkotlin/reflect/KClass;", "mutableCollectionClass", "createTypeImpl", "(Lkotlin/reflect/KClassifier;Ljava/util/List;ZLjava/util/List;Lkotlin/reflect/KClass;)Lkotlin/reflect/KType;", "", "parametersSize", "argumentsSize", "", "checkArgumentsSize", "(II)V", "getStarProjectedType", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KType;", "getStarProjectedType$annotations", "(Lkotlin/reflect/KClassifier;)V", "starProjectedType"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KClassifiers {
    public static /* synthetic */ void getStarProjectedType$annotations(kotlin.reflect.KClassifier kClassifier) {
    }

    public static /* synthetic */ kotlin.reflect.KType createType$default(kotlin.reflect.KClassifier kClassifier, java.util.List list, boolean z, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return createType(kClassifier, list, z, list2);
    }

    public static final kotlin.reflect.KType createType(kotlin.reflect.KClassifier kClassifier, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z, java.util.List<? extends java.lang.annotation.Annotation> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        return createTypeImpl$default(kClassifier, list, z, list2, null, 8, null);
    }

    public static /* synthetic */ kotlin.reflect.KType createTypeImpl$default(kotlin.reflect.KClassifier kClassifier, java.util.List list, boolean z, java.util.List list2, kotlin.reflect.KClass kClass, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            kClass = null;
        }
        return createTypeImpl(kClassifier, list, z, list2, kClass);
    }

    public static final kotlin.reflect.KType createTypeImpl(kotlin.reflect.KClassifier kClassifier, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z, java.util.List<? extends java.lang.annotation.Annotation> list2, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            return kotlin.reflect.full.K1ImplementationKt.createK1KType(kClassifier, list, z);
        }
        kotlin.reflect.KClass kClass2 = kClassifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) kClassifier : null;
        java.util.List<kotlin.reflect.KTypeParameter> allTypeParameters = kClass2 != null ? kotlin.reflect.jvm.internal.types.CapturedKTypeKt.allTypeParameters(kClass2) : null;
        if (allTypeParameters == null) {
            allTypeParameters = kotlin.collections.CollectionsKt.emptyList();
        }
        checkArgumentsSize(allTypeParameters.size(), list.size());
        return new kotlin.reflect.jvm.internal.types.SimpleKType(kClassifier, list, z, list2, null, false, false, false, kClass, null, 512, null);
    }

    public static final void checkArgumentsSize(int i, int i2) {
        if (i == i2) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class declares ");
        sb.append(i);
        sb.append(" type parameters, but ");
        sb.append(i2);
        sb.append(" were provided.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final kotlin.reflect.KType getStarProjectedType(kotlin.reflect.KClassifier kClassifier) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassifier, "");
        kotlin.reflect.jvm.internal.KClassImpl kClassImpl = kClassifier instanceof kotlin.reflect.jvm.internal.KClassImpl ? (kotlin.reflect.jvm.internal.KClassImpl) kClassifier : null;
        if (kClassImpl == null || (descriptor = kClassImpl.getDescriptor()) == null) {
            return createType$default(kClassifier, null, false, null, 7, null);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = descriptor.getTypeConstructor().getParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
        if (parameters.isEmpty()) {
            return createType$default(kClassifier, null, false, null, 7, null);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            arrayList.add(kotlin.reflect.KTypeProjection.INSTANCE.getSTAR());
        }
        return createType$default(kClassifier, arrayList, false, null, 6, null);
    }
}
