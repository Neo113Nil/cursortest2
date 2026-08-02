package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class IntegerLiteralTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion(null);
    private final long Camera2StreamConfigurationMap;
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return false;
    }

    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v18, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final kotlin.reflect.jvm.internal.impl.types.SimpleType findIntersectionType(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> collection) {
            java.util.Set intersect;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode mode = kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.getHighResolutionOutputSizeshNQ4ISI;
            if (collection.isEmpty()) {
                return null;
            }
            java.util.Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            ?? next = it.next();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) it.next();
                next = (kotlin.reflect.jvm.internal.impl.types.SimpleType) next;
                kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion companion = kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion;
                if (next != 0 && simpleType != null) {
                    kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = next.getConstructor();
                    kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor2 = simpleType.getConstructor();
                    boolean z = constructor instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
                    if (z && (constructor2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor)) {
                        kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor;
                        kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor integerLiteralTypeConstructor2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor2;
                        int i = kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                        if (i == 1) {
                            intersect = kotlin.collections.CollectionsKt.intersect(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
                        } else {
                            if (i != 2) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            intersect = kotlin.collections.CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
                        }
                        next = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.integerLiteralType(kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty(), new kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.Camera2StreamConfigurationMap, integerLiteralTypeConstructor.getHighSpeedVideoFpsRangesFor, intersect, null), false);
                    } else if (!z) {
                        if ((constructor2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) && ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor2).getPossibleTypes().contains(next)) {
                        }
                    } else if (((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) constructor).getPossibleTypes().contains(simpleType)) {
                        next = simpleType;
                    }
                }
                next = 0;
            }
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) next;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        static final class Mode {
            public static final kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode Camera2StreamConfigurationMap;
            public static final kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode getHighResolutionOutputSizeshNQ4ISI;
            private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode[] getHighSpeedVideoFpsRanges;
            private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

            private Mode(java.lang.String str, int i) {
            }

            static {
                kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode mode = new kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode("COMMON_SUPER_TYPE", 0);
                Camera2StreamConfigurationMap = mode;
                kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode mode2 = new kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode("INTERSECTION_TYPE", 1);
                getHighResolutionOutputSizeshNQ4ISI = mode2;
                kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode[] modeArr = {mode, mode2};
                getHighSpeedVideoFpsRanges = modeArr;
                getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(modeArr);
            }

            public static kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode[] values() {
                return (kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode[]) getHighSpeedVideoFpsRanges.clone();
            }

            public static kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode valueOf(java.lang.String str) {
                return (kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.class, str);
            }
        }

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.values().length];
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.Camera2StreamConfigurationMap.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Companion.Mode.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.types.KotlinType> getPossibleTypes() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> set) {
        this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.integerLiteralType(kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty(), this, false);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = moduleDescriptor;
        this.getHighSpeedVideoSizes = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return this.getHighSpeedVideoFpsRangesFor.getBuiltIns();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntegerLiteralType");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[");
        sb2.append(kotlin.collections.CollectionsKt.joinToString$default(this.getHighSpeedVideoSizes, ",", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
            }
        }, 30, null));
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        sb.append(sb2.toString());
        return sb.toString();
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = integerLiteralTypeConstructor.getBuiltIns().getComparable().getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(defaultType, kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE, integerLiteralTypeConstructor.getHighSpeedVideoFpsRanges)), null, 2, null));
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> allSignedLiteralTypes = kotlin.reflect.jvm.internal.impl.resolve.constants.PrimitiveTypeUtilKt.getAllSignedLiteralTypes(integerLiteralTypeConstructor.getHighSpeedVideoFpsRangesFor);
        if (!(allSignedLiteralTypes instanceof java.util.Collection) || !allSignedLiteralTypes.isEmpty()) {
            java.util.Iterator<T> it = allSignedLiteralTypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (integerLiteralTypeConstructor.getHighSpeedVideoSizes.contains((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next())) {
                    mutableListOf.add(integerLiteralTypeConstructor.getBuiltIns().getNumberType());
                    break;
                }
            }
        }
        return mutableListOf;
    }

    static /* synthetic */ java.lang.CharSequence Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes() {
        return (java.util.List) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.util.Set set, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, moduleDescriptor, set);
    }
}
