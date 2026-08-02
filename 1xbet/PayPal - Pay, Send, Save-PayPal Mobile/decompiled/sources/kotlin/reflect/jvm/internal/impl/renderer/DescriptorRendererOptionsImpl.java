package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes5.dex */
public final class DescriptorRendererOptionsImpl implements kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};
    private final kotlin.properties.ReadWriteProperty AMEXKernel;
    private final kotlin.properties.ReadWriteProperty AMEXKernelCallback;
    private final kotlin.properties.ReadWriteProperty AMEXKernelJNI;
    private final kotlin.properties.ReadWriteProperty AMEXKernelProvider;
    private final kotlin.properties.ReadWriteProperty AMEXKernela;
    private final kotlin.properties.ReadWriteProperty ArtificialStackFrames;
    private final kotlin.properties.ReadWriteProperty Camera2StreamConfigurationMap;
    private final kotlin.properties.ReadWriteProperty CoroutineDebuggingKt;
    private final kotlin.properties.ReadWriteProperty _BOUNDARY;
    private final kotlin.properties.ReadWriteProperty _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.properties.ReadWriteProperty f6923a;
    private final kotlin.properties.ReadWriteProperty accessartificialFrame;
    private final kotlin.properties.ReadWriteProperty b;
    private final kotlin.properties.ReadWriteProperty c;
    private final kotlin.properties.ReadWriteProperty coroutineBoundary;
    private final kotlin.properties.ReadWriteProperty coroutineCreation;
    private final kotlin.properties.ReadWriteProperty d;
    private final kotlin.properties.ReadWriteProperty exchange;
    private final kotlin.properties.ReadWriteProperty free;
    private final kotlin.properties.ReadWriteProperty freeTransaction;
    private final kotlin.properties.ReadWriteProperty getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final kotlin.properties.ReadWriteProperty getHighSpeedVideoFpsRanges;
    private final kotlin.properties.ReadWriteProperty getHighSpeedVideoFpsRangesFor;
    private final kotlin.properties.ReadWriteProperty getHighSpeedVideoSizes;
    private final kotlin.properties.ReadWriteProperty getHighSpeedVideoSizesFor;
    private final kotlin.properties.ReadWriteProperty getInputFormats;
    private final kotlin.properties.ReadWriteProperty getInputSizeshNQ4ISI;
    private final kotlin.properties.ReadWriteProperty getOutputFormats;
    private final kotlin.properties.ReadWriteProperty getOutputMinFrameDuration;
    private final kotlin.properties.ReadWriteProperty getOutputMinFrameDurationlomOqCM;
    private final kotlin.properties.ReadWriteProperty getOutputSizes;
    private final kotlin.properties.ReadWriteProperty getOutputSizeshNQ4ISI;
    private final kotlin.properties.ReadWriteProperty getOutputStallDuration;
    private final kotlin.properties.ReadWriteProperty getOutputStallDurationlomOqCM;
    private final kotlin.properties.ReadWriteProperty getValidOutputFormatsForInputhNQ4ISI;
    private final kotlin.properties.ReadWriteProperty init;
    private boolean isOutputSupportedFor;
    private final kotlin.properties.ReadWriteProperty isOutputSupportedForhNQ4ISI;
    private final kotlin.properties.ReadWriteProperty kernelVersion;
    private final kotlin.properties.ReadWriteProperty l;
    private final kotlin.properties.ReadWriteProperty release;
    private final kotlin.properties.ReadWriteProperty requestGoOnline;
    private final kotlin.properties.ReadWriteProperty requestPINEntry;
    private final kotlin.properties.ReadWriteProperty resetTransaction;
    private final kotlin.properties.ReadWriteProperty rsaCipher;
    private final kotlin.properties.ReadWriteProperty sha1;
    private final kotlin.properties.ReadWriteProperty startTransaction;
    private final kotlin.properties.ReadWriteProperty toString;
    private final kotlin.properties.ReadWriteProperty unwrapAs;
    private final kotlin.properties.ReadWriteProperty updateUI;
    private final kotlin.properties.ReadWriteProperty version;

    public DescriptorRendererOptionsImpl() {
        kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED source_code_qualified = kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE;
        kotlin.properties.Delegates delegates = kotlin.properties.Delegates.INSTANCE;
        this.getInputFormats = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(source_code_qualified, this);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        kotlin.properties.Delegates delegates2 = kotlin.properties.Delegates.INSTANCE;
        this.freeTransaction = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates3 = kotlin.properties.Delegates.INSTANCE;
        this.sha1 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> set = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS;
        kotlin.properties.Delegates delegates4 = kotlin.properties.Delegates.INSTANCE;
        this.isOutputSupportedForhNQ4ISI = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(set, this);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        kotlin.properties.Delegates delegates5 = kotlin.properties.Delegates.INSTANCE;
        this.updateUI = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates6 = kotlin.properties.Delegates.INSTANCE;
        this.exchange = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates7 = kotlin.properties.Delegates.INSTANCE;
        this.getOutputFormats = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates8 = kotlin.properties.Delegates.INSTANCE;
        this.getInputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates9 = kotlin.properties.Delegates.INSTANCE;
        this.AMEXKernelJNI = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates10 = kotlin.properties.Delegates.INSTANCE;
        this.requestPINEntry = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates11 = kotlin.properties.Delegates.INSTANCE;
        this.free = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates12 = kotlin.properties.Delegates.INSTANCE;
        this.getOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates13 = kotlin.properties.Delegates.INSTANCE;
        this.unwrapAs = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates14 = kotlin.properties.Delegates.INSTANCE;
        this.kernelVersion = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates15 = kotlin.properties.Delegates.INSTANCE;
        this.d = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates16 = kotlin.properties.Delegates.INSTANCE;
        this._CREATION = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates17 = kotlin.properties.Delegates.INSTANCE;
        this.release = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates18 = kotlin.properties.Delegates.INSTANCE;
        this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates19 = kotlin.properties.Delegates.INSTANCE;
        this.AMEXKernelCallback = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates20 = kotlin.properties.Delegates.INSTANCE;
        this.toString = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates21 = kotlin.properties.Delegates.INSTANCE;
        this.b = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        kotlin.properties.Delegates delegates22 = kotlin.properties.Delegates.INSTANCE;
        this.version = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates23 = kotlin.properties.Delegates.INSTANCE;
        this.AMEXKernelProvider = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$$Lambda$0 descriptorRendererOptionsImpl$$Lambda$0 = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
            }
        };
        kotlin.properties.Delegates delegates24 = kotlin.properties.Delegates.INSTANCE;
        this.requestGoOnline = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(descriptorRendererOptionsImpl$$Lambda$0, this);
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$$Lambda$1 descriptorRendererOptionsImpl$$Lambda$1 = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj);
            }
        };
        kotlin.properties.Delegates delegates25 = kotlin.properties.Delegates.INSTANCE;
        this.getOutputMinFrameDuration = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(descriptorRendererOptionsImpl$$Lambda$1, this);
        kotlin.properties.Delegates delegates26 = kotlin.properties.Delegates.INSTANCE;
        this.startTransaction = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy overrideRenderingPolicy = kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OPEN;
        kotlin.properties.Delegates delegates27 = kotlin.properties.Delegates.INSTANCE;
        this.accessartificialFrame = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(overrideRenderingPolicy, this);
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT r2 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE;
        kotlin.properties.Delegates delegates28 = kotlin.properties.Delegates.INSTANCE;
        this.rsaCipher = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(r2, this);
        kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat renderingFormat = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN;
        kotlin.properties.Delegates delegates29 = kotlin.properties.Delegates.INSTANCE;
        this.l = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(renderingFormat, this);
        kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ALL;
        kotlin.properties.Delegates delegates30 = kotlin.properties.Delegates.INSTANCE;
        this.coroutineCreation = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(parameterNameRenderingPolicy, this);
        kotlin.properties.Delegates delegates31 = kotlin.properties.Delegates.INSTANCE;
        this.f6923a = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates32 = kotlin.properties.Delegates.INSTANCE;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.DEBUG;
        kotlin.properties.Delegates delegates33 = kotlin.properties.Delegates.INSTANCE;
        this.coroutineBoundary = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(propertyAccessorRenderingPolicy, this);
        kotlin.properties.Delegates delegates34 = kotlin.properties.Delegates.INSTANCE;
        this.AMEXKernel = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates35 = kotlin.properties.Delegates.INSTANCE;
        this.getOutputStallDuration = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        java.util.Set emptySet = kotlin.collections.SetsKt.emptySet();
        kotlin.properties.Delegates delegates36 = kotlin.properties.Delegates.INSTANCE;
        this.getOutputMinFrameDurationlomOqCM = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(emptySet, this);
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> internalAnnotationsForResolve = kotlin.reflect.jvm.internal.impl.renderer.ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve();
        kotlin.properties.Delegates delegates37 = kotlin.properties.Delegates.INSTANCE;
        this.getOutputStallDurationlomOqCM = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(internalAnnotationsForResolve, this);
        kotlin.properties.Delegates delegates38 = kotlin.properties.Delegates.INSTANCE;
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS;
        kotlin.properties.Delegates delegates39 = kotlin.properties.Delegates.INSTANCE;
        this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(annotationArgumentsRenderingPolicy, this);
        kotlin.properties.Delegates delegates40 = kotlin.properties.Delegates.INSTANCE;
        this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates41 = kotlin.properties.Delegates.INSTANCE;
        this.c = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates42 = kotlin.properties.Delegates.INSTANCE;
        this.AMEXKernela = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates43 = kotlin.properties.Delegates.INSTANCE;
        this.resetTransaction = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates44 = kotlin.properties.Delegates.INSTANCE;
        this._BOUNDARY = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates45 = kotlin.properties.Delegates.INSTANCE;
        this.getOutputSizes = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates46 = kotlin.properties.Delegates.INSTANCE;
        this.CoroutineDebuggingKt = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        kotlin.properties.Delegates delegates47 = kotlin.properties.Delegates.INSTANCE;
        this.init = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates48 = kotlin.properties.Delegates.INSTANCE;
        this.ArtificialStackFrames = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates49 = kotlin.properties.Delegates.INSTANCE;
        this.getHighSpeedVideoSizesFor = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        kotlin.properties.Delegates delegates50 = kotlin.properties.Delegates.INSTANCE;
        this.getValidOutputFormatsForInputhNQ4ISI = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
    }

    public final /* bridge */ boolean getIncludeAnnotationArguments() {
        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public final /* bridge */ boolean getIncludeEmptyAnnotationArguments() {
        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public final boolean isLocked() {
        return this.isOutputSupportedFor;
    }

    public final void lock() {
        this.isOutputSupportedFor = true;
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl copy() {
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl();
        java.lang.reflect.Field[] declaredFields = getClass().getDeclaredFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredFields, "");
        for (java.lang.reflect.Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                java.lang.Object obj = field.get(this);
                kotlin.properties.ObservableProperty observableProperty = obj instanceof kotlin.properties.ObservableProperty ? (kotlin.properties.ObservableProperty) obj : null;
                if (observableProperty != null) {
                    java.lang.String name2 = field.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                    kotlin.text.StringsKt.startsWith$default(name2, "is", false, 2, (java.lang.Object) null);
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.class);
                    java.lang.String name3 = field.getName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("get");
                    java.lang.String name4 = field.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name4, "");
                    if (name4.length() > 0) {
                        char upperCase = java.lang.Character.toUpperCase(name4.charAt(0));
                        java.lang.String substring = name4.substring(1);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(upperCase);
                        sb2.append(substring);
                        name4 = sb2.toString();
                    }
                    sb.append(name4);
                    java.lang.Object value = observableProperty.getValue(this, new kotlin.jvm.internal.PropertyReference1Impl(orCreateKotlinClass, name3, sb.toString()));
                    kotlin.properties.Delegates delegates = kotlin.properties.Delegates.INSTANCE;
                    field.set(descriptorRendererOptionsImpl, new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(value, descriptorRendererOptionsImpl));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy getClassifierNamePolicy() {
        return (kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy) this.getInputFormats.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierNamePolicy, "");
        this.getInputFormats.setValue(this, getHighResolutionOutputSizeshNQ4ISI[0], classifierNamePolicy);
    }

    public final boolean getWithDefinedIn() {
        return ((java.lang.Boolean) this.freeTransaction.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setWithDefinedIn(boolean z) {
        this.freeTransaction.setValue(this, getHighResolutionOutputSizeshNQ4ISI[1], java.lang.Boolean.valueOf(z));
    }

    public final boolean getWithSourceFileForTopLevel() {
        return ((java.lang.Boolean) this.sha1.getValue(this, getHighResolutionOutputSizeshNQ4ISI[2])).booleanValue();
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> getModifiers() {
        return (java.util.Set) this.isOutputSupportedForhNQ4ISI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[3]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setModifiers(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.isOutputSupportedForhNQ4ISI.setValue(this, getHighResolutionOutputSizeshNQ4ISI[3], set);
    }

    public final boolean getStartFromName() {
        return ((java.lang.Boolean) this.updateUI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setStartFromName(boolean z) {
        this.updateUI.setValue(this, getHighResolutionOutputSizeshNQ4ISI[4], java.lang.Boolean.valueOf(z));
    }

    public final boolean getStartFromDeclarationKeyword() {
        return ((java.lang.Boolean) this.exchange.getValue(this, getHighResolutionOutputSizeshNQ4ISI[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final boolean getDebugMode() {
        return ((java.lang.Boolean) this.getOutputFormats.getValue(this, getHighResolutionOutputSizeshNQ4ISI[6])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setDebugMode(boolean z) {
        this.getOutputFormats.setValue(this, getHighResolutionOutputSizeshNQ4ISI[6], java.lang.Boolean.valueOf(z));
    }

    public final boolean getClassWithPrimaryConstructor() {
        return ((java.lang.Boolean) this.getInputSizeshNQ4ISI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[7])).booleanValue();
    }

    public final boolean getVerbose() {
        return ((java.lang.Boolean) this.AMEXKernelJNI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setVerbose(boolean z) {
        this.AMEXKernelJNI.setValue(this, getHighResolutionOutputSizeshNQ4ISI[8], java.lang.Boolean.valueOf(z));
    }

    public final boolean getUnitReturnType() {
        return ((java.lang.Boolean) this.requestPINEntry.getValue(this, getHighResolutionOutputSizeshNQ4ISI[9])).booleanValue();
    }

    public final boolean getWithoutReturnType() {
        return ((java.lang.Boolean) this.free.getValue(this, getHighResolutionOutputSizeshNQ4ISI[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final boolean getEnhancedTypes() {
        return ((java.lang.Boolean) this.getOutputSizeshNQ4ISI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[11])).booleanValue();
    }

    public final boolean getNormalizedVisibilities() {
        return ((java.lang.Boolean) this.unwrapAs.getValue(this, getHighResolutionOutputSizeshNQ4ISI[12])).booleanValue();
    }

    public final boolean getRenderDefaultVisibility() {
        return ((java.lang.Boolean) this.kernelVersion.getValue(this, getHighResolutionOutputSizeshNQ4ISI[13])).booleanValue();
    }

    public final boolean getRenderDefaultModality() {
        return ((java.lang.Boolean) this.d.getValue(this, getHighResolutionOutputSizeshNQ4ISI[14])).booleanValue();
    }

    public final boolean getRenderConstructorDelegation() {
        return ((java.lang.Boolean) this._CREATION.getValue(this, getHighResolutionOutputSizeshNQ4ISI[15])).booleanValue();
    }

    public final boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((java.lang.Boolean) this.release.getValue(this, getHighResolutionOutputSizeshNQ4ISI[16])).booleanValue();
    }

    public final boolean getActualPropertiesInPrimaryConstructor() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue(this, getHighResolutionOutputSizeshNQ4ISI[17])).booleanValue();
    }

    public final boolean getUninferredTypeParameterAsName() {
        return ((java.lang.Boolean) this.AMEXKernelCallback.getValue(this, getHighResolutionOutputSizeshNQ4ISI[18])).booleanValue();
    }

    public final boolean getIncludePropertyConstant() {
        return ((java.lang.Boolean) this.toString.getValue(this, getHighResolutionOutputSizeshNQ4ISI[19])).booleanValue();
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>, java.lang.String> getPropertyConstantRenderer() {
        return (kotlin.jvm.functions.Function1) this.b.getValue(this, getHighResolutionOutputSizeshNQ4ISI[20]);
    }

    public final boolean getWithoutTypeParameters() {
        return ((java.lang.Boolean) this.version.getValue(this, getHighResolutionOutputSizeshNQ4ISI[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setWithoutTypeParameters(boolean z) {
        this.version.setValue(this, getHighResolutionOutputSizeshNQ4ISI[21], java.lang.Boolean.valueOf(z));
    }

    public final boolean getWithoutSuperTypes() {
        return ((java.lang.Boolean) this.AMEXKernelProvider.getValue(this, getHighResolutionOutputSizeshNQ4ISI[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setWithoutSuperTypes(boolean z) {
        this.AMEXKernelProvider.setValue(this, getHighResolutionOutputSizeshNQ4ISI[22], java.lang.Boolean.valueOf(z));
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType> getTypeNormalizer() {
        return (kotlin.jvm.functions.Function1) this.requestGoOnline.getValue(this, getHighResolutionOutputSizeshNQ4ISI[23]);
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String> getDefaultParameterValueRenderer() {
        return (kotlin.jvm.functions.Function1) this.getOutputMinFrameDuration.getValue(this, getHighResolutionOutputSizeshNQ4ISI[24]);
    }

    public final boolean getSecondaryConstructorsAsPrimary() {
        return ((java.lang.Boolean) this.startTransaction.getValue(this, getHighResolutionOutputSizeshNQ4ISI[25])).booleanValue();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy) this.accessartificialFrame.getValue(this, getHighResolutionOutputSizeshNQ4ISI[26]);
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler) this.rsaCipher.getValue(this, getHighResolutionOutputSizeshNQ4ISI[27]);
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat getTextFormat() {
        return (kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat) this.l.getValue(this, getHighResolutionOutputSizeshNQ4ISI[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setTextFormat(kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat renderingFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderingFormat, "");
        this.l.setValue(this, getHighResolutionOutputSizeshNQ4ISI[28], renderingFormat);
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) this.coroutineCreation.getValue(this, getHighResolutionOutputSizeshNQ4ISI[29]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "");
        this.coroutineCreation.setValue(this, getHighResolutionOutputSizeshNQ4ISI[29], parameterNameRenderingPolicy);
    }

    public final boolean getReceiverAfterName() {
        return ((java.lang.Boolean) this.f6923a.getValue(this, getHighResolutionOutputSizeshNQ4ISI[30])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setReceiverAfterName(boolean z) {
        this.f6923a.setValue(this, getHighResolutionOutputSizeshNQ4ISI[30], java.lang.Boolean.valueOf(z));
    }

    public final boolean getRenderCompanionObjectName() {
        return ((java.lang.Boolean) this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue(this, getHighResolutionOutputSizeshNQ4ISI[31])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setRenderCompanionObjectName(boolean z) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.setValue(this, getHighResolutionOutputSizeshNQ4ISI[31], java.lang.Boolean.valueOf(z));
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy) this.coroutineBoundary.getValue(this, getHighResolutionOutputSizeshNQ4ISI[32]);
    }

    public final boolean getRenderDefaultAnnotationArguments() {
        return ((java.lang.Boolean) this.AMEXKernel.getValue(this, getHighResolutionOutputSizeshNQ4ISI[33])).booleanValue();
    }

    public final boolean getEachAnnotationOnNewLine() {
        return ((java.lang.Boolean) this.getOutputStallDuration.getValue(this, getHighResolutionOutputSizeshNQ4ISI[34])).booleanValue();
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getExcludedAnnotationClasses() {
        return (java.util.Set) this.getOutputMinFrameDurationlomOqCM.getValue(this, getHighResolutionOutputSizeshNQ4ISI[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getExcludedTypeAnnotationClasses() {
        return (java.util.Set) this.getOutputStallDurationlomOqCM.getValue(this, getHighResolutionOutputSizeshNQ4ISI[36]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setExcludedTypeAnnotationClasses(java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getOutputStallDurationlomOqCM.setValue(this, getHighResolutionOutputSizeshNQ4ISI[36], set);
    }

    public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, java.lang.Boolean> getAnnotationFilter() {
        return (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[37]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy) this.getHighSpeedVideoSizes.getValue(this, getHighResolutionOutputSizeshNQ4ISI[38]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void setAnnotationArgumentsRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "");
        this.getHighSpeedVideoSizes.setValue(this, getHighResolutionOutputSizeshNQ4ISI[38], annotationArgumentsRenderingPolicy);
    }

    public final boolean getAlwaysRenderModifiers() {
        return ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue(this, getHighResolutionOutputSizeshNQ4ISI[39])).booleanValue();
    }

    public final boolean getRenderConstructorKeyword() {
        return ((java.lang.Boolean) this.c.getValue(this, getHighResolutionOutputSizeshNQ4ISI[40])).booleanValue();
    }

    public final boolean getRenderUnabbreviatedType() {
        return ((java.lang.Boolean) this.AMEXKernela.getValue(this, getHighResolutionOutputSizeshNQ4ISI[41])).booleanValue();
    }

    public final boolean getRenderTypeExpansions() {
        return ((java.lang.Boolean) this.resetTransaction.getValue(this, getHighResolutionOutputSizeshNQ4ISI[42])).booleanValue();
    }

    public final boolean getRenderAbbreviatedTypeComments() {
        return ((java.lang.Boolean) this._BOUNDARY.getValue(this, getHighResolutionOutputSizeshNQ4ISI[43])).booleanValue();
    }

    public final boolean getIncludeAdditionalModifiers() {
        return ((java.lang.Boolean) this.getOutputSizes.getValue(this, getHighResolutionOutputSizeshNQ4ISI[44])).booleanValue();
    }

    public final boolean getParameterNamesInFunctionalTypes() {
        return ((java.lang.Boolean) this.CoroutineDebuggingKt.getValue(this, getHighResolutionOutputSizeshNQ4ISI[45])).booleanValue();
    }

    public final boolean getPresentableUnresolvedTypes() {
        return ((java.lang.Boolean) this.ArtificialStackFrames.getValue(this, getHighResolutionOutputSizeshNQ4ISI[47])).booleanValue();
    }

    public final boolean getBoldOnlyForNamesInHtml() {
        return ((java.lang.Boolean) this.getHighSpeedVideoSizesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[48])).booleanValue();
    }

    public final boolean getInformativeErrorType() {
        return ((java.lang.Boolean) this.getValidOutputFormatsForInputhNQ4ISI.getValue(this, getHighResolutionOutputSizeshNQ4ISI[49])).booleanValue();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType;
    }

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameterDescriptor, "");
        return "...";
    }
}
