package com.paypal.oslo.feature.oneonboarding.inventory.views.name.di;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J³\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0004\u0012\u00020\u00030\u00072\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00072(\b\u0002\u0010\u0016\u001a\"\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00190\f\u0012\u0004\u0012\u00020\u00030\u0007H'¢\u0006\u0002\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;", "", "Attach", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;", "onNameChange", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameCollectedItem;", "nationality", "", "contextualInfoMap", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "modifier", "Landroidx/compose/ui/Modifier;", "onRegisterValidateTrigger", "Lkotlin/Function0;", "onValidationComplete", "", "onFieldErrors", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/FieldError;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/Map;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface NameViewComponentAttacher {
    void Attach(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> function1, java.lang.String str, java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit> function14, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:101:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00c5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void Attach$default(final com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> function1, final java.lang.String str, final java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit> function14, final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            int i4;
            int i5;
            final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function15;
            int i6;
            androidx.compose.runtime.Composer composer2;
            final androidx.compose.ui.Modifier modifier2;
            final kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function16;
            final kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit> function17;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function18;
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function19;
            kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit> function110;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameViewComponentConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameViewComponentAttacher, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1935001671);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(nameViewComponentConfig) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(str) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(map) ? 2048 : 1024;
            }
            int i7 = i2 & 16;
            if (i7 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
                i4 = i2 & 32;
                if (i4 == 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    i5 = i2 & 64;
                    if (i5 != 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function15 = function13;
                        i3 |= startRestartGroup.changedInstance(function15) ? 1048576 : 524288;
                        i6 = i2 & 128;
                        if (i6 == 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            i3 |= (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? startRestartGroup.changed(nameViewComponentAttacher) : startRestartGroup.changedInstance(nameViewComponentAttacher) ? 67108864 : 33554432;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            function16 = function12;
                            function17 = function14;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher$ComposeDefaultImpls$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher.ComposeDefaultImpls.$r8$lambda$KminGw2BCZlXFqSI5rqzulXZcoI((kotlin.jvm.functions.Function0) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function18 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function18 = function12;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher$ComposeDefaultImpls$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            kotlin.Unit unit;
                                            ((java.lang.Boolean) obj).booleanValue();
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function19 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            } else {
                                function19 = function15;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher$ComposeDefaultImpls$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher.ComposeDefaultImpls.$r8$lambda$GThHnj6EYlCaa5vgCPSlYLqKask((java.util.Map) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function110 = (kotlin.jvm.functions.Function1) rememberedValue3;
                            } else {
                                function110 = function14;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1935001671, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher.ComposeDefaultImpls.Attach$default (NameViewComponentAttacher.kt:-1)");
                            }
                            composer2 = startRestartGroup;
                            nameViewComponentAttacher.Attach(nameViewComponentConfig, function1, str, map, modifier3, function18, function19, function110, startRestartGroup, i3 & 268435454);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            function16 = function18;
                            function15 = function19;
                            function17 = function110;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher$ComposeDefaultImpls$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher.ComposeDefaultImpls.$r8$lambda$JwrbOYV3OgBcxMiRQA0ULBhU9WI(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig.this, function1, str, map, modifier2, function16, function15, function17, nameViewComponentAttacher, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function15 = function13;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                }
                function15 = function13;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function15 = function13;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$GThHnj6EYlCaa5vgCPSlYLqKask(java.util.Map map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$JwrbOYV3OgBcxMiRQA0ULBhU9WI(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.util.Map map, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            Attach$default(nameViewComponentConfig, function1, str, map, modifier, function12, function13, function14, nameViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$KminGw2BCZlXFqSI5rqzulXZcoI(kotlin.jvm.functions.Function0 function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            return kotlin.Unit.INSTANCE;
        }
    }
}
