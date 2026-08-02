package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class JavaToKotlinClassMapper {
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper();

    private JavaToKotlinClassMapper() {
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> mapPlatformClass(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin$default = mapJavaToKotlin$default(this, fqName, kotlinBuiltIns, null, 4, null);
        if (mapJavaToKotlin$default == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        kotlin.reflect.jvm.internal.impl.name.FqName readOnlyToMutable = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(mapJavaToKotlin$default));
        if (readOnlyToMutable == null) {
            return kotlin.collections.SetsKt.setOf(mapJavaToKotlin$default);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = kotlinBuiltIns.getBuiltInClassByFqName(readOnlyToMutable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtInClassByFqName, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor[]{mapJavaToKotlin$default, builtInClassByFqName});
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin$default(kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper javaToKotlinClassMapper, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return javaToKotlinClassMapper.mapJavaToKotlin(fqName, kotlinBuiltIns, num);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId mapJavaToKotlin = (num == null || !kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) ? kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(fqName) : kotlin.reflect.jvm.internal.impl.builtins.StandardNames.getFunctionClassId(num.intValue());
        if (mapJavaToKotlin != null) {
            return kotlinBuiltIns.getBuiltInClassByFqName(mapJavaToKotlin.asSingleFqName());
        }
        return null;
    }

    public final boolean isMutable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.isMutable(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptor));
    }

    public final boolean isReadOnly(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.isReadOnly(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptor));
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor convertMutableToReadOnly(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
        kotlin.reflect.jvm.internal.impl.name.FqName mutableToReadOnly = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mutableToReadOnly(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptor2));
        if (mutableToReadOnly == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Given class ");
            sb.append(classDescriptor);
            sb.append(" is not a mutable collection");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor2).getBuiltInClassByFqName(mutableToReadOnly);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtInClassByFqName, "");
        return builtInClassByFqName;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor convertReadOnlyToMutable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
        kotlin.reflect.jvm.internal.impl.name.FqName readOnlyToMutable = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptor2));
        if (readOnlyToMutable == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Given class ");
            sb.append(classDescriptor);
            sb.append(" is not a read-only collection");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor2).getBuiltInClassByFqName(readOnlyToMutable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtInClassByFqName, "");
        return builtInClassByFqName;
    }
}
