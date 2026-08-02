package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0010\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0015\u001a\u00020\u000b*\u00020\u00142&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R4\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\"\u0004\b\u001c\u0010\u001eR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "", "", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p1", "SaveableStateProvider", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRanges", "()Ljava/util/Map;", "removeState", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Ljava/lang/Object;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SaveableStateHolderImpl implements androidx.compose.runtime.saveable.SaveableStateHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.saveable.SaveableStateHolderImpl.Companion INSTANCE = new androidx.compose.runtime.saveable.SaveableStateHolderImpl.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.runtime.saveable.SaveableStateHolderImpl, ?> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.Map highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.saveable.SaveableStateHolderImpl.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.saveable.SaveableStateHolderImpl) obj2);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.runtime.saveable.SaveableStateHolderImpl highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.runtime.saveable.SaveableStateHolderImpl.getHighSpeedVideoFpsRangesFor((java.util.Map) obj);
            return highSpeedVideoFpsRangesFor;
        }
    });

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.runtime.saveable.SaveableStateRegistry> getHighSpeedVideoFpsRangesFor;
    private androidx.compose.runtime.saveable.SaveableStateRegistry getHighSpeedVideoSizes;

    private SaveableStateHolderImpl(java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> map) {
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterMapKt.mutableScatterMapOf();
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.saveable.SaveableStateHolderImpl.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateHolderImpl.this, obj);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        };
    }

    public /* synthetic */ SaveableStateHolderImpl(java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
    }

    public final void getHighSpeedVideoSizes(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry) {
        this.getHighSpeedVideoSizes = saveableStateRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl, java.lang.Object obj) {
        androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry = saveableStateHolderImpl.getHighSpeedVideoSizes;
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void SaveableStateProvider(final java.lang.Object obj, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(533563200);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            startRestartGroup.startReusableGroup(207, obj);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.invoke(obj).booleanValue()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Type of the key ");
                    sb.append(obj);
                    sb.append(" is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
                androidx.compose.runtime.saveable.SaveableStateRegistryWrapper saveableStateRegistryWrapper = new androidx.compose.runtime.saveable.SaveableStateRegistryWrapper(androidx.compose.runtime.saveable.SaveableStateRegistryKt.SaveableStateRegistry(this.Camera2StreamConfigurationMap.get(obj), this.getHighResolutionOutputSizeshNQ4ISI));
                startRestartGroup.updateRememberedValue(saveableStateRegistryWrapper);
                rememberedValue = saveableStateRegistryWrapper;
            }
            final androidx.compose.runtime.saveable.SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = (androidx.compose.runtime.saveable.SaveableStateRegistryWrapper) rememberedValue;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistryWrapper2), androidx.view.compose.LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(saveableStateRegistryWrapper2)}, function2, startRestartGroup, (i2 & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(this);
            boolean changedInstance2 = startRestartGroup.changedInstance(obj);
            boolean changedInstance3 = startRestartGroup.changedInstance(saveableStateRegistryWrapper2);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2 | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        androidx.compose.runtime.DisposableEffectResult highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.runtime.saveable.SaveableStateHolderImpl.getHighSpeedVideoSizes(androidx.compose.runtime.saveable.SaveableStateHolderImpl.this, obj, saveableStateRegistryWrapper2);
                        return highSpeedVideoSizes;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 6);
            startRestartGroup.endReusableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.runtime.saveable.SaveableStateHolderImpl.getHighSpeedVideoFpsRanges(androidx.compose.runtime.saveable.SaveableStateHolderImpl.this, obj, function2, i, (androidx.compose.runtime.Composer) obj2);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoSizes(final androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl, final java.lang.Object obj, final androidx.compose.runtime.saveable.SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
        if (saveableStateHolderImpl.getHighSpeedVideoFpsRangesFor.contains(obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key ");
            sb.append(obj);
            sb.append(" was used multiple times ");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        saveableStateHolderImpl.Camera2StreamConfigurationMap.remove(obj);
        saveableStateHolderImpl.getHighSpeedVideoFpsRangesFor.set(obj, saveableStateRegistryWrapper);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$lambda$0$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.collection.MutableScatterMap mutableScatterMap;
                java.util.Map map;
                mutableScatterMap = androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.getHighSpeedVideoFpsRangesFor;
                java.lang.Object remove = mutableScatterMap.remove(obj);
                androidx.compose.runtime.saveable.SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = saveableStateRegistryWrapper;
                if (remove == saveableStateRegistryWrapper2) {
                    map = androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.Camera2StreamConfigurationMap;
                    androidx.compose.runtime.saveable.SaveableStateHolderImpl.getHighSpeedVideoFpsRangesFor(saveableStateRegistryWrapper2, map, obj);
                }
            }
        };
    }

    private final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> getHighSpeedVideoFpsRanges() {
        java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> map = this.Camera2StreamConfigurationMap;
        androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.runtime.saveable.SaveableStateRegistry> mutableScatterMap = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.saveable.SaveableStateRegistry) objArr2[i4], map, objArr[i4]);
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
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(java.lang.Object p0) {
        if (this.getHighSpeedVideoFpsRangesFor.remove(p0) == null) {
            this.Camera2StreamConfigurationMap.remove(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> map, java.lang.Object obj) {
        java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave = saveableStateRegistry.performSave();
        if (performSave.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, performSave);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.runtime.saveable.SaveableStateHolderImpl, ?> getSaver() {
            return androidx.compose.runtime.saveable.SaveableStateHolderImpl.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl) {
        return saveableStateHolderImpl.getHighSpeedVideoFpsRanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.saveable.SaveableStateHolderImpl getHighSpeedVideoFpsRangesFor(java.util.Map map) {
        return new androidx.compose.runtime.saveable.SaveableStateHolderImpl(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl, java.lang.Object obj, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        saveableStateHolderImpl.SaveableStateProvider(obj, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
