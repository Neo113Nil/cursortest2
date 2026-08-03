package androidx.compose.runtime;

/* compiled from: Composables.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\\\u0010\u0012\u001a\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0015\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0087\b¢\u0006\u0002\u0010\u001f\u001ak\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010\"\u001a\u0091\u0001\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2$\b\b\u0010#\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b!¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010%\u001a\\\u0010&\u001a\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0015\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0087\b¢\u0006\u0002\u0010\u001f\u001ak\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010\"\u001a\u0091\u0001\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2$\b\b\u0010#\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b!¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010%\u001a+\u0010'\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010)\u001a+\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,2\u0013\b\u0004\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010-\u001a\b\u0010.\u001a\u00020\u0013H\u0001\u001a?\u0010(\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0016\u0010/\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001500\"\u0004\u0018\u00010\u00152\u0011\u00101\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u00102\u001a)\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u00105\u001a3\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001a\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u00107\u001a=\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u00108\u001a\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u00109\u001aG\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u00108\u001a\u0004\u0018\u00010\u00152\b\u0010:\u001a\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010;\u001aA\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0016\u0010/\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001500\"\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010<\u001a\r\u0010=\u001a\u00020>H\u0007¢\u0006\u0002\u0010?\"\u0011\u0010\u0000\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u00020\t8G¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006@"}, d2 = {"currentComposer", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentCompositeKeyHash", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositionLocalContext", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "ComposeNode", "", "T", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/Applier;", "factory", "Lkotlin/Function0;", "update", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Landroidx/compose/runtime/DisallowComposableCalls;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "skippableUpdate", "Landroidx/compose/runtime/SkippableUpdater;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "ReusableContent", com.ironsource.X3.i.W, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableContentHost", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "remember", "calculation", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "rememberCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposablesKt {
    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    public static final <T> T remember(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(obj);
        T t = (T) composer.rememberedValue();
        if (changed || t == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            t = function0.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    public static final <T> T remember(java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        T t = (T) composer.rememberedValue();
        if (changed || t == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            t = function0.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    public static final <T> T remember(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t = (T) composer.rememberedValue();
        if (changed || t == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            t = function0.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    public static final <T> T remember(java.lang.Object[] objArr, kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (java.lang.Object obj : objArr) {
            z |= composer.changed(obj);
        }
        T t = (T) composer.rememberedValue();
        if (z || t == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            t = function0.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    public static final <T> T key(java.lang.Object[] objArr, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends T> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-11941951);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(key)P(1)128@4658L7:Composables.kt#9igjgp");
        T invoke = function2.invoke(composer, java.lang.Integer.valueOf((i >> 3) & 14));
        composer.endReplaceableGroup();
        return invoke;
    }

    public static final void ReusableContent(java.lang.Object obj, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(444418301);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(ReusableContent)P(1)145@5313L9:Composables.kt#9igjgp");
        composer.startReusableGroup(207, obj);
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
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
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -554250212, "C:Composables.kt#9igjgp");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new kotlin.NotImplementedError("Implemented as an intrinsic");
    }

    public static final androidx.compose.runtime.RecomposeScope getCurrentRecomposeScope(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 394957799, "C:Composables.kt#9igjgp");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        androidx.compose.runtime.RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new java.lang.IllegalStateException("no recompose scope found".toString());
        }
        composer.recordUsed(recomposeScope);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return recomposeScope;
    }

    public static final androidx.compose.runtime.CompositionLocalContext getCurrentCompositionLocalContext(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-43352356);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:Composables.kt#9igjgp");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        androidx.compose.runtime.CompositionLocalContext compositionLocalContext = new androidx.compose.runtime.CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    public static final int getCurrentCompositeKeyHash(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ComposeNode(final kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1886828752);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(ComposeNode):Composables.kt#9igjgp");
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new kotlin.jvm.functions.Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt$ComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    return function0.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m1640boximpl(androidx.compose.runtime.Updater.m1641constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ReusableComposeNode(final kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1405779621);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new kotlin.jvm.functions.Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt$ReusableComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    return function0.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m1640boximpl(androidx.compose.runtime.Updater.m1641constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-548224868);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m1640boximpl(androidx.compose.runtime.Updater.m1641constructorimpl(composer)));
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ReusableComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-692256719);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(ReusableComposeNode)P(1,2)372@13941L9:Composables.kt#9igjgp");
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m1640boximpl(androidx.compose.runtime.Updater.m1641constructorimpl(composer)));
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.runtime.SkippableUpdater<T>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m1640boximpl(androidx.compose.runtime.Updater.m1641constructorimpl(composer)));
        function3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer)), composer, java.lang.Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final /* synthetic */ <T, E extends androidx.compose.runtime.Applier<?>> void ReusableComposeNode(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Updater<T>, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.runtime.SkippableUpdater<T>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Applier<?> applier = composer.getApplier();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (!(applier instanceof androidx.compose.runtime.Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(androidx.compose.runtime.Updater.m1640boximpl(androidx.compose.runtime.Updater.m1641constructorimpl(composer)));
        function3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer)), composer, java.lang.Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, java.lang.Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static final void invalidApplier() {
        throw new java.lang.IllegalStateException("Invalid applier".toString());
    }

    public static final androidx.compose.runtime.CompositionContext rememberCompositionContext(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1165786124);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberCompositionContext):Composables.kt#9igjgp");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        androidx.compose.runtime.CompositionContext buildContext = composer.buildContext();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buildContext;
    }

    public static final <T> T remember(kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        T t = (T) composer.rememberedValue();
        if (t == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            t = function0.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }
}
