package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class DelegatingSimpleTypeImpl extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoSizes;

    public DelegatingSimpleTypeImpl(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        this.getHighSpeedVideoSizes = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        if (typeAttributes != getAttributes()) {
            return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithAttributes(this, typeAttributes);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : getDelegate().makeNullableAsSpecified(z).replaceAttributes(getAttributes());
    }
}
