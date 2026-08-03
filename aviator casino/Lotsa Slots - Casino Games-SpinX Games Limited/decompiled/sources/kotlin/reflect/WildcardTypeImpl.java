package kotlin.reflect;

/* compiled from: TypesJVM.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "upperBound", "Ljava/lang/reflect/Type;", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "getUpperBounds", "", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "getTypeName", "", "equals", "", "other", "", "hashCode", "", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WildcardTypeImpl implements java.lang.reflect.WildcardType, kotlin.reflect.TypeImpl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.WildcardTypeImpl.Companion INSTANCE = new kotlin.reflect.WildcardTypeImpl.Companion(null);
    private static final kotlin.reflect.WildcardTypeImpl STAR = new kotlin.reflect.WildcardTypeImpl(null, null);
    private final java.lang.reflect.Type lowerBound;
    private final java.lang.reflect.Type upperBound;

    public WildcardTypeImpl(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        this.upperBound = type;
        this.lowerBound = type2;
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
        java.lang.reflect.Type[] typeArr = new java.lang.reflect.Type[1];
        java.lang.Class cls = this.upperBound;
        if (cls == null) {
        }
        typeArr[0] = cls;
        return typeArr;
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.lowerBound;
        return type == null ? new java.lang.reflect.Type[0] : new java.lang.reflect.Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public java.lang.String getTypeName() {
        java.lang.String typeToString;
        java.lang.String typeToString2;
        if (this.lowerBound != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("? super ");
            typeToString2 = kotlin.reflect.TypesJVMKt.typeToString(this.lowerBound);
            sb.append(typeToString2);
            return sb.toString();
        }
        java.lang.reflect.Type type = this.upperBound;
        if (type != null && !kotlin.jvm.internal.Intrinsics.areEqual(type, java.lang.Object.class)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("? extends ");
            typeToString = kotlin.reflect.TypesJVMKt.typeToString(this.upperBound);
            sb2.append(typeToString);
            return sb2.toString();
        }
        return "?";
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) other;
            if (java.util.Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && java.util.Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(getUpperBounds()) ^ java.util.Arrays.hashCode(getLowerBounds());
    }

    public java.lang.String toString() {
        return getTypeName();
    }

    /* compiled from: TypesJVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "<init>", "()V", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlin.reflect.WildcardTypeImpl getSTAR() {
            return kotlin.reflect.WildcardTypeImpl.STAR;
        }
    }
}
