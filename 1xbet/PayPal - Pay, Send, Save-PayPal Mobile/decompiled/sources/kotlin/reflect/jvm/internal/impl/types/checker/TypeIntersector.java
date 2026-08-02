package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class TypeIntersector {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector();

    private TypeIntersector() {
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType intersectTypes$descriptors(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> list) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType createType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType : list) {
            if (simpleType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection = supertypes;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
                for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : collection) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
                    kotlin.reflect.jvm.internal.impl.types.SimpleType upperIfFlexible = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(kotlinType);
                    if (simpleType.isMarkedNullable()) {
                        upperIfFlexible = upperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(upperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.types.SimpleType> arrayList3 = arrayList;
        kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability resultNullability = kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.getHighSpeedVideoSizes;
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            resultNullability = resultNullability.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) it.next());
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType newCapturedType : arrayList3) {
            if (resultNullability == kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.getHighResolutionOutputSizeshNQ4ISI) {
                if (newCapturedType instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) {
                    newCapturedType = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withNotNullProjection((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) newCapturedType);
                }
                newCapturedType = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(newCapturedType, false, 1, null);
            }
            linkedHashSet.add(newCapturedType);
        }
        java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> list2 = list;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((kotlin.reflect.jvm.internal.impl.types.SimpleType) it2.next()).getAttributes());
        }
        java.util.Iterator it3 = arrayList4.iterator();
        if (!it3.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it3.next();
        while (it3.hasNext()) {
            next = ((kotlin.reflect.jvm.internal.impl.types.TypeAttributes) next).intersect((kotlin.reflect.jvm.internal.impl.types.TypeAttributes) it3.next());
        }
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes = (kotlin.reflect.jvm.internal.impl.types.TypeAttributes) next;
        final java.util.LinkedHashSet linkedHashSet3 = linkedHashSet2;
        if (linkedHashSet3.size() == 1) {
            createType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.collections.CollectionsKt.single(linkedHashSet3);
        } else {
            new kotlin.jvm.functions.Function0(linkedHashSet3) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$$Lambda$0
                private final java.util.Set getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoFpsRanges = linkedHashSet3;
                }
            };
            java.util.LinkedHashSet linkedHashSet4 = linkedHashSet3;
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(linkedHashSet4, new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
            highSpeedVideoFpsRangesFor.isEmpty();
            kotlin.reflect.jvm.internal.impl.types.SimpleType findIntersectionType = kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.findIntersectionType(highSpeedVideoFpsRangesFor);
            if (findIntersectionType != null) {
                createType = findIntersectionType;
            } else {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion.getDefault()));
                highSpeedVideoFpsRangesFor2.isEmpty();
                createType = highSpeedVideoFpsRangesFor2.size() < 2 ? (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.collections.CollectionsKt.single(highSpeedVideoFpsRangesFor2) : new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(linkedHashSet4).createType();
            }
        }
        return createType.replaceAttributes(typeAttributes);
    }

    private static java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighSpeedVideoFpsRangesFor(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> collection, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.types.SimpleType, ? super kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> function2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        java.util.Iterator it = arrayList.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) it.next();
            java.util.ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) it2.next();
                    if (simpleType2 != simpleType) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(simpleType2);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(simpleType);
                        if (function2.invoke(simpleType2, simpleType).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class ResultNullability {
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability Camera2StreamConfigurationMap;
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoFpsRangesFor;
        public static final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoSizes;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[] getOutputMinFrameDuration;

        public abstract kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType);

        static final class START extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            START(java.lang.String str) {
                super(str, r0, r0);
                byte b = 0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
                return getHighSpeedVideoSizes(unwrappedType);
            }
        }

        private ResultNullability(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.START start = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.START("START");
            getHighSpeedVideoSizes = start;
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.ACCEPT_NULL accept_null = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.ACCEPT_NULL("ACCEPT_NULL");
            Camera2StreamConfigurationMap = accept_null;
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.UNKNOWN unknown = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.UNKNOWN("UNKNOWN");
            getHighSpeedVideoFpsRangesFor = unknown;
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.NOT_NULL not_null = new kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.NOT_NULL("NOT_NULL");
            getHighResolutionOutputSizeshNQ4ISI = not_null;
            kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[] resultNullabilityArr = {start, accept_null, unknown, not_null};
            getOutputMinFrameDuration = resultNullabilityArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(resultNullabilityArr);
        }

        static final class ACCEPT_NULL extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            ACCEPT_NULL(java.lang.String str) {
                super(str, 1, (byte) 0);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
                return getHighSpeedVideoSizes(unwrappedType);
            }
        }

        static final class UNKNOWN extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            UNKNOWN(java.lang.String str) {
                super(str, 2, (byte) 0);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
                kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability highSpeedVideoSizes = getHighSpeedVideoSizes(unwrappedType);
                return highSpeedVideoSizes == kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.Camera2StreamConfigurationMap ? this : highSpeedVideoSizes;
            }
        }

        static final class NOT_NULL extends kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability {
            NOT_NULL(java.lang.String str) {
                super(str, 3, (byte) 0);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
                return this;
            }
        }

        protected static kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
            return unwrappedType.isMarkedNullable() ? Camera2StreamConfigurationMap : ((unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) && (((kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) unwrappedType).getOriginal() instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference)) ? getHighResolutionOutputSizeshNQ4ISI : unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference ? getHighSpeedVideoFpsRangesFor : kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType) ? getHighResolutionOutputSizeshNQ4ISI : getHighSpeedVideoFpsRangesFor;
        }

        public static kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[] values() {
            return (kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability[]) getOutputMinFrameDuration.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability.class, str);
        }

        public /* synthetic */ ResultNullability(java.lang.String str, int i, byte b) {
            this(str, i);
        }
    }

    public static final /* synthetic */ boolean access$isStrictSupertype(kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector typeIntersector, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType2, kotlinType);
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Set set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("This collections cannot be empty! input types: ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(set, null, null, null, 0, null, null, 63, null));
        return sb.toString();
    }
}
