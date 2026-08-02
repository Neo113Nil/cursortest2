package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class KotlinType implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker {
    private int getHighSpeedVideoSizes;

    public abstract java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments();

    public abstract kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes();

    public abstract kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor();

    public abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope();

    public abstract boolean isMarkedNullable();

    public abstract kotlin.reflect.jvm.internal.impl.types.KotlinType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner);

    public abstract kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap();

    private KotlinType() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.getAnnotations(getAttributes());
    }

    public final int hashCode() {
        int hashCode;
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            return i;
        }
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (((getConstructor().hashCode() * 31) + getArguments().hashCode()) * 31) + (isMarkedNullable() ? 1 : 0);
        }
        this.getHighSpeedVideoSizes = hashCode;
        return hashCode;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj;
        return isMarkedNullable() == kotlinType.isMarkedNullable() && kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrap(), kotlinType.unwrap());
    }

    public /* synthetic */ KotlinType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
