package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "enabled", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "PDSHighlightHost", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "pdsComponent", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PDSHighlightHostKt {
    public static final void PDSHighlightHost(final boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-761206839);
        if ((i & 48) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-761206839, i2, -1, "com.paypal.pds.core.PDSHighlightHost (PDSHighlightHost.kt:30)");
            }
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 3) & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.core.PDSHighlightHostKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.core.PDSHighlightHostKt.m22105$r8$lambda$aeBQthebVKAy8h8PI34aOUnoNg(z, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$aeBQthe-bVKAy8h8PI34aOUnoNg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22105$r8$lambda$aeBQthebVKAy8h8PI34aOUnoNg(boolean z, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        PDSHighlightHost(z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.compose.ui.Modifier pdsComponent(androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return modifier;
    }
}
