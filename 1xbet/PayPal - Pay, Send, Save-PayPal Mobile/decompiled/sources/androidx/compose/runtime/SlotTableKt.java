package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0012\u001a\u00020\r*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\r*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\f\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\f\u001a!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0012\u001a\u00020\r*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0019\u001a!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u0018\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u0018\u001a\u001b\u0010\u001c\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\f\u001a#\u0010\u001c\u001a\u00020\r*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u0019\u001a'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u001dH\u0002¢\u0006\u0004\b\u0014\u0010\u001e\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0018\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0018\u001aK\u0010\u001c\u001a\u00020\r*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010$\u001a#\u0010\u0014\u001a\u00020\r*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0019\u001a5\u0010\u001c\u001a\u0004\u0018\u00010&*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010(\u001a3\u0010\u0003\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010)\u001a3\u0010\u000e\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010)\u001a)\u0010\u0014\u001a\u00020\r*\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010,\u001a\u000f\u0010-\u001a\u00020\rH\u0000¢\u0006\u0004\b-\u0010.\"\u0014\u0010\u0012\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100"}, d2 = {"", "", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/String;I)Ljava/lang/String;", "Landroidx/compose/runtime/SlotTable;", "group", "Landroidx/compose/runtime/tooling/CompositionGroup;", "compositionGroupOf", "(Landroidx/compose/runtime/SlotTable;I)Landroidx/compose/runtime/tooling/CompositionGroup;", "", "getInputSizeshNQ4ISI", "([II)I", "", "getHighSpeedVideoFpsRangesFor", "([II)V", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "([IIZ)V", "getHighSpeedVideoFpsRanges", "getOutputFormats", "", "getInputFormats", "([II)Ljava/util/List;", "([III)V", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "getHighSpeedVideoSizes", "", "([ILjava/lang/Iterable;)Ljava/util/List;", "p2", "p3", "p4", "p5", "p6", "([IIIZZZII)V", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "(Ljava/util/ArrayList;II)Landroidx/compose/runtime/Anchor;", "(Ljava/util/ArrayList;II)I", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "(Landroidx/collection/MutableIntObjectMap;II)V", "throwConcurrentModificationException", "()V", "", "[J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SlotTableKt {
    private static final long[] getHighSpeedVideoFpsRangesFor = new long[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String Camera2StreamConfigurationMap(java.lang.String str, int i) {
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, "androidx.", "a.", false, 4, (java.lang.Object) null), "compose.", "c.", false, 4, (java.lang.Object) null), "runtime.", "r.", false, 4, (java.lang.Object) null), "internal.", "ι.", false, 4, (java.lang.Object) null), "ui.", "u.", false, 4, (java.lang.Object) null), "Modifier", "μ", false, 4, (java.lang.Object) null), "material.", "m.", false, 4, (java.lang.Object) null), "Function", "λ", false, 4, (java.lang.Object) null), "OpaqueKey", "κ", false, 4, (java.lang.Object) null), "MutableState", "σ", false, 4, (java.lang.Object) null);
        java.lang.String substring = replace$default.substring(0, java.lang.Math.min(i, replace$default.length()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final androidx.compose.runtime.tooling.CompositionGroup compositionGroupOf(androidx.compose.runtime.SlotTable slotTable, int i) {
        return new androidx.compose.runtime.SlotTableGroup(slotTable, i, slotTable.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getInputSizeshNQ4ISI(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + java.lang.Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(int[] iArr, int i) {
        int i2 = (i * 5) + 1;
        iArr[i2] = iArr[i2] | 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        iArr[i2] = ((z ? 1 : 0) << 27) | (iArr[i2] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        iArr[i2] = ((z ? 1 : 0) << 26) | (iArr[i2] & (-67108865));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(int[] iArr, int i) {
        int i2 = i * 5;
        return i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + java.lang.Integer.bitCount(iArr[i2 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getOutputFormats(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + java.lang.Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Integer> getInputFormats(int[] iArr, int i) {
        return getHighSpeedVideoFpsRanges(iArr, kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, int i2) {
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Integer> getHighSpeedVideoSizesFor(int[] iArr, int i) {
        java.util.List<java.lang.Integer> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(iArr, kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(1, i), 5));
        java.util.ArrayList arrayList = new java.util.ArrayList(highSpeedVideoFpsRanges.size());
        int size = highSpeedVideoFpsRanges.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(java.lang.Integer.valueOf(highSpeedVideoFpsRanges.get(i2).intValue() & 67108863));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Integer> getOutputMinFrameDuration(int[] iArr, int i) {
        return getHighSpeedVideoFpsRanges(iArr, kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(2, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoSizes(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 3] = i2;
    }

    private static final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges(int[] iArr, java.lang.Iterable<java.lang.Integer> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i) {
        return getHighSpeedVideoFpsRanges(iArr, kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(3, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Integer> Camera2StreamConfigurationMap(int[] iArr, int i) {
        return getHighSpeedVideoFpsRanges(iArr, kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(4, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5 = i * 5;
        iArr[i5] = i2;
        iArr[i5 + 1] = ((z ? 1 : 0) << 30) | ((z2 ? 1 : 0) << 29) | ((z3 ? 1 : 0) << 28);
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = 0;
        iArr[i5 + 4] = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(int[] iArr, int i, int i2) {
        iArr[i * 5] = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.Anchor getHighSpeedVideoSizes(java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList, int i, int i2) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(arrayList, i, i2);
        if (Camera2StreamConfigurationMap >= 0) {
            return arrayList.get(Camera2StreamConfigurationMap);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int location = arrayList.get(i4).getLocation();
            if (location < 0) {
                location += i2;
            }
            int compare = kotlin.jvm.internal.Intrinsics.compare(location, i);
            if (compare < 0) {
                i3 = i4 + 1;
            } else {
                if (compare <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRangesFor(java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList, int i, int i2) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(arrayList, i, i2);
        return Camera2StreamConfigurationMap >= 0 ? Camera2StreamConfigurationMap : -(Camera2StreamConfigurationMap + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> mutableIntObjectMap, int i, int i2) {
        androidx.collection.MutableIntSet mutableIntSet = mutableIntObjectMap.get(i);
        if (mutableIntSet == null) {
            mutableIntSet = new androidx.collection.MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i, mutableIntSet);
        }
        mutableIntSet.add(i2);
    }

    public static final void throwConcurrentModificationException() {
        throw new java.util.ConcurrentModificationException();
    }
}
