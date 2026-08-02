package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public interface TypeConstructor extends kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker {
    kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns();

    /* renamed from: getDeclarationDescriptor */
    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes();

    boolean isDenotable();

    kotlin.reflect.jvm.internal.impl.types.TypeConstructor refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner);
}
