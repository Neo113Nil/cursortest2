package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a&\u0010\n\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001a0\u0010\n\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0011\u001a:\u0010\n\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0013\u001aD\u0010\n\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0015\u001a>\u0010\n\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0017\"\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0018\u001a6\u0010\u0019\u001a\u00020\u00012'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001f\u001aJ\u0010\u0019\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010 \u001aT\u0010\u0019\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010!\u001aN\u0010\u0019\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0017\"\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001\u001a#\u0010(\u001a\u00020\u001c2\u0013\b\u0006\u0010)\u001a\r\u0012\u0004\u0012\u00020%0\u0003¢\u0006\u0002\b*H\u0087\b¢\u0006\u0002\u0010+\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"SideEffect", "", "effect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "DisposableEffectNoParamError", "", "LaunchedEffectNoParamError", "DisposableEffect", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key1", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LaunchedEffect", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "createCompositionCoroutineScope", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "composer", "Landroidx/compose/runtime/Composer;", "rememberCoroutineScope", "getContext", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/CoroutineScope;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EffectsKt {
    private static final androidx.compose.runtime.DisposableEffectScope getHighSpeedVideoFpsRanges = new androidx.compose.runtime.DisposableEffectScope();

    public static final void SideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        composer.recordSideEffect(function0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.")
    public static final void DisposableEffect(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-904483903, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:120)");
        }
        throw new java.lang.IllegalStateException("DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.".toString());
    }

    public static final void DisposableEffect(java.lang.Object obj, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean changed = composer.changed(obj);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.DisposableEffectImpl(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.DisposableEffectImpl(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:228)");
        }
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        boolean changed3 = composer.changed(obj3);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.DisposableEffectImpl(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(java.lang.Object[] objArr, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean z = false;
        for (java.lang.Object obj : java.util.Arrays.copyOf(objArr, objArr.length)) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new androidx.compose.runtime.DisposableEffectImpl(function1));
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    public static final void LaunchedEffect(final kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-805415771);
        int i2 = i & 1;
        if (startRestartGroup.shouldExecute(i2 != 0, i2)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-805415771, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:317)");
            }
            throw new java.lang.IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
        }
        startRestartGroup.skipToGroupEnd();
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.EffectsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoSizes = androidx.compose.runtime.EffectsKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoSizes;
                }
            });
        }
    }

    public static final void LaunchedEffect(java.lang.Object obj, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:333)");
        }
        kotlin.coroutines.CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(rememberedValue);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:352)");
        }
        kotlin.coroutines.CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(rememberedValue);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        kotlin.coroutines.CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        boolean changed3 = composer.changed(obj3);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.runtime.LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(rememberedValue);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(java.lang.Object[] objArr, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:399)");
        }
        kotlin.coroutines.CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean z = false;
        for (java.lang.Object obj : java.util.Arrays.copyOf(objArr, objArr.length)) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new androidx.compose.runtime.LaunchedEffectImpl(applyCoroutineContext, function2));
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final kotlinx.coroutines.CoroutineScope createCompositionCoroutineScope(kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Composer composer) {
        kotlinx.coroutines.CompletableJob Job$default;
        if (coroutineContext.get(kotlinx.coroutines.Job.INSTANCE) != null) {
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            Job$default.completeExceptionally(new java.lang.IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(Job$default);
        }
        return new androidx.compose.runtime.RememberedCoroutineScope(composer.getApplyCoroutineContext(), coroutineContext);
    }

    public static final kotlinx.coroutines.CoroutineScope rememberCoroutineScope(kotlin.jvm.functions.Function0<? extends kotlin.coroutines.CoroutineContext> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.coroutines.EmptyCoroutineContext>() { // from class: androidx.compose.runtime.EffectsKt$rememberCoroutineScope$1
                @Override // kotlin.jvm.functions.Function0
                public final kotlin.coroutines.EmptyCoroutineContext invoke() {
                    return kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
                }
            };
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = createCompositionCoroutineScope(function0.invoke(), composer);
            composer.updateRememberedValue(rememberedValue);
        }
        return (kotlinx.coroutines.CoroutineScope) rememberedValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        LaunchedEffect(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
