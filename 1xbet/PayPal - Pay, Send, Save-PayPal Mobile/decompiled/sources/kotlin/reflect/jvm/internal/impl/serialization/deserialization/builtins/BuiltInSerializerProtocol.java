package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* loaded from: classes5.dex */
public final class BuiltInSerializerProtocol extends kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BuiltInSerializerProtocol() {
        super(r2, r3, r4, r5, r7, null, r8, r9, r10, null, null, null, r10, r10, r10, r10, r10);
        kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite newInstance = kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.newInstance();
        kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.registerAllExtensions(newInstance);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, java.lang.Integer> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.packageFqName;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension2 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.constructorAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension2, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension3 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.classAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension3, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension4 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.functionAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension4, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension5 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.propertyAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension5, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension6 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.propertyGetterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension6, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension7 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.propertySetterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension7, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension8 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.enumEntryAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension8, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> generatedExtension9 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.compileTimeValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension9, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension10 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.parameterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension10, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension11 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.typeAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension11, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> generatedExtension12 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf.typeParameterAnnotation;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension12, "");
    }

    public final java.lang.String getBuiltInsFilePath(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.replace$default(fqName.asString(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        sb.append(getBuiltInsFileName(fqName));
        return sb.toString();
    }

    public final java.lang.String getBuiltInsFileName(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.String asString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (fqName.isRoot()) {
            asString = "default-package";
        } else {
            asString = fqName.shortName().asString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        }
        sb.append(asString);
        sb.append(".kotlin_builtins");
        return sb.toString();
    }
}
