package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\b\u001a?\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\n\u001aI\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\f\u001aC\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u000f\u001aA\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0016\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0013\b\u0004\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a^\u0010#\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!H\u0086\b¢\u0006\u0004\b#\u0010$\u001a^\u0010%\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!H\u0086\b¢\u0006\u0004\b%\u0010$\u001as\u0010#\u001a\u00020\u0014\"\n\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0004\b#\u0010&\u001as\u0010%\u001a\u00020\u0014\"\n\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0004\b%\u0010&\u001a\u0093\u0001\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2$\b\b\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0010¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0004\b#\u0010)\u001a\u0093\u0001\u0010%\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2$\b\b\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0010¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0086\b¢\u0006\u0004\b%\u0010)\u001a\u000f\u0010*\u001a\u00020\u0014H\u0000¢\u0006\u0004\b*\u0010+\u001a\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.\"\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0017\u00106\u001a\u00020,8G¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010.\"\u0011\u0010:\u001a\u0002078G¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0017\u0010?\u001a\u00020;8G¢\u0006\f\u0012\u0004\b>\u00105\u001a\u0004\b<\u0010=\"\u001a\u0010D\u001a\u00020@8GX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u00105\u001a\u0004\bA\u0010B\"\u0015\u0010I\u001a\u00060Ej\u0002`F8G¢\u0006\u0006\u001a\u0004\bG\u0010H"}, d2 = {"T", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "calculation", "remember", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "block", "key", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "content", "ReusableContent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "ReusableContentHost", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", "E", "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/ExtensionFunctionType;", "update", "ComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "skippableUpdate", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "()V", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "getCurrentCompositionContext", "getCurrentCompositionContext$annotations", "(Landroidx/compose/runtime/Composer;I)V", "currentCompositionContext", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "currentCompositionLocalContext", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "getCurrentCompositeKeyHash$annotations", "currentCompositeKeyHash", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCurrentCompositeKeyHashCode", "(Landroidx/compose/runtime/Composer;I)J", "currentCompositeKeyHashCode"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposablesKt {
    @kotlin.Deprecated(message = "Prefer the higher-precision currentCompositeKeyHashCode", replaceWith = @kotlin.ReplaceWith(expression = "currentCompositeKeyHashCode", imports = {}))
    public static /* synthetic */ void getCurrentCompositeKeyHash$annotations(androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getCurrentCompositionContext$annotations(androidx.compose.runtime.Composer composer, int i) {
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations(androidx.compose.runtime.Composer composer, int i) {
    }

    public static final <T> T remember(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        boolean changed = composer.changed(obj);
        T t = (T) composer.rememberedValue();
        if (!changed && t != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T invoke = function0.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    public static final <T> T remember(java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        T t = (T) composer.rememberedValue();
        if ((!changed && !changed2) && t != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T invoke = function0.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    public static final <T> T remember(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        boolean changed3 = composer.changed(obj3);
        T t = (T) composer.rememberedValue();
        if ((!(changed | changed2) && !changed3) && t != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T invoke = function0.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    public static final <T> T remember(java.lang.Object[] objArr, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        boolean z = false;
        for (java.lang.Object obj : objArr) {
            z |= composer.changed(obj);
        }
        T t = (T) composer.rememberedValue();
        if (!z && t != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T invoke = function0.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    public static final <T> T key(java.lang.Object[] objArr, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends T> function2, androidx.compose.runtime.Composer composer, int i) {
        return function2.invoke(composer, java.lang.Integer.valueOf((i >> 3) & 14));
    }

    public static final void ReusableContent(java.lang.Object obj, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReusableGroup(207, obj);
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 3) & 14));
        composer.endReusableGroup();
    }

    public static final void ReusableContentHost(boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReusableGroup(207, java.lang.Boolean.valueOf(z));
        boolean changed = composer.changed(z);
        if (z) {
            function2.invoke(composer, java.lang.Integer.valueOf((i >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
    }

    public static final androidx.compose.runtime.Composer getCurrentComposer(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:180)");
        }
        throw new kotlin.NotImplementedError("Implemented as an intrinsic");
    }

    public static final androidx.compose.runtime.CompositionContext getCurrentCompositionContext(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1645225943, i, -1, "androidx.compose.runtime.<get-currentCompositionContext> (Composables.kt:195)");
        }
        androidx.compose.runtime.ControlledComposition composition = composer.getComposition();
        kotlin.jvm.internal.Intrinsics.checkNotNull(composition, "");
        androidx.compose.runtime.CompositionContext parent = ((androidx.compose.runtime.CompositionImpl) composition).getParent();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return parent;
    }

    public static final androidx.compose.runtime.RecomposeScope getCurrentRecomposeScope(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        androidx.compose.runtime.RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new java.lang.IllegalStateException("no recompose scope found".toString());
        }
        composer.recordUsed(recomposeScope);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final androidx.compose.runtime.CompositionLocalContext getCurrentCompositionLocalContext(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:220)");
        }
        androidx.compose.runtime.CompositionLocalContext compositionLocalContext = new androidx.compose.runtime.CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return compositionLocalContext;
    }

    public static final int getCurrentCompositeKeyHash(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final long getCurrentCompositeKeyHashCode(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-168259424, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long compositeKeyHashCode = composer.getCompositeKeyHashCode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return compositeKeyHashCode;
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m5298boximpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer)));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ReusableComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m5298boximpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer)));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m5298boximpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer)));
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 6) & 14));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ReusableComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m5298boximpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer)));
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 6) & 14));
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.runtime.SkippableUpdater<T>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m5298boximpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer)));
        function3.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(composer)), composer, java.lang.Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ReusableComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.runtime.SkippableUpdater<T>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m5298boximpl(androidx.compose.runtime.Updater.m5299constructorimpl(composer)));
        function3.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(composer)), composer, java.lang.Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final void invalidApplier() {
        throw new java.lang.IllegalStateException("Invalid applier".toString());
    }

    public static final androidx.compose.runtime.CompositionContext rememberCompositionContext(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        androidx.compose.runtime.CompositionContext buildContext = composer.buildContext();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return buildContext;
    }

    public static final <T> T remember(kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        T t = (T) composer.rememberedValue();
        if (t != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T invoke = function0.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }
}
