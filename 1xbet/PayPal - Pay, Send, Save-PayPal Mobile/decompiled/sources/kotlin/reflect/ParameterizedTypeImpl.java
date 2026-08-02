package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "Ljava/lang/Class;", "p0", "Ljava/lang/reflect/Type;", "p1", "", "p2", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "getRawType", "()Ljava/lang/reflect/Type;", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "getHighSpeedVideoSizes", "Ljava/lang/Class;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Type;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "[Ljava/lang/reflect/Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, kotlin.reflect.TypeImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.reflect.Type getHighSpeedVideoFpsRangesFor;
    private final java.lang.reflect.Type[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;

    public ParameterizedTypeImpl(java.lang.Class<?> cls, java.lang.reflect.Type type, java.util.List<? extends java.lang.reflect.Type> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cls;
        this.getHighSpeedVideoFpsRangesFor = type;
        this.getHighSpeedVideoFpsRanges = (java.lang.reflect.Type[]) list.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getRawType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getOwnerType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type[] getActualTypeArguments() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.lang.reflect.Type
    public final java.lang.String getTypeName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.reflect.Type type = this.getHighSpeedVideoFpsRangesFor;
        if (type != null) {
            sb.append(kotlin.reflect.TypesJVMKt.access$typeToString(type));
            sb.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getSimpleName());
        } else {
            sb.append(kotlin.reflect.TypesJVMKt.access$typeToString(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        java.lang.reflect.Type[] typeArr = this.getHighSpeedVideoFpsRanges;
        if (typeArr.length != 0) {
            kotlin.collections.ArraysKt.joinTo(typeArr, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "<", (r14 & 8) != 0 ? "" : ">", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1.getHighSpeedVideoFpsRanges);
        }
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof java.lang.reflect.ParameterizedType)) {
            return false;
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, parameterizedType.getRawType()) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, parameterizedType.getOwnerType()) && java.util.Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        java.lang.reflect.Type type = this.getHighSpeedVideoFpsRangesFor;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ java.util.Arrays.hashCode(getActualTypeArguments());
    }

    public final java.lang.String toString() {
        return getTypeName();
    }
}
