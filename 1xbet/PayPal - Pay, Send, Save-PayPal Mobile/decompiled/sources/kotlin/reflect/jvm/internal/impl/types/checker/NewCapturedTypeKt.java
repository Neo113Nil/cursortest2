package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class NewCapturedTypeKt {
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType captureFromArguments(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureStatus, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = simpleType;
        if (simpleType2.getArguments().size() == simpleType2.getConstructor().getParameters().size()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = simpleType2.getArguments();
            java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list = arguments;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = simpleType2.getConstructor().getParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
                        java.util.List<kotlin.Pair> zip = kotlin.collections.CollectionsKt.zip(list, parameters);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(zip, 10));
                        for (kotlin.Pair pair : zip) {
                            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) pair.component1();
                            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) pair.component2();
                            if (typeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                                kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = (typeProjection.isStarProjection() || typeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) ? null : typeProjection.getType().unwrap();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
                                typeProjection = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(captureStatus, unwrap, typeProjection, typeParameterDescriptor));
                            }
                            arrayList2.add(typeProjection);
                        }
                        java.util.ArrayList arrayList3 = arrayList2;
                        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor buildSubstitutor = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(simpleType2.getConstructor(), arrayList3).buildSubstitutor();
                        int size = arguments.size();
                        for (int i = 0; i < size; i++) {
                            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2 = arguments.get(i);
                            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection3 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) arrayList3.get(i);
                            if (typeProjection2.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                                java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = simpleType2.getConstructor().getParameters().get(i).getUpperBounds();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                java.util.Iterator<T> it2 = upperBounds.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default.INSTANCE.prepareType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) buildSubstitutor.safeSubstitute((kotlin.reflect.jvm.internal.impl.types.KotlinType) it2.next(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT).unwrap()));
                                }
                                java.util.ArrayList arrayList5 = arrayList4;
                                if (!typeProjection2.isStarProjection() && typeProjection2.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
                                    arrayList5.add(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default.INSTANCE.prepareType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) typeProjection2.getType().unwrap()));
                                }
                                kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection3.getType();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(type, "");
                                ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) type).getConstructor().initializeSupertypes(arrayList5);
                            }
                        }
                        arrayList = arrayList3;
                        if (arrayList == null) {
                            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(simpleType2.getAttributes(), simpleType2.getConstructor(), arrayList, simpleType2.isMarkedNullable(), (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
                        }
                        return null;
                    }
                }
            }
        }
        arrayList = null;
        if (arrayList == null) {
        }
    }
}
