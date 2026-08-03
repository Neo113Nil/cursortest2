package androidx.compose.ui.platform.accessibility;

/* compiled from: CollectionInfo.android.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\u0007H\u0000\u001a\u0014\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u0002H\u0002\u001a\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0016"}, d2 = {"isLazyCollection", "", "Landroidx/compose/ui/semantics/CollectionInfo;", "(Landroidx/compose/ui/semantics/CollectionInfo;)Z", "calculateIfHorizontallyStacked", com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/ui/semantics/SemanticsNode;", "setCollectionInfo", "", "node", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "setCollectionItemInfo", "hasCollectionInfo", "toAccessibilityCollectionInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;", "kotlin.jvm.PlatformType", "toAccessibilityCollectionItemInfo", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "itemNode", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CollectionInfo_androidKt {
    public static final void setCollectionInfo(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        androidx.compose.ui.semantics.CollectionInfo collectionInfo = (androidx.compose.ui.semantics.CollectionInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup()) != null) {
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
                if (semanticsNode2.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            accessibilityNodeInfoCompat.setCollectionInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(calculateIfHorizontallyStacked ? 1 : arrayList2.size(), calculateIfHorizontallyStacked ? arrayList2.size() : 1, false, 0));
        }
    }

    public static final void setCollectionItemInfo(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        androidx.compose.ui.semantics.CollectionItemInfo collectionItemInfo = (androidx.compose.ui.semantics.CollectionItemInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup()) == null) {
            return;
        }
        androidx.compose.ui.semantics.CollectionInfo collectionInfo = (androidx.compose.ui.semantics.CollectionInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
                if (semanticsNode2.getConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode().getPlaceOrder$ui_release()) {
                        i++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(calculateIfHorizontallyStacked ? 0 : i, 1, calculateIfHorizontallyStacked ? i : 0, 1, false, ((java.lang.Boolean) semanticsNode.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected(), new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        return false;
                    }
                })).booleanValue());
                if (obtain != null) {
                    accessibilityNodeInfoCompat.setCollectionItemInfo(obtain);
                }
            }
        }
    }

    public static final boolean hasCollectionInfo(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return (androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo()) == null && androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup()) == null) ? false : true;
    }

    private static final boolean calculateIfHorizontallyStacked(java.util.List<androidx.compose.ui.semantics.SemanticsNode> list) {
        java.util.ArrayList emptyList;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            emptyList = new java.util.ArrayList();
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = list.get(0);
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            int i = 0;
            while (i < lastIndex) {
                i++;
                androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = list.get(i);
                androidx.compose.ui.semantics.SemanticsNode semanticsNode3 = semanticsNode2;
                androidx.compose.ui.semantics.SemanticsNode semanticsNode4 = semanticsNode;
                emptyList.add(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.OffsetKt.Offset(java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1871getXimpl(semanticsNode4.getBoundsInRoot().m1901getCenterF1C5BW0()) - androidx.compose.ui.geometry.Offset.m1871getXimpl(semanticsNode3.getBoundsInRoot().m1901getCenterF1C5BW0())), java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1872getYimpl(semanticsNode4.getBoundsInRoot().m1901getCenterF1C5BW0()) - androidx.compose.ui.geometry.Offset.m1872getYimpl(semanticsNode3.getBoundsInRoot().m1901getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (emptyList.size() == 1) {
            packedValue = ((androidx.compose.ui.geometry.Offset) kotlin.collections.CollectionsKt.first(emptyList)).getPackedValue();
        } else {
            if (emptyList.isEmpty()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object first = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) emptyList);
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(emptyList);
            if (1 <= lastIndex2) {
                int i2 = 1;
                while (true) {
                    first = androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(((androidx.compose.ui.geometry.Offset) first).getPackedValue(), ((androidx.compose.ui.geometry.Offset) emptyList.get(i2)).getPackedValue()));
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
            packedValue = ((androidx.compose.ui.geometry.Offset) first).getPackedValue();
        }
        return androidx.compose.ui.geometry.Offset.m1862component2impl(packedValue) < androidx.compose.ui.geometry.Offset.m1861component1impl(packedValue);
    }

    private static final boolean isLazyCollection(androidx.compose.ui.semantics.CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }

    private static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(androidx.compose.ui.semantics.CollectionInfo collectionInfo) {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(androidx.compose.ui.semantics.CollectionItemInfo collectionItemInfo, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((java.lang.Boolean) semanticsNode.getConfig().getOrElse(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected(), new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                return false;
            }
        })).booleanValue());
    }
}
