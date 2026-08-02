package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/reflect/jvm/internal/types/KTypeSubstitutor;", "", "", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/KTypeProjection;", "substitution", "<init>", "(Ljava/util/Map;)V", "Lkotlin/reflect/KType;", "type", "substitute", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KTypeSubstitutor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.types.KTypeSubstitutor.Companion INSTANCE = new kotlin.reflect.jvm.internal.types.KTypeSubstitutor.Companion(null);
    private static final kotlin.reflect.jvm.internal.types.KTypeSubstitutor EMPTY = new kotlin.reflect.jvm.internal.types.KTypeSubstitutor(kotlin.collections.MapsKt.emptyMap());

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KTypeParameter, kotlin.reflect.KTypeProjection> getHighResolutionOutputSizeshNQ4ISI;

    public KTypeSubstitutor(java.util.Map<kotlin.reflect.KTypeParameter, kotlin.reflect.KTypeProjection> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
    
        if (r11.getIsMarkedNullable() == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.reflect.KTypeProjection substitute(kotlin.reflect.KType type) {
        kotlin.reflect.KTypeProjection star;
        kotlin.reflect.jvm.internal.types.AbstractKType getHighSpeedVideoFpsRanges;
        kotlin.reflect.jvm.internal.types.AbstractKType getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        boolean z = type instanceof kotlin.reflect.jvm.internal.types.AbstractKType;
        kotlin.reflect.jvm.internal.types.AbstractKType abstractKType = z ? (kotlin.reflect.jvm.internal.types.AbstractKType) type : null;
        kotlin.reflect.jvm.internal.types.AbstractKType getHighResolutionOutputSizeshNQ4ISI2 = abstractKType != null ? abstractKType.getGetHighResolutionOutputSizeshNQ4ISI() : null;
        kotlin.reflect.jvm.internal.types.AbstractKType abstractKType2 = z ? (kotlin.reflect.jvm.internal.types.AbstractKType) type : null;
        kotlin.reflect.jvm.internal.types.AbstractKType getHighSpeedVideoFpsRanges2 = abstractKType2 != null ? abstractKType2.getGetHighSpeedVideoFpsRanges() : null;
        if (getHighResolutionOutputSizeshNQ4ISI2 != null && getHighSpeedVideoFpsRanges2 != null) {
            kotlin.reflect.KTypeProjection substitute = substitute(getHighResolutionOutputSizeshNQ4ISI2);
            kotlin.reflect.KType type2 = substitute.getType();
            kotlin.reflect.jvm.internal.types.AbstractKType abstractKType3 = type2 instanceof kotlin.reflect.jvm.internal.types.AbstractKType ? (kotlin.reflect.jvm.internal.types.AbstractKType) type2 : null;
            if (abstractKType3 != null && (getHighResolutionOutputSizeshNQ4ISI = abstractKType3.getGetHighResolutionOutputSizeshNQ4ISI()) != null) {
                substitute = new kotlin.reflect.KTypeProjection(substitute.getVariance(), getHighResolutionOutputSizeshNQ4ISI);
            }
            kotlin.reflect.KTypeProjection substitute2 = substitute(getHighSpeedVideoFpsRanges2);
            kotlin.reflect.KType type3 = substitute2.getType();
            kotlin.reflect.jvm.internal.types.AbstractKType abstractKType4 = type3 instanceof kotlin.reflect.jvm.internal.types.AbstractKType ? (kotlin.reflect.jvm.internal.types.AbstractKType) type3 : null;
            if (abstractKType4 != null && (getHighSpeedVideoFpsRanges = abstractKType4.getGetHighSpeedVideoFpsRanges()) != null) {
                substitute2 = new kotlin.reflect.KTypeProjection(substitute2.getVariance(), getHighSpeedVideoFpsRanges);
            }
            kotlin.reflect.KVariance variance = substitute.getVariance();
            kotlin.reflect.KType type4 = substitute.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(type4);
            kotlin.reflect.KType type5 = substitute2.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(type5);
            return new kotlin.reflect.KTypeProjection(variance, kotlin.reflect.jvm.internal.types.TypeOfImplKt.createPlatformKType(type4, type5));
        }
        kotlin.reflect.KClassifier classifier = type.getClassifier();
        if (classifier == null) {
            return kotlin.reflect.KTypeProjection.INSTANCE.invariant(type);
        }
        kotlin.reflect.KTypeProjection kTypeProjection = this.getHighResolutionOutputSizeshNQ4ISI.get(classifier);
        if (kTypeProjection != null) {
            kotlin.reflect.KVariance variance2 = kTypeProjection.getVariance();
            kotlin.reflect.KType type6 = kTypeProjection.getType();
            if (type6 == null) {
                return kTypeProjection;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(type6, "");
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker = (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) type6;
            kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext reflectTypeSystemContext = kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext.INSTANCE;
            boolean z2 = false;
            kotlin.reflect.jvm.internal.types.AbstractKType withNullability = kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext.INSTANCE.withNullability(rigidTypeMarker, type.getIsMarkedNullable() || type6.getIsMarkedNullable());
            if (withNullability instanceof kotlin.reflect.jvm.internal.types.AbstractKType) {
                kotlin.reflect.jvm.internal.types.AbstractKType abstractKType5 = (kotlin.reflect.jvm.internal.types.AbstractKType) withNullability;
                kotlin.reflect.jvm.internal.types.AbstractKType abstractKType6 = z ? (kotlin.reflect.jvm.internal.types.AbstractKType) type : null;
                if (abstractKType6 == null || !abstractKType6.getIsDefinitelyNotNullType()) {
                    kotlin.reflect.jvm.internal.types.AbstractKType abstractKType7 = rigidTypeMarker instanceof kotlin.reflect.jvm.internal.types.AbstractKType ? (kotlin.reflect.jvm.internal.types.AbstractKType) rigidTypeMarker : null;
                    if (abstractKType7 != null) {
                        if (abstractKType7.getIsDefinitelyNotNullType()) {
                        }
                    }
                    withNullability = abstractKType5.makeDefinitelyNotNullAsSpecified(z2);
                }
                z2 = true;
                withNullability = abstractKType5.makeDefinitelyNotNullAsSpecified(z2);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(withNullability, "");
            return new kotlin.reflect.KTypeProjection(variance2, (kotlin.reflect.KType) withNullability);
        }
        kotlin.reflect.KTypeProjection.Companion companion = kotlin.reflect.KTypeProjection.INSTANCE;
        if (!type.getArguments().isEmpty()) {
            java.util.List<kotlin.reflect.KTypeProjection> arguments = type.getArguments();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
            java.util.Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                kotlin.reflect.KType type7 = ((kotlin.reflect.KTypeProjection) it.next()).getType();
                if (type7 == null || (star = substitute(type7)) == null) {
                    star = kotlin.reflect.KTypeProjection.INSTANCE.getSTAR();
                }
                arrayList.add(star);
            }
            java.util.ArrayList arrayList2 = arrayList;
            boolean isMarkedNullable = type.getIsMarkedNullable();
            java.util.List<java.lang.annotation.Annotation> annotations = type.getAnnotations();
            kotlin.reflect.jvm.internal.types.AbstractKType abstractKType8 = z ? (kotlin.reflect.jvm.internal.types.AbstractKType) type : null;
            type = kotlin.reflect.full.KClassifiers.createTypeImpl(classifier, arrayList2, isMarkedNullable, annotations, abstractKType8 != null ? abstractKType8.getMutableCollectionClass() : null);
        }
        return companion.invariant(type);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0007\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/types/KTypeSubstitutor$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/types/KTypeSubstitutor;", "create", "(Lkotlin/reflect/KType;)Lkotlin/reflect/jvm/internal/types/KTypeSubstitutor;", "Lkotlin/reflect/KClass;", "klass", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlin/reflect/jvm/internal/types/KTypeSubstitutor;", "EMPTY", "Lkotlin/reflect/jvm/internal/types/KTypeSubstitutor;", "getEMPTY", "()Lkotlin/reflect/jvm/internal/types/KTypeSubstitutor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.types.KTypeSubstitutor getEMPTY() {
            return kotlin.reflect.jvm.internal.types.KTypeSubstitutor.EMPTY;
        }

        public final kotlin.reflect.jvm.internal.types.KTypeSubstitutor create(kotlin.reflect.KType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext reflectTypeSystemContext = kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext.INSTANCE;
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor = reflectTypeSystemContext.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) type);
            int parametersCount = reflectTypeSystemContext.parametersCount(typeConstructor);
            java.util.ArrayList arrayList = new java.util.ArrayList(parametersCount);
            for (int i = 0; i < parametersCount; i++) {
                kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker parameter = reflectTypeSystemContext.getParameter(typeConstructor, i);
                kotlin.jvm.internal.Intrinsics.checkNotNull(parameter, "");
                arrayList.add((kotlin.reflect.KTypeParameter) parameter);
            }
            java.util.ArrayList arrayList2 = arrayList;
            return !arrayList2.isEmpty() ? new kotlin.reflect.jvm.internal.types.KTypeSubstitutor(kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(arrayList2, type.getArguments()))) : getEMPTY();
        }

        public final kotlin.reflect.jvm.internal.types.KTypeSubstitutor create(kotlin.reflect.KClass<?> klass, java.util.List<kotlin.reflect.KTypeProjection> arguments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arguments, "");
            return new kotlin.reflect.jvm.internal.types.KTypeSubstitutor(kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(kotlin.reflect.jvm.internal.types.CapturedKTypeKt.allTypeParameters(klass), arguments)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
