package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes5.dex */
public abstract class DescriptorRenderer {
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT_WITH_MODIFIERS;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT_WITH_SHORT_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer DEBUG_TEXT;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer FQ_NAMES_IN_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer HTML;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer SHORT_NAMES_IN_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer WITHOUT_MODIFIERS;

    public abstract java.lang.String render(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor);

    public abstract java.lang.String renderAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract java.lang.String renderFlexibleType(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns);

    public abstract java.lang.String renderFqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe);

    public abstract java.lang.String renderName(kotlin.reflect.jvm.internal.impl.name.Name name2, boolean z);

    public abstract java.lang.String renderType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

    public abstract java.lang.String renderTypeProjection(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection);

    public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer withOptions(kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl copy = ((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) this).getOptions().copy();
        function1.invoke(copy);
        copy.lock();
        return new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl(copy);
    }

    public static /* synthetic */ java.lang.String renderAnnotation$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
    }

    public interface ValueParametersHandler {
        void appendAfterValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, int i2, java.lang.StringBuilder sb);

        void appendAfterValueParameters(int i, java.lang.StringBuilder sb);

        void appendBeforeValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, int i2, java.lang.StringBuilder sb);

        void appendBeforeValueParameters(int i, java.lang.StringBuilder sb);

        public static final class DEFAULT implements kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler {
            public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT();

            private DEFAULT() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void appendBeforeValueParameters(int i, java.lang.StringBuilder sb) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
                sb.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void appendAfterValueParameters(int i, java.lang.StringBuilder sb) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
                sb.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void appendAfterValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, int i2, java.lang.StringBuilder sb) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameterDescriptor, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void appendBeforeValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, int i2, java.lang.StringBuilder sb) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameterDescriptor, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer withOptions(kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl();
            function1.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        public final java.lang.String getClassifierKindPrefix(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters, "");
            if (classifierDescriptorWithTypeParameters instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
                return "typealias";
            }
            if (classifierDescriptorWithTypeParameters instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorWithTypeParameters;
                if (classDescriptor.isCompanionObject()) {
                    return "companion object";
                }
                switch (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion.WhenMappings.$EnumSwitchMapping$0[classDescriptor.getKind().ordinal()]) {
                    case 1:
                        return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS;
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            throw new java.lang.AssertionError("Unexpected classifier: ".concat(java.lang.String.valueOf(classifierDescriptorWithTypeParameters)));
        }

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.values().length];
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion companion = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion(null);
        Companion = companion;
        WITHOUT_MODIFIERS = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        COMPACT_WITH_MODIFIERS = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        COMPACT = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        COMPACT_WITHOUT_SUPERTYPES = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$3
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        COMPACT_WITH_SHORT_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getOutputMinFrameDuration((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        ONLY_NAMES_WITH_SHORT_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$5
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getInputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        FQ_NAMES_IN_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$6
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getInputFormats((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$7
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getOutputFormats((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        SHORT_NAMES_IN_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$8
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getHighSpeedVideoSizesFor((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        DEBUG_TEXT = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$9
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getOutputStallDurationlomOqCM((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
        HTML = companion.withOptions(new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$$Lambda$10
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions) obj);
            }
        });
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setModifiers(kotlin.collections.SetsKt.emptySet());
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setWithDefinedIn(false);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setTextFormat(kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML);
        descriptorRendererOptions.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setWithDefinedIn(false);
        descriptorRendererOptions.setModifiers(kotlin.collections.SetsKt.emptySet());
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setWithDefinedIn(false);
        descriptorRendererOptions.setModifiers(kotlin.collections.SetsKt.emptySet());
        descriptorRendererOptions.setWithoutSuperTypes(true);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputMinFrameDuration(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setModifiers(kotlin.collections.SetsKt.emptySet());
        descriptorRendererOptions.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getInputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setWithDefinedIn(false);
        descriptorRendererOptions.setModifiers(kotlin.collections.SetsKt.emptySet());
        descriptorRendererOptions.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.setWithoutTypeParameters(true);
        descriptorRendererOptions.setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE);
        descriptorRendererOptions.setReceiverAfterName(true);
        descriptorRendererOptions.setRenderCompanionObjectName(true);
        descriptorRendererOptions.setWithoutSuperTypes(true);
        descriptorRendererOptions.setStartFromName(true);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getInputFormats(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputFormats(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoSizesFor(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT.INSTANCE);
        descriptorRendererOptions.setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputStallDurationlomOqCM(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setDebugMode(true);
        descriptorRendererOptions.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
        descriptorRendererOptions.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL);
        return kotlin.Unit.INSTANCE;
    }
}
