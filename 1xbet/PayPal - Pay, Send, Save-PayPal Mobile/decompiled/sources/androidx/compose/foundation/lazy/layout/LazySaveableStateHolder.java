package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\fJ#\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "p0", "p1", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Landroidx/compose/runtime/saveable/SaveableStateHolder;)V", "", "", "", "", "p2", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Landroidx/compose/runtime/saveable/SaveableStateHolder;)V", "performSave", "()Ljava/util/Map;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "SaveableStateProvider", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "removeState", "(Ljava/lang/Object;)V", "", "canBeSaved", "(Ljava/lang/Object;)Z", "consumeRestored", "(Ljava/lang/String;)Ljava/lang/Object;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Landroidx/collection/MutableScatterSet;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableScatterSet;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazySaveableStateHolder implements androidx.compose.runtime.saveable.SaveableStateRegistry, androidx.compose.runtime.saveable.SaveableStateHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterSet<java.lang.Object> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.saveable.SaveableStateHolder getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.saveable.SaveableStateRegistry Camera2StreamConfigurationMap;

    private LazySaveableStateHolder(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder) {
        this.Camera2StreamConfigurationMap = saveableStateRegistry;
        this.getHighSpeedVideoFpsRanges = saveableStateHolder;
        this.getHighSpeedVideoSizes = androidx.collection.ScatterSetKt.mutableScatterSetOf();
    }

    public LazySaveableStateHolder(final androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder) {
        this(androidx.compose.runtime.saveable.SaveableStateRegistryKt.SaveableStateRegistry(map, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateRegistry.this, obj);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        }), saveableStateHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, java.lang.Object obj) {
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        androidx.collection.MutableScatterSet<java.lang.Object> mutableScatterSet = this.getHighSpeedVideoSizes;
        java.lang.Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.getHighSpeedVideoFpsRanges.removeState(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.Camera2StreamConfigurationMap.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void SaveableStateProvider(final java.lang.Object obj, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-858296452);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-858296452, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            this.getHighSpeedVideoFpsRanges.SaveableStateProvider(obj, function2, startRestartGroup, i2 & 126);
            boolean changedInstance = startRestartGroup.changedInstance(this);
            boolean changedInstance2 = startRestartGroup.changedInstance(obj);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        androidx.compose.runtime.DisposableEffectResult highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.this, obj);
                        return highSpeedVideoFpsRanges;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(obj, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.this, obj, function2, i, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRanges(final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder lazySaveableStateHolder, final java.lang.Object obj) {
        lazySaveableStateHolder.getHighSpeedVideoSizes.minusAssign((androidx.collection.MutableScatterSet<java.lang.Object>) obj);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.collection.MutableScatterSet mutableScatterSet;
                mutableScatterSet = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.this.getHighSpeedVideoSizes;
                mutableScatterSet.plusAssign((androidx.collection.MutableScatterSet) obj);
            }
        };
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(java.lang.Object p0) {
        this.getHighSpeedVideoFpsRanges.removeState(p0);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\n0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "parentRegistry", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "wrappedHolder", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "", "", "", "saver", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Landroidx/compose/runtime/saveable/SaveableStateHolder;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.layout.LazySaveableStateHolder, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> saver(final androidx.compose.runtime.saveable.SaveableStateRegistry parentRegistry, final androidx.compose.runtime.saveable.SaveableStateHolder wrappedHolder) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.Map highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.lazy.layout.LazySaveableStateHolder) obj2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.foundation.lazy.layout.LazySaveableStateHolder highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateRegistry.this, wrappedHolder, (java.util.Map) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.util.Map getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazySaveableStateHolder lazySaveableStateHolder) {
            java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave = lazySaveableStateHolder.performSave();
            if (performSave.isEmpty()) {
                return null;
            }
            return performSave;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, java.util.Map map) {
            return new androidx.compose.foundation.lazy.layout.LazySaveableStateHolder(saveableStateRegistry, map, saveableStateHolder);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final androidx.compose.runtime.saveable.SaveableStateRegistry.Entry registerProvider(java.lang.String p0, kotlin.jvm.functions.Function0<? extends java.lang.Object> p1) {
        return this.Camera2StreamConfigurationMap.registerProvider(p0, p1);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.lang.Object consumeRestored(java.lang.String p0) {
        return this.Camera2StreamConfigurationMap.consumeRestored(p0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(java.lang.Object p0) {
        return this.Camera2StreamConfigurationMap.canBeSaved(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazySaveableStateHolder lazySaveableStateHolder, java.lang.Object obj, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        lazySaveableStateHolder.SaveableStateProvider(obj, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
