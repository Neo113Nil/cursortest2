package com.paypal.oslo.core.remoteconfig.companion;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/companion/RemoteConfigSectionFactory;", "", "Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;", "featureGateRegistry", "Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;", "dynamicConfigRegistry", "Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;", "experimentRegistry", "Lcom/paypal/oslo/core/remoteconfig/companion/RemoteConfigSectionResolver;", "remoteConfigResolver", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;Lcom/paypal/oslo/core/remoteconfig/companion/RemoteConfigSectionResolver;)V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "create", "(Landroid/content/Context;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/registry/FeatureGateRegistry;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/registry/DynamicConfigRegistry;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/registry/ExperimentRegistry;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/companion/RemoteConfigSectionResolver;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoteConfigSectionFactory {
    public static final java.lang.String REMOTE_CONFIG_SECTION_ID = "remote_config";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public RemoteConfigSectionFactory(com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry, com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry, com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry, com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionResolver remoteConfigSectionResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experimentRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigSectionResolver, "");
        this.getHighSpeedVideoFpsRangesFor = featureGateRegistry;
        this.getHighSpeedVideoFpsRanges = dynamicConfigRegistry;
        this.getHighResolutionOutputSizeshNQ4ISI = experimentRegistry;
        this.getHighSpeedVideoSizes = remoteConfigSectionResolver;
    }

    public final com.paypal.oslo.core.companion.domain.ConfigSection create(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return com.paypal.oslo.core.companion.domain.CompanionAppDslKt.section(REMOTE_CONFIG_SECTION_ID, "Remote config", "Configure feature gates, dynamic configs, and experiments from Statsig", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory.$r8$lambda$u11wMqMQ0TuXII34dGlTdRrOmlE(com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory.this, context, (com.paypal.oslo.core.companion.domain.ConfigSectionBuilder) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$b8NO8Pe-c6xx6mxfKWMdy6MciUw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11679$r8$lambda$b8NO8Pec6xx6mxfKWMdy6MciUw(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry remoteConfigEntry, java.lang.String str, java.lang.Object obj, com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        java.lang.String obj2;
        java.lang.Object defaultValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
        configFieldBuilder.name(remoteConfigEntry.getDisplayName());
        java.lang.String description = remoteConfigEntry.getDescription();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(description);
        configFieldBuilder.description(sb.toString());
        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
        if (resolver == null || (defaultValue = resolver.defaultValue(remoteConfigEntry.getFullKey(), null)) == null || (obj2 = defaultValue.toString()) == null) {
            obj2 = obj.toString();
        }
        configFieldBuilder.value(obj2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u11wMqMQ0TuXII34dGlTdRrOmlE(com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory remoteConfigSectionFactory, android.content.Context context, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configSectionBuilder, "");
        configSectionBuilder.resolver(remoteConfigSectionFactory.getHighSpeedVideoSizes);
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context, com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint remoteConfigInitializerEntryPoint = (com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint) obj;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(remoteConfigInitializerEntryPoint.ioApplicationScope(), null, null, new com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1(remoteConfigInitializerEntryPoint, remoteConfigSectionFactory, configSectionBuilder, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$addFieldForEntry(com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory remoteConfigSectionFactory, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder, final com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry remoteConfigEntry) {
        final java.lang.String str;
        int i = com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory.WhenMappings.$EnumSwitchMapping$0[remoteConfigEntry.getType().ordinal()];
        if (i == 1) {
            str = "Experiment";
        } else if (i == 2) {
            str = "Dynamic Config";
        } else {
            str = "";
        }
        final java.lang.Object defaultValue = remoteConfigEntry.getDefaultValue();
        if (!(defaultValue instanceof java.lang.String)) {
            if (!(defaultValue instanceof java.lang.Boolean)) {
                if (!(defaultValue instanceof java.lang.Integer)) {
                    if (defaultValue instanceof java.lang.Double) {
                        final java.lang.Double valueOf = java.lang.Double.valueOf(((java.lang.Number) defaultValue).doubleValue());
                        configSectionBuilder.doubleField(remoteConfigEntry.getFullKey(), valueOf.doubleValue(), new kotlin.jvm.functions.Function1<com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Double>, kotlin.Unit>() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$addDoubleField$$inlined$addTypedField$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Double> configFieldBuilder) {
                                invoke2(configFieldBuilder);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Double> configFieldBuilder) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
                                configFieldBuilder.name(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDisplayName());
                                java.lang.String str2 = str;
                                java.lang.String description = com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDescription();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str2);
                                sb.append(description);
                                configFieldBuilder.description(sb.toString());
                                com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
                                java.lang.Object defaultValue2 = resolver != null ? resolver.defaultValue(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getFullKey(), null) : null;
                                java.lang.Object obj = (java.lang.Double) (defaultValue2 instanceof java.lang.Double ? defaultValue2 : null);
                                if (obj == null) {
                                    obj = valueOf;
                                }
                                configFieldBuilder.value(obj);
                            }
                        });
                        return;
                    }
                    configSectionBuilder.stringField(remoteConfigEntry.getFullKey(), defaultValue.toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory.m11679$r8$lambda$b8NO8Pec6xx6mxfKWMdy6MciUw(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this, str, defaultValue, (com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj);
                        }
                    });
                    return;
                }
                final java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((java.lang.Number) defaultValue).intValue());
                configSectionBuilder.intField(remoteConfigEntry.getFullKey(), valueOf2.intValue(), new kotlin.jvm.functions.Function1<com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Integer>, kotlin.Unit>() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$addIntField$$inlined$addTypedField$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Integer> configFieldBuilder) {
                        invoke2(configFieldBuilder);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Integer> configFieldBuilder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
                        configFieldBuilder.name(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDisplayName());
                        java.lang.String str2 = str;
                        java.lang.String description = com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDescription();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str2);
                        sb.append(description);
                        configFieldBuilder.description(sb.toString());
                        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
                        java.lang.Object defaultValue2 = resolver != null ? resolver.defaultValue(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getFullKey(), null) : null;
                        java.lang.Object obj = (java.lang.Integer) (defaultValue2 instanceof java.lang.Integer ? defaultValue2 : null);
                        if (obj == null) {
                            obj = valueOf2;
                        }
                        configFieldBuilder.value(obj);
                    }
                });
                return;
            }
            final java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(((java.lang.Boolean) defaultValue).booleanValue());
            configSectionBuilder.booleanField(remoteConfigEntry.getFullKey(), valueOf3.booleanValue(), new kotlin.jvm.functions.Function1<com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Boolean>, kotlin.Unit>() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$addBooleanField$$inlined$addTypedField$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Boolean> configFieldBuilder) {
                    invoke2(configFieldBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.Boolean> configFieldBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
                    configFieldBuilder.name(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDisplayName());
                    java.lang.String str2 = str;
                    java.lang.String description = com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDescription();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(description);
                    configFieldBuilder.description(sb.toString());
                    com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
                    java.lang.Object defaultValue2 = resolver != null ? resolver.defaultValue(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getFullKey(), null) : null;
                    java.lang.Object obj = (java.lang.Boolean) (defaultValue2 instanceof java.lang.Boolean ? defaultValue2 : null);
                    if (obj == null) {
                        obj = valueOf3;
                    }
                    configFieldBuilder.value(obj);
                }
            });
            return;
        }
        final java.lang.String str2 = (java.lang.String) defaultValue;
        configSectionBuilder.stringField(remoteConfigEntry.getFullKey(), str2, new kotlin.jvm.functions.Function1<com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.String>, kotlin.Unit>() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$addStringField$$inlined$addTypedField$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.String> configFieldBuilder) {
                invoke2(configFieldBuilder);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.paypal.oslo.core.companion.domain.ConfigFieldBuilder<java.lang.String> configFieldBuilder) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFieldBuilder, "");
                configFieldBuilder.name(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDisplayName());
                java.lang.String str3 = str;
                java.lang.String description = com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getDescription();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str3);
                sb.append(description);
                configFieldBuilder.description(sb.toString());
                com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
                java.lang.Object defaultValue2 = resolver != null ? resolver.defaultValue(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this.getFullKey(), null) : null;
                java.lang.Object obj = (java.lang.String) (defaultValue2 instanceof java.lang.String ? defaultValue2 : null);
                if (obj == null) {
                    obj = str2;
                }
                configFieldBuilder.value(obj);
            }
        });
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.remoteconfig.registry.ConfigType.values().length];
            try {
                iArr[com.paypal.oslo.core.remoteconfig.registry.ConfigType.EXPERIMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.remoteconfig.registry.ConfigType.DYNAMIC_CONFIG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
