package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR2\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00100\u001c\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "", "", "", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "canBeSaved", "(Ljava/lang/Object;)Z", "consumeRestored", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "performSave", "()Ljava/util/Map;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Landroidx/collection/MutableScatterMap;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableScatterMap;", "", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SaveableStateRegistryImpl implements androidx.compose.runtime.saveable.SaveableStateRegistry {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.MutableScatterMap<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> Camera2StreamConfigurationMap;
    private final androidx.collection.MutableScatterMap<java.lang.String, java.util.List<java.lang.Object>> getHighSpeedVideoFpsRangesFor;

    public SaveableStateRegistryImpl(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> map, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> function1) {
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = (map == null || map.isEmpty()) ? null : androidx.compose.runtime.saveable.SaveableStateRegistryKt.getHighSpeedVideoFpsRangesFor(map);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(java.lang.Object p0) {
        return this.getHighSpeedVideoSizes.invoke(p0).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.lang.Object consumeRestored(java.lang.String p0) {
        androidx.collection.MutableScatterMap<java.lang.String, java.util.List<java.lang.Object>> mutableScatterMap;
        androidx.collection.MutableScatterMap<java.lang.String, java.util.List<java.lang.Object>> mutableScatterMap2 = this.getHighSpeedVideoFpsRangesFor;
        java.util.List<java.lang.Object> remove = mutableScatterMap2 != null ? mutableScatterMap2.remove(p0) : null;
        java.util.List<java.lang.Object> list = remove;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (remove.size() > 1 && (mutableScatterMap = this.getHighSpeedVideoFpsRangesFor) != null) {
            mutableScatterMap.put(p0, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final androidx.compose.runtime.saveable.SaveableStateRegistry.Entry registerProvider(final java.lang.String p0, final kotlin.jvm.functions.Function0<? extends java.lang.Object> p1) {
        boolean highSpeedVideoFpsRangesFor;
        highSpeedVideoFpsRangesFor = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getHighSpeedVideoFpsRangesFor(p0);
        if (highSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalArgumentException("Registered key is empty or blank".toString());
        }
        final androidx.collection.MutableScatterMap<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> mutableScatterMap = this.Camera2StreamConfigurationMap;
        if (mutableScatterMap == null) {
            mutableScatterMap = androidx.collection.ScatterMapKt.mutableScatterMapOf();
            this.Camera2StreamConfigurationMap = mutableScatterMap;
        }
        java.util.ArrayList arrayList = mutableScatterMap.get(p0);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            mutableScatterMap.set(p0, arrayList);
        }
        arrayList.add(p1);
        return new androidx.compose.runtime.saveable.SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public final void unregister() {
                java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>> remove = mutableScatterMap.remove(p0);
                if (remove != null) {
                    remove.remove(p1);
                }
                java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>> list = remove;
                if (list == null || list.isEmpty()) {
                    return;
                }
                mutableScatterMap.set(p0, remove);
            }
        };
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        long[] jArr;
        java.lang.Object[] objArr;
        int i;
        long[] jArr2;
        java.lang.Object[] objArr2;
        int i2;
        androidx.collection.MutableScatterMap<java.lang.String, java.util.List<java.lang.Object>> mutableScatterMap = this.getHighSpeedVideoFpsRangesFor;
        if (mutableScatterMap == null && this.Camera2StreamConfigurationMap == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        int i3 = mutableScatterMap != null ? mutableScatterMap.get_size() : 0;
        androidx.collection.MutableScatterMap<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> mutableScatterMap2 = this.Camera2StreamConfigurationMap;
        java.util.HashMap hashMap = new java.util.HashMap(i3 + (mutableScatterMap2 != null ? mutableScatterMap2.get_size() : 0));
        androidx.collection.MutableScatterMap<java.lang.String, java.util.List<java.lang.Object>> mutableScatterMap3 = this.getHighSpeedVideoFpsRangesFor;
        char c = 7;
        long j = -9187201950435737472L;
        int i4 = 8;
        if (mutableScatterMap3 != null) {
            androidx.collection.MutableScatterMap<java.lang.String, java.util.List<java.lang.Object>> mutableScatterMap4 = mutableScatterMap3;
            java.lang.Object[] objArr3 = mutableScatterMap4.keys;
            java.lang.Object[] objArr4 = mutableScatterMap4.values;
            long[] jArr3 = mutableScatterMap4.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr3[i5];
                    if ((((~j2) << 7) & j2 & j) != j) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                hashMap.put((java.lang.String) objArr3[i8], (java.util.List) objArr4[i8]);
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    j = -9187201950435737472L;
                }
            }
        }
        androidx.collection.MutableScatterMap<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> mutableScatterMap5 = this.Camera2StreamConfigurationMap;
        if (mutableScatterMap5 != null) {
            androidx.collection.MutableScatterMap<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>> mutableScatterMap6 = mutableScatterMap5;
            java.lang.Object[] objArr5 = mutableScatterMap6.keys;
            java.lang.Object[] objArr6 = mutableScatterMap6.values;
            long[] jArr4 = mutableScatterMap6.metadata;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                while (true) {
                    long j3 = jArr4[i9];
                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                java.lang.Object obj = objArr5[i12];
                                java.util.List list = (java.util.List) objArr6[i12];
                                java.lang.String str = (java.lang.String) obj;
                                if (list.size() == 1) {
                                    java.lang.Object invoke = ((kotlin.jvm.functions.Function0) list.get(0)).invoke();
                                    if (invoke != null) {
                                        if (!canBeSaved(invoke)) {
                                            throw new java.lang.IllegalStateException(androidx.compose.runtime.saveable.RememberSaveableKt.generateCannotBeSavedErrorMessage(invoke).toString());
                                        }
                                        hashMap.put(str, kotlin.collections.CollectionsKt.arrayListOf(invoke));
                                    }
                                } else {
                                    java.util.HashMap hashMap2 = hashMap;
                                    int size = list.size();
                                    java.util.ArrayList arrayList = new java.util.ArrayList(size);
                                    jArr2 = jArr4;
                                    int i13 = 0;
                                    while (i13 < size) {
                                        java.lang.Object[] objArr7 = objArr5;
                                        java.lang.Object invoke2 = ((kotlin.jvm.functions.Function0) list.get(i13)).invoke();
                                        if (invoke2 != null && !canBeSaved(invoke2)) {
                                            throw new java.lang.IllegalStateException(androidx.compose.runtime.saveable.RememberSaveableKt.generateCannotBeSavedErrorMessage(invoke2).toString());
                                        }
                                        arrayList.add(invoke2);
                                        i13++;
                                        objArr5 = objArr7;
                                    }
                                    objArr2 = objArr5;
                                    hashMap2.put(str, arrayList);
                                    i2 = 8;
                                    j3 >>= i2;
                                    i11++;
                                    i4 = i2;
                                    jArr4 = jArr2;
                                    objArr5 = objArr2;
                                }
                            }
                            jArr2 = jArr4;
                            objArr2 = objArr5;
                            i2 = i4;
                            j3 >>= i2;
                            i11++;
                            i4 = i2;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i = i4;
                        if (i10 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i = i4;
                    }
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    i4 = i;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    c = 7;
                }
            }
        }
        return hashMap;
    }
}
