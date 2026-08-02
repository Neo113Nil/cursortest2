package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class WrappedType extends kotlin.reflect.jvm.internal.impl.types.KotlinType {
    protected abstract kotlin.reflect.jvm.internal.impl.types.KotlinType getDelegate();

    public boolean isComputed() {
        return true;
    }

    public WrappedType() {
        super(null);
    }

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

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType delegate = getDelegate();
        while (delegate instanceof kotlin.reflect.jvm.internal.impl.types.WrappedType) {
            delegate = ((kotlin.reflect.jvm.internal.impl.types.WrappedType) delegate).getDelegate();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(delegate, "");
        return (kotlin.reflect.jvm.internal.impl.types.UnwrappedType) delegate;
    }

    public java.lang.String toString() {
        if (isComputed()) {
            return getDelegate().toString();
        }
        return "<Not computed yet>";
    }
}
