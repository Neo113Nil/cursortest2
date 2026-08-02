package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u0003R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "getOrCreateRetainedValuesStoreEntry", "(I)Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "", "onCleared", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableObjectList;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableIntObjectMap;", "getHighSpeedVideoFpsRanges", "RetainedValuesStoreEntry", "FrameEndScheduler"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleRetainedValuesStoreOwner extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<androidx.collection.MutableObjectList<androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry>> getHighSpeedVideoFpsRanges = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;", "", "Lkotlin/Function0;", "", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FrameEndScheduler {
        androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback(kotlin.jvm.functions.Function0<kotlin.Unit> action);
    }

    public final androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry getOrCreateRetainedValuesStoreEntry(int viewId) {
        java.lang.Object obj;
        androidx.collection.MutableIntObjectMap<androidx.collection.MutableObjectList<androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry>> mutableIntObjectMap = this.getHighSpeedVideoFpsRanges;
        androidx.collection.MutableObjectList<androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry> mutableObjectList = mutableIntObjectMap.get(viewId);
        if (mutableObjectList == null) {
            mutableObjectList = new androidx.collection.MutableObjectList<>(1);
            mutableIntObjectMap.set(viewId, mutableObjectList);
        }
        androidx.collection.MutableObjectList<androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry> mutableObjectList2 = mutableObjectList;
        androidx.collection.MutableObjectList<androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry> mutableObjectList3 = mutableObjectList2;
        java.lang.Object[] objArr = mutableObjectList3.content;
        int i = mutableObjectList3._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                obj = null;
                break;
            }
            obj = objArr[i2];
            if (!((androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry) obj).getIsInUse()) {
                break;
            }
            i2++;
        }
        androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = (androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry) obj;
        if (retainedValuesStoreEntry == null) {
            retainedValuesStoreEntry = new androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry();
            mutableObjectList2.add(retainedValuesStoreEntry);
        }
        retainedValuesStoreEntry.setInUse(true);
        return retainedValuesStoreEntry;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        androidx.collection.MutableIntObjectMap<androidx.collection.MutableObjectList<androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry>> mutableIntObjectMap = this.getHighSpeedVideoFpsRanges;
        int[] iArr = mutableIntObjectMap.keys;
        java.lang.Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
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
                        int i5 = iArr[i4];
                        androidx.collection.MutableObjectList mutableObjectList = (androidx.collection.MutableObjectList) objArr[i4];
                        java.lang.Object[] objArr2 = mutableObjectList.content;
                        int i6 = mutableObjectList._size;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry) objArr2[i7]).onCleared();
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

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@CX\u0083\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "", "<init>", "()V", "", "startRetainingExitedValues", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;", "frameEndScheduler", "stopRetainingExitedValues", "(Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;)V", "onCleared", "release", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStore;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStore;", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "retainedValuesStore", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "getRetainedValuesStore", "()Landroidx/compose/runtime/retain/RetainedValuesStore;", "", "isInUse", "Z", "()Z", "setInUse", "(Z)V", "Landroidx/compose/runtime/CancellationHandle;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/CancellationHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetainedValuesStoreEntry {
        public static final int $stable = 8;
        private final androidx.compose.ui.platform.LifecycleRetainedValuesStore getHighSpeedVideoFpsRanges;
        private androidx.compose.runtime.CancellationHandle getHighSpeedVideoSizes;
        private boolean isInUse;
        private final androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore;

        public RetainedValuesStoreEntry() {
            androidx.compose.ui.platform.LifecycleRetainedValuesStore lifecycleRetainedValuesStore = new androidx.compose.ui.platform.LifecycleRetainedValuesStore(null, 1, null);
            this.getHighSpeedVideoFpsRanges = lifecycleRetainedValuesStore;
            this.retainedValuesStore = lifecycleRetainedValuesStore;
        }

        public final androidx.compose.runtime.retain.RetainedValuesStore getRetainedValuesStore() {
            return this.retainedValuesStore;
        }

        /* renamed from: isInUse, reason: from getter */
        public final boolean getIsInUse() {
            return this.isInUse;
        }

        public final void setInUse(boolean z) {
            this.isInUse = z;
        }

        public final void startRetainingExitedValues() {
            if (!this.getHighSpeedVideoFpsRanges.isRetainingExitedValues()) {
                this.getHighSpeedVideoFpsRanges.startLifecycleTransition();
                return;
            }
            androidx.compose.runtime.CancellationHandle cancellationHandle = this.getHighSpeedVideoSizes;
            if (cancellationHandle != null) {
                cancellationHandle.cancel();
            }
            this.getHighSpeedVideoSizes = null;
        }

        public final void stopRetainingExitedValues(androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler) {
            androidx.compose.runtime.CancellationHandle cancellationHandle;
            if (this.getHighSpeedVideoFpsRanges.isRetainingExitedValues()) {
                try {
                    cancellationHandle = frameEndScheduler.scheduleFrameEndCallback(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            Camera2StreamConfigurationMap();
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void Camera2StreamConfigurationMap() {
                            androidx.compose.ui.platform.LifecycleRetainedValuesStore lifecycleRetainedValuesStore;
                            lifecycleRetainedValuesStore = androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry.this.getHighSpeedVideoFpsRanges;
                            lifecycleRetainedValuesStore.endLifecycleTransition();
                        }

                        {
                            super(0);
                        }
                    });
                } catch (java.util.concurrent.CancellationException unused) {
                    this.getHighSpeedVideoFpsRanges.endLifecycleTransition();
                    cancellationHandle = null;
                }
                androidx.compose.runtime.CancellationHandle cancellationHandle2 = this.getHighSpeedVideoSizes;
                if (cancellationHandle2 != null) {
                    cancellationHandle2.cancel();
                }
                this.getHighSpeedVideoSizes = cancellationHandle;
            }
        }

        public final void release() {
            this.isInUse = false;
        }

        public final void onCleared() {
            androidx.compose.runtime.CancellationHandle cancellationHandle = this.getHighSpeedVideoSizes;
            if (cancellationHandle != null) {
                cancellationHandle.cancel();
            }
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges.dispose();
        }
    }
}
