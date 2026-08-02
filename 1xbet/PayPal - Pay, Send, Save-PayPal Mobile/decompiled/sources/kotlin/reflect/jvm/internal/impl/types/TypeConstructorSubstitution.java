package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class TypeConstructorSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion(null);

    public abstract kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor);

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return get(kotlinType.getConstructor());
    }

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap$default(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion companion, java.util.Map map, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.createByConstructorsMap(map, z);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap(final java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> map, final boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            return new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public final kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
                    return map.get(typeConstructor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public final boolean isEmpty() {
                    return map.isEmpty();
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public final boolean approximateCapturedTypes() {
                    return z;
                }
            };
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) parameters);
            if (typeParameterDescriptor != null && typeParameterDescriptor.isCapturedFromOuterDeclaration()) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters2, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = parameters2;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getTypeConstructor());
                }
                return createByConstructorsMap$default(this, kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(arrayList, list)), false, 2, null);
            }
            return new kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution(parameters, list);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap(java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            return createByConstructorsMap$default(this, map, false, 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution createByConstructorsMap(java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> map) {
        return Companion.createByConstructorsMap(map);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }
}
