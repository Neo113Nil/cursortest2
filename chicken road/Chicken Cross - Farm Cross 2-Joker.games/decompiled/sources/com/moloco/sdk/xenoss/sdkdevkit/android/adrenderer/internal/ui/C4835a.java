package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.R;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4835a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11141a = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$a, reason: collision with other inner class name */
    public static final class C1561a implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f11142a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function1<String, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public C1561a(Modifier modifier, String str, Function1<? super String, Unit> function1) {
            this.f11142a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(Modifier trackableModifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(trackableModifier, "trackableModifier");
            if ((i & 6) == 0) {
                i |= composer.changed(trackableModifier) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1810395910, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableAdBadgeButton.<anonymous> (AdBadge.kt:153)");
            }
            C4835a.a(this.f11142a.then(trackableModifier), this.b, this.c, composer, 0, 0);
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

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$c */
    public static final class c implements Function4<BoxScope, Function1<? super a.AbstractC1622a.c, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f11144a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function1<String, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, String str, Function1<? super String, Unit> function1) {
            this.f11144a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(BoxScope boxScope, Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if ((i & 48) == 0) {
                i |= composer.changed(onButtonRendered) ? 32 : 16;
            }
            if ((i & 145) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652534615, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous> (AdBadge.kt:124)");
            }
            C4835a.a(onButtonRendered, this.f11144a, this.b, this.c, composer, (i >> 3) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Function1<? super a.AbstractC1622a.c, ? extends Unit> function1, Composer composer, Integer num) {
            a(boxScope, function1, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(Modifier modifier, String str, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, str, (Function1<? super String, Unit>) function1, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Function4<BoxScope, Function1<? super a.AbstractC1622a.c, Unit>, Composer, Integer, Unit> c(Modifier modifier, final String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1<? super String, Unit> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1806921710);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = f11141a;
        }
        if ((i2 & 4) != 0) {
            rVar = a.h.f10873a.f();
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-763795258);
            boolean changed = composer.changed(rVar) | composer.changed(str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4835a.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1806921710, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge (AdBadge.kt:123)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -652534615, true, new c(modifier, str, function1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    public static final Function5<BoxScope, Function1<? super a.AbstractC1622a.c, Unit>, StateFlow<? extends i.a>, Composer, Integer, Unit> b(Modifier modifier, final String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1<? super String, Unit> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1665380566);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = f11141a;
        }
        if ((i2 & 4) != 0) {
            rVar = a.h.f10873a.f();
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-819746537);
            boolean changed = composer.changed(rVar) | composer.changed(str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4835a.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665380566, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge (AdBadge.kt:80)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 781429248, true, new b(modifier, str, function1));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Unit a(Function1 function1, Modifier modifier, String str, Function1 function12, int i, Composer composer, int i2) {
        a((Function1<? super a.AbstractC1622a.c, Unit>) function1, modifier, str, (Function1<? super String, Unit>) function12, composer, i | 1);
        return Unit.INSTANCE;
    }

    public static final Unit a(Modifier modifier, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, str, rVar, (Function1<? super String, Unit>) function1, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final void a(Modifier modifier, final String clickUrl, final Function1<? super String, Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1037954372);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(clickUrl) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037954372, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadge (AdBadge.kt:43)");
            }
            startRestartGroup.startReplaceableGroup(-363689698);
            final String str = "Ad Badge";
            boolean changed = startRestartGroup.changed("Ad Badge");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4835a.a(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m453requiredSize3ABfNKs = SizeKt.m453requiredSize3ABfNKs(SemanticsModifierKt.semantics$default(modifier3, false, (Function1) rememberedValue, 1, null), Dp.m3840constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-363682862);
            boolean changed2 = startRestartGroup.changed(onClick) | startRestartGroup.changed(clickUrl);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4835a.a(Function1.this, clickUrl);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            IconKt.m1073Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.info_badge, startRestartGroup, 0), "Ad Badge", ClickableKt.m192clickableXHw0xAI$default(m453requiredSize3ABfNKs, false, null, null, (Function0) rememberedValue2, 7, null), Color.INSTANCE.m1664getUnspecified0d7_KjU(), startRestartGroup, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4835a.a(Modifier.this, clickUrl, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$b */
    public static final class b implements Function5<BoxScope, Function1<? super a.AbstractC1622a.c, ? extends Unit>, StateFlow<? extends i.a>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f11143a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function1<String, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, String str, Function1<? super String, Unit> function1) {
            this.f11143a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(BoxScope boxScope, Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, StateFlow<? extends i.a> stateFlow, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(781429248, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous> (AdBadge.kt:81)");
            }
            if (stateFlow != null) {
                Modifier modifier = this.f11143a;
                String str = this.b;
                Function1<String, Unit> function1 = this.c;
                i.a a2 = a(SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1));
                if (a2 instanceof i.a.c) {
                    composer.startReplaceableGroup(-784874969);
                    C4835a.a(onButtonRendered, modifier, str, function1, composer, (i >> 3) & 14);
                    composer.endReplaceableGroup();
                } else if (a2 instanceof i.a.C1590a) {
                    composer.startReplaceableGroup(-784629945);
                    C4835a.a(onButtonRendered, modifier, str, function1, composer, (i >> 3) & 14);
                    composer.endReplaceableGroup();
                } else if (a2 instanceof i.a.b) {
                    composer.startReplaceableGroup(-784396608);
                    composer.endReplaceableGroup();
                } else if (a2 instanceof i.a.d) {
                    composer.startReplaceableGroup(-784339072);
                    composer.endReplaceableGroup();
                } else {
                    if (a2 != null) {
                        composer.startReplaceableGroup(-1687888204);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-784304352);
                    composer.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Function1<? super a.AbstractC1622a.c, ? extends Unit> function1, StateFlow<? extends i.a> stateFlow, Composer composer, Integer num) {
            a(boxScope, function1, stateFlow, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final i.a a(State<? extends i.a> state) {
            return state.getValue();
        }
    }

    public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return Unit.INSTANCE;
    }

    public static final Unit b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return Unit.INSTANCE;
    }

    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final Unit a(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final void a(final Function1<? super a.AbstractC1622a.c, Unit> function1, final Modifier modifier, final String str, final Function1<? super String, Unit> function12, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-459026854);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(function12) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-459026854, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableAdBadgeButton (AdBadge.kt:148)");
            }
            B.a(null, a.AbstractC1622a.c.EnumC1624a.i, function1, ComposableLambdaKt.composableLambda(startRestartGroup, -1810395910, true, new C1561a(modifier, str, function12)), startRestartGroup, ((i2 << 6) & 896) | 3120, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4835a.a(Function1.this, modifier, str, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return Unit.INSTANCE;
    }

    public static final void a(Modifier modifier, final String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1950835232);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(rVar)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(function1)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    str = f11141a;
                }
                if ((i2 & 4) != 0) {
                    rVar = a.h.f10873a.f();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    startRestartGroup.startReplaceableGroup(1664253345);
                    boolean changed = startRestartGroup.changed(rVar) | startRestartGroup.changed(str);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C4835a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    i3 &= -7169;
                    function1 = (Function1) rememberedValue;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1950835232, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultNativeAdImageBadge (AdBadge.kt:172)");
            }
            a(modifier, str, function1, startRestartGroup, (i3 & 126) | ((i3 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final String str2 = str;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2 = rVar;
        final Function1<? super String, Unit> function12 = function1;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4835a.a(Modifier.this, str2, rVar2, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1309369895);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1309369895, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadgePreview (AdBadge.kt:182)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, l.f11173a.a(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4835a.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ C4836b a(Context context, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = f11141a;
        }
        if ((i & 4) != 0) {
            rVar = a.h.f10873a.f();
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return a(context, str, rVar, function1);
    }

    public static final C4836b a(Context context, String clickUrl, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, Function1<? super a.AbstractC1622a.c, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        C4836b c4836b = new C4836b(externalLinkHandler, context, null, 0, 12, null);
        c4836b.setPrivacyUrl(clickUrl);
        if (function1 != null) {
            c4836b.setOnButtonRenderedListener(function1);
        }
        return c4836b;
    }
}
