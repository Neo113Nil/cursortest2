package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader<A, kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants<? extends A, ? extends C>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<A, C> {
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass, kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants<A, C>> getHighResolutionOutputSizeshNQ4ISI;

    protected abstract C loadConstant(java.lang.String str, java.lang.Object obj);

    protected abstract C transformToUnsignedConstant(C c);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants<A, C> getAnnotationsContainer(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(kotlinJvmBinaryClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadAnnotationDefaultValue(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return getHighSpeedVideoFpsRangesFor(protoContainer, property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER, kotlinType, new kotlin.jvm.functions.Function2() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1
            @Override // kotlin.jvm.functions.Function2
            public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants) obj, (kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) obj2);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadPropertyConstant(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protoContainer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return getHighSpeedVideoFpsRangesFor(protoContainer, property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY, kotlinType, new kotlin.jvm.functions.Function2() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$2
            @Override // kotlin.jvm.functions.Function2
            public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants) obj, (kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) obj2);
            }
        });
    }

    private final C getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer protoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants<? extends A, ? extends C>, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, ? extends C> function2) {
        C invoke;
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.Companion.getSpecialCaseContainerClass(protoContainer, true, true, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST.get(property.getFlags()), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(property), getKotlinClassFinder(), getMetadataVersion()));
        if (findClassWithAnnotationsAndInitializers == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature callableSignature = getCallableSignature(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, findClassWithAnnotationsAndInitializers.getClassHeader().getMetadataVersion().isAtLeast(kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()));
        if (callableSignature == null || (invoke = function2.invoke(this.getHighResolutionOutputSizeshNQ4ISI.invoke(findClassWithAnnotationsAndInitializers), callableSignature)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(kotlinType) ? transformToUnsignedConstant(invoke) : invoke;
    }

    protected final boolean isRepeatableWithImplicitContainer(kotlin.reflect.jvm.internal.impl.name.ClassId classId, java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(classId, kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations.INSTANCE.getJAVA_LANG_ANNOTATION_REPEATABLE())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue = map.get(kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE));
        kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue kClassValue = constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue ? (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) constantValue : null;
        if (kClassValue == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value value = kClassValue.getValue();
        kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass normalClass = value instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass ? (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) value : null;
        if (normalClass == null) {
            return false;
        }
        return isImplicitRepeatableContainer(normalClass.getClassId());
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants getHighResolutionOutputSizeshNQ4ISI(final kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "");
        final java.util.HashMap hashMap = new java.util.HashMap();
        final java.util.HashMap hashMap2 = new java.util.HashMap();
        final java.util.HashMap hashMap3 = new java.util.HashMap();
        kotlinJvmBinaryClass.visitMembers(new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor(abstractBinaryClassAnnotationAndConstantLoader) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader<A, C> getHighSpeedVideoSizes;

            {
                this.getHighSpeedVideoSizes = abstractBinaryClassAnnotationAndConstantLoader;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
                java.lang.String asString = name2.asString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.AnnotationVisitorForMethod(this, companion.fromMethodNameAndDesc(asString, str));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor visitField(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str, java.lang.Object obj) {
                java.lang.Object loadConstant;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
                java.lang.String asString = name2.asString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromFieldNameAndDesc = companion.fromFieldNameAndDesc(asString, str);
                if (obj != null && (loadConstant = this.getHighSpeedVideoSizes.loadConstant(str, obj)) != null) {
                    hashMap2.put(fromFieldNameAndDesc, loadConstant);
                }
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.MemberAnnotationVisitor(this, fromFieldNameAndDesc);
            }

            public final class AnnotationVisitorForMethod extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.MemberAnnotationVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor {
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnnotationVisitorForMethod(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature) {
                    super(abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, memberSignature);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberSignature, "");
                    this.getHighSpeedVideoFpsRangesFor = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor
                public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation(int i, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
                    kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromMethodSignatureAndParameterIndex = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.fromMethodSignatureAndParameterIndex(getSignature(), i);
                    java.util.ArrayList arrayList = (java.util.List) hashMap.get(fromMethodSignatureAndParameterIndex);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        hashMap.put(fromMethodSignatureAndParameterIndex, arrayList);
                    }
                    return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.loadAnnotationIfNotSpecial(classId, sourceElement, arrayList);
                }
            }

            public class MemberAnnotationVisitor implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor {
                private final java.util.ArrayList<A> Camera2StreamConfigurationMap;
                final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 getHighSpeedVideoFpsRanges;
                private final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getHighSpeedVideoSizes;

                public MemberAnnotationVisitor(kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberSignature, "");
                    this.getHighSpeedVideoFpsRanges = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
                    this.getHighSpeedVideoSizes = memberSignature;
                    this.Camera2StreamConfigurationMap = new java.util.ArrayList<>();
                }

                protected final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature getSignature() {
                    return this.getHighSpeedVideoSizes;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
                    return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes.loadAnnotationIfNotSpecial(classId, sourceElement, this.Camera2StreamConfigurationMap);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                    if (this.Camera2StreamConfigurationMap.isEmpty()) {
                        return;
                    }
                    hashMap.put(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
                }
            }
        }, abstractBinaryClassAnnotationAndConstantLoader.getCachedFileContent(kotlinJvmBinaryClass));
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants(hashMap, hashMap2, hashMap3);
    }

    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants annotationsContainerWithConstants, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationsContainerWithConstants, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberSignature, "");
        return annotationsContainerWithConstants.getAnnotationParametersDefaultValues().get(memberSignature);
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants annotationsContainerWithConstants, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature memberSignature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationsContainerWithConstants, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberSignature, "");
        return annotationsContainerWithConstants.getPropertyConstants().get(memberSignature);
    }
}
