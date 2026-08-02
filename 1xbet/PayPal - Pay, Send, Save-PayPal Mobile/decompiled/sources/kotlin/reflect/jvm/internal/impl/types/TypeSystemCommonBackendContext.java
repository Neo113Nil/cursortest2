package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public interface TypeSystemCommonBackendContext extends kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext {
    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker arrayType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getClassFqNameUnsafe(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveArrayType(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getRepresentativeUpperBound(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getUnsubstitutedUnderlyingType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    boolean isArrayOrNullableArray(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isInlineClass(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isUnderKotlinPackage(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeNullable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker nullableAnyType();

    kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker typeSubstitutorForUnderlyingType(java.util.Map<kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker, ? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> map);
}
