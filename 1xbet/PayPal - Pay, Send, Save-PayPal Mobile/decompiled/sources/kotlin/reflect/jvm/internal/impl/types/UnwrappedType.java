package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class UnwrappedType extends kotlin.reflect.jvm.internal.impl.types.KotlinType {
    public abstract kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public abstract kotlin.reflect.jvm.internal.impl.types.UnwrappedType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner);

    public abstract kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap() {
        return this;
    }

    private UnwrappedType() {
        super(null);
    }

    public /* synthetic */ UnwrappedType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
