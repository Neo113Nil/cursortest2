package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* loaded from: classes5.dex */
public final class CapturedTypeConstructorKt {
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType createCapturedType(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeSubstitution wrapWithCapturingSubstitution$default(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution wrapWithCapturingSubstitution(final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitution, "");
        if (typeSubstitution instanceof kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution) {
            kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution indexedParametersSubstitution = (kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution) typeSubstitution;
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
            java.util.List<kotlin.Pair> zip = kotlin.collections.ArraysKt.zip(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(zip, 10));
            for (kotlin.Pair pair : zip) {
                arrayList.add(Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.types.TypeProjection) pair.getFirst(), (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) pair.getSecond()));
            }
            return new kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution(parameters, (kotlin.reflect.jvm.internal.impl.types.TypeProjection[]) arrayList.toArray(new kotlin.reflect.jvm.internal.impl.types.TypeProjection[0]), z);
        }
        return new kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2
            @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final boolean approximateContravariantCapturedTypes() {
                return z;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* renamed from: get */
            public final kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
                kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get = super.mo23902get(kotlinType);
                if (mo23902get == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
                Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.Camera2StreamConfigurationMap(mo23902get, mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor : null);
                return Camera2StreamConfigurationMap;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap(final kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() == typeProjection.getProjectionKind()) {
            if (typeProjection.isStarProjection()) {
                kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageManager, "");
                return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType(storageManager, new kotlin.jvm.functions.Function0(typeProjection) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$$Lambda$0
                    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighResolutionOutputSizeshNQ4ISI;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        return kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
                    }

                    {
                        this.getHighResolutionOutputSizeshNQ4ISI = typeProjection;
                    }
                }));
            }
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeProjection.getType());
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(createCapturedType(typeProjection));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return type;
    }
}
