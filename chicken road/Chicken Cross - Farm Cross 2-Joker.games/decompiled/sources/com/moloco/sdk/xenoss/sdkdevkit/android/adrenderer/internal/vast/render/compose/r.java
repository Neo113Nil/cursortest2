package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11441a = Dp.m3840constructorimpl(4);

    public static final class a implements Function3<RowScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11442a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public a(String str, String str2, long j) {
            this.f11442a = str;
            this.b = str2;
            this.c = j;
        }

        public final void a(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1553541117, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTA.<anonymous> (VastCTA.kt:56)");
            }
            String str = this.f11442a;
            composer.startReplaceableGroup(-1632146269);
            if (str != null) {
                String str2 = this.f11442a;
                ContentScale fit = ContentScale.INSTANCE.getFit();
                Modifier.Companion companion = Modifier.INSTANCE;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(str2, fit, SizeKt.m461size3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(r.f11441a)), Dp.m3840constructorimpl(36)), composer, 48);
                SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion, r.f11441a), composer, 6);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceableGroup();
            TextKt.m1243TextfLXpl1I(this.b, null, this.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, composer, 0, 3072, 57338);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            a(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    public static final Unit a(Modifier modifier, String str, String str2, long j, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, j, function0, composer, i | 1, i2);
        return Unit.INSTANCE;
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
    public static final void a(Modifier modifier, String str, final String text, long j, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        long j2;
        Modifier modifier3;
        Modifier modifier4;
        Composer composer2;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1735772917);
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
                i3 |= startRestartGroup.changed(onClick) ? 16384 : 8192;
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
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i6 != 0) {
                        str2 = null;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m976getPrimary0d7_KjU();
                        i3 &= -7169;
                    }
                    modifier3 = modifier5;
                }
                String str3 = str2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1735772917, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTA (VastCTA.kt:47)");
                }
                long j4 = j2;
                modifier4 = modifier3;
                composer2 = startRestartGroup;
                ButtonKt.OutlinedButton(onClick, AnimationModifierKt.animateContentSize$default(SizeKt.m468widthInVpY3zN4$default(SizeKt.m447height3ABfNKs(modifier3, Dp.m3840constructorimpl(48)), 0.0f, Dp.m3840constructorimpl(156), 1, null), null, null, 3, null), false, null, null, null, null, null, PaddingKt.m415PaddingValuesYgX7TsA$default(f11441a, 0.0f, 2, null), ComposableLambdaKt.composableLambda(startRestartGroup, 1553541117, true, new a(str3, text, j2)), startRestartGroup, ((i3 >> 12) & 14) | 905969664, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = str3;
                j3 = j4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier6 = modifier4;
                final String str4 = str2;
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.a(Modifier.this, str4, text, j3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        String str32 = str2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        long j42 = j2;
        modifier4 = modifier3;
        composer2 = startRestartGroup;
        ButtonKt.OutlinedButton(onClick, AnimationModifierKt.animateContentSize$default(SizeKt.m468widthInVpY3zN4$default(SizeKt.m447height3ABfNKs(modifier3, Dp.m3840constructorimpl(48)), 0.0f, Dp.m3840constructorimpl(156), 1, null), null, null, 3, null), false, null, null, null, null, null, PaddingKt.m415PaddingValuesYgX7TsA$default(f11441a, 0.0f, 2, null), ComposableLambdaKt.composableLambda(startRestartGroup, 1553541117, true, new a(str32, text, j2)), startRestartGroup, ((i3 >> 12) & 14) | 905969664, 252);
        if (ComposerKt.isTraceInProgress()) {
        }
        str2 = str32;
        j3 = j42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-838285503);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-838285503, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastCTAPreview (VastCTA.kt:76)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, e.f11402a.a(), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
