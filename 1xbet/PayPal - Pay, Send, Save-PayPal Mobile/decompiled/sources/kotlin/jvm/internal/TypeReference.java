package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0014R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0014\u0010\r\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010,R\u001c\u00100\u001a\u00020\u0015*\u0006\u0012\u0002\b\u00030-8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "", "isMarkedNullable", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p0", "getHighSpeedVideoFpsRangesFor", "(Z)Ljava/lang/String;", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", com.visa.cbp.getEncExpo.warmup, "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "", "getAnnotations", "annotations", "()Z", "Ljava/lang/Class;", "Camera2StreamConfigurationMap", "(Ljava/lang/Class;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypeReference implements kotlin.reflect.KType {
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final java.util.List<kotlin.reflect.KTypeProjection> arguments;
    private final kotlin.reflect.KClassifier classifier;
    private final int flags;
    private final kotlin.reflect.KType platformTypeUpperBound;

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public TypeReference(kotlin.reflect.KClassifier kClassifier, java.util.List<kotlin.reflect.KTypeProjection> list, kotlin.reflect.KType kType, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.classifier = kClassifier;
        this.arguments = list;
        this.platformTypeUpperBound = kType;
        this.flags = i;
    }

    @Override // kotlin.reflect.KType
    public final kotlin.reflect.KClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.KType
    public final java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
        return this.arguments;
    }

    /* renamed from: getPlatformTypeUpperBound$kotlin_stdlib, reason: from getter */
    public final kotlin.reflect.KType getPlatformTypeUpperBound() {
        return this.platformTypeUpperBound;
    }

    /* renamed from: getFlags$kotlin_stdlib, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(kotlin.reflect.KClassifier kClassifier, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z) {
        this(kClassifier, list, null, z ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClassifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KType
    /* renamed from: isMarkedNullable */
    public final boolean getIsMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.jvm.internal.TypeReference)) {
            return false;
        }
        kotlin.jvm.internal.TypeReference typeReference = (kotlin.jvm.internal.TypeReference) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getClassifier(), typeReference.getClassifier()) && kotlin.jvm.internal.Intrinsics.areEqual(getArguments(), typeReference.getArguments()) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags;
    }

    public final int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + java.lang.Integer.hashCode(this.flags);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getHighSpeedVideoFpsRangesFor(false));
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor(boolean p0) {
        java.lang.String name2;
        kotlin.reflect.KClassifier classifier = getClassifier();
        kotlin.reflect.KClass kClass = classifier instanceof kotlin.reflect.KClass ? (kotlin.reflect.KClass) classifier : null;
        java.lang.Class javaClass = kClass != null ? kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass) : null;
        if (javaClass == null) {
            name2 = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name2 = "kotlin.Nothing";
        } else if (javaClass.isArray()) {
            name2 = Camera2StreamConfigurationMap(javaClass);
        } else {
            name2 = (p0 && javaClass.isPrimitive()) ? kotlin.jvm.JvmClassMappingKt.getJavaObjectType((kotlin.reflect.KClass) getClassifier()).getName() : javaClass.getName();
        }
        java.lang.String joinToString$default = getArguments().isEmpty() ? "" : kotlin.collections.CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.jvm.internal.TypeReference$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.jvm.internal.TypeReference.$r8$lambda$TqUhj1JlPuVAfFHzMnjOlMDw418(kotlin.jvm.internal.TypeReference.this, (kotlin.reflect.KTypeProjection) obj);
            }
        }, 24, null);
        java.lang.String str = getIsMarkedNullable() ? com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name2);
        sb.append(joinToString$default);
        sb.append(str);
        java.lang.String obj = sb.toString();
        kotlin.reflect.KType kType = this.platformTypeUpperBound;
        if (!(kType instanceof kotlin.jvm.internal.TypeReference)) {
            return obj;
        }
        java.lang.String highSpeedVideoFpsRangesFor = ((kotlin.jvm.internal.TypeReference) kType).getHighSpeedVideoFpsRangesFor(true);
        if (kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor, obj)) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append('?');
        if (kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor, sb2.toString())) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append('!');
            return sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("(");
        sb4.append(obj);
        sb4.append("..");
        sb4.append(highSpeedVideoFpsRangesFor);
        sb4.append(')');
        return sb4.toString();
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.Class<?> cls) {
        return kotlin.jvm.internal.Intrinsics.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : kotlin.jvm.internal.Intrinsics.areEqual(cls, char[].class) ? "kotlin.CharArray" : kotlin.jvm.internal.Intrinsics.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : kotlin.jvm.internal.Intrinsics.areEqual(cls, short[].class) ? "kotlin.ShortArray" : kotlin.jvm.internal.Intrinsics.areEqual(cls, int[].class) ? "kotlin.IntArray" : kotlin.jvm.internal.Intrinsics.areEqual(cls, float[].class) ? "kotlin.FloatArray" : kotlin.jvm.internal.Intrinsics.areEqual(cls, long[].class) ? "kotlin.LongArray" : kotlin.jvm.internal.Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : kotlinx.serialization.internal.CollectionDescriptorsKt.ARRAY_NAME;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$TqUhj1JlPuVAfFHzMnjOlMDw418(kotlin.jvm.internal.TypeReference typeReference, kotlin.reflect.KTypeProjection kTypeProjection) {
        java.lang.String valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kTypeProjection, "");
        if (kTypeProjection.getVariance() == null) {
            valueOf = "*";
        } else {
            kotlin.reflect.KType type = kTypeProjection.getType();
            kotlin.jvm.internal.TypeReference typeReference2 = type instanceof kotlin.jvm.internal.TypeReference ? (kotlin.jvm.internal.TypeReference) type : null;
            if (typeReference2 == null || (valueOf = typeReference2.getHighSpeedVideoFpsRangesFor(true)) == null) {
                valueOf = java.lang.String.valueOf(kTypeProjection.getType());
            }
            int i = kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0[kTypeProjection.getVariance().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    valueOf = "in ".concat(java.lang.String.valueOf(valueOf));
                } else {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    valueOf = "out ".concat(java.lang.String.valueOf(valueOf));
                }
            }
        }
        return valueOf;
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
