package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public abstract class AbstractAnnotationLoader<A> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader<A> {
    private final kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol getHighSpeedVideoSizes;

    public AbstractAnnotationLoader(kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol serializerExtensionProtocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializerExtensionProtocol, "");
        this.getHighSpeedVideoSizes = serializerExtensionProtocol;
    }

    protected final kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol getProtocol() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadClassAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
        java.util.List list = (java.util.List) r5.getClassProto().getExtension(this.getHighSpeedVideoSizes.getClassAnnotation());
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), r5.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadCallableAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) {
            list = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) messageLite).getExtension(this.getHighSpeedVideoSizes.getConstructorAnnotation());
        } else if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            list = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) messageLite).getExtension(this.getHighSpeedVideoSizes.getFunctionAnnotation());
        } else {
            if (!(messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException("Unknown message: ".concat(java.lang.String.valueOf(messageLite)).toString());
            }
            int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractAnnotationLoader.WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
            if (i == 1) {
                list = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite).getExtension(this.getHighSpeedVideoSizes.getPropertyAnnotation());
            } else if (i == 2) {
                list = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite).getExtension(this.getHighSpeedVideoSizes.getPropertyGetterAnnotation());
            } else if (i == 3) {
                list = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite).getExtension(this.getHighSpeedVideoSizes.getPropertySetterAnnotation());
            } else {
                throw new java.lang.IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        }
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadPropertyBackingFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> propertyBackingFieldAnnotation = this.getHighSpeedVideoSizes.getPropertyBackingFieldAnnotation();
        java.util.List list = propertyBackingFieldAnnotation != null ? (java.util.List) property.getExtension(propertyBackingFieldAnnotation) : null;
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadPropertyDelegateFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> propertyDelegatedFieldAnnotation = this.getHighSpeedVideoSizes.getPropertyDelegatedFieldAnnotation();
        java.util.List list = propertyDelegatedFieldAnnotation != null ? (java.util.List) property.getExtension(propertyDelegatedFieldAnnotation) : null;
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadEnumEntryAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumEntry, "");
        java.util.List list = (java.util.List) enumEntry.getExtension(this.getHighSpeedVideoSizes.getEnumEntryAnnotation());
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadValueParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameter, "");
        java.util.List list = (java.util.List) valueParameter.getExtension(this.getHighSpeedVideoSizes.getParameterAnnotation());
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadExtensionReceiverParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        java.util.List list = null;
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> functionExtensionReceiverAnnotation = this.getHighSpeedVideoSizes.getFunctionExtensionReceiverAnnotation();
            if (functionExtensionReceiverAnnotation != null) {
                list = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) messageLite).getExtension(functionExtensionReceiverAnnotation);
            }
        } else {
            if (!(messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException("Unknown message: ".concat(java.lang.String.valueOf(messageLite)).toString());
            }
            int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractAnnotationLoader.WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation>> propertyExtensionReceiverAnnotation = this.getHighSpeedVideoSizes.getPropertyExtensionReceiverAnnotation();
                if (propertyExtensionReceiverAnnotation != null) {
                    list = (java.util.List) ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite).getExtension(propertyExtensionReceiverAnnotation);
                }
            } else {
                throw new java.lang.IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(java.lang.String.valueOf(annotatedCallableKind)).toString());
            }
        }
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), protoContainer.getNameResolver()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadContextParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        java.util.List<A> loadValueParameterAnnotations = valueParameter != null ? loadValueParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, i, valueParameter) : null;
        return loadValueParameterAnnotations == null ? kotlin.collections.CollectionsKt.emptyList() : loadValueParameterAnnotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadTypeAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        java.util.List list = (java.util.List) type.getExtension(this.getHighSpeedVideoSizes.getTypeAnnotation());
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadTypeParameterAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        java.util.List list = (java.util.List) typeParameter.getExtension(this.getHighSpeedVideoSizes.getTypeParameterAnnotation());
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
