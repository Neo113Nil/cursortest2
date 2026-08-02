package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\t2\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "p0", "", "", "p1", "", "Camera2StreamConfigurationMap", "(Landroidx/collection/MutableObjectIntMap;Ljava/util/Map;)Z", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/Modifier$Node;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/node/DelegatableNode;II)Landroidx/compose/ui/Modifier$Node;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean Camera2StreamConfigurationMap(androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> mutableObjectIntMap, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map) {
        if (mutableObjectIntMap == null || mutableObjectIntMap.get_size() != map.size()) {
            return false;
        }
        androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> mutableObjectIntMap2 = mutableObjectIntMap;
        java.lang.Object[] objArr = mutableObjectIntMap2.keys;
        int[] iArr = mutableObjectIntMap2.values;
        long[] jArr = mutableObjectIntMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        int i5 = iArr[i4];
                        java.lang.Integer num = map.get((androidx.compose.ui.layout.AlignmentLine) obj);
                        if (num == null || num.intValue() != i5) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier.Node getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, int i2) {
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i2) != 0) {
                return null;
            }
            if ((kindSet & i) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
