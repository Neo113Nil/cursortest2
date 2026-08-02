package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000\u001a\u0015\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\"\u0006\b\u0000\u0010\u0007\u0018\u0001H\u0082\b¨\u0006\b"}, d2 = {"getMutableCollectionKClass", "Lkotlin/reflect/jvm/internal/types/MutableCollectionKClass;", "mutableFqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "readonlyKClass", "Lkotlin/reflect/KClass;", "mutableClassOf", "T", "kotlin-reflection"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MutableCollectionKClassKt {
    public static final kotlin.reflect.jvm.internal.types.MutableCollectionKClass<?> getMutableCollectionKClass(final kotlin.reflect.jvm.internal.impl.name.FqName fqName, final kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return new kotlin.reflect.jvm.internal.types.MutableCollectionKClass<>(kClass, fqName.asString(), new kotlin.jvm.functions.Function1(kClass, fqName) { // from class: kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.KClass getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.types.MutableCollectionKClass) obj);
            }

            {
                this.getHighSpeedVideoSizes = kClass;
                this.getHighSpeedVideoFpsRangesFor = fqName;
            }
        }, new kotlin.jvm.functions.Function1(fqName, kClass) { // from class: kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.name.FqName getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.KClass getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.types.MutableCollectionKClass) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = fqName;
                this.getHighSpeedVideoFpsRanges = kClass;
            }
        });
    }

    static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.KClass kClass, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.types.MutableCollectionKClass mutableCollectionKClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableCollectionKClass, "");
        java.util.List<kotlin.reflect.KTypeParameter> typeParameters = kClass.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        java.util.Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.KTypeParameterImpl kTypeParameterImpl = new kotlin.reflect.jvm.internal.KTypeParameterImpl(mutableCollectionKClass, ((kotlin.reflect.KTypeParameter) it.next()).getCamera2StreamConfigurationMap(), (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableIterable) || kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableIterator)) ? kotlin.reflect.KVariance.OUT : kotlin.reflect.KVariance.INVARIANT, false);
            kTypeParameterImpl.setUpperBounds(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.StandardKTypes.INSTANCE.getNULLABLE_ANY()));
            arrayList.add(kTypeParameterImpl);
        }
        return arrayList;
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.KClass kClass, kotlin.reflect.jvm.internal.types.MutableCollectionKClass mutableCollectionKClass) {
        kotlin.reflect.KClass<?> kClass2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableCollectionKClass, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableCollection)) {
            kotlin.reflect.KType mutableCollectionType = kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.lang.Iterable.class, kotlin.reflect.KTypeProjection.INSTANCE.getSTAR()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableCollectionType, "");
            kClass2 = ((kotlin.reflect.jvm.internal.types.AbstractKType) mutableCollectionType).getMutableCollectionClass();
            if (kClass2 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No mutable collection class found: ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Iterable.class));
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableList)) {
            kotlin.reflect.KType mutableCollectionType2 = kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.Collection.class, kotlin.reflect.KTypeProjection.INSTANCE.getSTAR()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableCollectionType2, "");
            kClass2 = ((kotlin.reflect.jvm.internal.types.AbstractKType) mutableCollectionType2).getMutableCollectionClass();
            if (kClass2 == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No mutable collection class found: ");
                sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Collection.class));
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb2.toString());
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableSet)) {
            kotlin.reflect.KType mutableCollectionType3 = kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.Collection.class, kotlin.reflect.KTypeProjection.INSTANCE.getSTAR()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableCollectionType3, "");
            kClass2 = ((kotlin.reflect.jvm.internal.types.AbstractKType) mutableCollectionType3).getMutableCollectionClass();
            if (kClass2 == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("No mutable collection class found: ");
                sb3.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Collection.class));
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb3.toString());
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableListIterator)) {
            kotlin.reflect.KType mutableCollectionType4 = kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.Iterator.class, kotlin.reflect.KTypeProjection.INSTANCE.getSTAR()));
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableCollectionType4, "");
            kClass2 = ((kotlin.reflect.jvm.internal.types.AbstractKType) mutableCollectionType4).getMutableCollectionClass();
            if (kClass2 == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("No mutable collection class found: ");
                sb4.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.Iterator.class));
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb4.toString());
            }
        } else {
            kClass2 = null;
        }
        java.util.List<kotlin.reflect.KTypeParameter> typeParameters = mutableCollectionKClass.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        java.util.Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.reflect.full.KClassifiers.createType$default((kotlin.reflect.KTypeParameter) it.next(), null, false, null, 7, null)));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new kotlin.reflect.KClass[]{kClass, kClass2});
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOfNotNull, 10));
        java.util.Iterator it2 = listOfNotNull.iterator();
        while (it2.hasNext()) {
            arrayList3.add(kotlin.reflect.full.KClassifiers.createType$default((kotlin.reflect.KClass) it2.next(), arrayList2, false, null, 6, null));
        }
        return arrayList3;
    }
}
