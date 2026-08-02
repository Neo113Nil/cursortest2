package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlin/reflect/GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/TypeImpl;", "Ljava/lang/reflect/Type;", "p0", "<init>", "(Ljava/lang/reflect/Type;)V", "getGenericComponentType", "()Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/reflect/Type;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, kotlin.reflect.TypeImpl {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.reflect.Type getHighSpeedVideoFpsRanges;

    public GenericArrayTypeImpl(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.getHighSpeedVideoFpsRanges = type;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final java.lang.reflect.Type getGenericComponentType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.lang.reflect.Type
    public final java.lang.String getTypeName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.reflect.TypesJVMKt.access$typeToString(this.getHighSpeedVideoFpsRanges));
        sb.append(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof java.lang.reflect.GenericArrayType) && kotlin.jvm.internal.Intrinsics.areEqual(getGenericComponentType(), ((java.lang.reflect.GenericArrayType) p0).getGenericComponentType());
    }

    public final int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public final java.lang.String toString() {
        return getTypeName();
    }
}
