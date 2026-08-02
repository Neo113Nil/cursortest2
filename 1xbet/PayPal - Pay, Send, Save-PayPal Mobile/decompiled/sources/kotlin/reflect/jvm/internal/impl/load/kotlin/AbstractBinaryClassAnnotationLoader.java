package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer<? extends A>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader<A> {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder getHighSpeedVideoSizes;

    public static abstract class AnnotationsContainer<A> {
        public abstract java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, java.util.List<A>> getMemberAnnotations();
    }

    protected abstract S getAnnotationsContainer(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public abstract kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getMetadataVersion();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public abstract A loadAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver);

    protected abstract kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, java.util.List<A> list);

    public AbstractBinaryClassAnnotationLoader(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        this.getHighSpeedVideoSizes = kotlinClassFinder;
    }

    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder getKotlinClassFinder() {
        return this.getHighSpeedVideoSizes;
    }

    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotationIfNotSpecial(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, java.util.List<A> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(classId)) {
            return null;
        }
        return loadAnnotation(classId, sourceElement, list);
    }

    private static kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r2) {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = r2.getSource();
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement ? (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) source : null;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.getBinaryClass();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadClassAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(r4);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Class for loading annotations is not found: ");
            sb.append(r4.debugFqName());
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList(1);
        highResolutionOutputSizeshNQ4ISI.loadClassAnnotations(new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader<A, S> getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final void visitEnd() {
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
                return this.getHighSpeedVideoFpsRangesFor.loadAnnotationIfNotSpecial(classId, sourceElement, arrayList);
            }
        }, getCachedFileContent(highResolutionOutputSizeshNQ4ISI));
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadCallableAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        if (annotatedCallableKind == kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY) {
            return getHighSpeedVideoFpsRangesFor(protoContainer, (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement.Camera2StreamConfigurationMap);
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        return callableSignature$default == null ? kotlin.collections.CollectionsKt.emptyList() : getHighSpeedVideoFpsRangesFor(this, protoContainer, callableSignature$default, false, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadPropertyBackingFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return getHighSpeedVideoFpsRangesFor(protoContainer, property, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadPropertyDelegateFieldAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return getHighSpeedVideoFpsRangesFor(protoContainer, property, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class PropertyRelatedElement {
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement Camera2StreamConfigurationMap;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement getHighResolutionOutputSizeshNQ4ISI;
        public static final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private PropertyRelatedElement(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement propertyRelatedElement = new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement("PROPERTY", 0);
            Camera2StreamConfigurationMap = propertyRelatedElement;
            kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement propertyRelatedElement2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement("BACKING_FIELD", 1);
            getHighResolutionOutputSizeshNQ4ISI = propertyRelatedElement2;
            kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement propertyRelatedElement3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement("DELEGATE_FIELD", 2);
            getHighSpeedVideoFpsRanges = propertyRelatedElement3;
            kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement[] propertyRelatedElementArr = {propertyRelatedElement, propertyRelatedElement2, propertyRelatedElement3};
            getHighSpeedVideoFpsRangesFor = propertyRelatedElementArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(propertyRelatedElementArr);
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement[] values() {
            return (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement.class, str);
        }
    }

    private final java.util.List<A> getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement propertyRelatedElement) {
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST.get(property.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        boolean booleanValue = bool.booleanValue();
        boolean isMovedFromInterfaceCompanion = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (propertyRelatedElement == kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement.Camera2StreamConfigurationMap) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature propertySignature$default = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            return propertySignature$default == null ? kotlin.collections.CollectionsKt.emptyList() : getHighSpeedVideoFpsRangesFor(this, protoContainer, propertySignature$default, true, java.lang.Boolean.valueOf(booleanValue), isMovedFromInterfaceCompanion, 8);
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature propertySignature$default2 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) propertySignature$default2.getSignature(), (java.lang.CharSequence) "$delegate", false, 2, (java.lang.Object) null) != (propertyRelatedElement == kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.PropertyRelatedElement.getHighSpeedVideoFpsRanges) ? kotlin.collections.CollectionsKt.emptyList() : getHighSpeedVideoFpsRanges(protoContainer, propertySignature$default2, true, true, java.lang.Boolean.valueOf(booleanValue), isMovedFromInterfaceCompanion);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadEnumEntryAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumEntry, "");
        return getHighSpeedVideoFpsRangesFor(this, protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromFieldNameAndDesc(protoContainer.getNameResolver().getString(enumEntry.getName()), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer).getClassId().asString())), false, null, false, 60);
    }

    private static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature, boolean z, java.lang.Boolean bool, boolean z2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationLoader.getHighSpeedVideoFpsRanges(protoContainer, memberSignature, z3, false, bool, (i & 32) != 0 ? false : z2);
    }

    private final java.util.List<A> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature, boolean z, boolean z2, java.lang.Boolean bool, boolean z3) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, Companion.getSpecialCaseContainerClass(protoContainer, z, z2, bool, z3, this.getHighSpeedVideoSizes, getMetadataVersion()));
        if (findClassWithAnnotationsAndInitializers == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<A> list = getAnnotationsContainer(findClassWithAnnotationsAndInitializers).getMemberAnnotations().get(memberSignature);
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadContextParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        return getHighResolutionOutputSizeshNQ4ISI(protoContainer, messageLite, annotatedCallableKind, i);
    }

    private final java.util.List<A> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, int i) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        return callableSignature$default == null ? kotlin.collections.CollectionsKt.emptyList() : getHighSpeedVideoFpsRangesFor(this, protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i), false, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadTypeAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = type.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> list = annotationList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadTypeParameterAnnotations(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = typeParameter.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> list = annotationList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) {
            return getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer);
        }
        return null;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getCallableSignature$default(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return abstractBinaryClassAnnotationLoader.getCallableSignature(messageLite, nameResolver, typeTable, annotatedCallableKind, z);
    }

    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getCallableSignature(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmConstructorSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) messageLite, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return companion.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion2 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmMethodSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) messageLite, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            return companion2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) {
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) messageLite, generatedExtension);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoaderKt.getPropertySignature((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite, nameResolver, typeTable, true, true, z);
                }
                if (!jvmPropertySignature.hasSetter()) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion3 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setter, "");
                return companion3.fromMethod(nameResolver, setter);
            }
            if (jvmPropertySignature.hasGetter()) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getter, "");
                return companion4.fromMethod(nameResolver, getter);
            }
        }
        return null;
    }

    protected final boolean isImplicitRepeatableContainer(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        return classId.getOuterClassId() != null && kotlin.jvm.internal.Intrinsics.areEqual(classId.getShortClassName().asString(), androidx.compose.material3.internal.TextFieldImplKt.ContainerId) && (findKotlinClass = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(this.getHighSpeedVideoSizes, classId, getMetadataVersion())) != null && kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(findKotlinClass);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getSpecialCaseContainerClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, boolean z, boolean z2, java.lang.Boolean bool, boolean z3, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class outerClass;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
            if (z) {
                if (bool == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("isConst should not be null for property (container=");
                    sb.append(protoContainer);
                    sb.append(')');
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                if (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r9 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer;
                    if (r9.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE) {
                        kotlin.reflect.jvm.internal.impl.name.ClassId classId = r9.getClassId();
                        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("DefaultImpls");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                        return kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classId.createNestedClassId(identifier), metadataVersion);
                    }
                }
                if (bool.booleanValue() && (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package)) {
                    kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = protoContainer.getSource();
                    kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource = source instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource ? (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) source : null;
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName facadeClassName = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : null;
                    if (facadeClassName != null) {
                        kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
                        java.lang.String internalName = facadeClassName.getInternalName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(internalName, "");
                        return kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(kotlin.text.StringsKt.replace$default(internalName, kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null))), metadataVersion);
                    }
                }
            }
            if (z2 && (protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class)) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r92 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer;
                if (r92.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r92.getOuterClass()) != null && (outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS || (z3 && (outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source2 = outerClass.getSource();
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement ? (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) source2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.getBinaryClass();
                    }
                    return null;
                }
            }
            if (!(protoContainer instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package) || !(protoContainer.getSource() instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source3 = protoContainer.getSource();
            kotlin.jvm.internal.Intrinsics.checkNotNull(source3, "");
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource jvmPackagePartSource2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) source3;
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
            return knownJvmBinaryClass == null ? kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, jvmPackagePartSource2.getClassId(), metadataVersion) : knownJvmBinaryClass;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public java.util.List<A> loadExtensionReceiverParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        int contextParameterCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            contextParameterCount = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) messageLite).getContextParameterCount();
        } else {
            contextParameterCount = messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property ? ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite).getContextParameterCount() : 0;
        }
        return getHighResolutionOutputSizeshNQ4ISI(protoContainer, messageLite, annotatedCallableKind, contextParameterCount);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r6) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9.isInner() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r6) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        r1 = 1;
     */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<A> loadValueParameterAnnotations(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, int i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter) {
        int contextParameterCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameter, "");
        boolean z = messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
        int i2 = 0;
        if (z) {
            contextParameterCount = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) messageLite).getContextParameterCount();
        } else {
            contextParameterCount = messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property ? ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) messageLite).getContextParameterCount() : 0;
        }
        if (!z) {
            if (!(messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property)) {
                if (messageLite instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(protoContainer, "");
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class r9 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) protoContainer;
                    if (r9.getKind() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS) {
                        i2 = 2;
                    }
                    return getHighResolutionOutputSizeshNQ4ISI(protoContainer, messageLite, annotatedCallableKind, i + contextParameterCount + i2);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported message: ");
                sb.append(messageLite.getClass());
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected byte[] getCachedFileContent(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        return null;
    }
}
