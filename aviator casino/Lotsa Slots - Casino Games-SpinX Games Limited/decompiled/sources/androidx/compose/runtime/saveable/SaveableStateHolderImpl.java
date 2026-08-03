package androidx.compose.runtime.saveable;

/* compiled from: SaveableStateHolder.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB/\u0012(\b\u0002\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003¢\u0006\u0002\u0010\bJ(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0002\b\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J*\u0010\u0019\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0010R\u00020\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "savedStates", "", "", "", "", "", "(Ljava/util/Map;)V", "parentSaveableStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getParentSaveableStateRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "setParentSaveableStateRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "registryHolders", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "SaveableStateProvider", "", com.ironsource.X3.i.W, "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "removeState", "saveAll", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "RegistryHolder", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaveableStateHolderImpl implements androidx.compose.runtime.saveable.SaveableStateHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.saveable.SaveableStateHolderImpl.Companion INSTANCE = new androidx.compose.runtime.saveable.SaveableStateHolderImpl.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.runtime.saveable.SaveableStateHolderImpl, ?> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.runtime.saveable.SaveableStateHolderImpl, java.util.Map<java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>>>>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl) {
            java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> saveAll;
            saveAll = saveableStateHolderImpl.saveAll();
            return saveAll;
        }
    }, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>>>, androidx.compose.runtime.saveable.SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.runtime.saveable.SaveableStateHolderImpl invoke(java.util.Map<java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>>> map) {
            return invoke2((java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>>) map);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final androidx.compose.runtime.saveable.SaveableStateHolderImpl invoke2(java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> map) {
            return new androidx.compose.runtime.saveable.SaveableStateHolderImpl(map);
        }
    });
    private androidx.compose.runtime.saveable.SaveableStateRegistry parentSaveableStateRegistry;
    private final java.util.Map<java.lang.Object, androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder> registryHolders;
    private final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> savedStates;

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SaveableStateHolderImpl(java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new java.util.LinkedHashMap();
    }

    public /* synthetic */ SaveableStateHolderImpl(java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
    }

    public final androidx.compose.runtime.saveable.SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void setParentSaveableStateRegistry(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final java.lang.Object obj, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1198538093);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SaveableStateProvider)P(1)75@2967L923:SaveableStateHolder.kt#r2ddri");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1198538093, i, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        startRestartGroup.startReplaceableGroup(444418301);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableContent)P(1)145@5313L9:Composables.kt#9igjgp");
        startRestartGroup.startReusableGroup(207, obj);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1516495192, "C76@3023L321,83@3357L150,87@3520L360:SaveableStateHolder.kt#r2ddri");
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.runtime.saveable.SaveableStateRegistry parentSaveableStateRegistry = getParentSaveableStateRegistry();
            if (parentSaveableStateRegistry != null && !parentSaveableStateRegistry.canBeSaved(obj)) {
                throw new java.lang.IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            rememberedValue = new androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder(obj);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder registryHolder = (androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder) rememberedValue;
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registryHolder.getRegistry()), function2, startRestartGroup, i & 112);
        androidx.compose.runtime.EffectsKt.DisposableEffect(kotlin.Unit.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                java.util.Map map;
                java.util.Map map2;
                map = androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.registryHolders;
                boolean z = !map.containsKey(obj);
                java.lang.Object obj2 = obj;
                if (z) {
                    androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.savedStates.remove(obj);
                    map2 = androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.registryHolders;
                    map2.put(obj, registryHolder);
                    final androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder registryHolder2 = registryHolder;
                    final androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl = androidx.compose.runtime.saveable.SaveableStateHolderImpl.this;
                    final java.lang.Object obj3 = obj;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            java.util.Map map3;
                            androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder.this.saveTo(saveableStateHolderImpl.savedStates);
                            map3 = saveableStateHolderImpl.registryHolders;
                            map3.remove(obj3);
                        }
                    };
                }
                throw new java.lang.IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            }
        }, startRestartGroup, 6);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReusableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                    androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.SaveableStateProvider(obj, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> saveAll() {
        java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> mutableMap = kotlin.collections.MapsKt.toMutableMap(this.savedStates);
        java.util.Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder) it.next()).saveTo(mutableMap);
        }
        if (mutableMap.isEmpty()) {
            return null;
        }
        return mutableMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(java.lang.Object key) {
        androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder registryHolder = this.registryHolders.get(key);
        if (registryHolder != null) {
            registryHolder.setShouldSave(false);
        } else {
            this.savedStates.remove(key);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J.\u0010\u0010\u001a\u00020\u00112&\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00140\u0013R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", com.ironsource.X3.i.W, "(Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "shouldSave", "", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "saveTo", "", "map", "", "", "", "", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RegistryHolder {
        private final java.lang.Object key;
        private final androidx.compose.runtime.saveable.SaveableStateRegistry registry;
        private boolean shouldSave = true;

        public RegistryHolder(java.lang.Object obj) {
            this.key = obj;
            this.registry = androidx.compose.runtime.saveable.SaveableStateRegistryKt.SaveableStateRegistry((java.util.Map) androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.savedStates.get(obj), new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$RegistryHolder$registry$1
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(java.lang.Object obj2) {
                    androidx.compose.runtime.saveable.SaveableStateRegistry parentSaveableStateRegistry = androidx.compose.runtime.saveable.SaveableStateHolderImpl.this.getParentSaveableStateRegistry();
                    return java.lang.Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj2) : true);
                }
            });
        }

        public final java.lang.Object getKey() {
            return this.key;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void setShouldSave(boolean z) {
            this.shouldSave = z;
        }

        public final androidx.compose.runtime.saveable.SaveableStateRegistry getRegistry() {
            return this.registry;
        }

        public final void saveTo(java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> map) {
            if (this.shouldSave) {
                java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave = this.registry.performSave();
                if (performSave.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, performSave);
                }
            }
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.runtime.saveable.SaveableStateHolderImpl, ?> getSaver() {
            return androidx.compose.runtime.saveable.SaveableStateHolderImpl.Saver;
        }
    }
}
