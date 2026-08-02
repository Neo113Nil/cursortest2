package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeSubstitutionKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType replace$default(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return replace(kotlinType, list, annotations, list2);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replace(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        if ((list.isEmpty() || list == kotlinType.getArguments()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes attributes = kotlinType.getAttributes();
        if ((annotations instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations) && ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations) annotations).isEmpty()) {
            annotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes replaceAnnotations = kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt.replaceAnnotations(attributes, annotations);
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap;
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), list, replaceAnnotations), replace(flexibleType.getUpperBound(), list2, replaceAnnotations));
        }
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return replace((kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap, list, replaceAnnotations);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType replace$default(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, java.util.List list, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = simpleType.getArguments();
        }
        if ((i & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        return replace(simpleType, (java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection>) list, typeAttributes);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType replace(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        if (list.isEmpty() && typeAttributes == simpleType.getAttributes()) {
            return simpleType;
        }
        if (list.isEmpty()) {
            return simpleType.replaceAttributes(typeAttributes);
        }
        if (simpleType instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorType) {
            return ((kotlin.reflect.jvm.internal.impl.types.error.ErrorType) simpleType).replaceArguments(list);
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(typeAttributes, simpleType.getConstructor(), list, simpleType.isMarkedNullable(), (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType asSimpleType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType ? (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap : null;
        if (simpleType != null) {
            return simpleType;
        }
        throw new java.lang.IllegalStateException("This is should be simple type: ".concat(java.lang.String.valueOf(kotlinType)).toString());
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replace(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return replace$default(kotlinType, list, annotations, null, 4, null);
    }
}
