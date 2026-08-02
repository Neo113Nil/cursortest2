package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB#\b\u0004\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "Lkotlin/Function2;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "merger", "Lkotlin/jvm/functions/Function2;", "getMerger$ui", "()Lkotlin/jvm/functions/Function2;", "Companion", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final int Unspecified = Integer.MIN_VALUE;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer> merger;

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLine(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> function2) {
        this.merger = function2;
    }

    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer> getMerger$ui() {
        return this.merger;
    }

    public /* synthetic */ AlignmentLine(kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }
}
