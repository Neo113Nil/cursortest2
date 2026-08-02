package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001aD\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001aN\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00132\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0018\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0017\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0018\u0010\u001e\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0017\u0018\u0001H\u0087\b¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#\u001a \u0010\"\u001a\u00020\u0003\"\u0006\b\u0000\u0010$\u0018\u0001\"\u0006\b\u0001\u0010%\u0018\u0001H\u0087\b¢\u0006\u0004\b\"\u0010\u0019\u001a\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b&\u0010\u001f\u001a\u0018\u0010&\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0017\u0018\u0001H\u0087\b¢\u0006\u0004\b&\u0010\u0019\u001a>\u0010-\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00062\u0006\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010,\u001a\u00020+H\u0086\b¢\u0006\u0004\b-\u0010.\"\u001b\u00102\u001a\u00020\u0003*\u00020\u00038G¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001f\"\u001e\u00105\u001a\u00020\u0003*\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\u001f"}, d2 = {"", "serialName", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameters", "Lkotlin/Function1;", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildClassSerialDescriptor", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "PrimitiveSerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)Lkotlinx/serialization/descriptors/SerialDescriptor;", com.visa.cbp.DeviceInfo.valueOf, "SerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialKind;", "builder", "buildSerialDescriptor", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "serialDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/reflect/KType;", "type", "(Lkotlin/reflect/KType;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "listSerialDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "valueDescriptor", "mapSerialDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "K", "V", "setSerialDescriptor", "elementName", "", "", "annotations", "", "isOptional", "element", "(Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;Ljava/lang/String;Ljava/util/List;Z)V", "getNullable", "getNullable$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "nullable", "getNonNullOriginal", "getNonNullOriginal$annotations", "nonNullOriginal"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerialDescriptorsKt {
    @kotlinx.serialization.ExperimentalSerializationApi
    public static /* synthetic */ void getNonNullOriginal$annotations(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
    }

    public static /* synthetic */ void getNullable$annotations(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
    }

    public static /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor buildClassSerialDescriptor$default(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return kotlinx.serialization.descriptors.SerialDescriptorsKt.$r8$lambda$KcwXNYp_VkGdSk5URABBgsNIqNM((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj2);
                }
            };
        }
        return buildClassSerialDescriptor(str, serialDescriptorArr, function1);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor buildClassSerialDescriptor(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr, kotlin.jvm.functions.Function1<? super kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptorArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder(str);
        function1.invoke(classSerialDescriptorBuilder);
        return new kotlinx.serialization.descriptors.SerialDescriptorImpl(str, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), kotlin.collections.ArraysKt.toList(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor PrimitiveSerialDescriptor(java.lang.String str, kotlinx.serialization.descriptors.PrimitiveKind primitiveKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primitiveKind, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        return kotlinx.serialization.internal.PrimitivesKt.PrimitiveDescriptorSafe(str, primitiveKind);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor SerialDescriptor(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, serialDescriptor.getSerialName())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The name of the wrapped descriptor (");
            sb.append(str);
            sb.append(") cannot be the same as the name of the original descriptor (");
            sb.append(serialDescriptor.getSerialName());
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (serialDescriptor.getKind() instanceof kotlinx.serialization.descriptors.PrimitiveKind) {
            kotlinx.serialization.internal.PrimitivesKt.checkNameIsNotAPrimitive(str);
        }
        return new kotlinx.serialization.descriptors.WrappedSerialDescriptor(str, serialDescriptor);
    }

    public static /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor buildSerialDescriptor$default(java.lang.String str, kotlinx.serialization.descriptors.SerialKind serialKind, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return kotlinx.serialization.descriptors.SerialDescriptorsKt.$r8$lambda$7IOwOzokCpMYZBllbC9EZaLdgOs((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj2);
                }
            };
        }
        return buildSerialDescriptor(str, serialKind, serialDescriptorArr, function1);
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor buildSerialDescriptor(java.lang.String str, kotlinx.serialization.descriptors.SerialKind serialKind, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr, kotlin.jvm.functions.Function1<? super kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptorArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(serialKind, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE)) {
            throw new java.lang.IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder(str);
        function1.invoke(classSerialDescriptorBuilder);
        return new kotlinx.serialization.descriptors.SerialDescriptorImpl(str, serialKind, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), kotlin.collections.ArraysKt.toList(serialDescriptorArr), classSerialDescriptorBuilder);
    }

    public static final /* synthetic */ <T> kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor();
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return kotlinx.serialization.SerializersKt.serializer(kType).getDescriptor();
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor listSerialDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return new kotlinx.serialization.internal.ArrayListClassDesc(serialDescriptor);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlinx.serialization.descriptors.SerialDescriptor listSerialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return listSerialDescriptor(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor());
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor mapSerialDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor2, "");
        return new kotlinx.serialization.internal.HashMapClassDesc(serialDescriptor, serialDescriptor2);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <K, V> kotlinx.serialization.descriptors.SerialDescriptor mapSerialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "K");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "V");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return mapSerialDescriptor(descriptor, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor());
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor setSerialDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return new kotlinx.serialization.internal.HashSetClassDesc(serialDescriptor);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlinx.serialization.descriptors.SerialDescriptor setSerialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return setSerialDescriptor(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor());
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getNullable(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return serialDescriptor.isNullable() ? serialDescriptor : new kotlinx.serialization.internal.SerialDescriptorForNullable(serialDescriptor);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getNonNullOriginal(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return serialDescriptor instanceof kotlinx.serialization.internal.SerialDescriptorForNullable ? ((kotlinx.serialization.internal.SerialDescriptorForNullable) serialDescriptor).getOriginal() : serialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        classSerialDescriptorBuilder.element(str, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor(), list, z);
    }

    public static final /* synthetic */ <T> void element(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder, java.lang.String str, java.util.List<? extends java.lang.annotation.Annotation> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        classSerialDescriptorBuilder.element(str, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor(), list, z);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7IOwOzokCpMYZBllbC9EZaLdgOs(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KcwXNYp_VkGdSk5URABBgsNIqNM(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        return kotlin.Unit.INSTANCE;
    }
}
