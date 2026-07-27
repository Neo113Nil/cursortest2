package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4817d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class z {
    public static final Unit a(j.a aVar, Modifier modifier, int i, int i2, Composer composer, int i3) {
        a(aVar, modifier, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit b(j.a aVar, Modifier modifier, int i, int i2, Composer composer, int i3) {
        a(aVar, modifier, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final void a(final j.a htmlResource, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(htmlResource, "htmlResource");
        Composer startRestartGroup = composer.startRestartGroup(-1230364815);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(htmlResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1230364815, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastResourceHtml (VastResourceHtml.kt:14)");
            }
            startRestartGroup.startReplaceableGroup(-1944708127);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                U u = U.f10944a;
                Object obj = U.b.get(Integer.valueOf(htmlResource.b()));
                if (!(obj instanceof C4817d)) {
                    obj = null;
                }
                rememberedValue = (C4817d) obj;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            C4817d c4817d = (C4817d) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            if (c4817d == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.z$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return z.a(j.a.this, modifier, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(c4817d, modifier, null, startRestartGroup, (i3 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.z$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return z.b(j.a.this, modifier, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final View a(Context context, j.a htmlResource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(htmlResource, "htmlResource");
        U u = U.f10944a;
        Object obj = U.b.get(Integer.valueOf(htmlResource.b()));
        if (!(obj instanceof C4817d)) {
            obj = null;
        }
        C4817d c4817d = (C4817d) obj;
        if (c4817d == null) {
            return null;
        }
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(context, c4817d, null);
    }
}
