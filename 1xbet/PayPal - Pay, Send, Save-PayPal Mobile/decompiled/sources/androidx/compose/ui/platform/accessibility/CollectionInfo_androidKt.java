package androidx.compose.ui.platform.accessibility;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u0006*\u00020\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0011\u001a\u0006*\u00020\u00140\u0014*\u00020\u00132\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\b*\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "setCollectionItemInfo", "", "hasCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "", "p0", "getHighSpeedVideoSizes", "(Ljava/util/List;)Z", "Landroidx/compose/ui/semantics/CollectionInfo;", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/semantics/CollectionInfo;)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "(Landroidx/compose/ui/semantics/CollectionItemInfo;Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectionInfo_androidKt {
    public static final void setCollectionInfo(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        androidx.compose.ui.semantics.CollectionInfo collectionInfo = (androidx.compose.ui.semantics.CollectionInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(getHighSpeedVideoFpsRangesFor(collectionInfo));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup()) != null) {
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
                if (semanticsNode2.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return;
        }
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes(arrayList);
        accessibilityNodeInfoCompat.setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(highSpeedVideoSizes ? 1 : arrayList2.size(), highSpeedVideoSizes ? arrayList2.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        androidx.compose.ui.semantics.CollectionItemInfo collectionItemInfo = (androidx.compose.ui.semantics.CollectionItemInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(getHighSpeedVideoFpsRangesFor(collectionItemInfo, semanticsNode));
        }
        androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup()) == null) {
            return;
        }
        androidx.compose.ui.semantics.CollectionInfo collectionInfo = (androidx.compose.ui.semantics.CollectionInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo());
        if ((collectionInfo == null || !getHighResolutionOutputSizeshNQ4ISI(collectionInfo)) && semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui = parent.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
                if (semanticsNode2.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode().getPlaceOrder$ui() < semanticsNode.getLayoutNode().getPlaceOrder$ui()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean highSpeedVideoSizes = getHighSpeedVideoSizes(arrayList);
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(highSpeedVideoSizes ? 0 : i, 1, !highSpeedVideoSizes ? 0 : i, 1, false, ((java.lang.Boolean) semanticsNode.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected(), new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke() {
                    return java.lang.Boolean.FALSE;
                }
            })).booleanValue());
            if (obtain != null) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(obtain);
            }
        }
    }

    public static final boolean hasCollectionInfo(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return (androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo()) == null && androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean getHighSpeedVideoSizes(java.util.List<androidx.compose.ui.semantics.SemanticsNode> list) {
        java.util.List list2;
        long m5762unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = list.get(0);
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            int i = 0;
            while (i < lastIndex) {
                i++;
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = list.get(i);
                androidx.compose.ui.semantics.SemanticsNode semanticsNode3 = semanticsNode2;
                androidx.compose.ui.semantics.SemanticsNode semanticsNode4 = semanticsNode;
                arrayList.add(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m5782getCenterF1C5BW0() >> 32)) - java.lang.Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m5782getCenterF1C5BW0() >> 32)))) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m5782getCenterF1C5BW0() & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m5782getCenterF1C5BW0() & 4294967295L)))) & 4294967295L))));
                semanticsNode = semanticsNode2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            m5762unboximpl = ((androidx.compose.ui.geometry.Offset) kotlin.collections.CollectionsKt.first(list2)).m5762unboximpl();
        } else {
            if (list2.isEmpty()) {
                androidx.compose.ui.util.ListUtilsKt.throwUnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object first = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) list2);
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list2);
            if (lastIndex2 > 0) {
                int i2 = 1;
                while (true) {
                    first = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(((androidx.compose.ui.geometry.Offset) first).m5762unboximpl(), ((androidx.compose.ui.geometry.Offset) list2.get(i2)).m5762unboximpl()));
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
            m5762unboximpl = ((androidx.compose.ui.geometry.Offset) first).m5762unboximpl();
        }
        return java.lang.Float.intBitsToFloat((int) (4294967295L & m5762unboximpl)) < java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32));
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    private static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.CollectionInfo collectionInfo) {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.CollectionItemInfo collectionItemInfo, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((java.lang.Boolean) semanticsNode.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected(), new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.FALSE;
            }
        })).booleanValue());
    }
}
