package androidx.compose.runtime.saveable;

/* compiled from: SaveableStateRegistry.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0007\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u001c\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0003H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "restored", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "valueProviders", "", "Lkotlin/Function0;", "value", "consumeRestored", com.ironsource.X3.i.W, "performSave", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaveableStateRegistryImpl implements androidx.compose.runtime.saveable.SaveableStateRegistry {
    private final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> canBeSaved;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> restored;
    private final java.util.Map<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> valueProviders;

    public SaveableStateRegistryImpl(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> function1) {
        java.util.LinkedHashMap mutableMap;
        this.canBeSaved = function1;
        this.restored = (map == null || (mutableMap = kotlin.collections.MapsKt.toMutableMap(map)) == null) ? new java.util.LinkedHashMap() : mutableMap;
        this.valueProviders = new java.util.LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(java.lang.Object value) {
        return this.canBeSaved.invoke(value).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public java.lang.Object consumeRestored(java.lang.String key) {
        java.util.List<java.lang.Object> remove = this.restored.remove(key);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.restored.put(key, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public androidx.compose.runtime.saveable.SaveableStateRegistry.Entry registerProvider(final java.lang.String key, final kotlin.jvm.functions.Function0<? extends java.lang.Object> valueProvider) {
        if (!(!kotlin.text.StringsKt.isBlank(key))) {
            throw new java.lang.IllegalArgumentException("Registered key is empty or blank".toString());
        }
        java.util.Map<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> map = this.valueProviders;
        java.util.ArrayList arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map.put(key, arrayList);
        }
        arrayList.add(valueProvider);
        return new androidx.compose.runtime.saveable.SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                java.util.Map map2;
                java.util.Map map3;
                map2 = androidx.compose.runtime.saveable.SaveableStateRegistryImpl.this.valueProviders;
                java.util.List list = (java.util.List) map2.remove(key);
                if (list != null) {
                    list.remove(valueProvider);
                }
                if (list == null || !(!list.isEmpty())) {
                    return;
                }
                map3 = androidx.compose.runtime.saveable.SaveableStateRegistryImpl.this.valueProviders;
                map3.put(key, list);
            }
        };
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        java.util.Map<java.lang.String, java.util.List<java.lang.Object>> mutableMap = kotlin.collections.MapsKt.toMutableMap(this.restored);
        for (java.util.Map.Entry<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> entry : this.valueProviders.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>> value = entry.getValue();
            if (value.size() == 1) {
                java.lang.Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else {
                    if (!canBeSaved(invoke)) {
                        throw new java.lang.IllegalStateException("item can't be saved".toString());
                    }
                    mutableMap.put(key, kotlin.collections.CollectionsKt.arrayListOf(invoke));
                }
            } else {
                int size = value.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i = 0; i < size; i++) {
                    java.lang.Object invoke2 = value.get(i).invoke();
                    if (invoke2 != null && !canBeSaved(invoke2)) {
                        throw new java.lang.IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(invoke2);
                }
                mutableMap.put(key, arrayList);
            }
        }
        return mutableMap;
    }
}
