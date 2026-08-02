package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00120\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u0010*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/SavedStateRegistryOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "DisposableSaveableStateRegistry", "(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "", "id", "savedStateRegistryOwner", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "(Landroid/os/Bundle;)Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "[Ljava/lang/Class;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {
    private static final java.lang.Class<? extends java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};

    public static final androidx.compose.ui.platform.DisposableSaveableStateRegistry DisposableSaveableStateRegistry(android.view.View view, androidx.view.SavedStateRegistryOwner savedStateRegistryOwner) {
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "");
        android.view.View view2 = (android.view.View) parent;
        java.lang.Object tag = view2.getTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            str = java.lang.String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(str, savedStateRegistryOwner);
    }

    public static final androidx.compose.ui.platform.DisposableSaveableStateRegistry DisposableSaveableStateRegistry(java.lang.String str, androidx.view.SavedStateRegistryOwner savedStateRegistryOwner) {
        final boolean z;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(androidx.compose.runtime.saveable.SaveableStateRegistry.class.getSimpleName());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(str);
        final java.lang.String obj = sb.toString();
        final androidx.view.SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        android.os.Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(obj);
        final androidx.compose.runtime.saveable.SaveableStateRegistry SaveableStateRegistry = androidx.compose.runtime.saveable.SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey != null ? getHighSpeedVideoFpsRanges(consumeRestoredStateForKey) : null, new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.lang.Object obj2) {
                boolean highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.getHighSpeedVideoFpsRanges(obj2);
                return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
            }
        });
        try {
            savedStateRegistry.registerSavedStateProvider(obj, new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$$ExternalSyntheticLambda0
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final android.os.Bundle saveState() {
                    android.os.Bundle highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateRegistry.this);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
            z = true;
        } catch (java.lang.IllegalArgumentException unused) {
            z = false;
        }
        return new androidx.compose.ui.platform.DisposableSaveableStateRegistry(SaveableStateRegistry, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap() {
                if (z) {
                    savedStateRegistry.unregisterSavedStateProvider(obj);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Bundle getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry) {
        return getHighResolutionOutputSizeshNQ4ISI(saveableStateRegistry.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        while (obj instanceof androidx.compose.runtime.snapshots.SnapshotMutableState) {
            androidx.compose.runtime.snapshots.SnapshotMutableState snapshotMutableState = (androidx.compose.runtime.snapshots.SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            obj = snapshotMutableState.getValue();
            if (obj == null) {
                return true;
            }
        }
        if ((obj instanceof kotlin.Function) && (obj instanceof java.io.Serializable)) {
            return false;
        }
        for (java.lang.Class<? extends java.lang.Object> cls : getHighResolutionOutputSizeshNQ4ISI) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> getHighSpeedVideoFpsRanges(android.os.Bundle bundle) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.String str : bundle.keySet()) {
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(parcelableArrayList, "");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    private static final android.os.Bundle getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<? extends java.lang.Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof java.util.ArrayList ? (java.util.ArrayList) value : new java.util.ArrayList<>(value));
        }
        return bundle;
    }
}
