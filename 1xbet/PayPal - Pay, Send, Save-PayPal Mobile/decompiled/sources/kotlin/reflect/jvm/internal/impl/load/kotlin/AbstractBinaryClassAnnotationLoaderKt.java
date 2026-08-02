package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class AbstractBinaryClassAnnotationLoaderKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getPropertySignature$default(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 8) != 0 ? false : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            z3 = true;
        }
        return getPropertySignature(property, nameResolver, typeTable, z4, z5, z3);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getPropertySignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(property, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field jvmFieldSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmFieldSignature(property, nameResolver, typeTable, z3);
            if (jvmFieldSignature == null) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromJvmMemberSignature(jvmFieldSignature);
        }
        if (!z2 || !jvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(syntheticMethod, "");
        return companion.fromMethod(nameResolver, syntheticMethod);
    }
}
