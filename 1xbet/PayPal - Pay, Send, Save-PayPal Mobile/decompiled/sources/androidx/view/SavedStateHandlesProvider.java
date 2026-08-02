package androidx.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0016\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001a8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "saveState", "()Landroid/os/Bundle;", "", "performRestore", "()V", "", "key", "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "getHighSpeedVideoFpsRanges", "Landroidx/savedstate/SavedStateRegistry;", "", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes", "Landroid/os/Bundle;", "Landroidx/lifecycle/SavedStateHandlesVM;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "()Landroidx/lifecycle/SavedStateHandlesVM;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateHandlesProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final androidx.view.SavedStateRegistry getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.os.Bundle getHighSpeedVideoFpsRangesFor;

    public SavedStateHandlesProvider(androidx.view.SavedStateRegistry savedStateRegistry, final androidx.view.ViewModelStoreOwner viewModelStoreOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        this.getHighSpeedVideoFpsRanges = savedStateRegistry;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.SavedStateHandlesProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.view.SavedStateHandlesVM savedStateHandlesVM;
                savedStateHandlesVM = androidx.view.SavedStateHandleSupport.getSavedStateHandlesVM(androidx.view.ViewModelStoreOwner.this);
                return savedStateHandlesVM;
            }
        });
    }

    private final androidx.view.SavedStateHandlesVM getHighSpeedVideoFpsRangesFor() {
        return (androidx.view.SavedStateHandlesVM) this.Camera2StreamConfigurationMap.getValue();
    }

    public final void performRestore() {
        kotlin.Pair[] pairArr;
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        android.os.Bundle consumeRestoredStateForKey = this.getHighSpeedVideoFpsRanges.consumeRestoredStateForKey(androidx.view.SavedStateHandleSupport.SAVED_STATE_KEY);
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        android.os.Bundle bundle = this.getHighSpeedVideoFpsRangesFor;
        if (bundle != null) {
            androidx.view.SavedStateWriter.m9386putAllimpl(m9382constructorimpl, bundle);
        }
        if (consumeRestoredStateForKey != null) {
            androidx.view.SavedStateWriter.m9386putAllimpl(m9382constructorimpl, consumeRestoredStateForKey);
        }
        this.getHighSpeedVideoFpsRangesFor = bundleOf;
        this.getHighSpeedVideoSizes = true;
        getHighSpeedVideoFpsRangesFor();
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String key) {
        kotlin.Pair[] pairArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        performRestore();
        android.os.Bundle bundle = this.getHighSpeedVideoFpsRangesFor;
        if (bundle == null || !androidx.view.SavedStateReader.m9297containsimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), key)) {
            return null;
        }
        android.os.Bundle m9358getSavedStateOrNullimpl = androidx.view.SavedStateReader.m9358getSavedStateOrNullimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), key);
        if (m9358getSavedStateOrNullimpl == null) {
            java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
            if (emptyMap.isEmpty()) {
                pairArr = new kotlin.Pair[0];
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
                for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                    arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
                }
                pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
            }
            m9358getSavedStateOrNullimpl = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
            androidx.view.SavedStateWriter.m9382constructorimpl(m9358getSavedStateOrNullimpl);
        }
        androidx.view.SavedStateWriter.m9418removeimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle), key);
        if (androidx.view.SavedStateReader.m9374isEmptyimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle))) {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        return m9358getSavedStateOrNullimpl;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final android.os.Bundle saveState() {
        kotlin.Pair[] pairArr;
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        android.os.Bundle bundle = this.getHighSpeedVideoFpsRangesFor;
        if (bundle != null) {
            androidx.view.SavedStateWriter.m9386putAllimpl(m9382constructorimpl, bundle);
        }
        for (java.util.Map.Entry<java.lang.String, androidx.view.SavedStateHandle> entry2 : getHighSpeedVideoFpsRangesFor().getHandles().entrySet()) {
            java.lang.String key = entry2.getKey();
            android.os.Bundle saveState = entry2.getValue().savedStateProvider().saveState();
            if (!androidx.view.SavedStateReader.m9374isEmptyimpl(androidx.view.SavedStateReader.m9296constructorimpl(saveState))) {
                androidx.view.SavedStateWriter.m9409putSavedStateimpl(m9382constructorimpl, key, saveState);
            }
        }
        this.getHighSpeedVideoSizes = false;
        return bundleOf;
    }
}
