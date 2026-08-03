package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7858a = androidx.compose.ui.unit.Dp.m4478constructorimpl(4);

    public static final class a implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f7859a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ long c;

        public a(java.lang.String str, java.lang.String str2, long j) {
            this.f7859a = str;
            this.b = str2;
            this.c = j;
        }

        public final void a(androidx.compose.foundation.layout.RowScope OutlinedButton, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1553541117, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTA.<anonymous> (VastCTA.kt:39)");
            }
            java.lang.String str = this.f7859a;
            composer.startReplaceableGroup(-1632168765);
            if (str != null) {
                java.lang.String str2 = this.f7859a;
                androidx.compose.ui.layout.ContentScale fit = androidx.compose.ui.layout.ContentScale.INSTANCE.getFit();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(str2, fit, androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.ui.draw.ClipKt.clip(companion, androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.f7858a)), androidx.compose.ui.unit.Dp.m4478constructorimpl(36)), composer, 48);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.f7858a), composer, 6);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            composer.endReplaceableGroup();
            androidx.compose.material.TextKt.m1582TextfLXpl1I(this.b, null, this.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, composer, 0, 3072, 57338);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(rowScope, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.Unit a(int i, androidx.compose.runtime.Composer composer, int i2) {
        a(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, long j, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(modifier, str, str2, j, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.Modifier modifier, java.lang.String str, final java.lang.String text, long j, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.String str2;
        long j2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.runtime.Composer composer2;
        final long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1735772917);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(text) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(onClick) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                j3 = j2;
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier5 = i5 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i6 != 0) {
                        str2 = null;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).m1315getPrimary0d7_KjU();
                        i3 &= -7169;
                    }
                    modifier3 = modifier5;
                }
                java.lang.String str3 = str2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1735772917, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTA (VastCTA.kt:30)");
                }
                long j4 = j2;
                modifier4 = modifier3;
                composer2 = startRestartGroup;
                androidx.compose.material.ButtonKt.OutlinedButton(onClick, androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.foundation.layout.SizeKt.m624widthInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(modifier3, androidx.compose.ui.unit.Dp.m4478constructorimpl(48)), 0.0f, androidx.compose.ui.unit.Dp.m4478constructorimpl(156), 1, null), null, null, 3, null), false, null, null, null, null, null, androidx.compose.foundation.layout.PaddingKt.m563PaddingValuesYgX7TsA$default(f7858a, 0.0f, 2, null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1553541117, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.a(str3, text, j2)), startRestartGroup, ((i3 >> 12) & 14) | 905969664, 252);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                str2 = str3;
                j3 = j4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier4;
                final java.lang.String str4 = str2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.a(androidx.compose.ui.Modifier.this, str4, text, j3, onClick, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str2 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        modifier3 = modifier5;
        java.lang.String str32 = str2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        long j42 = j2;
        modifier4 = modifier3;
        composer2 = startRestartGroup;
        androidx.compose.material.ButtonKt.OutlinedButton(onClick, androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.foundation.layout.SizeKt.m624widthInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(modifier3, androidx.compose.ui.unit.Dp.m4478constructorimpl(48)), 0.0f, androidx.compose.ui.unit.Dp.m4478constructorimpl(156), 1, null), null, null, 3, null), false, null, null, null, null, null, androidx.compose.foundation.layout.PaddingKt.m563PaddingValuesYgX7TsA$default(f7858a, 0.0f, 2, null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1553541117, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.a(str32, text, j2)), startRestartGroup, ((i3 >> 12) & 14) | 905969664, 252);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        str2 = str32;
        j3 = j42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-838285503);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-838285503, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTAPreview (VastCTA.kt:59)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c.a(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d.f7843a.a(), startRestartGroup, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.a(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
