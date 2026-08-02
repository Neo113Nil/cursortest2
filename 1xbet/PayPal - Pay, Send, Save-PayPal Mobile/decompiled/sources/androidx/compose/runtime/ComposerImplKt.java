package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0000\u0010\f*\u00020\b\"\b\b\u0001\u0010\r*\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0017\u001a3\u0010\u0016\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0016\u0010\u001a\u001a+\u0010\u001b\u001a\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u000f\u001a\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u001d\u001a)\u0010\u0012\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u001e\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u001fH\u0002¢\u0006\u0004\b\n\u0010 \u001a\u0013\u0010\n\u001a\u00020\u001f*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010!\u001a#\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014*\u00020\"2\u0006\u0010\u0007\u001a\u00020#H\u0002¢\u0006\u0004\b\n\u0010$\u001a#\u0010\u001b\u001a\u00020\u0006*\u00020%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010&\u001a+\u0010\u000f\u001a\u00020\u0006*\u00020%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010'\"\u0018\u0010\u000f\u001a\u00020\b*\u00020(8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010)\"$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00150*j\b\u0012\u0004\u0012\u00020\u0015`+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,\"\u0014\u0010-\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b/\u0010."}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "deactivateCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "p0", "", "p1", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/SlotWriter;ILjava/lang/Object;)V", "K", "V", "Landroidx/compose/runtime/collection/MultiValueMap;", "getHighSpeedVideoFpsRangesFor", "(I)Landroidx/collection/MutableScatterMap;", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/Invalidation;", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;I)I", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "(Ljava/util/List;ILandroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)V", "getHighSpeedVideoSizes", "(Ljava/util/List;II)Landroidx/compose/runtime/Invalidation;", "(Ljava/util/List;I)Landroidx/compose/runtime/Invalidation;", "(Ljava/util/List;II)V", "", "(Z)I", "(I)Z", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;II)I", "(Landroidx/compose/runtime/SlotReader;III)I", "Landroidx/compose/runtime/KeyInfo;", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "Ljava/util/Comparator;", "rootKey", com.visa.cbp.getEncExpo.warmup, "nodeKey"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerImplKt {
    private static final java.util.Comparator<androidx.compose.runtime.Invalidation> getHighSpeedVideoFpsRangesFor = new java.util.Comparator() { // from class: androidx.compose.runtime.ComposerImplKt$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            int highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.ComposerImplKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.Invalidation) obj, (androidx.compose.runtime.Invalidation) obj2);
            return highResolutionOutputSizeshNQ4ISI;
        }
    };
    public static final int nodeKey = 125;
    public static final int rootKey = 100;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(int i) {
        return i != 0;
    }

    public static final void deactivateCurrentGroup(final androidx.compose.runtime.SlotWriter slotWriter, final androidx.compose.runtime.RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.ComposerImplKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.runtime.ComposerImplKt.Camera2StreamConfigurationMap(androidx.compose.runtime.RememberManager.this, slotWriter, ((java.lang.Integer) obj).intValue(), obj2);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.RememberManager rememberManager, androidx.compose.runtime.SlotWriter slotWriter, int i, java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
            rememberManager.deactivating((androidx.compose.runtime.ComposeNodeLifecycleCallback) obj);
        } else if (!(obj instanceof androidx.compose.runtime.ReusableRememberObserverHolder)) {
            if (obj instanceof androidx.compose.runtime.RememberObserverHolder) {
                Camera2StreamConfigurationMap(slotWriter, i, obj);
                rememberManager.forgetting((androidx.compose.runtime.RememberObserverHolder) obj);
            } else if (obj instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                Camera2StreamConfigurationMap(slotWriter, i, obj);
                ((androidx.compose.runtime.RecomposeScopeImpl) obj).release();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.runtime.SlotWriter slotWriter, int i, java.lang.Object obj) {
        java.lang.Object clear = slotWriter.clear(i);
        if (obj == clear) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Slot table is out of sync (expected ");
        sb.append(obj);
        sb.append(", got ");
        sb.append(clear);
        sb.append(')');
        androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> getHighSpeedVideoFpsRangesFor(int i) {
        return androidx.compose.runtime.collection.MultiValueMap.m5380constructorimpl(new androidx.collection.MutableScatterMap(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.compose.runtime.JoinedKey joinedKey = obj instanceof androidx.compose.runtime.JoinedKey ? (androidx.compose.runtime.JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(joinedKey.getLeft(), obj2) && kotlin.jvm.internal.Intrinsics.areEqual(joinedKey.getRight(), obj3)) {
            return obj;
        }
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(joinedKey.getLeft(), obj2, obj3);
        return highResolutionOutputSizeshNQ4ISI == null ? getHighResolutionOutputSizeshNQ4ISI(joinedKey.getRight(), obj2, obj3) : highResolutionOutputSizeshNQ4ISI;
    }

    private static final int getHighSpeedVideoFpsRanges(java.util.List<androidx.compose.runtime.Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = kotlin.jvm.internal.Intrinsics.compare(list.get(i3).getGetHighResolutionOutputSizeshNQ4ISI(), i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else {
                if (compare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.compose.runtime.Invalidation> list, int i) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(list, i);
        return highSpeedVideoFpsRanges < 0 ? -(highSpeedVideoFpsRanges + 1) : highSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(java.util.List<androidx.compose.runtime.Invalidation> list, int i, androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl, java.lang.Object obj) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(list, i);
        if (highSpeedVideoFpsRanges < 0) {
            int i2 = -(highSpeedVideoFpsRanges + 1);
            if (!(obj instanceof androidx.compose.runtime.DerivedState)) {
                obj = null;
            }
            list.add(i2, new androidx.compose.runtime.Invalidation(recomposeScopeImpl, i, obj));
            return;
        }
        androidx.compose.runtime.Invalidation invalidation = list.get(highSpeedVideoFpsRanges);
        if (obj instanceof androidx.compose.runtime.DerivedState) {
            java.lang.Object getHighSpeedVideoSizes = invalidation.getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes == null) {
                invalidation.getHighResolutionOutputSizeshNQ4ISI(obj);
                return;
            } else if (getHighSpeedVideoSizes instanceof androidx.collection.MutableScatterSet) {
                ((androidx.collection.MutableScatterSet) getHighSpeedVideoSizes).add(obj);
                return;
            } else {
                invalidation.getHighResolutionOutputSizeshNQ4ISI(androidx.collection.ScatterSetKt.mutableScatterSetOf(getHighSpeedVideoSizes, obj));
                return;
            }
        }
        invalidation.getHighResolutionOutputSizeshNQ4ISI(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.Invalidation getHighSpeedVideoSizes(java.util.List<androidx.compose.runtime.Invalidation> list, int i, int i2) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list, i);
        if (highResolutionOutputSizeshNQ4ISI >= list.size()) {
            return null;
        }
        androidx.compose.runtime.Invalidation invalidation = list.get(highResolutionOutputSizeshNQ4ISI);
        if (invalidation.getGetHighResolutionOutputSizeshNQ4ISI() < i2) {
            return invalidation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.Invalidation getHighSpeedVideoFpsRangesFor(java.util.List<androidx.compose.runtime.Invalidation> list, int i) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(list, i);
        if (highSpeedVideoFpsRanges >= 0) {
            return list.remove(highSpeedVideoFpsRanges);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.compose.runtime.Invalidation> list, int i, int i2) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list, i);
        while (highResolutionOutputSizeshNQ4ISI < list.size() && list.get(highResolutionOutputSizeshNQ4ISI).getGetHighResolutionOutputSizeshNQ4ISI() < i2) {
            list.remove(highResolutionOutputSizeshNQ4ISI);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Object> Camera2StreamConfigurationMap(androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.Anchor anchor) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.compose.runtime.SlotReader openReader = slotTable.openReader();
        try {
            Camera2StreamConfigurationMap(openReader, arrayList, slotTable.anchorIndex(anchor));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.runtime.SlotReader slotReader, java.util.List<java.lang.Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = slotReader.groupSize(i);
        while (i2 < i + groupSize) {
            Camera2StreamConfigurationMap(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    private static final int getHighSpeedVideoSizes(androidx.compose.runtime.SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.SlotReader slotReader, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (slotReader.parent(i) == i2) {
                return i2;
            }
            if (slotReader.parent(i2) != i) {
                if (slotReader.parent(i) == slotReader.parent(i2)) {
                    return slotReader.parent(i);
                }
                int highSpeedVideoSizes = getHighSpeedVideoSizes(slotReader, i, i3);
                int highSpeedVideoSizes2 = getHighSpeedVideoSizes(slotReader, i2, i3);
                for (int i4 = 0; i4 < highSpeedVideoSizes - highSpeedVideoSizes2; i4++) {
                    i = slotReader.parent(i);
                }
                for (int i5 = 0; i5 < highSpeedVideoSizes2 - highSpeedVideoSizes; i5++) {
                    i2 = slotReader.parent(i2);
                }
                while (i != i2) {
                    i = slotReader.parent(i);
                    i2 = slotReader.parent(i2);
                }
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new androidx.compose.runtime.JoinedKey(java.lang.Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : java.lang.Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Invalidation invalidation, androidx.compose.runtime.Invalidation invalidation2) {
        return kotlin.jvm.internal.Intrinsics.compare(invalidation.getGetHighResolutionOutputSizeshNQ4ISI(), invalidation2.getGetHighResolutionOutputSizeshNQ4ISI());
    }
}
