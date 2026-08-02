package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public abstract class AbstractSignatureParts<TAnnotation> {
    public abstract boolean forceWarning(TAnnotation tannotation, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    public abstract kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract java.lang.Iterable<TAnnotation> getAnnotations(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    public abstract java.lang.Iterable<TAnnotation> getContainerAnnotations();

    public abstract kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    protected abstract kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus getDefaultNullability(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers);

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getEnhancedForWarnings(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getFqNameUnsafe(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    public abstract kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker);

    public abstract boolean isK2();

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> list;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier;
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> list2 = upperBounds;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!typeSystem.isError((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it.next())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list2) {
                        if (getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) obj) != null) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0(upperBounds, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$1
                        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts getHighResolutionOutputSizeshNQ4ISI;
                        private final java.util.List getHighSpeedVideoSizes;

                        @Override // kotlin.jvm.functions.Function0
                        public java.lang.Object invoke() {
                            return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                        }

                        {
                            this.getHighSpeedVideoSizes = upperBounds;
                            this.getHighResolutionOutputSizeshNQ4ISI = this;
                        }
                    });
                    if (!arrayList2.isEmpty()) {
                        java.util.ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            java.util.Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                if (getShouldPropagateBoundNullness((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it2.next())) {
                                    list = upperBounds;
                                }
                            }
                        }
                        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY, false);
                    }
                    if (!((java.util.List) lazy.getValue()).isEmpty()) {
                        java.util.List list3 = (java.util.List) lazy.getValue();
                        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                            java.util.Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                if (getShouldPropagateBoundNullness((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it3.next())) {
                                    list = (java.util.List) lazy.getValue();
                                }
                            }
                        }
                        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY, true);
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> list4 = list;
                    if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                        java.util.Iterator<T> it4 = list4.iterator();
                        while (it4.hasNext()) {
                            if (!typeSystem.isNullableType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it4.next())) {
                                nullabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
                                break;
                            }
                        }
                    }
                    nullabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
                    return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(nullabilityQualifier, list != upperBounds);
                }
            }
        }
        return null;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiers(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> iterable, final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers;
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier;
        kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(kotlinTypeMarker);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighSpeedVideoFpsRangesFor(it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        boolean z5 = true;
        if (isCovariant() && (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty())) {
            java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!isEqual(kotlinTypeMarker, it2.next())) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        int size = getForceOnlyHeadTypeConstructor() ? 1 : highSpeedVideoFpsRangesFor.size();
        final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] javaTypeQualifiersArr = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[size];
        final int i = 0;
        while (i < size) {
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0(this, highSpeedVideoFpsRangesFor, i) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$2
                private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts Camera2StreamConfigurationMap;
                private final int getHighSpeedVideoFpsRanges;
                private final java.util.List getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.Camera2StreamConfigurationMap = this;
                    this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRanges = i;
                }
            });
            if (i > 0 && z2) {
                if (isK2() && (javaDefaultQualifiers = (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers) lazy.getValue()) != null && javaDefaultQualifiers.getPreferQualifierOverSupertype() == z5) {
                    computeQualifiersForOverride = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor.get(i), (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers) lazy.getValue());
                } else {
                    computeQualifiersForOverride = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.Companion.getNONE();
                }
            } else {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor.get(i), (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers) lazy.getValue());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers) kotlin.collections.CollectionsKt.getOrNull((java.util.List) it3.next(), i);
                    if (typeAndDefaultQualifiers == null || (kotlinTypeMarker2 = typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI) == null) {
                        javaTypeQualifiers = null;
                    } else {
                        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(kotlinTypeMarker2);
                        if (highSpeedVideoFpsRanges == null) {
                            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker2);
                            nullabilityQualifier = enhancedForWarnings != null ? getHighSpeedVideoFpsRanges(enhancedForWarnings) : null;
                        } else {
                            nullabilityQualifier = highSpeedVideoFpsRanges;
                        }
                        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystem = getTypeSystem();
                        if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker2)))) {
                            mutabilityQualifier = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY;
                        } else {
                            mutabilityQualifier = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker2))) ? kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE : null;
                        }
                        javaTypeQualifiers = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker2) || isNotNullTypeParameterCompat(kotlinTypeMarker2), nullabilityQualifier != highSpeedVideoFpsRanges);
                    }
                    if (javaTypeQualifiers != null) {
                        arrayList3.add(javaTypeQualifiers);
                    }
                }
                java.util.ArrayList arrayList4 = arrayList3;
                boolean z6 = i == 0 && isCovariant();
                if (i == 0 && getContainerIsVarargParameter()) {
                    z3 = z;
                    z4 = true;
                } else {
                    z3 = z;
                    z4 = false;
                }
                computeQualifiersForOverride = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.computeQualifiersForOverride(highResolutionOutputSizeshNQ4ISI, arrayList4, z6, z4, z3);
            }
            javaTypeQualifiersArr[i] = computeQualifiersForOverride;
            i++;
            z5 = true;
        }
        return new kotlin.jvm.functions.Function1(typeEnhancementInfo, javaTypeQualifiersArr) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] getHighSpeedVideoFpsRanges;
            private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, ((java.lang.Number) obj).intValue());
            }

            {
                this.getHighSpeedVideoSizes = typeEnhancementInfo;
                this.getHighSpeedVideoFpsRanges = javaTypeQualifiersArr;
            }
        };
    }

    private final <T> void getHighSpeedVideoSizes(T t, java.util.List<T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends T>> function1) {
        list.add(t);
        java.lang.Iterable<? extends T> invoke = function1.invoke(t);
        if (invoke != null) {
            java.util.Iterator<? extends T> it = invoke.iterator();
            while (it.hasNext()) {
                getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>) it.next(), (java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>>) list, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>, ? extends java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>>>) function1);
            }
        }
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers> getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystem = getTypeSystem();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers(kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers$default(getAnnotationTypeQualifierResolver(), getContainerDefaultTypeQualifiers(), getAnnotations(kotlinTypeMarker), false, 4, null), null);
        kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends T>> function1 = new kotlin.jvm.functions.Function1(this, typeSystem) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$4
            private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
                this.getHighSpeedVideoSizes = typeSystem;
            }
        };
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>) typeAndDefaultQualifiers, (java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>>) arrayList, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>, ? extends java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts<TAnnotation>>>) function1);
        return arrayList;
    }

    static final class TypeAndDefaultQualifiers {
        final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker Camera2StreamConfigurationMap;
        final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType getHighSpeedVideoFpsRangesFor;

        public TypeAndDefaultQualifiers(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
            this.getHighResolutionOutputSizeshNQ4ISI = kotlinTypeMarker;
            this.getHighSpeedVideoFpsRangesFor = javaTypeQualifiersByElementType;
            this.Camera2StreamConfigurationMap = typeParameterMarker;
        }
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts abstractSignatureParts, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return abstractSignatureParts.forceWarning(obj, typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI);
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(java.util.List list, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts abstractSignatureParts) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker enhancedForWarnings = abstractSignatureParts.getEnhancedForWarnings((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it.next());
            if (enhancedForWarnings != null) {
                arrayList.add(enhancedForWarnings);
            }
        }
        return arrayList;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts abstractSignatureParts, java.util.List list, int i) {
        kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType containerApplicabilityType;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers) list.get(i);
        boolean z = typeAndDefaultQualifiers.Camera2StreamConfigurationMap == null;
        boolean z2 = abstractSignatureParts.getContainerApplicabilityType() == kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z || z2) {
            containerApplicabilityType = abstractSignatureParts.getContainerApplicabilityType();
        } else {
            containerApplicabilityType = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE;
        }
        kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = typeAndDefaultQualifiers.getHighSpeedVideoFpsRangesFor;
        if (javaTypeQualifiersByElementType != null) {
            return javaTypeQualifiersByElementType.get(containerApplicabilityType);
        }
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] javaTypeQualifiersArr, int i) {
        java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> map;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers;
        return (typeEnhancementInfo == null || (map = typeEnhancementInfo.getMap()) == null || (javaTypeQualifiers = map.get(java.lang.Integer.valueOf(i))) == null) ? (i < 0 || i >= javaTypeQualifiersArr.length) ? kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[i] : javaTypeQualifiers;
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts abstractSignatureParts, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker> parameters;
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAndDefaultQualifiers, "");
        java.util.ArrayList arrayList = null;
        if (abstractSignatureParts.getSkipRawTypeArguments() && (kotlinTypeMarker = typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI) != null && typeSystemContext.isRawType(kotlinTypeMarker)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2 = typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI;
        if (kotlinTypeMarker2 != null && (typeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2)) != null && (parameters = typeSystemContext.getParameters(typeConstructor)) != null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker> list = parameters;
            java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker> arguments = typeSystemContext.getArguments(typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI);
            java.util.Iterator<T> it = list.iterator();
            java.util.Iterator<T> it2 = arguments.iterator();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10)));
            while (it.hasNext() && it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker = (kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker) it.next();
                kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type = typeSystemContext.getType((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) it2.next());
                arrayList2.add(type == null ? new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers(null, typeAndDefaultQualifiers.getHighSpeedVideoFpsRangesFor, typeParameterMarker) : new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers(type, kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers$default(abstractSignatureParts.getAnnotationTypeQualifierResolver(), typeAndDefaultQualifiers.getHighSpeedVideoFpsRangesFor, abstractSignatureParts.getAnnotations(type), false, 4, null), typeParameterMarker));
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers getHighResolutionOutputSizeshNQ4ISI(final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers javaDefaultQualifiers) {
        java.util.List emptyList;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker;
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor;
        if (typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI == null) {
            kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystem = getTypeSystem();
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker = typeAndDefaultQualifiers.Camera2StreamConfigurationMap;
            if ((typeParameterMarker != null ? typeSystem.getVariance(typeParameterMarker) : null) == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z = typeAndDefaultQualifiers.Camera2StreamConfigurationMap == null;
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2 = typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI;
        if (kotlinTypeMarker2 == null || (emptyList = getAnnotations(kotlinTypeMarker2)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystem2 = getTypeSystem();
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker3 = typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterClassifier = (kotlinTypeMarker3 == null || (typeConstructor = typeSystem2.typeConstructor(kotlinTypeMarker3)) == null) ? null : typeSystem2.getTypeParameterClassifier(typeConstructor);
        boolean z2 = getContainerApplicabilityType() == kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z) {
            if (!z2 && getEnableImprovementsInStrictMode() && (kotlinTypeMarker = typeAndDefaultQualifiers.getHighResolutionOutputSizeshNQ4ISI) != null && isArrayOrPrimitiveArray(kotlinTypeMarker)) {
                java.lang.Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                emptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) emptyList);
            } else {
                emptyList = kotlin.collections.CollectionsKt.plus((java.lang.Iterable) getContainerAnnotations(), (java.lang.Iterable) emptyList);
            }
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier extractMutability = getAnnotationTypeQualifierResolver().extractMutability(emptyList);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullability = getAnnotationTypeQualifierResolver().extractNullability(emptyList, new kotlin.jvm.functions.Function1(this, typeAndDefaultQualifiers) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.TypeAndDefaultQualifiers getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, obj));
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
                this.getHighResolutionOutputSizeshNQ4ISI = typeAndDefaultQualifiers;
            }
        });
        if (extractNullability != null) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(extractNullability.getQualifier(), extractMutability, extractNullability.getQualifier() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL && typeParameterClassifier != null, extractNullability.isForWarningOnly());
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus highSpeedVideoSizes = typeParameterClassifier != null ? getHighSpeedVideoSizes(typeParameterClassifier) : null;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus defaultNullability = getDefaultNullability(highSpeedVideoSizes, javaDefaultQualifiers);
        boolean z3 = (highSpeedVideoSizes != null ? highSpeedVideoSizes.getQualifier() : null) == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL || !(typeParameterClassifier == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull());
        kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker2 = typeAndDefaultQualifiers.Camera2StreamConfigurationMap;
        if (typeParameterMarker2 == null || (nullabilityQualifierWithMigrationStatus = getHighSpeedVideoSizes(typeParameterMarker2)) == null) {
            nullabilityQualifierWithMigrationStatus = null;
        } else if (nullabilityQualifierWithMigrationStatus.getQualifier() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE) {
            nullabilityQualifierWithMigrationStatus = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        if (nullabilityQualifierWithMigrationStatus != null && (defaultNullability == null || ((!nullabilityQualifierWithMigrationStatus.isForWarningOnly() || defaultNullability.isForWarningOnly()) && ((!nullabilityQualifierWithMigrationStatus.isForWarningOnly() && defaultNullability.isForWarningOnly()) || (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(defaultNullability.getQualifier()) >= 0 && nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(defaultNullability.getQualifier()) > 0))))) {
            defaultNullability = nullabilityQualifierWithMigrationStatus;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(defaultNullability != null ? defaultNullability.getQualifier() : null, extractMutability, z3, defaultNullability != null && defaultNullability.isForWarningOnly());
    }

    public boolean isNotNullTypeParameterCompat(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return false;
    }

    public boolean getShouldPropagateBoundNullness(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return true;
    }
}
