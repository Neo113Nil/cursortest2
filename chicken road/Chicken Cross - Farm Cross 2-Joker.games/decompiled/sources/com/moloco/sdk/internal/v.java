package com.moloco.sdk.internal;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.ContextCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10855a = ColorKt.Color(4278354171L);

    public static final class a implements Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, ? extends Unit>, Function0<? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Alignment f10856a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        /* renamed from: com.moloco.sdk.internal.v$a$a, reason: collision with other inner class name */
        public static final class C1505a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function1<a.AbstractC1622a.c, Unit> f10857a;
            public final /* synthetic */ State<i.a> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ long e;
            public final /* synthetic */ long f;
            public final /* synthetic */ Function0<Unit> g;

            /* renamed from: com.moloco.sdk.internal.v$a$a$a, reason: collision with other inner class name */
            public static final class C1506a implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10858a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Function0<Unit> e;

                public C1506a(String str, String str2, long j, long j2, Function0<Unit> function0) {
                    this.f10858a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(it) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1938502477, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:103)");
                    }
                    v.a(it, this.f10858a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.moloco.sdk.internal.v$a$a$b */
            public static final class b implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10859a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Function0<Unit> e;

                public b(String str, String str2, long j, long j2, Function0<Unit> function0) {
                    this.f10859a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(it) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-868048676, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:118)");
                    }
                    v.a(it, this.f10859a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1505a(Function1<? super a.AbstractC1622a.c, Unit> function1, State<? extends i.a> state, String str, String str2, long j, long j2, Function0<Unit> function0) {
                this.f10857a = function1;
                this.b = state;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = j2;
                this.g = function0;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-657845797, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous> (MolocoVastCTA.kt:97)");
                }
                i.a b2 = a.b(this.b);
                if (b2 instanceof i.a.C1590a) {
                    composer.startReplaceableGroup(-387247913);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1622a.c.EnumC1624a.g, this.f10857a, ComposableLambdaKt.composableLambda(composer, -1938502477, true, new C1506a(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.c) {
                    composer.startReplaceableGroup(-386686441);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1622a.c.EnumC1624a.g, this.f10857a, ComposableLambdaKt.composableLambda(composer, -868048676, true, new b(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.b) {
                    composer.startReplaceableGroup(-386143662);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.d) {
                    composer.startReplaceableGroup(-386086126);
                    composer.endReplaceableGroup();
                } else {
                    if (b2 != null) {
                        composer.startReplaceableGroup(-843777307);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-386051437);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public a(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j, long j2) {
            this.f10856a = alignment;
            this.b = paddingValues;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = j2;
        }

        public static final i.a b(State<? extends i.a> state) {
            return state.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, StateFlow<? extends i.a> stateFlow, Function1<? super a.AbstractC1622a.c, ? extends Unit> function1, Function0<? extends Unit> function0, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), stateFlow, function1, function0, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void a(BoxScope boxScope, boolean z, StateFlow<? extends i.a> currentAdPartFlow, Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, Function0<Unit> onCTA, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            Intrinsics.checkNotNullParameter(onCTA, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-927135997, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous> (MolocoVastCTA.kt:79)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f10856a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -657845797, true, new C1505a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i >> 6) & 14, 1), this.c, this.d, this.e, this.f, onCTA)), composer, ((i >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final Unit a(Modifier modifier, String str, String str2, long j, long j2, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, j, j2, (Function0<Unit>) function0, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, String str, long j, long j2, String str2, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(959702933);
        Alignment bottomEnd = (i2 & 1) != 0 ? Alignment.INSTANCE.getBottomEnd() : alignment;
        PaddingValues m413PaddingValues0680j_4 = (i2 & 2) != 0 ? PaddingKt.m413PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        String stringResource = (i2 & 4) != 0 ? StringResources_androidKt.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        long m1665getWhite0d7_KjU = (i2 & 8) != 0 ? Color.INSTANCE.m1665getWhite0d7_KjU() : j;
        long j3 = (i2 & 16) != 0 ? f10855a : j2;
        String str3 = (i2 & 32) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959702933, i, -1, "com.moloco.sdk.internal.molocoCTAButton (MolocoVastCTA.kt:78)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -927135997, true, new a(bottomEnd, m413PaddingValues0680j_4, str3, stringResource, m1665getWhite0d7_KjU, j3));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Modifier modifier, String str, final String str2, final long j, final long j2, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2035340272);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(function0) ? 131072 : 65536;
                    }
                    if ((74899 & i3) != 74898 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                    } else {
                        Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            str3 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2035340272, i3, -1, "com.moloco.sdk.internal.MolocoVastCTA (MolocoVastCTA.kt:144)");
                        }
                        float f = 4;
                        RoundedCornerShape m670RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(f));
                        Modifier m192clickableXHw0xAI$default = ClickableKt.m192clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m468widthInVpY3zN4$default(modifier3, 0.0f, Dp.m3840constructorimpl(164), 1, null), m670RoundedCornerShape0680j_4), j2, null, 2, null), null, null, 3, null), false, NativeAdContent.ViewTag.CTA, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), function0, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Modifier modifier4 = modifier3;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m192clickableXHw0xAI$default);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        startRestartGroup.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                        Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, companion.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-118836883);
                        if (str3 != null) {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            SpacerKt.Spacer(SizeKt.m466width3ABfNKs(companion2, Dp.m3840constructorimpl(f)), startRestartGroup, 6);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(str3, ContentScale.INSTANCE.getFit(), ClipKt.clip(SizeKt.m461size3ABfNKs(companion2, Dp.m3840constructorimpl(36)), m670RoundedCornerShape0680j_4), startRestartGroup, ((i3 >> 3) & 14) | 48);
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextKt.m1243TextfLXpl1I(str2, PaddingKt.m421paddingVpY3zN4(Modifier.INSTANCE, Dp.m3840constructorimpl(15), Dp.m3840constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    }
                    final String str4 = str3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier5 = modifier2;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.internal.v$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return v.a(Modifier.this, str4, str2, j, j2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) != 74898) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                float f2 = 4;
                RoundedCornerShape m670RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(f2));
                Modifier m192clickableXHw0xAI$default2 = ClickableKt.m192clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m468widthInVpY3zN4$default(modifier3, 0.0f, Dp.m3840constructorimpl(164), 1, null), m670RoundedCornerShape0680j_42), j2, null, 2, null), null, null, 3, null), false, NativeAdContent.ViewTag.CTA, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), function0, 1, null);
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Modifier modifier42 = modifier3;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m192clickableXHw0xAI$default2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-118836883);
                if (str3 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                TextKt.m1243TextfLXpl1I(str2, PaddingKt.m421paddingVpY3zN4(Modifier.INSTANCE, Dp.m3840constructorimpl(15), Dp.m3840constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                final String str42 = str3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) != 74898) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f22 = 4;
            RoundedCornerShape m670RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(f22));
            Modifier m192clickableXHw0xAI$default22 = ClickableKt.m192clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m468widthInVpY3zN4$default(modifier3, 0.0f, Dp.m3840constructorimpl(164), 1, null), m670RoundedCornerShape0680j_422), j2, null, 2, null), null, null, 3, null), false, NativeAdContent.ViewTag.CTA, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), function0, 1, null);
            Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Modifier modifier422 = modifier3;
            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m192clickableXHw0xAI$default22);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl22, rowMeasurePolicy22, companion32.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl22, density22, companion32.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion32.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion32.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-118836883);
            if (str3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.m1243TextfLXpl1I(str2, PaddingKt.m421paddingVpY3zN4(Modifier.INSTANCE, Dp.m3840constructorimpl(15), Dp.m3840constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier422;
            final String str422 = str3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str3 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f222 = 4;
        RoundedCornerShape m670RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(f222));
        Modifier m192clickableXHw0xAI$default222 = ClickableKt.m192clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m173backgroundbw27NRU$default(ClipKt.clip(SizeKt.m468widthInVpY3zN4$default(modifier3, 0.0f, Dp.m3840constructorimpl(164), 1, null), m670RoundedCornerShape0680j_4222), j2, null, 2, null), null, null, 3, null), false, NativeAdContent.ViewTag.CTA, Role.m3377boximpl(Role.INSTANCE.m3384getButtono7Vup1c()), function0, 1, null);
        Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
        Modifier modifier4222 = modifier3;
        Function0<ComposeUiNode> constructor222 = companion322.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(m192clickableXHw0xAI$default222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl222 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl222, rowMeasurePolicy222, companion322.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl222, density222, companion322.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl222, layoutDirection222, companion322.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, companion322.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-118836883);
        if (str3 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        TextKt.m1243TextfLXpl1I(str2, PaddingKt.m421paddingVpY3zN4(Modifier.INSTANCE, Dp.m3840constructorimpl(15), Dp.m3840constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier4222;
        final String str4222 = str3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long a() {
        return f10855a;
    }

    public static final Function1<Context, s> a(final Flow<Boolean> ctaAvailable, final StateFlow<? extends i.a> currentAdPart, final Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, final Function0<Unit> onCTA, final int i, final Integer num, final String str, final Integer num2, final Integer num3, final String str2) {
        Intrinsics.checkNotNullParameter(ctaAvailable, "ctaAvailable");
        Intrinsics.checkNotNullParameter(currentAdPart, "currentAdPart");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onCTA, "onCTA");
        return new Function1() { // from class: com.moloco.sdk.internal.v$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.a(str, num, num2, num3, i, str2, ctaAvailable, currentAdPart, onButtonRendered, onCTA, (Context) obj);
            }
        };
    }

    public static final s a(String str, Integer num, Integer num2, Integer num3, int i, String str2, Flow flow, StateFlow stateFlow, Function1 function1, Function0 function0, Context context) {
        String str3;
        int dimensionPixelSize;
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            String string = context.getString(R.string.com_moloco_sdk_xenoss_player_learn_more);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            str3 = string;
        } else {
            str3 = str;
        }
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding);
        }
        int i2 = dimensionPixelSize;
        int intValue = num2 != null ? num2.intValue() : -1;
        if (num3 != null) {
            color = num3.intValue();
        } else {
            color = ContextCompat.getColor(context, R.color.moloco_cta_background_blue);
        }
        return new s(context, i, i2, str3, intValue, color, str2, flow, stateFlow, function1, function0);
    }
}
