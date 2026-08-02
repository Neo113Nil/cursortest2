package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class ClassicBuiltinSpecialProperties {
    public static final kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties();

    private ClassicBuiltinSpecialProperties() {
    }

    public final java.lang.String getBuiltinSpecialPropertyGetterName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.Name name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor firstOverridden$default = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden$default(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj));
            }
        }, 1, null);
        if (firstOverridden$default == null || (name2 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(firstOverridden$default))) == null) {
            return null;
        }
        return name2.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (!kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        if (kotlin.collections.CollectionsKt.contains(kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties.INSTANCE.getSPECIAL_FQ_NAMES(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor2)) && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableMemberDescriptor2)) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection = overriddenDescriptors;
            if (!collection.isEmpty()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor3 : collection) {
                    kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(callableMemberDescriptor3);
                    if (classicBuiltinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return INSTANCE.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor);
    }
}
