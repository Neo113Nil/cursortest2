package androidx.compose.material;

/* compiled from: Swipeable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0002\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00182#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u001aH\u0007¢\u0006\u0002\u0010\u001f\u001aI\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00152\u0006\u0010!\u001a\u0002H\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020#0\u001a2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0001¢\u0006\u0002\u0010$\u001a-\u0010%\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00020&2\u0006\u0010'\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010(\u001a¹\u0001\u0010)\u001a\u00020*\"\u0004\b\u0000\u0010\u0002*\u00020*2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00020&2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u001e2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010028\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(1\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002030\u000f2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u0010\u0011\u001a\u000206H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108\"*\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"PreUpPostDownNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "T", "Landroidx/compose/material/SwipeableState;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "computeTarget", "", "offset", "lastValue", "anchors", "", "thresholds", "Lkotlin/Function2;", "velocity", "velocityThreshold", "findBounds", "", "rememberSwipeableState", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "rememberSwipeableStateFor", "value", "onValueChange", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "getOffset", "", "state", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "swipeable", "Landroidx/compose/ui/Modifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "to", "Landroidx/compose/material/ThresholdConfig;", "resistance", "Landroidx/compose/material/ResistanceConfig;", "Landroidx/compose/ui/unit/Dp;", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableKt {
    public static final /* synthetic */ java.lang.Float access$getOffset(java.util.Map map, java.lang.Object obj) {
        return getOffset(map, obj);
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(androidx.compose.material.SwipeableState swipeableState) {
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static final <T> androidx.compose.material.SwipeableState<T> rememberSwipeableState(final T initialValue, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1237755169);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberSwipeableState)P(2)472@19144L344:Swipeable.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(T it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj) {
                    return invoke((androidx.compose.material.SwipeableKt$rememberSwipeableState$1<T>) obj);
                }
            };
        }
        androidx.compose.material.SwipeableState<T> swipeableState = (androidx.compose.material.SwipeableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[0], (androidx.compose.runtime.saveable.Saver) androidx.compose.material.SwipeableState.INSTANCE.Saver(animationSpec, function1), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.material.SwipeableState<T>>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.material.SwipeableState<T> invoke() {
                return new androidx.compose.material.SwipeableState<>(initialValue, animationSpec, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static final <T> androidx.compose.material.SwipeableState<T> rememberSwipeableStateFor(final T value, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onValueChange, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1156387078);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberSwipeableStateFor)P(2,1)501@20311L169,508@20511L34,509@20550L162,514@20717L259:Swipeable.kt#jmzs0o");
        if ((i2 & 4) != 0) {
            animationSpec = androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.SwipeableState(value, animationSpec, new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(T it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj) {
                    return invoke((androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1<T>) obj);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.material.SwipeableState<T> swipeableState = (androidx.compose.material.SwipeableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        int i3 = i & 8;
        androidx.compose.runtime.EffectsKt.LaunchedEffect(value, mutableState.getValue(), new androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1(value, swipeableState, null), composer, (i & 14) | i3);
        androidx.compose.runtime.EffectsKt.DisposableEffect(swipeableState.getCurrentValue(), new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope DisposableEffect) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, swipeableState.getCurrentValue())) {
                    onValueChange.invoke(swipeableState.getCurrentValue());
                    mutableState.setValue(java.lang.Boolean.valueOf(!r2.getValue().booleanValue()));
                }
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, composer, i3);
        composer.endReplaceableGroup();
        return swipeableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Float> findBounds(float f, java.util.Set<java.lang.Float> set) {
        java.util.Set<java.lang.Float> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : set2) {
            if (((java.lang.Number) obj).floatValue() <= f + 0.001d) {
                arrayList.add(obj);
            }
        }
        java.lang.Float maxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : set2) {
            if (((java.lang.Number) obj2).floatValue() >= f - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        java.lang.Float minOrNull = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList2);
        if (maxOrNull == null) {
            return kotlin.collections.CollectionsKt.listOfNotNull(minOrNull);
        }
        if (minOrNull == null) {
            return kotlin.collections.CollectionsKt.listOf(maxOrNull);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(maxOrNull, minOrNull) ? kotlin.collections.CollectionsKt.listOf(maxOrNull) : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Float[]{maxOrNull, minOrNull});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float computeTarget(float f, float f2, java.util.Set<java.lang.Float> set, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> function2, float f3, float f4) {
        java.util.List<java.lang.Float> findBounds = findBounds(f, set);
        int size = findBounds.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return findBounds.get(0).floatValue();
        }
        float floatValue = findBounds.get(0).floatValue();
        float floatValue2 = findBounds.get(1).floatValue();
        if (f2 <= f) {
            if (f3 >= f4) {
                return floatValue2;
            }
        } else if (f3 <= (-f4)) {
            return floatValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> java.lang.Float getOffset(java.util.Map<java.lang.Float, ? extends T> map, T t) {
        T t2;
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map.Entry) t2).getValue(), t)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) t2;
        if (entry != null) {
            return (java.lang.Float) entry.getKey();
        }
        return null;
    }

    public static final <T> androidx.compose.ui.input.nestedscroll.NestedScrollConnection getPreUpPostDownNestedScrollConnection(androidx.compose.material.SwipeableState<T> swipeableState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swipeableState, "<this>");
        return new androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> androidx.compose.ui.Modifier m1521swipeablepPrIpRY(androidx.compose.ui.Modifier swipeable, final androidx.compose.material.SwipeableState<T> state, final java.util.Map<java.lang.Float, ? extends T> anchors, final androidx.compose.foundation.gestures.Orientation orientation, final boolean z, final boolean z2, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final kotlin.jvm.functions.Function2<? super T, ? super T, ? extends androidx.compose.material.ThresholdConfig> thresholds, final androidx.compose.material.ResistanceConfig resistanceConfig, final float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swipeable, "$this$swipeable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchors, "anchors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        return androidx.compose.ui.ComposedModifierKt.composed(swipeable, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", androidx.compose.material.SwipeableState.this);
                inspectorInfo.getProperties().set("anchors", anchors);
                inspectorInfo.getProperties().set("orientation", orientation);
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", java.lang.Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("thresholds", thresholds);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("velocityThreshold", androidx.compose.ui.unit.Dp.m4476boximpl(f));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier composed, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.ui.Modifier draggable;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(43594985);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C592@24745L7,594@24787L502:Swipeable.kt#jmzs0o");
                if (!(!anchors.isEmpty())) {
                    throw new java.lang.IllegalArgumentException("You must have at least one anchor.".toString());
                }
                if (kotlin.collections.CollectionsKt.distinct(anchors.values()).size() != anchors.size()) {
                    throw new java.lang.IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
                }
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localDensity);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                state.ensureInit$material_release(anchors);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(anchors, state, new androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass3(state, anchors, resistanceConfig, (androidx.compose.ui.unit.Density) consume, thresholds, f, null), composer, 8);
                draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(androidx.compose.ui.Modifier.INSTANCE, state.getDraggableState(), orientation, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : state.isAnimationRunning(), (r20 & 32) != 0 ? new androidx.compose.foundation.gestures.DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new androidx.compose.foundation.gestures.DraggableKt$draggable$2(null) : new androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4(state, null), (r20 & 128) != 0 ? false : z2);
                composer.endReplaceableGroup();
                return draggable;
            }

            /* compiled from: Swipeable.kt */
            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4, reason: invalid class name */
            static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ androidx.compose.material.SwipeableState<T> $state;
                /* synthetic */ float F$0;
                private /* synthetic */ java.lang.Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(androidx.compose.material.SwipeableState<T> swipeableState, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4> continuation) {
                    super(3, continuation);
                    this.$state = swipeableState;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return invoke(coroutineScope, f.floatValue(), continuation);
                }

                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4 anonymousClass4 = new androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4(this.$state, continuation);
                    anonymousClass4.L$0 = coroutineScope;
                    anonymousClass4.F$0 = f;
                    return anonymousClass4.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                /* compiled from: Swipeable.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_UNSUPPORTED_SIZE}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ androidx.compose.material.SwipeableState<T> $state;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(androidx.compose.material.SwipeableState<T> swipeableState, float f, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$state = swipeableState;
                        this.$velocity = f;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4.AnonymousClass1(this.$state, this.$velocity, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$state.performFling(this.$velocity, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.L$0, null, null, new androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass4.AnonymousClass1(this.$state, this.F$0, null), 3, null);
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* compiled from: Swipeable.kt */
            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3, reason: invalid class name */
            static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ java.util.Map<java.lang.Float, T> $anchors;
                final /* synthetic */ androidx.compose.ui.unit.Density $density;
                final /* synthetic */ androidx.compose.material.ResistanceConfig $resistance;
                final /* synthetic */ androidx.compose.material.SwipeableState<T> $state;
                final /* synthetic */ kotlin.jvm.functions.Function2<T, T, androidx.compose.material.ThresholdConfig> $thresholds;
                final /* synthetic */ float $velocityThreshold;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(androidx.compose.material.SwipeableState<T> swipeableState, java.util.Map<java.lang.Float, ? extends T> map, androidx.compose.material.ResistanceConfig resistanceConfig, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends androidx.compose.material.ThresholdConfig> function2, float f, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$state = swipeableState;
                    this.$anchors = map;
                    this.$resistance = resistanceConfig;
                    this.$density = density;
                    this.$thresholds = function2;
                    this.$velocityThreshold = f;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.material.SwipeableKt$swipeable$3.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.Map anchors$material_release = this.$state.getAnchors$material_release();
                        this.$state.setAnchors$material_release(this.$anchors);
                        this.$state.setResistance$material_release(this.$resistance);
                        androidx.compose.material.SwipeableState<T> swipeableState = this.$state;
                        final java.util.Map<java.lang.Float, T> map = this.$anchors;
                        final kotlin.jvm.functions.Function2<T, T, androidx.compose.material.ThresholdConfig> function2 = this.$thresholds;
                        final androidx.compose.ui.unit.Density density = this.$density;
                        swipeableState.setThresholds$material_release(new kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Float>() { // from class: androidx.compose.material.SwipeableKt.swipeable.3.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f, java.lang.Float f2) {
                                return invoke(f.floatValue(), f2.floatValue());
                            }

                            public final java.lang.Float invoke(float f, float f2) {
                                return java.lang.Float.valueOf(function2.invoke(kotlin.collections.MapsKt.getValue(map, java.lang.Float.valueOf(f)), kotlin.collections.MapsKt.getValue(map, java.lang.Float.valueOf(f2))).computeThreshold(density, f, f2));
                            }
                        });
                        this.$state.setVelocityThreshold$material_release(this.$density.mo315toPx0680j_4(this.$velocityThreshold));
                        this.label = 1;
                        if (this.$state.processNewAnchors$material_release(anchors$material_release, this.$anchors, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        });
    }
}
