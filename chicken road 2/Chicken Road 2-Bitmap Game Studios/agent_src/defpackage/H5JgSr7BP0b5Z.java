package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.PriorityTask;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class H5JgSr7BP0b5Z implements Comparator {
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ H5JgSr7BP0b5Z(int i) {
        this.yzPsTade5rL7D3 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.yzPsTade5rL7D3) {
            case 0:
                return Intrinsics.hRNgd2zGCE5kj(((PriorityTask) obj2).yzPsTade5rL7D3, ((PriorityTask) obj).yzPsTade5rL7D3);
            case 1:
                IntRange intRange = (IntRange) obj;
                IntRange intRange2 = (IntRange) obj2;
                return (intRange.b41X89IqSbKt - intRange.oyjLVtGms9eZwJ0) - (intRange2.b41X89IqSbKt - intRange2.oyjLVtGms9eZwJ0);
            case 2:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.H5JgSr7BP0b5Z;
                float f = layoutNode.Rp7eugjcSpMRpm.GiTAvmtrM6Bh8SJ.vAthhQhzH5WQr3;
                float f2 = layoutNode2.Rp7eugjcSpMRpm.GiTAvmtrM6Bh8SJ.vAthhQhzH5WQr3;
                return f == f2 ? Intrinsics.hRNgd2zGCE5kj(layoutNode.K6HLhdE38aTVLa(), layoutNode2.K6HLhdE38aTVLa()) : Float.compare(f, f2);
            default:
                return Intrinsics.hRNgd2zGCE5kj(((LazyLayoutMeasuredItem) obj).getIndex(), ((LazyLayoutMeasuredItem) obj2).getIndex());
        }
    }
}
