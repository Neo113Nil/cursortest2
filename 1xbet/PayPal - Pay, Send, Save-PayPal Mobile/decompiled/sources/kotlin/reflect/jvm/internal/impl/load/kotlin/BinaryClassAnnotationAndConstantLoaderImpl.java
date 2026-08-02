package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> {
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        this.getHighSpeedVideoSizes = moduleDescriptor;
        this.Camera2StreamConfigurationMap = notFoundClasses;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer(moduleDescriptor, notFoundClasses);
        this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getMetadataVersion() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setMetadataVersion(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        this.getHighSpeedVideoFpsRangesFor = metadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor loadAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.deserializeAnnotation(annotation, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> loadConstant(java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "ZBCS", (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            int intValue = ((java.lang.Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals("B")) {
                    obj = java.lang.Byte.valueOf((byte) intValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (hashCode == 67) {
                if (str.equals(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA)) {
                    obj = java.lang.Character.valueOf((char) intValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (hashCode == 83) {
                if (str.equals("S")) {
                    obj = java.lang.Short.valueOf((short) intValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (hashCode == 90 && str.equals("Z")) {
                obj = java.lang.Boolean.valueOf(intValue != 0);
            }
            throw new java.lang.AssertionError(str);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE.createConstantValue(obj, this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> transformToUnsignedConstant(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constantValue, "");
        return constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue) constantValue).getValue().byteValue()) : constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue) constantValue).getValue().shortValue()) : constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue) constantValue).getValue().intValue()) : constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue(((kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue) constantValue).getValue().longValue()) : constantValue;
    }

    abstract class AbstractAnnotationArgumentVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public abstract void visitArrayValue(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> arrayList);

        public abstract void visitConstantValue(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue);

        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
            visitConstantValue(name2, kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.this, name2, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLiteralValue, "");
            visitConstantValue(name2, new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(classLiteralValue));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name3, "");
            visitConstantValue(name2, new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, name3));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.this, name2, this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(final kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.this;
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
            final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
            kotlin.jvm.internal.Intrinsics.checkNotNull(loadAnnotation);
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name2, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.Name Camera2StreamConfigurationMap;
                final /* synthetic */ java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor getHighSpeedVideoFpsRangesFor;
                private final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor getHighSpeedVideoSizes;

                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                    this.Camera2StreamConfigurationMap = name2;
                    this.getHighResolutionOutputSizeshNQ4ISI = arrayList;
                    this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor.this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void visitEnd() {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor.this.visitEnd();
                    this.getHighSpeedVideoFpsRangesFor.visitConstantValue(this.Camera2StreamConfigurationMap, new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue((kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name3, kotlin.reflect.jvm.internal.impl.name.ClassId classId2, kotlin.reflect.jvm.internal.impl.name.Name name4) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name4, "");
                    this.getHighSpeedVideoSizes.visitEnum(name3, classId2, name4);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name3, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLiteralValue, "");
                    this.getHighSpeedVideoSizes.visitClassLiteral(name3, classLiteralValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name3) {
                    return this.getHighSpeedVideoSizes.visitArray(name3);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.Name name3, kotlin.reflect.jvm.internal.impl.name.ClassId classId2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId2, "");
                    return this.getHighSpeedVideoSizes.visitAnnotation(name3, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void visit(kotlin.reflect.jvm.internal.impl.name.Name name3, java.lang.Object obj) {
                    this.getHighSpeedVideoSizes.visit(name3, obj);
                }
            };
        }
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue access$createConstant(kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> createConstantValue = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE.createConstantValue(obj, binaryClassAnnotationAndConstantLoaderImpl.getHighSpeedVideoSizes);
        return createConstantValue == null ? kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion.create("Unsupported annotation argument: ".concat(java.lang.String.valueOf(name2))) : createConstantValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    protected final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(final kotlin.reflect.jvm.internal.impl.name.ClassId classId, final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findNonGenericClassAcrossDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.getHighSpeedVideoSizes, classId, this.Camera2StreamConfigurationMap);
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1
            private final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getInputSizeshNQ4ISI;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.getInputSizeshNQ4ISI = new java.util.HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public final void visitConstantValue(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constantValue, "");
                if (name2 != null) {
                    this.getInputSizeshNQ4ISI.put(name2, constantValue);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public final void visitArrayValue(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> arrayList) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
                if (name2 != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor annotationParameterByName = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.getAnnotationParameterByName(name2, findNonGenericClassAcrossDependencies);
                    if (annotationParameterByName != null) {
                        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> hashMap = this.getInputSizeshNQ4ISI;
                        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory constantValueFactory = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE;
                        java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> compact = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
                        kotlin.reflect.jvm.internal.impl.types.KotlinType type = annotationParameterByName.getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                        hashMap.put(name2, constantValueFactory.createArrayValue(compact, type));
                        return;
                    }
                    if (kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(classId) && kotlin.jvm.internal.Intrinsics.areEqual(name2.asString(), com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE)) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : arrayList) {
                            if (obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) {
                                arrayList2.add(obj);
                            }
                        }
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> list2 = list;
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            list2.add(((kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) it.next()).getValue());
                        }
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void visitEnd() {
                if (kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.this.isRepeatableWithImplicitContainer(classId, this.getInputSizeshNQ4ISI) || kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(classId)) {
                    return;
                }
                list.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl(findNonGenericClassAcrossDependencies.getDefaultType(), this.getInputSizeshNQ4ISI, sourceElement));
            }
        };
    }
}
