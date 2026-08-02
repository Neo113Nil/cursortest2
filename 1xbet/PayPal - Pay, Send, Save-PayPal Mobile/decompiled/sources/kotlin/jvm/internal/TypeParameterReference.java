package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8WX\u0096\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/jvm/internal/KTypeParameterBase;", "", "Lkotlin/jvm/internal/TypeParameterContainer;", "container", "", "name", "Lkotlin/reflect/KVariance;", "variance", "", "isReified", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "", "Lkotlin/reflect/KType;", "upperBounds", "", "setUpperBounds", "(Ljava/util/List;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "Z", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoSizes", "getUpperBounds", "()Ljava/util/List;", "getUpperBounds$annotations", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypeParameterReference extends kotlin.jvm.internal.KTypeParameterBase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.jvm.internal.TypeParameterReference.Companion INSTANCE = new kotlin.jvm.internal.TypeParameterReference.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile java.util.List<? extends kotlin.reflect.KType> getHighSpeedVideoSizes;
    private final boolean isReified;
    private final java.lang.String name;
    private final kotlin.reflect.KVariance variance;

    public static /* synthetic */ void getUpperBounds$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterReference(java.lang.Object obj, java.lang.String str, kotlin.reflect.KVariance kVariance, boolean z) {
        super(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVariance, "");
        this.name = str;
        this.variance = kVariance;
        this.isReified = z;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final kotlin.reflect.KVariance getVariance() {
        return this.variance;
    }

    @Override // kotlin.reflect.KTypeParameter
    /* renamed from: isReified, reason: from getter */
    public final boolean getIsReified() {
        return this.isReified;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final java.util.List<kotlin.reflect.KType> getUpperBounds() {
        java.util.List list = this.getHighSpeedVideoSizes;
        if (list != null) {
            return list;
        }
        java.util.List<kotlin.reflect.KType> listOf = kotlin.collections.CollectionsKt.listOf(kotlin.jvm.internal.Reflection.nullableTypeOf(java.lang.Object.class));
        this.getHighSpeedVideoSizes = listOf;
        return listOf;
    }

    public final void setUpperBounds(java.util.List<? extends kotlin.reflect.KType> upperBounds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(upperBounds, "");
        if (this.getHighSpeedVideoSizes != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Upper bounds of type parameter '");
            sb.append(this);
            sb.append("' have already been initialized.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes = upperBounds;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KTypeParameter;", "typeParameter", "", "toString", "(Lkotlin/reflect/KTypeParameter;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String toString(kotlin.reflect.KTypeParameter typeParameter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameter, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i = kotlin.jvm.internal.TypeParameterReference.Companion.WhenMappings.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i == 1) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                sb.append("out ");
            }
            sb.append(typeParameter.getName());
            return sb.toString();
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

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
