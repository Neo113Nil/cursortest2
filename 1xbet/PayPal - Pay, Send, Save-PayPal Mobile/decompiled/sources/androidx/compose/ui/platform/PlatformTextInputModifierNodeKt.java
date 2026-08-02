package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u0004*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001aG\u0010\u0016\u001a\u00020\u0004*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\"\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "establishTextInputSession", "(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "interceptor", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "InterceptPlatformTextInput", "(Landroidx/compose/ui/platform/PlatformTextInputInterceptor;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "p0", "p1", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformTextInputModifierNodeKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor> Camera2StreamConfigurationMap = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor invoke() {
            return null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode platformTextInputModifierNode, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) continuation;
            if ((platformTextInputModifierNodeKt$establishTextInputSession$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = platformTextInputModifierNodeKt$establishTextInputSession$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!platformTextInputModifierNode.getNode().getIsAttached()) {
                        throw new java.lang.IllegalArgumentException("establishTextInputSession called from an unattached node".toString());
                    }
                    androidx.compose.ui.platform.PlatformTextInputModifierNode platformTextInputModifierNode2 = platformTextInputModifierNode;
                    androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(platformTextInputModifierNode2);
                    androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(platformTextInputModifierNode2).getCompositionLocalMap().get(Camera2StreamConfigurationMap);
                    platformTextInputModifierNodeKt$establishTextInputSession$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (Camera2StreamConfigurationMap(requireOwner, chainedPlatformTextInputInterceptor, function2, platformTextInputModifierNodeKt$establishTextInputSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        platformTextInputModifierNodeKt$establishTextInputSession$1 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuation);
        java.lang.Object obj2 = platformTextInputModifierNodeKt$establishTextInputSession$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = platformTextInputModifierNodeKt$establishTextInputSession$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public static final void InterceptPlatformTextInput(final androidx.compose.ui.platform.PlatformTextInputInterceptor platformTextInputInterceptor, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1892278287);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(platformTextInputInterceptor) : startRestartGroup.changedInstance(platformTextInputInterceptor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1892278287, i2, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:155)");
            }
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor> providableCompositionLocal = Camera2StreamConfigurationMap;
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) startRestartGroup.consume(providableCompositionLocal);
            boolean changed = startRestartGroup.changed(chainedPlatformTextInputInterceptor);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor(platformTextInputInterceptor, chainedPlatformTextInputInterceptor);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor2 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) rememberedValue;
            chainedPlatformTextInputInterceptor2.getHighSpeedVideoSizes(platformTextInputInterceptor);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(chainedPlatformTextInputInterceptor2), function2, startRestartGroup, (i2 & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.InterceptPlatformTextInput(androidx.compose.ui.platform.PlatformTextInputInterceptor.this, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r5.textInputSession(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r6.Camera2StreamConfigurationMap(r5, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.ui.node.Owner owner, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 platformTextInputModifierNodeKt$interceptedTextInputSession$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) continuation;
            if ((platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (chainedPlatformTextInputInterceptor == null) {
                        platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighSpeedVideoFpsRangesFor = 1;
                    } else {
                        platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighSpeedVideoFpsRangesFor = 2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuation);
        java.lang.Object obj2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }
}
