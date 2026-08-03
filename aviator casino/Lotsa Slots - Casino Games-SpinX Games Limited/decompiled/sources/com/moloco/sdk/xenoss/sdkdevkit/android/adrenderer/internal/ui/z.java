package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class z {
    public static final kotlin.Unit a(androidx.compose.ui.Modifier modifier, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a enumC0327a, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(modifier, enumC0327a, function1, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(androidx.compose.ui.Modifier modifier, final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType, final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> onButtonRendered, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1040306081);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(buttonType) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onButtonRendered) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1040306081, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableButton (TrackableButton.kt:22)");
            }
            startRestartGroup.startReplaceableGroup(-334659178);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            androidx.compose.runtime.Composer.Companion companion = androidx.compose.runtime.Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(buttonType), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c a2 = a(mutableState);
            startRestartGroup.startReplaceableGroup(-334654626);
            boolean z = (i3 & 896) == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(kotlin.jvm.functions.Function1.this, mutableState, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            content.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a.a(modifier, a2, (kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>) rememberedValue2), startRestartGroup, java.lang.Integer.valueOf((i3 >> 6) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(androidx.compose.ui.Modifier.this, buttonType, onButtonRendered, content, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.Unit a(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        a(mutableState, it);
        function1.invoke(it);
        return kotlin.Unit.INSTANCE;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c a(androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> mutableState) {
        return mutableState.getValue();
    }

    public static final void a(androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar) {
        mutableState.setValue(cVar);
    }
}
