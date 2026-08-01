package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f11398a = new d();
    public static Function5<BoxScope, Boolean, Function0<Unit>, Composer, Integer, Unit> b = ComposableLambdaKt.composableLambdaInstance(-1970835476, false, a.f11399a);

    public static final class a implements Function5<BoxScope, Boolean, Function0<? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11399a = new a();

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d$a$a, reason: collision with other inner class name */
        public static final class C1597a implements Function3<Boolean, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f11400a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d$a$a$a, reason: collision with other inner class name */
            public static final class C1598a implements Function3<RowScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f11401a;

                public C1598a(boolean z) {
                    this.f11401a = z;
                }

                public final void a(RowScope TextButton, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-919554769, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (PlaybackControl.kt:73)");
                    }
                    TextKt.m1243TextfLXpl1I(this.f11401a ? "Pause" : "Play", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65534);
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

            public C1597a(Function0<Unit> function0) {
                this.f11400a = function0;
            }

            public final void a(boolean z, Composer composer, int i) {
                int i2;
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(z) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(170935244, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous> (PlaybackControl.kt:72)");
                }
                ButtonKt.TextButton(this.f11400a, null, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -919554769, true, new C1598a(z)), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
                a(bool.booleanValue(), composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public final void a(BoxScope boxScope, boolean z, Function0<Unit> onClick, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(onClick) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970835476, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous> (PlaybackControl.kt:66)");
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z), PaddingKt.m420padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m3840constructorimpl(4)), null, ComposableLambdaKt.composableLambda(composer, 170935244, true, new C1597a(onClick)), composer, ((i2 >> 3) & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, Function0<? extends Unit> function0, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), function0, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public final Function5<BoxScope, Boolean, Function0<Unit>, Composer, Integer, Unit> a() {
        return b;
    }
}
