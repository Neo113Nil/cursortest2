package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 JI\u0010)\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030!2\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J5\u0010+\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010,"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "Lkotlin/reflect/KCallable;", "p0", "", "getHighSpeedVideoSizes", "(Ljava/lang/StringBuilder;Lkotlin/reflect/KCallable;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/reflect/KProperty;", "property", "", "renderProperty", "(Lkotlin/reflect/KProperty;)Ljava/lang/String;", "Lkotlin/reflect/KFunction;", "function", "renderFunction", "(Lkotlin/reflect/KFunction;)Ljava/lang/String;", "lambda", "renderLambda", "Lkotlin/reflect/KParameter;", "parameter", "renderParameter", "(Lkotlin/reflect/KParameter;)Ljava/lang/String;", "Lkotlin/reflect/KType;", "type", "", "renderRawArgumentPrefix", "renderType", "(Lkotlin/reflect/KType;Z)Ljava/lang/String;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;", "p1", "", "Lkotlin/reflect/KTypeProjection;", "p2", "p3", "p4", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/StringBuilder;Lkotlin/reflect/KClass;Lkotlin/reflect/jvm/internal/impl/name/FqNameUnsafe;Ljava/util/List;ZZ)V", "getHighSpeedVideoFpsRanges", "(Ljava/lang/StringBuilder;Ljava/util/List;ZZ)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReflectionObjectRenderer {
    public static final kotlin.reflect.jvm.internal.ReflectionObjectRenderer INSTANCE = new kotlin.reflect.jvm.internal.ReflectionObjectRenderer();

    private ReflectionObjectRenderer() {
    }

    private static void getHighSpeedVideoSizes(java.lang.StringBuilder sb, kotlin.reflect.KCallable<?> kCallable) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(kCallable, "");
        java.util.List<kotlin.reflect.KParameter> receiverParameters = ((kotlin.reflect.jvm.internal.ReflectKCallable) kCallable).getReceiverParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : receiverParameters) {
            kotlin.reflect.KParameter kParameter = (kotlin.reflect.KParameter) obj;
            if (kParameter.getKind() == kotlin.reflect.KParameter.Kind.INSTANCE || kParameter.getKind() == kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.KParameter kParameter2 = (kotlin.reflect.KParameter) kotlin.collections.CollectionsKt.getOrNull(arrayList2, 0);
        if (kParameter2 != null) {
            sb.append(renderType$default(INSTANCE, kParameter2.getType(), false, 2, null));
            sb.append(".");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        kotlin.reflect.KParameter kParameter3 = (kotlin.reflect.KParameter) kotlin.collections.CollectionsKt.getOrNull(arrayList2, 1);
        if (kParameter3 != null) {
            kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
            sb.append("(");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(renderType$default(reflectionObjectRenderer, kParameter3.getType(), false, 2, null));
            sb.append(".");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(")");
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, kotlin.reflect.KCallable<?> kCallable) {
        java.util.List<kotlin.reflect.KParameter> contextParameters = kotlin.reflect.full.KCallables.getContextParameters(kCallable);
        if (contextParameters.isEmpty()) {
            return;
        }
        kotlin.collections.CollectionsKt.joinTo(contextParameters, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "context(", (r14 & 8) != 0 ? "" : ") ", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.KParameter) obj);
            }
        });
    }

    public final java.lang.String renderProperty(kotlin.reflect.KProperty<?> property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        kotlin.reflect.KProperty<?> kProperty = property;
        getHighResolutionOutputSizeshNQ4ISI(sb, kProperty);
        sb.append(property instanceof kotlin.reflect.KMutableProperty ? "var " : "val ");
        getHighSpeedVideoSizes(sb, kProperty);
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(property.getGetHighSpeedVideoFpsRanges());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        sb.append(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render$default(identifier, false, 1, null));
        sb.append(": ");
        sb.append(renderType$default(reflectionObjectRenderer, property.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final java.lang.String renderFunction(kotlin.reflect.KFunction<?> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        kotlin.reflect.KFunction<?> kFunction = function;
        getHighResolutionOutputSizeshNQ4ISI(sb, kFunction);
        sb.append("fun ");
        getHighSpeedVideoSizes(sb, kFunction);
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(function.getGetHighSpeedVideoFpsRanges());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        sb.append(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render$default(identifier, false, 1, null));
        kotlin.collections.CollectionsKt.joinTo(kotlin.reflect.full.KCallables.getValueParameters(kFunction), sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : "(", (r14 & 8) != 0 ? "" : ")", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.getHighSpeedVideoSizes((kotlin.reflect.KParameter) obj);
            }
        });
        sb.append(": ");
        sb.append(renderType$default(reflectionObjectRenderer, function.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final java.lang.String renderLambda(kotlin.reflect.KFunction<?> lambda) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lambda, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.reflect.KFunction<?> kFunction = lambda;
        kotlin.reflect.KParameter extensionReceiverParameter = kotlin.reflect.full.KCallables.getExtensionReceiverParameter(kFunction);
        if (extensionReceiverParameter != null) {
            sb.append(renderType$default(INSTANCE, extensionReceiverParameter.getType(), false, 2, null));
            sb.append(".");
        }
        kotlin.collections.CollectionsKt.joinTo(kotlin.reflect.full.KCallables.getValueParameters(kFunction), sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : "(", (r14 & 8) != 0 ? "" : ")", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.Camera2StreamConfigurationMap((kotlin.reflect.KParameter) obj);
            }
        });
        sb.append(" -> ");
        sb.append(renderType$default(INSTANCE, lambda.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final java.lang.String renderParameter(kotlin.reflect.KParameter parameter) {
        java.lang.String renderFunction;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameter, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = kotlin.reflect.jvm.internal.ReflectionObjectRenderer.WhenMappings.$EnumSwitchMapping$0[parameter.getKind().ordinal()];
        if (i == 1) {
            sb.append("instance parameter");
        } else if (i == 2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("context parameter ");
            sb2.append(parameter.getName());
            sb.append(sb2.toString());
        } else if (i == 3) {
            sb.append("extension receiver parameter");
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("parameter #");
            sb3.append(parameter.getIndex());
            sb3.append(' ');
            sb3.append(parameter.getName());
            sb.append(sb3.toString());
        }
        sb.append(" of ");
        kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        kotlin.reflect.jvm.internal.ReflectKCallable<?> callable = ((kotlin.reflect.jvm.internal.ReflectKParameter) parameter).getCallable();
        if (callable instanceof kotlin.reflect.KProperty) {
            renderFunction = reflectionObjectRenderer.renderProperty((kotlin.reflect.KProperty) callable);
        } else {
            if (!(callable instanceof kotlin.reflect.KFunction)) {
                throw new java.lang.IllegalStateException("Illegal callable: ".concat(java.lang.String.valueOf(callable)).toString());
            }
            renderFunction = reflectionObjectRenderer.renderFunction((kotlin.reflect.KFunction) callable);
        }
        sb.append(renderFunction);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String renderType$default(kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer, kotlin.reflect.KType kType, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return reflectionObjectRenderer.renderType(kType, z);
    }

    public final java.lang.String renderType(kotlin.reflect.KType type, boolean renderRawArgumentPrefix) {
        kotlin.reflect.jvm.internal.types.AbstractKType abstractKType;
        kotlin.reflect.jvm.internal.types.AbstractKType abstractKType2 = type;
        boolean z = renderRawArgumentPrefix;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractKType2, "");
            abstractKType = (kotlin.reflect.jvm.internal.types.AbstractKType) abstractKType2;
            if (!abstractKType.getGetHighSpeedVideoFpsRangesFor()) {
                break;
            }
            kotlin.reflect.jvm.internal.types.AbstractKType getHighResolutionOutputSizeshNQ4ISI = abstractKType.getGetHighResolutionOutputSizeshNQ4ISI();
            kotlin.jvm.internal.Intrinsics.checkNotNull(getHighResolutionOutputSizeshNQ4ISI);
            abstractKType2 = getHighResolutionOutputSizeshNQ4ISI;
            z = true;
        }
        kotlin.reflect.jvm.internal.types.AbstractKType getHighResolutionOutputSizeshNQ4ISI2 = abstractKType.getGetHighResolutionOutputSizeshNQ4ISI();
        kotlin.reflect.jvm.internal.types.AbstractKType getHighSpeedVideoFpsRanges = abstractKType.getGetHighSpeedVideoFpsRanges();
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = null;
        if (getHighResolutionOutputSizeshNQ4ISI2 != null && getHighSpeedVideoFpsRanges != null) {
            final java.lang.String renderType$default = renderType$default(this, getHighResolutionOutputSizeshNQ4ISI2, false, 2, null);
            java.lang.String renderType$default2 = renderType$default(this, getHighSpeedVideoFpsRanges, false, 2, null);
            if (kotlin.jvm.internal.Intrinsics.areEqual(renderType$default, kotlin.text.StringsKt.replace$default(renderType$default2, com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, "", false, 4, (java.lang.Object) null))) {
                return kotlin.text.StringsKt.replace$default(renderType$default2, com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, "!", false, 4, (java.lang.Object) null);
            }
            if (kotlin.text.StringsKt.endsWith$default(renderType$default2, com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, false, 2, (java.lang.Object) null)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(renderType$default);
                sb.append('?');
                if (kotlin.jvm.internal.Intrinsics.areEqual(sb.toString(), renderType$default2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(renderType$default);
                    sb2.append('!');
                    return sb2.toString();
                }
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("(");
            sb3.append(renderType$default);
            sb3.append(")?");
            if (kotlin.jvm.internal.Intrinsics.areEqual(sb3.toString(), renderType$default2)) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("(");
                sb4.append(renderType$default);
                sb4.append(")!");
                return sb4.toString();
            }
            java.lang.String renderFlexibleMutabilityOrArrayElementVarianceType$default = kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.renderFlexibleMutabilityOrArrayElementVarianceType$default(renderType$default, renderType$default2, new kotlin.jvm.functions.Function0(renderType$default) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$5
                private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = renderType$default;
                }
            }, new kotlin.jvm.functions.Function0(renderType$default) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$6
                private final java.lang.String getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoFpsRanges = renderType$default;
                }
            }, null, 16, null);
            if (renderFlexibleMutabilityOrArrayElementVarianceType$default != null) {
                return renderFlexibleMutabilityOrArrayElementVarianceType$default;
            }
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("(");
            sb5.append(renderType$default);
            sb5.append("..");
            sb5.append(renderType$default2);
            sb5.append(')');
            return sb5.toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.reflect.KType abbreviation = abstractKType.getAbbreviation();
        if (abbreviation != null) {
            sb6.append(abbreviation);
            sb6.append(" /* = ");
        }
        kotlin.reflect.KClassifier classifier = abstractKType2.getClassifier();
        if (!(classifier instanceof kotlin.reflect.KTypeParameter)) {
            if (classifier instanceof kotlin.reflect.KClass) {
                kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
                kotlin.reflect.KClass<?> kClass = (kotlin.reflect.KClass) classifier;
                if (abstractKType.getIsNothingType()) {
                    fqNameUnsafe = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.nothing;
                } else {
                    kotlin.reflect.KClass<?> mutableCollectionClass = abstractKType.getMutableCollectionClass();
                    if (mutableCollectionClass == null) {
                        mutableCollectionClass = kClass;
                    }
                    java.lang.String getHighResolutionOutputSizeshNQ4ISI3 = mutableCollectionClass.getGetHighResolutionOutputSizeshNQ4ISI();
                    if (getHighResolutionOutputSizeshNQ4ISI3 != null) {
                        fqNameUnsafe = new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(getHighResolutionOutputSizeshNQ4ISI3);
                    }
                }
                if (fqNameUnsafe == null) {
                    fqNameUnsafe = new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(kotlin.reflect.jvm.KClassesJvm.getJvmName(kClass));
                }
                if (!kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isNumberedFunctionClassFqName(fqNameUnsafe) || abstractKType2.getArguments().contains(kotlin.reflect.KTypeProjection.INSTANCE.getSTAR())) {
                    reflectionObjectRenderer.getHighSpeedVideoFpsRangesFor(sb6, kClass, fqNameUnsafe, abstractKType2.getArguments(), abstractKType2.getIsMarkedNullable(), z);
                } else {
                    if (abstractKType.getIsMarkedNullable()) {
                        sb6.append("(");
                    }
                    if (abstractKType.getIsSuspendFunctionType()) {
                        sb6.append("suspend ");
                    }
                    kotlin.collections.CollectionsKt.joinTo(kotlin.collections.CollectionsKt.dropLast(abstractKType.getArguments(), 1), sb6, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "(", (r14 & 8) != 0 ? "" : ") -> ", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
                    sb6.append(kotlin.collections.CollectionsKt.last((java.util.List) abstractKType.getArguments()));
                    if (abstractKType.getIsMarkedNullable()) {
                        sb6.append(")?");
                    }
                }
            } else if (!(classifier instanceof kotlin.reflect.jvm.internal.KTypeAliasImpl)) {
                sb6.append("???");
            } else {
                kotlin.collections.CollectionsKt.joinTo(((kotlin.reflect.jvm.internal.KTypeAliasImpl) classifier).getGetHighSpeedVideoFpsRanges().pathSegments(), sb6, (r14 & 2) != 0 ? ", " : ".", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$3
                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj) {
                        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.name.Name) obj);
                    }
                });
                getHighSpeedVideoFpsRanges(sb6, abstractKType2.getArguments(), abstractKType2.getIsMarkedNullable(), z);
            }
        } else {
            kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(((kotlin.reflect.KTypeParameter) classifier).getCamera2StreamConfigurationMap());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
            sb6.append(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render$default(identifier, false, 1, null));
            if (abstractKType2.getIsMarkedNullable()) {
                sb6.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
            } else if (abstractKType.getIsDefinitelyNotNullType()) {
                sb6.append(" & Any");
            }
        }
        if (abstractKType.getAbbreviation() != null) {
            sb6.append(" */");
        }
        return sb6.toString();
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb, kotlin.reflect.KClass<?> kClass, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z, boolean z2) {
        if (kClass.getTypeParameters().size() < list.size() && kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).getDeclaringClass() != null) {
            java.lang.Class<?> declaringClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaringClass, "");
            getHighSpeedVideoFpsRangesFor(sb, kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass), fqNameUnsafe.parent(), kotlin.collections.CollectionsKt.drop(list, kClass.getTypeParameters().size()), false, z2);
            sb.append(".");
            sb.append(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render$default(fqNameUnsafe.shortName(), false, 1, null));
        } else {
            sb.append(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render(fqNameUnsafe));
        }
        getHighSpeedVideoFpsRanges(sb, kotlin.collections.CollectionsKt.take(list, kClass.getTypeParameters().size()), z, z2);
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z, final boolean z2) {
        if (!list.isEmpty()) {
            kotlin.collections.CollectionsKt.joinTo(list, sb, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "<", (r14 & 8) != 0 ? "" : ">", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1(z2) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$4
                private final boolean getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.KTypeProjection) obj);
                }

                {
                    this.getHighSpeedVideoFpsRanges = z2;
                }
            });
        }
        if (z) {
            sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        }
    }

    static /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.KParameter kParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kParameter, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name2 = kParameter.getName();
        if (name2 == null) {
            name2 = "_";
        }
        sb.append(name2);
        sb.append(": ");
        sb.append(kParameter.getType());
        return sb.toString();
    }

    static /* synthetic */ java.lang.CharSequence getHighSpeedVideoSizes(kotlin.reflect.KParameter kParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kParameter, "");
        return renderType$default(INSTANCE, kParameter.getType(), false, 2, null);
    }

    static /* synthetic */ java.lang.CharSequence Camera2StreamConfigurationMap(kotlin.reflect.KParameter kParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kParameter, "");
        return renderType$default(INSTANCE, kParameter.getType(), false, 2, null);
    }

    static /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render$default(name2, false, 1, null);
    }

    static /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(boolean z, kotlin.reflect.KTypeProjection kTypeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kTypeProjection, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(z ? "(raw) " : "");
        sb.append(kTypeProjection);
        return sb.toString();
    }

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.asString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        java.lang.String obj = sb.toString();
        if (!kotlin.text.StringsKt.startsWith$default(str, obj, false, 2, (java.lang.Object) null)) {
            obj = null;
        }
        return obj == null ? "" : obj;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME.asString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        java.lang.String obj = sb.toString();
        if (!kotlin.text.StringsKt.startsWith$default(str, obj, false, 2, (java.lang.Object) null)) {
            obj = null;
        }
        return obj == null ? "" : obj;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.KParameter.Kind.values().length];
            try {
                iArr[kotlin.reflect.KParameter.Kind.INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.KParameter.Kind.CONTEXT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.KParameter.Kind.VALUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
