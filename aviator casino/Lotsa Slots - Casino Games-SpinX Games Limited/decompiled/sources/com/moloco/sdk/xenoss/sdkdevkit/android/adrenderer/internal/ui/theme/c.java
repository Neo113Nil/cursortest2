package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.material.Colors f7661a;
    public static final androidx.compose.material.Colors b;

    static {
        androidx.compose.material.Colors m1336lightColors2qZNXz8;
        long f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.a.f();
        long f2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.a.f();
        androidx.compose.ui.graphics.Color.Companion companion = androidx.compose.ui.graphics.Color.INSTANCE;
        f7661a = androidx.compose.material.ColorsKt.m1335darkColors2qZNXz8$default(f, f2, companion.m2150getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4088, null);
        m1336lightColors2qZNXz8 = androidx.compose.material.ColorsKt.m1336lightColors2qZNXz8((r43 & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4284612846L) : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.a.f(), (r43 & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4281794739L) : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.a.f(), (r43 & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278442694L) : companion.m2150getWhite0d7_KjU(), (r43 & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278290310L) : 0L, (r43 & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L, (r43 & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L, (r43 & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4289724448L) : 0L, (r43 & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L, (r43 & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : 0L, (r43 & 512) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : 0L, (r43 & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : 0L, (r43 & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L);
        b = m1336lightColors2qZNXz8;
    }

    public static final kotlin.Unit a(boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if ((r12 & 1) != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(156854067);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
                    i3 &= -15;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(156854067, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.Theme (Theme.kt:31)");
                }
                androidx.compose.material.MaterialThemeKt.MaterialTheme(z ? f7661a : b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a(), content, startRestartGroup, ((i3 << 6) & 7168) | 432, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c.a(z, content, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
