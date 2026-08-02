package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class PredefinedEnhancementInfoKt {
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, null, false, false, 8, null);
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, null, false, false, 8, null);
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, null, true, false, 8, null);

    static {
        final kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        final java.lang.String javaLang = signatureBuildingComponents.javaLang("Object");
        final java.lang.String javaFunction = signatureBuildingComponents.javaFunction("Predicate");
        final java.lang.String javaFunction2 = signatureBuildingComponents.javaFunction("Function");
        final java.lang.String javaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        final java.lang.String javaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        final java.lang.String javaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        final java.lang.String javaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        final java.lang.String javaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        final java.lang.String javaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder signatureEnhancementBuilder = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Iterator")), "forEachRemaining", null, new kotlin.jvm.functions.Function1(javaFunction3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$0
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaFunction3;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("Iterable")), "spliterator", null, new kotlin.jvm.functions.Function1(signatureBuildingComponents) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = signatureBuildingComponents;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Collection"));
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "removeIf", null, new kotlin.jvm.functions.Function1(javaFunction) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$2
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaFunction;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "stream", null, new kotlin.jvm.functions.Function1(javaUtil) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$3
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.toString(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = javaUtil;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "parallelStream", null, new kotlin.jvm.functions.Function1(javaUtil) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.a(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaUtil;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("List"));
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder2, "replaceAll", null, new kotlin.jvm.functions.Function1(javaFunction6) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$5
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.kernelVersion(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = javaFunction6;
            }
        }, 2, null);
        classEnhancementBuilder2.function("addFirst", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$6
            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.d(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaLang;
            }
        });
        classEnhancementBuilder2.function("addLast", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$7
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.AMEXKernel(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        });
        classEnhancementBuilder2.function("removeFirst", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$8
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.release(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        });
        classEnhancementBuilder2.function("removeLast", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$9
            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.resetTransaction(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaLang;
            }
        });
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedList"));
        classEnhancementBuilder3.function("addFirst", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$10
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        });
        classEnhancementBuilder3.function("addLast", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$11
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaLang;
            }
        });
        classEnhancementBuilder3.function("removeFirst", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$12
            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaLang;
            }
        });
        classEnhancementBuilder3.function("removeLast", "2.1", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$13
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaLang;
            }
        });
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedHashSet"));
        classEnhancementBuilder4.function("addFirst", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$14
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoSizesFor(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = javaLang;
            }
        });
        classEnhancementBuilder4.function("addLast", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$15
            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getInputFormats(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaLang;
            }
        });
        classEnhancementBuilder4.function("removeFirst", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$16
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputFormats(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = javaLang;
            }
        });
        classEnhancementBuilder4.function("removeLast", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$17
            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getInputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaLang;
            }
        });
        classEnhancementBuilder4.function("getFirst", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$18
            private final java.lang.String Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputMinFrameDuration(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.Camera2StreamConfigurationMap = javaLang;
            }
        });
        classEnhancementBuilder4.function("getLast", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$19
            private final java.lang.String Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputMinFrameDurationlomOqCM(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.Camera2StreamConfigurationMap = javaLang;
            }
        });
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Map"));
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "forEach", null, new kotlin.jvm.functions.Function1(javaFunction5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$20
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputSizes(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = javaFunction5;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "putIfAbsent", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$21
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputStallDuration(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$22
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputStallDurationlomOqCM(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replace", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$23
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.unwrapAs(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "replaceAll", null, new kotlin.jvm.functions.Function1(javaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$24
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.isOutputSupportedForhNQ4ISI(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaFunction4;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "compute", null, new kotlin.jvm.functions.Function1(javaLang, javaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            private final java.lang.String Camera2StreamConfigurationMap;
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
                this.Camera2StreamConfigurationMap = javaFunction4;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfAbsent", null, new kotlin.jvm.functions.Function1(javaLang, javaFunction2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$26
            private final java.lang.String Camera2StreamConfigurationMap;
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.Camera2StreamConfigurationMap = javaLang;
                this.getHighResolutionOutputSizeshNQ4ISI = javaFunction2;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "computeIfPresent", null, new kotlin.jvm.functions.Function1(javaLang, javaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$27
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaLang;
                this.getHighResolutionOutputSizeshNQ4ISI = javaFunction4;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "merge", null, new kotlin.jvm.functions.Function1(javaLang, javaFunction4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$28
            private final java.lang.String getHighSpeedVideoFpsRanges;
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaLang;
                this.getHighSpeedVideoSizes = javaFunction4;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedHashMap"));
        classEnhancementBuilder6.function("putFirst", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$29
            private final java.lang.String Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.isOutputSupportedFor(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.Camera2StreamConfigurationMap = javaLang;
            }
        });
        classEnhancementBuilder6.function("putLast", "2.2", new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$30
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getValidOutputFormatsForInputhNQ4ISI(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        });
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder7 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaUtil2);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "empty", null, new kotlin.jvm.functions.Function1(javaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$31
            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.coroutineCreation(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaUtil2;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "of", null, new kotlin.jvm.functions.Function1(javaLang, javaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$32
            private final java.lang.String getHighSpeedVideoFpsRanges;
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaLang;
                this.getHighSpeedVideoFpsRanges = javaUtil2;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ofNullable", null, new kotlin.jvm.functions.Function1(javaLang, javaUtil2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$33
            private final java.lang.String Camera2StreamConfigurationMap;
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getOutputFormats(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaLang;
                this.Camera2StreamConfigurationMap = javaUtil2;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "get", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$34
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.coroutineBoundary(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder7, "ifPresent", null, new kotlin.jvm.functions.Function1(javaFunction3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$35
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.CoroutineDebuggingKt(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaFunction3;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("ref/Reference")), "get", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$36
            private final java.lang.String getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.ArtificialStackFrames(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoSizes = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction), "test", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$37
            private final java.lang.String Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.accessartificialFrame(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.Camera2StreamConfigurationMap = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("BiPredicate")), "test", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$38
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt._CREATION(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction3), "accept", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$39
            private final java.lang.String getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getARTIFICIAL_FRAME_PACKAGE_NAME(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction5), "accept", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$40
            private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.b(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction2), com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$41
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt._BOUNDARY(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, javaFunction4), com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$42
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.init(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        }, 2, null);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("Supplier")), "get", null, new kotlin.jvm.functions.Function1(javaLang) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$43
            private final java.lang.String getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.c(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = javaLang;
            }
        }, 2, null);
        getHighSpeedVideoFpsRanges = signatureEnhancementBuilder.getHighSpeedVideoSizes;
    }

    public static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return getHighSpeedVideoFpsRanges;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        java.lang.String javaUtil = signatureBuildingComponents.javaUtil("Spliterator");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.returns(javaUtil, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoSizesFor(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getInputFormats(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputFormats(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getInputSizeshNQ4ISI(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputMinFrameDuration(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputMinFrameDurationlomOqCM(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputSizeshNQ4ISI(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.returns(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputSizes(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputStallDuration(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str, getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputStallDurationlomOqCM(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str, getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit unwrapAs(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit isOutputSupportedForhNQ4ISI(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers2 = getHighResolutionOutputSizeshNQ4ISI;
        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
        functionEnhancementBuilder.returns(str, javaTypeQualifiers2);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers2 = getHighSpeedVideoSizes;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers3 = getHighResolutionOutputSizeshNQ4ISI;
        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers3);
        functionEnhancementBuilder.returns(str, javaTypeQualifiers3);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers2 = getHighSpeedVideoSizes;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers2);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers3 = getHighResolutionOutputSizeshNQ4ISI;
        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
        functionEnhancementBuilder.returns(str, javaTypeQualifiers3);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit isOutputSupportedFor(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str, getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit toString(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.returns(str, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getValidOutputFormatsForInputhNQ4ISI(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str, getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit coroutineCreation(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoSizes;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str2, getHighSpeedVideoFpsRangesFor, javaTypeQualifiers);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getOutputFormats(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighResolutionOutputSizeshNQ4ISI);
        functionEnhancementBuilder.returns(str2, getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit coroutineBoundary(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoSizes);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit CoroutineDebuggingKt(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor, getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit ArtificialStackFrames(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit accessartificialFrame(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        functionEnhancementBuilder.returns(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit _CREATION(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit getARTIFICIAL_FRAME_PACKAGE_NAME(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit a(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.returns(str, javaTypeQualifiers, javaTypeQualifiers);
        functionEnhancementBuilder.mustUseReturnValue();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit b(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit _BOUNDARY(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit init(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        functionEnhancementBuilder.returns(str, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit c(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit kernelVersion(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers = getHighSpeedVideoFpsRangesFor;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit d(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit AMEXKernel(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.parameter(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit release(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ kotlin.Unit resetTransaction(java.lang.String str, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionEnhancementBuilder, "");
        functionEnhancementBuilder.returns(str, getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }
}
