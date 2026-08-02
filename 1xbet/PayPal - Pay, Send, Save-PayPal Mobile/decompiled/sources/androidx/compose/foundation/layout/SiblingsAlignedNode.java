package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "WithAlignmentLineBlockNode", "WithAlignmentLineNode", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SiblingsAlignedNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public static final int $stable = androidx.compose.ui.Modifier.Node.$stable;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public abstract java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj);

    private SiblingsAlignedNode() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;", "setBlock"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithAlignmentLineBlockNode extends androidx.compose.foundation.layout.SiblingsAlignedNode {
        public static final int $stable = 8;
        private kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> block;

        public WithAlignmentLineBlockNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
            super(null);
            this.block = function1;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> getBlock() {
            return this.block;
        }

        public final void setBlock(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
            this.block = function1;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        public final java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
            androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = obj instanceof androidx.compose.foundation.layout.RowColumnParentData ? (androidx.compose.foundation.layout.RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new androidx.compose.foundation.layout.RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.Relative$foundation_layout(new androidx.compose.foundation.layout.AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "setAlignmentLine"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithAlignmentLineNode extends androidx.compose.foundation.layout.SiblingsAlignedNode {
        public static final int $stable = 8;
        private androidx.compose.ui.layout.AlignmentLine alignmentLine;

        public WithAlignmentLineNode(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public final androidx.compose.ui.layout.AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public final void setAlignmentLine(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            this.alignmentLine = alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.SiblingsAlignedNode, androidx.compose.ui.node.ParentDataModifierNode
        public final java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
            androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = obj instanceof androidx.compose.foundation.layout.RowColumnParentData ? (androidx.compose.foundation.layout.RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new androidx.compose.foundation.layout.RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            rowColumnParentData.setCrossAxisAlignment(androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.Relative$foundation_layout(new androidx.compose.foundation.layout.AlignmentLineProvider.Value(this.alignmentLine)));
            return rowColumnParentData;
        }
    }

    public /* synthetic */ SiblingsAlignedNode(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
