package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u001d\u0010!\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010'R(\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010'R.\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\t"}, d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "key", "", "contains", "(Ljava/lang/String;)Z", "T", "initialValue", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getMutableStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", "regular", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "mutableFlows", "getMutableFlows", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "getSavedStateProvider"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateHandleImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> mutableFlows;
    private final java.util.Map<java.lang.String, java.lang.Object> regular;
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider;

    public SavedStateHandleImpl(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.regular = kotlin.collections.MapsKt.toMutableMap(map);
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        this.mutableFlows = new java.util.LinkedHashMap();
        this.savedStateProvider = new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.internal.SavedStateHandleImpl$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final android.os.Bundle saveState() {
                return androidx.view.internal.SavedStateHandleImpl.m9170$r8$lambda$OwJNegmCu5Gt1ZLmTJOtaJJkzo(androidx.view.internal.SavedStateHandleImpl.this);
            }
        };
    }

    public /* synthetic */ SavedStateHandleImpl(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getRegular() {
        return this.regular;
    }

    public final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> getMutableFlows() {
        return this.mutableFlows;
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    public final boolean contains(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.regular.containsKey(key);
    }

    public final <T> kotlinx.coroutines.flow.StateFlow<T> getStateFlow(java.lang.String key, T initialValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> map = this.getHighSpeedVideoFpsRanges;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> mutableStateFlow = map.get(key);
        if (mutableStateFlow == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            mutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(this.regular.get(key));
            map.put(key, mutableStateFlow);
        }
        kotlinx.coroutines.flow.StateFlow<T> asStateFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(mutableStateFlow);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asStateFlow, "");
        return asStateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> kotlinx.coroutines.flow.MutableStateFlow<T> getMutableStateFlow(java.lang.String key, T initialValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> map = this.mutableFlows;
        java.lang.Object obj = map.get(key);
        if (obj == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            obj = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(this.regular.get(key));
            map.put(key, obj);
        }
        kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow = (kotlinx.coroutines.flow.MutableStateFlow) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableStateFlow, "");
        return mutableStateFlow;
    }

    public final java.util.Set<java.lang.String> keys() {
        return kotlin.collections.SetsKt.plus((java.util.Set) this.regular.keySet(), (java.lang.Iterable) this.Camera2StreamConfigurationMap.keySet());
    }

    public final <T> T get(java.lang.String key) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> mutableStateFlow = this.mutableFlows.get(key);
            return (mutableStateFlow == null || (t = (T) mutableStateFlow.getValue()) == null) ? (T) this.regular.get(key) : t;
        } catch (java.lang.ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final <T> void set(java.lang.String key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.regular.put(key, value);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> mutableStateFlow = this.getHighSpeedVideoFpsRanges.get(key);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(value);
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object> mutableStateFlow2 = this.mutableFlows.get(key);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(value);
        }
    }

    public final <T> T remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t = (T) this.regular.remove(key);
        this.getHighSpeedVideoFpsRanges.remove(key);
        this.mutableFlows.remove(key);
        return t;
    }

    public final void setSavedStateProvider(java.lang.String key, androidx.savedstate.SavedStateRegistry.SavedStateProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.Camera2StreamConfigurationMap.put(key, provider);
    }

    public final void clearSavedStateProvider(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.Camera2StreamConfigurationMap.remove(key);
    }

    /* renamed from: $r8$lambda$-OwJNegmCu5Gt1ZLmTJOtaJJkzo, reason: not valid java name */
    public static /* synthetic */ android.os.Bundle m9170$r8$lambda$OwJNegmCu5Gt1ZLmTJOtaJJkzo(androidx.view.internal.SavedStateHandleImpl savedStateHandleImpl) {
        kotlin.Pair[] pairArr;
        for (java.util.Map.Entry entry : kotlin.collections.MapsKt.toMap(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((java.lang.String) entry.getKey(), ((kotlinx.coroutines.flow.MutableStateFlow) entry.getValue()).getValue());
        }
        for (java.util.Map.Entry entry2 : kotlin.collections.MapsKt.toMap(savedStateHandleImpl.Camera2StreamConfigurationMap).entrySet()) {
            savedStateHandleImpl.set((java.lang.String) entry2.getKey(), ((androidx.savedstate.SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        java.util.Map<java.lang.String, java.lang.Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry3 : map.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        return bundleOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
