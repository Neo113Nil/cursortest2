package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "Ljava/lang/reflect/Type;", "p0", "p1", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Type;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WildcardTypeImpl implements java.lang.reflect.WildcardType, kotlin.reflect.TypeImpl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.WildcardTypeImpl.Companion INSTANCE = new kotlin.reflect.WildcardTypeImpl.Companion(null);
    private static final kotlin.reflect.WildcardTypeImpl STAR = new kotlin.reflect.WildcardTypeImpl(null, null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.reflect.Type getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.reflect.Type getHighSpeedVideoFpsRanges;

    public WildcardTypeImpl(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        this.getHighSpeedVideoSizes = type;
        this.getHighSpeedVideoFpsRanges = type2;
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getUpperBounds() {
        java.lang.reflect.Type[] typeArr = new java.lang.reflect.Type[1];
        java.lang.Class cls = this.getHighSpeedVideoSizes;
        if (cls == null) {
        }
        typeArr[0] = cls;
        return typeArr;
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.getHighSpeedVideoFpsRanges;
        return type == null ? new java.lang.reflect.Type[0] : new java.lang.reflect.Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final java.lang.String getTypeName() {
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("? super ");
            sb.append(kotlin.reflect.TypesJVMKt.access$typeToString(this.getHighSpeedVideoFpsRanges));
            return sb.toString();
        }
        java.lang.reflect.Type type = this.getHighSpeedVideoSizes;
        if (type == null || kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Object.class)) {
            return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("? extends ");
        sb2.append(kotlin.reflect.TypesJVMKt.access$typeToString(this.getHighSpeedVideoSizes));
        return sb2.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof java.lang.reflect.WildcardType)) {
            return false;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) p0;
        return java.util.Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && java.util.Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(getUpperBounds()) ^ java.util.Arrays.hashCode(getLowerBounds());
    }

    public final java.lang.String toString() {
        return getTypeName();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "<init>", "()V", "Lkotlin/reflect/WildcardTypeImpl;", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.WildcardTypeImpl getSTAR() {
            return kotlin.reflect.WildcardTypeImpl.STAR;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
