package kotlinx.serialization.descriptors;

/* compiled from: SerialDescriptors.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u00012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000b\u001a\u0016\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e\u001a\u0016\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0001\u001aL\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00122\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u00012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0086\b\u001a\u000e\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0019\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0087\b\u001a\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0007\u001a\u0019\u0010\u001b\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u001e\u0018\u0001\"\u0006\b\u0001\u0010\u001f\u0018\u0001H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0087\b\u001a7\u0010)\u001a\u00020\t\"\u0006\b\u0000\u0010\u0016\u0018\u0001*\u00020\b2\u0006\u0010*\u001a\u00020\u00032\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\b\b\u0002\u0010.\u001a\u00020/H\u0086\b\"\u001b\u0010!\u001a\u00020\u0001*\u00020\u00018F¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u001e\u0010&\u001a\u00020\u0001*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010#\u001a\u0004\b(\u0010%¨\u00060"}, d2 = {"buildClassSerialDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "typeParameters", "", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "PrimitiveSerialDescriptor", "kind", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "SerialDescriptor", "original", "buildSerialDescriptor", "Lkotlinx/serialization/descriptors/SerialKind;", "builder", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDescriptor", "T", "type", "Lkotlin/reflect/KType;", "listSerialDescriptor", "elementDescriptor", "mapSerialDescriptor", "keyDescriptor", "valueDescriptor", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "setSerialDescriptor", "nullable", "getNullable$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getNullable", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "nonNullOriginal", "getNonNullOriginal$annotations", "getNonNullOriginal", "element", "elementName", "annotations", "", "", "isOptional", "", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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
                    kotlin.Unit buildClassSerialDescriptor$lambda$0;
                    buildClassSerialDescriptor$lambda$0 = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor$lambda$0((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj2);
                    return buildClassSerialDescriptor$lambda$0;
                }
            };
        }
        return buildClassSerialDescriptor(str, serialDescriptorArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit buildClassSerialDescriptor$lambda$0(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor buildClassSerialDescriptor(java.lang.String serialName, kotlinx.serialization.descriptors.SerialDescriptor[] typeParameters, kotlin.jvm.functions.Function1<? super kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (!(!kotlin.text.StringsKt.isBlank(serialName))) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder(serialName);
        builderAction.invoke(classSerialDescriptorBuilder);
        return new kotlinx.serialization.descriptors.SerialDescriptorImpl(serialName, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), kotlin.collections.ArraysKt.toList(typeParameters), classSerialDescriptorBuilder);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor PrimitiveSerialDescriptor(java.lang.String serialName, kotlinx.serialization.descriptors.PrimitiveKind kind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "kind");
        if (!(!kotlin.text.StringsKt.isBlank(serialName))) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        return kotlinx.serialization.internal.PrimitivesKt.PrimitiveDescriptorSafe(serialName, kind);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor SerialDescriptor(java.lang.String serialName, kotlinx.serialization.descriptors.SerialDescriptor original) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(original, "original");
        if (!(!kotlin.text.StringsKt.isBlank(serialName))) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!kotlin.jvm.internal.Intrinsics.areEqual(serialName, original.getSerialName()))) {
            throw new java.lang.IllegalArgumentException(("The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.getSerialName() + ')').toString());
        }
        if (original.getKind() instanceof kotlinx.serialization.descriptors.PrimitiveKind) {
            kotlinx.serialization.internal.PrimitivesKt.checkNameIsNotAPrimitive(serialName);
        }
        return new kotlinx.serialization.descriptors.WrappedSerialDescriptor(serialName, original);
    }

    public static /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor buildSerialDescriptor$default(java.lang.String str, kotlinx.serialization.descriptors.SerialKind serialKind, kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit buildSerialDescriptor$lambda$5;
                    buildSerialDescriptor$lambda$5 = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor$lambda$5((kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj2);
                    return buildSerialDescriptor$lambda$5;
                }
            };
        }
        return buildSerialDescriptor(str, serialKind, serialDescriptorArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit buildSerialDescriptor$lambda$5(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor buildSerialDescriptor(java.lang.String serialName, kotlinx.serialization.descriptors.SerialKind kind, kotlinx.serialization.descriptors.SerialDescriptor[] typeParameters, kotlin.jvm.functions.Function1<? super kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder, kotlin.Unit> builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        if (!(!kotlin.text.StringsKt.isBlank(serialName))) {
            throw new java.lang.IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE))) {
            throw new java.lang.IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder(serialName);
        builder.invoke(classSerialDescriptorBuilder);
        return new kotlinx.serialization.descriptors.SerialDescriptorImpl(serialName, kind, classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().size(), kotlin.collections.ArraysKt.toList(typeParameters), classSerialDescriptorBuilder);
    }

    public static final /* synthetic */ <T> kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor();
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor(kotlin.reflect.KType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return kotlinx.serialization.SerializersKt.serializer(type).getDescriptor();
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor listSerialDescriptor(kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new kotlinx.serialization.internal.ArrayListClassDesc(elementDescriptor);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlinx.serialization.descriptors.SerialDescriptor listSerialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return listSerialDescriptor(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor());
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor mapSerialDescriptor(kotlinx.serialization.descriptors.SerialDescriptor keyDescriptor, kotlinx.serialization.descriptors.SerialDescriptor valueDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueDescriptor, "valueDescriptor");
        return new kotlinx.serialization.internal.HashMapClassDesc(keyDescriptor, valueDescriptor);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <K, V> kotlinx.serialization.descriptors.SerialDescriptor mapSerialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "K");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return mapSerialDescriptor(descriptor, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor());
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.descriptors.SerialDescriptor setSerialDescriptor(kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new kotlinx.serialization.internal.HashSetClassDesc(elementDescriptor);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <T> kotlinx.serialization.descriptors.SerialDescriptor setSerialDescriptor() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return setSerialDescriptor(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor());
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getNullable(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isNullable() ? serialDescriptor : new kotlinx.serialization.internal.SerialDescriptorForNullable(serialDescriptor);
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor getNonNullOriginal(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor instanceof kotlinx.serialization.internal.SerialDescriptorForNullable ? ((kotlinx.serialization.internal.SerialDescriptorForNullable) serialDescriptor).getOriginal() : serialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder, java.lang.String elementName, java.util.List annotations, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            annotations = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementName, "elementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        classSerialDescriptorBuilder.element(elementName, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor(), annotations, z);
    }

    public static final /* synthetic */ <T> void element(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder, java.lang.String elementName, java.util.List<? extends java.lang.annotation.Annotation> annotations, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementName, "elementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        classSerialDescriptorBuilder.element(elementName, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null).getDescriptor(), annotations, z);
    }
}
