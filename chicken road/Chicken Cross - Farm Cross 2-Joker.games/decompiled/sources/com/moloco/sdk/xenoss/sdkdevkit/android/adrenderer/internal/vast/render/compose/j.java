package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.os.Build;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.internal.ViewUtils;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class j {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1", f = "Linear.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11410a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1$1", f = "Linear.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$a$a, reason: collision with other inner class name */
        public static final class C1600a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11411a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1600a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Continuation<? super C1600a> continuation) {
                super(2, continuation);
                this.b = kVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C1600a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1600a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11411a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.b();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11410a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.b.a().getMain();
                C1600a c1600a = new C1600a(this.b, null);
                this.f11410a = 1;
                if (BuildersKt.withContext(main, c1600a, this) == coroutine_suspended) {
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
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$2$1$2$1", f = "Linear.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11412a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b b;
        public final /* synthetic */ State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar, State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>> state, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = bVar;
            this.c = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11412a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.a(((Number) j.a(this.c).a()).longValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$2$1$3$1", f = "Linear.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11413a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b b;
        public final /* synthetic */ MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar, MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>> mutableState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = bVar;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11413a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) j.a(this.c).a()).booleanValue()) {
                this.b.g();
            } else {
                this.b.e();
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        public d(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        public e(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).x();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> {
        public f(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
            a(lVar);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$2$6$1", f = "Linear.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11414a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0<Unit> function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = function0;
            this.d = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((g) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.c, this.d, continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11414a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.b;
                final Function0<Unit> function0 = this.c;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar = this.d;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$g$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return j.g.a(Function0.this, kVar, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.f11414a = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(pointerInputScope, function2, this) == coroutine_suspended) {
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

        public static final Unit a(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Offset offset, Offset offset2) {
            if (function0 != null) {
                function0.invoke();
            } else {
                kVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f11199a.a(offset.getPackedValue()));
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public h(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).c(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class i implements Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<? extends Unit>, Function0<? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Alignment f11415a;
        public final /* synthetic */ PaddingValues b;

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f11416a;
            public final /* synthetic */ Function0<Unit> b;
            public final /* synthetic */ Function0<Unit> c;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0<Unit> function0, Function0<Unit> function02) {
                this.f11416a = jVar;
                this.b = function0;
                this.c = function02;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(989733896, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous>.<anonymous> (Linear.kt:205)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = this.f11416a;
                if (jVar != null) {
                    t.a(jVar, this.b, this.c, null, composer, 0, 8);
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

        public i(Alignment alignment, PaddingValues paddingValues) {
            this.f11415a = alignment;
            this.b = paddingValues;
        }

        public final void a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0<Unit> onDisplayed, Function0<Unit> onClick, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onDisplayed, "onDisplayed");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(jVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(onDisplayed) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changed(onClick) ? 2048 : 1024;
            }
            if ((i2 & 9363) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903645392, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous> (Linear.kt:199)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(jVar != null, PaddingKt.padding(boxScope.align(Modifier.INSTANCE, this.f11415a), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 989733896, true, new a(jVar, onDisplayed, onClick)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0<? extends Unit> function0, Function0<? extends Unit> function02, Composer composer, Integer num) {
            a(boxScope, jVar, function0, function02, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return bVar;
    }

    public static final void b(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i c(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Function0 function0, Modifier modifier, Function7 function7, Function5 function5, Function6 function6, Function7 function72, Q q, Function0 function02, int i2, int i3, Composer composer, int i4) {
        a(kVar, function0, modifier, function7, function5, function6, function72, q, function02, composer, i2 | 1, i3);
        return Unit.INSTANCE;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j c(State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, final Function0<Unit> function0, Modifier modifier, final Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function7, final Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5, final Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, final Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function72, final Q viewVisibilityTracker, final Function0<Unit> onShouldReplay, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        Object rememberedValue2;
        Composer.Companion companion;
        final MutableState mutableState;
        Object rememberedValue3;
        final MutableState mutableState2;
        Object rememberedValue4;
        Context context;
        boolean changed2;
        Object rememberedValue5;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar;
        boolean changed3;
        Object rememberedValue6;
        boolean changed4;
        Object rememberedValue7;
        boolean changed5;
        Object rememberedValue8;
        boolean changed6;
        Object rememberedValue9;
        boolean changed7;
        Object rememberedValue10;
        int i5;
        Composer composer2;
        MutableState mutableState3;
        MutableState mutableState4;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        Composer startRestartGroup = composer.startRestartGroup(-1913678167);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(viewModel) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(function7) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changed(function5) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(function6) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i4 |= startRestartGroup.changed(function72) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i4 |= startRestartGroup.changed(viewVisibilityTracker) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= startRestartGroup.changed(onShouldReplay) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((38347923 & i4) != 38347922 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            } else {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1913678167, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Linear (Linear.kt:67)");
                }
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1664872985);
                changed = startRestartGroup.changed(viewModel);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new a(viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier4);
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
                Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl, density, companion2.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                State collectAsState = SnapshotStateKt.collectAsState(viewModel.V(), null, startRestartGroup, 0, 1);
                State collectAsState2 = SnapshotStateKt.collectAsState(viewModel.r(), null, startRestartGroup, 0, 1);
                startRestartGroup.startReplaceableGroup(1087148963);
                rememberedValue2 = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087151755);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(i.b.b, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087157744);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 != companion.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(Boolean.TRUE), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final MutableState mutableState5 = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceableGroup();
                context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                startRestartGroup.startReplaceableGroup(1087173980);
                changed2 = startRestartGroup.changed(viewModel);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue5 == companion.getEmpty()) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b a2 = !viewModel.D() ? a(context, viewModel, viewVisibilityTracker) : null;
                    startRestartGroup.updateRememberedValue(a2);
                    rememberedValue5 = a2;
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b) rememberedValue5;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087182676);
                if (bVar != null) {
                    startRestartGroup.startReplaceableGroup(1376195898);
                    boolean changed8 = startRestartGroup.changed(bVar);
                    Object rememberedValue11 = startRestartGroup.rememberedValue();
                    if (changed8 || rememberedValue11 == companion.getEmpty()) {
                        rememberedValue11 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b.this, (Context) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) rememberedValue11, boxScopeInstance.matchParentSize(Modifier.INSTANCE), null, startRestartGroup, 0, 4);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> a3 = a((State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>>) collectAsState);
                    startRestartGroup.startReplaceableGroup(1376199957);
                    boolean changed9 = startRestartGroup.changed(bVar) | startRestartGroup.changed(collectAsState);
                    Object rememberedValue12 = startRestartGroup.rememberedValue();
                    if (changed9 || rememberedValue12 == companion.getEmpty()) {
                        rememberedValue12 = new b(bVar, collectAsState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(a3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 0);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> a4 = a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>>) mutableState5);
                    startRestartGroup.startReplaceableGroup(1376202735);
                    boolean changed10 = startRestartGroup.changed(mutableState5) | startRestartGroup.changed(bVar);
                    Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if (changed10 || rememberedValue13 == companion.getEmpty()) {
                        rememberedValue13 = new c(bVar, mutableState5, null);
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(a4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue13, startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
                String K = viewModel.K();
                boolean P = viewModel.P();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> a5 = a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>>) mutableState5);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> a6 = a((State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>>) collectAsState);
                boolean b2 = b((State<Boolean>) collectAsState2);
                startRestartGroup.startReplaceableGroup(1087203050);
                changed3 = startRestartGroup.changed(viewModel) | startRestartGroup.changed(mutableState);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState, ((Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                Function1 function1 = (Function1) rememberedValue6;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087206958);
                changed4 = startRestartGroup.changed(viewModel);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue7 == companion.getEmpty()) {
                    rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, ((Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                Function1 function12 = (Function1) rememberedValue7;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087215240);
                changed5 = startRestartGroup.changed(viewModel) | startRestartGroup.changed(mutableState2);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changed5 || rememberedValue8 == companion.getEmpty()) {
                    rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                Function1 function13 = (Function1) rememberedValue8;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087218847);
                changed6 = startRestartGroup.changed(viewModel);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changed6 || rememberedValue9 == companion.getEmpty()) {
                    rememberedValue9 = new f(viewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceableGroup();
                Function1 function14 = (Function1) ((KFunction) rememberedValue9);
                Modifier matchParentSize = boxScopeInstance.matchParentSize(Modifier.INSTANCE);
                startRestartGroup.startReplaceableGroup(1087223028);
                changed7 = startRestartGroup.changed(function0) | startRestartGroup.changed(viewModel);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changed7 || rememberedValue10 == companion.getEmpty()) {
                    rememberedValue10 = new g(function0, viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                startRestartGroup.endReplaceableGroup();
                B.a(K, P, a5, a6, b2, function1, function12, viewVisibilityTracker, function13, function14, SuspendingPointerInputFilterKt.pointerInput(matchParentSize, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue10), startRestartGroup, i4 & 29360128, 0, 0);
                startRestartGroup.startReplaceableGroup(1087232585);
                if (function72 != null) {
                    composer2 = startRestartGroup;
                    mutableState3 = mutableState2;
                    mutableState4 = mutableState;
                    i5 = 6;
                } else {
                    startRestartGroup.startReplaceableGroup(1376244972);
                    boolean changed11 = startRestartGroup.changed(mutableState5);
                    Object rememberedValue14 = startRestartGroup.rememberedValue();
                    if (changed11 || rememberedValue14 == companion.getEmpty()) {
                        rememberedValue14 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j.a(MutableState.this, ((Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    startRestartGroup.endReplaceableGroup();
                    i5 = 6;
                    composer2 = startRestartGroup;
                    mutableState3 = mutableState2;
                    mutableState4 = mutableState;
                    function72.invoke(boxScopeInstance, Boolean.valueOf(b((MutableState<Boolean>) mutableState)), c((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState2), (Function1) rememberedValue14, onShouldReplay, composer2, Integer.valueOf(((i4 >> 12) & 57344) | 3078));
                }
                composer2.endReplaceableGroup();
                boolean z = (b((MutableState<Boolean>) mutableState4) && (c((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState3) instanceof i.a)) ? false : true;
                composer2.startReplaceableGroup(1087251753);
                if (function7 != null) {
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean valueOf2 = Boolean.valueOf(b((State<Boolean>) collectAsState2));
                    composer2.startReplaceableGroup(1376264408);
                    boolean changed12 = composer2.changed(viewModel);
                    Object rememberedValue15 = composer2.rememberedValue();
                    if (changed12 || rememberedValue15 == companion.getEmpty()) {
                        rememberedValue15 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, (a.AbstractC1622a.c) obj, (a.AbstractC1622a.c.EnumC1624a) obj2);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue15);
                    }
                    Function2 function2 = (Function2) rememberedValue15;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1376269827);
                    boolean changed13 = composer2.changed(viewModel);
                    Object rememberedValue16 = composer2.rememberedValue();
                    if (changed13 || rememberedValue16 == companion.getEmpty()) {
                        rememberedValue16 = new h(viewModel);
                        composer2.updateRememberedValue(rememberedValue16);
                    }
                    composer2.endReplaceableGroup();
                    function7.invoke(boxScopeInstance, valueOf, valueOf2, function2, (KFunction) rememberedValue16, composer2, Integer.valueOf(i5));
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1087260362);
                if (function5 != null) {
                    function5.invoke(boxScopeInstance, Boolean.valueOf(b((MutableState<Boolean>) mutableState4)), c((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState3), composer2, Integer.valueOf(i5));
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1087263154);
                if (function6 != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j c2 = c((State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>) SnapshotStateKt.collectAsState(viewModel.S(), null, composer2, 0, 1));
                    composer2.startReplaceableGroup(1376279025);
                    boolean changed14 = composer2.changed(viewModel);
                    Object rememberedValue17 = composer2.rememberedValue();
                    if (changed14 || rememberedValue17 == companion.getEmpty()) {
                        rememberedValue17 = new d(viewModel);
                        composer2.updateRememberedValue(rememberedValue17);
                    }
                    KFunction kFunction = (KFunction) rememberedValue17;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1376280781);
                    boolean changed15 = composer2.changed(viewModel);
                    Object rememberedValue18 = composer2.rememberedValue();
                    if (changed15 || rememberedValue18 == companion.getEmpty()) {
                        rememberedValue18 = new e(viewModel);
                        composer2.updateRememberedValue(rememberedValue18);
                    }
                    composer2.endReplaceableGroup();
                    function6.invoke(boxScopeInstance, c2, kFunction, (KFunction) rememberedValue18, composer2, Integer.valueOf(i5));
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, function0, modifier3, function7, function5, function6, function72, viewVisibilityTracker, onShouldReplay, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((38347923 & i4) != 38347922) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(1664872985);
        changed = startRestartGroup.changed(viewModel);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new a(viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(modifier4);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl2, density2, companion22.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        State collectAsState3 = SnapshotStateKt.collectAsState(viewModel.V(), null, startRestartGroup, 0, 1);
        State collectAsState22 = SnapshotStateKt.collectAsState(viewModel.r(), null, startRestartGroup, 0, 1);
        startRestartGroup.startReplaceableGroup(1087148963);
        rememberedValue2 = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue2 == companion.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087151755);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087157744);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 != companion.getEmpty()) {
        }
        final MutableState mutableState52 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        startRestartGroup.startReplaceableGroup(1087173980);
        changed2 = startRestartGroup.changed(viewModel);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        if (!viewModel.D()) {
        }
        startRestartGroup.updateRememberedValue(a2);
        rememberedValue5 = a2;
        bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b) rememberedValue5;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087182676);
        if (bVar != null) {
        }
        startRestartGroup.endReplaceableGroup();
        String K2 = viewModel.K();
        boolean P2 = viewModel.P();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> a52 = a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>>) mutableState52);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> a62 = a((State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>>) collectAsState3);
        boolean b22 = b((State<Boolean>) collectAsState22);
        startRestartGroup.startReplaceableGroup(1087203050);
        changed3 = startRestartGroup.changed(viewModel) | startRestartGroup.changed(mutableState);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState, ((Boolean) obj).booleanValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        Function1 function15 = (Function1) rememberedValue6;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087206958);
        changed4 = startRestartGroup.changed(viewModel);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, ((Boolean) obj).booleanValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        Function1 function122 = (Function1) rememberedValue7;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087215240);
        changed5 = startRestartGroup.changed(viewModel) | startRestartGroup.changed(mutableState2);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        Function1 function132 = (Function1) rememberedValue8;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087218847);
        changed6 = startRestartGroup.changed(viewModel);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changed6) {
        }
        rememberedValue9 = new f(viewModel);
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceableGroup();
        Function1 function142 = (Function1) ((KFunction) rememberedValue9);
        Modifier matchParentSize2 = boxScopeInstance2.matchParentSize(Modifier.INSTANCE);
        startRestartGroup.startReplaceableGroup(1087223028);
        changed7 = startRestartGroup.changed(function0) | startRestartGroup.changed(viewModel);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (!changed7) {
        }
        rememberedValue10 = new g(function0, viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue10);
        startRestartGroup.endReplaceableGroup();
        B.a(K2, P2, a52, a62, b22, function15, function122, viewVisibilityTracker, function132, function142, SuspendingPointerInputFilterKt.pointerInput(matchParentSize2, unit2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue10), startRestartGroup, i4 & 29360128, 0, 0);
        startRestartGroup.startReplaceableGroup(1087232585);
        if (function72 != null) {
        }
        composer2.endReplaceableGroup();
        if (b((MutableState<Boolean>) mutableState4)) {
        }
        composer2.startReplaceableGroup(1087251753);
        if (function7 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(1087260362);
        if (function5 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(1087263154);
        if (function6 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Q q) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.l.a(context, kVar.P(), a.g.f10872a.a()), q);
    }

    public static final boolean b(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, MutableState mutableState, boolean z) {
        kVar.d(z);
        b(mutableState, z);
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, boolean z) {
        if (z) {
            kVar.H();
        } else {
            kVar.J();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kVar.a(it);
        a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState, it);
        return Unit.INSTANCE;
    }

    public static final Unit a(MutableState mutableState, boolean z) {
        a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>>) mutableState, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(Boolean.valueOf(z)));
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, a.AbstractC1622a.c button, a.AbstractC1622a.c.EnumC1624a buttonType) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        kVar.a(button);
        kVar.a(buttonType);
        return Unit.INSTANCE;
    }

    public static final Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1318345093);
        if ((i3 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomStart();
        }
        if ((i3 & 2) != 0) {
            paddingValues = PaddingKt.m413PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1318345093, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon (Linear.kt:198)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -903645392, true, new i(alignment, paddingValues));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b a(final Context context, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, final Q viewVisibilityTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        boolean z = Build.VERSION.SDK_INT >= 31;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b(context, viewModel.K(), viewModel.n(), viewModel.u(), viewModel.U(), z ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.b(context, viewModel, viewVisibilityTracker);
            }
        } : null, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(j.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this));
            }
        }, viewModel.isPlaying(), 0.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    public static final long a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar) {
        return kVar.W();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> a(State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>> state) {
        return state.getValue();
    }

    public static final void a(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        mutableState.setValue(iVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> a(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>> mutableState) {
        return mutableState.getValue();
    }

    public static final void a(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar) {
        mutableState.setValue(mVar);
    }
}
