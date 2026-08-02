package io.sentry.android.replay;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import t6.h;

/* loaded from: classes2.dex */
public final class ModifierExtensionsKt {
    public static final Modifier sentryReplayMask(Modifier modifier) {
        h.e(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, ModifierExtensionsKt$sentryReplayMask$1.INSTANCE, 1, (Object) null);
    }

    public static final Modifier sentryReplayUnmask(Modifier modifier) {
        h.e(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, ModifierExtensionsKt$sentryReplayUnmask$1.INSTANCE, 1, (Object) null);
    }
}
