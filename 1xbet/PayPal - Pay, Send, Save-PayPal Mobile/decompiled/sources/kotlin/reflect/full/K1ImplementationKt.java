package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/reflect/KClassifier;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "nullable", "Lkotlin/reflect/jvm/internal/types/DescriptorKType;", "createK1KType", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)Lkotlin/reflect/jvm/internal/types/DescriptorKType;", "Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;", "p0", "p1", "p2", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;Ljava/util/List;Z)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K1ImplementationKt {
    public static final kotlin.reflect.jvm.internal.types.DescriptorKType createK1KType(kotlin.reflect.KClassifier kClassifier, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor descriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (kClassifier instanceof kotlin.reflect.jvm.internal.KClassImpl) {
            descriptor = ((kotlin.reflect.jvm.internal.KClassImpl) kClassifier).getDescriptor();
        } else {
            if (!(kClassifier instanceof kotlin.reflect.jvm.internal.KTypeParameterImpl)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(kClassifier);
                sb.append(" (");
                sb.append(kClassifier.getClass());
                sb.append(')');
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            }
            descriptor = ((kotlin.reflect.jvm.internal.KTypeParameterImpl) kClassifier).getDescriptor();
        }
        kotlin.reflect.full.KClassifiers.checkArgumentsSize(descriptor.getTypeConstructor().getParameters().size(), list.size());
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        return new kotlin.reflect.jvm.internal.types.DescriptorKType(getHighSpeedVideoFpsRangesFor(typeConstructor, list, z), null, 2, null);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase starProjectionImpl;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes empty = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
        java.util.List<kotlin.reflect.KTypeProjection> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.KTypeProjection kTypeProjection = (kotlin.reflect.KTypeProjection) obj;
            kotlin.reflect.jvm.internal.types.DescriptorKType descriptorKType = (kotlin.reflect.jvm.internal.types.DescriptorKType) kTypeProjection.getType();
            kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI = descriptorKType != null ? descriptorKType.getGetHighResolutionOutputSizeshNQ4ISI() : null;
            kotlin.reflect.KVariance variance = kTypeProjection.getVariance();
            int i2 = variance == null ? -1 : kotlin.reflect.full.K1ImplementationKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
            if (i2 == -1) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = parameters.get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "");
                starProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor);
            } else if (i2 == 1) {
                kotlin.reflect.jvm.internal.impl.types.Variance variance2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
                kotlin.jvm.internal.Intrinsics.checkNotNull(getHighResolutionOutputSizeshNQ4ISI);
                starProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance2, getHighResolutionOutputSizeshNQ4ISI);
            } else if (i2 == 2) {
                kotlin.reflect.jvm.internal.impl.types.Variance variance3 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(getHighResolutionOutputSizeshNQ4ISI);
                starProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance3, getHighResolutionOutputSizeshNQ4ISI);
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.reflect.jvm.internal.impl.types.Variance variance4 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(getHighResolutionOutputSizeshNQ4ISI);
                starProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance4, getHighResolutionOutputSizeshNQ4ISI);
            }
            arrayList.add(starProjectionImpl);
            i++;
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(empty, typeConstructor, arrayList, z, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.KVariance.values().length];
            try {
                iArr[kotlin.reflect.KVariance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.KVariance.IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.KVariance.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
