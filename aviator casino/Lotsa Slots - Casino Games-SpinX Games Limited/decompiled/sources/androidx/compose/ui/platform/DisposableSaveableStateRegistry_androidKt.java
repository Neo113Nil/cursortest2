package androidx.compose.ui.platform;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a \u0010\u0011\u001a\u00020\u0012*\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00140\u0013H\u0002\u001a\"\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014\u0018\u00010\u0013*\u00020\u0012H\u0002\"\u001e\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0016"}, d2 = {"AcceptableClasses", "", "Ljava/lang/Class;", "", "[Ljava/lang/Class;", "DisposableSaveableStateRegistry", "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "id", "", "savedStateRegistryOwner", "canBeSavedToBundle", "", "value", "toBundle", "Landroid/os/Bundle;", "", "", "toMap", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {
    private static final java.lang.Class<? extends java.lang.Object>[] AcceptableClasses = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};

    public static final androidx.compose.ui.platform.DisposableSaveableStateRegistry DisposableSaveableStateRegistry(android.view.View view, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view2 = (android.view.View) parent;
        java.lang.Object tag = view2.getTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            str = java.lang.String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(str, savedStateRegistryOwner);
    }

    public static final androidx.compose.ui.platform.DisposableSaveableStateRegistry DisposableSaveableStateRegistry(java.lang.String str, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        final boolean z;
        final java.lang.String str2 = "SaveableStateRegistry:" + str;
        final androidx.savedstate.SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        android.os.Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str2);
        final androidx.compose.runtime.saveable.SaveableStateRegistry SaveableStateRegistry = androidx.compose.runtime.saveable.SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey != null ? toMap(consumeRestoredStateForKey) : null, new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.lang.Object obj) {
                boolean canBeSavedToBundle;
                canBeSavedToBundle = androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj);
                return java.lang.Boolean.valueOf(canBeSavedToBundle);
            }
        });
        try {
            savedStateRegistry.registerSavedStateProvider(str2, new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$$ExternalSyntheticLambda0
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final android.os.Bundle saveState() {
                    android.os.Bundle DisposableSaveableStateRegistry$lambda$0;
                    DisposableSaveableStateRegistry$lambda$0 = androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0(androidx.compose.runtime.saveable.SaveableStateRegistry.this);
                    return DisposableSaveableStateRegistry$lambda$0;
                }
            });
            z = true;
        } catch (java.lang.IllegalArgumentException unused) {
            z = false;
        }
        return new androidx.compose.ui.platform.DisposableSaveableStateRegistry(SaveableStateRegistry, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z) {
                    savedStateRegistry.unregisterSavedStateProvider(str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.os.Bundle DisposableSaveableStateRegistry$lambda$0(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry) {
        return toBundle(saveableStateRegistry.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.SnapshotMutableState) {
            androidx.compose.runtime.snapshots.SnapshotMutableState snapshotMutableState = (androidx.compose.runtime.snapshots.SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy()) {
                return false;
            }
            T value = snapshotMutableState.getValue();
            if (value == 0) {
                return true;
            }
            return canBeSavedToBundle(value);
        }
        if ((obj instanceof kotlin.Function) && (obj instanceof java.io.Serializable)) {
            return false;
        }
        for (java.lang.Class<? extends java.lang.Object> cls : AcceptableClasses) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> toMap(android.os.Bundle bundle) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.String str : bundle.keySet()) {
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.Intrinsics.checkNotNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    private static final android.os.Bundle toBundle(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<? extends java.lang.Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof java.util.ArrayList ? (java.util.ArrayList) value : new java.util.ArrayList<>(value));
        }
        return bundle;
    }
}
