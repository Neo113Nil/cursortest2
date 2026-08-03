package androidx.compose.foundation.lazy.layout;

/* compiled from: LazySaveableStateHolder.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B/\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0002\u0010\u000bJ(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0002\b\u001bH\u0017¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0096\u0001J\u0013\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0096\u0001J\u001c\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0005H\u0016J!\u0010\"\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001aH\u0096\u0001J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "parentRegistry", "restoredValues", "", "", "", "", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;)V", "wrappedRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "previouslyComposedKeys", "", "<set-?>", "wrappedHolder", "getWrappedHolder", "()Landroidx/compose/runtime/saveable/SaveableStateHolder;", "setWrappedHolder", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;)V", "wrappedHolder$delegate", "Landroidx/compose/runtime/MutableState;", "SaveableStateProvider", "", com.ironsource.X3.i.W, "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "canBeSaved", "", "value", "consumeRestored", "performSave", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "removeState", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazySaveableStateHolder implements androidx.compose.runtime.saveable.SaveableStateRegistry, androidx.compose.runtime.saveable.SaveableStateHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion(null);
    private final java.util.Set<java.lang.Object> previouslyComposedKeys;

    /* renamed from: wrappedHolder$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState wrappedHolder;
    private final androidx.compose.runtime.saveable.SaveableStateRegistry wrappedRegistry;

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(java.lang.Object value) {
        return this.wrappedRegistry.canBeSaved(value);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public java.lang.Object consumeRestored(java.lang.String key) {
        return this.wrappedRegistry.consumeRestored(key);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public androidx.compose.runtime.saveable.SaveableStateRegistry.Entry registerProvider(java.lang.String key, kotlin.jvm.functions.Function0<? extends java.lang.Object> valueProvider) {
        return this.wrappedRegistry.registerProvider(key, valueProvider);
    }

    public LazySaveableStateHolder(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry) {
        this.wrappedRegistry = saveableStateRegistry;
        this.wrappedHolder = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previouslyComposedKeys = new java.util.LinkedHashSet();
    }

    public LazySaveableStateHolder(final androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map) {
        this(androidx.compose.runtime.saveable.SaveableStateRegistryKt.SaveableStateRegistry(map, new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.lang.Object obj) {
                androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry2 = androidx.compose.runtime.saveable.SaveableStateRegistry.this;
                return java.lang.Boolean.valueOf(saveableStateRegistry2 != null ? saveableStateRegistry2.canBeSaved(obj) : true);
            }
        }));
    }

    public final androidx.compose.runtime.saveable.SaveableStateHolder getWrappedHolder() {
        return (androidx.compose.runtime.saveable.SaveableStateHolder) this.wrappedHolder.getValue();
    }

    public final void setWrappedHolder(androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder) {
        this.wrappedHolder.setValue(saveableStateHolder);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        androidx.compose.runtime.saveable.SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            java.util.Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                wrappedHolder.removeState(it.next());
            }
        }
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final java.lang.Object obj, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-697180401);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SaveableStateProvider)P(1)84@3453L35,85@3497L159:LazySaveableStateHolder.kt#wow0x6");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-697180401, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        androidx.compose.runtime.saveable.SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder == null) {
            throw new java.lang.IllegalArgumentException("null wrappedHolder".toString());
        }
        wrappedHolder.SaveableStateProvider(obj, function2, startRestartGroup, (i & 112) | com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION);
        androidx.compose.runtime.EffectsKt.DisposableEffect(obj, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                java.util.Set set;
                set = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.this.previouslyComposedKeys;
                set.remove(obj);
                final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder lazySaveableStateHolder = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.this;
                final java.lang.Object obj2 = obj;
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        java.util.Set set2;
                        set2 = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.this.previouslyComposedKeys;
                        set2.add(obj2);
                    }
                };
            }
        }, startRestartGroup, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$3
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
                    androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.this.SaveableStateProvider(obj, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(java.lang.Object key) {
        androidx.compose.runtime.saveable.SaveableStateHolder wrappedHolder = getWrappedHolder();
        if (wrappedHolder == null) {
            throw new java.lang.IllegalArgumentException("null wrappedHolder".toString());
        }
        wrappedHolder.removeState(key);
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "()V", "saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "", "", "", "parentRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.layout.LazySaveableStateHolder, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> saver(final androidx.compose.runtime.saveable.SaveableStateRegistry parentRegistry) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.foundation.lazy.layout.LazySaveableStateHolder, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>>>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$1
                @Override // kotlin.jvm.functions.Function2
                public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.lazy.layout.LazySaveableStateHolder lazySaveableStateHolder) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave = lazySaveableStateHolder.performSave();
                    if (performSave.isEmpty()) {
                        return null;
                    }
                    return performSave;
                }
            }, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>>, androidx.compose.foundation.lazy.layout.LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder invoke(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map) {
                    return new androidx.compose.foundation.lazy.layout.LazySaveableStateHolder(androidx.compose.runtime.saveable.SaveableStateRegistry.this, map);
                }
            });
        }
    }
}
