package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u008a\u008e\u0002"}, d2 = {"PullToRefresh", "", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PullToRefreshPreview", "(Landroidx/compose/runtime/Composer;I)V", "pds_release", "refreshing", "items", "", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PullToRefreshKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PullToRefresh(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1938599909);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1938599909, i3, -1, "com.paypal.pds.components.PullToRefresh (PullToRefresh.kt:52)");
                }
                final androidx.compose.material3.pulltorefresh.PullToRefreshState rememberPullToRefreshState = androidx.compose.material3.pulltorefresh.PullToRefreshKt.rememberPullToRefreshState(startRestartGroup, 0);
                androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox(z, function0, modifier3, rememberPullToRefreshState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-578522306, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.pds.components.PullToRefreshKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.pds.components.PullToRefreshKt.$r8$lambda$HI3fCJAHZnfACcFzRG2deliEqTM(androidx.compose.material3.pulltorefresh.PullToRefreshState.this, z, (androidx.compose.foundation.layout.BoxScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(369967423, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.pds.components.PullToRefreshKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.pds.components.PullToRefreshKt.$r8$lambda$RlPE43TK26nRDM1p6oFTzhr33iU(kotlin.jvm.functions.Function2.this, (androidx.compose.foundation.layout.BoxScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 1769472 | (i3 & 112) | (i3 & 896), 16);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PullToRefreshKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.pds.components.PullToRefreshKt.$r8$lambda$v4O8hcpB05Ww2d5woHkpfkcudV4(z, function0, modifier2, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4Nnu9PWQk6pdQKnoZHw5VrAUo7o(androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-921120622, i3, -1, "com.paypal.pds.components.PullToRefreshPreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PullToRefresh.kt:95)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4((java.lang.String) ((java.util.List) mutableState.getValue()).get(i), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), null, null, null, null, false, 0, 0, null, null, composer, 48, 0, 2044);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HI3fCJAHZnfACcFzRG2deliEqTM(androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, boolean z, androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-578522306, i2, -1, "com.paypal.pds.components.PullToRefresh.<anonymous> (PullToRefresh.kt:60)");
            }
            androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.INSTANCE.m4392Indicator2poqoh4(pullToRefreshState, z, boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), com.paypal.pds.core.Color.BackgroundElevatedPopover.INSTANCE.getValue(composer, 6), com.paypal.pds.core.Color.BorderRoleEmphasisNeutral.INSTANCE.getValue(composer, 6), 0.0f, composer, androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.$stable << 18, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RlPE43TK26nRDM1p6oFTzhr33iU(kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(369967423, i, -1, "com.paypal.pds.components.PullToRefresh.<anonymous> (PullToRefresh.kt:69)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XmR7ZNsg7R_6nDDodsLDE1mhy9s(final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1966464652, i, -1, "com.paypal.pds.components.PullToRefreshPreview.<anonymous> (PullToRefresh.kt:93)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PullToRefreshKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.PullToRefreshKt.m21986$r8$lambda$vrWKG7j_9rxOINh9BoNi4nnlI(androidx.compose.runtime.MutableState.this, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 805306374, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v4O8hcpB05Ww2d5woHkpfkcudV4(boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PullToRefresh(z, function0, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vr-WKG7j_9rxOINh-9BoNi4nnlI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21986$r8$lambda$vrWKG7j_9rxOINh9BoNi4nnlI(final androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, ((java.util.List) mutableState.getValue()).size(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-921120622, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.pds.components.PullToRefreshKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.pds.components.PullToRefreshKt.$r8$lambda$4Nnu9PWQk6pdQKnoZHw5VrAUo7o(androidx.compose.runtime.MutableState.this, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 6, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$zQ3g-LLkxPsMaaMfvPsdBp3mGvo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21987$r8$lambda$zQ3gLLkxPsMaaMfvPsdBp3mGvo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-900983135);
        int i3 = 0;
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-900983135, updateChangedFlags, -1, "com.paypal.pds.components.PullToRefreshPreview (PullToRefresh.kt:76)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(20);
                while (i3 < 20) {
                    i3++;
                    arrayList.add("Item ".concat(java.lang.String.valueOf(i3)));
                }
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(arrayList, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue3;
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function0) new com.paypal.pds.components.PullToRefreshKt$PullToRefreshPreview$1$1(coroutineScope, mutableState, mutableState2);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            PullToRefresh(booleanValue, (kotlin.jvm.functions.Function0) rememberedValue4, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1966464652, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PullToRefreshKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.PullToRefreshKt.$r8$lambda$XmR7ZNsg7R_6nDDodsLDE1mhy9s(androidx.compose.runtime.MutableState.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3456, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PullToRefreshKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.PullToRefreshKt.m21987$r8$lambda$zQ3gLLkxPsMaaMfvPsdBp3mGvo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.List access$PullToRefreshPreview$lambda$4(androidx.compose.runtime.MutableState mutableState) {
        return (java.util.List) mutableState.getValue();
    }

    public static final /* synthetic */ kotlinx.coroutines.Job access$PullToRefreshPreview$refresh(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.pds.components.PullToRefreshKt$PullToRefreshPreview$refresh$1(mutableState, mutableState2, null), 3, null);
        return launch$default;
    }
}
