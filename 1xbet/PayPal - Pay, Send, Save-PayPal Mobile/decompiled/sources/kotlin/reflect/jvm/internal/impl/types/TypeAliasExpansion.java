package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeAliasExpansion {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion.Companion(null);
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeProjection> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    private TypeAliasExpansion(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, ? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> map) {
        this.getHighSpeedVideoFpsRanges = typeAliasExpansion;
        this.getHighSpeedVideoSizes = typeAliasDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.Camera2StreamConfigurationMap = map;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getDescriptor() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection getReplacement(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return this.Camera2StreamConfigurationMap.get(mo23898getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasDescriptor, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, typeAliasDescriptor)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion = this.getHighSpeedVideoFpsRanges;
        return typeAliasExpansion != null && typeAliasExpansion.isRecursion(typeAliasDescriptor);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion create(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = parameters;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getOriginal());
            }
            return new kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, list, kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(arrayList, list)), null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TypeAliasExpansion(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.util.List list, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }
}
