package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Ljava/lang/Class;", "jClass", "", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PackageReference implements kotlin.jvm.internal.ClassBasedDeclarationContainer {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.Class<?> jClass;

    public PackageReference(java.lang.Class<?> cls, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.jClass = cls;
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final java.lang.Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public final java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
        throw new kotlin.jvm.KotlinReflectionNotSupportedError();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.jvm.internal.PackageReference) && kotlin.jvm.internal.Intrinsics.areEqual(getJClass(), ((kotlin.jvm.internal.PackageReference) other).getJClass());
    }

    public final int hashCode() {
        return getJClass().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getJClass().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
