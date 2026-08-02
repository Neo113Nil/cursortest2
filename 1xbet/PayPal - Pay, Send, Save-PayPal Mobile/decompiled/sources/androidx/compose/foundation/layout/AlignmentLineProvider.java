package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "calculateAlignmentLinePosition", "(Landroidx/compose/ui/layout/Placeable;)I", "Block", "Value", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AlignmentLineProvider {
    public static final int $stable = 0;

    public abstract int calculateAlignmentLinePosition(androidx.compose.ui.layout.Placeable placeable);

    private AlignmentLineProvider() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "lineProviderBlock", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/Placeable;", "placeable", "calculateAlignmentLinePosition", "(Landroidx/compose/ui/layout/Placeable;)I", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getLineProviderBlock"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Block extends androidx.compose.foundation.layout.AlignmentLineProvider {
        public static final int $stable = 0;
        private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> lineProviderBlock;

        /* JADX WARN: Multi-variable type inference failed */
        public Block(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> function1) {
            super(null);
            this.lineProviderBlock = function1;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public final int calculateAlignmentLinePosition(androidx.compose.ui.layout.Placeable placeable) {
            return this.lineProviderBlock.invoke(placeable).intValue();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Block(lineProviderBlock=");
            sb.append(this.lineProviderBlock);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.foundation.layout.AlignmentLineProvider.Block) && kotlin.jvm.internal.Intrinsics.areEqual(this.lineProviderBlock, ((androidx.compose.foundation.layout.AlignmentLineProvider.Block) other).lineProviderBlock);
        }

        public final androidx.compose.foundation.layout.AlignmentLineProvider.Block copy(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Measured, java.lang.Integer> lineProviderBlock) {
            return new androidx.compose.foundation.layout.AlignmentLineProvider.Block(lineProviderBlock);
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Measured, java.lang.Integer> component1() {
            return this.lineProviderBlock;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.foundation.layout.AlignmentLineProvider.Block copy$default(androidx.compose.foundation.layout.AlignmentLineProvider.Block block, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = block.lineProviderBlock;
            }
            return block.copy(function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "calculateAlignmentLinePosition", "(Landroidx/compose/ui/layout/Placeable;)I", "component1", "()Landroidx/compose/ui/layout/AlignmentLine;", "copy", "(Landroidx/compose/ui/layout/AlignmentLine;)Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Value extends androidx.compose.foundation.layout.AlignmentLineProvider {
        public static final int $stable = 0;
        private final androidx.compose.ui.layout.AlignmentLine alignmentLine;

        public Value(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public final androidx.compose.ui.layout.AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public final int calculateAlignmentLinePosition(androidx.compose.ui.layout.Placeable placeable) {
            return placeable.get(this.alignmentLine);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Value(alignmentLine=");
            sb.append(this.alignmentLine);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.foundation.layout.AlignmentLineProvider.Value) && kotlin.jvm.internal.Intrinsics.areEqual(this.alignmentLine, ((androidx.compose.foundation.layout.AlignmentLineProvider.Value) other).alignmentLine);
        }

        public final androidx.compose.foundation.layout.AlignmentLineProvider.Value copy(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            return new androidx.compose.foundation.layout.AlignmentLineProvider.Value(alignmentLine);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.layout.AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public static /* synthetic */ androidx.compose.foundation.layout.AlignmentLineProvider.Value copy$default(androidx.compose.foundation.layout.AlignmentLineProvider.Value value, androidx.compose.ui.layout.AlignmentLine alignmentLine, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }
    }

    public /* synthetic */ AlignmentLineProvider(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
