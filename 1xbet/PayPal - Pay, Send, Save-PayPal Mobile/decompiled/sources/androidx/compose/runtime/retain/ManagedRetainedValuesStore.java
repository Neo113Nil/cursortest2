package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J#\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "<init>", "()V", "", "enableRetainingExitedValues", "disableRetainingExitedValues", "dispose", "onContentExitComposition", "onContentEnteredComposition", "getHighResolutionOutputSizeshNQ4ISI", "", "key", "defaultValue", "consumeExitedValueOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "saveExitingValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/retain/impl/SafeMultiValueMap;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableScatterMap;", "isRetainingExitedValues", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ManagedRetainedValuesStore implements androidx.compose.runtime.retain.RetainedValuesStore {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoSizes = true;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.retain.impl.SafeMultiValueMap.m5445constructorimpl$default(null, 1, null);

    public final boolean isRetainingExitedValues() {
        return this.getHighSpeedVideoSizes && !this.Camera2StreamConfigurationMap;
    }

    public final void enableRetainingExitedValues() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.compose.runtime.retain.impl.PreconditionsKt.throwIllegalStateException("Cannot call enableRetainingExitedValues on a disposed store");
        }
        this.getHighSpeedVideoSizes = true;
    }

    public final void disableRetainingExitedValues() {
        this.getHighSpeedVideoSizes = false;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void dispose() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        disableRetainingExitedValues();
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void onContentExitComposition() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (!this.Camera2StreamConfigurationMap) {
            androidx.compose.runtime.retain.impl.PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!androidx.compose.runtime.retain.impl.SafeMultiValueMap.m5452isEmptyimpl(this.getHighSpeedVideoFpsRangesFor)) {
            androidx.compose.runtime.retain.impl.PreconditionsKt.throwIllegalStateException("Attempted to start retaining exited values with pending exited values");
        }
        this.Camera2StreamConfigurationMap = false;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void onContentEnteredComposition() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (this.Camera2StreamConfigurationMap) {
            androidx.compose.runtime.retain.impl.PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        getHighResolutionOutputSizeshNQ4ISI();
        this.Camera2StreamConfigurationMap = true;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> mutableScatterMap = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object[] objArr = mutableScatterMap.values;
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
                            java.lang.Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof androidx.collection.MutableObjectList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                                androidx.collection.MutableObjectList mutableObjectList = (androidx.collection.MutableObjectList) obj;
                                java.lang.Object[] objArr2 = mutableObjectList.content;
                                int i4 = mutableObjectList._size;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    java.lang.Object obj2 = objArr2[i5];
                                    if (obj2 instanceof androidx.compose.runtime.retain.RetainObserver) {
                                        ((androidx.compose.runtime.retain.RetainObserver) obj2).onRetired();
                                    }
                                }
                            } else if (obj instanceof androidx.compose.runtime.retain.RetainObserver) {
                                ((androidx.compose.runtime.retain.RetainObserver) obj).onRetired();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        androidx.compose.runtime.retain.impl.SafeMultiValueMap.m5443clearimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final java.lang.Object consumeExitedValueOrDefault(java.lang.Object key, java.lang.Object defaultValue) {
        return androidx.compose.runtime.retain.impl.SafeMultiValueMap.m5456removeLastimpl(this.getHighSpeedVideoFpsRangesFor, key, defaultValue);
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void saveExitingValue(java.lang.Object key, java.lang.Object value) {
        if (isRetainingExitedValues()) {
            androidx.compose.runtime.retain.impl.SafeMultiValueMap.m5441addimpl(this.getHighSpeedVideoFpsRangesFor, key, value);
        } else if (value instanceof androidx.compose.runtime.retain.RetainObserver) {
            ((androidx.compose.runtime.retain.RetainObserver) value).onRetired();
        }
    }
}
