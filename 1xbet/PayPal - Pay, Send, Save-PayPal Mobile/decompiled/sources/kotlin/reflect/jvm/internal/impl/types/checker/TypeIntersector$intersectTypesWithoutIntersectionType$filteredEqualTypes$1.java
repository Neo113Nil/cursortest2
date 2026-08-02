package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Boolean> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType3 = kotlinType;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType4 = kotlinType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType4, "");
        return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.access$isStrictSupertype((kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector) this.receiver, kotlinType3, kotlinType4));
    }

    TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(java.lang.Object obj) {
        super(2, obj, kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }
}
