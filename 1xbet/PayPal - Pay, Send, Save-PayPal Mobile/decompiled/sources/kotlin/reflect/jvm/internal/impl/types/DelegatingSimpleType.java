package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class DelegatingSimpleType extends kotlin.reflect.jvm.internal.impl.types.SimpleType {
    protected abstract kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate();

    public abstract kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getDelegate());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType, "");
        return replaceDelegate((kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType);
    }
}
