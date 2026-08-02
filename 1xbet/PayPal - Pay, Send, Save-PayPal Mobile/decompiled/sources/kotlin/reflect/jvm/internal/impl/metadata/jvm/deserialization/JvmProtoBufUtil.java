package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* loaded from: classes5.dex */
public final class JvmProtoBufUtil {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil();

    private JvmProtoBufUtil() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite newInstance = kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.newInstance();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.registerAllExtensions(newInstance);
        kotlin.reflect.jvm.internal.impl.metadata.SerializationPluginMetadataExtensions.registerAllExtensions(newInstance);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        Camera2StreamConfigurationMap = newInstance;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return Camera2StreamConfigurationMap;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> readClassDataFrom(java.lang.String[] strArr, java.lang.String[] strArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr2, "");
        byte[] decodeBytes = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decodeBytes(strArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodeBytes, "");
        return readClassDataFrom(decodeBytes, strArr2);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> readClassDataFrom(byte[] bArr, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite = Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes parseDelimitedFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseDelimitedFrom, "");
        return new kotlin.Pair<>(new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver(parseDelimitedFrom, strArr), kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> readPackageDataFrom(java.lang.String[] strArr, java.lang.String[] strArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr2, "");
        byte[] decodeBytes = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decodeBytes(strArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodeBytes, "");
        return readPackageDataFrom(decodeBytes, strArr2);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> readPackageDataFrom(byte[] bArr, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite = Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes parseDelimitedFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseDelimitedFrom, "");
        return new kotlin.Pair<>(new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver(parseDelimitedFrom, strArr), kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> readFunctionDataFrom(java.lang.String[] strArr, java.lang.String[] strArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr2, "");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decodeBytes(strArr));
        kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite = Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes parseDelimitedFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseDelimitedFrom, "");
        return new kotlin.Pair<>(new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver(parseDelimitedFrom, strArr2), kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method getJvmMethodSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.methodSignature;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(function, generatedExtension);
        int name2 = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature != null && jvmMethodSignature.hasDesc()) {
            obj = nameResolver.getString(jvmMethodSignature.getDesc());
        } else {
            java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(function, typeTable));
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list = valueParameterList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter : list) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameter);
                arrayList.add(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(valueParameter, typeTable));
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type> plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) listOfNotNull, (java.lang.Iterable) arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type : plus) {
                java.lang.String mapClass = type.hasClassName() ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName())) : null;
                if (mapClass == null) {
                    return null;
                }
                arrayList2.add(mapClass);
            }
            java.util.ArrayList arrayList3 = arrayList2;
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(function, typeTable);
            java.lang.String mapClass2 = returnType.hasClassName() ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(returnType.getClassName())) : null;
            if (mapClass2 == null) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList3, "", "(", ")", 0, null, null, 56, null));
            sb.append(mapClass2);
            obj = sb.toString();
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method(nameResolver.getString(name2), obj);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method getJvmConstructorSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        java.lang.String str;
        java.lang.String joinToString$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.constructorSignature;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(constructor, generatedExtension);
        if (jvmMethodSignature != null && jvmMethodSignature.hasName()) {
            str = nameResolver.getString(jvmMethodSignature.getName());
        } else {
            str = "<init>";
        }
        if (jvmMethodSignature != null && jvmMethodSignature.hasDesc()) {
            joinToString$default = nameResolver.getString(jvmMethodSignature.getDesc());
        } else {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list = valueParameterList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter : list) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameter);
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(valueParameter, typeTable);
                java.lang.String mapClass = type.hasClassName() ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName())) : null;
                if (mapClass == null) {
                    return null;
                }
                arrayList.add(mapClass);
            }
            joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", "(", ")V", 0, null, null, 56, null);
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method(str, joinToString$default);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field getJvmFieldSignature$default(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil jvmProtoBufUtil, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, boolean z) {
        java.lang.String mapClass;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(property, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z) {
            return null;
        }
        int name2 = (field == null || !field.hasName()) ? property.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type returnType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(property, typeTable);
            mapClass = returnType.hasClassName() ? kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(returnType.getClassName())) : null;
            if (mapClass == null) {
                return null;
            }
        } else {
            mapClass = nameResolver.getString(field.getDesc());
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field(nameResolver.getString(name2), mapClass);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isMovedFromInterfaceCompanion(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField is_moved_from_interface_companion = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        java.lang.Object extension = property.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.flags);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extension, "");
        java.lang.Boolean bool = is_moved_from_interface_companion.get(((java.lang.Number) extension).intValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        return bool.booleanValue();
    }
}
