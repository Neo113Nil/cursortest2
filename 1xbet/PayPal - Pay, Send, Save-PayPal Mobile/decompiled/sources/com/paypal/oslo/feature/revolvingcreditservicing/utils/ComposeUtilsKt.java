package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"CollectOnLifecycle", "", "T", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lkotlinx/coroutines/flow/Flow;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "onEach", "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposeUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void CollectOnLifecycle(final kotlinx.coroutines.flow.Flow<? extends T> flow, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.view.LifecycleOwner lifecycleOwner2;
        final androidx.lifecycle.Lifecycle.State state2;
        androidx.view.LifecycleOwner lifecycleOwner3;
        androidx.lifecycle.Lifecycle.State state3;
        boolean changedInstance;
        boolean z;
        boolean changedInstance2;
        boolean z2;
        com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt$CollectOnLifecycle$1$1 rememberedValue;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1781375922);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lifecycleOwner2 = lifecycleOwner;
                if (startRestartGroup.changedInstance(lifecycleOwner2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                lifecycleOwner2 = lifecycleOwner;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            lifecycleOwner2 = lifecycleOwner;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(state == null ? -1 : state.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    lifecycleOwner2 = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    i3 &= -113;
                }
                if (i5 != 0) {
                    lifecycleOwner3 = lifecycleOwner2;
                    state3 = androidx.lifecycle.Lifecycle.State.STARTED;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1781375922, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.utils.CollectOnLifecycle (ComposeUtils.kt:27)");
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(lifecycleOwner3);
                    z = (i3 & 896) != 256;
                    changedInstance2 = startRestartGroup.changedInstance(flow);
                    z2 = (i3 & 7168) == 2048;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | z | changedInstance2 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt$CollectOnLifecycle$1$1(lifecycleOwner3, state3, flow, function1, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    lifecycleOwner2 = lifecycleOwner3;
                    state2 = state3;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            state3 = state;
            lifecycleOwner3 = lifecycleOwner2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(lifecycleOwner3);
            if ((i3 & 896) != 256) {
            }
            changedInstance2 = startRestartGroup.changedInstance(flow);
            if ((i3 & 7168) == 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z | changedInstance2 | z2)) {
            }
            rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt$CollectOnLifecycle$1$1(lifecycleOwner3, state3, flow, function1, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            lifecycleOwner2 = lifecycleOwner3;
            state2 = state3;
        } else {
            startRestartGroup.skipToGroupEnd();
            state2 = state;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.utils.ComposeUtilsKt.$r8$lambda$GCgyOKGtDb4nizrDa7cOxOiWGs4(kotlinx.coroutines.flow.Flow.this, lifecycleOwner2, state2, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GCgyOKGtDb4nizrDa7cOxOiWGs4(kotlinx.coroutines.flow.Flow flow, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CollectOnLifecycle(flow, lifecycleOwner, state, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
