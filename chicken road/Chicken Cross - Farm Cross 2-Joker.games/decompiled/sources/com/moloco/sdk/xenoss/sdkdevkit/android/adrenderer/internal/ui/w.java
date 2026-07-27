package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4820g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class w {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1", f = "LifecycleAwareAdCountdownButton.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11201a;
        public final /* synthetic */ State<UInt> b;
        public final /* synthetic */ State<Function0<Unit>> c;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$a$a, reason: collision with other inner class name */
        public static final class C1570a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ State<Function0<Unit>> f11202a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1570a(State<? extends Function0<Unit>> state) {
                this.f11202a = state;
            }

            public final Object a(int i, Continuation<? super Unit> continuation) {
                w.b(this.f11202a).invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((UInt) obj).getData(), continuation);
            }
        }

        public static final class b implements Flow<UInt> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Flow f11203a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$a$b$a, reason: collision with other inner class name */
            public static final class C1571a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11204a;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1$invokeSuspend$$inlined$filter$1$2", f = "LifecycleAwareAdCountdownButton.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$a$b$a$a, reason: collision with other inner class name */
                public static final class C1572a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f11205a;
                    public int b;
                    public Object c;
                    public Object d;

                    public C1572a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f11205a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C1571a.this.emit(null, this);
                    }
                }

                public C1571a(FlowCollector flowCollector) {
                    this.f11204a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C1572a c1572a;
                    int i;
                    if (continuation instanceof C1572a) {
                        c1572a = (C1572a) continuation;
                        int i2 = c1572a.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c1572a.b = i2 - Integer.MIN_VALUE;
                            Object obj2 = c1572a.f11205a;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c1572a.b;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.f11204a;
                                if (((UInt) obj).getData() == 0) {
                                    c1572a.b = 1;
                                    if (flowCollector.emit(obj, c1572a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c1572a = new C1572a(continuation);
                    Object obj22 = c1572a.f11205a;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c1572a.b;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(Flow flow) {
                this.f11203a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UInt> flowCollector, Continuation continuation) {
                Object collect = this.f11203a.collect(new C1571a(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(State<UInt> state, State<? extends Function0<Unit>> state2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = state;
            this.c = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11201a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final State<UInt> state = this.b;
                b bVar = new b(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.a.a(State.this);
                    }
                }));
                C1570a c1570a = new C1570a(this.c);
                this.f11201a = 1;
                if (bVar.collect(c1570a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        public static final UInt a(State state) {
            return UInt.m8170boximpl(w.a(state));
        }
    }

    public static final Unit a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar, boolean z, boolean z2, Function0 function0, Function0 function02, Function1 function1, Function11 function11, boolean z3, Flow flow, int i, int i2, Composer composer, int i3) {
        a(boxScope, mVar, z, z2, function0, function02, function1, function11, z3, flow, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Function0<Unit> b(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final BoxScope boxScope, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<UInt> initialSecondsLeft, final boolean z, final boolean z2, final Function0<Unit> onCountdownFinished, final Function0<Unit> onClick, final Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> basedOnAdCountdownButton, final boolean z3, Flow<Boolean> flow, Composer composer, final int i, final int i2) {
        int i3;
        Flow<Boolean> flow2;
        Object rememberedValue;
        Composer.Companion companion;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        Composer composer2;
        final Flow<Boolean> flow3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(initialSecondsLeft, "initialSecondsLeft");
        Intrinsics.checkNotNullParameter(onCountdownFinished, "onCountdownFinished");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(basedOnAdCountdownButton, "basedOnAdCountdownButton");
        Composer startRestartGroup = composer.startRestartGroup(1211286303);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(initialSecondsLeft) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(onCountdownFinished) ? 16384 : 8192;
        }
        if ((i2 & 16) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 131072 : 65536;
        }
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(onButtonRendered) ? 1048576 : 524288;
        }
        if ((i2 & 64) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(basedOnAdCountdownButton) ? 8388608 : 4194304;
        }
        if ((i2 & 128) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= C.ENCODING_PCM_32BIT;
        } else if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changed(flow) ? 536870912 : 268435456;
            if ((i3 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                flow2 = i4 == 0 ? null : flow;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1211286303, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButton (LifecycleAwareAdCountdownButton.kt:35)");
                }
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1117957914);
                changed = startRestartGroup.changed(initialSecondsLeft) | startRestartGroup.changed(flow2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = C4820g.a(initialSecondsLeft.a().getData(), coroutineScope, flow2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                int i5 = i3;
                Flow<Boolean> flow4 = flow2;
                State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((StateFlow) rememberedValue2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onCountdownFinished, startRestartGroup, (i5 >> 12) & 14);
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1117966956);
                changed2 = startRestartGroup.changed(collectAsStateWithLifecycle) | startRestartGroup.changed(rememberUpdatedState);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new a(collectAsStateWithLifecycle, rememberUpdatedState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
                Boolean valueOf = Boolean.valueOf(z2);
                Boolean valueOf2 = Boolean.valueOf(z);
                Boolean valueOf3 = Boolean.valueOf(z3);
                UInt a2 = initialSecondsLeft.a();
                UInt m8170boximpl = UInt.m8170boximpl(a(collectAsStateWithLifecycle));
                Function0<Unit> b = b(rememberUpdatedState);
                int i6 = i5 >> 6;
                Integer valueOf4 = Integer.valueOf((i5 & 14) | (i6 & 112) | (i5 & 896) | (i6 & 7168) | (i6 & 57344) | ((i5 >> 9) & 458752) | ((i5 << 6) & 1879048192));
                composer2 = startRestartGroup;
                basedOnAdCountdownButton.invoke(boxScope, valueOf, valueOf2, onClick, onButtonRendered, valueOf3, a2, m8170boximpl, b, composer2, valueOf4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                flow3 = flow4;
            } else {
                startRestartGroup.skipToGroupEnd();
                flow3 = flow;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w.a(BoxScope.this, initialSecondsLeft, z, z2, onCountdownFinished, onClick, onButtonRendered, basedOnAdCountdownButton, z3, flow3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 306783379) == 306783378) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1117957914);
        changed = startRestartGroup.changed(initialSecondsLeft) | startRestartGroup.changed(flow2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = C4820g.a(initialSecondsLeft.a().getData(), coroutineScope2, flow2);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        int i52 = i3;
        Flow<Boolean> flow42 = flow2;
        State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle((StateFlow) rememberedValue2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onCountdownFinished, startRestartGroup, (i52 >> 12) & 14);
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(1117966956);
        changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2) | startRestartGroup.changed(rememberUpdatedState2);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new a(collectAsStateWithLifecycle2, rememberUpdatedState2, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
        Boolean valueOf5 = Boolean.valueOf(z2);
        Boolean valueOf22 = Boolean.valueOf(z);
        Boolean valueOf32 = Boolean.valueOf(z3);
        UInt a22 = initialSecondsLeft.a();
        UInt m8170boximpl2 = UInt.m8170boximpl(a(collectAsStateWithLifecycle2));
        Function0<Unit> b2 = b(rememberUpdatedState2);
        int i62 = i52 >> 6;
        Integer valueOf42 = Integer.valueOf((i52 & 14) | (i62 & 112) | (i52 & 896) | (i62 & 7168) | (i62 & 57344) | ((i52 >> 9) & 458752) | ((i52 << 6) & 1879048192));
        composer2 = startRestartGroup;
        basedOnAdCountdownButton.invoke(boxScope, valueOf5, valueOf22, onClick, onButtonRendered, valueOf32, a22, m8170boximpl2, b2, composer2, valueOf42);
        if (ComposerKt.isTraceInProgress()) {
        }
        flow3 = flow42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final int a(State<UInt> state) {
        return state.getValue().getData();
    }
}
