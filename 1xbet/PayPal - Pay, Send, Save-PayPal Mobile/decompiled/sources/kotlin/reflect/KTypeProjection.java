package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/KVariance;", "variance", "Lkotlin/reflect/KType;", "type", "<init>", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lkotlin/reflect/KVariance;", "component2", "()Lkotlin/reflect/KType;", "copy", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/KVariance;", "getVariance", "Lkotlin/reflect/KType;", "getType", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.KTypeProjection.Companion INSTANCE = new kotlin.reflect.KTypeProjection.Companion(null);
    public static final kotlin.reflect.KTypeProjection star = new kotlin.reflect.KTypeProjection(null, null);
    private final kotlin.reflect.KType type;
    private final kotlin.reflect.KVariance variance;

    public KTypeProjection(kotlin.reflect.KVariance kVariance, kotlin.reflect.KType kType) {
        java.lang.String obj;
        this.variance = kVariance;
        this.type = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            obj = "Star projection must have no type specified.";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The projection variance ");
            sb.append(kVariance);
            sb.append(" requires type to be specified.");
            obj = sb.toString();
        }
        throw new java.lang.IllegalArgumentException(obj.toString());
    }

    public final kotlin.reflect.KVariance getVariance() {
        return this.variance;
    }

    public final kotlin.reflect.KType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        kotlin.reflect.KVariance kVariance = this.variance;
        int i = kVariance == null ? -1 : kotlin.reflect.KTypeProjection.WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return java.lang.String.valueOf(this.type);
        }
        if (i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("in ");
            sb.append(this.type);
            return sb.toString();
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("out ");
        sb2.append(this.type);
        return sb2.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003R\u0011\u0010\u0010\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/KTypeProjection;", "invariant", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "contravariant", "covariant", "star", "Lkotlin/reflect/KTypeProjection;", "getStar$annotations", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "STAR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static /* synthetic */ void getStar$annotations() {
        }

        private Companion() {
        }

        public final kotlin.reflect.KTypeProjection getSTAR() {
            return kotlin.reflect.KTypeProjection.star;
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.KTypeProjection invariant(kotlin.reflect.KType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new kotlin.reflect.KTypeProjection(kotlin.reflect.KVariance.INVARIANT, type);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.KTypeProjection contravariant(kotlin.reflect.KType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new kotlin.reflect.KTypeProjection(kotlin.reflect.KVariance.IN, type);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.KTypeProjection covariant(kotlin.reflect.KType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new kotlin.reflect.KTypeProjection(kotlin.reflect.KVariance.OUT, type);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int hashCode() {
        kotlin.reflect.KVariance kVariance = this.variance;
        int hashCode = kVariance == null ? 0 : kVariance.hashCode();
        kotlin.reflect.KType kType = this.type;
        return (hashCode * 31) + (kType != null ? kType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.reflect.KTypeProjection)) {
            return false;
        }
        kotlin.reflect.KTypeProjection kTypeProjection = (kotlin.reflect.KTypeProjection) other;
        return this.variance == kTypeProjection.variance && kotlin.jvm.internal.Intrinsics.areEqual(this.type, kTypeProjection.type);
    }

    public final kotlin.reflect.KTypeProjection copy(kotlin.reflect.KVariance variance, kotlin.reflect.KType type) {
        return new kotlin.reflect.KTypeProjection(variance, type);
    }

    /* renamed from: component2, reason: from getter */
    public final kotlin.reflect.KType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final kotlin.reflect.KVariance getVariance() {
        return this.variance;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.KTypeProjection invariant(kotlin.reflect.KType kType) {
        return INSTANCE.invariant(kType);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.KTypeProjection covariant(kotlin.reflect.KType kType) {
        return INSTANCE.covariant(kType);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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

    public static /* synthetic */ kotlin.reflect.KTypeProjection copy$default(kotlin.reflect.KTypeProjection kTypeProjection, kotlin.reflect.KVariance kVariance, kotlin.reflect.KType kType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            kVariance = kTypeProjection.variance;
        }
        if ((i & 2) != 0) {
            kType = kTypeProjection.type;
        }
        return kTypeProjection.copy(kVariance, kType);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.KTypeProjection contravariant(kotlin.reflect.KType kType) {
        return INSTANCE.contravariant(kType);
    }
}
