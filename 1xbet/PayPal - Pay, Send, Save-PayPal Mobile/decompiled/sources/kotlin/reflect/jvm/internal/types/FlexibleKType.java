package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0005H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0001H\u0016J\n\u0010)\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0018\u001a\u00020\u00058VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00148VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b,\u0010\u0017¨\u0006."}, d2 = {"Lkotlin/reflect/jvm/internal/types/FlexibleKType;", "Lkotlin/reflect/jvm/internal/types/AbstractKType;", "lowerBound", "upperBound", "isRawType", "", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "<init>", "(Lkotlin/reflect/jvm/internal/types/AbstractKType;Lkotlin/reflect/jvm/internal/types/AbstractKType;ZLkotlin/jvm/functions/Function0;)V", "getLowerBound", "()Lkotlin/reflect/jvm/internal/types/AbstractKType;", "getUpperBound", "()Z", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "getArguments", "()Ljava/util/List;", "isMarkedNullable", "abbreviation", "Lkotlin/reflect/KType;", "getAbbreviation", "()Lkotlin/reflect/KType;", "isDefinitelyNotNullType", "isNothingType", "isSuspendFunctionType", "mutableCollectionClass", "Lkotlin/reflect/KClass;", "getMutableCollectionClass", "()Lkotlin/reflect/KClass;", "makeNullableAsSpecified", "nullable", "makeDefinitelyNotNullAsSpecified", "isDefinitelyNotNull", "lowerBoundIfFlexible", "upperBoundIfFlexible", "annotations", "", "getAnnotations", "Companion", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlexibleKType extends kotlin.reflect.jvm.internal.types.AbstractKType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.types.FlexibleKType.Companion INSTANCE = new kotlin.reflect.jvm.internal.types.FlexibleKType.Companion(null);
    private final kotlin.reflect.jvm.internal.types.AbstractKType getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.types.AbstractKType getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.KType getAbbreviation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isDefinitelyNotNullType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isNothingType() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean isSuspendFunctionType() {
        return false;
    }

    private FlexibleKType(kotlin.reflect.jvm.internal.types.AbstractKType abstractKType, kotlin.reflect.jvm.internal.types.AbstractKType abstractKType2, boolean z, kotlin.jvm.functions.Function0<? extends java.lang.reflect.Type> function0) {
        super(function0);
        this.getHighResolutionOutputSizeshNQ4ISI = abstractKType;
        this.getHighSpeedVideoFpsRanges = abstractKType2;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: isRawType, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.KType
    public final kotlin.reflect.KClassifier getClassifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getClassifier();
    }

    @Override // kotlin.reflect.KType
    public final java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.KClass<?> getMutableCollectionClass() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMutableCollectionClass();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.jvm.internal.types.AbstractKType makeNullableAsSpecified(boolean nullable) {
        return kotlin.reflect.jvm.internal.types.FlexibleKType.Companion.create$default(INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI.makeNullableAsSpecified(nullable), this.getHighSpeedVideoFpsRanges.makeNullableAsSpecified(nullable), getGetHighSpeedVideoFpsRangesFor(), null, 8, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.jvm.internal.types.AbstractKType makeDefinitelyNotNullAsSpecified(boolean isDefinitelyNotNull) {
        return kotlin.reflect.jvm.internal.types.FlexibleKType.Companion.create$default(INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI.makeDefinitelyNotNullAsSpecified(isDefinitelyNotNull), this.getHighSpeedVideoFpsRanges.makeDefinitelyNotNullAsSpecified(isDefinitelyNotNull), getGetHighSpeedVideoFpsRangesFor(), null, 8, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: lowerBoundIfFlexible, reason: from getter */
    public final kotlin.reflect.jvm.internal.types.AbstractKType getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: upperBoundIfFlexible, reason: from getter */
    public final kotlin.reflect.jvm.internal.types.AbstractKType getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAnnotations();
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/reflect/jvm/internal/types/FlexibleKType$Companion;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/types/AbstractKType;", "lowerBound", "upperBound", "", "isRawType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "create", "(Lkotlin/reflect/jvm/internal/types/AbstractKType;Lkotlin/reflect/jvm/internal/types/AbstractKType;ZLkotlin/jvm/functions/Function0;)Lkotlin/reflect/jvm/internal/types/AbstractKType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlin.reflect.jvm.internal.types.AbstractKType create$default(kotlin.reflect.jvm.internal.types.FlexibleKType.Companion companion, kotlin.reflect.jvm.internal.types.AbstractKType abstractKType, kotlin.reflect.jvm.internal.types.AbstractKType abstractKType2, boolean z, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function0 = null;
            }
            return companion.create(abstractKType, abstractKType2, z, function0);
        }

        public final kotlin.reflect.jvm.internal.types.AbstractKType create(kotlin.reflect.jvm.internal.types.AbstractKType lowerBound, kotlin.reflect.jvm.internal.types.AbstractKType upperBound, boolean isRawType, kotlin.jvm.functions.Function0<? extends java.lang.reflect.Type> computeJavaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowerBound, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upperBound, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(lowerBound, upperBound) ? lowerBound : new kotlin.reflect.jvm.internal.types.FlexibleKType(lowerBound, upperBound, isRawType, computeJavaType, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FlexibleKType(kotlin.reflect.jvm.internal.types.AbstractKType abstractKType, kotlin.reflect.jvm.internal.types.AbstractKType abstractKType2, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractKType, abstractKType2, z, function0);
    }
}
