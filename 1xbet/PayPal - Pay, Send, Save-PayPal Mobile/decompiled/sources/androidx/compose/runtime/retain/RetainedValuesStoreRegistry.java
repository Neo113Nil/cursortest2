package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\u00062\u0019\u0010\u0010\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/retain/RetainedValuesStoreRegistry;", "", "<init>", "()V", "key", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "LocalRetainedValuesStoreProvider", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "clearChild", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "predicate", "clearChildren", "(Lkotlin/jvm/functions/Function1;)V", "dispose", "getHighSpeedVideoFpsRanges", "Z", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableScatterMap;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetainedValuesStoreRegistry {
    public static final int $stable = 8;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.runtime.retain.ManagedRetainedValuesStore> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.MutableScatterMap<>(0, 1, null);

    /* renamed from: $r8$lambda$0TDJxZxBmstGt9eD4l-tJ1PGdsA, reason: not valid java name */
    public static /* synthetic */ boolean m5440$r8$lambda$0TDJxZxBmstGt9eD4ltJ1PGdsA(java.lang.Object obj) {
        return true;
    }

    public final void LocalRetainedValuesStoreProvider(final java.lang.Object obj, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1626630244);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-1626630244, i2, -1, "androidx.compose.runtime.retain.RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider (RetainedValuesStoreRegistry.kt:70)");
            }
            if (this.getHighSpeedVideoFpsRanges) {
                androidx.compose.runtime.retain.impl.PreconditionsKt.throwIllegalStateException("Cannot get a RetainedValuesStore after a RetainedValuesStoreRegistry has been disposed.");
            }
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.runtime.retain.ManagedRetainedValuesStore> mutableScatterMap = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.runtime.retain.ManagedRetainedValuesStore managedRetainedValuesStore = mutableScatterMap.get(obj);
            if (managedRetainedValuesStore == null) {
                managedRetainedValuesStore = new androidx.compose.runtime.retain.ManagedRetainedValuesStore();
                mutableScatterMap.set(obj, managedRetainedValuesStore);
            }
            androidx.compose.runtime.retain.LocalRetainedValuesStoreKt.LocalRetainedValuesStoreProvider(managedRetainedValuesStore, function2, startRestartGroup, i2 & 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.retain.RetainedValuesStoreRegistry$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.runtime.retain.RetainedValuesStoreRegistry.$r8$lambda$ZoRu00U7Oldg3ezgIA6p8GuTIyU(androidx.compose.runtime.retain.RetainedValuesStoreRegistry.this, obj, function2, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public final void clearChild(java.lang.Object key) {
        androidx.compose.runtime.retain.ManagedRetainedValuesStore remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(key);
        if (remove != null) {
            remove.dispose();
        }
    }

    public final void clearChildren(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> predicate) {
        androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.runtime.retain.ManagedRetainedValuesStore> mutableScatterMap = this.getHighResolutionOutputSizeshNQ4ISI;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = mutableScatterMap.keys[i4];
                        androidx.compose.runtime.retain.ManagedRetainedValuesStore managedRetainedValuesStore = (androidx.compose.runtime.retain.ManagedRetainedValuesStore) mutableScatterMap.values[i4];
                        java.lang.Boolean invoke = predicate.invoke(obj);
                        if (invoke.booleanValue()) {
                            managedRetainedValuesStore.dispose();
                        }
                        if (invoke.booleanValue()) {
                            mutableScatterMap.removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void dispose() {
        this.getHighSpeedVideoFpsRanges = true;
        clearChildren(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.retain.RetainedValuesStoreRegistry$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.runtime.retain.RetainedValuesStoreRegistry.m5440$r8$lambda$0TDJxZxBmstGt9eD4ltJ1PGdsA(obj));
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZoRu00U7Oldg3ezgIA6p8GuTIyU(androidx.compose.runtime.retain.RetainedValuesStoreRegistry retainedValuesStoreRegistry, java.lang.Object obj, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        retainedValuesStoreRegistry.LocalRetainedValuesStoreProvider(obj, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
